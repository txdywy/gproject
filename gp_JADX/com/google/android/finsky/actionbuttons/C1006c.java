package com.google.android.finsky.actionbuttons;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p011c.p012a.C0054l;
import android.support.v4.app.Fragment;
import android.support.v4.os.C0327a;
import android.support.v4.p013b.p014a.C0259a;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.volley.C0657w;
import com.google.android.finsky.ap.C1249a;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.at.C0998m;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.at.C1517n;
import com.google.android.finsky.av.C1527a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.bd.C1592a;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bg.ai;
import com.google.android.finsky.by.C0999d;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.ct.C2412a;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.cx.C1000f;
import com.google.android.finsky.cx.C2460b;
import com.google.android.finsky.cz.C1001d;
import com.google.android.finsky.cz.C2467a;
import com.google.android.finsky.cz.C2468b;
import com.google.android.finsky.cz.C2469c;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.dn.C1002e;
import com.google.android.finsky.frameworkviews.C3147s;
import com.google.android.finsky.frameworkviews.C3148t;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.installqueue.C3371p;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p110p.C1004h;
import com.google.android.finsky.p110p.C3835a;
import com.google.android.finsky.p110p.C3837c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.packagemanager.C0983h;
import com.google.android.finsky.packagemanager.C3851f;
import com.google.android.finsky.preregistration.C1005p;
import com.google.android.finsky.preregistration.C3934g;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class C1006c implements ag, an, C0998m, C0999d, C1000f, C1001d, C1002e, C1003o, C1004h, C0983h, C1005p {
    public boolean f6128A;
    public boolean f6129B;
    public boolean f6130C;
    public List f6131D;
    public int f6132E;
    public int f6133F = -1;
    public List f6134G = null;
    public Intent f6135H;
    public boolean f6136I;
    public boolean f6137J;
    public boolean f6138K;
    public C3837c f6139L;
    public int f6140M = 1;
    public C3147s f6141N;
    public C1010g f6142O;
    public C3835a f6143P;
    public final Fragment f6144a;
    public final ad f6145b;
    public final C3748a f6146c;
    public final Context f6147d;
    public final String f6148e;
    public final String f6149f;
    public final ad f6150g;
    public final C1013j f6151h;
    public final C1461c f6152i;
    public final C1249a f6153j;
    public final C3300k f6154k;
    public final C3340g f6155l;
    public final C2206c f6156m;
    public final C2233o f6157n;
    public final C3851f f6158o;
    public final C3934g f6159p;
    public final C2460b f6160q;
    public final C2467a f6161r;
    public final ab f6162s;
    public final C1611k f6163t;
    public Document f6164u;
    public C2495w f6165v;
    public Account f6166w;
    public DetailsSummaryDynamic f6167x;
    public DetailsButtonLayout f6168y;
    public boolean f6169z;

    C1006c(Fragment fragment, ad adVar, C3748a c3748a, Context context, String str, ad adVar2, int i, Account account, int i2, List list, boolean z, boolean z2, C1013j c1013j, C1461c c1461c, C1249a c1249a, C1527a c1527a, C3300k c3300k, C3340g c3340g, C2206c c2206c, C2233o c2233o, C3851f c3851f, C2412a c2412a, C3934g c3934g, C2460b c2460b, C2467a c2467a, ab abVar, boolean z3, C1611k c1611k, C3837c c3837c, C3835a c3835a) {
        this.f6146c = c3748a;
        this.f6147d = context;
        this.f6144a = fragment;
        this.f6145b = adVar;
        this.f6148e = str;
        if (account != null) {
            this.f6149f = account.name;
        } else {
            this.f6149f = null;
        }
        this.f6150g = adVar2;
        this.f6132E = i;
        this.f6133F = i2;
        this.f6134G = list;
        this.f6130C = z;
        this.f6129B = z2;
        this.f6151h = c1013j;
        this.f6152i = c1461c;
        this.f6153j = c1249a;
        this.f6154k = c3300k;
        this.f6155l = c3340g;
        this.f6156m = c2206c;
        this.f6157n = c2233o;
        this.f6158o = c3851f;
        this.f6159p = c3934g;
        this.f6160q = c2460b;
        this.f6161r = c2467a;
        this.f6162s = abVar;
        this.f6163t = c1611k;
        this.f6138K = z3;
        C2467a c2467a2 = this.f6161r;
        if (this == null) {
            FinskyLog.m21669e("Trying to register a null Revokelistener.", new Object[0]);
        } else if (c2467a2.f13295b.contains(this)) {
            FinskyLog.m21669e("Trying to register an already registered RevokeListener.", new Object[0]);
        } else {
            c2467a2.f13295b.add(this);
        }
        C1517n.m8868a(this);
        this.f6156m.mo2814a((C0999d) this);
        this.f6159p.m18637a((C1005p) this);
        this.f6158o.mo3818a((C0983h) this);
        this.f6142O = C1010g.SHOW;
        c2412a.m12119a(context, null);
        if (this.f6152i.dj().mo2294a(12633045)) {
            this.f6139L = c3837c;
            this.f6143P = c3835a;
            this.f6139L.m18307c();
        }
    }

    public final void m5955a() {
        C2441n N = this.f6164u.m14625N();
        if (N != null && N.aw_()) {
            this.f6160q.m13164b(this);
            this.f6155l.mo3484b((C1003o) this);
        }
        this.f6161r.f13295b.remove(this);
        C1517n.f8206a.remove(this);
        this.f6156m.mo2819b(this);
        this.f6159p.m18641b((C1005p) this);
        this.f6158o.mo3819b(this);
        if (this.f6152i.dj().mo2294a(12633045) && this.f6139L != null && this.f6164u.f14885a.f12098e == 64 && this.f6137J) {
            this.f6139L.m18306b(this);
            this.f6139L.m18305b();
            this.f6143P.m18296a(this.f6165v, this.f6164u.f14885a.f12087D);
            this.f6139L.m18307c();
            this.f6137J = false;
        }
        m5954i();
        if (this.f6131D != null) {
            for (int i = 0; i < this.f6131D.size(); i++) {
                C0995a c0995a = (C0995a) this.f6131D.get(i);
                if ((c0995a instanceof ae) && m5953h()) {
                    ((ae) c0995a).f6035j = null;
                    return;
                }
            }
        }
    }

    public final void m5959a(Document document, Document document2, C2495w c2495w, DetailsSummaryDynamic detailsSummaryDynamic) {
        m5960a(document, document2, c2495w, detailsSummaryDynamic, null);
    }

    public final void m5960a(Document document, Document document2, C2495w c2495w, DetailsSummaryDynamic detailsSummaryDynamic, Intent intent) {
        this.f6164u = document;
        this.f6165v = c2495w;
        this.f6166w = this.f6153j.m7251b(document, this.f6149f);
        this.f6167x = detailsSummaryDynamic;
        this.f6168y = (DetailsButtonLayout) this.f6167x.findViewById(C7582R.id.button_container);
        this.f6135H = intent;
        C2441n N = this.f6164u.m14625N();
        if (!(this.f6136I || N == null || !N.aw_())) {
            this.f6160q.m13163a(this);
            this.f6155l.mo3481a((C1003o) this);
            this.f6136I = true;
        }
        if (this.f6152i.dj().mo2294a(12633045) && this.f6139L != null && !this.f6137J && this.f6164u.f14885a.f12098e == 64) {
            this.f6139L.m18303a((C1004h) this);
            this.f6137J = true;
        }
        m5966b();
    }

    public final void m5966b() {
        if (!this.f6157n.m11649a(this.f6164u, this.f6162s.dn(), this.f6156m.mo2811a(this.f6166w))) {
            return;
        }
        if (this.f6128A) {
            m5948c((int) C7582R.string.refunding);
            return;
        }
        if (this.f6164u.f14885a.f12099f == 3) {
            String str = this.f6164u.m14625N().f13171k;
            ViewGroup viewGroup = (ViewGroup) this.f6167x.findViewById(C7582R.id.download_progress_panel);
            C3371p c = this.f6155l.mo3485c(str);
            switch (c.f17276a) {
                case 0:
                    viewGroup.setVisibility(4);
                    m5949e();
                    m5950f();
                    break;
                case 3:
                    m5948c((int) C7582R.string.installing);
                    break;
                case 4:
                    m5948c((int) C7582R.string.uninstalling);
                    break;
                default:
                    if (!this.f6151h.m5997a(c)) {
                        TextView textView = (TextView) viewGroup.findViewById(C7582R.id.downloading_bytes);
                        C1527a.m8947a(this.f6147d, c, textView, (TextView) viewGroup.findViewById(C7582R.id.downloading_percentage), (ProgressBar) viewGroup.findViewById(C7582R.id.progress_bar));
                        if (c.f17276a == 1) {
                            textView.setText(this.f6151h.m5991a(this.f6147d));
                        }
                        C1552e dj = this.f6152i.dj();
                        if (dj.mo2294a(12641184)) {
                            C1527a.m8949a(c, viewGroup.findViewById(C7582R.id.download_status), viewGroup.findViewById(C7582R.id.download_now), str, this.f6154k, this.f6165v, this.f6150g);
                        }
                        if (dj.mo2294a(12628775) && this.f6132E == 3) {
                            Drawable e = C0259a.m1526e(C0054l.m66a(this.f6147d.getResources(), C7582R.drawable.ic_play_protect_check_black_24dp, null));
                            C0259a.m1514a(e.mutate(), C1608h.m9243a(this.f6147d, 3));
                            ((ImageView) viewGroup.findViewById(C7582R.id.security_info_icon)).setImageDrawable(e);
                            viewGroup.findViewById(C7582R.id.install_verified_by_play_protect).setVisibility(0);
                        }
                        ((ImageView) viewGroup.findViewById(C7582R.id.cancel_download)).setOnClickListener(new C1009f(this, str, viewGroup));
                        viewGroup.setVisibility(0);
                        this.f6168y.setVisibility(8);
                        m5954i();
                        break;
                    }
                    m5949e();
                    viewGroup.setVisibility(4);
                    m5950f();
                    break;
            }
        }
        m5949e();
        m5952g();
        DetailsSummaryDynamic detailsSummaryDynamic = this.f6167x;
        if (detailsSummaryDynamic.f6006b != null) {
            detailsSummaryDynamic.f6006b.m5891a();
        }
    }

    private final void m5949e() {
        List a;
        m5954i();
        Document document = this.f6164u;
        DetailsButtonLayout detailsButtonLayout = this.f6168y;
        if (document.f14885a.f12099f == 2) {
            detailsButtonLayout.setForceMultiLineLayout(this.f6151h.m5995a());
        } else {
            detailsButtonLayout.setForceMultiLineLayout(false);
        }
        if (this.f6132E == 3) {
            detailsButtonLayout.setForceWideLayout(this.f6163t.m9286k(this.f6147d.getResources()));
        }
        detailsButtonLayout.setUseMultiLineLayoutForSingleChild(this.f6129B);
        C1013j c1013j = this.f6151h;
        Document document2 = this.f6164u;
        int i = this.f6132E;
        String str = this.f6149f;
        Intent intent = this.f6135H;
        Account b = c1013j.f6206j.m7251b(document2, str);
        switch (document2.f14885a.f12099f) {
            case 1:
                a = c1013j.m5992a(b, document2, i);
                break;
            case 2:
                Collection collection;
                if (c1013j.m5995a()) {
                    collection = C1013j.f6200d;
                } else {
                    collection = C1013j.f6199c;
                }
                a = new ArrayList(collection);
                c1013j.m5994a(a, document2, b, null);
                break;
            case 3:
                List list;
                if (c1013j.f6210n.mo3485c(document2.m14625N().f13171k).f17279d == 196) {
                    List arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(4));
                    arrayList.add(Integer.valueOf(3));
                    list = arrayList;
                } else {
                    Object arrayList2 = new ArrayList(C1013j.f6198b);
                }
                if (i == 4) {
                    list.add(Integer.valueOf(2));
                }
                if (C1503a.m8831b(c1013j.f6205i)) {
                    list.add(Integer.valueOf(24));
                }
                c1013j.m5994a(list, document2, b, intent);
                List arrayList3 = new ArrayList();
                for (i = 0; i < list.size(); i++) {
                    int intValue = ((Integer) list.get(i)).intValue();
                    if (C1013j.f6201e.containsKey(Integer.valueOf(intValue)) && ((Integer) C1013j.f6201e.get(Integer.valueOf(intValue))).intValue() >= arrayList3.size()) {
                        arrayList3.add(Integer.valueOf(intValue));
                    } else if (!C1013j.f6201e.containsKey(Integer.valueOf(intValue))) {
                        arrayList3.add(Integer.valueOf(intValue));
                    }
                }
                a = arrayList3;
                break;
            case 4:
                a = c1013j.m5992a(b, document2, i);
                break;
            case 6:
                a = c1013j.m5992a(b, document2, i);
                a.remove(Integer.valueOf(4));
                break;
            default:
                a = new ArrayList(C1013j.f6197a);
                c1013j.m5994a(a, document2, b, null);
                break;
        }
        if (this.f6134G != null && this.f6134G.size() > 0) {
            for (int i2 = 0; i2 < this.f6134G.size(); i2++) {
                a.remove(this.f6134G.get(i2));
            }
        }
        this.f6131D = this.f6151h.m5993a(a, this.f6165v, this.f6144a, this.f6145b, this.f6164u, this.f6150g, this.f6148e, this.f6147d, this.f6146c, this.f6132E, this.f6149f, this.f6133F, this.f6130C, this.f6138K, this.f6135H, this, this.f6140M);
        for (int i3 = 0; i3 < this.f6131D.size(); i3++) {
            C0995a c0995a = (C0995a) this.f6131D.get(i3);
            if (c0995a instanceof C1024t) {
                ((C1024t) c0995a).f6279l = this.f6169z;
            } else if ((c0995a instanceof ae) && m5953h()) {
                ((ae) c0995a).f6035j = this;
            }
        }
        this.f6168y.m5887a(a, this.f6131D);
    }

    private final void m5950f() {
        m5952g();
        if (this.f6168y.getVisibility() == 0) {
            ((TextView) this.f6167x.findViewById(C7582R.id.summary_dynamic_status)).setVisibility(4);
        }
    }

    private final void m5952g() {
        ai.m9228a(this.f6168y, 4);
    }

    private final void m5948c(int i) {
        TextView textView = (TextView) this.f6167x.findViewById(C7582R.id.summary_dynamic_status);
        this.f6168y.setVisibility(8);
        m5954i();
        textView.setVisibility(0);
        textView.setText(this.f6147d.getResources().getString(i));
        if (this.f6164u.f14885a.f12099f == 3) {
            this.f6167x.findViewById(C7582R.id.download_progress_panel).setVisibility(4);
        }
    }

    public final void mo1206a(String str) {
        if (str.equals(this.f6164u.f14885a.f12096c)) {
            this.f6169z = true;
            m5966b();
        }
    }

    public final void mo1207a(String str, int i) {
        if (str.equals(this.f6164u.f14885a.f12096c) && i == 1) {
            this.f6169z = false;
            m5966b();
        }
    }

    public final void mo1205a(C3369m c3369m) {
        boolean a = this.f6152i.dj().mo2294a(12625960);
        if (c3369m.m16819a().equals(this.f6164u.m14625N().f13171k) || a) {
            if (c3369m.f17273c.f17153d == 2) {
                ((ViewGroup) this.f6167x.findViewById(C7582R.id.download_progress_panel)).setVisibility(0);
                this.f6168y.setVisibility(8);
                m5954i();
            }
            m5966b();
        }
    }

    public final void mo1212b(String str) {
        if (str.equals(this.f6164u.m14625N().f13171k)) {
            this.f6128A = true;
            m5966b();
        }
    }

    public final void mo1208a(String str, boolean z) {
        if (str.equals(this.f6164u.m14625N().f13171k)) {
            this.f6128A = false;
            m5966b();
        }
    }

    public final void mo1213c(String str) {
        if (this.f6164u != null && this.f6164u.ae() && this.f6164u.f14885a.f12096c.equals(str)) {
            m5966b();
        }
    }

    public final void mo1202a(int i, Bundle bundle) {
        if (this.f6131D != null) {
            for (int i2 = 0; i2 < this.f6131D.size(); i2++) {
                C0995a c0995a = (C0995a) this.f6131D.get(i2);
                if (i == 7 && (c0995a instanceof C1024t)) {
                    C1024t c1024t = (C1024t) c0995a;
                    if (c1024t.f6273f.f14885a.f12096c.equals(((Document) bundle.getParcelable("doc")).f14885a.f12096c) && i == 7) {
                        C1254c a = c1024t.f6276i.mo2016a(bundle.getString("ownerAccountName"));
                        C0657w c1025u = new C1025u(c1024t);
                        C2467a c2467a = c1024t.f6278k;
                        String str = c1024t.f6273f.f14885a.f12096c;
                        ax d = c1024t.f6273f.m14646d();
                        Runnable c1026v = new C1026v(c1024t);
                        for (int i3 = 0; i3 < c2467a.f13295b.size(); i3++) {
                            ((C1001d) c2467a.f13295b.get(i3)).mo1206a(str);
                        }
                        a.mo1585a(str, d, new C2468b(c2467a, a, c1026v, str), new C2469c(c2467a, c1025u, str));
                    }
                } else if (i == 1 && (c0995a instanceof as)) {
                    as asVar = (as) c0995a;
                    if (asVar.f6092h.equals(bundle.getString("package_name")) && i == 1) {
                        asVar.f6095k.mo3445b(bundle.getString("package_name"), false);
                    }
                } else if (i == 4 && (c0995a instanceof am)) {
                    am amVar = (am) c0995a;
                    if (amVar.f6064g.equals(bundle.getString("package_name")) && i == 4) {
                        amVar.f6067j.m13162a(amVar.f6066i, bundle.getString("package_name"), bundle.getString("account_name"), bundle.getBoolean("try_uninstall"));
                    }
                }
            }
        }
    }

    public final void f_(int i) {
    }

    public final void mo1211b(int i, Bundle bundle) {
    }

    public final void mo1175b(String str, boolean z) {
        m5951f(str);
        if (this.f6152i.dj().mo2294a(12636357) && this.f6135H != null && "com.google.android.instantapps.supervisor".equals(str) && !C0327a.m1722b()) {
            m5966b();
        }
    }

    public final void mo1177d(String str) {
        m5951f(str);
    }

    public final void mo1174a(String[] strArr) {
    }

    public final void mo1176c(String str, boolean z) {
        if (this.f6152i.dj().mo2294a(12636357) && this.f6135H != null && "com.google.android.instantapps.supervisor".equals(str) && !C0327a.m1722b()) {
            m5966b();
        }
    }

    public final void mo1178e(String str) {
    }

    private final void m5951f(String str) {
        if (this.f6164u != null && this.f6164u.m14625N() != null && this.f6164u.m14625N().f13171k.equals(str)) {
            m5966b();
        }
    }

    public final void ab_() {
    }

    public final void mo1204a(C2197a c2197a) {
        m5966b();
    }

    public final void mo1215d(String str, boolean z) {
        if (this.f6164u.f14885a.f12096c.equals(str)) {
            m5966b();
        }
    }

    public final void mo1214d() {
        if (this.f6152i.dj().mo2294a(12633045) && this.f6139L != null && this.f6164u.f14885a.f12098e == 64 && this.f6164u.bO()) {
            this.f6139L.m18304a(this.f6164u.bP());
        }
    }

    public final void mo1210b(int i) {
        this.f6140M = i;
        if (i == 9) {
            C1508k c1508k = new C1508k();
            c1508k.m8848a(C1592a.al.intValue()).m8860d((int) C7582R.string.ok);
            c1508k.mo2272a().m625a(this.f6144a.f730B, "sample_error_dialog");
        } else {
            m5966b();
        }
        if (this.f6143P != null) {
            this.f6143P.m18296a(this.f6165v, this.f6164u.f14885a.f12087D);
        }
    }

    private final boolean m5953h() {
        C1552e dj = this.f6152i.dj();
        return dj.mo2294a(12636357) && (dj.mo2294a(12637095) || dj.mo2294a(12637096) || dj.mo2294a(12637097) || dj.mo2294a(12637098) || dj.mo2294a(12637099) || dj.mo2294a(12637100));
    }

    public final void mo1203a(Rect rect, PlayActionButtonV2 playActionButtonV2, String str) {
        if (this.f6142O != C1010g.HIDE) {
            if (this.f6141N == null) {
                this.f6141N = ae.m5901a(playActionButtonV2, str);
                this.f6141N.m16052a(new C1007d(this));
            }
            if (this.f6142O == C1010g.SHOW_WITHOUT_ANIMATION) {
                this.f6141N.m16050a();
                this.f6141N.m16051a(rect);
                return;
            }
            playActionButtonV2.postDelayed(new C1008e(this, rect), (long) playActionButtonV2.getContext().getResources().getInteger(C7582R.integer.instant_apps_launch_button_tooltip_render_delay_ms));
        }
    }

    private final void m5954i() {
        if (this.f6141N != null) {
            C3148t c3148t = this.f6141N.f16281d;
            if (c3148t.f16304r != null) {
                c3148t.f16304r.dismiss();
            }
        }
    }
}
