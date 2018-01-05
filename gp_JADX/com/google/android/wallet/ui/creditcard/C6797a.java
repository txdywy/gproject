package com.google.android.wallet.ui.creditcard;

import android.widget.TextView;
import com.google.android.wallet.ui.common.p402c.C6739a;

final class C6797a extends C6739a {
    public final /* synthetic */ CreditCardNumberEditText f33723a;

    C6797a(CreditCardNumberEditText creditCardNumberEditText) {
        this.f33723a = creditCardNumberEditText;
    }

    protected final boolean mo5632a(TextView textView) {
        return this.f33723a.f33718o == null;
    }

    public final /* synthetic */ CharSequence mo5631a() {
        return this.f33723a.f33718o.f;
    }
}
