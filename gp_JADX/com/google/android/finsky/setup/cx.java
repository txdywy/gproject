package com.google.android.finsky.setup;

import com.google.android.finsky.C1473m;
import com.google.android.finsky.cv.p177a.bd;
import java.util.List;

final class cx implements Runnable {
    public final /* synthetic */ int f20964a;
    public final /* synthetic */ List f20965b;
    public final /* synthetic */ VpaDetailsActivity f20966c;

    cx(VpaDetailsActivity vpaDetailsActivity, int i, List list) {
        this.f20966c = vpaDetailsActivity;
        this.f20964a = i;
        this.f20965b = list;
    }

    public final void run() {
        for (int i = 0; i < this.f20964a; i++) {
            bd bdVar = (bd) this.f20965b.get(i);
            C1473m.f7980a.ar().m9288a(this.f20966c.f20671p[i], bdVar.f11860f, bdVar.f11863i);
            this.f20966c.f20671p[i].setVisibility(0);
        }
    }
}
