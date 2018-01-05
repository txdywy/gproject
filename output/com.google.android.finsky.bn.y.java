package com.google.android.finsky.bn;

import com.google.android.finsky.cv.a.n;

public final class com.google.android.finsky.bn.y implements Runnable
{

    public final String a;
    public final com.google.android.finsky.cv.a.n b;
    public final com.google.android.finsky.bn.h c;

    y(com.google.android.finsky.bn.h p0, String p1, com.google.android.finsky.cv.a.n p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void run() {
        this.c.b.a(this.a, this.b);
    }

}
