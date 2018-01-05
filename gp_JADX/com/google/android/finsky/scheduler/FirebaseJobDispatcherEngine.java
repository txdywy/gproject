package com.google.android.finsky.scheduler;

import android.content.Context;
import com.firebase.jobdispatcher.C0741g;
import com.firebase.jobdispatcher.C0743i;
import com.firebase.jobdispatcher.C0751z;
import com.firebase.jobdispatcher.C0752t;
import com.firebase.jobdispatcher.C0753u;
import com.firebase.jobdispatcher.aa;
import com.firebase.jobdispatcher.ai;
import com.firebase.jobdispatcher.ao;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.scheduler.p238b.C4023a;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class FirebaseJobDispatcherEngine implements C4011l {
    public static final int f20139a = C4031b.f20257b;
    public final C0741g f20140b;
    public final C2471a f20141c;
    public final bj f20142d;
    public final C4019a f20143e;

    public class FirebaseJobDispatcherService extends aa {
        public ak f20135d;
        public C2471a f20136e;
        public C2495w f20137f;
        public C4037m f20138g;

        public void onCreate() {
            super.onCreate();
            ((bl) C3947d.m18649a(bl.class)).mo1899a(this);
            this.f20137f = this.f20136e.m13184a("SchedulerFJDWakeup");
        }

        public final boolean mo3884a(C0751z c0751z) {
            this.f20138g = this.f20135d.m18808a(c0751z, this, this.f20137f.m13365a());
            return this.f20138g != null;
        }

        public final boolean mo3883a() {
            if (this.f20138g != null) {
                this.f20138g.m18928a(0);
            }
            return false;
        }
    }

    public FirebaseJobDispatcherEngine(Context context, C2471a c2471a, bj bjVar, C4019a c4019a) {
        this.f20140b = new C0741g(new C0743i(context));
        this.f20141c = c2471a;
        this.f20142d = bjVar;
        this.f20143e = c4019a;
        C0743i c0743i = new C0743i(context);
    }

    public final void mo3886a(List list, int i) {
        List<C4023a> a = new C4031b(list).m18885a();
        if (a.size() > f20139a) {
            this.f20142d.m18907a(2539).m18898a(this.f20141c.m13184a(null));
            FinskyLog.m21669e("More jobs than max expected! Max Expected: %d. Got: %d", Integer.valueOf(f20139a), Integer.valueOf(a.size()));
        }
        this.f20140b.m4843a();
        int i2 = 9000;
        for (C4023a c4023a : a) {
            C0753u b;
            C0752t j;
            FinskyLog.m21659a("Scheduling job with id: %d", Integer.valueOf(i2));
            long j2 = c4023a.f20246a.f20154b;
            long j3 = c4023a.f20246a.f20155c;
            long longValue = ((Long) C0954a.bl.m5760a()).longValue();
            if (longValue != -1 && C4678i.m21813b() + j2 < longValue + ((Long) C0955b.iW.m28964b()).longValue()) {
                j2 = ((Long) C0955b.iW.m28964b()).longValue();
                if (j2 > j3) {
                    j3 = j2;
                    b = this.f20140b.m4845b();
                    b.f4706f = 1;
                    b.f4710j = false;
                    b.f4704d = "job-" + i2;
                    b = b.m4880a(FirebaseJobDispatcherService.class);
                    b.f4705e = ao.m4829a((int) TimeUnit.MILLISECONDS.toSeconds(j3), (int) TimeUnit.MILLISECONDS.toSeconds(j2));
                    if (c4023a.f20246a.f20157e) {
                        b.m4879a(4);
                    }
                    if (c4023a.f20246a.f20158f) {
                        b.m4879a(8);
                    }
                    switch (c4023a.f20246a.f20156d) {
                        case 0:
                            break;
                        case 2:
                            b.m4879a(1);
                            break;
                        default:
                            b.m4879a(2);
                            break;
                    }
                    j = b.m4890j();
                    if (this.f20140b.m4844a(j) == 0) {
                        this.f20140b.m4843a();
                        this.f20143e.mo3886a(list, i);
                        return;
                    }
                    C0741g c0741g = this.f20140b;
                    ai aiVar = (ai) j.f4694c;
                    C0753u b2 = this.f20140b.m4845b();
                    b2.f4706f = 1;
                    b2.f4710j = false;
                    b2.f4704d = "job-" + i2 + "-deadline";
                    b2 = b2.m4880a(FirebaseJobDispatcherService.class);
                    b2.f4705e = ao.m4829a(aiVar.f4666b, aiVar.f4666b + 1);
                    c0741g.m4844a(b2.m4890j());
                    i2++;
                }
            }
            long j4 = j3;
            j3 = j2;
            j2 = j4;
            b = this.f20140b.m4845b();
            b.f4706f = 1;
            b.f4710j = false;
            b.f4704d = "job-" + i2;
            b = b.m4880a(FirebaseJobDispatcherService.class);
            b.f4705e = ao.m4829a((int) TimeUnit.MILLISECONDS.toSeconds(j3), (int) TimeUnit.MILLISECONDS.toSeconds(j2));
            if (c4023a.f20246a.f20157e) {
                b.m4879a(4);
            }
            if (c4023a.f20246a.f20158f) {
                b.m4879a(8);
            }
            switch (c4023a.f20246a.f20156d) {
                case 0:
                    break;
                case 2:
                    b.m4879a(1);
                    break;
                default:
                    b.m4879a(2);
                    break;
            }
            j = b.m4890j();
            if (this.f20140b.m4844a(j) == 0) {
                C0741g c0741g2 = this.f20140b;
                ai aiVar2 = (ai) j.f4694c;
                C0753u b22 = this.f20140b.m4845b();
                b22.f4706f = 1;
                b22.f4710j = false;
                b22.f4704d = "job-" + i2 + "-deadline";
                b22 = b22.m4880a(FirebaseJobDispatcherService.class);
                b22.f4705e = ao.m4829a(aiVar2.f4666b, aiVar2.f4666b + 1);
                c0741g2.m4844a(b22.m4890j());
                i2++;
            } else {
                this.f20140b.m4843a();
                this.f20143e.mo3886a(list, i);
                return;
            }
        }
    }

    public final void mo3885a() {
        this.f20143e.mo3885a();
    }
}
