package com.google.android.play.article;

import java.util.Set;

final class C6253f implements Runnable {
    public final /* synthetic */ C6251d f31276a;

    C6253f(C6251d c6251d) {
        this.f31276a = c6251d;
    }

    public final void run() {
        this.f31276a.f31273b.f31270f.remove(this.f31276a.f31272a);
        C6248b c6248b = this.f31276a.f31273b;
        String str = this.f31276a.f31272a;
        Set<C6129j> set = (Set) c6248b.f31269e.get(str);
        if (set != null) {
            for (C6129j a : set) {
                a.mo5318a();
            }
            c6248b.f31269e.remove(str);
        }
    }
}
