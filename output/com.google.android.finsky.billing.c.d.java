package com.google.android.finsky.billing.c;

import android.os.AsyncTask;
import com.google.android.finsky.billing.e.k;

protected final class com.google.android.finsky.billing.c.d extends AsyncTask
{

    public final com.google.android.finsky.billing.c.b a;

    d(com.google.android.finsky.billing.c.b p0) {
        this.a = p0;
        AsyncTask();
    }

    protected final Object doInBackground(Object[] p0) {
        if (this.a.j == 2)
            v0 = 1;
        else
            v0 = 0;
        this.a.a.a(this.a.b, v0, "prefetch");
        return 0;
    }

}
