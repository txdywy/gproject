package com.google.common.p420f.p421a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

final class C6990g extends C6984b {
    public final AtomicReferenceFieldUpdater f34423a;
    public final AtomicReferenceFieldUpdater f34424b;
    public final AtomicReferenceFieldUpdater f34425c;
    public final AtomicReferenceFieldUpdater f34426d;
    public final AtomicReferenceFieldUpdater f34427e;

    C6990g(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f34423a = atomicReferenceFieldUpdater;
        this.f34424b = atomicReferenceFieldUpdater2;
        this.f34425c = atomicReferenceFieldUpdater3;
        this.f34426d = atomicReferenceFieldUpdater4;
        this.f34427e = atomicReferenceFieldUpdater5;
    }

    final void mo5948a(C6995m c6995m, Thread thread) {
        this.f34423a.lazySet(c6995m, thread);
    }

    final void mo5947a(C6995m c6995m, C6995m c6995m2) {
        this.f34424b.lazySet(c6995m, c6995m2);
    }

    final boolean mo5950a(C6977a c6977a, C6995m c6995m, C6995m c6995m2) {
        return this.f34425c.compareAndSet(c6977a, c6995m, c6995m2);
    }

    final boolean mo5949a(C6977a c6977a, C6989f c6989f, C6989f c6989f2) {
        return this.f34426d.compareAndSet(c6977a, c6989f, c6989f2);
    }

    final boolean mo5951a(C6977a c6977a, Object obj, Object obj2) {
        return this.f34427e.compareAndSet(c6977a, obj, obj2);
    }
}
