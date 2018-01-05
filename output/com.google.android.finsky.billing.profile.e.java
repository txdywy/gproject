package com.google.android.finsky.billing.profile;

import android.view.View;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;

public final class com.google.android.finsky.billing.profile.e implements View$OnClickListener
{

    public final com.google.android.finsky.billing.profile.w a;
    public final byte[] b;
    public final com.google.android.finsky.billing.profile.c c;

    e(com.google.android.finsky.billing.profile.c p0, com.google.android.finsky.billing.profile.w p1, byte[] p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void onClick(View p0) {
        if (this.c.e.as == 0) {
            this.c.e.as = this.a.a;
            this.c.af.b(new com.google.android.finsky.d.d(this.c).a(819).a(this.a.g));
            this.c.e.a(this.a.e, this.b, this.a.g, this.c.af);
        }
    }

}
