package com.google.android.instantapps.common.gms;

import android.os.Trace;
import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.common.api.Status;

final /* synthetic */ class C5786l implements C1643x {
    public final C5785k f29225a;
    public final C1643x f29226b;

    C5786l(C5785k c5785k, C1643x c1643x) {
        this.f29225a = c5785k;
        this.f29226b = c1643x;
    }

    public final void mo2367a(C4980w c4980w) {
        C5785k c5785k = this.f29225a;
        C1643x c1643x = this.f29226b;
        Status status = (Status) c4980w;
        Trace.endSection();
        c5785k.f29223a.execute(new C5787m(c1643x, status));
    }
}
