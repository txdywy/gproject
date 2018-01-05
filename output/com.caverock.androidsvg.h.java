package com.caverock.androidsvg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class com.caverock.androidsvg.h
{

    public List a;

    h() {
        this.a = 0;
    }

    public final void a(com.caverock.androidsvg.g p0) {
        if (this.a == 0)
            this.a = new ArrayList();
        v1 = 0;
        while (v1 < this.a.size()) {
            if (((com.caverock.androidsvg.g)this.a.get(v1)).a.b > p0.a.b) {
                this.a.add(v1, p0);
                return;
            }
            v1 = v1 + 1;
        }
        this.a.add(p0);
    }

    public final void a(com.caverock.androidsvg.h p0) {
        if (p0.a != 0) {
            if (this.a == 0)
                this.a = new ArrayList(p0.a.size());
            v1 = p0.a.iterator();
            while (v1.hasNext())
                this.a.add((com.caverock.androidsvg.g)v1.next());
        }
    }

    public final String toString() {
        if (this.a == 0)
            v0 = "";
        else {
            v1 = new StringBuilder();
            v2 = this.a.iterator();
            while (v2.hasNext())
                v1.append(((com.caverock.androidsvg.g)v2.next()).toString()).append(10);
            v0 = v1.toString();
        }
        return v0;
    }

}
