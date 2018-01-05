package com.google.android.finsky.billing.profile;

import com.google.android.finsky.d.p;
import com.google.android.finsky.d.w;

public final class com.google.android.finsky.billing.profile.d implements Runnable
{

    public final com.google.android.finsky.billing.profile.w a;
    public final com.google.android.finsky.billing.profile.c b;

    d(com.google.android.finsky.billing.profile.c p0, com.google.android.finsky.billing.profile.w p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void run() {
        this.b.af.a(new com.google.android.finsky.d.p().b(this.b).a(this.a.h).a(this.a.g));
    }

}
