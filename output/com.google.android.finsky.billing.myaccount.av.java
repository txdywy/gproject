package com.google.android.finsky.billing.myaccount;

import android.content.res.Resources;
import android.support.design.widget.Snackbar;
import android.support.design.widget.g;
import android.support.v4.app.Fragment;
import com.google.wireless.android.finsky.dfe.nano.bc;
import com.google.wireless.android.finsky.dfe.nano.cl;

public final class com.google.android.finsky.billing.myaccount.av implements com.android.volley.x
{

    public final com.google.android.finsky.billing.myaccount.au a;

    av(com.google.android.finsky.billing.myaccount.au p0) {
        this.a = p0;
    }

    public final void b_(Object p0) {
        if (((com.google.wireless.android.finsky.dfe.nano.bc)p0).d()) {
            v3 = new Object[1];
            v3[0] = this.a.a.b;
            if (this.a.c.q.a.R != 0)
                Snackbar.a(this.a.c.q.a.R, this.a.c.o.getString(2131951864, v3), 0).a();
        }
        else
            this.a.c.q.a((com.google.wireless.android.finsky.dfe.nano.bc)p0, 0);
    }

}
