package com.google.android.finsky.activities.inlineappinstaller.a;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.activities.inlineappinstaller.a;
import com.google.android.finsky.bg.a;
import com.google.android.finsky.billing.lightpurchase.d.a;
import com.google.android.finsky.billing.lightpurchase.d.h;
import com.google.android.finsky.d.j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.m;
import com.google.wireless.android.a.a.a.a.ce;

public final class com.google.android.finsky.activities.inlineappinstaller.a.b extends com.google.android.finsky.billing.lightpurchase.d.h
{

    public final com.google.wireless.android.a.a.a.a.ce a;
    public String b;
    public View c;
    public com.google.android.finsky.activities.inlineappinstaller.a.g d;

    b() {
        com.google.android.finsky.billing.lightpurchase.d.h();
        this.a = com.google.android.finsky.d.j.a(5109);
        this.d = com.google.android.finsky.m.a.aw();
    }

    public final void X() {
        ((com.google.android.finsky.activities.inlineappinstaller.a)this.aa()).a(5110, this);
        ((com.google.android.finsky.activities.inlineappinstaller.a)this.aa()).a(0);
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        this.c = p0.inflate(2130968999, p1, 0);
        this.b = this.q.getString("errorMsg");
        ((TextView)this.c.findViewById(2131755114)).setText(this.b);
        this.d.a((Document)this.q.getParcelable("appDoc"), this.c);
        return this.c;
    }

    public final String a(Resources p0) {
        return p0.getString(2131951822);
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.a;
    }

    public final void u() {
        super.u();
        if (TextUtils.isEmpty(this.b))
            com.google.android.finsky.bg.a.a(this.g(), this.b, this.c, 0);
    }

}
