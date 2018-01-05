package com.google.android.finsky.bn;

public final class com.google.android.finsky.bn.q implements Runnable
{

    public final com.google.android.finsky.bn.c a;
    public final com.google.android.finsky.bn.h b;

    q(com.google.android.finsky.bn.h p0, com.google.android.finsky.bn.c p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void run() {
        this.b.b.a(this.a);
    }

}
