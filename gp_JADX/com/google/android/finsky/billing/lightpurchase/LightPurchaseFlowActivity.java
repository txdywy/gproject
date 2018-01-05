package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.app.C0141p;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.Toast;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.aa.C0957n;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.activities.C1036b;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.at.C0998m;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.billing.C1835g;
import com.google.android.finsky.billing.C1886u;
import com.google.android.finsky.billing.C2039p;
import com.google.android.finsky.billing.acquire.C1690f;
import com.google.android.finsky.billing.common.C1647h;
import com.google.android.finsky.billing.common.C1789d;
import com.google.android.finsky.billing.common.C1793i;
import com.google.android.finsky.billing.common.C1799o;
import com.google.android.finsky.billing.legacyauth.C1884l;
import com.google.android.finsky.billing.lightpurchase.vr.VrPurchaseActivity;
import com.google.android.finsky.billing.p158f.C1831a;
import com.google.android.finsky.billing.profile.C2063t;
import com.google.android.finsky.billing.promptforfop.C2071a;
import com.google.android.finsky.billing.promptforfop.PromptForFopActivity;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.cl.C2289a;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.dfemodel.C2713b;
import com.google.android.finsky.dfemodel.C2726q;
import com.google.android.finsky.dfemodel.C2731v;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dh.C2744a;
import com.google.android.finsky.download.C2838a;
import com.google.android.finsky.dx.C2910a;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.installqueue.C3361d;
import com.google.android.finsky.installqueue.C3366j;
import com.google.android.finsky.installqueue.InstallRequest;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2476e;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p198f.C3026a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.wallet.common.util.a;
import com.google.vr.b.a.e;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.a.a.a.a.cf;
import com.google.wireless.android.finsky.dfe.c.a.ak;
import com.google.wireless.android.finsky.dfe.c.a.an;
import com.google.wireless.android.p356a.p357a.p358a.p359a.bo;
import com.squareup.leakcanary.C7582R;

public class LightPurchaseFlowActivity extends C1036b implements C0998m, C1884l, C1886u, ad {
    public final C2910a f9648D;
    public final C0986a f9649E;
    public C3300k f9650G;
    public Bundle f9651H;
    public Account f9652I;
    public String f9653J;
    public ax f9654K;
    public int f9655L;
    public String f9656M;
    public boolean f9657N;
    public C2731v f9658O;
    public boolean f9659P;
    public int f9660Q;
    public String f9661R;
    public boolean f9662S;
    public Document f9663T;
    public String f9664U;
    public int f9665V;
    public String f9666W;
    public boolean f9667X;
    public boolean f9668Y;
    public boolean f9669Z;
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
    public ce ap;
    public C1793i aq;
    public C1831a ar;
    public ag as;
    public final Handler f9670c = new Handler();
    public final C2471a f9671t = C1473m.f7980a.aR();

    public LightPurchaseFlowActivity() {
        C1473m.f7980a.aJ();
        this.aq = C1473m.f7980a.aG();
        this.f9648D = C1473m.f7980a.au();
        this.ar = C1831a.f9415a;
        this.f9649E = C1473m.f7980a.mo2041U();
        C1473m.f7980a.bD();
        C1473m.f7980a.bx();
    }

    @Deprecated
    public static Intent m10056a(Account account, Document document, String str, int i, C2731v c2731v, byte[] bArr, String str2, int i2, String str3, boolean z, int i3, C2495w c2495w) {
        Object obj = (!m10059a(account.name, i2) || document.f14885a.f12099f == 3) ? null : 1;
        if (obj != null) {
            boolean z2 = true;
            if (document != null) {
                bl a = document.m14640a(str, i);
                if (a != null) {
                    z2 = a.f11924n;
                }
            }
            if (m10060a(account.name, document, z2, false)) {
                String str4;
                C1799o a2 = new C1799o().m9790a(document);
                a2.f9334e = str;
                a2.f9333d = i;
                a2.f9335f = c2731v;
                a2.f9347r = bArr;
                int h = document != null ? document.m14653h() : -1;
                if (document != null) {
                    str4 = document.f14885a.f12100g;
                } else {
                    str4 = null;
                }
                C1799o a3 = a2.m9788a(h, str4, str2, i3);
                a3.f9342m = i2;
                a3.f9339j = str3;
                a3.f9348s = z;
                return C1473m.f7980a.bo().mo2726a(account, C1473m.f7980a.f7981b, C1473m.f7980a.mo2249j(account.name), document, c2495w, a3.m9786a(), null, false, true);
            }
        }
        Intent intent = new Intent(C1473m.f7980a.f7981b, LightPurchaseFlowActivity.class);
        intent.putExtra("LightPurchaseFlowActivity.account", account);
        intent.putExtra("LightPurchaseFlowActivity.doc", document);
        if (str != null) {
            intent.putExtra("LightPurchaseFlowActivity.offerId", str);
        }
        intent.putExtra("LightPurchaseFlowActivity.offerType", i);
        if (c2731v != null) {
            intent.putExtra("LightPurchaseFlowActivity.offerFilter", c2731v.name());
        }
        intent.putExtra("LightPurchaseFlowActivity.appsContinueUrl", str2);
        intent.putExtra("LightPurchaseFlowActivity.serverLogsCookie", bArr);
        intent.putExtra("LightPurchaseFlowActivity.indirectProvisioningType", i2);
        intent.putExtra("LightPurchaseFlowActivity.voucherId", str3);
        intent.putExtra("LightPurchaseFlowActivity.bypassAcquisitionWarnings", z);
        intent.putExtra("LightPurchaseFlowActivity.appPurchaseVoucherContext", i3);
        c2495w.m13366a(account).m13376a(intent);
        return intent;
    }

