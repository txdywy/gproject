package com.google.android.finsky.contentfilterui;

import android.text.Editable;
import android.text.TextWatcher;

final class C2355s implements TextWatcher {
    public final /* synthetic */ PinEntryDialog f11561a;

    C2355s(PinEntryDialog pinEntryDialog) {
        this.f11561a = pinEntryDialog;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f11561a.m11915k();
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
