package com.google.android.finsky.billing.lightpurchase.vr;

import android.accounts.Account;
import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.cr;
import android.support.v4.app.u;
import android.text.Html;
import android.view.KeyEvent;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.billing.iab.w;
import com.google.android.finsky.billing.iab.x;
import com.google.android.finsky.billing.legacyauth.AuthState;
import com.google.android.finsky.billing.legacyauth.f;
import com.google.android.finsky.billing.lightpurchase.AuthenticatedWebViewActivity;
import com.google.android.finsky.billing.lightpurchase.IabV3Activity;
import com.google.android.finsky.billing.lightpurchase.PurchaseActivity;
import com.google.android.finsky.billing.lightpurchase.a;
import com.google.android.finsky.billing.lightpurchase.ay;
import com.google.android.finsky.billing.lightpurchase.i;
import com.google.android.finsky.billing.lightpurchase.vr.a.a;
import com.google.android.finsky.billing.lightpurchase.vr.a.ac;
import com.google.android.finsky.billing.lightpurchase.vr.a.ak;
import com.google.android.finsky.billing.lightpurchase.vr.a.al;
import com.google.android.finsky.billing.lightpurchase.vr.a.aq;
import com.google.android.finsky.billing.lightpurchase.vr.a.c;
import com.google.android.finsky.billing.lightpurchase.vr.a.e;
import com.google.android.finsky.billing.lightpurchase.vr.a.f;
import com.google.android.finsky.billing.lightpurchase.vr.a.g;
import com.google.android.finsky.billing.lightpurchase.vr.a.h;
import com.google.android.finsky.billing.lightpurchase.vr.a.i;
import com.google.android.finsky.billing.lightpurchase.vr.a.j;
import com.google.android.finsky.billing.lightpurchase.vr.a.l;
import com.google.android.finsky.billing.lightpurchase.vr.a.m;
import com.google.android.finsky.billing.lightpurchase.vr.a.o;
import com.google.android.finsky.billing.lightpurchase.vr.a.q;
import com.google.android.finsky.billing.lightpurchase.vr.a.w;
import com.google.android.finsky.billing.profile.m;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.bl;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.aa;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.v;
import com.google.android.finsky.installer.k;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.utils.b.a;
import com.google.android.wallet.common.util.a;
import com.google.vr.a.a.a;
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

protected class VrPurchaseActivity extends com.google.vr.b.a.a implements com.google.android.finsky.billing.common.t, com.google.android.finsky.billing.lightpurchase.vr.a.ap, com.google.android.finsky.d.ad
{

    public static final com.google.android.finsky.d.a n;
    public boolean f;
    public com.google.android.finsky.d.w o;
    public PurchaseParams p;
    public com.google.android.finsky.dfemodel.v q;
    public com.google.wireless.android.a.a.a.a.ce r;
    public com.google.android.finsky.billing.lightpurchase.ay s;
    public com.google.android.finsky.billing.lightpurchase.vr.a.w t;
    public boolean u;

    static {
        VrPurchaseActivity.n = com.google.android.finsky.m.a.aR();
    }

    VrPurchaseActivity() {
        com.google.vr.b.a.a();
        com.google.android.finsky.m.a.aE();
    }

    public static Intent a(Account p0, PurchaseParams p1, com.google.android.finsky.dfemodel.v p2) {
        v0 = new Intent(com.google.android.finsky.m.a.b, VrPurchaseActivity);
        v0.putExtra("VrPurchaseActivity.account", p0);
        v0.putExtra("VrPurchaseActivity.purchaseParams", p1);
        if (p2 != 0)
            v0.putExtra("VrPurchaseActivity.offerFilter", p2);
        VrPurchaseActivity.n.a(p0).a(v0);
        return v0;
    }

    private final com.google.android.finsky.d.c c(int p0) {
        return new com.google.android.finsky.d.c(p0).c(com.google.android.wallet.common.util.a.a(this)).a(this.p.b).a(this.p.a).b(this.p.d).b(1);
    }

