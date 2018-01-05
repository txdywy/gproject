package com.google.android.finsky.billing.acquire;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.p030c.p031a.C0282a;
import android.support.v7.app.aa;
import android.text.TextUtils;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.api.C1288k;
import com.google.android.finsky.as.C1504b;
import com.google.android.finsky.as.C1506e;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.billing.common.C1788a;
import com.google.android.finsky.billing.common.C1790e;
import com.google.android.finsky.billing.common.C1791f;
import com.google.android.finsky.billing.common.C1793i;
import com.google.android.finsky.billing.common.C1802r;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.common.RedeemCodeResult;
import com.google.android.finsky.billing.iab.C1867w;
import com.google.android.finsky.billing.p130b.C1759a;
import com.google.android.finsky.billing.p130b.C1760b;
import com.google.android.finsky.billing.p130b.C1761c;
import com.google.android.finsky.billing.p130b.C1763d;
import com.google.android.finsky.billing.p130b.C1764f;
import com.google.android.finsky.billing.p130b.C1767g;
import com.google.android.finsky.billing.p130b.C1769i;
import com.google.android.finsky.billing.p130b.C1773m;
import com.google.android.finsky.billing.p130b.C1774n;
import com.google.android.finsky.billing.p131e.C1817e;
import com.google.android.finsky.billing.p131e.C1822k;
import com.google.android.finsky.billing.p153c.C1779a;
import com.google.android.finsky.billing.p153c.C1780b;
import com.google.android.finsky.billing.p153c.C1784h;
import com.google.android.finsky.br.C2171b;
import com.google.android.finsky.by.C2199l;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.cv.p177a.is;
import com.google.android.finsky.cv.p177a.it;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dialogbuilder.C1688g;
import com.google.android.finsky.dialogbuilder.C1762d;
import com.google.android.finsky.dialogbuilder.C2797e;
import com.google.android.finsky.dialogbuilder.p154b.C1686l;
import com.google.android.finsky.dialogbuilder.p154b.C2786a;
import com.google.android.finsky.dialogbuilder.p154b.C2787b;
import com.google.android.finsky.dialogbuilder.p154b.C2788c;
import com.google.android.finsky.dialogbuilder.p154b.C2789d;
import com.google.android.finsky.dialogbuilder.p154b.C2791f;
import com.google.android.finsky.dialogbuilder.p154b.C2792h;
import com.google.android.finsky.dialogbuilder.p154b.C2793j;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.recoverymode.C3982a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.play.dfe.api.DfeResponseVerifier;
import com.google.android.wallet.common.pub.d;
import com.google.android.wallet.common.util.a;
import com.google.android.wallet.redirect.b;
import com.google.wireless.android.finsky.dfe.c.a.ai;
import com.google.wireless.android.finsky.dfe.c.a.bt;
import com.google.wireless.android.finsky.dfe.c.a.c;
import com.google.wireless.android.finsky.dfe.c.a.eb;
import com.google.wireless.android.finsky.dfe.c.a.f;
import com.google.wireless.android.finsky.dfe.c.a.u;
import com.google.wireless.android.finsky.dfe.nano.ez;
import com.google.wireless.android.finsky.dfe.nano.ff;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.util.ArrayList;

public abstract class C1664i extends aa implements d {
    public C1504b f8635A;
    public C3300k f8636B;
    public C2199l f8637C;
    public C2206c f8638D;
    public C1793i f8639E;
    public C2171b f8640F;
    public C3982a f8641G;
    public C2320a f8642H;
    public C1867w f8643I;
    public C1763d f8644J;
    public C1764f f8645K;
    public C1780b f8646L;
    public C2788c f8647M;
    public C2797e f8648N;
    public C2791f f8649O;
    public C2792h f8650P;
    public C2793j f8651Q;
    public C1552e f8652R;
    public C2495w f8653S;
    public boolean f8654T;
    public C1683a f8655U;
    public C1767g f8656V;
    public C2786a f8657W;
    public C1779a f8658X;
    public C1761c f8659Y;
    public C1688g f8660Z;
    public PurchaseParams aa;
    public Document ab;
    public boolean ac;
    public int ad;
    public eb ae;
    public int af;
    public boolean ag;
    public C1254c ah;
    public boolean ai;
    public boolean aj;
    public boolean ak;
    public C2471a f8661u;
    public C1790e f8662v;
    public C1287h f8663w;
    public C1288k f8664x;
    public C1461c f8665y;
    public C1506e f8666z;

    protected abstract C1764f mo2371a(Account account, Bundle bundle);

