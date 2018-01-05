package com.google.android.wallet.ui.card;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.a.a.a.a.b.a.a.c.b.a.x;
import com.google.android.wallet.p383e.C6625i;
import com.google.android.wallet.ui.common.C6735n;
import com.google.android.wallet.ui.common.FormEditText;
import com.google.android.wallet.ui.common.p402c.C6739a;
import com.google.android.wallet.ui.creditcard.CreditCardNumberEditText;

public final class C6751r extends C6739a implements C6735n {
    public final FormEditText f33289a;
    public final CreditCardNumberEditText f33290b;
    public final int f33291c;
    public final int f33292d;

    public C6751r(FormEditText formEditText, CreditCardNumberEditText creditCardNumberEditText) {
        this.f33289a = formEditText;
        this.f33290b = creditCardNumberEditText;
        this.f33291c = -1;
        this.f33292d = 4;
    }

    public C6751r(FormEditText formEditText, int i) {
        this.f33289a = formEditText;
        this.f33290b = null;
        this.f33291c = i;
        this.f33292d = i;
    }

    private final boolean m30566c() {
        if (TextUtils.isEmpty(this.f33289a.getText())) {
            return false;
        }
        if (this.f33291c == -1) {
            x cardType = this.f33290b.getCardType();
            if (cardType == null || this.f33289a.getText().length() != cardType.d) {
                return false;
            }
            return true;
        } else if (this.f33289a.getText().length() == this.f33291c) {
            return true;
        } else {
            return false;
        }
    }

    protected final boolean mo5632a(TextView textView) {
        if (TextUtils.isEmpty(textView.getText())) {
            this.i = null;
            return true;
        } else if (m30566c()) {
            this.i = null;
            return true;
        } else {
            this.i = textView.getContext().getString(C6625i.wallet_uic_error_cvc_invalid);
            return false;
        }
    }

    public final boolean mo5623b() {
        return m30566c() || this.f33289a.getText().length() == this.f33292d;
    }
}
