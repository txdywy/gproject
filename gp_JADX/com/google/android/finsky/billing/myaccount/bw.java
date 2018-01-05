package com.google.android.finsky.billing.myaccount;

import com.android.volley.C0660x;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.p111d.C2495w;
import com.google.wireless.android.finsky.dfe.h.a.i;

final class bw implements C0660x {
    public final C2495w f10280a;
    public final /* synthetic */ bu f10281b;

    public bw(bu buVar, C2495w c2495w) {
        this.f10281b = buVar;
        this.f10280a = c2495w;
    }

    public final /* synthetic */ void b_(Object obj) {
        i iVar = (i) obj;
        C1089s c1089s = this.f10281b;
        C2495w c2495w = this.f10280a;
        if (iVar.b == 1) {
            bu.m10621a(0, null, c2495w);
            c1089s.m6758b(2, 0);
            return;
        }
        bu.m10621a(2, null, c2495w);
        c1089s.f10276b = iVar.c;
        c1089s.m6758b(3, 0);
    }
}
