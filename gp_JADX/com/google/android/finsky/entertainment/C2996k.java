package com.google.android.finsky.entertainment;

import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.a.a.a.a.ce;

class C2996k extends C2995j implements ad {
    public final ce f15680b;
    public final C2995j f15681c;

    C2996k(C2495w c2495w, int i, byte[] bArr, C2995j c2995j) {
        super(c2495w);
        this.f15681c = c2995j;
        this.f15680b = C2482j.m13283a(i);
        C2482j.m13285a(this.f15680b, bArr);
    }

    protected C2996k mo3241b(C2495w c2495w) {
        C2995j a = this.f15681c == null ? null : this.f15681c.mo3240a(c2495w);
        if (c2495w == this.a && a == this.f15681c) {
            return this;
        }
        return new C2996k(c2495w, this.f15680b.c, this.f15680b.d, a);
    }

    public void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public ce getPlayStoreUiElement() {
        return this.f15680b;
    }

    public ad getParentNode() {
        if (this.f15681c instanceof C2996k) {
            return (C2996k) this.f15681c;
        }
        return null;
    }

    protected /* synthetic */ C2995j mo3240a(C2495w c2495w) {
        return mo3241b(c2495w);
    }
}
