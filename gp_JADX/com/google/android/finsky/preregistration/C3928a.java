package com.google.android.finsky.preregistration;

import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.dfemodel.C2718h;
import com.google.android.finsky.dfemodel.C2728s;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class C3928a extends C2728s {
    public final Map f19888d = new HashMap();
    public C1287h f19889e;

    public C3928a() {
        super(false);
        ((C1410q) C3947d.m18649a(C1410q.class)).mo1894a(this);
    }

    protected final void mo3191a(Runnable runnable) {
        if (!this.f19888d.isEmpty()) {
            FinskyLog.m21669e("Unexpected repeat collation", new Object[0]);
        }
        for (C2718h c2718h : this.a) {
            List<Document> b = c2718h.m14719b();
            if (b != null) {
                String c = c2718h.f14924c.mo1636c();
                for (Document document : b) {
                    String str = document.f14885a.f12096c;
                    C3929b c3929b = (C3929b) this.f19888d.get(str);
                    if (c3929b == null) {
                        this.f19888d.put(str, new C3929b(document, c));
                    } else {
                        c3929b.f19891b.add(c);
                    }
                }
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }
}
