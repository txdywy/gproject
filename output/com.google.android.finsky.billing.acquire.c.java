package com.google.android.finsky.billing.acquire;

import android.content.Context;
import android.content.res.Resources;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.m;
import com.google.android.finsky.bg.h;
import com.google.android.finsky.providers.d;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.c;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.f;
import com.google.wireless.android.finsky.dfe.c.a.ah;
import com.google.wireless.android.finsky.dfe.c.a.bl;
import com.google.wireless.android.finsky.dfe.c.a.bn;
import com.google.wireless.android.finsky.dfe.c.a.bp;
import com.google.wireless.android.finsky.dfe.c.a.bt;
import com.google.wireless.android.finsky.dfe.c.a.cr;
import com.google.wireless.android.finsky.dfe.c.a.cw;
import com.google.wireless.android.finsky.dfe.c.a.cz;
import com.google.wireless.android.finsky.dfe.c.a.da;
import com.google.wireless.android.finsky.dfe.c.a.dd;
import com.google.wireless.android.finsky.dfe.c.a.de;
import com.google.wireless.android.finsky.dfe.c.a.df;
import com.google.wireless.android.finsky.dfe.c.a.dm;
import com.google.wireless.android.finsky.dfe.c.a.r;
import com.google.wireless.android.finsky.dfe.c.a.t;

public final class com.google.android.finsky.billing.acquire.c implements com.google.android.finsky.dialogbuilder.b.l
{

    public final Context a;
    public final int b;

    c(Context p0, int p1) {
        ((com.google.android.finsky.billing.acquire.d)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.acquire.d)).a();
        this.a = p0;
        this.b = p1;
    }

    public final com.google.wireless.android.finsky.dfe.c.a.cz a(VolleyError p0, boolean p1) {
        v2 = new com.google.wireless.android.finsky.dfe.c.a.cz();
        v0 = new com.google.wireless.android.finsky.dfe.c.a.da();
        v0.a = v0.a | 1;
        v0.b = 1103101952;
        v0.a = v0.a | 4;
        v0.d = 1103101952;
        v0.a = v0.a | 2;
        v0.c = 1098907648;
        v0.a = v0.a | 8;
        v0.e = 1093664768;
        v2.d = v0;
        v3 = new com.google.wireless.android.finsky.dfe.c.a.ah();
        if (v2.aO == 0) {
            v2.aO = new com.google.protobuf.nano.e();
            v0 = 0;
        }
        else
            v0 = v2.aO.a(com.google.wireless.android.finsky.dfe.c.a.ah.a.c >>> 3);
        if (v0 == 0)
            v2.aO.a(com.google.wireless.android.finsky.dfe.c.a.ah.a.c >>> 3, new com.google.protobuf.nano.f(com.google.wireless.android.finsky.dfe.c.a.ah.a, v3));
        else {
            v0.a = com.google.wireless.android.finsky.dfe.c.a.ah.a;
            v0.b = v3;
            v0.c = 0;
        }
        v3.b = new r[2];
        v3.b[0] = new com.google.wireless.android.finsky.dfe.c.a.r();
        v3.b[0].e = new com.google.wireless.android.finsky.dfe.c.a.dd();
        v3.b[0].e.a = new com.google.wireless.android.finsky.dfe.c.a.de();
        v3.b[0].e.a.a(this.a.getString(2131952119));
        v3.b[0].e.a.f = new com.google.wireless.android.finsky.dfe.c.a.df();
        v0 = v3.b[0].e.a.f.a(1101004800);
        v0.f = 6;
        v0.a = v0.a | 8;
        v0.a = v0.a | 4;
        v0.e = -14606047;
        v3.b[0].c = new com.google.wireless.android.finsky.dfe.c.a.dm();
        v3.b[0].c.a = v3.b[0].c.a | 1024;
        v3.b[0].c.l = 1098907648;
        v3.b[1] = new com.google.wireless.android.finsky.dfe.c.a.r();
        v3.b[1].e = new com.google.wireless.android.finsky.dfe.c.a.dd();
        v3.b[1].e.a = new com.google.wireless.android.finsky.dfe.c.a.de();
        v3.b[1].e.a.a(com.google.android.finsky.api.m.a(this.a, p0));
        v3.b[1].e.a.f = new com.google.wireless.android.finsky.dfe.c.a.df();
        v3.b[1].e.a.f.a(1096810496);
        v3.c = new t[1];
        v3.c[0] = new com.google.wireless.android.finsky.dfe.c.a.t();
        v3.c[0].e = new com.google.wireless.android.finsky.dfe.c.a.bn();
        v3.c[0].e.b = new com.google.wireless.android.finsky.dfe.c.a.bp();
        v1 = this.a.getString(2131952688);
        if (v1 == 0)
            throw new NullPointerException();
        v3.c[0].e.b.a = v3.c[0].e.b.a | 1;
        v3.c[0].e.b.b = v1;
        v1 = new com.google.wireless.android.finsky.dfe.c.a.dm();
        v1.a = v1.a | 2048;
        v1.m = this.a.getResources().getColor(com.google.android.finsky.bg.h.b(this.b));
        v3.c[0].e.b.d = v1;
        v1 = new com.google.wireless.android.finsky.dfe.c.a.bl();
        if (p1 != 0)
            v1.d = new com.google.wireless.android.finsky.dfe.c.a.cw();
        else {
            v1.e = new com.google.wireless.android.finsky.dfe.c.a.bt();
            v1.e.b = com.google.android.finsky.billing.acquire.f.a(com.google.android.finsky.billing.acquire.g.c);
        }
        v1.b = new com.google.wireless.android.finsky.dfe.c.a.cr();
        v1.b.a(771);
        v3.c[0].e.b.c = v1;
        v2.b = new com.google.wireless.android.finsky.dfe.c.a.cr();
        v2.b.a(770);
        return v2;
    }

}
