package com.android.volley;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

public final class C0685c extends Thread {
    public static final boolean f4139a = aa.f4124b;
    public final BlockingQueue f4140b;
    public final BlockingQueue f4141c;
    public final C0659a f4142d;
    public final C0691y f4143e;
    public volatile boolean f4144f = false;
    public final C0688e f4145g;

    public C0685c(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, C0659a c0659a, C0691y c0691y) {
        this.f4140b = blockingQueue;
        this.f4141c = blockingQueue2;
        this.f4142d = c0659a;
        this.f4143e = c0691y;
        this.f4145g = new C0688e(this);
    }

    public final void m4489a() {
        this.f4144f = true;
        interrupt();
    }

    public final void run() {
        if (f4139a) {
            aa.m4480a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f4142d.mo1065a();
        while (true) {
            try {
                m4488b();
            } catch (InterruptedException e) {
                if (this.f4144f) {
                    return;
                }
            }
        }
    }

    private final void m4488b() {
        C0656n c0656n = (C0656n) this.f4140b.take();
        c0656n.m4366a("cache-queue-take");
        if (c0656n.mo1073g()) {
            c0656n.m4368b("cache-discard-canceled");
            return;
        }
        C0684b a = this.f4142d.mo1064a(c0656n.mo1546e());
        if (a == null) {
            c0656n.m4366a("cache-miss");
            if (!this.f4145g.m4494b(c0656n)) {
                this.f4141c.put(c0656n);
            }
        } else if (a.m4487a()) {
            c0656n.m4366a("cache-hit-expired");
            c0656n.f4039n = a;
            if (!this.f4145g.m4494b(c0656n)) {
                this.f4141c.put(c0656n);
            }
        } else {
            c0656n.m4366a("cache-hit");
            C0704v a2 = c0656n.mo1055a(new C0697m(a.f4131a, a.f4137g));
            c0656n.m4366a("cache-hit-parsed");
            if (a.f4136f < System.currentTimeMillis()) {
                c0656n.m4366a("cache-hit-refresh-needed");
                c0656n.f4039n = a;
                a2.f4194d = true;
                if (!this.f4145g.m4494b(c0656n)) {
                    this.f4143e.mo1082a(c0656n, a2, new C0686d(this, c0656n));
                    return;
                }
            }
            this.f4143e.mo1081a(c0656n, a2);
        }
    }
}
