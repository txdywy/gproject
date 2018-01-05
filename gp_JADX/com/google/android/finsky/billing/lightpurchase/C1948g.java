package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import com.google.android.finsky.ao.C1242f;
import com.google.android.finsky.ao.C1247k;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installqueue.C3366j;
import com.google.android.finsky.installqueue.InstallConstraint;
import com.google.android.finsky.installqueue.InstallRequest;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final /* synthetic */ class C1948g implements C1242f {
    public final C1904f f9936a;
    public final InstallRequest f9937b;

    C1948g(C1904f c1904f, InstallRequest installRequest) {
        this.f9936a = c1904f;
        this.f9937b = installRequest;
    }

    public final void mo2546a(C1247k c1247k) {
        C1904f c1904f = this.f9936a;
        InstallRequest installRequest = this.f9937b;
        if (c1247k.f7410a == 0) {
            List<Document> a = c1247k.m7248a(installRequest.f17171a.f17133c);
            Collection arrayList = new ArrayList(a.size() + 1);
            for (Document c3366j : a) {
                C3366j c3366j2 = new C3366j(installRequest.f17171a.f17132b, c3366j);
                c3366j2.m16815b(installRequest.f17171a.f17137g).m16813a((InstallConstraint[]) installRequest.f17172b.toArray(new InstallConstraint[installRequest.f17172b.size()])).m16816c(installRequest.f17171a.f17141k).m16814b(installRequest.f17171a.f17139i).m16812a(installRequest.f17171a.f17143m).m16809a(installRequest.m16702a()).m16810a("dependency");
                arrayList.add(c3366j2.m16806a());
            }
            arrayList.add(installRequest);
            Account e = c1904f.f9738d.mo2240e(installRequest.f17171a.f17137g);
            List b = c1904f.m10153b(e, a);
            c1904f.f9740f = new ArrayList(arrayList);
            c1904f.mo2510a(e, b);
            return;
        }
        FinskyLog.m21667d("Error resolving dependencies. StatusCode: %d", Integer.valueOf(c1247k.f7410a));
        c1904f.m10155c();
    }
}
