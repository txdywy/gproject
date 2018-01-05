package com.google.android.finsky.billing.p130b;

import android.accounts.Account;
import android.app.LoaderManager;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.p037h.C0320p;
import android.support.v7.widget.eq;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.api.C1285f;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.p151a.C1655h;
import com.google.android.finsky.billing.p153c.C1779a;
import com.google.android.finsky.by.C2196e;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.cv.p177a.lg;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dialogbuilder.C1765f;
import com.google.android.finsky.dialogbuilder.C1766i;
import com.google.android.finsky.dialogbuilder.C2794b;
import com.google.android.finsky.dialogbuilder.C2796h;
import com.google.android.finsky.dialogbuilder.p154b.C2786a;
import com.google.android.finsky.dialogbuilder.p154b.C2787b;
import com.google.android.finsky.dialogbuilder.p154b.C2792h;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.dfe.c.a.ab;
import com.google.wireless.android.finsky.dfe.c.a.ac;
import com.google.wireless.android.finsky.dfe.c.a.af;
import com.google.wireless.android.finsky.dfe.c.a.bt;
import com.google.wireless.android.finsky.dfe.c.a.co;
import com.google.wireless.android.finsky.dfe.c.a.cw;
import com.google.wireless.android.finsky.dfe.c.a.cz;
import com.google.wireless.android.finsky.dfe.c.a.db;
import com.google.wireless.android.finsky.dfe.c.a.dt;
import com.google.wireless.android.finsky.dfe.c.a.e;
import com.google.wireless.android.finsky.dfe.c.a.eb;
import com.google.wireless.android.finsky.dfe.c.a.ee;
import com.google.wireless.android.finsky.dfe.c.a.w;
import com.google.wireless.android.finsky.dfe.nano.ez;

public final class C1767g implements C1765f, C1766i {
    public final dt f9105A = new dt();
    public final Runnable f9106B = new C1768h(this);
    public Handler f9107C;
    public bt f9108D;
    public db f9109E;
    public ab f9110F;
    public C1769i f9111G;
    public C2794b f9112H;
    public C2206c f9113a;
    public C2233o f9114b;
    public C1655h f9115c;
    public final C1773m f9116d;
    public final LoaderManager f9117e;
    public final Document f9118f;
    public final C1759a f9119g;
    public final C1774n f9120h;
    public final C1779a f9121i;
    public final C1764f f9122j;
    public final C1761c f9123k;
    public final C1763d f9124l;
    public final C2787b f9125m;
    public final String f9126n;
    public final C2786a f9127o;
    public final C2792h f9128p;
    public final Account f9129q;
    public final eb f9130r;
    public final boolean f9131s;
    public final String f9132t;
    public w f9133u;
    public String f9134v;
    public String f9135w;
    public Boolean f9136x;
    public final Boolean f9137y;
    public ez f9138z;

