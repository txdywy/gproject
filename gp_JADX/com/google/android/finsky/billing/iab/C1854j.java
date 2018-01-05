package com.google.android.finsky.billing.iab;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.Semaphore;

final class C1854j implements C0657w {
    public final /* synthetic */ C1868x[] f9533a;
    public final /* synthetic */ String f9534b;
    public final /* synthetic */ Semaphore f9535c;
    public final /* synthetic */ C1849e f9536d;

    C1854j(C1849e c1849e, C1868x[] c1868xArr, String str, Semaphore semaphore) {
        this.f9536d = c1849e;
        this.f9533a = c1868xArr;
        this.f9534b = str;
        this.f9535c = semaphore;
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21665c("Error response on confirmPurchase: %s", volleyError.toString());
        this.f9533a[0] = C1868x.RESULT_ERROR;
        this.f9536d.m9947a(this.f9533a[0], this.f9534b, (Throwable) volleyError, C1849e.m9927a(volleyError));
        this.f9535c.release();
    }
}
