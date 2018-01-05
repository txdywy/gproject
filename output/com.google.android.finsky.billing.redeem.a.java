package com.google.android.finsky.billing.redeem;

import android.accounts.Account;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.u;
import android.text.TextUtils;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.api.m;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.common.RedeemCodeResult;
import com.google.android.finsky.billing.common.m;
import com.google.android.finsky.billing.common.o;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.billing.iab.w;
import com.google.android.finsky.billing.lightpurchase.LightPurchaseFlowActivity;
import com.google.android.finsky.billing.lightpurchase.PurchaseActivity;
import com.google.android.finsky.billing.lightpurchase.d.a;
import com.google.android.finsky.billing.redeem.a.a;
import com.google.android.finsky.billing.redeem.a.c;
import com.google.android.finsky.billing.redeem.a.d;
import com.google.android.finsky.billing.redeem.a.g;
import com.google.android.finsky.billing.w;
import com.google.android.finsky.br.a;
import com.google.android.finsky.br.b;
import com.google.android.finsky.cn.a;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.q;
import com.google.android.finsky.l.j;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.finsky.dfe.nano.ek;
import com.google.wireless.android.finsky.dfe.nano.el;
import com.google.wireless.android.finsky.dfe.nano.f;
import com.google.wireless.android.finsky.dfe.nano.h;
import com.google.wireless.android.finsky.dfe.nano.i;
import com.google.wireless.android.finsky.dfe.nano.k;
import com.google.wireless.android.finsky.dfe.nano.l;
import com.google.wireless.android.finsky.dfe.nano.m;

public final class com.google.android.finsky.billing.redeem.a extends com.google.android.finsky.billing.lightpurchase.d.a implements com.google.android.finsky.at.m, com.google.android.finsky.billing.common.t
{

    public String a;
    public com.google.android.finsky.billing.iab.w af;
    public com.google.android.finsky.br.a ag;
    public int b;
    public com.google.android.finsky.cv.a.ax c;
    public com.google.android.finsky.billing.redeem.c d;
    public int e;
    public RedeemCodeResult f;
    public boolean g;
    public Document h;
    public PurchaseFlowConfig i;

    a() {
        com.google.android.finsky.billing.lightpurchase.d.a();
        this.af = com.google.android.finsky.m.a.aE();
        this.ag = com.google.android.finsky.m.a.bn();
    }

    private final com.google.android.finsky.billing.redeem.b Z() {
        if (this.r instanceof com.google.android.finsky.billing.redeem.b)
            v0 = (com.google.android.finsky.billing.redeem.b)this.r;
        else if (this.h() instanceof com.google.android.finsky.billing.redeem.b)
            v0 = (com.google.android.finsky.billing.redeem.b)this.h();
        else
            v0 = 0;
        return v0;
    }

    public static com.google.android.finsky.billing.redeem.a a(String p0, int p1, com.google.android.finsky.cv.a.ax p2, int p3, String p4, int p5, String p6, PurchaseFlowConfig p7, String p8) {
        v0 = new Bundle();
        v0.putString("authAccount", p0);
        v0.putInt("RedeemCodeFragment.redemption_context", p1);
        v0.putParcelable("RedeemCodeFragment.docid", ParcelableProto.a(p2));
        v0.putInt("RedeemCodeFragment.offer_type", p3);
        v0.putString("RedeemCodeFragment.prefill_code", p4);
        v0.putInt("RedeemCodeSidecar.im_theme_res_id", p5);
        v0.putString("RedeemCodeFragment.partner_payload", p6);
        v0.putString("RedeemCodeFragment.pcampaign_id", p8);
        com.google.android.finsky.billing.common.m.a(v0, p7);
        v1 = new com.google.android.finsky.billing.redeem.a();
        v1.f(v0);
        return v1;
    }

    private final boolean a(Account p0, Document p1, String p2) {
        v7 = 0;
        if (this.b == 1 && this.c.c == 1)
            this.f = new RedeemCodeResult(this.f.a, this.f.b, 1, this.f.d, this.f.e, p2);
        else {
            this.h = p1;
            this.startActivityForResult(LightPurchaseFlowActivity.a(p0, p1, 0, 1, 0, p1.a.D, 0, 0, p2, 0, 1, this.aJ), 2);
            v7 = 1;
        }
        return v7;
    }

