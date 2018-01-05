package com.google.android.finsky.scheduler;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import com.firebase.jobdispatcher.C0751z;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ak.C1215q;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.p108z.C4817d;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.recoverymode.C3982a;
import com.google.android.finsky.scheduler.FirebaseJobDispatcherEngine.FirebaseJobDispatcherService;
import com.google.android.finsky.scheduler.JobSchedulerEngine.PhoneskyJobSchedulerJobService;
import com.google.android.finsky.scheduler.p238b.C4026d;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.C5095d;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class ak {
    public C4037m f20200a;
    public final C1461c f20201b;
    public final aa f20202c;
    public final C4011l f20203d;
    public final C4817d f20204e;
    public final C4036k f20205f;
    public final C2471a f20206g;
    public final C4042t f20207h;
    public final C4034h f20208i;
    public final bj f20209j;
    public final C3982a f20210k;
    public C4809e f20211l = this.f20204e.mo4401a(Boolean.valueOf(true));

    public ak(Context context, C1461c c1461c, C4019a c4019a, C4817d c4817d, C4036k c4036k, C4042t c4042t, C4034h c4034h, C2471a c2471a, bj bjVar, aa aaVar, C3982a c3982a) {
        this.f20201b = c1461c;
        this.f20204e = c4817d;
        this.f20205f = c4036k;
        this.f20207h = c4042t;
        this.f20208i = c4034h;
        this.f20206g = c2471a;
        this.f20209j = bjVar;
        this.f20210k = c3982a;
        this.f20202c = aaVar;
        if (m18803b()) {
            this.f20203d = new JobSchedulerEngine(context, c2471a, bjVar);
        } else if (m18815a(12642144) && C5095d.m23655a(context) == 0) {
            this.f20203d = new FirebaseJobDispatcherEngine(context, c2471a, bjVar, c4019a);
        } else {
            this.f20203d = c4019a;
        }
        if (m18804c()) {
            m18805d();
        }
    }

    private static boolean m18803b() {
        return VERSION.SDK_INT >= Math.max(21, ((Integer) C0955b.iY.m28964b()).intValue());
    }

    final boolean m18815a(long j) {
        return this.f20201b.dj().mo2294a(j);
    }

    private final boolean m18804c() {
        return !m18815a(12634957);
    }

    final boolean m18814a(int i, int i2) {
        if (this.f20200a == null || this.f20200a.m18927a(i, i2) == null) {
            return false;
        }
        return true;
    }

    public final synchronized void m18811a() {
        if (!this.f20210k.mo3875b()) {
            if (m18804c()) {
                C0954a.bl.m5765c();
                C0954a.bm.m5765c();
                this.f20205f.m18924a();
                this.f20211l.mo4398a(new al(this));
            }
        }
    }

    private final synchronized void m18805d() {
        if (!this.f20210k.mo3875b()) {
            aa aaVar = this.f20202c;
            this.f20211l = aaVar.f20194a.mo1519a(new C1215q()).mo4396a(new af(aaVar));
        }
    }

    final synchronized C4809e m18810a(C4026d c4026d) {
        C4809e a;
        if (this.f20210k.mo3875b()) {
            a = this.f20204e.mo4401a(Long.valueOf(-3));
        } else if (!m18804c()) {
            a = this.f20204e.mo4401a(Long.valueOf(-2));
        } else if (m18814a(c4026d.f20249a.f20176d, c4026d.f20249a.f20174b)) {
            a = this.f20204e.mo4402a(new IllegalStateException("Cannot call schedule while running"));
        } else {
            a = this.f20211l.mo4396a(new am(this, c4026d));
        }
        return a;
    }

    public final synchronized C4809e m18809a(int i) {
        C4809e a;
        if (this.f20210k.mo3875b()) {
            a = this.f20204e.mo4401a(Collections.emptyList());
        } else {
            a = this.f20211l.mo4396a(new an(this, i));
        }
        return a;
    }

    final void m18812a(int i, C4026d c4026d) {
        this.f20209j.m18907a(i).m18895a(c4026d).m18900b(this.f20206g.m13184a(null));
    }

    public final synchronized C4809e m18816b(int i) {
        C4809e a;
        if (this.f20210k.mo3875b()) {
            a = this.f20204e.mo4402a(null);
        } else {
            a = this.f20211l.mo4396a(new ao(this, i));
        }
        return a;
    }

    final synchronized C4809e m18817b(int i, int i2) {
        C4809e a;
        if (this.f20210k.mo3875b()) {
            a = this.f20204e.mo4401a(Boolean.valueOf(false));
        } else if (!m18804c()) {
            a = this.f20204e.mo4401a(Boolean.valueOf(false));
        } else if (m18814a(i, i2)) {
            C4037m c4037m = this.f20200a;
            ah a2 = c4037m.m18927a(i, i2);
            if (a2 == null) {
                a = c4037m.f20316n.mo4401a(Boolean.valueOf(false));
            } else {
                c4037m.f20314l.remove(a2);
                c4037m.f20305c.removeMessages(8, a2);
                c4037m.m18934b(a2);
                a2.m5799a(2544, c4037m.f20317o);
                a = c4037m.f20304b.mo1526c(a2.v_);
                c4037m.f20305c.m18940a(7);
            }
        } else {
            a = this.f20211l.mo4396a(new ap(this, i, i2));
        }
        return a;
    }

    final void m18818c(int i) {
        this.f20211l.mo4396a(new at(this)).mo4398a(new aq(this, i));
    }

    static void m18802a(List list) {
        FinskyLog.m21662b("Jobs in database: ", new Object[0]);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FinskyLog.m21662b("Job: %s", (C4026d) it.next());
        }
    }

    private static long m18806e() {
        long longValue = ((Long) C0954a.bl.m5760a()).longValue();
        C0954a.bl.m5763a(Long.valueOf(C4678i.m21813b()));
        if (longValue == -1) {
            return -1;
        }
        return C4678i.m21813b() - longValue;
    }

    final synchronized void m18813a(Intent intent, AlarmEngineService alarmEngineService, C2495w c2495w) {
        if (this.f20210k.mo3875b()) {
            alarmEngineService.stopSelf();
        } else {
            int intExtra;
            FinskyLog.m21659a("onAlarmManagerWakeup", new Object[0]);
            long e = m18806e();
            this.f20205f.m18924a();
            if (intent != null) {
                intExtra = intent.getIntExtra("phoneskyscheduler-alarm-period", -1);
            } else {
                intExtra = 0;
            }
            this.f20209j.m18907a(2520).m18893a(1, intExtra).m18900b(c2495w);
            if (this.f20200a != null) {
                FinskyLog.m21665c("onAlarmManagerWakeup while already running", new Object[0]);
                this.f20209j.m18907a(2541).m18894a(intExtra, e, -1, -1, -1).m18900b(c2495w);
                this.f20209j.m18907a(2521).m18893a(1, intExtra).m18900b(c2495w);
                if (m18803b()) {
                    alarmEngineService.stopSelf();
                }
            } else {
                this.f20200a = new C4037m(c2495w, intExtra, e, this.f20202c.f20194a, new au(this, intExtra, c2495w, alarmEngineService), this.f20207h, this.f20208i, this.f20209j, new av(this, intExtra), this.f20204e);
                this.f20200a.m18928a(((Long) C0955b.iM.m28964b()).longValue());
            }
        }
    }

    final synchronized C4037m m18807a(JobParameters jobParameters, PhoneskyJobSchedulerJobService phoneskyJobSchedulerJobService, C2495w c2495w) {
        C4037m c4037m;
        if (this.f20210k.mo3875b()) {
            c4037m = null;
        } else {
            FinskyLog.m21659a("onJobSchedulerWakeup", new Object[0]);
            long e = m18806e();
            this.f20205f.m18924a();
            this.f20209j.m18907a(2520).m18893a(3, 4).m18900b(c2495w);
            if (this.f20200a != null) {
                FinskyLog.m21665c("onJobSchedulerWakeup while already running", new Object[0]);
                this.f20209j.m18907a(2541).m18894a(4, e, -1, -1, -1).m18900b(c2495w);
                this.f20209j.m18907a(2521).m18893a(3, 4).m18900b(c2495w);
                c4037m = null;
            } else {
                this.f20200a = new C4037m(c2495w, 4, e, this.f20202c.f20194a, new aw(this, c2495w, jobParameters, phoneskyJobSchedulerJobService), this.f20207h, this.f20208i, this.f20209j, new ax(this, jobParameters), this.f20204e);
                c4037m = this.f20200a;
            }
        }
        return c4037m;
    }

    final synchronized C4037m m18808a(C0751z c0751z, FirebaseJobDispatcherService firebaseJobDispatcherService, C2495w c2495w) {
        C4037m c4037m;
        if (this.f20210k.mo3875b()) {
            c4037m = null;
        } else {
            FinskyLog.m21659a("onFirebaseJobDispatcherWakeup", new Object[0]);
            long e = m18806e();
            this.f20205f.m18924a();
            this.f20209j.m18907a(2520).m18893a(2, 5).m18900b(c2495w);
            if (this.f20200a != null) {
                FinskyLog.m21665c("onJobSchedulerWakeup while already running", new Object[0]);
                this.f20209j.m18907a(2541).m18894a(5, e, -1, -1, -1).m18900b(c2495w);
                this.f20209j.m18907a(2521).m18893a(2, 5).m18900b(c2495w);
                c4037m = null;
            } else {
                this.f20200a = new C4037m(c2495w, 5, e, this.f20202c.f20194a, new ay(this, c2495w, firebaseJobDispatcherService, c0751z), this.f20207h, this.f20208i, this.f20209j, new az(this), this.f20204e);
                this.f20200a.m18928a(((Long) C0955b.iM.m28964b()).longValue());
                c4037m = this.f20200a;
            }
        }
        return c4037m;
    }
}
