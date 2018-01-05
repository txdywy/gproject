package com.google.android.finsky.billing.acquire;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.c.a.a;
import android.support.v7.app.aa;
import android.text.TextUtils;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.h;
import com.google.android.finsky.api.k;
import com.google.android.finsky.as.b;
import com.google.android.finsky.as.e;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.billing.b.a;
import com.google.android.finsky.billing.b.b;
import com.google.android.finsky.billing.b.c;
import com.google.android.finsky.billing.b.d;
import com.google.android.finsky.billing.b.f;
import com.google.android.finsky.billing.b.g;
import com.google.android.finsky.billing.b.i;
import com.google.android.finsky.billing.b.m;
import com.google.android.finsky.billing.b.n;
import com.google.android.finsky.billing.b.q;
import com.google.android.finsky.billing.c.a;
import com.google.android.finsky.billing.c.b;
import com.google.android.finsky.billing.c.g;
import com.google.android.finsky.billing.c.h;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.common.RedeemCodeResult;
import com.google.android.finsky.billing.common.a;
import com.google.android.finsky.billing.common.e;
import com.google.android.finsky.billing.common.f;
import com.google.android.finsky.billing.common.i;
import com.google.android.finsky.billing.common.r;
import com.google.android.finsky.billing.e.e;
import com.google.android.finsky.billing.e.k;
import com.google.android.finsky.billing.iab.w;
import com.google.android.finsky.br.b;
import com.google.android.finsky.by.c;
import com.google.android.finsky.by.l;
import com.google.android.finsky.cn.a;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.bl;
import com.google.android.finsky.cv.a.is;
import com.google.android.finsky.cv.a.it;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.o;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dialogbuilder.b;
import com.google.android.finsky.dialogbuilder.b.a;
import com.google.android.finsky.dialogbuilder.b.b;
import com.google.android.finsky.dialogbuilder.b.c;
import com.google.android.finsky.dialogbuilder.b.d;
import com.google.android.finsky.dialogbuilder.b.f;
import com.google.android.finsky.dialogbuilder.b.h;
import com.google.android.finsky.dialogbuilder.b.j;
import com.google.android.finsky.dialogbuilder.d;
import com.google.android.finsky.dialogbuilder.e;
import com.google.android.finsky.dialogbuilder.g;
import com.google.android.finsky.installer.k;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.recoverymode.a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.wallet.common.pub.a.a;
import com.google.android.wallet.common.util.a;
import com.google.android.wallet.redirect.b;
import com.google.wireless.android.finsky.a.a.i;
import com.google.wireless.android.finsky.dfe.c.a.aa;
import com.google.wireless.android.finsky.dfe.c.a.ai;
import com.google.wireless.android.finsky.dfe.c.a.b;
import com.google.wireless.android.finsky.dfe.c.a.bl;
import com.google.wireless.android.finsky.dfe.c.a.bt;
import com.google.wireless.android.finsky.dfe.c.a.c;
import com.google.wireless.android.finsky.dfe.c.a.cr;
import com.google.wireless.android.finsky.dfe.c.a.eb;
import com.google.wireless.android.finsky.dfe.c.a.f;
import com.google.wireless.android.finsky.dfe.c.a.u;
import com.google.wireless.android.finsky.dfe.c.a.v;
import com.google.wireless.android.finsky.dfe.nano.ez;
import com.google.wireless.android.finsky.dfe.nano.ff;
import java.util.ArrayList;
import java.util.Set;

protected class com.google.android.finsky.billing.acquire.i extends android.support.v7.app.aa implements com.google.android.wallet.common.pub.d
{

