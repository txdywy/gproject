package com.google.android.finsky.billing.lightpurchase;

import com.google.android.finsky.C1473m;
import com.google.android.finsky.as.C1124c;
import com.google.android.finsky.p111d.C2488p;
import com.squareup.leakcanary.C7582R;

final class al implements C1124c {
    public final /* synthetic */ PurchaseActivity f9751a;

    al(PurchaseActivity purchaseActivity) {
        this.f9751a = purchaseActivity;
    }

    public final void mo1442a(boolean z) {
        if (z) {
            this.f9751a.startActivity(C1473m.f7980a.bo().mo2764d(this.f9751a));
            this.f9751a.mo2495k();
            this.f9751a.finish();
        } else if (this.f9751a.m10045l() == null) {
            this.f9751a.f9643w.m13370a(new C2488p().m13345b(this.f9751a));
            this.f9751a.H_().mo284a().mo325a((int) C7582R.id.content_frame, am.m10171a(this.f9751a.f9642v, this.f9751a.f9641u, this.f9751a.f9646z, this.f9751a.f9643w)).mo334c();
        }
    }
}
