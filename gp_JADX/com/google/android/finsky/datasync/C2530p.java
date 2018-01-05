package com.google.android.finsky.datasync;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.aa.C0957n;
import com.google.android.finsky.ai.C1188a;
import com.google.android.finsky.ai.C1189b;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.C5095d;
import com.google.android.gms.gcm.C5195a;
import com.google.android.gms.gcm.C5202h;
import com.google.android.gms.gcm.C5203i;
import com.google.android.gms.gcm.PeriodicTask;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public final class C2530p {
    public final Context f13558a;
    public final C2531s f13559b;
    public final C1461c f13560c;
    public final List f13561d;
    public boolean f13562e = false;

    public C2530p(Context context, C2531s c2531s, C1461c c1461c, boolean z) {
        this.f13558a = context;
        this.f13559b = c2531s;
        this.f13560c = c1461c;
        this.f13562e = z;
        this.f13561d = this.f13559b.m13485c();
    }

    public final void m13472a() {
        if (C5095d.m23655a(this.f13558a) != 0) {
            this.f13559b.m13480a(this.f13561d);
            return;
        }
        C5195a a = C5195a.m23967a(this.f13558a);
        if (this.f13561d.size() == 0) {
            Intent a2;
            FinskyLog.m21659a("[Cache and Sync] mode not available for any accounts.", new Object[0]);
            this.f13559b.m13479a(this.f13558a);
            Parcelable componentName = new ComponentName(a.f26228b, CacheAndSyncJitterSchedulingService.class);
            if (a.m23975b(componentName.getClassName())) {
                a2 = a.m23971a();
                if (a2 != null) {
                    a2.putExtra("scheduler_action", "CANCEL_ALL");
                    a2.putExtra("component", componentName);
                    a.f26228b.sendBroadcast(a2);
                }
            }
            componentName = new ComponentName(a.f26228b, CacheAndSyncTaskService.class);
            if (a.m23975b(componentName.getClassName())) {
                a2 = a.m23971a();
                if (a2 != null) {
                    a2.putExtra("scheduler_action", "CANCEL_ALL");
                    a2.putExtra("component", componentName);
                    a.f26228b.sendBroadcast(a2);
                    return;
                }
                return;
            }
            return;
        }
        boolean z;
        long longValue = ((Long) C1189b.f7283s.m5760a()).longValue();
        if (longValue == 0) {
            z = true;
        } else {
            z = C4678i.m21812a() > ((Long) C0955b.dx.m28964b()).longValue() + longValue;
        }
        if (z) {
            C1189b.f7283s.m5763a(Long.valueOf(C4678i.m21812a()));
            boolean a3 = C1188a.m7140a(this.f13559b.f13567d.dl());
            C0957n c0957n = C1189b.f7268d;
            if (C4678i.m21812a() >= ((Long) C1189b.f7282r.m5760a()).longValue()) {
                if (((Integer) c0957n.m5760a()).intValue() == 3 || ((Integer) c0957n.m5760a()).intValue() == 4) {
                    c0957n.m5763a(Integer.valueOf(2));
                }
                this.f13559b.m13482a(this.f13561d, a3);
            } else {
                int i;
                boolean z2;
                C1189b.f7286v.m5765c();
                this.f13559b.m13482a(this.f13561d, a3);
                C1552e dj = this.f13560c.dj();
                if (((Integer) C1189b.f7268d.m5760a()).intValue() == 4) {
                    if (a3) {
                        if (C4678i.m21812a() < ((Long) C0955b.dA.m28964b()).longValue() + ((Long) C1189b.f7273i.m5760a()).longValue()) {
                            i = 1627;
                            z2 = false;
                        } else {
                            i = 1628;
                            if (!dj.mo2294a(12637092)) {
                                this.f13559b.m13479a(this.f13558a);
                                z2 = true;
                            }
                        }
                    } else {
                        i = 1629;
                        if (!dj.mo2294a(12638206)) {
                            this.f13559b.m13479a(this.f13558a);
                            z2 = true;
                        }
                    }
                    z2 = false;
                } else {
                    i = 1626;
                    z2 = false;
                }
                this.f13559b.m13481a(this.f13561d, i);
                if (!z2) {
                    return;
                }
            }
            if (!this.f13562e) {
                if (C4678i.m21812a() > ((Long) C1189b.f7286v.m5760a()).longValue()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    FinskyLog.m21659a("[Cache and Sync] Postponing, letting existing scheduled task execute.", new Object[0]);
                    return;
                }
            }
            C5195a a4 = C5195a.m23967a(this.f13558a);
            if (this.f13562e) {
                m13473a(a4);
                return;
            }
            Intent a5;
            long longValue2;
            Random random = new Random();
            FinskyLog.m21659a("[Cache and Sync] Cancelling scheduling task via network manager", new Object[0]);
            Parcelable componentName2 = new ComponentName(a4.f26228b, CacheAndSyncJitterSchedulingService.class);
            if (a4.m23975b(componentName2.getClassName())) {
                a5 = a4.m23971a();
                if (a5 != null) {
                    a5.putExtra("scheduler_action", "CANCEL_ALL");
                    a5.putExtra("component", componentName2);
                    a4.f26228b.sendBroadcast(a5);
                }
            }
            componentName2 = new ComponentName(a4.f26228b, CacheAndSyncTaskService.class);
            if (a4.m23975b(componentName2.getClassName())) {
                a5 = a4.m23971a();
                if (a5 != null) {
                    a5.putExtra("scheduler_action", "CANCEL_ALL");
                    a5.putExtra("component", componentName2);
                    a4.f26228b.sendBroadcast(a5);
                }
            }
            if (((Boolean) C0955b.dF.m28964b()).booleanValue()) {
                longValue2 = ((Long) C0955b.dD.m28964b()).longValue();
            } else {
                longValue2 = ((Long) C0955b.dE.m28964b()).longValue();
            }
            long nextDouble = (long) (((double) longValue2) * random.nextDouble());
            longValue2 = ((Long) C0955b.dG.m28964b()).longValue() + nextDouble;
            C1189b.f7286v.m5763a(Long.valueOf(C4678i.m21812a() + TimeUnit.SECONDS.toMillis(longValue2)));
            C5202h a6 = new C5202h().m23985a(CacheAndSyncJitterSchedulingService.class).m23984a(nextDouble, longValue2);
            a6.e = "CacheAndSyncScheduler.CACHE_AND_SYNC_SCHEDULING_TAG";
            a6.h = false;
            a6.g = true;
            a4.m23972a(a6.m23987b());
            C1189b.f7269e.m5763a(Integer.valueOf(2));
            this.f13559b.m13481a(this.f13561d, 1622);
            return;
        }
        FinskyLog.m21662b("[Cache and Sync] was already recently scheduled, exiting.", new Object[0]);
        this.f13559b.m13481a(this.f13561d, 1623);
    }

    final void m13473a(C5195a c5195a) {
        int i;
        FinskyLog.m21659a("[Cache and Sync] Cancelling all tasks via GcmNetworkManager", new Object[0]);
        Parcelable componentName = new ComponentName(c5195a.f26228b, CacheAndSyncTaskService.class);
        if (c5195a.m23975b(componentName.getClassName())) {
            Intent a = c5195a.m23971a();
            if (a != null) {
                a.putExtra("scheduler_action", "CANCEL_ALL");
                a.putExtra("component", componentName);
                c5195a.f26228b.sendBroadcast(a);
            }
        }
        C1189b.f7267c.m5765c();
        C1189b.f7266b.m5765c();
        Collection collection = this.f13561d;
        Object hashSet = new HashSet();
        this.f13559b.m13479a(this.f13558a);
        hashSet.add("FETCH_TOC");
        hashSet.add("REFRESH_USER_SETTINGS");
        hashSet.add("SYNC_DFE");
        hashSet.add("SYNC_IMAGES");
        hashSet.add("SYNC_SUCCESS");
        C1189b.f7266b.m5763a(new HashSet(collection));
        C1189b.f7267c.m5763a(hashSet);
        C1552e dj = this.f13560c.dj();
        if (dj.mo2294a(12632807) || dj.mo2294a(12632809) || dj.mo2294a(12632808)) {
            i = 0;
        } else {
            i = 1;
        }
        C5203i c5203i = new C5203i();
        c5203i.d = CacheAndSyncTaskService.class.getName();
        c5203i.f26249a = ((Long) C0955b.dB.m28964b()).longValue();
        c5203i.f26250b = ((Long) C0955b.dC.m28964b()).longValue();
        c5203i.e = "CacheAndSyncScheduler.CACHE_AND_SYNC_TASKS_TAG";
        c5203i.c = i;
        c5203i.g = true;
        c5203i.mo4640a();
        c5195a.m23972a(new PeriodicTask(c5203i));
        C1189b.f7269e.m5763a(Integer.valueOf(3));
        this.f13559b.m13481a(this.f13561d, 1611);
    }
}
