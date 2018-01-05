package com.google.android.finsky.billing.profile;

import com.google.android.finsky.d.p;
import com.google.android.finsky.d.w;
import com.google.wireless.android.finsky.dfe.nano.v;

public final class com.google.android.finsky.billing.profile.i implements Runnable
{

    public final com.google.wireless.android.finsky.dfe.nano.v a;
    public final com.google.android.finsky.billing.profile.c b;

    i(com.google.android.finsky.billing.profile.c p0, com.google.wireless.android.finsky.dfe.nano.v p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void run() {
        this.b.af.a(new com.google.android.finsky.d.p().b(this.b).a(com.google.android.finsky.billing.profile.c.b(this.a.d)));
    }

}
