package com.google.android.finsky.billing.redeem.a;

import android.accounts.Account;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.as.e;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bg.a;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.billing.common.m;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.billing.f;
import com.google.android.finsky.billing.lightpurchase.d.a;
import com.google.android.finsky.billing.lightpurchase.d.h;
import com.google.android.finsky.billing.redeem.a;
import com.google.android.finsky.billing.redeem.c;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.d.j;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.utils.b.a;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.ek;
import com.google.wireless.android.finsky.dfe.nano.em;

public final class com.google.android.finsky.billing.redeem.a.a extends com.google.android.finsky.billing.lightpurchase.d.h
{

    public final com.google.wireless.android.a.a.a.a.ce a;
    public com.google.wireless.android.finsky.dfe.nano.em b;
    public View c;

    a() {
        com.google.android.finsky.billing.lightpurchase.d.h();
        this.a = com.google.android.finsky.d.j.a(883);
    }

    private final boolean Y() {
        if (com.google.android.finsky.m.a.O().c())
            v0 = 0;
        else
            v0 = com.google.android.finsky.m.a.j(((com.google.android.finsky.billing.redeem.a)this.aa()).aw.name).a(12615220);
        return v0;
    }

    public final void X() {
        this.a(884, 0);
        v0 = (com.google.android.finsky.billing.redeem.a)this.aa();
        if (v0.d.l != 4) {
            v2 = new Object[1];
            v2[0] = Integer.valueOf(v0.d.l);
            FinskyLog.e("Invalid state: %d", v2);
        }
        else {
            v0.d.b.a = v0.d.b.a | 2;
            v0.d.b.c = 1;
            v0.d.a(v0.aJ);
        }
    }

    public final void Z() {
        this.a(1107, 0);
        ((com.google.android.finsky.billing.redeem.a)this.aa()).Y();
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        this.c = p0.inflate(2130969330, p1, 0);
        v3 = (TextView)this.c.findViewById(2131755114);
        if (!TextUtils.isEmpty(this.b.b))
            v3.setText(this.b.b);
        else
            v3.setVisibility(8);
        v0 = (TextView)this.c.findViewById(2131755475);
        if (!TextUtils.isEmpty(this.b.c))
            com.google.android.finsky.bg.ae.a(v0, this.b.c);
        else
            v0.setVisibility(8);
        v0 = (FifeImageView)this.c.findViewById(2131755258);
        if (this.b.g != 0) {
            v0.setOnLoadedListener(new com.google.android.finsky.billing.redeem.a.b(this));
            com.google.android.finsky.m.a.ar().a(v0, this.b.g.f, this.b.g.i);
        }
        else
            v0.setVisibility(8);
        v5 = (TextView)this.c.findViewById(2131755851);
        if (!TextUtils.isEmpty(this.b.d))
            v5.setText(this.b.d);
        else
            v5.setVisibility(8);
        v0 = (TextView)this.c.findViewById(2131755852);
        if (!TextUtils.isEmpty(this.b.e)) {
            com.google.android.finsky.bg.ae.a(v0, this.b.e);
            if (this.b.e.startsWith("<strike>") && this.b.e.endsWith("</strike>"))
                v0.setPaintFlags(v0.getPaintFlags() | 16);
            v4 = new Object[1];
            v4[0] = v0.getText();
            v0.setContentDescription(this.i().getString(2131951883, v4));
            v2 = new Object[1];
            v2[0] = v5.getText();
            v5.setContentDescription(this.i().getString(2131951872, v2));
        }
        else
            v0.setVisibility(8);
        v4 = (TextView)this.c.findViewById(2131755334);
        if (!TextUtils.isEmpty(this.b.h))
            com.google.android.finsky.bg.ae.a(v4, this.b.h);
        else
            v4.setVisibility(8);
        v0 = (TextView)this.c.findViewById(2131756597);
        if (!TextUtils.isEmpty(this.b.i))
            com.google.android.finsky.bg.ae.a(v0, this.b.i);
        else
            v0.setVisibility(8);
        v7 = (TextView)this.c.findViewById(2131756598);
        if (this.q.getBoolean("ConfirmationStep.code_screen_skipped", 0)) {
            if (this.Y())
                v0 = 2131952990;
            else
                v0 = 2131952989;
            v2 = new Object[2];
            v2[0] = com.google.android.finsky.billing.f.a((String)com.google.android.finsky.aa.b.t.b());
            v2[1] = this.a(this.i());
            com.google.android.finsky.bg.ae.a(v7, this.a(v0, v2));
        }
        else
            v7.setVisibility(8);
        com.google.android.finsky.m.a.aH().a(this.q, this.c, v3, v4, v5, 0, v7, ((com.google.android.finsky.billing.redeem.a)this.aa()).aF);
        return this.c;
    }

    public final String a(Resources p0) {
        return this.b.f;
    }

    public final String b(Resources p0) {
        if (this.Y())
            v0 = p0.getString(2131951799);
        else
            v0 = 0;
        return v0;
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.b = (com.google.wireless.android.finsky.dfe.nano.em)ParcelableProto.a(this.q, "ConfirmationStep.challenge");
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.a;
    }

    public final void u() {
        super.u();
        com.google.android.finsky.bg.a.a(this.c.getContext(), this.b.b, this.c, 0);
    }

}
