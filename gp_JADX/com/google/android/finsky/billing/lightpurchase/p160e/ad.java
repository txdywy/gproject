package com.google.android.finsky.billing.lightpurchase.p160e;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.bg.C1618s;
import com.google.android.finsky.billing.gifting.SendGiftLayout;
import com.google.android.finsky.billing.lightpurchase.am;
import com.google.android.finsky.billing.lightpurchase.p118d.C1076h;
import com.google.android.finsky.cv.p177a.jp;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public final class ad extends C1076h {
    public String f9860a;
    public jp f9861b;
    public int f9862c;
    public int f9863d;
    public SendGiftLayout f9864e;
    public final ce f9865f = C2482j.m13283a(5552);

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        Bundle bundle2 = this.f760q;
        this.f9861b = (jp) ParcelableProto.m21673a(bundle2, "SendGiftStep.template");
        this.f9862c = bundle2.getInt("SendGiftStep.backend");
        this.f9863d = bundle2.getInt("SendGiftStep.documentType");
        this.f9860a = this.f9861b.f12807f;
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f9864e = (SendGiftLayout) layoutInflater.inflate(C7582R.layout.send_gift, viewGroup, false);
        this.f9864e.m9878a(m603h(), this.f9861b, this.f9862c, this.f9863d);
        return this.f9864e;
    }

    public final String mo1406a(Resources resources) {
        return this.f9860a;
    }

    public final void mo1405X() {
        m6694a(5553, null);
        C1618s.m9293a(m603h(), this.f9864e);
        am amVar = (am) aa();
        String message = this.f9864e.getMessage();
        if (amVar.f9755d == null) {
            throw new IllegalStateException("setCustomGiftMessage called without GiftShareIntentSidecar initialized");
        }
        amVar.f9755d.m9884a(message);
    }

    public final ce getPlayStoreUiElement() {
        return this.f9865f;
    }
}
