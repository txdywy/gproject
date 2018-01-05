package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class C5594j implements C5593p {
    public final Executor f28510a;
    public final Object f28511b = new Object();
    public C4751a f28512c;

    public C5594j(Executor executor, C4751a c4751a) {
        this.f28510a = executor;
        this.f28512c = c4751a;
    }

    public final void mo5054a(C5587d c5587d) {
        synchronized (this.f28511b) {
            if (this.f28512c == null) {
                return;
            }
            this.f28510a.execute(new C5595k(this, c5587d));
        }
    }
}
