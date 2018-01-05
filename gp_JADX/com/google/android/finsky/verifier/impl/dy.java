package com.google.android.finsky.verifier.impl;

import com.android.volley.C0660x;
import com.google.android.finsky.foregroundcoordinator.ForegroundCoordinator;
import com.google.android.finsky.utils.bb;
import com.google.android.finsky.verifier.impl.p262a.C4735g;
import java.util.List;

final class dy implements C0660x {
    public final List f24647a;
    public final ea f24648b;
    public final /* synthetic */ dk f24649c;

    public dy(dk dkVar, List list, ea eaVar) {
        this.f24649c = dkVar;
        this.f24647a = list;
        this.f24648b = eaVar;
    }

    public final /* synthetic */ void b_(Object obj) {
        C4735g[] c4735gArr = (C4735g[]) obj;
        dk dkVar = this.f24649c;
        if (dkVar.f24620z != null) {
            ForegroundCoordinator.m16015a(dkVar.f24620z);
            dkVar.f24620z = null;
        }
        bb.m21792a(new dz(this, c4735gArr), new Void[0]);
    }
}
