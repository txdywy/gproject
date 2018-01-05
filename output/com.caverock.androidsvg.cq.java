package com.caverock.androidsvg;

import android.support.v4.h.i;
import java.util.ArrayList;
import java.util.List;

protected final class com.caverock.androidsvg.cq
{

    public com.caverock.androidsvg.cr a;

    cq() {
        this.a = new com.caverock.androidsvg.cr();
    }

    private static String b(String p0, float p1) {
        v1 = new Object[1];
        v1[0] = Float.valueOf(p1);
        v0 = String.format("%.4f", v1);
        return (String.valueOf(p0).length() + String.valueOf(v0).length()) + p0 + v0;
    }

    public final com.caverock.androidsvg.q a(int p0, float p1) {
        return this.a(14 + "res" + p0, p1);
    }

    protected final com.caverock.androidsvg.q a(String p0, float p1) {
        v0 = this.a.a(com.caverock.androidsvg.cq.b(p0, p1));
        if ((List)v0 == 0 || ((List)v0).isEmpty())
            v0 = 0;
        else
            v0 = (com.caverock.androidsvg.q)((List)v0).get(0);
        return v0;
    }

    public final void a(com.caverock.androidsvg.q p0, int p1) {
        this.a(p0, 14 + "res" + p1);
    }

    protected final void a(com.caverock.androidsvg.q p0, String p1) {
        if (p0 != 0) {
            v0 = new ArrayList(1);
            v0.add(p0);
            this.a.a(com.caverock.androidsvg.cq.b(p1, p0.g), v0);
        }
    }

}
