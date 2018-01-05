package com.google.android.finsky.billing;

import android.content.DialogInterface;
import android.widget.CheckBox;

public final class com.google.android.finsky.billing.q implements DialogInterface$OnClickListener
{

    public final boolean a;
    public final CheckBox b;
    public final boolean c;
    public final com.google.android.finsky.billing.p d;

    q(com.google.android.finsky.billing.p p0, boolean p1, CheckBox p2, boolean p3) {
        this.d = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
    }

    public final void onClick(DialogInterface p0, int p1) {
        if (this.a != 0)
            v0 = this.b.isChecked();
        else
            v0 = this.c;
        if (v0 != 0)
            v0 = 3;
        else
            v0 = 1;
        this.d.W().a(v0, 0);
    }

}
