package com.google.android.finsky.activities.myapps;

import android.os.AsyncTask;
import com.android.volley.w;
import com.android.volley.x;
import com.google.android.finsky.api.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.o.c;
import com.google.wireless.android.finsky.dfe.a.a.l;
import com.google.wireless.android.finsky.dfe.b.a.a.a;

protected final class com.google.android.finsky.activities.myapps.v extends AsyncTask
{

    public final com.google.android.finsky.api.c a;
    public final com.google.android.finsky.o.c b;
    public final com.google.android.finsky.d.w c;
    public final String d;
    public final com.android.volley.x e;
    public final com.android.volley.w f;

    v(com.google.android.finsky.api.c p0, com.google.android.finsky.o.c p1, com.google.android.finsky.d.w p2, String p3, com.android.volley.x p4, com.android.volley.w p5) {
        AsyncTask();
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        this.e = p4;
        this.f = p5;
    }

    private final com.google.wireless.android.finsky.dfe.b.a.a.a a() {
        try {
            v0 = this.b.a(this.c);
        }
        catch (InterruptedException ex) {
            v0 = new com.google.wireless.android.finsky.dfe.b.a.a.a();
        }
        return v0;
    }

    protected final Object doInBackground(Object[] p0) {
        return this.a();
    }

    protected final void onPostExecute(Object p0) {
        v0 = new com.google.wireless.android.finsky.dfe.a.a.l();
        v0.a = (com.google.wireless.android.finsky.dfe.b.a.a.a)p0;
        this.a.a(this.d, v0, this.e, this.f);
    }

}
