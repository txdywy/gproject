package com.caverock.androidsvg;

public static class com.caverock.androidsvg.ay extends Enum
{

    public static final com.caverock.androidsvg.ay a;
    public static final com.caverock.androidsvg.ay b;
    public static final com.caverock.androidsvg.ay c;
    public static final ay[] d;

    static {
        com.caverock.androidsvg.ay.a = new com.caverock.androidsvg.ay("Butt", 0);
        com.caverock.androidsvg.ay.b = new com.caverock.androidsvg.ay("Round", 1);
        com.caverock.androidsvg.ay.c = new com.caverock.androidsvg.ay("Square", 2);
        v0 = new ay[3];
        v0[0] = com.caverock.androidsvg.ay.a;
        v0[1] = com.caverock.androidsvg.ay.b;
        v0[2] = com.caverock.androidsvg.ay.c;
        com.caverock.androidsvg.ay.d = v0;
    }

    ay(String p0, int p1) {
        Enum(p0, p1);
    }

    public static com.caverock.androidsvg.ay valueOf(String p0) {
        return (com.caverock.androidsvg.ay)Enum.valueOf(com.caverock.androidsvg.ay, p0);
    }

    public static ay[] values() {
        return (ay[])com.caverock.androidsvg.ay.d.clone();
    }

}
