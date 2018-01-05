package io.reactivex.internal.p559e.p562b;

import io.reactivex.C7789g;
import io.reactivex.internal.p552a.C7791b;
import io.reactivex.p551b.C7756b;
import java.util.concurrent.atomic.AtomicReference;

final class C7828g extends AtomicReference implements C7756b, C7789g {
    public final C7789g f40357a;
    public final AtomicReference f40358b = new AtomicReference();

    C7828g(C7789g c7789g) {
        this.f40357a = c7789g;
    }

    public final void mo6548a(C7756b c7756b) {
        C7791b.m37586a(this.f40358b, c7756b);
    }

    public final void c_(Object obj) {
        this.f40357a.c_(obj);
    }

    public final void mo6549a(Throwable th) {
        this.f40357a.mo6549a(th);
    }

    public final void cZ_() {
        this.f40357a.cZ_();
    }

    public final void mo6530a() {
        C7791b.m37585a(this.f40358b);
        C7791b.m37585a((AtomicReference) this);
    }
}
