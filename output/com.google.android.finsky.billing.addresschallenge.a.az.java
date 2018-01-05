package com.google.android.finsky.billing.addresschallenge.a;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

static class com.google.android.finsky.billing.addresschallenge.a.az
{

    public static final Map a;

    static {
        v0 = new HashMap();
        com.google.android.finsky.billing.addresschallenge.a.az.a = v0;
        v0.put("AM", "hy");
        com.google.android.finsky.billing.addresschallenge.a.az.a.put("CN", "zh");
        com.google.android.finsky.billing.addresschallenge.a.az.a.put("HK", "zh");
        com.google.android.finsky.billing.addresschallenge.a.az.a.put("JP", "ja");
        com.google.android.finsky.billing.addresschallenge.a.az.a.put("KP", "ko");
        com.google.android.finsky.billing.addresschallenge.a.az.a.put("KR", "ko");
        com.google.android.finsky.billing.addresschallenge.a.az.a.put("MO", "zh");
        com.google.android.finsky.billing.addresschallenge.a.az.a.put("TH", "th");
        com.google.android.finsky.billing.addresschallenge.a.az.a.put("TW", "zh");
        com.google.android.finsky.billing.addresschallenge.a.az.a.put("VN", "vi");
    }

    static String a(String p0, String[] p1) {
        v2 = 0;
        v0 = 0;
        while (v2 < p1.length) {
            if (p1[v2] != 0) {
                v4 = p1[v2].trim();
                if (v4.length() > 0) {
                    if (v0 == 0)
                        v0 = new StringBuilder(v4);
                    else
                        v0.append(p0).append(v4);
                }
            }
            v2 = v2 + 1;
        }
        if (v0 == 0)
            v0 = 0;
        else
            v0 = v0.toString();
        return v0;
    }

    public static String a(Locale p0, String p1) {
        v0 = p1.toUpperCase();
        if (com.google.android.finsky.billing.addresschallenge.a.az.a.containsKey(v0)) {
            v1 = p0.getLanguage();
            if (!v1.equals(com.google.android.finsky.billing.addresschallenge.a.az.a.get(v0))) {
                v0 = new StringBuilder(v1);
                v0.append("_latn");
                if (p0.getCountry().length() > 0) {
                    v0.append("_");
                    v0.append(p0.getCountry());
                }
                v0 = v0.toString();
                return v0;
            }
        }
        v0 = p0.toString();
        return v0;
    }

    static Map a(String[] p0, String[] p1, String[] p2) {
        v1 = 0;
        if (p0 == 0)
            v0 = 0;
        else {
            v0 = new HashMap();
            v2 = 0;
            while (v2 < p0.length) {
                v0.put(p0[v2].toLowerCase(), p0[v2]);
                v2 = v2 + 1;
            }
            if (p1 != 0) {
                if (p1.length > p0.length)
                    throw new IllegalStateException(68 + "names length (" + p1.length + ") is greater than keys length (" + p0.length + ")");
                v2 = 0;
                while (v2 < p0.length) {
                    if (v2 < p1.length) {
                        if (p1[v2].length() > 0)
                            v0.put(p1[v2].toLowerCase(), p0[v2]);
                    }
                    v2 = v2 + 1;
                }
            }
            if (p2 != 0) {
                if (p2.length > p0.length)
                    throw new IllegalStateException(69 + "lnames length (" + p2.length + ") is greater than keys length (" + p0.length + ")");
                while (v1 < p0.length) {
                    if (v1 < p2.length) {
                        if (p2[v1].length() > 0)
                            v0.put(p2[v1].toLowerCase(), p0[v1]);
                    }
                    v1 = v1 + 1;
                }
            }
        }
        return v0;
    }

    static void a(Object p0) {
        com.google.android.finsky.billing.addresschallenge.a.az.a(p0, "This object should not be null.");
    }

    static void a(Object p0, String p1) {
        if (p0 == 0)
            throw new NullPointerException(p1);
    }

    static boolean a(String p0) {
        v0 = 1;
        v1 = Pattern.compile("\\w{2,3}[-_](\\w{4})").matcher(p0.toUpperCase());
        if (!v1.lookingAt() || !v1.group(1).equals("LATN"))
            v0 = 0;
        return v0;
    }

    static String b(String p0) {
        v0 = Pattern.compile("(\\w{2,3})(?:[-_]\\w{4})?(?:[-_]\\w{2})?").matcher(p0);
        if (v0.matches())
            v0 = v0.group(1).toLowerCase();
        else
            v0 = "und";
        return v0;
    }

    static String c(String p0) {
        v0 = 0;
        if (p0 != 0) {
            v1 = p0.trim();
            if (v1.length() != 0)
                v0 = v1;
        }
        return v0;
    }

}
