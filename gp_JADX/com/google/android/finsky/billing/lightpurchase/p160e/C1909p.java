package com.google.android.finsky.billing.lightpurchase.p160e;

import android.accounts.Account;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.billing.common.C1087t;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.lightpurchase.CheckoutPurchaseError;
import com.google.android.finsky.billing.lightpurchase.ba;
import com.google.android.finsky.billing.lightpurchase.p118d.C1076h;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.a.a.q;
import com.google.wireless.android.finsky.a.a.r;
import com.squareup.leakcanary.C7582R;

public abstract class C1909p extends C1076h implements C1087t, ad {
    public q f9818a;
    public String f9819b;
    public int f9820c;
    public int f9821d;
    public ColorStateList f9822e;
    public ba f9823f;
    public View f9824g;
    public final ce f9825h = C2482j.m13283a(5210);

    public abstract void mo2537a(CheckoutPurchaseError checkoutPurchaseError);

    public static Bundle m10247a(q qVar, String str, int i, int i2, PurchaseFlowConfig purchaseFlowConfig) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("FamilyAcquisitionChallengePromptStep.challenge", ParcelableProto.m21671a((C0757i) qVar));
        bundle.putString("FamilyAcquisitionChallengePromptStep.docid", str);
        bundle.putInt("FamilyAcquisitionChallengePromptStep.offerType", i);
        bundle.putInt("FamilyAcquisitionChallengePromptStep.backend_id", i2);
        C1473m.f7980a.aH().m9785b(bundle, purchaseFlowConfig);
        return bundle;
    }

    public final void mo136b(Bundle bundle) {
        this.f9818a = (q) ParcelableProto.m21673a(this.f760q, "FamilyAcquisitionChallengePromptStep.challenge");
        this.f9819b = this.f760q.getString("FamilyAcquisitionChallengePromptStep.docid");
        this.f9820c = this.f760q.getInt("FamilyAcquisitionChallengePromptStep.offerType");
        this.f9821d = this.f760q.getInt("FamilyAcquisitionChallengePromptStep.backend_id");
        super.mo136b(bundle);
    }

    public final void g_() {
        super.g_();
        this.f9823f = (ba) this.f730B.mo283a("remote_escalation");
        if (this.f9823f != null) {
            this.f9823f.m6757a((C1087t) this);
        }
        Button ap = aa().ap();
        r rVar = m10246Y().a;
        CharSequence charSequence = rVar.d;
        if ((ap instanceof PlayActionButtonV2) && !TextUtils.isEmpty(charSequence)) {
            ((PlayActionButtonV2) ap).setActionStyle(1);
            ((PlayActionButtonV2) ap).setDrawAsLabel(true);
            ap = aa().aq();
            if (ap != null && !TextUtils.isEmpty(rVar.d) && !rVar.e) {
                int i;
                ap.setEnabled(false);
                this.f9822e = ap.getTextColors();
                switch (this.f9821d) {
                    case 1:
                        i = C7582R.color.play_books_primary_disabled;
                        break;
                    case 2:
                        i = C7582R.color.play_music_primary_disabled;
                        break;
                    case 3:
                        if (!C1608h.f8520b) {
                            i = C7582R.color.play_apps_primary_disabled;
                            break;
                        } else {
                            i = C7582R.color.play_apps_ent_primary_disabled;
                            break;
                        }
                    case 4:
                        i = C7582R.color.play_movies_primary_disabled;
                        break;
                    case 6:
                        i = C7582R.color.play_newsstand_primary_disabled;
                        break;
                    default:
                        if (!C1608h.f8520b) {
                            i = C7582R.color.play_multi_primary_disabled;
                            break;
                        } else {
                            i = C7582R.color.play_apps_ent_primary_disabled;
                            break;
                        }
                }
                ap.setTextColor(m605i().getColor(i));
            }
        }
    }

    public final void h_() {
        super.h_();
        if (this.f9823f != null) {
            this.f9823f.m6757a(null);
        }
        Button ap = aa().ap();
        if (ap instanceof PlayActionButtonV2) {
            ((PlayActionButtonV2) ap).setActionStyle(0);
            ((PlayActionButtonV2) ap).setDrawAsLabel(false);
            Button aq = aa().aq();
            if (aq != null && this.f9822e != null) {
                aq.setEnabled(true);
                aq.setTextColor(this.f9822e);
            }
        }
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f9824g = layoutInflater.inflate(C7582R.layout.light_purchase_ask_to_buy_pass_device, viewGroup, false);
        TextView textView = (TextView) this.f9824g.findViewById(C7582R.id.approval_required_title);
        textView.setText(this.f9818a.a.b);
        TextView textView2 = (TextView) this.f9824g.findViewById(C7582R.id.approval_required_description);
        ae.m9217a(textView2, this.f9818a.a.c);
        C1473m.f7980a.aH().m9782a(this.f760q, this.f9824g, textView, textView2, null, null, null, aa().ao());
        return this.f9824g;
    }

    public final String mo1406a(Resources resources) {
        return m10246Y().a.f;
    }

    public final void mo1405X() {
        m6694a(5211, null);
        ((C1905j) aa()).mo2513X();
    }

    public final String mo2536b(Resources resources) {
        return m10246Y().a.d;
    }

    private final q m10246Y() {
        if (this.f9818a == null) {
            this.f9818a = (q) ParcelableProto.m21673a(this.f760q, "FamilyAcquisitionChallengePromptStep.challenge");
        }
        return this.f9818a;
    }

    public final void mo2535Z() {
        m6694a(0, null);
        aa().aj();
        this.f9823f = new ba();
        this.f730B.mo284a().mo328a(this.f9823f, "remote_escalation").mo334c();
        this.f9823f.m6757a((C1087t) this);
        Account ai = aa().ai();
        C0660x c0660x = this.f9823f;
        String str = this.f9819b;
        int i = this.f9820c;
        c0660x.m6758b(1, 0);
        C1473m.f7980a.mo2112b(ai.name).mo1622b(str, i, (String) C0954a.aQ.m5777b(ai.name).m5760a(), c0660x, (C0657w) c0660x);
    }

    public final void mo1423a(C1089s c1089s) {
        switch (c1089s.f6948l) {
            case 2:
            case 3:
                mo2537a(new CheckoutPurchaseError(this.f9823f.f9839b, this.f9823f.f9838a));
                return;
            default:
                return;
        }
    }

    public final void mo979u() {
        super.mo979u();
        C1601a.m9199a(this.f9824g.getContext(), m572a((int) C7582R.string.purchase_flow_ask_to_buy_prompt, this.f9818a.a.b, this.f9818a.a.c), this.f9824g, false);
    }

    public ce getPlayStoreUiElement() {
        return this.f9825h;
    }
}
