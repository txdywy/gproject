package com.google.android.finsky.billing.redeem.a;

import android.content.res.ColorStateList;
import android.text.Editable;
import android.widget.EditText;

public final class com.google.android.finsky.billing.redeem.a.e implements TextWatcher
{

    public final ColorStateList a;
    public final com.google.android.finsky.billing.redeem.a.d b;

    e(com.google.android.finsky.billing.redeem.a.d p0, ColorStateList p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void afterTextChanged(Editable p0) {
        this.b.d.setTextColor(this.a);
        this.b.Y();
    }

    public final void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
    }

    public final void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
    }

}
