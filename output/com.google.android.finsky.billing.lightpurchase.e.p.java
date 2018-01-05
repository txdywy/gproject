package com.google.android.finsky.billing.lightpurchase.e;

import android.accounts.Account;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.m;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.api.c;
import com.google.android.finsky.bg.a;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.bg.h;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.common.m;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.billing.lightpurchase.CheckoutPurchaseError;
import com.google.android.finsky.billing.lightpurchase.ba;
import com.google.android.finsky.billing.lightpurchase.d.g;
import com.google.android.finsky.billing.lightpurchase.d.h;
import com.google.android.finsky.d.j;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.a.a.q;
import com.google.wireless.android.finsky.a.a.r;

public final class com.google.android.finsky.billing.lightpurchase.e.p extends com.google.android.finsky.billing.lightpurchase.d.h implements com.google.android.finsky.billing.common.t, com.google.android.finsky.d.ad
{

    public com.google.wireless.android.finsky.a.a.q a;
    public String b;
    public int c;
    public int d;
    public ColorStateList e;
    public com.google.android.finsky.billing.lightpurchase.ba f;
    public View g;
    public final com.google.wireless.android.a.a.a.a.ce h;

    p() {
        com.google.android.finsky.billing.lightpurchase.d.h();
        this.h = com.google.android.finsky.d.j.a(5210);
    }

    private final com.google.wireless.android.finsky.a.a.q Y() {
        if (this.a == 0)
            this.a = (com.google.wireless.android.finsky.a.a.q)ParcelableProto.a(this.q, "FamilyAcquisitionChallengePromptStep.challenge");
        return this.a;
    }

    public static Bundle a(com.google.wireless.android.finsky.a.a.q p0, String p1, int p2, int p3, PurchaseFlowConfig p4) {
        v0 = new Bundle();
        v0.putParcelable("FamilyAcquisitionChallengePromptStep.challenge", ParcelableProto.a(p0));
        v0.putString("FamilyAcquisitionChallengePromptStep.docid", p1);
        v0.putInt("FamilyAcquisitionChallengePromptStep.offerType", p2);
        v0.putInt("FamilyAcquisitionChallengePromptStep.backend_id", p3);
        com.google.android.finsky.m.a.aH().b(v0, p4);
        return v0;
    }

    public final void X() {
        this.a(5211, 0);
        ((com.google.android.finsky.billing.lightpurchase.e.j)this.aa()).X();
    }

    public final void Z() {
        this.a(0, 0);
        this.aa().aj();
        this.f = new com.google.android.finsky.billing.lightpurchase.ba();
        this.B.a().a(this.f, "remote_escalation").c();
        this.f.a(this);
        v0 = this.aa().ai();
        this.f.b(1, 0);
        com.google.android.finsky.m.a.b(v0.name).b(this.b, this.c, (String)com.google.android.finsky.aa.a.aQ.b(v0.name).a(), this.f, this.f);
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        this.g = p0.inflate(2130969061, p1, 0);
        v3 = (TextView)this.g.findViewById(2131756141);
        v3.setText(this.a.a.b);
        v4 = (TextView)this.g.findViewById(2131756142);
        com.google.android.finsky.bg.ae.a(v4, this.a.a.c);
        com.google.android.finsky.m.a.aH().a(this.q, this.g, v3, v4, 0, 0, 0, this.aa().ao());
        return this.g;
    }

    public final String a(Resources p0) {
        return this.Y().a.f;
    }

    public final void a(com.google.android.finsky.billing.common.s p0) {
        switch (p0.l) {
            case 2:
                this.a(new CheckoutPurchaseError(this.f.b, this.f.a));
                break;
            case 3:
                this.a(new CheckoutPurchaseError(this.f.b, this.f.a));
                break;
            default:
                break;
        }
    }

    public abstract void a(CheckoutPurchaseError p0);

    public final String b(Resources p0) {
        return this.Y().a.d;
    }

    public final void b(Bundle p0) {
        this.a = (com.google.wireless.android.finsky.a.a.q)ParcelableProto.a(this.q, "FamilyAcquisitionChallengePromptStep.challenge");
        this.b = this.q.getString("FamilyAcquisitionChallengePromptStep.docid");
        this.c = this.q.getInt("FamilyAcquisitionChallengePromptStep.offerType");
        this.d = this.q.getInt("FamilyAcquisitionChallengePromptStep.backend_id");
        super.b(p0);
    }

    public final void g_() {
        super.g_();
        this.f = (com.google.android.finsky.billing.lightpurchase.ba)this.B.a("remote_escalation");
        if (this.f != 0)
            this.f.a(this);
        v1 = this.aa().ap();
        v3 = this.Y().a;
        if (v1 instanceof PlayActionButtonV2 && !TextUtils.isEmpty(v3.d)) {
            ((PlayActionButtonV2)v1).setActionStyle(1);
            ((PlayActionButtonV2)v1).setDrawAsLabel(1);
            v1 = this.aa().aq();
            if (v1 != 0 && !TextUtils.isEmpty(v3.d) && v3.e == 0) {
                v1.setEnabled(0);
                this.e = v1.getTextColors();
                switch (this.d) {
                    case 1:
                        v0 = 2131558645;
                        break;
                    case 2:
                        v0 = 2131558721;
                        break;
                    case 3:
                        if (com.google.android.finsky.bg.h.b != 0)
                            v0 = 2131558619;
                        else
                            v0 = 2131558627;
                        break;
                    case 4:
                        v0 = 2131558701;
                        break;
                    case 5:
                        if (com.google.android.finsky.bg.h.b != 0)
                            v0 = 2131558619;
                        else
                            v0 = 2131558712;
                        break;
                    case 6:
                        v0 = 2131558732;
                        break;
                    default:
                        if (com.google.android.finsky.bg.h.b != 0)
                            v0 = 2131558619;
                        else
                            v0 = 2131558712;
                        break;
                }
                v1.setTextColor(this.i().getColor(v0));
            }
        }
    }

    public com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.h;
    }

    public final void h_() {
        super.h_();
        if (this.f != 0)
            this.f.a(0);
        v1 = this.aa().ap();
        if (v1 instanceof PlayActionButtonV2) {
            ((PlayActionButtonV2)v1).setActionStyle(0);
            ((PlayActionButtonV2)v1).setDrawAsLabel(0);
            v0 = this.aa().aq();
            if (v0 != 0 && this.e != 0) {
                v0.setEnabled(1);
                v0.setTextColor(this.e);
            }
        }
    }

    public final void u() {
        super.u();
        v2 = new Object[2];
        v2[0] = this.a.a.b;
        v2[1] = this.a.a.c;
        com.google.android.finsky.bg.a.a(this.g.getContext(), this.a(2131952958, v2), this.g, 0);
    }

}
