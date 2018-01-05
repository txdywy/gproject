package com.google.android.finsky.billing.myaccount;

import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;

public final class com.google.android.finsky.billing.myaccount.ao implements TextWatcher
{

    public final Button a;
    public final com.google.android.finsky.billing.myaccount.an b;

    ao(com.google.android.finsky.billing.myaccount.an p0, Button p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void afterTextChanged(Editable p0) {
        v0 = p0.toString();
        this.a.setEnabled(com.google.android.finsky.billing.myaccount.an.a(v0));
        this.b.k.putString("EmailAdapter.editEmailText", v0);
    }

    public final void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
    }

    public final void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
    }

}
