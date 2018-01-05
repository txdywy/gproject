package com.google.android.finsky.by.a;

import com.google.android.finsky.by.d;
import java.util.Iterator;
import java.util.List;

public final class com.google.android.finsky.by.a.k implements Runnable
{

    public final com.google.android.finsky.by.a.a a;
    public final com.google.android.finsky.by.a.f b;

    k(com.google.android.finsky.by.a.f p0, com.google.android.finsky.by.a.a p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void run() {
        v1 = this.b.j().iterator();
        while (v1.hasNext())
            ((com.google.android.finsky.by.d)v1.next()).a(this.a);
    }

}
