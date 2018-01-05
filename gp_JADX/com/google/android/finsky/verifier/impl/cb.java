package com.google.android.finsky.verifier.impl;

import com.google.android.finsky.dy.C2927i;
import com.google.android.finsky.dy.ag;
import com.google.android.finsky.dy.ap;
import com.google.android.finsky.verifier.p259a.p260a.C4719w;
import java.util.Collections;
import java.util.List;

final class cb extends ap {
    public final /* synthetic */ byte[] f24526a;
    public final /* synthetic */ bx f24527b;

    cb(bx bxVar, ag agVar, byte[] bArr) {
        this.f24527b = bxVar;
        this.f24526a = bArr;
        super(agVar);
    }

    public final /* synthetic */ Object call() {
        List<C4719w> list = (List) ag.m15236a(this.f15542f.f15534k.mo3201c().mo1519a(C2927i.m15282a(this.f24526a)));
        if (list == null || list.isEmpty()) {
            return Boolean.valueOf(false);
        }
        Collections.sort(list, cc.f24528a);
        long j = -1;
        long j2 = 0;
        for (C4719w c4719w : list) {
            if (j < 0 || !bx.m22231a(j, j2, c4719w.f24274c)) {
                j2 = 1;
            } else {
                j2++;
            }
            j = c4719w.f24274c;
        }
        return Boolean.valueOf(bx.m22231a(j, j2, this.f24527b.f24508q));
    }
}
