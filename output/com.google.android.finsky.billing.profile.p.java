package com.google.android.finsky.billing.profile;

import android.accounts.Account;
import android.view.View;
import com.google.android.finsky.billing.payments.d;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;
import com.google.wireless.android.finsky.dfe.nano.v;

public final class com.google.android.finsky.billing.profile.p implements View$OnClickListener
{

    public final com.google.wireless.android.finsky.dfe.nano.v a;
    public final com.google.android.finsky.d.w b;
    public final com.google.android.finsky.d.ad c;
    public final byte[] d;
    public final com.google.android.finsky.billing.profile.m e;

    p(com.google.android.finsky.billing.profile.m p0, com.google.wireless.android.finsky.dfe.nano.v p1, com.google.android.finsky.d.w p2, com.google.android.finsky.d.ad p3, byte[] p4) {
        this.e = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
    }

    public final void onClick(View p0) {
        if (this.e.as == 0) {
            this.e.as = this.a.e;
            this.b.b(new com.google.android.finsky.d.d(this.c).a(817).a(this.a.g));
            this.e.ax = this.a.g;
            this.e.e.a(this.e, this.e.aw.name, this.d, this.a.k, this.e.aj, this.b, this.e.av);
        }
    }

}
