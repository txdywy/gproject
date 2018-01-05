package com.google.android.finsky.wear;

import com.google.android.finsky.utils.bb;

final class az implements Runnable {
    public final /* synthetic */ C4780a f24850a;
    public final /* synthetic */ boolean f24851b;
    public final /* synthetic */ cc f24852c;
    public final /* synthetic */ ar f24853d;

    az(ar arVar, C4780a c4780a, boolean z, cc ccVar) {
        this.f24853d = arVar;
        this.f24850a = c4780a;
        this.f24851b = z;
        this.f24852c = ccVar;
    }

    public final void run() {
        String[] a = this.f24853d.f24824h.m22521a();
        Runnable baVar = new ba(this, a);
        bb.m21792a(new C4783d(this.f24853d.f24828l, a, baVar), new Void[0]);
        bb.m21792a(new C4793n(this.f24853d.f24828l, a, baVar), new Void[0]);
    }
}
