package com.caverock.androidsvg;

public static class com.caverock.androidsvg.bb extends Enum
{

    public static final com.caverock.androidsvg.bb a;
    public static final com.caverock.androidsvg.bb b;
    public static final com.caverock.androidsvg.bb c;
    public static final com.caverock.androidsvg.bb d;
    public static final com.caverock.androidsvg.bb e;
    public static final bb[] f;

    static {
        com.caverock.androidsvg.bb.a = new com.caverock.androidsvg.bb("None", 0);
        com.caverock.androidsvg.bb.b = new com.caverock.androidsvg.bb("Underline", 1);
        com.caverock.androidsvg.bb.c = new com.caverock.androidsvg.bb("Overline", 2);
        com.caverock.androidsvg.bb.d = new com.caverock.androidsvg.bb("LineThrough", 3);
        com.caverock.androidsvg.bb.e = new com.caverock.androidsvg.bb("Blink", 4);
        v0 = new bb[5];
        v0[0] = com.caverock.androidsvg.bb.a;
        v0[1] = com.caverock.androidsvg.bb.b;
        v0[2] = com.caverock.androidsvg.bb.c;
        v0[3] = com.caverock.androidsvg.bb.d;
        v0[4] = com.caverock.androidsvg.bb.e;
        com.caverock.androidsvg.bb.f = v0;
    }

    bb(String p0, int p1) {
        Enum(p0, p1);
    }

    public static com.caverock.androidsvg.bb valueOf(String p0) {
        return (com.caverock.androidsvg.bb)Enum.valueOf(com.caverock.androidsvg.bb, p0);
    }

    public static bb[] values() {
        return (bb[])com.caverock.androidsvg.bb.f.clone();
    }

}
