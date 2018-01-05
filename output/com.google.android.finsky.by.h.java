package com.google.android.finsky.by;

public static class com.google.android.finsky.by.h
{

    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String[] g;

    static {
        com.google.android.finsky.by.h.a = "3";
        com.google.android.finsky.by.h.b = "1";
        com.google.android.finsky.by.h.c = "4";
        com.google.android.finsky.by.h.d = "2";
        com.google.android.finsky.by.h.e = "6";
        com.google.android.finsky.by.h.f = "10";
        v0 = new String[9];
        v0[0] = com.google.android.finsky.by.h.a;
        v0[1] = com.google.android.finsky.by.h.b;
        v0[2] = com.google.android.finsky.by.h.c;
        v0[3] = com.google.android.finsky.by.h.d;
        v0[4] = com.google.android.finsky.by.h.e;
        v0[5] = com.google.android.finsky.by.h.f;
        v0[6] = "u-wl";
        v0[7] = "u-pl";
        v0[8] = "u-tpl";
        com.google.android.finsky.by.h.g = v0;
    }

    public static String a(int p0) {
        switch (p0) {
            case 1:
                v0 = com.google.android.finsky.by.h.b;
                break;
            case 2:
                v0 = com.google.android.finsky.by.h.d;
                break;
            case 3:
                v0 = com.google.android.finsky.by.h.a;
                break;
            case 4:
                v0 = com.google.android.finsky.by.h.c;
                break;
            case 5:
                v0 = 0;
                break;
            case 6:
                v0 = com.google.android.finsky.by.h.e;
                break;
            case 7:
                v0 = 0;
                break;
            case 8:
                v0 = 0;
                break;
            case 9:
                v0 = 0;
                break;
            case 10:
                v0 = com.google.android.finsky.by.h.f;
                break;
            default:
                v0 = 0;
                break;
        }
        return v0;
    }

    public static boolean a(String p0) {
        if (("u-wl".equals(p0)) || ("u-pl".equals(p0)) || "u-tpl".equals(p0))
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

}
