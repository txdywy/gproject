package com.google.android.finsky.billing.redeem;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.at.C0998m;
import com.google.android.finsky.billing.C1925w;
import com.google.android.finsky.billing.common.C1087t;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.billing.common.C1797m;
import com.google.android.finsky.billing.common.C1799o;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.common.RedeemCodeResult;
import com.google.android.finsky.billing.iab.C1867w;
import com.google.android.finsky.billing.lightpurchase.LightPurchaseFlowActivity;
import com.google.android.finsky.billing.lightpurchase.PurchaseActivity;
import com.google.android.finsky.billing.lightpurchase.p118d.C1076h;
import com.google.android.finsky.billing.lightpurchase.p118d.C1086a;
import com.google.android.finsky.billing.payments.C1924e;
import com.google.android.finsky.billing.redeem.p165a.C2081a;
import com.google.android.finsky.billing.redeem.p165a.C2083c;
import com.google.android.finsky.billing.redeem.p165a.C2084d;
import com.google.android.finsky.billing.redeem.p165a.C2087g;
import com.google.android.finsky.br.C2162a;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.cv.p177a.eu;
import com.google.android.finsky.dfemodel.C2726q;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p107l.C3654j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.a.a.ay;
import com.google.wireless.android.finsky.dfe.nano.ek;
import com.google.wireless.android.finsky.dfe.nano.k;
import com.google.wireless.android.finsky.dfe.nano.l;

public final class C2088a extends C1086a implements C0998m, C1087t {
    public String f10643a;
    public C1867w af = C1473m.f7980a.aE();
    public C2162a ag = C1473m.f7980a.bn();
    public int f10644b;
    public ax f10645c;
    public C2089c f10646d;
    public int f10647e;
    public RedeemCodeResult f10648f;
    public boolean f10649g;
    public Document f10650h;
    public PurchaseFlowConfig f10651i;

    public static C2088a m10932a(String str, int i, ax axVar, int i2, String str2, int i3, String str3, PurchaseFlowConfig purchaseFlowConfig, String str4) {
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        bundle.putInt("RedeemCodeFragment.redemption_context", i);
        bundle.putParcelable("RedeemCodeFragment.docid", ParcelableProto.m21671a((C0757i) axVar));
        bundle.putInt("RedeemCodeFragment.offer_type", i2);
        bundle.putString("RedeemCodeFragment.prefill_code", str2);
        bundle.putInt("RedeemCodeSidecar.im_theme_res_id", i3);
        bundle.putString("RedeemCodeFragment.partner_payload", str3);
        bundle.putString("RedeemCodeFragment.pcampaign_id", str4);
        C1797m.m9777a(bundle, purchaseFlowConfig);
        Fragment c2088a = new C2088a();
        c2088a.m600f(bundle);
        return c2088a;
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f10643a = this.f760q.getString("authAccount");
        this.f10644b = this.f760q.getInt("RedeemCodeFragment.redemption_context");
        this.f10645c = (ax) ParcelableProto.m21673a(this.f760q, "RedeemCodeFragment.docid");
        this.f10651i = C1797m.m9774a(this.f760q);
        if (this.f10644b == 1 && this.f10645c == null) {
            throw new IllegalStateException("Null docid in purchase context.");
        } else if (bundle != null) {
            this.f10647e = bundle.getInt("RedeemCodeFragment.last_state_instance");
            this.f10648f = (RedeemCodeResult) bundle.getParcelable("RedeemCodeFragment.redeem_code_result");
            this.f10649g = bundle.getBoolean("RedeemCodeFragment.code_screen_skipped");
            this.f10650h = (Document) bundle.getParcelable("RedeemCodeSidecar.app_to_install");
        }
    }

