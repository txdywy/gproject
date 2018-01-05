package com.google.android.finsky.p142j;

import com.google.android.finsky.aj.C1194e;
import com.google.android.finsky.dfemodel.Document;

final class C3627d extends C3624j {
    C3627d() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        long j;
        long j2 = 0;
        Document document = (Document) obj2;
        C1194e a = this.d.m7142a(((Document) obj).cf());
        C1194e a2 = this.d.m7142a(document.cf());
        if (a == null) {
            j = 0;
        } else {
            j = a.f7297b;
        }
        if (a2 != null) {
            j2 = a2.f7297b;
        }
        return Long.valueOf(j2).compareTo(Long.valueOf(j));
    }
}
