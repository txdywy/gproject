package com.google.android.finsky.billing.legacyauth;

import android.os.AsyncTask;
import com.google.android.finsky.billing.e.k;

protected final class com.google.android.finsky.billing.legacyauth.d extends AsyncTask
{

    public final com.google.android.finsky.billing.legacyauth.l a;
    public final com.google.android.finsky.billing.legacyauth.a b;

    d(com.google.android.finsky.billing.legacyauth.a p0, com.google.android.finsky.billing.legacyauth.l p1) {
        this.b = p0;
        this.a = p1;
        AsyncTask();
    }

    protected final Object doInBackground(Object[] p0) {
        return this.b.b.a(this.b.b.c(this.b.a), "phone");
    }

    protected final void onPostExecute(Object p0) {
        if ((String)p0 == 0)
            this.a.c();
        else if (((String)p0).isEmpty())
            this.a.b();
        else
            this.a.a((String)p0);
    }

}
