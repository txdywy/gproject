package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.p;
import android.support.v4.app.u;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.aa.m;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.activities.b;
import com.google.android.finsky.as.a;
import com.google.android.finsky.at.k;
import com.google.android.finsky.aw.a;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bb.b;
import com.google.android.finsky.bb.c;
import com.google.android.finsky.billing.acquire.f;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.common.d;
import com.google.android.finsky.billing.common.h;
import com.google.android.finsky.billing.common.i;
import com.google.android.finsky.billing.common.o;
import com.google.android.finsky.billing.f.a;
import com.google.android.finsky.billing.g;
import com.google.android.finsky.billing.legacyauth.a;
import com.google.android.finsky.billing.lightpurchase.vr.VrPurchaseActivity;
import com.google.android.finsky.billing.p;
import com.google.android.finsky.billing.profile.t;
import com.google.android.finsky.billing.promptforfop.PromptForFopActivity;
import com.google.android.finsky.bn.b;
import com.google.android.finsky.br.a;
import com.google.android.finsky.br.b;
import com.google.android.finsky.by.a;
import com.google.android.finsky.by.c;
import com.google.android.finsky.by.e;
import com.google.android.finsky.by.g;
import com.google.android.finsky.by.h;
import com.google.android.finsky.by.n;
import com.google.android.finsky.by.o;
import com.google.android.finsky.ce.a;
import com.google.android.finsky.cl.a;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.bl;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.e;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.b;
import com.google.android.finsky.dfemodel.q;
import com.google.android.finsky.dfemodel.v;
import com.google.android.finsky.dh.a;
import com.google.android.finsky.download.a;
import com.google.android.finsky.dx.a;
import com.google.android.finsky.f.a;
import com.google.android.finsky.f.b;
import com.google.android.finsky.f.c;
import com.google.android.finsky.installer.k;
import com.google.android.finsky.installqueue.InstallRequest;
import com.google.android.finsky.installqueue.d;
import com.google.android.finsky.installqueue.g;
import com.google.android.finsky.installqueue.j;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.y.a;
import com.google.android.play.utils.b.a;
import com.google.android.wallet.common.util.a;
import com.google.vr.b.a.e;
import com.google.wireless.android.a.a.a.a.bo;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.a.a.a.a.cf;
import com.google.wireless.android.finsky.dfe.c.a.ak;
import com.google.wireless.android.finsky.dfe.c.a.an;
import java.util.List;

final class LightPurchaseFlowActivity extends com.google.android.finsky.activities.b implements com.google.android.finsky.at.m, com.google.android.finsky.billing.legacyauth.l, com.google.android.finsky.billing.u, com.google.android.finsky.d.ad
{

    public final com.google.android.finsky.dx.a D;
    public final com.google.android.finsky.accounts.a E;
    public com.google.android.finsky.installer.k G;
    public Bundle H;
    public Account I;
    public String J;
    public com.google.android.finsky.cv.a.ax K;
    public int L;
    public String M;
    public boolean N;
    public com.google.android.finsky.dfemodel.v O;
    public boolean P;
    public int Q;
    public String R;
    public boolean S;
    public Document T;
    public String U;
    public int V;
    public String W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public String aa;
    public boolean ab;
    public boolean ac;
    public boolean ad;
    public boolean ae;
    public Bundle af;
    public boolean ag;
    public InstallRequest ah;
    public InstallRequest ai;
    public int aj;
    public boolean ak;
    public boolean al;
    public boolean am;
    public boolean an;
    public boolean ao;
    public com.google.wireless.android.a.a.a.a.ce ap;
    public com.google.android.finsky.billing.common.i aq;
    public com.google.android.finsky.billing.f.a ar;
    public com.google.android.finsky.billing.lightpurchase.ag as;
    public final Handler c;
    public final com.google.android.finsky.d.a t;

    LightPurchaseFlowActivity() {
        com.google.android.finsky.activities.b();
        this.t = com.google.android.finsky.m.a.aR();
        this.c = new Handler();
        com.google.android.finsky.m.a.aJ();
        this.aq = com.google.android.finsky.m.a.aG();
        this.D = com.google.android.finsky.m.a.au();
        this.ar = com.google.android.finsky.billing.f.a.a;
        this.E = com.google.android.finsky.m.a.U();
        com.google.android.finsky.m.a.bD();
        com.google.android.finsky.m.a.bx();
    }

    private final void I() {
        com.google.android.finsky.billing.g.a(0, this.I.name, com.google.android.finsky.m.a.d().c(this.T), this.C).a(this.H_(), "LightPurchaseFlowActivity.appDownloadNetworkDialog");
    }

    private final void J() {
        this.C.a(this.d(600), 0);
        if (!TextUtils.isEmpty(this.aa))
            this.C.a(new com.google.android.finsky.d.e(9).a(this.aa)).d().d();
    }

    private final String K() {
        v0 = 0;
        v1 = this.getCallingPackage();
        if (v1 != 0) {
            v2 = this.getPackageManager();
            try {
                v0 = v2.getApplicationLabel(v2.getApplicationInfo(v1, 0)).toString();
            }
            catch (PackageManager$NameNotFoundException ex) {
            }
        }
        return v0;
    }

    public static Intent a(Account p0, Document p1, String p2, int p3, com.google.android.finsky.dfemodel.v p4, byte[] p5, String p6, int p7, String p8, boolean p9, int p10, com.google.android.finsky.d.w p11) {
        if (LightPurchaseFlowActivity.a(p0.name, p7) && p1.a.f != 3)
            v2 = 1;
        else
            v2 = 0;
        if (v2 != 0) {
            v2 = 1;
            if (p1 != 0) {
                v3 = p1.a(p2, p3);
                if (v3 != 0)
                    v2 = v3.n;
            }
            if (LightPurchaseFlowActivity.a(p0.name, p1, v2, 0)) {
                v4 = new com.google.android.finsky.billing.common.o().a(p1);
                v4.e = p2;
                v4.d = p3;
                v4.f = p4;
                v4.r = p5;
                if (p1 != 0)
                    v3 = p1.h();
                else
                    v3 = -1;
                if (p1 != 0)
                    v2 = p1.a.g;
                else
                    v2 = 0;
                v2 = v4.a(v3, v2, p6, p10);
                v2.m = p7;
                v2.j = p8;
                v2.s = p9;
                v2 = com.google.android.finsky.m.a.bo().a(p0, com.google.android.finsky.m.a.b, com.google.android.finsky.m.a.j(p0.name), p1, p11, v2.a(), 0, 0, 1);
                return v2;
            }
        }
        v2 = new Intent(com.google.android.finsky.m.a.b, LightPurchaseFlowActivity);
        v2.putExtra("LightPurchaseFlowActivity.account", p0);
        v2.putExtra("LightPurchaseFlowActivity.doc", p1);
        if (p2 != 0)
            v2.putExtra("LightPurchaseFlowActivity.offerId", p2);
        v2.putExtra("LightPurchaseFlowActivity.offerType", p3);
        if (p4 != 0)
            v2.putExtra("LightPurchaseFlowActivity.offerFilter", p4.name());
        v2.putExtra("LightPurchaseFlowActivity.appsContinueUrl", p6);
        v2.putExtra("LightPurchaseFlowActivity.serverLogsCookie", p5);
        v2.putExtra("LightPurchaseFlowActivity.indirectProvisioningType", p7);
        v2.putExtra("LightPurchaseFlowActivity.voucherId", p8);
        v2.putExtra("LightPurchaseFlowActivity.bypassAcquisitionWarnings", p9);
        v2.putExtra("LightPurchaseFlowActivity.appPurchaseVoucherContext", p10);
        p11.a(p0).a(v2);
        return v2;
    }

