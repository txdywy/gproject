package com.google.android.finsky.stream.controllers;

import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p142j.C3623a;
import java.util.Comparator;

final class bu implements Comparator {
    public final /* synthetic */ bt f21960a;

    bu(bt btVar) {
        this.f21960a = btVar;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Document document = (Document) obj;
        Document document2 = (Document) obj2;
        int b = this.f21960a.A.mo3482b(document.cf());
        if (b == 2 || b == 3) {
            return -1;
        }
        b = this.f21960a.A.mo3482b(document2.cf());
        if (b == 2 || b == 3) {
            return 1;
        }
        return C3623a.f17983f.compare(document, document2);
    }
}
