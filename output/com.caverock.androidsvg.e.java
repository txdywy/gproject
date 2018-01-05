package com.caverock.androidsvg;

public static class com.caverock.androidsvg.e extends Enum
{

    public static final com.caverock.androidsvg.e a;
    public static final com.caverock.androidsvg.e b;
    public static final com.caverock.androidsvg.e c;
    public static final e[] d;

    static {
        com.caverock.androidsvg.e.a = new com.caverock.androidsvg.e("DESCENDANT", 0);
        com.caverock.androidsvg.e.b = new com.caverock.androidsvg.e("CHILD", 1);
        com.caverock.androidsvg.e.c = new com.caverock.androidsvg.e("FOLLOWS", 2);
        v0 = new e[3];
        v0[0] = com.caverock.androidsvg.e.a;
        v0[1] = com.caverock.androidsvg.e.b;
        v0[2] = com.caverock.androidsvg.e.c;
        com.caverock.androidsvg.e.d = v0;
    }

    e(String p0, int p1) {
        Enum(p0, p1);
    }

    public static com.caverock.androidsvg.e valueOf(String p0) {
        return (com.caverock.androidsvg.e)Enum.valueOf(com.caverock.androidsvg.e, p0);
    }

    public static e[] values() {
        return (e[])com.caverock.androidsvg.e.d.clone();
    }

}
