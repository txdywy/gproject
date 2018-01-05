package com.google.android.finsky.billing.lightpurchase.vr;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.view.KeyEvent;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.billing.common.C1087t;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.iab.C1867w;
import com.google.android.finsky.billing.iab.C1868x;
import com.google.android.finsky.billing.lightpurchase.AuthenticatedWebViewActivity;
import com.google.android.finsky.billing.lightpurchase.IabV3Activity;
import com.google.android.finsky.billing.lightpurchase.PurchaseActivity;
import com.google.android.finsky.billing.lightpurchase.ay;
import com.google.android.finsky.billing.lightpurchase.vr.p163a.C1966c;
import com.google.android.finsky.billing.lightpurchase.vr.p163a.C1968e;
import com.google.android.finsky.billing.lightpurchase.vr.p163a.C1969f;
import com.google.android.finsky.billing.lightpurchase.vr.p163a.C1970g;
import com.google.android.finsky.billing.lightpurchase.vr.p163a.C1971h;
import com.google.android.finsky.billing.lightpurchase.vr.p163a.C1972i;
import com.google.android.finsky.billing.lightpurchase.vr.p163a.C1973j;
import com.google.android.finsky.billing.lightpurchase.vr.p163a.C1975l;
import com.google.android.finsky.billing.lightpurchase.vr.p163a.C1976m;
import com.google.android.finsky.billing.lightpurchase.vr.p163a.C1978o;
import com.google.android.finsky.billing.lightpurchase.vr.p163a.C1980q;
import com.google.android.finsky.billing.lightpurchase.vr.p163a.C1986w;
import com.google.android.finsky.billing.lightpurchase.vr.p163a.ac;
import com.google.android.finsky.billing.lightpurchase.vr.p163a.ak;
import com.google.android.finsky.billing.lightpurchase.vr.p163a.al;
import com.google.android.finsky.billing.lightpurchase.vr.p163a.ap;
import com.google.android.finsky.billing.lightpurchase.vr.p163a.aq;
import com.google.android.finsky.billing.profile.C2056m;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.dfemodel.C2731v;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.aa;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.FinskyLog;
import com.google.vr.b.a.a;
import com.google.vr.b.a.a.b;
import com.google.vr.b.a.c;
import com.google.vr.b.a.e;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.a.a.a.a.cf;
import com.google.wireless.android.finsky.a.a.ao;
import com.google.wireless.android.finsky.dfe.nano.er;
import com.google.wireless.android.finsky.dfe.nano.fd;
import com.google.wireless.android.finsky.dfe.nano.u;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public class VrPurchaseActivity extends a implements C1087t, ap, ad {
    public static final C2471a f9974n = C1473m.f7980a.aR();
    public boolean f9975f;
    public C2495w f9976o;
    public PurchaseParams f9977p;
    public C2731v f9978q;
    public ce f9979r;
    public ay f9980s;
    public C1986w f9981t;
    public boolean f9982u;

    public VrPurchaseActivity() {
        C1473m.f7980a.aE();
    }

    public static Intent m10429a(Account account, PurchaseParams purchaseParams, C2731v c2731v) {
        Intent intent = new Intent(C1473m.f7980a.f7981b, VrPurchaseActivity.class);
        intent.putExtra("VrPurchaseActivity.account", account);
        intent.putExtra("VrPurchaseActivity.purchaseParams", purchaseParams);
        if (c2731v != null) {
            intent.putExtra("VrPurchaseActivity.offerFilter", c2731v);
        }
        f9974n.m13178a(account).m13376a(intent);
        return intent;
    }

    protected void onCreate(Bundle bundle) {
        e.a(this);
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f9976o = f9974n.m13180a(bundle, intent);
        this.f9977p = (PurchaseParams) intent.getParcelableExtra("VrPurchaseActivity.purchaseParams");
        this.f9978q = (C2731v) intent.getSerializableExtra("VrPurchaseActivity.offerFilter");
        this.f9979r = C2482j.m13283a(700);
        this.f9979r.e = new cf();
        this.f9979r.e.a(this.f9977p.f9286b);
        this.f9979r.e.a(this.f9977p.f9288d);
        if (m10431o() && bundle == null) {
            aa.m13186a().m13190d();
            this.f9976o.m13367a(m10430c(600));
        }
    }

    protected void onStart() {
        super.onStart();
        this.f9980s = (ay) H_().mo283a("VrPurchaseActivity.stateMachine");
        if (this.f9980s == null) {
            this.f9980s = ay.m10203a((Account) getIntent().getParcelableExtra("VrPurchaseActivity.account"), this.f9977p, this.f9978q);
            H_().mo284a().mo328a(this.f9980s, "VrPurchaseActivity.stateMachine").mo334c();
        }
    }

    protected void onResume() {
        super.onResume();
        this.f9975f = true;
        if (this.f9982u) {
            this.f9980s.m6757a((C1087t) this);
        }
    }

    protected void onPause() {
        this.f9975f = false;
        this.f9980s.m6757a(null);
        super.onPause();
    }

    public void finish() {
        Bundle bundle;
        int i = 0;
        boolean z = this.f9980s.f6948l == 2;
        C1868x a = C1867w.m9984a(z, this.f9980s.aD);
        if (m10431o()) {
            aa.m13186a().m13190d();
            this.f9976o.m13367a(m10430c(601).m13239a(z).m13210a(a.f9566l));
        }
        Context applicationContext = getApplicationContext();
        PurchaseParams purchaseParams = this.f9977p;
        ay ayVar = this.f9980s;
        if (ayVar.aq != null) {
            bundle = ayVar.aq.am;
        } else {
            bundle = null;
        }
        Intent a2 = C1867w.m9979a(applicationContext, purchaseParams, bundle, a, this.f9976o, C1473m.f7980a.dj());
        if (z) {
            i = -1;
        }
        setResult(i, a2);
        super.finish();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case 1:
                setResult(i2, intent);
                super.finish();
                return;
            case 2:
                setResult(i2, intent);
                this.f9980s.ae();
                return;
            case 3:
                this.f9980s.ae();
                return;
            default:
                super.onActivityResult(i, i2, intent);
                return;
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void m10439b(ad adVar) {
        aa.m13186a().m13190d();
        this.f9976o.m13370a(new C2488p().m13345b(adVar));
    }

    public final void m10436a(ad adVar, int i) {
        aa.m13186a().m13190d();
        this.f9976o.m13379b(new C2475d(adVar).m13256a(i));
    }

    private final boolean m10431o() {
        return this.f9977p.f9298n != null;
    }

    private final C2474c m10430c(int i) {
        return new C2474c(i).m13247c(com.google.android.wallet.common.util.a.a(this)).m13236a(this.f9977p.f9286b).m13213a(this.f9977p.f9285a).m13241b(this.f9977p.f9288d).m13245b(true);
    }

    protected final b m10432a(b bVar) {
        this.f9982u = false;
        if (this.f9980s != null) {
            this.f9980s.m6757a(null);
        }
        C1986w c1986w = new C1986w(this, this);
        c1986w.f10101e = e.a(this, bVar, c1986w.f10098b);
        this.f9981t = c1986w;
        return this.f9981t.f10101e.a();
    }

    public final void mo2553f() {
        this.f9982u = true;
        if (this.f9975f) {
            this.f9980s.m6757a((C1087t) this);
        }
    }

    public final void mo2549a(String str) {
        ay ayVar = this.f9980s;
        ayVar.aA = null;
        ayVar.at.m10020a(ayVar.f9804c.name, str, ayVar.f9803b);
    }

    public final void mo2554g() {
        this.f9980s.m6758b(1, 14);
    }

    public final void mo2555h() {
        ay ayVar = this.f9980s;
        startActivityForResult(AuthenticatedWebViewActivity.m10032a(ayVar.f9804c, ayVar.as.mo968W().m10004b(ayVar.f9804c.name), (String) C0955b.da.m28964b(), ayVar.f9803b), 2);
    }

    public final void mo2556i() {
        this.f9980s.m6758b(1, 15);
    }

    public final void mo2550b(String str) {
        startActivityForResult(AuthenticatedWebViewActivity.m10032a((Account) getIntent().getParcelableExtra("VrPurchaseActivity.account"), str, null, this.f9976o), 3);
    }

    public final void mo2557j() {
        this.f9980s.ad();
    }

    public final void mo2558k() {
        this.f9980s.ac();
    }

    public final void mo2559l() {
        C1087t c1087t = this.f9980s;
        if (c1087t.au == null) {
            c1087t.au = C2056m.m10807a(c1087t.f9804c, c1087t.aq.ab(), null, null, 1, c1087t.f9805d.f9285a.f11835d);
            c1087t.f730B.mo284a().mo328a(c1087t.au, "PurchaseStateMachine.billingProfileSidecar").mo334c();
        }
        c1087t.au.m6757a(c1087t);
    }

    public final void mo2548a(ao aoVar) {
        this.f9980s.m10218a(aoVar.c);
    }

    public final void mo2547a(bl blVar) {
        ay ayVar = this.f9980s;
        ayVar.aj = blVar;
        ayVar.ag();
    }

    public final void mo2551b(boolean z) {
        ay ayVar = this.f9980s;
        ayVar.am = true;
        C3300k o = C1473m.f7980a.mo2256o();
        String str = ayVar.f9805d.f9285a.f11833b;
        if (z) {
            o.mo3444b(str);
        } else {
            o.mo3431a(str);
        }
        ayVar.ad();
    }

    public final void mo2552c(boolean z) {
        this.f9980s.m10217a(Boolean.valueOf(z));
    }

    public final void mo2560m() {
        Intent a;
        Parcelable parcelable;
        Account account = (Account) getIntent().getParcelableExtra("VrPurchaseActivity.account");
        PurchaseParams purchaseParams = this.f9980s.f9806e;
        C2495w c2495w = this.f9976o;
        if (purchaseParams.f9298n != null) {
            a = IabV3Activity.m10048a(account, purchaseParams);
            c2495w.m13366a(account).m13376a(a);
            parcelable = a;
        } else {
            parcelable = PurchaseActivity.m10038a(account, purchaseParams, null, null, c2495w);
        }
        a = new Intent(C1473m.f7980a.f7981b, SwitchPurchaseContextActivity.class);
        a.putExtra("purchaseIntent", parcelable);
        startActivityForResult(a, 1);
    }

    public final void mo2561n() {
        this.f9980s.ae();
    }

    public final void mo1423a(C1089s c1089s) {
        ay ayVar = (ay) c1089s;
        switch (ayVar.f6948l) {
            case 0:
                return;
            case 1:
                this.f9981t.f10103g = this.f9977p.f9285a.f11835d;
                C1986w c1986w;
                aq aqVar;
                ad adVar;
                Object c1975l;
                C1986w c1986w2;
                String str;
                String str2;
                int dimension;
                String W;
                ad adVar2;
                C1986w c1986w3;
                String str3;
                String str4;
                switch (ayVar.af) {
                    case 1:
                        c1986w = this.f9981t;
                        c cVar = c1986w.f10101e;
                        aqVar = c1986w.f10102f;
                        ad adVar3 = c1986w.f10099c;
                        if (aqVar instanceof C1975l) {
                            adVar = (C1975l) aqVar;
                        } else {
                            c1975l = new C1975l(cVar, aqVar, adVar3);
                        }
                        c1986w.f10102f = adVar;
                        adVar.m10460a(c1986w.f10099c, c1986w.f10100d);
                        adVar.m10459b();
                        c1986w.f10099c.m10439b(adVar);
                        return;
                    case 2:
                        com.google.vr.a.a.a.b a;
                        com.google.vr.a.a.a.b a2;
                        String str5;
                        c1986w2 = this.f9981t;
                        er erVar = ayVar.aq.f9944g;
                        str = ayVar.f9804c.name;
                        ad c1968e = new C1968e(c1986w2.f10101e, c1986w2.f10102f, c1986w2.f10099c, c1986w2.f10103g);
                        c1986w2.f10102f = c1968e;
                        c1968e.f10029c.a(erVar.b);
                        c1968e.f10030d.a(erVar.e);
                        c1968e.f10031e.a(erVar.l.d);
                        c1968e.f10034h.a(erVar.r.toUpperCase(C1473m.f7980a.f7981b.getResources().getConfiguration().locale));
                        c1968e.f10032f.a(erVar.p);
                        String[] strArr = erVar.m;
                        if (strArr != null && strArr.length > 0) {
                            com.google.vr.a.a.a.b a3 = c1968e.m10455a("vertical-layout", c1968e.f10038l, 3);
                            c1968e.m10455a("padding-y-36mm", a3, 1);
                            for (String a4 : strArr) {
                                c1968e.m10455a("body", a3, 4).a(a4);
                            }
                        }
                        fd fdVar = erVar.x;
                        ap apVar = c1986w2.f10100d;
                        if (fdVar != null) {
                            if (((fdVar.a & 1) != 0 ? 1 : null) != null) {
                                com.google.vr.a.a.a.b a5 = c1968e.m10455a("vertical-layout", c1968e.f10040n, 3);
                                c1968e.m10455a("padding-y-36mm", a5, 1);
                                a = c1968e.m10455a("container", a5, 3);
                                c1968e.m10455a("padding-x-screenwidth", a, 3);
                                a2 = c1968e.m10455a("checkbox-untoggled", a, 4);
                                com.google.vr.a.a.a a6 = c1968e.m10455a("checkbox-toggled", a2, 5);
                                com.google.vr.a.a.a a7 = c1968e.m10455a("checkbox-label", a, 4);
                                c1968e.m10455a("padding-y-36mm", a5, 1);
                                a7.a(fdVar.b);
                                c1968e.f10041o = fdVar.c;
                                if (!c1968e.f10041o) {
                                    a6.b("lull::HideEvent");
                                }
                                c1968e.m10457a(a2, "lull::ClickEvent", new C1969f(c1968e, a6, apVar));
                            }
                        }
                        str2 = erVar.y;
                        String[] strArr2 = erVar.o;
                        int i = c1986w2.f10103g;
                        apVar = c1986w2.f10100d;
                        a = c1968e.m10455a("vertical-layout", c1968e.f10039m, 3);
                        c1968e.m10455a("padding-y-36mm", a, 3);
                        c1968e.m10455a("line", a, 4);
                        c1968e.m10455a("padding-y-18mm", a, 3);
                        a2 = c1968e.m10455a("cart-drawer-button", a, 4);
                        if (i == 4) {
                            str5 = "cart-drawer-button-label-movies";
                        } else {
                            if (i != 3) {
                                FinskyLog.m21669e("Unsupported backend: " + i, new Object[0]);
                            }
                            str5 = "cart-drawer-button-label-apps";
                        }
                        com.google.vr.a.a.a a8 = c1968e.m10455a(str5, a2, 5);
                        c1968e.m10455a("padding-y-18mm", a, 3);
                        c1968e.m10455a("line", a, 4);
                        c1968e.m10455a("padding-y-36mm", a, 3);
                        c1968e.m10455a("account", a, 4).a(str);
                        a8.a(str2);
                        c1968e.m10457a(a2, "lull::ClickEvent", new C1970g(c1968e, apVar));
                        if (strArr2 != null && strArr2.length > 0) {
                            StringBuilder stringBuilder = new StringBuilder();
                            for (String W2 : strArr2) {
                                stringBuilder.append(Html.fromHtml(W2).toString());
                                stringBuilder.append("\n");
                            }
                            str5 = stringBuilder.toString();
                            c1968e.m10455a("padding-y-36mm", a, 3);
                            c1968e.m10455a("body", a, 4).a(str5);
                        }
                        c1968e.f10039m.b("lull::DisableEvent");
                        c1968e.m10457a(c1968e.f10035i, "lull::ClickEvent", new C1971h(c1968e));
                        c1986w2.m10496a((aq) c1968e, c1968e.f10033g, 711);
                        c1968e.m10460a(c1986w2.f10099c, c1986w2.f10100d);
                        c1968e.m10458a("lull::HtmlLinkClickedEvent", new ac(c1986w2));
                        c1968e.m10459b();
                        c1986w2.f10099c.m10439b(c1968e);
                        return;
                    case 3:
                        c1986w = this.f9981t;
                        str = ayVar.ay;
                        str2 = ayVar.f9804c.name;
                        int X = ayVar.m10213X();
                        String toUpperCase = getString(C7582R.string.content_description_reset_pin).toUpperCase(getResources().getConfiguration().locale);
                        String str6 = ayVar.aA;
                        c cVar2 = c1986w.f10101e;
                        aqVar = c1986w.f10102f;
                        adVar2 = c1986w.f10099c;
                        if (aqVar instanceof C1980q) {
                            adVar = (C1980q) aqVar;
                        } else {
                            c1975l = new C1980q(cVar2, aqVar, adVar2);
                        }
                        Object obj = adVar != c1986w.f10102f ? 1 : null;
                        c1986w.f10102f = adVar;
                        adVar.m10488b("");
                        adVar.m10487a(str6);
                        adVar.f10087n = false;
                        if (obj != null) {
                            adVar.f10084k = X;
                            adVar.f10076c.a(str);
                            adVar.f10077d.a(str2);
                            adVar.f10086m = c1986w.f10100d;
                            adVar.f10078e.a(toUpperCase);
                            adVar.m10460a(c1986w.f10099c, c1986w.f10100d);
                            adVar.m10459b();
                        }
                        c1986w.f10099c.m10439b(adVar);
                        return;
                    case 4:
                        this.f9981t.m10498a(ayVar.ay, ayVar.az, ayVar.mo968W(), ayVar.af(), ayVar.m10214Y(), ayVar.m10215Z());
                        return;
                    case 5:
                        this.f9981t.m10498a(null, ayVar.az, ayVar.mo968W(), ayVar.af(), ayVar.m10214Y(), ayVar.m10215Z());
                        return;
                    case 6:
                        c1986w3 = this.f9981t;
                        str3 = ayVar.ay;
                        List aa = ayVar.aa();
                        ad c1976m = new C1976m(c1986w3.f10101e, c1986w3.f10102f, c1986w3.f10099c);
                        c1986w3.f10102f = c1976m;
                        c1976m.f10059c.a(str3);
                        c1976m.m10480a(aa, c1986w3.f10100d);
                        c1976m.m10460a(c1986w3.f10099c, c1986w3.f10100d);
                        c1976m.m10459b();
                        c1986w3.f10099c.m10439b(c1976m);
                        return;
                    case 7:
                        dimension = (int) getResources().getDimension(C7582R.dimen.light_purchase_app_permission_icon_size);
                        C1986w c1986w4 = this.f9981t;
                        str3 = ayVar.ay;
                        str4 = ayVar.az;
                        str = ayVar.m10220c(dimension, dimension);
                        List ab = ayVar.ab();
                        W2 = ayVar.mo968W();
                        adVar = new C1978o(c1986w4.f10101e, c1986w4.f10102f, c1986w4.f10099c, c1986w4.f10103g);
                        c1986w4.f10102f = adVar;
                        adVar.f10064c.a(str3);
                        adVar.f10065d.a(str4);
                        adVar.f10067f.a(W2);
                        adVar.m10453a("permissions-app-icon", adVar.f10069h, str, dimension, dimension);
                        adVar.m10483a(ab, c1986w4.f10099c.getApplicationContext());
                        adVar.m10457a(adVar.f10066e, "lull::ClickEvent", new ak(c1986w4, adVar));
                        adVar.m10460a(c1986w4.f10099c, c1986w4.f10100d);
                        adVar.m10459b();
                        c1986w4.f10099c.m10439b(adVar);
                        return;
                    case 8:
                        this.f9980s.ac();
                        return;
                    case 9:
                        u uVar = ayVar.au.al;
                        c1986w2 = this.f9981t;
                        str4 = ayVar.aq.f9944g.b;
                        str = ayVar.f9804c.name;
                        ao aoVar = ayVar.aq.f9944g.l;
                        ao[] aoVarArr = uVar.b;
                        ad c1966c = new C1966c(c1986w2.f10101e, c1986w2.f10102f, c1986w2.f10099c);
                        c1986w2.f10102f = c1966c;
                        c1966c.f10021c.a(str4);
                        c1966c.f10022d.a(str);
                        c1966c.m10469a(aoVar, aoVarArr, c1986w2.f10100d);
                        c1966c.m10460a(c1986w2.f10099c, c1986w2.f10100d);
                        c1966c.m10459b();
                        c1986w2.f10099c.m10439b(c1966c);
                        return;
                    case 10:
                        c1986w3 = this.f9981t;
                        str3 = ayVar.ay;
                        str4 = ayVar.az;
                        str = ayVar.aB;
                        str2 = ayVar.mo968W();
                        adVar2 = new C1972i(c1986w3.f10101e, c1986w3.f10102f, c1986w3.f10099c, c1986w3.f10103g);
                        c1986w3.f10102f = adVar2;
                        adVar2.f10049c.a(str3);
                        adVar2.f10050d.a(str4);
                        adVar2.f10052f.a(str2);
                        if (str != null) {
                            adVar2.f10056j.b("lull::EnableEvent");
                            adVar2.m10455a("padding-x-screenwidth", adVar2.f10055i, 3);
                            com.google.vr.a.a.a a9 = adVar2.m10455a("checkbox-label", adVar2.f10055i, 2);
                            com.google.vr.a.a.a.b a10 = adVar2.m10455a("checkbox-untoggled", adVar2.f10055i, 2);
                            com.google.vr.a.a.a.b a11 = adVar2.m10455a("checkbox-toggled", a10, 1);
                            a9.a(str);
                            adVar2.m10457a(a10, "lull::ClickEvent", new C1973j(adVar2, a11));
                        }
                        adVar2.m10457a(adVar2.f10051e, "lull::ClickEvent", new al(c1986w3, adVar2));
                        adVar2.m10460a(c1986w3.f10099c, c1986w3.f10100d);
                        adVar2.m10459b();
                        c1986w3.f10099c.m10439b(adVar2);
                        return;
                    case 11:
                        this.f9981t.m10499b(ayVar.ay, ayVar.az, ayVar.mo968W());
                        return;
                    case 12:
                        this.f9981t.m10498a(null, ayVar.az, ayVar.mo968W(), ayVar.af(), 1350, 1351);
                        return;
                    case 13:
                        this.f9981t.m10497a(getString(C7582R.string.pin_required_title), getString(C7582R.string.vr_setup_pin), getString(C7582R.string.content_description_exit_vr).toUpperCase(getResources().getConfiguration().locale));
                        return;
                    case 14:
                        this.f9981t.m10497a(getString(C7582R.string.content_description_reset_pin), getString(C7582R.string.vr_reset_pin), getString(C7582R.string.content_description_exit_vr).toUpperCase(getResources().getConfiguration().locale));
                        return;
                    case 15:
                        return;
                    default:
                        throw new IllegalStateException("Unknown substate: " + ayVar.af);
                }
            case 2:
                finish();
                return;
            case 3:
                finish();
                return;
            default:
                throw new IllegalStateException("Unknown state: " + c1089s.f6948l);
        }
    }

    public ce getPlayStoreUiElement() {
        return this.f9979r;
    }

    public ad getParentNode() {
        return null;
    }

    public final void mo1219a(ad adVar) {
        FinskyLog.m21669e("Not using tree impressions.", new Object[0]);
    }
}
