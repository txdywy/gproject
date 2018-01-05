package com.google.android.agera;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;

public final class com.google.android.agera.ao extends Handler
{

    public static final ThreadLocal a;
    public final com.google.android.agera.o b;

    static {
        com.google.android.agera.ao.a = new ThreadLocal();
    }

    ao() {
        Handler();
        this.b = new com.google.android.agera.o();
    }

    static com.google.android.agera.ao a() {
        v0 = (WeakReference)com.google.android.agera.ao.a.get();
        if (v0 != 0)
            v0 = (com.google.android.agera.ao)v0.get();
        else
            v0 = 0;
        if (v0 == 0) {
            v0 = new com.google.android.agera.ao();
            com.google.android.agera.ao.a.set(new WeakReference(v0));
        }
        return v0;
    }

    private final synchronized void b(com.google.android.agera.am p0, Object p1) {
        enter this;
        try {
            if (this.b.a(p0, p1))
                this.obtainMessage(3, p0).sendToTarget();
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    final synchronized void a(com.google.android.agera.am p0, Object p1) {
        enter this;
        try {
            this.b.b(p0, p1);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final void handleMessage(Message p0) {
  1:    v2 = 0;
  4:    switch (p0.what) {
            case 0:
  4:            goto 99;
            case 1:
  4:            goto 107;
            case 2:
  4:            goto 8;
            case 3:
  4:            goto 115;
            case 4:
  4:            goto 131;
            case 5:
  4:            goto 140;
            default:
        }
  7:    return;
 10:    v0 = (com.google.android.agera.b)p0.obj;
 14:    enter v0.c;
 15:    try {
 17:        if (v0.h == 0) {
 19:            exit v0.c;
 20:            return;
            }
 22:        exit v0.c;
        }
        catch (Throwable ex) {
 22:        exit v0.c;
 23:        throw ex;
        }
 18:    goto 24;
 24:    try {
 26:        if (v0.d > 0) {
 28:            v6 = SystemClock.elapsedRealtime();
 41:            if (v6 - v0.g < (long)v0.d) {
 56:                v0.b.sendMessageDelayed(v0.b.obtainMessage(2, v0), (long)v0.d - (v6 - v0.g));
 59:                exit v0.c;
 60:                return;
                }
 61:            v0.g = v6;
            }
 64:        v0.h = 0;
 66:        v3 = 0;
 67:        while (v3 < v0.e.length) {
 86:            if ((com.google.android.agera.am)v0.e[v3] != 0)
 90:                ((com.google.android.agera.ao)v0.e[v3 + 1]).b((com.google.android.agera.am)v0.e[v3], v0.c);
 95:            v3 = v3 + 2;
            }
 97:        exit v0.c;
        }
        catch (Throwable ex) {
 22:        exit v0.c;
 23:        throw ex;
        }
 98:    return;
103:    ((com.google.android.agera.b)p0.obj).b();
106:    goto 7;
111:    ((com.google.android.agera.b)p0.obj).c();
114:    goto 7;
125:    if (this.b.a((com.google.android.agera.am)p0.obj))
127:        ((com.google.android.agera.am)p0.obj).ad_();
130:    goto 7;
135:    ((com.google.android.agera.i)p0.obj).e();
138:    goto 7;
142:    v0 = (com.google.android.agera.i)p0.obj;
144:    v1 = 0;
145:    enter v0;
146:    try {
148:        if (v0.q == 2) {
151:            v0.q = 0;
157:            if (v0.u != v0.t) {
159:                v1 = v0.u;
163:                v0.u = v0.t;
                }
165:            v2 = v0.r;
            }
167:        exit v0;
        }
        catch (Throwable ex) {
183:        try {
183:            exit v0;
            }
            catch (Throwable ex) {
183:            exit v0;
184:            throw ex;
            }
184:        throw ex;
        }
168:    if (v1 != 0)
172:        v0.o.b(v1);
175:    if (v2 != 0)
177:        v0.e();
180:    goto 7;
    }

}
