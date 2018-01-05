package com.google.android.instantapps.common.gms;

import android.os.Trace;
import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.instantapps.C5264c;

final /* synthetic */ class C5789o implements C1643x {
    public final C5788n f29232a;
    public final C1643x f29233b;

    C5789o(C5788n c5788n, C1643x c1643x) {
        this.f29232a = c5788n;
        this.f29233b = c1643x;
    }

    public final void mo2367a(C4980w c4980w) {
        C5788n c5788n = this.f29232a;
        C1643x c1643x = this.f29233b;
        C5264c c5264c = (C5264c) c4980w;
        Trace.endSection();
        c5788n.f29231c.f29223a.execute(new C5791q(c1643x, c5264c));
    }
}