    public C1767g(LoaderManager loaderManager, C1773m c1773m, PurchaseParams purchaseParams, Document document, C2792h c2792h, C1759a c1759a, C1774n c1774n, C1779a c1779a, C1764f c1764f, C1763d c1763d, C2786a c2786a, C2787b c2787b, String str, Handler handler, Account account, Bundle bundle, eb ebVar, String str2, C1761c c1761c, boolean z) {
        ((C1349e) C3947d.m18649a(C1349e.class)).mo1729a(this);
        this.f9117e = loaderManager;
        c1773m.f9185l = this;
        this.f9116d = c1773m;
        this.f9128p = c2792h;
        this.f9119g = c1759a;
        this.f9120h = c1774n;
        this.f9121i = c1779a;
        this.f9122j = c1764f;
        this.f9124l = c1763d;
        this.f9127o = c2786a;
        this.f9125m = c2787b;
        this.f9123k = c1761c;
        this.f9133u = C1767g.m9700a(purchaseParams);
        this.f9118f = document;
        if (purchaseParams != null) {
            this.f9138z = purchaseParams.f9298n;
            this.f9135w = purchaseParams.f9295k;
            this.f9136x = Boolean.valueOf(purchaseParams.f9299o);
            this.f9134v = purchaseParams.f9286b;
            this.f9137y = Boolean.valueOf(purchaseParams.f9303s);
        } else {
            this.f9138z = null;
            this.f9135w = null;
            this.f9136x = Boolean.valueOf(false);
            this.f9134v = null;
            this.f9137y = Boolean.valueOf(false);
        }
        this.f9126n = str;
        this.f9129q = account;
        this.f9107C = handler;
        this.f9130r = ebVar;
        this.f9131s = z;
        this.f9132t = str2;
        dt dtVar = this.f9105A;
        int intValue = ((Integer) C1285f.f7612i.m28964b()).intValue();
        dtVar.a |= 1;
        dtVar.b = intValue;
        dtVar = this.f9105A;
        intValue = ((Integer) C1285f.f7613j.m28964b()).intValue();
        dtVar.a |= 2;
        dtVar.c = intValue;
        dtVar = this.f9105A;
        float floatValue = ((Float) C1285f.f7614k.m28964b()).floatValue();
        dtVar.a |= 4;
        dtVar.d = floatValue;
        if (bundle != null) {
            if (bundle.containsKey("AcquireRequestModel.showAction")) {
                this.f9109E = (db) ParcelableProto.m21673a(bundle, "AcquireRequestModel.showAction");
            }
            if (bundle.containsKey("AcquireRequestModel.completeAction")) {
                mo2445a((bt) ParcelableProto.m21673a(bundle, "AcquireRequestModel.completeAction"));
            }
        }
    }

    private static w m9700a(PurchaseParams purchaseParams) {
        if (purchaseParams == null) {
            return new w();
        }
        String str;
        w wVar = new w();
        wVar.c = purchaseParams.f9285a;
        if (purchaseParams.m9748a()) {
            wVar.d = purchaseParams.f9288d;
            wVar.b |= 1;
        }
        if (purchaseParams.f9289e != null) {
            str = purchaseParams.f9289e;
            if (str == null) {
                throw new NullPointerException();
            }
            wVar.b |= 2;
            wVar.e = str;
        }
        if (purchaseParams.f9290f != null) {
            switch (purchaseParams.f9290f.ordinal()) {
                case 0:
                    wVar.b(1);
                    break;
                case 1:
                    wVar.b(2);
                    break;
                case 2:
                    wVar.b(3);
                    break;
                case 3:
                    wVar.b(4);
                    break;
                case 4:
                    wVar.b(5);
                    break;
                default:
                    throw new IllegalArgumentException(String.format("Unexpected OfferFilter: %s", new Object[]{purchaseParams.f9290f}));
            }
        }
        wVar.a(purchaseParams.f9296l);
        boolean z = purchaseParams.f9300p;
        wVar.b |= 16;
        wVar.h = z;
        z = purchaseParams.f9301q;
        wVar.b |= 32;
        wVar.i = z;
        if (purchaseParams.f9302r == null) {
            return wVar;
        }
        str = purchaseParams.f9302r;
        if (str == null) {
            throw new NullPointerException();
        }
        wVar.b |= 64;
        wVar.j = str;
        return wVar;
    }

    public final void mo2444a(C2796h c2796h) {
        this.f9111G = (C1769i) this.f9117e.initLoader(0, null, this.f9116d);
        this.f9111G.f9141B = this.f9115c;
        this.f9116d.f9186m = c2796h;
    }

    public final int mo2441a() {
        if (this.f9111G == null) {
            throw new IllegalStateException("Listener never set");
        } else if (this.f9111G.f9160s) {
            return 1;
        } else {
            if (this.f9111G.f9165x == null) {
                return 0;
            }
            return 2;
        }
    }

