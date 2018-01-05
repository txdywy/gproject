package com.google.android.finsky.by;

public final class C2229h {
    public static final String f11120a = "3";
    public static final String f11121b = "1";
    public static final String f11122c = "4";
    public static final String f11123d = "2";
    public static final String f11124e = "6";
    public static final String f11125f = "10";
    public static final String[] f11126g = new String[]{f11120a, f11121b, f11122c, f11123d, f11124e, f11125f, "u-wl", "u-pl", "u-tpl"};

    public static String m11636a(int i) {
        switch (i) {
            case 1:
                return f11121b;
            case 2:
                return f11123d;
            case 3:
                return f11120a;
            case 4:
                return f11122c;
            case 6:
                return f11124e;
            case 10:
                return f11125f;
            default:
                return null;
        }
    }

    public static boolean m11637a(String str) {
        return "u-wl".equals(str) || "u-pl".equals(str) || "u-tpl".equals(str);
    }
}
