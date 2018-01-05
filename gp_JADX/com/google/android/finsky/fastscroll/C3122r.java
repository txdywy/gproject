package com.google.android.finsky.fastscroll;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.fe;

final class C3122r extends fe {
    public final /* synthetic */ C3119o f16106a;

    C3122r(C3119o c3119o) {
        this.f16106a = c3119o;
    }

    public final void mo2913a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            this.f16106a.f16096q = 0;
        }
    }

    public final void mo791a(RecyclerView recyclerView, int i, int i2) {
        C3119o c3119o = this.f16106a;
        c3119o.f16096q = Math.abs(i2) + c3119o.f16096q;
        if (this.f16106a.f16096q >= this.f16106a.f16091l) {
            this.f16106a.m15976b();
            if (this.f16106a.f16102w != null && this.f16106a.f16102w.mo3316a() && this.f16106a.f16097r != 2) {
                this.f16106a.m15972a(1);
            }
        }
    }
}
