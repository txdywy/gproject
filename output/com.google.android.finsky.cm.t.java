package com.google.android.finsky.cm;

import com.google.android.finsky.utils.FinskyLog;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class com.google.android.finsky.cm.t implements Runnable
{

    public final List a;
    public final com.google.android.finsky.cm.e b;

    t(com.google.android.finsky.cm.e p0, List p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void run() {
        v0 = new HashSet(this.b.c.keySet());
        v0.removeAll(this.a);
        v1 = v0.iterator();
        while (v1.hasNext()) {
            v0 = (String)v1.next();
            v3 = new Object[1];
            v3[0] = v0;
            FinskyLog.a("Pruning stale session for %s", v3);
            this.b.a(v0);
        }
    }

}
