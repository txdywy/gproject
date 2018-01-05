package com.google.android.gms.internal;

import com.google.android.gms.ads.p239b.C4892a;
import com.google.android.gms.ads.p239b.C4893b;
import java.io.IOException;

public final class kq extends nd {
    public kq(jp jpVar, String str, String str2, ci ciVar, int i) {
        super(jpVar, str, str2, ciVar, i, 24);
    }

    public final Void mo4791b() {
        if (this.d.f27087q) {
            return super.mo4791b();
        }
        if (this.d.f27084n) {
            m25065c();
        }
        return null;
    }

    public final /* synthetic */ Object call() {
        return mo4791b();
    }

    protected final void mo4764a() {
        if (this.d.f27084n) {
            m25065c();
            return;
        }
        synchronized (this.g) {
            this.g.ab = (String) this.h.invoke(null, new Object[]{this.d.f27073c});
        }
    }

    private final void m25065c() {
        C4892a a = this.d.m24976a();
        if (a != null) {
            try {
                C4893b a2 = a.m22915a();
                String a3 = ju.m24986a(a2.f25246a);
                if (a3 != null) {
                    synchronized (this.g) {
                        this.g.ab = a3;
                        this.g.ad = Boolean.valueOf(a2.f25247b);
                        this.g.ac = Integer.valueOf(5);
                    }
                }
            } catch (IOException e) {
            }
        }
    }
}
