package com.caverock.androidsvg;

public static class com.caverock.androidsvg.ax extends Enum
{

    public static final com.caverock.androidsvg.ax a;
    public static final com.caverock.androidsvg.ax b;
    public static final com.caverock.androidsvg.ax c;
    public static final ax[] d;

    static {
        com.caverock.androidsvg.ax.a = new com.caverock.androidsvg.ax("Normal", 0);
        com.caverock.androidsvg.ax.b = new com.caverock.androidsvg.ax("Italic", 1);
        com.caverock.androidsvg.ax.c = new com.caverock.androidsvg.ax("Oblique", 2);
        v0 = new ax[3];
        v0[0] = com.caverock.androidsvg.ax.a;
        v0[1] = com.caverock.androidsvg.ax.b;
        v0[2] = com.caverock.androidsvg.ax.c;
        com.caverock.androidsvg.ax.d = v0;
    }

    ax(String p0, int p1) {
        Enum(p0, p1);
    }

    public static com.caverock.androidsvg.ax valueOf(String p0) {
        return (com.caverock.androidsvg.ax)Enum.valueOf(com.caverock.androidsvg.ax, p0);
    }

    public static ax[] values() {
        return (ax[])com.caverock.androidsvg.ax.d.clone();
    }

}
