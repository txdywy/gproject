package com.google.android.finsky.billing.b;

import com.google.android.finsky.api.c;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.billing.a.a;
import com.google.android.finsky.billing.a.h;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.c.a.ac;
import com.google.wireless.android.finsky.dfe.c.a.ae;
import com.google.wireless.android.finsky.dfe.c.a.ag;
import com.google.wireless.android.finsky.dfe.c.a.l;
import com.google.wireless.android.finsky.dfe.c.a.w;

public final class com.google.android.finsky.billing.b.j extends Thread
{

    public final com.google.wireless.android.finsky.dfe.c.a.l a;
    public final com.google.android.finsky.billing.b.i b;

    j(com.google.android.finsky.billing.b.i p0, com.google.wireless.android.finsky.dfe.c.a.l p1) {
        this.b = p0;
        this.a = p1;
        Thread();
    }

    public final void run() {
        if (this.b.x.d.f == 1 && this.b.n.b != 0) {
            v2 = this.b.a.c();
            if (this.b.B.b.j(v2).a(12639865)) {
                this.b.B.b(v2, this.b.c);
                if (this.b.n.b.c == 0)
                    FinskyLog.c("Got null doc id. Skipping...", new Object[0]);
                else
                    this.b.B.a.a(this.b.B.a(this.b.getContext(), v2, this.b.n.b.c.b, this.a), this.b.c);
            }
        }
        else
            this.b.B.a(this.b.a.c(), this.b.c);
    }

}
