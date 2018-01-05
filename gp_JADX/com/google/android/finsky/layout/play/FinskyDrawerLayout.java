package com.google.android.finsky.layout.play;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.view.C0357n;
import android.support.v4.view.ai;
import android.support.v7.app.C0415e;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.finsky.C1406o;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.activities.MainActivity;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bb.C1561c;
import com.google.android.finsky.bd.C1592a;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bj.C2104b;
import com.google.android.finsky.bl.C2116a;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.layout.actionbar.FinskySearchToolbar;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.notification.C3667j;
import com.google.android.finsky.notification.C3784h;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.dfe.api.C1460g;
import com.google.android.play.drawer.C3690g;
import com.google.android.play.drawer.C3691k;
import com.google.android.play.drawer.C3692j;
import com.google.android.play.drawer.C6298m;
import com.google.android.play.drawer.C6299n;
import com.google.android.play.i;
import com.google.android.play.image.C1294w;
import com.google.android.play.utils.PlayCommonLog;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.gj;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FinskyDrawerLayout extends C3690g implements ad, C3691k {
    public final ce f18664M;
    public final C2471a f18665N;
    public MainActivity f18666O;
    public C3748a f18667P;
    public final AccountManager f18668Q;
    public final C2104b f18669R;
    public final OnAccountsUpdateListener f18670S;
    public int f18671T;
    public int f18672U;
    public DfeToc f18673V;
    public final Runnable f18674W;
    public final Handler aa;
    public final ad ab;
    public final C3667j ac;
    public C2495w ad;
    public boolean ae;
    public android.support.v4.app.ad af;
    public C2116a ag;
    public C3784h ah;
    public C1461c ai;
    public C1463g aj;

    public FinskyDrawerLayout(Context context) {
        this(context, null);
    }

    public FinskyDrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18664M = C2482j.m13283a(5302);
        this.f18665N = C1473m.f7980a.aR();
        this.ae = true;
        ((C1406o) C3947d.m18649a(C1406o.class)).mo1864a(this);
        this.f18668Q = AccountManager.get(context);
        this.f18669R = C1473m.f7980a.as();
        this.f18670S = new C3693b(this, context);
        this.f18671T = 0;
        this.f18674W = new C3704m(this);
        this.aa = new Handler(Looper.myLooper());
        setAccountNameSanitizer(new C3715w(context));
        this.ab = new C2473o(HprofParser.ROOT_JNI_MONITOR, this);
        this.ac = new C3717y(this);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f18668Q.addOnAccountsUpdatedListener(this.f18670S, null, false);
        if (m17526m()) {
            this.ah.mo3757a(this.ac);
        }
    }

    protected void onDetachedFromWindow() {
        this.f18668Q.removeOnAccountsUpdatedListener(this.f18670S);
        this.ah.mo3758b(this.ac);
        super.onDetachedFromWindow();
    }

    public final void a_(View view) {
        super.a_(view);
        MainActivity mainActivity = this.f18666O;
        mainActivity.f6375U.m17386a(false);
        ai.m1841c(mainActivity.f6367M, 0);
    }

    public final void b_(View view) {
        if (!this.ap) {
            this.f18666O.m6170H();
        }
        super.b_(view);
        this.ad.m13370a(new C2488p().m13340a(127).m13345b(this));
        if (C1473m.f7980a.dj().mo2294a(12637790)) {
            if (m17528o()) {
                this.ad.m13370a(new C2488p().m13340a(299).m13345b(this.ab));
            } else {
                this.ad.m13370a(new C2488p().m13340a((int) HprofParser.ROOT_JNI_MONITOR).m13345b(this));
            }
        }
        this.f18666O.m6165C();
    }

    public final void mo3590d() {
        if (this.ap) {
            super.mo3590d();
        }
    }

    public final void m17531a(MainActivity mainActivity, Bundle bundle, C2495w c2495w) {
        boolean z = true;
        C1473m c1473m = C1473m.f7980a;
        if (C1473m.f7980a.mo2035O().m8839b()) {
            setIsMiniProfile(true);
        }
        setUseUserProfileEndpoint(true);
        int a = FinskySearchToolbar.a(mainActivity);
        boolean z2 = bundle != null && bundle.getBoolean("FinskyDrawerLayout.isAccountListExpanded", false);
        C1460g bf = c1473m.bf();
        C1294w be = c1473m.be();
        if (this.ap) {
            PlayCommonLog.d("PlayDrawer is already configured", new Object[0]);
        }
        this.ap = true;
        setActionBarHeight(a);
        this.am.mo5380a(mainActivity, z2, this, bf, be, this, this.aq, this.ar, this.as);
        CharSequence string = mainActivity.getString(i.play_drawer_title);
        a = C0357n.m2043a(8388611, ai.f1848a.mo400k(this));
        if (a == 3) {
            this.f1940D = string;
        } else if (a == 5) {
            this.f1941E = string;
        }
        this.an = new C0415e(mainActivity, this, i.play_drawer_open, i.play_drawer_close);
        setCurrentAvatarClickable(false);
        this.f18666O = mainActivity;
        this.f18667P = mainActivity.f6361G;
        Bundle bundle2 = bundle == null ? null : bundle.getBundle("FinskyDrawerLayout.LoggingContext");
        if (bundle2 != null) {
            c2495w = this.f18665N.m13179a(bundle2);
        }
        this.ad = c2495w;
        if (m17525j()) {
            m17538b(false);
            this.aa.postDelayed(new aa(this), ((Long) C0955b.jn.m28964b()).longValue());
        }
        m17542g();
        this.af = new ab(this);
        this.f18667P.mo3637a(this.af);
        mo3600h();
        if (bundle == null || !bundle.getBoolean("FinskyDrawerLayout.isDrawerOpened", false)) {
            z = false;
        }
        if (z) {
            this.f18666O.m6165C();
        }
    }

    public final boolean mo3598e() {
        return false;
    }

    public final boolean mo3595a(C6298m c6298m) {
        if (!c6298m.f31480e) {
            c6298m.f31482g.run();
        }
        return true;
    }

    public final boolean mo3596a(C6299n c6299n) {
        c6299n.f31491b.run();
        return true;
    }

    public final boolean mo3597a(String str) {
        this.f18666O.a_(str);
        return true;
    }

    public final void mo3594a(boolean z) {
        m17537b(z ? 284 : 283);
    }

    public final void mo3599f() {
    }

    public final void m17542g() {
        if (this.ap) {
            this.f18673V = C1473m.f7980a.dn();
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            if (this.f18673V != null) {
                m17521a(arrayList, arrayList2);
            } else {
                Context context = getContext();
                if (!m17529p()) {
                    arrayList2.add(new C6299n(context.getString(C7582R.string.redeem_gift_card_menu), new C3712u(this)));
                }
                arrayList2.add(new C6299n(context.getString(C7582R.string.settings), new C3713v(this)));
                m17520a(arrayList2);
            }
            String db = C1473m.f7980a.db();
            Account[] a = C1473m.f7980a.mo2041U().mo1195a();
            super.m17510k();
            this.am.mo5382a(db, a, arrayList, arrayList2);
            this.ak.setVisibility(8);
            this.ak.setOnClickListener(null);
            this.f18666O.m6167E();
        }
    }

    private final void m17521a(List list, List list2) {
        boolean z;
        Context context = getContext();
        int g = this.f18667P.mo3705g();
        boolean a = C1473m.f7980a.dj().mo2294a(12617606);
        if (this.ag.m11021a() || a) {
            z = true;
        } else {
            z = false;
        }
        if (this.f18673V != null) {
            boolean z2;
            String string;
            C3692j aeVar;
            int d;
            if (z) {
                list.add(m17518a(3, false, true));
                m17523b(list);
                if (C1473m.f7980a.dj().mo2294a(12637790)) {
                    list.add(m17519a(context, g));
                }
                if (C1473m.f7980a.dj().mo2294a(12643409)) {
                    list.add(m17522b(context, g));
                }
                list.add(new C6298m());
            }
            Object obj = this.f18673V.m14609b().size() == 1 ? 1 : null;
            if (m17529p()) {
                z2 = g == 1 || (obj != null && g == 2);
                obj = new C6298m(context.getString(C7582R.string.menu_home), new af(C7582R.raw.ic_drawer_home, C7582R.color.play_icon_selected), C7582R.color.play_icon_selected, z2, new C3710s(this));
            } else {
                string = context.getString(z ? C7582R.string.menu_home_v3 : C7582R.string.menu_home_v2);
                aeVar = new ae(3);
                d = C1608h.m9256d(3);
                z2 = (g == 1 || g == 2) && this.f18671T == 3 && this.f18672U == 0;
                obj = new C6298m(string, aeVar, d, z2, new C3709r(this));
            }
            list.add(obj);
            if (!z && this.f18671T == 3) {
                list.add(m17518a(3, !m17529p(), false));
                m17523b(list);
            }
            if (!(a || TextUtils.isEmpty(this.f18673V.f14881a.f31766i))) {
                string = context.getString(C1608h.m9244a(this.f18673V.f14883c));
                aeVar = new ae(13);
                d = C1608h.m9256d(13);
                z2 = g == 1 && this.f18671T == 13;
                list.add(new C6298m(string, aeVar, d, z2, new ac(this)));
            }
            if (!(!z || TextUtils.isEmpty(this.f18673V.f14881a.f31783z) || m17529p())) {
                string = context.getString(C7582R.string.games_corpus_title);
                aeVar = new ae();
                d = C1608h.m9256d(3);
                z2 = this.f18671T == 3 && this.f18672U == 1;
                list.add(new C6298m(string, aeVar, d, z2, new ad(this)));
            }
            if (!z) {
                if (C1473m.f7980a.dj().mo2294a(12637790)) {
                    list.add(m17519a(context, g));
                }
                if (C1473m.f7980a.dj().mo2294a(12643409)) {
                    list.add(m17522b(context, g));
                }
                list.add(new C6298m());
            }
            Collection arrayList = new ArrayList();
            List b = this.f18673V.m14609b();
            for (int i = 0; i < b.size(); i++) {
                gj gjVar = (gj) b.get(i);
                switch (gjVar.c) {
                    case 1:
                    case 2:
                    case 4:
                    case 6:
                        obj = 1;
                        break;
                    default:
                        obj = null;
                        break;
                }
                if (obj != null) {
                    string = gjVar.d;
                    aeVar = new ae(gjVar.c);
                    d = C1608h.m9256d(gjVar.c);
                    z2 = this.f18671T == gjVar.c && (g == 1 || g == 2);
                    arrayList.add(new C6298m(string, aeVar, d, z2, new C3694c(this, gjVar, z)));
                    if (this.f18671T == gjVar.c) {
                        arrayList.add(m17518a(gjVar.c, !m17529p(), z));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                list.addAll(arrayList);
                list.add(new C6298m());
            }
            C1561c c = C1473m.f7980a.aY().mo2313c();
            if (c.mo2323d() && c.mo2326g()) {
                list.add(new C6298m(context.getString(C7582R.string.family_library_label), new af(C7582R.raw.ic_family_24px, C7582R.color.play_icon_selected), C7582R.color.play_icon_selected, g == 23, new C3695d(this)));
                list.add(new C6298m());
            }
            list.add(new C6298m(context.getString(C7582R.string.account), new af(C7582R.raw.ic_account_box_24px, C7582R.color.play_icon_selected), C7582R.color.play_icon_selected, g == 13, new C3696e(this), (byte) 0));
            if (!m17529p()) {
                list.add(new C6298m(context.getString(C7582R.string.redeem_gift_card_menu), new af(C7582R.raw.ic_redeem_24px, C7582R.color.play_icon_selected), C7582R.color.play_icon_selected, false, new C3697f(this)));
            }
            if (!(m17529p() || C1473m.f7980a.mo2035O().m8839b() || !C1473m.f7980a.dj().mo2294a(12605131))) {
                list.add(new C6298m(context.getString(C7582R.string.send_gift), new af(C7582R.raw.ic_card_giftcard_24px, C7582R.color.play_icon_selected), C7582R.color.play_icon_selected, g == 20, new C3698g(this)));
            }
            if (!m17529p()) {
                list.add(new C6298m(context.getString(C7582R.string.menu_wishlist), new af(C7582R.raw.ic_wishlist_24px, C7582R.color.play_icon_selected), C7582R.color.play_icon_selected, g == 10, new C3699h(this)));
            }
            if (C1473m.f7980a.dj().mo2294a(12628665) && C1473m.f7980a.bp().mo4361a(context)) {
                list.add(new C6298m(context.getString(C7582R.string.menu_play_protect), new af(C7582R.raw.ic_play_protect_black_24dp, C7582R.color.play_icon_selected), C7582R.color.play_icon_selected, false, new C3700i(this, context)));
            }
        }
        list.add(new C6298m(context.getString(C7582R.string.settings), new af(C7582R.raw.ic_settings_24px, C7582R.color.play_icon_selected), C7582R.color.play_icon_selected, false, new C3701j(this)));
        m17520a(list2);
    }

    private final C6298m m17519a(Context context, int i) {
        String string;
        boolean z = true;
        String string2 = context.getString(C1592a.ar.intValue());
        int n = m17527n();
        if (n > 0) {
            string = context.getString(C7582R.string.num_notifications, new Object[]{string2, Integer.valueOf(n)});
        } else {
            string = string2;
        }
        C3692j afVar = new af(C7582R.raw.ic_notifications_grey600_24dp, C7582R.color.play_icon_selected);
        if (i != 27) {
            z = false;
        }
        return new C6298m(string2, afVar, null, C7582R.color.play_icon_selected, z, false, n, new C3702k(this), string);
    }

    private final C6298m m17522b(Context context, int i) {
        boolean z;
        String string = context.getString(C7582R.string.subscriptions_center);
        C3692j afVar = new af(C7582R.raw.ic_autorenew_black_24dp, C7582R.color.play_icon_selected);
        if (i == 29) {
            z = true;
        } else {
            z = false;
        }
        return new C6298m(string, afVar, C7582R.color.play_icon_selected, z, new C3703l(this), (byte) 0);
    }

    private final boolean m17526m() {
        return this.ai.dj().mo2294a(12641192);
    }

    private final int m17527n() {
        if (m17526m()) {
            return this.ah.mo3756a();
        }
        return 0;
    }

    private final boolean m17528o() {
        return m17527n() > 0;
    }

    private final void m17520a(List list) {
        Context context = getContext();
        list.add(new C6299n(context.getString(C7582R.string.help_and_feedback), new C3705n(this)));
        if (!m17529p()) {
            list.add(new C6299n(context.getString(C7582R.string.parent_guide), new C3706o(this)));
        }
        String str = (String) C0955b.f5899o.m28964b();
        if (!TextUtils.isEmpty(str)) {
            String str2 = (String) C0955b.f5898n.m28964b();
            if (TextUtils.isEmpty(str2)) {
                str2 = getContext().getString(C7582R.string.legal_notice_title);
            }
            list.add(new C6299n(str2, new C3707p(this, str)));
        }
        if (((Boolean) C0955b.f5891h.m28964b()).booleanValue()) {
            list.add(new C6299n(context.getString(C7582R.string.menu_debug_settings), new C3708q(context)));
        }
    }

    public final void mo3593a(int i, int i2) {
        if (this.f18671T != i || this.f18672U != i2) {
            this.f18671T = i;
            this.f18672U = i2;
            this.aa.post(this.f18674W);
        }
    }

    public final void mo3600h() {
        this.f18666O.m6167E();
    }

    private final boolean m17529p() {
        if (this.f18673V == null || this.f18673V.f14881a.f31778u != 1) {
            return false;
        }
        return true;
    }

    private final C6298m m17518a(int i, boolean z, boolean z2) {
        List b;
        Object obj = null;
        C3692j c3692j = null;
        Context context = getContext();
        if (this.f18673V != null) {
            b = this.f18673V.m14609b();
        } else {
            b = null;
        }
        Object a = C1608h.m9247a(i, b);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        int i2;
        boolean z3 = i == 3 && this.f18667P.mo3705g() == 3;
        if (i != 3) {
            obj = 1;
        }
        Runnable c3711t = new C3711t(this, i, context);
        switch (i) {
            case 1:
                i2 = C7582R.raw.ic_library_books_24dp;
                break;
            case 2:
                i2 = C7582R.raw.ic_library_music_24dp;
                break;
            case 3:
                i2 = C7582R.raw.ic_library_apps_24dp;
                break;
            case 4:
                i2 = C7582R.raw.ic_library_movies_24dp;
                break;
            case 6:
                i2 = C7582R.raw.ic_library_newsstand_24dp;
                break;
            default:
                i2 = -1;
                break;
        }
        C3692j afVar = new af(i2, C1608h.m9256d(i));
        if (!(obj == null || z2)) {
            c3692j = new af(C7582R.raw.ic_exit_to_app_24px, C7582R.color.play_icon_selected);
        }
        return new C6298m(a, afVar, c3692j, C1608h.m9256d(i), z3, z, c3711t);
    }

    private final void m17523b(List list) {
        if (this.f18673V.f14881a.f31781x != null) {
            list.add(new C6298m(this.f18673V.f14881a.f31781x.b, new af(C7582R.raw.ic_ticket_24dp, C7582R.color.play_icon_selected), null, C7582R.color.play_icon_selected, this.f18667P.mo3705g() == 26, true, new C3716x(this)));
        }
    }

    final void m17537b(int i) {
        if (i == HprofParser.ROOT_JNI_MONITOR && m17528o()) {
            this.ad.m13379b(new C2475d(new C2473o(HprofParser.ROOT_JNI_MONITOR, this.f18667P.mo3712n())).m13256a(299));
            return;
        }
        this.ad.m13379b(new C2475d(this.f18667P.mo3712n()).m13256a(i));
    }

    public ce getPlayStoreUiElement() {
        return this.f18664M;
    }

    public ad getParentNode() {
        return this.f18667P.mo3712n();
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public static boolean m17524i() {
        return C1473m.f7980a.dj().mo2294a(12632536);
    }

    public static boolean m17525j() {
        return C1473m.f7980a.dj().mo2294a(12632718);
    }

    public final void m17538b(boolean z) {
        if (this.ap && this.ae != z) {
            super.setDisableRpcRequests(!z);
            this.ae = z;
            if (this.ae) {
                m17542g();
            }
        }
    }
}
