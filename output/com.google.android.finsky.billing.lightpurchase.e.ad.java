package com.google.android.finsky.billing.lightpurchase.e;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.bg.s;
import com.google.android.finsky.billing.gifting.SendGiftLayout;
import com.google.android.finsky.billing.gifting.b;
import com.google.android.finsky.billing.lightpurchase.am;
import com.google.android.finsky.billing.lightpurchase.d.h;
import com.google.android.finsky.cv.a.jp;
import com.google.android.finsky.d.j;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.a.a.a.a.ce;

public final class com.google.android.finsky.billing.lightpurchase.e.ad extends com.google.android.finsky.billing.lightpurchase.d.h
{

    public String a;
    public com.google.android.finsky.cv.a.jp b;
    public int c;
    public int d;
    public SendGiftLayout e;
    public final com.google.wireless.android.a.a.a.a.ce f;

    ad() {
        com.google.android.finsky.billing.lightpurchase.d.h();
        this.f = com.google.android.finsky.d.j.a(5552);
    }

    public final void X() {
        this.a(5553, 0);
        com.google.android.finsky.bg.s.a(this.h(), this.e);
        v0 = (com.google.android.finsky.billing.lightpurchase.am)this.aa();
        if (v0.d == 0)
            throw new IllegalStateException("setCustomGiftMessage called without GiftShareIntentSidecar initialized");
        v0.d.a(this.e.getMessage());
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        this.e = (SendGiftLayout)p0.inflate(2130969376, p1, 0);
        this.e.a(this.h(), this.b, this.c, this.d);
        return this.e;
    }

    public final String a(Resources p0) {
        return this.a;
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.b = (com.google.android.finsky.cv.a.jp)ParcelableProto.a(this.q, "SendGiftStep.template");
        this.c = this.q.getInt("SendGiftStep.backend");
        this.d = this.q.getInt("SendGiftStep.documentType");
        this.a = this.b.f;
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.f;
    }

}
