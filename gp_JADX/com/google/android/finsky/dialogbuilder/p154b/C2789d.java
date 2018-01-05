package com.google.android.finsky.dialogbuilder.p154b;

import android.os.Handler;
import com.google.android.finsky.dialogbuilder.C2794b;
import com.google.wireless.android.finsky.dfe.c.a.bx;

public final class C2789d {
    public final Handler f15084a;
    public final Runnable f15085b = new C2790e(this);
    public C2794b f15086c;
    public bx f15087d;

    public C2789d(Handler handler) {
        this.f15084a = handler;
    }

    public final void m14866a() {
        this.f15084a.removeCallbacks(this.f15085b);
        this.f15087d = null;
    }
}
