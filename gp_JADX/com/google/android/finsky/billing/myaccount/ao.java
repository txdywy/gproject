package com.google.android.finsky.billing.myaccount;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;

final class ao implements TextWatcher {
    public final /* synthetic */ Button f10210a;
    public final /* synthetic */ an f10211b;

    ao(an anVar, Button button) {
        this.f10211b = anVar;
        this.f10210a = button;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        this.f10210a.setEnabled(an.m10588a(obj));
        this.f10211b.k.putString("EmailAdapter.editEmailText", obj);
    }
}
