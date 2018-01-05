package com.google.android.finsky.billing.acquire;

import android.content.Context;
import android.support.v7.widget.eq;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.dialogbuilder.p154b.C1686l;
import com.google.android.finsky.providers.C3947d;
import com.google.protobuf.nano.C0758b;
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
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public final class C1687c implements C1686l {
    public final Context f8730a;
    public final int f8731b;

    C1687c(Context context, int i) {
        ((C1348d) C3947d.m18649a(C1348d.class)).mo1693a();
        this.f8730a = context;
        this.f8731b = i;
    }

    public final cz mo2391a(VolleyError volleyError, boolean z) {
        f fVar;
        C0758b czVar = new cz();
        da daVar = new da();
        daVar.a |= 1;
        daVar.b = 24.0f;
        daVar.a |= 4;
        daVar.d = 24.0f;
        daVar.a |= 2;
        daVar.c = 16.0f;
        daVar.a |= 8;
        daVar.e = 11.0f;
        czVar.d = daVar;
        ah ahVar = new ah();
        c cVar = ah.a;
        int i = cVar.c >>> 3;
        if (czVar.aO == null) {
            czVar.aO = new e();
            fVar = null;
        } else {
            fVar = czVar.aO.a(i);
        }
        if (fVar == null) {
            czVar.aO.a(i, new f(cVar, ahVar));
        } else {
            fVar.a = cVar;
            fVar.b = ahVar;
            fVar.c = null;
        }
        ahVar.b = new r[2];
        ahVar.b[0] = new r();
        ahVar.b[0].e = new dd();
        ahVar.b[0].e.a = new de();
        ahVar.b[0].e.a.a(this.f8730a.getString(C7582R.string.error));
        ahVar.b[0].e.a.f = new df();
        df a = ahVar.b[0].e.a.f.a(20.0f);
        a.f = 6;
        a.a |= 8;
        a.a |= 4;
        a.e = -14606047;
        ahVar.b[0].c = new dm();
        dm dmVar = ahVar.b[0].c;
        dmVar.a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
        dmVar.l = 16.0f;
        ahVar.b[1] = new r();
        ahVar.b[1].e = new dd();
        ahVar.b[1].e.a = new de();
        ahVar.b[1].e.a.a(C1290m.m7702a(this.f8730a, volleyError));
        ahVar.b[1].e.a.f = new df();
        ahVar.b[1].e.a.f.a(14.0f);
        ahVar.c = new t[1];
        ahVar.c[0] = new t();
        ahVar.c[0].e = new bn();
        ahVar.c[0].e.b = new bp();
        bp bpVar = ahVar.c[0].e.b;
        String string = this.f8730a.getString(C7582R.string.ok);
        if (string == null) {
            throw new NullPointerException();
        }
        bpVar.a |= 1;
        bpVar.b = string;
        bpVar = ahVar.c[0].e.b;
        dm dmVar2 = new dm();
        int color = this.f8730a.getResources().getColor(C1608h.m9251b(this.f8731b));
        dmVar2.a |= eq.FLAG_MOVED;
        dmVar2.m = color;
        bpVar.d = dmVar2;
        bpVar = ahVar.c[0].e.b;
        bl blVar = new bl();
        if (z) {
            blVar.d = new cw();
        } else {
            blVar.e = new bt();
            blVar.e.b = C1690f.m9475a(C1691g.RESULT_SERVICE_UNAVAILABLE);
        }
        blVar.b = new cr();
        blVar.b.a(771);
        bpVar.c = blVar;
        czVar.b = new cr();
        czVar.b.a(770);
        return czVar;
    }
}
