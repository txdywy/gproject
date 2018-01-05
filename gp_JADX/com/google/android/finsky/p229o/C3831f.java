package com.google.android.finsky.p229o;

import com.google.android.finsky.p167r.C3960a;
import com.google.wireless.android.finsky.dfe.b.a.b.a.a;

final class C3831f implements C3826a {
    public final C3960a f19186a;
    public a f19187b = new a();

    C3831f(C3960a c3960a) {
        this.f19186a = c3960a;
    }

    public final int mo3813a() {
        return 1;
    }

    public final boolean mo3815b() {
        a aVar = this.f19187b;
        boolean a = this.f19186a.m18668a();
        aVar.a |= 1;
        aVar.b = a;
        return !this.f19186a.m18670c();
    }

    public final void mo3814a(com.google.wireless.android.finsky.dfe.b.a.a.a aVar) {
        aVar.a = this.f19187b;
    }
}
