package com.google.android.finsky.detailscomponents;

import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dfemodel.Document;
import java.util.ArrayList;
import java.util.List;

public final class C2596w {
    public static C2595v m13652a(Document document, int i) {
        bd a;
        C2595v c2595v = new C2595v();
        c2595v.f13814a = C2586l.m13642a(document);
        c2595v.f13815b = document.f14885a.f12088E;
        c2595v.f13816c = document.f14885a.f12100g;
        c2595v.f13817d = document.f14885a.f12099f;
        List<bd> c = document.m14644c(1);
        List arrayList = new ArrayList();
        for (bd a2 : c) {
            C2591r c2591r = new C2591r();
            c2591r.f13796a = a2;
            c2591r.f13797b = 0;
            arrayList.add(c2591r);
        }
        if (C2586l.m13643b(document)) {
            a2 = C2581g.m13636a(document);
            if (a2 != null) {
                C2591r c2591r2 = new C2591r();
                c2591r2.f13796a = a2;
                c2591r2.f13797b = 1;
                c2591r2.f13798c = ((bd) document.m14644c(3).get(0)).f11860f;
                arrayList.add(0, c2591r2);
            }
        }
        c2595v.f13818e = arrayList;
        c2595v.f13819f = i;
        return c2595v;
    }
}
