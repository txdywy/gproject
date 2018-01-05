package com.google.android.wallet.ui.common;

import android.text.Editable;
import android.text.TextWatcher;

final class an implements TextWatcher {
    public final /* synthetic */ FormEditText f33532a;

    an(FormEditText formEditText) {
        this.f33532a = formEditText;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        boolean c = this.f33532a.f33216A.m30546c(this.f33532a);
        CharSequence a = this.f33532a.f33216A.mo5631a();
        if (!c && a != null) {
            this.f33532a.setError(a);
        } else if (this.f33532a.isFocused() && this.f33532a.getValueLength() > 0 && this.f33532a.getError() != null) {
            this.f33532a.setError(null);
            this.f33532a.f33233R = null;
        }
    }
}
