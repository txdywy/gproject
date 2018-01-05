package com.google.android.finsky.activities;

import android.view.ViewGroup;
import com.google.android.finsky.bg.C1060p;

final class en extends C1060p {
    public final /* synthetic */ boolean f6766a;
    public final /* synthetic */ ek f6767b;

    en(ek ekVar, ViewGroup viewGroup, boolean z) {
        this.f6767b = ekVar;
        this.f6766a = z;
        super(viewGroup);
    }

    public final void onGlobalLayout() {
        ek ekVar = this.f6767b;
        if (ekVar.f6734N) {
            ekVar.f6733M.mo1393b(1734, ekVar.f6732L, null, true);
        }
        if (this.f6766a) {
            if (this.f6767b.f6741f.dj().mo2294a(12636210)) {
                this.f6767b.m6528a(1704);
            } else if (this.f6767b.f6743h.m13357b()) {
                this.f6767b.f6727G.mo1293j(1704);
            }
        }
        if (this.f6767b.f6755t != null) {
            this.f6767b.f6755t.mo1255B();
        }
        super.m6486a();
    }
}
