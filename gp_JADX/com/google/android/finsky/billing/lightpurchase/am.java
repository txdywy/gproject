package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.api.VoucherParams;
import com.google.android.finsky.at.C0998m;
import com.google.android.finsky.billing.C1834t;
import com.google.android.finsky.billing.C1835g;
import com.google.android.finsky.billing.C1873l;
import com.google.android.finsky.billing.C1886u;
import com.google.android.finsky.billing.C1925w;
import com.google.android.finsky.billing.C2039p;
import com.google.android.finsky.billing.addresschallenge.AddressChallengeActivity;
import com.google.android.finsky.billing.common.C1087t;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.billing.common.C1647h;
import com.google.android.finsky.billing.common.C1791f;
import com.google.android.finsky.billing.common.C1793i;
import com.google.android.finsky.billing.common.C1804v;
import com.google.android.finsky.billing.common.PurchaseError;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.common.RedeemCodeResult;
import com.google.android.finsky.billing.gifting.C1836b;
import com.google.android.finsky.billing.legacyauth.AuthState;
import com.google.android.finsky.billing.legacyauth.C1874a;
import com.google.android.finsky.billing.lightpurchase.p118d.C1076h;
import com.google.android.finsky.billing.lightpurchase.p118d.C1086a;
import com.google.android.finsky.billing.lightpurchase.p118d.C1918d;
import com.google.android.finsky.billing.lightpurchase.p118d.C1920f;
import com.google.android.finsky.billing.lightpurchase.p160e.C1905j;
import com.google.android.finsky.billing.lightpurchase.p160e.C1906g;
import com.google.android.finsky.billing.lightpurchase.p160e.C1907q;
import com.google.android.finsky.billing.lightpurchase.p160e.C1909p;
import com.google.android.finsky.billing.lightpurchase.p160e.C1923a;
import com.google.android.finsky.billing.lightpurchase.p160e.C1927b;
import com.google.android.finsky.billing.lightpurchase.p160e.C1935k;
import com.google.android.finsky.billing.lightpurchase.p160e.C1938n;
import com.google.android.finsky.billing.lightpurchase.p160e.C1940r;
import com.google.android.finsky.billing.lightpurchase.p160e.C1945x;
import com.google.android.finsky.billing.lightpurchase.p160e.aa;
import com.google.android.finsky.billing.lightpurchase.p160e.ab;
import com.google.android.finsky.billing.lightpurchase.p160e.ac;
import com.google.android.finsky.billing.lightpurchase.p160e.ae;
import com.google.android.finsky.billing.lightpurchase.p161b.C1908a;
import com.google.android.finsky.billing.lightpurchase.p161b.C1910b;
import com.google.android.finsky.billing.p131e.C1814a;
import com.google.android.finsky.billing.p131e.C1815b;
import com.google.android.finsky.billing.p131e.C1821j;
import com.google.android.finsky.billing.p158f.C1831a;
import com.google.android.finsky.billing.payments.C1924e;
import com.google.android.finsky.billing.payments.C2043f;
import com.google.android.finsky.billing.profile.BillingProfileActivity;
import com.google.android.finsky.billing.profile.CatchAbandonmentActivity;
import com.google.android.finsky.billing.redeem.RedeemCodeActivity;
import com.google.android.finsky.br.C2162a;
import com.google.android.finsky.by.C2196e;
import com.google.android.finsky.by.C2229h;
import com.google.android.finsky.dfemodel.C2713b;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.download.C2838a;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.p107l.C3654j;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2492t;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.settings.SettingsActivity;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.a.a.af;
import com.google.wireless.android.finsky.a.a.ay;
import com.google.wireless.android.finsky.a.a.m;
import com.google.wireless.android.finsky.a.a.q;
import com.google.wireless.android.finsky.dfe.c.a.al;
import com.google.wireless.android.finsky.dfe.nano.fa;
import com.google.wireless.android.finsky.dfe.nano.k;
import com.google.wireless.android.finsky.dfe.nano.l;
import com.google.wireless.android.finsky.dfe.nano.u;
import com.squareup.leakcanary.C7582R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class am extends C1086a implements C0998m, C1087t, aq, C1905j, C1886u {
    public final C2492t f9752a = C1473m.f7980a.aP();
    public Bundle af = new Bundle();
    public Bundle ag = new Bundle();
    public String ah;
    public Bundle ai;
    public PurchaseError aj;
    public boolean ak;
    public Bundle al;
    public boolean am;
    public boolean an;
    public boolean ao;
    public boolean ap;
    public boolean aq;
    public C1831a ar = C1831a.f9415a;
    public C1793i as = C1473m.f7980a.aG();
    public C2162a at = C1473m.f7980a.bn();
    public C3300k f9753b;
    public C1950i f9754c;
    public C1836b f9755d;
    public int f9756e = -1;
    public int f9757f;
    public int f9758g;
    public PurchaseParams f9759h;
    public VoucherParams f9760i;

    public static am m10171a(Account account, PurchaseParams purchaseParams, Bundle bundle, C2495w c2495w) {
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("MultiStepFragment.account", account);
        bundle2.putParcelable("PurchaseFragment.params", purchaseParams);
        bundle2.putBundle("PurchaseFragment.appDownloadSizeWarningArgs", bundle);
        c2495w.m13377a(bundle2);
        Fragment amVar = new am();
        amVar.m600f(bundle2);
        return amVar;
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f9753b = C1473m.f7980a.mo2256o();
        if (bundle != null) {
            this.f9754c = (C1950i) this.f730B.mo283a("PurchaseFragment.sidecar");
            this.f9756e = bundle.getInt("PurchaseFragment.handledStateInstance");
            this.f9757f = bundle.getInt("PurchaseFragment.previousState");
            this.f9758g = bundle.getInt("PurchaseFragment.previousSubstate");
        }
        Bundle bundle2 = this.f760q;
        this.f9759h = (PurchaseParams) bundle2.getParcelable("PurchaseFragment.params");
        this.ai = bundle2.getBundle("PurchaseFragment.appDownloadSizeWarningArgs");
        if (bundle != null) {
            this.ah = bundle.getString("PurchaseFragment.selectedInstrumentId");
            this.f9760i = (VoucherParams) bundle.getParcelable("PurchaseFragment.voucherParams");
            this.af = bundle.getBundle("PurchaseFragment.prepareChallengeResponses");
            this.ag = bundle.getBundle("PurchaseFragment.commitChallengeResponses");
            this.aj = (PurchaseError) bundle.getParcelable("PurchaseFragment.error");
            this.ak = bundle.getBoolean("PurchaseFragment.succeeded");
            this.an = bundle.getBoolean("PurchaseFragment.skipCheckout");
            this.al = bundle.getBundle("PurchaseFragment.extraPurchaseData");
            this.ao = bundle.getBoolean("PurchaseFragment.usePinBasedAuth");
            this.ap = bundle.getBoolean("PurchaseFragment.useDelegatedAuth");
            this.am = bundle.getBoolean("PurchaseFragment.postSuccessItemOpened");
        } else if (TextUtils.isEmpty(this.f9759h.f9297m)) {
            C1473m.f7980a.ab();
            this.f9760i = new VoucherParams(null, true, C1804v.m9803a(C1473m.f7980a.ah().mo2811a(this.aw)));
        } else {
            this.f9760i = new VoucherParams(this.f9759h.f9297m, true, true);
        }
    }

    public final void mo1292a(Activity activity) {
        super.mo1292a(activity);
        if (!(activity instanceof ad)) {
            throw new IllegalStateException("Activity must implement PlayStoreUiElementNode");
        }
    }

    public final void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        bundle.putInt("PurchaseFragment.handledStateInstance", this.f9756e);
        bundle.putInt("PurchaseFragment.previousState", this.f9757f);
        bundle.putInt("PurchaseFragment.previousSubstate", this.f9758g);
        bundle.putBundle("PurchaseFragment.prepareChallengeResponses", this.af);
        bundle.putBundle("PurchaseFragment.commitChallengeResponses", this.ag);
        bundle.putString("PurchaseFragment.selectedInstrumentId", this.ah);
        bundle.putParcelable("PurchaseFragment.voucherParams", this.f9760i);
        bundle.putBoolean("PurchaseFragment.succeeded", this.ak);
        bundle.putParcelable("PurchaseFragment.error", this.aj);
        bundle.putBoolean("PurchaseFragment.skipCheckout", this.an);
        bundle.putBundle("PurchaseFragment.extraPurchaseData", this.al);
        bundle.putBoolean("PurchaseFragment.usePinBasedAuth", this.ao);
        bundle.putBoolean("PurchaseFragment.useDelegatedAuth", this.ap);
        bundle.putBoolean("PurchaseFragment.isGiftingComplete", this.aq);
        bundle.putBoolean("PurchaseFragment.postSuccessItemOpened", this.am);
    }

    public final void g_() {
        super.g_();
        if (this.f9754c == null) {
            this.f9754c = C1950i.m10379a(this.aw.name, this.f9759h);
            this.f730B.mo284a().mo328a(this.f9754c, "PurchaseFragment.sidecar").mo334c();
        }
        this.f9754c.m6757a((C1087t) this);
        this.f9755d = ar();
        if (this.f9755d != null && !this.aq) {
            this.f9755d.m6757a((C1087t) this);
        }
    }

    private final C1836b ar() {
        return (C1836b) this.f730B.mo283a("PurchaseFragment.giftingSidecar");
    }

    protected final int mo968W() {
        return this.f9759h.f9285a.f11835d;
    }

    public final void h_() {
        if (this.f9754c != null) {
            this.f9754c.m6757a(null);
        }
        super.h_();
    }

    private final void m10172a(CheckoutPurchaseError checkoutPurchaseError, boolean z) {
        C1076h a;
        if ((this.f9754c.aj != null ? 1 : null) != null) {
            a = ac.m10305a(checkoutPurchaseError, z, this.f9754c.ac());
        } else {
            a = ac.m10304a(checkoutPurchaseError, z);
        }
        mo1411a(a);
    }

    public final void mo1423a(C1089s c1089s) {
        C1920f c1920f;
        C1086a c1086a;
        Fragment fragment;
        Animation loadAnimation;
        Fragment fragment2;
        String str;
        int i;
        Bundle bundle;
        C1076h c1938n;
        C0757i c0757i;
        int W;
        if (c1089s instanceof C1950i) {
            C1950i c1950i = (C1950i) c1089s;
            int i2 = c1950i.ag;
            Object[] objArr = new Object[]{Integer.valueOf(c1950i.f6948l), Integer.valueOf(i2)};
            if (i2 == this.f9756e) {
                FinskyLog.m21662b("Already handled state %d", Integer.valueOf(this.f9756e));
                return;
            }
            this.f9756e = i2;
            m mVar;
            C1076h aeVar;
            PurchaseFlowConfig ac;
            switch (this.f9754c.f6948l) {
                case 0:
                    this.f9754c.mo968W();
                    break;
                case 1:
                    c1920f = this.aI;
                    if (c1920f.f9845a.az) {
                        c1086a = c1920f.f9845a;
                        if (c1086a.az) {
                            c1086a.az = false;
                            if (c1086a.aA) {
                                super.m6742b(c1086a.aF);
                            } else {
                                c1086a.aF.setVisibility(4);
                            }
                        }
                    }
                    if (!c1920f.f9845a.ay) {
                        if (c1920f.f9845a.ax != null) {
                            fragment = c1920f.f9845a;
                            loadAnimation = AnimationUtils.loadAnimation(fragment.m603h(), C7582R.anim.slide_out_left);
                            loadAnimation.setAnimationListener(new C1918d(fragment));
                            fragment.aD.startAnimation(loadAnimation);
                            c1920f.f9845a.aE.setVisibility(0);
                            c1920f.f9845a.aE.startAnimation(AnimationUtils.loadAnimation(c1920f.f9845a.m603h(), C7582R.anim.slide_in_right));
                        } else {
                            c1920f.f9845a.aD.setVisibility(4);
                            c1920f.f9845a.aE.setVisibility(0);
                            c1920f.f9845a.aE.startAnimation(AnimationUtils.loadAnimation(c1920f.f9845a.m603h(), C7582R.anim.play_fade_in));
                        }
                        c1920f.f9845a.ay = true;
                        fragment2 = c1920f.f9845a;
                        fragment2.aJ.m13370a(new C2488p().m13340a(213).m13345b((ad) fragment2.m603h()));
                        break;
                    }
                    break;
                case 2:
                    switch (this.f9754c.af) {
                        case 7:
                            Object obj;
                            C1089s c1089s2;
                            boolean z;
                            PurchaseFlowConfig ac2;
                            Bundle bundle2;
                            FinskyLog.m21659a("Purchase succeeded", new Object[0]);
                            this.ak = true;
                            if (!this.ap) {
                                mVar = this.f9754c.aq;
                                if (!((mVar == null || mVar.c == null) && this.f9754c.ai) && ((this.f9759h == null || this.f9759h.f9298n == null || !this.f9759h.f9298n.m) && ((Integer) C1814a.f9372b.m5777b(this.aw.name).m5760a()).intValue() == -1 && ((Integer) C1815b.f9376a.m28964b()).intValue() != 0 && !((Boolean) C1814a.f9374d.m5777b(this.aw.name).m5760a()).booleanValue())) {
                                    obj = 1;
                                    if (obj != null) {
                                        c1089s2 = this.f9754c;
                                        if (!(c1089s2.f6948l == 2 || c1089s2.af == 7)) {
                                            FinskyLog.m21669e("confirmAuthChoiceSelected() called in state %d and substate %d", Integer.valueOf(c1089s2.f6948l), Integer.valueOf(c1089s2.af));
                                        }
                                        c1089s2.m6758b(2, 8);
                                        break;
                                    }
                                    this.f9752a.m13356b(this.aJ, "purchase_fragment_success_choice");
                                    str = this.aw.name;
                                    i = this.f9759h.f9285a.f11835d;
                                    z = this.ao;
                                    ac2 = this.f9754c.ac();
                                    bundle2 = new Bundle();
                                    aeVar = new ae();
                                    bundle2.putString("authAccount", str);
                                    bundle2.putInt("SuccessStepWithAuthChoices.backend", i);
                                    bundle2.putBoolean("SuccessStepWithAuthChoices.usedPinBasedAuth", z);
                                    C1473m.f7980a.aH().m9785b(bundle2, ac2);
                                    aeVar.m600f(bundle2);
                                    mo1411a(aeVar);
                                    C1814a.f9374d.m5777b(this.aw.name).m5763a(Boolean.valueOf(true));
                                    break;
                                }
                            }
                            obj = null;
                            if (obj != null) {
                                c1089s2 = this.f9754c;
                                FinskyLog.m21669e("confirmAuthChoiceSelected() called in state %d and substate %d", Integer.valueOf(c1089s2.f6948l), Integer.valueOf(c1089s2.af));
                                c1089s2.m6758b(2, 8);
                                break;
                            }
                            this.f9752a.m13356b(this.aJ, "purchase_fragment_success_choice");
                            str = this.aw.name;
                            i = this.f9759h.f9285a.f11835d;
                            z = this.ao;
                            ac2 = this.f9754c.ac();
                            bundle2 = new Bundle();
                            aeVar = new ae();
                            bundle2.putString("authAccount", str);
                            bundle2.putInt("SuccessStepWithAuthChoices.backend", i);
                            bundle2.putBoolean("SuccessStepWithAuthChoices.usedPinBasedAuth", z);
                            C1473m.f7980a.aH().m9785b(bundle2, ac2);
                            aeVar.m600f(bundle2);
                            mo1411a(aeVar);
                            C1814a.f9374d.m5777b(this.aw.name).m5763a(Boolean.valueOf(true));
                        case 8:
                            k kVar = this.f9754c.an;
                            i = C1925w.m10280a(kVar);
                            if (i != 0) {
                                this.f9752a.m13356b(this.aJ, "purchase_fragment_success");
                                ac = this.f9754c.ac();
                                Bundle a = C1925w.m10281a(kVar, i);
                                C1076h abVar = new ab();
                                C1473m.f7980a.aH().m9785b(a, ac);
                                abVar.m600f(a);
                                mo1411a(abVar);
                                break;
                            }
                            ag();
                            break;
                        default:
                            throw new IllegalStateException("handleSuccess() was called from substate " + this.f9754c.af);
                    }
                case 3:
                    PurchaseError purchaseError;
                    CheckoutPurchaseError checkoutPurchaseError;
                    boolean z2 = this.f9757f == 1 && this.f9758g == 1;
                    switch (this.f9754c.af) {
                        case 3:
                            CheckoutPurchaseError checkoutPurchaseError2 = new CheckoutPurchaseError(C1290m.m7703b(m603h(), this.f9754c.ar), C1290m.m7702a(m603h(), this.f9754c.ar));
                            PurchaseError purchaseError2 = new PurchaseError(2);
                            try {
                                Throwable th = this.f9754c.ar;
                                if (!C1473m.f7980a.mo2249j(this.aw.name).mo2294a(12604300) || this.f9757f != 1 || this.f9758g != 2) {
                                    purchaseError = purchaseError2;
                                    checkoutPurchaseError = checkoutPurchaseError2;
                                    break;
                                }
                                str = C2229h.m11636a(mo968W());
                                if (str != null) {
                                    C2196e g = C1473m.f7980a.ah().mo2811a(this.aw).mo2793g(str);
                                    boolean a2 = C1473m.f7980a.mo2045Y().m11645a(this.f9759h.f9285a, g);
                                    this.aJ.m13367a(new C2474c(630).m13244b("commit").m13238a(th));
                                    C1473m.f7980a.ai().mo2797a(this.aw, new String[]{str}, new ao(this, g, th, SystemClock.elapsedRealtime(), a2), "purchase_error_library_replication");
                                }
                                purchaseError = purchaseError2;
                                checkoutPurchaseError = checkoutPurchaseError2;
                                break;
                            } catch (NullPointerException e) {
                                FinskyLog.m21667d("account is null", new Object[0]);
                                z2 = true;
                                checkoutPurchaseError = new CheckoutPurchaseError(m605i().getString(C7582R.string.generic_account_error));
                                purchaseError = new PurchaseError(0);
                                break;
                            }
                        case 5:
                            this.ag.clear();
                            checkoutPurchaseError = this.f9754c.as;
                            purchaseError = new PurchaseError(3, checkoutPurchaseError.f9626a);
                            break;
                        default:
                            FinskyLog.m21669e("Unexpected substate: %d", Integer.valueOf(this.f9754c.af));
                            checkoutPurchaseError = new CheckoutPurchaseError();
                            purchaseError = new PurchaseError(0);
                            break;
                    }
                    FinskyLog.m21659a("Error: %s", purchaseError);
                    if (z2) {
                        FinskyLog.m21659a("Purchase failed: %s", purchaseError);
                        this.aj = purchaseError;
                    }
                    m10172a(checkoutPurchaseError, z2);
                    break;
                case 4:
                    i2 = this.f9759h.f9285a.f11835d;
                    C0757i c0757i2 = this.f9754c.ah;
                    ac = aw();
                    bundle = new Bundle();
                    c1938n = new C1938n();
                    bundle.putInt("ChangeSubscriptionStep.backend", i2);
                    bundle.putParcelable("ChangeSubscriptionStep.changeSubscription", ParcelableProto.m21671a(c0757i2));
                    C1473m.f7980a.aH().m9785b(bundle, ac);
                    c1938n.m600f(bundle);
                    mo1411a(c1938n);
                    break;
                case 5:
                    m10174a(false);
                    break;
                case 6:
                    mVar = this.f9754c.ap;
                    if (mVar.g == null) {
                        if (mVar.j == null) {
                            if (mVar.f == null) {
                                if (mVar.b == null) {
                                    FinskyLog.m21669e("Don't know how to handle prepare challenge for doc: %s", this.f9759h.f9285a);
                                    m10172a(new CheckoutPurchaseError(), true);
                                    break;
                                }
                                Bundle bundle3 = new Bundle();
                                bundle3.putString("authAccount", this.aw.name);
                                startActivityForResult(AddressChallengeActivity.m9491a(this.f9759h.f9285a.f11835d, mVar.b, bundle3, this.aJ), 2);
                                break;
                            } else if (!mVar.f.c) {
                                as();
                                break;
                            } else {
                                m10174a(true);
                                break;
                            }
                        } else if (!mVar.j.c) {
                            m10173a(mVar.j.b);
                            break;
                        } else {
                            m10174a(false);
                            break;
                        }
                    }
                    c0757i = mVar.g;
                    PurchaseFlowConfig aw = aw();
                    C1076h c1923a = new C1923a();
                    bundle = new Bundle();
                    bundle.putParcelable("AcknowledgementChallengeStep.challenge", ParcelableProto.m21671a(c0757i));
                    C1473m.f7980a.aH().m9785b(bundle, aw);
                    c1923a.m600f(bundle);
                    c1923a.f9847b = c0757i;
                    mo1411a(c1923a);
                    break;
                case 7:
                    mVar = this.f9754c.aq;
                    if (mVar.m == null) {
                        if (mVar.c == null) {
                            if (mVar.h == null) {
                                if (mVar.k == null) {
                                    FinskyLog.m21669e("Don't know how to handle complete challenge for doc: %s", this.f9759h.f9285a);
                                    m10172a(new CheckoutPurchaseError(), true);
                                    break;
                                }
                                mo1411a(C1940r.m10352a(this.aw, mVar.k, aw()));
                                break;
                            }
                            Account account = this.aw;
                            af afVar = mVar.h;
                            W = mo968W();
                            C2495w c2495w = this.aJ;
                            Intent intent = new Intent(C1473m.f7980a.f7981b, PurchaseManagerActivity.class);
                            intent.putExtra("PurchaseManagerActivity.account", account);
                            C1473m.f7980a.aG();
                            intent.putExtra("PurchaseManagerActivity.securePaymentPayload", C1793i.m9762a(afVar));
                            intent.putExtra("PurchaseManagerActivity.backend", W);
                            C1647h.m9344a(intent, account.name);
                            c2495w.m13366a(account).m13376a(intent);
                            startActivityForResult(intent, 5);
                            break;
                        }
                        this.f9752a.m13354a(this.aJ, "purchase_sidecar_auth_challenge");
                        com.google.wireless.android.finsky.a.a.k kVar2 = mVar.c;
                        C1874a a3 = this.ar.mo2459a(this.aw, this.aJ);
                        a3.m10012a(new an(this, a3, kVar2), false);
                        break;
                    }
                    q qVar = mVar.m;
                    String str2 = this.f9759h.f9286b;
                    W = this.f9759h.f9288d;
                    int W2 = mo968W();
                    PurchaseFlowConfig aw2 = aw();
                    aeVar = new C1910b();
                    aeVar.m600f(C1909p.m10247a(qVar, str2, W, W2, aw2));
                    mo1411a(aeVar);
                    break;
                case 9:
                    as();
                    break;
                case 10:
                    mo1411a(ac.m10306b(this.f9754c.as, false, true, 1300, 1301, this.f9754c.ac()));
                    break;
                case 11:
                    ac();
                    break;
                case 12:
                    this.ap = true;
                    m mVar2 = this.f9754c.aq;
                    if (mVar2.m == null) {
                        FinskyLog.m21669e("Don't know how to handle complete challenge for doc: %s", this.f9759h.f9285a);
                        m10172a(new CheckoutPurchaseError(), true);
                        break;
                    }
                    this.f9752a.m13356b(this.aJ, "purchase_fragment_family_acquisition_challenge");
                    Account account2 = this.aw;
                    q qVar2 = mVar2.m;
                    Document document = this.f9759h.f9287c;
                    String str3 = this.f9759h.f9286b;
                    int i3 = this.f9759h.f9285a.f11834c;
                    int W3 = mo968W();
                    PurchaseFlowConfig aw3 = aw();
                    C1076h c1908a = new C1908a();
                    c1908a.m600f(C1907q.m10238a(account2, qVar2, document, str3, i3, W3, aw3));
                    mo1411a(c1908a);
                    break;
                case 13:
                    mo2518a(null);
                    break;
                case 14:
                    mo1411a(C1945x.m10369a(this.aw, this.f9759h.f9285a.f11835d, this.f9759h.f9286b, this.f9759h.f9288d, this.f9759h.f9289e, this.f9759h.f9287c, this.f9754c.aw));
                    break;
            }
            this.f9757f = c1950i.f6948l;
            this.f9758g = c1950i.af;
        } else if (c1089s instanceof C1836b) {
            C1836b c1836b = (C1836b) c1089s;
            switch (c1836b.f6948l) {
                case 0:
                    return;
                case 1:
                    if (c1836b.af != 1) {
                        c1920f = this.aI;
                        if (c1920f.f9845a.az) {
                            c1086a = c1920f.f9845a;
                            if (c1086a.az) {
                                c1086a.az = false;
                                if (c1086a.aA) {
                                    super.m6742b(c1086a.aF);
                                } else {
                                    c1086a.aF.setVisibility(4);
                                }
                            }
                        }
                        if (!c1920f.f9845a.ay) {
                            if (c1920f.f9845a.ax != null) {
                                fragment = c1920f.f9845a;
                                loadAnimation = AnimationUtils.loadAnimation(fragment.m603h(), C7582R.anim.slide_out_left);
                                loadAnimation.setAnimationListener(new C1918d(fragment));
                                fragment.aD.startAnimation(loadAnimation);
                                c1920f.f9845a.aE.setVisibility(0);
                                c1920f.f9845a.aE.startAnimation(AnimationUtils.loadAnimation(c1920f.f9845a.m603h(), C7582R.anim.slide_in_right));
                            } else {
                                c1920f.f9845a.aD.setVisibility(4);
                                c1920f.f9845a.aE.setVisibility(0);
                                c1920f.f9845a.aE.startAnimation(AnimationUtils.loadAnimation(c1920f.f9845a.m603h(), C7582R.anim.play_fade_in));
                            }
                            c1920f.f9845a.ay = true;
                            fragment2 = c1920f.f9845a;
                            fragment2.aJ.m13370a(new C2488p().m13340a(213).m13345b((ad) fragment2.m603h()));
                            return;
                        }
                        return;
                    } else if (!(this.ax instanceof com.google.android.finsky.billing.lightpurchase.p160e.ad)) {
                        c0757i = this.f9755d.f9449f;
                        i = this.f9759h.f9285a.f11835d;
                        W = this.f9759h.f9285a.f11834c;
                        bundle = new Bundle();
                        c1938n = new com.google.android.finsky.billing.lightpurchase.p160e.ad();
                        bundle.putParcelable("SendGiftStep.template", ParcelableProto.m21671a(c0757i));
                        bundle.putInt("SendGiftStep.backend", i);
                        bundle.putInt("SendGiftStep.documentType", W);
                        c1938n.m600f(bundle);
                        c1938n.f9860a = c0757i.f12807f;
                        mo1411a(c1938n);
                        return;
                    } else {
                        return;
                    }
                case 2:
                    startActivityForResult(c1836b.mo968W(), 7);
                    this.aq = true;
                    return;
                case 3:
                    Context h = m603h();
                    mo1411a(ac.m10306b(new CheckoutPurchaseError(c1836b.m9887c(h), c1836b.m9885b(h)), true, false, 5554, 5555, this.f9754c.ac()));
                    return;
                default:
                    throw new IllegalStateException("Unknown GiftSidecar state: " + c1836b.f6948l);
            }
        } else {
            String str4 = "Unexpected sidecar: ";
            str = String.valueOf(c1089s.getClass().getName());
            throw new IllegalStateException(str.length() != 0 ? str4.concat(str) : new String(str4));
        }
    }

    public final void mo2517a(fa faVar) {
        this.f9754c.m10397a(faVar, this.aJ);
    }

    public final void mo2514Y() {
        mo2518a(null);
    }

    public final void mo2518a(Boolean bool) {
        this.f9752a.m13354a(this.aJ, "purchase_sidecar_state_prepare");
        if (this.f9754c.af == 10) {
            this.ag.clear();
        }
        Map hashMap = new HashMap();
        al a = C1821j.m9830a(this.aw.name);
        C1791f.m9754a(m603h(), hashMap);
        hashMap.put("bppcc", this.as.m9765a(m603h(), this.aw.name));
        this.f9754c.m10398a(this.ah, this.f9760i, this.af, a, bool, hashMap, this.aJ);
    }

    private final void m10174a(boolean z) {
        this.f9752a.m13356b(this.aJ, "purchase_fragment_cart_details");
        int i = this.f9759h.f9285a.f11835d;
        int i2 = this.f9759h.f9285a.f11834c;
        C0757i c0757i = this.f9754c.f9944g;
        Parcelable parcelable = this.f9754c.aw;
        PurchaseFlowConfig ac = this.f9754c.ac();
        Bundle bundle = new Bundle();
        C1076h c1935k = new C1935k();
        bundle.putInt("CartDetailsStep.backend", i);
        bundle.putInt("CartDetailsStep.documentType", i2);
        bundle.putParcelable("CartDetailsStep.cart", ParcelableProto.m21671a(c0757i));
        bundle.putBoolean("CartDetailsStep.continueToInstrumentManager", z);
        bundle.putParcelable("CartDetailsStep.giftEmailParams", parcelable);
        bundle.putBoolean("CartDetailsStep.isPriceColorOverridden", ac.m9745a("ALL_PRICE", "COLOR"));
        C1473m.f7980a.aH().m9783a(bundle, ac, "CART_CONTINUE_BUTTON");
        c1935k.m600f(bundle);
        c1935k.f9893d = c0757i;
        mo1411a(c1935k);
    }

    private final void as() {
        ay ayVar = this.f9754c.ap.f.b;
        String str = this.aw.name;
        int a = C2043f.m10742a(mo968W());
        C1076h aaVar = new aa();
        aaVar.m600f(C1924e.m10270a(str, ayVar, a));
        mo1411a(aaVar);
    }

    public final void mo2516a(com.google.wireless.android.finsky.a.a.k kVar, AuthState authState) {
        this.ao = authState.m10001a() == 2;
        this.f9752a.m13356b(this.aJ, "purchase_fragment_auth_challenge");
        int W = mo968W();
        int i = this.f9759h.f9285a.f11834c;
        Account account = this.aw;
        String str = this.f9759h.f9286b;
        PurchaseFlowConfig ac = this.f9754c.ac();
        Bundle a = C1906g.m10222a(account, authState, str, W);
        a.putParcelable("AuthChallengeStep.challenge", ParcelableProto.m21671a((C0757i) kVar));
        Map map = (Map) ac.f9284b.get("CHALLENGE_GAIA_OPT_OUT");
        a.putString("AuthChallengeStep.challengeGaiaOptOutLabel", map == null ? null : (String) map.get("TEXT"));
        a.putInt("AuthChallengeStep.documentType", i);
        C1076h c1927b = new C1927b();
        C1473m.f7980a.aH().m9783a(a, ac, "AUTH_CONTINUE_BUTTON");
        c1927b.ao = authState;
        c1927b.m600f(a);
        mo1411a(c1927b);
    }

    public final void mo2515Z() {
        C1089s c1089s = this.f9754c;
        if (c1089s.f6948l != 4) {
            FinskyLog.m21669e("switchFromChangeSubscriptionToCart() called in state %d", Integer.valueOf(c1089s.f6948l));
        }
        c1089s.m6758b(5, 0);
    }

    public final void aa() {
        C1089s c1089s = this.f9754c;
        if (c1089s.f6948l != 6) {
            FinskyLog.m21669e("switchToInstrumentManager() called in state %d", Integer.valueOf(c1089s.f6948l));
        }
        c1089s.m6758b(9, 0);
    }

    public final void ab() {
        if (this.f9759h.f9285a.f11834c == 1) {
            C2713b k = C1473m.f7980a.mo2251k(this.aw.name);
            if (k != null) {
                String str = this.f9759h.f9286b;
                String valueOf = String.valueOf("completePurchase?doc=");
                str = String.valueOf(str);
                k.m14712a(str.length() != 0 ? valueOf.concat(str) : new String(valueOf), 0);
            }
        }
        at();
    }

    private final void at() {
        if (this.f9759h.f9285a.f11834c == 1) {
            C2838a bW = C1473m.f7980a.bW();
            boolean a = bW.m14997a();
            int a2 = bW.m14996a(false);
            if (a && a2 == 2 && !C1473m.f7980a.mo2258q().m11720b()) {
                long c;
                if (this.f9759h.f9287c != null) {
                    c = C1473m.f7980a.mo2223d().m8962c(this.f9759h.f9287c);
                } else {
                    c = 0;
                }
                C1835g.m9869a(this, this.aw.name, c, this.aJ).m625a(this.f730B, "PurchaseFragment.downloadNetworkDialog");
                return;
            } else if (this.ai != null && (!a || a2 == 1)) {
                C2039p.m10725a(this, this.aw.name, this.ai, this.aJ).m625a(this.f730B, "PurchaseFragment.appDownloadSizeWarningDialog");
                return;
            }
        }
        au();
    }

    private final void au() {
        C2838a bW = C1473m.f7980a.bW();
        if (this.f9759h.f9285a.f11834c == 1 && bW.m14997a() && bW.m14996a(false) == 3) {
            this.f9753b.mo3444b(this.f9759h.f9285a.f11833b);
        }
        if (this.an) {
            this.f9754c.m10395a(this.aJ);
            ac();
            return;
        }
        av();
    }

    public final void ac() {
        ((ap) m603h()).mo2493n();
    }

    private final void av() {
        this.f9754c.m10393a(this.ag, this.as.m9765a(m603h(), this.aw.name), this.aJ);
    }

    public final void ad() {
        m10173a(null);
    }

    private final void m10173a(u uVar) {
        startActivityForResult(BillingProfileActivity.m10752a(m603h(), this.aw, this.f9754c.ab(), this.f9759h.f9285a, this.f9759h.f9288d, uVar, this.f9754c.ac(), this.aJ, 1), 1);
    }

    public final void ae() {
        startActivityForResult(RedeemCodeActivity.m10894a(this.aw.name, 1, this.f9759h.f9285a, this.f9759h.f9288d, aw(), this.aJ), 3);
    }

    public final void af() {
        startActivityForResult(new Intent(C1473m.f7980a.f7981b, SettingsActivity.class), 4);
    }

    public final void mo2519a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f9760i = new VoucherParams(null, false, true);
        } else {
            this.f9760i = new VoucherParams(str, true, true);
        }
        mo2518a(null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2342a(int r8, int r9, android.content.Intent r10) {
        /*
        r7 = this;
        r3 = 0;
        r2 = 0;
        r1 = 1;
        r0 = -1;
        switch(r8) {
            case 1: goto L_0x0012;
            case 2: goto L_0x0073;
            case 3: goto L_0x0084;
            case 4: goto L_0x009f;
            case 5: goto L_0x0073;
            case 6: goto L_0x00eb;
            case 7: goto L_0x0114;
            case 8: goto L_0x0119;
            case 9: goto L_0x0120;
            default: goto L_0x0007;
        };
    L_0x0007:
        if (r2 != 0) goto L_0x000e;
    L_0x0009:
        r0 = r7.ax;
        r7.mo1412a(r0);
    L_0x000e:
        super.mo2342a(r8, r9, r10);
        return;
    L_0x0012:
        if (r9 != r0) goto L_0x003b;
    L_0x0014:
        r0 = "BillingProfileActivity.selectedInstrumentId";
        r0 = r10.getStringExtra(r0);
        r0 = r7.m10177b(r0);
        if (r0 != 0) goto L_0x002c;
    L_0x0020:
        r0 = "BillingProfileActivity.redeemPromoCodeResult";
        r0 = r10.getParcelableExtra(r0);
        r0 = (com.google.android.finsky.billing.common.RedeemCodeResult) r0;
        r0 = r7.m10176a(r0);
    L_0x002c:
        if (r0 != 0) goto L_0x0039;
    L_0x002e:
        r0 = "Missing instrumentId or redemption result";
        r2 = new java.lang.Object[r2];
        com.google.android.finsky.utils.FinskyLog.m21665c(r0, r2);
        r7.mo2518a(r3);
        r0 = r1;
    L_0x0039:
        r2 = r0;
        goto L_0x0007;
    L_0x003b:
        r0 = r7.f9754c;
        r0 = r0.f6948l;
        r3 = 6;
        if (r0 != r3) goto L_0x0067;
    L_0x0042:
        r0 = r7.f9754c;
        r0 = r0.ap;
        if (r0 == 0) goto L_0x0067;
    L_0x0048:
        r0 = r7.f9754c;
        r0 = r0.ap;
        r0 = r0.j;
        if (r0 == 0) goto L_0x0067;
    L_0x0050:
        r0 = r7.f9754c;
        r0 = r0.ap;
        r0 = r0.j;
        r0 = r0.c;
        if (r0 != 0) goto L_0x0067;
    L_0x005a:
        r0 = 9;
        r0 = r7.m10175a(r10, r0);
        if (r0 != 0) goto L_0x0065;
    L_0x0062:
        r7.ac();
    L_0x0065:
        r2 = r1;
        goto L_0x0007;
    L_0x0067:
        if (r9 != 0) goto L_0x0007;
    L_0x0069:
        r0 = 8;
        r0 = r7.m10175a(r10, r0);
        if (r0 == 0) goto L_0x0007;
    L_0x0071:
        r2 = r1;
        goto L_0x0007;
    L_0x0073:
        if (r9 != r0) goto L_0x0080;
    L_0x0075:
        r0 = "challenge_response";
        r0 = r10.getBundleExtra(r0);
        r2 = r7.mo2520a(r0);
        goto L_0x0007;
    L_0x0080:
        r7.ac();
        goto L_0x0071;
    L_0x0084:
        if (r9 != r0) goto L_0x0007;
    L_0x0086:
        r0 = "redeem_code_result";
        r0 = r10.getParcelableExtra(r0);
        r0 = (com.google.android.finsky.billing.common.RedeemCodeResult) r0;
        if (r0 == 0) goto L_0x012f;
    L_0x0090:
        r1 = r0.f9307a;
        r1 = r7.m10177b(r1);
        if (r1 != 0) goto L_0x012c;
    L_0x0098:
        r0 = r7.m10176a(r0);
    L_0x009c:
        r2 = r0;
        goto L_0x0007;
    L_0x009f:
        r0 = r7.ax;
        r0 = r0 instanceof com.google.android.finsky.billing.lightpurchase.p160e.C1927b;
        if (r0 == 0) goto L_0x00de;
    L_0x00a5:
        r0 = r7.ax;
        r0 = (com.google.android.finsky.billing.lightpurchase.p160e.C1927b) r0;
        r3 = r0.an;
        r3 = r3.name;
        r3 = com.google.android.finsky.billing.p131e.C1821j.m9832b(r3);
        r4 = r0.f9880f;
        if (r3 == r4) goto L_0x00dc;
    L_0x00b5:
        r4 = "PurchaseAuth changed from %d to %d.";
        r5 = 2;
        r5 = new java.lang.Object[r5];
        r6 = r0.f9880f;
        r6 = java.lang.Integer.valueOf(r6);
        r5[r2] = r6;
        r6 = java.lang.Integer.valueOf(r3);
        r5[r1] = r6;
        com.google.android.finsky.utils.FinskyLog.m21659a(r4, r5);
        if (r3 != 0) goto L_0x00d9;
    L_0x00cd:
        r0 = r0.aa();
        r0 = (com.google.android.finsky.billing.lightpurchase.aq) r0;
        r0.mo2514Y();
    L_0x00d6:
        r2 = r1;
        goto L_0x0007;
    L_0x00d9:
        r0.ab();
    L_0x00dc:
        r1 = r2;
        goto L_0x00d6;
    L_0x00de:
        r0 = "Unexpected fragment: %s";
        r1 = new java.lang.Object[r1];
        r3 = r7.ax;
        r1[r2] = r3;
        com.google.android.finsky.utils.FinskyLog.m21669e(r0, r1);
        goto L_0x0007;
    L_0x00eb:
        if (r9 != r0) goto L_0x010f;
    L_0x00ed:
        r0 = r7.f9754c;
        r0 = r0.an;
        r2 = new com.google.android.finsky.dfemodel.Document;
        r0 = r0.b;
        r0 = r0.c;
        r0 = r0.a;
        r2.<init>(r0);
        r0 = com.google.android.finsky.C1473m.f7980a;
        r0 = r0.bo();
        r3 = r7.m603h();
        r4 = r7.aJ;
        r0 = r0.mo2740a(r3, r2, r4);
        r7.m580a(r0);
    L_0x010f:
        r7.ac();
        goto L_0x0071;
    L_0x0114:
        r7.ac();
        goto L_0x0071;
    L_0x0119:
        if (r9 != r0) goto L_0x0007;
    L_0x011b:
        r7.mo2518a(r3);
        goto L_0x0071;
    L_0x0120:
        if (r9 != r0) goto L_0x0127;
    L_0x0122:
        r7.mo2518a(r3);
        goto L_0x0071;
    L_0x0127:
        r7.ac();
        goto L_0x0071;
    L_0x012c:
        r0 = r1;
        goto L_0x009c;
    L_0x012f:
        r0 = r2;
        goto L_0x009c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.billing.lightpurchase.am.a(int, int, android.content.Intent):void");
    }

    private final boolean m10175a(Intent intent, int i) {
        if (intent == null) {
            return false;
        }
        com.google.android.finsky.cv.p177a.am amVar = (com.google.android.finsky.cv.p177a.am) ParcelableProto.m21672a(intent, "BillingProfileActiivty.catchAbandonmentDialog");
        long currentTimeMillis = System.currentTimeMillis();
        long toMillis = TimeUnit.HOURS.toMillis((long) amVar.f11820k);
        if (amVar == null) {
            return false;
        }
        boolean z;
        String str = this.aw.name;
        if (((Integer) C0954a.bn.m5777b(str).m5760a()).intValue() <= 0) {
            z = false;
        } else {
            if (toMillis + ((Long) C0954a.bo.m5777b(str).m5760a()).longValue() >= currentTimeMillis) {
                z = true;
            } else {
                z = false;
            }
            FinskyLog.m21662b("is_snoozed=%b (account=%s)", Boolean.valueOf(z), FinskyLog.m21655a(str));
        }
        if (z) {
            return false;
        }
        str = this.aw.name;
        C0954a.bn.m5777b(str).m5763a(Integer.valueOf(((Integer) C0954a.bn.m5777b(str).m5760a()).intValue() + 1));
        C0954a.bo.m5777b(str).m5763a(Long.valueOf(currentTimeMillis));
        FinskyLog.m21662b("Snoozing (account=%s)", FinskyLog.m21655a(str));
        startActivityForResult(CatchAbandonmentActivity.m10756a(m603h(), amVar, this.f9759h.f9285a.f11835d, this.aw.name, this.f9754c.ac(), this.aJ), i);
        return true;
    }

    private final boolean m10177b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.ah = str;
        mo2518a(null);
        return true;
    }

    private final boolean m10176a(RedeemCodeResult redeemCodeResult) {
        if (redeemCodeResult == null) {
            return false;
        }
        if (redeemCodeResult.f9309c) {
            Object a = redeemCodeResult.m9749a();
            if (TextUtils.isEmpty(a)) {
                this.an = true;
                at();
                return true;
            }
            this.f9760i = new VoucherParams(a, true, true);
            mo2518a(null);
            return true;
        }
        this.ak = true;
        this.al = redeemCodeResult.f9310d;
        ac();
        return true;
    }

    public final void ag() {
        if (this.ak) {
            k kVar = this.f9754c.an;
            if (kVar.b != null) {
                boolean z;
                l lVar = kVar.b;
                if (lVar.c != null) {
                    Document document = new Document(lVar.c.a);
                    String str = document.m14625N().f13171k;
                    if (new C3654j(C1473m.f7980a.aN()).m17264a(document.m14625N()).m17262a(C1473m.f7980a.mo2032L().mo2854a(str)).m17269e()) {
                        Intent launchIntentForPackage = m603h().getPackageManager().getLaunchIntentForPackage(str);
                        if (launchIntentForPackage == null) {
                            launchIntentForPackage = C1473m.f7980a.bo().mo2740a(m603h(), document, this.aJ);
                        }
                        m580a(launchIntentForPackage);
                    } else {
                        startActivityForResult(LightPurchaseFlowActivity.m10056a(this.aw, document, null, 1, null, document.f14885a.f12087D, null, 0, null, false, 0, this.aJ), 6);
                        z = true;
                        if (z) {
                            FinskyLog.m21659a("Dialog shown, waiting for user input.", new Object[0]);
                            return;
                        }
                    }
                }
                if (lVar.a != null) {
                    boolean a = this.at.mo2700a(m603h(), this.aw, new Document(lVar.a.a), this.f730B, this, 101, this.f9759h);
                    this.am = !a;
                    z = a;
                } else if (lVar.f != null) {
                    this.f9755d = ar();
                    if (this.f9755d == null) {
                        this.f9755d = C1836b.m9880a(lVar.f, this.aw.name, this.aJ);
                        this.f730B.mo284a().mo328a(this.f9755d, "PurchaseFragment.giftingSidecar").mo334c();
                    }
                    this.f9755d.m6757a((C1087t) this);
                    z = true;
                } else if (lVar.b != null) {
                    FinskyLog.m21669e("Invalid PostSuccessAction. Should not go to home from purchase flow.", new Object[0]);
                } else if (lVar.d != null) {
                    FinskyLog.m21669e("Invalid PostSuccessAction. Cannot enter purchase flow from purchase flow.", new Object[0]);
                } else if (lVar.e != null) {
                    FinskyLog.m21669e("Invalid PostSuccessAction. Cannot open container from purchase flow.", new Object[0]);
                } else {
                    FinskyLog.m21665c("Unsupported PostSuccessAction.", new Object[0]);
                }
                if (z) {
                    FinskyLog.m21659a("Dialog shown, waiting for user input.", new Object[0]);
                    return;
                }
                z = false;
                if (z) {
                    FinskyLog.m21659a("Dialog shown, waiting for user input.", new Object[0]);
                    return;
                }
            }
        }
        ac();
    }

    public final void ah() {
        C1089s c1089s = this.f9754c;
        if (!(c1089s.f6948l == 2 || c1089s.af == 7)) {
            FinskyLog.m21669e("confirmAuthChoiceSelected() called in state %d and substate %d", Integer.valueOf(c1089s.f6948l), Integer.valueOf(c1089s.af));
        }
        c1089s.m6758b(2, 8);
    }

    private final PurchaseFlowConfig aw() {
        if (C1473m.f7980a.mo2249j(this.aw.name).mo2294a(12619928)) {
            return this.f9754c.ac();
        }
        return PurchaseFlowConfig.f9283a;
    }

    public final void mo2499a(int i, boolean z) {
        String str = this.f9759h.f9285a.f11833b;
        switch (i) {
            case 3:
                FinskyLog.m21659a("Will queue %s to be downloaded on wifi only", str);
                this.f9753b.mo3444b(str);
                break;
            default:
                FinskyLog.m21659a("Will queue %s to be downloaded over any network", str);
                this.f9753b.mo3431a(str);
                break;
        }
        if (z && !((Boolean) C0954a.f5856z.m5760a()).booleanValue()) {
            Bundle a = C1834t.m9862a(this.aw.name, this.aJ);
            Fragment c1873l = new C1873l();
            if (this != null) {
                if (this instanceof C1886u) {
                    c1873l.m581a((Fragment) this, -1);
                } else {
                    throw new IllegalArgumentException("targetFragment must implement PreAppDownloadWarnings.Listener");
                }
            }
            c1873l.m600f(a);
            c1873l.m625a(this.f730B, "PurchaseFragment.downloadNetworkDialog");
            C0954a.f5856z.m5763a(Boolean.valueOf(true));
        }
        au();
    }

    public final void U_() {
        m580a(new Intent("android.settings.WIFI_SETTINGS"));
    }

    public final void V_() {
        FinskyLog.m21659a("Download size warning dismissed for app = %s", this.f9759h.f9285a.f11833b);
    }

    public final void W_() {
        au();
    }

    public final void mo1202a(int i, Bundle bundle) {
        if (i == 101) {
            m580a(C1473m.f7980a.bo().mo2745a(m603h(), bundle.getString("dialog_details_url"), this.aJ));
            ac();
        }
    }

    public final void f_(int i) {
    }

    public final void mo1211b(int i, Bundle bundle) {
        if (i == 101) {
            ac();
        }
    }

    public final void e_(int i) {
        this.f9754c.m10391a(i);
    }

    public final boolean mo2520a(Bundle bundle) {
        switch (this.f9754c.f6948l) {
            case 6:
                this.af.putAll(bundle);
                mo2518a(null);
                return true;
            case 7:
            case 12:
                this.ag.putAll(bundle);
                av();
                return true;
            default:
                FinskyLog.m21669e("Cannot answer challenge in state %d", Integer.valueOf(this.f9754c.f6948l));
                return false;
        }
    }

    public final void mo2513X() {
        C1089s c1089s = this.f9754c;
        if (c1089s.f6948l != 7) {
            FinskyLog.m21669e("switchToFamilyManagerChallenge() called in state %d", Integer.valueOf(c1089s.f6948l));
        }
        c1089s.m6758b(12, 0);
    }
}
