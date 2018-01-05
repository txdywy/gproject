package com.google.android.finsky.billing.myaccount;

import android.widget.Button;
import com.android.volley.VolleyError;

public final class com.google.android.finsky.billing.myaccount.ax implements com.android.volley.w
{

    public final Button a;
    public final String b;

    ax(Button p0, String p1) {
        this.a = p0;
        this.b = p1;
    }

    public final void a(VolleyError p0) {
        this.a.setEnabled(1);
        this.a.setText(this.b);
    }

}