    public com.google.android.finsky.as.b A;
    public com.google.android.finsky.installer.k B;
    public com.google.android.finsky.by.l C;
    public com.google.android.finsky.by.c D;
    public com.google.android.finsky.billing.common.i E;
    public com.google.android.finsky.br.b F;
    public com.google.android.finsky.recoverymode.a G;
    public com.google.android.finsky.cn.a H;
    public com.google.android.finsky.billing.iab.w I;
    public com.google.android.finsky.billing.b.d J;
    public com.google.android.finsky.billing.b.f K;
    public com.google.android.finsky.billing.c.b L;
    public com.google.android.finsky.dialogbuilder.b.c M;
    public com.google.android.finsky.dialogbuilder.e N;
    public com.google.android.finsky.dialogbuilder.b.f O;
    public com.google.android.finsky.dialogbuilder.b.h P;
    public com.google.android.finsky.dialogbuilder.b.j Q;
    public com.google.android.finsky.ba.e R;
    public com.google.android.finsky.d.w S;
    public boolean T;
    public com.google.android.finsky.billing.acquire.a U;
    public com.google.android.finsky.billing.b.g V;
    public com.google.android.finsky.dialogbuilder.b.a W;
    public com.google.android.finsky.billing.c.a X;
    public com.google.android.finsky.billing.b.c Y;
    public com.google.android.finsky.dialogbuilder.g Z;
    public PurchaseParams aa;
    public Document ab;
    public boolean ac;
    public int ad;
    public com.google.wireless.android.finsky.dfe.c.a.eb ae;
    public int af;
    public boolean ag;
    public com.google.android.finsky.api.c ah;
    public boolean ai;
    public boolean aj;
    public boolean ak;
    public com.google.android.finsky.d.a u;
    public com.google.android.finsky.billing.common.e v;
    public com.google.android.finsky.api.h w;
    public com.google.android.finsky.api.k x;
    public com.google.android.finsky.ba.c y;
    public com.google.android.finsky.as.e z;

    i() {
        android.support.v7.app.aa();
    }

    private final com.google.android.finsky.d.c c(int p0) {
        v0 = new com.google.android.finsky.d.c(p0).c(com.google.android.wallet.common.util.a.a(this));
        if (this.aa != 0) {
            v0.a(this.aa.b).a(this.aa.a).b(this.T);
            if (this.aa.a())
                v0.b(this.aa.d);
        }
        return v0;
    }

    private final void l() {
        this.A.a(new com.google.android.finsky.billing.acquire.k(this));
    }

    protected abstract com.google.android.finsky.billing.b.f a(Account p0, Bundle p1);

    public final void a(int p0, Bundle p1) {
        if (p0 == 50)
            this.K.a(p1);
        this.K.a(p0);
        this.K.a(this.K.c.d);
    }

    public final void b(int p0, Bundle p1) {
        if (p0 == 50)
            this.K.a(p1);
        this.K.a(p0);
    }

    public void finish() {
        v1 = new com.google.android.finsky.d.o(700);
        this.J.a(v1, 0);
        v1.a(com.google.android.finsky.billing.b.d.e);
        this.J.f.a(new com.google.android.finsky.d.p().a(v1).a(), 0);
        if (this.ai != 0)
            this.S.a(this.c(601).a(this.ac).a(this.ad).a, 0);
        if (this.aj != 0)
            this.S.a(this.c(603).a(this.ac).a(this.ad).a, 0);
        super.finish();
    }

    protected abstract void k();

    protected abstract com.google.android.finsky.dialogbuilder.g n();

