package com.google.android.finsky.ct;

import android.content.Context;
import android.os.AsyncTask;

protected final class com.google.android.finsky.ct.b extends AsyncTask
{

    public final Context a;
    public final Runnable b;
    public final com.google.android.finsky.ct.a c;

    b(com.google.android.finsky.ct.a p0, Context p1, Runnable p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
        AsyncTask();
    }

    protected final Object doInBackground(Object[] p0) {
        this.c.b(this.a);
        return 0;
    }

    protected final void onPostExecute(Object p0) {
        if (this.b != 0)
            this.b.run();
    }

}
