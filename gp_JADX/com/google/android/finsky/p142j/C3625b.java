package com.google.android.finsky.p142j;

import com.google.android.finsky.dfemodel.Document;

final class C3625b extends C3624j {
    C3625b() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Document document = (Document) obj;
        Document document2 = (Document) obj2;
        int compare = C3623a.f17978a.compare(document.f14885a.f12100g, document2.f14885a.f12100g);
        if (compare != 0) {
            return compare;
        }
        return document.m14625N().f13171k.compareTo(document2.m14625N().f13171k);
    }
}
