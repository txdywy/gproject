package com.caverock.androidsvg;

import java.util.Iterator;
import java.util.List;

public final class com.caverock.androidsvg.i
{

    public List a;
    public int b;

    i() {
        this.a = 0;
        this.b = 0;
    }

    public final int a() {
        if (this.a == 0)
            v0 = 0;
        else
            v0 = this.a.size();
        return v0;
    }

    public final com.caverock.androidsvg.j a(int p0) {
        return (com.caverock.androidsvg.j)this.a.get(p0);
    }

    public final boolean b() {
        if (this.a == 0)
            v0 = 1;
        else
            v0 = this.a.isEmpty();
        return v0;
    }

    public final void c() {
        this.b = this.b + 100;
    }

    public final String toString() {
        v1 = new StringBuilder();
        v2 = this.a.iterator();
        while (v2.hasNext())
            v1.append((com.caverock.androidsvg.j)v2.next()).append(32);
        return v1.append(40).append(this.b).append(41).toString();
    }

}