    protected abstract void mo2372k();

    protected abstract C1688g mo2374n();

    protected void onCreate(Bundle bundle) {
        ((C1348d) C3947d.m18649a(C1348d.class)).mo1727a(this);
        super.onCreate(bundle);
        this.ac = false;
        this.ad = C1691g.RESULT_USER_CANCELED.f8744d;
        Account account = (Account) getIntent().getParcelableExtra("AcquireActivity.account");
        this.aa = (PurchaseParams) getIntent().getParcelableExtra("AcquireActivity.purchaseParams");
        this.f8652R = this.f8665y.mo2249j(account.name);
        if (!(!this.f8652R.mo2294a(12643664) || this.aa == null || this.aa.f9298n == null)) {
            ez ezVar = this.aa.f9298n;
            String a = a.a(this);
            if (a == null) {
                throw new NullPointerException();
            }
            ezVar.a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
            ezVar.n = a;
        }
        this.ab = (Document) getIntent().getParcelableExtra("AcquireActivity.doc");
        this.f8654T = true;
        if (this.ab != null && this.aa.m9748a()) {
            bl e = this.ab.m14649e(this.aa.f9288d);
            if (e != null) {
                this.f8654T = e.f11924n;
            }
        }
        mo2372k();
        this.ae = (eb) ParcelableProto.m21672a(getIntent(), "AcquireActivity.redeemParam");
        this.af = getIntent().getIntExtra("AcquireActivity.rootUiElementType", 0);
        this.ag = getIntent().getBooleanExtra("AcquireActivity.topupRequest", false);
        this.ah = this.f8663w.mo2016a(account.name);
        this.ai = getIntent().getBooleanExtra("AcquireActivity.logPair", true);
        this.f8653S = this.f8661u.m13180a(bundle, getIntent());
        if (this.ai && (bundle == null || this.f8652R.mo2294a(12632963))) {
            this.f8653S.m13371a(m9413c(600).f13342a, null);
        }
        this.aj = this.f8652R.mo2294a(12635221);
        if (bundle == null && this.aj) {
            this.f8653S.m13371a(m9413c(602).f13342a, null);
        }
        if (this.f8641G.mo3875b()) {
            this.f8641G.mo3879f();
            finish();
        } else if (this.f8666z.m8838a()) {
            if (this.f8652R.mo2294a(12610657)) {
                b.a(getApplicationContext(), new C1694j());
            }
            if (this.f8648N == null) {
                DfeResponseVerifier a2;
                C1686l c1687c;
                this.f8644J = new C1763d(this.f8653S, this.aa, this.af, !this.f8652R.mo2294a(12633549), this);
                if (this.f8652R.mo2294a(12638615)) {
                    a2 = this.f8664x.mo2018a();
                } else {
                    a2 = null;
                }
                this.f8657W = new C2786a(bundle);
                this.f8649O = new C2791f(bundle);
                this.f8650P = new C2792h(bundle);
                C1802r c1802r = new C1802r();
                C1788a c1788a = new C1788a(this);
                this.f8646L = new C1780b(new C1822k(this, this.f8653S), account, this.f8650P, this.f8652R.mo2294a(12635441), bundle);
                this.f8658X = new C1779a(this, account, new C1817e(C0282a.m1599a(this)), new C1784h(this, this.f8652R, bundle), this.f8646L, this.f8666z, this.f8638D, this.f8642H, bundle);
                this.f8647M = new C2788c(this.f8649O, this.f8650P, bundle);
                this.f8651Q = new C2793j(this.f8644J, bundle);
                if (this.f8645K == null) {
                    this.f8645K = mo2371a(account, bundle);
                }
                C1774n c1774n = new C1774n(account, this.f8653S, this.f8636B, this.f8637C, new C1698m(this), this.f8662v, this, c1788a, this.f8652R);
                C1254c c1254c = this.ah;
                C1763d c1763d = this.f8644J;
                C1779a c1779a = this.f8658X;
                C2786a c2786a = this.f8657W;
                C2792h c2792h = this.f8650P;
                C1764f c1764f = this.f8645K;
                if (this.aa != null) {
                    c1687c = new C1687c(this, this.aa.f9285a.f11835d);
                } else {
                    c1687c = new C1687c(this, 0);
                }
                C1773m c1773m = new C1773m(this, c1254c, a2, c1763d, c1779a, c1774n, c2786a, c2792h, c1764f, c1687c, this.f8652R);
                this.f8659Y = new C1761c(this, this.f8652R, this.f8643I, bundle);
                this.f8656V = new C1767g(getLoaderManager(), c1773m, this.aa, this.ab, this.f8650P, new C1759a(this.aa), c1774n, this.f8658X, this.f8645K, this.f8644J, this.f8657W, new C2787b(), this.f8639E.m9765a(this, account.name), new Handler(), account, bundle, this.ae, C1791f.m9755b(this), this.f8659Y, this.ag);
                if (this.f8660Z == null) {
                    this.f8660Z = mo2374n();
                }
                this.f8655U = new C1683a(account, this.ab, this, this.f8658X, this.f8646L, this.f8656V, this.f8650P, this.f8645K, this.f8653S, this.f8644J, this.f8659Y, new C1760b(this.f8665y, this.f8642H), bundle);
                this.f8648N = new C2797e(this, this.f8657W, this.f8655U, new C2789d(new Handler()), this.f8644J, this.f8660Z, this.f8656V, this.f8650P);
                this.f8645K.f9097d = this.f8648N;
            }
            if (bundle != null) {
                this.ak = bundle.getBoolean("AcquireActivity.startupComplete");
            }
        } else {
            startActivity(this.f8640F.mo2765e(this));
            finish();
        }
    }

