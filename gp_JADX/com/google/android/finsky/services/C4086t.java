package com.google.android.finsky.services;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.CountDownLatch;

final class C4086t implements C0657w {
    public final /* synthetic */ boolean[] f20455a;
    public final /* synthetic */ CountDownLatch f20456b;

    C4086t(boolean[] zArr, CountDownLatch countDownLatch) {
        this.f20455a = zArr;
        this.f20456b = countDownLatch;
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21660a(volleyError, "Error while getting bulk details.", new Object[0]);
        this.f20455a[0] = false;
        this.f20456b.countDown();
    }
}
