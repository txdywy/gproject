package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.text.TextUtils;
import com.android.volley.C0657w;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.api.VoucherParams;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.billing.common.C1087t;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.billing.common.C1791f;
import com.google.android.finsky.billing.common.C1793i;
import com.google.android.finsky.billing.common.C1799o;
import com.google.android.finsky.billing.common.C1804v;
import com.google.android.finsky.billing.common.PurchaseError;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.legacyauth.C1874a;
import com.google.android.finsky.billing.legacyauth.C1880f;
import com.google.android.finsky.billing.p131e.C1821j;
import com.google.android.finsky.billing.payments.C2043f;
import com.google.android.finsky.billing.profile.C2056m;
import com.google.android.finsky.ce.C2266a;
import com.google.android.finsky.cj.C2286c;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.detailscomponents.DocImageView;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.C2731v;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.download.C2838a;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.installqueue.C3366j;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.wallet.common.pub.i;
import com.google.wireless.android.finsky.a.a.ah;
import com.google.wireless.android.finsky.a.a.m;
import com.google.wireless.android.finsky.dfe.c.a.al;
import com.google.wireless.android.finsky.dfe.nano.k;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ay extends C1089s implements C1087t {
    public final C2471a f9802a = C1473m.f7980a.aR();
    public String aA;
    public String aB;
    public String aC;
    public PurchaseError aD;
    public int aE;
    public C1793i aF;
    public String ah;
    public VoucherParams ai;
    public bl aj;
    public boolean ak;
    public boolean al;
    public boolean am;
    public boolean an;
    public boolean ao;
    public boolean ap;
    public C1950i aq;
    public C1957p ar;
    public C1903a as;
    public C1880f at;
    public C2056m au;
    public C1959r av;
    public Bundle aw;
    public Bundle ax;
    public String ay;
    public String az;
    public C2495w f9803b;
    public Account f9804c;
    public PurchaseParams f9805d;
    public PurchaseParams f9806e;
    public al f9807f;
    public C2731v f9808g;

    public ay() {
        C1473m.f7980a.bD();
        this.aF = C1473m.f7980a.aG();
    }

    public static ay m10203a(Account account, PurchaseParams purchaseParams, C2731v c2731v) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("PurchaseStateMachine.account", account);
        bundle.putParcelable("PurchaseStateMachine.purchaseParams", purchaseParams);
        bundle.putParcelable("PurchaseStateMachine.authInfo", ParcelableProto.m21671a(C1821j.m9830a(account.name)));
        if (c2731v != null) {
            bundle.putSerializable("PurchaseStateMachine.offerFilter", c2731v);
        }
        Fragment ayVar = new ay();
        ayVar.m600f(bundle);
        return ayVar;
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        Bundle bundle2 = this.f760q;
        this.f9804c = (Account) bundle2.getParcelable("PurchaseStateMachine.account");
        this.f9803b = this.f9802a.m13179a(bundle);
        this.f9805d = (PurchaseParams) bundle2.getParcelable("PurchaseStateMachine.purchaseParams");
        this.f9807f = (al) ParcelableProto.m21673a(bundle2, "PurchaseStateMachine.authInfo");
        this.f9808g = (C2731v) bundle2.getSerializable("PurchaseStateMachine.offerFilter");
        C1473m.f7980a.ab();
        this.ai = new VoucherParams(null, true, C1804v.m9803a(C1473m.f7980a.ah().mo2811a(this.f9804c)));
        if (bundle == null) {
            this.aw = new Bundle();
            this.ax = new Bundle();
            return;
        }
        super.mo2462a(bundle);
        this.aw = bundle.getBundle("PurchaseStateMachine.preparePurchaseChallengeResponses");
        this.ax = bundle.getBundle("PurchaseStateMachine.completePurchaseChallengeResponses");
        this.ah = bundle.getString("PurchaseStateMachine.instrumentId");
        this.aj = (bl) ParcelableProto.m21673a(bundle, "PurchaseStateMachine.offer");
        this.ak = bundle.getBoolean("PurchaseStateMachine.offerOwned");
        this.al = bundle.getBoolean("PurchaseStateMachine.acceptedAppsPermissions");
        this.am = bundle.getBoolean("PurchaseStateMachine.acceptedDownloadWarning");
        this.an = bundle.getBoolean("PurchaseStateMachine.acceptedInstall");
        this.ao = bundle.getBoolean("PurchaseStateMachine.offerResolutionErrorDialogShown");
        this.ap = bundle.getBoolean("PurchaseStateMachine.mSetupPinErrorDialogShown");
    }

    public final void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        bundle.putBundle("PurchaseStateMachine.preparePurchaseChallengeResponses", this.aw);
        bundle.putBundle("PurchaseStateMachine.completePurchaseChallengeResponses", this.ax);
        bundle.putString("PurchaseStateMachine.instrumentId", this.ah);
        bundle.putParcelable("PurchaseStateMachine.offer", ParcelableProto.m21671a(this.aj));
        bundle.putBoolean("PurchaseStateMachine.offerOwned", this.ak);
        bundle.putBoolean("PurchaseStateMachine.acceptedAppsPermissions", this.al);
        bundle.putBoolean("PurchaseStateMachine.acceptedDownloadWarning", this.am);
        bundle.putBoolean("PurchaseStateMachine.acceptedInstall", this.an);
        bundle.putBoolean("PurchaseStateMachine.offerResolutionErrorDialogShown", this.ao);
        bundle.putBoolean("PurchaseStateMachine.mSetupPinErrorDialogShown", this.ap);
    }

    public final void g_() {
        super.g_();
        ab abVar = this.f730B;
        this.aq = (C1950i) abVar.mo283a("PurchaseStateMachine.sidecar");
        if (this.aq != null) {
            this.aq.m6757a((C1087t) this);
        }
        this.ar = (C1957p) abVar.mo283a("PurchaseStateMachine.documentSidecar");
        if (this.ar == null) {
            this.ar = new C1957p();
            abVar.mo284a().mo328a(this.ar, "PurchaseStateMachine.documentSidecar").mo334c();
        }
        this.ar.m6757a((C1087t) this);
        this.as = (C1903a) abVar.mo283a("PurchaseStateMachine.authStateSidecar");
        if (this.as == null) {
            this.as = new C1903a();
            abVar.mo284a().mo328a(this.as, "PurchaseStateMachine.authStateSidecar").mo334c();
        }
        this.as.m6757a((C1087t) this);
        this.at = (C1880f) abVar.mo283a("PurchaseStateMachine.authChallengeSidecar");
        if (this.at != null) {
            this.at.m6757a((C1087t) this);
        }
        this.au = (C2056m) abVar.mo283a("PurchaseStateMachine.billingProfileSidecar");
        if (this.au != null) {
            this.au.m6757a((C1087t) this);
        }
        this.av = (C1959r) abVar.mo283a("PurchaseStateMachine.freePurchaseSidecar");
        if (this.av != null) {
            this.av.m6757a((C1087t) this);
        }
    }

    private final String m10204a(int i) {
        i iVar = new i(i);
        iVar.b = 1;
        return this.aF.m9767a(m603h(), this.f9804c.name, iVar.a());
    }

    public final void h_() {
        super.h_();
        if (this.aq != null) {
            this.aq.m6757a(null);
        }
        this.as.m6757a(null);
        if (this.at != null) {
            this.at.m6757a(null);
        }
    }

    public final String m10220c(int i, int i2) {
        C1473m.f7980a.bR();
        return af.m9220a(this.ar.f9960b, i, i2, DocImageView.f13711a).f11860f;
    }

    public final String mo968W() {
        if (this.aC == null) {
            return this.aC;
        }
        return this.aC.toUpperCase(m605i().getConfiguration().locale);
    }

    public final int m10213X() {
        return this.as.mo968W().f9576d;
    }

    public final int m10214Y() {
        if (this.af == 4 || this.af == 5) {
            return this.aE;
        }
        throw new IllegalStateException("Screen type only for generic screens");
    }

    public final int m10215Z() {
        if (this.af == 4 || this.af == 5) {
            return this.aE;
        }
        throw new IllegalStateException("Button type only for generic screens");
    }

    public final List aa() {
        List arrayList = new ArrayList();
        Document document = this.ar.f9960b;
        for (bl blVar : document.f14885a.f12107n) {
            if (blVar.f11926p != 2 && (this.f9808g == null || this.f9808g.m14768a(blVar.f11926p))) {
                arrayList.add(new ak(document, blVar));
            }
        }
        return arrayList;
    }

    public final List ab() {
        return C1473m.f7980a.aV().m11995a(this.ar.f9960b.m14625N().f13167g, null, true, true).m11987a();
    }

    public final void ac() {
        this.al = true;
        ag();
    }

    public final void m10218a(String str) {
        this.ah = str;
        ai();
        m10217a(null);
    }

    public final void ad() {
        if (this.aq != null) {
            switch (this.aq.f6948l) {
                case 2:
                    m6758b(2, 0);
                    return;
                case 3:
                    m6758b(3, 0);
                    return;
                case 5:
                    ak();
                    return;
                default:
                    return;
            }
        } else if (this.af == 10) {
            if (this.ak) {
                am();
            } else {
                ak();
            }
        } else if (this.af == 12) {
            this.an = true;
            am();
        } else {
            m6758b(3, 0);
        }
    }

    public final void ae() {
        if (this.f6948l == 1 && this.af == 15) {
            m6758b(1, 2);
        } else if (this.f6948l == 1 && this.af == 9) {
            ai();
            m6758b(1, 2);
        } else if (this.f6948l == 1 && this.af == 13) {
            m10211b(null);
        } else if (this.f6948l == 1 && this.af == 14) {
            m6758b(1, 3);
        } else {
            m6758b(3, 0);
        }
    }

    public final boolean af() {
        if (this.aq != null) {
            switch (this.aq.f6948l) {
                case 2:
                case 3:
                    return true;
            }
        }
        if (this.av == null || this.av.f6948l != 2) {
            return false;
        }
        return true;
    }

    public final void ag() {
        if (this.ar.f6948l == 2) {
            if (this.aj != null || !TextUtils.isEmpty(this.f9805d.f9289e) || this.f9805d.f9288d != 0) {
                if (this.aj == null) {
                    this.aj = this.ar.f9960b.m14640a(this.f9805d.f9289e, this.f9805d.f9288d);
                }
                int ai;
                if (!this.al && this.ar.f9960b.f14885a.f12098e == 1 && ab().size() > 0) {
                    ai = this.ar.f9960b.ai();
                    if (VERSION.SDK_INT <= 22 || ai <= 22) {
                        this.ay = this.ar.f9960b.f14885a.f12100g;
                        this.az = m592c((int) C7582R.string.needs_access_to);
                        this.aC = m592c((int) C7582R.string.accept);
                        m6758b(1, 7);
                        return;
                    }
                    m6758b(1, 8);
                } else if (C1473m.f7980a.mo2045Y().m11646a(this.f9805d.f9285a, C1473m.f7980a.ah().mo2811a(this.f9804c), this.f9805d.f9288d)) {
                    this.ak = true;
                    am();
                } else if (!this.aj.f11924n) {
                    ak();
                } else if (this.aq == null) {
                    String str;
                    int i;
                    if (this.aj != null) {
                        ai = this.aj.f11926p;
                    } else {
                        ai = this.f9805d.f9288d;
                    }
                    if (this.aj != null) {
                        str = this.aj.f11907B;
                    } else {
                        str = this.f9805d.f9289e;
                    }
                    Document document = this.ar.f9960b;
                    C2441n N = document.m14625N();
                    if (N != null) {
                        i = N.f13163c;
                    } else {
                        i = this.f9805d.f9291g;
                    }
                    C1799o a = PurchaseParams.m9747b().m9789a(this.f9805d).m9790a(document);
                    a.f9333d = ai;
                    a.f9334e = str;
                    this.f9805d = a.m9788a(i, this.f9805d.f9292h, this.f9805d.f9293i, this.f9805d.f9294j).m9786a();
                    this.aq = C1950i.m10379a(this.f9804c.name, this.f9805d);
                    this.f730B.mo284a().mo328a(this.aq, "PurchaseStateMachine.sidecar").mo334c();
                    this.aq.m6757a((C1087t) this);
                } else if (this.aq.f6948l == 0) {
                    this.aq.mo968W();
                }
            } else if (this.ao) {
                m6758b(3, 0);
            } else if (aa().isEmpty()) {
                this.ao = true;
                m10209a(m592c((int) C7582R.string.item_unavailable_message), null, m592c((int) C7582R.string.ok));
            } else {
                this.ay = m592c((int) C7582R.string.offer_resolution_dialog_title);
                m6758b(1, 6);
            }
        }
    }

    public final void m10217a(Boolean bool) {
        Map hashMap = new HashMap();
        C1791f.m9754a(m603h().getApplicationContext(), hashMap);
        hashMap.put("bppcc", m10204a(C2043f.m10743a(null)));
        this.aq.m10398a(this.ah, this.ai, this.aw, this.f9807f, bool, hashMap, this.f9803b);
    }

    private final void ah() {
        this.aC = null;
        m6758b(1, 1);
    }

    private final void m10211b(String str) {
        if (m10213X() > 0) {
            this.ay = m592c((int) C7582R.string.enter_pin_title);
            this.aA = str;
            this.aC = m592c(this.as.mo968W().m10005c());
            m6758b(1, 3);
        } else if (this.ap) {
            m6758b(3, 0);
        } else {
            this.ap = true;
            m6758b(1, 13);
        }
    }

    private final void m10210a(String str, String str2, String str3, int i) {
        this.ay = str;
        this.az = str2;
        this.aC = str3;
        this.aE = i;
        m6758b(1, 4);
    }

    private final void m10209a(String str, String str2, String str3) {
        m10210a(str, str2, str3, 770);
    }

    private final void ai() {
        this.f730B.mo284a().mo327a(this.au).mo334c();
        this.au = null;
    }

    private final void aj() {
        m mVar = this.aq.aq;
        if (mVar.l != null) {
            m10208a(mVar.l);
        } else if (mVar.m != null) {
            throw new UnsupportedOperationException("Family acquisition challenge not supported");
        } else if (mVar.c != null) {
            m10211b(null);
        } else if (mVar.h != null) {
            throw new UnsupportedOperationException("Purchase manager challenge not supported");
        } else {
            throw new IllegalStateException("Unknown challenge requested");
        }
    }

    private final void m10208a(ah ahVar) {
        this.ay = ahVar.b;
        this.az = ahVar.c;
        this.aC = ahVar.d;
        C1799o a = PurchaseParams.m9747b().m9789a(this.f9805d);
        a.f9344o = false;
        a.f9346q = ahVar.e;
        this.f9806e = a.m9786a();
        m6758b(1, 11);
    }

    private final void ak() {
        if (!al()) {
            if (this.aj.f11924n) {
                this.aq.m10393a(this.ax, m10204a(C2043f.m10743a(null)), this.f9803b);
                return;
            }
            if (this.av == null) {
                this.av = new C1959r();
                this.f730B.mo284a().mo328a(this.av, "PurchaseStateMachine.freePurchaseSidecar").mo334c();
            }
            this.av.m6757a((C1087t) this);
        }
    }

    private final boolean al() {
        boolean z = false;
        Document document = this.ar.f9960b;
        if (!this.am && document.f14885a.f12098e == 1) {
            C2441n N = document.m14625N();
            C2838a bW = C1473m.f7980a.bW();
            boolean a = bW.m14997a();
            boolean z2 = bW.m14996a(false) == 1;
            C2266a q = C1473m.f7980a.mo2258q();
            long j = q.f11252e;
            if (N != null && q.m11722d() && j > 0 && C2286c.m11778a(N) >= j && (!a || z2)) {
                String c;
                ay ayVar;
                j = q.f11253f;
                z2 = q.m11721c();
                if (C1473m.f7980a.mo2223d().m8962c(this.ar.f9960b) < j) {
                    z = true;
                }
                this.ay = m592c((int) C7582R.string.use_wifi_title);
                if (z) {
                    c = m592c((int) C7582R.string.use_wifi_warning);
                    ayVar = this;
                } else if (z2) {
                    c = m592c((int) C7582R.string.use_wifi_limit_on_mobile);
                    ayVar = this;
                } else {
                    c = m592c((int) C7582R.string.use_wifi_limit_on_wifi);
                    ayVar = this;
                }
                ayVar.az = c;
                this.aB = z ? m592c((int) C7582R.string.use_wifi_checkbox) : null;
                this.aC = m592c((int) C7582R.string.use_wifi_proceed_button);
                m6758b(1, 10);
                return true;
            }
        }
        return false;
    }

    private final void am() {
        Document document = this.ar.f9960b;
        if (document.f14885a.f12098e != 1) {
            m6758b(3, 0);
        }
        if (!al()) {
            if (this.an) {
                C1473m.f7980a.bu().m15637b(document);
                C1473m.f7980a.mo2029I().f18022b.mo2671b(document.f14885a.f12097d, null);
                C2495w a = this.f9803b.m13375a("single_install");
                if (C1473m.f7980a.dj().mo2294a(12623705)) {
                    C1473m.f7980a.bw().m16744a(new C3366j(a, document).m16815b(this.f9804c.name).m16810a("single_install").m16806a());
                } else {
                    C3300k o = C1473m.f7980a.mo2256o();
                    o.mo3439a(document.m14625N().f13171k, document.bV());
                    o.mo3432a(document.m14625N().f13171k, document.m14625N().f13163c, this.f9804c.name, document.f14885a.f12100g, 2, document.m14671z(), a);
                }
                m6758b(2, 0);
                return;
            }
            this.az = m572a((int) C7582R.string.confirm_install_app, document.f14885a.f12100g);
            this.aC = m592c((int) C7582R.string.ok);
            m6758b(1, 12);
        }
    }

    private final void an() {
        String c;
        String c2;
        String c3;
        CheckoutPurchaseError checkoutPurchaseError = this.aq.as;
        if (checkoutPurchaseError == null || TextUtils.isEmpty(checkoutPurchaseError.f9627b)) {
            c = m592c((int) C7582R.string.error);
        } else {
            c = checkoutPurchaseError.f9627b;
        }
        if (checkoutPurchaseError == null || TextUtils.isEmpty(checkoutPurchaseError.f9628c)) {
            c2 = m592c((int) C7582R.string.generic_purchase_prepare_error);
        } else {
            c2 = checkoutPurchaseError.f9628c;
        }
        if (checkoutPurchaseError == null || TextUtils.isEmpty(checkoutPurchaseError.f9629d)) {
            c3 = m592c((int) C7582R.string.ok);
        } else {
            c3 = checkoutPurchaseError.f9629d;
        }
        m10209a(c, c2, c3);
        switch (this.aq.af) {
            case 3:
                this.aD = new PurchaseError(2, 0);
                return;
            case 5:
                this.ax.clear();
                this.aD = new PurchaseError(3, this.aq.as.f9626a);
                return;
            default:
                FinskyLog.m21669e("Unexpected substate: %d", Integer.valueOf(this.aq.af));
                this.aD = new PurchaseError(3, 0);
                return;
        }
    }

    private final void m10206a(C1957p c1957p) {
        switch (c1957p.f6948l) {
            case 0:
                String str = this.f9804c.name;
                String str2 = this.f9805d.f9286b;
                c1957p.m6758b(1, 0);
                c1957p.f9959a = new C2719i(C1473m.f7980a.mo2112b(str), C1289l.m7694a(str2));
                c1957p.f9959a.m11918a((C1031w) c1957p);
                c1957p.f9959a.m11917a((C0657w) c1957p);
                return;
            case 2:
                ag();
                return;
            case 3:
                m10209a(m592c((int) C7582R.string.error), m592c((int) C7582R.string.server_error), m592c((int) C7582R.string.ok));
                return;
            default:
                return;
        }
    }

    private final void m10205a(C1880f c1880f) {
        switch (c1880f.f6948l) {
            case 2:
                int a = this.as.mo968W().m10001a();
                this.aq.m10391a(a);
                this.ax.putString("pcam", String.valueOf(a));
                ak();
                return;
            case 3:
                m10211b(c1880f.f9608f);
                return;
            default:
                return;
        }
    }

    private final void m10207a(C1959r c1959r) {
        switch (c1959r.f6948l) {
            case 0:
                Account account = this.f9804c;
                Document document = this.ar.f9960b;
                C2495w c2495w = this.f9803b;
                c1959r.m6758b(1, 0);
                ar.m10197a(account, document, c1959r, false, true, true, c2495w);
                return;
            case 1:
                ah();
                return;
            case 2:
                am();
                return;
            case 3:
                m6758b(3, 0);
                return;
            default:
                return;
        }
    }

    public final void mo1423a(C1089s c1089s) {
        if (c1089s instanceof C1950i) {
            switch (((C1950i) c1089s).f6948l) {
                case 0:
                    ag();
                    return;
                case 1:
                    ah();
                    return;
                case 2:
                    k kVar = this.aq.an;
                    if (kVar.c != null) {
                        m10210a(kVar.c.b, null, null, 775);
                        new Handler().postDelayed(new az(this), (long) kVar.c.c);
                        return;
                    } else if (kVar.d != null) {
                        m10210a(kVar.d.b, null, kVar.d.c, 775);
                        return;
                    } else if (kVar.e != null) {
                        m10210a(kVar.e.b, kVar.e.c, kVar.e.e, 775);
                        return;
                    } else {
                        m6758b(2, 0);
                        return;
                    }
                case 3:
                    an();
                    return;
                case 5:
                    m6758b(1, 2);
                    return;
                case 6:
                    m mVar = this.aq.ap;
                    if (mVar.l != null) {
                        m10208a(mVar.l);
                        return;
                    } else if (mVar.g != null) {
                        throw new UnsupportedOperationException("Acknowledge challenge not supported");
                    } else if (mVar.j != null) {
                        throw new UnsupportedOperationException("Billing profile challenge not supported");
                    } else if (mVar.f != null) {
                        throw new UnsupportedOperationException("Payments update challenge not supported");
                    } else if (mVar.b != null) {
                        throw new UnsupportedOperationException("Address challenge not supported");
                    } else {
                        throw new IllegalStateException("Unknown challenge requested");
                    }
                case 7:
                    if (this.as.f6948l == 2) {
                        aj();
                        return;
                    }
                    return;
                case 13:
                    m10217a(null);
                    return;
                default:
                    FinskyLog.m21669e("Unexpected state: %d", Integer.valueOf(this.aq.f6948l));
                    an();
                    return;
            }
        } else if (c1089s instanceof C1957p) {
            m10206a((C1957p) c1089s);
        } else if (c1089s instanceof C1903a) {
            C1903a c1903a = (C1903a) c1089s;
            switch (c1903a.f6948l) {
                case 0:
                    Account account = this.f9804c;
                    boolean z = this.f9805d.f9299o;
                    C2495w c2495w = this.f9803b;
                    c1903a.m6758b(1, 0);
                    new C1874a(account, c2495w).m10012a(c1903a, z);
                    return;
                case 2:
                    ab abVar = this.f730B;
                    this.at = (C1880f) abVar.mo283a("PurchaseStateMachine.authChallengeSidecar");
                    if (this.at == null) {
                        this.at = C1880f.m10016a(this.f9804c.name, c1903a.mo968W());
                        abVar.mo284a().mo328a(this.at, "PurchaseStateMachine.authChallengeSidecar").mo334c();
                        this.at.m6757a((C1087t) this);
                    }
                    if (this.aq != null && this.aq.f6948l == 7) {
                        aj();
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else if (c1089s instanceof C1880f) {
            m10205a((C1880f) c1089s);
        } else if (c1089s instanceof C2056m) {
            C2056m c2056m = (C2056m) c1089s;
            switch (c2056m.f6948l) {
                case 0:
                    c2056m.m10816a(m10204a(C2043f.m10743a(null)), null, 0, this.f9803b);
                    return;
                case 1:
                    ah();
                    return;
                case 2:
                    m6758b(1, 9);
                    return;
                case 3:
                    String str;
                    switch (c2056m.af) {
                        case 1:
                            str = c2056m.am;
                            break;
                        case 2:
                            str = C1290m.m7702a(m603h(), c2056m.an);
                            break;
                        default:
                            str = m592c((int) C7582R.string.error);
                            break;
                    }
                    String c = m592c((int) C7582R.string.ok);
                    this.az = str;
                    this.aC = c;
                    this.aE = 770;
                    m6758b(1, 5);
                    return;
                case 4:
                    m10218a(c2056m.aq);
                    return;
                case 5:
                    return;
                default:
                    return;
            }
        } else if (c1089s instanceof C1959r) {
            m10207a((C1959r) c1089s);
        }
    }
}
