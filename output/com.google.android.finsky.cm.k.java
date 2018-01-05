package com.google.android.finsky.cm;

import android.os.Handler;

public final class com.google.android.finsky.cm.k implements Runnable
{

    public final Runnable a;
    public final com.google.android.finsky.cm.e b;

    k(com.google.android.finsky.cm.e p0, Runnable p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void run() {
        this.b.f.post(this.a);
    }

}
