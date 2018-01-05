package com.google.android.finsky.setup.p242d.p244a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bt.C2180a;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.ec.C2968a;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.installqueue.C3361d;
import com.google.android.finsky.installqueue.C3366j;
import com.google.android.finsky.installqueue.C3367k;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.setup.C4176i;
import com.google.android.finsky.setup.PackageSetupStatus;
import com.google.android.finsky.setup.ak;
import com.google.android.finsky.setup.al;
import com.google.android.finsky.setup.ao;
import com.google.android.finsky.setup.ap;
import com.google.android.finsky.setup.bq;
import com.google.android.finsky.setup.p242d.C4137g;
import com.google.android.finsky.setup.p242d.C4155d;
import com.google.android.finsky.setup.p242d.C4159f;
import com.google.android.finsky.setup.p242d.C4161e;
import com.google.android.finsky.utils.C4671b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.p188a.C4136c;
import com.google.android.play.image.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

public final class C4160o implements C1003o, C4159f {
    public final Context f21022a;
    public final C1461c f21023b = C1473m.f7980a.aN();
    public final C2471a f21024c = C1473m.f7980a.aR();
    public final C2320a f21025d;
    public final Set f21026e;
    public final ao f21027f;
    public final C4176i f21028g;
    public final ak f21029h;
    public final C4155d f21030i;
    public final Handler f21031j;
    public final Object f21032k;
    public final C4161e f21033l;

    public C4160o(Context context, ao aoVar) {
        C1473m.f7980a.bu();
        this.f21025d = C1473m.f7980a.mo2032L();
        this.f21026e = Collections.newSetFromMap(new IdentityHashMap());
        this.f21032k = new Object();
        this.f21033l = new C4162p(this);
        this.f21022a = context;
        this.f21027f = aoVar;
        C1473m.f7980a.cl();
        C4167u c4167u = new C4167u();
        this.f21028g = new C4176i(C1473m.f7980a.mo2255n(), C1473m.f7980a.be());
        this.f21031j = new Handler(Looper.getMainLooper());
        this.f21030i = C1473m.f7980a.cJ().mo3990a(this.f21033l);
        this.f21029h = new ak(this.f21027f, C1473m.f7980a.aS(), C1473m.f7980a.bw(), this.f21025d, this.f21023b, C1473m.f7980a.mo2266y());
    }

    public final void mo3977a(C4137g c4137g) {
        if (c4137g != null) {
            synchronized (this.f21032k) {
                this.f21026e.add(c4137g);
            }
        }
    }

    public final boolean mo3983b(C4137g c4137g) {
        boolean remove;
        synchronized (this.f21032k) {
            remove = this.f21026e.remove(c4137g);
        }
        return remove;
    }

    public final void mo3978a(Runnable runnable) {
        ao aoVar = this.f21027f;
        aoVar.f20788b.m12009a(new ap(aoVar, runnable));
    }

    public final boolean mo3979a() {
        return !this.f21027f.f20789c.isEmpty() || this.f21030i.mo3974a();
    }

