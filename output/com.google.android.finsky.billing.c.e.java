package com.google.android.finsky.billing.c;

import android.os.AsyncTask;
import com.google.android.finsky.billing.e.k;
import com.google.android.finsky.billing.e.l;

protected final class com.google.android.finsky.billing.c.e extends AsyncTask
{

    public final boolean a;
    public final Runnable b;
    public final com.google.android.finsky.billing.c.b c;

    e(com.google.android.finsky.billing.c.b p0, boolean p1, Runnable p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
        AsyncTask();
    }

    protected final Object doInBackground(Object[] p0) {
        return this.c.a.b(this.c.b);
    }

    protected final void onPostExecute(Object p0) {
        this.c.a((com.google.android.finsky.billing.e.l)p0, this.a);
        this.b.run();
    }

}
