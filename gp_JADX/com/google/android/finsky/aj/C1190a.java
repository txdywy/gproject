package com.google.android.finsky.aj;

import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p108z.C4817d;
import com.google.android.finsky.p108z.C4819c;
import com.google.android.finsky.utils.C4678i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;

public final class C1190a {
    public final Map f7288a = new ConcurrentHashMap();
    public final C1195g f7289b;
    public final List f7290c = new ArrayList();
    public C4819c f7291d;

    public C1190a(C1195g c1195g, C4817d c4817d) {
        this.f7289b = c1195g;
        this.f7291d = c4817d.mo4399a(Executors.newFixedThreadPool(((Integer) C0955b.hC.m28964b()).intValue()));
    }

    public final void m7143a(List list) {
        for (Document document : list) {
            C1194e c1194e = (C1194e) this.f7288a.get(document.cf());
            if (c1194e != null) {
                if ((c1194e.f7298c < C4678i.m21812a() - ((Long) C0955b.hD.m28964b()).longValue() ? 1 : null) == null) {
                }
            }
            String cf = document.cf();
            this.f7291d.mo4403a(new C1191b(this, cf)).mo4398a(new C1192c(this, cf));
        }
    }

    public final C1194e m7142a(String str) {
        return (C1194e) this.f7288a.get(str);
    }

    public final boolean m7144a() {
        return this.f7288a.size() > 0;
    }
}
