package com.google.android.libraries.performance.primes;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.util.Log;
import com.google.android.libraries.p326c.p327a.C5916a;
import com.google.android.libraries.performance.primes.p333b.C5972l;
import com.google.android.libraries.performance.primes.p336h.C5984a;
import java.util.ArrayList;
import java.util.List;

final class ab implements cn {
    public final Application f29617a;
    public final eo f29618b;
    public final C5984a f29619c;
    public final dp f29620d;
    public final ee f29621e;
    public final cz f29622f;
    public final dt f29623g;
    public final dm f29624h;
    public final ef f29625i;
    public final ct f29626j;
    public final dr f29627k;
    public final dg f29628l;
    public final cy f29629m;
    public final SharedPreferences f29630n;
    public final dj f29631o;

    ab(Application application, eo eoVar, cv cvVar, dj djVar, SharedPreferences sharedPreferences) {
        this.f29617a = application;
        this.f29618b = (eo) C5916a.m27406a((Object) eoVar);
        this.f29619c = (C5984a) C5916a.m27406a(cvVar.f29900a);
        this.f29620d = (dp) C5916a.m27406a(cvVar.f29901b);
        this.f29621e = (ee) C5916a.m27406a(cvVar.f29902c);
        this.f29622f = (cz) C5916a.m27406a(cvVar.f29903d);
        C5916a.m27406a(cvVar.f29904e);
        this.f29623g = (dt) C5916a.m27406a(cvVar.f29905f);
        this.f29624h = (dm) C5916a.m27406a(cvVar.f29906g);
        this.f29625i = (ef) C5916a.m27406a(cvVar.f29907h);
        this.f29626j = (ct) C5916a.m27406a(cvVar.f29908i);
        this.f29627k = (dr) C5916a.m27406a(cvVar.f29909j);
        this.f29628l = (dg) C5916a.m27406a(cvVar.f29910k);
        C5916a.m27406a(this.f29628l.f29951b);
        this.f29629m = (cy) C5916a.m27406a(cvVar.f29911l);
        this.f29631o = (dj) C5916a.m27406a((Object) djVar);
        this.f29630n = (SharedPreferences) C5916a.m27406a((Object) sharedPreferences);
    }

