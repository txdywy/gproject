package com.google.android.finsky.application;

import com.google.android.finsky.bp.a;
import com.google.android.finsky.m;

public final class com.google.android.finsky.application.dh implements Runnable
{

    public final boolean a;
    public final com.google.android.finsky.application.d b;

    dh(com.google.android.finsky.application.d p0, boolean p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void run() {
        if (this.b.bG().a() && this.a == 0)
            v0 = 1;
        else
            v0 = 0;
        this.b.bG().b(v0);
    }

}