    protected void onCreate(Bundle bundle) {
        boolean z;
        Intent intent = getIntent();
        if (mo1276k()) {
            if (!m10061b(intent)) {
                this.f9667X = true;
            }
            if (m10084h(false)) {
                this.f9668Y = true;
            }
        } else {
            String callingPackage = getCallingPackage();
            if (callingPackage == null || !callingPackage.equals(getPackageName())) {
                FinskyLog.m21667d("Blocked request from external package: %s", callingPackage);
                z = false;
            } else {
                this.f9659P = true;
                this.f9652I = (Account) intent.getParcelableExtra("LightPurchaseFlowActivity.account");
                this.f9663T = (Document) intent.getParcelableExtra("LightPurchaseFlowActivity.doc");
                this.f9654K = this.f9663T.m14646d();
                this.f9653J = this.f9663T.f14885a.f12096c;
                this.f9655L = intent.getIntExtra("LightPurchaseFlowActivity.offerType", 0);
                this.f9656M = intent.getStringExtra("LightPurchaseFlowActivity.offerId");
                if (intent.hasExtra("LightPurchaseFlowActivity.offerFilter")) {
                    this.f9658O = C2731v.valueOf(intent.getStringExtra("LightPurchaseFlowActivity.offerFilter"));
                }
                if (this.f9655L != 0) {
                    bl e = this.f9663T.m14649e(this.f9655L);
                    if (e == null) {
                        FinskyLog.m21667d("Offer type not available: %d", Integer.valueOf(this.f9655L));
                        z = false;
                    } else {
                        this.f9657N = e.f11924n;
                    }
                }
                this.f9664U = intent.getStringExtra("LightPurchaseFlowActivity.appsContinueUrl");
                this.ak = true;
                this.al = false;
                this.f9660Q = intent.getIntExtra("LightPurchaseFlowActivity.indirectProvisioningType", 0);
                this.f9661R = intent.getStringExtra("LightPurchaseFlowActivity.voucherId");
                this.ae = intent.getBooleanExtra("LightPurchaseFlowActivity.bypassAcquisitionWarnings", false);
                this.aj = intent.getIntExtra("LightPurchaseFlowActivity.appPurchaseVoucherContext", 0);
                z = true;
            }
            if (!z) {
                this.f9667X = true;
            }
        }
        if (this.f9662S) {
            e.a(this);
        }
        if (bundle != null) {
            this.f9654K = (ax) ParcelableProto.m21673a(bundle, "LightPurchaseFlowActivity.docid");
            this.f9653J = bundle.getString("LightPurchaseFlowActivity.docidStr");
            this.f9663T = (Document) bundle.getParcelable("LightPurchaseFlowActivity.doc");
            this.f9655L = bundle.getInt("LightPurchaseFlowActivity.offerType", 0);
            this.f9656M = bundle.getString("LightPurchaseFlowActivity.offerId");
            this.f9657N = bundle.getBoolean("LightPurchaseFlowActivity.offerRequiresCheckout");
            this.f9666W = bundle.getString("LightPurchaseFlowActivity.appTitle");
            this.f9665V = bundle.getInt("LightPurchaseFlowActivity.appVersionCode");
            this.f9667X = bundle.getBoolean("LightPurchaseFlowActivity.failed");
            this.f9669Z = bundle.getBoolean("LightPurchaseFlowActivity.postSuccessItemOpened");
            this.ac = bundle.getBoolean("LightPurchaseFlowActivity.tosLaunched");
            this.ad = bundle.getBoolean("LightPurchaseFlowActivity.appPermissionsLaunched");
            this.f9660Q = bundle.getInt("LightPurchaseFlowActivity.indirectProvisioningType");
            this.af = bundle.getBundle("LightPurchaseFlowActivity.downloadSizeWarningArgs");
            this.ag = bundle.getBoolean("LightPurchaseFlowActivity.showNetworkDialog");
            if (C1473m.f7980a.dj().mo2294a(12643667)) {
                this.ai = (InstallRequest) bundle.getParcelable("LightPurchaseFlowActivity.pendingAutoInstallDependencyRequest");
                if (this.ai != null) {
                    C1473m c1473m = C1473m.f7980a;
                    ag agVar = new ag(c1473m.cS(), c1473m.mo2045Y(), c1473m.bw(), c1473m.mo2040T(), this, bundle);
                    if (this.ai != null) {
                        if (agVar.f9743i) {
                            this.as = agVar;
                        } else {
                            m10077a(this.ai);
                        }
                    }
                }
            }
        }
        this.f9651H = bundle;
        this.f9650G = C1473m.f7980a.mo2256o();
        if (this.f9652I != null) {
            if (C1473m.f7980a.mo2249j(this.f9652I.name).mo2294a(12633090) && this.f9654K.f11834c == 1) {
                z = true;
            } else {
                z = false;
            }
            this.am = z;
            this.an = C1473m.f7980a.mo2249j(this.f9652I.name).mo2294a(12636492);
            this.ao = C1473m.f7980a.mo2249j(this.f9652I.name).mo2294a(12636493);
        }
        this.ap = C2482j.m13283a(700);
        this.ap.e = new cf();
        if (this.f9653J != null) {
            this.ap.e.a(this.f9653J);
        }
        this.ap.e.a(this.f9655L);
        C2482j.m13285a(this.ap, intent.getByteArrayExtra("LightPurchaseFlowActivity.serverLogsCookie"));
        super.onCreate(bundle);
    }

