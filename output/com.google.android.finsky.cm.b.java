package com.google.android.finsky.cm;

import a.a;
import com.google.android.finsky.installer.k;

public final class com.google.android.finsky.cm.b implements Runnable
{

    public final String a;
    public final boolean b;
    public final com.google.android.finsky.cm.a c;

    b(com.google.android.finsky.cm.a p0, String p1, boolean p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void run() {
        ((com.google.android.finsky.installer.k)this.c.b.a()).c(this.a, this.b);
    }

}
