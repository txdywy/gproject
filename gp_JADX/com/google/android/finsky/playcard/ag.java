package com.google.android.finsky.playcard;

import com.google.android.finsky.detailscomponents.C1058q;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;

final class ag implements C1058q {
    public final /* synthetic */ boolean f19558a;
    public final /* synthetic */ C3748a f19559b;
    public final /* synthetic */ Document f19560c;

    ag(boolean z, C3748a c3748a, Document document) {
        this.f19558a = z;
        this.f19559b = c3748a;
        this.f19560c = document;
    }

    public final void mo1347a(int i) {
        if (this.f19558a) {
            i--;
        }
        this.f19559b.mo3651a(this.f19560c, i);
    }
}
