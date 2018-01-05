package com.google.android.finsky.billing.a;

import com.google.android.finsky.api.c;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.scheduler.b.b;
import com.google.android.finsky.scheduler.b.c;
import com.google.android.finsky.scheduler.ba;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.z.e;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.dfe.c.a.ao;
import com.google.wireless.android.finsky.dfe.c.a.ap;
import com.google.wireless.android.finsky.dfe.c.a.du;
import com.google.wireless.android.finsky.dfe.c.a.h;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public final class com.google.android.finsky.billing.a.l extends Thread
{

    public final com.google.wireless.android.finsky.dfe.c.a.ap a;
    public final com.google.android.finsky.billing.a.k b;

    l(com.google.android.finsky.billing.a.k p0, com.google.wireless.android.finsky.dfe.c.a.ap p1) {
        this.b = p0;
        this.a = p1;
        Thread();
    }

    public final void run() {
        if (this.b.b != 0)
            v8 = this.b.c;
        else
            v8 = 0;
        if (this.b.f != 0) {
            v7 = new com.google.android.finsky.scheduler.b.c();
            v7.a("key_directory", this.b.h.a.b.getAbsolutePath());
            this.b.h.a.c.a.a(821848297, "Commerce_JanitorTask", com.google.android.finsky.billing.a.b, new com.google.android.finsky.scheduler.b.b().a(this.a.c).b(86400000 + this.a.c).b(5).a(), v7).a(new com.google.android.finsky.billing.a.o());
            FinskyLog.a("Scheduled clear job.", new Object[0]);
        }
        if (this.a.e != 0 && this.a.e.a != 0)
            this.b.h.g = new HashSet(Arrays.asList(this.a.e.a));
        else
            this.b.h.g = Collections.emptySet();
        if (this.a.e != 0 && this.a.e.b != 0)
            this.b.h.h = Arrays.asList(this.a.e.b);
        else
            this.b.h.h = Collections.emptyList();
        v16 = this.b.e.c();
        if (this.a.f != 0)
            this.b.h.a.a(this.b.h.a(this.b.d, v16, this.b.g.f), this.a.f, this.a.c, v8);
        v0 = this.a.b.length;
        v2 = 0;
        while (v2 < v0) {
            v0 = v16;
            this.b.h.a.a(this.b.h.a(this.b.d, v0, this.a.b[v2].d, this.b.g.f), this.a.b[v2], this.a.c, v8);
            v2 = v2 + 1;
        }
        this.b.h.a.a(com.google.android.finsky.billing.a.h.b(this.b.e.c()), com.google.protobuf.nano.i.a(this.a.e), this.a.c, v8);
        if (v8 != 0)
            v8.a(new com.google.android.finsky.d.c(2032));
    }

}