    protected final int W() {
        if (this.c != 0)
            v0 = this.c.d;
        else if (this.d != 0) {
            v0 = this.d.X();
            if (v0 != 0)
                v0 = v0.a.f;
            else
                v0 = 0;
        }
        else
            v0 = 0;
        return v0;
    }

    public final void X() {
        if (this.f != 0) {
            v0 = this.d.W().b;
            if (v0 != 0 && this.a(v0)) {
                FinskyLog.a("Dialog shown, waiting for user input.", new Object[0]);
                return;
            }
        }
        this.Y();
    }

    public final void Y() {
        v0 = this.Z();
        if (v0 == 0)
            FinskyLog.e("No listener.", new Object[0]);
        else
            v0.h();
    }

    public final void a(int p0, int p1, Intent p2) {
        switch (p0) {
            case 2:
                if (p1 == -1) {
                    if (this.h != 0)
                        this.a(com.google.android.finsky.m.a.bo().a(this.h(), this.h, this.aJ));
                    else
                        FinskyLog.e("Could not get the installed document.", new Object[0]);
                }
                this.Y();
                break;
            default:
                super.a(p0, p1, p2);
                break;
        }
    }

    public final void a(int p0, Bundle p1) {
        if (p0 == 1) {
            this.a(com.google.android.finsky.m.a.bo().a(this.h(), p1.getString("dialog_details_url"), this.aJ));
            this.Y();
        }
    }