    private final C2474c m9413c(int i) {
        C2474c c = new C2474c(i).m13247c(a.a(this));
        if (this.aa != null) {
            c.m13236a(this.aa.f9286b).m13213a(this.aa.f9285a).m13245b(this.f8654T);
            if (this.aa.m9748a()) {
                c.m13241b(this.aa.f9288d);
            }
        }
        return c;
    }

    protected void onStart() {
        super.onStart();
        if (!this.f8652R.mo2294a(12643763)) {
            C1767g c1767g = this.f8656V;
            if (c1767g.f9111G != null) {
                C1769i c1769i = c1767g.f9111G;
                if (!(c1769i.f9155n == null || c1769i.f9165x == null || c1769i.f9160s)) {
                    c1769i.f9162u = true;
                    c1769i.forceLoad();
                }
            }
            if (!this.ak) {
                mo2373l();
            }
        } else if (this.f8656V.mo2441a() != 2) {
            if (this.ak) {
                this.f8648N.mo3137a();
            } else {
                mo2373l();
            }
        }
    }

    private final void mo2373l() {
        this.f8635A.m8837a(new C1695k(this));
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C2791f c2791f = this.f8649O;
        if (!c2791f.f15090b.isEmpty()) {
            bundle.putBundle("DialogPrimaryActionEnabledModel.tags", c2791f.f15090b);
        }
        bundle.putBundle("AcquireActionHandler.actionBundle", this.f8655U.f8727r);
        C2788c c2788c = this.f8647M;
        if (c2788c.f15083c != null) {
            bundle.putSerializable("DialogCalendarDateModel.date", c2788c.f15083c);
        }
        C1780b c1780b = this.f8646L;
        if (c1780b.f9220e != null) {
            bundle.putBoolean("AcquireReauthModel.result", c1780b.f9220e.booleanValue());
            bundle.putString("AcquireReauthModel.token", c1780b.f9221f);
            bundle.putInt("AcquireReauthModel.retry", c1780b.f9222g);
            bundle.putInt("AcquireReauthModel.status", c1780b.f9223h);
            bundle.putBoolean("AcquireReauthModel.blank", c1780b.f9226k);
        }
        if (c1780b.f9219d != null) {
            bundle.putString("AcquireReauthModel.input", c1780b.f9219d.mo2384a());
        }
        bundle.putBoolean("AcquireReauthModel.prefetch", c1780b.f9227l);
        C2792h c2792h = this.f8650P;
        if (c2792h.f15092a.size() != 0) {
            bundle.putBundle("DialogUserInputModel", c2792h.f15092a);
        }
        C2793j c2793j = this.f8651Q;
        if (c2793j.f15095b.size() > 0) {
            bundle.putStringArrayList("DialogVisibilityModel.tags", new ArrayList(c2793j.f15095b));
        }
        C1767g c1767g = this.f8656V;
        if (c1767g.f9109E != null) {
            bundle.putParcelable("AcquireRequestModel.showAction", ParcelableProto.m21671a(c1767g.f9109E));
        }
        if (c1767g.f9108D != null) {
            bundle.putParcelable("AcquireRequestModel.completeAction", ParcelableProto.m21671a(c1767g.f9108D));
        }
        C1764f c1764f = this.f8645K;
        bundle.putBoolean("AcquireOrchestrationModel.finishedEventLogged", c1764f.f9100g);
        if (c1764f.f9096c != null) {
            bundle.putParcelable("AcquireOrchestrationModel.component", ParcelableProto.m21671a(c1764f.f9096c));
        }
        C1779a c1779a = this.f8658X;
        if (c1779a.f9214i != null) {
            bundle.putInt("AcquireClientConfigModel.consumptionAppVersionCode", c1779a.f9214i.intValue());
        }
        if (c1779a.f9215j != null) {
            bundle.putParcelable("AcquireClientConfigModel.clientConfig", ParcelableProto.m21671a(c1779a.f9215j));
        }
        this.f8653S.m13377a(bundle);
        this.f8657W.m14863a(bundle);
        C1761c c1761c = this.f8659Y;
        if (c1761c.f9079a != null) {
            bundle.putParcelable("purchaseParams", c1761c.f9079a);
        }
        bundle.putBoolean("AcquireActivity.startupComplete", this.ak);
    }

