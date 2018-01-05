package com.android.volley;

import android.net.TrafficStats;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

public final class C0696l extends Thread {
    public final BlockingQueue f4161a;
    public final C0663k f4162b;
    public final C0659a f4163c;
    public final C0691y f4164d;
    public volatile boolean f4165e = false;

    public C0696l(BlockingQueue blockingQueue, C0663k c0663k, C0659a c0659a, C0691y c0691y) {
        this.f4161a = blockingQueue;
        this.f4162b = c0663k;
        this.f4163c = c0659a;
        this.f4164d = c0691y;
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m4507a();
            } catch (InterruptedException e) {
                if (this.f4165e) {
                    return;
                }
            }
        }
    }

    private final void m4507a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C0656n c0656n = (C0656n) this.f4161a.take();
        try {
            c0656n.m4366a("network-queue-take");
            if (c0656n.mo1073g()) {
                c0656n.m4368b("network-discard-cancelled");
                c0656n.m4385r();
                return;
            }
            if (VERSION.SDK_INT >= 14) {
                TrafficStats.setThreadStatsTag(c0656n.f4029d);
            }
            C0697m a = this.f4162b.mo1072a(c0656n);
            c0656n.m4366a("network-http-complete");
            if (a.f4170e && c0656n.mo1539q()) {
                c0656n.m4368b("not-modified");
                c0656n.m4385r();
                return;
            }
            C0687p c0687p;
            C0704v a2 = c0656n.mo1055a(a);
            c0656n.m4366a("network-parse-complete");
            if (c0656n.f4034i && a2.f4192b != null) {
                this.f4163c.mo1066a(c0656n.mo1546e(), a2.f4192b);
                c0656n.m4366a("network-cache-written");
            }
            c0656n.mo1538p();
            this.f4164d.mo1081a(c0656n, a2);
            synchronized (c0656n.f4030e) {
                c0687p = c0656n.f4041p;
            }
            if (c0687p != null) {
                c0687p.mo1076a(c0656n, a2);
            }
        } catch (VolleyError e) {
            e.f4023c = SystemClock.elapsedRealtime() - elapsedRealtime;
            this.f4164d.mo1080a(c0656n, c0656n.mo1543b(e));
            c0656n.m4385r();
        } catch (Throwable e2) {
            aa.m4481a(e2, "Unhandled exception %s", e2.toString());
            VolleyError volleyError = new VolleyError(e2);
            volleyError.f4023c = SystemClock.elapsedRealtime() - elapsedRealtime;
            this.f4164d.mo1080a(c0656n, volleyError);
            c0656n.m4385r();
        }
    }
}