    public final void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        bundle.putInt("RedeemCodeFragment.last_state_instance", this.f10647e);
        bundle.putParcelable("RedeemCodeFragment.redeem_code_result", this.f10648f);
        bundle.putBoolean("RedeemCodeFragment.code_screen_skipped", this.f10649g);
        bundle.putParcelable("RedeemCodeSidecar.app_to_install", this.f10650h);
    }

    public final void g_() {
        this.f10646d = (C2089c) this.f730B.mo283a("RedeemCodeFragment.sidecar");
        if (this.f10646d == null) {
            Bundle bundle = this.f760q;
            int i = bundle.getInt("RedeemCodeFragment.offer_type");
            String str = this.f10643a;
            int i2 = this.f10644b;
            C0757i c0757i = this.f10645c;
            int i3 = bundle.getInt("RedeemCodeSidecar.im_theme_res_id");
            String string = bundle.getString("RedeemCodeFragment.partner_payload");
            String string2 = bundle.getString("RedeemCodeFragment.pcampaign_id");
            Bundle bundle2 = new Bundle();
            bundle2.putString("authAccount", str);
            bundle2.putInt("RedeemCodeSidecar.redemption_context", i2);
            bundle2.putParcelable("RedeemCodeSidecar.docid", ParcelableProto.m21671a(c0757i));
            bundle2.putInt("RedeemCodeSidecar.offer_type", i);
            bundle2.putInt("RedeemCodeSidecar.im_theme_res_id", i3);
            bundle2.putString("RedeemCodeSidecar.partner_payload", string);
            bundle2.putString("RedeemCodeSidecar.pcampaign_id", string2);
            Fragment c2089c = new C2089c();
            c2089c.m600f(bundle2);
            this.f10646d = c2089c;
            this.f730B.mo284a().mo328a(this.f10646d, "RedeemCodeFragment.sidecar").mo334c();
        }
        this.f10646d.m6757a((C1087t) this);
        super.g_();
    }

    public final void h_() {
        this.f10646d.m6757a(null);
        super.h_();
    }

    public final void m10940a(String str) {
        C2089c c2089c = this.f10646d;
        C2495w c2495w = this.aJ;
        ek ekVar = c2089c.f10653b;
        if (str == null) {
            throw new NullPointerException();
        }
        ekVar.a |= 1;
        ekVar.b = str;
        c2089c.m10947a(c2495w);
    }

    public final void m10935X() {
        if (this.f10648f != null) {
            l lVar = this.f10646d.mo968W().b;
            if (lVar != null && m10941a(lVar)) {
                FinskyLog.m21659a("Dialog shown, waiting for user input.", new Object[0]);
                return;
            }
        }
        m10936Y();
    }

    public final void m10936Y() {
        C2080b Z = m10931Z();
        if (Z == null) {
            FinskyLog.m21669e("No listener.", new Object[0]);
        } else {
            Z.mo2633h();
        }
    }

    public final boolean m10941a(l lVar) {
        Account b = C1473m.f7980a.mo2041U().mo1183b(this.f10643a);
        Document document;
        if (lVar.c != null) {
            document = new Document(lVar.c.a);
            if (this.f10644b == 1 && C2726q.m14751a(this.f10645c)) {
                return false;
            }
            String str = document.m14625N().f13171k;
            if (!new C3654j(C1473m.f7980a.aN()).m17264a(document.m14625N()).m17262a(C1473m.f7980a.mo2032L().mo2854a(str)).m17269e()) {
                return m10933a(b, document, null);
            }
            Intent launchIntentForPackage = m603h().getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage == null) {
                launchIntentForPackage = C1473m.f7980a.bo().mo2740a(m603h(), document, this.aJ);
            }
            m580a(launchIntentForPackage);
            return false;
        } else if (lVar.a != null) {
            return this.ag.mo2700a(m603h(), b, new Document(lVar.a.a), this.f730B, this, 1, null);
        } else {
            if (lVar.b != null) {
                m580a(C1473m.f7980a.bo().mo2738a(m603h(), this.aJ));
            } else if (lVar.d != null) {
                Document X = this.f10646d.m10946X();
                document = new Document(lVar.d.b);
                if (C2726q.m14751a(document.m14646d())) {
                    if (this.f10644b == 1 && C2726q.m14751a(this.f10645c) && this.f10645c.f11833b.equals(document.f14885a.f12097d)) {
                        this.f10648f = new RedeemCodeResult(this.f10648f.f9307a, this.f10648f.f9308b, true, this.f10648f.f9310d, this.f10648f.f9311e, X.f14885a.f12096c);
                        return false;
                    }
                    m580a(PurchaseActivity.m10038a(b, this.af.m9993a(m601g(), document.m14646d(), X.f14885a.f12096c, C1473m.f7980a.dj()), document.f14885a.f12087D, null, this.aJ));
                    return false;
                } else if (document.f14885a.f12098e == 1) {
                    return m10933a(b, document, X.f14885a.f12096c);
                } else {
                    C1799o a = PurchaseParams.m9747b().m9790a(document);
                    a.f9333d = lVar.d.c;
                    a.f9339j = X.f14885a.f12096c;
                    m580a(PurchaseActivity.m10038a(this.aw, a.m9786a(), document.f14885a.f12087D, null, this.aJ));
                }
            } else if (lVar.e != null) {
                eu euVar = lVar.e.a;
                if (euVar != null) {
                    this.f10648f = new RedeemCodeResult(this.f10648f.f9307a, this.f10648f.f9308b, this.f10648f.f9309c, this.f10648f.f9310d, euVar, this.f10648f.m9749a());
                } else {
                    FinskyLog.m21669e("Unexpected missing link", new Object[0]);
                }
            } else {
                FinskyLog.m21665c("Unsupported PostSuccessAction.", new Object[0]);
            }
            return false;
        }
    }

    private final boolean m10933a(Account account, Document document, String str) {
        if (this.f10644b == 1 && this.f10645c.f11834c == 1) {
            this.f10648f = new RedeemCodeResult(this.f10648f.f9307a, this.f10648f.f9308b, true, this.f10648f.f9310d, this.f10648f.f9311e, str);
            return false;
        }
        this.f10650h = document;
        startActivityForResult(LightPurchaseFlowActivity.m10056a(account, document, null, 1, null, document.f14885a.f12087D, null, 0, str, false, 1, this.aJ), 2);
        return true;
    }

    public final void mo2342a(int i, int i2, Intent intent) {
        switch (i) {
            case 2:
                if (i2 == -1) {
                    if (this.f10650h != null) {
                        m580a(C1473m.f7980a.bo().mo2740a(m603h(), this.f10650h, this.aJ));
                    } else {
                        FinskyLog.m21669e("Could not get the installed document.", new Object[0]);
                    }
                }
                m10936Y();
                return;
            default:
                super.mo2342a(i, i2, intent);
                return;
        }
    }

    public final void mo1423a(C1089s c1089s) {
        String str = null;
        if (c1089s != this.f10646d) {
            FinskyLog.m21669e("Received state change for unknown fragment: %s", c1089s);
        } else if (this.f10646d.ag <= this.f10647e) {
            FinskyLog.m21659a("Already received state instance %d, ignore.", Integer.valueOf(this.f10647e));
        } else {
            FinskyLog.m21662b("State changed: %d", Integer.valueOf(this.f10646d.f6948l));
            this.f10647e = this.f10646d.ag;
            C2080b Z = m10931Z();
            if (Z == null) {
                FinskyLog.m21665c("No listener.", new Object[0]);
            }
            String string;
            C1089s c1089s2;
            String str2;
            int a;
            switch (this.f10646d.f6948l) {
                case 0:
                    string = this.f760q.getString("RedeemCodeFragment.prefill_code");
                    if (TextUtils.isEmpty(string)) {
                        mo1411a(C2084d.m10916a(this.f10643a, string, null, this.f10651i));
                        return;
                    }
                    this.f10649g = true;
                    m10940a(string);
                    return;
                case 1:
                    aj();
                    return;
                case 2:
                    Bundle bundle;
                    Bundle bundle2;
                    byte[] bArr;
                    if (this.f10644b == 1) {
                        c1089s2 = this.f10646d;
                        if (c1089s2.f6948l != 2) {
                            FinskyLog.m21669e("Invalid state: %d", Integer.valueOf(c1089s2.f6948l));
                            bundle = null;
                        } else if (c1089s2.f10654c.p != null) {
                            bundle = C1867w.m9981a(c1089s2.f10654c.p);
                        } else {
                            bundle = C1867w.m9982a(c1089s2.f10654c.o, c1089s2.f10653b.i);
                        }
                        bundle2 = bundle;
                    } else {
                        bundle2 = null;
                    }
                    c1089s2 = this.f10646d;
                    if (c1089s2.f6948l != 2) {
                        FinskyLog.m21669e("Invalid state: %d", Integer.valueOf(c1089s2.f6948l));
                        str2 = null;
                    } else {
                        str2 = c1089s2.f10654c.h;
                    }
                    c1089s2 = this.f10646d;
                    if (c1089s2.f6948l != 2) {
                        FinskyLog.m21669e("Invalid state: %d", Integer.valueOf(c1089s2.f6948l));
                        bArr = null;
                    } else {
                        bArr = c1089s2.f10654c.i;
                    }
                    this.f10648f = new RedeemCodeResult(str2, bArr, false, bundle2, null, null);
                    if (this.f10644b == 3) {
                        ax axVar;
                        Document X = this.f10646d.m10946X();
                        C2089c c2089c = this.f10646d;
                        if (c2089c.f10654c != null) {
                            axVar = c2089c.f10654c.k;
                        }
                        if (X != null && C2726q.m14751a(X.m14646d()) && axVar != null && axVar.f11835d == 3) {
                            this.af.m9994a(m603h(), axVar.f11833b);
                        }
                    }
                    if (Z == null || !Z.mo2631a(this.f10646d.m10946X())) {
                        k W = this.f10646d.mo968W();
                        a = C1925w.m10280a(W);
                        if (a == 0) {
                            m10935X();
                            return;
                        }
                        PurchaseFlowConfig purchaseFlowConfig = this.f10651i;
                        bundle = C1925w.m10281a(W, a);
                        C1473m.f7980a.aH().m9785b(bundle, purchaseFlowConfig);
                        C1076h c2087g = new C2087g();
                        c2087g.m600f(bundle);
                        mo1411a(c2087g);
                        return;
                    }
                    m10936Y();
                    return;
                case 3:
                    if (this.f10646d.af != 1 || this.f10646d.f10656e == null) {
                        str2 = this.f10646d.f10655d;
                    } else {
                        str2 = C1290m.m7702a(m603h(), this.f10646d.f10656e);
                    }
                    FinskyLog.m21659a("Redemption error: %s", str2);
                    if (Z != null && Z.mo2632a(str2)) {
                        m10936Y();
                        return;
                    } else if (this.ax instanceof C2084d) {
                        ak();
                        ((C2084d) this.ax).m10922a(str2);
                        return;
                    } else {
                        this.f10649g = false;
                        string = this.f10643a;
                        C2089c c2089c2 = this.f10646d;
                        if (c2089c2.f10653b != null) {
                            str = c2089c2.f10653b.b;
                        }
                        mo1411a(C2084d.m10916a(string, str, str2, this.f10651i));
                        return;
                    }
                case 4:
                    C0757i c0757i;
                    c1089s2 = this.f10646d;
                    if (c1089s2.f6948l != 4) {
                        FinskyLog.m21669e("Invalid state: %d", Integer.valueOf(c1089s2.f6948l));
                    } else {
                        c0757i = c1089s2.f10654c.d;
                    }
                    boolean z = this.f10649g;
                    PurchaseFlowConfig purchaseFlowConfig2 = this.f10651i;
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable("ConfirmationStep.challenge", ParcelableProto.m21671a(c0757i));
                    bundle3.putBoolean("ConfirmationStep.code_screen_skipped", z);
                    C1473m.f7980a.aH().m9785b(bundle3, purchaseFlowConfig2);
                    C1076h c2081a = new C2081a();
                    c2081a.f10631b = c0757i;
                    c2081a.m600f(bundle3);
                    mo1411a(c2081a);
                    return;
                case 5:
                    ay ayVar;
                    string = this.f10643a;
                    C1089s c1089s3 = this.f10646d;
                    if (c1089s3.f6948l != 5) {
                        FinskyLog.m21669e("Invalid state: %d", Integer.valueOf(c1089s3.f6948l));
                    } else {
                        ayVar = c1089s3.f10654c.m;
                    }
                    a = this.f760q.getInt("RedeemCodeSidecar.im_theme_res_id");
                    C1076h c2083c = new C2083c();
                    c2083c.m600f(C1924e.m10270a(string, ayVar, a));
                    mo1411a(c2083c);
                    return;
                default:
                    FinskyLog.m21669e("Unknown sidecar state: %d", Integer.valueOf(this.f10646d.f6948l));
                    return;
            }
        }
    }

    protected final int mo968W() {
        if (this.f10645c != null) {
            return this.f10645c.f11835d;
        }
        if (this.f10646d != null) {
            Document X = this.f10646d.m10946X();
            if (X != null) {
                return X.f14885a.f12099f;
            }
        }
        return 0;
    }

    private final C2080b m10931Z() {
        if (this.f761r instanceof C2080b) {
            return (C2080b) this.f761r;
        }
        if (m603h() instanceof C2080b) {
            return (C2080b) m603h();
        }
        return null;
    }

    public final void mo1202a(int i, Bundle bundle) {
        if (i == 1) {
            m580a(C1473m.f7980a.bo().mo2745a(m603h(), bundle.getString("dialog_details_url"), this.aJ));
            m10936Y();
        }
    }

    public final void f_(int i) {
    }

    public final void mo1211b(int i, Bundle bundle) {
        if (i == 1) {
            m10936Y();
        }
    }
}
