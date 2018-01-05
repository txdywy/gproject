package com.google.android.finsky.scheduler;

import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.d.w;
import com.google.android.finsky.scheduler.a.a.f;
import com.google.android.finsky.scheduler.b.d;
import com.google.android.finsky.scheduler.b.g;
import com.google.android.finsky.scheduler.b.h;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;

public abstract class com.google.android.finsky.scheduler.ah
{

    public com.google.android.finsky.d.w B_;
    public final Handler o;
    public com.google.android.finsky.scheduler.m p;
    public com.google.android.finsky.scheduler.b.g q;
    public com.google.android.finsky.scheduler.bj r;
    public com.google.android.finsky.scheduler.b.h s;
    public com.google.android.finsky.scheduler.h t;
    public com.google.android.finsky.scheduler.g u;
    public boolean v;
    public com.google.android.finsky.scheduler.b.d v_;
    public boolean w;
    public boolean x;
    public boolean y;
    public long z;

    ah() {
        this.o = new Handler(Looper.getMainLooper());
    }

    private final void a() {
        if (this.y == 0) {
            if (this.s == 0)
                v0 = 2534;
            else if (this.s.c != 0)
                v0 = 2537;
            else
                v0 = 2536;
            this.b(v0, 0);
        }
    }

    final boolean a(int p0, com.google.android.finsky.scheduler.g p1) {
        v0 = 1;
        com.google.android.finsky.utils.bb.a();
        this.w = 1;
        this.o.removeCallbacksAndMessages(0);
        if (p0 == 2544)
            this.y = 1;
        this.b(p0, p1);
        this.c();
        switch (p0) {
            case 2533:
                v0 = 2;
                break;
            case 2535:
                break;
            case 2540:
                v0 = 4;
                break;
            case 2544:
                v0 = 3;
                break;
            case 2545:
                v0 = 5;
                break;
            default:
                break;
        }
        return this.k_(v0);
    }

    public abstract boolean a(com.google.android.finsky.scheduler.b.d p0);

    final void b(int p0, com.google.android.finsky.scheduler.g p1) {
        if (this.v == 0) {
            v0 = this.r.a(p0).a(this.v_).a(this.v_, this.q.a(), this.z);
            if (p1 != 0)
                v0.a(p1);
            v0.b(this.B_);
            this.v = 1;
        }
    }

    public final void b(com.google.android.finsky.scheduler.b.h p0) {
        v1 = new Object[2];
        v1[0] = Integer.valueOf(this.v_.a.b);
        v1[1] = Integer.valueOf(this.v_.a.d);
        FinskyLog.a("jobFinished: %d %d", v1);
        this.e();
        this.s = p0;
        if (this.y != 0)
            this.s = 0;
        if (this.w == 0) {
            this.a();
            this.p.c(this);
            this.w = 1;
        }
        else if (this.x == 0) {
            this.a();
            if (this.s != 0)
                this.p.d(this);
        }
        this.c();
        this.o.removeCallbacksAndMessages(0);
        this.x = 1;
    }

    void c() {
    }

    public final void d() {
        this.t.a(this.u, new com.google.android.finsky.scheduler.ai(this));
    }

    final void e() {
        this.t.a(this.u);
    }

    public abstract boolean k_(int p0);

}
