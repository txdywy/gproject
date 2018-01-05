package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.billing.p120d.C1091e;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.installqueue.C3366j;
import com.google.android.finsky.installqueue.InstallRequest;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.an;

final class at implements Runnable {
    public final /* synthetic */ an f9783a;
    public final /* synthetic */ boolean f9784b;
    public final /* synthetic */ ax f9785c;
    public final /* synthetic */ Document f9786d;
    public final /* synthetic */ String f9787e;
    public final /* synthetic */ String f9788f;
    public final /* synthetic */ Account f9789g;
    public final /* synthetic */ C2495w f9790h;
    public final /* synthetic */ InstallRequest f9791i;
    public final /* synthetic */ C1091e f9792j;

    at(an anVar, boolean z, ax axVar, Document document, String str, String str2, Account account, C2495w c2495w, InstallRequest installRequest, C1091e c1091e) {
        this.f9783a = anVar;
        this.f9784b = z;
        this.f9785c = axVar;
        this.f9786d = document;
        this.f9787e = str;
        this.f9788f = str2;
        this.f9789g = account;
        this.f9790h = c2495w;
        this.f9791i = installRequest;
        this.f9792j = c1091e;
    }

    public final void run() {
        if (this.f9783a.a == 1 && this.f9784b && this.f9785c.f11834c == 1) {
            C1473m.f7980a.bu().m15637b(this.f9786d);
            C1473m.f7980a.mo2029I().f18022b.mo2671b(this.f9786d.f14885a.f12097d, this.f9787e);
            if (this.f9783a.c != null) {
                if (!TextUtils.isEmpty(this.f9788f)) {
                    C1473m.f7980a.mo2256o().mo3437a(this.f9786d.f14885a.f12096c, this.f9788f);
                }
                Account account = this.f9789g;
                Document document = this.f9786d;
                C2495w a = this.f9790h.m13375a("single_install");
                InstallRequest installRequest = this.f9791i;
                if (document.m14625N() == null) {
                    FinskyLog.m21669e("Document does not contain AppDetails, cannot download: %s", document.f14885a.f12096c);
                }
                if (C1473m.f7980a.dj().mo2294a(12643667)) {
                    InstallRequest a2;
                    if (installRequest == null) {
                        a2 = new C3366j(a.m13381c(), document).m16815b(account.name).m16814b(2).m16806a();
                    } else {
                        a2 = installRequest;
                    }
                    C1473m c1473m = C1473m.f7980a;
                    new aw(c1473m.cS(), c1473m.mo2045Y(), c1473m.bw(), c1473m.mo2040T(), c1473m.bF()).m10152a(a2);
                } else if (installRequest != null) {
                    av.f9799a.m16744a(installRequest);
                } else {
                    C3300k o = C1473m.f7980a.mo2256o();
                    o.mo3439a(document.m14625N().f13171k, document.bV());
                    o.mo3432a(document.m14625N().f13171k, document.m14625N().f13163c, account.name, document.f14885a.f12100g, 2, document.m14671z(), a);
                }
            } else {
                FinskyLog.m21665c("missing delivery data for %s", this.f9786d.f14885a.f12096c);
            }
        }
        if (this.f9792j != null) {
            this.f9792j.mo1425a(this.f9789g, this.f9786d);
        }
    }
}
