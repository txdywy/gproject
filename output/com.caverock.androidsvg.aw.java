package com.caverock.androidsvg;

public static class com.caverock.androidsvg.aw extends Enum
{

    public static final com.caverock.androidsvg.aw a;
    public static final com.caverock.androidsvg.aw b;
    public static final aw[] c;

    static {
        com.caverock.androidsvg.aw.a = new com.caverock.androidsvg.aw("NonZero", 0);
        com.caverock.androidsvg.aw.b = new com.caverock.androidsvg.aw("EvenOdd", 1);
        v0 = new aw[2];
        v0[0] = com.caverock.androidsvg.aw.a;
        v0[1] = com.caverock.androidsvg.aw.b;
        com.caverock.androidsvg.aw.c = v0;
    }

    aw(String p0, int p1) {
        Enum(p0, p1);
    }

    public static com.caverock.androidsvg.aw valueOf(String p0) {
        return (com.caverock.androidsvg.aw)Enum.valueOf(com.caverock.androidsvg.aw, p0);
    }

    public static aw[] values() {
        return (aw[])com.caverock.androidsvg.aw.c.clone();
    }

}
