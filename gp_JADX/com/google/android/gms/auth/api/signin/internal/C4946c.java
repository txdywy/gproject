package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.support.v4.p028a.C0212a;
import android.util.Log;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.api.internal.bo;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public final class C4946c extends C0212a implements bo {
    public Semaphore f25408g = new Semaphore(0);
    public Set f25409h;

    public C4946c(Context context, Set set) {
        super(context);
        this.f25409h = set;
    }

    private final Void m22982m() {
        int i = 0;
        for (C5058o a : this.f25409h) {
            i = a.mo4551a((bo) this) ? i + 1 : i;
        }
        try {
            this.f25408g.tryAcquire(i, 5, TimeUnit.SECONDS);
        } catch (Throwable e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
        }
        return null;
    }

    public final /* synthetic */ Object mo274d() {
        return m22982m();
    }

    public final void mo4477f() {
        this.f25408g.release();
    }

    protected final void mo276g() {
        this.f25408g.drainPermits();
        mo266a();
    }
}
