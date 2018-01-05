package com.google.android.finsky.c.a;

import android.os.AsyncTask;

protected final class com.google.android.finsky.c.a.c extends AsyncTask
{

    public final int a;
    public final com.google.android.finsky.c.a.a b;

    c(com.google.android.finsky.c.a.a p0, int p1) {
        this.b = p0;
        this.a = p1;
        AsyncTask();
    }

    protected final Object doInBackground(Object[] p0) {
        this.b.b(this.a);
        return 0;
    }

}
