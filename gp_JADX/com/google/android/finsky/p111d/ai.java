package com.google.android.finsky.p111d;

import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;

public final class ai extends C2473o {
    public boolean f13341c;

    public ai(int i, byte[] bArr, ad adVar) {
        super(i, bArr, adVar);
        this.f13341c = false;
        this.f13341c = false;
    }

    public final void mo1219a(ad adVar) {
        if (this.f13341c) {
            super.mo1219a(adVar);
            return;
        }
        ce playStoreUiElement = adVar.getPlayStoreUiElement();
        if (playStoreUiElement == null) {
            throw new IllegalArgumentException("childNode has null element");
        }
        C2482j.m13298a((ad) this, playStoreUiElement);
    }

    public final void mo2914a() {
        if (this.f13341c) {
            super.mo2914a();
        } else {
            FinskyLog.m21669e("Should not be report impressions when not selected", new Object[0]);
        }
    }

    public final void m13206a(boolean z) {
        ad parentNode = getParentNode();
        if (z) {
            C2482j.m13298a(parentNode, getPlayStoreUiElement());
            if (getPlayStoreUiElement().f.length > 0) {
                parentNode.mo1219a(this);
            }
        } else {
            C2482j.m13302b(parentNode);
            C2482j.m13299a(parentNode.getPlayStoreUiElement(), getPlayStoreUiElement());
        }
        this.f13341c = z;
    }
}
