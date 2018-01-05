package com.google.android.finsky.services;

import com.android.volley.VolleyError;
import com.google.android.finsky.de.C2496e;
import com.google.wireless.android.finsky.dfe.nano.gb;
import java.util.concurrent.CountDownLatch;

final class C4084r implements C2496e {
    public final /* synthetic */ gb[] f20448a;
    public final /* synthetic */ CountDownLatch f20449b;

    C4084r(gb[] gbVarArr, CountDownLatch countDownLatch) {
        this.f20448a = gbVarArr;
        this.f20449b = countDownLatch;
    }

    public final void mo2920a(gb gbVar) {
        this.f20448a[0] = gbVar;
        this.f20449b.countDown();
    }

    public final void mo2919a(VolleyError volleyError) {
        this.f20449b.countDown();
    }
}
