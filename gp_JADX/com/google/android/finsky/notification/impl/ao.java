package com.google.android.finsky.notification.impl;

import com.google.android.finsky.ak.C1202e;
import com.google.android.finsky.ak.C1215q;
import com.google.android.finsky.cd.C2259b;
import com.google.android.finsky.p108z.C2919a;
import com.google.android.finsky.p108z.C4809e;
import java.util.ArrayList;
import java.util.List;

final class ao implements C2919a {
    public final /* synthetic */ an f19025a;

    ao(an anVar) {
        this.f19025a = anVar;
    }

    public final /* synthetic */ C4809e mo3198a(Object obj) {
        List<C2259b> list = (List) obj;
        C1202e c1202e = this.f19025a.f19024a.f19014c;
        C1215q c1215q = new C1215q();
        String str = "pk";
        List arrayList = new ArrayList(list.size());
        for (C2259b c2259b : list) {
            arrayList.add(af.m18083a(c2259b.f11206b, c2259b.f11207c));
        }
        c1215q.m7194a(str, "not in", arrayList);
        return c1202e.mo1523b(c1215q);
    }
}
