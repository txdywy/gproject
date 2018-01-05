package com.google.android.finsky.scheduler;

import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.scheduler.p238b.C4026d;
import com.google.android.finsky.scheduler.p238b.C4029g;
import com.google.android.finsky.scheduler.p238b.C4030h;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;

public abstract class ah {
    public C2495w B_;
    public final Handler f5941o = new Handler(Looper.getMainLooper());
    public C4037m f5942p;
    public C4029g f5943q;
    public bj f5944r;
    public C4030h f5945s;
    public C4034h f5946t;
    public C4033g f5947u;
    public boolean f5948v;
    public C4026d v_;
    public boolean f5949w;
    public boolean f5950x;
    public boolean f5951y;
    public long f5952z;

    public abstract boolean mo1168a(C4026d c4026d);

    public abstract boolean k_(int i);

    public final void m5802b(C4030h c4030h) {
        FinskyLog.m21659a("jobFinished: %d %d", Integer.valueOf(this.v_.f20249a.f20174b), Integer.valueOf(this.v_.f20249a.f20176d));
        m5805e();
        this.f5945s = c4030h;
        if (this.f5951y) {
            this.f5945s = null;
        }
        if (!this.f5949w) {
            mo1167a();
            this.f5942p.m18935c(this);
            this.f5949w = true;
        } else if (!this.f5950x) {
            mo1167a();
            if (this.f5945s != null) {
                this.f5942p.m18936d(this);
            }
        }
        mo3475c();
        this.f5941o.removeCallbacksAndMessages(null);
        this.f5950x = true;
    }

    final boolean m5799a(int i, C4033g c4033g) {
        int i2 = 1;
        bb.m21791a();
        this.f5949w = true;
        this.f5941o.removeCallbacksAndMessages(null);
        if (i == 2544) {
            this.f5951y = true;
        }
        m5801b(i, c4033g);
        mo3475c();
        switch (i) {
            case 2533:
                i2 = 2;
                break;
            case 2540:
                i2 = 4;
                break;
            case 2544:
                i2 = 3;
                break;
            case 2545:
                i2 = 5;
                break;
        }
        return k_(i2);
    }

    void mo3475c() {
    }

    private final void mo1167a() {
        if (!this.f5951y) {
            int i;
            if (this.f5945s == null) {
                i = 2534;
            } else if (this.f5945s.f20255c) {
                i = 2537;
            } else {
                i = 2536;
            }
            m5801b(i, null);
        }
    }

    final void m5801b(int i, C4033g c4033g) {
        if (!this.f5948v) {
            bc a = this.f5944r.m18907a(i).m18895a(this.v_).m18896a(this.v_, this.f5943q.m18873a(), this.f5952z);
            if (c4033g != null) {
                a.m18897a(c4033g);
            }
            a.m18900b(this.B_);
            this.f5948v = true;
        }
    }

    public final void m5804d() {
        this.f5946t.m18922a(this.f5947u, new ai(this));
    }

    final void m5805e() {
        this.f5946t.m18921a(this.f5947u);
    }
}
