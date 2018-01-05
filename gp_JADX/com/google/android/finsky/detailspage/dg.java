package com.google.android.finsky.detailspage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.a.a.a.a.ce;

public abstract class dg extends ck implements ad {
    public ce f14418d;
    public OnClickListener f14419e;
    public OnClickListener f14420f;

    protected abstract int mo3068a();

    protected abstract String mo3069b();

    protected abstract String mo3070c();

    public final boolean mo2979f() {
        return this.b != null;
    }

    public int mo2978e() {
        return 1;
    }

    public final void mo2976b(View view, int i) {
        dk dkVar = (dk) view;
        if (this.f14419e == null) {
            this.f14419e = new dh(this);
        }
        if (this.f14420f == null) {
            this.f14420f = new di(this);
        }
        dkVar.mo3007a(((dj) this.b).f14423a == null ? null : ((dj) this.b).f14423a.m14625N(), this.y, mo3070c(), this.f14419e, this.f14420f);
        getParentNode().mo1219a(this);
    }

    public ce getPlayStoreUiElement() {
        if (this.f14418d == null) {
            this.f14418d = C2482j.m13283a(mo3068a());
        }
        return this.f14418d;
    }

    public ad getParentNode() {
        return this.I;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}
