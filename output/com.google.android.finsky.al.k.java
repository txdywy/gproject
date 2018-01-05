package com.google.android.finsky.al;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

public final class com.google.android.finsky.al.k
{

    public int a;
    public final List b;

    k() {
        this.a = -1;
        this.b = new ArrayList();
    }

    public final List a() {
        v2 = new ArrayList();
        v1 = 0;
        while (v1 < this.b.size()) {
            v2.add((String)((Pair)this.b.get(v1)).first);
            v1 = v1 + 1;
        }
        return v2;
    }

    public final void a(String p0, Object p1) {
        this.b.add(new Pair(p0, p1));
    }

}
