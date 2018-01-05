package com.google.android.finsky.billing;

import android.text.TextUtils;
import com.google.wireless.android.finsky.a.a.ad;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public static class com.google.android.finsky.billing.f
{

    public static final Pattern a;
    public static final Pattern b;

    static {
        com.google.android.finsky.billing.f.a = Pattern.compile("<em>");
        com.google.android.finsky.billing.f.b = Pattern.compile("</em>");
    }

    public static com.google.wireless.android.finsky.a.a.ad a(int p0, String p1) {
        v0 = new com.google.wireless.android.finsky.a.a.ad();
        v0.c = p0;
        if (!TextUtils.isEmpty(p1)) {
            if (p1 == 0)
                throw new NullPointerException();
            v0.b = v0.b | 1;
            v0.d = p1;
        }
        return v0;
    }

    public static String a(String p0) {
        if (p0.contains("%locale%")) {
            v0 = Locale.getDefault();
            v1 = v0.getLanguage();
            v0 = v0.getCountry().toLowerCase();
            p0 = p0.replace("%locale%", (String.valueOf(v1).length() + 1 + String.valueOf(v0).length()) + v1 + "_" + v0);
        }
        return p0;
    }

    public static String a(String p0, int p1) {
        v1 = new Object[1];
        v1[0] = Integer.valueOf(16777215 & p1);
        v0 = String.format("#%06X", v1);
        return com.google.android.finsky.billing.f.b.matcher(com.google.android.finsky.billing.f.a.matcher(p0).replaceAll((String.valueOf(v0).length() + 18) + "<b><font color=\"" + v0 + "\">")).replaceAll("</font></b>");
    }

}
