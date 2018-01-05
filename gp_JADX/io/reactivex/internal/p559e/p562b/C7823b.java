package io.reactivex.internal.p559e.p562b;

import io.reactivex.C7772c;
import io.reactivex.C7784e;
import io.reactivex.C7789g;
import io.reactivex.exceptions.C7788d;
import io.reactivex.p551b.C7756b;

public final class C7823b extends C7772c {
    public final C7784e f40340a;

    public C7823b(C7784e c7784e) {
        this.f40340a = c7784e;
    }

    protected final void mo6558b(C7789g c7789g) {
        C7756b c7824c = new C7824c(c7789g);
        c7789g.mo6548a(c7824c);
        try {
            this.f40340a.m37571a(c7824c);
        } catch (Throwable th) {
            C7788d.m37579a(th);
            c7824c.mo6560a(th);
        }
    }
}
