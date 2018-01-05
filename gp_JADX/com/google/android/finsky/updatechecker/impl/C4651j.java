package com.google.android.finsky.updatechecker.impl;

import android.annotation.TargetApi;
import android.app.job.JobScheduler;
import android.content.Context;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ar.C1502a;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.bh.C1627b;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.ce.C2266a;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p167r.C3960a;
import com.google.android.finsky.scheduler.ba;
import com.google.android.finsky.scheduler.bb;
import com.google.android.finsky.scheduler.p238b.C4024b;
import com.google.android.finsky.scheduler.p238b.C4025c;
import com.google.android.finsky.scheduler.p238b.C4030h;
import com.google.android.finsky.updatechecker.C4638a;
import com.google.android.finsky.updatechecker.C4640d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.aa;
import java.util.concurrent.TimeUnit;

@TargetApi(21)
public final class C4651j implements C4638a {
    public final Context f23959a;
    public final C1627b f23960b;
    public final C1552e f23961c;
    public final ba f23962d;
    public final C4661t f23963e;
    public final C3960a f23964f;

    protected C4651j(Context context, C2266a c2266a, C2206c c2206c, C3646a c3646a, C1627b c1627b, C4640d c4640d, C1552e c1552e, bb bbVar, C1502a c1502a, C3960a c3960a) {
        this.f23959a = context;
        this.f23964f = c3960a;
        this.f23960b = c1627b;
        this.f23963e = new C4661t(context, c2266a, c2206c, c3646a, c1627b, c4640d, c1502a, this.f23964f);
        this.f23961c = c1552e;
        this.f23962d = bbVar.m18890a(4);
    }

    public final boolean mo4312a() {
        return false;
    }

    public final void mo4311a(C2495w c2495w) {
        int i;
        ((JobScheduler) this.f23959a.getSystemService("jobscheduler")).cancel(821848294);
        this.f23962d.m18887a(821848295).mo4398a(C4653l.f23966a);
        C4024b c4024b = new C4024b();
        if (this.f23960b.m9312b()) {
            i = 2;
        } else {
            i = 1;
        }
        C4025c c4025c = new C4025c();
        if ((i & 2) != 0) {
            c4024b.m18839a(((Long) C0955b.dq.m28964b()).longValue()).m18838a(1).m18843b(((Long) C0955b.dr.m28964b()).longValue());
            c4025c.m18853b("Finsky.AutoUpdateRequiredNetworkType", 1);
            C4661t c4661t = this.f23963e;
            aa aaVar = new aa();
            aaVar.a |= 32768;
            aaVar.q = true;
            aaVar.b(c4661t.m21649a());
            aaVar.c(c4661t.m21650b());
            aaVar.a(true);
            c2495w.m13367a(new C2474c(131).m13214a(aaVar).m13244b("wifi_checker").m13217a(c4661t.f23996g.m8828a()));
        } else {
            int i2;
            Object obj;
            int b;
            int i3;
            boolean z;
            boolean z2;
            C4661t c4661t2;
            aa aaVar2;
            long longValue = ((Long) C0955b.dt.m28964b()).longValue();
            long longValue2 = ((Long) C0955b.ds.m28964b()).longValue();
            if (this.f23964f.m18669b()) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            c4024b.m18839a(longValue).m18838a(i2).m18843b(longValue2);
            if (this.f23961c.mo2294a(12616694)) {
                Object obj2;
                if (!C1503a.m8831b(this.f23959a)) {
                    longValue = ((Long) C0954a.f5840j.m5760a()).longValue();
                    if (longValue == 0) {
                        C0954a.f5840j.m5763a(Long.valueOf(System.currentTimeMillis()));
                    } else if (System.currentTimeMillis() - longValue >= ((Long) C0955b.hb.m28964b()).longValue()) {
                        obj2 = 1;
                        if (obj2 != null) {
                            obj = 1;
                            if (obj != null) {
                                b = C1473m.f7980a.bB().m21697b();
                            } else {
                                b = -1;
                            }
                            if (!this.f23961c.mo2294a(12618334)) {
                                i3 = 90;
                            } else if (!this.f23961c.mo2294a(12618335)) {
                                i3 = 80;
                            } else if (!this.f23961c.mo2294a(12618336)) {
                                i3 = 70;
                            } else if (!this.f23961c.mo2294a(12618337)) {
                                i3 = 60;
                            } else if (this.f23961c.mo2294a(12618338)) {
                                i3 = 50;
                            } else {
                                i3 = 100;
                            }
                            z = (obj == null && C4651j.m21631a(b, i3)) ? false : true;
                            c4024b.m18840a(z);
                            z2 = this.f23961c.mo2294a(12605750) || (!z && this.f23961c.mo2294a(12619116));
                            c4024b.m18844b(z2);
                            c4661t2 = this.f23963e;
                            aaVar2 = new aa();
                            aaVar2.a |= 32768;
                            aaVar2.q = true;
                            aaVar2.b(c4661t2.m21649a());
                            aaVar2.c(c4661t2.m21650b());
                            aaVar2.a(false);
                            c2495w.m13367a(new C2474c(131).m13214a(aaVar2).m13244b("wifi_checker").m13217a(c4661t2.f23996g.m8828a()));
                            c4025c.m18849a("Finsky.AutoUpdateRequirePower", String.valueOf(z));
                            c4025c.m18853b("Finsky.AutoUpdateBatteryLevelThreshold", i3);
                            c4025c.m18853b("Finsky.AutoUpdateRequiredNetworkType", i2);
                            c4025c.m18849a("Finsky.AutoUpdateRequireDeviceIdle", String.valueOf(z2));
                        }
                    }
                }
                obj2 = null;
                if (obj2 != null) {
                    obj = 1;
                    if (obj != null) {
                        b = -1;
                    } else {
                        b = C1473m.f7980a.bB().m21697b();
                    }
                    if (!this.f23961c.mo2294a(12618334)) {
                        i3 = 90;
                    } else if (!this.f23961c.mo2294a(12618335)) {
                        i3 = 80;
                    } else if (!this.f23961c.mo2294a(12618336)) {
                        i3 = 70;
                    } else if (!this.f23961c.mo2294a(12618337)) {
                        i3 = 60;
                    } else if (this.f23961c.mo2294a(12618338)) {
                        i3 = 100;
                    } else {
                        i3 = 50;
                    }
                    if (obj == null) {
                    }
                    c4024b.m18840a(z);
                    if (!this.f23961c.mo2294a(12605750)) {
                    }
                    c4024b.m18844b(z2);
                    c4661t2 = this.f23963e;
                    aaVar2 = new aa();
                    aaVar2.a |= 32768;
                    aaVar2.q = true;
                    aaVar2.b(c4661t2.m21649a());
                    aaVar2.c(c4661t2.m21650b());
                    aaVar2.a(false);
                    c2495w.m13367a(new C2474c(131).m13214a(aaVar2).m13244b("wifi_checker").m13217a(c4661t2.f23996g.m8828a()));
                    c4025c.m18849a("Finsky.AutoUpdateRequirePower", String.valueOf(z));
                    c4025c.m18853b("Finsky.AutoUpdateBatteryLevelThreshold", i3);
                    c4025c.m18853b("Finsky.AutoUpdateRequiredNetworkType", i2);
                    c4025c.m18849a("Finsky.AutoUpdateRequireDeviceIdle", String.valueOf(z2));
                }
            }
            obj = null;
            if (obj != null) {
                b = C1473m.f7980a.bB().m21697b();
            } else {
                b = -1;
            }
            if (!this.f23961c.mo2294a(12618334)) {
                i3 = 90;
            } else if (!this.f23961c.mo2294a(12618335)) {
                i3 = 80;
            } else if (!this.f23961c.mo2294a(12618336)) {
                i3 = 70;
            } else if (!this.f23961c.mo2294a(12618337)) {
                i3 = 60;
            } else if (this.f23961c.mo2294a(12618338)) {
                i3 = 50;
            } else {
                i3 = 100;
            }
            if (obj == null) {
            }
            c4024b.m18840a(z);
            if (this.f23961c.mo2294a(12605750)) {
            }
            c4024b.m18844b(z2);
            c4661t2 = this.f23963e;
            aaVar2 = new aa();
            aaVar2.a |= 32768;
            aaVar2.q = true;
            aaVar2.b(c4661t2.m21649a());
            aaVar2.c(c4661t2.m21650b());
            aaVar2.a(false);
            c2495w.m13367a(new C2474c(131).m13214a(aaVar2).m13244b("wifi_checker").m13217a(c4661t2.f23996g.m8828a()));
            c4025c.m18849a("Finsky.AutoUpdateRequirePower", String.valueOf(z));
            c4025c.m18853b("Finsky.AutoUpdateBatteryLevelThreshold", i3);
            c4025c.m18853b("Finsky.AutoUpdateRequiredNetworkType", i2);
            c4025c.m18849a("Finsky.AutoUpdateRequireDeviceIdle", String.valueOf(z2));
        }
        c4025c.m18853b("Finksy.AutoUpdateRescheduleReason", i);
        c4025c.m18848a("Finsky.AutoUpdateLoggingContext", c2495w);
        c4025c.m18853b("Finsky.AutoUpdateFailureCount", 0);
        FinskyLog.m21659a("Scheduling auto-update check using PhoneskyScheduler.", new Object[0]);
        this.f23962d.m18888a(821848295, "post-l-auto-update", C4654m.class, c4024b.m18837a(), c4025c).mo4398a(C4652k.f23965a);
    }

