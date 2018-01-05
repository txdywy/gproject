package com.google.android.finsky.activities.myapps;

import android.content.Context;
import android.support.v4.view.af;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.activities.C1036b;
import com.google.android.finsky.activities.gt;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.dfemodel.C2730u;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.frameworkviews.ah;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ac;
import com.google.android.libraries.bind.p117b.C1071a;
import com.google.android.libraries.bind.p117b.C5872c;
import com.google.android.play.utils.k;
import com.google.wireless.android.finsky.dfe.a.a.m;
import com.google.wireless.android.finsky.dfe.a.a.n;
import com.squareup.haha.perflib.StackFrame;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class C1118r extends af implements C1071a {
    public final Context f7052c;
    public final C3748a f7053d;
    public final C1254c f7054e;
    public final DfeToc f7055f;
    public final List f7056g = new ArrayList();
    public final ah f7057h;
    public int f7058i;
    public ad f7059j;
    public boolean f7060k;
    public boolean f7061l;
    public final C1120t f7062m;
    public C2495w f7063n;

    public C1118r(Context context, C3748a c3748a, C1254c c1254c, DfeToc dfeToc, ah ahVar, ac acVar, ad adVar, m mVar, boolean z, C1120t c1120t, C2495w c2495w) {
        this.f7052c = context;
        this.f7053d = c3748a;
        this.f7054e = c1254c;
        this.f7055f = dfeToc;
        this.f7057h = ahVar;
        this.f7058i = 0;
        boolean z2 = z && C1473m.f7980a.dj().mo2294a(12609286);
        this.f7060k = z2;
        this.f7059j = adVar;
        m6827a(acVar, mVar);
        this.f7061l = !k.b(context);
        this.f7062m = c1120t;
        this.f7063n = c2495w;
    }

    public final int m6837e() {
        for (int i = 0; i < this.f7056g.size(); i++) {
            if (((C1119s) this.f7056g.get(i)).f7064a == 3) {
                return i;
            }
        }
        return -1;
    }

    public final void m6838f() {
        if (m6837e() >= 0) {
            gt gtVar = ((C1119s) this.f7056g.get(m6837e())).f7067d;
            if (gtVar instanceof C1115o) {
                ((C1115o) gtVar).m6825d();
            }
        }
    }

    public final void mo1373a(ViewGroup viewGroup, int i, Object obj) {
        C2730u c2730u;
        int a = C5872c.m27301a(this, i);
        viewGroup.removeView(((gt) obj).mo1309a());
        C1119s c1119s = (C1119s) this.f7056g.get(a);
        c1119s.f7068e = c1119s.f7067d.mo1312b();
        if (c1119s.f7067d instanceof C1115o) {
            c2730u = ((C1115o) c1119s.f7067d).f7042r;
        } else {
            c2730u = null;
        }
        c1119s.f7070g = c2730u;
        c1119s.f7067d = null;
    }

    public final int mo961a() {
        return this.f7056g.size();
    }

    public final Object mo1372a(ViewGroup viewGroup, int i) {
        int a = C5872c.m27301a(this, i);
        C1119s c1119s = (C1119s) this.f7056g.get(a);
        gt gtVar = c1119s.f7067d;
        if (gtVar == null) {
            switch (c1119s.f7064a) {
                case StackFrame.COMPILED_METHOD /*-2*/:
                    if (this.f7052c instanceof C1036b) {
                        gtVar = new C1103b((C1036b) this.f7052c, this.f7054e, this.f7055f, this.f7053d, C1473m.f7980a.ah().mo2811a(this.f7054e.mo1620b()), c1119s.f7069f, this.f7063n);
                        break;
                    }
                    break;
                default:
                    Context context = this.f7052c;
                    String str = c1119s.f7066c;
                    C1254c c1254c = this.f7054e;
                    C2730u c2730u = c1119s.f7070g;
                    DfeToc dfeToc = this.f7055f;
                    C3748a c3748a = this.f7053d;
                    ah ahVar = this.f7057h;
                    FinskyHeaderListLayout finskyHeaderListLayout = (FinskyHeaderListLayout) this.f7062m.bt;
                    boolean z = C1473m.f7980a.dj().mo2294a(12637256) && C1473m.f7980a.mo2036P().f8184h;
                    gtVar = new C1115o(context, str, c1254c, c2730u, dfeToc, c3748a, ahVar, finskyHeaderListLayout, z, c1119s.f7069f, this.f7063n, a == 0 ? this.f7062m : null);
                    break;
            }
        }
        c1119s.f7067d = gtVar;
        viewGroup.addView(gtVar.mo1309a());
        gtVar.mo1310a(c1119s.f7068e);
        if (a == this.f7058i) {
            m6836c(a);
        }
        if (gtVar instanceof C1102m) {
            C1102m c1102m = (C1102m) gtVar;
            c1102m.mo1437g();
            if (!c1102m.m6793i()) {
                return c1102m;
            }
            c1102m.m_();
            return c1102m;
        }
        C1115o c1115o = (C1115o) gtVar;
        c1115o.m6824c();
        return c1115o;
    }

    private final String m6828d(int i) {
        return this.f7052c.getString(i).toUpperCase(Locale.getDefault());
    }

    final void m6836c(int i) {
        C1119s c1119s = (C1119s) this.f7056g.get(i);
        if (c1119s.f7067d != null) {
            boolean z = this.f7058i == i;
            c1119s.f7069f.m13206a(z);
            c1119s.f7067d.mo1311a(z);
            if (z) {
                C2482j.m13305c(c1119s.f7069f);
                C2482j.m13290a((ViewGroup) c1119s.f7067d.mo1309a());
            }
        }
    }

    public final boolean mo959a(View view, Object obj) {
        return ((gt) obj).mo1309a() == view;
    }

    public final void mo1377b() {
    }

    private final void m6827a(ac acVar, m mVar) {
        List c;
        List list;
        int i;
        List list2;
        int i2;
        String d;
        ad adVar;
        int i3;
        Object obj;
        Object obj2;
        int i4;
        if (acVar != null) {
            if (acVar.m21689a("MyAppsTabbedAdapterV2.TabBundles")) {
                c = acVar.m21691c("MyAppsTabbedAdapterV2.TabBundles");
                if (acVar != null) {
                    if (acVar.m21689a("MyAppsTabbedAdapterV2.TabLists")) {
                        List<C2730u> c2;
                        c2 = acVar.m21691c("MyAppsTabbedAdapterV2.TabLists");
                        if (c2 != null) {
                            for (C2730u c2730u : c2) {
                                if (c2730u != null) {
                                    c2730u.m14767a(this.f7054e);
                                }
                            }
                        }
                        list = c2;
                        this.f7056g.clear();
                        for (n nVar : mVar.b) {
                            list2 = this.f7056g;
                            i2 = nVar.c;
                            switch (nVar.c) {
                                case 1:
                                    d = m6828d(C7582R.string.my_apps_tab_installed);
                                    break;
                                case 2:
                                    d = m6828d(C7582R.string.my_apps_tab_not_on_this_device);
                                    break;
                                case 3:
                                    d = m6828d(C7582R.string.my_apps_tab_updates);
                                    break;
                                default:
                                    FinskyLog.m21669e("Unknown tab type: %d", Integer.valueOf(nVar.c));
                                    d = null;
                                    break;
                            }
                            adVar = this.f7059j;
                            switch (nVar.c) {
                                case 1:
                                    i3 = 405;
                                    break;
                                case 2:
                                    i3 = 406;
                                    break;
                                case 3:
                                    i3 = 457;
                                    break;
                                default:
                                    FinskyLog.m21669e("Unknown tab type: %d", Integer.valueOf(nVar.c));
                                    i3 = 0;
                                    break;
                            }
                            list2.add(new C1119s(i2, d, adVar, i3, nVar.d));
                        }
                        if (this.f7060k) {
                            this.f7056g.add(new C1119s(m6828d(C7582R.string.my_apps_tab_beta), this.f7059j));
                        }
                        obj = (c == null && c.size() == this.f7056g.size()) ? 1 : null;
                        obj2 = (list == null && list.size() == this.f7056g.size()) ? 1 : null;
                        for (i4 = 0; i4 < this.f7056g.size(); i4++) {
                            if (obj != null) {
                                ((C1119s) this.f7056g.get(i4)).f7068e = (ac) c.get(i4);
                            }
                            if (obj2 == null) {
                                ((C1119s) this.f7056g.get(i4)).f7070g = (C2730u) list.get(i4);
                            }
                        }
                    }
                }
                list = null;
                this.f7056g.clear();
                for (i = 0; i < r11; i++) {
                    list2 = this.f7056g;
                    i2 = nVar.c;
                    switch (nVar.c) {
                        case 1:
                            d = m6828d(C7582R.string.my_apps_tab_installed);
                            break;
                        case 2:
                            d = m6828d(C7582R.string.my_apps_tab_not_on_this_device);
                            break;
                        case 3:
                            d = m6828d(C7582R.string.my_apps_tab_updates);
                            break;
                        default:
                            FinskyLog.m21669e("Unknown tab type: %d", Integer.valueOf(nVar.c));
                            d = null;
                            break;
                    }
                    adVar = this.f7059j;
                    switch (nVar.c) {
                        case 1:
                            i3 = 405;
                            break;
                        case 2:
                            i3 = 406;
                            break;
                        case 3:
                            i3 = 457;
                            break;
                        default:
                            FinskyLog.m21669e("Unknown tab type: %d", Integer.valueOf(nVar.c));
                            i3 = 0;
                            break;
                    }
                    list2.add(new C1119s(i2, d, adVar, i3, nVar.d));
                }
                if (this.f7060k) {
                    this.f7056g.add(new C1119s(m6828d(C7582R.string.my_apps_tab_beta), this.f7059j));
                }
                if (c == null) {
                }
                if (list == null) {
                }
                for (i4 = 0; i4 < this.f7056g.size(); i4++) {
                    if (obj != null) {
                        ((C1119s) this.f7056g.get(i4)).f7068e = (ac) c.get(i4);
                    }
                    if (obj2 == null) {
                        ((C1119s) this.f7056g.get(i4)).f7070g = (C2730u) list.get(i4);
                    }
                }
            }
        }
        c = null;
        if (acVar != null) {
            if (acVar.m21689a("MyAppsTabbedAdapterV2.TabLists")) {
                c2 = acVar.m21691c("MyAppsTabbedAdapterV2.TabLists");
                if (c2 != null) {
                    for (C2730u c2730u2 : c2) {
                        if (c2730u2 != null) {
                            c2730u2.m14767a(this.f7054e);
                        }
                    }
                }
                list = c2;
                this.f7056g.clear();
                for (i = 0; i < r11; i++) {
                    list2 = this.f7056g;
                    i2 = nVar.c;
                    switch (nVar.c) {
                        case 1:
                            d = m6828d(C7582R.string.my_apps_tab_installed);
                            break;
                        case 2:
                            d = m6828d(C7582R.string.my_apps_tab_not_on_this_device);
                            break;
                        case 3:
                            d = m6828d(C7582R.string.my_apps_tab_updates);
                            break;
                        default:
                            FinskyLog.m21669e("Unknown tab type: %d", Integer.valueOf(nVar.c));
                            d = null;
                            break;
                    }
                    adVar = this.f7059j;
                    switch (nVar.c) {
                        case 1:
                            i3 = 405;
                            break;
                        case 2:
                            i3 = 406;
                            break;
                        case 3:
                            i3 = 457;
                            break;
                        default:
                            FinskyLog.m21669e("Unknown tab type: %d", Integer.valueOf(nVar.c));
                            i3 = 0;
                            break;
                    }
                    list2.add(new C1119s(i2, d, adVar, i3, nVar.d));
                }
                if (this.f7060k) {
                    this.f7056g.add(new C1119s(m6828d(C7582R.string.my_apps_tab_beta), this.f7059j));
                }
                if (c == null) {
                }
                if (list == null) {
                }
                for (i4 = 0; i4 < this.f7056g.size(); i4++) {
                    if (obj != null) {
                        ((C1119s) this.f7056g.get(i4)).f7068e = (ac) c.get(i4);
                    }
                    if (obj2 == null) {
                        ((C1119s) this.f7056g.get(i4)).f7070g = (C2730u) list.get(i4);
                    }
                }
            }
        }
        list = null;
        this.f7056g.clear();
        for (i = 0; i < r11; i++) {
            list2 = this.f7056g;
            i2 = nVar.c;
            switch (nVar.c) {
                case 1:
                    d = m6828d(C7582R.string.my_apps_tab_installed);
                    break;
                case 2:
                    d = m6828d(C7582R.string.my_apps_tab_not_on_this_device);
                    break;
                case 3:
                    d = m6828d(C7582R.string.my_apps_tab_updates);
                    break;
                default:
                    FinskyLog.m21669e("Unknown tab type: %d", Integer.valueOf(nVar.c));
                    d = null;
                    break;
            }
            adVar = this.f7059j;
            switch (nVar.c) {
                case 1:
                    i3 = 405;
                    break;
                case 2:
                    i3 = 406;
                    break;
                case 3:
                    i3 = 457;
                    break;
                default:
                    FinskyLog.m21669e("Unknown tab type: %d", Integer.valueOf(nVar.c));
                    i3 = 0;
                    break;
            }
            list2.add(new C1119s(i2, d, adVar, i3, nVar.d));
        }
        if (this.f7060k) {
            this.f7056g.add(new C1119s(m6828d(C7582R.string.my_apps_tab_beta), this.f7059j));
        }
        if (c == null) {
        }
        if (list == null) {
        }
        for (i4 = 0; i4 < this.f7056g.size(); i4++) {
            if (obj != null) {
                ((C1119s) this.f7056g.get(i4)).f7068e = (ac) c.get(i4);
            }
            if (obj2 == null) {
                ((C1119s) this.f7056g.get(i4)).f7070g = (C2730u) list.get(i4);
            }
        }
    }

    public final boolean mo1381g() {
        return this.f7061l;
    }

    public final void mo1375a(boolean z) {
        if (this.f7061l != z) {
            this.f7061l = z;
            M_();
        }
    }

    public final /* synthetic */ CharSequence mo1371a(int i) {
        return ((C1119s) this.f7056g.get(i)).f7065b;
    }
}