    protected void onResume() {
        super.onResume();
        if (this.f9662S && VERSION.SDK_INT >= 19) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("LightPurchaseFlowActivity.docid", ParcelableProto.m21671a(this.f9654K));
        bundle.putString("LightPurchaseFlowActivity.docidStr", this.f9653J);
        bundle.putParcelable("LightPurchaseFlowActivity.doc", this.f9663T);
        bundle.putInt("LightPurchaseFlowActivity.offerType", this.f9655L);
        bundle.putString("LightPurchaseFlowActivity.offerId", this.f9656M);
        bundle.putBoolean("LightPurchaseFlowActivity.offerRequiresCheckout", this.f9657N);
        bundle.putBoolean("LightPurchaseFlowActivity.postSuccessItemOpened", this.f9669Z);
        bundle.putString("LightPurchaseFlowActivity.appTitle", this.f9666W);
        bundle.putInt("LightPurchaseFlowActivity.appVersionCode", this.f9665V);
        bundle.putBoolean("LightPurchaseFlowActivity.failed", this.f9667X);
        bundle.putBoolean("LightPurchaseFlowActivity.tosLaunched", this.ac);
        bundle.putBoolean("LightPurchaseFlowActivity.appPermissionsLaunched", this.ad);
        bundle.putInt("LightPurchaseFlowActivity.indirectProvisioningType", this.f9660Q);
        bundle.putBundle("LightPurchaseFlowActivity.downloadSizeWarningArgs", this.af);
        bundle.putBoolean("LightPurchaseFlowActivity.showNetworkDialog", this.ag);
        if (C1473m.f7980a.dj().mo2294a(12643667)) {
            bundle.putParcelable("LightPurchaseFlowActivity.pendingAutoInstallDependencyRequest", this.ai);
            if (this.as != null) {
                this.as.mo2511a(bundle);
            }
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f9662S && (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    private final boolean m10061b(Intent intent) {
        this.f9659P = C2744a.m14792b((Activity) this);
        if (!((Boolean) C0955b.al.m28964b()).booleanValue() && !this.f9659P) {
            FinskyLog.m21667d("Called from untrusted package.", new Object[0]);
            return false;
        } else if (intent.hasExtra("backend") && intent.hasExtra("document_type") && intent.hasExtra("backend_docid") && intent.hasExtra("full_docid")) {
            if (intent.hasExtra("authAccount")) {
                this.f9652I = this.f9649E.mo1183b(intent.getStringExtra("authAccount"));
                if (this.f9652I == null) {
                    FinskyLog.m21667d("Invalid account passed: %s", r0);
                    return false;
                }
            }
            this.f9652I = C1473m.f7980a.cY();
            this.f9654K = C2726q.m14747a(intent.getIntExtra("backend", 0), intent.getIntExtra("document_type", 0), intent.getStringExtra("backend_docid"));
            this.f9653J = intent.getStringExtra("full_docid");
            this.f9663T = null;
            this.f9655L = intent.getIntExtra("offer_type", 0);
            this.f9656M = intent.getStringExtra("offer_id");
            this.f9657N = intent.getBooleanExtra("requires_checkout", true);
            String stringExtra = intent.getStringExtra("offer_filter");
            if (stringExtra != null) {
                try {
                    this.f9658O = C2731v.valueOf(stringExtra);
                } catch (IllegalArgumentException e) {
                    FinskyLog.m21667d("Invalid offer types passed: %s", stringExtra);
                    return false;
                }
            }
            this.f9664U = null;
            if (this.f9657N) {
                this.ak = true;
                this.al = false;
            } else {
                this.ak = false;
                this.al = true;
            }
            C1473m.f7980a.aY().mo2306a(this.f9652I.name).mo2321b(intent.getStringExtra("family_consistency_token"));
            this.aa = intent.getStringExtra("referral_url");
            this.f9660Q = intent.getIntExtra("indirect_provisioning_type", 0);
            this.f9662S = intent.getBooleanExtra("vr", false);
            this.ab = intent.getBooleanExtra("suppress_post_success_action", false);
            return true;
        } else {
            FinskyLog.m21667d("Missing argument.", new Object[0]);
            return false;
        }
    }

    final boolean mo1276k() {
        return "com.android.vending.billing.PURCHASE".equals(getIntent().getAction());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void m10075a(android.os.Bundle r15, boolean r16, com.google.android.finsky.installqueue.InstallRequest r17) {
        /*
        r14 = this;
        r1 = com.google.android.finsky.C1473m.f7980a;
        r1 = r1.ah();
        r2 = r14.f9652I;
        r2 = r1.mo2811a(r2);
        r1 = r14.f9660Q;
        r3 = 1;
        if (r1 == r3) goto L_0x00ff;
    L_0x0011:
        r1 = com.google.android.finsky.C1473m.f7980a;
        r1 = r1.mo2045Y();
        r3 = r14.f9654K;
        r4 = r14.f9655L;
        r1 = r1.m11646a(r3, r2, r4);
        if (r1 == 0) goto L_0x00ff;
    L_0x0021:
        r1 = r14.f9654K;
        r1 = r1.f11834c;
        r3 = 1;
        if (r1 != r3) goto L_0x006b;
    L_0x0028:
        if (r16 == 0) goto L_0x002e;
    L_0x002a:
        r14.m10053I();
    L_0x002d:
        return;
    L_0x002e:
        if (r15 == 0) goto L_0x0045;
    L_0x0030:
        r1 = 0;
        r2 = r14.f9652I;
        r2 = r2.name;
        r3 = r14.f6316C;
        r1 = com.google.android.finsky.billing.C2039p.m10725a(r1, r2, r15, r3);
        r2 = r14.H_();
        r3 = "LightPurchaseFlowActivity.appDownloadSizeWarningDialog";
        r1.m625a(r2, r3);
        goto L_0x002d;
    L_0x0045:
        r14.m10090z();
        r1 = com.google.android.finsky.C1473m.f7980a;
        r1 = r1.bu();
        r2 = r14.f9663T;
        r1.m15637b(r2);
        r1 = com.google.android.finsky.C1473m.f7980a;
        r1 = r1.mo2169c();
        r2 = r14.f9654K;
        r2 = r2.f11833b;
        r3 = r14.f9664U;
        r1.mo2671b(r2, r3);
        r0 = r17;
        r14.m10077a(r0);
        r14.m10088m();
        goto L_0x002d;
    L_0x006b:
        r1 = r14.f9657N;
        if (r1 == 0) goto L_0x00c1;
    L_0x006f:
        r1 = r14.f9654K;
        r1 = r1.f11834c;
        r3 = 15;
        if (r1 == r3) goto L_0x007d;
    L_0x0077:
        r1 = r14.f9655L;
        r3 = 13;
        if (r1 != r3) goto L_0x00f7;
    L_0x007d:
        r1 = 1;
    L_0x007e:
        r3 = r14.f9654K;
        r3 = r3.f11835d;
        r4 = 2;
        if (r3 != r4) goto L_0x00f9;
    L_0x0085:
        if (r1 == 0) goto L_0x00f9;
    L_0x0087:
        r1 = 2;
        r3 = com.google.android.finsky.by.C2229h.m11636a(r1);
        r8 = r2.mo2793g(r3);
        r1 = new com.google.android.finsky.by.g;
        r2 = r14.f9652I;
        r2 = r2.name;
        r4 = 2;
        r5 = r14.f9654K;
        r5 = r5.f11833b;
        r6 = r14.f9654K;
        r6 = r6.f11834c;
        r7 = r14.f9655L;
        r1.<init>(r2, r3, r4, r5, r6, r7);
        r1 = r8.mo2784b(r1);
        if (r1 == 0) goto L_0x00f9;
    L_0x00aa:
        r1 = (com.google.android.finsky.by.C2231n) r1;
        r1 = r1.f11131e;
        if (r1 != 0) goto L_0x00f9;
    L_0x00b0:
        r1 = 1;
    L_0x00b1:
        if (r1 == 0) goto L_0x00c1;
    L_0x00b3:
        r1 = com.google.android.finsky.aa.C0955b.dk;
        r1 = r1.m28964b();
        r1 = (java.lang.Boolean) r1;
        r1 = r1.booleanValue();
        if (r1 != 0) goto L_0x00ff;
    L_0x00c1:
        r1 = r14.f9654K;
        r1 = r1.f11834c;
        r1 = com.google.android.finsky.dfemodel.C2726q.m14753b(r1);
        if (r1 == 0) goto L_0x00fb;
    L_0x00cb:
        r1 = 2131953208; // 0x7f130638 float:1.954288E38 double:1.0533248386E-314;
    L_0x00ce:
        r1 = r14.getString(r1);
        r2 = new com.google.android.finsky.at.k;
        r2.<init>();
        r1 = r2.m8852a(r1);
        r3 = 2131952688; // 0x7f130430 float:1.9541826E38 double:1.0533245817E-314;
        r1 = r1.m8860d(r3);
        r3 = 0;
        r4 = 4;
        r5 = 0;
        r1.m8851a(r3, r4, r5);
        r1 = r2.mo2272a();
        r2 = r14.H_();
        r3 = "LightPurchaseFlowActivity.errorDialog";
        r1.m625a(r2, r3);
        goto L_0x002d;
    L_0x00f7:
        r1 = 0;
        goto L_0x007e;
    L_0x00f9:
        r1 = 0;
        goto L_0x00b1;
    L_0x00fb:
        r1 = 2131952061; // 0x7f1301bd float:1.9540554E38 double:1.053324272E-314;
        goto L_0x00ce;
    L_0x00ff:
        r1 = r14.f9657N;
        if (r1 == 0) goto L_0x0171;
    L_0x0103:
        r1 = com.google.android.finsky.billing.common.PurchaseParams.m9747b();
        r2 = r14.f9654K;
        r1.f9330a = r2;
        r2 = r14.f9653J;
        r1.f9331b = r2;
        r2 = r14.f9655L;
        r1.f9333d = r2;
        r2 = r14.f9656M;
        r1.f9334e = r2;
        r2 = r14.getCallingPackage();
        r1.f9341l = r2;
        r2 = r14.f9665V;
        r3 = r14.f9666W;
        r4 = r14.f9664U;
        r5 = r14.aj;
        r1 = r1.m9788a(r2, r3, r4, r5);
        r2 = r14.f9661R;
        r1.f9339j = r2;
        r2 = r14.f9662S;
        r1.f9344o = r2;
        r2 = r14.ab;
        r1.f9345p = r2;
        r2 = r14.f9663T;
        if (r2 == 0) goto L_0x013e;
    L_0x0139:
        r2 = r14.f9663T;
        r1.m9790a(r2);
    L_0x013e:
        r2 = r14.f9660Q;
        if (r2 == 0) goto L_0x0146;
    L_0x0142:
        r2 = r14.f9660Q;
        r1.f9342m = r2;
    L_0x0146:
        if (r17 == 0) goto L_0x0150;
    L_0x0148:
        r2 = "Use of the Schedule API is not yet implemented on the purchasepath. See b/34389865 and b/34390103";
        r3 = 0;
        r3 = new java.lang.Object[r3];
        com.google.android.finsky.utils.FinskyLog.m21669e(r2, r3);
    L_0x0150:
        r1 = r1.m9786a();
        r2 = r14.getIntent();
        r3 = "LightPurchaseFlowActivity.serverLogsCookie";
        r2 = r2.getByteArrayExtra(r3);
        r3 = r14.am;
        if (r3 == 0) goto L_0x0163;
    L_0x0162:
        r15 = 0;
    L_0x0163:
        r3 = r14.f9652I;
        r4 = r14.f6316C;
        r1 = com.google.android.finsky.billing.lightpurchase.PurchaseActivity.m10038a(r3, r1, r2, r15, r4);
        r2 = 1;
        r14.startActivityForResult(r1, r2);
        goto L_0x002d;
    L_0x0171:
        r1 = r14.am;
        if (r1 != 0) goto L_0x0194;
    L_0x0175:
        if (r16 == 0) goto L_0x017c;
    L_0x0177:
        r14.m10053I();
        goto L_0x002d;
    L_0x017c:
        if (r15 == 0) goto L_0x0194;
    L_0x017e:
        r1 = 0;
        r2 = r14.f9652I;
        r2 = r2.name;
        r3 = r14.f6316C;
        r1 = com.google.android.finsky.billing.C2039p.m10725a(r1, r2, r15, r3);
        r2 = r14.H_();
        r3 = "LightPurchaseFlowActivity.appDownloadSizeWarningDialog";
        r1.m625a(r2, r3);
        goto L_0x002d;
    L_0x0194:
        r1 = r14.f9652I;
        r2 = r14.f9663T;
        r3 = r14.f9654K;
        r4 = r14.f9653J;
        r5 = r14.f9655L;
        r6 = r14.f9664U;
        r7 = 0;
        r8 = new com.google.android.finsky.billing.lightpurchase.aj;
        r8.<init>(r14);
        r9 = new com.google.android.finsky.billing.lightpurchase.ai;
        r9.<init>(r14);
        r10 = r14.am;
        if (r10 != 0) goto L_0x01bb;
    L_0x01af:
        r10 = 1;
    L_0x01b0:
        r11 = r14.ak;
        r12 = r14.f6316C;
        r13 = r17;
        com.google.android.finsky.billing.lightpurchase.ar.m10198a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
        goto L_0x002d;
    L_0x01bb:
        r10 = 0;
        goto L_0x01b0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.billing.lightpurchase.LightPurchaseFlowActivity.a(android.os.Bundle, boolean, com.google.android.finsky.installqueue.InstallRequest):void");
    }

    private final void m10058a(String str, String str2, Document document) {
        startActivityForResult(C1473m.f7980a.bo().mo2748a((Context) this, str, str2, document, false, this.f6316C), 2);
    }

    final void m10087l() {
        m10083c(this.al ? 1 : 0);
    }

    final void m10083c(int i) {
        setResult(i);
        m10064j(false);
        finish();
    }

    final void m10088m() {
        if (this.f9659P) {
            Intent intent = new Intent();
            intent.putExtra("authAccount", this.f9652I.name);
            intent.putExtra("backend", this.f9654K.f11835d);
            intent.putExtra("document_type", this.f9654K.f11834c);
            intent.putExtra("backend_docid", this.f9654K.f11833b);
            intent.putExtra("offer_type", this.f9655L);
            intent.putExtra("offer_id", this.f9656M);
            intent.putExtra("post_success_item_opened", this.f9669Z);
            setResult(-1, intent);
        } else {
            setResult(-1);
        }
        m10064j(true);
        finish();
    }

    protected final void mo2504r() {
        if (this.f9662S) {
            m10054J();
            m10083c(2);
            return;
        }
        super.mo2504r();
    }

    final void m10090z() {
        C2713b k = C1473m.f7980a.mo2251k(this.f9652I.name);
        if (k != null) {
            k.m14711a(this.f9653J);
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case 1:
                this.f9670c.post(new ab(this, i2, intent));
                return;
            case 2:
                this.f9670c.post(new C1993z(this, i2, intent));
                return;
            case 3:
                this.f9670c.post(new aa(this, i2, intent));
                return;
            case 7:
                this.f9670c.post(new C1992y(this, i2));
                return;
            case 8:
                this.f9670c.post(new C1963v(this, i2));
                return;
            case 9:
                this.f9670c.post(new ac(this, i2, intent));
                return;
            case 10:
                this.f9670c.post(new ae(this, i2, intent));
                return;
            case 11:
                this.f9670c.post(new af(this, i2));
                return;
            case 13:
                this.f9670c.post(new C1990w(this));
                return;
            case 14:
                this.f9670c.post(new C1991x(this, i2));
                return;
            case 25:
                this.f9670c.post(new ad(this, i2));
                return;
            default:
                super.onActivityResult(i, i2, intent);
                return;
        }
    }

    final boolean m10084h(boolean z) {
        if (C1473m.f7980a.mo2249j(this.f9652I.name).mo2294a(12637988) && C1690f.m9476a()) {
            int i = 1;
        } else {
            boolean z2 = false;
        }
        if ((this.f9662S && r0 == 0) || !m10059a(this.f9652I.name, this.f9660Q) || !m10060a(this.f9652I.name, this.f9663T, this.f9657N, mo1276k()) || C1473m.f7980a.mo2045Y().m11646a(this.f9654K, C1473m.f7980a.ah().mo2811a(this.f9652I), this.f9655L)) {
            return false;
        }
        String str;
        String callingPackage = getCallingPackage();
        C1799o c1799o = new C1799o();
        c1799o.f9334e = this.f9656M;
        c1799o.f9333d = this.f9655L;
        c1799o.f9335f = this.f9658O;
        c1799o.f9347r = getIntent().getByteArrayExtra("LightPurchaseFlowActivity.serverLogsCookie");
        i = this.f9663T != null ? this.f9663T.m14653h() : -1;
        if (this.f9663T != null) {
            str = this.f9663T.f14885a.f12100g;
        } else {
            str = null;
        }
        C1799o a = c1799o.m9788a(i, str, this.f9664U, this.aj);
        a.f9342m = this.f9660Q;
        a.f9339j = this.f9661R;
        a.f9348s = this.ae;
        a.f9345p = this.ab;
        a.f9341l = callingPackage;
        a.f9351v = C2744a.m14791b(this, callingPackage);
        a.f9349t = mo1276k();
        a.f9350u = this.f9659P;
        a.f9344o = this.f9662S;
        if (this.f9663T != null) {
            a.m9790a(this.f9663T);
        } else {
            a.f9330a = this.f9654K;
            a.f9331b = this.f9653J;
        }
        Intent a2 = C1473m.f7980a.bo().mo2726a(this.f9652I, getApplicationContext(), C1473m.f7980a.mo2249j(this.f9652I.name), this.f9663T, this.C, a.m9786a(), null, false, false);
        if (z) {
            startActivityForResult(a2, 1);
        } else {
            a2.addFlags(33554432);
            startActivity(a2);
        }
        return true;
    }

    final boolean m10085i(boolean z) {
        boolean z2;
        ah ahVar;
        Bundle bundle;
        boolean z3 = this.af != null;
        C2838a bW = C1473m.f7980a.bW();
        boolean a = bW.m14997a();
        boolean a2 = C1473m.f7980a.dj().mo2294a(12641184);
        int a3 = bW.m14996a(a2);
        if (a || a2) {
            C3026a a4 = C1473m.f7980a.bt().m15626a(this.f9654K.f11833b);
            z2 = a4.m15624b(this.f9663T) || a4.m15622a(this.f9663T);
            if (!z2) {
                z2 = true;
                if (z2 || a3 != 3) {
                    a = false;
                } else {
                    a = true;
                }
                if (a) {
                    z3 = false;
                }
                if (this.ae) {
                    C1473m.f7980a.bx();
                    if (a3 == 2 || C1473m.f7980a.mo2258q().m11720b() || !z2) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!a && a3 == 4) {
                        m10062c(this.f9654K.f11833b);
                    }
                } else {
                    z2 = false;
                }
                ahVar = new ah(z3, m10057a(a, this.f9654K.f11833b), z2);
                this.ah = ahVar.f9745b;
                if (z) {
                    if (ahVar.f9744a) {
                        bundle = null;
                    } else {
                        bundle = this.af;
                    }
                    m10075a(bundle, ahVar.f9746c, ahVar.f9745b);
                } else if (ahVar.f9746c) {
                    m10053I();
                } else if (ahVar.f9744a) {
                    return false;
                } else {
                    C2039p.m10725a(null, this.f9652I.name, this.af, this.f6316C).m625a(H_(), "LightPurchaseFlowActivity.appDownloadSizeWarningDialog");
                }
                return true;
            }
        }
        z2 = false;
        if (z2) {
        }
        a = false;
        if (a) {
            z3 = false;
        }
        if (this.ae) {
            z2 = false;
        } else {
            C1473m.f7980a.bx();
            if (a3 == 2) {
            }
            z2 = false;
            m10062c(this.f9654K.f11833b);
        }
        ahVar = new ah(z3, m10057a(a, this.f9654K.f11833b), z2);
        this.ah = ahVar.f9745b;
        if (z) {
            if (ahVar.f9744a) {
                bundle = null;
            } else {
                bundle = this.af;
            }
            m10075a(bundle, ahVar.f9746c, ahVar.f9745b);
        } else if (ahVar.f9746c) {
            m10053I();
        } else if (ahVar.f9744a) {
            return false;
        } else {
            C2039p.m10725a(null, this.f9652I.name, this.af, this.f6316C).m625a(H_(), "LightPurchaseFlowActivity.appDownloadSizeWarningDialog");
        }
        return true;
    }

    private final void m10062c(String str) {
        FinskyLog.m21659a("Persistent download network preference no longer available. Will queue %s to be downloaded over any network", str);
        C1789d.f9315b.m5763a(Integer.valueOf(1));
        Toast.makeText(this, getString(C7582R.string.download_preference_not_available), 1).show();
    }

    private final InstallRequest m10057a(boolean z, String str) {
        if (C1473m.f7980a.dj().mo2294a(12623705)) {
            C3366j a = new C3366j(this.C, this.f9663T).m16815b(this.f9652I.name).m16810a("single_install");
            if (z) {
                a.m16813a(new C3361d().m16793a(2).m16799e());
            }
            return a.m16806a();
        } else if (z) {
            this.f9650G.mo3444b(str);
            return null;
        } else {
            this.f9650G.mo3431a(str);
            return null;
        }
    }

    final void m10077a(InstallRequest installRequest) {
        if (C1473m.f7980a.dj().mo2294a(12643667)) {
            C2495w a = this.f6316C.m13375a("single_install");
            if (installRequest == null) {
                installRequest = new C3366j(a.m13381c(), this.f9663T).m16815b(this.f9652I.name).m16814b(2).m16806a();
            }
            this.ai = installRequest;
            C1473m c1473m = C1473m.f7980a;
            this.as = new ag(c1473m.cS(), c1473m.mo2045Y(), c1473m.bw(), c1473m.mo2040T(), this, null);
            this.as.m10159a(installRequest, this.C);
        } else if (installRequest != null) {
            C1473m.f7980a.bw().m16744a(installRequest);
        } else {
            C3300k o = C1473m.f7980a.mo2256o();
            o.mo3439a(this.f9663T.m14625N().f13171k, this.f9663T.bV());
            o.mo3432a(this.f9663T.m14625N().f13171k, this.f9663T.m14625N().f13163c, this.f9652I.name, this.f9663T.f14885a.f12100g, 2, this.f9663T.m14671z(), this.f6316C.m13375a("single_install"));
        }
    }

    private final void m10053I() {
        C1835g.m9869a(null, this.f9652I.name, C1473m.f7980a.mo2223d().m8962c(this.f9663T), this.f6316C).m625a(H_(), "LightPurchaseFlowActivity.appDownloadNetworkDialog");
    }

    final void m10065A() {
        if (!C1473m.f7980a.bn().mo2700a(this, this.f9652I, this.f9663T, H_(), null, 5, null)) {
            this.f9669Z = true;
            m10088m();
        }
    }

    protected final void mo1249b(boolean z) {
        super.mo1249b(z);
        if (this.f9651H == null) {
            m10054J();
            if (this.f9668Y) {
                finish();
            } else if (this.f9667X) {
                m10087l();
            } else if (this.am && !C1503a.m8830a(this) && !this.f9662S) {
                m10058a(this.f9652I.name, this.f9653J, this.f9663T);
            } else if (this.an && m10068D()) {
                m10070F();
            } else if (m10067C()) {
                m10069E();
            } else {
                m10066B();
            }
        }
    }

    final void m10066B() {
        this.aq.m9770c(this, this.f9652I.name);
        if (this.an || !m10068D()) {
            m10071G();
        } else {
            m10070F();
        }
    }

    final boolean m10067C() {
        if (!C1473m.f7980a.mo2246h(this.f9652I.name).m22586a()) {
            return false;
        }
        C2206c ah = C1473m.f7980a.ah();
        if (this.f9654K.f11834c == 1) {
            if (!ah.mo2812a(this.f9653J).isEmpty()) {
                return false;
            }
        } else if (C1473m.f7980a.mo2045Y().m11645a(this.f9654K, ah.mo2811a(this.f9652I))) {
            return false;
        }
        if (this.f9663T == null) {
            return true;
        }
        return this.f9663T.f14885a.f12088E;
    }

    protected final boolean m10068D() {
        if (mo1276k()) {
            return false;
        }
        if (this.f9663T == null || this.f9663T.f14885a.f12098e != 1) {
            return false;
        }
        if (this.f9657N) {
            return false;
        }
        if (!C1473m.f7980a.ah().mo2812a(this.f9653J).isEmpty()) {
            return false;
        }
        if (C1503a.m8830a(this)) {
            return false;
        }
        C2063t aD = C1473m.f7980a.aD();
        String str = this.f9652I.name;
        long currentTimeMillis = System.currentTimeMillis();
        return aD.m10827b(str) && C2063t.m10823b(str, currentTimeMillis) && !((Boolean) C0954a.f5820P.m5777b(str).m5760a()).booleanValue() && !C2063t.m10822a(str, currentTimeMillis);
    }

    private final void m10054J() {
        this.f6316C.m13371a(m10063d(600), null);
        if (!TextUtils.isEmpty(this.aa)) {
            this.f6316C.m13369a(new C2476e(9).m13262a(this.aa)).m13382d().m13333d();
        }
    }

    private final void m10064j(boolean z) {
        bo d = m10063d(601);
        d.m28995a(z);
        this.f6316C.m13371a(d, null);
    }

    private final bo m10063d(int i) {
        C2474c c = new C2474c(i).m13236a(this.f9653J).m13213a(this.f9654K).m13247c(getCallingPackage());
        if (this.f9655L != 0) {
            c.m13241b(this.f9655L);
            c.m13245b(this.f9657N);
        }
        return c.f13342a;
    }

    final void m10069E() {
        startActivityForResult(C1473m.f7980a.bo().mo2743a((Context) this, this.f9652I.name, this.f9654K.f11835d, this.f9663T == null ? this.f9653J : null, this.f6316C), 8);
    }

    final void m10070F() {
        C1508k c1508k = new C1508k();
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("LightPurchaseFlowActivity.serverLogsCookie");
        c1508k.m8858c((int) C7582R.string.setup_account_title).m8848a((int) C7582R.string.review_account_message).m8860d((int) C7582R.string.continue_text).m8851a(null, 6, null).m8849a(1000, byteArrayExtra, -1, -1, this.f6316C.m13366a(this.f9652I));
        C0141p a = c1508k.mo2272a();
        C0957n b = C0954a.f5824T.m5777b(this.f9652I.name);
        b.m5763a(Integer.valueOf(((Integer) b.m5760a()).intValue() + 1));
        a.m625a(H_(), "LightPurchaseFlowActivity.fopRequiredDialog");
    }

    final void m10071G() {
        C1799o c1799o;
        if (C1503a.m8830a(this)) {
            c1799o = new C1799o();
            c1799o.f9330a = this.f9654K;
            c1799o.f9331b = this.f9653J;
            c1799o.f9333d = this.f9655L;
            c1799o.f9334e = this.f9656M;
            c1799o.f9335f = this.f9658O;
            startActivityForResult(C1473m.f7980a.bo().mo2728a(this.f9652I, getApplicationContext(), c1799o.m9788a(this.f9665V, this.f9666W, this.f9664U, this.aj).m9786a(), this.f9658O, m10055K(), C1473m.f7980a.mo2249j(this.f9652I.name)), 9);
        } else if (this.f9662S) {
            if (e.a(C1473m.f7980a.f7981b) == 0) {
                c1799o = new C1799o();
                c1799o.f9330a = this.f9654K;
                c1799o.f9331b = this.f9653J;
                c1799o.f9333d = this.f9655L;
                c1799o.f9334e = this.f9656M;
                c1799o = c1799o.m9788a(this.f9665V, this.f9666W, this.f9664U, this.aj);
                c1799o.f9344o = this.f9662S;
                startActivityForResult(VrPurchaseActivity.m10429a(this.f9652I, c1799o.m9786a(), this.f9658O), 11);
                return;
            }
            FinskyLog.m21665c("Purchase in VR mode requested in an unsupported environment.", new Object[0]);
            m10087l();
        } else if (this.f9654K.f11834c == 1) {
            if (this.am) {
                m10085i(true);
            } else {
                m10058a(this.f9652I.name, this.f9653J, this.f9663T);
            }
        } else if (TextUtils.isEmpty(this.f9656M) && this.f9655L == 0) {
            Parcelable dn = C1473m.f7980a.dn();
            Parcelable parcelable = this.f9652I;
            String str = this.f9653J;
            Parcelable parcelable2 = this.f9663T;
            C2731v c2731v = this.f9658O;
            int i = this.f9660Q;
            C2495w c2495w = this.f6316C;
            Intent intent = new Intent(C1473m.f7980a.f7981b, OfferResolutionActivity.class);
            intent.putExtra("OfferResolutionActivity.dfeToc", dn);
            intent.putExtra("OfferResolutionActivity.account", parcelable);
            intent.putExtra("OfferResolutionActivity.docid", str);
            intent.putExtra("OfferResolutionActivity.doc", parcelable2);
            intent.putExtra("OfferResolutionActivity.provisioningType", i);
            if (c2731v != null) {
                intent.putExtra("OfferResolutionActivity.offerFilter", c2731v.name());
            }
            c2495w.m13376a(intent);
            startActivityForResult(intent, 3);
        } else {
            m10075a(null, false, null);
        }
    }

    final boolean m10072H() {
        long j = -1;
        if (C1473m.f7980a.mo2249j(this.f9652I.name).mo2294a(12627971)) {
            return false;
        }
        ak h = this.f9648D.m15198h(this.f9652I.name);
        if (h == null) {
            return true;
        }
        if ((h.a & 4) != 0) {
            int i = 1;
        } else {
            boolean z = false;
        }
        if (i == 0) {
            FinskyLog.m21669e("SnoozeTimestamp is not set in UserSettings.", new Object[0]);
            return true;
        }
        C2910a c2910a = this.f9648D;
        String str = this.f9652I.name;
        int i2 = h.c;
        an g = c2910a.m15197g(str);
        if (g == null || g.d == null) {
            FinskyLog.m21665c("No settings for recovery options flow.", new Object[0]);
        } else if (i2 <= 0 || i2 > g.d.length) {
            FinskyLog.m21669e("Invalid snooze level: %d.", Integer.valueOf(i2));
        } else {
            j = ((long) g.d[i2 - 1]) * 60000;
        }
        if (j < 0 || System.currentTimeMillis() - h.d <= j) {
            return false;
        }
        return true;
    }

    public String getCallingPackage() {
        return a.a(this);
    }

    private final String m10055K() {
        String str = null;
        String callingPackage = getCallingPackage();
        if (callingPackage != null) {
            PackageManager packageManager = getPackageManager();
            try {
                str = packageManager.getApplicationLabel(packageManager.getApplicationInfo(callingPackage, 0)).toString();
            } catch (NameNotFoundException e) {
            }
        }
        return str;
    }

    private static boolean m10059a(String str, int i) {
        C1473m c1473m = C1473m.f7980a;
        if (!c1473m.mo2249j(str).mo2294a(12626228) || i == 1 || C1503a.m8830a(c1473m.f7981b) || C1503a.m8831b(c1473m.f7981b)) {
            return false;
        }
        return true;
    }

    private static boolean m10060a(String str, Document document, boolean z, boolean z2) {
        boolean z3;
        C1552e j = C1473m.f7980a.mo2249j(str);
        boolean z4 = z || !j.mo2294a(12633659);
        if (z2 && j.mo2294a(12637607)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z4) {
            if (z3) {
                return true;
            }
            if (document != null) {
                switch (document.f14885a.f12099f) {
                    case 1:
                        if (!j.mo2294a(12633661)) {
                            z3 = true;
                            break;
                        }
                        z3 = false;
                        break;
                    case 2:
                        if (!j.mo2294a(12633663)) {
                            z3 = true;
                            break;
                        }
                        z3 = false;
                        break;
                    case 3:
                        if (!j.mo2294a(12633660)) {
                            z3 = true;
                            break;
                        }
                        z3 = false;
                        break;
                    case 4:
                        if (!j.mo2294a(12633664)) {
                            z3 = true;
                            break;
                        }
                        z3 = false;
                        break;
                    case 6:
                        if (!j.mo2294a(12633662)) {
                            z3 = true;
                            break;
                        }
                        z3 = false;
                        break;
                }
            }
            z3 = false;
            if (z3) {
                return true;
            }
        }
        return false;
    }

    public final void mo1202a(int i, Bundle bundle) {
        switch (i) {
            case 4:
                m10087l();
                return;
            case 5:
                startActivity(C1473m.f7980a.bo().mo2745a((Context) this, bundle.getString("dialog_details_url"), this.f6316C));
                m10087l();
                return;
            case 6:
                byte[] byteArrayExtra = getIntent().getByteArrayExtra("LightPurchaseFlowActivity.serverLogsCookie");
                Account account = this.f9652I;
                C2495w c2495w = this.f6316C;
                Intent intent = new Intent(C1473m.f7980a.f7981b, PromptForFopActivity.class);
                C2071a.m10837a(account, byteArrayExtra, intent);
                c2495w.m13366a(account).m13376a(intent);
                startActivityForResult(intent, 7);
                return;
            default:
                FinskyLog.m21669e("Unknown dialog callback: %d", Integer.valueOf(i));
                return;
        }
    }

    public final void f_(int i) {
    }

    public final void mo1211b(int i, Bundle bundle) {
        m10087l();
    }

    public final void mo2499a(int i, boolean z) {
        boolean z2;
        InstallRequest installRequest;
        String str = this.f9654K.f11833b;
        switch (i) {
            case 3:
                FinskyLog.m21659a("Will queue %s to be downloaded on wifi only", str);
                z2 = true;
                installRequest = null;
                break;
            case 4:
                FinskyLog.m21659a("Will queue %s to be downloaded on offpeak or wifi", str);
                com.google.wireless.android.finsky.dfe.l.a.a a = C2289a.m11792a();
                if (a != null) {
                    C1473m.f7980a.bx();
                    C2495w c2495w = this.C;
                    String str2 = this.f9652I.name;
                    C3366j c3366j = new C3366j(c2495w, this.f9663T);
                    c3366j.m16815b(str2);
                    installRequest = C2289a.m11791a(c3366j.m16806a(), a);
                    z2 = false;
                    break;
                }
                m10062c(str);
                z2 = false;
                installRequest = null;
                break;
            default:
                FinskyLog.m21659a("Will queue %s to be downloaded over any network", str);
                z2 = false;
                installRequest = null;
                break;
        }
        if (installRequest == null) {
            installRequest = m10057a(z2, str);
        }
        if (this.am) {
            m10077a(installRequest);
            if (!this.f9657N) {
                m10090z();
                if (m10072H()) {
                    this.ar.mo2459a(this.f9652I, this.f6316C).m10013a(this);
                    return;
                }
            }
            m10088m();
            return;
        }
        m10075a(null, false, installRequest);
    }

    public final void U_() {
        startActivity(new Intent("android.settings.WIFI_SETTINGS"));
        m10087l();
    }

    public final void V_() {
        FinskyLog.m21659a("Download pre-acquisition warning dismissed for app = %s", this.f9654K.f11833b);
        m10087l();
    }

    public final void W_() {
        m10075a(null, false, null);
    }

    public ce getPlayStoreUiElement() {
        return this.ap;
    }

    public ad getParentNode() {
        return null;
    }

    public final void mo1219a(ad adVar) {
        FinskyLog.m21669e("Not using tree impressions.", new Object[0]);
    }

    public final void mo2500a(String str) {
        Object obj = this.f9652I;
        C2495w c2495w = this.f6316C;
        Intent intent = new Intent(C1473m.f7980a.f7981b, AddRecoveryOptionActivity.class);
        intent.putExtra("AddRecoveryOptionPromptDialog.account", obj);
        intent.putExtra("AddRecoveryOptionPromptDialog.initialUrl", str);
        c2495w.m13376a(intent);
        C1647h.m9344a(intent, obj.name);
        startActivityForResult(intent, 13);
    }

    public final void mo2501b() {
        FinskyLog.m21659a("Received response from API, no need to add recovery option", new Object[0]);
        this.f9648D.m15200j(this.f9652I.name);
        m10088m();
    }

    public final void mo2502c() {
        FinskyLog.m21667d("Can't receive response from API, some error happened", new Object[0]);
        m10088m();
    }
}
