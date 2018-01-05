package com.caverock.androidsvg;

public static class com.caverock.androidsvg.n extends Enum
{

    public static final com.caverock.androidsvg.n a;
    public static final com.caverock.androidsvg.n b;
    public static final com.caverock.androidsvg.n c;
    public static final com.caverock.androidsvg.n d;
    public static final com.caverock.androidsvg.n e;
    public static final com.caverock.androidsvg.n f;
    public static final com.caverock.androidsvg.n g;
    public static final com.caverock.androidsvg.n h;
    public static final com.caverock.androidsvg.n i;
    public static final com.caverock.androidsvg.n j;
    public static final n[] k;

    static {
        com.caverock.androidsvg.n.a = new com.caverock.androidsvg.n("None", 0);
        com.caverock.androidsvg.n.b = new com.caverock.androidsvg.n("XMinYMin", 1);
        com.caverock.androidsvg.n.c = new com.caverock.androidsvg.n("XMidYMin", 2);
        com.caverock.androidsvg.n.d = new com.caverock.androidsvg.n("XMaxYMin", 3);
        com.caverock.androidsvg.n.e = new com.caverock.androidsvg.n("XMinYMid", 4);
        com.caverock.androidsvg.n.f = new com.caverock.androidsvg.n("XMidYMid", 5);
        com.caverock.androidsvg.n.g = new com.caverock.androidsvg.n("XMaxYMid", 6);
        com.caverock.androidsvg.n.h = new com.caverock.androidsvg.n("XMinYMax", 7);
        com.caverock.androidsvg.n.i = new com.caverock.androidsvg.n("XMidYMax", 8);
        com.caverock.androidsvg.n.j = new com.caverock.androidsvg.n("XMaxYMax", 9);
        v0 = new n[10];
        v0[0] = com.caverock.androidsvg.n.a;
        v0[1] = com.caverock.androidsvg.n.b;
        v0[2] = com.caverock.androidsvg.n.c;
        v0[3] = com.caverock.androidsvg.n.d;
        v0[4] = com.caverock.androidsvg.n.e;
        v0[5] = com.caverock.androidsvg.n.f;
        v0[6] = com.caverock.androidsvg.n.g;
        v0[7] = com.caverock.androidsvg.n.h;
        v0[8] = com.caverock.androidsvg.n.i;
        v0[9] = com.caverock.androidsvg.n.j;
        com.caverock.androidsvg.n.k = v0;
    }

    n(String p0, int p1) {
        Enum(p0, p1);
    }

    public static com.caverock.androidsvg.n valueOf(String p0) {
        return (com.caverock.androidsvg.n)Enum.valueOf(com.caverock.androidsvg.n, p0);
    }

    public static n[] values() {
        return (n[])com.caverock.androidsvg.n.k.clone();
    }

}
