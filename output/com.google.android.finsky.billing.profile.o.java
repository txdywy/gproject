package com.google.android.finsky.billing.profile;

import android.accounts.Account;
import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.finsky.billing.common.u;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;
import com.google.wireless.android.finsky.a.a.bg;
import com.google.wireless.android.finsky.dfe.nano.v;

public final class com.google.android.finsky.billing.profile.o implements View$OnClickListener
{

    public final com.google.wireless.android.finsky.dfe.nano.v a;
    public final com.google.android.finsky.d.w b;
    public final com.google.android.finsky.d.ad c;
    public final com.google.android.finsky.billing.profile.m d;

    o(com.google.android.finsky.billing.profile.m p0, com.google.wireless.android.finsky.dfe.nano.v p1, com.google.android.finsky.d.w p2, com.google.android.finsky.d.ad p3) {
        this.d = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
    }

    public final void onClick(View p0) {
        if (this.d.as == 0) {
            this.d.as = this.a.e;
            this.b.b(new com.google.android.finsky.d.d(this.c).a(816).a(this.a.g));
            this.d.ax = this.a.g;
            this.d.startActivityForResult(this.d.g.a(this.d.aw.name, this.a.j.d, this.b), 5);
        }
    }

}
