package com.google.android.finsky.family.library;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.caverock.androidsvg.C0722q;
import com.caverock.androidsvg.as;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.bb.C1557b;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.by.C0999d;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.by.C2227g;
import com.google.android.finsky.by.C2229h;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.family.p199a.C3032b;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.navigationmanager.C3760e;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.stream.base.C1169s;
import com.google.android.finsky.stream.controllers.headerspacer.C4413a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.layout.d;
import com.google.android.play.utils.a.a;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.h.a.k;
import com.google.wireless.android.finsky.dfe.h.a.l;
import com.google.wireless.android.finsky.dfe.h.a.m;
import com.google.wireless.android.finsky.dfe.h.a.n;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class C3060k extends C3032b implements OnClickListener, C0660x, C0999d, ad {
    public static final int[] f15940o = new int[]{6};
    public static final int[] f15941p = new int[]{18, 19, 20};
    public static final int[] f15942q;
    public final C3053d f15943A;
    public final C3050a f15944B;
    public final C3058i f15945C;
    public final C3058i f15946D;
    public final C1557b f15947r = C1473m.f7980a.aY();
    public final int f15948s;
    public final String f15949t;
    public String f15950u;
    public List f15951v;
    public n f15952w;
    public ArrayList f15953x;
    public int f15954y;
    public ce f15955z;

    public C3060k(int i, String str, C1045b c1045b, C3748a c3748a, C2495w c2495w, C1254c c1254c, ad adVar, int i2, String str2) {
        String str3;
        int i3;
        super(i, str, c3748a, c1045b, c2495w, c1254c, adVar);
        this.f15948s = i2;
        switch (this.f15948s) {
            case 1:
                str3 = C2229h.f11121b;
                break;
            case 3:
                str3 = C2229h.f11120a;
                break;
            case 4:
                str3 = C2229h.f11122c;
                break;
            default:
                FinskyLog.m21669e("Unsupported corpus: " + this.f15948s, new Object[0]);
                str3 = "";
                break;
        }
        this.f15949t = str3;
        C1473m.f7980a.ah().mo2814a((C0999d) this);
        this.f15943A = new C3053d(this, this.f15948s);
        switch (this.f15948s) {
            case 1:
                i3 = 5262;
                break;
            case 3:
                i3 = 5260;
                break;
            case 4:
                i3 = 5261;
                break;
            default:
                i3 = 0;
                break;
        }
        this.f15955z = C2482j.m13283a(i3);
        if (this.f15948s == 3 && this.f15947r.mo2310a(C0954a.aD) && str2 != null) {
            this.f15944B = new C3050a(new C3061l(this));
        } else {
            this.f15944B = null;
        }
        this.f15950u = str2;
        this.f15946D = new C3058i(c1045b.m605i(), C7582R.string.family_library_filter_option_inbound_documents, this, this.c, this, 1);
        this.f15945C = new C3058i(c1045b.m605i(), C7582R.string.family_library_filter_option_outbound_documents, this, this.c, this, 2);
    }

    public final boolean mo3289e() {
        return this.f15952w != null;
    }

    public final void mo3290f() {
        this.f15951v = m15736b(C1473m.f7980a.ah().mo2811a(this.d.mo1620b()));
        int size = this.f15951v.size();
        l lVar = new l();
        lVar.b = new m[size];
        for (int i = 0; i < size; i++) {
            C2227g c2227g = (C2227g) this.f15951v.get(i);
            ax axVar = new ax();
            axVar.f11835d = this.f15948s;
            axVar.f11833b = c2227g.f11104k;
            axVar.f11834c = c2227g.f11105l;
            m mVar = new m();
            mVar.c = axVar;
            if (c2227g.f11110q) {
                mVar.a(2);
            } else {
                mVar.a(1);
            }
            lVar.b[i] = mVar;
        }
        lVar.c = this.f15948s;
        lVar.a |= 1;
        this.d.mo1587a(this.f15950u, lVar, (C0660x) this, (C0657w) this);
    }

    protected final List mo3291g() {
        if (this.f15944B != null) {
            return new ArrayList(Arrays.asList(new C1169s[]{new C4413a(null, 0, this.a.m603h()), this.f15943A, this.f15944B, this.f15946D, this.f15945C}));
        }
        return new ArrayList(Arrays.asList(new C1169s[]{new C4413a(null, 0, this.a.m603h()), this.f15943A, this.f15946D, this.f15945C}));
    }

    protected final boolean mo3292h() {
        return m15738l().length != 0;
    }

    public final void m_() {
        if (this.k != null && this.a.m610k()) {
            boolean j;
            this.f15953x = new ArrayList();
            switch (this.f15948s) {
                case 1:
                    m15733a((int) C7582R.string.family_library_filter_option_all_books, 3, new int[0]);
                    m15733a((int) C7582R.string.family_library_filter_option_inbound_documents, 1, new int[0]);
                    m15733a((int) C7582R.string.family_library_filter_option_outbound_documents, 2, new int[0]);
                    break;
                case 3:
                    m15733a((int) C7582R.string.family_library_filter_option_all_apps_and_games, 3, new int[0]);
                    m15733a((int) C7582R.string.family_library_filter_option_inbound_documents, 1, new int[0]);
                    m15733a((int) C7582R.string.family_library_filter_option_outbound_documents, 2, new int[0]);
                    break;
                case 4:
                    j = m15737j();
                    if (j) {
                        m15733a((int) C7582R.string.family_library_filter_option_all_movies_and_tv, 3, f15942q);
                    } else {
                        m15733a((int) C7582R.string.family_library_filter_option_all_movies, 3, f15940o);
                    }
                    m15733a((int) C7582R.string.family_library_filter_option_inbound_movies, 1, f15940o);
                    if (j) {
                        m15733a((int) C7582R.string.family_library_filter_option_inbound_tv, 1, f15941p);
                    }
                    m15733a((int) C7582R.string.family_library_filter_option_outbound_movies, 2, f15940o);
                    if (j) {
                        m15733a((int) C7582R.string.family_library_filter_option_outbound_tv, 2, f15941p);
                        break;
                    }
                    break;
                default:
                    FinskyLog.m21669e("Unsupported corpus:" + this.f15948s, new Object[0]);
                    break;
            }
            if (this.f15954y >= this.f15953x.size() || !((FamilyLibraryFilterOption) this.f15953x.get(this.f15954y)).f15921d) {
                this.f15954y = 0;
            }
            String str = ((FamilyLibraryFilterOption) this.f15953x.get(this.f15954y)).f15918a;
            m15734a(this.f15946D);
            m15734a(this.f15945C);
            C1169s c1169s = this.f15943A;
            j = this.f15954y != 0;
            c1169s.f15930d = str;
            c1169s.f15929c = j;
            c1169s.C.mo4087a(c1169s, 0, 1, false);
            m15648b();
        }
    }

    private final void m15734a(C3058i c3058i) {
        int i = c3058i.f15934f;
        List arrayList = new ArrayList();
        FamilyLibraryFilterOption familyLibraryFilterOption = (FamilyLibraryFilterOption) this.f15953x.get(this.f15954y);
        for (k kVar : m15738l()) {
            if (familyLibraryFilterOption.m15707a(kVar) && (kVar.d == i || kVar.d == 3)) {
                arrayList.add(new Document(kVar.c));
            }
        }
        int i2 = ((FamilyLibraryFilterOption) this.f15953x.get(this.f15954y)).f15920c;
        if (i2 == i || i2 == 3) {
            c3058i.m15727a(arrayList);
        } else {
            c3058i.m15727a(Collections.emptyList());
        }
    }

    public final void onClick(View view) {
        Document document = (Document) view.getTag();
        if (document == null) {
            FinskyLog.m21669e("No document attached to row view", new Object[0]);
            return;
        }
        View findViewById;
        this.c.m13379b(new C2475d((ad) ((d) view).getLoggingData()));
        if (C3760e.m17903a()) {
            findViewById = view.findViewById(C7582R.id.li_thumbnail);
        } else {
            findViewById = null;
        }
        this.b.mo3654a(document, null, findViewById, this.c);
    }

    protected final void mo3293i() {
        if (mo3289e()) {
            this.c.m13370a(new C2488p().m13345b(this));
        }
    }

    protected final void mo3288d() {
        C1473m.f7980a.ah().mo2819b(this);
    }

    protected final void mo3287a(ImageView imageView, TextView textView, PlayActionButtonV2 playActionButtonV2) {
        String string;
        imageView.setVisibility(0);
        imageView.setImageDrawable(C0722q.m4782a(this.a.m601g().getResources(), (int) C7582R.raw.ic_family_empty_state_96dp, new as()));
        textView.setText(C7582R.string.family_library_empty_page_text);
        playActionButtonV2.setVisibility(0);
        switch (this.f15948s) {
            case 1:
            case 4:
                string = this.a.m601g().getResources().getString(C7582R.string.family_library_empty_page_navigation_button);
                break;
            default:
                string = C1608h.m9247a(3, C1473m.f7980a.dn().m14609b());
                break;
        }
        playActionButtonV2.mo2588a(this.f15948s, string, new C3062m(this));
    }

    public final void ab_() {
    }

    public final void mo1204a(C2197a c2197a) {
        if (c2197a.mo2780a().equals(this.d.mo1620b())) {
            Set<C2227g> hashSet = new HashSet();
            if (this.f15951v != null) {
                List<C2227g> b = m15736b(c2197a);
                for (C2227g c2227g : b) {
                    if (!this.f15951v.contains(c2227g)) {
                        hashSet.add(c2227g);
                    }
                }
                for (C2227g c2227g2 : this.f15951v) {
                    if (!b.contains(c2227g2)) {
                        hashSet.add(c2227g2);
                    }
                }
            }
            for (C2227g c2227g22 : hashSet) {
                if (c2227g22.f11103j == this.f15948s) {
                    mo3290f();
                    return;
                }
            }
        }
    }

    private final List m15736b(C2197a c2197a) {
        List arrayList = new ArrayList();
        for (C2227g c2227g : c2197a.mo2793g(this.f15949t)) {
            if (c2227g.f11110q || !TextUtils.isEmpty(c2227g.f11111r)) {
                arrayList.add(c2227g);
            }
        }
        return arrayList;
    }

    private final boolean m15737j() {
        for (k kVar : m15738l()) {
            if (a.a(f15941p, kVar.c.f12098e) >= 0) {
                return true;
            }
        }
        return false;
    }

    private final void m15733a(int i, int i2, int... iArr) {
        this.f15953x.add(new FamilyLibraryFilterOption(this.a.m592c(i), iArr, i2, m15735a(i2, iArr)));
    }

    private final boolean m15735a(int i, int... iArr) {
        for (k kVar : m15738l()) {
            boolean z = kVar.d == i || kVar.d == 3 || i == 3;
            if (z && ((this.f15948s == 4 && a.a(iArr, kVar.c.f12098e) >= 0) || this.f15948s != 4)) {
                return true;
            }
        }
        return false;
    }

    private final k[] m15738l() {
        if (this.f15952w == null || this.f15952w.b == null) {
            return new k[0];
        }
        return this.f15952w.b;
    }

    public final ce getPlayStoreUiElement() {
        return this.f15955z;
    }

    public final ad getParentNode() {
        return this.e;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public final /* synthetic */ void b_(Object obj) {
        n nVar = (n) obj;
        this.f15955z.a(nVar.c);
        if (this.f15952w == null && this.f) {
            mo3293i();
        }
        this.f15952w = nVar;
        m_();
    }

    static {
        Object obj = f15940o;
        Object obj2 = f15941p;
        Object obj3 = new int[(obj.length + obj2.length)];
        System.arraycopy(obj, 0, obj3, 0, obj.length);
        System.arraycopy(obj2, 0, obj3, obj.length, obj2.length);
        f15942q = obj3;
    }
}
