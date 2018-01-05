package com.google.android.finsky.billing.redeem.a;

import android.os.Bundle;
import android.support.v4.a.d;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.billing.common.m;
import com.google.android.finsky.billing.lightpurchase.d.a;
import com.google.android.finsky.billing.lightpurchase.d.h;
import com.google.android.finsky.billing.redeem.a;
import com.google.android.finsky.billing.w;
import com.google.android.finsky.d.j;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.r;

public final class com.google.android.finsky.billing.redeem.a.g extends com.google.android.finsky.billing.w
{

    public final com.google.wireless.android.a.a.a.a.ce aj;

    g() {
        com.google.android.finsky.billing.w();
        this.aj = com.google.android.finsky.d.j.a(885);
    }

    public final void X() {
        if (!TextUtils.isEmpty(this.f))
            this.a(1109, 0);
        else
            this.a(886, 0);
        this.Y();
    }

    protected final void Y() {
        ((com.google.android.finsky.billing.redeem.a)this.aa()).X();
    }

    public final void Z() {
        this.a(1108, 0);
        v0 = (com.google.android.finsky.billing.redeem.a)this.aa();
        if (this.g != 0 && v0.a(this.g))
            FinskyLog.a("Dialog shown, waiting for user input.", new Object[0]);
        else
            v0.Y();
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        v2 = super.a(p0, p1, p2);
        com.google.android.finsky.m.a.aH().a(this.q, v2, this.i, this.af, 0, 0, 0, ((com.google.android.finsky.billing.redeem.a)this.aa()).aF);
        return v2;
    }

    protected final void a(com.google.wireless.android.finsky.dfe.nano.r p0) {
        super.a(p0);
        v1 = android.support.v4.a.d.c(this.h.getContext(), 2131558791);
        ((TextView)this.h.findViewById(2131756830)).setLinkTextColor(v1);
        ((TextView)this.h.findViewById(2131756321)).setLinkTextColor(v1);
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.aj;
    }

}
