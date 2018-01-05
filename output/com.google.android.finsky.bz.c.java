package com.google.android.finsky.bz;

import com.google.android.finsky.bh.b;
import com.google.android.finsky.by.c;
import com.google.android.finsky.d.a;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.scheduler.ah;
import com.google.android.finsky.scheduler.b.d;
import com.google.android.finsky.updatechecker.d;

protected final class com.google.android.finsky.bz.c extends com.google.android.finsky.scheduler.ah
{

    public com.google.android.finsky.d.a a;
    public com.google.android.finsky.updatechecker.d c;
    public com.google.android.finsky.by.c d;
    public com.google.android.finsky.bh.b e;

    c() {
        com.google.android.finsky.scheduler.ah();
    }

    public final boolean a(com.google.android.finsky.scheduler.b.d p0) {
        ((com.google.android.finsky.bz.b)com.google.android.finsky.providers.d.a(com.google.android.finsky.bz.b)).a(this);
        this.d.a(new com.google.android.finsky.bz.d(this, this.a.a("maintenance_window")));
        return 1;
    }

    protected final boolean k_(int p0) {
        return 0;
    }

}
