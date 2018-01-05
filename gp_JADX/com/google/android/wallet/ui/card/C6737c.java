package com.google.android.wallet.ui.card;

import android.text.Editable;
import android.text.TextWatcher;

final class C6737c implements TextWatcher {
    public final /* synthetic */ C6649a f33262a;

    C6737c(C6649a c6649a) {
        this.f33262a = c6649a;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f33262a.aA.f32506b != 1) {
            this.f33262a.aA.f32506b = 1;
            this.f33262a.ah();
        }
    }

    public final void afterTextChanged(Editable editable) {
    }
}
