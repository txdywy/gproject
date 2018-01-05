package com.google.android.finsky.services;

import com.android.volley.C0660x;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.bx;
import java.util.concurrent.CountDownLatch;

final class C4085s implements C0660x {
    public final /* synthetic */ String f20450a;
    public final /* synthetic */ boolean[] f20451b;
    public final /* synthetic */ CountDownLatch f20452c;
    public final /* synthetic */ boolean f20453d;
    public final /* synthetic */ C4082p f20454e;

    C4085s(C4082p c4082p, String str, boolean[] zArr, CountDownLatch countDownLatch, boolean z) {
        this.f20454e = c4082p;
        this.f20450a = str;
        this.f20451b = zArr;
        this.f20452c = countDownLatch;
        this.f20453d = z;
    }

    public final /* synthetic */ void b_(Object obj) {
        bx bxVar = (bx) obj;
        if (bxVar.a == null || bxVar.a.length == 0) {
            String str = "Expected non empty response for package: ";
            String valueOf = String.valueOf(this.f20450a);
            FinskyLog.m21665c(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
            this.f20451b[0] = false;
            this.f20452c.countDown();
            return;
        }
        String str2;
        C3300k o = C1473m.f7980a.mo2256o();
        if (this.f20453d) {
            str2 = null;
            o.mo3455i(this.f20450a);
        } else {
            str2 = C1473m.f7980a.cZ();
        }
        C2441n c2441n = bxVar.a[0].b.f12112s.f12048a;
        o.mo3432a(this.f20450a, c2441n.f13163c, str2, bxVar.a[0].b.f12100g, 1, c2441n.f13153B, this.f20454e.f20446b.m13184a("package_update_service"));
        this.f20451b[0] = true;
        this.f20452c.countDown();
    }
}
