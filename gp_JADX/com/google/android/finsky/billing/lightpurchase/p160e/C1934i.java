package com.google.android.finsky.billing.lightpurchase.p160e;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

final class C1934i implements TextWatcher {
    public final /* synthetic */ C1906g f9889a;

    C1934i(C1906g c1906g) {
        this.f9889a = c1906g;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        C1906g c1906g = this.f9889a;
        if (!TextUtils.isEmpty(c1906g.av)) {
            c1906g.av = "";
            c1906g.az.setText(c1906g.av);
            c1906g.az.setVisibility(4);
        }
    }
}
