package io.reactivex.p551b;

import io.reactivex.internal.p557b.C7811n;
import java.util.concurrent.atomic.AtomicReference;

abstract class C7763c extends AtomicReference implements C7756b {
    C7763c(Object obj) {
        super(C7811n.m37615a(obj, "value is null"));
    }

    protected abstract void mo6534a(Object obj);

    public final void mo6530a() {
        if (get() != null) {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                mo6534a(andSet);
            }
        }
    }
}
