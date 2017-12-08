/*
 * Copyright 2014-2015 Wesley Lin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package module;

import language_engine.TranslationEngineType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wesley Lin on 11/29/14.
 */
public enum SupportedLanguages {

    English("en", "English", "English"),//英语
    Japanese("jp", "日本語", "Japanese"),//日本人
    Korean("kor", "한국의", "Korean"),//韩国人
    French("fra", "Français", "French"),//法语
    Spanish("spa", "Español", "Spanish"),//西班牙的
    Thai("th", "ไทย", "Thai"),//泰国人
    Arabic("ara", "العربية", "Arabic"),//阿拉伯
    Russian("ru", "Русский", "Russian"),//俄语
    Portuguese("pt", "Português", "Portuguese"),//葡萄牙语
    German("de", "Deutsch", "German"),//德国的
    Italian("it", "Italiano", "Italian"),//意大利人
    Greek("el", "Ελληνικά", "Greek"),//希腊
    Dutch("nl", "Nederlands", "Dutch"),//荷兰语
    Polish("pl", "Polski", "Polish"),//波兰
    Bulgarian("bul", "Български", "Bulgarian"),//保加利亚
    Estonian("est", "Eesti", "Estonian"),//爱沙尼亚
    Danish("dan", "Dansk", "Danish"),//丹麦语
    Finnish("fin", "Suomi", "Finnish"),//芬兰
    Czech("cs", "Čeština", "Czech"),//捷克的
    Romanian("rom", "Român", "Romanian"),//罗马尼亚
    Swedish("swe", "Svenska", "Swedish"),//瑞典的
    Hungarian("hu", "Magyar", "Hungarian"),//匈牙利
    Chinese_Traditional("cht", "繁体中文", "Chinese Traditional"),
    Chinese_Simplified("zh", "简体中文", "Chinese Simplified");

//    Afrikaans("af", "Afrikaans", "Afrikaans"),//南非
//    Albanian("sq", "Shqiptar", "Albanian"),//阿尔巴尼亚
//
//
//    Azerbaijani("az", "Azərbaycan", "Azerbaijani"),//阿塞拜疆
//    Basque("eu", "Euskal", "Basque"),//巴斯克
//    Bengali("bn", "বাঙালি", "Bengali"),//孟加拉
//    Belarusian("be", "Беларускі", "Belarusian"),//白俄罗斯
//
//    Catalan("ca", "Català", "Catalan"),//加泰罗尼亚
//
//    Chinese_Simplified_BING("zh-CHS", "简体中文", "Chinese Simplified"),
//
//    Chinese_Traditional_BING("zh-CHT", "正體中文", "Chinese Traditional"),
//    Croatian("hr", "Hrvatski", "Croatian"),//克罗地亚
//    Slovenian("sl", "Slovenščina", "Slovenian"),//斯洛文尼亚
//
//
//
//    Esperanto("eo", "Esperanta", "Esperanto"),//世界语
//
//    Filipino("tl", "Pilipino", "Filipino"),//菲律宾
//
//
//    Galician("gl", "Galego", "Galician"),//加利西亚
//    Georgian("ka", "ქართული", "Georgian"),//格鲁吉亚
//
//
//    Gujarati("gu", "ગુજરાતી", "Gujarati"),//古吉拉特语
//    Haitian_Creole("ht", "Haitiancreole", "Haitian Creole"),//海地
//    Hebrew("iw", "עברית", "Hebrew"),//希伯来
//    Hebrew_BING("he", "עברית", "Hebrew"),//希伯来
//    Hindi("hi", "हिंदी", "Hindi"),//印地语
//
//    Icelandic("is", "Icelandic", "Icelandic"),//冰岛
//    Indonesian("id", "Indonesia", "Indonesian"),//印尼
//    Irish("ga", "Irish", "Irish"),//爱尔兰
//
//
//    Kannada("kn", "ಕನ್ನಡ", "Kannada"),//卡纳达语
//
//    Latin("la", "Latina", "Latin"),//拉丁语
//    Latvian("lv", "Latvijas", "Latvian"),//拉脱维亚
//    Lithuanian("lt", "Lietuvos", "Lithuanian"),//立陶宛
//    Macedonian("mk", "Македонски", "Macedonian"),//马其顿
//    Malay("ms", "Melayu", "Malay"),//马来语
//    Maltese("mt", "Malti", "Maltese"),//马耳他
//    Norwegian("no", "Norsk", "Norwegian"),//挪威
//    Persian("fa", "فارسی", "Persian"),//波斯人
//
//
//
//
//    Serbian("sr", "Српски", "Serbian"),//塞尔维亚
//    Slovak("sk", "Slovenčina", "Slovak"),//斯洛伐克
//
//
//    Swahili("sw", "Kiswahili", "Swahili"),//斯瓦希里语
//
//    Tamil("ta", "தமிழ்", "Tamil"),//泰米尔
//    Telugu("te", "తెలుగు", "Telugu"),//泰卢固语
//
//    Turkish("tr", "Türk", "Turkish"),//土耳其
//    Ukrainian("uk", "Український", "Ukrainian"),//乌克兰
//    Urdu("ur", "اردو", "Urdu"),//乌尔都语
//    Vietnamese("vi", "Tiếng Việt", "Vietnamese"),//Vietnamese
//    Welsh("cy", "Cymraeg", "Welsh"),//威尔士的
//    Yiddish("yi", "ייִדיש", "Yiddish");//意第绪语

