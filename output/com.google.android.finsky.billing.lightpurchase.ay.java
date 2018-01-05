package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.u;
import android.text.TextUtils;
import com.google.android.finsky.api.VoucherParams;
import com.google.android.finsky.api.l;
import com.google.android.finsky.api.m;
import com.google.android.finsky.aw.a;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.billing.common.PurchaseError;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.common.f;
import com.google.android.finsky.billing.common.i;
import com.google.android.finsky.billing.common.o;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.billing.common.v;
import com.google.android.finsky.billing.e.j;
import com.google.android.finsky.billing.legacyauth.AuthState;
import com.google.android.finsky.billing.legacyauth.a;
import com.google.android.finsky.billing.legacyauth.f;
import com.google.android.finsky.billing.payments.f;
import com.google.android.finsky.billing.profile.m;
import com.google.android.finsky.bn.b;
import com.google.android.finsky.by.c;
import com.google.android.finsky.by.o;
import com.google.android.finsky.ce.a;
import com.google.android.finsky.cj.c;
import com.google.android.finsky.cq.c;
import com.google.android.finsky.cq.d;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.cv.a.bl;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.w;
import com.google.android.finsky.detailscomponents.DocImageView;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.i;
import com.google.android.finsky.dfemodel.k;
import com.google.android.finsky.dfemodel.v;
import com.google.android.finsky.download.a;
import com.google.android.finsky.f.c;
import com.google.android.finsky.installer.k;
import com.google.android.finsky.installqueue.g;
import com.google.android.finsky.installqueue.j;
import com.google.android.finsky.l.a;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.wallet.common.pub.i;
import com.google.wireless.android.finsky.a.a.ah;
import com.google.wireless.android.finsky.a.a.m;
import com.google.wireless.android.finsky.dfe.c.a.al;
import com.google.wireless.android.finsky.dfe.nano.c;
import com.google.wireless.android.finsky.dfe.nano.k;
import com.google.wireless.android.finsky.dfe.nano.o;
import com.google.wireless.android.finsky.dfe.nano.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class com.google.android.finsky.billing.lightpurchase.ay extends com.google.android.finsky.billing.common.s implements com.google.android.finsky.billing.common.t
{

    public final com.google.android.finsky.d.a a;
    public String aA;
    public String aB;
    public String aC;
    public PurchaseError aD;
    public int aE;
    public com.google.android.finsky.billing.common.i aF;
    public String ah;
    public VoucherParams ai;
    public com.google.android.finsky.cv.a.bl aj;
    public boolean ak;
    public boolean al;
    public boolean am;
    public boolean an;
    public boolean ao;
    public boolean ap;
    public com.google.android.finsky.billing.lightpurchase.i aq;
    public com.google.android.finsky.billing.lightpurchase.p ar;
    public com.google.android.finsky.billing.lightpurchase.a as;
    public com.google.android.finsky.billing.legacyauth.f at;
    public com.google.android.finsky.billing.profile.m au;
    public com.google.android.finsky.billing.lightpurchase.r av;
    public Bundle aw;
    public Bundle ax;
    public String ay;
    public String az;
    public com.google.android.finsky.d.w b;
    public Account c;
    public PurchaseParams d;
    public PurchaseParams e;
    public com.google.wireless.android.finsky.dfe.c.a.al f;
    public com.google.android.finsky.dfemodel.v g;

    ay() {
        com.google.android.finsky.billing.common.s();
        this.a = com.google.android.finsky.m.a.aR();
        com.google.android.finsky.m.a.bD();
        this.aF = com.google.android.finsky.m.a.aG();
    }

    public static com.google.android.finsky.billing.lightpurchase.ay a(Account p0, PurchaseParams p1, com.google.android.finsky.dfemodel.v p2) {
        v0 = new Bundle();
        v0.putParcelable("PurchaseStateMachine.account", p0);
        v0.putParcelable("PurchaseStateMachine.purchaseParams", p1);
        v0.putParcelable("PurchaseStateMachine.authInfo", ParcelableProto.a(com.google.android.finsky.billing.e.j.a(p0.name)));
        if (p2 != 0)
            v0.putSerializable("PurchaseStateMachine.offerFilter", p2);
        v1 = new com.google.android.finsky.billing.lightpurchase.ay();
        v1.f(v0);
        return v1;
    }

    private final String a(int p0) {
        v0 = new com.google.android.wallet.common.pub.i(p0);
        v0.b = 1;
        return this.aF.a(this.h(), this.c.name, v0.a());
    }

    private final void a(com.google.android.finsky.billing.legacyauth.f p0) {
        switch (p0.l) {
            case 2:
                v0 = this.as.W().a();
                this.aq.a(v0);
                this.ax.putString("pcam", String.valueOf(v0));
                this.ak();
                break;
            case 3:
                this.b(p0.f);
                break;
            default:
                break;
        }
    }

    private final void a(com.google.android.finsky.billing.lightpurchase.p p0) {
        switch (p0.l) {
            case 0:
                p0.b(1, 0);
                p0.a = new com.google.android.finsky.dfemodel.i(com.google.android.finsky.m.a.b(this.c.name), com.google.android.finsky.api.l.a(this.d.b));
                p0.a.a(p0);
                p0.a.a(p0);
                break;
            case 1:
                break;
            case 2:
                this.ag();
                break;
            case 3:
                this.a(this.c(2131952119), this.c(2131953124), this.c(2131952688));
                break;
            default:
                break;
        }
    }

    private final void a(com.google.android.finsky.billing.lightpurchase.r p0) {
        switch (p0.l) {
            case 0:
                p0.b(1, 0);
                com.google.android.finsky.billing.lightpurchase.ar.a(this.c, this.ar.b, p0, 0, 1, 1, this.b);
                break;
            case 1:
                this.ah();
                break;
            case 2:
                this.am();
                break;
            case 3:
                this.b(3, 0);
                break;
            default:
                break;
        }
    }

    private final void a(com.google.wireless.android.finsky.a.a.ah p0) {
        this.ay = p0.b;
        this.az = p0.c;
        this.aC = p0.d;
        v0 = PurchaseParams.b().a(this.d);
        v0.o = 0;
        v0.q = p0.e;
        this.e = v0.a();
        this.b(1, 11);
    }

    private final void a(String p0, String p1, String p2) {
        this.a(p0, p1, p2, 770);
    }

    private final void a(String p0, String p1, String p2, int p3) {
        this.ay = p0;
        this.az = p1;
        this.aC = p2;
        this.aE = p3;
        this.b(1, 4);
    }

    private final void ah() {
        this.aC = 0;
        this.b(1, 1);
    }

    private final void ai() {
        this.B.a().a(this.au).c();
        this.au = 0;
    }

    private final void aj() {
        if (this.aq.aq.l != 0)
            this.a(this.aq.aq.l);
        else {
            if (this.aq.aq.m != 0)
                throw new UnsupportedOperationException("Family acquisition challenge not supported");
            if (this.aq.aq.c == 0) {
                if (this.aq.aq.h != 0)
                    throw new UnsupportedOperationException("Purchase manager challenge not supported");
                throw new IllegalStateException("Unknown challenge requested");
            }
            this.b(0);
        }
    }

    private final void ak() {
        if (!this.al()) {
            if (this.aj.n != 0)
                this.aq.a(this.ax, this.a(com.google.android.finsky.billing.payments.f.a(0)), this.b);
            else {
                if (this.av == 0) {
                    this.av = new com.google.android.finsky.billing.lightpurchase.r();
                    this.B.a().a(this.av, "PurchaseStateMachine.freePurchaseSidecar").c();
                }
                this.av.a(this);
            }
        }
    }

    private final boolean al() {
        v2 = 0;
        v1 = 1;
        if (this.am == 0 && this.ar.b.a.e == 1) {
            v3 = this.ar.b.N();
            v0 = com.google.android.finsky.m.a.bW();
            v4 = v0.a();
            if (v0.a(0) == 1)
                v0 = 1;
            else
                v0 = 0;
            v5 = com.google.android.finsky.m.a.q();
            if (v3 != 0 && v5.d() && v5.e > 0 && com.google.android.finsky.cj.c.a(v3) >= v5.e) {
                if (v4 == 0) {
                    if (com.google.android.finsky.m.a.d().c(this.ar.b) < v5.f)
                        v2 = 1;
                    this.ay = this.c(2131953361);
                    if (v2 != 0) {
                        v0 = this.c(2131953362);
                        v3 = this;
                    }
                    else if (v5.c()) {
                        v0 = this.c(2131953358);
                        v3 = this;
                    }
                    else {
                        v0 = this.c(2131953359);
                        v3 = this;
                    }
                    v3.az = v0;
                    if (v2 != 0)
                        v0 = this.c(2131953357);
                    else
                        v0 = 0;
                    this.aB = v0;
                    this.aC = this.c(2131953360);
                    this.b(1, 10);
                    return v1;
                }
                if (v0 != 0) {
                    if (com.google.android.finsky.m.a.d().c(this.ar.b) < v5.f)
                        v2 = 1;
                    this.ay = this.c(2131953361);
                    if (v2 != 0) {
                        v0 = this.c(2131953362);
                        v3 = this;
                    }
                    else if (v5.c()) {
                        v0 = this.c(2131953358);
                        v3 = this;
                    }
                    else {
                        v0 = this.c(2131953359);
                        v3 = this;
                    }
                    v3.az = v0;
                    if (v2 != 0)
                        v0 = this.c(2131953357);
                    else
                        v0 = 0;
                    this.aB = v0;
                    this.aC = this.c(2131953360);
                    this.b(1, 10);
                    return v1;
                }
            }
        }
        v1 = 0;
        return v1;
    }

    private final void am() {
        if (this.ar.b.a.e != 1)
            this.b(3, 0);
        if (!this.al()) {
            if (this.an == 0) {
                v1 = new Object[1];
                v1[0] = this.ar.b.a.g;
                this.az = this.a(2131951844, v1);
                this.aC = this.c(2131952688);
                this.b(1, 12);
            }
            else {
                com.google.android.finsky.m.a.bu().b(this.ar.b);
                com.google.android.finsky.m.a.I().b.b(this.ar.b.a.d, 0);
                v7 = this.b.a("single_install");
                if (com.google.android.finsky.m.a.dj().a(12623705))
                    com.google.android.finsky.m.a.bw().a(new com.google.android.finsky.installqueue.j(v7, this.ar.b).b(this.c.name).a("single_install").a());
                else {
                    v0 = com.google.android.finsky.m.a.o();
                    v0.a(this.ar.b.N().k, this.ar.b.bV());
                    v0.a(this.ar.b.N().k, this.ar.b.N().c, this.c.name, this.ar.b.a.g, 2, this.ar.b.z(), v7);
                }
                this.b(2, 0);
            }
        }
    }

    private final void an() {
        if (this.aq.as == 0 || TextUtils.isEmpty(this.aq.as.b))
            v2 = this.c(2131952119);
        else
            v2 = this.aq.as.b;
        if (this.aq.as == 0 || TextUtils.isEmpty(this.aq.as.c))
            v1 = this.c(2131952243);
        else
            v1 = this.aq.as.c;
        if (this.aq.as == 0 || TextUtils.isEmpty(this.aq.as.d))
            v0 = this.c(2131952688);
        else
            v0 = this.aq.as.d;
        this.a(v2, v1, v0);
        switch (this.aq.af) {
            case 3:
                this.aD = new PurchaseError(2, 0);
                break;
            case 4:
                v1 = new Object[1];
                v1[0] = Integer.valueOf(this.aq.af);
                FinskyLog.e("Unexpected substate: %d", v1);
                this.aD = new PurchaseError(3, 0);
                break;
            case 5:
                this.ax.clear();
                this.aD = new PurchaseError(3, this.aq.as.a);
                break;
            default:
                v1 = new Object[1];
                v1[0] = Integer.valueOf(this.aq.af);
                FinskyLog.e("Unexpected substate: %d", v1);
                this.aD = new PurchaseError(3, 0);
                break;
        }
    }

    private final void b(String p0) {
        if (this.X() <= 0) {
            if (this.ap != 0)
                this.b(3, 0);
            else {
                this.ap = 1;
                this.b(1, 13);
            }
        }
        else {
            this.ay = this.c(2131952114);
            this.aA = p0;
            this.aC = this.c(this.as.W().c());
            this.b(1, 3);
        }
    }

    public final String W() {
        if (this.aC == 0)
            v0 = this.aC;
        else
            v0 = this.aC.toUpperCase(this.i().getConfiguration().locale);
        return v0;
    }

    public final int X() {
        return this.as.W().d;
    }

    public final int Y() {
        if (this.af != 4 && this.af != 5)
            throw new IllegalStateException("Screen type only for generic screens");
        return this.aE;
    }

    public final int Z() {
        if (this.af != 4 && this.af != 5)
            throw new IllegalStateException("Button type only for generic screens");
        return this.aE;
    }

    public final void a(com.google.android.finsky.billing.common.s p0) {
        if (p0 instanceof com.google.android.finsky.billing.lightpurchase.i) {
            switch (((com.google.android.finsky.billing.lightpurchase.i)p0).l) {
                case 0:
                    this.ag();
                    break;
                case 1:
                    this.ah();
                    break;
                case 2:
                    if (this.aq.an.c != 0) {
                        this.a(this.aq.an.c.b, 0, 0, 775);
                        new Handler().postDelayed(new com.google.android.finsky.billing.lightpurchase.az(this), (long)this.aq.an.c.c);
                    }
                    else if (this.aq.an.d != 0)
                        this.a(this.aq.an.d.b, 0, this.aq.an.d.c, 775);
                    else if (this.aq.an.e != 0)
                        this.a(this.aq.an.e.b, this.aq.an.e.c, this.aq.an.e.e, 775);
                    else
                        this.b(2, 0);
                    break;
                case 3:
                    this.an();
                    break;
                case 4:
                    v1 = new Object[1];
                    v1[0] = Integer.valueOf(this.aq.l);
                    FinskyLog.e("Unexpected state: %d", v1);
                    this.an();
                    break;
                case 5:
                    this.b(1, 2);
                    break;
                case 6:
                    if (this.aq.ap.l == 0) {
                        if (this.aq.ap.g != 0)
                            throw new UnsupportedOperationException("Acknowledge challenge not supported");
                        if (this.aq.ap.j != 0)
                            throw new UnsupportedOperationException("Billing profile challenge not supported");
                        if (this.aq.ap.f != 0)
                            throw new UnsupportedOperationException("Payments update challenge not supported");
                        if (this.aq.ap.b != 0)
                            throw new UnsupportedOperationException("Address challenge not supported");
                        throw new IllegalStateException("Unknown challenge requested");
                    }
                    this.a(this.aq.ap.l);
                    break;
                case 7:
                    if (this.as.l == 2)
                        this.aj();
                    break;
                case 8:
                    v1 = new Object[1];
                    v1[0] = Integer.valueOf(this.aq.l);
                    FinskyLog.e("Unexpected state: %d", v1);
                    this.an();
                    break;
                case 9:
                    v1 = new Object[1];
                    v1[0] = Integer.valueOf(this.aq.l);
                    FinskyLog.e("Unexpected state: %d", v1);
                    this.an();
                    break;
                case 10:
                    v1 = new Object[1];
                    v1[0] = Integer.valueOf(this.aq.l);
                    FinskyLog.e("Unexpected state: %d", v1);
                    this.an();
                    break;
                case 11:
                    v1 = new Object[1];
                    v1[0] = Integer.valueOf(this.aq.l);
                    FinskyLog.e("Unexpected state: %d", v1);
                    this.an();
                    break;
                case 12:
                    v1 = new Object[1];
                    v1[0] = Integer.valueOf(this.aq.l);
                    FinskyLog.e("Unexpected state: %d", v1);
                    this.an();
                    break;
                case 13:
                    this.a(0);
                    break;
                default:
                    v1 = new Object[1];
                    v1[0] = Integer.valueOf(this.aq.l);
                    FinskyLog.e("Unexpected state: %d", v1);
                    this.an();
                    break;
            }
        }
        else if (p0 instanceof com.google.android.finsky.billing.lightpurchase.p)
            this.a((com.google.android.finsky.billing.lightpurchase.p)p0);
        else {
            if (p0 instanceof com.google.android.finsky.billing.lightpurchase.a) {
                switch (((com.google.android.finsky.billing.lightpurchase.a)p0).l) {
                    case 0:
                        ((com.google.android.finsky.billing.lightpurchase.a)p0).b(1, 0);
                        new com.google.android.finsky.billing.legacyauth.a(this.c, this.b).a((com.google.android.finsky.billing.lightpurchase.a)p0, this.d.o);
                        break;
                    case 1:
                        break;
                    case 2:
                        this.at = (com.google.android.finsky.billing.legacyauth.f)this.B.a("PurchaseStateMachine.authChallengeSidecar");
                        if (this.at == 0) {
                            this.at = com.google.android.finsky.billing.legacyauth.f.a(this.c.name, ((com.google.android.finsky.billing.lightpurchase.a)p0).W());
                            this.B.a().a(this.at, "PurchaseStateMachine.authChallengeSidecar").c();
                            this.at.a(this);
                        }
                        if (this.aq != 0) {
                            if (this.aq.l == 7)
                                this.aj();
                        }
                        break;
                    default:
                        break;
                }
            }
            if (p0 instanceof com.google.android.finsky.billing.legacyauth.f)
                this.a((com.google.android.finsky.billing.legacyauth.f)p0);
            else {
                if (p0 instanceof com.google.android.finsky.billing.profile.m) {
                    switch (((com.google.android.finsky.billing.profile.m)p0).l) {
                        case 0:
                            ((com.google.android.finsky.billing.profile.m)p0).a(this.a(com.google.android.finsky.billing.payments.f.a(0)), 0, 0, this.b);
                            break;
                        case 1:
                            this.ah();
                            break;
                        case 2:
                            this.b(1, 9);
                            break;
                        case 3:
                            switch (((com.google.android.finsky.billing.profile.m)p0).af) {
                                case 1:
                                    v0 = ((com.google.android.finsky.billing.profile.m)p0).am;
                                    break;
                                case 2:
                                    v0 = com.google.android.finsky.api.m.a(this.h(), ((com.google.android.finsky.billing.profile.m)p0).an);
                                    break;
                                default:
                                    v0 = this.c(2131952119);
                                    break;
                            }
                            this.az = v0;
                            this.aC = this.c(2131952688);
                            this.aE = 770;
                            this.b(1, 5);
                            break;
                        case 4:
                            this.a(((com.google.android.finsky.billing.profile.m)p0).aq);
                            break;
                        case 5:
                            break;
                        default:
                            break;
                    }
                }
                if (p0 instanceof com.google.android.finsky.billing.lightpurchase.r)
                    this.a((com.google.android.finsky.billing.lightpurchase.r)p0);
            }
        }
    }

    public final void a(Boolean p0) {
        v6 = new HashMap();
        com.google.android.finsky.billing.common.f.a(this.h().getApplicationContext(), v6);
        v6.put("bppcc", this.a(com.google.android.finsky.billing.payments.f.a(0)));
        this.aq.a(this.ah, this.ai, this.aw, this.f, p0, v6, this.b);
    }

    public final void a(String p0) {
        this.ah = p0;
        this.ai();
        this.a(0);
    }

    public final List aa() {
        v1 = new ArrayList();
        v0 = 0;
        while (v0 < this.ar.b.a.n.length) {
            if (this.ar.b.a.n[v0].p != 2) {
                if (this.g == 0 || this.g.a(this.ar.b.a.n[v0].p))
                    v1.add(new com.google.android.finsky.billing.lightpurchase.ak(this.ar.b, this.ar.b.a.n[v0]));
            }
            v0 = v0 + 1;
        }
        return v1;
    }

    public final List ab() {
        return com.google.android.finsky.m.a.aV().a(this.ar.b.N().g, 0, 1, 1).a();
    }

    public final void ac() {
        this.al = 1;
        this.ag();
    }

    public final void ad() {
        if (this.aq != 0) {
            switch (this.aq.l) {
                case 2:
                    this.b(2, 0);
                    break;
                case 3:
                    this.b(3, 0);
                    break;
                case 4:
                    break;
                case 5:
                    this.ak();
                    break;
                default:
                    break;
            }
        }
        else if (this.af == 10) {
            if (this.ak != 0)
                this.am();
            else
                this.ak();
        }
        else if (this.af == 12) {
            this.an = 1;
            this.am();
        }
        else
            this.b(3, 0);
    }

    public final void ae() {
        if (this.l == 1 && this.af == 15)
            this.b(1, 2);
        else if (this.l == 1 && this.af == 9) {
            this.ai();
            this.b(1, 2);
        }
        else if (this.l == 1 && this.af == 13)
            this.b(0);
        else if (this.l == 1 && this.af == 14)
            this.b(1, 3);
        else
            this.b(3, 0);
    }

    public final boolean af() {
        v0 = 1;
        if (this.aq != 0) {
            switch (this.aq.l) {
                case 2:
                    return v0;
                case 3:
                    return v0;
                default:
                    break;
            }
        }
        if (this.av == 0 || this.av.l != 2)
            v0 = 0;
    }

    public final void ag() {
        if (this.ar.l == 2) {
            if (this.aj == 0 && TextUtils.isEmpty(this.d.e) && this.d.d == 0) {
                if (this.ao != 0)
                    this.b(3, 0);
                else if (this.aa().isEmpty()) {
                    this.ao = 1;
                    this.a(this.c(2131952398), 0, this.c(2131952688));
                }
                else {
                    this.ay = this.c(2131952682);
                    this.b(1, 6);
                }
            }
            else {
                if (this.aj == 0)
                    this.aj = this.ar.b.a(this.d.e, this.d.d);
                if (this.al == 0 && this.ar.b.a.e == 1 && this.ab().size() > 0) {
                    if (Build$VERSION.SDK_INT > 22 && this.ar.b.ai() > 22)
                        this.b(1, 8);
                    else {
                        this.ay = this.ar.b.a.g;
                        this.az = this.c(2131952597);
                        this.aC = this.c(2131951649);
                        this.b(1, 7);
                    }
                }
                else if (com.google.android.finsky.m.a.Y().a(this.d.a, com.google.android.finsky.m.a.ah().a(this.c), this.d.d)) {
                    this.ak = 1;
                    this.am();
                }
                else if (this.aj.n == 0)
                    this.ak();
                else if (this.aq == 0) {
                    if (this.aj != 0)
                        v0 = this.aj.p;
                    else
                        v0 = this.d.d;
                    if (this.aj != 0)
                        v1 = this.aj.B;
                    else
                        v1 = this.d.e;
                    v2 = this.ar.b.N();
                    if (v2 != 0)
                        v2 = v2.c;
                    else
                        v2 = this.d.g;
                    v3 = PurchaseParams.b().a(this.d).a(this.ar.b);
                    v3.d = v0;
                    v3.e = v1;
                    this.d = v3.a(v2, this.d.h, this.d.i, this.d.j).a();
                    this.aq = com.google.android.finsky.billing.lightpurchase.i.a(this.c.name, this.d);
                    this.B.a().a(this.aq, "PurchaseStateMachine.sidecar").c();
                    this.aq.a(this);
                }
                else if (this.aq.l == 0)
                    this.aq.W();
            }
        }
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.c = (Account)this.q.getParcelable("PurchaseStateMachine.account");
        this.b = this.a.a(p0);
        this.d = (PurchaseParams)this.q.getParcelable("PurchaseStateMachine.purchaseParams");
        this.f = (com.google.wireless.android.finsky.dfe.c.a.al)ParcelableProto.a(this.q, "PurchaseStateMachine.authInfo");
        this.g = (com.google.android.finsky.dfemodel.v)this.q.getSerializable("PurchaseStateMachine.offerFilter");
        com.google.android.finsky.m.a.ab();
        this.ai = new VoucherParams(0, 1, com.google.android.finsky.billing.common.v.a(com.google.android.finsky.m.a.ah().a(this.c)));
        if (p0 == 0) {
            this.aw = new Bundle();
            this.ax = new Bundle();
        }
        else {
            super.a(p0);
            this.aw = p0.getBundle("PurchaseStateMachine.preparePurchaseChallengeResponses");
            this.ax = p0.getBundle("PurchaseStateMachine.completePurchaseChallengeResponses");
            this.ah = p0.getString("PurchaseStateMachine.instrumentId");
            this.aj = (com.google.android.finsky.cv.a.bl)ParcelableProto.a(p0, "PurchaseStateMachine.offer");
            this.ak = p0.getBoolean("PurchaseStateMachine.offerOwned");
            this.al = p0.getBoolean("PurchaseStateMachine.acceptedAppsPermissions");
            this.am = p0.getBoolean("PurchaseStateMachine.acceptedDownloadWarning");
            this.an = p0.getBoolean("PurchaseStateMachine.acceptedInstall");
            this.ao = p0.getBoolean("PurchaseStateMachine.offerResolutionErrorDialogShown");
            this.ap = p0.getBoolean("PurchaseStateMachine.mSetupPinErrorDialogShown");
        }
    }

    public final String c(int p0, int p1) {
        com.google.android.finsky.m.a.bR();
        return com.google.android.finsky.bg.af.a(this.ar.b, p0, p1, DocImageView.a).f;
    }

    public final void e(Bundle p0) {
        super.e(p0);
        p0.putBundle("PurchaseStateMachine.preparePurchaseChallengeResponses", this.aw);
        p0.putBundle("PurchaseStateMachine.completePurchaseChallengeResponses", this.ax);
        p0.putString("PurchaseStateMachine.instrumentId", this.ah);
        p0.putParcelable("PurchaseStateMachine.offer", ParcelableProto.a(this.aj));
        p0.putBoolean("PurchaseStateMachine.offerOwned", this.ak);
        p0.putBoolean("PurchaseStateMachine.acceptedAppsPermissions", this.al);
        p0.putBoolean("PurchaseStateMachine.acceptedDownloadWarning", this.am);
        p0.putBoolean("PurchaseStateMachine.acceptedInstall", this.an);
        p0.putBoolean("PurchaseStateMachine.offerResolutionErrorDialogShown", this.ao);
        p0.putBoolean("PurchaseStateMachine.mSetupPinErrorDialogShown", this.ap);
    }

    public final void g_() {
        super.g_();
        this.aq = (com.google.android.finsky.billing.lightpurchase.i)this.B.a("PurchaseStateMachine.sidecar");
        if (this.aq != 0)
            this.aq.a(this);
        this.ar = (com.google.android.finsky.billing.lightpurchase.p)this.B.a("PurchaseStateMachine.documentSidecar");
        if (this.ar == 0) {
            this.ar = new com.google.android.finsky.billing.lightpurchase.p();
            this.B.a().a(this.ar, "PurchaseStateMachine.documentSidecar").c();
        }
        this.ar.a(this);
        this.as = (com.google.android.finsky.billing.lightpurchase.a)this.B.a("PurchaseStateMachine.authStateSidecar");
        if (this.as == 0) {
            this.as = new com.google.android.finsky.billing.lightpurchase.a();
            this.B.a().a(this.as, "PurchaseStateMachine.authStateSidecar").c();
        }
        this.as.a(this);
        this.at = (com.google.android.finsky.billing.legacyauth.f)this.B.a("PurchaseStateMachine.authChallengeSidecar");
        if (this.at != 0)
            this.at.a(this);
        this.au = (com.google.android.finsky.billing.profile.m)this.B.a("PurchaseStateMachine.billingProfileSidecar");
        if (this.au != 0)
            this.au.a(this);
        this.av = (com.google.android.finsky.billing.lightpurchase.r)this.B.a("PurchaseStateMachine.freePurchaseSidecar");
        if (this.av != 0)
            this.av.a(this);
    }

    public final void h_() {
        super.h_();
        if (this.aq != 0)
            this.aq.a(0);
        this.as.a(0);
        if (this.at != 0)
            this.at.a(0);
    }

}
