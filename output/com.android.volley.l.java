package com.android.volley;

import android.net.TrafficStats;
import android.os.Build$VERSION;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

public final class com.android.volley.l extends Thread
{

    public final BlockingQueue a;
    public final com.android.volley.k b;
    public final com.android.volley.a c;
    public final com.android.volley.y d;
    public volatile boolean e;

    l(BlockingQueue p0, com.android.volley.k p1, com.android.volley.a p2, com.android.volley.y p3) {
        Thread();
        this.e = 0;
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
    }

    private final void a() {
        v2 = SystemClock.elapsedRealtime();
        v0 = (com.android.volley.n)this.a.take();
        try {
            v0.a("network-queue-take");
            if (v0.g()) {
                v0.b("network-discard-cancelled");
                v0.r();
            }
            else {
                if (Build$VERSION.SDK_INT >= 14)
                    TrafficStats.setThreadStatsTag(v0.d);
                v1 = this.b.a(v0);
                v0.a("network-http-complete");
                if (v1.e != 0) {
                    if (v0.q()) {
                        v0.b("not-modified");
                        v0.r();
                    }
                    else {
                        v1 = v0.a(v1);
                        v0.a("network-parse-complete");
                        if (v0.i != 0 && v1.b != 0) {
                            this.c.a(v0.e(), v1.b);
                            v0.a("network-cache-written");
                        }
                        v0.p();
                        this.d.a(v0, v1);
                        enter v0.e;
                        try {
                            exit v0.e;
                        }
                        catch (Throwable ex) {
                            try {
                                exit v0.e;
                            }
                            catch (Throwable ex) {
                                exit v0.e;
                                throw ex;
                            }
                            throw ex;
                        }
                        if (v0.p != 0) {
                            try {
                                v0.p.a(v0, v1);
                            }
                            catch (VolleyError ex) {
                                ex.c = SystemClock.elapsedRealtime() - v2;
                                v2 = this.d;
                                v2.a(v0, v0.b(ex));
                                v0.r();
                            }
                            catch (Exception ex) {
                                v5 = new Object[1];
                                v5[0] = ex.toString();
                                com.android.volley.aa.a(ex, "Unhandled exception %s", v5);
                                v4 = new VolleyError(ex);
                                v2 = SystemClock.elapsedRealtime() - v2;
                                v4.c = v2;
                                this.d.a(v0, v4);
                                v0.r();
                            }
                        }
                    }
                }
                else {
                    v1 = v0.a(v1);
                    v0.a("network-parse-complete");
                    if (v0.i != 0 && v1.b != 0) {
                        this.c.a(v0.e(), v1.b);
                        v0.a("network-cache-written");
                    }
                    v0.p();
                    this.d.a(v0, v1);
                    enter v0.e;
                    try {
                        exit v0.e;
                    }
                    catch (Throwable ex) {
                        try {
                            exit v0.e;
                        }
                        catch (Throwable ex) {
                            exit v0.e;
                            throw ex;
                        }
                        throw ex;
                    }
                    if (v0.p != 0) {
                        try {
                            v0.p.a(v0, v1);
                        }
                        catch (VolleyError ex) {
                            ex.c = SystemClock.elapsedRealtime() - v2;
                            v2 = this.d;
                            v2.a(v0, v0.b(ex));
                            v0.r();
                        }
                        catch (Exception ex) {
                            v5 = new Object[1];
                            v5[0] = ex.toString();
                            com.android.volley.aa.a(ex, "Unhandled exception %s", v5);
                            v4 = new VolleyError(ex);
                            v2 = SystemClock.elapsedRealtime() - v2;
                            v4.c = v2;
                            this.d.a(v0, v4);
                            v0.r();
                        }
                    }
                }
            }
            return;
        }
        catch (VolleyError ex) {
            ex.c = SystemClock.elapsedRealtime() - v2;
            v2 = this.d;
            v2.a(v0, v0.b(ex));
            v0.r();
            return;
        }
        catch (Exception ex) {
            v5 = new Object[1];
            v5[0] = ex.toString();
            com.android.volley.aa.a(ex, "Unhandled exception %s", v5);
            v4 = new VolleyError(ex);
            v2 = SystemClock.elapsedRealtime() - v2;
            v4.c = v2;
            this.d.a(v0, v4);
            v0.r();
            return;
        }
        try {
            v1 = v0.a(v1);
            v0.a("network-parse-complete");
            if (v0.i != 0 && v1.b != 0) {
                this.c.a(v0.e(), v1.b);
                v0.a("network-cache-written");
            }
            v0.p();
            this.d.a(v0, v1);
            enter v0.e;
        }
        catch (VolleyError ex) {
            ex.c = SystemClock.elapsedRealtime() - v2;
            v2 = this.d;
            v2.a(v0, v0.b(ex));
            v0.r();
            return;
        }
        catch (Exception ex) {
            v5 = new Object[1];
            v5[0] = ex.toString();
            com.android.volley.aa.a(ex, "Unhandled exception %s", v5);
            v4 = new VolleyError(ex);
            v2 = SystemClock.elapsedRealtime() - v2;
            v4.c = v2;
            this.d.a(v0, v4);
            v0.r();
            return;
        }
        try {
            exit v0.e;
        }
        catch (Throwable ex) {
            try {
                exit v0.e;
            }
            catch (Throwable ex) {
                exit v0.e;
                throw ex;
            }
            throw ex;
        }
        if (v0.p != 0) {
            try {
                v0.p.a(v0, v1);
            }
            catch (VolleyError ex) {
                ex.c = SystemClock.elapsedRealtime() - v2;
                v2 = this.d;
                v2.a(v0, v0.b(ex));
                v0.r();
            }
            catch (Exception ex) {
                v5 = new Object[1];
                v5[0] = ex.toString();
                com.android.volley.aa.a(ex, "Unhandled exception %s", v5);
                v4 = new VolleyError(ex);
                v2 = SystemClock.elapsedRealtime() - v2;
                v4.c = v2;
                this.d.a(v0, v4);
                v0.r();
            }
        }
        return;
        try {
            exit v0.e;
        }
        catch (Throwable ex) {
            exit v0.e;
            throw ex;
        }
        try {
            throw ex;
        }
        catch (VolleyError ex) {
            ex.c = SystemClock.elapsedRealtime() - v2;
            v2 = this.d;
            v2.a(v0, v0.b(ex));
            v0.r();
            return;
        }
        catch (Exception ex) {
            v5 = new Object[1];
            v5[0] = ex.toString();
            com.android.volley.aa.a(ex, "Unhandled exception %s", v5);
            v4 = new VolleyError(ex);
            v2 = SystemClock.elapsedRealtime() - v2;
            v4.c = v2;
            this.d.a(v0, v4);
            v0.r();
            return;
        }
    }

    public final void run() {
  2:    Process.setThreadPriority(10);
  5:    while (true)
  5:        this.a();
  8:    goto -1;
 12:    if (this.e != 0)
 14:        return;
 13:    goto 5;
 15:    try
            run 5...8
        catch (InterruptedException ex) {
  5:        goto 9;
        }
    }

}
