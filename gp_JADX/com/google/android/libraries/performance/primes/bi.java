package com.google.android.libraries.performance.primes;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.libraries.p326c.p327a.C5916a;
import com.google.android.libraries.performance.primes.p335c.C5978c;
import com.google.android.libraries.performance.primes.p335c.C5979d;
import java.io.File;

final class bi implements Runnable {
    public final /* synthetic */ Context f29787a;
    public final /* synthetic */ bh f29788b;

    bi(bh bhVar, Context context) {
        this.f29788b = bhVar;
        this.f29787a = context;
    }

    public final void run() {
        if (this.f29788b.f29786a.f29780l.compareAndSet(true, false)) {
            this.f29787a.unregisterReceiver(this.f29788b);
            this.f29788b.f29786a.f29779k.set(SystemClock.elapsedRealtime());
            C5978c c5978c = this.f29788b.f29786a.f29775g;
            Object a = dl.m27818a(this.f29787a);
            if (c5978c.f29853a != null) {
                C5979d c5979d = c5978c.f29853a;
                if (c5979d.f29863h.f29852c != null) {
                    c5979d.f29858c = (File) C5916a.m27406a(a);
                    c5979d.interrupt();
                    C5989do.m27824a(3, "LeakWatcherThread", "Schedule for heap dump", new Object[0]);
                    return;
                }
                C5989do.m27824a(3, "LeakWatcherThread", "Skip heap dump. No leak suspects found.", new Object[0]);
            }
        }
    }
}
