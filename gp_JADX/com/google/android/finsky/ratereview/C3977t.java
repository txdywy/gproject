package com.google.android.finsky.ratereview;

import java.util.Collection;

final class C3977t implements Runnable {
    public final /* synthetic */ C3974q f20063a;

    C3977t(C3974q c3974q) {
        this.f20063a = c3974q;
    }

    public final void run() {
        C3974q c3974q = this.f20063a;
        Collection values = c3974q.f20059h.mo2868a().values();
        if (!values.isEmpty()) {
            c3974q.f20054c.mo2019a(c3974q.f20055d.mo1183b(c3974q.f20053b)).mo5377a(new C3978u(c3974q, values, true), new C3979v(), false);
        }
    }
}
