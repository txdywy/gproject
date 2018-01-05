package com.google.android.finsky.billing.lightpurchase;

import android.os.AsyncTask;
import android.util.Base64;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.iab.w;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.d.w;
import com.google.android.finsky.m;
import com.google.wireless.android.finsky.dfe.nano.er;
import com.google.wireless.android.finsky.dfe.nano.ez;

protected final class com.google.android.finsky.billing.lightpurchase.j extends AsyncTask
{

    public final com.google.android.finsky.d.w a;
    public final com.google.android.finsky.billing.lightpurchase.i b;

    j(com.google.android.finsky.billing.lightpurchase.i p0, com.google.android.finsky.d.w p1) {
        this.b = p0;
        this.a = p1;
        AsyncTask();
    }

    protected final Object doInBackground(Object[] p0) {
        if (this.b.au == 0)
            this.b.au = new com.google.android.finsky.billing.lightpurchase.u();
        v0 = com.google.android.finsky.billing.lightpurchase.u.a(com.google.android.finsky.m.a.b, this.b.e.n.c, com.google.android.finsky.billing.iab.w.a(this.b.e.a.b), this.b.g.h, this.a.a());
        if (v0 == 0)
            v0 = 0;
        else
            v0 = Base64.encodeToString(v0, 10);
        return v0;
    }

    protected final void onPostExecute(Object p0) {
        if (!this.isCancelled())
            this.b.at = (String)p0;
    }

}