    private final boolean o() {
        if (this.p.n != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    protected final com.google.vr.b.a.a.b a(com.google.vr.b.a.a.b p0) {
        this.u = 0;
        if (this.s != 0)
            this.s.a(0);
        v0 = new com.google.android.finsky.billing.lightpurchase.vr.a.w(this, this);
        v0.e = com.google.vr.b.a.e.a(this, p0, v0.b);
        this.t = v0;
        return this.t.e.a();
    }

    public final void a(com.google.android.finsky.billing.common.s p0) {
  1:    v6 = (com.google.android.finsky.billing.lightpurchase.ay)p0;
  5:    switch (v6.l) {
            case 0:
  5:            goto 112;
            case 1:
  5:            goto 37;
            case 2:
  5:            goto 1220;
            case 3:
  5:            goto 1225;
            default:
        }
 36:    throw new IllegalStateException(26 + "Unknown state: " + p0.l);
 45:    this.t.g = this.p.a.d;
 49:    switch (v6.af) {
            case 1:
 49:            goto 81;
            case 2:
 49:            goto 120;
            case 3:
 49:            goto 576;
            case 4:
 49:            goto 716;
            case 5:
 49:            goto 690;
            case 6:
 49:            goto 743;
            case 7:
 49:            goto 791;
            case 8:
 49:            goto 897;
            case 9:
 49:            goto 904;
            case 10:
 49:            goto 973;
            case 11:
 49:            goto 1099;
            case 12:
 49:            goto 1114;
            case 13:
 49:            goto 1136;
            case 14:
 49:            goto 1178;
            case 15:
 49:            goto 112;
            default:
        }
 80:    throw new IllegalStateException(29 + "Unknown substate: " + v6.af);
 91:    if (this.t.f instanceof com.google.android.finsky.billing.lightpurchase.vr.a.l)
 93:        v0 = (com.google.android.finsky.billing.lightpurchase.vr.a.l)this.t.f;
        else
118:        v0 = new com.google.android.finsky.billing.lightpurchase.vr.a.l(this.t.e, this.t.f, this.t.c);
 95:    this.t.f = v0;
101:    v0.a(this.t.c, this.t.d);
104:    v0.b();
109:    this.t.c.b(v0);
112:    return;
124:    v2 = v6.aq.g;
128:    v3 = v6.c.name;
140:    v7 = new com.google.android.finsky.billing.lightpurchase.vr.a.e(this.t.e, this.t.f, this.t.c, this.t.g);
143:    this.t.f = v7;
149:    v7.c.a(v2.b);
156:    v7.d.a(v2.e);
165:    v7.e.a(v2.l.d);
190:    v7.h.a(v2.r.toUpperCase(com.google.android.finsky.m.a.b.getResources().getConfiguration().locale));
197:    v7.f.a(v2.p);
202:    if (v2.m != 0 && v2.m.length > 0) {
212:        v5 = v7.a("vertical-layout", v7.l, 3);
219:        v7.a("padding-y-36mm", v5, 1);
223:        v0 = 0;
224:        while (v0 < v2.m.length) {
235:            v7.a("body", v5, 4).a(v2.m[v0]);
238:            v0 = v0 + 1;
            }
        }
245:    if (v2.x != 0) {
251:        if (v2.x.a & 1)
253:            v0 = 1;
            else
467:            v0 = 0;
254:        if (v0 != 0) {
261:            v0 = v7.a("vertical-layout", v7.n, 3);
268:            v7.a("padding-y-36mm", v0, 1);
274:            v6 = v7.a("container", v0, 3);
281:            v7.a("padding-x-screenwidth", v6, 3);
287:            v8 = v7.a("checkbox-untoggled", v6, 4);
294:            v9 = v7.a("checkbox-toggled", v8, 5);
308:            v7.a("padding-y-36mm", v0, 1);
313:            v7.a("checkbox-label", v6, 4).a(v2.x.b);
318:            v7.o = v2.x.c;
322:            if (v7.o == 0)
326:                v9.b("lull::HideEvent");
336:            v7.a(v8, "lull::ClickEvent", new com.google.android.finsky.billing.lightpurchase.vr.a.f(v7, v9, this.t.d));
            }
        }
352:    v6 = v7.a("vertical-layout", v7.m, 3);
359:    v7.a("padding-y-36mm", v6, 3);
365:    v7.a("line", v6, 4);
371:    v7.a("padding-y-18mm", v6, 3);
377:    v8 = v7.a("cart-drawer-button", v6, 4);
382:    if (this.t.g == 4)
384:        v0 = "cart-drawer-button-label-movies";
        else {
471:        if (this.t.g != 3)
497:            FinskyLog.e(32 + "Unsupported backend: " + this.t.g, new Object[0]);
500:        v0 = "cart-drawer-button-label-apps";
        }
394:    v7.a("padding-y-18mm", v6, 3);
400:    v7.a("line", v6, 4);
406:    v7.a("padding-y-36mm", v6, 3);
416:    v7.a("account", v6, 4).a(v3);
419:    v7.a(v0, v8, 5).a(v2.y);
429:    v7.a(v8, "lull::ClickEvent", new com.google.android.finsky.billing.lightpurchase.vr.a.g(v7, this.t.d));
432:    if (v2.o == 0) {
527:        v7.m.b("lull::DisableEvent");
539:        v7.a(v7.i, "lull::ClickEvent", new com.google.android.finsky.billing.lightpurchase.vr.a.h(v7));
546:        this.t.a(v7, v7.g, 711);
553:        v7.a(this.t.c, this.t.d);
563:        v7.a("lull::HtmlLinkClickedEvent", new com.google.android.finsky.billing.lightpurchase.vr.a.ac(this.t));
566:        v7.b();
571:        this.t.c.b(v7);
574:        return;
        }
435:    if (v2.o.length <= 0) {
527:        v7.m.b("lull::DisableEvent");
539:        v7.a(v7.i, "lull::ClickEvent", new com.google.android.finsky.billing.lightpurchase.vr.a.h(v7));
546:        this.t.a(v7, v7.g, 711);
553:        v7.a(this.t.c, this.t.d);
563:        v7.a("lull::HtmlLinkClickedEvent", new com.google.android.finsky.billing.lightpurchase.vr.a.ac(this.t));
566:        v7.b();
571:        this.t.c.b(v7);
574:        return;
        }
439:    v3 = new StringBuilder();
443:    v0 = 0;
444:    while (v0 < v2.o.length) {
456:        v3.append(Html.fromHtml(v2.o[v0]).toString());
461:        v3.append("\n");
464:        v0 = v0 + 1;
        }
466:    goto 503;
510:    v7.a("padding-y-36mm", v6, 3);
520:    v7.a("body", v6, 4).a(v3.toString());
527:    v7.m.b("lull::DisableEvent");
539:    v7.a(v7.i, "lull::ClickEvent", new com.google.android.finsky.billing.lightpurchase.vr.a.h(v7));
546:    this.t.a(v7, v7.g, 711);
553:    v7.a(this.t.c, this.t.d);
563:    v7.a("lull::HtmlLinkClickedEvent", new com.google.android.finsky.billing.lightpurchase.vr.a.ac(this.t));
566:    v7.b();
571:    this.t.c.b(v7);
574:    return;
619:    if (this.t.f instanceof com.google.android.finsky.billing.lightpurchase.vr.a.q)
621:        v0 = (com.google.android.finsky.billing.lightpurchase.vr.a.q)this.t.f;
        else
686:        v0 = new com.google.android.finsky.billing.lightpurchase.vr.a.q(this.t.e, this.t.f, this.t.c);
625:    if (v0 != this.t.f)
627:        v1 = 1;
        else
688:        v1 = 0;
628:    this.t.f = v0;
632:    v0.b("");
635:    v0.a(v6.aA);
639:    v0.n = 0;
641:    if (v1 != 0) {
643:        v0.k = v6.X();
647:        v0.c.a(v6.ay);
652:        v0.d.a(v6.c.name);
657:        v0.m = this.t.d;
661:        v0.e.a(this.getString(2131951899).toUpperCase(this.getResources().getConfiguration().locale));
668:        v0.a(this.t.c, this.t.d);
671:        v0.b();
        }
676:    this.t.c.b(v0);
679:    goto 112;
711:    this.t.a(0, v6.az, v6.W(), v6.af(), v6.Y(), v6.Z());
714:    goto 112;
738:    this.t.a(v6.ay, v6.az, v6.W(), v6.af(), v6.Y(), v6.Z());
741:    goto 112;
745:    v1 = v6.ay;
747:    v2 = v6.aa();
759:    v6 = new com.google.android.finsky.billing.lightpurchase.vr.a.m(this.t.e, this.t.f, this.t.c);
762:    this.t.f = v6;
766:    v6.c.a(v1);
771:    v6.a(v2, this.t.d);
778:    v6.a(this.t.c, this.t.d);
781:    v6.b();
786:    this.t.c.b(v6);
789:    goto 112;
802:    v4 = (int)this.getResources().getDimension(2131624751);
831:    v0 = new com.google.android.finsky.billing.lightpurchase.vr.a.o(this.t.e, this.t.f, this.t.c, this.t.g);
834:    this.t.f = v0;
838:    v0.c.a(v6.ay);
843:    v0.d.a(v6.az);
848:    v0.f.a(v6.W());
856:    v0.a("permissions-app-icon", v0.h, v6.c(v4, v4), v4, v4);
865:    v0.a(v6.ab(), this.t.c.getApplicationContext());
877:    v0.a(v0.e, "lull::ClickEvent", new com.google.android.finsky.billing.lightpurchase.vr.a.ak(this.t, v0));
884:    v0.a(this.t.c, this.t.d);
887:    v0.b();
892:    this.t.c.b(v0);
895:    goto 112;
899:    this.s.ac();
902:    goto 112;
936:    v8 = new com.google.android.finsky.billing.lightpurchase.vr.a.c(this.t.e, this.t.f, this.t.c);
939:    this.t.f = v8;
943:    v8.c.a(v6.aq.g.b);
948:    v8.d.a(v6.c.name);
953:    v8.a(v6.aq.g.l, v6.au.al.b, this.t.d);
960:    v8.a(this.t.c, this.t.d);
963:    v8.b();
968:    this.t.c.b(v8);
971:    goto 112;
995:    v9 = new com.google.android.finsky.billing.lightpurchase.vr.a.i(this.t.e, this.t.f, this.t.c, this.t.g);
998:    this.t.f = v9;
1002:    v9.c.a(v6.ay);
1007:    v9.d.a(v6.az);
1012:    v9.f.a(v6.W());
1015:    if (v6.aB != 0) {
1021:        v9.j.b("lull::EnableEvent");
1029:        v9.a("padding-x-screenwidth", v9.i, 3);
1046:        v2 = v9.a("checkbox-untoggled", v9.i, 2);
1057:        v9.a("checkbox-label", v9.i, 2).a(v6.aB);
1067:        v9.a(v2, "lull::ClickEvent", new com.google.android.finsky.billing.lightpurchase.vr.a.j(v9, v9.a("checkbox-toggled", v2, 1)));
        }
1079:    v9.a(v9.e, "lull::ClickEvent", new com.google.android.finsky.billing.lightpurchase.vr.a.al(this.t, v9));
1086:    v9.a(this.t.c, this.t.d);
1089:    v9.b();
1094:    this.t.c.b(v9);
1097:    goto 112;
1109:    this.t.b(v6.ay, v6.az, v6.W());
1112:    goto 112;
1131:    this.t.a(0, v6.az, v6.W(), v6.af(), 1350, 1351);
1134:    goto 112;
1173:    this.t.a(this.getString(2131952854), this.getString(2131953394), this.getString(2131951879).toUpperCase(this.getResources().getConfiguration().locale));
1176:    goto 112;
1215:    this.t.a(this.getString(2131951899), this.getString(2131953393), this.getString(2131951879).toUpperCase(this.getResources().getConfiguration().locale));
1218:    goto 112;
1220:    this.finish();
1223:    return;
1225:    this.finish();
    }

    public final void a(com.google.android.finsky.cv.a.bl p0) {
        this.s.aj = p0;
        this.s.ag();
    }

    public final void a(com.google.android.finsky.d.ad p0) {
        FinskyLog.e("Not using tree impressions.", new Object[0]);
    }

    public final void a(com.google.android.finsky.d.ad p0, int p1) {
        com.google.android.finsky.d.aa.a().d();
        this.o.b(new com.google.android.finsky.d.d(p0).a(p1));
    }

    public final void a(com.google.wireless.android.finsky.a.a.ao p0) {
        this.s.a(p0.c);
    }

    public final void a(String p0) {
        this.s.aA = 0;
        this.s.at.a(this.s.c.name, p0, this.s.b);
    }

    public final void b(com.google.android.finsky.d.ad p0) {
        com.google.android.finsky.d.aa.a().d();
        this.o.a(new com.google.android.finsky.d.p().b(p0));
    }

    public final void b(String p0) {
        this.startActivityForResult(AuthenticatedWebViewActivity.a((Account)this.getIntent().getParcelableExtra("VrPurchaseActivity.account"), p0, 0, this.o), 3);
    }

    public final void b(boolean p0) {
        this.s.am = 1;
        v1 = com.google.android.finsky.m.a.o();
        if (p0 != 0)
            v1.b(this.s.d.a.b);
        else
            v1.a(this.s.d.a.b);
        this.s.ad();
    }

    public final void c(boolean p0) {
        this.s.a(Boolean.valueOf(p0));
    }

    public boolean dispatchKeyEvent(KeyEvent p0) {
        if (p0.getKeyCode() == 24 || p0.getKeyCode() == 25)
            v0 = 1;
        else
            v0 = super.dispatchKeyEvent(p0);
        return v0;
    }

    public final void f() {
        this.u = 1;
        if (this.f != 0)
            this.s.a(this);
    }

    public void finish() {
        v7 = 0;
        if (this.s.l == 2)
            v6 = 1;
        else
            v6 = 0;
        v3 = com.google.android.finsky.billing.iab.w.a(v6, this.s.aD);
        if (this.o()) {
            com.google.android.finsky.d.aa.a().d();
            this.o.a(this.c(601).a(v6).a(v3.l));
        }
        if (this.s.aq != 0)
            v2 = this.s.aq.am;
        else
            v2 = 0;
        if (v6 != 0)
            v7 = -1;
        this.setResult(v7, com.google.android.finsky.billing.iab.w.a(this.getApplicationContext(), this.p, v2, v3, this.o, com.google.android.finsky.m.a.dj()));
        super.finish();
    }

    public final void g() {
        this.s.b(1, 14);
    }

    public com.google.android.finsky.d.ad getParentNode() {
        return 0;
    }

    public com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.r;
    }

    public final void h() {
        this.startActivityForResult(AuthenticatedWebViewActivity.a(this.s.c, this.s.as.W().b(this.s.c.name), (String)com.google.android.finsky.aa.b.da.b(), this.s.b), 2);
    }

    public final void i() {
        this.s.b(1, 15);
    }

    public final void j() {
        this.s.ad();
    }

    public final void k() {
        this.s.ac();
    }

    public final void l() {
        if (this.s.au == 0) {
            this.s.au = com.google.android.finsky.billing.profile.m.a(this.s.c, this.s.aq.ab(), 0, 0, 1, this.s.d.a.d);
            this.s.B.a().a(this.s.au, "PurchaseStateMachine.billingProfileSidecar").c();
        }
        this.s.au.a(this.s);
    }

    public final void m() {
        v0 = (Account)this.getIntent().getParcelableExtra("VrPurchaseActivity.account");
        if (this.s.e.n != 0) {
            v1 = IabV3Activity.a(v0, this.s.e);
            this.o.a(v0).a(v1);
            v0 = v1;
        }
        else
            v0 = PurchaseActivity.a(v0, this.s.e, 0, 0, this.o);
        v1 = new Intent(com.google.android.finsky.m.a.b, SwitchPurchaseContextActivity);
        v1.putExtra("purchaseIntent", v0);
        this.startActivityForResult(v1, 1);
    }

    public final void n() {
        this.s.ae();
    }

    protected void onActivityResult(int p0, int p1, Intent p2) {
        switch (p0) {
            case 1:
                this.setResult(p1, p2);
                super.finish();
                break;
            case 2:
                this.setResult(p1, p2);
                this.s.ae();
                break;
            case 3:
                this.s.ae();
                break;
            default:
                super.onActivityResult(p0, p1, p2);
                break;
        }
    }

    protected void onCreate(Bundle p0) {
        com.google.vr.b.a.e.a(this);
        super.onCreate(p0);
        v1 = this.getIntent();
        this.o = VrPurchaseActivity.n.a(p0, v1);
        this.p = (PurchaseParams)v1.getParcelableExtra("VrPurchaseActivity.purchaseParams");
        this.q = (com.google.android.finsky.dfemodel.v)v1.getSerializableExtra("VrPurchaseActivity.offerFilter");
        this.r = com.google.android.finsky.d.j.a(700);
        this.r.e = new com.google.wireless.android.a.a.a.a.cf();
        this.r.e.a(this.p.b);
        this.r.e.a(this.p.d);
        if (this.o() && p0 == 0) {
            com.google.android.finsky.d.aa.a().d();
            this.o.a(this.c(600));
        }
    }

    protected void onPause() {
        this.f = 0;
        this.s.a(0);
        super.onPause();
    }

    protected void onResume() {
        super.onResume();
        this.f = 1;
        if (this.u != 0)
            this.s.a(this);
    }

    protected void onStart() {
        super.onStart();
        this.s = (com.google.android.finsky.billing.lightpurchase.ay)this.H_().a("VrPurchaseActivity.stateMachine");
        if (this.s == 0) {
            this.s = com.google.android.finsky.billing.lightpurchase.ay.a((Account)this.getIntent().getParcelableExtra("VrPurchaseActivity.account"), this.p, this.q);
            this.H_().a().a(this.s, "VrPurchaseActivity.stateMachine").c();
        }
    }

}
