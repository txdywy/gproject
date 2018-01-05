package com.google.android.finsky.billing.lightpurchase.e;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.bg.h;
import com.google.android.finsky.billing.common.m;
import com.google.android.finsky.billing.f;
import com.google.android.finsky.billing.lightpurchase.aq;
import com.google.android.finsky.billing.lightpurchase.d.h;
import com.google.android.finsky.d.j;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.eq;

public final class com.google.android.finsky.billing.lightpurchase.e.n extends com.google.android.finsky.billing.lightpurchase.d.h implements com.google.android.finsky.d.ad
{

    public int a;
    public com.google.wireless.android.finsky.dfe.nano.eq b;
    public final com.google.wireless.android.a.a.a.a.ce c;

    n() {
        com.google.android.finsky.billing.lightpurchase.d.h();
        this.c = com.google.android.finsky.d.j.a(1280);
    }

    public final void X() {
        this.a(1281, 0);
        ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).Z();
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        v2 = p0.inflate(2130969069, p1, 0);
        v3 = (TextView)v2.findViewById(2131755114);
        v3.setText(this.b.b);
        v4 = (TextView)v2.findViewById(2131755334);
        com.google.android.finsky.bg.ae.a(v4, com.google.android.finsky.billing.f.a(this.b.c, com.google.android.finsky.bg.h.c(this.h(), this.a).getDefaultColor()));
        com.google.android.finsky.m.a.aH().a(this.q, v2, v3, v4, 0, 0, 0, ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).ao());
        return v2;
    }

    public final String a(Resources p0) {
        return this.c(2131951948);
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.a = this.q.getInt("ChangeSubscriptionStep.backend");
        this.b = (com.google.wireless.android.finsky.dfe.nano.eq)ParcelableProto.a(this.q, "ChangeSubscriptionStep.changeSubscription");
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.c;
    }

}
