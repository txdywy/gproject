package com.google.android.instantapps.common.gms;

import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.common.api.Status;

final /* synthetic */ class C5800z implements C1643x {
    public final C5799y f29255a;
    public final C1643x f29256b;

    C5800z(C5799y c5799y, C1643x c1643x) {
        this.f29255a = c5799y;
        this.f29256b = c1643x;
    }

    public final void mo2367a(C4980w c4980w) {
        this.f29255a.f29254c.f29223a.execute(new ab(this.f29256b, (Status) c4980w));
    }
}
