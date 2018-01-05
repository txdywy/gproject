package io.reactivex.internal.p564g;

import io.reactivex.internal.p552a.C7791b;
import io.reactivex.internal.p552a.C7797e;
import io.reactivex.p551b.C7756b;
import java.util.concurrent.atomic.AtomicReference;

final class C7842i extends AtomicReference implements C7756b, Runnable {
    public final C7797e f40415a = new C7797e();
    public final C7797e f40416b = new C7797e();

    C7842i(Runnable runnable) {
        super(runnable);
    }

    public final void run() {
        Runnable runnable = (Runnable) get();
        if (runnable != null) {
            try {
                runnable.run();
            } finally {
                Object obj = null;
                lazySet(null);
                this.f40415a.lazySet(C7791b.f40312a);
                this.f40416b.lazySet(C7791b.f40312a);
            }
        }
    }

    public final void mo6530a() {
        if (getAndSet(null) != null) {
            C7791b.m37585a(this.f40415a);
            C7791b.m37585a(this.f40416b);
        }
    }
}
