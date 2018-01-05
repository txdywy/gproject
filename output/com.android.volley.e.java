package com.android.volley;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

final synchronized class com.android.volley.e implements com.android.volley.p
{

    public final Map a;
    public final com.android.volley.c b;

    e(com.android.volley.c p0) {
        this.a = new HashMap();
        this.b = p0;
    }

    public final synchronized void a(com.android.volley.n p0) {
        enter this;
        try {
            v2 = p0.e();
            v0 = (List)this.a.remove(v2);
            if (v0 != 0) {
                if (!v0.isEmpty()) {
                    if (com.android.volley.aa.b != 0) {
                        v3 = new Object[2];
                        v3[0] = Integer.valueOf(v0.size());
                        v3[1] = v2;
                        com.android.volley.aa.a("%d waiting requests for cacheKey=%s; resend to network", v3);
                    }
                    v1 = (com.android.volley.n)v0.remove(0);
                    this.a.put(v2, v0);
                    v1.a(this);
                    try {
                        this.b.c.put(v1);
                    }
                    catch (InterruptedException ex) {
                        try {
                            v2 = new Object[1];
                            v2[0] = ex.toString();
                            com.android.volley.aa.c("Couldn't add request to queue. %s", v2);
                            Thread.currentThread().interrupt();
                            this.b.a();
                        }
                        catch (Throwable ex) {
                            exit this;
                            throw ex;
                        }
                    }
                    catch (Throwable ex) {
                        exit this;
                        throw ex;
                    }
                }
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final void a(com.android.volley.n p0, com.android.volley.v p1) {
        if (p1.b == 0 || p1.b.a())
            this.a(p0);
        else {
            v1 = p0.e();
            enter this;
            try {
                v0 = (List)this.a.remove(v1);
                exit this;
            }
            catch (Throwable ex) {
                try {
                    exit this;
                }
                catch (Throwable ex) {
                    exit this;
                    throw ex;
                }
                throw ex;
            }
            if (v0 != 0) {
                if (com.android.volley.aa.b != 0) {
                    v3 = new Object[2];
                    v3[0] = Integer.valueOf(v0.size());
                    v3[1] = v1;
                    com.android.volley.aa.a("Releasing %d waiting requests for cacheKey=%s.", v3);
                }
                v1 = v0.iterator();
                while (v1.hasNext())
                    this.b.e.a((com.android.volley.n)v1.next(), p1);
            }
        }
    }

    final synchronized boolean b(com.android.volley.n p0) {
        v0 = 0;
        enter this;
        try {
            v2 = p0.e();
            if (this.a.containsKey(v2)) {
                v0 = (List)this.a.get(v2);
                if (v0 == 0)
                    v0 = new ArrayList();
                p0.a("waiting-for-response");
                v0.add(p0);
                this.a.put(v2, v0);
                if (com.android.volley.aa.b != 0) {
                    v3 = new Object[1];
                    v3[0] = v2;
                    com.android.volley.aa.b("Request for cacheKey=%s is in flight, putting on hold.", v3);
                }
                v0 = 1;
            }
            else {
                try {
                    this.a.put(v2, 0);
                    p0.a(this);
                    if (com.android.volley.aa.b != 0) {
                        v3 = new Object[1];
                        v3[0] = v2;
                        com.android.volley.aa.b("new request, sending to network %s", v3);
                    }
                }
                catch (Throwable ex) {
                    exit this;
                    throw ex;
                }
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return v0;
    }

}
