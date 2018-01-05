package com.google.android.finsky.dialogbuilder;

import android.content.Context;
import com.google.android.finsky.dialogbuilder.p154b.C2786a;
import com.google.android.finsky.dialogbuilder.p154b.C2789d;
import com.google.android.finsky.dialogbuilder.p154b.C2792h;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.a.a.a.a.cf;
import com.google.wireless.android.a.a.a.a.z;
import com.google.wireless.android.finsky.dfe.c.a.bl;
import com.google.wireless.android.finsky.dfe.c.a.bu;
import com.google.wireless.android.finsky.dfe.c.a.cp;
import com.google.wireless.android.finsky.dfe.c.a.cr;
import com.google.wireless.android.finsky.dfe.c.a.cw;
import com.google.wireless.android.finsky.dfe.c.a.cz;
import com.google.wireless.android.finsky.dfe.c.a.db;

public final class C2797e implements C2794b, C2796h {
    public final Context f15104a;
    public final C2786a f15105b;
    public final C1682a f15106c;
    public final C2789d f15107d;
    public final C1762d f15108e;
    public final C1688g f15109f;
    public final C1766i f15110g;
    public final C2792h f15111h;
    public cz f15112i;

    public C2797e(Context context, C2786a c2786a, C1682a c1682a, C2789d c2789d, C1762d c1762d, C1688g c1688g, C1766i c1766i, C2792h c2792h) {
        this.f15104a = context;
        this.f15105b = c2786a;
        this.f15106c = c1682a;
        this.f15107d = c2789d;
        this.f15108e = c1762d;
        this.f15109f = c1688g;
        this.f15110g = c1766i;
        this.f15111h = c2792h;
        if (this.f15106c != null) {
            this.f15106c.mo2387a((C2794b) this);
        }
        this.f15107d.f15086c = this;
        this.f15110g.mo2444a((C2796h) this);
        this.f15112i = this.f15110g.mo2447b();
    }

