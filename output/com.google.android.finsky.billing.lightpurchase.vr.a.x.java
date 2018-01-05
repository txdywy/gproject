package com.google.android.finsky.billing.lightpurchase.vr.a;

import com.google.vr.b.a.a.j;
import com.google.vr.b.a.c;
import java.util.concurrent.Executor;

public final class com.google.android.finsky.billing.lightpurchase.vr.a.x extends com.google.vr.b.a.a.j
{

    public final com.google.android.finsky.billing.lightpurchase.vr.a.w a;

    x(com.google.android.finsky.billing.lightpurchase.vr.a.w p0) {
        this.a = p0;
        com.google.vr.b.a.a.j();
    }

    public final void a(int p0) {
        if (p0 == 1)
            this.a.e.b().execute(new com.google.android.finsky.billing.lightpurchase.vr.a.z(this.a));
    }

}
