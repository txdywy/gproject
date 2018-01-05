package com.google.android.finsky.detailspage.seasonlist;

import android.text.TextUtils;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dz.C2945a;
import java.util.ArrayList;
import java.util.List;

final class C2665b implements C1031w {
    public final /* synthetic */ C2664a f14740a;

    C2665b(C2664a c2664a) {
        this.f14740a = c2664a;
    }

    public final void m_() {
        int i;
        Document document;
        int m = this.f14740a.f14734f.m14698m();
        Document document2 = null;
        ((C2667d) this.f14740a.b).f14743b = false;
        List arrayList = new ArrayList();
        for (i = 0; i < m; i++) {
            Document document3 = (Document) this.f14740a.f14734f.m14679a(i, true);
            if (document2 == null && TextUtils.equals(document3.f14885a.f12096c, this.f14740a.f14735g)) {
                document2 = document3;
            }
            if (!((C2667d) this.f14740a.b).f14743b && C2945a.m15321d(document3)) {
                ((C2667d) this.f14740a.b).f14743b = true;
            }
            arrayList.add(document3);
        }
        ((C2667d) this.f14740a.b).f14744c = arrayList;
        if (document2 == null) {
            ArrayList arrayList2 = (ArrayList) arrayList;
            int size = arrayList2.size();
            i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                document3 = (Document) obj;
                if (C2945a.m15321d(document3)) {
                    document = document3;
                    break;
                }
            }
        }
        document = document2;
        if (document == null && m > 0) {
            document = (Document) arrayList.get(0);
        }
        if (document != null) {
            this.f14740a.mo3101a(document);
        }
        this.f14740a.m14474a();
    }
}
