package com.caverock.androidsvg;

public static class com.caverock.androidsvg.ba extends Enum
{

    public static final com.caverock.androidsvg.ba a;
    public static final com.caverock.androidsvg.ba b;
    public static final com.caverock.androidsvg.ba c;
    public static final ba[] d;

    static {
        com.caverock.androidsvg.ba.a = new com.caverock.androidsvg.ba("Start", 0);
        com.caverock.androidsvg.ba.b = new com.caverock.androidsvg.ba("Middle", 1);
        com.caverock.androidsvg.ba.c = new com.caverock.androidsvg.ba("End", 2);
        v0 = new ba[3];
        v0[0] = com.caverock.androidsvg.ba.a;
        v0[1] = com.caverock.androidsvg.ba.b;
        v0[2] = com.caverock.androidsvg.ba.c;
        com.caverock.androidsvg.ba.d = v0;
    }

    ba(String p0, int p1) {
        Enum(p0, p1);
    }

    public static com.caverock.androidsvg.ba valueOf(String p0) {
        return (com.caverock.androidsvg.ba)Enum.valueOf(com.caverock.androidsvg.ba, p0);
    }

    public static ba[] values() {
        return (ba[])com.caverock.androidsvg.ba.d.clone();
    }

}
