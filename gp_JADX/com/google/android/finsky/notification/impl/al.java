package com.google.android.finsky.notification.impl;

import com.google.android.finsky.ak.C1215q;
import com.google.android.finsky.p108z.C2919a;
import com.google.android.finsky.p108z.C4809e;

final class al implements C2919a {
    public final /* synthetic */ af f19021a;

    al(af afVar) {
        this.f19021a = afVar;
    }

    public final /* synthetic */ C4809e mo3198a(Object obj) {
        Long l = (Long) obj;
        af afVar = this.f19021a;
        return afVar.f19014c.mo1523b(new C1215q().m7197b("timestamp", Long.valueOf(af.m18084b()))).mo4396a(new an(afVar)).mo4397a(new am(this, l));
    }
}
