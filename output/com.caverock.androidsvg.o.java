package com.caverock.androidsvg;

public static class com.caverock.androidsvg.o extends Enum
{

    public static final com.caverock.androidsvg.o a;
    public static final com.caverock.androidsvg.o b;
    public static final o[] c;

    static {
        com.caverock.androidsvg.o.a = new com.caverock.androidsvg.o("Meet", 0);
        com.caverock.androidsvg.o.b = new com.caverock.androidsvg.o("Slice", 1);
        v0 = new o[2];
        v0[0] = com.caverock.androidsvg.o.a;
        v0[1] = com.caverock.androidsvg.o.b;
        com.caverock.androidsvg.o.c = v0;
    }

    o(String p0, int p1) {
        Enum(p0, p1);
    }

    public static com.caverock.androidsvg.o valueOf(String p0) {
        return (com.caverock.androidsvg.o)Enum.valueOf(com.caverock.androidsvg.o, p0);
    }

    public static o[] values() {
        return (o[])com.caverock.androidsvg.o.c.clone();
    }

}
