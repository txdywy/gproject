package com.google.android.finsky.billing.myaccount;

import android.support.design.widget.Snackbar;
import android.support.design.widget.g;
import android.support.v4.app.Fragment;
import android.support.v4.app.p;
import android.support.v7.widget.RecyclerView;
import com.google.android.finsky.at.k;
import com.google.wireless.android.finsky.dfe.nano.bb;
import com.google.wireless.android.finsky.dfe.nano.bc;

final class com.google.android.finsky.billing.myaccount.bf
{

    public final com.google.android.finsky.billing.myaccount.ba a;

    bf(com.google.android.finsky.billing.myaccount.ba p0) {
        this.a = p0;
    }

    final void a(com.google.wireless.android.finsky.dfe.nano.bc p0, boolean p1) {
        if (this.a.R != 0) {
            if (p0.a == 0)
                v0 = 1;
            else
                v0 = 0;
            if (v0 != 0) {
                v1 = Snackbar.a(this.a.R, p0.c, 0);
                v0 = ((com.google.android.finsky.billing.myaccount.an)this.a.e.getAdapter()).b();
                if (p1 != 0 && v0 != 0)
                    v1.a(2131951862, new com.google.android.finsky.billing.myaccount.bg(this, v0));
                v1.a();
            }
            else if (p0.d()) {
                if (p0.a == 1)
                    v0 = p0.e;
                else
                    v0 = 0;
                new com.google.android.finsky.at.k().c(v0.b).b(p0.c).d(2131952254).a(1).a().a(this.a.B, "EmailFragment.PendingVerificationDialog");
            }
        }
    }

}
