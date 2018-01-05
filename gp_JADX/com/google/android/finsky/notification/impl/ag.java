package com.google.android.finsky.notification.impl;

import com.google.android.finsky.notification.C3667j;
import com.google.android.finsky.p108z.C1207b;
import java.util.List;

final /* synthetic */ class ag implements C1207b {
    public final af f19020a;

    ag(af afVar) {
        this.f19020a = afVar;
    }

    public final Object mo1528a(Object obj) {
        af afVar = this.f19020a;
        List list = (List) obj;
        if (afVar.f19019h != list.size()) {
            afVar.f19019h = list.size();
            for (C3667j a : afVar.f19018g) {
                a.mo3577a(afVar.f19019h);
            }
        }
        return null;
    }
}
