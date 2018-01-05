package com.google.android.finsky.billing.p153c;

import android.os.AsyncTask;
import android.util.Base64;
import com.google.android.finsky.billing.common.C1802r;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.wireless.android.finsky.dfe.c.a.ef;

final class C1785i extends AsyncTask {
    public final /* synthetic */ ef f9239a;
    public final /* synthetic */ C1784h f9240b;

    C1785i(C1784h c1784h, ef efVar) {
        this.f9240b = c1784h;
        this.f9239a = efVar;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        byte[] bArr = (byte[]) obj;
        if (!isCancelled() && bArr != null) {
            this.f9240b.f9238d = Base64.encodeToString(bArr, 10);
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        C1784h c1784h = this.f9240b;
        if (c1784h.f9236b == null) {
            c1784h.f9236b = AppMeasurement.getInstance(c1784h.f9235a);
        }
        return c1784h.f9236b.m26062a(this.f9239a.c, this.f9239a.b, C1802r.m9801a(this.f9239a.e));
    }
}
