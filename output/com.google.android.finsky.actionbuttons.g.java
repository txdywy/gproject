package com.google.android.finsky.actionbuttons;

public static class com.google.android.finsky.actionbuttons.g extends Enum
{

    public static final com.google.android.finsky.actionbuttons.g a;
    public static final com.google.android.finsky.actionbuttons.g b;
    public static final com.google.android.finsky.actionbuttons.g c;
    public static final g[] d;

    static {
        com.google.android.finsky.actionbuttons.g.a = new com.google.android.finsky.actionbuttons.g("SHOW", 0);
        com.google.android.finsky.actionbuttons.g.b = new com.google.android.finsky.actionbuttons.g("SHOW_WITHOUT_ANIMATION", 1);
        com.google.android.finsky.actionbuttons.g.c = new com.google.android.finsky.actionbuttons.g("HIDE", 2);
        v0 = new g[3];
        v0[0] = com.google.android.finsky.actionbuttons.g.a;
        v0[1] = com.google.android.finsky.actionbuttons.g.b;
        v0[2] = com.google.android.finsky.actionbuttons.g.c;
        com.google.android.finsky.actionbuttons.g.d = v0;
    }

    g(String p0, int p1) {
        Enum(p0, p1);
    }

    public static com.google.android.finsky.actionbuttons.g valueOf(String p0) {
        return (com.google.android.finsky.actionbuttons.g)Enum.valueOf(com.google.android.finsky.actionbuttons.g, p0);
    }

    public static g[] values() {
        return (g[])com.google.android.finsky.actionbuttons.g.d.clone();
    }

}
