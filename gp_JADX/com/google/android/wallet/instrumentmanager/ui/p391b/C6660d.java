package com.google.android.wallet.instrumentmanager.ui.p391b;

import android.text.Editable;
import android.text.TextWatcher;

final class C6660d implements TextWatcher {
    public final /* synthetic */ C6657a f32865a;

    C6660d(C6657a c6657a) {
        this.f32865a = c6657a;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f32865a.f32860g.f32511g != 1) {
            this.f32865a.f32860g.f32511g = 1;
            this.f32865a.ah();
        }
    }

    public final void afterTextChanged(Editable editable) {
    }
}
