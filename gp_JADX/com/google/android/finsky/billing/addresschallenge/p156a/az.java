package com.google.android.finsky.billing.addresschallenge.p156a;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class az {
    public static final Map f8913a;

    static boolean m9579a(String str) {
        Matcher matcher = Pattern.compile("\\w{2,3}[-_](\\w{4})").matcher(str.toUpperCase());
        if (matcher.lookingAt() && matcher.group(1).equals("LATN")) {
            return true;
        }
        return false;
    }

    static String m9580b(String str) {
        Matcher matcher = Pattern.compile("(\\w{2,3})(?:[-_]\\w{4})?(?:[-_]\\w{2})?").matcher(str);
        if (matcher.matches()) {
            return matcher.group(1).toLowerCase();
        }
        return "und";
    }

    static String m9581c(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.length() != 0) {
            return trim;
        }
        return null;
    }

    static void m9577a(Object obj) {
        az.m9578a(obj, "This object should not be null.");
    }

    static void m9578a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    static String m9574a(String str, String... strArr) {
        StringBuilder stringBuilder = null;
        for (String str2 : strArr) {
            String str22;
            if (str22 != null) {
                str22 = str22.trim();
                if (str22.length() > 0) {
                    if (stringBuilder == null) {
                        stringBuilder = new StringBuilder(str22);
                    } else {
                        stringBuilder.append(str).append(str22);
                    }
                }
            }
        }
        return stringBuilder == null ? null : stringBuilder.toString();
    }

    static Map m9576a(String[] strArr, String[] strArr2, String[] strArr3) {
        int i = 0;
        if (strArr == null) {
            return null;
        }
        int i2;
        Map hashMap = new HashMap();
        int length = strArr.length;
        for (String str : strArr) {
            hashMap.put(str.toLowerCase(), str);
        }
        if (strArr2 != null) {
            if (strArr2.length > length) {
                throw new IllegalStateException("names length (" + strArr2.length + ") is greater than keys length (" + strArr.length + ")");
            }
            i2 = 0;
            while (i2 < length) {
                if (i2 < strArr2.length && strArr2[i2].length() > 0) {
                    hashMap.put(strArr2[i2].toLowerCase(), strArr[i2]);
                }
                i2++;
            }
        }
        if (strArr3 == null) {
            return hashMap;
        }
        if (strArr3.length > length) {
            throw new IllegalStateException("lnames length (" + strArr3.length + ") is greater than keys length (" + strArr.length + ")");
        }
        while (i < length) {
            if (i < strArr3.length && strArr3[i].length() > 0) {
                hashMap.put(strArr3[i].toLowerCase(), strArr[i]);
            }
            i++;
        }
        return hashMap;
    }

    public static String m9575a(Locale locale, String str) {
        String toUpperCase = str.toUpperCase();
        if (f8913a.containsKey(toUpperCase)) {
            String language = locale.getLanguage();
            if (!language.equals(f8913a.get(toUpperCase))) {
                StringBuilder stringBuilder = new StringBuilder(language);
                stringBuilder.append("_latn");
                if (locale.getCountry().length() > 0) {
                    stringBuilder.append("_");
                    stringBuilder.append(locale.getCountry());
                }
                return stringBuilder.toString();
            }
        }
        return locale.toString();
    }

    static {
        Map hashMap = new HashMap();
        f8913a = hashMap;
        hashMap.put("AM", "hy");
        f8913a.put("CN", "zh");
        f8913a.put("HK", "zh");
        f8913a.put("JP", "ja");
        f8913a.put("KP", "ko");
        f8913a.put("KR", "ko");
        f8913a.put("MO", "zh");
        f8913a.put("TH", "th");
        f8913a.put("TW", "zh");
        f8913a.put("VN", "vi");
    }
}
