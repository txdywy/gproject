package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class C5598n implements C5593p {
    public final Executor f28520a;
    public final Object f28521b = new Object();
    public C5586c f28522c;

    public C5598n(Executor executor, C5586c c5586c) {
        this.f28520a = executor;
        this.f28522c = c5586c;
    }

    public final void mo5054a(C5587d c5587d) {
        if (c5587d.mo5060b()) {
            synchronized (this.f28521b) {
                if (this.f28522c == null) {
                    return;
                }
                this.f28520a.execute(new C5599o(this, c5587d));
            }
        }
    }
}
