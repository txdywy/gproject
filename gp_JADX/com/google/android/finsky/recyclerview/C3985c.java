package com.google.android.finsky.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.fe;

final class C3985c extends fe {
    public final /* synthetic */ C2575b f20077a;

    C3985c(C2575b c2575b) {
        this.f20077a = c2575b;
    }

    public final void mo2913a(RecyclerView recyclerView, int i) {
        boolean z = true;
        if (this.f20077a.mo2964u() && !this.f20077a.aU) {
            if (i != 2) {
                this.f20077a.m13611a(true, true);
            }
            if (i != 0) {
                z = false;
            }
            if (z && !this.f20077a.aM) {
                this.f20077a.b_(this.f20077a.aO, 0);
            }
            this.f20077a.aM = z;
            if (z) {
                this.f20077a.mo2965v();
            }
            super.mo2913a(recyclerView, i);
        }
    }
}
