package com.google.android.finsky.billing.gifting;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.bg.C1618s;
import com.google.android.finsky.p111d.C2475d;

final class C1837c implements OnClickListener {
    public final /* synthetic */ GiftingActivity f9451a;

    C1837c(GiftingActivity giftingActivity) {
        this.f9451a = giftingActivity;
    }

    public final void onClick(View view) {
        this.f9451a.E.m13379b(new C2475d(this.f9451a).m13256a(5553));
        C1618s.m9293a(this.f9451a, this.f9451a.f9425u);
        this.f9451a.f9418n.m9884a(this.f9451a.f9425u.getMessage());
    }
}