    public final void a(com.google.android.finsky.billing.common.s p0) {
        v5 = 0;
        if (p0 != this.d) {
            v1 = new Object[1];
            v1[0] = p0;
            FinskyLog.e("Received state change for unknown fragment: %s", v1);
            return;
        }
        if (this.d.ag <= this.e) {
            v1 = new Object[1];
            v1[0] = Integer.valueOf(this.e);
            FinskyLog.a("Already received state instance %d, ignore.", v1);
            return;
        }
        v1 = new Object[1];
        v1[0] = Integer.valueOf(this.d.l);
        FinskyLog.b("State changed: %d", v1);
        this.e = this.d.ag;
        v7 = this.Z();
        if (v7 == 0)
            FinskyLog.c("No listener.", new Object[0]);
        switch (this.d.l) {
            case 0:
                v0 = this.q.getString("RedeemCodeFragment.prefill_code");
                if (!TextUtils.isEmpty(v0)) {
                    this.g = 1;
                    this.a(v0);
                }
                else
                    this.a(com.google.android.finsky.billing.redeem.a.d.a(this.a, v0, 0, this.i));
                break;
            case 1:
                this.aj();
                break;
            case 2:
                if (this.b == 1) {
                    if (this.d.l != 2) {
                        v2 = new Object[1];
                        v2[0] = Integer.valueOf(this.d.l);
                        FinskyLog.e("Invalid state: %d", v2);
                        v0 = 0;
                    }
                    else if (this.d.c.p != 0)
                        v0 = com.google.android.finsky.billing.iab.w.a(this.d.c.p);
                    else
                        v0 = com.google.android.finsky.billing.iab.w.a(this.d.c.o, this.d.b.i);
                    v4 = v0;
                }
                else
                    v4 = 0;
                if (this.d.l != 2) {
                    v2 = new Object[1];
                    v2[0] = Integer.valueOf(this.d.l);
                    FinskyLog.e("Invalid state: %d", v2);
                    v1 = 0;
                }
                else
                    v1 = this.d.c.h;
                if (this.d.l != 2) {
                    v6 = new Object[1];
                    v6[0] = Integer.valueOf(this.d.l);
                    FinskyLog.e("Invalid state: %d", v6);
                    v2 = 0;
                }
                else
                    v2 = this.d.c.i;
                this.f = new RedeemCodeResult(v1, v2, 0, v4, 0, 0);
                if (this.b == 3) {
                    v0 = this.d.X();
                    if (this.d.c == 0) {
                    }
                    else
                        v5 = this.d.c.k;
                    if (v0 != 0) {
                        if (com.google.android.finsky.dfemodel.q.a(v0.d())) {
                            if (v5 != 0) {
                                if (v5.d == 3)
                                    this.af.a(this.h(), v5.b);
                            }
                        }
                    }
                }
                if (v7 != 0 && v7.a(this.d.X()))
                    this.Y();
                else {
                    v0 = this.d.W();
                    v1 = com.google.android.finsky.billing.w.a(v0);
                    if (v1 == 0)
                        this.X();
                    else {
                        v0 = com.google.android.finsky.billing.w.a(v0, v1);
                        com.google.android.finsky.m.a.aH().b(v0, this.i);
                        v1 = new com.google.android.finsky.billing.redeem.a.g();
                        v1.f(v0);
                        this.a(v1);
                    }
                }
                break;
            case 3:
                if (this.d.af == 1 && this.d.e != 0)
                    v1 = com.google.android.finsky.api.m.a(this.h(), this.d.e);
                else
                    v1 = this.d.d;
                v2 = new Object[1];
                v2[0] = v1;
                FinskyLog.a("Redemption error: %s", v2);
                if (v7 != 0 && v7.a(v1))
                    this.Y();
                else if (this.ax instanceof com.google.android.finsky.billing.redeem.a.d) {
                    this.ak();
                    ((com.google.android.finsky.billing.redeem.a.d)this.ax).a(v1);
                }
                else {
                    this.g = 0;
                    if (this.d.b == 0) {
                    }
                    else
                        v5 = this.d.b.b;
                    this.a(com.google.android.finsky.billing.redeem.a.d.a(this.a, v5, v1, this.i));
                }
                break;
            case 4:
                if (this.d.l != 4) {
                    v2 = new Object[1];
                    v2[0] = Integer.valueOf(this.d.l);
                    FinskyLog.e("Invalid state: %d", v2);
                }
                else
                    v5 = this.d.c.d;
                v2 = new Bundle();
                v2.putParcelable("ConfirmationStep.challenge", ParcelableProto.a(v5));
                v2.putBoolean("ConfirmationStep.code_screen_skipped", this.g);
                com.google.android.finsky.m.a.aH().b(v2, this.i);
                v0 = new com.google.android.finsky.billing.redeem.a.a();
                v0.b = v5;
                v0.f(v2);
                this.a(v0);
                break;
            case 5:
                if (this.d.l != 5) {
                    v4 = new Object[1];
                    v4[0] = Integer.valueOf(this.d.l);
                    FinskyLog.e("Invalid state: %d", v4);
                }
                else
                    v5 = this.d.c.m;
                v2 = new com.google.android.finsky.billing.redeem.a.c();
                v2.f(com.google.android.finsky.billing.redeem.a.c.a(this.a, v5, this.q.getInt("RedeemCodeSidecar.im_theme_res_id")));
                this.a(v2);
                break;
            default:
                v1 = new Object[1];
                v1[0] = Integer.valueOf(this.d.l);
                FinskyLog.e("Unknown sidecar state: %d", v1);
                break;
        }
    }

    public final void a(String p0) {
        if (p0 == 0)
            throw new NullPointerException();
        this.d.b.a = this.d.b.a | 1;
        this.d.b.b = p0;
        this.d.a(this.aJ);
    }

