package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.Base64;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.VoucherParams;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.j;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.billing.iab.w;
import com.google.android.finsky.bn.b;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.d.aa;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dx.a;
import com.google.android.finsky.f.c;
import com.google.android.finsky.installer.k;
import com.google.android.finsky.installqueue.g;
import com.google.android.finsky.installqueue.j;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.bb;
import com.google.android.wallet.common.pub.SecurePaymentsPayload;
import com.google.android.wallet.common.pub.g;
import com.google.android.wallet.common.util.a;
import com.google.wireless.android.a.a.a.a.bo;
import com.google.wireless.android.a.a.a.a.ci;
import com.google.wireless.android.finsky.a.a.l;
import com.google.wireless.android.finsky.a.a.m;
import com.google.wireless.android.finsky.dfe.c.a.al;
import com.google.wireless.android.finsky.dfe.c.a.dq;
import com.google.wireless.android.finsky.dfe.nano.eq;
import com.google.wireless.android.finsky.dfe.nano.er;
import com.google.wireless.android.finsky.dfe.nano.fa;
import com.google.wireless.android.finsky.dfe.nano.fb;
import com.google.wireless.android.finsky.dfe.nano.fd;
import com.google.wireless.android.finsky.dfe.nano.ff;
import com.google.wireless.android.finsky.dfe.nano.k;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class com.google.android.finsky.billing.lightpurchase.i extends com.google.android.finsky.billing.common.s
{

    public com.google.android.finsky.billing.iab.w a;
    public com.google.wireless.android.finsky.dfe.nano.eq ah;
    public boolean ai;
    public PurchaseFlowConfig aj;
    public long ak;
    public com.google.android.finsky.api.j al;
    public Bundle am;
    public com.google.wireless.android.finsky.dfe.nano.k an;
    public com.google.wireless.android.finsky.dfe.nano.ff ao;
    public com.google.wireless.android.finsky.a.a.m ap;
    public com.google.wireless.android.finsky.a.a.m aq;
    public VolleyError ar;
    public CheckoutPurchaseError as;
    public String at;
    public com.google.android.finsky.billing.lightpurchase.u au;
    public AsyncTask av;
    public GiftEmailParams aw;
    public com.google.android.finsky.api.c b;
    public long c;
    public com.google.android.finsky.api.j d;
    public PurchaseParams e;
    public com.google.wireless.android.finsky.dfe.c.a.al f;
    public com.google.wireless.android.finsky.dfe.nano.er g;

    i() {
        com.google.android.finsky.billing.common.s();
        this.a = com.google.android.finsky.m.a.aE();
        com.google.android.finsky.m.a.au();
        this.L = 1;
    }

    public static com.google.android.finsky.billing.lightpurchase.i a(String p0, PurchaseParams p1) {
        v0 = new Bundle();
        v0.putString("authAccount", p0);
        v0.putParcelable("CheckoutPurchaseSidecar.purchaseParams", p1);
        v1 = new com.google.android.finsky.billing.lightpurchase.i();
        v1.f(v0);
        return v1;
    }

    static void a(com.google.android.finsky.billing.lightpurchase.i p0, com.google.android.finsky.d.w p1, int p2, VolleyError p3, long p4, long p6) {
        p0.a(p1, p2, p3, p4, p6);
    }

    private final void a(com.google.android.finsky.d.w p0, int p1) {
        p0.a(this.b(p1).a, 0);
    }

    private final void a(com.google.android.finsky.d.w p0, int p1, VolleyError p2, long p3, long p5) {
        p0.a(this.b(p1).a(p2).a(p3).b(p5).a, 0);
    }

    private final void a(Map p0) {
        if (this.e.o != 0)
            p0.put("psim", Integer.toString(1));
        if (this.e.t != 0)
            p0.put("pscoc", Integer.toString(this.e.t));
    }

    private final com.google.android.finsky.d.c b(int p0) {
        v0 = 0;
        if (this.g != 0 && this.g.x != 0) {
            v0 = new com.google.wireless.android.a.a.a.a.ci();
            v0.a = v0.a | 4;
            v0.e = this.g.x.c;
        }
        if (this.e.o != 0)
            com.google.android.finsky.d.aa.a().d();
        v1 = new com.google.android.finsky.d.c(p0).a(this.e.b).a(this.e.a).b(this.e.d);
        v1.a.G = v0;
        return v1;
    }

    private final void b(com.google.android.finsky.d.w p0) {
        if (TextUtils.isEmpty(this.at) && this.e.n != 0 && com.google.android.finsky.m.a.dj().a(12607839)) {
            if (this.av != 0) {
                this.av.cancel(1);
                this.av = 0;
            }
            this.av = new com.google.android.finsky.billing.lightpurchase.j(this, p0);
            com.google.android.finsky.utils.bb.a(this.av, new Void[0]);
        }
    }

    private static Map m(Bundle p0) {
        v1 = new HashMap();
        v2 = p0.keySet().iterator();
        while (v2.hasNext()) {
            v0 = (String)v2.next();
            if ("extra_secure_payments_payload".equals(v0))
                continue;
            v1.put(v0, p0.getString(v0));
        }
        return v1;
    }

    public final void W() {
        if (this.e.l == 1)
            this.b(14, 0);
        else
            this.b(13, 0);
    }

    final long X() {
        v0 = 0;
        if (this.c <= 0)
            FinskyLog.e("Prepare not started.", new Object[0]);
        else
            v0 = SystemClock.elapsedRealtime() - this.c;
        return v0;
    }

    final long Y() {
        if (this.d == 0) {
            FinskyLog.e("Unexpected null prepare request.", new Object[0]);
            v0 = -1;
        }
        else
            v0 = this.d.b();
        return v0;
    }

    final long Z() {
        if (this.ak <= 0) {
            FinskyLog.e("Complete not started", new Object[0]);
            v0 = -1;
        }
        else
            v0 = SystemClock.elapsedRealtime() - this.ak;
        return v0;
    }

    public final void a(int p0) {
        this.f.e = p0;
        this.f.a = this.f.a | 8;
    }

    protected final void a(Bundle p0) {
        super.a(p0);
        this.f = (com.google.wireless.android.finsky.dfe.c.a.al)ParcelableProto.a(p0, "CheckoutPurchaseSidecar.authenticationInfo");
        this.g = (com.google.wireless.android.finsky.dfe.nano.er)ParcelableProto.a(p0, "CheckoutPurchaseSidecar.cart");
        this.ah = (com.google.wireless.android.finsky.dfe.nano.eq)ParcelableProto.a(p0, "CheckoutPurchaseSidecar.changeSubscription");
        this.ap = (com.google.wireless.android.finsky.a.a.m)ParcelableProto.a(p0, "CheckoutPurchaseSidecar.prepareChallenge");
        this.aq = (com.google.wireless.android.finsky.a.a.m)ParcelableProto.a(p0, "CheckoutPurchaseSidecar.completeChallenge");
        this.am = p0.getBundle("CheckoutPurchaseSidecar.extraPurchaseData");
        this.an = (com.google.wireless.android.finsky.dfe.nano.k)ParcelableProto.a(p0, "CheckoutPurchaseSidecar.post_acquisition_prompt");
        this.as = (CheckoutPurchaseError)p0.getParcelable("CheckoutPurchaseSidecar.checkoutPurchaseError");
        this.aw = (GiftEmailParams)p0.getParcelable("CheckoutPurchaseSidecar.giftEmailParams");
        this.ai = p0.getBoolean("CheckoutPurchaseSidecar.isNewPayingUser");
        this.aj = (PurchaseFlowConfig)p0.getParcelable("CheckoutPurchaseSidecar.purchaseFlowConfig");
    }

    public final void a(Bundle p0, String p1, com.google.android.finsky.d.w p2) {
  8:    if (this.g.s != 0 && p0.keySet().isEmpty()) {
 24:        this.aq = this.g.s;
 27:        this.b(7, 0);
 30:        return;
        }
 33:    this.a(p2, 304);
 40:    this.ak = SystemClock.elapsedRealtime();
 42:    v2 = com.google.android.finsky.billing.lightpurchase.i.m(p0);
 48:    v2.put("bppcc", p1);
 57:    v0 = (SecurePaymentsPayload)p0.getParcelable("extra_secure_payments_payload");
 59:    if (v0 == 0) goto 277;
 69:    v2.put("pmcot", Base64.encodeToString(v0.a, 10));
 72:    v3 = v0.b;
 75:    if (v3.length <= 0) goto 277;
 78:    v0 = 0;
 79:    while (v0 < v3.length) {
 85:        v7 = new Object[1];
 93:        v7[0] = Integer.valueOf(v3[v0].a);
101:        v2.put(String.format("s7e_21_%s", v7), v3[v0].b);
104:        v0 = v0 + 1;
        }
107:    v4 = 1;
110:    if (this.aw != 0) {
114:        v0 = new com.google.wireless.android.finsky.dfe.c.a.dq();
121:        if (this.aw.b == 0)
128:            throw new NullPointerException();
133:        v0.a = v0.a | 2;
135:        v0.c = this.aw.b;
141:        if (this.aw.a == 0)
148:            throw new NullPointerException();
153:        v0.a = v0.a | 1;
155:        v0.b = this.aw.a;
165:        if (!TextUtils.isEmpty(this.aw.c)) {
171:            if (this.aw.c == 0)
178:                throw new NullPointerException();
183:            v0.a = v0.a | 4;
185:            v0.d = this.aw.c;
            }
197:        v2.put("gdi", Base64.encodeToString(com.google.wireless.android.finsky.dfe.c.a.dq.a(v0), 10));
        }
200:    this.a(v2);
205:    if (this.av != 0) {
209:        this.av.cancel(1);
213:        this.av = 0;
        }
221:    if (!TextUtils.isEmpty(this.at)) {
227:        FinskyLog.a("Scion payload added", new Object[0]);
234:        v2.put("iapsp", this.at);
        }
269:    this.al = this.b.a(this.g.k, v2, this.f, v4, com.google.android.finsky.dx.a.d(this.b.c()), new com.google.android.finsky.billing.lightpurchase.l(this, p2), new com.google.android.finsky.billing.lightpurchase.m(this, p2));
272:    this.b(1, 2);
275:    return;
277:    v4 = 0;
278:    goto 108;
    }

    public final void a(GiftEmailParams p0) {
        if (this.aw == 0) {
            this.aw = p0;
            this.b(13, 0);
        }
        else {
            this.b(14, 0);
            this.aw = 0;
        }
    }

    public final void a(com.google.android.finsky.d.w p0) {
        if (this.e.o != 0 || !com.google.android.finsky.m.a.j(this.b.c()).a(12633090)) {
            if (this.e.c != 0 && this.e.c.N() != 0 && this.e.c.N().ax_())
                com.google.android.finsky.m.a.bu().b(this.e.b, this.e.c.N().w);
            com.google.android.finsky.m.a.c().b(this.e.b, this.e.i);
            v7 = p0.a("single_install");
            if (com.google.android.finsky.m.a.dj().a(12623705)) {
                if (this.e.c != 0)
                    com.google.android.finsky.m.a.bw().a(new com.google.android.finsky.installqueue.j(v7, this.e.c).a("single_install").b(this.b.c()).a());
                else {
                    v1 = new Object[1];
                    v1[0] = this.e.a;
                    FinskyLog.e("PurchaseParams.document is null for docId %s", v1);
                }
            }
            else if (this.e.c != 0) {
                v0 = com.google.android.finsky.m.a.o();
                v0.a(this.e.c.N().k, this.e.c.bV());
                v0.a(this.e.c.N().k, this.e.c.N().c, this.b.b().name, this.e.c.a.g, 2, this.e.c.z(), v7);
            }
            else {
                v1 = new Object[1];
                v1[0] = this.e.b;
                FinskyLog.c("Request an installation with a document: docId %s", v1);
                com.google.android.finsky.m.a.o().a(this.e.b, this.e.g, this.b.c(), this.g.b, 2, 0, v7);
            }
        }
    }

    final void a(com.google.android.finsky.d.w p0, int p1, int p2, long p3, long p5, byte[] p7) {
        p0.a(this.b(p1).a(p2).a(p3).b(p5).a(p7).a, 0);
    }

    public final void a(com.google.wireless.android.finsky.dfe.nano.fa p0, com.google.android.finsky.d.w p1) {
        this.ap = 0;
        this.g = 0;
        this.ah = 0;
        this.as = 0;
        this.a(p1, 303, p0.b.b, this.Y(), this.X(), p0.g);
        if (p0.b.b == 2 && p0.c.j != 0) {
            if (p0.c.j.c != 0)
                v0 = "usecart";
            else
                v0 = "skipcart";
            p1.a(new com.google.android.finsky.d.c(343).d(1).b(v0));
            p1.a(new com.google.android.finsky.d.c(344).d(1).b(v0).a(1));
        }
        if (p0.h == 0 || p0.h.length == 0)
            this.aj = PurchaseFlowConfig.a;
        else
            this.aj = new PurchaseFlowConfig(p0.h);
        if (this.ai == 0)
            this.ai = p0.j;
        switch (p0.b.b) {
            case 0:
                this.g = p0.d;
                this.ah = p0.e;
                this.b(p1);
                if (this.ah == 0)
                    v0 = 5;
                else
                    v0 = 4;
                this.b(v0, 0);
                break;
            case 1:
                v1 = new Object[1];
                v1[0] = Integer.valueOf(p0.b.b);
                FinskyLog.e("Unknown status returned from server: %d", v1);
                this.as = new CheckoutPurchaseError();
                this.b(3, 5);
                break;
            case 2:
                this.ap = p0.c;
                this.g = p0.d;
                if (this.g != 0)
                    this.b(p1);
                this.b(6, 0);
                break;
            case 3:
                if (!TextUtils.isEmpty(p0.b.f))
                    this.as = new CheckoutPurchaseError(p0.b.d, p0.b.e, p0.b.c, p0.b.f, p0.b.g);
                else
                    this.as = new CheckoutPurchaseError(p0.b.d, p0.b.c);
                this.b(3, 5);
                break;
            default:
                v1 = new Object[1];
                v1[0] = Integer.valueOf(p0.b.b);
                FinskyLog.e("Unknown status returned from server: %d", v1);
                this.as = new CheckoutPurchaseError();
                this.b(3, 5);
                break;
        }
    }

    public final void a(String p0, VoucherParams p1, Bundle p2, com.google.wireless.android.finsky.dfe.c.a.al p3, Boolean p4, Map p5, com.google.android.finsky.d.w p6) {
        this.f = p3;
        this.a(p6, 302);
        v16 = com.google.android.finsky.billing.lightpurchase.i.m(p2);
        v16.putAll(p5);
        this.c = SystemClock.elapsedRealtime();
        if (p4 != 0)
            v16.put("st", p4.toString());
        if (this.ai != 0)
            v16.put("naf", Boolean.TRUE.toString());
        this.a(v16);
        v4 = com.google.android.wallet.common.util.a.a(this.h());
        if (!TextUtils.isEmpty(v4))
            v16.put("capn", v4);
        v17 = new com.google.android.finsky.billing.lightpurchase.o;
        v17.<init>(this, p6);
        v18 = new com.google.android.finsky.billing.lightpurchase.n;
        v18.<init>(this, p6);
        this.d = this.b.a(this.e.b, this.e.a, this.e.d, this.e.e, this.e.n, this.f, p0, this.e.l, p1, this.e.g, this.e.j, v16, v17, v18);
        this.b(1, 1);
        this.ak = 0;
        this.al = 0;
    }

    final long aa() {
        if (this.al == 0) {
            FinskyLog.e("Unexpected null complete request", new Object[0]);
            v0 = -1;
        }
        else
            v0 = this.al.b();
        return v0;
    }

    public final String ab() {
        v3 = 0;
        v0 = 0;
        if (this.as != 0)
            v0 = this.as.e;
        if (TextUtils.isEmpty(v0) && this.g != 0)
            v0 = this.g.k;
        if (this.ap != 0 && this.ap.j != 0)
            v1 = 1;
        else
            v1 = 0;
        if (v1 == 0 && TextUtils.isEmpty(v0)) {
            v5 = new Object[2];
            if (this.g == 0)
                v1 = 1;
            else
                v1 = 0;
            v5[0] = Boolean.valueOf(v1);
            if (this.as == 0)
                v3 = 1;
            v5[1] = Boolean.valueOf(v3);
            FinskyLog.e("Unexpected empty purchaseContextToken: %b %b", v5);
        }
        return v0;
    }

    public final PurchaseFlowConfig ac() {
        if (this.aj == 0) {
            FinskyLog.e("The purchase flow configuration is accessed before it's ready.", new Object[0]);
            v0 = PurchaseFlowConfig.a;
        }
        else
            v0 = this.aj;
        return v0;
    }

    public final void b(Bundle p0) {
        this.b = com.google.android.finsky.m.a.b(this.q.getString("authAccount"));
        this.e = (PurchaseParams)this.q.getParcelable("CheckoutPurchaseSidecar.purchaseParams");
        super.b(p0);
    }

    public final void e(Bundle p0) {
        super.e(p0);
        p0.putParcelable("CheckoutPurchaseSidecar.authenticationInfo", ParcelableProto.a(this.f));
        p0.putParcelable("CheckoutPurchaseSidecar.cart", ParcelableProto.a(this.g));
        p0.putParcelable("CheckoutPurchaseSidecar.changeSubscription", ParcelableProto.a(this.ah));
        p0.putParcelable("CheckoutPurchaseSidecar.prepareChallenge", ParcelableProto.a(this.ap));
        p0.putParcelable("CheckoutPurchaseSidecar.completeChallenge", ParcelableProto.a(this.aq));
        p0.putBundle("CheckoutPurchaseSidecar.extraPurchaseData", this.am);
        p0.putParcelable("CheckoutPurchaseSidecar.post_acquisition_prompt", ParcelableProto.a(this.an));
        p0.putParcelable("CheckoutPurchaseSidecar.checkoutPurchaseError", this.as);
        p0.putParcelable("CheckoutPurchaseSidecar.giftEmailParams", this.aw);
        p0.putBoolean("CheckoutPurchaseSidecar.isNewPayingUser", this.ai);
        p0.putParcelable("CheckoutPurchaseSidecar.purchaseFlowConfig", this.aj);
    }

}