    protected void onActivityResult(int p0, int p1, Intent p2) {
  0:    v4 = 0;
  6:    switch (p0) {
            case 1:
  6:            goto 38;
            case 2:
  6:            goto 38;
            case 3:
  6:            goto 38;
            case 4:
  6:            goto 38;
            case 5:
  6:            goto 38;
            case 6:
  6:            goto 38;
            default:
        }
  9:    v0 = 0;
 10:    if (v0 == 0) {
 31:        v0 = 0;
 32:        if (v0 == 0)
 34:            super.onActivityResult(p0, p1, p2);
 37:        return;
        }
 12:    v6 = Integer.toString(p0);
 22:    if (this.U.r.containsKey(v6)) goto 40;
 28:    FinskyLog.e("Already handled the result.", new Object[0]);
 31:    v0 = 0;
 32:    if (v0 == 0)
 34:        super.onActivityResult(p0, p1, p2);
 37:    return;
 38:    v0 = 1;
 39:    goto 10;
 40:    switch (p0) {
            case 1:
 40:            goto 44;
            case 2:
 40:            goto 320;
            case 3:
 40:            goto 402;
            case 4:
 40:            goto 435;
            case 5:
 40:            goto 514;
            case 6:
 40:            goto 557;
            default:
        }
 43:    goto 31;
 50:    v0 = (com.google.wireless.android.finsky.dfe.c.a.aa)ParcelableProto.a(this.U.r, v6);
 52:    if (p2 == 0)
 58:        this.U.e.a(v0.h);
        else {
 74:        v1 = (RedeemCodeResult)p2.getParcelableExtra("redeem_code_result");
 76:        if (v1 == 0)
 82:            this.U.e.a(v0.h);
            else {
 88:            if (v0.f != 0)
113:                this.U.n.a(new com.google.android.finsky.d.c(v0.f.b).a(v0.f.c).d(1));
122:            if (!TextUtils.isEmpty(v1.a)) {
128:                this.U.l.a(v0.d, v1.a);
135:                this.U.e.a(v0.g);
                }
141:            else if (v1.c == 0) {
145:                v7 = new com.google.wireless.android.finsky.dfe.c.a.bl();
153:                v7.e = new com.google.wireless.android.finsky.dfe.c.a.bt();
157:                v7.e.d();
162:                v8 = new com.google.android.finsky.cv.a.is();
167:                if (v1.d != 0) {
171:                    v4 = v1.d.getString("inapp_signed_purchase_data");
177:                    v0 = v1.d.getString("inapp_purchase_data_signature");
                    }
                    else
590:                    v0 = 0;
181:                if (v4 != 0 && v0 != 0) {
188:                    v8.a = new it[3];
192:                    v1 = new com.google.android.finsky.cv.a.it();
197:                    v1.a("INAPP_PURCHASE_DATA");
200:                    v1.b(v4);
205:                    v4 = new com.google.android.finsky.cv.a.it();
210:                    v4.a("INAPP_DATA_SIGNATURE");
213:                    v4.b(v0);
218:                    v8.a[1] = v1;
223:                    v8.a[2] = v4;
                    }
                    else
267:                    v8.a = new it[1];
232:                v8.a[0] = new com.google.android.finsky.cv.a.it();
240:                v8.a[0].a("RESPONSE_CODE");
251:                v8.a[0].a(com.google.android.finsky.billing.acquire.g.a.d);
256:                v7.e.b = v8;
260:                this.U.e.a(v7);
                }
                else {
270:                v1 = v1.a();
278:                if (!TextUtils.isEmpty(v1)) {
284:                    this.U.l.a(v0.e, v1);
291:                    this.U.e.a(v0.g);
                    }
                    else {
298:                    v0 = new com.google.wireless.android.finsky.dfe.c.a.bl();
306:                    v0.e = new com.google.wireless.android.finsky.dfe.c.a.bt();
310:                    v0.e.d();
315:                    this.U.e.a(v0);
                    }
                }
            }
        }
 63:    this.U.r.remove(v6);
 66:    v0 = 1;
 67:    goto 32;
326:    v0 = (com.google.wireless.android.finsky.dfe.c.a.ai)ParcelableProto.a(this.U.r, v6);
328:    if (p2 == 0)
334:        this.U.e.a(v0.f);
        else {
351:        v1 = (com.google.wireless.android.finsky.dfe.nano.ff)ParcelableProto.a(p2, "topUpResult");
353:        if (v1 == 0)
359:            this.U.e.a(v0.f);
            else {
382:            this.U.n.a(new com.google.android.finsky.d.c(327).a(v0.d).d(1));
391:            this.U.l.a(v0.c, v1.b);
398:            this.U.e.a(v0.e);
            }
        }
339:    this.U.r.remove(v6);
342:    v0 = 1;
343:    goto 32;
408:    v0 = (com.google.wireless.android.finsky.dfe.c.a.c)ParcelableProto.a(this.U.r, v6);
410:    if (-1 == p1)
416:        this.U.e.a(v0.b);
        else
431:        this.U.e.a(v0.c);
421:    this.U.r.remove(v6);
424:    v0 = 1;
425:    goto 32;
441:    v0 = (com.google.wireless.android.finsky.dfe.c.a.b)ParcelableProto.a(this.U.r, v6);
443:    if (p1 != -1 || p2 == 0 || !p2.hasExtra("challenge_response"))
459:        this.U.e.a(v0.c);
        else {
472:        v1 = p2.getBundleExtra("challenge_response");
488:        this.U.l.a(v0.f, v1.getString(v0.e.b));
503:        this.U.l.a(v0.g, v1.getString(v0.e.c));
510:        this.U.e.a(v0.b);
        }
464:    this.U.r.remove(v6);
467:    v0 = 1;
468:    goto 32;
520:    v0 = (com.google.wireless.android.finsky.dfe.c.a.f)ParcelableProto.a(this.U.r, v6);
522:    if (p1 == -1 && v0.b != 0)
532:        this.U.e.a(v0.b);
543:    else if (p1 == 0 && v0.c != 0)
553:        this.U.e.a(v0.c);
537:    this.U.r.remove(v6);
540:    v0 = 1;
541:    goto 32;
563:    v0 = (com.google.wireless.android.finsky.dfe.c.a.u)ParcelableProto.a(this.U.r, v6);
565:    if (-1 == p1)
571:        this.U.e.a(v0.b);
        else
586:        this.U.e.a(v0.c);
576:    this.U.r.remove(v6);
579:    v0 = 1;
580:    goto 32;
    }

