package com.google.android.wallet.ui.creditcard;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.wallet.common.util.C6600l;
import com.google.android.wallet.ui.common.p402c.C6739a;

final class C6799c extends C6739a {
    public final /* synthetic */ String f33726a;
    public final /* synthetic */ CreditCardNumberEditText f33727b;

    C6799c(CreditCardNumberEditText creditCardNumberEditText, String str) {
        this.f33727b = creditCardNumberEditText;
        this.f33726a = str;
    }

    protected final boolean mo5632a(TextView textView) {
        return this.f33727b.f33716m != null && this.f33727b.mo5623b() && C6600l.m29954a(this.f33727b.f33708e, 2);
    }

    public final /* synthetic */ CharSequence mo5631a() {
        if (TextUtils.isEmpty(this.f33727b.f33711h)) {
            return this.f33726a;
        }
        return this.f33727b.f33711h;
    }
}
