package com.google.android.finsky.billing.redeem.p165a;

import android.content.res.ColorStateList;
import android.text.Editable;
import android.text.TextWatcher;

final class C2085e implements TextWatcher {
    public final /* synthetic */ ColorStateList f10640a;
    public final /* synthetic */ C2084d f10641b;

    C2085e(C2084d c2084d, ColorStateList colorStateList) {
        this.f10641b = c2084d;
        this.f10640a = colorStateList;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        this.f10641b.f10638d.setTextColor(this.f10640a);
        this.f10641b.m10918Y();
    }
}
