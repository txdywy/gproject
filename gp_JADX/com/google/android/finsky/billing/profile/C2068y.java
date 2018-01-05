package com.google.android.finsky.billing.profile;

import android.content.Context;
import com.android.volley.C0660x;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.p111d.C2474c;
import com.google.wireless.android.finsky.dfe.c.a.ac;
import com.google.wireless.android.finsky.dfe.nano.aq;

public final class C2068y implements C0660x {
    public final /* synthetic */ C1254c f10607a;
    public final /* synthetic */ Context f10608b;
    public final /* synthetic */ C2067x f10609c;

    public C2068y(C2067x c2067x, C1254c c1254c, Context context) {
        this.f10609c = c2067x;
        this.f10607a = c1254c;
        this.f10608b = context;
    }

    public final /* synthetic */ void b_(Object obj) {
        aq aqVar = (aq) obj;
        C2067x c2067x = this.f10609c;
        C1254c c1254c = this.f10607a;
        Context context = this.f10608b;
        C0954a.f5820P.m5777b(c1254c.mo1636c()).m5763a(Boolean.valueOf(aqVar.b));
        if (!aqVar.b) {
            String c = c1254c.mo1636c();
            ac a = new ac().a(c2067x.f10604d.m9765a(context, c));
            a.o = 2;
            a.a |= 64;
            c2067x.f10605e.m13367a(new C2474c(307).m13230a(C2067x.m10829a()));
            c1254c.mo1611a(a, null, null, null, null, new aa(c2067x, c), new ab(c2067x));
        }
    }
}
