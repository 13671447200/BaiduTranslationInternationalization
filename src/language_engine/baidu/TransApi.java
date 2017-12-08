package language_engine.baidu;

import Utils.MD5;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import language_engine.HttpUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransApi {
    private static final String TRANS_API_HOST = "http://api.fanyi.baidu.com/api/trans/vip/translate";

    private String appid = "20171207000103039";
    private String securityKey = "o1vKaHf76skbpc1VaXbF";

    public TransApi(String appid, String securityKey) {
        this.appid = appid;
        this.securityKey = securityKey;
    }
    public TransApi(){

    }


    public List<String> getTransResult(String query, String from, String to) {
        Map<String, String> params = buildParams(query, from, to);
        String urlWithQueryString = getUrlWithQueryString(TRANS_API_HOST, params);
        String getResult = HttpUtils.doHttpGet(urlWithQueryString);
        JsonObject jsonObject = new JsonParser().parse(getResult).getAsJsonObject();
        JsonArray trans_result = jsonObject.get("trans_result").getAsJsonArray();
        List<String> list = new ArrayList<>();
        for(int i =0; i < trans_result.size(); i++){
            JsonObject asJsonObject = trans_result.get(i).getAsJsonObject();
            list.add(asJsonObject.get("dst").getAsString());
        }
        return list;
    }

    private Map<String, String> buildParams(String query, String from, String to) {
        Map<String, String> params = new HashMap<String, String>();
        params.put("q", query);
        params.put("from", from);
        params.put("to", to);

        params.put("appid", appid);

        // 随机数
        String salt = String.valueOf(System.currentTimeMillis());
        params.put("salt", salt);

        // 签名
        String src = appid + query + salt + securityKey; // 加密前的原文
        params.put("sign", MD5.md5(src));

        return params;
    }

    public static String getUrlWithQueryString(String url, Map<String, String> params) {
        if (params == null) {
            return url;
        }

        StringBuilder builder = new StringBuilder(url);
        if (url.contains("?")) {
            builder.append("&");
        } else {
            builder.append("?");
        }

        int i = 0;
        for (String key : params.keySet()) {
            String value = params.get(key);
            if (value == null) { // 过滤空的key
                continue;
            }

            if (i != 0) {
                builder.append('&');
            }

            builder.append(key);
            builder.append('=');
            builder.append(encode(value));

            i++;
        }

        return builder.toString();
    }
    /**
     * 对输入的字符串进行URL编码, 即转换为%20这种形式
     *
     * @param input 原文
     * @return URL编码. 如果编码失败, 则返回原文
     */
    public static String encode(String input) {
        if (input == null) {
            return "";
        }

        try {
            return URLEncoder.encode(input, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return input;
    }


}
