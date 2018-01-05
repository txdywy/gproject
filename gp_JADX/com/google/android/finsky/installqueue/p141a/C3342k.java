package com.google.android.finsky.installqueue.p141a;

import android.os.Handler;
import android.os.Looper;
import android.support.v4.p037h.C0308c;
import com.google.android.finsky.ak.C1202e;
import com.google.android.finsky.ak.C1215q;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.bn.C2131e;
import com.google.android.finsky.bo.C2153a;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.installer.p208b.p209a.C3312b;
import com.google.android.finsky.installer.p208b.p209a.C3315e;
import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.installqueue.C2465r;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.installqueue.C3362e;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.installqueue.C3370n;
import com.google.android.finsky.installqueue.C3371p;
import com.google.android.finsky.installqueue.InstallConstraint;
import com.google.android.finsky.installqueue.InstallRequest;
import com.google.android.finsky.installqueue.p141a.p210a.C3324a;
import com.google.android.finsky.installqueue.p141a.p210a.C3325b;
import com.google.android.finsky.installqueue.p141a.p210a.C3326c;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.p108z.C4817d;
import com.google.android.finsky.p108z.C4819c;
import com.google.android.finsky.p108z.C4830g;
import com.google.android.finsky.p108z.C4831h;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.aj;
import com.google.android.finsky.p111d.p178a.C2470a;
import com.google.android.finsky.scheduler.ba;
import com.google.android.finsky.scheduler.bb;
import com.google.android.finsky.scheduler.p238b.C4026d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import p002a.C0002a;

public final class C3342k extends C3340g {
    public final C0002a f17212a;
    public final C0002a f17213b;
    public final C0002a f17214c;
    public final C0002a f17215d;
    public final C0002a f17216e;
    public final C0002a f17217f;
    public final C0002a f17218g;
    public final C0002a f17219h;
    public final C0002a f17220i;
    public final C0002a f17221j;
    public final List f17222k;
    public final Set f17223l = new HashSet();
    public final Handler f17224m = new Handler(Looper.getMainLooper());
    public final Map f17225n = new HashMap();
    public C4819c f17226o;
    public ba f17227p;
    public final Map f17228q = new HashMap();
    public boolean f17229r = false;

    public C3342k(C0002a c0002a, C0002a c0002a2, C0002a c0002a3, C0002a c0002a4, C0002a c0002a5, C0002a c0002a6, C0002a c0002a7, C0002a c0002a8, C0002a c0002a9, C0002a c0002a10) {
        this.f17212a = c0002a;
        this.f17213b = c0002a2;
        this.f17214c = c0002a3;
        this.f17215d = c0002a4;
        this.f17216e = c0002a5;
        this.f17217f = c0002a6;
        this.f17218g = c0002a7;
        this.f17219h = c0002a8;
        this.f17220i = c0002a9;
        this.f17221j = c0002a10;
        this.f17222k = Arrays.asList(new C3324a[]{new C3326c(), new C3325b()});
    }

    public final C4809e mo3479a(C3362e c3362e) {
        C1215q c1215q = new C1215q();
        if (!c3362e.f17258a.isEmpty()) {
            c1215q.m7192a("reason", new ArrayList(c3362e.f17258a));
        }
        if (!c3362e.f17259b.isEmpty()) {
            c1215q.m7192a("state", new ArrayList(c3362e.f17259b));
        }
        if (!c3362e.f17260c.isEmpty()) {
            c1215q.m7192a("pk", new ArrayList(c3362e.f17260c));
        }
        return m16775b().mo4403a(new C3343l(this, c1215q));
    }

    public final void mo3481a(C1003o c1003o) {
        synchronized (this.f17223l) {
            this.f17223l.add(c1003o);
        }
    }

    public final void mo3484b(C1003o c1003o) {
        synchronized (this.f17223l) {
            this.f17223l.remove(c1003o);
        }
    }

