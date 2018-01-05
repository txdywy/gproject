package com.google.android.finsky.bh;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import com.google.android.finsky.as.a;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.b;
import com.google.android.gms.car.a;
import com.google.android.gms.car.j;
import com.google.android.gms.car.k;
import com.google.android.gms.common.api.o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public final class com.google.android.finsky.bh.b
{

    public final com.google.android.gms.car.k a;
    public volatile boolean b;
    public final List c;
    public final List d;
    public final Handler e;
    public volatile boolean f;
    public CountDownLatch g;
    public Context h;
    public com.google.android.finsky.as.a i;
    public com.google.android.gms.common.api.o j;
    public com.google.android.finsky.ba.c k;
    public com.google.android.gms.car.j l;

    b(Context p0, com.google.android.finsky.as.a p1, com.google.android.finsky.ba.c p2, Handler p3) {
        this.a = new com.google.android.finsky.bh.d(this);
        this.b = 0;
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.f = 0;
        this.g = new CountDownLatch(1);
        this.j = 0;
        this.h = p0;
        this.i = p1;
        this.k = p2;
        this.e = p3;
    }

    final void a() {
        (new Object[1])[0] = Boolean.valueOf(this.b);
        this.g.countDown();
        enter this.c;
        try {
            while (!this.c.isEmpty())
                ((Runnable)this.c.remove(0)).run();
            exit this.c;
        }
        catch (Throwable ex) {
            exit this.c;
            throw ex;
        }
        try {
            exit this.c;
        }
        catch (Throwable ex) {
            exit this.c;
            throw ex;
        }
        this.a(this.b);
    }

    public final synchronized void a(Runnable p0) {
        enter this;
        try {
            if (!this.c())
                p0.run();
            else {
                try {
                    if (this.g.getCount() == 0)
                        p0.run();
                    else {
                        try {
                            enter this.c;
                        }
                        catch (Throwable ex) {
                            exit this;
                            throw ex;
                        }
                        try {
                            this.c.add(p0);
                            exit this.c;
                        }
                        catch (Throwable ex) {
                            try {
                                exit this.c;
                            }
                            catch (Throwable ex) {
                                exit this.c;
                                throw ex;
                            }
                            throw ex;
                        }
                        try {
                            if (this.k.dj().a(12641200)) {
                                if (this.l == 0)
                                    this.l = new com.google.android.gms.car.j(this.h, this.a);
                            }
                            else if (this.f == 0) {
                                v0 = new IntentFilter();
                                v0.addAction("com.google.android.gms.car.CONNECTED");
                                v0.addAction("com.google.android.gms.car.DISCONNECTED");
                                this.h.registerReceiver(new com.google.android.finsky.bh.e(this), v0, "com.google.android.gms.permission.CAR", 0);
                                this.j = com.google.android.gms.car.a.a(this.h, new com.google.android.finsky.bh.f(this), new com.google.android.finsky.bh.g(this), new com.google.android.finsky.bh.h(this));
                                this.f = 1;
                                this.j.e();
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
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return;
        try {
            exit this.c;
        }
        catch (Throwable ex) {
            exit this.c;
            throw ex;
        }
        try {
            throw ex;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
    }

    final void a(boolean p0) {
        enter this.d;
        try {
            v0 = new ArrayList(this.d);
            exit this.d;
        }
        catch (Throwable ex) {
            try {
                exit this.d;
            }
            catch (Throwable ex) {
                exit this.d;
                throw ex;
            }
            throw ex;
        }
        v2 = 0;
        while (v2 < ((ArrayList)v0).size()) {
            v1 = ((ArrayList)v0).get(v2);
            v2 = v2 + 1;
            this.e.post(new com.google.android.finsky.bh.c((com.google.android.finsky.bh.i)v1, p0));
        }
    }

    public final boolean b() {
        v0 = 0;
        if (this.c()) {
            this.g.await();
            v0 = this.b;
            return v0;
        }
        return v0;
        try {
            this.g.await();
        }
        catch (InterruptedException ex) {
            FinskyLog.c("Interrupted while awaiting projection result!", new Object[0]);
            return v0;
        }
        v0 = this.b;
        return v0;
    }

    public final boolean c() {
        if (com.google.android.finsky.utils.b.d() && this.i.g == 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

}
