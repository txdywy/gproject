package com.google.android.finsky.verifier.impl;

import com.google.android.finsky.dy.aq;
import com.google.android.finsky.dy.as;
import com.google.android.finsky.verifier.p259a.p260a.C4697a;
import com.google.android.finsky.verifier.p259a.p260a.C4722z;
import java.util.ArrayList;

final /* synthetic */ class C4758j implements aq {
    public final C4756h f24684a;
    public final C4697a f24685b;
    public final C4722z f24686c;

    C4758j(C4756h c4756h, C4697a c4697a, C4722z c4722z) {
        this.f24684a = c4756h;
        this.f24685b = c4697a;
        this.f24686c = c4722z;
    }

    public final Object mo4346a(as asVar) {
        C4756h c4756h = this.f24684a;
        Object obj = this.f24685b;
        Object obj2 = this.f24686c;
        Iterable arrayList = new ArrayList();
        arrayList.add(asVar.mo3200b().mo1524b(obj));
        arrayList.add(asVar.mo3202d().mo1524b(obj2));
        return c4756h.f24680c.mo4400a(arrayList);
    }
}
