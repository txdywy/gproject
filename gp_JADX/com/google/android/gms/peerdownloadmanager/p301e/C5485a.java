package com.google.android.gms.peerdownloadmanager.p301e;

import android.util.SparseArray;
import com.google.android.gms.peerdownloadmanager.common.C5371a;
import com.google.android.gms.peerdownloadmanager.common.C5379j;
import java.util.concurrent.atomic.AtomicInteger;

public final class C5485a {
    public final AtomicInteger f28234a;
    public final SparseArray f28235b;
    public final C5486c f28236c;
    public final C5489e f28237d;
    public final C5490f f28238e;
    public final C5491g f28239f;
    public C5379j f28240g;

    public C5485a() {
        this(C5487b.f28241a);
    }

    private C5485a(C5486c c5486c) {
        this.f28234a = new AtomicInteger(1);
        this.f28235b = new SparseArray();
        this.f28236c = c5486c;
        this.f28237d = new C5489e();
        this.f28238e = new C5490f();
        this.f28239f = new C5491g();
        this.f28240g = new C5488d();
    }

    public final synchronized int m26358a() {
        int andIncrement;
        andIncrement = this.f28234a.getAndIncrement();
        this.f28235b.put(andIncrement, new C5492h(this.f28236c));
        return andIncrement;
    }

    public final synchronized long m26359a(int i) {
        C5492h c5492h;
        c5492h = (C5492h) this.f28235b.get(i);
        c5492h.f28254c = c5492h.f28252a.mo5025a();
        this.f28235b.remove(i);
        return c5492h.m26377a();
    }

    public final void m26360a(int i, C5371a c5371a, int i2, long j, long j2, boolean z, boolean z2) {
        this.f28240g.mo5029a(i, c5371a, m26359a(i2), j, j2, z, z2);
    }
}