    public final void mo2446a(cw cwVar) {
        C0320p c0320p = null;
        boolean z = true;
        if (this.f9111G == null) {
            throw new IllegalStateException("Listener never set");
        }
        co coVar;
        this.f9109E = null;
        ac acVar = new ac();
        if (cwVar != null) {
            if ((cwVar.a & 1) != 0) {
                this.f9127o.m14864a(cwVar.b);
            }
            if (cwVar.d != null) {
                coVar = cwVar.d;
            } else {
                coVar = null;
            }
            if (cwVar.f != null) {
                acVar.a |= 16384;
                acVar.x = true;
            }
            this.f9125m.f15080b = cwVar.c;
        } else {
            coVar = null;
        }
        if (this.f9111G.f9165x != null) {
            if ((this.f9111G.f9165x.a & 1) != 0) {
                byte[] bArr = this.f9111G.f9165x.e;
                if (bArr == null) {
                    throw new NullPointerException();
                }
                acVar.a |= 1;
                acVar.d = bArr;
            }
        }
        if (this.f9123k.f9079a != null) {
            PurchaseParams purchaseParams = this.f9123k.f9079a;
            this.f9138z = purchaseParams.f9298n;
            this.f9135w = purchaseParams.f9295k;
            this.f9136x = Boolean.valueOf(purchaseParams.f9299o);
            this.f9134v = purchaseParams.f9286b;
            this.f9133u = C1767g.m9700a(purchaseParams);
        }
        acVar.b = this.f9133u;
        acVar.q = this.f9130r;
        boolean z2 = this.f9131s;
        acVar.a |= 8192;
        acVar.w = z2;
        acVar.c = this.f9138z;
        acVar.a(this.f9126n);
        String str = this.f9132t;
        if (str == null) {
            throw new NullPointerException();
        }
        String str2;
        lg lgVar;
        acVar.a |= 512;
        acVar.s = str;
        z2 = this.f9137y.booleanValue();
        acVar.a |= eq.FLAG_MOVED;
        acVar.u = z2;
        if (this.f9135w != null) {
            str = this.f9135w;
            if (str == null) {
                throw new NullPointerException();
            }
            acVar.a |= 4;
            acVar.g = str;
        }
        if (this.f9136x.booleanValue()) {
            acVar.h = 1;
            acVar.a |= 8;
        }
        if (this.f9118f != null && (this.f9133u.f() || this.f9133u.e())) {
            bl a = this.f9118f.m14640a(this.f9133u.e, this.f9133u.d);
            if (a != null) {
                z2 = !a.f11924n;
                acVar.a |= 32;
                acVar.n = z2;
            }
        }
        if (coVar == null) {
            if (acVar.n) {
                coVar = new co().a(300).b(301);
            } else if (this.f9133u.f() || this.f9133u.e() || acVar.d()) {
                coVar = new co().a(302).b(303);
            }
        }
        this.f9111G.f9140A = coVar;
        acVar.i = this.f9121i.m9729a();
        acVar.j = this.f9128p.m14871a();
        this.f9128p.m14873b();
        acVar.e = this.f9127o.m14865a();
        acVar.k = this.f9122j.f9098e;
        if (this.f9119g != null) {
            e eVar;
            C1759a c1759a = this.f9119g;
            if (c1759a.f9076a == null || c1759a.f9076a.f9285a.f11834c != 1) {
                eVar = null;
            } else {
                eVar = new e();
                int i = c1759a.f9076a.f9291g;
                eVar.a |= 1;
                eVar.b = i;
                int i2 = c1759a.f9076a.f9294j;
                eVar.a |= 2;
                eVar.c = i2;
            }
            acVar.m = eVar;
        }
        if (this.f9133u.c != null) {
            C2196e a2 = this.f9113a.mo2811a(this.f9129q);
            if (a2 != null) {
                boolean a3 = this.f9114b.m11645a(this.f9133u.c, a2);
                acVar.a |= 128;
                acVar.p = a3;
            }
        }
        if (cwVar != null) {
            if ((cwVar.a & 2) == 0) {
                z = false;
            }
            if (z) {
                str2 = cwVar.g;
                if (str2 == null) {
                    throw new NullPointerException();
                }
                acVar.a |= 256;
                acVar.r = str2;
            }
        }
        C1769i c1769i = this.f9111G;
        str2 = (String) C0954a.at.m5777b(this.f9129q.name).m5760a();
        if (TextUtils.isEmpty(str2)) {
            lgVar = null;
        } else {
            C0757i lgVar2 = new lg();
            com.google.android.finsky.utils.ab.m21686a(str2, lgVar2);
            C0757i c0757i = lgVar2;
        }
        String str3 = this.f9134v;
        dt dtVar = (cwVar == null || cwVar.e == null) ? this.f9105A : cwVar.e;
        C1764f c1764f = this.f9122j;
        if (c1764f.f9098e != null) {
            c0320p = new C0320p(c1764f.f9096c.i, c1764f.f9096c.j);
        }
        c1769i.cancelLoad();
        c1769i.f9155n = acVar;
        if (c1769i.f9143b != null) {
            try {
                acVar = c1769i.f9155n;
                String a4 = c1769i.f9143b.mo1549a();
                if (a4 == null) {
                    throw new NullPointerException();
                }
                acVar.a |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
                acVar.v = a4;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        c1769i.f9156o = lgVar;
        c1769i.f9157p = str3;
        c1769i.f9158q = dtVar;
        c1769i.f9159r = c0320p;
        c1769i.f9162u = false;
        c1769i.forceLoad();
    }

    public final cz mo2443a(db dbVar) {
        this.f9109E = dbVar;
        C1763d c1763d = this.f9124l;
        co coVar = dbVar.d;
        if (coVar != null) {
            c1763d.m9674a(coVar);
            c1763d.m9675a(coVar, new ee(), 0, 0);
        }
        return mo2447b();
    }

    public final cz mo2447b() {
        String str;
        if (this.f9109E != null) {
            str = this.f9109E.b;
        } else {
            str = null;
        }
        if (str == null || this.f9111G.f9165x == null || (this.f9111G.f9160s && !this.f9111G.m9716a())) {
            return null;
        }
        af[] afVarArr = this.f9111G.f9165x.b;
        for (int i = 0; i < afVarArr.length; i++) {
            if (str.equals(afVarArr[i].c)) {
                cz czVar = afVarArr[i].d;
                this.f9125m.f15080b = czVar.c;
                return czVar;
            }
        }
        return null;
    }

    public final db mo2448c() {
        return this.f9109E;
    }

    public final com.google.wireless.android.finsky.dfe.c.a.bl mo2449d() {
        if (this.f9111G.f9165x == null) {
            return null;
        }
        return this.f9111G.f9165x.h;
    }

    public final com.google.wireless.android.finsky.dfe.c.a.bl mo2442a(boolean z) {
        C2787b c2787b = this.f9125m;
        if (c2787b.f15080b != null) {
            if (c2787b.f15080b.e) {
                return null;
            }
            if (z) {
                if (c2787b.f15080b.d) {
                    return null;
                }
                if (c2787b.f15080b.c != null) {
                    return c2787b.f15080b.c;
                }
            }
            if (c2787b.f15080b.b != null) {
                return c2787b.f15080b.b;
            }
        }
        return c2787b.f15079a;
    }

    public final void mo2445a(bt btVar) {
        this.f9108D = btVar;
        this.f9107C.postDelayed(this.f9106B, (long) btVar.d);
    }

    public final void mo2450e() {
        if (this.f9111G != null) {
            this.f9111G.cancelLoad();
        }
    }

    public final void m9711f() {
        if (this.f9110F != null) {
            if (this.f9111G.f9161t) {
                this.f9112H.mo3138a(this.f9110F.c);
            } else {
                this.f9112H.mo3138a(this.f9110F.a);
            }
            this.f9110F = null;
        }
    }

    public final void mo2451g() {
        if (mo2441a() == 2) {
            m9711f();
        }
    }
}
