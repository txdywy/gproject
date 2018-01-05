package com.google.android.finsky.detailspage;

import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.Document;
import java.util.ArrayList;
import java.util.List;

final class bw implements C1031w {
    public final /* synthetic */ bt f14343a;

    bw(bt btVar) {
        this.f14343a = btVar;
    }

    public final void m_() {
        List arrayList = new ArrayList(this.f14343a.f14329h.m14698m());
        for (int i = 0; i < this.f14343a.f14329h.m14698m(); i++) {
            arrayList.add((Document) this.f14343a.f14329h.m14679a(i, true));
        }
        ((by) this.f14343a.b).f14347c = arrayList;
        this.f14343a.m14005b();
        this.f14343a.m14014j();
        if (this.f14343a.f14334m != null) {
            for (Document document : ((by) this.f14343a.b).f14347c) {
                if (document.f14885a.f12096c.equals(this.f14343a.f14334m)) {
                    ((by) this.f14343a.b).f14350f = document;
                    this.f14343a.f14334m = null;
                }
            }
        }
        this.f14343a.f14331j = null;
        this.f14343a.f14330i = null;
        this.f14343a.m14001a(true);
    }
}
