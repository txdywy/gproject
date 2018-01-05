package com.google.android.finsky.billing.legacyauth;

import android.os.AsyncTask;
import com.google.android.finsky.billing.e.k;
import com.google.android.finsky.billing.e.r;

protected final class com.google.android.finsky.billing.legacyauth.b extends AsyncTask
{

    public final String a;
    public final boolean b;
    public final String c;
    public final com.google.android.finsky.billing.legacyauth.g d;
    public final com.google.android.finsky.billing.legacyauth.a e;

    b(com.google.android.finsky.billing.legacyauth.a p0, String p1, boolean p2, String p3, com.google.android.finsky.billing.legacyauth.g p4) {
        this.e = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        AsyncTask();
    }

    protected final Object doInBackground(Object[] p0) {
        return this.e.b.a(this.e.a, this.a, this.b, this.c);
    }

    protected final void onPostExecute(Object p0) {
        if ((com.google.android.finsky.billing.e.r)p0 == 0)
            v0 = 900;
        else
            v0 = ((com.google.android.finsky.billing.e.r)p0).a;
        if (v0 == 0)
            this.d.a(((com.google.android.finsky.billing.e.r)p0).b);
        else
            this.d.a(v0);
    }

}
