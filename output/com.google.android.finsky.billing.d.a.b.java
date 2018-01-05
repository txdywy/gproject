package com.google.android.finsky.billing.d.a;

import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.billing.d.c;
import com.google.android.finsky.billing.lightpurchase.ar;
import com.google.android.finsky.d.a;
import java.util.ArrayDeque;

final class com.google.android.finsky.billing.d.a.b implements com.google.android.finsky.billing.d.a
{

    public final com.google.android.finsky.d.a a;
    public final ArrayDeque b;
    public final Handler c;
    public com.google.android.finsky.billing.d.c d;
    public Runnable e;
    public boolean f;

    b(com.google.android.finsky.d.a p0) {
        this.b = new ArrayDeque();
        this.c = new Handler(Looper.getMainLooper());
        this.a = p0;
    }

    public final void a(com.google.android.finsky.billing.d.c p0) {
        if (this.f != 0)
            throw new IllegalStateException("Cannot post new request to already committed queue");
        this.b.add(p0);
        if (this.a())
            this.b();
    }

    public final void a(Runnable p0) {
        this.f = 1;
        if (this.a() && p0 != 0)
            p0.run();
        else
            this.e = p0;
    }

    public final boolean a() {
        if (this.b.isEmpty() && this.d == 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    final void b() {
        this.d = (com.google.android.finsky.billing.d.c)this.b.removeFirst();
        com.google.android.finsky.billing.lightpurchase.ar.a(this.d.a, this.d.b, this.d.c, new com.google.android.finsky.billing.d.a.c(this), this.d.e, this.d.f, 1, this.a.a(this.d.a));
    }

}
