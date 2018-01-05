package com.caverock.androidsvg;

public static class com.caverock.androidsvg.az extends Enum
{

    public static final com.caverock.androidsvg.az a;
    public static final com.caverock.androidsvg.az b;
    public static final com.caverock.androidsvg.az c;
    public static final az[] d;

    static {
        com.caverock.androidsvg.az.a = new com.caverock.androidsvg.az("Miter", 0);
        com.caverock.androidsvg.az.b = new com.caverock.androidsvg.az("Round", 1);
        com.caverock.androidsvg.az.c = new com.caverock.androidsvg.az("Bevel", 2);
        v0 = new az[3];
        v0[0] = com.caverock.androidsvg.az.a;
        v0[1] = com.caverock.androidsvg.az.b;
        v0[2] = com.caverock.androidsvg.az.c;
        com.caverock.androidsvg.az.d = v0;
    }

    az(String p0, int p1) {
        Enum(p0, p1);
    }

    public static com.caverock.androidsvg.az valueOf(String p0) {
        return (com.caverock.androidsvg.az)Enum.valueOf(com.caverock.androidsvg.az, p0);
    }

    public static az[] values() {
        return (az[])com.caverock.androidsvg.az.d.clone();
    }

}
