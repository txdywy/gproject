package com.google.android.wallet.ui.card;

import android.text.Editable;
import android.text.TextWatcher;

final class C6747n implements TextWatcher {
    public final /* synthetic */ C6652j f33282a;

    C6747n(C6652j c6652j) {
        this.f33282a = c6652j;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f33282a.aq != null) {
            this.f33282a.aq.mo5556c();
        }
    }

    public final void afterTextChanged(Editable editable) {
    }
}
