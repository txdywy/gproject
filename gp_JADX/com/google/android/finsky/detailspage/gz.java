package com.google.android.finsky.detailspage;

import com.google.android.finsky.ao.C1242f;
import com.google.android.finsky.ao.C1247k;
import com.google.android.finsky.dfemodel.Document;
import java.util.Collections;

final /* synthetic */ class gz implements C1242f {
    public final gy f14667a;
    public final Document f14668b;

    gz(gy gyVar, Document document) {
        this.f14667a = gyVar;
        this.f14668b = document;
    }

    public final void mo2546a(C1247k c1247k) {
        gy gyVar = this.f14667a;
        Document document = this.f14668b;
        if (c1247k.f7410a == 0) {
            gyVar.f14666i = c1247k.m7248a(document.cf());
            gyVar.m14429a();
            return;
        }
        gyVar.f14666i = Collections.EMPTY_LIST;
    }
}
