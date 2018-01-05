package io.reactivex.internal.p564g;

import io.reactivex.C7757j;
import io.reactivex.p554d.C7773a;
import java.util.concurrent.TimeUnit;

final class ac implements Runnable {
    public final Runnable f40381a;
    public final ae f40382b;
    public final long f40383c;

    ac(Runnable runnable, ae aeVar, long j) {
        this.f40381a = runnable;
        this.f40382b = aeVar;
        this.f40383c = j;
    }

    public final void run() {
        if (!this.f40382b.f40391d) {
            long a = C7757j.m37533a(TimeUnit.MILLISECONDS);
            if (this.f40383c > a) {
                a = this.f40383c - a;
                if (a > 0) {
                    try {
                        Thread.sleep(a);
                    } catch (Throwable e) {
                        Thread.currentThread().interrupt();
                        C7773a.m37567a(e);
                        return;
                    }
                }
            }
            if (!this.f40382b.f40391d) {
                this.f40381a.run();
            }
        }
    }
}
