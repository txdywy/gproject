package com.google.android.finsky.bi.a;

import a.a;
import com.google.android.finsky.bn.b;
import com.google.android.finsky.l.a;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.bi.a.b implements Runnable
{

    public final String a;
    public final int b;
    public final String c;
    public final com.google.android.finsky.bi.a.a d;

    b(com.google.android.finsky.bi.a.a p0, String p1, int p2, String p3) {
        this.d = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
    }

    public final void run() {
        v1 = new Object[3];
        v1[0] = this.a;
        v1[1] = Integer.valueOf(this.b);
        v1[2] = this.c;
        FinskyLog.a("Set autoupdate of %s to %d (%s)", v1);
        ((com.google.android.finsky.l.a)this.d.b.a()).b.a(this.a, this.b);
    }

}
