package com.google.android.finsky.billing.profile;

import android.view.View;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;
import com.google.wireless.android.finsky.a.a.ao;
import com.google.wireless.android.finsky.dfe.nano.u;

public final class com.google.android.finsky.billing.profile.q implements View$OnClickListener
{

    public final com.google.wireless.android.finsky.a.a.ao a;
    public final com.google.android.finsky.d.w b;
    public final com.google.android.finsky.d.ad c;
    public final com.google.android.finsky.billing.profile.m d;

    q(com.google.android.finsky.billing.profile.m p0, com.google.wireless.android.finsky.a.a.ao p1, com.google.android.finsky.d.w p2, com.google.android.finsky.d.ad p3) {
        this.d = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
    }

    public final void onClick(View p0) {
        if (this.d.as == 0) {
            this.d.as = this.a.d;
            this.b.b(new com.google.android.finsky.d.d(this.c).a(819).a(this.a.v));
            this.d.a(this.a.t, this.d.al.e, this.a.v, this.b);
        }
    }

}