    public final int mo3482b(String str) {
        int l = ((C3300k) this.f17214c.mo1a()).mo3458l(str);
        if (l != 0) {
            return l;
        }
        C3369m d = m16761d(str);
        if (d == null) {
            return 0;
        }
        switch (d.f17273c.f17153d) {
            case 0:
            case 11:
                return 1;
            case 1:
                return 2;
            case 4:
                return 3;
            case 7:
                return 4;
            default:
                return 0;
        }
    }

    public final C3371p mo3485c(String str) {
        C3371p m = ((C3300k) this.f17214c.mo1a()).mo3459m(str);
        return m.f17276a != 0 ? m : new C3371p(mo3482b(str), 0, 0, 0);
    }

    public final C4809e mo3483b(Collection collection) {
        FinskyLog.m21659a("Scheduling install requests %s", collection);
        for (InstallRequest installRequest : collection) {
            if (installRequest.f17172b.size() != 1) {
                throw new UnsupportedOperationException("Only single InstallConstraint is currently supported");
            } else if (((InstallConstraint) installRequest.f17172b.get(0)).f17169b.f17119c == 3) {
                throw new UnsupportedOperationException("NOT_ROAMING isn't currently supported");
            }
        }
        return m16775b().mo4403a(new C3344m(this, collection));
    }

