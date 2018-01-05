package com.android.volley;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

protected final class com.android.volley.ab
{

    public static final boolean a;
    public final List b;
    public boolean c;

    static {
        com.android.volley.ab.a = com.android.volley.aa.b;
    }

    ab() {
        this.b = new ArrayList();
        this.c = 0;
    }

    public final synchronized void a(String p0) {
        enter this;
        try {
            this.c = 1;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        if (this.b.size() == 0)
            v2 = 0;
        else {
            try {
                v2 = ((com.android.volley.ac)this.b.get(this.b.size() - 1)).c - ((com.android.volley.ac)this.b.get(0)).c;
            }
            catch (Throwable ex) {
                exit this;
                throw ex;
            }
        }
        if (v2 > 0) {
            v5 = new Object[2];
            v5[0] = Long.valueOf(v2);
            v5[1] = p0;
            com.android.volley.aa.b("(%-4d ms) %s", v5);
            v6 = this.b.iterator();
            v2 = ((com.android.volley.ac)this.b.get(0)).c;
            while (v6.hasNext()) {
                v0 = (com.android.volley.ac)v6.next();
                v7 = new Object[3];
                v7[0] = Long.valueOf(v0.c - v2);
                v7[1] = Long.valueOf(v0.b);
                v7[2] = v0.a;
                com.android.volley.aa.b("(+%-4d) [%2d] %s", v7);
                v2 = v0.c;
            }
        }
        exit this;
    }

    public final synchronized void a(String p0, long p1) {
        enter this;
        try {
            if (this.c == 0) {
                try {
                    this.b.add(new com.android.volley.ac(p0, p1, SystemClock.elapsedRealtime()));
                }
                catch (Throwable ex) {
                    exit this;
                    throw ex;
                }
                exit this;
                return;
            }
            throw new IllegalStateException("Marker added to finished log");
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
    }

    protected final void finalize() {
        if (this.c == 0) {
            this.a("Request on the loose");
            com.android.volley.aa.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

}
