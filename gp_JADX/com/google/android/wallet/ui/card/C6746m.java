package com.google.android.wallet.ui.card;

import android.text.Editable;
import android.text.TextWatcher;

final class C6746m implements TextWatcher {
    public final /* synthetic */ C6652j f33281a;

    C6746m(C6652j c6652j) {
        this.f33281a = c6652j;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f33281a.aq != null) {
            this.f33281a.aq.cN_();
        }
    }

    public final void afterTextChanged(Editable editable) {
    }
}
