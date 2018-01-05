package com.google.android.finsky.billing.legacyauth;

import android.os.AsyncTask;
import com.google.android.finsky.billing.e.k;
import com.google.android.finsky.billing.e.l;

protected final class com.google.android.finsky.billing.legacyauth.c extends AsyncTask
{

    public final com.google.android.finsky.billing.legacyauth.i a;
    public final boolean b;
    public final com.google.android.finsky.billing.legacyauth.a c;

    c(com.google.android.finsky.billing.legacyauth.a p0, com.google.android.finsky.billing.legacyauth.i p1, boolean p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
        AsyncTask();
    }

    protected final Object doInBackground(Object[] p0) {
        if (this.isCancelled())
            v0 = 0;
        else
            v0 = this.c.b.b(this.c.a);
        return v0;
    }

    protected final void onPostExecute(Object p0) {
        this.c.a(this.a, (com.google.android.finsky.billing.e.l)p0, this.b);
    }

}
