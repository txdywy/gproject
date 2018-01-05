package com.google.android.finsky.navigationmanager.p228a;

import android.accounts.Account;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.C0234a;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.ca;
import android.support.v4.app.cs;
import android.support.v4.view.ai;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.activities.C1036b;
import com.google.android.finsky.activities.C1073h;
import com.google.android.finsky.activities.FlagItemDialog;
import com.google.android.finsky.activities.bp;
import com.google.android.finsky.activities.ge;
import com.google.android.finsky.activities.gn;
import com.google.android.finsky.activities.myapps.C1120t;
import com.google.android.finsky.activities.p114a.C1046a;
import com.google.android.finsky.ap.C1249a;
import com.google.android.finsky.api.C1286g;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.at.C1507b;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bb.C1561c;
import com.google.android.finsky.be.C1593a;
import com.google.android.finsky.be.C1597e;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.gifting.C1841f;
import com.google.android.finsky.billing.iab.C1867w;
import com.google.android.finsky.billing.myaccount.C2007h;
import com.google.android.finsky.billing.myaccount.C2010k;
import com.google.android.finsky.billing.myaccount.C2028q;
import com.google.android.finsky.billing.myaccount.ba;
import com.google.android.finsky.bj.C2104b;
import com.google.android.finsky.br.C2162a;
import com.google.android.finsky.br.C2171b;
import com.google.android.finsky.ci.C2282a;
import com.google.android.finsky.cv.p177a.ah;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.cv.p177a.eu;
import com.google.android.finsky.cv.p177a.hl;
import com.google.android.finsky.cv.p177a.hm;
import com.google.android.finsky.cv.p177a.ig;
import com.google.android.finsky.cv.p177a.ik;
import com.google.android.finsky.cv.p177a.il;
import com.google.android.finsky.cv.p177a.io;
import com.google.android.finsky.cv.p177a.ip;
import com.google.android.finsky.detailspage.aq;
import com.google.android.finsky.detailspage.aw;
import com.google.android.finsky.dfemodel.C2731v;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.entertainment.C2982b;
import com.google.android.finsky.family.library.C3057h;
import com.google.android.finsky.family.management.C3066d;
import com.google.android.finsky.family.p201c.C3039a;
import com.google.android.finsky.family.p201c.C3048i;
import com.google.android.finsky.family.remoteescalation.C3091h;
import com.google.android.finsky.family.setup.C3101b;
import com.google.android.finsky.family.setup.FamilySetupActivity;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.navigationmanager.C3758b;
import com.google.android.finsky.navigationmanager.C3760e;
import com.google.android.finsky.navigationmanager.NavigationState;
import com.google.android.finsky.notificationsettings.NotificationsSettingsActivity;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p148b.C1542f;
import com.google.android.finsky.pagesystem.C1035i;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.playpass.C3923a;
import com.google.android.finsky.promotioncampaigndescriptionpage.C3944c;
import com.google.android.finsky.promotioncampaigndescriptionpage.PromotionCampaignDescriptionData;
import com.google.android.finsky.promotioncampaigndescriptionpage.PromotionCampaignDescriptionData.PromotionCampaignDescriptionRow;
import com.google.android.finsky.uninstall.UninstallManagerActivityV2;
import com.google.android.finsky.uninstall.at;
import com.google.android.finsky.utils.C4688t;
import com.google.android.finsky.utils.C4694z;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.be;
import com.google.android.libraries.bind.p117b.C5872c;
import com.google.android.wallet.ui.common.a;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.dfe.h.a.al;
import com.google.wireless.android.finsky.dfe.nano.gj;
import com.google.wireless.android.finsky.dfe.nano.go;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

public class C3749d implements C3748a, C1035i {
    public static final boolean f18913a = (VERSION.SDK_INT >= 16);
    public C1036b f18914b;
    public ab f18915c;
    public final C0988c f18916d;
    public final C1542f f18917e;
    public final C2471a f18918f;
    public final C1249a f18919g;
    public final C1287h f18920h;
    public final C2162a f18921i;
    public final C1461c f18922j;
    public final C1463g f18923k;
    public final C2104b f18924l;
    public final C1867w f18925m;
    public final C2171b f18926n;
    public final com.google.android.finsky.dfemodel.ab f18927o;
    public final Stack f18928p = new C4694z();
    public final ArrayList f18929q = new ArrayList();
    public boolean f18930r = false;

    public final boolean mo3680a() {
        int g = mo3705g();
        if (g == 1 || g == 2) {
            return true;
        }
        return false;
    }

    public final boolean mo3681a(int i) {
        return (mo3724E() instanceof gn) && i == 2 && mo3705g() == 2;
    }

    C3749d(C1036b c1036b, C0988c c0988c, C1542f c1542f, C2471a c2471a, C1249a c1249a, C1287h c1287h, C2171b c2171b, C2162a c2162a, C1461c c1461c, C1463g c1463g, C2104b c2104b, C1867w c1867w, com.google.android.finsky.dfemodel.ab abVar) {
        this.f18914b = c1036b;
        this.f18915c = c1036b.H_();
        this.f18916d = c0988c;
        this.f18918f = c2471a;
        this.f18917e = c1542f;
        this.f18919g = c1249a;
        this.f18920h = c1287h;
        this.f18926n = c2171b;
        this.f18921i = c2162a;
        this.f18922j = c1461c;
        this.f18923k = c1463g;
        this.f18924l = c2104b;
        this.f18925m = c1867w;
        this.f18927o = abVar;
    }

    public final String mo3683b() {
        if (this.f18928p == null || this.f18928p.isEmpty()) {
            return null;
        }
        return ((NavigationState) this.f18928p.peek()).f18907d;
    }

    private static Fragment m17744a(Document document, String str, String str2, String str3, boolean z, View[] viewArr, boolean z2, C2495w c2495w) {
        if (C3760e.m17903a()) {
            return aw.m13916a(document, str, str2, str3, z, z2, viewArr, c2495w.m13365a());
        }
        return aq.m13882a(document, str, str2, str3, z, z2, c2495w.m13365a());
    }

    public final void mo3696c() {
        m17741F();
        this.f18930r = false;
    }

    private final void m17741F() {
        int i;
        if (this.f18922j.dj().mo2294a(12644271)) {
            for (i = 0; i < this.f18929q.size(); i++) {
                ((C3758b) this.f18929q.get(i)).mo4048c();
            }
            do {
            } while (this.f18915c.mo293d());
            this.f18928p.removeAllElements();
            return;
        }
        this.f18928p.removeAllElements();
        for (i = 0; i < this.f18929q.size(); i++) {
            ((C3758b) this.f18929q.get(i)).mo4048c();
        }
        while (this.f18915c.mo294e() > 0) {
            this.f18915c.mo293d();
        }
    }

    public final boolean mo3700d() {
        return (this.f18914b == null || this.f18914b.f6327x) ? false : true;
    }

