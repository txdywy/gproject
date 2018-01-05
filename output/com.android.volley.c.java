package com.android.volley;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

public final class com.android.volley.c extends Thread
{

    public static final boolean a;
    public final BlockingQueue b;
    public final BlockingQueue c;
    public final com.android.volley.a d;
    public final com.android.volley.y e;
    public volatile boolean f;
    public final com.android.volley.e g;

    static {
        com.android.volley.c.a = com.android.volley.aa.b;
    }

    c(BlockingQueue p0, BlockingQueue p1, com.android.volley.a p2, com.android.volley.y p3) {
        Thread();
        this.f = 0;
        this.b = p0;
        this.c = p1;
        this.d = p2;
        this.e = p3;
        this.g = new com.android.volley.e(this);
    }

    private final void b() {
        v0 = (com.android.volley.n)this.b.take();
        v0.a("cache-queue-take");
        if (v0.g())
            v0.b("cache-discard-canceled");
        else {
            v3 = this.d.a(v0.e());
            if (v3 == 0) {
                v0.a("cache-miss");
                if (!this.g.b(v0))
                    this.c.put(v0);
            }
            else if (v3.a()) {
                v0.a("cache-hit-expired");
                v0.n = v3;
                if (!this.g.b(v0))
                    this.c.put(v0);
            }
            else {
                v0.a("cache-hit");
                v4 = v0.a(new com.android.volley.m(v3.a, v3.g));
                v0.a("cache-hit-parsed");
                if (v3.f < System.currentTimeMillis())
                    v1 = 1;
                else
                    v1 = 0;
                if (v1 != 0) {
                    v0.a("cache-hit-refresh-needed");
                    v0.n = v3;
                    v4.d = 1;
                    if (!this.g.b(v0))
                        this.e.a(v0, v4, new com.android.volley.d(this, v0));
                    else
                        this.e.a(v0, v4);
                }
                else
                    this.e.a(v0, v4);
            }
        }
    }

    public final void a() {
        this.f = 1;
        this.interrupt();
    }

    public final void run() {
  2:    if (com.android.volley.c.a != 0)
  9:        com.android.volley.aa.a("start new dispatcher", new Object[0]);
 14:    Process.setThreadPriority(10);
 19:    this.d.a();
 22:    while (true)
 22:        this.b();
 25:    goto -1;
 29:    if (this.f != 0)
 31:        return;
 30:    goto 22;
 32:    try
            run 22...25
        catch (InterruptedException ex) {
 22:        goto 26;
        }
    }

}
