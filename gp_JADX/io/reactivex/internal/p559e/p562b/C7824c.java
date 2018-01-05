package io.reactivex.internal.p559e.p562b;

import io.reactivex.C7774d;
import io.reactivex.C7789g;
import io.reactivex.internal.p552a.C7791b;
import io.reactivex.p551b.C7756b;
import io.reactivex.p554d.C7773a;
import java.util.concurrent.atomic.AtomicReference;

final class C7824c extends AtomicReference implements C7756b, C7774d {
    public final C7789g f40341a;

    C7824c(C7789g c7789g) {
        this.f40341a = c7789g;
    }

    public final void mo6559a(Object obj) {
        if (obj == null) {
            mo6560a(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else if (!mo6561b()) {
            this.f40341a.c_(obj);
        }
    }

    public final void mo6560a(Throwable th) {
        if (mo6561b()) {
            C7773a.m37567a(th);
            return;
        }
        try {
            this.f40341a.mo6549a(th);
        } finally {
            C7791b.m37585a((AtomicReference) this);
        }
    }

    public final void da_() {
        if (!mo6561b()) {
            try {
                this.f40341a.cZ_();
            } finally {
                C7791b.m37585a((AtomicReference) this);
            }
        }
    }

    public final void mo6530a() {
        C7791b.m37585a((AtomicReference) this);
    }

    public final boolean mo6561b() {
        return C7791b.m37583a((C7756b) get());
    }
}
