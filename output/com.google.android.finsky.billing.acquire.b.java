package com.google.android.finsky.billing.acquire;

import com.google.android.finsky.billing.b.d;
import com.google.android.finsky.dialogbuilder.b;
import com.google.android.finsky.dialogbuilder.b.h;
import com.google.wireless.android.finsky.dfe.c.a.y;

public final class com.google.android.finsky.billing.acquire.b implements com.google.android.finsky.billing.c.f
{

    public final com.google.wireless.android.finsky.dfe.c.a.y a;
    public final com.google.android.finsky.billing.acquire.a b;

    b(com.google.android.finsky.billing.acquire.a p0, com.google.wireless.android.finsky.dfe.c.a.y p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void a(String p0) {
        v0 = 1;
        this.b.o.a(1, this.a.b, 0);
        if (!(this.a.a & 1))
            v0 = 0;
        if (v0 != 0)
            this.b.l.a(this.a.f, p0);
        this.b.e.a(this.a.c);
    }

    public final void a(boolean p0) {
        this.b.o.a(0, this.a.b, 0);
        if (p0 != 0)
            this.b.e.a(this.a.d);
        else
            this.b.e.a(this.a.e);
    }

}
