package com.google.android.finsky.activities;

import android.content.DialogInterface;
import android.widget.EditText;
import com.google.android.finsky.api.c;
import com.google.android.finsky.m;

public final class com.google.android.finsky.activities.ae implements DialogInterface$OnClickListener
{

    public final EditText a;
    public final com.google.android.finsky.activities.t b;

    ae(com.google.android.finsky.activities.t p0, EditText p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void onClick(DialogInterface p0, int p1) {
        v0 = this.a.getText().toString();
        com.google.android.finsky.m.a.ap().f(v0, new com.google.android.finsky.activities.ag(this.b, v0), new com.google.android.finsky.activities.ah(this.b));
    }

}
