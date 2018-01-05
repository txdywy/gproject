package com.google.android.finsky.dg;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

final class C2739e implements Runnable {
    public final /* synthetic */ C2734a f14970a;

    C2739e(C2734a c2734a) {
        this.f14970a = c2734a;
    }

    public final void run() {
        C2734a c2734a = this.f14970a;
        Set<C2743j> newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(c2734a.f14959b.size()));
        newSetFromMap.addAll(c2734a.f14959b);
        c2734a.f14959b.clear();
        for (C2743j a : newSetFromMap) {
            c2734a.m14774a(a);
        }
        c2734a.m14776b(c2734a.f14962e);
    }
}
