package com.google.android.finsky.bn;

import com.google.wireless.android.finsky.b.a;

public final class com.google.android.finsky.bn.af implements Runnable
{

    public final String a;
    public final com.google.wireless.android.finsky.b.a b;
    public final long c;
    public final com.google.android.finsky.bn.h d;

    af(com.google.android.finsky.bn.h p0, String p1, com.google.wireless.android.finsky.b.a p2, long p3) {
        this.d = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
    }

    public final void run() {
        this.d.b.a(this.a, this.b, this.c);
    }

}