    final List m27589a() {
        int i;
        List arrayList = new ArrayList();
        if (this.f29622f.f29930b) {
            arrayList.add(ah.m27606a(this.f29619c, this.f29617a, this.f29618b, this.f29622f, this.f29631o.f29958f));
        } else {
            m27588a("Crash metric disabled - not registering for startup notifications.", new Object[0]);
        }
        if (VERSION.SDK_INT > 25 || !this.f29623g.f29994b) {
            m27588a("Package metric disabled.", new Object[0]);
        } else {
            boolean a = cf.m27779a(this.f29630n);
            boolean z = this.f29623g.f29995c;
            boolean z2 = this.f29623g.f29996d;
            if (z || a) {
                m27588a("Package metric: not registering on startup - manual: %b / recently: %b", Boolean.valueOf(z), Boolean.valueOf(a));
            } else {
                arrayList.add(new cf(this.f29617a, this.f29619c, this.f29618b, this.f29630n, z2));
                m27588a("Package metric: registered for startup notifications", new Object[0]);
            }
        }
        if (VERSION.SDK_INT < 24 || ek.f30037a.f30040d || !(this.f29631o.f29956d || this.f29626j.f29898c)) {
            i = 0;
        } else {
            i = 1;
        }
        if (i != 0) {
            arrayList.add(C6021v.m27900a(this.f29619c, this.f29617a, this.f29618b, this.f29630n, this.f29626j));
            m27588a("Battery metrics enabled", new Object[0]);
        } else {
            m27588a("Battery metric disabled", new Object[0]);
        }
        if (this.f29631o.f29957e) {
            arrayList.add(bc.m27716a(this.f29619c, this.f29617a, this.f29618b));
        } else {
            m27588a("MagicEye logging metric disabled", new Object[0]);
        }
        if (VERSION.SDK_INT >= 24 && this.f29624h.f29972b && !this.f29624h.f29974d) {
            arrayList.add(am.m27618a(this.f29619c, this.f29617a, this.f29618b, this.f29624h));
        }
        if (this.f29629m.f29925b) {
            arrayList.add(ae.m27600a(this.f29619c, this.f29617a, this.f29618b, this.f29629m));
        } else {
            m27588a("Cpu metric disabled - not registering for startup notifications.", new Object[0]);
        }
        if (this.f29621e.f30029b) {
            er.m27852a(this.f29619c, this.f29617a, this.f29618b, this.f29621e);
            if (dz.f30003a.f30005c > 0) {
                ea eaVar = new ea(C6018r.m27894a(this.f29617a), new ac(this), new ad(this));
            }
        }
        if (this.f29624h.f29975e) {
            ep.m27848a(this.f29619c, this.f29617a, this.f29618b);
        }
        if (this.f29627k.f29990b || this.f29631o.f29953a || this.f29631o.f29954b) {
            C5950g a2 = be.m27726a(this.f29619c, this.f29617a, this.f29631o.f29954b, this.f29618b, this.f29627k, C6018r.m27894a(this.f29617a));
            synchronized (a2) {
                a2.f29775g.m27760a();
                a2.f29774f.m27896a(a2);
            }
        } else {
            m27588a("Memory Leak metric disabled", new Object[0]);
        }
        if (this.f29631o.f29960h && C5972l.m27711a(this.f29617a)) {
            C5949a a3 = by.m27752a(this.f29619c, this.f29617a, this.f29618b, this.f29630n, (double) this.f29631o.f29961i);
            if (!a3.f29615d) {
                a3.f29840f.m27896a(a3.f29847m);
                a3.f29840f.m27896a(a3.f29848n);
            }
        } else {
            m27588a("Mini heap dump disabled", new Object[0]);
        }
        return arrayList;
    }

    private final void m27588a(String str, Object... objArr) {
        if (Log.isLoggable("Primes", 3)) {
            String packageName = this.f29617a.getPackageName();
            C5989do.m27824a(3, "Primes", new StringBuilder((String.valueOf(packageName).length() + 2) + String.valueOf(str).length()).append(packageName).append(": ").append(str).toString(), objArr);
        }
    }

    public final eo mo5218b() {
        return this.f29618b;
    }

    public final void mo5219c() {
    }

    public final void mo5220d() {
        if (this.f29620d.f29984c) {
            bq.m27742a(this.f29619c, this.f29617a, this.f29618b, this.f29620d, this.f29631o.f29955c).m27744d();
        }
    }

    public final void mo5216a(String str) {
        if (!this.f29624h.f29972b) {
            return;
        }
        if (VERSION.SDK_INT < 24 || this.f29624h.f29974d) {
            az.m27651a(this.f29619c, this.f29617a, this.f29618b, this.f29624h).m27652a(str);
        } else {
            am.m27618a(this.f29619c, this.f29617a, this.f29618b, this.f29624h).m27619a(str);
        }
    }

    public final void mo5217a(String str, boolean z) {
        if (!this.f29624h.f29972b) {
            return;
        }
        if (VERSION.SDK_INT < 24 || this.f29624h.f29974d) {
            C5949a a = az.m27651a(this.f29619c, this.f29617a, this.f29618b, this.f29624h);
            if (!a.m27580a()) {
                return;
            }
            if (str == null) {
                C5989do.m27824a(5, "JankMetricService", "Can't stop an event with null name.", new Object[0]);
                return;
            }
            av avVar;
            synchronized (a) {
                avVar = (av) a.f29692h.remove(str);
            }
            if (avVar == null) {
                C5989do.m27824a(5, "JankMetricService", "Can't stop an event that was never started or has been stopped already.", new Object[0]);
                return;
            }
            avVar.m27650a();
            a.m27581b().submit(new bb(a, str, z, avVar));
            return;
        }
        am.m27618a(this.f29619c, this.f29617a, this.f29618b, this.f29624h).m27620a(str, z);
    }
}
