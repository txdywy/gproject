package com.google.android.finsky.billing.lightpurchase.e;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.u;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.common.m;
import com.google.android.finsky.billing.lightpurchase.aq;
import com.google.android.finsky.billing.lightpurchase.d.h;
import com.google.android.finsky.billing.w;
import com.google.android.finsky.d.j;
import com.google.android.finsky.m;
import com.google.wireless.android.a.a.a.a.ce;

public final class com.google.android.finsky.billing.lightpurchase.e.ab extends com.google.android.finsky.billing.w
{

    public final com.google.wireless.android.a.a.a.a.ce aj;

    ab() {
        com.google.android.finsky.billing.w();
        this.aj = com.google.android.finsky.d.j.a(775);
    }

    private final boolean ab() {
        if (this.aa() == 0 || ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).h() == 0 || ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).h().getIntent() == 0)
            v0 = 0;
        else {
            v0 = (PurchaseParams)((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).h().getIntent().getParcelableExtra("PurchaseActivity.params");
            if (v0 != 0 && v0.s != 0)
                v0 = 1;
            else
                v0 = 0;
        }
        return v0;
    }

    public final void X() {
        this.a(778, 0);
        if (this.ab())
            ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).ac();
        else
            this.Y();
    }

    protected final void Y() {
        ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).ag();
    }

    public final void Z() {
        this.a(779, 0);
        ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).ac();
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        v2 = super.a(p0, p1, p2);
        com.google.android.finsky.m.a.aH().a(this.q, v2, this.i, this.af, 0, 0, 0, ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).ao());
        return v2;
    }

    public final String a(Resources p0) {
        if (this.ab())
            v0 = p0.getString(2131952688);
        else
            v0 = super.a(p0);
        return v0;
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.aj;
    }

}
