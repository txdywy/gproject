package com.google.android.finsky.scheduler;

import com.google.android.finsky.p108z.C2919a;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.scheduler.p238b.C4026d;

final /* synthetic */ class am implements C2919a {
    public final ak f20213a;
    public final C4026d f20214b;

    am(ak akVar, C4026d c4026d) {
        this.f20213a = akVar;
        this.f20214b = c4026d;
    }

    public final C4809e mo3198a(Object obj) {
        ak akVar = this.f20213a;
        Object obj2 = this.f20214b;
        C4809e b = akVar.f20202c.f20194a.mo1524b(obj2);
        b.mo4398a(new as(akVar, obj2));
        return b;
    }
}
