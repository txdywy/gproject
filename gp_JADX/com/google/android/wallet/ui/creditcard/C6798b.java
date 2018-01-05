package com.google.android.wallet.ui.creditcard;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.wallet.ui.common.p402c.C6739a;

final class C6798b extends C6739a {
    public final /* synthetic */ String f33724a;
    public final /* synthetic */ CreditCardNumberEditText f33725b;

    C6798b(CreditCardNumberEditText creditCardNumberEditText, String str) {
        this.f33725b = creditCardNumberEditText;
        this.f33724a = str;
    }

    protected final boolean mo5632a(TextView textView) {
        return !this.f33725b.f33715l.isEmpty();
    }

    public final /* synthetic */ CharSequence mo5631a() {
        if (TextUtils.isEmpty(this.f33725b.f33710g)) {
            return this.f33724a;
        }
        return this.f33725b.f33710g;
    }
}
