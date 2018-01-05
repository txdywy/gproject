package com.google.android.finsky.billing;

import com.android.volley.VolleyError;
import com.google.android.finsky.dp.C1096g;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.gp;
import java.util.concurrent.Semaphore;

final class C1778b implements C1096g {
    public final /* synthetic */ Semaphore f9204a;
    public final /* synthetic */ int[] f9205b;

    C1778b(Semaphore semaphore, int[] iArr) {
        this.f9204a = semaphore;
        this.f9205b = iArr;
    }

    public final void mo1427a(gp gpVar) {
        this.f9204a.release();
    }

    public final void mo1426a(VolleyError volleyError) {
        FinskyLog.m21667d("Error while loading toc: %s", volleyError);
        this.f9205b[0] = BillingAccountService.m9349a((Throwable) volleyError);
        this.f9204a.release();
    }
}
