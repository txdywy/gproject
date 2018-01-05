package com.google.android.finsky.activities;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.Button;

final class dr implements TextWatcher {
    public final /* synthetic */ Button f6675a;
    public final /* synthetic */ dp f6676b;

    dr(dp dpVar, Button button) {
        this.f6676b = dpVar;
        this.f6675a = button;
    }

    public final void afterTextChanged(Editable editable) {
        this.f6676b.af = editable == null ? null : editable.toString();
        this.f6675a.setEnabled(!TextUtils.isEmpty(this.f6676b.af));
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
