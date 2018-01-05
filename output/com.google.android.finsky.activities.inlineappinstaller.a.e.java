package com.google.android.finsky.activities.inlineappinstaller.a;

import android.content.res.Resources;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.activities.inlineappinstaller.a;
import com.google.android.finsky.activities.inlineappinstaller.c;
import com.google.android.finsky.bg.a;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.billing.lightpurchase.d.a;
import com.google.android.finsky.billing.lightpurchase.d.h;
import com.google.android.finsky.br.a;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.p;

public final class com.google.android.finsky.activities.inlineappinstaller.a.e extends com.google.android.finsky.billing.lightpurchase.d.h
{

    public final com.google.wireless.android.a.a.a.a.ce a;
    public View b;
    public com.google.android.finsky.cv.a.cv c;

    e() {
        com.google.android.finsky.billing.lightpurchase.d.h();
        this.a = com.google.android.finsky.d.j.a(5101);
    }

    public final void X() {
        ((com.google.android.finsky.activities.inlineappinstaller.a)this.aa()).a(5102, this);
        v0 = (com.google.android.finsky.activities.inlineappinstaller.a)this.aa();
        if (Build$VERSION.SDK_INT > 22 && v0.a.c.ai() > 22)
            v0.X();
        else
            v0.a.b(6, 0);
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        this.c = (com.google.android.finsky.cv.a.cv)ParcelableProto.a(this.q, "mediaDoc");
        v0 = (com.google.wireless.android.finsky.dfe.nano.p)ParcelableProto.a(this.q, "installStep");
        this.b = p0.inflate(2130969003, p1, 0);
        v1 = (TextView)this.b.findViewById(2131755513);
        v2 = (TextView)this.b.findViewById(2131756078);
        v3 = com.google.android.finsky.m.a.bn().e(this.c.f);
        if (v0 != 0) {
            v1.setText(Html.fromHtml(v0.b));
            v2.setText(Html.fromHtml(this.c(v3)));
        }
        else {
            v1.setText(Html.fromHtml(this.c(v3)));
            v2.setVisibility(8);
            v2 = v1;
        }
        v2.setOnClickListener(new com.google.android.finsky.activities.inlineappinstaller.a.f(this));
        return this.b;
    }

    public final String a(Resources p0) {
        return p0.getString(2131952292);
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.a;
    }

    public final void u() {
        super.u();
        com.google.android.finsky.bg.a.a(this.g(), this.c(com.google.android.finsky.m.a.bn().c(this.c.f)), this.b, 0);
    }

}