    public void onBackPressed() {
        this.N.a(0);
    }

    protected void onCreate(Bundle p0) {
        ((com.google.android.finsky.billing.acquire.d)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.acquire.d)).a(this);
        super.onCreate(p0);
        this.ac = 0;
        this.ad = com.google.android.finsky.billing.acquire.g.b.d;
        v21 = (Account)this.getIntent().getParcelableExtra("AcquireActivity.account");
        this.aa = (PurchaseParams)this.getIntent().getParcelableExtra("AcquireActivity.purchaseParams");
        this.R = this.y.j(v21.name);
        if (this.R.a(12643664) && this.aa != 0 && this.aa.n != 0) {
            v5 = com.google.android.wallet.common.util.a.a(this);
            if (v5 == 0)
                throw new NullPointerException();
            this.aa.n.a = this.aa.n.a | 1024;
            this.aa.n.n = v5;
        }
        this.ab = (Document)this.getIntent().getParcelableExtra("AcquireActivity.doc");
        this.T = 1;
        if (this.ab != 0 && this.aa.a()) {
            v4 = this.ab.e(this.aa.d);
            if (v4 != 0)
                this.T = v4.n;
        }
        this.k();
        this.ae = (com.google.wireless.android.finsky.dfe.c.a.eb)ParcelableProto.a(this.getIntent(), "AcquireActivity.redeemParam");
        this.af = this.getIntent().getIntExtra("AcquireActivity.rootUiElementType", 0);
        this.ag = this.getIntent().getBooleanExtra("AcquireActivity.topupRequest", 0);
        this.ah = this.w.a(v21.name);
        this.ai = this.getIntent().getBooleanExtra("AcquireActivity.logPair", 1);
        this.S = this.u.a(p0, this.getIntent());
        if (this.ai != 0 && (p0 == 0 || this.R.a(12632963)))
            this.S.a(this.c(600).a, 0);
        this.aj = this.R.a(12635221);
        if (p0 == 0 && this.aj != 0)
            this.S.a(this.c(602).a, 0);
        if (this.G.b()) {
            this.G.f();
            this.finish();
        }
        else if (!this.z.a()) {
            this.startActivity(this.F.e(this));
            this.finish();
        }
        else {
            if (this.R.a(12610657))
                com.google.android.wallet.redirect.b.a(this.getApplicationContext(), new com.google.android.finsky.billing.acquire.j());
            if (this.N == 0) {
                if (!this.R.a(12633549))
                    v8 = 1;
                else
                    v8 = 0;
                this.J = new com.google.android.finsky.billing.b.d(this.S, this.aa, this.af, v8, this);
                if (this.R.a(12638615))
                    v17 = this.x.a();
                else
                    v17 = 0;
                this.W = new com.google.android.finsky.dialogbuilder.b.a(p0);
                this.O = new com.google.android.finsky.dialogbuilder.b.f(p0);
                this.P = new com.google.android.finsky.dialogbuilder.b.h(p0);
                new com.google.android.finsky.billing.common.r();
                this.L = new com.google.android.finsky.billing.c.b(new com.google.android.finsky.billing.e.k(this, this.S), v21, this.P, this.R.a(12635441), p0);
                this.X = new com.google.android.finsky.billing.c.a(this, v21, new com.google.android.finsky.billing.e.e(android.support.v4.c.a.a.a(this)), new com.google.android.finsky.billing.c.h(this, this.R, p0), this.L, this.z, this.D, this.H, p0);
                this.M = new com.google.android.finsky.dialogbuilder.b.c(this.O, this.P, p0);
                this.Q = new com.google.android.finsky.dialogbuilder.b.j(this.J, p0);
                if (this.K == 0)
                    this.K = this.a(v21, p0);
                v4 = new com.google.android.finsky.billing.b.n(v21, this.S, this.B, this.C, new com.google.android.finsky.billing.acquire.m(this), this.v, this, new com.google.android.finsky.billing.common.a(this), this.R);
                if (this.aa != 0)
                    v15 = new com.google.android.finsky.billing.acquire.c(this, this.aa.a.d);
                else
                    v15 = new com.google.android.finsky.billing.acquire.c(this, 0);
                this.Y = new com.google.android.finsky.billing.b.c(this, this.R, this.I, p0);
                this.V = new com.google.android.finsky.billing.b.g(this.getLoaderManager(), new com.google.android.finsky.billing.b.m(this, this.ah, v17, this.J, this.X, v4, this.W, this.P, this.K, v15, this.R), this.aa, this.ab, this.P, new com.google.android.finsky.billing.b.a(this.aa), v4, this.X, this.K, this.J, this.W, new com.google.android.finsky.dialogbuilder.b.b(), this.E.a(this, v21.name), new Handler(), v21, p0, this.ae, com.google.android.finsky.billing.common.f.b(this), this.Y, this.ag);
                if (this.Z == 0)
                    this.Z = this.n();
                v32 = new com.google.android.finsky.billing.b.b;
                v32.<init>(this.y, this.H);
                this.U = new com.google.android.finsky.billing.acquire.a(v21, this.ab, this, this.X, this.L, this.V, this.P, this.K, this.S, this.J, this.Y, v32, p0);
                this.N = new com.google.android.finsky.dialogbuilder.e(this, this.W, this.U, new com.google.android.finsky.dialogbuilder.b.d(new Handler()), this.J, this.Z, this.V, this.P);
                this.K.d = this.N;
            }
            if (p0 != 0)
                this.ak = p0.getBoolean("AcquireActivity.startupComplete");
        }
    }

    protected void onDestroy() {
        super.onDestroy();
        com.google.android.wallet.common.pub.a.a.a = 0;
    }

    protected void onNewIntent(Intent p0) {
        super.onNewIntent(p0);
        this.K.i.a(p0);
    }

    protected void onPause() {
        super.onPause();
        this.Z.a();
    }

    protected void onResume() {
        super.onResume();
        this.Z.b();
    }

    public void onSaveInstanceState(Bundle p0) {
        super.onSaveInstanceState(p0);
        if (!this.O.b.isEmpty())
            p0.putBundle("DialogPrimaryActionEnabledModel.tags", this.O.b);
        p0.putBundle("AcquireActionHandler.actionBundle", this.U.r);
        if (this.M.c != 0)
            p0.putSerializable("DialogCalendarDateModel.date", this.M.c);
        if (this.L.e != 0) {
            p0.putBoolean("AcquireReauthModel.result", this.L.e.booleanValue());
            p0.putString("AcquireReauthModel.token", this.L.f);
            p0.putInt("AcquireReauthModel.retry", this.L.g);
            p0.putInt("AcquireReauthModel.status", this.L.h);
            p0.putBoolean("AcquireReauthModel.blank", this.L.k);
        }
        if (this.L.d != 0)
            p0.putString("AcquireReauthModel.input", this.L.d.a());
        p0.putBoolean("AcquireReauthModel.prefetch", this.L.l);
        if (this.P.a.size() != 0)
            p0.putBundle("DialogUserInputModel", this.P.a);
        if (this.Q.b.size() > 0)
            p0.putStringArrayList("DialogVisibilityModel.tags", new ArrayList(this.Q.b));
        if (this.V.E != 0)
            p0.putParcelable("AcquireRequestModel.showAction", ParcelableProto.a(this.V.E));
        if (this.V.D != 0)
            p0.putParcelable("AcquireRequestModel.completeAction", ParcelableProto.a(this.V.D));
        p0.putBoolean("AcquireOrchestrationModel.finishedEventLogged", this.K.g);
        if (this.K.c != 0)
            p0.putParcelable("AcquireOrchestrationModel.component", ParcelableProto.a(this.K.c));
        if (this.X.i != 0)
            p0.putInt("AcquireClientConfigModel.consumptionAppVersionCode", this.X.i.intValue());
        if (this.X.j != 0)
            p0.putParcelable("AcquireClientConfigModel.clientConfig", ParcelableProto.a(this.X.j));
        this.S.a(p0);
        this.W.a(p0);
        if (this.Y.a != 0)
            p0.putParcelable("purchaseParams", this.Y.a);
        p0.putBoolean("AcquireActivity.startupComplete", this.ak);
    }

    protected void onStart() {
        super.onStart();
        if (this.R.a(12643763)) {
            if (this.V.a() != 2) {
                if (this.ak != 0)
                    this.N.a();
                else
                    this.l();
            }
        }
        else {
            if (this.V.G != 0 && this.V.G.n != 0 && this.V.G.x != 0 && this.V.G.s == 0) {
                this.V.G.u = 1;
                this.V.G.forceLoad();
            }
            if (this.ak == 0)
                this.l();
        }
    }

}