    private final InstallRequest a(boolean p0, String p1) {
        v0 = 0;
        if (com.google.android.finsky.m.a.dj().a(12623705)) {
            v0 = new com.google.android.finsky.installqueue.j(this.C, this.T).b(this.I.name).a("single_install");
            if (p0 != 0) {
                v1 = new InstallConstraint[1];
                v1[0] = new com.google.android.finsky.installqueue.d().a(2).e();
                v0.a(v1);
            }
            v0 = v0.a();
        }
        else if (p0 != 0)
            this.G.b(p1);
        else
            this.G.a(p1);
        return v0;
    }

    private final void a(String p0, String p1, Document p2) {
        this.startActivityForResult(com.google.android.finsky.m.a.bo().a(this, p0, p1, p2, 0, this.C), 2);
    }

    private static boolean a(String p0, int p1) {
        v0 = 1;
        if (!com.google.android.finsky.m.a.j(p0).a(12626228) || p1 == 1 || com.google.android.finsky.as.a.a(com.google.android.finsky.m.a.b) || com.google.android.finsky.as.a.b(com.google.android.finsky.m.a.b))
            v0 = 0;
        return v0;
    }

    private static boolean a(String p0, Document p1, boolean p2, boolean p3) {
  0:    v0 = 1;
  4:    v4 = com.google.android.finsky.m.a.j(p0);
  8:    if (p2 != 0 || !v4.a(12633659))
 19:        v3 = 1;
        else
 49:        v3 = 0;
 20:    if (p3 != 0 && v4.a(12637607))
 31:        v2 = 1;
        else
 51:        v2 = 0;
 32:    if (v3 == 0) {
118:        v0 = 0;
119:        return v0;
        }
 34:    if (v2 != 0)
 48:        return v0;
 36:    if (p1 == 0) goto 45;
 42:    switch (p1.a.f) {
            case 1:
 99:            if (!v4.a(12633661))
101:                v2 = 1;
                else
103:                v2 = 0;
120:            break;
            case 2:
 86:            if (!v4.a(12633663))
 88:                v2 = 1;
                else
 90:                v2 = 0;
120:            break;
            case 3:
 60:            if (!v4.a(12633660))
 62:                v2 = 1;
                else
 64:                v2 = 0;
120:            break;
            case 4:
112:            if (!v4.a(12633664))
114:                v2 = 1;
                else
116:                v2 = 0;
120:            break;
            case 5:
 45:            v2 = 0;
120:            break;
            case 6:
 73:            if (!v4.a(12633662))
 75:                v2 = 1;
                else
 77:                v2 = 0;
120:            break;
            default:
 45:            v2 = 0;
120:            break;
        }
 46:    if (v2 == 0) {
118:        v0 = 0;
119:        return v0;
        }
 48:    return v0;
    }

    private final boolean b(Intent p0) {
  7:    this.P = com.google.android.finsky.dh.a.b(this);
 21:    if (!((Boolean)com.google.android.finsky.aa.b.al.b()).booleanValue() && this.P == 0) {
 31:        FinskyLog.d("Called from untrusted package.", new Object[0]);
 34:        v0 = 0;
 35:        return v0;
        }
 42:    if ((!p0.hasExtra("backend")) || (!p0.hasExtra("document_type")) || (!p0.hasExtra("backend_docid")) || !p0.hasExtra("full_docid")) {
 72:        FinskyLog.d("Missing argument.", new Object[0]);
 75:        v0 = 0;
 76:        return v0;
        }
 83:    if (!p0.hasExtra("authAccount")) {
120:        this.I = com.google.android.finsky.m.a.cY();
144:        this.K = com.google.android.finsky.dfemodel.q.a(p0.getIntExtra("backend", 0), p0.getIntExtra("document_type", 0), p0.getStringExtra("backend_docid"));
152:        this.J = p0.getStringExtra("full_docid");
154:        this.T = 0;
162:        this.L = p0.getIntExtra("offer_type", 0);
170:        this.M = p0.getStringExtra("offer_id");
178:        this.N = p0.getBooleanExtra("requires_checkout", 1);
182:        v0 = p0.getStringExtra("offer_filter");
186:        if (v0 == 0) {
194:            this.U = 0;
198:            if (this.N != 0) {
200:                this.ak = 1;
202:                this.al = 0;
                }
                else {
275:                this.ak = 0;
277:                this.al = 1;
                }
224:            com.google.android.finsky.m.a.aY().a(this.I.name).b(p0.getStringExtra("family_consistency_token"));
233:            this.aa = p0.getStringExtra("referral_url");
241:            this.Q = p0.getIntExtra("indirect_provisioning_type", 0);
249:            this.S = p0.getBooleanExtra("vr", 0);
257:            this.ab = p0.getBooleanExtra("suppress_post_success_action", 0);
259:            v0 = 1;
260:            return v0;
            }
192:        this.O = com.google.android.finsky.dfemodel.v.valueOf(v0);
194:        this.U = 0;
198:        if (this.N != 0) {
200:            this.ak = 1;
202:            this.al = 0;
            }
            else {
275:            this.ak = 0;
277:            this.al = 1;
            }
224:        com.google.android.finsky.m.a.aY().a(this.I.name).b(p0.getStringExtra("family_consistency_token"));
233:        this.aa = p0.getStringExtra("referral_url");
241:        this.Q = p0.getIntExtra("indirect_provisioning_type", 0);
249:        this.S = p0.getBooleanExtra("vr", 0);
257:        this.ab = p0.getBooleanExtra("suppress_post_success_action", 0);
259:        v0 = 1;
260:        return v0;
        }
 87:    v0 = p0.getStringExtra("authAccount");
 97:    this.I = this.E.b(v0);
101:    if (this.I == 0) {
105:        v2 = new Object[1];
107:        v2[0] = v0;
109:        FinskyLog.d("Invalid account passed: %s", v2);
112:        v0 = 0;
113:        return v0;
        }
102:    goto 122;
120:    this.I = com.google.android.finsky.m.a.cY();
144:    this.K = com.google.android.finsky.dfemodel.q.a(p0.getIntExtra("backend", 0), p0.getIntExtra("document_type", 0), p0.getStringExtra("backend_docid"));
152:    this.J = p0.getStringExtra("full_docid");
154:    this.T = 0;
162:    this.L = p0.getIntExtra("offer_type", 0);
170:    this.M = p0.getStringExtra("offer_id");
178:    this.N = p0.getBooleanExtra("requires_checkout", 1);
182:    v0 = p0.getStringExtra("offer_filter");
186:    if (v0 == 0) {
194:        this.U = 0;
198:        if (this.N != 0) {
200:            this.ak = 1;
202:            this.al = 0;
            }
            else {
275:            this.ak = 0;
277:            this.al = 1;
            }
224:        com.google.android.finsky.m.a.aY().a(this.I.name).b(p0.getStringExtra("family_consistency_token"));
233:        this.aa = p0.getStringExtra("referral_url");
241:        this.Q = p0.getIntExtra("indirect_provisioning_type", 0);
249:        this.S = p0.getBooleanExtra("vr", 0);
257:        this.ab = p0.getBooleanExtra("suppress_post_success_action", 0);
259:        v0 = 1;
260:        return v0;
        }
188:    try {
192:        this.O = com.google.android.finsky.dfemodel.v.valueOf(v0);
        }
        catch (IllegalArgumentException ex) {
265:        v2 = new Object[1];
267:        v2[0] = v0;
269:        FinskyLog.d("Invalid offer types passed: %s", v2);
272:        v0 = 0;
273:        return v0;
        }
194:    this.U = 0;
198:    if (this.N != 0) {
200:        this.ak = 1;
202:        this.al = 0;
        }
        else {
275:        this.ak = 0;
277:        this.al = 1;
        }
224:    com.google.android.finsky.m.a.aY().a(this.I.name).b(p0.getStringExtra("family_consistency_token"));
233:    this.aa = p0.getStringExtra("referral_url");
241:    this.Q = p0.getIntExtra("indirect_provisioning_type", 0);
249:    this.S = p0.getBooleanExtra("vr", 0);
257:    this.ab = p0.getBooleanExtra("suppress_post_success_action", 0);
259:    v0 = 1;
260:    return v0;
    }

