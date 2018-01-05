package com.google.android.finsky.notification.impl;

import com.google.android.finsky.cd.C2259b;
import com.google.android.finsky.p108z.C1207b;
import java.util.ArrayList;
import java.util.List;

final class ap implements C1207b {
    public final /* synthetic */ af f19026a;

    ap(af afVar) {
        this.f19026a = afVar;
    }

    public final /* synthetic */ Object mo1528a(Object obj) {
        List<C2259b> list = (List) obj;
        List arrayList = new ArrayList(list.size());
        for (C2259b c2259b : list) {
            as asVar = this.f19026a.f19015d;
            arrayList.add(as.m18108a(c2259b));
        }
        return arrayList;
    }
}
