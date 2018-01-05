package com.caverock.androidsvg;

public static class com.caverock.androidsvg.bc extends Enum
{

    public static final com.caverock.androidsvg.bc a;
    public static final com.caverock.androidsvg.bc b;
    public static final bc[] c;

    static {
        com.caverock.androidsvg.bc.a = new com.caverock.androidsvg.bc("LTR", 0);
        com.caverock.androidsvg.bc.b = new com.caverock.androidsvg.bc("RTL", 1);
        v0 = new bc[2];
        v0[0] = com.caverock.androidsvg.bc.a;
        v0[1] = com.caverock.androidsvg.bc.b;
        com.caverock.androidsvg.bc.c = v0;
    }

    bc(String p0, int p1) {
        Enum(p0, p1);
    }

    public static com.caverock.androidsvg.bc valueOf(String p0) {
        return (com.caverock.androidsvg.bc)Enum.valueOf(com.caverock.androidsvg.bc, p0);
    }

    public static bc[] values() {
        return (bc[])com.caverock.androidsvg.bc.c.clone();
    }

}
