package com.google.android.finsky.billing;

import android.content.DialogInterface;
import android.widget.CheckBox;
import android.widget.RadioButton;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.billing.common.d;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.wireless.android.a.a.a.a.an;

public final class com.google.android.finsky.billing.k implements DialogInterface$OnClickListener
{

    public final RadioButton a;
    public final RadioButton b;
    public final CheckBox c;
    public final int d;
    public final com.google.android.finsky.billing.g e;

    k(com.google.android.finsky.billing.g p0, RadioButton p1, RadioButton p2, CheckBox p3, int p4) {
        this.e = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
    }

    public final void onClick(DialogInterface p0, int p1) {
        this.e.a(6328);
        if (this.a.isChecked())
            v1 = 3;
        else if (this.b.isChecked())
            v1 = 4;
        else
            v1 = 1;
        v2 = this.c.isChecked();
        v0 = new com.google.wireless.android.a.a.a.a.an();
        v0.a(this.d);
        v0.b(v1);
        v0.a = v0.a | 4;
        v0.d = v2;
        v3 = new com.google.android.finsky.d.c(2002);
        v3.a(v0);
        this.e.ah.a(v3);
        if (v2 != 0)
            com.google.android.finsky.billing.common.d.b.a(Integer.valueOf(v1));
        else
            com.google.android.finsky.billing.common.d.b.a(Integer.valueOf(2));
        if (!((Boolean)com.google.android.finsky.billing.common.d.c.a()).booleanValue())
            com.google.android.finsky.billing.common.d.c.a(Boolean.TRUE);
        this.e.W().a(v1, v2);
    }

}
