package io.reactivex.internal.p559e.p560a;

import io.reactivex.C7814l;
import io.reactivex.internal.p565h.C7862c;
import io.reactivex.p551b.C7756b;
import io.reactivex.p554d.C7773a;
import java.util.NoSuchElementException;
import org.p561a.C7820a;
import org.p561a.C7859b;

final class C7821c implements C7756b, C7820a {
    public final C7814l f40334a;
    public final Object f40335b;
    public C7859b f40336c;
    public boolean f40337d;
    public Object f40338e;

    C7821c(C7814l c7814l, Object obj) {
        this.f40334a = c7814l;
        this.f40335b = obj;
    }

    public final void mo6556a(C7859b c7859b) {
        if (C7862c.m37731a(this.f40336c, c7859b)) {
            this.f40336c = c7859b;
            this.f40334a.mo6545a((C7756b) this);
            c7859b.mo6566a();
        }
    }

    public final void mo6554a(Object obj) {
        if (!this.f40337d) {
            if (this.f40338e != null) {
                this.f40337d = true;
                this.f40336c.mo6567f();
                this.f40336c = C7862c.f40461a;
                this.f40334a.mo6547a(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.f40338e = obj;
        }
    }

    public final void mo6555a(Throwable th) {
        if (this.f40337d) {
            C7773a.m37567a(th);
            return;
        }
        this.f40337d = true;
        this.f40336c = C7862c.f40461a;
        this.f40334a.mo6547a(th);
    }

    public final void mo6557b() {
        if (!this.f40337d) {
            this.f40337d = true;
            this.f40336c = C7862c.f40461a;
            Object obj = this.f40338e;
            this.f40338e = null;
            if (obj == null) {
                obj = this.f40335b;
            }
            if (obj != null) {
                this.f40334a.mo6546a(obj);
            } else {
                this.f40334a.mo6547a(new NoSuchElementException());
            }
        }
    }

    public final void mo6530a() {
        this.f40336c.mo6567f();
        this.f40336c = C7862c.f40461a;
    }
}
