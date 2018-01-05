package com.google.android.finsky.stream.myapps;

import com.google.android.finsky.cv.p177a.ie;
import com.google.android.finsky.dk.C2826c;
import com.google.android.finsky.dk.C2829f;
import com.google.android.finsky.utils.an;

final class ac implements C2829f, ad {
    public final long f23217a;
    public final long f23218b;
    public final C2826c f23219c;
    public C4549n f23220d;

    ac(ie ieVar, C2826c c2826c) {
        long a;
        Object obj;
        if (((ieVar.f12649a & 1) != 0 ? 1 : null) != null) {
            a = ((long) ieVar.f12650b) * an.f24040c.mo4319a(1);
        } else {
            a = 0;
        }
        this.f23217a = a;
        if ((ieVar.f12649a & 2) != 0) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj != null) {
            a = ((long) ieVar.f12651c) * an.f24040c.mo4319a(1);
        } else {
            a = Long.MAX_VALUE;
        }
        this.f23218b = a;
        this.f23219c = c2826c;
        this.f23219c.m14951a(this);
        this.f23219c.m14955c();
    }

    public final void mo4258a(C4549n c4549n) {
        this.f23220d = c4549n;
    }

    public final boolean mo4259a() {
        long j = this.f23219c.f15205g;
        if (j == -1) {
            return true;
        }
        if (j < this.f23217a || j > this.f23218b) {
            return false;
        }
        return true;
    }

    public final void mo4260b() {
        this.f23219c.m14954b(this);
    }

    public final void cc_() {
        if (this.f23220d != null) {
            this.f23220d.m21163a();
        }
    }
}
