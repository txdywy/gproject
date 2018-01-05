package com.google.android.finsky.by.a;

import com.google.android.finsky.by.b;
import java.util.Iterator;
import java.util.List;

public final class com.google.android.finsky.by.a.b implements Runnable
{

    public final List a;

    b(List p0) {
        this.a = p0;
    }

    public final void run() {
        v1 = this.a.iterator();
        while (v1.hasNext())
            ((com.google.android.finsky.by.b)v1.next()).a();
    }

}