    private final void c(String p0) {
        v1 = new Object[1];
        v1[0] = p0;
        FinskyLog.a("Persistent download network preference no longer available. Will queue %s to be downloaded over any network", v1);
        com.google.android.finsky.billing.common.d.b.a(Integer.valueOf(1));
        Toast.makeText(this, this.getString(2131952079), 1).show();
    }

    private final com.google.wireless.android.a.a.a.a.bo d(int p0) {
        v0 = new com.google.android.finsky.d.c(p0).a(this.J).a(this.K).c(this.getCallingPackage());
        if (this.L != 0) {
            v0.b(this.L);
            v0.b(this.N);
        }
        return v0.a;
    }

    private final void j(boolean p0) {
        v0 = this.d(601);
        v0.a(p0);
        this.C.a(v0, 0);
    }

    final void A() {
        if (!com.google.android.finsky.m.a.bn().a(this, this.I, this.T, this.H_(), 0, 5, 0)) {
            this.Z = 1;
            this.m();
        }
    }

    final void B() {
        this.aq.c(this, this.I.name);
        if (this.an == 0 && this.D())
            this.F();
        else
            this.G();
    }

    final boolean C() {
        v0 = 0;
        if (com.google.android.finsky.m.a.h(this.I.name).a()) {
            v2 = com.google.android.finsky.m.a.ah();
            if (this.K.c == 1) {
                if (!v2.a(this.J).isEmpty())
                    return v0;
                if (this.T == 0)
                    v0 = 1;
                else
                    v0 = this.T.a.E;
                return v0;
            }
            if (!com.google.android.finsky.m.a.Y().a(this.K, v2.a(this.I))) {
                if (this.T == 0)
                    v0 = 1;
                else
                    v0 = this.T.a.E;
                return v0;
            }
        }
        return v0;
    }

    protected final boolean D() {
        if (this.k())
            v0 = 0;
        else if (this.T == 0 || this.T.a.e != 1)
            v0 = 0;
        else if (this.N != 0)
            v0 = 0;
        else if (!com.google.android.finsky.m.a.ah().a(this.J).isEmpty())
            v0 = 0;
        else if (com.google.android.finsky.as.a.a(this))
            v0 = 0;
        else {
            v4 = System.currentTimeMillis();
            if (com.google.android.finsky.m.a.aD().b(this.I.name) && com.google.android.finsky.billing.profile.t.b(this.I.name, v4) && !((Boolean)com.google.android.finsky.aa.a.P.b(this.I.name).a()).booleanValue() && !com.google.android.finsky.billing.profile.t.a(this.I.name, v4))
                v0 = 1;
            else
                v0 = 0;
        }
        return v0;
    }

    final void E() {
        if (this.T == 0)
            v4 = this.J;
        else
            v4 = 0;
        this.startActivityForResult(com.google.android.finsky.m.a.bo().a(this, this.I.name, this.K.d, v4, this.C), 8);
    }

    final void F() {
        v6 = new com.google.android.finsky.at.k();
        v6.c(2131953141).a(2131953028).d(2131951948).a(0, 6, 0).a(1000, this.getIntent().getByteArrayExtra("LightPurchaseFlowActivity.serverLogsCookie"), -1, -1, this.C.a(this.I));
        v2 = com.google.android.finsky.aa.a.T.b(this.I.name);
        v2.a(Integer.valueOf(((Integer)v2.a()).intValue() + 1));
        v6.a().a(this.H_(), "LightPurchaseFlowActivity.fopRequiredDialog");
    }

