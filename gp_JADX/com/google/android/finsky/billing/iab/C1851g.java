package com.google.android.finsky.billing.iab;

import android.os.Bundle;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import java.util.concurrent.Semaphore;

final class C1851g implements C0657w {
    public final /* synthetic */ Bundle f9521a;
    public final /* synthetic */ boolean f9522b;
    public final /* synthetic */ String f9523c;
    public final /* synthetic */ String f9524d;
    public final /* synthetic */ Semaphore f9525e;
    public final /* synthetic */ C1849e f9526f;

    C1851g(C1849e c1849e, Bundle bundle, boolean z, String str, String str2, Semaphore semaphore) {
        this.f9526f = c1849e;
        this.f9521a = bundle;
        this.f9522b = z;
        this.f9523c = str;
        this.f9524d = str2;
        this.f9525e = semaphore;
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f9521a.putInt("RESPONSE_CODE", C1868x.RESULT_ERROR.f9566l);
        if (this.f9522b) {
            this.f9526f.m9945a(this.f9521a, this.f9523c, (Throwable) volleyError, C1849e.m9927a(volleyError), this.f9524d);
        }
        this.f9525e.release();
    }
}
