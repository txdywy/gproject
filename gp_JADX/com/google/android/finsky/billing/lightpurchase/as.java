package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.os.SystemClock;
import com.android.volley.C0660x;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.billing.p120d.C1091e;
import com.google.android.finsky.billing.p120d.C1812d;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installqueue.InstallRequest;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.ak;
import com.google.wireless.android.finsky.dfe.nano.am;
import com.squareup.leakcanary.C7582R;

final class as implements C0660x {
    public final /* synthetic */ long f9769a;
    public final /* synthetic */ C2495w f9770b;
    public final /* synthetic */ String f9771c;
    public final /* synthetic */ ax f9772d;
    public final /* synthetic */ int f9773e;
    public final /* synthetic */ Account f9774f;
    public final /* synthetic */ Document f9775g;
    public final /* synthetic */ String f9776h;
    public final /* synthetic */ boolean f9777i;
    public final /* synthetic */ C1091e f9778j;
    public final /* synthetic */ InstallRequest f9779k;
    public final /* synthetic */ boolean f9780l;
    public final /* synthetic */ boolean f9781m;
    public final /* synthetic */ C1812d f9782n;

    as(long j, C2495w c2495w, String str, ax axVar, int i, Account account, Document document, String str2, boolean z, C1091e c1091e, InstallRequest installRequest, boolean z2, boolean z3, C1812d c1812d) {
        this.f9769a = j;
        this.f9770b = c2495w;
        this.f9771c = str;
        this.f9772d = axVar;
        this.f9773e = i;
        this.f9774f = account;
        this.f9775g = document;
        this.f9776h = str2;
        this.f9777i = z;
        this.f9778j = c1091e;
        this.f9779k = installRequest;
        this.f9780l = z2;
        this.f9781m = z3;
        this.f9782n = c1812d;
    }

    public final /* synthetic */ void b_(Object obj) {
        ak akVar = (ak) obj;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f9769a;
        if (akVar.b != null) {
            am amVar = akVar.b;
            if (amVar.b != 0) {
                this.f9770b.m13367a(new C2474c(301).m13236a(this.f9771c).m13241b(this.f9773e).m13210a(amVar.b).m13242b(elapsedRealtime));
                if (this.f9781m) {
                    String a = C1473m.f7980a.m8582a((int) C7582R.string.error);
                    String str = amVar.d;
                    C1473m.f7980a.mo2259r().mo3793a(a, str, str, this.f9771c, this.f9775g.f14885a.f12116w, this.f9770b.m13365a());
                }
                if (this.f9780l && this.f9778j != null) {
                    this.f9778j.S_();
                }
            } else if (akVar.c != null) {
                this.f9770b.m13367a(new C2474c(301).m13236a(this.f9771c).m13213a(this.f9772d).m13241b(this.f9773e).m13240a(akVar.e).m13242b(elapsedRealtime));
                Account account = this.f9774f;
                Document document = this.f9775g;
                ax axVar = this.f9772d;
                String str2 = this.f9776h;
                Runnable atVar = new at(akVar.c, this.f9777i, axVar, document, str2, akVar.f, account, this.f9770b, this.f9779k, this.f9778j);
                C1473m.f7980a.ai().mo2796a(account, "free_purchase", atVar, r1.b);
            } else {
                FinskyLog.m21665c("Expected PurchaseStatusResponse.", new Object[0]);
                if (this.f9780l && this.f9778j != null) {
                    this.f9778j.S_();
                }
            }
        } else if (akVar.d != null) {
            this.f9782n.mo2512a(akVar.d);
        } else {
            throw new IllegalStateException("Expected purchase response or challenges.");
        }
    }
}
