package com.google.android.finsky.aj;

import java.util.concurrent.Callable;

final class C1191b implements Callable {
    public final /* synthetic */ String f7292a;
    public final /* synthetic */ C1190a f7293b;

    C1191b(C1190a c1190a, String str) {
        this.f7293b = c1190a;
        this.f7292a = str;
    }

    public final /* synthetic */ Object call() {
        C1194e a = this.f7293b.f7289b.mo1515a(this.f7292a);
        if (a != null) {
            this.f7293b.f7288a.put(this.f7292a, a);
        }
        return a;
    }
}