    public final void mo3137a() {
        switch (this.f15110g.mo2441a()) {
            case 0:
                m14885a(null);
                return;
            case 1:
                this.f15109f.mo2395c();
                return;
            case 2:
                cz b = this.f15110g.mo2447b();
                if (b != null) {
                    m14886a(b, this.f15110g.mo2448c());
                    return;
                } else if (this.f15110g.mo2449d() != null) {
                    mo3138a(this.f15110g.mo2449d());
                    return;
                } else {
                    return;
                }
            default:
                throw new RuntimeException("Developer error");
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3138a(com.google.wireless.android.finsky.dfe.c.a.bl r12) {
        /*
        r11 = this;
        r10 = 0;
        r2 = 1;
        r1 = 0;
    L_0x0003:
        r0 = r11.f15107d;
        r0.m14866a();
        r0 = r12.b;
        if (r0 == 0) goto L_0x0013;
    L_0x000c:
        r0 = r11.f15108e;
        r3 = r12.b;
        r0.m9664a(r3);
    L_0x0013:
        r0 = r12.a;
        r0 = r0 & 1;
        if (r0 == 0) goto L_0x002f;
    L_0x0019:
        r0 = r2;
    L_0x001a:
        if (r0 == 0) goto L_0x0023;
    L_0x001c:
        r0 = r11.f15105b;
        r3 = r12.c;
        r0.m14864a(r3);
    L_0x0023:
        r0 = r12.e;
        if (r0 == 0) goto L_0x0031;
    L_0x0027:
        r0 = r11.f15110g;
        r1 = r12.e;
        r0.mo2445a(r1);
    L_0x002e:
        return;
    L_0x002f:
        r0 = r1;
        goto L_0x001a;
    L_0x0031:
        r0 = r12.f;
        if (r0 == 0) goto L_0x0083;
    L_0x0035:
        r0 = r12.f;
        r0 = r0.f;
        if (r0 == 0) goto L_0x005b;
    L_0x003b:
        r0 = r11.f15108e;
        r3 = new com.google.android.finsky.d.o;
        r4 = r0.f9089j;
        r3.<init>(r4);
        r4 = com.google.android.finsky.dialogbuilder.C1762d.f9084e;
        r3.mo1219a(r4);
        r0 = r0.f9085f;
        r4 = new com.google.android.finsky.d.p;
        r4.<init>();
        r3 = r4.m13342a(r3);
        r3 = r3.m13344a();
        r0.m13373a(r3, r10);
    L_0x005b:
        r0 = r11.f15110g;
        r3 = r12.f;
        r0 = r0.mo2443a(r3);
        if (r0 == 0) goto L_0x007e;
    L_0x0065:
        r3 = r12.f;
        r11.m14886a(r0, r3);
        r0 = r12.f;
        r3 = r0.a;
        r3 = r3 & 2;
        if (r3 == 0) goto L_0x007c;
    L_0x0072:
        if (r2 == 0) goto L_0x002e;
    L_0x0074:
        r2 = r11.f15104a;
        r0 = r0.e;
        com.google.android.finsky.bg.C1601a.m9199a(r2, r0, r10, r1);
        goto L_0x002e;
    L_0x007c:
        r2 = r1;
        goto L_0x0072;
    L_0x007e:
        r0 = r12.f;
        r12 = r0.h;
        goto L_0x0003;
    L_0x0083:
        r0 = r12.d;
        if (r0 == 0) goto L_0x008d;
    L_0x0087:
        r0 = r12.d;
        r11.m14885a(r0);
        goto L_0x002e;
    L_0x008d:
        r0 = r12.g;
        if (r0 == 0) goto L_0x00d1;
    L_0x0091:
        r4 = r12.g;
        r3 = r4.a;
        r5 = r3.length;
        r0 = r1;
    L_0x0097:
        if (r0 >= r5) goto L_0x018b;
    L_0x0099:
        r6 = r3[r0];
        r7 = r11.f15111h;
        r6 = r7.m14874c(r6);
        if (r6 != 0) goto L_0x00c7;
    L_0x00a3:
        r0 = r1;
    L_0x00a4:
        r5 = r4.b;
        r6 = r5.length;
        r3 = r1;
    L_0x00a8:
        if (r3 >= r6) goto L_0x0188;
    L_0x00aa:
        r7 = r5[r3];
        r8 = r11.f15111h;
        r9 = r7.c;
        r8 = r8.m14872b(r9);
        if (r8 == 0) goto L_0x00ca;
    L_0x00b6:
        r7 = r7.d;
        r7 = r8.matches(r7);
        if (r7 != 0) goto L_0x00ca;
    L_0x00be:
        r3 = r1;
    L_0x00bf:
        if (r0 == 0) goto L_0x00cd;
    L_0x00c1:
        if (r3 == 0) goto L_0x00cd;
    L_0x00c3:
        r12 = r4.c;
        goto L_0x0003;
    L_0x00c7:
        r0 = r0 + 1;
        goto L_0x0097;
    L_0x00ca:
        r3 = r3 + 1;
        goto L_0x00a8;
    L_0x00cd:
        r12 = r4.d;
        goto L_0x0003;
    L_0x00d1:
        r0 = r12.h;
        if (r0 == 0) goto L_0x00f5;
    L_0x00d5:
        r0 = r12.h;
        r0 = r0.b;
        r0 = android.net.Uri.parse(r0);
        r3 = new android.content.Intent;
        r4 = "android.intent.action.VIEW";
        r3.<init>(r4, r0);
        r0 = r11.f15104a;
        r0.startActivity(r3);
        r0 = r12.h;
        r0 = r0.c;
        if (r0 == 0) goto L_0x002e;
    L_0x00ef:
        r0 = r12.h;
        r12 = r0.c;
        goto L_0x0003;
    L_0x00f5:
        r0 = r12.i;
        if (r0 == 0) goto L_0x0112;
    L_0x00f9:
        r0 = r11.f15111h;
        r3 = r12.i;
        r3 = r3.b;
        r4 = r12.i;
        r4 = r4.c;
        r0.m14870a(r3, r4);
        r0 = r12.i;
        r0 = r0.d;
        if (r0 == 0) goto L_0x002e;
    L_0x010c:
        r0 = r12.i;
        r12 = r0.d;
        goto L_0x0003;
    L_0x0112:
        r0 = r12.j;
        if (r0 == 0) goto L_0x012b;
    L_0x0116:
        r0 = r11.f15108e;
        r3 = r12.j;
        r3 = r3.a;
        r0.m9666b(r3);
        r0 = r12.j;
        r0 = r0.b;
        if (r0 == 0) goto L_0x002e;
    L_0x0125:
        r0 = r12.j;
        r12 = r0.b;
        goto L_0x0003;
    L_0x012b:
        r0 = r12.l;
        if (r0 == 0) goto L_0x015c;
    L_0x012f:
        r0 = r12.l;
        r0 = r0.d;
        if (r0 != r2) goto L_0x014e;
    L_0x0135:
        r0 = r11.f15104a;
        r3 = r12.l;
        r3 = r3.c;
        r0 = android.widget.Toast.makeText(r0, r3, r2);
        r0.show();
    L_0x0142:
        r0 = r12.l;
        r0 = r0.b;
        if (r0 == 0) goto L_0x002e;
    L_0x0148:
        r0 = r12.l;
        r12 = r0.b;
        goto L_0x0003;
    L_0x014e:
        r0 = r11.f15104a;
        r3 = r12.l;
        r3 = r3.c;
        r0 = android.widget.Toast.makeText(r0, r3, r1);
        r0.show();
        goto L_0x0142;
    L_0x015c:
        r0 = r12.k;
        if (r0 == 0) goto L_0x0179;
    L_0x0160:
        r0 = r11.f15107d;
        r1 = r12.k;
        r2 = r1.b;
        if (r2 == 0) goto L_0x002e;
    L_0x0168:
        r0.m14866a();
        r0.f15087d = r1;
        r2 = r0.f15084a;
        r0 = r0.f15085b;
        r1 = r1.c;
        r4 = (long) r1;
        r2.postDelayed(r0, r4);
        goto L_0x002e;
    L_0x0179:
        r0 = r11.f15106c;
        r0 = r0.mo2388a(r12);
        if (r0 == 0) goto L_0x002e;
    L_0x0181:
        r0 = r11.f15109f;
        r0.mo2395c();
        goto L_0x002e;
    L_0x0188:
        r3 = r2;
        goto L_0x00bf;
    L_0x018b:
        r0 = r2;
        goto L_0x00a4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.dialogbuilder.e.a(com.google.wireless.android.finsky.dfe.c.a.bl):void");
    }

    public final void m14889a(boolean z) {
        C1762d c1762d = this.f15108e;
        c1762d.f9085f.m13372a(new C2475d(c1762d.m9660a(null)).m13256a(z ? 601 : 600).m13259a(), null);
        bl a = this.f15110g.mo2442a(z);
        if (a != null) {
            this.f15110g.mo2450e();
            mo3138a(a);
        }
    }

    private final void m14885a(cw cwVar) {
        if (cwVar == null || cwVar.f == null) {
            this.f15109f.mo2395c();
        } else {
            mo3138a(cwVar.f);
        }
        this.f15110g.mo2446a(cwVar);
    }

    private final void m14886a(cz czVar, db dbVar) {
        int i;
        boolean z = false;
        C1762d c1762d = this.f15108e;
        c1762d.f9090k = dbVar.g;
        if ((czVar.a & 1) != 0) {
            i = czVar.e;
        } else {
            i = 0;
        }
        cp cpVar = czVar.g;
        if (i != c1762d.f9089j || c1762d.f9086g == null) {
            c1762d.f9089j = i;
            c1762d.f9086g = c1762d.m9665b(cpVar);
        } else {
            c1762d.mo2431a(c1762d.f9086g, cpVar);
        }
        cr crVar = czVar.b;
        if (crVar == null || !crVar.d()) {
            c1762d.f9088i = c1762d.f9086g;
            c1762d.f9087h = c1762d.f9086g;
        } else {
            ad c2473o = new C2473o(crVar.b, crVar.c, c1762d.m9660a(czVar.g));
            c2473o.mo2914a();
            if ((crVar.a & 4) != 0) {
                z zVar = new z();
                zVar.a(crVar.d);
                cf cfVar = new cf();
                cfVar.h = zVar;
                c2473o.getPlayStoreUiElement().e = cfVar;
            }
            c1762d.f9087h = c2473o;
            c1762d.f9088i = c2473o;
        }
        this.f15108e.m9668g();
        if (czVar != this.f15112i) {
            z = true;
        }
        this.f15112i = czVar;
        bu buVar = dbVar.c;
        if (!z) {
            buVar = new bu().a(2);
        } else if (czVar.f != null) {
            mo3138a(czVar.f);
        }
        this.f15109f.mo2393a(this, czVar, buVar, z);
    }
}
