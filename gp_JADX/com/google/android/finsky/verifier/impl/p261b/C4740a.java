package com.google.android.finsky.verifier.impl.p261b;

import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public abstract class C4740a {
    public static final Handler f24384G = new Handler(Looper.getMainLooper());
    public C4727e f24385F;
    public boolean f24386H = false;

    public abstract boolean mo4343a();

    public final void m22064a(C4727e c4727e) {
        synchronized (this) {
            this.f24385F = c4727e;
        }
    }

    public final void m22068k() {
        bb.m21792a(new C4742b(this), new Void[0]);
    }

    public final synchronized void m22069l() {
        if (!this.f24386H) {
            this.f24386H = true;
            C4740a.m22063a(new C4743c(this));
        }
    }

    public final boolean m22066a(long j) {
        boolean z = false;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        m22064a(new C4744d(countDownLatch));
        if (!mo4343a()) {
            m22069l();
        }
        try {
            z = countDownLatch.await(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            FinskyLog.m21669e("Thread was interrupted", new Object[z]);
        }
        return z;
    }

    public void mo4344c() {
    }

    public final synchronized boolean m22070m() {
        return this.f24386H;
    }

    public static void m22063a(Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            f24384G.post(runnable);
        } else {
            runnable.run();
        }
    }
}
