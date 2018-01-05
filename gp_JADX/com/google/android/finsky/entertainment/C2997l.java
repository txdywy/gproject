package com.google.android.finsky.entertainment;

import android.os.Handler;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p111d.ah;
import com.google.android.libraries.play.entertainment.p191c.C2981c;

final class C2997l extends C2996k implements ah, C2981c {
    public final Handler f15682d;
    public long f15683e;

    public C2997l(Handler handler, C2495w c2495w, int i, byte[] bArr) {
        super(c2495w, i, bArr, null);
        this.f15682d = handler;
    }

    private final C2997l m15489c(C2495w c2495w) {
        if (this.a == c2495w) {
            return this;
        }
        return new C2997l(this.f15682d, c2495w, getPlayStoreUiElement().c, getPlayStoreUiElement().d);
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13288a(this.f15682d, this.f15683e, this, adVar, this.a);
    }

    public final void mo1222m() {
        C2482j.m13289a(this.f15682d, this.f15683e, (ah) this, this.a);
    }

    public final void o_() {
        this.f15683e = C2482j.m13315j();
    }

    public final C2495w mo1224n() {
        return this.a;
    }

    protected final /* synthetic */ C2996k mo3241b(C2495w c2495w) {
        return m15489c(c2495w);
    }

    protected final /* synthetic */ C2995j mo3240a(C2495w c2495w) {
        return m15489c(c2495w);
    }
}