    public final boolean mo3982b() {
        ArrayList arrayList = new ArrayList(this.f21027f.f20789c.keySet());
        int size = arrayList.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            boolean z2;
            Object obj = arrayList.get(i);
            i++;
            if (mo3980a((String) obj)) {
                FinskyLog.m21659a("Package setup - recover %s", (String) obj);
                z2 = true;
            } else {
                z2 = z;
            }
            z = z2;
        }
        return z;
    }

    public final synchronized int mo3975a(List list) {
        List arrayList;
        boolean z;
        ak akVar = this.f21029h;
        akVar.f20778g = 0;
        akVar.f20779h = 0;
        akVar.f20780i = 0;
        if (C1473m.f7980a.bP().m14777b()) {
            z = false;
        } else {
            z = true;
        }
        arrayList = new ArrayList();
        for (PackageSetupStatus packageSetupStatus : list) {
            Object obj;
            if (this.f21029h.m19191a(packageSetupStatus) == 0) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj != null) {
                m19458a(packageSetupStatus, z);
                arrayList.add(packageSetupStatus);
            }
        }
        FinskyLog.m21659a("Attempted to restore %d assets (deferred = %b)", Integer.valueOf(list.size()), Boolean.valueOf(z));
        FinskyLog.m21659a("  Posted for download/install: %d", Integer.valueOf(arrayList.size()));
        akVar = this.f21029h;
        FinskyLog.m21659a("  Skipped (already tracked): %d", Integer.valueOf(akVar.f20779h));
        FinskyLog.m21659a("  Skipped (other account): %d", Integer.valueOf(akVar.f20778g));
        FinskyLog.m21659a("  Skipped (already installed): %d", Integer.valueOf(akVar.f20780i));
        if (!arrayList.isEmpty()) {
            this.f21030i.mo3973a(arrayList);
            if (z) {
                C1473m.f7980a.cK().mo3919a(this.f21022a, ((Long) C0955b.bi.m28964b()).longValue());
            }
        }
        return arrayList.size();
    }

    public final boolean mo3980a(String str) {
        PackageSetupStatus b = this.f21027f.m19232b(str);
        switch (this.f21029h.m19191a(b)) {
            case 0:
                FinskyLog.m21659a("Retry - restoring package %s (attempt %d)", str, Integer.valueOf(b.f20546a.f20888b));
                m19458a(b, false);
                return true;
            case 1:
            case 2:
                FinskyLog.m21669e("Retry - removing bad package %s", str);
                m19461c(str);
                return false;
            case 3:
                FinskyLog.m21669e("Retry - package %s restoring for other account (should not happen)", str);
                return true;
            case 4:
                FinskyLog.m21659a("Retry - package %s will already be restored", str);
                return true;
            case 5:
                FinskyLog.m21659a("Retry - finishing already successfully installed package %s", str);
                m19459a(str, 0);
                return false;
            case 6:
                FinskyLog.m21669e("Retry - finishing preview package %s (should not happen)", str);
                m19459a(str, 0);
                return false;
            default:
                FinskyLog.m21669e("Retry - unexpected RestoreDecision %d for %s", Integer.valueOf(this.f21029h.m19191a(b)), str);
                return false;
        }
    }

    public final List mo3984c() {
        return this.f21027f.m19231a();
    }

    public final List mo3976a(C4136c c4136c) {
        List a = this.f21027f.m19231a();
        List arrayList = new ArrayList(a.size());
        for (Object next : a) {
            if (c4136c.mo3936a(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final PackageSetupStatus mo3981b(String str) {
        return this.f21027f.m19232b(str);
    }

    public final boolean mo3985d() {
        List<PackageSetupStatus> a = this.f21027f.m19231a();
        if (a.isEmpty()) {
            return false;
        }
        if (C1473m.f7980a.mo2258q().m11721c()) {
            return false;
        }
        for (PackageSetupStatus packageSetupStatus : a) {
            if (packageSetupStatus.f20546a.f20895i && packageSetupStatus.f20546a.f20898l == 1) {
                return false;
            }
        }
        return true;
    }

    public final void mo3986e() {
        C3300k o = C1473m.f7980a.mo2256o();
        for (PackageSetupStatus packageSetupStatus : this.f21027f.m19231a()) {
            PackageSetupStatus packageSetupStatus2;
            if (packageSetupStatus2.f20546a.f20895i) {
                String a = packageSetupStatus2.m19066a();
                ao aoVar = this.f21027f;
                packageSetupStatus2 = (PackageSetupStatus) aoVar.f20789c.get(a);
                if (packageSetupStatus2 == null) {
                    FinskyLog.m21659a("Unexpected missing package %s, can't confirm block on WiFi", a);
                } else {
                    packageSetupStatus2.f20546a.m19373a(1);
                    aoVar.m19233c(a);
                }
                o.mo3448c(a);
            }
        }
        if (!(((Boolean) C0955b.hP.m28964b()).booleanValue() || this.f21023b.dj().mo2294a(12623761))) {
            o.mo3428a();
        }
        synchronized (this.f21032k) {
            Set<C4137g> hashSet = new HashSet(this.f21026e);
        }
        for (C4137g c4164r : hashSet) {
            this.f21031j.post(new C4164r(c4164r));
        }
    }

    public final long mo3987f() {
        long j = 0;
        for (PackageSetupStatus packageSetupStatus : this.f21027f.m19231a()) {
            long j2;
            if (packageSetupStatus.f20546a.f20899m == null) {
                j2 = 0;
            } else {
                j2 = packageSetupStatus.f20546a.f20899m.f12311c;
            }
            j = j2 + j;
        }
        return j;
    }

    public final void mo1205a(C3369m c3369m) {
        String a = c3369m.m16819a();
        int b = c3369m.m16820b();
        PackageSetupStatus b2 = this.f21027f.m19232b(a);
        if (b2 != null) {
            switch (c3369m.f17273c.f17153d) {
                case 0:
                case 1:
                case 4:
                case 7:
                case 8:
                case 11:
                    return;
                case 2:
                    FinskyLog.m21667d("Restore package %s download cancelled", a);
                    m19459a(a, 4);
                    return;
                case 3:
                    boolean z;
                    FinskyLog.m21667d("Restore package %s download error %d", a, Integer.valueOf(b));
                    if (b2 == null) {
                        z = false;
                    } else if (b2.f20546a.f20888b >= ((Integer) C0955b.bl.m28964b()).intValue()) {
                        FinskyLog.m21659a("Reached limit %d for package %s", Integer.valueOf(b2.f20546a.f20888b), b2.m19066a());
                        z = false;
                    } else {
                        z = bq.m19292a(b);
                    }
                    if (z) {
                        Long l;
                        m19460a(a, true);
                        ao aoVar = this.f21027f;
                        PackageSetupStatus packageSetupStatus = (PackageSetupStatus) aoVar.f20789c.get(a);
                        if (packageSetupStatus != null) {
                            packageSetupStatus.m19067a(packageSetupStatus.f20546a.f20888b + 1);
                            aoVar.m19233c(a);
                        }
                        al cK = C1473m.f7980a.cK();
                        Context context = this.f21022a;
                        if (b2.f20546a.f20893g == 1) {
                            l = (Long) C0955b.bn.m28964b();
                        } else {
                            l = (Long) C0955b.bm.m28964b();
                        }
                        cK.mo3920a(context, a, C2180a.m11451a(((long) Math.pow((double) ((Float) C0955b.bs.m28964b()).floatValue(), (double) Math.max(b2.f20546a.f20888b - 2, 0))) * l.longValue(), 0.25f));
                        C1473m.f7980a.mo2256o().mo3438a(a, b2.m19069c(), b2.f20546a.f20899m);
                        this.f21028g.m19498a(a, b2.m19071e());
                        return;
                    }
                    m19459a(a, 5);
                    return;
                case 5:
                    FinskyLog.m21667d("Restore package %s install error %d", a, Integer.valueOf(b));
                    m19459a(a, 6);
                    return;
                case 6:
                    FinskyLog.m21659a("Restore package %s install complete", a);
                    m19459a(a, 0);
                    return;
                default:
                    FinskyLog.m21669e("enum %s", Integer.valueOf(c3369m.f17273c.f17153d));
                    return;
            }
        }
    }

    private final void m19461c(String str) {
        ao aoVar = this.f21027f;
        aoVar.f20789c.remove(str);
        aoVar.m19233c(str);
        C4176i c4176i = this.f21028g;
        FinskyLog.m21659a("Canceling bitmap for %s", str);
        x xVar = (x) c4176i.f21097d.get(str);
        if (xVar != null) {
            xVar.a();
        }
        c4176i.m19496a(str);
        m19460a(str, false);
    }

    private final void m19459a(String str, int i) {
        boolean z;
        boolean z2 = true;
        PackageSetupStatus b = this.f21027f.m19232b(str);
        boolean z3 = b != null && b.f20546a.f20895i;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (b == null || !b.f20546a.f20897k) {
            z2 = false;
        }
        C1473m.f7980a.aS().mo3961b(b != null ? b.m19068b() : null, str, this.f21027f.m19229a(str), i, z2);
        if (z) {
            C1473m.f7980a.mo2266y().mo3823a(str);
            if (z3) {
                C0954a.bh.m5763a(Integer.valueOf(((Integer) C0954a.bh.m5760a()).intValue() + 1));
            }
        } else if (z3) {
            C0954a.bi.m5763a(Integer.valueOf(((Integer) C0954a.bi.m5760a()).intValue() + 1));
        }
        m19461c(str);
    }

    private final void m19458a(PackageSetupStatus packageSetupStatus, boolean z) {
        String str;
        C2471a c2471a = this.f21024c;
        if (packageSetupStatus.f20546a.f20897k) {
            str = "restore_vpa";
        } else {
            str = "restore";
        }
        C3366j a = new C3366j(c2471a.m13184a(str), packageSetupStatus.m19066a(), packageSetupStatus.f20546a.f20890d, packageSetupStatus.m19069c()).m16808a(packageSetupStatus.f20546a.f20899m);
        ao aoVar = this.f21027f;
        Object obj = (PackageSetupStatus) aoVar.f20789c.get(packageSetupStatus.m19066a());
        if (obj == null) {
            obj = new PackageSetupStatus(packageSetupStatus.m19068b(), packageSetupStatus.m19066a(), packageSetupStatus.f20546a.f20890d, packageSetupStatus.m19069c(), packageSetupStatus.f20546a.f20893g, packageSetupStatus.m19070d(), packageSetupStatus.f20546a.f20895i, packageSetupStatus.m19071e(), packageSetupStatus.f20546a.f20897k, packageSetupStatus.f20546a.f20898l, packageSetupStatus.f20546a.f20899m);
        }
        aoVar.f20789c.put(packageSetupStatus.m19066a(), obj);
        aoVar.m19233c(packageSetupStatus.m19066a());
        C1473m.f7980a.aS().mo3946a(packageSetupStatus, this.f21027f.m19229a(packageSetupStatus.m19066a()));
        synchronized (this.f21032k) {
            Set<C4137g> hashSet = new HashSet(this.f21026e);
        }
        for (C4137g c4165s : hashSet) {
            this.f21031j.post(new C4165s(c4165s, packageSetupStatus));
        }
        obj = (!C4671b.m21788e() || ((Boolean) C0955b.fd.m28964b()).booleanValue()) ? null : 1;
        a.m16809a(obj != null ? C3367k.f17268b : C3367k.f17269c);
        if (!TextUtils.isEmpty(packageSetupStatus.m19070d())) {
            a.m16817d(packageSetupStatus.m19070d());
        }
        C3361d c3361d = new C3361d();
        if (packageSetupStatus.f20546a.f20897k) {
            c3361d.m16798d();
        }
        if (packageSetupStatus.f20546a.f20893g == 1) {
            c3361d.m16792a();
        } else if (((Boolean) C0955b.bt.m28964b()).booleanValue()) {
            if ((this.f21025d.mo2854a(packageSetupStatus.m19066a()) == null ? 1 : null) != null) {
                c3361d.m16792a();
            }
        }
        if (!(((Boolean) C0955b.hP.m28964b()).booleanValue() || ((Boolean) C0955b.bt.m28964b()).booleanValue())) {
            c3361d.m16796b(z);
        }
        Object obj2 = (C1503a.m8831b(this.f21022a) && C2968a.m15380a(this.f21022a).m15384c() && packageSetupStatus.f20546a.f20897k) ? 1 : null;
        if (!(((Boolean) C0955b.hv.m28964b()).booleanValue() && obj2 == null)) {
            switch (packageSetupStatus.f20546a.f20898l) {
                case 0:
                    c3361d.m16793a(2);
                    if (obj2 != null) {
                        C1473m.f7980a.cP().mo3210a(packageSetupStatus.m19066a());
                        break;
                    }
                    break;
                case 1:
                    c3361d.m16793a(1);
                    break;
                default:
                    String str2 = "Unknown network type restriction for ";
                    str = String.valueOf(packageSetupStatus.m19066a());
                    if (str.length() != 0) {
                        str = str2.concat(str);
                    } else {
                        str = new String(str2);
                    }
                    FinskyLog.m21665c(str, new Object[0]);
                    break;
            }
        }
        a.m16813a(c3361d.m16799e()).m16815b(packageSetupStatus.m19068b()).m16814b(packageSetupStatus.f20546a.f20893g);
        C1473m.f7980a.bw().m16744a(a.m16806a());
        this.f21028g.m19498a(packageSetupStatus.m19066a(), packageSetupStatus.m19071e());
    }

    private final void m19460a(String str, boolean z) {
        synchronized (this.f21032k) {
            Set<C4137g> hashSet = new HashSet(this.f21026e);
        }
        for (C4137g c4166t : hashSet) {
            this.f21031j.post(new C4166t(c4166t, str, z));
        }
    }
}
