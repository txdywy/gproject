package com.google.android.finsky.by.p132a;

import java.util.Collection;

final class ae implements Runnable {
    public int f11008a;
    public final /* synthetic */ Collection f11009b;
    public final /* synthetic */ ad f11010c;

    ae(ad adVar, Collection collection) {
        this.f11010c = adVar;
        this.f11009b = collection;
    }

    public final void run() {
        this.f11008a++;
        if (this.f11008a == this.f11009b.size() && this.f11010c.f11005a != null) {
            this.f11010c.f11007c.f10999d.post(this.f11010c.f11005a);
        }
    }
}
