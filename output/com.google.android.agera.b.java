package com.google.android.agera;

import android.os.Looper;
import android.os.Message;
import java.util.Arrays;

protected class com.google.android.agera.b implements com.google.android.agera.t
{

    public static final Object[] a;
    public final com.google.android.agera.ao b;
    public final Object c;
    public final int d;
    public Object[] e;
    public int f;
    public long g;
    public boolean h;

    static {
        com.google.android.agera.b.a = new Object[0];
    }

    b() {
        com.google.android.agera.b(0);
    }

    b(int p0) {
        this.c = new Object();
        this.h = 0;
        if (Looper.myLooper() != 0)
            v0 = 1;
        else
            v0 = 0;
        com.google.android.agera.x.a(v0, "Can only be created on a Looper thread");
        this.d = p0;
        this.b = com.google.android.agera.ao.a();
        this.e = com.google.android.agera.b.a;
        this.f = 0;
    }

    protected final void a() {
        enter this.c;
        try {
            if (this.h == 0) {
                this.h = 1;
                this.b.obtainMessage(2, this).sendToTarget();
            }
            exit this.c;
            return;
            exit this.c;
        }
        catch (Throwable ex) {
            exit this.c;
            throw ex;
        }
    }

    public final void a(com.google.android.agera.am p0) {
  2:    v2 = 0;
  8:    if (Looper.myLooper() != 0)
 10:        v0 = 1;
        else
 50:        v0 = 0;
 13:    com.google.android.agera.x.a(v0, "Can only be added on a Looper thread");
 16:    com.google.android.agera.x.a(p0);
 21:    enter this.c;
 26:    v3 = 0;
 27:    v0 = -1;
 31:    if (v3 >= this.e.length) {
 62:        if (v0 == -1) {
 66:            v0 = this.e.length;
 69:            if (v0 < 2)
 71:                v3 = 2;
                else
120:                v3 = v0 * 2;
 76:            this.e = Arrays.copyOf(this.e, v3);
            }
 80:        this.e[v0] = p0;
 86:        this.e[v0 + 1] = com.google.android.agera.ao.a();
 92:        this.f = this.f + 1;
 96:        if (this.f == 1) {
105:            if (this.b.hasMessages(1, this))
110:                this.b.removeMessages(1, this);
                else {
123:                try {
133:                    if (Looper.myLooper() == this.b.getLooper())
135:                        v2 = 1;
                        else
144:                        this.b.obtainMessage(0, this).sendToTarget();
                    }
                    catch (Throwable ex) {
 48:                    exit this.c;
 49:                    throw ex;
                    }
                }
            }
113:        exit this.c;
114:        if (v2 != 0)
116:            this.b();
119:        return;
        }
 37:    if (this.e[v3] == p0)
 46:        throw new IllegalStateException("Updatable already added, cannot add.");
 38:    goto 52;
 48:    exit this.c;
 49:    throw ex;
 52:    try {
 56:        if (this.e[v3] == 0)
 58:            v0 = v3;
 59:        v3 = v3 + 2;
        }
        catch (Throwable ex) {
 48:        exit this.c;
 49:        throw ex;
        }
 61:    goto 28;
150:    try
            run 22...49
        catch (Throwable ex) {
 22:        goto 47;
        }
    }

    protected void b() {
    }

    public final void b(com.google.android.agera.am p0) {
        v0 = 1;
        v1 = 0;
        v2 = Looper.myLooper();
        if (v2 == 0)
            v0 = 0;
        com.google.android.agera.x.a(v0, "Can only be removed on a Looper thread");
        com.google.android.agera.x.a(p0);
        v2 = this.c;
        enter v2;
        try {
            while (v1 < this.e.length) {
                if (this.e[v1] == p0) {
                    ((com.google.android.agera.ao)this.e[v1 + 1]).a(p0, this.c);
                    this.e[v1] = 0;
                    this.e[v1 + 1] = 0;
                    this.f = this.f - 1;
                    if (this.f == 0) {
                        this.b.obtainMessage(1, this).sendToTarget();
                        this.b.removeMessages(2, this);
                        this.h = 0;
                    }
                    exit v2;
                    return;
                }
                v1 = v1 + 2;
            }
            throw new IllegalStateException("Updatable not added, cannot remove.");
            exit v2;
        }
        catch (Throwable ex) {
            exit v2;
            throw ex;
        }
    }

    protected void c() {
    }

}
