package com.google.android.finsky.installqueue.p141a;

import android.support.v4.p037h.C0305a;
import android.support.v4.p037h.C0308c;
import com.google.android.finsky.ak.C1215q;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.installqueue.C3370n;
import com.google.android.finsky.installqueue.InstallRequest;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.p188a.C4668b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

final /* synthetic */ class C3344m implements Callable {
    public final C3342k f17232a;
    public final Collection f17233b;

    C3344m(C3342k c3342k, Collection collection) {
        this.f17232a = c3342k;
        this.f17233b = collection;
    }

    public final Object call() {
        C3342k c3342k = this.f17232a;
        Collection<InstallRequest> collection = this.f17233b;
        Map c0305a = new C0305a();
        for (InstallRequest installRequest : collection) {
            c0305a.put(installRequest.f17171a.f17133c, new C3370n(installRequest).m16827a(11).m16826a());
        }
        List<C3369m> list = (List) ((C3327a) c3342k.f17212a.mo1a()).f17175f.mo1519a(new C1215q().m7192a("pk", new ArrayList(c0305a.keySet()))).get();
        Set c0308c = new C0308c();
        Set c0308c2 = new C0308c();
        for (C3369m c3369m : list) {
            C3369m a = c3342k.m16766a(c3369m, ((C3369m) c0305a.get(c3369m.m16819a())).f17274d);
            if (a != null) {
                FinskyLog.m21665c("Resolved conflict: %s", a);
                c0305a.put(a.m16819a(), a);
                c0308c.add(a.m16819a());
            } else {
                FinskyLog.m21665c("Ignoring conflicting request: %s", c3369m.m16819a());
                c0308c2.add(c3369m.m16819a());
            }
        }
        for (C3369m c3369m2 : c0305a.values()) {
            c3342k.m16771a(c3369m2);
            if (c0308c.contains(c3369m2.m16819a())) {
                c3342k.m16772a(c3369m2, 252);
            } else if (c0308c2.contains(c3369m2.m16819a())) {
                c3342k.m16772a(c3369m2, 253);
            } else {
                c3342k.m16772a(c3369m2, 250);
            }
        }
        c3342k.m16784c(C4668b.m21678a(new ArrayList(c0305a.values()), C3352u.f17247a));
        c3342k.m16769a();
        return null;
    }
}
