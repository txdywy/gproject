package com.google.android.finsky.ac;

import com.google.android.finsky.by.C2199l;
import com.google.android.finsky.packagemanager.C3851f;
import com.google.android.finsky.scheduler.ba;
import com.google.android.finsky.scheduler.bb;

public final class C0977e {
    public ba f5958a;
    public final C2199l f5959b;
    public final bb f5960c;
    public final C3851f f5961d;

    public C0977e(bb bbVar, C2199l c2199l, C3851f c3851f) {
        this.f5960c = bbVar;
        this.f5959b = c2199l;
        this.f5961d = c3851f;
    }

    public final void m5816a() {
        if (this.f5958a == null) {
            this.f5958a = this.f5960c.m18890a(12);
        }
        ba baVar = this.f5958a;
        baVar.f20259a.m18816b(baVar.f20261c).mo4398a(new C0979f(this));
    }
}
