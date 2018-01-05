package com.google.android.wallet.ui.card;

import android.widget.TextView;
import com.google.android.wallet.ui.common.p402c.C6739a;

final class C6741f extends C6739a {
    public final /* synthetic */ CardNumberEditText f33272a;

    C6741f(CardNumberEditText cardNumberEditText) {
        this.f33272a = cardNumberEditText;
    }

    protected final boolean mo5632a(TextView textView) {
        return this.f33272a.f33253m || this.f33272a.f33254n != null;
    }

    public final /* synthetic */ CharSequence mo5631a() {
        return this.f33272a.f33249i;
    }
}
