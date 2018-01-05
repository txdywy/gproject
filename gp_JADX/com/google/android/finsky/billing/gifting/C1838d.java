package com.google.android.finsky.billing.gifting;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.p111d.C2475d;

final class C1838d implements OnClickListener {
    public final /* synthetic */ GiftingActivity f9452a;

    C1838d(GiftingActivity giftingActivity) {
        this.f9452a = giftingActivity;
    }

    public final void onClick(View view) {
        this.f9452a.E.m13379b(new C2475d(this.f9452a).m13256a(5555));
        this.f9452a.finish();
    }
}
