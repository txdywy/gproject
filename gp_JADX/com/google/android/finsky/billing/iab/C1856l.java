package com.google.android.finsky.billing.iab;

import android.os.Bundle;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import java.util.concurrent.Semaphore;

final class C1856l implements C0657w {
    public final /* synthetic */ Bundle f9539a;
    public final /* synthetic */ Semaphore f9540b;

    C1856l(Bundle bundle, Semaphore semaphore) {
        this.f9539a = bundle;
        this.f9540b = semaphore;
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f9539a.putInt("RESPONSE_CODE", C1868x.RESULT_ERROR.f9566l);
        this.f9540b.release();
    }
}
