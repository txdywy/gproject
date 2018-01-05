package com.google.android.finsky.scheduler;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.finsky.ak.C1202e;
import com.google.android.finsky.ak.C1215q;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.scheduler.p238b.C4026d;
import com.google.android.finsky.scheduler.p238b.C4028f;
import com.google.android.finsky.scheduler.p238b.C4029g;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.bh;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

final class C4040r extends Handler {
    public boolean f20325a;
    public boolean f20326b;
    public final /* synthetic */ C4037m f20327c;

    C4040r(C4037m c4037m) {
        this.f20327c = c4037m;
        super(Looper.getMainLooper());
    }

    public final void handleMessage(Message message) {
        if (this.f20325a) {
            FinskyLog.m21665c("Finished but received message: %d. Dropping", Integer.valueOf(message.what));
            return;
        }
        int c;
        FinskyLog.m21662b("HandleMessage: %d", Integer.valueOf(message.what));
        C4037m c4037m;
        ah ahVar;
        switch (message.what) {
            case 1:
                m18940a(2);
                m18940a(4);
                this.f20327c.f20317o = this.f20327c.f20312j.m18945a();
                this.f20327c.f20315m.m18907a(2524).m18897a(this.f20327c.f20317o).m18900b(this.f20327c.f20308f);
                FinskyLog.m21659a("DeviceState: %s", this.f20327c.f20317o);
                return;
            case 2:
                this.f20327c.f20313k.m18922a(this.f20327c.f20317o, new C4041s(this));
                return;
            case 3:
                C4033g c4033g = (C4033g) message.obj;
                FinskyLog.m21659a("State changed. \n\tOld State: %s\n\tNew State: %s", this.f20327c.f20317o, c4033g);
                this.f20327c.f20317o = c4033g;
                this.f20327c.f20315m.m18907a(2525).m18897a(c4033g).m18900b(this.f20327c.f20308f);
                c4037m = this.f20327c;
                Iterator it = c4037m.f20314l.iterator();
                while (it.hasNext()) {
                    ah ahVar2 = (ah) it.next();
                    if (!C4042t.m18943a(c4033g, ahVar2.v_)) {
                        FinskyLog.m21659a("Job %d (%d) failed constraint test, stopping", Integer.valueOf(ahVar2.v_.f20249a.f20174b), Integer.valueOf(ahVar2.v_.f20249a.f20176d));
                        c4037m.m18930a(ahVar2, false, 2535);
                        it.remove();
                    }
                }
                m18940a(2);
                m18940a(4);
                return;
            case 4:
                C4042t c4042t = this.f20327c.f20312j;
                C2495w c2495w = this.f20327c.f20308f;
                C1202e c1202e = this.f20327c.f20304b;
                c1202e.mo1519a(new C1215q()).mo4397a(new C4044v(c4042t, c1202e, c2495w, this.f20327c.f20317o)).mo4398a(new C4043u(obtainMessage(5)));
                return;
            case 5:
                this.f20327c.f20318p = (C4046x) message.obj;
                C4037m c4037m2 = this.f20327c;
                c4037m2.f20315m.m18907a(2541).m18894a(c4037m2.f20309g, c4037m2.f20310h, c4037m2.f20318p.f20340a.size(), c4037m2.f20318p.f20341b.size(), c4037m2.f20318p.f20342c).m18900b(c4037m2.f20308f);
                m18940a(6);
                return;
            case 6:
                c4037m = this.f20327c;
                if (!c4037m.f20319q) {
                    C4029g a = new C4029g().m18874a(C4678i.m21812a()).m18875a(false);
                    for (C4026d c4026d : c4037m.f20318p.f20341b) {
                        boolean z;
                        C4028f c4028f;
                        c = c4026d.m18858c();
                        if (c == 0) {
                            z = true;
                        } else {
                            c4028f = c4026d.m18857b()[c - 1];
                            if (c4028f.f20251a.f20186c < c4026d.f20249a.f20178f) {
                                z = true;
                            } else {
                                z = c4028f.f20251a.f20187d;
                            }
                        }
                        if (z) {
                            c4037m.f20315m.m18907a(2530).m18897a(c4037m.f20317o).m18895a(c4026d).m18900b(c4037m.f20308f);
                        }
                        c = c4026d.m18858c();
                        if (c == 0) {
                            z = true;
                        } else {
                            c4028f = c4026d.m18857b()[c - 1];
                            if (c4028f.f20251a.f20186c < c4026d.f20249a.f20178f) {
                                z = true;
                            } else if (c4028f.f20251a.f20187d) {
                                z = true;
                            } else if (c4028f.f20251a.f20186c + TimeUnit.HOURS.toMillis(1) < C4678i.m21812a()) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            c4037m.f20304b.mo1524b(c4026d.m18861f().m18868a(a.m18873a()).m18863a());
                        }
                    }
                    c4037m.f20318p.f20341b.clear();
                    c4037m.f20319q = true;
                }
                m18940a(7);
                return;
            case 7:
                if (!this.f20327c.m18932a()) {
                    m18940a(10);
                    return;
                }
                return;
            case 8:
                ahVar = (ah) message.obj;
                if (this.f20327c.f20314l.contains(ahVar)) {
                    this.f20327c.f20314l.remove(ahVar);
                    this.f20327c.m18937e(ahVar);
                }
                m18940a(7);
                return;
            case 9:
                this.f20327c.m18929a((ah) message.obj);
                m18940a(7);
                return;
            case 10:
                break;
            case 11:
                this.f20327c.f20315m.m18907a(2526).m18900b(this.f20327c.f20308f);
                this.f20326b = true;
                C4037m c4037m3 = this.f20327c;
                FinskyLog.m21659a("Executor halting due to timeout", new Object[0]);
                for (ah ahVar3 : c4037m3.f20314l) {
                    c4037m3.m18930a(ahVar3, true, 2533);
                }
                c4037m3.f20314l.clear();
                break;
            case 12:
                m18940a(4);
                return;
            default:
                FinskyLog.m21669e("Unknown message received in JobExecutorHandler %d", Integer.valueOf(message.what));
                return;
        }
        this.f20325a = true;
        FinskyLog.m21659a("Executor finished", new Object[0]);
        bc a2 = this.f20327c.f20315m.m18907a(2542);
        c = this.f20327c.f20309g;
        long b = C4678i.m21813b() - this.f20327c.f20311i;
        boolean z2 = this.f20326b;
        a2.f20270g = new bh();
        bh bhVar = a2.f20270g;
        bhVar.e = c;
        bhVar.b |= 4;
        bh bhVar2 = a2.f20270g;
        bhVar2.b |= 2;
        bhVar2.d = z2;
        bhVar2 = a2.f20270g;
        bhVar2.b |= 1;
        bhVar2.c = b;
        a2.m18900b(this.f20327c.f20308f);
        this.f20327c.f20315m.m18907a(2527).m18900b(this.f20327c.f20308f);
        this.f20327c.f20313k.m18921a(this.f20327c.f20317o);
        removeCallbacksAndMessages(null);
        this.f20327c.f20306d.mo3888a();
    }

    final void m18940a(int i) {
        obtainMessage(i).sendToTarget();
    }

    final void m18941a(int i, Object obj) {
        Message obtainMessage = obtainMessage(i);
        obtainMessage.obj = obj;
        obtainMessage.sendToTarget();
    }
}
