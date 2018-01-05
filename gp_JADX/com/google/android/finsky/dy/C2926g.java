package com.google.android.finsky.dy;

import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.C4691w;
import com.google.android.finsky.verifier.p259a.p260a.C4719w;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class C2926g implements C2925h {
    public final /* synthetic */ Set f15551a;
    public final /* synthetic */ C2924f f15552b;

    public C2926g(C2924f c2924f, Set set) {
        this.f15552b = c2924f;
        this.f15551a = set;
    }

    public final void mo3206a(byte[] bArr, List list) {
        String a = C4691w.m21842a(bArr);
        long a2 = C4678i.m21812a();
        List arrayList = new ArrayList();
        C4719w c4719w = null;
        Object obj = null;
        for (C4719w c4719w2 : list) {
            C4719w c4719w3;
            Object obj2;
            Object obj3 = null;
            long j = c4719w2.f24274c;
            if (Math.abs(j - a2) > C2924f.f15545a) {
                arrayList.add(c4719w2);
                obj3 = 1;
            } else {
                this.f15551a.remove(a);
            }
            if (c4719w == null || (c4719w.f24274c > a2 ? j <= a2 || j > c4719w.f24274c : j <= a2 && j > c4719w.f24274c)) {
                c4719w3 = c4719w2;
                obj2 = obj3;
            } else {
                obj2 = obj;
                c4719w3 = c4719w;
            }
            c4719w = c4719w3;
            obj = obj2;
        }
        if (obj != null) {
            if (this.f15552b.m15276a(a)) {
                this.f15551a.remove(C4691w.m21842a(c4719w.f24273b));
            } else {
                c4719w = null;
            }
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj4 = arrayList2.get(i);
            i++;
            obj4 = (C4719w) obj4;
            if (c4719w == null || obj4.f24274c != c4719w.f24274c) {
                ag.m15236a(this.f15552b.f15548d.mo3201c().mo1526c(obj4));
            }
        }
    }
}
