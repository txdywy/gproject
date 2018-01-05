package com.google.android.wallet.ui.card;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.wallet.p383e.C6619c;
import com.google.android.wallet.ui.common.ci;

final class C6743h implements TextWatcher {
    public final /* synthetic */ CardNumberEditText f33274a;

    C6743h(CardNumberEditText cardNumberEditText) {
        this.f33274a = cardNumberEditText;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        boolean z = true;
        this.f33274a.m30536a(this.f33274a.getValue(), true);
        if ((this.f33274a.f33253m || this.f33274a.f33254n != null) && (!this.f33274a.mo5623b() || this.f33274a.mo5581e())) {
            z = false;
        }
        if (this.f33274a.f33247g && r0) {
            this.f33274a.setTextColor(this.f33274a.getResources().getColor(C6619c.wallet_uic_error_color));
            ci.m30851a(this.f33274a.getContext(), this.f33274a);
            return;
        }
        this.f33274a.setTextColor(this.f33274a.f33246f);
    }
}
