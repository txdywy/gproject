package com.android.volley.a;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class com.android.volley.a.t implements Runnable
{

    public final com.android.volley.a.q a;

    t(com.android.volley.a.q p0) {
        this.a = p0;
    }

    public final void run() {
        v2 = this.a.e.values().iterator();
        while (v2.hasNext()) {
            v0 = (com.android.volley.a.u)v2.next();
            v3 = v0.d.iterator();
            while (v3.hasNext()) {
                v1 = (com.android.volley.a.w)v3.next();
                if (v1.b == 0)
                    continue;
                if (v0.c == 0) {
                    v1.a = v0.b;
                    v1.b.a(v1, 0);
                }
                else
                    v1.b.a(v0.c);
            }
        }
        this.a.e.clear();
        this.a.g = 0;
    }

}
