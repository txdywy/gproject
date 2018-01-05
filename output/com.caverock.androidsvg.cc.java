package com.caverock.androidsvg;

public static class com.caverock.androidsvg.cc extends Enum
{

    public static final com.caverock.androidsvg.cc a;
    public static final com.caverock.androidsvg.cc b;
    public static final com.caverock.androidsvg.cc c;
    public static final com.caverock.androidsvg.cc d;
    public static final com.caverock.androidsvg.cc e;
    public static final com.caverock.androidsvg.cc f;
    public static final com.caverock.androidsvg.cc g;
    public static final com.caverock.androidsvg.cc h;
    public static final com.caverock.androidsvg.cc i;
    public static final cc[] j;

    static {
        com.caverock.androidsvg.cc.a = new com.caverock.androidsvg.cc("px", 0);
        com.caverock.androidsvg.cc.b = new com.caverock.androidsvg.cc("em", 1);
        com.caverock.androidsvg.cc.c = new com.caverock.androidsvg.cc("ex", 2);
        com.caverock.androidsvg.cc.d = new com.caverock.androidsvg.cc("in", 3);
        com.caverock.androidsvg.cc.e = new com.caverock.androidsvg.cc("cm", 4);
        com.caverock.androidsvg.cc.f = new com.caverock.androidsvg.cc("mm", 5);
        com.caverock.androidsvg.cc.g = new com.caverock.androidsvg.cc("pt", 6);
        com.caverock.androidsvg.cc.h = new com.caverock.androidsvg.cc("pc", 7);
        com.caverock.androidsvg.cc.i = new com.caverock.androidsvg.cc("percent", 8);
        v0 = new cc[9];
        v0[0] = com.caverock.androidsvg.cc.a;
        v0[1] = com.caverock.androidsvg.cc.b;
        v0[2] = com.caverock.androidsvg.cc.c;
        v0[3] = com.caverock.androidsvg.cc.d;
        v0[4] = com.caverock.androidsvg.cc.e;
        v0[5] = com.caverock.androidsvg.cc.f;
        v0[6] = com.caverock.androidsvg.cc.g;
        v0[7] = com.caverock.androidsvg.cc.h;
        v0[8] = com.caverock.androidsvg.cc.i;
        com.caverock.androidsvg.cc.j = v0;
    }

    cc(String p0, int p1) {
        Enum(p0, p1);
    }

    public static com.caverock.androidsvg.cc valueOf(String p0) {
        return (com.caverock.androidsvg.cc)Enum.valueOf(com.caverock.androidsvg.cc, p0);
    }

    public static cc[] values() {
        return (cc[])com.caverock.androidsvg.cc.j.clone();
    }

}
