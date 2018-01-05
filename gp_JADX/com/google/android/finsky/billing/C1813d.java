package com.google.android.finsky.billing;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.Semaphore;

final class C1813d implements C0657w {
    public final /* synthetic */ int[] f9369a;
    public final /* synthetic */ Semaphore f9370b;

    C1813d(int[] iArr, Semaphore semaphore) {
        this.f9369a = iArr;
        this.f9370b = semaphore;
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21665c("Received error: %s", volleyError);
        this.f9369a[0] = BillingAccountService.m9349a((Throwable) volleyError);
        this.f9370b.release();
    }
}
