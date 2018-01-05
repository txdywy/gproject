package com.google.android.finsky.ca;

import android.os.AsyncTask;
import com.google.android.finsky.l.a;
import java.util.Iterator;
import java.util.Map;
import java.util.Map$Entry;
import java.util.Set;

protected final class com.google.android.finsky.ca.d extends AsyncTask
{

    public final boolean a;
    public final com.google.android.finsky.ca.c b;

    d(com.google.android.finsky.ca.c p0, boolean p1) {
        this.b = p0;
        this.a = p1;
        AsyncTask();
    }

    protected final Object doInBackground(Object[] p0) {
        return this.b.b.a(this.b.a, 1);
    }

    protected final void onPostExecute(Object p0) {
        v4 = ((Map)p0).entrySet().iterator();
        while (v4.hasNext()) {
            v0 = (Map$Entry)v4.next();
            v1 = (String)v0.getKey();
            v0 = (Set)v0.getValue();
            v5 = new dj[v0.size()];
            v2 = 0;
            v6 = v0.iterator();
            while (v6.hasNext()) {
                v5[v2] = this.b.a((String)v6.next(), v1);
                v2 = v2 + 1;
            }
            if (this.a != 0)
                this.b.a(v5, v1, 0);
            else
                this.b.b(v5, v1, 0);
        }
    }

}
