package com.google.android.finsky.scheduler;

import com.google.android.finsky.ak.C1215q;
import com.google.android.finsky.p108z.C2919a;
import com.google.android.finsky.p108z.C4809e;

final /* synthetic */ class ap implements C2919a {
    public final ak f20220a;
    public final int f20221b;
    public final int f20222c;

    ap(ak akVar, int i, int i2) {
        this.f20220a = akVar;
        this.f20221b = i;
        this.f20222c = i2;
    }

    public final C4809e mo3198a(Object obj) {
        ak akVar = this.f20220a;
        return akVar.f20202c.f20194a.mo1525c(new C1215q("pk", Long.valueOf(aa.m18791a(this.f20221b, this.f20222c))).m7191a("is_running", Integer.valueOf(0))).mo4397a(new ar(akVar));
    }
}
