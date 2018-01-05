package com.caverock.androidsvg;

public static class com.caverock.androidsvg.c extends Enum
{

    public static final com.caverock.androidsvg.c a;
    public static final com.caverock.androidsvg.c b;
    public static final com.caverock.androidsvg.c c;
    public static final com.caverock.androidsvg.c d;
    public static final c[] e;

    static {
        com.caverock.androidsvg.c.a = new com.caverock.androidsvg.c("EXISTS", 0);
        com.caverock.androidsvg.c.b = new com.caverock.androidsvg.c("EQUALS", 1);
        com.caverock.androidsvg.c.c = new com.caverock.androidsvg.c("INCLUDES", 2);
        com.caverock.androidsvg.c.d = new com.caverock.androidsvg.c("DASHMATCH", 3);
        v0 = new c[4];
        v0[0] = com.caverock.androidsvg.c.a;
        v0[1] = com.caverock.androidsvg.c.b;
        v0[2] = com.caverock.androidsvg.c.c;
        v0[3] = com.caverock.androidsvg.c.d;
        com.caverock.androidsvg.c.e = v0;
    }

    c(String p0, int p1) {
        Enum(p0, p1);
    }

    public static com.caverock.androidsvg.c valueOf(String p0) {
        return (com.caverock.androidsvg.c)Enum.valueOf(com.caverock.androidsvg.c, p0);
    }

    public static c[] values() {
        return (c[])com.caverock.androidsvg.c.e.clone();
    }

}
