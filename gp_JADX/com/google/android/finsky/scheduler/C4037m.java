package com.google.android.finsky.scheduler;

import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ak.C1202e;
import com.google.android.finsky.p108z.C4817d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.scheduler.p238b.C4026d;
import com.google.android.finsky.scheduler.p238b.C4027e;
import com.google.android.finsky.scheduler.p238b.C4029g;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class C4037m {
    public static final int f20303a = ((Integer) C0955b.iN.m28964b()).intValue();
    public final C1202e f20304b;
    public final C4040r f20305c;
    public final C4021p f20306d;
    public final C4022q f20307e;
    public final C2495w f20308f;
    public final int f20309g;
    public final long f20310h;
    public final long f20311i = C4678i.m21813b();
    public final C4042t f20312j;
    public final C4034h f20313k;
    public final List f20314l;
    public final bj f20315m;
    public final C4817d f20316n;
    public C4033g f20317o;
    public C4046x f20318p;
    public boolean f20319q;
    public int f20320r;

    C4037m(C2495w c2495w, int i, long j, C1202e c1202e, C4021p c4021p, C4042t c4042t, C4034h c4034h, bj bjVar, C4022q c4022q, C4817d c4817d) {
        this.f20304b = c1202e;
        this.f20308f = c2495w;
        this.f20309g = i;
        this.f20310h = j;
        this.f20312j = c4042t;
        this.f20313k = c4034h;
        this.f20315m = bjVar;
        this.f20316n = c4817d;
        this.f20305c = new C4040r(this);
        this.f20314l = new ArrayList();
        this.f20306d = c4021p;
        this.f20307e = c4022q;
        this.f20305c.obtainMessage(1).sendToTarget();
    }

    final boolean m18932a() {
        boolean z;
        Exception e;
        for (C4026d a : this.f20318p.f20340a) {
            if (a.m18856a().f20246a.f20159g == 1) {
                z = true;
                break;
            }
        }
        z = false;
        if (z) {
            m18926c();
        }
        if (this.f20314l.size() == f20303a) {
            FinskyLog.m21659a("Running maximum number of jobs: %d", Integer.valueOf(f20303a));
            return true;
        }
        int i = 0;
        while (this.f20314l.size() < f20303a && i < this.f20318p.f20340a.size()) {
            ah ahVar;
            C4026d c4026d = (C4026d) this.f20318p.f20340a.remove(i);
            if (c4026d.m18856a().f20246a.f20159g == 1) {
                this.f20320r++;
            }
            if (this.f20320r > 0) {
                m18926c();
                if (c4026d.m18856a().f20246a.f20159g != 1) {
                    this.f20318p.f20340a.add(i, c4026d);
                    i++;
                }
            }
            long a2 = aa.m18792a(c4026d);
            for (ah ahVar2 : this.f20314l) {
                if (aa.m18792a(ahVar2.v_) == a2) {
                    z = true;
                    break;
                }
            }
            z = false;
            if (!z) {
                C4029g a3 = new C4029g().m18874a(C4678i.m21812a()).m18875a(true);
                Object a4 = c4026d.m18861f().m18870a(true).m18863a();
                this.f20304b.mo1524b(a4);
                try {
                    int i2;
                    ahVar2 = (ah) Class.forName(a4.f20249a.f20177e).getConstructor(new Class[0]).newInstance(new Object[0]);
                    C2495w a5 = this.f20308f.m13365a();
                    bj bjVar = this.f20315m;
                    C4034h c4034h = this.f20313k;
                    C4033g c4033g = new C4033g(this.f20317o);
                    ahVar2.f5942p = this;
                    ahVar2.v_ = a4;
                    ahVar2.f5943q = a3;
                    ahVar2.B_ = a5;
                    ahVar2.f5944r = bjVar;
                    ahVar2.f5946t = c4034h;
                    ahVar2.f5947u = c4033g;
                    FinskyLog.m21659a("Running job: %d (%d)", Integer.valueOf(a4.f20249a.f20174b), Integer.valueOf(a4.f20249a.f20176d));
                    bb.m21791a();
                    ahVar2.f5952z = C4678i.m21813b();
                    if (ahVar2.v_.m18860e()) {
                        i2 = 2532;
                    } else {
                        i2 = 2531;
                    }
                    ahVar2.f5944r.m18907a(i2).m18895a(ahVar2.v_).m18900b(ahVar2.B_);
                    boolean a6 = ahVar2.mo1168a(a4);
                    if (!a6) {
                        ahVar2.m5801b(2534, null);
                        if (!ahVar2.f5949w) {
                            ahVar2.mo3475c();
                        }
                    }
                    this.f20314l.add(ahVar2);
                    if (a6) {
                        FinskyLog.m21662b("Job (%d, %d, %s) has more work", Integer.valueOf(a4.f20249a.f20174b), Integer.valueOf(a4.f20249a.f20176d), a4.f20249a.f20175c);
                        if (ahVar2.v_.m18856a().f20246a.f20161i) {
                            long a7 = (ahVar2.v_.f20249a.f20178f + ahVar2.v_.m18856a().f20246a.f20155c) - C4678i.m21812a();
                            if (a7 > 0) {
                                C4040r c4040r = this.f20305c;
                                c4040r.sendMessageDelayed(c4040r.obtainMessage(8, ahVar2), a7);
                            } else {
                                FinskyLog.m21665c("Stop After time is negative, not setting timeout", new Object[0]);
                            }
                        }
                    } else {
                        m18929a(ahVar2);
                    }
                } catch (ClassNotFoundException e2) {
                    e = e2;
                    this.f20304b.mo1526c(a4).mo4398a(new C4038n(e, a4.f20249a.f20174b, a4.f20249a.f20176d));
                } catch (InstantiationException e3) {
                    e = e3;
                    this.f20304b.mo1526c(a4).mo4398a(new C4038n(e, a4.f20249a.f20174b, a4.f20249a.f20176d));
                } catch (IllegalAccessException e4) {
                    e = e4;
                    this.f20304b.mo1526c(a4).mo4398a(new C4038n(e, a4.f20249a.f20174b, a4.f20249a.f20176d));
                } catch (NoSuchMethodException e5) {
                    e = e5;
                    this.f20304b.mo1526c(a4).mo4398a(new C4038n(e, a4.f20249a.f20174b, a4.f20249a.f20176d));
                } catch (InvocationTargetException e6) {
                    e = e6;
                    this.f20304b.mo1526c(a4).mo4398a(new C4038n(e, a4.f20249a.f20174b, a4.f20249a.f20176d));
                } catch (ClassCastException e7) {
                    e = e7;
                    this.f20304b.mo1526c(a4).mo4398a(new C4038n(e, a4.f20249a.f20174b, a4.f20249a.f20176d));
                }
            }
        }
        FinskyLog.m21659a("RunningQueue size: %d", Integer.valueOf(this.f20314l.size()));
        FinskyLog.m21659a("PendingQueue size: %d", Integer.valueOf(this.f20318p.f20340a.size()));
        if (this.f20314l.isEmpty()) {
            return false;
        }
        return true;
    }

    private final void m18926c() {
        Iterator it = this.f20314l.iterator();
        while (it.hasNext()) {
            ah ahVar = (ah) it.next();
            if (ahVar.v_.m18856a().f20246a.f20159g != 1) {
                m18930a(ahVar, false, 2540);
                it.remove();
            }
        }
    }

    final void m18929a(ah ahVar) {
        FinskyLog.m21659a("Job %d (%d) finished", Integer.valueOf(ahVar.v_.f20249a.f20174b), Integer.valueOf(ahVar.v_.f20249a.f20176d));
        FinskyLog.m21662b("\tJob Tag: ", ahVar.v_.f20249a.f20175c);
        this.f20305c.removeMessages(8, ahVar);
        if (this.f20314l.remove(ahVar)) {
            m18934b(ahVar);
        }
        if (ahVar.f5945s == null) {
            this.f20304b.mo1526c(ahVar.v_);
        } else {
            m18936d(ahVar);
        }
    }

    final void m18934b(ah ahVar) {
        if (ahVar.v_.m18856a().f20246a.f20159g == 1) {
            this.f20320r--;
        }
    }

    final void m18930a(ah ahVar, boolean z, int i) {
        FinskyLog.m21662b("Job (%d %d %s) being stopped with eventType: %d", Integer.valueOf(ahVar.v_.f20249a.f20174b), Integer.valueOf(ahVar.v_.f20249a.f20176d), ahVar.v_.f20249a.f20175c, Integer.valueOf(i));
        this.f20305c.removeMessages(8, ahVar);
        m18934b(ahVar);
        m18931a(ahVar, z, ahVar.m5799a(i, this.f20317o));
    }

    public final void m18935c(ah ahVar) {
        this.f20305c.m18941a(9, ahVar);
    }

    final void m18936d(ah ahVar) {
        C4027e a;
        if (ahVar.f5945s.f20255c) {
            ahVar.f5943q.m18877b(C4678i.m21813b() - ahVar.f5952z);
            a = ahVar.v_.m18861f().m18868a(ahVar.f5943q.m18873a());
        } else {
            a = new C4027e().m18864a(ahVar.v_.f20249a.f20174b).m18869a(ahVar.v_.f20249a.f20175c).m18871b(ahVar.v_.f20249a.f20176d).m18872b(ahVar.v_.f20249a.f20177e);
        }
        a.m18866a(ahVar.f5945s.f20253a).m18867a(ahVar.f5945s.f20254b).m18870a(false).m18865a(C4678i.m21812a());
        this.f20304b.mo1524b(a.m18863a());
        this.f20307e.mo3889a();
    }

    final void m18928a(long j) {
        FinskyLog.m21659a("Will halt after %d", Long.valueOf(j));
        C4040r c4040r = this.f20305c;
        c4040r.sendMessageDelayed(c4040r.obtainMessage(11), j);
    }

    final void m18931a(ah ahVar, boolean z, boolean z2) {
        if (z2) {
            C4029g c4029g = ahVar.f5943q;
            c4029g.m18878b(z);
            c4029g.m18877b(C4678i.m21813b() - ahVar.f5952z);
            this.f20304b.mo1524b(ahVar.v_.m18861f().m18868a(c4029g.m18873a()).m18870a(false).m18863a()).mo4398a(new C4039o(this));
            return;
        }
        this.f20304b.mo1526c(ahVar.v_);
    }

    final void m18937e(ah ahVar) {
        this.f20304b.mo1526c(ahVar.v_);
        ahVar.m5799a(2545, this.f20317o);
    }

    final void m18933b() {
        C4040r c4040r = this.f20305c;
        c4040r.removeMessages(12);
        c4040r.sendMessageDelayed(c4040r.obtainMessage(12), ((Long) C0955b.iT.m28964b()).longValue());
    }

    final ah m18927a(int i, int i2) {
        long a = aa.m18791a(i, i2);
        for (ah ahVar : this.f20314l) {
            if (a == aa.m18792a(ahVar.v_)) {
                return ahVar;
            }
        }
        return null;
    }
}
