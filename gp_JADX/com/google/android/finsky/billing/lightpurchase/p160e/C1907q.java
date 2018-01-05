package com.google.android.finsky.billing.lightpurchase.p160e;

import android.accounts.Account;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.legacyauth.AuthState;
import com.google.android.finsky.billing.legacyauth.C1880f;
import com.google.android.finsky.billing.lightpurchase.p161b.C1911c;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2492t;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.a.a.q;
import com.google.wireless.android.finsky.dfe.h.a.a;
import com.squareup.leakcanary.C7582R;

public class C1907q extends C1906g {
    public final C2492t f9810a = C1473m.f7980a.aP();
    public final C2471a f9811b = C1473m.f7980a.aR();
    public q f9812c;
    public a f9813d;
    public Document f9814e;
    public int f9815f;
    public C1911c f9816g;
    public boolean f9817h;

    public C1907q() {
        super(5212);
    }

    public static Bundle m10238a(Account account, q qVar, Document document, String str, int i, int i2, PurchaseFlowConfig purchaseFlowConfig) {
        Bundle a = C1906g.m10222a(account, new AuthState(false, null, null, 0, false, true, null, null), str, i2);
        a.putParcelable("FamilyAcquisitionChallengeStep.challenge", ParcelableProto.m21671a((C0757i) qVar));
        a.putParcelable("FamilyAcquisitionChallengeStep.document", document);
        a.putInt("FamilyAcquisitionChallengeStep.documentType", i);
        C1473m.f7980a.aH().m9785b(a, purchaseFlowConfig);
        return a;
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        Bundle bundle2 = this.f760q;
        this.f9812c = (q) ParcelableProto.m21673a(bundle2, "FamilyAcquisitionChallengeStep.challenge");
        this.f9813d = this.f9812c.b;
        this.f9814e = (Document) bundle2.getParcelable("FamilyAcquisitionChallengeStep.document");
        this.f9815f = bundle2.getInt("FamilyAcquisitionChallengeStep.documentType");
        if (bundle != null) {
            this.f9817h = bundle.getBoolean("FamilyAcquisitionChallengeStep.stepFragmentReadyLogged");
        }
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C7582R.layout.family_wallet_auth_challenge_step, viewGroup, false);
        this.f9816g = new C1911c(m601g(), this.f9813d, this.ap, this.f9815f, inflate, this);
        this.f9816g.m10259a();
        m10233b(inflate);
        mo2542a(C7582R.id.password, C7582R.string.content_description_password_help, this.f9813d.l);
        C1473m.f7980a.aH().m9782a(this.f760q, inflate, (TextView) inflate.findViewById(C7582R.id.title), null, (TextView) inflate.findViewById(C7582R.id.price), (TextView) inflate.findViewById(C7582R.id.instrument_display_title), (TextView) inflate.findViewById(C7582R.id.footer), aa().ao());
        return this.aw;
    }

    public final void mo979u() {
        super.mo979u();
        if (!this.f9817h) {
            this.f9810a.m13358c(aa().am(), "purchase_fragment_family_acquisition_challenge");
            this.f9817h = true;
        }
    }

    protected final String ae() {
        return "FamilyAcquisitionChallengeStep.sidecar";
    }

    public final String mo1406a(Resources resources) {
        if (this.f9812c == null) {
            this.f9812c = (q) ParcelableProto.m21673a(this.f760q, "FamilyAcquisitionChallengeStep.challenge");
            this.f9813d = this.f9812c.b;
        }
        return this.f9813d.o;
    }

    public final void mo1405X() {
        m10234b(false);
    }

    protected final void mo2532a(boolean z) {
        this.as = z;
        this.aA.setText(Html.fromHtml(this.f9813d.g));
        if (this.as) {
            this.aA.setVisibility(0);
            this.aA.requestFocus();
            return;
        }
        this.aA.setVisibility(8);
    }

    protected final void mo2531a(Bundle bundle) {
        C1911c c1911c = this.f9816g;
        Object obj = (c1911c.f9834i == null || !c1911c.f9834i.isChecked()) ? null : 1;
        if (obj != null) {
            bundle.putString(this.f9813d.s.g, this.f9813d.s.f);
        }
        bundle.putString("pcagi", this.ar.ai);
    }

    protected final void ac() {
        String str;
        C1880f c1880f = this.ar;
        String str2 = this.an.name;
        String obj = this.ax.getText().toString();
        C1911c c1911c = this.f9816g;
        if (c1911c.f9828c.j.length > 1) {
            str = c1911c.f9828c.j[c1911c.f9836k.getSelectedItemPosition()].c;
        } else {
            str = c1911c.f9828c.j[0].c;
        }
        c1880f.m10021a(str2, obj, str, aa().am());
    }

    public void onClick(View view) {
        boolean z = true;
        if (view == this.ay) {
            m10227a(752, false);
            if (this.as) {
                z = false;
            }
            mo2532a(z);
        } else if (view == this.f9816g.f9835j) {
            m6694a(130, null);
            m580a(C1473m.f7980a.bo().mo2749a(m601g(), this.an.name, this.f9814e.f14885a.f12096c, this.f9814e, false, true, this.f9813d.r, this.f9811b.m13184a(null)));
        }
    }
}
