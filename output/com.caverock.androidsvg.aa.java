package com.caverock.androidsvg;

public static class com.caverock.androidsvg.aa extends Enum
{

    public static final com.caverock.androidsvg.aa a;
    public static final com.caverock.androidsvg.aa b;
    public static final com.caverock.androidsvg.aa c;
    public static final aa[] d;

    static {
        com.caverock.androidsvg.aa.a = new com.caverock.androidsvg.aa("pad", 0);
        com.caverock.androidsvg.aa.b = new com.caverock.androidsvg.aa("reflect", 1);
        com.caverock.androidsvg.aa.c = new com.caverock.androidsvg.aa("repeat", 2);
        v0 = new aa[3];
        v0[0] = com.caverock.androidsvg.aa.a;
        v0[1] = com.caverock.androidsvg.aa.b;
        v0[2] = com.caverock.androidsvg.aa.c;
        com.caverock.androidsvg.aa.d = v0;
    }

    aa(String p0, int p1) {
        Enum(p0, p1);
    }

    public static com.caverock.androidsvg.aa valueOf(String p0) {
        return (com.caverock.androidsvg.aa)Enum.valueOf(com.caverock.androidsvg.aa, p0);
    }

    public static aa[] values() {
        return (aa[])com.caverock.androidsvg.aa.d.clone();
    }

}
