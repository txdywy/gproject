package com.google.android.wallet.instrumentmanager.ui.p391b;

import android.text.Editable;
import android.text.TextWatcher;

final class C6659c implements TextWatcher {
    public final /* synthetic */ C6657a f32864a;

    C6659c(C6657a c6657a) {
        this.f32864a = c6657a;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f32864a.f32860g.f32506b != 1) {
            this.f32864a.f32860g.f32506b = 1;
            this.f32864a.ah();
        }
    }

    public final void afterTextChanged(Editable editable) {
    }
}
