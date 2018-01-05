package com.google.android.finsky.activities;

public static class com.google.android.finsky.activities.cg extends Enum
{

    public static final com.google.android.finsky.activities.cg a;
    public static final com.google.android.finsky.activities.cg b;
    public static final com.google.android.finsky.activities.cg c;
    public static final cg[] d;

    static {
        com.google.android.finsky.activities.cg.a = new com.google.android.finsky.activities.cg("SHOW", 0);
        com.google.android.finsky.activities.cg.b = new com.google.android.finsky.activities.cg("SHOW_WITHOUT_ANIMATION", 1);
        com.google.android.finsky.activities.cg.c = new com.google.android.finsky.activities.cg("HIDE", 2);
        v0 = new cg[3];
        v0[0] = com.google.android.finsky.activities.cg.a;
        v0[1] = com.google.android.finsky.activities.cg.b;
        v0[2] = com.google.android.finsky.activities.cg.c;
        com.google.android.finsky.activities.cg.d = v0;
    }

    cg(String p0, int p1) {
        Enum(p0, p1);
    }

    public static com.google.android.finsky.activities.cg valueOf(String p0) {
        return (com.google.android.finsky.activities.cg)Enum.valueOf(com.google.android.finsky.activities.cg, p0);
    }

    public static cg[] values() {
        return (cg[])com.google.android.finsky.activities.cg.d.clone();
    }

}
