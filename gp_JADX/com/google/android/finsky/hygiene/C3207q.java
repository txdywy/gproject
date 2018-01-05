package com.google.android.finsky.hygiene;

import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.de.C2496e;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.aj;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.t;
import java.util.ArrayDeque;

final class C3207q implements C2496e {
    public final /* synthetic */ t f16516a;
    public final /* synthetic */ C2495w f16517b;
    public final /* synthetic */ C1254c f16518c;
    public final /* synthetic */ int f16519d;
    public final /* synthetic */ ArrayDeque f16520e;
    public final /* synthetic */ C3204n f16521f;

    C3207q(C3204n c3204n, t tVar, C2495w c2495w, C1254c c1254c, int i, ArrayDeque arrayDeque) {
        this.f16521f = c3204n;
        this.f16516a = tVar;
        this.f16517b = c2495w;
        this.f16518c = c1254c;
        this.f16519d = i;
        this.f16520e = arrayDeque;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2920a(com.google.wireless.android.finsky.dfe.nano.gb r9) {
        /*
        r8 = this;
        r2 = 1;
        r5 = 0;
        r0 = com.google.android.finsky.C1473m.f7980a;
        r1 = r8.f16521f;
        r1 = r1.f16508d;
        r0 = r0.mo2050a(r1);
        r1 = r0.mo2944a(r9);
        if (r1 <= 0) goto L_0x0017;
    L_0x0012:
        r3 = r8.f16516a;
        r3.a(r1);
    L_0x0017:
        r3 = r8.f16517b;
        r4 = new com.google.android.finsky.d.c;
        r6 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        r4.<init>(r6);
        r6 = r8.f16516a;
        r4 = r4.m13231a(r6);
        r3.m13367a(r4);
        r3 = r8.f16518c;
        r4 = r8.f16521f;
        r4 = r4.f16508d;
        r6 = r8.f16517b;
        r0 = r0.mo2948a(r1, r3, r4, r6);
        if (r0 == 0) goto L_0x00b9;
    L_0x0037:
        r0 = r8.f16521f;
        r0 = r0.f16508d;
        r6 = 12610438; // 0xc06b86 float:1.7670987E-38 double:6.230384E-317;
        r0 = r0.mo2294a(r6);
        if (r0 == 0) goto L_0x004d;
    L_0x0044:
        r0 = com.google.android.finsky.C1473m.f7980a;
        r0 = r0.mo2256o();
        r0.mo3447c();
    L_0x004d:
        r0 = com.google.android.finsky.aa.C0955b.aM;
        r0 = r0.m28964b();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x007c;
    L_0x005b:
        r1 = r8.f16519d;
        r0 = com.google.android.finsky.aa.C0955b.aN;
        r0 = r0.m28964b();
        r0 = (java.lang.Integer) r0;
        r3 = r0.intValue();
        r0 = com.google.android.finsky.aa.C0955b.aO;
        r0 = r0.m28964b();
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        if (r3 <= 0) goto L_0x0079;
    L_0x0077:
        if (r0 > 0) goto L_0x0096;
    L_0x0079:
        r0 = r5;
    L_0x007a:
        if (r0 == 0) goto L_0x00b9;
    L_0x007c:
        r0 = "Self-update started or running - defer daily hygiene";
        r1 = new java.lang.Object[r5];
        com.google.android.finsky.utils.FinskyLog.m21659a(r0, r1);
        r0 = r8.f16521f;
        r0 = r0.f16511g;
        r1 = r8.f16518c;
        r3 = r8.f16521f;
        r3 = r3.f16508d;
        r4 = r8.f16521f;
        r4 = r4.f16509e;
        r5 = r2;
        r0.mo3361a(r1, r2, r3, r4, r5);
    L_0x0095:
        return;
    L_0x0096:
        if (r1 < r3) goto L_0x00b7;
    L_0x0098:
        if (r1 > r0) goto L_0x00b7;
    L_0x009a:
        r4 = "Scheduling emergency daily hygiene, %d <= %d <= %d";
        r6 = 3;
        r6 = new java.lang.Object[r6];
        r3 = java.lang.Integer.valueOf(r3);
        r6[r5] = r3;
        r1 = java.lang.Integer.valueOf(r1);
        r6[r2] = r1;
        r1 = 2;
        r0 = java.lang.Integer.valueOf(r0);
        r6[r1] = r0;
        com.google.android.finsky.utils.FinskyLog.m21665c(r4, r6);
        r0 = r2;
        goto L_0x007a;
    L_0x00b7:
        r0 = r5;
        goto L_0x007a;
    L_0x00b9:
        r0 = r8.f16521f;
        r0 = r0.f16511g;
        r1 = r8.f16518c;
        r3 = r8.f16521f;
        r3 = r3.f16508d;
        r4 = r8.f16521f;
        r4 = r4.f16509e;
        r0.mo3361a(r1, r2, r3, r4, r5);
        goto L_0x0095;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.hygiene.q.a(com.google.wireless.android.finsky.dfe.nano.gb):void");
    }

    public final void mo2919a(VolleyError volleyError) {
        FinskyLog.m21665c("Self-update check failed with error: %s", volleyError);
        C2474c a = new C2474c(119).m13231a(this.f16516a);
        aj.m13208a(a, volleyError, false);
        this.f16517b.m13367a(a);
        if (volleyError instanceof AuthFailureError) {
            this.f16521f.m16252a(this.f16520e);
        } else {
            this.f16521f.f16511g.mo3361a(this.f16518c, false, this.f16521f.f16508d, this.f16521f.f16509e, false);
        }
    }
}