    final void G() {
        if (com.google.android.finsky.as.a.a(this)) {
            v0 = new com.google.android.finsky.billing.common.o();
            v0.a = this.K;
            v0.b = this.J;
            v0.d = this.L;
            v0.e = this.M;
            v0.f = this.O;
            this.startActivityForResult(com.google.android.finsky.m.a.bo().a(this.I, this.getApplicationContext(), v0.a(this.V, this.W, this.U, this.aj).a(), this.O, this.K(), com.google.android.finsky.m.a.j(this.I.name)), 9);
        }
        else if (this.S != 0) {
            if (com.google.vr.b.a.e.a(com.google.android.finsky.m.a.b) == 0) {
                v0 = new com.google.android.finsky.billing.common.o();
                v0.a = this.K;
                v0.b = this.J;
                v0.d = this.L;
                v0.e = this.M;
                v0 = v0.a(this.V, this.W, this.U, this.aj);
                v0.o = this.S;
                this.startActivityForResult(VrPurchaseActivity.a(this.I, v0.a(), this.O), 11);
            }
            else {
                FinskyLog.c("Purchase in VR mode requested in an unsupported environment.", new Object[0]);
                this.l();
            }
        }
        else if (this.K.c == 1) {
            if (this.am != 0)
                this.i(1);
            else
                this.a(this.I.name, this.J, this.T);
        }
        else if (TextUtils.isEmpty(this.M) && this.L == 0) {
            v7 = new Intent(com.google.android.finsky.m.a.b, OfferResolutionActivity);
            v7.putExtra("OfferResolutionActivity.dfeToc", com.google.android.finsky.m.a.dn());
            v7.putExtra("OfferResolutionActivity.account", this.I);
            v7.putExtra("OfferResolutionActivity.docid", this.J);
            v7.putExtra("OfferResolutionActivity.doc", this.T);
            v7.putExtra("OfferResolutionActivity.provisioningType", this.Q);
            if (this.O != 0)
                v7.putExtra("OfferResolutionActivity.offerFilter", this.O.name());
            this.C.a(v7);
            this.startActivityForResult(v7, 3);
        }
        else
            this.a(0, 0, 0);
    }

    final boolean H() {
        v2 = -1;
        v0 = 0;
        if (!com.google.android.finsky.m.a.j(this.I.name).a(12627971)) {
            v5 = this.D.h(this.I.name);
            if (v5 == 0)
                v0 = 1;
            else {
                if (v5.a & 4)
                    v4 = 1;
                else
                    v4 = 0;
                if (v4 == 0) {
                    FinskyLog.e("SnoozeTimestamp is not set in UserSettings.", new Object[0]);
                    v0 = 1;
                }
                else {
                    v4 = this.D.g(this.I.name);
                    if (v4 == 0 || v4.d == 0)
                        FinskyLog.c("No settings for recovery options flow.", new Object[0]);
                    else if (v5.c <= 0 || v5.c > v4.d.length) {
                        v6 = new Object[1];
                        v6[0] = Integer.valueOf(v5.c);
                        FinskyLog.e("Invalid snooze level: %d.", v6);
                    }
                    else
                        v2 = (long)v4.d[v5.c - 1] * 60000;
                    if (v2 >= 0 && System.currentTimeMillis() - v5.d > v2)
                        v0 = 1;
                }
            }
        }
        return v0;
    }

    public final void U_() {
        this.startActivity(new Intent("android.settings.WIFI_SETTINGS"));
        this.l();
    }

    public final void V_() {
        v1 = new Object[1];
        v1[0] = this.K.b;
        FinskyLog.a("Download pre-acquisition warning dismissed for app = %s", v1);
        this.l();
    }

    public final void W_() {
        this.a(0, 0, 0);
    }

    public final void a(int p0, Bundle p1) {
        switch (p0) {
            case 4:
                this.l();
                break;
            case 5:
                this.startActivity(com.google.android.finsky.m.a.bo().a(this, p1.getString("dialog_details_url"), this.C));
                this.l();
                break;
            case 6:
                v3 = new Intent(com.google.android.finsky.m.a.b, PromptForFopActivity);
                PromptForFopActivity.a(this.I, this.getIntent().getByteArrayExtra("LightPurchaseFlowActivity.serverLogsCookie"), v3);
                this.C.a(this.I).a(v3);
                this.startActivityForResult(v3, 7);
                break;
            default:
                v1 = new Object[1];
                v1[0] = Integer.valueOf(p0);
                FinskyLog.e("Unknown dialog callback: %d", v1);
                break;
        }
    }

    public final void a(int p0, boolean p1) {
        switch (p0) {
            case 3:
                v5 = new Object[1];
                v5[0] = this.K.b;
                FinskyLog.a("Will queue %s to be downloaded on wifi only", v5);
                v1 = 1;
                v0 = 0;
                break;
            case 4:
                v0 = new Object[1];
                v0[0] = this.K.b;
                FinskyLog.a("Will queue %s to be downloaded on offpeak or wifi", v0);
                v0 = com.google.android.finsky.cl.a.a();
                if (v0 == 0) {
                    this.c(this.K.b);
                    v1 = 0;
                    v0 = 0;
                }
                else {
                    com.google.android.finsky.m.a.bx();
                    v7 = new com.google.android.finsky.installqueue.j(this.C, this.T);
                    v7.b(this.I.name);
                    v0 = com.google.android.finsky.cl.a.a(v7.a(), v0);
                    v1 = 0;
                }
                break;
            default:
                v0 = new Object[1];
                v0[0] = this.K.b;
                FinskyLog.a("Will queue %s to be downloaded over any network", v0);
                v1 = 0;
                v0 = 0;
                break;
        }
        if (v0 == 0)
            v0 = this.a(v1, this.K.b);
        if (this.am != 0) {
            this.a(v0);
            if (this.N != 0) {
                this.m();
                return;
            }
            this.z();
            if (!this.H()) {
                this.m();
                return;
            }
            this.ar.a(this.I, this.C).a(this);
        }
        else
            this.a(0, 0, v0);
    }

