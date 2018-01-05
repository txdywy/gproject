package com.google.android.wallet.ui.address;

import android.text.Editable;
import android.text.TextWatcher;

final class C6718h implements TextWatcher {
    public final /* synthetic */ C6713c f33161a;

    C6718h(C6713c c6713c) {
        this.f33161a = c6713c;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        if (this.f33161a.f33110C != null) {
            C6651s c6651s = this.f33161a.f33110C;
            editable.toString();
            c6651s.ab();
        }
    }
}
