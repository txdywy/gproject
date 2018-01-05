package com.google.android.finsky.billing.profile;

import android.accounts.Account;
import android.support.v4.app.Fragment;
import com.google.android.finsky.api.c;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.d.w;
import com.google.wireless.android.finsky.dfe.nano.ap;
import com.google.wireless.android.finsky.dfe.nano.u;

public final class com.google.android.finsky.billing.profile.s implements com.android.volley.x
{

    public final com.google.android.finsky.d.w a;
    public final int b;
    public final int c;
    public final com.google.android.finsky.billing.profile.m d;

    s(com.google.android.finsky.billing.profile.m p0, com.google.android.finsky.d.w p1, int p2, int p3) {
        this.d = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
    }

    public final void b_(Object p0) {
        switch (((com.google.wireless.android.finsky.dfe.nano.ap)p0).b) {
            case 1:
                this.d.a(0, 0, this.a);
                this.d.al = ((com.google.wireless.android.finsky.dfe.nano.ap)p0).c;
                if (this.d.al.b != 0) {
                    if (this.d.al.b.length > 0)
                        com.google.android.finsky.billing.profile.t.c(this.d.at.b().name);
                }
                this.d.b(this.b, 0);
                break;
            case 2:
                this.d.a(2, 0, this.a);
                this.d.am = ((com.google.wireless.android.finsky.dfe.nano.ap)p0).d;
                this.d.b(this.c, 1);
                break;
            default:
                this.d.a(3, 0, this.a);
                this.d.am = this.d.c(2131952119);
                this.d.b(this.c, 1);
                break;
        }
    }

}
