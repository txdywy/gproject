package com.google.android.finsky.detailspage.episodelist;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.volley.C0657w;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.bb.C1557b;
import com.google.android.finsky.bb.C1565a;
import com.google.android.finsky.bb.C1566d;
import com.google.android.finsky.billing.common.C1804v;
import com.google.android.finsky.by.C0999d;
import com.google.android.finsky.by.C2196e;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.cv.p177a.jk;
import com.google.android.finsky.cv.p177a.lx;
import com.google.android.finsky.detailsmodules.p183a.C2600d;
import com.google.android.finsky.detailspage.ch;
import com.google.android.finsky.detailspage.ck;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.C2721l;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.layout.EpisodeSnippet;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.C4678i;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.h.a.f;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C2644a extends ck implements C1566d, C0999d, ad, ch, C2643h {
    public final C1557b f14509d = C1473m.f7980a.aY();
    public final boolean f14510e = C1473m.f7980a.dj().mo2294a(12624692);
    public boolean f14511f;
    public C2720j f14512g;
    public boolean f14513h;
    public boolean f14514i;
    public boolean f14515j;
    public String f14516k;
    public ce f14517l;
    public final C1031w f14518m;
    public final C0657w f14519n;
    public final OnClickListener f14520o;
    public final OnClickListener f14521p;

    public C2644a() {
        C1473m.f7980a.aO();
        this.f14517l = C2482j.m13283a(211);
        this.f14518m = new C2645b(this);
        this.f14519n = new C2646c(this);
        this.f14520o = new C2647d(this);
        this.f14521p = new C2648e(this);
    }

    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.episode_list_module_v2;
    }

    public final boolean mo2979f() {
        if (this.f14511f) {
            return true;
        }
        return (this.b == null || ((C2649f) this.b).f14526a == null) ? false : true;
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        if (this.f14510e) {
            boolean z2 = document.f14885a.f12098e == 18 && !TextUtils.isEmpty(document.m14654i());
            if (z2 && this.b == null) {
                this.b = new C2649f();
                this.f14511f = false;
                jk aR = document.aR();
                if (!(aR == null || aR.f12791c == null)) {
                    this.f14516k = aR.f12791c.f12790b;
                }
                ((C2649f) this.b).f14531f = new HashMap();
                ((C2649f) this.b).f14532g = true;
                this.D.mo2814a((C0999d) this);
                this.f14509d.mo2309a((C1566d) this);
            }
        }
    }

    public final void mo2976b(View view, int i) {
        EpisodeListModuleV2Layout episodeListModuleV2Layout = (EpisodeListModuleV2Layout) view;
        int i2;
        EpisodeSnippet episodeSnippet;
        if (this.f14511f) {
            if (episodeListModuleV2Layout.f14503e.getChildCount() == 0) {
                LayoutInflater from = LayoutInflater.from(episodeListModuleV2Layout.getContext());
                i2 = 0;
                while (i2 < 5) {
                    episodeSnippet = (EpisodeSnippet) from.inflate(C7582R.layout.episode_snippet, episodeListModuleV2Layout.f14503e, false);
                    episodeSnippet.m17300a(i2 == 0);
                    episodeListModuleV2Layout.f14503e.addView(episodeSnippet, i2);
                    i2++;
                }
            }
        } else if (!episodeListModuleV2Layout.f14499a || this.f14513h) {
            List k;
            Object obj;
            int i3;
            boolean z = !TextUtils.isEmpty(((C2649f) this.b).f14530e);
            Set set = (Set) ((C2649f) this.b).f14531f.get(((C2649f) this.b).f14528c.f14885a.f12096c);
            C3748a c3748a = this.z;
            Document document = ((C2649f) this.b).f14528c;
            if (((C2649f) this.b).f14532g) {
                k = m14283k();
            } else {
                k = ((C2649f) this.b).f14526a;
            }
            Document document2 = ((C2649f) this.b).f14529d;
            List list = ((C2649f) this.b).f14527b;
            C2206c c2206c = this.D;
            boolean z2 = this.f14514i;
            C2495w c2495w = this.J;
            OnClickListener onClickListener = this.f14520o;
            if (m14283k().size() == ((C2649f) this.b).f14526a.size()) {
                obj = null;
            } else {
                Resources resources = this.t.getResources();
                if (((C2649f) this.b).f14532g) {
                    i3 = C7582R.string.see_all_episodes;
                } else {
                    i3 = C7582R.string.see_available_episodes;
                }
                obj = resources.getString(i3);
            }
            OnClickListener onClickListener2 = this.f14521p;
            boolean z3 = this.f14515j;
            episodeListModuleV2Layout.f14499a = true;
            episodeListModuleV2Layout.f14500b = this;
            episodeListModuleV2Layout.f14502d = c3748a;
            episodeListModuleV2Layout.f14508j = this;
            episodeListModuleV2Layout.f14501c = c2495w;
            episodeListModuleV2Layout.f14507i.setVisibility(8);
            episodeListModuleV2Layout.f14503e.setVisibility(z3 ? 8 : 0);
            episodeListModuleV2Layout.f14504f.setVisibility(z3 ? 0 : 8);
            if (onClickListener != null) {
                episodeListModuleV2Layout.f14505g.setOnClickListener(onClickListener);
            }
            if (!z3) {
                if (!TextUtils.isEmpty(obj)) {
                    episodeListModuleV2Layout.f14507i.setText(obj.toUpperCase());
                    episodeListModuleV2Layout.f14507i.setOnClickListener(onClickListener2);
                    episodeListModuleV2Layout.f14507i.setVisibility(0);
                }
                if (!z2) {
                    View view2 = null;
                    int size = k.size();
                    int childCount = episodeListModuleV2Layout.f14503e.getChildCount();
                    for (i2 = 0; i2 < k.size(); i2++) {
                        if (((Document) k.get(i2)).m14615D().length != 0) {
                            z2 = true;
                            break;
                        }
                    }
                    z2 = false;
                    LayoutInflater layoutInflater = null;
                    int i4 = 0;
                    while (i4 < size) {
                        View view3;
                        LayoutInflater layoutInflater2;
                        Object obj2;
                        View view4;
                        Document document3 = (Document) k.get(i4);
                        if (i4 < childCount) {
                            view3 = (EpisodeSnippet) episodeListModuleV2Layout.f14503e.getChildAt(i4);
                            view3.m17301b();
                            layoutInflater2 = layoutInflater;
                            obj2 = null;
                        } else {
                            if (layoutInflater == null) {
                                layoutInflater = LayoutInflater.from(episodeListModuleV2Layout.getContext());
                            }
                            episodeSnippet = (EpisodeSnippet) layoutInflater.inflate(C7582R.layout.episode_snippet, episodeListModuleV2Layout.f14503e, false);
                            layoutInflater2 = layoutInflater;
                            int i5 = 1;
                        }
                        if (document3 == document2) {
                            view4 = view3;
                        } else {
                            view4 = view2;
                        }
                        boolean a = C1473m.f7980a.mo2045Y().m11647a(document3, (C2196e) c2206c);
                        Object obj3 = (set == null || !set.contains(document3.f14885a.f12096c)) ? null : 1;
                        boolean z4 = a && obj3 == null;
                        view3.m17299a(document, document3, z, z2, (C1565a) list.get(i4), episodeListModuleV2Layout.f14502d, z4, episodeListModuleV2Layout, this, episodeListModuleV2Layout.f14500b, episodeListModuleV2Layout.f14501c);
                        if (obj2 != null) {
                            episodeListModuleV2Layout.f14503e.addView(view3, i4);
                        } else {
                            view3.m17296a();
                        }
                        view3.setVisibility(0);
                        i4++;
                        layoutInflater = layoutInflater2;
                        view2 = view4;
                    }
                    for (i3 = size; i3 < childCount; i3++) {
                        episodeListModuleV2Layout.f14503e.getChildAt(i3).setVisibility(8);
                    }
                    if (!(view2 == null || view2.m17302c())) {
                        view2.m17297a(0);
                    }
                    episodeListModuleV2Layout.f14503e.refreshDrawableState();
                    if (episodeListModuleV2Layout.f14506h != null) {
                        episodeListModuleV2Layout.f14506h.setVisibility(4);
                        episodeListModuleV2Layout.f14506h.setOnClickListener(null);
                    }
                } else if (episodeListModuleV2Layout.f14506h != null) {
                    episodeListModuleV2Layout.f14506h.setVisibility(0);
                    episodeListModuleV2Layout.f14506h.setOnClickListener(new C2650g());
                }
            }
            this.f14513h = false;
        }
    }

    public final void mo2980h() {
        this.D.mo2819b(this);
        this.f14509d.mo2312b((C1566d) this);
        if (this.f14512g != null) {
            this.f14512g.m11922b(this.f14518m);
            this.f14512g.m11921b(this.f14519n);
        }
    }

    public final void mo3034a(String str, Object obj) {
        if (this.b != null) {
            if ("SeasonListModule.SeasonDocument".equals(str)) {
                Document document = (Document) obj;
                if (((C2649f) this.b).f14528c != document) {
                    ((C2649f) this.b).f14528c = document;
                    ((C2649f) this.b).f14529d = null;
                    m14304j();
                    if (!(this.f14517l.d.length == 0 || Arrays.equals(this.f14517l.d, ((C2649f) this.b).f14528c.f14885a.f12087D))) {
                        this.f14517l.f = ce.a;
                        this.f14517l.d();
                    }
                    C2482j.m13285a(this.f14517l, ((C2649f) this.b).f14528c.f14885a.f12087D);
                }
            } else if ("SeasonListModule.WatchActionApp".equals(str)) {
                ((C2649f) this.b).f14530e = (String) obj;
                ((C2649f) this.b).f14529d = null;
                m14292a(false);
            }
        }
    }

    public final void mo3089a(Document document) {
        ((C2649f) this.b).f14529d = document;
    }

    public final void ab_() {
    }

    public final void mo1204a(C2197a c2197a) {
        m14296b();
        m14284a();
        if (mo2979f() && !this.f14511f) {
            m14292a(false);
        }
    }

    public ce getPlayStoreUiElement() {
        return this.f14517l;
    }

    public ad getParentNode() {
        return this.I;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public final void mo3056a(C1565a c1565a, boolean z) {
        this.f14509d.mo2308a(this.A, c1565a, z);
    }

    public final void mo3055a(C1565a c1565a) {
        this.f14509d.mo2311b(C0954a.aC);
        if (c1565a != null) {
            c1565a.f8375f = false;
        }
    }

    public final void mo3061d() {
        this.z.mo3629a(4, this.J);
    }

    public final void mo3062i() {
        this.f14509d.mo2313c().mo2334o();
    }

    public final boolean mo3059a(String str, String str2, f fVar) {
        if (!m14282b(str, str2)) {
            return false;
        }
        if (fVar.d()) {
            m14284a();
            m14292a(false);
        }
        return true;
    }

    public final boolean mo3058a(String str, String str2) {
        if (!m14282b(str, str2)) {
            return false;
        }
        m14292a(false);
        return true;
    }

    final void m14284a() {
        if (((C2649f) this.b).f14526a != null) {
            List arrayList = new ArrayList(((C2649f) this.b).f14526a.size());
            for (int i = 0; i < ((C2649f) this.b).f14526a.size(); i++) {
                arrayList.add(this.f14509d.mo2305a(this.t, (Document) ((C2649f) this.b).f14526a.get(i)));
            }
            ((C2649f) this.b).f14527b = arrayList;
        }
    }

    private final boolean m14282b(String str, String str2) {
        if (C1473m.f7980a.cZ().equals(str)) {
            for (Document document : ((C2649f) this.b).f14526a) {
                if (document.f14885a.f12096c.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final List m14283k() {
        if (TextUtils.isEmpty(((C2649f) this.b).f14530e)) {
            return ((C2649f) this.b).f14526a;
        }
        List arrayList = new ArrayList();
        long a = C4678i.m21812a() / 1000;
        for (Document document : ((C2649f) this.b).f14526a) {
            if (document.aa() != null) {
                for (lx lxVar : document.aa()) {
                    if ((!lxVar.bT_() || lxVar.f13077f >= a) && lxVar.f13074c.equals(((C2649f) this.b).f14530e)) {
                        arrayList.add(document);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    final void m14296b() {
        if (((C2649f) this.b).f14528c != null) {
            String str = ((C2649f) this.b).f14528c.f14885a.f12096c;
            if ((!((C2649f) this.b).f14531f.containsKey(str) ? 1 : null) != null && ((C2649f) this.b).f14526a != null) {
                Set hashSet = new HashSet();
                for (Document document : ((C2649f) this.b).f14526a) {
                    if (C1473m.f7980a.mo2045Y().m11647a(document, this.D)) {
                        hashSet.add(document.f14885a.f12096c);
                    }
                }
                ((C2649f) this.b).f14531f.put(str, hashSet);
            }
        }
    }

    final void m14304j() {
        if (this.f14512g != null) {
            this.f14512g.m11922b(this.f14518m);
            this.f14512g.m11921b(this.f14519n);
        }
        if (C1473m.f7980a.dj().mo2294a(12626439)) {
            C1473m.f7980a.ab();
            this.f14512g = C2721l.m14732a(this.w, ((C2649f) this.b).f14528c.m14654i(), C1804v.m9805b(C1473m.f7980a.ah().mo2811a(this.w.mo1620b())));
        } else {
            this.f14512g = C2721l.m14733a(this.w, ((C2649f) this.b).f14528c.m14654i(), false, true);
        }
        this.f14512g.m11918a(this.f14518m);
        this.f14512g.m11917a(this.f14519n);
        this.f14512g.m14699n();
        this.f14514i = true;
        m14292a(false);
    }

    final void m14292a(boolean z) {
        if (mo2979f()) {
            this.f14513h = true;
            this.u.mo3033a(this, z);
        }
    }

    public final /* synthetic */ void mo2973a(C2600d c2600d) {
        super.mo2973a((C2649f) c2600d);
        if (this.b != null) {
            this.D.mo2814a((C0999d) this);
            this.f14509d.mo2309a((C1566d) this);
            if (((C2649f) this.b).f14528c != null && ((C2649f) this.b).f14526a == null) {
                m14304j();
            }
        }
    }
}