    public final boolean a(com.google.wireless.android.finsky.dfe.nano.l p0) {
        v2 = com.google.android.finsky.m.a.U().b(this.a);
        if (p0.c != 0) {
            v1 = new Document(p0.c.a);
            if (this.b == 1 && com.google.android.finsky.dfemodel.q.a(this.c))
                v0 = 0;
            else {
                v0 = v1.N().k;
                if (new com.google.android.finsky.l.j(com.google.android.finsky.m.a.aN()).a(v1.N()).a(com.google.android.finsky.m.a.L().a(v0)).e()) {
                    v0 = this.h().getPackageManager().getLaunchIntentForPackage(v0);
                    if (v0 == 0)
                        v0 = com.google.android.finsky.m.a.bo().a(this.h(), v1, this.aJ);
                    this.a(v0);
                    v0 = 0;
                }
                else
                    v0 = this.a(v2, v1, 0);
            }
            return v0;
        }
        if (p0.a != 0) {
            v0 = this.ag.a(this.h(), v2, new Document(p0.a.a), this.B, this, 1, 0);
            return v0;
        }
        if (p0.b != 0)
            this.a(com.google.android.finsky.m.a.bo().a(this.h(), this.aJ));
        else if (p0.d != 0) {
            v0 = this.d.X();
            v1 = new Document(p0.d.b);
            if (com.google.android.finsky.dfemodel.q.a(v1.d())) {
                if (this.b == 1 && com.google.android.finsky.dfemodel.q.a(this.c) && this.c.b.equals(v1.a.d)) {
                    this.f = new RedeemCodeResult(this.f.a, this.f.b, 1, this.f.d, this.f.e, v0.a.c);
                    v0 = 0;
                }
                else {
                    this.a(PurchaseActivity.a(v2, this.af.a(this.g(), v1.d(), v0.a.c, com.google.android.finsky.m.a.dj()), v1.a.D, 0, this.aJ));
                    v0 = 0;
                }
                return v0;
            }
            if (v1.a.e == 1) {
                v0 = this.a(v2, v1, v0.a.c);
                return v0;
            }
            v2 = PurchaseParams.b().a(v1);
            v2.d = p0.d.c;
            v2.j = v0.a.c;
            this.a(PurchaseActivity.a(this.aw, v2.a(), v1.a.D, 0, this.aJ));
        }
        else if (p0.e != 0) {
            if (p0.e.a != 0)
                this.f = new RedeemCodeResult(this.f.a, this.f.b, this.f.c, this.f.d, p0.e.a, this.f.a());
            else
                FinskyLog.e("Unexpected missing link", new Object[0]);
        }
        else
            FinskyLog.c("Unsupported PostSuccessAction.", new Object[0]);
        v0 = 0;
        return v0;
    }

    public final void b(int p0, Bundle p1) {
        if (p0 == 1)
            this.Y();
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.a = this.q.getString("authAccount");
        this.b = this.q.getInt("RedeemCodeFragment.redemption_context");
        this.c = (com.google.android.finsky.cv.a.ax)ParcelableProto.a(this.q, "RedeemCodeFragment.docid");
        this.i = com.google.android.finsky.billing.common.m.a(this.q);
        if (this.b == 1 && this.c == 0)
            throw new IllegalStateException("Null docid in purchase context.");
        if (p0 != 0) {
            this.e = p0.getInt("RedeemCodeFragment.last_state_instance");
            this.f = (RedeemCodeResult)p0.getParcelable("RedeemCodeFragment.redeem_code_result");
            this.g = p0.getBoolean("RedeemCodeFragment.code_screen_skipped");
            this.h = (Document)p0.getParcelable("RedeemCodeSidecar.app_to_install");
        }
    }

    public final void e(Bundle p0) {
        super.e(p0);
        p0.putInt("RedeemCodeFragment.last_state_instance", this.e);
        p0.putParcelable("RedeemCodeFragment.redeem_code_result", this.f);
        p0.putBoolean("RedeemCodeFragment.code_screen_skipped", this.g);
        p0.putParcelable("RedeemCodeSidecar.app_to_install", this.h);
    }

    public final void f_(int p0) {
    }

    public final void g_() {
        this.d = (com.google.android.finsky.billing.redeem.c)this.B.a("RedeemCodeFragment.sidecar");
        if (this.d == 0) {
            v7 = new Bundle();
            v7.putString("authAccount", this.a);
            v7.putInt("RedeemCodeSidecar.redemption_context", this.b);
            v7.putParcelable("RedeemCodeSidecar.docid", ParcelableProto.a(this.c));
            v7.putInt("RedeemCodeSidecar.offer_type", this.q.getInt("RedeemCodeFragment.offer_type"));
            v7.putInt("RedeemCodeSidecar.im_theme_res_id", this.q.getInt("RedeemCodeSidecar.im_theme_res_id"));
            v7.putString("RedeemCodeSidecar.partner_payload", this.q.getString("RedeemCodeFragment.partner_payload"));
            v7.putString("RedeemCodeSidecar.pcampaign_id", this.q.getString("RedeemCodeFragment.pcampaign_id"));
            v0 = new com.google.android.finsky.billing.redeem.c();
            v0.f(v7);
            this.d = v0;
            this.B.a().a(this.d, "RedeemCodeFragment.sidecar").c();
        }
        this.d.a(this);
        super.g_();
    }

    public final void h_() {
        this.d.a(0);
        super.h_();
    }

}
