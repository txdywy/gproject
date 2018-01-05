package com.google.android.finsky.b;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.finsky.d.w;

protected final class com.google.android.finsky.b.h extends AsyncTask
{

    public final com.google.android.finsky.d.w a;
    public final Context b;
    public final String c;
    public final int d;
    public final int e;
    public final com.google.android.finsky.b.f f;

    h(com.google.android.finsky.b.f p0, com.google.android.finsky.d.w p1, Context p2, String p3, int p4, int p5) {
        this.f = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        AsyncTask();
    }

    protected final Object doInBackground(Object[] p0) {
        this.f.a(this.a, this.b, this.c, this.d, this.e);
        return 0;
    }

}
