package com.google.android.finsky.cr;

import android.os.Handler;

public final class com.google.android.finsky.cr.f implements Runnable
{

    public final com.google.android.finsky.cr.c a;

    f(com.google.android.finsky.cr.c p0) {
        this.a = p0;
    }

    public final void run() {
        this.a.e.post(new com.google.android.finsky.cr.g(this, this.a.a.a()));
    }

}
