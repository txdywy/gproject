package com.google.android.finsky.updatechecker.impl;

import com.google.android.finsky.bi.C1641a;
import com.google.android.finsky.bs.C2177a;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.updatechecker.C4642f;
import java.util.ArrayList;
import java.util.List;

final class ad implements C4642f {
    public final /* synthetic */ ab f23937a;

    ad(ab abVar) {
        this.f23937a = abVar;
    }

    public final void mo4318a(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.f23937a.f23922l.m15637b((Document) list.get(i));
        }
        ab abVar = this.f23937a;
        List arrayList = new ArrayList();
        for (Document document : list) {
            Object obj;
            boolean a;
            String str = document.m14625N().f13171k;
            C2322b a2 = abVar.f23914d.f18023c.mo2854a(str);
            Object obj2 = (a2 == null && C1641a.m9335a(document.m14625N())) ? 1 : null;
            if (a2 == null) {
                abVar.f23917g.dj();
                if (C2177a.m11443a() && "com.google.android.instantapps.supervisor".equals(str)) {
                    obj = 1;
                    a = abVar.f23922l.m15633a(a2, document);
                    if (obj2 == null || r1 != null || a) {
                        arrayList.add(document);
                    }
                }
            }
            obj = null;
            a = abVar.f23922l.m15633a(a2, document);
            if (obj2 == null) {
            }
            arrayList.add(document);
        }
        this.f23937a.m21619a(arrayList);
    }
}
