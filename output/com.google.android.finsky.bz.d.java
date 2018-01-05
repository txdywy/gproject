package com.google.android.finsky.bz;

import com.google.android.finsky.bh.b;
import com.google.android.finsky.d.w;

public final class com.google.android.finsky.bz.d implements Runnable
{

    public final com.google.android.finsky.bz.c a;
    public final com.google.android.finsky.d.w b;

    d(com.google.android.finsky.bz.c p0, com.google.android.finsky.d.w p1) {
        this.a = p0;
        this.b = p1;
    }

    public final void run() {
        this.a.e.a(new com.google.android.finsky.bz.e(this.a, this.b));
    }

}
