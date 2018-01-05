package com.google.android.finsky.p108z.p266a;

import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C1207b;
import com.google.android.finsky.p108z.C2919a;
import com.google.android.finsky.p108z.C4809e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

class C4810i extends FutureTask implements C4809e {
    public final Executor f25089c;
    public final List f25090d = new ArrayList();
    public boolean f25091e = false;

    C4810i(Callable callable, Executor executor) {
        super(callable);
        this.f25089c = executor;
    }

    C4810i(Runnable runnable, Object obj, Executor executor) {
        super(runnable, obj);
        this.f25089c = executor;
    }

    public final void mo4398a(C0978f c0978f) {
        synchronized (this) {
            if (this.f25091e) {
                m22593a(c0978f, this.f25089c);
                return;
            }
            this.f25090d.add(new C4822k(c0978f, this.f25089c));
        }
    }

    public final C4809e mo4397a(C1207b c1207b) {
        return new C4823l((C4809e) this, c1207b, this.f25089c);
    }

    public final C4809e mo4396a(C2919a c2919a) {
        return new C4823l((C4809e) this, c2919a, this.f25089c);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void done() {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.f25091e;	 Catch:{ all -> 0x0025 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r3);	 Catch:{ all -> 0x0025 }
    L_0x0006:
        return;
    L_0x0007:
        r0 = 1;
        r3.f25091e = r0;	 Catch:{ all -> 0x0025 }
        monitor-exit(r3);	 Catch:{ all -> 0x0025 }
        r0 = r3.f25090d;
        r1 = r0.iterator();
    L_0x0011:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0006;
    L_0x0017:
        r0 = r1.next();
        r0 = (com.google.android.finsky.p108z.p266a.C4822k) r0;
        r2 = r0.f25101a;
        r0 = r0.f25102b;
        r3.m22593a(r2, r0);
        goto L_0x0011;
    L_0x0025:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0025 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.z.a.i.done():void");
    }

    private final void m22593a(C0978f c0978f, Executor executor) {
        executor.execute(new C4821j(this, c0978f));
    }
}
