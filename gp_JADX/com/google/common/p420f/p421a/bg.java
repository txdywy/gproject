package com.google.common.p420f.p421a;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

final class bg extends C6980j implements RunnableFuture {
    public volatile as f34411e;

    static bg m31900a(Callable callable) {
        return new bg(callable);
    }

    static bg m31899a(Runnable runnable, Object obj) {
        return new bg(Executors.callable(runnable, obj));
    }

    private bg(Callable callable) {
        this.f34411e = new bh(this, callable);
    }

    public final void run() {
        as asVar = this.f34411e;
        if (asVar != null) {
            asVar.run();
        }
        this.f34411e = null;
    }

    protected final void mo5933b() {
        super.mo5933b();
        if (m31839a()) {
            as asVar = this.f34411e;
            if (asVar != null) {
                Runnable runnable = (Runnable) asVar.get();
                if ((runnable instanceof Thread) && asVar.compareAndSet(runnable, as.f34398b)) {
                    ((Thread) runnable).interrupt();
                    asVar.set(as.f34397a);
                }
            }
        }
        this.f34411e = null;
    }

    protected final String mo5934c() {
        as asVar = this.f34411e;
        if (asVar == null) {
            return null;
        }
        String valueOf = String.valueOf(asVar);
        return new StringBuilder(String.valueOf(valueOf).length() + 7).append("task=[").append(valueOf).append("]").toString();
    }
}
