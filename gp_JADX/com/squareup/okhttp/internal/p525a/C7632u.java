package com.squareup.okhttp.internal.p525a;

import java.io.IOException;
import p526e.C7631z;
import p526e.C7726f;
import p526e.ab;

final class C7632u implements C7631z {
    public final C7726f f39517a = new C7726f();
    public boolean f39518b;
    public boolean f39519c;
    public final /* synthetic */ C7630t f39520d;

    C7632u(C7630t c7630t) {
        this.f39520d = c7630t;
    }

    public final void a_(C7726f c7726f, long j) {
        this.f39517a.a_(c7726f, j);
        while (this.f39517a.f40188c >= 16384) {
            m36834a(false);
        }
    }

    private final void m36834a(boolean z) {
        synchronized (this.f39520d) {
            this.f39520d.f39515i.cV_();
            while (this.f39520d.f39508b <= 0 && !this.f39519c && !this.f39518b && this.f39520d.f39516j == null) {
                try {
                    this.f39520d.m36832g();
                } catch (Throwable th) {
                    this.f39520d.f39515i.m36854b();
                }
            }
            this.f39520d.f39515i.m36854b();
            C7630t c7630t = this.f39520d;
            if (c7630t.f39513g.f39518b) {
                throw new IOException("stream closed");
            } else if (c7630t.f39513g.f39519c) {
                throw new IOException("stream finished");
            } else if (c7630t.f39516j != null) {
                throw new IOException("stream was reset: " + c7630t.f39516j);
            } else {
                long min = Math.min(this.f39520d.f39508b, this.f39517a.f40188c);
                c7630t = this.f39520d;
                c7630t.f39508b -= min;
            }
        }
        this.f39520d.f39515i.cV_();
        try {
            C7614e c7614e = this.f39520d.f39510d;
            int i = this.f39520d.f39509c;
            boolean z2 = z && min == this.f39517a.f40188c;
            c7614e.m36791a(i, z2, this.f39517a, min);
        } finally {
            this.f39520d.f39515i.m36854b();
        }
    }

    public final void flush() {
        synchronized (this.f39520d) {
            C7630t c7630t = this.f39520d;
            if (c7630t.f39513g.f39518b) {
                throw new IOException("stream closed");
            } else if (c7630t.f39513g.f39519c) {
                throw new IOException("stream finished");
            } else if (c7630t.f39516j != null) {
                throw new IOException("stream was reset: " + c7630t.f39516j);
            }
        }
        while (this.f39517a.f40188c > 0) {
            m36834a(false);
            this.f39520d.f39510d.m36794b();
        }
    }

    public final ab mo6454a() {
        return this.f39520d.f39515i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
        r6 = this;
        r4 = 0;
        r2 = 1;
        r1 = r6.f39520d;
        monitor-enter(r1);
        r0 = r6.f39518b;	 Catch:{ all -> 0x0029 }
        if (r0 == 0) goto L_0x000c;
    L_0x000a:
        monitor-exit(r1);	 Catch:{ all -> 0x0029 }
    L_0x000b:
        return;
    L_0x000c:
        monitor-exit(r1);	 Catch:{ all -> 0x0029 }
        r0 = r6.f39520d;
        r0 = r0.f39513g;
        r0 = r0.f39519c;
        if (r0 != 0) goto L_0x0038;
    L_0x0015:
        r0 = r6.f39517a;
        r0 = r0.f40188c;
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r0 <= 0) goto L_0x002c;
    L_0x001d:
        r0 = r6.f39517a;
        r0 = r0.f40188c;
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r0 <= 0) goto L_0x0038;
    L_0x0025:
        r6.m36834a(r2);
        goto L_0x001d;
    L_0x0029:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0029 }
        throw r0;
    L_0x002c:
        r0 = r6.f39520d;
        r0 = r0.f39510d;
        r1 = r6.f39520d;
        r1 = r1.f39509c;
        r3 = 0;
        r0.m36791a(r1, r2, r3, r4);
    L_0x0038:
        r1 = r6.f39520d;
        monitor-enter(r1);
        r0 = 1;
        r6.f39518b = r0;	 Catch:{ all -> 0x004c }
        monitor-exit(r1);	 Catch:{ all -> 0x004c }
        r0 = r6.f39520d;
        r0 = r0.f39510d;
        r0.m36794b();
        r0 = r6.f39520d;
        r0.m36831f();
        goto L_0x000b;
    L_0x004c:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x004c }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.a.u.close():void");
    }
}
