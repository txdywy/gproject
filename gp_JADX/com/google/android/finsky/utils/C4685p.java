package com.google.android.finsky.utils;

import android.text.Html;

public final class C4685p {
    public static CharSequence m21831a(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        C4685p.m21832a(stringBuilder, "<p>", "\n\n");
        C4685p.m21832a(stringBuilder, "<br>", "\n");
        if (stringBuilder.indexOf("<") != -1) {
            FinskyLog.m21659a("Doing slow HTML parse due to unexpected tag %s", stringBuilder.substring(stringBuilder.indexOf("<"), Math.min(stringBuilder.indexOf("<") + 10, stringBuilder.length())));
            return Html.fromHtml(str);
        }
        int i = 0;
        while (true) {
            i = stringBuilder.indexOf("&", i);
            if (i == -1) {
                return stringBuilder;
            }
            int indexOf = stringBuilder.indexOf(";", i);
            if (indexOf == -1) {
                return stringBuilder;
            }
            String substring = stringBuilder.substring(i + 1, indexOf);
            stringBuilder.delete(i + 1, indexOf + 1);
            if (substring.charAt(0) == '#') {
                try {
                    stringBuilder.setCharAt(i, (char) Integer.parseInt(substring.substring(1)));
                } catch (NumberFormatException e) {
                    FinskyLog.m21659a("Doing slow HTML parse due to unexpected &# escape %s", substring);
                    return Html.fromHtml(str);
                }
            } else if ("quot".equals(substring)) {
                stringBuilder.setCharAt(i, '\"');
            } else if ("apos".equals(substring)) {
                stringBuilder.setCharAt(i, '\'');
            } else if ("amp".equals(substring)) {
                stringBuilder.setCharAt(i, '&');
            } else if ("lt".equals(substring)) {
                stringBuilder.setCharAt(i, '<');
            } else if ("gt".equals(substring)) {
                stringBuilder.setCharAt(i, '>');
            } else {
                FinskyLog.m21659a("Doing slow HTML parse due to unexpected & escape %s", substring);
                return Html.fromHtml(str);
            }
            i++;
        }
    }

    private static void m21832a(StringBuilder stringBuilder, String str, String str2) {
        int length = str.length();
        int length2 = str2.length();
        int i = 0;
        while (true) {
            i = stringBuilder.indexOf(str, i);
            if (i != -1) {
                stringBuilder.replace(i, i + length, str2);
                i += length2;
            } else {
                return;
            }
        }
    }
}
