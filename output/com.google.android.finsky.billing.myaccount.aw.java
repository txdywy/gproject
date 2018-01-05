package com.google.android.finsky.billing.myaccount;

import android.widget.Button;
import com.android.volley.x;
import com.google.wireless.android.finsky.dfe.nano.bc;

public final class com.google.android.finsky.billing.myaccount.aw implements com.android.volley.x
{

    public final Button a;
    public final String b;
    public final com.android.volley.x c;

    aw(Button p0, String p1, com.android.volley.x p2) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
    }

    public final void b_(Object p0) {
        this.a.setEnabled(1);
        this.a.setText(this.b);
        this.c.b_((com.google.wireless.android.finsky.dfe.nano.bc)p0);
    }

}
