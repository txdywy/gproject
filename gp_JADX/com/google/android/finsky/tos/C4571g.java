package com.google.android.finsky.tos;

import com.android.volley.C0660x;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.p356a.p357a.p358a.p359a.bo;

final class C4571g implements C0660x {
    public final /* synthetic */ String f23371a;
    public final /* synthetic */ String f23372b;
    public final /* synthetic */ C2482j f23373c;
    public final /* synthetic */ C4569e f23374d;

    C4571g(C4569e c4569e, String str, String str2, C2482j c2482j) {
        this.f23374d = c4569e;
        this.f23371a = str;
        this.f23372b = str2;
        this.f23373c = c2482j;
    }

    public final /* synthetic */ void b_(Object obj) {
        FinskyLog.m21659a("TU:TOS acceptance acked by DFE", new Object[0]);
        C4569e.m21200a(this.f23371a, this.f23372b);
        this.f23374d.f23364f.m15184a(this.f23372b, 1);
        this.f23374d.f23366h.mo4365c();
        this.f23373c.m13319a(new bo().m28992a(945), null);
    }
}
