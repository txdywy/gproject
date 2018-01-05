package com.google.android.wallet.ui.common;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

final class bi implements TextWatcher {
    public final /* synthetic */ TextView f33562a;
    public final /* synthetic */ MaterialFieldLayout f33563b;

    bi(MaterialFieldLayout materialFieldLayout, TextView textView) {
        this.f33563b = materialFieldLayout;
        this.f33562a = textView;
    }

    public final void afterTextChanged(Editable editable) {
        this.f33563b.m30668a(this.f33562a.isFocused(), this.f33562a);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
