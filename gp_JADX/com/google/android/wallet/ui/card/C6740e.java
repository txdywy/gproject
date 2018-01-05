package com.google.android.wallet.ui.card;

import android.widget.TextView;
import com.google.android.wallet.ui.common.p402c.C6739a;

final class C6740e extends C6739a {
    public final /* synthetic */ CardNumberEditText f33271a;

    C6740e(CardNumberEditText cardNumberEditText) {
        this.f33271a = cardNumberEditText;
    }

    protected final boolean mo5632a(TextView textView) {
        return this.f33271a.f33257q == null;
    }

    public final /* synthetic */ CharSequence mo5631a() {
        return this.f33271a.f33257q.c;
    }
}