    private static long m21629a(long j, int i) {
        return i <= 0 ? j : j * ((long) Math.pow(2.0d, (double) i));
    }

    static C4030h m21630a(C4025c c4025c) {
        long a;
        long j;
        C4024b c4024b = new C4024b();
        int a2 = c4025c.m18846a("Finsky.AutoUpdateFailureCount", -1);
        if ((c4025c.m18846a("Finksy.AutoUpdateRescheduleReason", 0) & 2) != 0) {
            a = C4651j.m21629a(((Long) C0955b.dq.m28964b()).longValue(), a2);
            j = a;
            a = ((Long) C0955b.dr.m28964b()).longValue();
        } else {
            a = C4651j.m21629a(TimeUnit.SECONDS.toMillis(30), a2);
            j = a;
            a = ((Long) C0955b.ds.m28964b()).longValue();
        }
        if (j < 0) {
            j = TimeUnit.HOURS.toMillis(5);
        }
        j = Math.min(j, TimeUnit.HOURS.toMillis(5));
        a = Math.max(j, a);
        boolean parseBoolean = Boolean.parseBoolean(c4025c.m18854b("Finsky.AutoUpdateRequirePower"));
        boolean parseBoolean2 = Boolean.parseBoolean(c4025c.m18854b("Finsky.AutoUpdateRequireDeviceIdle"));
        c4024b.m18839a(j).m18843b(a).m18840a(parseBoolean).m18844b(parseBoolean2).m18838a(c4025c.m18846a("Finsky.AutoUpdateRequiredNetworkType", -1));
        c4025c.m18853b("Finsky.AutoUpdateFailureCount", a2 + 1);
        FinskyLog.m21659a("Re-Scheduling auto-update check with backoff using PhoneskyScheduler.", new Object[0]);
        return new C4030h(true, c4024b.m18837a(), c4025c);
    }

    static boolean m21631a(int i, int i2) {
        return i >= i2;
    }
}
