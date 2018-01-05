package com.google.android.finsky.bz;

import com.google.android.finsky.d.w;
import com.google.android.finsky.updatechecker.b;
import com.google.android.finsky.updatechecker.d;

public final class com.google.android.finsky.bz.e implements Runnable
{

    public final com.google.android.finsky.bz.c a;
    public final com.google.android.finsky.d.w b;

    e(com.google.android.finsky.bz.c p0, com.google.android.finsky.d.w p1) {
        this.a = p0;
        this.b = p1;
    }

    public final void run() {
        this.a.c.b().a(new com.google.android.finsky.bz.f(this.a), 1, -1, this.b);
    }

}
