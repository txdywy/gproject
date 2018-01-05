package com.google.android.finsky.billing.acquire.a;

import android.widget.EditText;
import com.google.android.finsky.bg.s;

public final class com.google.android.finsky.billing.acquire.a.m implements com.google.android.finsky.billing.c.g
{

    public final EditText a;

    m(EditText p0) {
        this.a = p0;
    }

    public final String a() {
        return this.a.getText().toString();
    }

    public final void a(String p0) {
        com.google.android.finsky.bg.s.a(this.a.getContext(), this.a);
        if (p0 != 0) {
            this.a.setText(p0);
            this.a.setSelection(p0.length());
        }
    }

    public final void b() {
        com.google.android.finsky.bg.s.a(this.a.getContext(), this.a);
    }

}
