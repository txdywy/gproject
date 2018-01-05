package com.google.android.finsky.billing.lightpurchase;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.Base64;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1253j;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.VoucherParams;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.iab.C1867w;
import com.google.android.finsky.dx.C2910a;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.installqueue.C3366j;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.aa;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.bb;
import com.google.android.wallet.common.pub.SecurePaymentsPayload;
import com.google.android.wallet.common.pub.g;
import com.google.android.wallet.common.util.a;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.a.a.a.a.ci;
import com.google.wireless.android.finsky.a.a.m;
import com.google.wireless.android.finsky.dfe.c.a.al;
import com.google.wireless.android.finsky.dfe.c.a.dq;
import com.google.wireless.android.finsky.dfe.nano.eq;
import com.google.wireless.android.finsky.dfe.nano.er;
import com.google.wireless.android.finsky.dfe.nano.fa;
import com.google.wireless.android.finsky.dfe.nano.fb;
import com.google.wireless.android.finsky.dfe.nano.ff;
import com.google.wireless.android.finsky.dfe.nano.k;
import java.util.HashMap;
import java.util.Map;

public final class C1950i extends C1089s {
    public C1867w f9938a = C1473m.f7980a.aE();
    public eq ah;
    public boolean ai;
    public PurchaseFlowConfig aj;
    public long ak;
    public C1253j al;
    public Bundle am;
    public k an;
    public ff ao;
    public m ap;
    public m aq;
    public VolleyError ar;
    public CheckoutPurchaseError as;
    public String at;
    public C1962u au;
    public AsyncTask av;
    public GiftEmailParams aw;
    public C1254c f9939b;
    public long f9940c;
    public C1253j f9941d;
    public PurchaseParams f9942e;
    public al f9943f;
    public er f9944g;

    public static C1950i m10379a(String str, PurchaseParams purchaseParams) {
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        bundle.putParcelable("CheckoutPurchaseSidecar.purchaseParams", purchaseParams);
        Fragment c1950i = new C1950i();
        c1950i.m600f(bundle);
        return c1950i;
    }

    public C1950i() {
        C1473m.f7980a.au();
        this.f740L = true;
    }

    public final void mo136b(Bundle bundle) {
        this.f9939b = C1473m.f7980a.mo2112b(this.f760q.getString("authAccount"));
        this.f9942e = (PurchaseParams) this.f760q.getParcelable("CheckoutPurchaseSidecar.purchaseParams");
        super.mo136b(bundle);
    }

