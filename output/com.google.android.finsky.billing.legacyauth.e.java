package com.google.android.finsky.billing.legacyauth;

import android.os.AsyncTask;
import com.google.android.finsky.billing.e.k;

protected final class com.google.android.finsky.billing.legacyauth.e extends AsyncTask
{

    public final boolean a;
    public final com.google.android.finsky.billing.legacyauth.a b;

    e(com.google.android.finsky.billing.legacyauth.a p0, boolean p1) {
        this.b = p0;
        this.a = p1;
        AsyncTask();
    }

    protected final Object doInBackground(Object[] p0) {
        if (!this.isCancelled())
            this.b.b.a(this.b.a, this.a, "prefetch");
        return 0;
    }

}
