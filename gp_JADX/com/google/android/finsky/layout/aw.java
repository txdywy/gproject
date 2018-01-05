package com.google.android.finsky.layout;

import android.text.Editable;
import android.text.TextWatcher;

final class aw implements TextWatcher {
    public final /* synthetic */ RateReviewEditor f18504a;

    aw(RateReviewEditor rateReviewEditor) {
        this.f18504a = rateReviewEditor;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        RateReviewEditor rateReviewEditor = this.f18504a;
        if (rateReviewEditor.f18287g != null) {
            rateReviewEditor.f18287g.mo1290k();
        }
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
