package io.reactivex.internal.p559e.p560a;

import io.reactivex.C7765b;
import io.reactivex.C7814l;
import io.reactivex.C7818k;
import io.reactivex.exceptions.C7788d;
import io.reactivex.internal.p557b.C7811n;
import io.reactivex.p553c.C7767b;
import io.reactivex.p554d.C7773a;
import org.p561a.C7820a;

public final class C7819b extends C7818k {
    public final C7765b f40332a;
    public final Object f40333b = null;

    public C7819b(C7765b c7765b) {
        this.f40332a = c7765b;
    }

    protected final void mo6553a(C7814l c7814l) {
        C7765b c7765b = this.f40332a;
        C7820a c7821c = new C7821c(c7814l, this.f40333b);
        C7811n.m37615a((Object) c7821c, "s is null");
        try {
            C7767b c7767b = C7773a.f40294k;
            if (c7767b != null) {
                c7821c = (C7820a) C7773a.m37564a(c7767b);
            }
            C7811n.m37615a((Object) c7821c, "Plugin returned null Subscriber");
            c7765b.mo6552a(c7821c);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C7788d.m37579a(th);
            C7773a.m37567a(th);
            new NullPointerException("Actually not, but can't throw other exceptions due to RS").initCause(th);
        }
    }
}
