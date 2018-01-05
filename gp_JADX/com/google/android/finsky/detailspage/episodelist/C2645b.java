package com.google.android.finsky.detailspage.episodelist;

import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.Document;
import java.util.ArrayList;
import java.util.List;

final class C2645b implements C1031w {
    public final /* synthetic */ C2644a f14522a;

    C2645b(C2644a c2644a) {
        this.f14522a = c2644a;
    }

    public final void m_() {
        List arrayList = new ArrayList(this.f14522a.f14512g.m14698m());
        for (int i = 0; i < this.f14522a.f14512g.m14698m(); i++) {
            arrayList.add((Document) this.f14522a.f14512g.m14679a(i, true));
        }
        ((C2649f) this.f14522a.b).f14526a = arrayList;
        this.f14522a.m14296b();
        this.f14522a.m14284a();
        if (this.f14522a.f14516k != null) {
            for (Document document : ((C2649f) this.f14522a.b).f14526a) {
                if (document.f14885a.f12096c.equals(this.f14522a.f14516k)) {
                    ((C2649f) this.f14522a.b).f14529d = document;
                    this.f14522a.f14516k = null;
                    break;
                }
            }
        }
        this.f14522a.f14515j = false;
        this.f14522a.f14514i = false;
        this.f14522a.m14292a(true);
    }
}
