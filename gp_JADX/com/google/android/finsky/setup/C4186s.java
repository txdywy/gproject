package com.google.android.finsky.setup;

import android.accounts.Account;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.billing.p120d.C1091e;
import com.google.android.finsky.billing.p120d.C1807a;
import com.google.android.finsky.billing.p120d.C1811c;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.dfemodel.Document;
import java.util.ArrayList;
import java.util.List;

final class C4186s implements Runnable {
    public final /* synthetic */ String f21110a;
    public final /* synthetic */ List f21111b;
    public final /* synthetic */ PlaySetupService f21112c;

    C4186s(PlaySetupService playSetupService, String str, List list) {
        this.f21112c = playSetupService;
        this.f21110a = str;
        this.f21111b = list;
    }

    public final void run() {
        Account b = C1473m.f7980a.mo2041U().mo1183b(this.f21110a);
        C1807a a = C1473m.f7980a.bF().mo2455a();
        ArrayList arrayList = new ArrayList();
        C1091e c4187t = new C4187t(arrayList);
        for (cv document : this.f21111b) {
            a.mo2456a(new C1811c(b, new Document(document), c4187t));
        }
        a.mo2457a(new C4188u(this, arrayList));
    }
}
