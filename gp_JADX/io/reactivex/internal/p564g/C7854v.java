package io.reactivex.internal.p564g;

import java.util.concurrent.Callable;

public final class C7854v extends C7833a implements Callable {
    public C7854v(Runnable runnable) {
        super(runnable);
    }

    private final Void m37713b() {
        this.b = Thread.currentThread();
        try {
            this.a.run();
            return null;
        } finally {
            lazySet(c);
            this.b = null;
        }
    }

    public final /* synthetic */ Object call() {
        return m37713b();
    }
}
