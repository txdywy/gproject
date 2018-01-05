package com.google.android.finsky.p111d;

import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.a.a.a.a.cf;

public class C2473o implements ad {
    public ce f13339a;
    public ad f13340b;

    public C2473o(int i, byte[] bArr, ad adVar) {
        m13200a(i, bArr, adVar);
    }

    public C2473o(int i, ad adVar) {
        this(i, null, adVar);
    }

    public C2473o(int i) {
        this(i, null);
    }

    public final void m13200a(int i, byte[] bArr, ad adVar) {
        this.f13339a = C2482j.m13283a(i);
        C2482j.m13285a(this.f13339a, bArr);
        this.f13340b = adVar;
    }

    public final void m13203a(byte[] bArr) {
        C2482j.m13285a(this.f13339a, bArr);
    }

    public final void m13202a(cf cfVar) {
        this.f13339a.e = cfVar;
    }

    public ce getPlayStoreUiElement() {
        return this.f13339a;
    }

    public ad getParentNode() {
        return this.f13340b;
    }

    public void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public void mo2914a() {
        if (this.f13340b == null) {
            FinskyLog.m21669e("Cannot log impression because null parent. Type=%d", Integer.valueOf(this.f13339a.c));
            return;
        }
        this.f13340b.mo1219a(this);
    }
}
