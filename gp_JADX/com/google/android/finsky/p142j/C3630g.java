package com.google.android.finsky.p142j;

import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p226m.C3740a;

final class C3630g extends C3624j {
    C3630g() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        long j;
        long j2 = 0;
        Document document = (Document) obj2;
        C3740a a = this.b.m17617a(((Document) obj).m14625N().f13171k);
        C3740a a2 = this.b.m17617a(document.m14625N().f13171k);
        if (a == null) {
            j = 0;
        } else {
            j = a.f18883b;
        }
        Long valueOf = Long.valueOf(j);
        if (a2 != null) {
            j2 = a2.f18883b;
        }
        return Long.valueOf(j2).compareTo(valueOf);
    }
}
