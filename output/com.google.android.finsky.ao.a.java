package com.google.android.finsky.ao;

import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.api.h;
import com.google.android.finsky.cn.a;
import com.google.android.finsky.l.j;
import com.google.android.finsky.utils.bb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

final class com.google.android.finsky.ao.a
{

    public final com.google.android.finsky.api.h a;
    public final com.google.android.finsky.cn.a b;
    public final com.google.android.finsky.l.j c;
    public final AtomicInteger d;
    public final Handler e;
    public final ArrayList f;
    public final Map g;

    a(com.google.android.finsky.api.h p0, com.google.android.finsky.cn.a p1, com.google.android.finsky.l.j p2) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = new AtomicInteger(1);
        this.e = new Handler(Looper.getMainLooper());
        this.f = new ArrayList();
        this.g = new HashMap();
    }

    static Set a(Map p0) {
        v1 = new HashSet();
        v2 = p0.keySet().iterator();
        while (v2.hasNext())
            v1.addAll((Collection)p0.get((String)v2.next()));
        return v1;
    }

    public final int a(com.google.android.finsky.ao.h p0, com.google.android.finsky.ao.f p1) {
        com.google.android.finsky.utils.bb.a();
        v0 = this.d.getAndIncrement();
        this.f.add(new com.google.android.finsky.ao.g(v0, p0, p1));
        if (this.f.size() == 1 && this.g.isEmpty())
            this.a();
        return v0;
    }

    final void a() {
        this.e.post(new com.google.android.finsky.ao.b(this));
    }

    final void a(com.google.android.finsky.ao.g p0, com.google.android.finsky.ao.k p1) {
        this.e.post(new com.google.android.finsky.ao.e(this, p0, p1));
    }

}