    final void a(Bundle p0, boolean p1, InstallRequest p2) {
  8:    v2 = com.google.android.finsky.m.a.ah().a(this.I);
 15:    if (this.Q == 1) {
257:        if (this.N != 0) {
259:            v1 = PurchaseParams.b();
265:            v1.a = this.K;
269:            v1.b = this.J;
273:            v1.d = this.L;
277:            v1.e = this.M;
283:            v1.l = this.getCallingPackage();
293:            v1 = v1.a(this.V, this.W, this.U, this.aj);
299:            v1.j = this.R;
303:            v1.o = this.S;
307:            v1.p = this.ab;
311:            if (this.T != 0)
315:                v1.a(this.T);
320:            if (this.Q != 0)
324:                v1.m = this.Q;
326:            if (p2 != 0)
333:                FinskyLog.e("Use of the Schedule API is not yet implemented on the purchasepath. See b/34389865 and b/34390103", new Object[0]);
352:            if (this.am != 0)
354:                p0 = 0;
364:            this.startActivityForResult(PurchaseActivity.a(this.I, v1.a(), this.getIntent().getByteArrayExtra("LightPurchaseFlowActivity.serverLogsCookie"), p0, this.C), 1);
            }
371:        else if (this.am == 0) {
373:            if (p1 != 0)
375:                this.I();
380:            else if (p0 != 0)
399:                com.google.android.finsky.billing.p.a(0, this.I.name, p0, this.C).a(this.H_(), "LightPurchaseFlowActivity.appDownloadSizeWarningDialog");
                else {
429:                if (this.am == 0)
431:                    v10 = 1;
                    else
443:                    v10 = 0;
438:                com.google.android.finsky.billing.lightpurchase.ar.a(this.I, this.T, this.K, this.J, this.L, this.U, 0, new com.google.android.finsky.billing.lightpurchase.aj(this), new com.google.android.finsky.billing.lightpurchase.ai(this), v10, this.ak, this.C, p2);
                }
            }
            else {
429:            if (this.am == 0)
431:                v10 = 1;
                else
443:                v10 = 0;
438:            com.google.android.finsky.billing.lightpurchase.ar.a(this.I, this.T, this.K, this.J, this.L, this.U, 0, new com.google.android.finsky.billing.lightpurchase.aj(this), new com.google.android.finsky.billing.lightpurchase.ai(this), v10, this.ak, this.C, p2);
            }
367:        return;
        }
 31:    if (!com.google.android.finsky.m.a.Y().a(this.K, v2, this.L)) {
257:        if (this.N != 0) {
259:            v1 = PurchaseParams.b();
265:            v1.a = this.K;
269:            v1.b = this.J;
273:            v1.d = this.L;
277:            v1.e = this.M;
283:            v1.l = this.getCallingPackage();
293:            v1 = v1.a(this.V, this.W, this.U, this.aj);
299:            v1.j = this.R;
303:            v1.o = this.S;
307:            v1.p = this.ab;
311:            if (this.T != 0)
315:                v1.a(this.T);
320:            if (this.Q != 0)
324:                v1.m = this.Q;
326:            if (p2 != 0)
333:                FinskyLog.e("Use of the Schedule API is not yet implemented on the purchasepath. See b/34389865 and b/34390103", new Object[0]);
352:            if (this.am != 0)
354:                p0 = 0;
364:            this.startActivityForResult(PurchaseActivity.a(this.I, v1.a(), this.getIntent().getByteArrayExtra("LightPurchaseFlowActivity.serverLogsCookie"), p0, this.C), 1);
            }
371:        else if (this.am == 0) {
373:            if (p1 != 0)
375:                this.I();
380:            else if (p0 != 0)
399:                com.google.android.finsky.billing.p.a(0, this.I.name, p0, this.C).a(this.H_(), "LightPurchaseFlowActivity.appDownloadSizeWarningDialog");
                else {
429:                if (this.am == 0)
431:                    v10 = 1;
                    else
443:                    v10 = 0;
438:                com.google.android.finsky.billing.lightpurchase.ar.a(this.I, this.T, this.K, this.J, this.L, this.U, 0, new com.google.android.finsky.billing.lightpurchase.aj(this), new com.google.android.finsky.billing.lightpurchase.ai(this), v10, this.ak, this.C, p2);
                }
            }
            else {
429:            if (this.am == 0)
431:                v10 = 1;
                else
443:                v10 = 0;
438:            com.google.android.finsky.billing.lightpurchase.ar.a(this.I, this.T, this.K, this.J, this.L, this.U, 0, new com.google.android.finsky.billing.lightpurchase.aj(this), new com.google.android.finsky.billing.lightpurchase.ai(this), v10, this.ak, this.C, p2);
            }
367:        return;
        }
 38:    if (this.K.c == 1) {
 40:        if (p1 != 0)
 42:            this.I();
 46:        else if (p0 != 0)
 65:            com.google.android.finsky.billing.p.a(0, this.I.name, p0, this.C).a(this.H_(), "LightPurchaseFlowActivity.appDownloadSizeWarningDialog");
            else {
 69:            this.z();
 80:            com.google.android.finsky.m.a.bu().b(this.T);
 95:            com.google.android.finsky.m.a.c().b(this.K.b, this.U);
100:            this.a(p2);
103:            this.m();
            }
 45:        return;
        }
109:    if (this.N == 0) {
201:        if (com.google.android.finsky.dfemodel.q.b(this.K.c))
203:            v1 = 2131953208;
            else
251:            v1 = 2131952061;
212:        v2 = new com.google.android.finsky.at.k();
229:        v2.a(this.getString(v1)).d(2131952688).a(0, 4, 0);
242:        v2.a().a(this.H_(), "LightPurchaseFlowActivity.errorDialog");
245:        return;
        }
117:    if (this.K.c == 15 || this.L == 13)
125:        v1 = 1;
        else
247:        v1 = 0;
131:    if (this.K.d != 2) goto 249;
133:    if (v1 == 0) goto 249;
136:    v3 = com.google.android.finsky.by.h.a(2);
164:    v1 = v2.g(v3).b(new com.google.android.finsky.by.g(this.I.name, v3, 2, this.K.b, this.K.c, this.L));
168:    if (v1 == 0) goto 249;
174:    if (((com.google.android.finsky.by.n)v1).e != 0) goto 249;
176:    v1 = 1;
177:    if (v1 == 0) {
201:        if (com.google.android.finsky.dfemodel.q.b(this.K.c))
203:            v1 = 2131953208;
            else
251:            v1 = 2131952061;
212:        v2 = new com.google.android.finsky.at.k();
229:        v2.a(this.getString(v1)).d(2131952688).a(0, 4, 0);
242:        v2.a().a(this.H_(), "LightPurchaseFlowActivity.errorDialog");
245:        return;
        }
191:    if (!((Boolean)com.google.android.finsky.aa.b.dk.b()).booleanValue()) {
201:        if (com.google.android.finsky.dfemodel.q.b(this.K.c))
203:            v1 = 2131953208;
            else
251:            v1 = 2131952061;
212:        v2 = new com.google.android.finsky.at.k();
229:        v2.a(this.getString(v1)).d(2131952688).a(0, 4, 0);
242:        v2.a().a(this.H_(), "LightPurchaseFlowActivity.errorDialog");
245:        return;
        }
192:    goto 255;
249:    v1 = 0;
250:    goto 177;
257:    if (this.N != 0) {
259:        v1 = PurchaseParams.b();
265:        v1.a = this.K;
269:        v1.b = this.J;
273:        v1.d = this.L;
277:        v1.e = this.M;
283:        v1.l = this.getCallingPackage();
293:        v1 = v1.a(this.V, this.W, this.U, this.aj);
299:        v1.j = this.R;
303:        v1.o = this.S;
307:        v1.p = this.ab;
311:        if (this.T != 0)
315:            v1.a(this.T);
320:        if (this.Q != 0)
324:            v1.m = this.Q;
326:        if (p2 != 0)
333:            FinskyLog.e("Use of the Schedule API is not yet implemented on the purchasepath. See b/34389865 and b/34390103", new Object[0]);
352:        if (this.am != 0)
354:            p0 = 0;
364:        this.startActivityForResult(PurchaseActivity.a(this.I, v1.a(), this.getIntent().getByteArrayExtra("LightPurchaseFlowActivity.serverLogsCookie"), p0, this.C), 1);
        }
371:    else if (this.am == 0) {
373:        if (p1 != 0)
375:            this.I();
380:        else if (p0 != 0)
399:            com.google.android.finsky.billing.p.a(0, this.I.name, p0, this.C).a(this.H_(), "LightPurchaseFlowActivity.appDownloadSizeWarningDialog");
            else {
429:            if (this.am == 0)
431:                v10 = 1;
                else
443:                v10 = 0;
438:            com.google.android.finsky.billing.lightpurchase.ar.a(this.I, this.T, this.K, this.J, this.L, this.U, 0, new com.google.android.finsky.billing.lightpurchase.aj(this), new com.google.android.finsky.billing.lightpurchase.ai(this), v10, this.ak, this.C, p2);
            }
        }
        else {
429:        if (this.am == 0)
431:            v10 = 1;
            else
443:            v10 = 0;
438:        com.google.android.finsky.billing.lightpurchase.ar.a(this.I, this.T, this.K, this.J, this.L, this.U, 0, new com.google.android.finsky.billing.lightpurchase.aj(this), new com.google.android.finsky.billing.lightpurchase.ai(this), v10, this.ak, this.C, p2);
        }
    }

