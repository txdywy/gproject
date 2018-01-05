package com.google.android.finsky.activities;

import android.text.Editable;
import android.text.TextUtils;
import android.widget.Button;

public final class com.google.android.finsky.activities.dr implements TextWatcher
{

    public final Button a;
    public final com.google.android.finsky.activities.dp b;

    dr(com.google.android.finsky.activities.dp p0, Button p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void afterTextChanged(Editable p0) {
        if (p0 == 0)
            v0 = 0;
        else
            v0 = p0.toString();
        this.b.af = v0;
        if (!TextUtils.isEmpty(this.b.af))
            v0 = 1;
        else
            v0 = 0;
        this.a.setEnabled(v0);
    }

    public final void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
    }

    public final void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
    }

}
