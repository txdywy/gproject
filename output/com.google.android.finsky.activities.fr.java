package com.google.android.finsky.activities;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.widget.em;
import android.support.v7.widget.ff;
import android.support.v7.widget.fr;
import com.google.android.finsky.bg.d;
import com.google.android.finsky.stream.base.playcluster.PlayClusterViewContentV2;
import com.google.android.finsky.utils.FinskyLog;

protected final class com.google.android.finsky.activities.fr extends AsyncTask
{

    public final android.support.v7.widget.ff a;
    public final Context b;
    public PlayClusterViewContentV2 c;

    fr(Context p0, android.support.v7.widget.ff p1) {
        AsyncTask();
        this.a = p1;
        this.b = p0;
    }

    private final Void a(Integer[] p0) {
        if (p0 == 0 || p0.length == 0 || p0.length % 2)
            FinskyLog.e("Wrong PreInflateAsyncTask params, an even number of params is expected", new Object[0]);
        FinskyLog.b("Starting preinflation", new Object[0]);
        v0 = 0;
        while (v0 < p0.length) {
            v3 = p0[v0].intValue();
            v4 = v0 + 1;
            v5 = p0[v4].intValue();
            v0 = 0;
            while (v0 < v5 && this.a.a(v3) < v5 && !this.isCancelled()) {
                try {
                    v6 = new com.google.android.finsky.activities.fs(com.google.android.finsky.bg.d.a(this.b)).b(this.c, v3);
                    if (v6.a != 0)
                        this.a.a(v6);
                }
                catch (RuntimeException ex) {
                }
                v0 = v0 + 1;
            }
            v0 = v4 + 1;
        }
        return 0;
    }

    protected final Object doInBackground(Object[] p0) {
        return this.a((Integer[])p0);
    }

    protected final void onPreExecute() {
        super.onPreExecute();
        this.c = new PlayClusterViewContentV2(this.b);
    }

}
