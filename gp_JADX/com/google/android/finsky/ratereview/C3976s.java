package com.google.android.finsky.ratereview;

import java.util.Collection;

final class C3976s implements Runnable {
    public final /* synthetic */ C3974q f20062a;

    C3976s(C3974q c3974q) {
        this.f20062a = c3974q;
    }

    public final void run() {
        C3974q c3974q = this.f20062a;
        Collection values = c3974q.f20058g.mo2868a().values();
        if (!values.isEmpty()) {
            c3974q.f20054c.mo2019a(c3974q.f20055d.mo1183b(c3974q.f20053b)).mo5377a(new C3978u(c3974q, values, false), new C3979v(), false);
        }
    }
}
