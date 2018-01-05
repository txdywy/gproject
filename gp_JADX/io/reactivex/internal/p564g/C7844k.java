package io.reactivex.internal.p564g;

import io.reactivex.p551b.C7756b;
import java.util.concurrent.atomic.AtomicBoolean;

final class C7844k extends AtomicBoolean implements C7756b, Runnable {
    public final Runnable f40422a;

    C7844k(Runnable runnable) {
        this.f40422a = runnable;
    }

    public final void run() {
        if (!get()) {
            try {
                this.f40422a.run();
            } finally {
                lazySet(true);
            }
        }
    }

    public final void mo6530a() {
        lazySet(true);
    }
}
