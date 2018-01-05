package com.google.android.finsky.billing.myaccount;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;

public final class com.google.android.finsky.billing.myaccount.aq implements View$OnClickListener
{

    public final EditText a;
    public final Button b;
    public final View c;
    public final com.google.android.finsky.billing.myaccount.an d;

    aq(com.google.android.finsky.billing.myaccount.an p0, EditText p1, Button p2, View p3) {
        this.d = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
    }

    public final void onClick(View p0) {
        this.d.j.b(new com.google.android.finsky.d.d(this.d.l).a(2694));
        com.google.android.finsky.billing.myaccount.an.a(this.d, this.a.getText().toString(), this.b, 2131951860, new com.google.android.finsky.billing.myaccount.ar(this));
    }

}