    protected void onPause() {
        super.onPause();
        this.f8660Z.mo2392a();
    }

    protected void onResume() {
        super.onResume();
        this.f8660Z.mo2394b();
    }

    public void onBackPressed() {
        this.f8648N.m14889a(false);
    }

    protected void onDestroy() {
        super.onDestroy();
        com.google.android.wallet.common.pub.a.a.a = null;
    }

    public void finish() {
        C1762d c1762d = this.f8644J;
        ad c2473o = new C2473o(700);
        c1762d.mo2431a(c2473o, null);
        c2473o.mo1219a(C1763d.e);
        c1762d.f.m13373a(new C2488p().m13342a(c2473o).m13344a(), null);
        if (this.ai) {
            this.f8653S.m13371a(m9413c(601).m13239a(this.ac).m13210a(this.ad).f13342a, null);
        }
        if (this.aj) {
            this.f8653S.m13371a(m9413c(603).m13239a(this.ac).m13210a(this.ad).f13342a, null);
        }
        super.finish();
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f8645K.f9102i.mo2454a(intent);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        String str = null;
        C1683a c1683a = this.f8655U;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                i3 = 1;
                break;
            default:
                i3 = 0;
                break;
        }
        if (i3 != 0) {
            String num = Integer.toString(i);
            if (c1683a.f8727r.containsKey(num)) {
                switch (i) {
                    case 1:
                        com.google.wireless.android.finsky.dfe.c.a.aa aaVar = (com.google.wireless.android.finsky.dfe.c.a.aa) ParcelableProto.m21673a(c1683a.f8727r, num);
                        if (intent == null) {
                            c1683a.f8714e.mo3138a(aaVar.h);
                        } else {
                            RedeemCodeResult redeemCodeResult = (RedeemCodeResult) intent.getParcelableExtra("redeem_code_result");
                            if (redeemCodeResult == null) {
                                c1683a.f8714e.mo3138a(aaVar.h);
                            } else {
                                if (aaVar.f != null) {
                                    c1683a.f8723n.m13367a(new C2474c(aaVar.f.b).m13240a(aaVar.f.c).m13248d(1));
                                }
                                Object obj = redeemCodeResult.f9307a;
                                if (!TextUtils.isEmpty(obj)) {
                                    c1683a.f8721l.m14870a(aaVar.d, obj);
                                    c1683a.f8714e.mo3138a(aaVar.g);
                                } else if (redeemCodeResult.f9309c) {
                                    Object a = redeemCodeResult.m9749a();
                                    if (TextUtils.isEmpty(a)) {
                                        com.google.wireless.android.finsky.dfe.c.a.bl blVar = new com.google.wireless.android.finsky.dfe.c.a.bl();
                                        blVar.e = new bt();
                                        blVar.e.d();
                                        c1683a.f8714e.mo3138a(blVar);
                                    } else {
                                        c1683a.f8721l.m14870a(aaVar.e, a);
                                        c1683a.f8714e.mo3138a(aaVar.g);
                                    }
                                } else {
                                    String string;
                                    com.google.wireless.android.finsky.dfe.c.a.bl blVar2 = new com.google.wireless.android.finsky.dfe.c.a.bl();
                                    blVar2.e = new bt();
                                    blVar2.e.d();
                                    is isVar = new is();
                                    Bundle bundle = redeemCodeResult.f9310d;
                                    if (bundle != null) {
                                        str = bundle.getString("inapp_signed_purchase_data");
                                        string = bundle.getString("inapp_purchase_data_signature");
                                    } else {
                                        string = null;
                                    }
                                    if (str == null || string == null) {
                                        isVar.f12704a = new it[1];
                                    } else {
                                        isVar.f12704a = new it[3];
                                        it itVar = new it();
                                        itVar.m12815a("INAPP_PURCHASE_DATA");
                                        itVar.m12819b(str);
                                        it itVar2 = new it();
                                        itVar2.m12815a("INAPP_DATA_SIGNATURE");
                                        itVar2.m12819b(string);
                                        isVar.f12704a[1] = itVar;
                                        isVar.f12704a[2] = itVar2;
                                    }
                                    isVar.f12704a[0] = new it();
                                    isVar.f12704a[0].m12815a("RESPONSE_CODE");
                                    isVar.f12704a[0].m12814a(C1691g.RESULT_OK.f8744d);
                                    blVar2.e.b = isVar;
                                    c1683a.f8714e.mo3138a(blVar2);
                                }
                            }
                        }
                        c1683a.f8727r.remove(num);
                        i3 = 1;
                        break;
                    case 2:
                        ai aiVar = (ai) ParcelableProto.m21673a(c1683a.f8727r, num);
                        if (intent == null) {
                            c1683a.f8714e.mo3138a(aiVar.f);
                        } else {
                            ff ffVar = (ff) ParcelableProto.m21672a(intent, "topUpResult");
                            if (ffVar == null) {
                                c1683a.f8714e.mo3138a(aiVar.f);
                            } else {
                                c1683a.f8723n.m13367a(new C2474c(327).m13240a(aiVar.d).m13248d(1));
                                c1683a.f8721l.m14870a(aiVar.c, ffVar.b);
                                c1683a.f8714e.mo3138a(aiVar.e);
                            }
                        }
                        c1683a.f8727r.remove(num);
                        i3 = 1;
                        break;
                    case 3:
                        c cVar = (c) ParcelableProto.m21673a(c1683a.f8727r, num);
                        if (-1 == i2) {
                            c1683a.f8714e.mo3138a(cVar.b);
                        } else {
                            c1683a.f8714e.mo3138a(cVar.c);
                        }
                        c1683a.f8727r.remove(num);
                        i3 = 1;
                        break;
                    case 4:
                        com.google.wireless.android.finsky.dfe.c.a.b bVar = (com.google.wireless.android.finsky.dfe.c.a.b) ParcelableProto.m21673a(c1683a.f8727r, num);
                        if (i2 == -1 && intent != null && intent.hasExtra("challenge_response")) {
                            Bundle bundleExtra = intent.getBundleExtra("challenge_response");
                            c1683a.f8721l.m14870a(bVar.f, bundleExtra.getString(bVar.e.b));
                            c1683a.f8721l.m14870a(bVar.g, bundleExtra.getString(bVar.e.c));
                            c1683a.f8714e.mo3138a(bVar.b);
                        } else {
                            c1683a.f8714e.mo3138a(bVar.c);
                        }
                        c1683a.f8727r.remove(num);
                        i3 = 1;
                        break;
                    case 5:
                        f fVar = (f) ParcelableProto.m21673a(c1683a.f8727r, num);
                        if (i2 == -1 && fVar.b != null) {
                            c1683a.f8714e.mo3138a(fVar.b);
                        } else if (i2 == 0 && fVar.c != null) {
                            c1683a.f8714e.mo3138a(fVar.c);
                        }
                        c1683a.f8727r.remove(num);
                        i3 = 1;
                        break;
                    case 6:
                        u uVar = (u) ParcelableProto.m21673a(c1683a.f8727r, num);
                        if (-1 == i2) {
                            c1683a.f8714e.mo3138a(uVar.b);
                        } else {
                            c1683a.f8714e.mo3138a(uVar.c);
                        }
                        c1683a.f8727r.remove(num);
                        i3 = 1;
                        break;
                    default:
                        break;
                }
            }
            FinskyLog.m21669e("Already handled the result.", new Object[0]);
        }
        i3 = 0;
        if (i3 == 0) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public final void m9416a(int i, Bundle bundle) {
        C1764f c1764f = this.f8645K;
        if (i == 50) {
            c1764f.m9687a(bundle);
        }
        c1764f.m9686a(i);
        c1764f.m9688a(c1764f.f9096c.d);
    }

    public final void m9417b(int i, Bundle bundle) {
        C1764f c1764f = this.f8645K;
        if (i == 50) {
            c1764f.m9687a(bundle);
        }
        c1764f.m9686a(i);
    }
}
