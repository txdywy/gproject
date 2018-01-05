package com.google.p409c.p410a.p411a.p412a.p413a;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class C6921d extends WeakReference {
    public final int f34253a;

    public C6921d(Throwable th, ReferenceQueue referenceQueue) {
        super(th, referenceQueue);
        if (th == null) {
            throw new NullPointerException("The referent cannot be null");
        }
        this.f34253a = System.identityHashCode(th);
    }

    public final int hashCode() {
        return this.f34253a;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C6921d c6921d = (C6921d) obj;
        if (this.f34253a == c6921d.f34253a && get() == c6921d.get()) {
            return true;
        }
        return false;
    }
}