    final C3369m m16766a(C3369m c3369m, InstallRequest installRequest) {
        for (C3324a a : this.f17222k) {
            C3369m a2 = a.mo3469a(c3369m, installRequest);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    public final C4809e mo3480a(List list) {
        C4809e a = m16775b().mo4403a(new C3353v(this, list));
        a.mo4398a(C4831h.f25111a);
        return a;
    }

    final void m16770a(C3339i c3339i) {
        m16778b(c3339i);
        m16775b().mo4403a(new C3357z(this)).mo4398a(C4831h.f25111a);
    }

    private final List m16762e() {
        C1202e c1202e = ((C3327a) this.f17212a.mo1a()).f17175f;
        C1215q a = new C1215q().m7192a("state", C3369m.f17271a);
        a.m7193a("state", "<>", Integer.valueOf(11));
        return (List) c1202e.mo1519a(a).get();
    }

    final void m16769a() {
        List<C3369m> e = m16762e();
        Set c0308c = new C0308c();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f17224m.post(new aa(this, e, c0308c, countDownLatch));
        countDownLatch.await();
        if (!c0308c.isEmpty()) {
            for (C3369m c3369m : e) {
                if (c0308c.contains(c3369m.f17274d.f17171a.f17133c)) {
                    FinskyLog.m21665c("Pruning package %s as it's not tracked in InstallerDataStore", c3369m.f17274d.f17171a.f17133c);
                    m16771a(new C3370n(c3369m.f17274d).m16827a(11).m16826a());
                }
            }
            FinskyLog.m21669e("Had to prune stale packages in InstallQueue", new Object[0]);
        }
        if (m16762e().isEmpty()) {
            List arrayList = new ArrayList();
            for (C3339i c3339i : m16763f()) {
                C1202e c1202e = ((C3327a) this.f17212a.mo1a()).f17175f;
                C1215q c1215q = new C1215q();
                String replaceAll = c3339i.f17206g.m16701a().replaceAll("!", "!!").replaceAll("%", "!%").replaceAll("_", "!_");
                c1215q.m7195a("constraints", "like", true, Collections.singletonList(new StringBuilder(String.valueOf(replaceAll).length() + 2).append("%").append(replaceAll).append("%").toString()));
                List list = (List) c1202e.mo1519a(c1215q.m7191a("state", Integer.valueOf(11))).get();
                if (list.isEmpty()) {
                    FinskyLog.m21659a("Removing job for %s", c3339i.f17206g);
                    CountDownLatch countDownLatch2 = new CountDownLatch(1);
                    m16760a(countDownLatch2, new ac(this, c3339i, countDownLatch2));
                }
                arrayList.addAll(list);
            }
            if (arrayList.isEmpty()) {
                FinskyLog.m21659a("No matching installs to run", new Object[0]);
                return;
            }
            InstallRequest installRequest = ((C3369m) arrayList.get(0)).f17274d;
            m16771a(new C3370n(installRequest).m16827a(0).m16826a());
            m16759a(new ab(this, installRequest));
            return;
        }
        FinskyLog.m21662b("Skipping as there are active installs running", new Object[0]);
    }

    final void m16784c(Collection collection) {
        Set c0308c = new C0308c();
        for (InstallRequest installRequest : collection) {
            for (InstallConstraint add : installRequest.f17172b) {
                c0308c.add(add);
            }
        }
        ba c = m16783c();
        List<C4026d> list = (List) c.f20259a.m18809a(c.f20261c).get();
        Collection arrayList = new ArrayList();
        try {
            for (C4026d d : list) {
                arrayList.add(new InstallConstraint(C3312b.m16652a(d.m18859d().m18855c("constraint"))));
            }
            c0308c.removeAll(arrayList);
            CountDownLatch countDownLatch = new CountDownLatch(c0308c.size());
            m16760a(countDownLatch, new C3345n(this, c0308c, countDownLatch));
        } catch (Throwable e) {
            throw new ExecutionException(e);
        }
    }

    final void m16772a(C3369m c3369m, int i) {
        InstallRequest installRequest = c3369m.f17274d;
        C2470a c2470a = installRequest.f17171a.f17132b;
        C2127b c2127b = (C2127b) this.f17215d.mo1a();
        C2131e a = new C2131e(c3369m.m16819a()).m11161a(c2470a);
        a.f10834a.put("install_client_event_id", Long.valueOf(c2470a.f13307c));
        a.f10834a.put("last_client_event_id", Long.valueOf(c2470a.f13307c));
        c2127b.mo2660a(a);
        t tVar = new t();
        tVar.a(installRequest.f17171a.f17134d);
        C2322b a2 = ((C2320a) this.f17216e.mo1a()).mo2854a(c3369m.m16819a());
        if (a2 != null) {
            tVar.b(a2.f11419d);
            tVar.a(a2.f11422g);
        } else {
            tVar.b(-1);
        }
        ((C2153a) this.f17217f.mo1a()).m11221a(c3369m.m16819a(), new C2474c(i).m13236a(c3369m.m16819a()).m13244b(installRequest.f17171a.f17147q).m13255h(aj.m13207a(installRequest.f17171a.f17147q)).m13231a(tVar).f13342a);
    }

    private final void m16759a(Runnable runnable) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        m16760a(countDownLatch, new C3346o(runnable, countDownLatch));
    }

    private final void m16760a(CountDownLatch countDownLatch, Runnable runnable) {
        this.f17224m.post(runnable);
        countDownLatch.await();
    }

    final void m16771a(C3369m c3369m) {
        ((C3327a) this.f17212a.mo1a()).f17175f.mo1524b((Object) c3369m).get();
        m16764g();
        synchronized (this.f17228q) {
            this.f17228q.put(c3369m.m16819a(), c3369m);
        }
        m16779b(c3369m);
    }

    final void m16779b(C3369m c3369m) {
        synchronized (this.f17223l) {
            for (C1003o c3347p : this.f17223l) {
                this.f17224m.post(new C3347p(c3347p, c3369m));
            }
        }
    }

    final void m16778b(C3339i c3339i) {
        synchronized (this.f17225n) {
            this.f17225n.remove(Integer.valueOf(c3339i.f17205f));
        }
    }

    private final List m16763f() {
        List arrayList;
        synchronized (this.f17225n) {
            arrayList = new ArrayList(this.f17225n.values());
        }
        return arrayList;
    }

    final synchronized C4819c m16775b() {
        if (this.f17226o == null) {
            this.f17226o = ((C4817d) this.f17219h.mo1a()).mo4399a(Executors.newSingleThreadExecutor());
        }
        return this.f17226o;
    }

    final synchronized ba m16783c() {
        if (this.f17227p == null) {
            this.f17227p = ((bb) this.f17221j.mo1a()).m18890a(3);
        }
        return this.f17227p;
    }

    private final C3369m m16761d(String str) {
        C3369m c3369m;
        synchronized (this.f17228q) {
            if (this.f17229r) {
            } else {
                C4830g.m22622a(m16775b().mo4403a(new C3348q(this)));
            }
        }
        synchronized (this.f17228q) {
            c3369m = (C3369m) this.f17228q.get(str);
        }
        return c3369m;
    }

    private final void m16764g() {
        Throwable e;
        try {
            m16765h();
            return;
        } catch (InterruptedException e2) {
            e = e2;
        } catch (ExecutionException e3) {
            e = e3;
        }
        FinskyLog.m21663b(e, "Exception when loading InstallStatuses", new Object[0]);
    }

    private final void m16765h() {
        synchronized (this.f17228q) {
            if (this.f17229r) {
                return;
            }
            List<C3369m> list = (List) ((C3327a) this.f17212a.mo1a()).f17175f.mo1519a(new C1215q()).get();
            if (list != null) {
                for (C3369m c3369m : list) {
                    this.f17228q.put(c3369m.m16819a(), c3369m);
                }
            }
            this.f17229r = true;
        }
    }

    final /* synthetic */ Void m16785d() {
        m16765h();
        return null;
    }

    final /* synthetic */ C3369m m16781c(C3369m c3369m) {
        C3369m c3369m2 = null;
        C3369m c3369m3 = (C3369m) ((C3327a) this.f17212a.mo1a()).f17175f.mo1521a(c3369m.m16819a()).get();
        if (c3369m3 == null) {
            FinskyLog.m21665c("Cannot find install request for %s", c3369m.m16819a());
        } else {
            Object obj;
            C3370n a = new C3370n(c3369m3.f17274d).m16827a(c3369m.f17273c.f17153d);
            a.f17275a.f17154e.m16656a(c3369m.m16820b());
            a.f17275a.f17156g.m16647a(c3369m.m16821c());
            a.f17275a.f17156g.m16651b(c3369m.m16822d());
            a.f17275a.f17156g.m16646a(c3369m.f17273c.f17156g.f17115d);
            a.f17275a.f17156g.f17116e = c3369m.m16823e();
            C3369m a2 = a.m16826a();
            if (a2.m16825g()) {
                obj = (InstallRequest) ((C2465r) this.f17213b.mo1a()).mo2910a(a2.f17274d).mo2835a(a2).get();
                if (obj != null) {
                    C3370n c3370n = new C3370n((InstallRequest) obj);
                    int i = a2.f17273c.f17155f + 1;
                    C3315e c3315e = c3370n.f17275a;
                    c3315e.f17150a |= 4;
                    c3315e.f17155f = i;
                    c3369m2 = c3370n.m16827a(11).m16826a();
                } else {
                    c3369m2 = a2;
                }
            } else {
                obj = null;
                c3369m2 = a2;
            }
            m16771a(c3369m2);
            if (!c3369m2.m16824f()) {
                m16769a();
            }
            if (obj != null) {
                m16784c(Collections.singletonList(obj));
                m16769a();
            }
        }
        return c3369m2;
    }

    final /* synthetic */ Void m16777b(List list) {
        List list2 = (List) ((C3327a) this.f17212a.mo1a()).f17175f.mo1525c(new C1215q().m7192a("pk", list)).get();
        for (String str : list) {
            m16764g();
            synchronized (this.f17228q) {
                this.f17228q.remove(str);
            }
        }
        m16759a(new C3351t(this, list, list2));
        return null;
    }
}
