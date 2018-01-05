package com.caverock.androidsvg;

public static class com.caverock.androidsvg.bd extends Enum
{

    public static final com.caverock.androidsvg.bd a;
    public static final com.caverock.androidsvg.bd b;
    public static final bd[] c;

    static {
        com.caverock.androidsvg.bd.a = new com.caverock.androidsvg.bd("None", 0);
        com.caverock.androidsvg.bd.b = new com.caverock.androidsvg.bd("NonScalingStroke", 1);
        v0 = new bd[2];
        v0[0] = com.caverock.androidsvg.bd.a;
        v0[1] = com.caverock.androidsvg.bd.b;
        com.caverock.androidsvg.bd.c = v0;
    }

    bd(String p0, int p1) {
        Enum(p0, p1);
    }

    public static com.caverock.androidsvg.bd valueOf(String p0) {
        return (com.caverock.androidsvg.bd)Enum.valueOf(com.caverock.androidsvg.bd, p0);
    }

    public static bd[] values() {
        return (bd[])com.caverock.androidsvg.bd.c.clone();
    }

}
