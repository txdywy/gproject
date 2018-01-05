package com.google.android.finsky.di;

import com.google.android.finsky.cm.C2297d;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

final class C2751g implements C2297d {
    public final /* synthetic */ AtomicBoolean f14991a;
    public final /* synthetic */ CountDownLatch f14992b;

    C2751g(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
        this.f14991a = atomicBoolean;
        this.f14992b = countDownLatch;
    }

    public final void mo2939a() {
        this.f14991a.set(true);
        this.f14992b.countDown();
    }

    public final void mo2940a(int i, Throwable th) {
        FinskyLog.m21660a(th, "commit installFailed: %d", Integer.valueOf(i));
        this.f14991a.set(false);
        this.f14992b.countDown();
    }
}
