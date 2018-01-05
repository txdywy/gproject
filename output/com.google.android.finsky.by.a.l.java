package com.google.android.finsky.by.a;

import com.google.android.finsky.by.d;
import java.util.Iterator;
import java.util.List;

public final class com.google.android.finsky.by.a.l implements Runnable
{

    public final com.google.android.finsky.by.a.f a;

    l(com.google.android.finsky.by.a.f p0) {
        this.a = p0;
    }

    public final void run() {
        v1 = this.a.j().iterator();
        while (v1.hasNext())
            ((com.google.android.finsky.by.d)v1.next()).ab_();
    }

}
