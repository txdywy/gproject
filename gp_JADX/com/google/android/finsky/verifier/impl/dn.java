package com.google.android.finsky.verifier.impl;

import com.google.android.finsky.ak.C1215q;
import com.google.android.finsky.dy.C2924f;
import com.google.android.finsky.dy.C2926g;
import com.google.android.finsky.dy.ag;
import com.google.android.finsky.dy.ap;
import com.google.android.finsky.utils.C4691w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.verifier.p259a.p260a.C4697a;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

final class dn extends ap {
    public final /* synthetic */ List f24623a;

    dn(ag agVar, List list) {
        this.f24623a = list;
        super(agVar);
    }

    public final /* synthetic */ Object call() {
        int i;
        C2924f c2924f = new C2924f(this.f15542f.f15534k, this.f24623a);
        FinskyLog.m21659a("Cleaning the verify apps datastore", new Object[0]);
        List<C4697a> list = (List) ag.m15236a(c2924f.f15548d.mo3200b().mo1519a(new C1215q()));
        Set emptySet;
        if (list == null) {
            emptySet = Collections.emptySet();
        } else {
            emptySet = new HashSet();
            for (C4697a c4697a : list) {
                emptySet.add(C4691w.m21842a(c4697a.f24089b));
            }
        }
        Set hashSet = new HashSet();
        boolean a = c2924f.m15277a((Set) r1);
        List list2 = (List) ag.m15236a(c2924f.f15548d.mo3201c().mo1520a(new C1215q(), "sha256", null));
        if (list2 == null) {
            i = 0;
        } else {
            C2924f.m15275a(list2, new C2926g(c2924f, r1));
            i = 1;
        }
        if ((((i & a) & c2924f.m15279b(r1, hashSet)) & c2924f.m15278a((Set) r1, hashSet)) != 0) {
            for (String d : r1) {
                ag.m15236a(c2924f.f15548d.mo3200b().mo1527d(d));
            }
        }
        FinskyLog.m21659a("Finished cleaning the verify apps datastore", new Object[0]);
        return null;
    }
}
