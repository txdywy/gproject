package com.google.android.finsky.detailspage;

import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dz.C2945a;
import java.util.ArrayList;
import java.util.List;

final class bu implements C1031w {
    public final /* synthetic */ bt f14341a;

    bu(bt btVar) {
        this.f14341a = btVar;
    }

    public final void m_() {
        int m = this.f14341a.f14328g.m14698m();
        if (m != 0) {
            int i;
            ((by) this.f14341a.b).f14349e = null;
            List arrayList = new ArrayList();
            for (i = 0; i < m; i++) {
                Document document = (Document) this.f14341a.f14328g.m14679a(i, true);
                if (((by) this.f14341a.b).f14349e == null && document.f14885a.f12096c.equals(this.f14341a.f14335n)) {
                    ((by) this.f14341a.b).f14349e = document;
                }
                arrayList.add(document);
            }
            ((by) this.f14341a.b).f14346b = arrayList;
            if (((by) this.f14341a.b).f14349e == null) {
                ArrayList arrayList2 = (ArrayList) arrayList;
                m = arrayList2.size();
                i = 0;
                while (i < m) {
                    Object obj = arrayList2.get(i);
                    i++;
                    Document document2 = (Document) obj;
                    if (C2945a.m15322e(document2)) {
                        ((by) this.f14341a.b).f14349e = document2;
                        break;
                    }
                }
            }
            if (((by) this.f14341a.b).f14349e == null) {
                ((by) this.f14341a.b).f14349e = (Document) arrayList.get(0);
            }
            this.f14341a.u.mo3036b("EpisodeListModule.SeasonDocument", ((by) this.f14341a.b).f14349e);
            if (((by) this.f14341a.b).f14347c == null) {
                this.f14341a.m13994a();
            }
        }
    }
}
