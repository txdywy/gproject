package com.google.android.finsky.activities.inlineappinstaller.a;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.activities.inlineappinstaller.a;
import com.google.android.finsky.bg.a;
import com.google.android.finsky.billing.lightpurchase.d.a;
import com.google.android.finsky.billing.lightpurchase.d.h;
import com.google.android.finsky.cq.d;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.d.j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.m;
import com.google.android.finsky.permissionui.AppSecurityPermissions;
import com.google.android.finsky.permissionui.e;
import com.google.android.finsky.permissionui.f;
import com.google.wireless.android.a.a.a.a.ce;

public final class com.google.android.finsky.activities.inlineappinstaller.a.c extends com.google.android.finsky.billing.lightpurchase.d.h
{

    public final com.google.wireless.android.a.a.a.a.ce a;
    public Document b;
    public AppSecurityPermissions c;
    public View d;
    public com.google.android.finsky.activities.inlineappinstaller.a.g e;

    c() {
        com.google.android.finsky.billing.lightpurchase.d.h();
        this.a = com.google.android.finsky.d.j.a(5111);
        this.e = com.google.android.finsky.m.a.aw();
    }

    public final void X() {
        ((com.google.android.finsky.activities.inlineappinstaller.a)this.aa()).a(5112, this);
        ((com.google.android.finsky.activities.inlineappinstaller.a)this.aa()).X();
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        this.b = (Document)this.q.getParcelable("appDoc");
        this.d = p0.inflate(2130969000, p1, 0);
        this.c = (AppSecurityPermissions)this.d.findViewById(2131756072);
        ((TextView)this.d.findViewById(2131755114)).setText(this.b.a.g);
        v6 = (TextView)this.d.findViewById(2131756071);
        v6.setVisibility(0);
        this.e.a(this.b, this.d);
        v4 = com.google.android.finsky.m.a.aV().b(com.google.android.finsky.m.a.c(), this.b.a.d);
        v1 = com.google.android.finsky.m.a.bU().a(this.h(), this.b.a.d, this.b.N().g, v4, 0);
        if (v1.a() && v4 != 0)
            v0 = 2131951695;
        else
            v0 = 2131952597;
        v6.setText(v0);
        this.c.a(v1, this.b.a.g);
        this.c.requestFocus();
        return this.d;
    }

    public final String a(Resources p0) {
        return p0.getString(2131951649);
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.a;
    }

    public final void u() {
        super.u();
        com.google.android.finsky.bg.a.a(this.g(), this.c(2131952839), this.d, 0);
    }

}
