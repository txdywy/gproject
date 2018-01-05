package com.google.android.finsky.billing.myaccount;

import android.support.v7.widget.RecyclerView;
import com.android.volley.x;
import com.google.wireless.android.finsky.dfe.nano.ba;
import com.google.wireless.android.finsky.dfe.nano.bc;
import com.google.wireless.android.finsky.dfe.nano.cl;

public final class com.google.android.finsky.billing.myaccount.bc implements com.android.volley.x
{

    public final com.android.volley.x a;
    public final com.google.android.finsky.billing.myaccount.bb b;

    bc(com.google.android.finsky.billing.myaccount.bb p0, com.android.volley.x p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void b_(Object p0) {
        v0 = (com.google.android.finsky.billing.myaccount.an)this.b.a.e.getAdapter();
        if (((com.google.wireless.android.finsky.dfe.nano.bc)p0).d())
            this.b.a.h.b = v0.e;
        else {
            if (v0.e.b.equals(v0.b().b))
                this.b.a.h.b = 0;
            this.b.a.h.a = v0.e;
        }
        this.b.a.a(this.b.a.h);
        this.a.b_((com.google.wireless.android.finsky.dfe.nano.bc)p0);
    }

}
