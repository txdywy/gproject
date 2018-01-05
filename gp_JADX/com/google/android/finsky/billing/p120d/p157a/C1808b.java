package com.google.android.finsky.billing.p120d.p157a;

import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.billing.lightpurchase.ar;
import com.google.android.finsky.billing.p120d.C1807a;
import com.google.android.finsky.billing.p120d.C1811c;
import com.google.android.finsky.p111d.C2471a;
import java.util.ArrayDeque;

public final class C1808b implements C1807a {
    public final C2471a f9355a;
    public final ArrayDeque f9356b = new ArrayDeque();
    public final Handler f9357c = new Handler(Looper.getMainLooper());
    public C1811c f9358d;
    public Runnable f9359e;
    public boolean f9360f;

    public C1808b(C2471a c2471a) {
        this.f9355a = c2471a;
    }

    public final void mo2456a(C1811c c1811c) {
        if (this.f9360f) {
            throw new IllegalStateException("Cannot post new request to already committed queue");
        }
        boolean a = m9814a();
        this.f9356b.add(c1811c);
        if (a) {
            m9815b();
        }
    }

    public final boolean m9814a() {
        return this.f9356b.isEmpty() && this.f9358d == null;
    }

    public final void mo2457a(Runnable runnable) {
        this.f9360f = true;
        if (!m9814a() || runnable == null) {
            this.f9359e = runnable;
        } else {
            runnable.run();
        }
    }

    final void m9815b() {
        this.f9358d = (C1811c) this.f9356b.removeFirst();
        ar.m10200a(this.f9358d.f9363a, this.f9358d.f9364b, this.f9358d.f9365c, new C1809c(this), this.f9358d.f9367e, this.f9358d.f9368f, true, this.f9355a.m13178a(this.f9358d.f9363a));
    }
}
