package com.google.android.finsky.playcard;

import com.google.android.finsky.detailscomponents.C1058q;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;

final class av implements C1058q {
    public final /* synthetic */ C3748a f19614a;
    public final /* synthetic */ Document f19615b;
    public final /* synthetic */ boolean f19616c;

    av(C3748a c3748a, Document document, boolean z) {
        this.f19614a = c3748a;
        this.f19615b = document;
        this.f19616c = z;
    }

    public final void mo1347a(int i) {
        C3748a c3748a = this.f19614a;
        Document document = this.f19615b;
        if (this.f19616c) {
            i--;
        }
        c3748a.mo3651a(document, i);
    }
}
