package com.google.android.finsky.cf.a;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.support.design.widget.Snackbar;
import android.support.design.widget.br;
import android.support.design.widget.g;
import android.view.View;
import com.google.android.finsky.cf.b;
import com.google.android.finsky.cg.e;

public final class com.google.android.finsky.cf.a.a implements com.google.android.finsky.cg.f
{

    public Runnable a;
    public final Handler b;
    public final View c;
    public final com.google.android.finsky.cf.a.d d;
    public final com.google.android.finsky.cf.b e;
    public final com.google.android.finsky.cf.a.e f;
    public Snackbar g;

    a(View p0, com.google.android.finsky.cf.a.d p1, com.google.android.finsky.cf.b p2, com.google.android.finsky.cf.a.e p3) {
        this.b = new Handler(Looper.getMainLooper());
        this.c = p0;
        this.d = p1;
        this.e = p2;
        this.f = p3;
    }

    static boolean c(Context p0) {
        v0 = com.google.android.finsky.cg.e.a(p0);
        if (v0 != 0 && v0.isConnected())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final void a() {
        if (this.a != 0) {
            this.b.removeCallbacks(this.a);
            this.a = 0;
        }
        if (this.g != 0 && android.support.design.widget.br.a().c(this.g.j))
            this.g.a(3);
    }

    public final void a(Context p0) {
        this.b(p0);
    }

    public final void b(Context p0) {
        if (com.google.android.finsky.cf.a.a.c(p0))
            this.a();
        else if (this.a == 0) {
            this.a = new com.google.android.finsky.cf.a.b(this, p0, this.c.getResources());
            this.b.postDelayed(this.a, 5000);
        }
    }

}
