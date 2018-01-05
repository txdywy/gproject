package com.google.android.finsky.billing;

import android.text.TextUtils;
import com.google.wireless.android.finsky.a.a.ad;
import java.util.Locale;
import java.util.regex.Pattern;

public final class C1833f {
    public static final Pattern f9416a = Pattern.compile("<em>");
    public static final Pattern f9417b = Pattern.compile("</em>");

    public static String m9861a(String str, int i) {
        String format = String.format("#%06X", new Object[]{Integer.valueOf(16777215 & i)});
        return f9417b.matcher(f9416a.matcher(str).replaceAll(new StringBuilder(String.valueOf(format).length() + 18).append("<b><font color=\"").append(format).append("\">").toString())).replaceAll("</font></b>");
    }

    public static String m9860a(String str) {
        if (!str.contains("%locale%")) {
            return str;
        }
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        String toLowerCase = locale.getCountry().toLowerCase();
        return str.replace("%locale%", new StringBuilder((String.valueOf(language).length() + 1) + String.valueOf(toLowerCase).length()).append(language).append("_").append(toLowerCase).toString());
    }

    public static ad m9859a(int i, String str) {
        ad adVar = new ad();
        adVar.c = i;
        if (!TextUtils.isEmpty(str)) {
            if (str == null) {
                throw new NullPointerException();
            }
            adVar.b |= 1;
            adVar.d = str;
        }
        return adVar;
    }
}
