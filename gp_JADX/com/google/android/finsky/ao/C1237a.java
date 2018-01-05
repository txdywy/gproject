package com.google.android.finsky.ao;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.p107l.C3654j;
import com.google.android.finsky.utils.bb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public final class C1237a {
    public final C1287h f7385a;
    public final C2320a f7386b;
    public final C3654j f7387c;
    public final AtomicInteger f7388d = new AtomicInteger(1);
    public final Handler f7389e = new Handler(Looper.getMainLooper());
    public final ArrayList f7390f = new ArrayList();
    public final Map f7391g = new HashMap();

    @SuppressLint({"UseSparseArrays"})
    public C1237a(C1287h c1287h, C2320a c2320a, C3654j c3654j) {
        this.f7385a = c1287h;
        this.f7386b = c2320a;
        this.f7387c = c3654j;
    }

    public final int m7241a(C1244h c1244h, C1242f c1242f) {
        bb.m21791a();
        int andIncrement = this.f7388d.getAndIncrement();
        this.f7390f.add(new C1243g(andIncrement, c1244h, c1242f));
        if (this.f7390f.size() == 1 && this.f7391g.isEmpty()) {
            m7242a();
        }
        return andIncrement;
    }

    final void m7242a() {
        this.f7389e.post(new C1238b(this));
    }

    final void m7243a(C1243g c1243g, C1247k c1247k) {
        this.f7389e.post(new C1241e(this, c1243g, c1247k));
    }

    static Set m7240a(Map map) {
        Set hashSet = new HashSet();
        for (String str : map.keySet()) {
            hashSet.addAll((Collection) map.get(str));
        }
        return hashSet;
    }
}
