package com.google.android.libraries.performance.primes;

import android.content.Context;
import android.os.SystemClock;
import android.os.health.HealthStats;
import android.os.health.SystemHealthManager;
import android.util.Log;
import com.google.android.libraries.p326c.p327a.C5916a;
import com.google.android.libraries.p326c.p327a.C5917b;
import com.google.android.libraries.performance.p328a.p329a.p330a.p331a.C5934a;
import com.google.android.libraries.performance.primes.p332a.C5937a;
import com.google.android.libraries.performance.primes.p332a.C5938b;
import com.google.android.libraries.performance.primes.p332a.C5939c;
import com.google.android.libraries.performance.primes.p332a.C5942e;
import com.google.android.libraries.performance.primes.p332a.C5943f;
import com.google.android.libraries.performance.primes.p332a.C5946j;
import com.google.android.libraries.performance.primes.p332a.C5947k;
import com.google.android.libraries.performance.primes.p332a.C5948l;
import com.google.protobuf.nano.C0757i;
import d.a.a.a.a.a.al;
import d.a.a.a.a.a.ar;
import d.a.a.a.a.a.be;
import d.a.a.a.a.a.bp;
import d.a.a.a.a.a.bv;
import d.a.a.a.a.a.i;
import d.a.a.a.a.a.j;

final class C6025y implements Runnable {
    public final /* synthetic */ int f30098a;
    public final /* synthetic */ String f30099b = null;
    public final /* synthetic */ boolean f30100c = true;
    public final /* synthetic */ C6021v f30101d;

    C6025y(C6021v c6021v, int i) {
        this.f30101d = c6021v;
        this.f30098a = i;
    }

