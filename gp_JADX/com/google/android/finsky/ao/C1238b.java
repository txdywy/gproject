package com.google.android.finsky.ao;

import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1283d;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.cv.p177a.ch;
import com.google.android.finsky.utils.C4672c;
import com.google.android.finsky.utils.C4680k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final /* synthetic */ class C1238b implements Runnable {
    public final C1237a f7392a;

    C1238b(C1237a c1237a) {
        this.f7392a = c1237a;
    }

    public final void run() {
        C1237a c1237a = this.f7392a;
        if (!c1237a.f7390f.isEmpty()) {
            C1243g c1243g = (C1243g) c1237a.f7390f.remove(0);
            Collection<C1246j> collection = c1243g.f7402b.f7405b;
            Map hashMap = new HashMap();
            Object[] a = C4680k.m21818a((String) C0955b.jR.m28964b());
            for (C1246j c1246j : collection) {
                List arrayList = new ArrayList();
                hashMap.put(c1246j.f7408a, arrayList);
                for (ch chVar : c1246j.f7409b.f12312d) {
                    if (chVar != null && C4672c.m21804a(a, chVar.f12035c)) {
                        boolean z;
                        C2322b a2 = c1237a.f7386b.mo2854a(chVar.f12035c);
                        if (a2 == null) {
                            z = false;
                        } else {
                            c1237a.f7387c.m17263a(chVar).m17262a(a2);
                            z = c1237a.f7387c.m17269e();
                        }
                        if (!z) {
                            if ((chVar.f12034b & 16) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z && chVar.f12039g) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                arrayList.add(chVar.f12035c);
                            }
                        }
                    }
                }
            }
            Collection a3 = C1237a.m7240a(hashMap);
            if (a3.isEmpty()) {
                c1237a.m7243a(c1243g, new C1248l().m7249a());
                return;
            }
            C1254c a4 = c1237a.f7385a.mo2016a(c1243g.f7402b.f7404a);
            if (a4 == null) {
                C1248l c1248l = new C1248l();
                c1248l.f7413b = 2201;
                c1237a.m7243a(c1243g, c1248l.m7249a());
                return;
            }
            c1237a.f7391g.put(Integer.valueOf(c1243g.f7401a), a4.mo1605a(C1283d.m7689a(a3), false, new C1239c(c1237a, hashMap, c1243g), new C1240d(c1237a, c1243g)));
        }
    }
}
