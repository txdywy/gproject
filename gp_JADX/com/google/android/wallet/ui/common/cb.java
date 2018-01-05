package com.google.android.wallet.ui.common;

import android.text.Editable;
import android.text.TextWatcher;

final class cb implements TextWatcher {
    public final /* synthetic */ SummaryTextLayout f33619a;

    cb(SummaryTextLayout summaryTextLayout) {
        this.f33619a = summaryTextLayout;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        this.f33619a.m30691a();
    }
}