    private String languageCode;
    private String languageDisplayName;
    private String languageEnglishDisplayName;

    SupportedLanguages(String languageCode, String languageDisplayName, String languageEnglishDisplayName) {
        this.languageCode = languageCode;
        this.languageDisplayName = languageDisplayName;
        this.languageEnglishDisplayName = languageEnglishDisplayName;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public String getLanguageDisplayName() {
        return languageDisplayName;
    }

    public String getLanguageEnglishDisplayName() {
        return languageEnglishDisplayName;
    }

    public static List<SupportedLanguages> getAllSupportedLanguages(TranslationEngineType type) {
        switch (type) {
            /*case Bing:
                return getBingLanguages();*/
            case Google:
            case Baidu:
                return getGoogleLanguages();
        }
        return null;
    }

    public String toString() {
        return getLanguageEnglishDisplayName() + "(\"" + getLanguageCode() + "\", \"" + getLanguageDisplayName() + "\")";
    }

    // get the right value-XX suffix
    public String getAndroidStringFolderNameSuffix() {
        if (this == Chinese_Simplified)
            return "zh-rCN";
        else if (this == Chinese_Traditional)
            return "zh-rTW";
        else if(this == English){
            return "en-rUS";
        }else if (this == Japanese){
            return "ja-rJP";
        }else if(this == Korean){
            return "ko-rKR";
        }else if(this == French){
            return "fr-rFR";
        }else if(this == Spanish){
            return "es-rES";
        }else if(this == Thai){
            return "th-rTH";
        }else if(this == Arabic){
            return "ar-rEG";
        }else if(this == Russian){
            return "ru-rRU";
        }else if(this == Portuguese){
            return "pt-rPT";
        }else if(this == German){
            return "de-rDE";
        }else if(this == Italian){
            return "it-rIT";
        }else if(this == Greek){
            return "el-rGR";
        }else if(this == Dutch){
            return "nl-rNL";
        }else if(this == Polish){
            return "pl-rPL";
        }else if(this == Bulgarian){
            return "bg_rBG";
        }else if(this == Estonian){
            return "et_EE";
        }else if(this == Danish){
            return "da-rDK";
        }else if(this == Finnish){
            return "fi-rFI";
        }else if(this == Czech){
            return "cs-rCZ";
        }else if(this == Romanian){
            return "ro-rRO";
        }else if(this == Swedish){
            return "sv-rSE";
        }else if(this == Hungarian){
            return "hu-rHU";
        }
        return this.getLanguageCode();
    }

    // google supported language code: https://cloud.google.com/translate/v2/using_rest, language reference section
    private static List<SupportedLanguages> getGoogleLanguages() {
        List<SupportedLanguages> result = new ArrayList<SupportedLanguages>();
//        result.add(Afrikaans);
//        result.add(Albanian);
        result.add(English);
        result.add(Arabic);
//        result.add(Azerbaijani);
//        result.add(Basque);
//        result.add(Bengali);
//        result.add(Belarusian);
        result.add(Bulgarian);
//        result.add(Catalan);
        result.add(Chinese_Simplified);
        result.add(Chinese_Traditional);
//        result.add(Croatian);
        result.add(Czech);
        result.add(Danish);
        result.add(Dutch);
//        result.add(English);
//        result.add(Esperanto);
        result.add(Estonian);
//        result.add(Filipino);
        result.add(Finnish);
        result.add(French);
//        result.add(Galician);
//        result.add(Georgian);
        result.add(German);
        result.add(Greek);
//        result.add(Gujarati);
//        result.add(Haitian_Creole);
//        result.add(Hebrew);
//        result.add(Hindi);
        result.add(Hungarian);
//        result.add(Icelandic);
//        result.add(Indonesian);
//        result.add(Irish);
        result.add(Italian);
        result.add(Japanese);
//        result.add(Kannada);
        result.add(Korean);
//        result.add(Latin);
//        result.add(Latvian);
//        result.add(Macedonian);
//        result.add(Malay);
//        result.add(Maltese);
//        result.add(Norwegian);
//        result.add(Persian);
        result.add(Polish);
        result.add(Portuguese);
        result.add(Romanian);
        result.add(Russian);
//        result.add(Serbian);
//        result.add(Slovak);
//        result.add(Slovenian);
        result.add(Spanish);
//        result.add(Swahili);
        result.add(Swedish);
//        result.add(Tamil);
//        result.add(Telugu);
        result.add(Thai);
//        result.add(Turkish);
//        result.add(Ukrainian);
//        result.add(Urdu);
//        result.add(Vietnamese);
//        result.add(Welsh);
//        result.add(Yiddish);
        return result;
    }

    // bing supported language code: http://msdn.microsoft.com/en-us/library/hh456380.aspx
    private static List<SupportedLanguages> getBingLanguages() {
        List<SupportedLanguages> result = new ArrayList<SupportedLanguages>();
        result.add(Arabic);
        result.add(Bulgarian);
//        result.add(Catalan);
//        result.add(Chinese_Simplified_BING);
//        result.add(Chinese_Traditional_BING);
        result.add(Czech);
        result.add(Danish);
        result.add(Dutch);
        result.add(English);
        result.add(Estonian);
        result.add(Finnish);
        result.add(French);
        result.add(German);
        result.add(Greek);
//        result.add(Haitian_Creole);
//        result.add(Hebrew_BING);
//        result.add(Hindi);
        result.add(Hungarian);
//        result.add(Indonesian);
        result.add(Italian);
        result.add(Japanese);
        result.add(Korean);
//        result.add(Latvian);
//        result.add(Lithuanian);
//        result.add(Malay);
//        result.add(Maltese);
//        result.add(Norwegian);
//        result.add(Persian);
        result.add(Polish);
        result.add(Portuguese);
        result.add(Romanian);
        result.add(Russian);
//        result.add(Slovak);
//        result.add(Slovenian);
        result.add(Spanish);
        result.add(Swedish);
        result.add(Thai);
//        result.add(Turkish);
//        result.add(Ukrainian);
//        result.add(Urdu);
//        result.add(Vietnamese);
//        result.add(Welsh);
        return result;
    }
}
