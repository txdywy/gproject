package com.google.android.finsky.billing.lightpurchase.e;

import android.text.Editable;
import android.text.TextUtils;
import android.widget.TextView;

public final class com.google.android.finsky.billing.lightpurchase.e.i implements TextWatcher
{

    public final com.google.android.finsky.billing.lightpurchase.e.g a;

    i(com.google.android.finsky.billing.lightpurchase.e.g p0) {
        this.a = p0;
    }

    public final void afterTextChanged(Editable p0) {
        if (!TextUtils.isEmpty(this.a.av)) {
            this.a.av = "";
            this.a.az.setText(this.a.av);
            this.a.az.setVisibility(4);
        }
    }

    public final void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
    }

    public final void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
    }

}
