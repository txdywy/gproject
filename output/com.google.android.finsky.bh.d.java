package com.google.android.finsky.bh;

import java.util.List;
import java.util.concurrent.CountDownLatch;

public final class com.google.android.finsky.bh.d implements com.google.android.gms.car.k
{

    public final com.google.android.finsky.bh.b a;

    d(com.google.android.finsky.bh.b p0) {
        this.a = p0;
    }

    public final void a() {
    }

    public final void a(boolean p0) {
        this.a.b = p0;
        if (this.a.g.getCount() <= 0) {
            this.a.a(p0);
            return;
        }
        (new Object[1])[0] = Boolean.valueOf(this.a.b);
        this.a.g.countDown();
        enter this.a.c;
        try {
            while (!this.a.c.isEmpty())
                ((Runnable)this.a.c.remove(0)).run();
            exit this.a.c;
        }
        catch (Throwable ex) {
            exit this.a.c;
            throw ex;
        }
        try {
            exit this.a.c;
        }
        catch (Throwable ex) {
            exit this.a.c;
            throw ex;
        }
        this.a.a(p0);
    }

}
