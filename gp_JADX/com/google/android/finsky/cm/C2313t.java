package com.google.android.finsky.cm;

import com.google.android.finsky.utils.FinskyLog;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

final class C2313t implements Runnable {
    public final /* synthetic */ List f11383a;
    public final /* synthetic */ C2298e f11384b;

    C2313t(C2298e c2298e, List list) {
        this.f11384b = c2298e;
        this.f11383a = list;
    }

    public final void run() {
        Set<String> hashSet = new HashSet(this.f11384b.f11332c.keySet());
        hashSet.removeAll(this.f11383a);
        for (String str : hashSet) {
            FinskyLog.m21659a("Pruning stale session for %s", str);
            this.f11384b.mo2841a(str);
        }
    }
}
