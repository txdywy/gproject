package com.google.android.finsky.billing.profile;

import com.google.android.finsky.p111d.C2488p;
import com.google.wireless.android.finsky.dfe.nano.v;

final class C2054i implements Runnable {
    public final /* synthetic */ v f10557a;
    public final /* synthetic */ C2048c f10558b;

    C2054i(C2048c c2048c, v vVar) {
        this.f10558b = c2048c;
        this.f10557a = vVar;
    }

    public final void run() {
        this.f10558b.af.m13370a(new C2488p().m13345b(this.f10558b).m13340a(C2048c.m10786b(this.f10557a.d)));
    }
}
