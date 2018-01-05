package com.google.android.finsky.billing.lightpurchase.e;

import android.accounts.Account;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.common.m;
import com.google.android.finsky.billing.legacyauth.AuthState;
import com.google.android.finsky.billing.legacyauth.f;
import com.google.android.finsky.billing.lightpurchase.b.c;
import com.google.android.finsky.billing.lightpurchase.d.g;
import com.google.android.finsky.billing.lightpurchase.d.h;
import com.google.android.finsky.br.b;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.t;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.finsky.a.a.am;
import com.google.wireless.android.finsky.a.a.q;
import com.google.wireless.android.finsky.dfe.h.a.a;
import com.google.wireless.android.finsky.dfe.h.a.b;

public final class com.google.android.finsky.billing.lightpurchase.e.q extends com.google.android.finsky.billing.lightpurchase.e.g
{

    public final com.google.android.finsky.d.t a;
    public final com.google.android.finsky.d.a b;
    public com.google.wireless.android.finsky.a.a.q c;
    public com.google.wireless.android.finsky.dfe.h.a.a d;
    public Document e;
    public int f;
    public com.google.android.finsky.billing.lightpurchase.b.c g;
    public boolean h;

    q() {
        com.google.android.finsky.billing.lightpurchase.e.g(5212);
        this.a = com.google.android.finsky.m.a.aP();
        this.b = com.google.android.finsky.m.a.aR();
    }

    public static Bundle a(Account p0, com.google.wireless.android.finsky.a.a.q p1, Document p2, String p3, int p4, int p5, PurchaseFlowConfig p6) {
        v0 = com.google.android.finsky.billing.lightpurchase.e.q.a(p0, new AuthState(0, 0, 0, 0, 0, 1, 0, 0), p3, p5);
        v0.putParcelable("FamilyAcquisitionChallengeStep.challenge", ParcelableProto.a(p1));
        v0.putParcelable("FamilyAcquisitionChallengeStep.document", p2);
        v0.putInt("FamilyAcquisitionChallengeStep.documentType", p4);
        com.google.android.finsky.m.a.aH().b(v0, p6);
        return v0;
    }

    public final void X() {
        this.b(0);
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        v5 = p0.inflate(2130968867, p1, 0);
        this.g = new com.google.android.finsky.billing.lightpurchase.b.c(this.g(), this.d, this.ap, this.f, v5, this);
        this.g.a();
        this.b(v5);
        this.a(2131755081, 2131951893, this.d.l);
        com.google.android.finsky.m.a.aH().a(this.q, v5, (TextView)v5.findViewById(2131755114), 0, (TextView)v5.findViewById(2131755851), (TextView)v5.findViewById(2131755850), (TextView)v5.findViewById(2131755352), this.aa().ao());
        return this.aw;
    }

    public final String a(Resources p0) {
        if (this.c == 0) {
            this.c = (com.google.wireless.android.finsky.a.a.q)ParcelableProto.a(this.q, "FamilyAcquisitionChallengeStep.challenge");
            this.d = this.c.b;
        }
        return this.d.o;
    }

    protected final void a(Bundle p0) {
        if (this.g.i != 0 && this.g.i.isChecked())
            v0 = 1;
        else
            v0 = 0;
        if (v0 != 0)
            p0.putString(this.d.s.g, this.d.s.f);
        p0.putString("pcagi", this.ar.ai);
    }

    protected final void a(boolean p0) {
        this.as = p0;
        this.aA.setText(Html.fromHtml(this.d.g));
        if (this.as != 0) {
            this.aA.setVisibility(0);
            this.aA.requestFocus();
        }
        else
            this.aA.setVisibility(8);
    }

    protected final void ac() {
        if (this.g.c.j.length > 1)
            v0 = this.g.c.j[this.g.k.getSelectedItemPosition()].c;
        else
            v0 = this.g.c.j[0].c;
        this.ar.a(this.an.name, this.ax.getText().toString(), v0, this.aa().am());
    }

    protected final String ae() {
        return "FamilyAcquisitionChallengeStep.sidecar";
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.c = (com.google.wireless.android.finsky.a.a.q)ParcelableProto.a(this.q, "FamilyAcquisitionChallengeStep.challenge");
        this.d = this.c.b;
        this.e = (Document)this.q.getParcelable("FamilyAcquisitionChallengeStep.document");
        this.f = this.q.getInt("FamilyAcquisitionChallengeStep.documentType");
        if (p0 != 0)
            this.h = p0.getBoolean("FamilyAcquisitionChallengeStep.stepFragmentReadyLogged");
    }

    public void onClick(View p0) {
        v6 = 1;
        if (p0 == this.ay) {
            this.a(752, 0);
            if (this.as != 0)
                v6 = 0;
            this.a(v6);
        }
        else if (p0 == this.g.j) {
            this.a(130, 0);
            this.a(com.google.android.finsky.m.a.bo().a(this.g(), this.an.name, this.e.a.c, this.e, 0, 1, this.d.r, this.b.a(0)));
        }
    }

    public final void u() {
        super.u();
        if (this.h == 0) {
            this.a.c(this.aa().am(), "purchase_fragment_family_acquisition_challenge");
            this.h = 1;
        }
    }

}
