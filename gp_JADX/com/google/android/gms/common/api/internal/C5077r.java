package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C5053a;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.ax;
import java.lang.ref.WeakReference;

final class C5077r implements ax {
    public final WeakReference f25899a;
    public final C5053a f25900b;
    public final boolean f25901c;

    public C5077r(C5075p c5075p, C5053a c5053a, boolean z) {
        this.f25899a = new WeakReference(c5075p);
        this.f25900b = c5053a;
        this.f25901c = z;
    }

    public final void mo4580a(ConnectionResult connectionResult) {
        boolean z = false;
        C5075p c5075p = (C5075p) this.f25899a.get();
        if (c5075p != null) {
            if (Looper.myLooper() == c5075p.f25878a.f25692n.mo4555c()) {
                z = true;
            }
            am.m23739a(z, (Object) "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            c5075p.f25879b.lock();
            try {
                if (c5075p.m23630b(0)) {
                    if (!connectionResult.m23264b()) {
                        c5075p.m23628b(connectionResult, this.f25900b, this.f25901c);
                    }
                    if (c5075p.m23632d()) {
                        c5075p.m23633e();
                    }
                    c5075p.f25879b.unlock();
                }
            } finally {
                c5075p.f25879b.unlock();
            }
        }
    }
}
