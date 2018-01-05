package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class C5596l implements C5593p {
    public final Executor f28515a;
    public final Object f28516b = new Object();
    public C5585b f28517c;

    public C5596l(Executor executor, C5585b c5585b) {
        this.f28515a = executor;
        this.f28517c = c5585b;
    }

    public final void mo5054a(C5587d c5587d) {
        if (!c5587d.mo5060b()) {
            synchronized (this.f28516b) {
                if (this.f28517c == null) {
                    return;
                }
                this.f28515a.execute(new C5597m(this, c5587d));
            }
        }
    }
}