    public final void mo3635a(Uri uri, String str, C2495w c2495w) {
        Fragment c1593a = new C1593a();
        Uri a = be.m21799a(uri);
        Account[] d = C1473m.f7980a.mo2041U().mo1188d();
        CharSequence queryParameter = a.getQueryParameter("ah");
        if (!TextUtils.isEmpty(queryParameter)) {
            String str2;
            for (Account account : d) {
                if (C4688t.m21838a(account.name.getBytes()).equals(queryParameter)) {
                    str2 = account.name;
                    break;
                }
            }
            str2 = null;
            if (TextUtils.isEmpty(str2)) {
                c1593a.m6262d("DeepLinkShimFragment.overrideAccountMissing", true);
            } else {
                c1593a.m6259c(str2);
                c1593a.m6258b("DeepLinkShimFragment.overrideAccount", str2);
                c2495w = c2495w.m13380b(str2);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            c1593a.m6258b("DeepLinkShimFragment.referringPackage", str);
        }
        c1593a.m6319a(C1473m.f7980a.dn(), a.toString());
        c1593a.m6257b(c2495w);
        c1593a.mo2580a(c2495w);
        mo3630a(9, null, c1593a, false, new View[0]);
    }

    public void mo3646a(DfeToc dfeToc, C2495w c2495w) {
        if (dfeToc != null) {
            if (!mo3700d()) {
                C1036b c1036b = this.f18914b;
                c1036b.m6059a(new C1073h(c1036b));
            } else if (!m17749a(dfeToc, 3)) {
                if (dfeToc.m14609b().size() == 1) {
                    m17741F();
                    gj gjVar = (gj) dfeToc.m14609b().get(0);
                    mo3630a(2, gjVar.e, gn.m6631a(gjVar.e, gjVar.d, gjVar.c, dfeToc, c2495w.m13365a()), true, new View[0]);
                } else if (this.f18922j.dj().mo2294a(12642869)) {
                    mo3649a(dfeToc, dfeToc.f14881a.f31765h, c2495w);
                } else {
                    String str;
                    String str2 = dfeToc.f14881a.f31765h;
                    if (C0954a.bH.m5764b()) {
                        int intValue = ((Integer) C0954a.bH.m5760a()).intValue();
                        for (go goVar : dfeToc.f14881a.f31757E) {
                            if (intValue == goVar.c) {
                                str = goVar.d;
                                break;
                            }
                        }
                        str = null;
                        if (TextUtils.isEmpty(str)) {
                            C0954a.bH.m5765c();
                        }
                        mo3649a(dfeToc, str, c2495w);
                    }
                    str = str2;
                    mo3649a(dfeToc, str, c2495w);
                }
            }
        }
    }

    public final void mo3688b(DfeToc dfeToc, C2495w c2495w) {
        if (dfeToc != null && mo3700d()) {
            String str = dfeToc.f14881a.f31766i;
            if (!m17749a(dfeToc, 13)) {
                m17741F();
                mo3630a(1, str, gn.m6631a(str, this.f18914b.getString(C1608h.m9244a(dfeToc.f14883c)), 13, dfeToc, c2495w.m13365a()), false, new View[0]);
            }
        }
    }

    public final void mo3647a(DfeToc dfeToc, C2495w c2495w, int i) {
        if (mo3700d()) {
            String str;
            int i2;
            boolean z;
            String string;
            if (i == 1) {
                str = dfeToc.f14881a.f31783z;
            } else {
                str = dfeToc.f14881a.f31765h;
            }
            if (dfeToc.m14609b().size() > 1) {
                i2 = 1;
            } else {
                z = false;
            }
            if (m17743H() && r0 != 0) {
                gn gnVar = (gn) mo3724E();
                if (!(gnVar.f6892a == null || gnVar.as == null)) {
                    com.google.wireless.android.finsky.dfe.nano.ab[] abVarArr = gnVar.f6892a.f14921a.d;
                    int i3 = 0;
                    while (i3 < abVarArr.length) {
                        if (abVarArr[i3].l == 3 && ((abVarArr[i3].e() && abVarArr[i3].m == i) || (!abVarArr[i3].e() && i == 0))) {
                            gnVar.aB.m16089a(gnVar.av.f6856A);
                            i3 = C5872c.m27302b(gnVar.av, i3);
                            gnVar.as.m1757a(i3, true);
                            gnVar.m6655h(i3);
                            i2 = 1;
                            break;
                        }
                        i3++;
                    }
                }
                z = false;
                if (i2 != 0) {
                    i2 = 1;
                    if (i2 != 0) {
                        m17741F();
                        if (i != 1) {
                            string = this.f18914b.getString(C7582R.string.games_corpus_title);
                        } else {
                            string = this.f18914b.getString(C7582R.string.launcher_name);
                        }
                        mo3630a(1, str, gn.m6631a(str, string, 3, dfeToc, c2495w.m13365a()), false, new View[0]);
                    }
                }
            }
            z = false;
            if (i2 != 0) {
                m17741F();
                if (i != 1) {
                    string = this.f18914b.getString(C7582R.string.launcher_name);
                } else {
                    string = this.f18914b.getString(C7582R.string.games_corpus_title);
                }
                mo3630a(1, str, gn.m6631a(str, string, 3, dfeToc, c2495w.m13365a()), false, new View[0]);
            }
        }
    }

    public final void mo3649a(DfeToc dfeToc, String str, C2495w c2495w) {
        int i;
        if (str.equals(dfeToc.f14881a.f31766i)) {
            i = 13;
        } else {
            if (TextUtils.isEmpty(dfeToc.f14881a.f31766i)) {
                for (gj gjVar : dfeToc.m14609b()) {
                    if (str.equals(gjVar.e)) {
                        i = gjVar.c;
                        break;
                    }
                }
            }
            i = 3;
        }
        mo3648a(dfeToc, str, i, c2495w);
    }

    public final void mo3648a(DfeToc dfeToc, String str, int i, C2495w c2495w) {
        String string = this.f18914b.getString(C7582R.string.launcher_name);
        if (!m17749a(dfeToc, i)) {
            m17741F();
            mo3630a(1, str, gn.m6631a(str, string, i, dfeToc, c2495w.m13365a()), true, new View[0]);
        }
    }

    public final void mo3674a(String str, String str2, int i, DfeToc dfeToc, C2495w c2495w) {
        if (mo3700d()) {
            mo3630a(2, str, gn.m6631a(str, str2, i, dfeToc, c2495w.m13365a()), false, new View[0]);
        }
    }

    public final void mo3693b(String str, String str2, int i, DfeToc dfeToc, C2495w c2495w) {
        switch (i) {
            case 3:
            case 13:
                mo3649a(dfeToc, str, c2495w);
                return;
            default:
                if (TextUtils.isEmpty(dfeToc.f14881a.f31766i)) {
                    mo3649a(dfeToc, str, c2495w);
                    return;
                } else {
                    mo3674a(str, str2, i, dfeToc, c2495w);
                    return;
                }
        }
    }

    private final boolean m17749a(DfeToc dfeToc, int i) {
        boolean z = dfeToc.m14609b().size() > 1;
        if (m17743H() && z) {
            gn gnVar = (gn) mo3724E();
            if (!(gnVar.f6892a == null || gnVar.as == null)) {
                com.google.wireless.android.finsky.dfe.nano.ab[] abVarArr = gnVar.f6892a.f14921a.d;
                int i2 = 0;
                while (i2 < abVarArr.length) {
                    if (i == abVarArr[i2].l && (i != 3 || gnVar.f6892a.f14921a.e == i2)) {
                        gnVar.aB.m16089a(gnVar.av.f6856A);
                        i2 = C5872c.m27302b(gnVar.av, i2);
                        gnVar.as.m1757a(i2, true);
                        gnVar.m6655h(i2);
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            z = false;
            if (z) {
                return true;
            }
        }
        return false;
    }

    private final boolean m17742G() {
        int g = mo3705g();
        if ((mo3724E() instanceof gn) && (g == 1 || g == 0)) {
            return true;
        }
        return false;
    }

    private final boolean m17743H() {
        int g = mo3705g();
        if ((mo3724E() instanceof gn) && g == 1) {
            return true;
        }
        return false;
    }

    public void mo3673a(String str, String str2, int i, int i2, DfeToc dfeToc, ad adVar, C2495w c2495w) {
        mo3677a(str, str2, false, i, i2, dfeToc, adVar, c2495w);
    }

    public final void mo3677a(String str, String str2, boolean z, int i, int i2, DfeToc dfeToc, ad adVar, C2495w c2495w) {
        if (mo3700d()) {
            int i3;
            c2495w.m13379b(new C2475d(adVar));
            if (dfeToc == null || (dfeToc.m14607a(str) == null && (TextUtils.isEmpty(dfeToc.f14881a.f31783z) || !str.equals(dfeToc.f14881a.f31783z)))) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            int i4 = i3;
            String str3 = str;
            mo3630a(i4, str3, gn.m6632a(str, str2, z, i, i2, dfeToc, c2495w.m13365a()), false, new View[0]);
        }
    }

    public final void mo3669a(String str, ig igVar, C2495w c2495w) {
        this.f18914b.startActivityForResult(this.f18926n.mo2736a(this.f18914b, igVar.f12652a, str, PurchaseFlowConfig.f9283a, c2495w), 53);
    }

    public final void mo3670a(String str, io ioVar, C2495w c2495w) {
        String str2;
        String str3 = null;
        if (ioVar != null) {
            if (TextUtils.isEmpty(ioVar.f12666b)) {
                str2 = null;
            } else {
                str2 = ioVar.f12666b;
            }
            if (!TextUtils.isEmpty(ioVar.f12667c)) {
                str3 = ioVar.f12667c;
            }
        } else {
            str2 = null;
        }
        this.f18914b.startActivityForResult(this.f18926n.mo2753a(str, str2, str3, c2495w), 34);
    }

    public final void mo3645a(C2495w c2495w) {
        if (mo3700d()) {
            Fragment c1841f = new C1841f();
            c1841f.mo2580a(c2495w);
            mo3630a(20, null, c1841f, false, new View[0]);
        }
    }

    public final void mo3643a(ip ipVar, String str, int i, DfeToc dfeToc, ad adVar, int i2, C2495w c2495w) {
        m17746a(ipVar, str, i, dfeToc, adVar, null, null, 0, null, i2, c2495w);
    }

    private final void m17746a(ip ipVar, String str, int i, DfeToc dfeToc, ad adVar, Document document, String str2, int i2, String str3, int i3, C2495w c2495w) {
        if (mo3700d()) {
            c2495w.m13379b(new C2475d(adVar));
            int i4;
            if (!TextUtils.isEmpty(ipVar.f12681d)) {
                if (ipVar.bo_()) {
                    i4 = ipVar.f12677J;
                } else {
                    i4 = 0;
                }
                mo3673a(ipVar.f12681d, str, i, i4, dfeToc, null, c2495w);
            } else if (!TextUtils.isEmpty(ipVar.f12679b)) {
                mo3692b(ipVar.f12679b, c2495w);
            } else if (ipVar.f12691n != null) {
                if (ipVar.f12673F.f11834c == 11) {
                    this.f18914b.startActivity(this.f18926n.mo2730a(this.f18916d.cY(), this.f18925m.m9993a(this.f18914b, ipVar.f12673F, str2, this.f18922j.dj()), c2495w));
                } else if (document == null) {
                    throw new IllegalArgumentException("DirectPurchase resolvedLink requires purchaseDoc.");
                } else {
                    this.f18914b.startActivityForResult(this.f18926n.mo2732a(this.f18916d.cY(), document, null, ipVar.f12691n.f12657e, null, str2, null, false, i2, c2495w), 33);
                }
            } else if (!TextUtils.isEmpty(ipVar.f12693p)) {
                mo3649a(dfeToc, ipVar.f12693p, c2495w);
            } else if (ipVar.f12692o != null) {
                mo3669a(this.f18916d.cZ(), ipVar.f12692o, c2495w);
            } else if (ipVar.f12694q != null) {
                mo3670a(this.f18916d.cZ(), ipVar.f12694q, c2495w);
            } else if (!TextUtils.isEmpty(ipVar.f12682e)) {
                String str4;
                int i5;
                if (((ipVar.f12678a & 1048576) != 0 ? 1 : null) != null) {
                    str4 = ipVar.f12676I;
                } else {
                    str4 = str3;
                }
                if (((ipVar.f12678a & 524288) != 0 ? 1 : null) != null) {
                    i5 = ipVar.f12675H;
                } else {
                    i5 = i;
                }
                if (ipVar.bo_()) {
                    i4 = ipVar.f12677J;
                } else {
                    i4 = 0;
                }
                mo3672a(ipVar.f12682e, str4, i5, i4, null, i3, c2495w);
            } else if (!TextUtils.isEmpty(ipVar.f12684g)) {
                mo3629a(0, c2495w);
            } else if (!TextUtils.isEmpty(ipVar.f12685h)) {
                mo3629a(4, c2495w);
            } else if (!TextUtils.isEmpty(ipVar.f12686i)) {
                mo3629a(1, c2495w);
            } else if (!TextUtils.isEmpty(ipVar.f12687j)) {
                mo3629a(3, c2495w);
            } else if (!TextUtils.isEmpty(ipVar.f12688k)) {
                mo3629a(2, c2495w);
            } else if (ipVar.f12696s != null) {
                il ilVar = ipVar.f12696s;
                if (!TextUtils.isEmpty(ilVar.f12664b)) {
                    this.f18924l.m10992a(this.f18914b, ilVar.f12664b, false);
                }
            } else if (!TextUtils.isEmpty(ipVar.f12697t)) {
                mo3644a(ipVar, null, null, -14273992, c2495w);
            } else if (ipVar.f12698u != null) {
                mo3699d(c2495w);
            } else if (ipVar.f12699v != null) {
                mo3629a(5, c2495w);
            } else if (!TextUtils.isEmpty(ipVar.f12668A)) {
                mo3689b(this.f18927o.dn(), ipVar.f12668A, c2495w);
            } else if (ipVar.f12670C != null) {
                mo3687b(c2495w);
            } else if (ipVar.bn_()) {
                mo3650a(dfeToc, ipVar.f12672E, false, c2495w);
            }
        }
    }

    public final void mo3644a(ip ipVar, String str, String str2, int i, C2495w c2495w) {
        if (mo3700d()) {
            String str3 = ipVar.f12697t;
            Fragment c2982b = new C2982b();
            c2982b.m6258b("storyId", str);
            c2982b.m6258b("storyUrl", str3);
            c2982b.m6253a("fragmentState", 0);
            c2982b.m6253a("storyColor", i);
            c2982b.m6258b("storyTitle", str2);
            c2982b.mo2580a(c2495w);
            mo3630a(22, str3, c2982b, false, new View[0]);
        }
    }

    public final void mo3639a(eu euVar, DfeToc dfeToc, PackageManager packageManager, C2495w c2495w) {
        mo3640a(euVar, null, dfeToc, packageManager, c2495w);
    }

    public final void mo3640a(eu euVar, String str, DfeToc dfeToc, PackageManager packageManager, C2495w c2495w) {
        mo3641a(euVar, str, dfeToc, packageManager, null, null, 0, -1, null, 0, c2495w);
    }

    public final void mo3641a(eu euVar, String str, DfeToc dfeToc, PackageManager packageManager, Document document, String str2, int i, int i2, String str3, int i3, C2495w c2495w) {
        if (euVar.f12324d != null) {
            m17746a(euVar.f12324d, str, i2, dfeToc, null, document, str2, i, str3, i3, c2495w);
        } else if (euVar.f12326f != 0) {
            r1 = euVar.f12326f;
            String b = this.f18921i.mo2711b(r1);
            int d = this.f18921i.mo2717d(r1);
            if (!this.f18921i.mo2713b(packageManager, r1)) {
                this.f18921i.mo2695a(this.f18914b, b, d, 1, this.f18915c, null);
            } else if (TextUtils.isEmpty(euVar.f12323c)) {
                this.f18914b.startActivity(this.f18921i.mo2706b(this.f18914b, r1, this.f18916d.cZ()));
            } else {
                r2 = this.f18921i.mo2705b(r1, euVar.f12323c, this.f18916d.cZ());
                if (this.f18921i.mo2712b(r1, r2)) {
                    this.f18914b.startActivity(r2);
                } else {
                    this.f18921i.mo2695a(this.f18914b, b, d, 1, this.f18915c, null);
                }
            }
        } else {
            if (((euVar.f12322b & 2) != 0 ? 1 : null) != null) {
                r1 = euVar.f12325e;
                if (!this.f18921i.mo2703a(packageManager, r1)) {
                    mo3684b(r1);
                    return;
                } else if (TextUtils.isEmpty(euVar.f12323c)) {
                    this.f18914b.startActivity(this.f18921i.mo2684a(this.f18914b, r1, this.f18916d.cZ()));
                    return;
                } else {
                    r2 = this.f18921i.mo2683a(r1, euVar.f12323c, this.f18916d.cZ());
                    if (this.f18921i.mo2697a(r1, r2)) {
                        this.f18914b.startActivity(r2);
                        return;
                    } else {
                        mo3684b(r1);
                        return;
                    }
                }
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(euVar.f12323c));
            this.f18914b.startActivity(intent);
        }
    }

    public final void mo3660a(Document document, String str, boolean z, C2495w c2495w) {
        if (this.f18914b != null && !this.f18914b.f6327x) {
            Intent a = this.f18926n.mo2741a(this.f18914b, document, str, z, c2495w);
            Fragment E = mo3724E();
            if (E != null) {
                E.startActivityForResult(a, 45);
            } else {
                this.f18914b.startActivityForResult(a, 45);
            }
        }
    }

    public final void mo3650a(DfeToc dfeToc, String str, boolean z, C2495w c2495w) {
        if (!mo3700d()) {
            return;
        }
        if (dfeToc == null) {
            FinskyLog.m21669e("Got null DFE Toc", new Object[0]);
            return;
        }
        String c;
        if (str == null) {
            c = dfeToc.m14610c();
        } else {
            c = str;
        }
        Fragment c1120t = new C1120t();
        c1120t.m6251a(dfeToc);
        c1120t.mo2580a(c2495w);
        c1120t.m6262d("trigger_update_all", z);
        c1120t.m6258b("my_apps_url", c);
        mo3630a(3, c, c1120t, false, new View[0]);
    }

    public final void mo3701e() {
        if (mo3700d()) {
            Fragment c1046a = new C1046a();
            c1046a.m6251a(C1473m.f7980a.dn());
            mo3630a(10, null, c1046a, false, new View[0]);
        }
    }

    public final void mo3687b(C2495w c2495w) {
        if (!mo3700d()) {
            return;
        }
        if (this.f18922j.dj().mo2294a(12641429)) {
            Fragment atVar = new at();
            atVar.mo2580a(c2495w);
            mo3630a(28, null, atVar, false, new View[0]);
            return;
        }
        this.f18914b.startActivity(UninstallManagerActivityV2.m21251a(new ArrayList(), c2495w, true));
    }

    public final void mo3629a(int i, C2495w c2495w) {
        mo3628a(i, null, c2495w, this.f18916d.cZ());
    }

    public final void mo3628a(int i, ax axVar, C2495w c2495w, String str) {
        if (mo3700d()) {
            Fragment c2010k;
            String str2;
            int i2;
            DfeToc dn = this.f18927o.dn();
            C2495w a;
            String uri;
            switch (i) {
                case 0:
                    a = c2495w.m13365a();
                    c2010k = new C2010k();
                    c2010k.mo2580a(a);
                    str2 = null;
                    i2 = 13;
                    break;
                case 1:
                    uri = C1286g.f7665j.toString();
                    c2010k = C2007h.m10644a(uri, C7582R.string.account_order_history_page_title, C7582R.string.no_order_history, axVar, dn, true, false, false, false, 0, null, c2495w.m13365a());
                    str2 = uri;
                    i2 = 15;
                    break;
                case 2:
                    if (!this.f18922j.dj().mo2294a(12644010)) {
                        if (!TextUtils.equals(str, this.f18916d.cZ())) {
                            mo3646a(this.f18927o.dn(), c2495w);
                            uri = this.f18914b.getString(C7582R.string.update_subscription_deeplink_account_mismatch_title);
                            new C1508k().m8859c(uri).m8856b(this.f18914b.getString(C7582R.string.update_subscription_deeplink_account_mismatch_content, new Object[]{str, r2})).m8860d((int) C7582R.string.got_it_button).mo2272a().m625a(this.f18915c, "NavigationManager.errorDialog");
                            return;
                        }
                    }
                    uri = C1286g.f7663h.toString();
                    c2010k = C2007h.m10644a(uri, C7582R.string.account_subscriptions_page_title, C7582R.string.no_subscriptions, axVar, dn, false, true, false, false, 0, null, c2495w.m13365a());
                    str2 = uri;
                    i2 = 15;
                    break;
                case 3:
                    uri = C1286g.f7664i.toString();
                    c2010k = C2007h.m10644a(uri, C7582R.string.account_rewards_page_title, C7582R.string.no_rewards, axVar, dn, false, false, false, false, 0, null, c2495w.m13365a());
                    str2 = uri;
                    i2 = 15;
                    break;
                case 4:
                    a = c2495w.m13365a();
                    c2010k = new C2028q();
                    c2010k.mo2580a(a);
                    str2 = null;
                    i2 = 15;
                    break;
                case 5:
                    a = c2495w.m13365a();
                    c2010k = new C3066d();
                    c2010k.mo2580a(a);
                    str2 = null;
                    i2 = 15;
                    break;
                case 6:
                    c2010k = ba.m10604a(0, c2495w.m13365a());
                    str2 = null;
                    i2 = 15;
                    break;
                case 7:
                    c2010k = ba.m10604a(1, c2495w.m13365a());
                    str2 = null;
                    i2 = 15;
                    break;
                case 8:
                    a = c2495w.m13365a();
                    c2010k = new com.google.android.finsky.billing.myaccount.ad();
                    c2010k.mo2580a(a);
                    str2 = null;
                    i2 = 15;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid account page type: " + i);
            }
            mo3630a(i2, str2, c2010k, false, new View[0]);
        }
    }

    public final void mo3698c(C2495w c2495w) {
        DfeToc dn = this.f18927o.dn();
        String uri = C1286g.f7663h.toString();
        String str = uri;
        mo3630a(29, str, C2007h.m10644a(uri, C7582R.string.account_subscriptions_page_title, C7582R.string.no_subscriptions, null, dn, false, true, false, false, 0, null, c2495w.m13365a()), false, new View[0]);
    }

    public final void mo3667a(String str, ax axVar, boolean z, long j, byte[] bArr, C2495w c2495w) {
        if (!mo3700d()) {
            return;
        }
        if (z) {
            mo3646a(this.f18927o.dn(), c2495w);
            C1508k c1508k = new C1508k();
            c1508k.m8848a((int) C7582R.string.update_subscription_deeplink_override_account_missing);
            c1508k.m8860d((int) C7582R.string.ok);
            c1508k.mo2272a().m625a(this.f18915c, "NavigationManager.errorDialog");
            return;
        }
        if (TextUtils.equals(str, this.f18916d.cZ())) {
            String uri = C1286g.f7663h.toString();
            String str2 = uri;
            mo3630a(15, str2, C2007h.m10644a(uri, C7582R.string.account_subscriptions_page_title, C7582R.string.no_subscriptions, axVar, this.f18927o.dn(), false, false, true, false, j, bArr, c2495w.m13365a()), false, new View[0]);
            return;
        }
        this.f18923k.mo2242f(str).m13320a(new C2474c(1402).m13240a(null).f13342a, null, -1);
        mo3646a(this.f18927o.dn(), c2495w);
        this.f18914b.startActivityForResult(this.f18926n.mo2761b(this.f18914b, str, axVar, j, bArr, c2495w), 51);
    }

    public final void mo3668a(String str, ax axVar, boolean z, C2495w c2495w) {
        if (!mo3700d()) {
            return;
        }
        if (z) {
            mo3646a(this.f18927o.dn(), c2495w);
            C1508k c1508k = new C1508k();
            c1508k.m8848a((int) C7582R.string.update_subscription_deeplink_override_account_missing);
            c1508k.m8860d((int) C7582R.string.ok);
            c1508k.mo2272a().m625a(this.f18915c, "NavigationManager.errorDialog");
            return;
        }
        if (TextUtils.equals(str, this.f18916d.cZ())) {
            String uri = C1286g.f7663h.toString();
            String str2 = uri;
            mo3630a(15, str2, C2007h.m10644a(uri, C7582R.string.account_subscriptions_page_title, C7582R.string.no_subscriptions, axVar, this.f18927o.dn(), false, false, false, true, 0, null, c2495w.m13365a()), false, new View[0]);
            return;
        }
        mo3646a(this.f18927o.dn(), c2495w);
    }

    public final void mo3703f() {
        if (mo3700d()) {
            mo3630a(18, null, new C3048i(), false, new View[0]);
        }
    }

    public final void mo3671a(String str, C2495w c2495w) {
        if (mo3700d()) {
            Fragment c3057h = new C3057h();
            c3057h.m6258b("FamilyLibraryUrl", str);
            Bundle bundle = new Bundle();
            bundle.putString("FamilyLibraryUrl", str);
            c3057h.m600f(bundle);
            c3057h.mo2580a(c2495w);
            mo3630a(23, str, c3057h, false, new View[0]);
        }
    }

    public final void mo3642a(ik ikVar) {
        if (mo3700d()) {
            Fragment c3091h = new C3091h();
            if (ikVar != null) {
                c3091h.m6254a("extra_remote_escalation_info", ParcelableProto.m21671a((C0757i) ikVar));
            }
            mo3630a(24, null, c3091h, false, new View[0]);
        }
    }

    public final void mo3679a(al[] alVarArr, String str, int i, boolean z) {
        if (mo3700d()) {
            Fragment c3039a = new C3039a();
            Bundle bundle = new Bundle();
            bundle.putInt("backend", i);
            bundle.putBoolean("autoSharingEnabled", z);
            c3039a.m600f(bundle);
            c3039a.f15894f = str;
            c3039a.f15895h = alVarArr;
            mo3630a(21, null, c3039a, false, new View[0]);
        }
    }

    public final void mo3699d(C2495w c2495w) {
        Context context = this.f18914b;
        String cZ = this.f18916d.cZ();
        C1561c a = FamilySetupActivity.f16038G.mo2306a(cZ);
        if (a.mo2331l()) {
            int i;
            int i2;
            OnClickListener c3101b;
            if (a.mo2327h()) {
                i = C7582R.string.family_onboarding_invalid_fop_hoh;
                i2 = C7582R.string.update;
                c3101b = new C3101b(this, true, c2495w);
            } else {
                i = C7582R.string.family_onboarding_invalid_fop_member;
                i2 = 17039370;
                c3101b = new C3101b(this, false, c2495w);
            }
            new a(context).a(C7582R.string.error).b(i).a(i2, c3101b).b();
            return;
        }
        Intent intent = new Intent(context, FamilySetupActivity.class);
        intent.putExtra("accountName", cZ);
        c2495w.m13376a(intent);
        context.startActivityForResult(intent, 52);
    }

    public final void mo3689b(DfeToc dfeToc, String str, C2495w c2495w) {
        if (mo3700d()) {
            mo3630a(26, null, C3923a.m18597a(dfeToc, str, c2495w), false, new View[0]);
        }
    }

    public final void mo3663a(String str, int i, int i2, ad adVar, int i3, C2495w c2495w) {
        mo3672a(C1289l.m7695a(str, i, i2), str, i, i2, adVar, i3, c2495w);
    }

    public final void mo3672a(String str, String str2, int i, int i2, ad adVar, int i3, C2495w c2495w) {
        if (mo3700d()) {
            c2495w.m13379b(new C2475d(adVar));
            if (i3 != 4) {
                c2495w = c2495w.m13365a();
            }
            Fragment geVar = new ge();
            geVar.m6251a(C1473m.f7980a.dn());
            geVar.m6258b("SearchFragment.searchUrl", str);
            String str3 = "SearchFragment.query";
            if (str2 == null) {
                str2 = "";
            }
            geVar.m6258b(str3, str2);
            str3 = "SearchFragment.backendId";
            if (i < 0) {
                i = 0;
            }
            geVar.m6253a(str3, i);
            geVar.m6253a("SearchFragment.searchBehaviorId", i2);
            geVar.m6253a("SearchFragment.searchTrigger", i3);
            geVar.mo2580a(c2495w);
            mo3630a(7, str, geVar, false, new View[0]);
        }
    }

    public final void mo3664a(String str, int i, C2495w c2495w, ad adVar) {
        mo3663a(str, i, 0, adVar, 4, c2495w);
    }

    public final void mo3702e(C2495w c2495w) {
        this.f18926n.mo2757a(this.f18914b, c2495w);
    }

    public final void mo3662a(String str) {
        Intent a = this.f18921i.mo2689a(Uri.parse(str));
        a.putExtra("com.android.browser.application_id", this.f18914b.getPackageName());
        this.f18921i.mo2698a(this.f18914b, a);
    }

    public final void mo3691b(String str) {
        if (mo3700d()) {
            Context context = this.f18914b;
            Intent intent = new Intent(context, FlagItemDialog.class);
            intent.putExtra("url", str);
            intent.setFlags(536936448);
            context.startActivity(intent);
        }
    }

    public void mo3692b(String str, C2495w c2495w) {
        if (mo3700d()) {
            int i = 6;
            String str2 = str;
            boolean z = false;
            mo3630a(i, str2, C1597e.m9185a(str, null, null, null, null, c2495w.m13365a()), z, new View[0]);
        }
    }

    public void mo3676a(String str, String str2, String str3, String str4, C2495w c2495w) {
        mo3665a(str, null, str2, str3, str4, c2495w);
    }

    public final void mo3665a(String str, ax axVar, String str2, String str3, String str4, C2495w c2495w) {
        mo3666a(str, axVar, str2, str3, str4, false, c2495w);
    }

    public void mo3666a(String str, ax axVar, String str2, String str3, String str4, boolean z, C2495w c2495w) {
        if (mo3700d()) {
            mo3630a(6, str, C1597e.m9185a(str, str2, str3, str4, axVar == null ? null : axVar.f11833b, c2495w.m13365a()), false, new View[0]);
            if (z) {
                this.f18914b.finish();
            }
        }
    }

    public void mo3657a(Document document, C2495w c2495w) {
        m17747a(document, document.f14885a.f12116w, null, null, false, null, c2495w);
    }

    public void mo3653a(Document document, View view, C2495w c2495w) {
        m17747a(document, document.f14885a.f12116w, null, null, false, view, c2495w);
    }

    public final void mo3658a(Document document, String str, String str2, String str3, C2495w c2495w) {
        m17747a(document, str, str2, str3, true, null, c2495w);
    }

    public final void mo3659a(Document document, String str, String str2, String str3, boolean z, C2495w c2495w) {
        m17751b(document, str, str2, str3, true, null, z, c2495w);
    }

    public void mo3725a(Document document, View[] viewArr, C2495w c2495w) {
        m17751b(document, document.f14885a.f12116w, null, null, false, viewArr, false, c2495w);
    }

    private final void m17747a(Document document, String str, String str2, String str3, boolean z, View view, C2495w c2495w) {
        m17751b(document, str, str2, str3, z, view == null ? null : new View[]{view}, false, c2495w);
    }

    private final void m17751b(Document document, String str, String str2, String str3, boolean z, View[] viewArr, boolean z2, C2495w c2495w) {
        if (mo3700d()) {
            int i = document.f14885a.f12098e;
            String a = this.f18919g.m7250a(document, str3);
            switch (i) {
                case 1:
                    m17745a(5, i, str, C3749d.m17744a(document, str, str2, a, !TextUtils.isEmpty(str3), viewArr, z2, c2495w), z, z2, viewArr);
                    return;
                case 7:
                    Resources resources = this.f18914b.getResources();
                    C1507b.m8844a(this.f18914b.H_(), null, resources.getString(C7582R.string.error), resources.getString(C7582R.string.unsupported_page), c2495w, 0);
                    return;
                default:
                    m17745a(5, i, str, C3749d.m17744a(document, str, str2, a, false, viewArr, z2, c2495w), z, z2, viewArr);
                    return;
            }
        }
    }

    public void mo3675a(String str, String str2, String str3, String str4) {
        mo3676a(str, str2, str3, str4, this.f18918f.m13184a(null));
    }

    public final void mo3651a(Document document, int i) {
        mo3652a(document, i, 1);
    }

    public final void mo3652a(Document document, int i, int i2) {
        if (!this.f18914b.f6327x) {
            this.f18914b.startActivityForResult(this.f18926n.mo2739a(this.f18914b, document, i, i2), 55);
        }
    }

    public final void mo3704f(C2495w c2495w) {
        Fragment c2282a = new C2282a();
        c2282a.mo2580a(c2495w);
        c2282a.m6251a(C1473m.f7980a.dn());
        mo3630a(27, null, c2282a, false, new View[0]);
    }

    public final void mo3634a(Context context, C2495w c2495w) {
        Intent a = this.f18921i.mo2687a(context, NotificationsSettingsActivity.class, "authAccount", this.f18916d.cZ());
        c2495w.m13376a(a);
        context.startActivity(a);
    }

    public final boolean mo1232p() {
        return this.f18914b.f6327x;
    }

    public final int mo3705g() {
        return this.f18928p.isEmpty() ? 0 : ((NavigationState) this.f18928p.peek()).f18904a;
    }

    public final boolean mo3706h() {
        int g = mo3705g();
        if (g == 1 || g == 2 || g == 4) {
            return true;
        }
        return false;
    }

    public final void mo3707i() {
        this.f18914b = null;
    }

    public final void mo3636a(Bundle bundle) {
        if (this.f18928p != null && !this.f18928p.isEmpty()) {
            bundle.putParcelableArrayList("nm_state", new ArrayList(this.f18928p));
        }
    }

    public boolean mo3682a(C2495w c2495w, boolean z) {
        if (!z) {
            C1045b E = mo3724E();
            if (E != null && E.am()) {
                return true;
            }
            C2495w l = mo3710l();
            if (l != null) {
                c2495w = l;
            }
        }
        return m17750a(true, c2495w);
    }

    private final boolean m17750a(boolean z, C2495w c2495w) {
        if (this.f18914b == null || this.f18914b.f6327x) {
            return false;
        }
        Object obj;
        if (z) {
            c2495w.m13379b(new C2475d(mo3712n()).m13256a(600));
        }
        if (!this.f18930r) {
            obj = null;
        } else if (this.f18928p.size() == 1 && this.f18915c.mo294e() == 1) {
            C1045b E = mo3724E();
            if (m17742G() && ((gn) E).ab() == 3) {
                obj = null;
            } else {
                int i = 1;
            }
        } else {
            obj = null;
        }
        if (obj != null) {
            mo3646a(this.f18927o.dn(), this.f18918f.m13184a(null));
            return true;
        }
        try {
            FinskyLog.m21656a();
            this.f18928p.pop();
            this.f18915c.mo292c();
            this.f18928p.peek();
            for (int i2 = 0; i2 < this.f18929q.size(); i2++) {
                ((C3758b) this.f18929q.get(i2)).mo4046a();
            }
            return true;
        } catch (EmptyStackException e) {
            return false;
        }
    }

    public final void mo3685b(Bundle bundle) {
        List parcelableArrayList = bundle.getParcelableArrayList("nm_state");
        if (parcelableArrayList != null && parcelableArrayList.size() != 0 && mo3724E() != null) {
            ArrayList arrayList = (ArrayList) parcelableArrayList;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                this.f18928p.push((NavigationState) obj);
            }
        }
    }

    public final ab mo3708j() {
        return this.f18915c;
    }

    protected C1045b mo3724E() {
        return (C1045b) this.f18915c.mo281a((int) C7582R.id.content_frame);
    }

    public final C2495w mo3710l() {
        C1045b E = mo3724E();
        if (E == null) {
            return null;
        }
        return E.bw;
    }

    public final ad mo3711m() {
        ad E = mo3724E();
        return E == null ? null : E;
    }

    public final ad mo3712n() {
        C1045b E = mo3724E();
        return E != null ? E.al() : null;
    }

    public final void mo3684b(int i) {
        this.f18921i.mo2695a(this.f18914b, this.f18921i.mo2693a(i), this.f18921i.mo2715c(i), 1, this.f18915c, null);
    }

    public final void mo3627a(int i, Bundle bundle) {
        if (i == 1 && bundle != null) {
            String string = bundle.getString("dialog_details_url");
            if (string != null && mo3700d()) {
                mo3692b(string, this.f18918f.m13184a(null));
            }
        }
    }

    public void mo3633a(Account account, Document document, boolean z) {
        int i = 1;
        if (mo3700d()) {
            if (this.f18921i.mo2700a(this.f18914b, account, document, this.f18915c, null, 1, null)) {
                i = 0;
            }
            if (i != 0 && z) {
                this.f18914b.finish();
            }
        }
    }

    public final View.OnClickListener mo3625a(View.OnClickListener onClickListener, Document document) {
        return C3760e.m17904a(document) ? onClickListener : null;
    }

    public final void mo3655a(Document document, ad adVar, C2495w c2495w) {
        mo3656a(document, adVar, null, c2495w);
    }

    public final void mo3654a(Document document, ad adVar, View view, C2495w c2495w) {
        mo3656a(document, adVar, new View[]{view}, c2495w);
    }

    public final void mo3656a(Document document, ad adVar, View[] viewArr, C2495w c2495w) {
        C2475d c2475d = new C2475d(adVar);
        if (document.aQ()) {
            this.f18914b.startActivity(this.f18926n.mo2737a(this.f18914b, document.aP().f12394c, document.f14885a.f12099f, document.f14885a.f12098e, this.f18916d.cZ(), c2495w));
        } else if (document.m14656k()) {
            c2495w.m13379b(c2475d);
            String str = null;
            if (mo3705g() == 7) {
                C1045b E = mo3724E();
                if (E instanceof ge) {
                    str = ((ge) E).ag;
                }
            }
            mo3641a(document.m14657l(), document.f14885a.f12100g, this.f18927o.dn(), this.f18914b.getPackageManager(), null, null, 0, document.f14885a.f12099f, str, 7, c2495w);
        } else if (document.m14660o() && !TextUtils.isEmpty(document.f14885a.f12111r.f12016b)) {
            mo3673a(document.f14885a.f12111r.f12016b, null, document.f14885a.f12099f, document.m14648e(), this.f18927o.dn(), adVar, c2495w);
        } else if (!TextUtils.isEmpty(document.f14885a.f12116w)) {
            c2495w.m13379b(c2475d);
            if (!document.bm()) {
                mo3692b(document.f14885a.f12116w, c2495w);
            } else if (C3760e.m17903a()) {
                mo3725a(document, viewArr, c2495w);
            } else {
                mo3657a(document, c2495w);
            }
        }
    }

    private final void m17745a(int i, int i2, String str, Fragment fragment, boolean z, boolean z2, View[] viewArr) {
        FinskyLog.m21656a();
        android.support.v4.app.aw a = this.f18915c.mo284a();
        if (!C3760e.m17903a() || viewArr == null || viewArr.length <= 0) {
            a.mo322a();
        } else {
            for (View view : viewArr) {
                String u;
                if (view != null) {
                    u = ai.f1848a.mo422u(view);
                } else {
                    u = null;
                }
                if (!TextUtils.isEmpty(u)) {
                    a.mo329a(view, u);
                }
            }
        }
        a.mo331b(C7582R.id.content_frame, fragment);
        if (z) {
            mo3717t();
        }
        NavigationState navigationState = new NavigationState(i, null, str, i2);
        navigationState.f18912i = z2;
        a.mo330a(navigationState.f18906c);
        this.f18928p.push(navigationState);
        for (int i3 = 0; i3 < this.f18929q.size(); i3++) {
            ((C3758b) this.f18929q.get(i3)).mo4047b();
        }
        a.mo334c();
    }

    public final void mo3630a(int i, String str, Fragment fragment, boolean z, View... viewArr) {
        m17745a(i, 0, str, fragment, z, false, viewArr);
    }

    public final void mo3690b(Document document, C2495w c2495w) {
        hl hlVar = document.bg().ao;
        if (hlVar.f12573b != null && hlVar.f12573b.length > 0) {
            List arrayList = new ArrayList();
            for (hm promotionCampaignDescriptionRow : hlVar.f12573b) {
                arrayList.add(new PromotionCampaignDescriptionRow(promotionCampaignDescriptionRow));
            }
            Parcelable promotionCampaignDescriptionData = new PromotionCampaignDescriptionData(document.f14885a.f12099f, arrayList);
            DfeToc dn = this.f18927o.dn();
            Fragment c3944c = new C3944c();
            Bundle bundle = new Bundle();
            bundle.putParcelable("reward_details_data", promotionCampaignDescriptionData);
            c3944c.m600f(bundle);
            c3944c.m6251a(dn);
            c3944c.mo2580a(c2495w);
            mo3630a(25, null, c3944c, false, new View[0]);
        }
    }

    public final void mo3678a(boolean z) {
        if (!this.f18928p.isEmpty()) {
            ((NavigationState) this.f18928p.peek()).f18908e = z;
        }
    }

    public final boolean mo3713o() {
        if (this.f18928p.isEmpty()) {
            return false;
        }
        return ((NavigationState) this.f18928p.peek()).f18908e;
    }

    public final boolean mo3714q() {
        if (this.f18928p.isEmpty()) {
            return false;
        }
        return ((NavigationState) this.f18928p.peek()).f18912i;
    }

    public final void mo3694b(boolean z) {
        if (!this.f18928p.isEmpty()) {
            ((NavigationState) this.f18928p.peek()).f18909f = z;
        }
    }

    public final boolean mo3715r() {
        if (this.f18928p.isEmpty()) {
            return false;
        }
        return ((NavigationState) this.f18928p.peek()).f18909f;
    }

    public final void mo3697c(int i) {
        int size = this.f18928p.size();
        if (size >= 2) {
            ((NavigationState) this.f18928p.elementAt(size - 2)).f18911h = i;
        }
    }

    public final int mo3716s() {
        int size = this.f18928p.size();
        if (size < 2) {
            return 0;
        }
        return ((NavigationState) this.f18928p.elementAt(size - 2)).f18911h;
    }

    public final void mo3717t() {
        if (!this.f18928p.isEmpty()) {
            this.f18928p.pop();
        }
        this.f18915c.mo292c();
    }

    public final View.OnClickListener mo3624a(Account account, Document document, int i, C2731v c2731v, String str, int i2, ad adVar, C2495w c2495w) {
        return new C3754e(this, c2495w, adVar != null ? adVar : mo3712n(), i2, document, account, i, c2731v, str);
    }

    public void mo3631a(Account account, Document document, int i, C2731v c2731v, String str, boolean z, C2495w c2495w) {
        if (mo3700d()) {
            this.f18914b.startActivityForResult(this.f18926n.mo2732a(account, document, null, i, c2731v, null, str, z, 0, c2495w), 33);
        }
    }

    public final void mo3632a(Account account, Document document, String str, int i) {
        if (mo3700d()) {
            this.f18914b.startActivityForResult(this.f18926n.mo2731a(account, document, str, i, this.f18918f.m13184a(null)), 51);
        }
    }

    public final View.OnClickListener mo3626a(Document document, Account account, ad adVar, C2495w c2495w) {
        return new C3755f(this, c2495w, adVar, account, document);
    }

    public final Document mo3718u() {
        if (this.f18915c == null) {
            return null;
        }
        C1045b E = mo3724E();
        if (E == null) {
            return null;
        }
        return E instanceof bp ? ((bp) E).f6511a : null;
    }

    public final int mo3719v() {
        if (this.f18915c == null) {
            return -1;
        }
        C1045b E = mo3724E();
        if (E != null) {
            return E.ab();
        }
        return -1;
    }

    public boolean mo3695b(C2495w c2495w, boolean z) {
        if (!z) {
            C1045b E = mo3724E();
            if (E != null && E.an()) {
                return true;
            }
            C2495w l = mo3710l();
            if (l != null) {
                c2495w = l;
            }
        }
        if (this.f18914b == null || this.f18914b.f6327x || this.f18928p.isEmpty()) {
            return true;
        }
        c2495w.m13379b(new C2475d(mo3712n()).m13256a(602));
        DfeToc dn = this.f18927o.dn();
        if (f18913a) {
            Intent a;
            Document u = mo3718u();
            int i;
            if (u != null) {
                i = u.f14885a.f12099f;
            } else {
                i = -1;
            }
            if (dn == null || r0 < 0 || dn.m14606a(r0) == null || r0 == 0 || r0 == 9) {
                a = this.f18926n.mo2738a(this.f18914b, this.f18918f.m13184a(null));
            } else {
                a = this.f18926n.mo2735a(this.f18914b, u.f14885a.f12099f, dn);
            }
            if (ca.m1403a(this.f18914b, a)) {
                cs.m1445a(this.f18914b).m1447a(a).m1448a();
                C0234a.m1140a(this.f18914b);
                return true;
            }
        }
        NavigationState navigationState = (NavigationState) this.f18928p.peek();
        switch (navigationState.f18904a) {
            case 2:
            case 3:
            case 10:
            case 13:
            case 20:
            case 23:
            case 26:
            case 27:
                mo3646a(dn, this.f18918f.m13184a(null));
                break;
            case 4:
                if (this.f18928p.size() != 1) {
                    m17748a(navigationState);
                    break;
                }
                mo3717t();
                mo3646a(dn, c2495w);
                break;
            case 5:
            case 6:
            case 7:
                m17748a(navigationState);
                break;
            case 8:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 21:
            case 22:
            case 24:
            case 25:
            case 28:
                return m17750a(false, c2495w);
            case 17:
                mo3646a(dn, this.f18918f.m13184a(null));
                break;
        }
        return true;
    }

    public boolean mo3720w() {
        if (mo3722y() || this.f18928p.size() == 0) {
            return false;
        }
        NavigationState navigationState = (NavigationState) this.f18928p.peek();
        if (navigationState.f18904a == 1) {
            return false;
        }
        if (navigationState.f18904a == 17) {
            return false;
        }
        if (navigationState.f18904a != 2) {
            return true;
        }
        DfeToc dfeToc = mo3724E().k_;
        if (dfeToc == null) {
            return false;
        }
        return dfeToc.m14609b().size() > 1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m17748a(com.google.android.finsky.navigationmanager.NavigationState r8) {
        /*
        r7 = this;
        r6 = 0;
        r2 = 1;
        r1 = 0;
        r0 = r7.f18914b;
        if (r0 == 0) goto L_0x000d;
    L_0x0007:
        r0 = r7.f18914b;
        r0 = r0.f6327x;
        if (r0 == 0) goto L_0x000e;
    L_0x000d:
        return;
    L_0x000e:
        r0 = r8.f18904a;
        r3 = 5;
        if (r0 == r3) goto L_0x0037;
    L_0x0013:
        r3 = 6;
        if (r0 == r3) goto L_0x0037;
    L_0x0016:
        r3 = 7;
        if (r0 == r3) goto L_0x0037;
    L_0x0019:
        r3 = 4;
        if (r0 == r3) goto L_0x0037;
    L_0x001c:
        r1 = new java.lang.IllegalArgumentException;
        r2 = 68;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "PageType is not DETAILS, DETAILS_SHIM, SEARCH or BROWSE: ";
        r2 = r3.append(r2);
        r0 = r2.append(r0);
        r0 = r0.toString();
        r1.<init>(r0);
        throw r1;
    L_0x0037:
        r0 = r7.f18927o;
        r4 = r0.dn();
        if (r4 == 0) goto L_0x000d;
    L_0x003f:
        r0 = r7.f18928p;
        r0 = r0.peek();
        r0 = (com.google.android.finsky.navigationmanager.NavigationState) r0;
        r3 = r7.f18928p;
        r3 = r3.isEmpty();
        if (r3 != 0) goto L_0x006a;
    L_0x004f:
        r3 = r0.f18904a;
        r5 = r8.f18904a;
        if (r3 != r5) goto L_0x005a;
    L_0x0055:
        r3 = r0.f18904a;
        switch(r3) {
            case 4: goto L_0x0082;
            case 5: goto L_0x0084;
            case 6: goto L_0x0084;
            case 7: goto L_0x0082;
            default: goto L_0x005a;
        };
    L_0x005a:
        r0 = r2;
    L_0x005b:
        if (r0 != 0) goto L_0x006a;
    L_0x005d:
        r0 = r7.f18928p;
        r0.pop();
        r0 = r7.f18928p;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x003f;
    L_0x006a:
        r0 = r7.f18928p;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x008c;
    L_0x0072:
        r2 = r7.f18915c;
        r0 = r7.f18928p;
        r0 = r0.peek();
        r0 = (com.google.android.finsky.navigationmanager.NavigationState) r0;
        r0 = r0.f18906c;
        r2.mo287a(r0, r1);
        goto L_0x000d;
    L_0x0082:
        r0 = r1;
        goto L_0x005b;
    L_0x0084:
        r3 = r8.f18905b;
        r0 = r0.f18905b;
        if (r3 != r0) goto L_0x005a;
    L_0x008a:
        r0 = r1;
        goto L_0x005b;
    L_0x008c:
        r0 = r7.f18915c;
        r1 = r7.f18915c;
        r1 = r1.mo295f();
        r1 = r1.mo340g();
        r0.mo287a(r1, r2);
        r0 = r7.mo3718u();
        if (r0 == 0) goto L_0x00bb;
    L_0x00a1:
        r0 = r0.f14885a;
        r3 = r0.f12099f;
        r0 = r4.m14606a(r3);
        if (r0 == 0) goto L_0x00bb;
    L_0x00ab:
        r1 = r0.e;
        r2 = r0.d;
        r0 = r7.f18918f;
        r5 = r0.m13184a(r6);
        r0 = r7;
        r0.mo3693b(r1, r2, r3, r4, r5);
        goto L_0x000d;
    L_0x00bb:
        r0 = r7.f18918f;
        r0 = r0.m13184a(r6);
        r7.mo3646a(r4, r0);
        goto L_0x000d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.navigationmanager.a.d.a(com.google.android.finsky.navigationmanager.NavigationState):void");
    }

    public final void mo3721x() {
        if (!m17742G()) {
            m17741F();
        }
        this.f18930r = true;
    }

    public void mo3637a(android.support.v4.app.ad adVar) {
        this.f18915c.mo286a(adVar);
    }

    public final void mo3686b(android.support.v4.app.ad adVar) {
        this.f18915c.mo290b(adVar);
    }

    public boolean mo3722y() {
        return this.f18915c.mo294e() == 0;
    }

    public final boolean mo3723z() {
        return this.f18915c.mo291b();
    }

    public boolean mo3620A() {
        switch (mo3705g()) {
            case 8:
            case 14:
            case 19:
            case 25:
            case 27:
            case 28:
                return false;
            default:
                return true;
        }
    }

    public final void mo3638a(ah ahVar, C2495w c2495w) {
        if (ahVar.f11790c == 1) {
            this.f18920h.mo2015a().mo1652g(ahVar.f11793f, new C3756g(), null);
        } else if (ahVar.f11790c == 2) {
            mo3639a(ahVar.f11794g, this.f18927o.dn(), this.f18914b.getPackageManager(), c2495w);
        }
    }

    public final void mo3661a(C3758b c3758b) {
        if (!this.f18929q.contains(c3758b)) {
            this.f18929q.add(c3758b);
        }
    }

    public final Integer mo3621B() {
        C1045b E = mo3724E();
        if (E == null) {
            return null;
        }
        return Integer.valueOf(E.Y_());
    }

    public final Integer mo3622C() {
        C1045b E = mo3724E();
        if (E == null) {
            return null;
        }
        return Integer.valueOf(E.af());
    }

    public final ViewGroup mo3623D() {
        C1045b E = mo3724E();
        if (E != null) {
            return E.bt;
        }
        return null;
    }

    public final /* synthetic */ Fragment mo3709k() {
        return mo3724E();
    }
}