    public final void a(com.google.android.finsky.d.ad p0) {
        FinskyLog.e("Not using tree impressions.", new Object[0]);
    }

    final void a(InstallRequest p0) {
        if (com.google.android.finsky.m.a.dj().a(12643667)) {
            if (p0 == 0)
                p0 = new com.google.android.finsky.installqueue.j(this.C.a("single_install").c(), this.T).b(this.I.name).b(2).a();
            this.ai = p0;
            this.as = new com.google.android.finsky.billing.lightpurchase.ag(com.google.android.finsky.m.a.cS(), com.google.android.finsky.m.a.Y(), com.google.android.finsky.m.a.bw(), com.google.android.finsky.m.a.T(), this, 0);
            this.as.a(p0, this.C);
        }
        else if (p0 != 0)
            com.google.android.finsky.m.a.bw().a(p0);
        else {
            v0 = com.google.android.finsky.m.a.o();
            v0.a(this.T.N().k, this.T.bV());
            v0.a(this.T.N().k, this.T.N().c, this.I.name, this.T.a.g, 2, this.T.z(), this.C.a("single_install"));
        }
    }

    public final void a(String p0) {
        v2 = new Intent(com.google.android.finsky.m.a.b, AddRecoveryOptionActivity);
        v2.putExtra("AddRecoveryOptionPromptDialog.account", this.I);
        v2.putExtra("AddRecoveryOptionPromptDialog.initialUrl", p0);
        this.C.a(v2);
        com.google.android.finsky.billing.common.h.a(v2, this.I.name);
        this.startActivityForResult(v2, 13);
    }

    public final void b() {
        FinskyLog.a("Received response from API, no need to add recovery option", new Object[0]);
        this.D.j(this.I.name);
        this.m();
    }

    public final void b(int p0, Bundle p1) {
        this.l();
    }

    protected final void b(boolean p0) {
        super.b(p0);
        if (this.H == 0) {
            this.J();
            if (this.Y != 0)
                this.finish();
            else if (this.X != 0)
                this.l();
            else if (this.am != 0 && !com.google.android.finsky.as.a.a(this) && this.S == 0)
                this.a(this.I.name, this.J, this.T);
            else if (this.an != 0 && this.D())
                this.F();
            else if (this.C())
                this.E();
            else
                this.B();
        }
    }

    public final void c() {
        FinskyLog.d("Can't receive response from API, some error happened", new Object[0]);
        this.m();
    }

    final void c(int p0) {
        this.setResult(p0);
        this.j(0);
        this.finish();
    }

    public boolean dispatchKeyEvent(KeyEvent p0) {
        if (this.S != 0 && (p0.getKeyCode() == 24 || p0.getKeyCode() == 25))
            v0 = 1;
        else
            v0 = super.dispatchKeyEvent(p0);
        return v0;
    }

    public final void f_(int p0) {
    }

    public String getCallingPackage() {
        return com.google.android.wallet.common.util.a.a(this);
    }

    public com.google.android.finsky.d.ad getParentNode() {
        return 0;
    }

