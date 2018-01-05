package com.google.android.finsky.p142j;

import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p226m.C3740a;

final class C3628e extends C3624j {
    C3628e() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        long j;
        long j2 = 0;
        Document document = (Document) obj;
        Document document2 = (Document) obj2;
        C3740a a = this.b.m17617a(document.m14625N().f13171k);
        C3740a a2 = this.b.m17617a(document2.m14625N().f13171k);
        if (a == null) {
            j = 0;
        } else {
            j = a.f18883b;
        }
        if (a2 != null) {
            j2 = a2.f18883b;
        }
        if (j == j2) {
            j2 = this.a.m17234a(document.cf());
            j = this.a.m17234a(document2.cf());
            if (j2 == j) {
                return document.f14885a.f12100g.compareTo(document2.f14885a.f12100g);
            }
            if (j2 >= j) {
                return -1;
            }
            return 1;
        } else if (j <= j2) {
            return -1;
        } else {
            return 1;
        }
    }
}
