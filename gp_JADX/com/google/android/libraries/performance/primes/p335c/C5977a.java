package com.google.android.libraries.performance.primes.p335c;

import com.google.android.libraries.p326c.p327a.C5916a;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public final class C5977a extends PhantomReference {
    public final String f29850a;
    public C5977a f29851b;
    public C5977a f29852c;

    public C5977a(Object obj, String str, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.f29850a = str;
    }

    public final void m27759a(C5977a c5977a) {
        C5916a.m27406a((Object) c5977a);
        this.f29851b = c5977a;
        this.f29852c = c5977a.f29852c;
        if (this.f29852c != null) {
            this.f29852c.f29851b = this;
        }
        c5977a.f29852c = this;
    }

    public final C5977a m27758a() {
        if (this.f29851b != null) {
            this.f29851b.f29852c = this.f29852c;
        }
        if (this.f29852c != null) {
            this.f29852c.f29851b = this.f29851b;
        }
        this.f29852c = null;
        this.f29851b = null;
        return this;
    }
}