    public com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.ap;
    }

    final boolean h(boolean p0) {
        v8 = 0;
        if (com.google.android.finsky.m.a.j(this.I.name).a(12637988) && com.google.android.finsky.billing.acquire.f.a())
            v0 = 1;
        else
            v0 = 0;
        if ((this.S == 0 || v0 != 0) && LightPurchaseFlowActivity.a(this.I.name, this.Q) && LightPurchaseFlowActivity.a(this.I.name, this.T, this.N, this.k()) && !com.google.android.finsky.m.a.Y().a(this.K, com.google.android.finsky.m.a.ah().a(this.I), this.L)) {
            v2 = this.getCallingPackage();
            v3 = new com.google.android.finsky.billing.common.o();
            v3.e = this.M;
            v3.d = this.L;
            v3.f = this.O;
            v3.r = this.getIntent().getByteArrayExtra("LightPurchaseFlowActivity.serverLogsCookie");
            if (this.T != 0)
                v0 = this.T.h();
            else
                v0 = -1;
            if (this.T != 0)
                v1 = this.T.a.g;
            else
                v1 = 0;
            v6 = v3.a(v0, v1, this.U, this.aj);
            v6.m = this.Q;
            v6.j = this.R;
            v6.s = this.ae;
            v6.p = this.ab;
            v6.l = v2;
            v6.v = com.google.android.finsky.dh.a.b(this, v2);
            v6.t = this.k();
            v6.u = this.P;
            v6.o = this.S;
            if (this.T != 0)
                v6.a(this.T);
            else {
                v6.a = this.K;
                v6.b = this.J;
            }
            v0 = com.google.android.finsky.m.a.bo().a(this.I, this.getApplicationContext(), com.google.android.finsky.m.a.j(this.I.name), this.T, this.C, v6.a(), 0, 0, 0);
            if (p0 != 0)
                this.startActivityForResult(v0, 1);
            else {
                v0.addFlags(33554432);
                this.startActivity(v0);
            }
            v8 = 1;
        }
        return v8;
    }

    final boolean i(boolean p0) {
  2:    v2 = 0;
  5:    if (this.af != 0)
  7:        v0 = 1;
        else
155:        v0 = 0;
 10:    v3 = com.google.android.finsky.m.a.bW();
 27:    v6 = com.google.android.finsky.m.a.dj().a(12641184);
 31:    v7 = v3.a(v6);
 35:    if (v3.a()) goto 39;
 37:    if (v6 == 0) goto 160;
 49:    v3 = com.google.android.finsky.m.a.bt().a(this.K.b);
 59:    if ((v3.b(this.T)) || v3.a(this.T))
 69:        v3 = 1;
        else
158:        v3 = 0;
 70:    if (v3 != 0) goto 160;
 72:    v3 = 1;
 73:    if (v3 != 0 && v7 == 3)
 78:        v5 = 1;
        else
162:        v5 = 0;
 79:    if (v5 != 0)
 81:        v0 = 0;
 84:    if (this.ae == 0) {
 88:        com.google.android.finsky.m.a.bx();
 92:        if (v7 == 2 && !com.google.android.finsky.m.a.q().b() && v3 != 0)
108:            v3 = 1;
            else
164:            v3 = 0;
109:        if (v5 == 0 && v7 == 4)
118:            this.c(this.K.b);
        }
        else
202:        v3 = 0;
131:    v6 = new com.google.android.finsky.billing.lightpurchase.ah(v0, this.a(v5, this.K.b), v3);
136:    this.ah = v6.b;
138:    if (p0 != 0) {
142:        if (v6.a != 0)
144:            v0 = this.af;
            else
166:            v0 = 0;
150:        this.a(v0, v6.c, v6.b);
        }
170:    else if (v6.c != 0)
172:        this.I();
        else {
178:        if (v6.a == 0)
154:            return v2;
198:        com.google.android.finsky.billing.p.a(0, this.I.name, this.af, this.C).a(this.H_(), "LightPurchaseFlowActivity.appDownloadSizeWarningDialog");
        }
153:    v2 = 1;
154:    return v2;
160:    v3 = 0;
161:    goto 73;
    }

    final boolean k() {
        return "com.android.vending.billing.PURCHASE".equals(this.getIntent().getAction());
    }

    final void l() {
        if (this.al != 0)
            v0 = 1;
        else
            v0 = 0;
        this.c(v0);
    }

    final void m() {
        if (this.P != 0) {
            v0 = new Intent();
            v0.putExtra("authAccount", this.I.name);
            v0.putExtra("backend", this.K.d);
            v0.putExtra("document_type", this.K.c);
            v0.putExtra("backend_docid", this.K.b);
            v0.putExtra("offer_type", this.L);
            v0.putExtra("offer_id", this.M);
            v0.putExtra("post_success_item_opened", this.Z);
            this.setResult(-1, v0);
        }
        else
            this.setResult(-1);
        this.j(1);
        this.finish();
    }

    protected void onActivityResult(int p0, int p1, Intent p2) {
        switch (p0) {
            case 1:
                this.c.post(new com.google.android.finsky.billing.lightpurchase.ab(this, p1, p2));
                break;
            case 2:
                this.c.post(new com.google.android.finsky.billing.lightpurchase.z(this, p1, p2));
                break;
            case 3:
                this.c.post(new com.google.android.finsky.billing.lightpurchase.aa(this, p1, p2));
                break;
            case 4:
                super.onActivityResult(p0, p1, p2);
                break;
            case 5:
                super.onActivityResult(p0, p1, p2);
                break;
            case 6:
                super.onActivityResult(p0, p1, p2);
                break;
            case 7:
                this.c.post(new com.google.android.finsky.billing.lightpurchase.y(this, p1));
                break;
            case 8:
                this.c.post(new com.google.android.finsky.billing.lightpurchase.v(this, p1));
                break;
            case 9:
                this.c.post(new com.google.android.finsky.billing.lightpurchase.ac(this, p1, p2));
                break;
            case 10:
                this.c.post(new com.google.android.finsky.billing.lightpurchase.ae(this, p1, p2));
                break;
            case 11:
                this.c.post(new com.google.android.finsky.billing.lightpurchase.af(this, p1));
                break;
            case 12:
                super.onActivityResult(p0, p1, p2);
                break;
            case 13:
                this.c.post(new com.google.android.finsky.billing.lightpurchase.w(this));
                break;
            case 14:
                this.c.post(new com.google.android.finsky.billing.lightpurchase.x(this, p1));
                break;
            case 15:
                super.onActivityResult(p0, p1, p2);
                break;
            case 16:
                super.onActivityResult(p0, p1, p2);
                break;
            case 17:
                super.onActivityResult(p0, p1, p2);
                break;
            case 18:
                super.onActivityResult(p0, p1, p2);
                break;
            case 19:
                super.onActivityResult(p0, p1, p2);
                break;
            case 20:
                super.onActivityResult(p0, p1, p2);
                break;
            case 21:
                super.onActivityResult(p0, p1, p2);
                break;
            case 22:
                super.onActivityResult(p0, p1, p2);
                break;
            case 23:
                super.onActivityResult(p0, p1, p2);
                break;
            case 24:
                super.onActivityResult(p0, p1, p2);
                break;
            case 25:
                this.c.post(new com.google.android.finsky.billing.lightpurchase.ad(this, p1));
                break;
            default:
                super.onActivityResult(p0, p1, p2);
                break;
        }
    }

    protected void onCreate(Bundle p0) {
  2:    v9 = this.getIntent();
 10:    if (!this.k()) goto 359;
 16:    if (!this.b(v9))
 18:        this.X = 1;
 24:    if (this.h(0))
 26:        this.Y = 1;
 30:    if (this.S != 0)
 32:        com.google.vr.b.a.e.a(this);
 35:    if (p0 != 0) {
 45:        this.K = (com.google.android.finsky.cv.a.ax)ParcelableProto.a(p0, "LightPurchaseFlowActivity.docid");
 53:        this.J = p0.getString("LightPurchaseFlowActivity.docidStr");
 63:        this.T = (Document)p0.getParcelable("LightPurchaseFlowActivity.doc");
 71:        this.L = p0.getInt("LightPurchaseFlowActivity.offerType", 0);
 79:        this.M = p0.getString("LightPurchaseFlowActivity.offerId");
 87:        this.N = p0.getBoolean("LightPurchaseFlowActivity.offerRequiresCheckout");
 95:        this.W = p0.getString("LightPurchaseFlowActivity.appTitle");
103:        this.V = p0.getInt("LightPurchaseFlowActivity.appVersionCode");
111:        this.X = p0.getBoolean("LightPurchaseFlowActivity.failed");
119:        this.Z = p0.getBoolean("LightPurchaseFlowActivity.postSuccessItemOpened");
127:        this.ac = p0.getBoolean("LightPurchaseFlowActivity.tosLaunched");
135:        this.ad = p0.getBoolean("LightPurchaseFlowActivity.appPermissionsLaunched");
143:        this.Q = p0.getInt("LightPurchaseFlowActivity.indirectProvisioningType");
151:        this.af = p0.getBundle("LightPurchaseFlowActivity.downloadSizeWarningArgs");
159:        this.ag = p0.getBoolean("LightPurchaseFlowActivity.showNetworkDialog");
174:        if (com.google.android.finsky.m.a.dj().a(12643667)) {
184:            this.ai = (InstallRequest)p0.getParcelable("LightPurchaseFlowActivity.pendingAutoInstallDependencyRequest");
188:            if (this.ai != 0) {
212:                v0 = new com.google.android.finsky.billing.lightpurchase.ag(com.google.android.finsky.m.a.cS(), com.google.android.finsky.m.a.Y(), com.google.android.finsky.m.a.bw(), com.google.android.finsky.m.a.T(), this, p0);
217:                if (this.ai != 0) {
221:                    if (v0.i != 0)
223:                        this.as = v0;
                        else
549:                        this.a(this.ai);
                    }
                }
            }
        }
225:    this.H = p0;
233:    this.G = com.google.android.finsky.m.a.o();
237:    if (this.I != 0) {
256:        if (com.google.android.finsky.m.a.j(this.I.name).a(12633090) && this.K.c == 1)
264:            v0 = 1;
            else
554:            v0 = 0;
265:        this.am = v0;
284:        this.an = com.google.android.finsky.m.a.j(this.I.name).a(12636492);
303:        this.ao = com.google.android.finsky.m.a.j(this.I.name).a(12636493);
        }
311:    this.ap = com.google.android.finsky.d.j.a(700);
320:    this.ap.e = new com.google.wireless.android.a.a.a.a.cf();
324:    if (this.J != 0)
332:        this.ap.e.a(this.J);
341:    this.ap.e.a(this.L);
352:    com.google.android.finsky.d.j.a(this.ap, v9.getByteArrayExtra("LightPurchaseFlowActivity.serverLogsCookie"));
355:    super.onCreate(p0);
358:    return;
359:    v0 = this.getCallingPackage();
363:    if (v0 == 0) goto 375;
373:    if (v0.equals(this.getPackageName())) goto 391;
377:    v2 = new Object[1];
379:    v2[0] = v0;
381:    FinskyLog.d("Blocked request from external package: %s", v2);
384:    v0 = 0;
385:    if (v0 == 0)
387:        this.X = 1;
389:    goto 28;
391:    this.P = 1;
401:    this.I = (Account)v9.getParcelableExtra("LightPurchaseFlowActivity.account");
411:    this.T = (Document)v9.getParcelableExtra("LightPurchaseFlowActivity.doc");
419:    this.K = this.T.d();
427:    this.J = this.T.a.c;
435:    this.L = v9.getIntExtra("LightPurchaseFlowActivity.offerType", 0);
443:    this.M = v9.getStringExtra("LightPurchaseFlowActivity.offerId");
451:    if (v9.hasExtra("LightPurchaseFlowActivity.offerFilter"))
463:        this.O = com.google.android.finsky.dfemodel.v.valueOf(v9.getStringExtra("LightPurchaseFlowActivity.offerFilter"));
467:    if (this.L == 0) goto 500;
473:    v0 = this.T.e(this.L);
477:    if (v0 != 0) goto 496;
481:    v1 = new Object[1];
489:    v1[0] = Integer.valueOf(this.L);
491:    FinskyLog.d("Offer type not available: %d", v1);
494:    v0 = 0;
495:    goto 385;
498:    this.N = v0.n;
506:    this.U = v9.getStringExtra("LightPurchaseFlowActivity.appsContinueUrl");
508:    this.ak = 1;
510:    this.al = 0;
518:    this.Q = v9.getIntExtra("LightPurchaseFlowActivity.indirectProvisioningType", 0);
526:    this.R = v9.getStringExtra("LightPurchaseFlowActivity.voucherId");
534:    this.ae = v9.getBooleanExtra("LightPurchaseFlowActivity.bypassAcquisitionWarnings", 0);
542:    this.aj = v9.getIntExtra("LightPurchaseFlowActivity.appPurchaseVoucherContext", 0);
544:    v0 = 1;
545:    goto 385;
    }

    protected void onResume() {
        super.onResume();
        if (this.S != 0 && Build$VERSION.SDK_INT >= 19)
            this.getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    protected void onSaveInstanceState(Bundle p0) {
        super.onSaveInstanceState(p0);
        p0.putParcelable("LightPurchaseFlowActivity.docid", ParcelableProto.a(this.K));
        p0.putString("LightPurchaseFlowActivity.docidStr", this.J);
        p0.putParcelable("LightPurchaseFlowActivity.doc", this.T);
        p0.putInt("LightPurchaseFlowActivity.offerType", this.L);
        p0.putString("LightPurchaseFlowActivity.offerId", this.M);
        p0.putBoolean("LightPurchaseFlowActivity.offerRequiresCheckout", this.N);
        p0.putBoolean("LightPurchaseFlowActivity.postSuccessItemOpened", this.Z);
        p0.putString("LightPurchaseFlowActivity.appTitle", this.W);
        p0.putInt("LightPurchaseFlowActivity.appVersionCode", this.V);
        p0.putBoolean("LightPurchaseFlowActivity.failed", this.X);
        p0.putBoolean("LightPurchaseFlowActivity.tosLaunched", this.ac);
        p0.putBoolean("LightPurchaseFlowActivity.appPermissionsLaunched", this.ad);
        p0.putInt("LightPurchaseFlowActivity.indirectProvisioningType", this.Q);
        p0.putBundle("LightPurchaseFlowActivity.downloadSizeWarningArgs", this.af);
        p0.putBoolean("LightPurchaseFlowActivity.showNetworkDialog", this.ag);
        if (com.google.android.finsky.m.a.dj().a(12643667)) {
            p0.putParcelable("LightPurchaseFlowActivity.pendingAutoInstallDependencyRequest", this.ai);
            if (this.as != 0)
                this.as.a(p0);
        }
    }

    protected final void r() {
        if (this.S != 0) {
            this.J();
            this.c(2);
        }
        else
            super.r();
    }

    final void z() {
        v0 = com.google.android.finsky.m.a.k(this.I.name);
        if (v0 != 0)
            v0.a(this.J);
    }

}
