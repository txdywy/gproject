package org.chromium.base;

import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.chromium.base.annotations.CalledByNative;

public class LocaleUtils {
    public static final Map f40495a;

    private LocaleUtils() {
    }

    @CalledByNative
    public static String getDefaultLocaleString() {
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        String str = (String) f40495a.get(language);
        if (str == null) {
            str = language;
        }
        language = locale.getCountry();
        if (str.equals("no") && language.equals("NO") && locale.getVariant().equals("NY")) {
            return "nn-NO";
        }
        if (language.isEmpty()) {
            return str;
        }
        return str + "-" + language;
    }

    @CalledByNative
    private static String getDefaultCountryCode() {
        CommandLine c = CommandLine.m37786c();
        if (c.m37787a()) {
            return c.m37788b();
        }
        return Locale.getDefault().getCountry();
    }

    static {
        Map hashMap = new HashMap();
        hashMap.put("iw", "he");
        hashMap.put("ji", "yi");
        hashMap.put("in", "id");
        hashMap.put("tl", "fil");
        f40495a = Collections.unmodifiableMap(hashMap);
        hashMap = new HashMap();
        hashMap.put("und", "");
        hashMap.put("fil", "tl");
        Collections.unmodifiableMap(hashMap);
    }
}
