package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.p;
import android.support.v4.app.u;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.m;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.api.VoucherParams;
import com.google.android.finsky.api.m;
import com.google.android.finsky.aw.a;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.billing.addresschallenge.AddressChallengeActivity;
import com.google.android.finsky.billing.common.PurchaseError;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.common.RedeemCodeResult;
import com.google.android.finsky.billing.common.f;
import com.google.android.finsky.billing.common.h;
import com.google.android.finsky.billing.common.i;
import com.google.android.finsky.billing.common.m;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.billing.common.v;
import com.google.android.finsky.billing.e.a;
import com.google.android.finsky.billing.e.b;
import com.google.android.finsky.billing.e.j;
import com.google.android.finsky.billing.f.a;
import com.google.android.finsky.billing.g;
import com.google.android.finsky.billing.gifting.b;
import com.google.android.finsky.billing.l;
import com.google.android.finsky.billing.legacyauth.AuthState;
import com.google.android.finsky.billing.legacyauth.a;
import com.google.android.finsky.billing.lightpurchase.b.a;
import com.google.android.finsky.billing.lightpurchase.b.b;
import com.google.android.finsky.billing.lightpurchase.d.a;
import com.google.android.finsky.billing.lightpurchase.d.d;
import com.google.android.finsky.billing.lightpurchase.d.f;
import com.google.android.finsky.billing.lightpurchase.d.h;
import com.google.android.finsky.billing.lightpurchase.e.a;
import com.google.android.finsky.billing.lightpurchase.e.aa;
import com.google.android.finsky.billing.lightpurchase.e.ab;
import com.google.android.finsky.billing.lightpurchase.e.ac;
import com.google.android.finsky.billing.lightpurchase.e.ad;
import com.google.android.finsky.billing.lightpurchase.e.ae;
import com.google.android.finsky.billing.lightpurchase.e.b;
import com.google.android.finsky.billing.lightpurchase.e.g;
import com.google.android.finsky.billing.lightpurchase.e.k;
import com.google.android.finsky.billing.lightpurchase.e.n;
import com.google.android.finsky.billing.lightpurchase.e.r;
import com.google.android.finsky.billing.lightpurchase.e.x;
import com.google.android.finsky.billing.p;
import com.google.android.finsky.billing.payments.f;
import com.google.android.finsky.billing.profile.BillingProfileActivity;
import com.google.android.finsky.billing.profile.CatchAbandonmentActivity;
import com.google.android.finsky.billing.redeem.RedeemCodeActivity;
import com.google.android.finsky.billing.u;
import com.google.android.finsky.billing.w;
import com.google.android.finsky.br.a;
import com.google.android.finsky.br.b;
import com.google.android.finsky.by.a;
import com.google.android.finsky.by.c;
import com.google.android.finsky.by.h;
import com.google.android.finsky.by.l;
import com.google.android.finsky.by.o;
import com.google.android.finsky.ce.a;
import com.google.android.finsky.cn.a;
import com.google.android.finsky.cv.a.am;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.jp;
import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.t;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.b;
import com.google.android.finsky.download.a;
import com.google.android.finsky.installer.k;
import com.google.android.finsky.l.j;
import com.google.android.finsky.m;
import com.google.android.finsky.settings.SettingsActivity;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.play.utils.b.a;
import com.google.wireless.android.finsky.a.a.ae;
import com.google.wireless.android.finsky.a.a.k;
import com.google.wireless.android.finsky.a.a.l;
import com.google.wireless.android.finsky.a.a.m;
import com.google.wireless.android.finsky.dfe.nano.ez;
import com.google.wireless.android.finsky.dfe.nano.f;
import com.google.wireless.android.finsky.dfe.nano.fa;
import com.google.wireless.android.finsky.dfe.nano.i;
import com.google.wireless.android.finsky.dfe.nano.k;
import com.google.wireless.android.finsky.dfe.nano.l;
import com.google.wireless.android.finsky.dfe.nano.u;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class com.google.android.finsky.billing.lightpurchase.am extends com.google.android.finsky.billing.lightpurchase.d.a implements com.google.android.finsky.at.m, com.google.android.finsky.billing.common.t, com.google.android.finsky.billing.lightpurchase.aq, com.google.android.finsky.billing.lightpurchase.e.j, com.google.android.finsky.billing.u
{

    public final com.google.android.finsky.d.t a;
    public Bundle af;
    public Bundle ag;
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
    public com.google.android.finsky.billing.f.a ar;
    public com.google.android.finsky.billing.common.i as;
    public com.google.android.finsky.br.a at;
    public com.google.android.finsky.installer.k b;
    public com.google.android.finsky.billing.lightpurchase.i c;
    public com.google.android.finsky.billing.gifting.b d;
    public int e;
    public int f;
    public int g;
    public PurchaseParams h;
    public VoucherParams i;

    am() {
        com.google.android.finsky.billing.lightpurchase.d.a();
        this.a = com.google.android.finsky.m.a.aP();
        this.e = -1;
        this.af = new Bundle();
        this.ag = new Bundle();
        this.ar = com.google.android.finsky.billing.f.a.a;
        this.as = com.google.android.finsky.m.a.aG();
        this.at = com.google.android.finsky.m.a.bn();
    }

    public static com.google.android.finsky.billing.lightpurchase.am a(Account p0, PurchaseParams p1, Bundle p2, com.google.android.finsky.d.w p3) {
        v0 = new Bundle();
        v0.putParcelable("MultiStepFragment.account", p0);
        v0.putParcelable("PurchaseFragment.params", p1);
        v0.putBundle("PurchaseFragment.appDownloadSizeWarningArgs", p2);
        p3.a(v0);
        v1 = new com.google.android.finsky.billing.lightpurchase.am();
        v1.f(v0);
        return v1;
    }

    private final void a(CheckoutPurchaseError p0, boolean p1) {
        if (this.c.aj != 0)
            v0 = 1;
        else
            v0 = 0;
        if (v0 != 0)
            v0 = com.google.android.finsky.billing.lightpurchase.e.ac.a(p0, p1, this.c.ac());
        else
            v0 = com.google.android.finsky.billing.lightpurchase.e.ac.a(p0, p1);
        this.a(v0);
    }

    private final void a(com.google.wireless.android.finsky.dfe.nano.u p0) {
        this.startActivityForResult(BillingProfileActivity.a(this.h(), this.aw, this.c.ab(), this.h.a, this.h.d, p0, this.c.ac(), this.aJ, 1), 1);
    }

    private final void a(boolean p0) {
        this.a.b(this.aJ, "purchase_fragment_cart_details");
        v4 = this.c.ac();
        v5 = new Bundle();
        v6 = new com.google.android.finsky.billing.lightpurchase.e.k();
        v5.putInt("CartDetailsStep.backend", this.h.a.d);
        v5.putInt("CartDetailsStep.documentType", this.h.a.c);
        v5.putParcelable("CartDetailsStep.cart", ParcelableProto.a(this.c.g));
        v5.putBoolean("CartDetailsStep.continueToInstrumentManager", p0);
        v5.putParcelable("CartDetailsStep.giftEmailParams", this.c.aw);
        v5.putBoolean("CartDetailsStep.isPriceColorOverridden", v4.a("ALL_PRICE", "COLOR"));
        com.google.android.finsky.m.a.aH().a(v5, v4, "CART_CONTINUE_BUTTON");
        v6.f(v5);
        v6.d = this.c.g;
        this.a(v6);
    }

    private final boolean a(Intent p0, int p1) {
        v2 = 0;
        if (p0 != 0) {
            v1 = (com.google.android.finsky.cv.a.am)ParcelableProto.a(p0, "BillingProfileActiivty.catchAbandonmentDialog");
            v4 = System.currentTimeMillis();
            if (v1 != 0) {
                if (((Integer)com.google.android.finsky.aa.a.bn.b(this.aw.name).a()).intValue() <= 0)
                    v0 = 0;
                else {
                    if (TimeUnit.HOURS.toMillis((long)v1.k) + ((Long)com.google.android.finsky.aa.a.bo.b(this.aw.name).a()).longValue() >= v4)
                        v0 = 1;
                    else
                        v0 = 0;
                    v8 = new Object[2];
                    v8[0] = Boolean.valueOf(v0);
                    v8[1] = FinskyLog.a(this.aw.name);
                    FinskyLog.b("is_snoozed=%b (account=%s)", v8);
                }
                if (v0 == 0) {
                    com.google.android.finsky.aa.a.bn.b(this.aw.name).a(Integer.valueOf(((Integer)com.google.android.finsky.aa.a.bn.b(this.aw.name).a()).intValue() + 1));
                    com.google.android.finsky.aa.a.bo.b(this.aw.name).a(Long.valueOf(v4));
                    v4 = new Object[1];
                    v4[0] = FinskyLog.a(this.aw.name);
                    FinskyLog.b("Snoozing (account=%s)", v4);
                    this.startActivityForResult(CatchAbandonmentActivity.a(this.h(), v1, this.h.a.d, this.aw.name, this.c.ac(), this.aJ), p1);
                    v2 = 1;
                }
            }
        }
        return v2;
    }

    private final boolean a(RedeemCodeResult p0) {
        v0 = 1;
        if (p0 == 0)
            v0 = 0;
        else if (p0.c != 0) {
            v1 = p0.a();
            if (!TextUtils.isEmpty(v1)) {
                this.i = new VoucherParams(v1, 1, 1);
                this.a(0);
            }
            else {
                this.an = 1;
                this.at();
            }
        }
        else {
            this.ak = 1;
            this.al = p0.d;
            this.ac();
        }
        return v0;
    }

    private final com.google.android.finsky.billing.gifting.b ar() {
        return (com.google.android.finsky.billing.gifting.b)this.B.a("PurchaseFragment.giftingSidecar");
    }

    private final void as() {
        v3 = new com.google.android.finsky.billing.lightpurchase.e.aa();
        v3.f(com.google.android.finsky.billing.lightpurchase.e.aa.a(this.aw.name, this.c.ap.f.b, com.google.android.finsky.billing.payments.f.a(this.W())));
        this.a(v3);
    }

    private final void at() {
        if (this.h.a.c == 1) {
            v0 = com.google.android.finsky.m.a.bW();
            v1 = v0.a();
            v0 = v0.a(0);
            if (v1 != 0 && v0 == 2 && !com.google.android.finsky.m.a.q().b()) {
                if (this.h.c != 0)
                    v0 = com.google.android.finsky.m.a.d().c(this.h.c);
                else
                    v0 = 0;
                com.google.android.finsky.billing.g.a(this, this.aw.name, v0, this.aJ).a(this.B, "PurchaseFragment.downloadNetworkDialog");
            }
            else if (this.ai != 0) {
                if (v1 == 0 || v0 == 1)
                    com.google.android.finsky.billing.p.a(this, this.aw.name, this.ai, this.aJ).a(this.B, "PurchaseFragment.appDownloadSizeWarningDialog");
                else
                    this.au();
            }
            else
                this.au();
        }
        else
            this.au();
    }

    private final void au() {
        v0 = com.google.android.finsky.m.a.bW();
        if (this.h.a.c == 1 && v0.a() && v0.a(0) == 3)
            this.b.b(this.h.a.b);
        if (this.an != 0) {
            this.c.a(this.aJ);
            this.ac();
        }
        else
            this.av();
    }

    private final void av() {
        this.c.a(this.ag, this.as.a(this.h(), this.aw.name), this.aJ);
    }

    private final PurchaseFlowConfig aw() {
        if (com.google.android.finsky.m.a.j(this.aw.name).a(12619928))
            v0 = this.c.ac();
        else
            v0 = PurchaseFlowConfig.a;
        return v0;
    }

    private final boolean b(String p0) {
        if (TextUtils.isEmpty(p0))
            v0 = 0;
        else {
            this.ah = p0;
            this.a(0);
            v0 = 1;
        }
        return v0;
    }

    public final void U_() {
        this.a(new Intent("android.settings.WIFI_SETTINGS"));
    }

    public final void V_() {
        v1 = new Object[1];
        v1[0] = this.h.a.b;
        FinskyLog.a("Download size warning dismissed for app = %s", v1);
    }

    protected final int W() {
        return this.h.a.d;
    }

    public final void W_() {
        this.au();
    }

    public final void X() {
        if (this.c.l != 7) {
            v2 = new Object[1];
            v2[0] = Integer.valueOf(this.c.l);
            FinskyLog.e("switchToFamilyManagerChallenge() called in state %d", v2);
        }
        this.c.b(12, 0);
    }

    public final void Y() {
        this.a(0);
    }

    public final void Z() {
        if (this.c.l != 4) {
            v2 = new Object[1];
            v2[0] = Integer.valueOf(this.c.l);
            FinskyLog.e("switchFromChangeSubscriptionToCart() called in state %d", v2);
        }
        this.c.b(5, 0);
    }

    public final void a(int p0, int p1, Intent p2) {
  1:    v2 = 0;
  2:    v1 = 1;
  4:    switch (p0) {
            case 1:
  4:            goto 18;
            case 2:
  4:            goto 115;
            case 3:
  4:            goto 132;
            case 4:
  4:            goto 159;
            case 5:
  4:            goto 115;
            case 6:
  4:            goto 235;
            case 7:
  4:            goto 276;
            case 8:
  4:            goto 281;
            case 9:
  4:            goto 288;
            default:
        }
  7:    if (v2 == 0)
 11:        this.a(this.ax);
 14:    super.a(p0, p1, p2);
 17:    return;
 18:    if (p1 != -1) goto 59;
 26:    v0 = this.b(p2.getStringExtra("BillingProfileActivity.selectedInstrumentId"));
 30:    if (v0 == 0)
 40:        v0 = this.a((RedeemCodeResult)p2.getParcelableExtra("BillingProfileActivity.redeemPromoCodeResult"));
 44:    if (v0 == 0) {
 50:        FinskyLog.c("Missing instrumentId or redemption result", new Object[0]);
 53:        this.a(0);
 56:        v0 = 1;
        }
 57:    v2 = v0;
 58:    goto 7;
 64:    if (this.c.l != 6) goto 103;
 70:    if (this.c.ap == 0) goto 103;
 78:    if (this.c.ap.j == 0) goto 103;
 88:    if (this.c.ap.j.c != 0) goto 103;
 96:    if (!this.a(p2, 9))
 98:        this.ac();
101:    v2 = 1;
102:    goto 7;
103:    if (p1 != 0) {
  7:        if (v2 == 0)
 11:            this.a(this.ax);
 14:        super.a(p0, p1, p2);
 17:        return;
        }
111:    if (!this.a(p2, 8)) {
  7:        if (v2 == 0)
 11:            this.a(this.ax);
 14:        super.a(p0, p1, p2);
 17:        return;
        }
113:    v2 = 1;
114:    goto 7;
115:    if (p1 != -1) goto 128;
123:    v2 = this.a(p2.getBundleExtra("challenge_response"));
127:    goto 7;
128:    this.ac();
131:    goto 113;
132:    if (p1 == -1) {
140:        v0 = (RedeemCodeResult)p2.getParcelableExtra("redeem_code_result");
142:        if (v0 != 0) {
146:            v1 = this.b(v0.a);
150:            if (v1 == 0)
152:                v0 = this.a(v0);
                else
300:                v0 = v1;
            }
            else
303:            v0 = 0;
156:        v2 = v0;
        }
157:    goto 7;
163:    if (!(this.ax instanceof com.google.android.finsky.billing.lightpurchase.e.b)) goto 222;
173:    v3 = com.google.android.finsky.billing.e.j.b(((com.google.android.finsky.billing.lightpurchase.e.b)this.ax).an.name);
179:    if (v3 == ((com.google.android.finsky.billing.lightpurchase.e.b)this.ax).f) goto 220;
184:    v5 = new Object[2];
192:    v5[0] = Integer.valueOf(((com.google.android.finsky.billing.lightpurchase.e.b)this.ax).f);
198:    v5[1] = Integer.valueOf(v3);
200:    FinskyLog.a("PurchaseAuth changed from %d to %d.", v5);
203:    if (v3 != 0) goto 217;
211:    ((com.google.android.finsky.billing.lightpurchase.aq)((com.google.android.finsky.billing.lightpurchase.e.b)this.ax).aa()).Y();
214:    v2 = v1;
215:    goto 7;
217:    ((com.google.android.finsky.billing.lightpurchase.e.b)this.ax).ab();
220:    v1 = 0;
221:    goto 214;
224:    v1 = new Object[1];
228:    v1[0] = this.ax;
230:    FinskyLog.e("Unexpected fragment: %s", v1);
233:    goto 7;
235:    if (p1 == -1)
268:        this.a(com.google.android.finsky.m.a.bo().a(this.h(), new Document(this.c.an.b.c.a), this.aJ));
271:    this.ac();
274:    goto 113;
276:    this.ac();
279:    goto 113;
281:    if (p1 != -1) {
  7:        if (v2 == 0)
 11:            this.a(this.ax);
 14:        super.a(p0, p1, p2);
 17:        return;
        }
283:    this.a(0);
286:    goto 113;
288:    if (p1 == -1)
290:        this.a(0);
        else
295:        this.ac();
293:    goto 113;
    }

    public final void a(int p0, Bundle p1) {
        if (p0 == 101) {
            this.a(com.google.android.finsky.m.a.bo().a(this.h(), p1.getString("dialog_details_url"), this.aJ));
            this.ac();
        }
    }

    public final void a(int p0, boolean p1) {
  8:    switch (p0) {
            case 3:
112:            break;
            default:
 13:            v2 = new Object[1];
 15:            v2[0] = this.h.a.b;
 17:            FinskyLog.a("Will queue %s to be downloaded over any network", v2);
 22:            this.b.a(this.h.a.b);
 25:            if (p1 == 0) {
 85:                this.au();
 88:                return;
                }
 39:            if (((Boolean)com.google.android.finsky.aa.a.z.a()).booleanValue()) {
 85:                this.au();
 88:                return;
                }
 53:            v1 = new com.google.android.finsky.billing.l();
 56:            if (this == 0) {
 66:                v1.f(com.google.android.finsky.billing.l.a(this.aw.name, this.aJ));
 73:                v1.a(this.B, "PurchaseFragment.downloadNetworkDialog");
 82:                com.google.android.finsky.aa.a.z.a(Boolean.valueOf(1));
 85:                this.au();
 88:                return;
                }
 60:            if (!(this instanceof com.google.android.finsky.billing.u))
111:                throw new IllegalArgumentException("targetFragment must implement PreAppDownloadWarnings.Listener");
 63:            v1.a(this, -1);
 66:            v1.f(com.google.android.finsky.billing.l.a(this.aw.name, this.aJ));
 73:            v1.a(this.B, "PurchaseFragment.downloadNetworkDialog");
 82:            com.google.android.finsky.aa.a.z.a(Boolean.valueOf(1));
 85:            this.au();
 88:            return;
        }
 91:    v2 = new Object[1];
 93:    v2[0] = this.h.a.b;
 95:    FinskyLog.a("Will queue %s to be downloaded on wifi only", v2);
100:    this.b.b(this.h.a.b);
103:    goto 25;
    }

    public final void a(Activity p0) {
        super.a(p0);
        if (!(p0 instanceof com.google.android.finsky.d.ad))
            throw new IllegalStateException("Activity must implement PlayStoreUiElementNode");
    }

    public final void a(com.google.android.finsky.billing.common.s p0) {
  2:    if (!(p0 instanceof com.google.android.finsky.billing.lightpurchase.i)) {
1469:        if (p0 instanceof com.google.android.finsky.billing.gifting.b) {
1475:            switch (((com.google.android.finsky.billing.gifting.b)p0).l) {
                    case 0:
1834:                    break;
                    case 1:
1510:                    if (((com.google.android.finsky.billing.gifting.b)p0).af == 1) {
1516:                        if (!(this.ax instanceof com.google.android.finsky.billing.lightpurchase.e.ad)) {
1536:                            v3 = new Bundle();
1541:                            v4 = new com.google.android.finsky.billing.lightpurchase.e.ad();
1550:                            v3.putParcelable("SendGiftStep.template", ParcelableProto.a(this.d.f));
1555:                            v3.putInt("SendGiftStep.backend", this.h.a.d);
1560:                            v3.putInt("SendGiftStep.documentType", this.h.a.c);
1563:                            v4.f(v3);
1568:                            v4.a = this.d.f.f;
1570:                            this.a(v4);
                            }
                        }
                        else {
1581:                        if (this.aI.a.az != 0) {
1587:                            if (this.aI.a.az != 0) {
1590:                                this.aI.a.az = 0;
1594:                                if (this.aI.a.aA != 0)
1598:                                    this.aI.a.b(this.aI.a.aF);
                                    else
1705:                                    this.aI.a.aF.setVisibility(4);
                                }
                            }
1605:                        if (this.aI.a.ay == 0) {
1611:                            if (this.aI.a.ax != 0) {
1622:                                v2 = AnimationUtils.loadAnimation(this.aI.a.h(), 2131034155);
1631:                                v2.setAnimationListener(new com.google.android.finsky.billing.lightpurchase.d.d(this.aI.a));
1636:                                this.aI.a.aD.startAnimation(v2);
1644:                                this.aI.a.aE.setVisibility(0);
1664:                                this.aI.a.aE.startAnimation(AnimationUtils.loadAnimation(this.aI.a.h(), 2131034152));
                                }
                                else {
1714:                                this.aI.a.aD.setVisibility(4);
1722:                                this.aI.a.aE.setVisibility(0);
1742:                                this.aI.a.aE.startAnimation(AnimationUtils.loadAnimation(this.aI.a.h(), 2131034135));
                                }
1670:                            this.aI.a.ay = 1;
1697:                            this.aI.a.aJ.a(new com.google.android.finsky.d.p().a(213).b((com.google.android.finsky.d.ad)this.aI.a.h()));
                            }
                        }
1834:                    break;
                    case 2:
1751:                    this.startActivityForResult(((com.google.android.finsky.billing.gifting.b)p0).W(), 7);
1755:                    this.aq = 1;
1834:                    break;
                    case 3:
1759:                    v1 = this.h();
1792:                    this.a(com.google.android.finsky.billing.lightpurchase.e.ac.b(new CheckoutPurchaseError(((com.google.android.finsky.billing.gifting.b)p0).c(v1), ((com.google.android.finsky.billing.gifting.b)p0).b(v1)), 1, 0, 5554, 5555, this.c.ac()));
1834:                    break;
                    default:
1506:                    throw new IllegalStateException(38 + "Unknown GiftSidecar state: " + ((com.google.android.finsky.billing.gifting.b)p0).l);
                }
            }
1809:        v0 = String.valueOf(p0.getClass().getName());
1817:        if (v0.length() != 0)
1819:            v0 = "Unexpected sidecar: ".concat(v0);
            else
1829:            v0 = new String("Unexpected sidecar: ");
1826:        throw new IllegalStateException(v0);
        }
  9:    v1 = new Object[2];
 18:    v1[0] = Integer.valueOf(((com.google.android.finsky.billing.lightpurchase.i)p0).l);
 25:    v1[1] = Integer.valueOf(((com.google.android.finsky.billing.lightpurchase.i)p0).ag);
 29:    if (((com.google.android.finsky.billing.lightpurchase.i)p0).ag == this.e) {
 34:        v1 = new Object[1];
 43:        v1[0] = Integer.valueOf(this.e);
 45:        FinskyLog.b("Already handled state %d", v1);
 48:        return;
        }
 49:    this.e = ((com.google.android.finsky.billing.lightpurchase.i)p0).ag;
 55:    switch (this.c.l) {
            case 0:
 55:            goto 67;
            case 1:
 55:            goto 114;
            case 2:
 55:            goto 825;
            case 3:
 55:            goto 1165;
            case 4:
 55:            goto 452;
            case 5:
 55:            goto 507;
            case 6:
 55:            goto 285;
            case 7:
 55:            goto 513;
            case 8:
 55:            goto 58;
            case 9:
 55:            goto 447;
            case 10:
 55:            goto 706;
            case 11:
 55:            goto 731;
            case 12:
 55:            goto 736;
            case 13:
 55:            goto 109;
            case 14:
 55:            goto 73;
            default:
        }
 60:    this.f = ((com.google.android.finsky.billing.lightpurchase.i)p0).l;
 64:    this.g = ((com.google.android.finsky.billing.lightpurchase.i)p0).af;
 66:    return;
 69:    this.c.W();
 72:    goto 58;
105:    this.a(com.google.android.finsky.billing.lightpurchase.e.x.a(this.aw, this.h.a.d, this.h.b, this.h.d, this.h.e, this.h.c, this.c.aw));
108:    goto 58;
110:    this.a(0);
113:    goto 58;
120:    if (this.aI.a.az != 0 && this.aI.a.az != 0) {
129:        this.aI.a.az = 0;
133:        if (this.aI.a.aA != 0)
137:            this.aI.a.b(this.aI.a.aF);
            else
244:            this.aI.a.aF.setVisibility(4);
        }
144:    if (this.aI.a.ay == 0) {
150:        if (this.aI.a.ax != 0) {
161:            v2 = AnimationUtils.loadAnimation(this.aI.a.h(), 2131034155);
170:            v2.setAnimationListener(new com.google.android.finsky.billing.lightpurchase.d.d(this.aI.a));
175:            this.aI.a.aD.startAnimation(v2);
183:            this.aI.a.aE.setVisibility(0);
203:            this.aI.a.aE.startAnimation(AnimationUtils.loadAnimation(this.aI.a.h(), 2131034152));
            }
            else {
253:            this.aI.a.aD.setVisibility(4);
261:            this.aI.a.aE.setVisibility(0);
281:            this.aI.a.aE.startAnimation(AnimationUtils.loadAnimation(this.aI.a.h(), 2131034135));
            }
209:        this.aI.a.ay = 1;
236:        this.aI.a.aJ.a(new com.google.android.finsky.d.p().a(213).b((com.google.android.finsky.d.ad)this.aI.a.h()));
        }
239:    goto 58;
291:    if (this.c.ap.g != 0) {
301:        v2 = new com.google.android.finsky.billing.lightpurchase.e.a();
306:        v3 = new Bundle();
315:        v3.putParcelable("AcknowledgementChallengeStep.challenge", ParcelableProto.a(this.c.ap.g));
324:        com.google.android.finsky.m.a.aH().b(v3, this.aw());
327:        v2.f(v3);
330:        v2.b = this.c.ap.g;
332:        this.a(v2);
        }
339:    else if (this.c.ap.j != 0) {
345:        if (this.c.ap.j.c != 0)
348:            this.a(0);
            else
357:            this.a(this.c.ap.j.b);
        }
364:    else if (this.c.ap.f != 0) {
370:        if (this.c.ap.f.c != 0)
373:            this.a(1);
            else
378:            this.as();
        }
385:    else if (this.c.ap.b != 0) {
389:        v1 = new Bundle();
398:        v1.putString("authAccount", this.aw.name);
416:        this.startActivityForResult(AddressChallengeActivity.a(this.h.a.d, this.c.ap.b, v1, this.aJ), 2);
        }
        else {
424:        v1 = new Object[1];
431:        v1[0] = this.h.a;
433:        FinskyLog.e("Don't know how to handle prepare challenge for doc: %s", v1);
442:        this.a(new CheckoutPurchaseError(), 1);
        }
335:    goto 58;
447:    this.as();
450:    goto 58;
468:    v3 = new Bundle();
473:    v4 = new com.google.android.finsky.billing.lightpurchase.e.n();
478:    v3.putInt("ChangeSubscriptionStep.backend", this.h.a.d);
487:    v3.putParcelable("ChangeSubscriptionStep.changeSubscription", ParcelableProto.a(this.c.ah));
496:    com.google.android.finsky.m.a.aH().b(v3, this.aw());
499:    v4.f(v3);
502:    this.a(v4);
505:    goto 58;
508:    this.a(0);
511:    goto 58;
519:    if (this.c.aq.m != 0) {
541:        v5 = new com.google.android.finsky.billing.lightpurchase.b.b();
548:        v5.f(com.google.android.finsky.billing.lightpurchase.b.b.a(this.c.aq.m, this.h.b, this.h.d, this.W(), this.aw()));
551:        this.a(v5);
        }
558:    else if (this.c.aq.c != 0) {
566:        this.a.a(this.aJ, "purchase_sidecar_auth_challenge");
577:        v1 = this.ar.a(this.aw, this.aJ);
587:        v1.a(new com.google.android.finsky.billing.lightpurchase.an(this, v1, this.c.aq.c), 0);
        }
594:    else if (this.c.aq.h != 0) {
614:        v4 = new Intent(com.google.android.finsky.m.a.b, PurchaseManagerActivity);
619:        v4.putExtra("PurchaseManagerActivity.account", this.aw);
626:        com.google.android.finsky.m.a.aG();
633:        v4.putExtra("PurchaseManagerActivity.securePaymentPayload", com.google.android.finsky.billing.common.i.a(this.c.aq.h));
638:        v4.putExtra("PurchaseManagerActivity.backend", this.W());
643:        com.google.android.finsky.billing.common.h.a(v4, this.aw.name);
650:        this.aJ.a(this.aw).a(v4);
654:        this.startActivityForResult(v4, 5);
        }
661:    else if (this.c.aq.k != 0)
675:        this.a(com.google.android.finsky.billing.lightpurchase.e.r.a(this.aw, this.c.aq.k, this.aw()));
        else {
683:        v1 = new Object[1];
690:        v1[0] = this.h.a;
692:        FinskyLog.e("Don't know how to handle complete challenge for doc: %s", v1);
701:        this.a(new CheckoutPurchaseError(), 1);
        }
554:    goto 58;
726:    this.a(com.google.android.finsky.billing.lightpurchase.e.ac.b(this.c.as, 0, 1, 1300, 1301, this.c.ac()));
729:    goto 58;
731:    this.ac();
734:    goto 58;
737:    this.ap = 1;
745:    if (this.c.aq.m != 0) {
753:        this.a.b(this.aJ, "purchase_fragment_family_acquisition_challenge");
784:        v7 = new com.google.android.finsky.billing.lightpurchase.b.a();
791:        v7.f(com.google.android.finsky.billing.lightpurchase.b.a.a(this.aw, this.c.aq.m, this.h.c, this.h.b, this.h.a.c, this.W(), this.aw()));
794:        this.a(v7);
        }
        else {
802:        v1 = new Object[1];
809:        v1[0] = this.h.a;
811:        FinskyLog.e("Don't know how to handle complete challenge for doc: %s", v1);
820:        this.a(new CheckoutPurchaseError(), 1);
        }
797:    goto 58;
829:    switch (this.c.af) {
            case 7:
829:            goto 863;
            case 8:
829:            goto 1109;
            default:
        }
862:    throw new IllegalStateException(52 + "handleSuccess() was called from substate " + this.c.af);
868:    FinskyLog.a("Purchase succeeded", new Object[0]);
872:    this.ak = 1;
876:    if (this.ap != 0) goto 1061;
882:    if (this.c.aq == 0) goto 888;
886:    if (this.c.aq.c != 0) goto 894;
892:    if (this.c.ai != 0) goto 1061;
896:    if (this.h != 0 && this.h.n != 0) {
910:        if (this.h.n.m == 0 && ((Integer)com.google.android.finsky.billing.e.a.b.b(this.aw.name).a()).intValue() == -1 && ((Integer)com.google.android.finsky.billing.e.b.a.b()).intValue() != 0 && !((Boolean)com.google.android.finsky.billing.e.a.d.b(this.aw.name).a()).booleanValue())
971:            v0 = 1;
            else
1061:            v0 = 0;
        }
972:    if (v0 != 0) {
980:        this.a.b(this.aJ, "purchase_fragment_success_choice");
1003:        v4 = new Bundle();
1008:        v5 = new com.google.android.finsky.billing.lightpurchase.e.ae();
1013:        v4.putString("authAccount", this.aw.name);
1018:        v4.putInt("SuccessStepWithAuthChoices.backend", this.h.a.d);
1023:        v4.putBoolean("SuccessStepWithAuthChoices.usedPinBasedAuth", this.ao);
1032:        com.google.android.finsky.m.a.aH().b(v4, this.c.ac());
1035:        v5.f(v4);
1038:        this.a(v5);
1056:        com.google.android.finsky.billing.e.a.d.b(this.aw.name).a(Boolean.valueOf(1));
        }
        else {
1068:        if (this.c.l != 2 && this.c.af != 7) {
1078:            v2 = new Object[2];
1087:            v2[0] = Integer.valueOf(this.c.l);
1096:            v2[1] = Integer.valueOf(this.c.af);
1098:            FinskyLog.e("confirmAuthChoiceSelected() called in state %d and substate %d", v2);
            }
1104:        this.c.b(2, 8);
        }
1059:    goto 58;
1113:    v1 = com.google.android.finsky.billing.w.a(this.c.an);
1117:    if (v1 == 0)
1119:        this.ag();
        else {
1130:        this.a.b(this.aJ, "purchase_fragment_success");
1139:        v0 = com.google.android.finsky.billing.w.a(this.c.an, v1);
1145:        v1 = new com.google.android.finsky.billing.lightpurchase.e.ab();
1154:        com.google.android.finsky.m.a.aH().b(v0, this.c.ac());
1157:        v1.f(v0);
1160:        this.a(v1);
        }
1122:    goto 58;
1168:    if (this.f == 1 && this.g == 1)
1176:        v7 = 1;
        else
1246:        v7 = 0;
1181:    switch (this.c.af) {
            case 3:
1274:            v9 = new CheckoutPurchaseError(com.google.android.finsky.api.m.b(this.h(), this.c.ar), com.google.android.finsky.api.m.a(this.h(), this.c.ar));
1280:            v8 = new PurchaseError(2);
1304:            if ((!com.google.android.finsky.m.a.j(this.aw.name).a(12604300)) || this.f != 1 || this.g != 2) {
1316:                v0 = v8;
1317:                v1 = v9;
                }
                else {
1323:                v0 = com.google.android.finsky.by.h.a(this.W());
1327:                if (v0 != 0) {
1341:                    v2 = com.google.android.finsky.m.a.ah().a(this.aw).g(v0);
1378:                    this.aJ.a(new com.google.android.finsky.d.c(630).b("commit").a(this.c.ar));
1394:                    v12 = new String[1];
1397:                    v12[0] = v0;
1407:                    com.google.android.finsky.m.a.ai().a(this.aw, v12, new com.google.android.finsky.billing.lightpurchase.ao(this, v2, this.c.ar, SystemClock.elapsedRealtime(), com.google.android.finsky.m.a.Y().a(this.h.a, v2)), "purchase_error_library_replication");
                    }
1410:                v0 = v8;
1411:                v1 = v9;
                }
1834:            break;
            case 4:
1187:            v1 = new Object[1];
1198:            v1[0] = Integer.valueOf(this.c.af);
1200:            FinskyLog.e("Unexpected substate: %d", v1);
1205:            v1 = new CheckoutPurchaseError();
1211:            v0 = new PurchaseError(0);
1834:            break;
            case 5:
1450:            this.ag.clear();
1455:            v1 = this.c.as;
1462:            v0 = new PurchaseError(3, v1.a);
1834:            break;
            default:
1187:            v1 = new Object[1];
1198:            v1[0] = Integer.valueOf(this.c.af);
1200:            FinskyLog.e("Unexpected substate: %d", v1);
1205:            v1 = new CheckoutPurchaseError();
1211:            v0 = new PurchaseError(0);
1834:            break;
        }
1217:    v3 = new Object[1];
1220:    v3[0] = v0;
1222:    FinskyLog.a("Error: %s", v3);
1225:    if (v7 != 0) {
1230:        v3 = new Object[1];
1233:        v3[0] = v0;
1235:        FinskyLog.a("Purchase failed: %s", v3);
1238:        this.aj = v0;
        }
1240:    this.a(v1, v7);
1243:    goto 58;
1420:    FinskyLog.d("account is null", new Object[0]);
1423:    v7 = 1;
1437:    v1 = new CheckoutPurchaseError(this.i().getString(2131952240));
1443:    v0 = new PurchaseError(0);
1446:    goto 1214;
1833:    try
            run 1283...1410
        catch (NullPointerException ex) {
1283:        goto 1414;
        }
    }

    public final void a(com.google.wireless.android.finsky.a.a.k p0, AuthState p1) {
        if (p1.a() == 2)
            v0 = 1;
        else
            v0 = 0;
        this.ao = v0;
        this.a.b(this.aJ, "purchase_fragment_auth_challenge");
        v4 = this.c.ac();
        v2 = com.google.android.finsky.billing.lightpurchase.e.b.a(this.aw, p1, this.h.b, this.W());
        v2.putParcelable("AuthChallengeStep.challenge", ParcelableProto.a(p0));
        v0 = (Map)v4.b.get("CHALLENGE_GAIA_OPT_OUT");
        if (v0 == 0)
            v0 = 0;
        else
            v0 = (String)v0.get("TEXT");
        v2.putString("AuthChallengeStep.challengeGaiaOptOutLabel", v0);
        v2.putInt("AuthChallengeStep.documentType", this.h.a.c);
        v0 = new com.google.android.finsky.billing.lightpurchase.e.b();
        com.google.android.finsky.m.a.aH().a(v2, v4, "AUTH_CONTINUE_BUTTON");
        v0.ao = p1;
        v0.f(v2);
        this.a(v0);
    }

    public final void a(com.google.wireless.android.finsky.dfe.nano.fa p0) {
        this.c.a(p0, this.aJ);
    }

    public final void a(Boolean p0) {
        this.a.a(this.aJ, "purchase_sidecar_state_prepare");
        if (this.c.af == 10)
            this.ag.clear();
        v6 = new HashMap();
        com.google.android.finsky.billing.common.f.a(this.h(), v6);
        v6.put("bppcc", this.as.a(this.h(), this.aw.name));
        this.c.a(this.ah, this.i, this.af, com.google.android.finsky.billing.e.j.a(this.aw.name), p0, v6, this.aJ);
    }

    public final void a(String p0) {
        if (!TextUtils.isEmpty(p0))
            this.i = new VoucherParams(p0, 1, 1);
        else
            this.i = new VoucherParams(0, 0, 1);
        this.a(0);
    }

    public final boolean a(Bundle p0) {
        v0 = 1;
        switch (this.c.l) {
            case 6:
                this.af.putAll(p0);
                this.a(0);
                break;
            case 7:
                this.ag.putAll(p0);
                this.av();
                break;
            case 12:
                this.ag.putAll(p0);
                this.av();
                break;
            default:
                v0 = new Object[1];
                v0[0] = Integer.valueOf(this.c.l);
                FinskyLog.e("Cannot answer challenge in state %d", v0);
                v0 = 0;
                break;
        }
        return v0;
    }

    public final void aa() {
        if (this.c.l != 6) {
            v2 = new Object[1];
            v2[0] = Integer.valueOf(this.c.l);
            FinskyLog.e("switchToInstrumentManager() called in state %d", v2);
        }
        this.c.b(9, 0);
    }

    public final void ab() {
        if (this.h.a.c == 1) {
            v1 = com.google.android.finsky.m.a.k(this.aw.name);
            if (v1 != 0) {
                v2 = String.valueOf("completePurchase?doc=");
                v0 = String.valueOf(this.h.b);
                if (v0.length() != 0)
                    v0 = v2.concat(v0);
                else
                    v0 = new String(v2);
                v1.a(v0, 0);
            }
        }
        this.at();
    }

    public final void ac() {
        ((com.google.android.finsky.billing.lightpurchase.ap)this.h()).n();
    }

    public final void ad() {
        this.a(0);
    }

    public final void ae() {
        this.startActivityForResult(RedeemCodeActivity.a(this.aw.name, 1, this.h.a, this.h.d, this.aw(), this.aJ), 3);
    }

    public final void af() {
        this.startActivityForResult(new Intent(com.google.android.finsky.m.a.b, SettingsActivity), 4);
    }

    public final void ag() {
  2:    if (this.ak == 0) {
289:        this.ac();
292:        return;
        }
 10:    if (this.c.an.b == 0) {
289:        this.ac();
292:        return;
        }
 16:    if (this.c.an.b.c == 0) goto 143;
 24:    v1 = new Document(this.c.an.b.c.a);
 31:    v0 = v1.N().k;
 70:    if (!new com.google.android.finsky.l.j(com.google.android.finsky.m.a.aN()).a(v1.N()).a(com.google.android.finsky.m.a.L().a(v0)).e()) goto 117;
 80:    v0 = this.h().getPackageManager().getLaunchIntentForPackage(v0);
 84:    if (v0 == 0)
 98:        v0 = com.google.android.finsky.m.a.bo().a(this.h(), v1, this.aJ);
102:    this.a(v0);
105:    v0 = 0;
106:    if (v0 == 0) {
289:        this.ac();
292:        return;
        }
113:    FinskyLog.a("Dialog shown, waiting for user input.", new Object[0]);
116:    return;
138:    this.startActivityForResult(LightPurchaseFlowActivity.a(this.aw, v1, 0, 1, 0, v1.a.D, 0, 0, 0, 0, 0, this.aJ), 6);
141:    v0 = 1;
142:    goto 106;
145:    if (this.c.an.b.a == 0) goto 184;
171:    v1 = this.at.a(this.h(), this.aw, new Document(this.c.an.b.a.a), this.B, this, 101, this.h);
175:    if (v1 == 0)
177:        v0 = 1;
        else
182:        v0 = 0;
178:    this.am = v0;
180:    v0 = v1;
181:    goto 106;
186:    if (this.c.an.b.f == 0) goto 237;
192:    this.d = this.ar();
196:    if (this.d == 0) {
210:        this.d = com.google.android.finsky.billing.gifting.b.a(this.c.an.b.f, this.aw.name, this.aJ);
226:        this.B.a().a(this.d, "PurchaseFragment.giftingSidecar").c();
        }
231:    this.d.a(this);
234:    v0 = 1;
235:    goto 106;
239:    if (this.c.an.b.b != 0)
246:        FinskyLog.e("Invalid PostSuccessAction. Should not go to home from purchase flow.", new Object[0]);
253:    else if (this.c.an.b.d != 0)
260:        FinskyLog.e("Invalid PostSuccessAction. Cannot enter purchase flow from purchase flow.", new Object[0]);
267:    else if (this.c.an.b.e != 0)
274:        FinskyLog.e("Invalid PostSuccessAction. Cannot open container from purchase flow.", new Object[0]);
        else
284:        FinskyLog.c("Unsupported PostSuccessAction.", new Object[0]);
249:    goto 105;
    }

    public final void ah() {
        if (this.c.l != 2 && this.c.af != 7) {
            v2 = new Object[2];
            v2[0] = Integer.valueOf(this.c.l);
            v2[1] = Integer.valueOf(this.c.af);
            FinskyLog.e("confirmAuthChoiceSelected() called in state %d and substate %d", v2);
        }
        this.c.b(2, 8);
    }

    public final void b(int p0, Bundle p1) {
        if (p0 == 101)
            this.ac();
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.b = com.google.android.finsky.m.a.o();
        if (p0 != 0) {
            this.c = (com.google.android.finsky.billing.lightpurchase.i)this.B.a("PurchaseFragment.sidecar");
            this.e = p0.getInt("PurchaseFragment.handledStateInstance");
            this.f = p0.getInt("PurchaseFragment.previousState");
            this.g = p0.getInt("PurchaseFragment.previousSubstate");
        }
        this.h = (PurchaseParams)this.q.getParcelable("PurchaseFragment.params");
        this.ai = this.q.getBundle("PurchaseFragment.appDownloadSizeWarningArgs");
        if (p0 != 0) {
            this.ah = p0.getString("PurchaseFragment.selectedInstrumentId");
            this.i = (VoucherParams)p0.getParcelable("PurchaseFragment.voucherParams");
            this.af = p0.getBundle("PurchaseFragment.prepareChallengeResponses");
            this.ag = p0.getBundle("PurchaseFragment.commitChallengeResponses");
            this.aj = (PurchaseError)p0.getParcelable("PurchaseFragment.error");
            this.ak = p0.getBoolean("PurchaseFragment.succeeded");
            this.an = p0.getBoolean("PurchaseFragment.skipCheckout");
            this.al = p0.getBundle("PurchaseFragment.extraPurchaseData");
            this.ao = p0.getBoolean("PurchaseFragment.usePinBasedAuth");
            this.ap = p0.getBoolean("PurchaseFragment.useDelegatedAuth");
            this.am = p0.getBoolean("PurchaseFragment.postSuccessItemOpened");
        }
        else if (!TextUtils.isEmpty(this.h.m))
            this.i = new VoucherParams(this.h.m, 1, 1);
        else {
            com.google.android.finsky.m.a.ab();
            this.i = new VoucherParams(0, 1, com.google.android.finsky.billing.common.v.a(com.google.android.finsky.m.a.ah().a(this.aw)));
        }
    }

    public final void e(Bundle p0) {
        super.e(p0);
        p0.putInt("PurchaseFragment.handledStateInstance", this.e);
        p0.putInt("PurchaseFragment.previousState", this.f);
        p0.putInt("PurchaseFragment.previousSubstate", this.g);
        p0.putBundle("PurchaseFragment.prepareChallengeResponses", this.af);
        p0.putBundle("PurchaseFragment.commitChallengeResponses", this.ag);
        p0.putString("PurchaseFragment.selectedInstrumentId", this.ah);
        p0.putParcelable("PurchaseFragment.voucherParams", this.i);
        p0.putBoolean("PurchaseFragment.succeeded", this.ak);
        p0.putParcelable("PurchaseFragment.error", this.aj);
        p0.putBoolean("PurchaseFragment.skipCheckout", this.an);
        p0.putBundle("PurchaseFragment.extraPurchaseData", this.al);
        p0.putBoolean("PurchaseFragment.usePinBasedAuth", this.ao);
        p0.putBoolean("PurchaseFragment.useDelegatedAuth", this.ap);
        p0.putBoolean("PurchaseFragment.isGiftingComplete", this.aq);
        p0.putBoolean("PurchaseFragment.postSuccessItemOpened", this.am);
    }

    public final void e_(int p0) {
        this.c.a(p0);
    }

    public final void f_(int p0) {
    }

    public final void g_() {
        super.g_();
        if (this.c == 0) {
            this.c = com.google.android.finsky.billing.lightpurchase.i.a(this.aw.name, this.h);
            this.B.a().a(this.c, "PurchaseFragment.sidecar").c();
        }
        this.c.a(this);
        this.d = this.ar();
        if (this.d != 0 && this.aq == 0)
            this.d.a(this);
    }

    public final void h_() {
        if (this.c != 0)
            this.c.a(0);
        super.h_();
    }

}
