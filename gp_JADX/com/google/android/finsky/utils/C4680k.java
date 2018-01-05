package com.google.android.finsky.utils;

import java.util.List;
import java.util.regex.Pattern;

public final class C4680k {
    public static final Pattern f24061a = Pattern.compile(",");
    public static final String[] f24062b = new String[0];
    public static final long[] f24063c = new long[0];

    public static String m21817a(String[] strArr) {
        return C4684o.m21830a(strArr, ',');
    }

    public static String m21815a(List list) {
        if (list == null || list.size() == 0) {
            return "";
        }
        int size = list.size();
        if (size == 1) {
            return (String) list.get(0);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append((String) list.get(i));
        }
        return stringBuilder.toString();
    }

    public static String[] m21818a(String str) {
        if (str == null || str.length() == 0) {
            return f24062b;
        }
        if (str.indexOf(44) != -1) {
            return f24061a.split(str);
        }
        return new String[]{str};
    }

    public static String m21816a(long[] jArr) {
        int i = 0;
        if (jArr == null || jArr.length == 0) {
            return "";
        }
        if (jArr.length == 1) {
            return String.valueOf(jArr[0]);
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (i < jArr.length) {
            if (i != 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append(jArr[i]);
            i++;
        }
        return stringBuilder.toString();
    }

    public static long[] m21819b(String str) {
        if (str == null || str.length() == 0) {
            return f24063c;
        }
        if (str.indexOf(44) == -1) {
            try {
                return new long[]{Long.parseLong(str)};
            } catch (NumberFormatException e) {
                FinskyLog.m21669e("Error parsing a string as long - %s", str);
                return f24063c;
            }
        }
        String[] split = f24061a.split(str);
        long[] jArr = new long[split.length];
        int i = 0;
        while (i < split.length) {
            Object trim = split[i].trim();
            try {
                jArr[i] = Long.parseLong(trim);
                i++;
            } catch (NumberFormatException e2) {
                FinskyLog.m21669e("Error parsing a string as long - %s", trim);
                return f24063c;
            }
        }
        return jArr;
    }
}
