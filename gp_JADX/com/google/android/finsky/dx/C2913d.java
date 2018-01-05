package com.google.android.finsky.dx;

import android.os.Handler;
import android.os.Looper;
import android.support.v4.p037h.C0313h;
import com.google.android.finsky.ba.C1549f;

public final class C2913d implements C1549f {
    public final /* synthetic */ C2910a f15478a;

    public C2913d(C2910a c2910a) {
        this.f15478a = c2910a;
    }

    public final void mo2287a(boolean z) {
    }

    public final void mo2286a(C0313h c0313h, C0313h c0313h2) {
        String cZ = this.f15478a.f15467d.cZ();
        if (cZ != null) {
            for (long j : C2910a.f15464b) {
                if (c0313h.m1690c(j) >= 0 || c0313h2.m1690c(j) >= 0) {
                    new Handler(Looper.getMainLooper()).post(new C2914e(this, cZ));
                    return;
                }
            }
        }
    }
}