    public final void run() {
        C5949a c5949a = this.f30101d;
        int i = this.f30098a;
        String str = this.f30099b;
        boolean z = this.f30100c;
        C5917b.m27414b();
        c5949a.f30092h.lock();
        try {
            if (c5949a.f29615d) {
                C5989do.m27824a(3, "BatteryMetricService", "shutdown - skipping capture", new Object[0]);
                return;
            }
            Long valueOf;
            C5947k c5947k;
            String str2;
            String str3;
            Object[] objArr;
            long a = c5949a.f30096l.mo5261a();
            long a2 = c5949a.f30097m.mo5261a();
            Long l = ((bw) c5949a.f30095k.mo5221a()).f29836g;
            String str4 = ((bw) c5949a.f30095k.mo5221a()).f29832c;
            if (str4 != null) {
                valueOf = Long.valueOf((long) str4.hashCode());
            } else {
                valueOf = null;
            }
            C5948l c5948l = c5949a.f30094j;
            Context context = c5949a.f29613b;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            HealthStats takeMyUidSnapshot = ((SystemHealthManager) context.getSystemService("systemhealth")).takeMyUidSnapshot();
            elapsedRealtime = SystemClock.elapsedRealtime() - elapsedRealtime;
            C5989do.m27824a(2, "SystemHealthCapture", "HealthStats capture took %d ms", Long.valueOf(elapsedRealtime));
            elapsedRealtime = SystemClock.elapsedRealtime();
            bv bvVar = new bv();
            bvVar.a = C5939c.m27544a(takeMyUidSnapshot, 10001);
            bvVar.c = C5939c.m27544a(takeMyUidSnapshot, 10003);
            bvVar.e = C5939c.m27554c(takeMyUidSnapshot, 10005);
            bvVar.f = C5939c.m27554c(takeMyUidSnapshot, 10006);
            bvVar.g = C5939c.m27554c(takeMyUidSnapshot, 10007);
            bvVar.h = C5939c.m27554c(takeMyUidSnapshot, 10008);
            bvVar.i = C5939c.m27554c(takeMyUidSnapshot, 10009);
            bvVar.j = C5939c.m27554c(takeMyUidSnapshot, 10010);
            bvVar.k = C5939c.m27553b(takeMyUidSnapshot, 10011);
            bvVar.l = C5939c.m27554c(takeMyUidSnapshot, 10012);
            bvVar.n = (be[]) C5943f.f29598a.m27560a(C5939c.m27555d(takeMyUidSnapshot, 10014));
            bvVar.o = (ar[]) C5942e.f29597a.m27560a(C5939c.m27555d(takeMyUidSnapshot, 10015));
            bvVar.p = C5939c.m27544a(takeMyUidSnapshot, 10016);
            bvVar.q = C5939c.m27544a(takeMyUidSnapshot, 10017);
            bvVar.r = C5939c.m27544a(takeMyUidSnapshot, 10018);
            bvVar.s = C5939c.m27544a(takeMyUidSnapshot, 10019);
            bvVar.t = C5939c.m27544a(takeMyUidSnapshot, 10020);
            bvVar.u = C5939c.m27544a(takeMyUidSnapshot, 10021);
            bvVar.v = C5939c.m27544a(takeMyUidSnapshot, 10022);
            bvVar.w = C5939c.m27544a(takeMyUidSnapshot, 10023);
            bvVar.x = C5939c.m27544a(takeMyUidSnapshot, 10024);
            bvVar.y = C5939c.m27544a(takeMyUidSnapshot, 10025);
            bvVar.z = C5939c.m27544a(takeMyUidSnapshot, 10026);
            bvVar.A = C5939c.m27544a(takeMyUidSnapshot, 10027);
            bvVar.B = C5939c.m27544a(takeMyUidSnapshot, 10028);
            bvVar.C = C5939c.m27544a(takeMyUidSnapshot, 10029);
            bvVar.D = C5939c.m27553b(takeMyUidSnapshot, 10030);
            bvVar.E = C5939c.m27544a(takeMyUidSnapshot, 10031);
            bvVar.F = C5939c.m27553b(takeMyUidSnapshot, 10032);
            bvVar.G = C5939c.m27553b(takeMyUidSnapshot, 10033);
            bvVar.H = C5939c.m27553b(takeMyUidSnapshot, 10034);
            bvVar.I = C5939c.m27553b(takeMyUidSnapshot, 10035);
            bvVar.J = C5939c.m27553b(takeMyUidSnapshot, 10036);
            bvVar.K = C5939c.m27553b(takeMyUidSnapshot, 10037);
            bvVar.L = C5939c.m27553b(takeMyUidSnapshot, 10038);
            bvVar.M = C5939c.m27553b(takeMyUidSnapshot, 10039);
            bvVar.N = C5939c.m27553b(takeMyUidSnapshot, 10040);
            bvVar.O = C5939c.m27553b(takeMyUidSnapshot, 10041);
            bvVar.P = C5939c.m27553b(takeMyUidSnapshot, 10042);
            bvVar.Q = C5939c.m27553b(takeMyUidSnapshot, 10043);
            bvVar.R = C5939c.m27553b(takeMyUidSnapshot, 10044);
            bvVar.S = C5939c.m27544a(takeMyUidSnapshot, 10045);
            bvVar.T = C5939c.m27544a(takeMyUidSnapshot, 10046);
            bvVar.U = C5939c.m27544a(takeMyUidSnapshot, 10047);
            bvVar.V = C5939c.m27544a(takeMyUidSnapshot, 10048);
            bvVar.W = C5939c.m27544a(takeMyUidSnapshot, 10049);
            bvVar.X = C5939c.m27544a(takeMyUidSnapshot, 10050);
            bvVar.Y = C5939c.m27544a(takeMyUidSnapshot, 10051);
            bvVar.Z = C5939c.m27544a(takeMyUidSnapshot, 10052);
            bvVar.aa = C5939c.m27544a(takeMyUidSnapshot, 10053);
            bvVar.ab = C5939c.m27544a(takeMyUidSnapshot, 10054);
            bvVar.ac = C5939c.m27544a(takeMyUidSnapshot, 10055);
            bvVar.ad = C5939c.m27544a(takeMyUidSnapshot, 10056);
            bvVar.ae = C5939c.m27544a(takeMyUidSnapshot, 10057);
            bvVar.af = C5939c.m27544a(takeMyUidSnapshot, 10058);
            bvVar.ag = C5939c.m27544a(takeMyUidSnapshot, 10059);
            bvVar.ah = C5939c.m27553b(takeMyUidSnapshot, 10061);
            bvVar.ai = C5939c.m27544a(takeMyUidSnapshot, 10062);
            bvVar.aj = C5939c.m27544a(takeMyUidSnapshot, 10063);
            bvVar.ak = C5939c.m27544a(takeMyUidSnapshot, 10064);
            C5937a c5937a = c5948l.f29611a;
            c5937a.m27537a(C5938b.WAKELOCK, bvVar.e);
            c5937a.m27537a(C5938b.WAKELOCK, bvVar.f);
            c5937a.m27537a(C5938b.WAKELOCK, bvVar.g);
            c5937a.m27537a(C5938b.WAKELOCK, bvVar.h);
            c5937a.m27537a(C5938b.SYNC, bvVar.i);
            c5937a.m27537a(C5938b.JOB, bvVar.j);
            c5937a.m27537a(C5938b.SENSOR, bvVar.l);
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            C5989do.m27824a(2, "SystemHealthCapture", "Convert and hash battery capture took %d ms", Long.valueOf(elapsedRealtime2));
            c5949a.f30090f.mo5251a();
            C5946j c5946j = c5949a.f30093i;
            C0757i c5934a = new C5934a();
            if (c5946j.f29601a.m27834a("primes.battery.snapshot", c5934a)) {
                c5947k = new C5947k(c5934a.f29574a, c5934a.f29575b, c5934a.f29576c, c5934a.f29577d, c5934a.f29578e, c5934a.f29579f, c5934a.f29580g, c5934a.f29581h, c5934a.f29582i);
            } else {
                c5947k = null;
            }
            if (Log.isLoggable("BatteryMetricService", 2)) {
                C5989do.m27824a(2, "BatteryMetricService", "\n\n\nCurrent Stats:\n%s\n metric_extension:\n%s", bvVar, null);
                str2 = "BatteryMetricService";
                str3 = "\nPrevious Stats:\n%s";
                objArr = new Object[1];
                if (c5947k == null) {
                    str4 = "<null>";
                } else {
                    str4 = c5947k.f29602a;
                }
                objArr[0] = str4;
                C5989do.m27824a(2, str2, str3, objArr);
            }
            c5946j = c5949a.f30093i;
            Integer valueOf2 = Integer.valueOf(i);
            Boolean valueOf3 = Boolean.valueOf(z);
            C0757i c5934a2 = new C5934a();
            c5934a2.f29574a = bvVar;
            c5934a2.f29575b = Long.valueOf(a);
            c5934a2.f29576c = Long.valueOf(a2);
            c5934a2.f29577d = l;
            c5934a2.f29578e = valueOf;
            c5934a2.f29579f = valueOf2;
            c5934a2.f29580g = str;
            c5934a2.f29581h = valueOf3;
            c5934a2.f29582i = null;
            if (c5946j.f29601a.m27835b("primes.battery.snapshot", c5934a2)) {
                if (Log.isLoggable("BatteryMetricService", 3)) {
                    str2 = "BatteryMetricService";
                    str3 = "MEASUREMENT: %s <=> %s";
                    objArr = new Object[2];
                    objArr[0] = c5947k != null ? C6021v.m27901a(c5947k.f29607f.intValue()) : "null";
                    objArr[1] = C6021v.m27901a(i);
                    C5989do.m27824a(3, str2, str3, objArr);
                }
                if (c5947k != null) {
                    Object obj;
                    int i2;
                    if (l == null) {
                        obj = c5947k.f29605d == null ? 1 : null;
                    } else if (l.longValue() == c5947k.f29605d.longValue()) {
                        i2 = 1;
                    } else {
                        obj = null;
                    }
                    Object obj2 = valueOf == null ? c5947k.f29606e == null ? 1 : null : valueOf.longValue() == c5947k.f29606e.longValue() ? 1 : null;
                    obj2 = (obj == null || obj2 == null) ? null : 1;
                    if (obj2 != null) {
                        if (c5947k == null || c5947k.f29603b == null || c5947k.f29604c == null) {
                            obj2 = null;
                        } else {
                            elapsedRealtime2 = a - c5947k.f29603b.longValue();
                            long longValue = a2 - c5947k.f29604c.longValue();
                            if (Log.isLoggable("BatteryMetricService", 3)) {
                                C5989do.m27824a(3, "BatteryMetricService", "         elapsed/current: %d / %d \nstats elapsed/current: %d / %d \nduration elapsed/current: %d / %d", Long.valueOf(a), Long.valueOf(a2), c5947k.f29603b, c5947k.f29604c, Long.valueOf(elapsedRealtime2), Long.valueOf(longValue));
                            }
                            if (longValue <= 0) {
                                obj2 = null;
                            } else {
                                elapsedRealtime2 = Math.abs(elapsedRealtime2 - longValue);
                                obj2 = (elapsedRealtime2 < 25 || ((double) elapsedRealtime2) / ((double) longValue) <= 3.472222222222222E-5d) ? 1 : null;
                                if (obj2 == null) {
                                    C5989do.m27824a(3, "BatteryMetricService", "drift: elapsed / current: %d / %d - stats elapsed / current: %d / %d", Long.valueOf(a), Long.valueOf(a2), c5947k.f29603b, c5947k.f29604c);
                                }
                            }
                        }
                        if (obj2 != null) {
                            bv bvVar2;
                            C5948l c5948l2 = c5949a.f30094j;
                            bv bvVar3 = c5947k.f29602a;
                            C5916a.m27406a((Object) bvVar);
                            if (bvVar3 == null) {
                                bvVar2 = bvVar;
                            } else {
                                bv bvVar4 = new bv();
                                bvVar4.a = C5939c.m27545a(bvVar.a, bvVar3.a);
                                bvVar4.c = C5939c.m27545a(bvVar.c, bvVar3.c);
                                bvVar4.e = C5939c.m27552a(bvVar.e, bvVar3.e);
                                bvVar4.f = C5939c.m27552a(bvVar.f, bvVar3.f);
                                bvVar4.g = C5939c.m27552a(bvVar.g, bvVar3.g);
                                bvVar4.h = C5939c.m27552a(bvVar.h, bvVar3.h);
                                bvVar4.i = C5939c.m27552a(bvVar.i, bvVar3.i);
                                bvVar4.j = C5939c.m27552a(bvVar.j, bvVar3.j);
                                bvVar4.k = C5939c.m27540a(bvVar.k, bvVar3.k);
                                bvVar4.l = C5939c.m27552a(bvVar.l, bvVar3.l);
                                bvVar4.n = (be[]) C5943f.f29598a.m27561a(bvVar.n, bvVar3.n);
                                bvVar4.o = (ar[]) C5942e.f29597a.m27561a(bvVar.o, bvVar3.o);
                                bvVar4.p = C5939c.m27545a(bvVar.p, bvVar3.p);
                                bvVar4.q = C5939c.m27545a(bvVar.q, bvVar3.q);
                                bvVar4.r = C5939c.m27545a(bvVar.r, bvVar3.r);
                                bvVar4.s = C5939c.m27545a(bvVar.s, bvVar3.s);
                                bvVar4.t = C5939c.m27545a(bvVar.t, bvVar3.t);
                                bvVar4.u = C5939c.m27545a(bvVar.u, bvVar3.u);
                                bvVar4.v = C5939c.m27545a(bvVar.v, bvVar3.v);
                                bvVar4.w = C5939c.m27545a(bvVar.w, bvVar3.w);
                                bvVar4.x = C5939c.m27545a(bvVar.x, bvVar3.x);
                                bvVar4.y = C5939c.m27545a(bvVar.y, bvVar3.y);
                                bvVar4.z = C5939c.m27545a(bvVar.z, bvVar3.z);
                                bvVar4.A = C5939c.m27545a(bvVar.A, bvVar3.A);
                                bvVar4.B = C5939c.m27545a(bvVar.B, bvVar3.B);
                                bvVar4.C = C5939c.m27545a(bvVar.C, bvVar3.C);
                                bvVar4.D = C5939c.m27540a(bvVar.D, bvVar3.D);
                                bvVar4.E = C5939c.m27545a(bvVar.E, bvVar3.E);
                                bvVar4.F = C5939c.m27540a(bvVar.F, bvVar3.F);
                                bvVar4.G = C5939c.m27540a(bvVar.G, bvVar3.G);
                                bvVar4.H = C5939c.m27540a(bvVar.H, bvVar3.H);
                                bvVar4.I = C5939c.m27540a(bvVar.I, bvVar3.I);
                                bvVar4.J = C5939c.m27540a(bvVar.J, bvVar3.J);
                                bvVar4.K = C5939c.m27540a(bvVar.K, bvVar3.K);
                                bvVar4.L = C5939c.m27540a(bvVar.L, bvVar3.L);
                                bvVar4.M = C5939c.m27540a(bvVar.M, bvVar3.M);
                                bvVar4.N = C5939c.m27540a(bvVar.N, bvVar3.N);
                                bvVar4.O = C5939c.m27540a(bvVar.O, bvVar3.O);
                                bvVar4.P = C5939c.m27540a(bvVar.P, bvVar3.P);
                                bvVar4.Q = C5939c.m27540a(bvVar.Q, bvVar3.Q);
                                bvVar4.R = C5939c.m27540a(bvVar.R, bvVar3.R);
                                bvVar4.S = C5939c.m27545a(bvVar.S, bvVar3.S);
                                bvVar4.T = C5939c.m27545a(bvVar.T, bvVar3.T);
                                bvVar4.U = C5939c.m27545a(bvVar.U, bvVar3.U);
                                bvVar4.V = C5939c.m27545a(bvVar.V, bvVar3.V);
                                bvVar4.W = C5939c.m27545a(bvVar.W, bvVar3.W);
                                bvVar4.X = C5939c.m27545a(bvVar.X, bvVar3.X);
                                bvVar4.Y = C5939c.m27545a(bvVar.Y, bvVar3.Y);
                                bvVar4.Z = C5939c.m27545a(bvVar.Z, bvVar3.Z);
                                bvVar4.aa = C5939c.m27545a(bvVar.aa, bvVar3.aa);
                                bvVar4.ab = C5939c.m27545a(bvVar.ab, bvVar3.ab);
                                bvVar4.ac = C5939c.m27545a(bvVar.ac, bvVar3.ac);
                                bvVar4.ad = C5939c.m27545a(bvVar.ad, bvVar3.ad);
                                bvVar4.ae = C5939c.m27545a(bvVar.ae, bvVar3.ae);
                                bvVar4.af = C5939c.m27545a(bvVar.af, bvVar3.af);
                                bvVar4.ag = C5939c.m27545a(bvVar.ag, bvVar3.ag);
                                bvVar4.ah = C5939c.m27540a(bvVar.ah, bvVar3.ah);
                                bvVar4.ai = C5939c.m27545a(bvVar.ai, bvVar3.ai);
                                bvVar4.aj = C5939c.m27545a(bvVar.aj, bvVar3.aj);
                                bvVar4.ak = C5939c.m27545a(bvVar.ak, bvVar3.ak);
                                bvVar2 = bvVar4;
                            }
                            C5937a c5937a2 = c5948l2.f29611a;
                            c5937a2.m27538a(bvVar2.e);
                            c5937a2.m27538a(bvVar2.f);
                            c5937a2.m27538a(bvVar2.g);
                            c5937a2.m27538a(bvVar2.h);
                            c5937a2.m27538a(bvVar2.i);
                            c5937a2.m27538a(bvVar2.j);
                            c5937a2.m27538a(bvVar2.l);
                            if (bvVar2.a == null || bvVar2.a.longValue() <= 0) {
                                C5989do.m27824a(3, "BatteryMetricService", "Invalid battery duration: '%d', skipping measurement", bvVar2.a);
                            } else {
                                i2 = c5947k.f29607f.intValue();
                                str3 = c5947k.f29608g;
                                boolean booleanValue = c5947k.f29609h.booleanValue();
                                al alVar = c5947k.f29610i;
                                long longValue2 = c5947k.f29603b.longValue();
                                i iVar = new i();
                                iVar.g = Long.valueOf(a - longValue2);
                                iVar.a = i2;
                                if (booleanValue) {
                                    iVar.d = str3;
                                } else {
                                    iVar.c = str3;
                                }
                                iVar.e = alVar;
                                iVar.f = i;
                                iVar.k = Long.valueOf(a);
                                iVar.j = bvVar2;
                                j jVar = new j();
                                jVar.a = iVar;
                                bp bpVar = new bp();
                                bpVar.j = jVar;
                                c5949a.m27579a(str, z, bpVar, null);
                                if (Log.isLoggable("BatteryMetricService", 3)) {
                                    C5989do.m27824a(3, "BatteryMetricService", "\n\n\nStats diff [%d ms in %s]\n%s", Long.valueOf(a - c5947k.f29603b.longValue()), C6021v.m27901a(i), bvVar2);
                                }
                            }
                        }
                    }
                }
                C5989do.m27824a(3, "BatteryMetricService", "Missing or inconsistent previous stats, skipping measurement", new Object[0]);
            } else {
                c5949a.mo5222c();
                C5989do.m27824a(5, "BatteryMetricService", "Failure storing persistent snapshot and helper data", new Object[0]);
            }
            c5949a.f30092h.unlock();
        } finally {
            c5949a.f30092h.unlock();
        }
    }
}
