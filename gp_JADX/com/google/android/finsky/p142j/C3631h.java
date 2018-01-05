package com.google.android.finsky.p142j;

import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.dfemodel.Document;

final class C3631h extends C3624j {
    C3631h() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Document document = (Document) obj2;
        String str = ((Document) obj).m14625N().f13171k;
        String str2 = document.m14625N().f13171k;
        C2129c a = this.c.f18022b.mo2657a(str);
        C2129c a2 = this.c.f18022b.mo2657a(str2);
        if (a == null && a2 == null) {
            return str.compareTo(str2);
        }
        if (a == null) {
            return 1;
        }
        if (a2 == null) {
            return -1;
        }
        if (a.f10800G == a2.f10800G) {
            return str.compareTo(str2);
        }
        return Long.valueOf(a.f10800G).compareTo(Long.valueOf(a2.f10800G));
    }
}
