package com.google.android.finsky.installqueue.p141a;

import com.google.android.finsky.bh.C1627b;
import com.google.android.finsky.installer.p208b.p209a.C3312b;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.installqueue.InstallConstraint;
import com.google.android.finsky.installqueue.p141a.p211b.C3329a;
import com.google.android.finsky.p108z.C4831h;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.scheduler.C3328c;
import com.google.android.finsky.scheduler.C3338e;
import com.google.android.finsky.scheduler.aj;
import com.google.android.finsky.scheduler.p238b.C4023a;
import com.google.android.finsky.scheduler.p238b.C4024b;
import com.google.android.finsky.scheduler.p238b.C4025c;
import com.google.android.finsky.scheduler.p238b.C4026d;
import com.google.android.finsky.scheduler.p238b.C4030h;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class C3339i extends C3338e {
    public static final long f17201a = TimeUnit.DAYS.toMillis(1);
    public C3340g f17202c;
    public C3342k f17203d;
    public C1627b f17204e;
    public int f17205f;
    public InstallConstraint f17206g;
    public List f17207h = new ArrayList();

    public C3339i() {
        ((C1395f) C3947d.m18649a(C1395f.class)).mo1856a(this);
    }

    public static C4023a m16734a(InstallConstraint installConstraint, long j) {
        int i;
        C4024b c4024b = new C4024b();
        if (installConstraint.f17170c != null) {
            long a = C4678i.m21812a();
            long j2 = installConstraint.f17170c.f17173a.f17158b - a;
            a = installConstraint.f17170c.f17173a.f17159c - a;
            if (j < j2 || j >= a) {
                c4024b.m18839a(j2);
            } else {
                c4024b.m18839a(j);
            }
            c4024b.m18843b(a);
        } else {
            c4024b.m18839a(Math.min(j, f17201a));
            c4024b.m18843b(f17201a);
        }
        switch (installConstraint.f17169b.f17119c) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            default:
                i = 0;
                break;
        }
        c4024b.m18838a(i);
        c4024b.m18840a(installConstraint.f17169b.f17120d);
        return c4024b.m18837a();
    }

    protected final void mo3476a(C4025c c4025c) {
        if (c4025c == null) {
            FinskyLog.m21665c("Empty jobExtras, cannot proceed with setting up custom constraints", new Object[0]);
            return;
        }
        try {
            this.f17206g = new InstallConstraint(C3312b.m16652a(c4025c.m18855c("constraint")));
            if (this.f17206g.f17169b.f17128l) {
                C3329a c3329a = new C3329a(this.f17204e);
                this.f17195i.add(c3329a);
                this.f17207h.add(c3329a);
            }
        } catch (InvalidProtocolBufferNanoException e) {
            throw new AssertionError(e);
        }
    }

    protected final boolean mo3477b(C4026d c4026d) {
        if (!(this.f17202c instanceof C3342k)) {
            return false;
        }
        this.f17203d = (C3342k) this.f17202c;
        this.f17205f = c4026d.f20249a.f20174b;
        if (c4026d.m18860e()) {
            this.f17203d.m16770a(this);
        } else {
            C3342k c3342k = this.f17203d;
            synchronized (c3342k.f17225n) {
                c3342k.f17225n.put(Integer.valueOf(this.f17205f), this);
            }
            if (!this.f5949w) {
                this.f5944r.m18907a(2543).m18895a(this.v_).m18896a(this.v_, this.f5943q.m18873a(), this.f5952z).m18900b(this.B_);
                super.m5804d();
                if (this.v_.m18856a().f20246a.f20161i) {
                    long a = (this.v_.f20249a.f20178f + this.v_.m18856a().f20246a.f20155c) - C4678i.m21812a();
                    if (a <= 0) {
                        FinskyLog.m21659a("Stop After time is negative, not setting timeout", new Object[0]);
                    } else {
                        this.f5941o.postDelayed(new aj(this), a);
                    }
                }
                this.f5942p.m18935c(this);
                this.f5949w = true;
            }
            c3342k.m16775b().mo4403a(new C3356y(c3342k)).mo4398a(C4831h.f25111a);
        }
        return true;
    }

    protected final boolean mo3478c(C4026d c4026d) {
        this.f17205f = c4026d.f20249a.f20174b;
        m5802b(C3339i.m16735a(this.f17207h, this.f17206g));
        m16736f();
        return false;
    }

    protected final void mo1167a() {
        m5802b(C3339i.m16735a(this.f17207h, this.f17206g));
        m16736f();
    }

    protected final boolean k_(int i) {
        return m16736f();
    }

    private static C4030h m16735a(List list, InstallConstraint installConstraint) {
        long j = 0;
        for (C3328c b : list) {
            j = Math.max(j, b.mo3473b());
        }
        return new C4030h(true, C3339i.m16734a(installConstraint, j), new C4025c().m18851a("constraint", C0757i.m4909a(installConstraint.f17169b)));
    }

    private final boolean m16736f() {
        if (this.f17203d == null) {
            return false;
        }
        this.f17203d.m16770a(this);
        return true;
    }
}
