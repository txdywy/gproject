package com.google.android.finsky.billing.lightpurchase.e;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.billing.common.m;
import com.google.android.finsky.billing.lightpurchase.aq;
import com.google.android.finsky.billing.lightpurchase.d.h;
import com.google.android.finsky.d.j;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.a.a.h;

public final class com.google.android.finsky.billing.lightpurchase.e.a extends com.google.android.finsky.billing.lightpurchase.d.h
{

    public final com.google.wireless.android.a.a.a.a.ce a;
    public com.google.wireless.android.finsky.a.a.h b;

    a() {
        com.google.android.finsky.billing.lightpurchase.d.h();
        this.a = com.google.android.finsky.d.j.a(1290);
    }

    public final void X() {
        ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).a(1291, this);
        v1 = new Bundle();
        v1.putString(this.b.b, "true");
        ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).a(v1);
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        v2 = p0.inflate(2130968612, p1, 0);
        v3 = (TextView)v2.findViewById(2131755114);
        v3.setText(this.b.c);
        v4 = (TextView)v2.findViewById(2131755312);
        com.google.android.finsky.bg.ae.a(v4, this.b.d);
        com.google.android.finsky.m.a.aH().a(this.q, v2, v3, v4, 0, 0, 0, ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).ao());
        return v2;
    }

    public final String a(Resources p0) {
        if (this.b.a & 16)
            v0 = 1;
        else
            v0 = 0;
        if (v0 != 0)
            v0 = this.b.f;
        else
            v0 = p0.getString(2131951948);
        return v0;
    }

    public final void b(Bundle p0) {
        this.b = (com.google.wireless.android.finsky.a.a.h)ParcelableProto.a(this.q, "AcknowledgementChallengeStep.challenge");
        com.google.android.finsky.d.j.a(this.a, this.b.e);
        super.b(p0);
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.a;
    }

}
