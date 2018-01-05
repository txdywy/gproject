package com.google.android.wallet.ui.card;

import android.widget.TextView;
import com.google.android.wallet.common.util.C6600l;
import com.google.android.wallet.ui.common.p402c.C6739a;

final class C6742g extends C6739a {
    public final /* synthetic */ CardNumberEditText f33273a;

    C6742g(CardNumberEditText cardNumberEditText) {
        this.f33273a = cardNumberEditText;
    }

    protected final boolean mo5632a(TextView textView) {
        return this.f33273a.f33254n != null && C6600l.m29954a(this.f33273a.f33245e, this.f33273a.f33254n.h);
    }

    public final /* synthetic */ CharSequence mo5631a() {
        return this.f33273a.f33250j;
    }
}
