package com.google.android.finsky.verifier.impl;

import com.google.android.finsky.dy.ag;
import com.google.android.finsky.dy.ap;
import com.google.android.finsky.verifier.p259a.p260a.C4697a;
import com.google.android.finsky.verifier.p259a.p260a.C4719w;
import com.google.android.finsky.verifier.p259a.p260a.ab;
import java.util.ArrayList;

final class cn extends ap {
    public final /* synthetic */ C4697a f24551a;
    public final /* synthetic */ C4719w f24552b;
    public final /* synthetic */ ab f24553c;
    public final /* synthetic */ bx f24554d;

    cn(bx bxVar, ag agVar, C4697a c4697a, C4719w c4719w, ab abVar) {
        this.f24554d = bxVar;
        this.f24551a = c4697a;
        this.f24552b = c4719w;
        this.f24553c = abVar;
        super(agVar);
    }

    public final /* synthetic */ Object call() {
        Iterable arrayList = new ArrayList();
        arrayList.add(this.f15542f.f15534k.mo3200b().mo1524b(this.f24551a));
        arrayList.add(this.f15542f.f15534k.mo3201c().mo1524b(this.f24552b));
        if (this.f24553c != null) {
            arrayList.add(this.f15542f.f15534k.mo3199a().mo1524b(this.f24553c));
        }
        return this.f24554d.f24496e.mo4400a(arrayList);
    }
}
