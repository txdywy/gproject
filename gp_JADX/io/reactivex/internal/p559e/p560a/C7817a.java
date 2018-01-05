package io.reactivex.internal.p559e.p560a;

import io.reactivex.C7765b;
import io.reactivex.exceptions.C7788d;
import io.reactivex.internal.p565h.C7861b;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.p561a.C7820a;
import org.p561a.C7859b;

public final class C7817a extends C7765b {
    public final Future f40329b;
    public final long f40330c = 0;
    public final TimeUnit f40331d = null;

    public C7817a(Future future) {
        this.f40329b = future;
    }

    public final void mo6552a(C7820a c7820a) {
        C7859b c7861b = new C7861b(c7820a);
        c7820a.mo6556a(c7861b);
        try {
            Object obj = this.f40331d != null ? this.f40329b.get(this.f40330c, this.f40331d) : this.f40329b.get();
            if (obj == null) {
                c7820a.mo6555a(new NullPointerException("The future returned null"));
            } else {
                c7861b.m37726b(obj);
            }
        } catch (Throwable th) {
            C7788d.m37579a(th);
            if ((c7861b.get() == 4 ? 1 : null) == null) {
                c7820a.mo6555a(th);
            }
        }
    }
}
