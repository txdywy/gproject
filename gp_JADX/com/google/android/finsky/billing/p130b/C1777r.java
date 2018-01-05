package com.google.android.finsky.billing.p130b;

import android.accounts.Account;
import android.content.Intent;
import android.support.v4.app.Fragment;
import com.google.android.wallet.common.pub.e;
import com.google.android.wallet.nfc.b;

public final class C1777r extends C1776q {
    public final Account f9202a;
    public final Fragment f9203b;

    public C1777r(Account account, Fragment fragment) {
        this.f9202a = account;
        this.f9203b = fragment;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo2452a(com.google.wireless.android.finsky.dfe.c.a.v r6, com.google.android.finsky.p111d.C2495w r7) {
        /*
        r5 = this;
        r0 = r5.f9203b;
        r0 = r0.m607j();
        r1 = "PhoneOrchestrationUiHost.fragmentTag";
        r0 = r0.mo283a(r1);
        if (r0 != 0) goto L_0x005e;
    L_0x000e:
        r1 = new com.google.android.wallet.common.pub.i;
        r0 = r6.c;
        switch(r0) {
            case 1: goto L_0x0061;
            case 2: goto L_0x0065;
            case 3: goto L_0x0069;
            case 4: goto L_0x006d;
            case 5: goto L_0x0071;
            case 6: goto L_0x0075;
            case 7: goto L_0x001d;
            default: goto L_0x0015;
        };
    L_0x0015:
        r0 = "Unknown theme specified.";
        r2 = 0;
        r2 = new java.lang.Object[r2];
        com.google.android.finsky.utils.FinskyLog.m21665c(r0, r2);
    L_0x001d:
        r0 = 2132017935; // 0x7f14030f float:1.9674162E38 double:1.053356818E-314;
    L_0x0020:
        r1.<init>(r0);
        r0 = r1.a();
        r1 = r6.b;
        r2 = 1;
        if (r1 != r2) goto L_0x0079;
    L_0x002c:
        r1 = r5.f9202a;
        r2 = r6.e;
        r3 = r6.f;
        r4 = android.os.Bundle.EMPTY;
        r0 = com.google.android.wallet.instrumentmanager.c.a.a(r1, r2, r3, r0, r4);
    L_0x0038:
        r1 = r5.f9203b;
        r1 = r1.m607j();
        r1 = r1.mo284a();
        r2 = "PhoneOrchestrationUiHost.fragmentTag";
        r1 = r1.mo328a(r0, r2);
        r1.mo339e();
        r1 = r6.k;
        if (r1 == 0) goto L_0x005e;
    L_0x004f:
        r1 = new com.google.android.finsky.d.c;
        r2 = r6.k;
        r2 = r2.b;
        r1.<init>(r2);
        r1 = r1.f13342a;
        r2 = 0;
        r7.m13371a(r1, r2);
    L_0x005e:
        r0 = r0.f746R;
        return r0;
    L_0x0061:
        r0 = 2132017932; // 0x7f14030c float:1.9674156E38 double:1.0533568165E-314;
        goto L_0x0020;
    L_0x0065:
        r0 = 2132017937; // 0x7f140311 float:1.9674167E38 double:1.053356819E-314;
        goto L_0x0020;
    L_0x0069:
        r0 = 2132017934; // 0x7f14030e float:1.967416E38 double:1.0533568175E-314;
        goto L_0x0020;
    L_0x006d:
        r0 = 2132017938; // 0x7f140312 float:1.9674169E38 double:1.0533568195E-314;
        goto L_0x0020;
    L_0x0071:
        r0 = 2132017936; // 0x7f140310 float:1.9674164E38 double:1.0533568185E-314;
        goto L_0x0020;
    L_0x0075:
        r0 = 2132017933; // 0x7f14030d float:1.9674158E38 double:1.053356817E-314;
        goto L_0x0020;
    L_0x0079:
        r1 = r6.b;
        r2 = 2;
        if (r1 != r2) goto L_0x008d;
    L_0x007e:
        r1 = r6.h;
        r1 = com.google.android.finsky.billing.common.C1793i.m9763a(r1);
        r2 = r5.f9202a;
        r3 = android.os.Bundle.EMPTY;
        r0 = com.google.android.wallet.c.b.a.a(r2, r1, r0, r3);
        goto L_0x0038;
    L_0x008d:
        r0 = new java.lang.IllegalArgumentException;
        r1 = "Unknown Orchestration FragmentType";
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.billing.b.r.a(com.google.wireless.android.finsky.dfe.c.a.v, com.google.android.finsky.d.w):android.view.View");
    }

    public final void mo2454a(Intent intent) {
        Fragment a = this.f9203b.m607j().mo283a("PhoneOrchestrationUiHost.fragmentTag");
        if (a instanceof b) {
            e.a((b) a, intent);
        }
    }

    public final void mo2453a() {
        Fragment a = this.f9203b.m607j().mo283a("PhoneOrchestrationUiHost.fragmentTag");
        if (a != null) {
            this.f9203b.m607j().mo284a().mo327a(a).mo334c();
        }
    }
}
