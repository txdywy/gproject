package com.google.android.finsky.activities;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.widget.EditText;
import com.google.android.finsky.aa.n;

public final class com.google.android.finsky.activities.au implements DialogInterface$OnClickListener
{

    public final EditText a;
    public final com.google.android.finsky.aa.n b;
    public final com.google.android.finsky.activities.t c;

    au(com.google.android.finsky.activities.t p0, EditText p1, com.google.android.finsky.aa.n p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void onClick(DialogInterface p0, int p1) {
        this.b.a(this.a.getText().toString());
        com.google.android.finsky.activities.t.c();
        new Handler(Looper.getMainLooper()).postDelayed(this.c.b, 3000);
    }

}
