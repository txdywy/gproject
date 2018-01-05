package com.google.android.finsky.cf;

import a.a;
import com.google.android.finsky.scheduler.b.b;
import com.google.android.finsky.scheduler.ba;
import com.google.android.finsky.scheduler.bb;
import com.google.android.finsky.z.e;
import com.google.android.finsky.z.h;

public final class com.google.android.finsky.cf.b
{

    public a.a a;

    b(a.a p0) {
        this.a = p0;
    }

    public final void a() {
        v0 = ((com.google.android.finsky.scheduler.bb)this.a.a()).a(9);
        if (!v0.b(1))
            v0.a(1, "Send_Reconnection_Notification", com.google.android.finsky.cf.c, new com.google.android.finsky.scheduler.b.b().b(600000).a(1).b(3).a(), 0).a(com.google.android.finsky.z.h.a);
    }

}
