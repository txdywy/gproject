package com.google.common.p420f.p421a;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

final class C7001w extends C7000v {
    public final AtomicReferenceFieldUpdater f34442a;
    public final AtomicIntegerFieldUpdater f34443b;

    C7001w(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.f34442a = atomicReferenceFieldUpdater;
        this.f34443b = atomicIntegerFieldUpdater;
    }

    final void mo5955a(C6978u c6978u, Set set) {
        this.f34442a.compareAndSet(c6978u, null, set);
    }

    final int mo5954a(C6978u c6978u) {
        return this.f34443b.decrementAndGet(c6978u);
    }
}
