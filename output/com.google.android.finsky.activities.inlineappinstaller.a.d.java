package com.google.android.finsky.activities.inlineappinstaller.a;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.activities.inlineappinstaller.a;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bd.a;
import com.google.android.finsky.bg.a;
import com.google.android.finsky.billing.lightpurchase.d.a;
import com.google.android.finsky.billing.lightpurchase.d.h;
import com.google.android.finsky.d.j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.m;
import com.google.wireless.android.a.a.a.a.ce;

public final class com.google.android.finsky.activities.inlineappinstaller.a.d extends com.google.android.finsky.billing.lightpurchase.d.h
{

    public final com.google.wireless.android.a.a.a.a.ce a;
    public View b;
    public com.google.android.finsky.activities.inlineappinstaller.a.g c;

    d() {
        com.google.android.finsky.billing.lightpurchase.d.h();
        this.a = com.google.android.finsky.d.j.a(5107);
        this.c = com.google.android.finsky.m.a.aw();
    }

    public final void X() {
        ((com.google.android.finsky.activities.inlineappinstaller.a)this.aa()).a(5108, this);
        ((com.google.android.finsky.activities.inlineappinstaller.a)this.aa()).a(1);
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        this.b = p0.inflate(2130968999, p1, 0);
        this.c.a((Document)this.q.getParcelable("InlineConsumptionAppInstallerReadyToReadStep.appDoc"), this.b);
        return this.b;
    }

    public final String a(Resources p0) {
        if (com.google.android.finsky.m.a.dj().a(12633045) && this.q.getInt("InlineConsumptionAppInstallerReadyToReadStep.mediaDocType") == 64)
            v0 = p0.getString(com.google.android.finsky.bd.a.ak.intValue());
        else
            v0 = p0.getString(2131952979);
        return v0;
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.a;
    }

    public final void u() {
        super.u();
        com.google.android.finsky.bg.a.a(this.g(), this.c(2131951700), this.b, 0);
    }

}
