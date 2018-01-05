package com.google.android.finsky.billing.c;

import android.os.AsyncTask;
import android.util.Base64;
import com.google.android.finsky.billing.common.r;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.wireless.android.finsky.dfe.c.a.ef;

protected final class com.google.android.finsky.billing.c.i extends AsyncTask
{

    public final com.google.wireless.android.finsky.dfe.c.a.ef a;
    public final com.google.android.finsky.billing.c.h b;

    i(com.google.android.finsky.billing.c.h p0, com.google.wireless.android.finsky.dfe.c.a.ef p1) {
        this.b = p0;
        this.a = p1;
        AsyncTask();
    }

    protected final Object doInBackground(Object[] p0) {
        if (this.b.b == 0)
            this.b.b = AppMeasurement.getInstance(this.b.a);
        return this.b.b.a(this.a.c, this.a.b, com.google.android.finsky.billing.common.r.a(this.a.e));
    }

    protected final void onPostExecute(Object p0) {
        if (!this.isCancelled() && (byte[])p0 != 0)
            this.b.d = Base64.encodeToString((byte[])p0, 10);
    }

}