    public final void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        bundle.putParcelable("CheckoutPurchaseSidecar.authenticationInfo", ParcelableProto.m21671a(this.f9943f));
        bundle.putParcelable("CheckoutPurchaseSidecar.cart", ParcelableProto.m21671a(this.f9944g));
        bundle.putParcelable("CheckoutPurchaseSidecar.changeSubscription", ParcelableProto.m21671a(this.ah));
        bundle.putParcelable("CheckoutPurchaseSidecar.prepareChallenge", ParcelableProto.m21671a(this.ap));
        bundle.putParcelable("CheckoutPurchaseSidecar.completeChallenge", ParcelableProto.m21671a(this.aq));
        bundle.putBundle("CheckoutPurchaseSidecar.extraPurchaseData", this.am);
        bundle.putParcelable("CheckoutPurchaseSidecar.post_acquisition_prompt", ParcelableProto.m21671a(this.an));
        bundle.putParcelable("CheckoutPurchaseSidecar.checkoutPurchaseError", this.as);
        bundle.putParcelable("CheckoutPurchaseSidecar.giftEmailParams", this.aw);
        bundle.putBoolean("CheckoutPurchaseSidecar.isNewPayingUser", this.ai);
        bundle.putParcelable("CheckoutPurchaseSidecar.purchaseFlowConfig", this.aj);
    }

    protected final void mo2462a(Bundle bundle) {
        super.mo2462a(bundle);
        this.f9943f = (al) ParcelableProto.m21673a(bundle, "CheckoutPurchaseSidecar.authenticationInfo");
        this.f9944g = (er) ParcelableProto.m21673a(bundle, "CheckoutPurchaseSidecar.cart");
        this.ah = (eq) ParcelableProto.m21673a(bundle, "CheckoutPurchaseSidecar.changeSubscription");
        this.ap = (m) ParcelableProto.m21673a(bundle, "CheckoutPurchaseSidecar.prepareChallenge");
        this.aq = (m) ParcelableProto.m21673a(bundle, "CheckoutPurchaseSidecar.completeChallenge");
        this.am = bundle.getBundle("CheckoutPurchaseSidecar.extraPurchaseData");
        this.an = (k) ParcelableProto.m21673a(bundle, "CheckoutPurchaseSidecar.post_acquisition_prompt");
        this.as = (CheckoutPurchaseError) bundle.getParcelable("CheckoutPurchaseSidecar.checkoutPurchaseError");
        this.aw = (GiftEmailParams) bundle.getParcelable("CheckoutPurchaseSidecar.giftEmailParams");
        this.ai = bundle.getBoolean("CheckoutPurchaseSidecar.isNewPayingUser");
        this.aj = (PurchaseFlowConfig) bundle.getParcelable("CheckoutPurchaseSidecar.purchaseFlowConfig");
    }

    public final void mo968W() {
        if (this.f9942e.f9296l == 1) {
            m6758b(14, 0);
        } else {
            m6758b(13, 0);
        }
    }

    public final void m10398a(String str, VoucherParams voucherParams, Bundle bundle, al alVar, Boolean bool, Map map, C2495w c2495w) {
        this.f9943f = alVar;
        m10381a(c2495w, 302);
        Map m = C1950i.m10386m(bundle);
        m.putAll(map);
        this.f9940c = SystemClock.elapsedRealtime();
        if (bool != null) {
            m.put("st", bool.toString());
        }
        if (this.ai) {
            m.put("naf", Boolean.TRUE.toString());
        }
        m10383a(m);
        CharSequence a = a.a(m603h());
        if (!TextUtils.isEmpty(a)) {
            m.put("capn", a);
        }
        this.f9941d = this.f9939b.mo1613a(this.f9942e.f9286b, this.f9942e.f9285a, this.f9942e.f9288d, this.f9942e.f9289e, this.f9942e.f9298n, this.f9943f, str, this.f9942e.f9296l, voucherParams, this.f9942e.f9291g, this.f9942e.f9294j, m, new C1956o(this, c2495w), new C1955n(this, c2495w));
        m6758b(1, 1);
        this.ak = 0;
        this.al = null;
    }

    public final void m10393a(Bundle bundle, String str, C2495w c2495w) {
        if (this.f9944g.s == null || !bundle.keySet().isEmpty()) {
            boolean z;
            C0757i dqVar;
            String str2;
            m10381a(c2495w, 304);
            this.ak = SystemClock.elapsedRealtime();
            Map m = C1950i.m10386m(bundle);
            m.put("bppcc", str);
            SecurePaymentsPayload securePaymentsPayload = (SecurePaymentsPayload) bundle.getParcelable("extra_secure_payments_payload");
            if (securePaymentsPayload != null) {
                m.put("pmcot", Base64.encodeToString(securePaymentsPayload.a, 10));
                g[] gVarArr = securePaymentsPayload.b;
                if (gVarArr.length > 0) {
                    for (g gVar : gVarArr) {
                        m.put(String.format("s7e_21_%s", new Object[]{Integer.valueOf(gVar.a)}), gVarArr[r0].b);
                    }
                    z = true;
                    if (this.aw != null) {
                        dqVar = new dq();
                        str2 = this.aw.f9634b;
                        if (str2 != null) {
                            throw new NullPointerException();
                        }
                        dqVar.a |= 2;
                        dqVar.c = str2;
                        str2 = this.aw.f9633a;
                        if (str2 != null) {
                            throw new NullPointerException();
                        }
                        dqVar.a |= 1;
                        dqVar.b = str2;
                        if (!TextUtils.isEmpty(this.aw.f9635c)) {
                            str2 = this.aw.f9635c;
                            if (str2 != null) {
                                throw new NullPointerException();
                            }
                            dqVar.a |= 4;
                            dqVar.d = str2;
                        }
                        m.put("gdi", Base64.encodeToString(dq.a(dqVar), 10));
                    }
                    m10383a(m);
                    if (this.av != null) {
                        this.av.cancel(true);
                        this.av = null;
                    }
                    if (!TextUtils.isEmpty(this.at)) {
                        FinskyLog.m21659a("Scion payload added", new Object[0]);
                        m.put("iapsp", this.at);
                    }
                    this.al = this.f9939b.mo1615a(this.f9944g.k, m, this.f9943f, z, C2910a.m15178d(this.f9939b.mo1636c()), new C1953l(this, c2495w), new C1954m(this, c2495w));
                    m6758b(1, 2);
                    return;
                }
            }
            z = false;
            if (this.aw != null) {
                dqVar = new dq();
                str2 = this.aw.f9634b;
                if (str2 != null) {
                    dqVar.a |= 2;
                    dqVar.c = str2;
                    str2 = this.aw.f9633a;
                    if (str2 != null) {
                        dqVar.a |= 1;
                        dqVar.b = str2;
                        if (TextUtils.isEmpty(this.aw.f9635c)) {
                            str2 = this.aw.f9635c;
                            if (str2 != null) {
                                dqVar.a |= 4;
                                dqVar.d = str2;
                            } else {
                                throw new NullPointerException();
                            }
                        }
                        m.put("gdi", Base64.encodeToString(dq.a(dqVar), 10));
                    } else {
                        throw new NullPointerException();
                    }
                }
                throw new NullPointerException();
            }
            m10383a(m);
            if (this.av != null) {
                this.av.cancel(true);
                this.av = null;
            }
            if (TextUtils.isEmpty(this.at)) {
                FinskyLog.m21659a("Scion payload added", new Object[0]);
                m.put("iapsp", this.at);
            }
            this.al = this.f9939b.mo1615a(this.f9944g.k, m, this.f9943f, z, C2910a.m15178d(this.f9939b.mo1636c()), new C1953l(this, c2495w), new C1954m(this, c2495w));
            m6758b(1, 2);
            return;
        }
        this.aq = this.f9944g.s;
        m6758b(7, 0);
    }

    public final void m10395a(C2495w c2495w) {
        if (this.f9942e.f9299o || !C1473m.f7980a.mo2249j(this.f9939b.mo1636c()).mo2294a(12633090)) {
            if (!(this.f9942e.f9287c == null || this.f9942e.f9287c.m14625N() == null || !this.f9942e.f9287c.m14625N().ax_())) {
                C1473m.f7980a.bu().m15638b(this.f9942e.f9286b, this.f9942e.f9287c.m14625N().f13183w);
            }
            C1473m.f7980a.mo2169c().mo2671b(this.f9942e.f9286b, this.f9942e.f9293i);
            C2495w a = c2495w.m13375a("single_install");
            if (C1473m.f7980a.dj().mo2294a(12623705)) {
                if (this.f9942e.f9287c != null) {
                    C1473m.f7980a.bw().m16744a(new C3366j(a, this.f9942e.f9287c).m16810a("single_install").m16815b(this.f9939b.mo1636c()).m16806a());
                    return;
                }
                FinskyLog.m21669e("PurchaseParams.document is null for docId %s", this.f9942e.f9285a);
            } else if (this.f9942e.f9287c != null) {
                C3300k o = C1473m.f7980a.mo2256o();
                o.mo3439a(this.f9942e.f9287c.m14625N().f13171k, this.f9942e.f9287c.bV());
                o.mo3432a(this.f9942e.f9287c.m14625N().f13171k, this.f9942e.f9287c.m14625N().f13163c, this.f9939b.mo1620b().name, this.f9942e.f9287c.f14885a.f12100g, 2, this.f9942e.f9287c.m14671z(), a);
            } else {
                FinskyLog.m21665c("Request an installation with a document: docId %s", this.f9942e.f9286b);
                C1473m.f7980a.mo2256o().mo3432a(this.f9942e.f9286b, this.f9942e.f9291g, this.f9939b.mo1636c(), this.f9944g.b, 2, null, a);
            }
        }
    }

    private final void m10381a(C2495w c2495w, int i) {
        c2495w.m13371a(m10384b(i).f13342a, null);
    }

    final void m10396a(C2495w c2495w, int i, int i2, long j, long j2, byte[] bArr) {
        c2495w.m13371a(m10384b(i).m13210a(i2).m13212a(j).m13242b(j2).m13240a(bArr).f13342a, null);
    }

    private final void m10382a(C2495w c2495w, int i, VolleyError volleyError, long j, long j2) {
        c2495w.m13371a(m10384b(i).m13238a((Throwable) volleyError).m13212a(j).m13242b(j2).f13342a, null);
    }

    private final C2474c m10384b(int i) {
        ci ciVar = null;
        if (!(this.f9944g == null || this.f9944g.x == null)) {
            ciVar = new ci();
            boolean z = this.f9944g.x.c;
            ciVar.a |= 4;
            ciVar.e = z;
        }
        if (this.f9942e.f9299o) {
            aa.m13186a().m13190d();
        }
        C2474c b = new C2474c(i).m13236a(this.f9942e.f9286b).m13213a(this.f9942e.f9285a).m13241b(this.f9942e.f9288d);
        b.f13342a.f31681G = ciVar;
        return b;
    }

    private final void m10383a(Map map) {
        if (this.f9942e.f9299o) {
            map.put("psim", Integer.toString(1));
        }
        if (this.f9942e.f9304t != 0) {
            map.put("pscoc", Integer.toString(this.f9942e.f9304t));
        }
    }

    public final void m10394a(GiftEmailParams giftEmailParams) {
        if (this.aw == null) {
            this.aw = giftEmailParams;
            m6758b(13, 0);
            return;
        }
        m6758b(14, 0);
        this.aw = null;
    }

    public final void m10391a(int i) {
        al alVar = this.f9943f;
        alVar.e = i;
        alVar.a |= 8;
    }

    final long m10388X() {
        if (this.f9940c > 0) {
            return SystemClock.elapsedRealtime() - this.f9940c;
        }
        FinskyLog.m21669e("Prepare not started.", new Object[0]);
        return 0;
    }

    final long m10389Y() {
        if (this.f9941d != null) {
            return this.f9941d.mo1542b();
        }
        FinskyLog.m21669e("Unexpected null prepare request.", new Object[0]);
        return -1;
    }

    final long m10390Z() {
        if (this.ak > 0) {
            return SystemClock.elapsedRealtime() - this.ak;
        }
        FinskyLog.m21669e("Complete not started", new Object[0]);
        return -1;
    }

    final long aa() {
        if (this.al != null) {
            return this.al.mo1542b();
        }
        FinskyLog.m21669e("Unexpected null complete request", new Object[0]);
        return -1;
    }

    public final String ab() {
        boolean z = false;
        Object obj = null;
        if (this.as != null) {
            obj = this.as.f9630e;
        }
        if (TextUtils.isEmpty(obj) && this.f9944g != null) {
            obj = this.f9944g.k;
        }
        if (this.ap == null || this.ap.j == null) {
            boolean z2 = false;
        } else {
            int i = 1;
        }
        if (i == 0 && TextUtils.isEmpty(obj)) {
            String str = "Unexpected empty purchaseContextToken: %b %b";
            Object[] objArr = new Object[2];
            if (this.f9944g == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            objArr[0] = Boolean.valueOf(z2);
            if (this.as == null) {
                z = true;
            }
            objArr[1] = Boolean.valueOf(z);
            FinskyLog.m21669e(str, objArr);
        }
        return obj;
    }

    public final void m10397a(fa faVar, C2495w c2495w) {
        this.ap = null;
        this.f9944g = null;
        this.ah = null;
        this.as = null;
        fb fbVar = faVar.b;
        m10396a(c2495w, 303, fbVar.b, m10389Y(), m10388X(), faVar.g);
        if (fbVar.b == 2 && faVar.c.j != null) {
            String str = faVar.c.j.c ? "usecart" : "skipcart";
            c2495w.m13367a(new C2474c(343).m13248d(1).m13244b(str));
            c2495w.m13367a(new C2474c(344).m13248d(1).m13244b(str).m13239a(true));
        }
        if (faVar.h == null || faVar.h.length == 0) {
            this.aj = PurchaseFlowConfig.f9283a;
        } else {
            this.aj = new PurchaseFlowConfig(faVar.h);
        }
        if (!this.ai) {
            this.ai = faVar.j;
        }
        switch (fbVar.b) {
            case 0:
                int i;
                this.f9944g = faVar.d;
                this.ah = faVar.e;
                m10385b(c2495w);
                if (this.ah == null) {
                    i = 5;
                } else {
                    i = 4;
                }
                m6758b(i, 0);
                return;
            case 2:
                this.ap = faVar.c;
                this.f9944g = faVar.d;
                if (this.f9944g != null) {
                    m10385b(c2495w);
                }
                m6758b(6, 0);
                return;
            case 3:
                if (TextUtils.isEmpty(fbVar.f)) {
                    this.as = new CheckoutPurchaseError(fbVar.d, fbVar.c);
                } else {
                    this.as = new CheckoutPurchaseError(fbVar.d, fbVar.e, fbVar.c, fbVar.f, fbVar.g);
                }
                m6758b(3, 5);
                return;
            default:
                FinskyLog.m21669e("Unknown status returned from server: %d", Integer.valueOf(fbVar.b));
                this.as = new CheckoutPurchaseError();
                m6758b(3, 5);
                return;
        }
    }

    private final void m10385b(C2495w c2495w) {
        if (TextUtils.isEmpty(this.at) && this.f9942e.f9298n != null && C1473m.f7980a.dj().mo2294a(12607839)) {
            if (this.av != null) {
                this.av.cancel(true);
                this.av = null;
            }
            this.av = new C1951j(this, c2495w);
            bb.m21792a(this.av, new Void[0]);
        }
    }

    public final PurchaseFlowConfig ac() {
        if (this.aj != null) {
            return this.aj;
        }
        FinskyLog.m21669e("The purchase flow configuration is accessed before it's ready.", new Object[0]);
        return PurchaseFlowConfig.f9283a;
    }

    private static Map m10386m(Bundle bundle) {
        Map hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            if (!"extra_secure_payments_payload".equals(str)) {
                hashMap.put(str, bundle.getString(str));
            }
        }
        return hashMap;
    }
}
