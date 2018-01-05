package com.google.android.finsky.family.remoteescalation;

import android.os.Handler;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.cv.p177a.ik;
import com.google.android.finsky.family.p199a.C3032b;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.frameworkviews.ah;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.stream.base.C1169s;
import com.google.android.finsky.stream.base.C4279n;
import com.google.android.finsky.stream.controllers.headerspacer.C4413a;
import com.google.wireless.android.finsky.dfe.h.a.ab;
import com.google.wireless.android.finsky.dfe.h.a.ac;
import com.google.wireless.android.finsky.dfe.nano.dx;
import com.google.wireless.android.finsky.dfe.nano.gy;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class C3096n extends C3032b implements C0660x, ah {
    public ab f16030o;
    public String f16031p;
    public ik f16032q;
    public List f16033r = Collections.emptyList();

    C3096n(int i, String str, C1045b c1045b, C3748a c3748a, C2495w c2495w, C1254c c1254c, ad adVar, String str2, ik ikVar) {
        super(i, str, c3748a, c1045b, c2495w, c1254c, adVar);
        this.f16031p = str2;
        this.f16032q = ikVar;
    }

    protected final void mo3287a(ImageView imageView, TextView textView, PlayActionButtonV2 playActionButtonV2) {
        textView.setText(this.f16030o.f);
    }

    public final boolean mo3289e() {
        return this.f16030o != null;
    }

    public final void mo3290f() {
        this.d.mo1633c(this.f16031p, (String) C0954a.aQ.m5777b(C1473m.f7980a.cZ()).m5760a(), (C0660x) this, (C0657w) this);
    }

    protected final List mo3291g() {
        return new ArrayList(Arrays.asList(new C4413a[]{new C4413a(this, 0, this.a.m603h())}));
    }

    protected final boolean mo3292h() {
        if (this.k == null) {
            return false;
        }
        for (C3087j a : this.f16033r) {
            if (a.mo1508a() > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean m15860c() {
        return this.f15871h == 0;
    }

    public final boolean m15865j() {
        return this.f16030o != null && this.f16030o.h;
    }

    public final void m_() {
        if (m15860c()) {
            C3091h c3091h = (C3091h) this.a;
            c3091h.as();
            c3091h.bm.mo1241c(c3091h.ar());
        }
        m15857n();
        if (this.f16033r.isEmpty()) {
            m15856m();
        } else if (this.f16033r.size() == this.f16030o.g.length) {
            for (int i = 0; i < this.f16030o.g.length; i++) {
                ((C3087j) this.f16033r.get(i)).mo3306a(this.f16030o.g[i]);
            }
        } else {
            this.k = new C4279n();
            this.k.m19855a(mo3291g());
            m15857n();
            m15856m();
            if (this.l != null) {
                this.l.setAdapter(this.k);
                this.k.m19856b();
            }
        }
        m15648b();
    }

    private final void m15856m() {
        this.f16033r = new ArrayList();
        for (com.google.wireless.android.finsky.dfe.h.a.ad a : this.f16030o.g) {
            C3087j c3087j;
            if (this.f16030o.h) {
                c3087j = new C3087j((C3091h) this.a, this.b, this.c, this.e);
            } else {
                c3087j = new C3088d((C3091h) this.a, this.b, this.c, this.e);
            }
            c3087j.mo3306a(a);
            this.f16033r.add(c3087j);
        }
        this.k.m19855a(this.f16033r);
    }

    private final void m15857n() {
        int i;
        if (TextUtils.isEmpty(this.f16030o.c)) {
            i = 0;
        } else {
            gy b = C1473m.f7980a.au().m15190b(C1473m.f7980a.cZ());
            if (!(b == null || b.d == null)) {
                for (dx dxVar : b.d.a) {
                    if ((dxVar.b & 1) != 0) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if (i != 0 && dxVar.c == 3) {
                        i = 0;
                        break;
                    }
                }
            }
            i = 1;
        }
        if (i != 0) {
            for (C1169s c1169s : this.k.f21580d) {
                if (c1169s instanceof C3090f) {
                    return;
                }
            }
            this.k.m19855a(Arrays.asList(new C3090f[]{new C3090f()}));
            r0.f16021a = this.f16030o;
        }
    }

    public final List m15866l() {
        List arrayList = new ArrayList();
        for (C3087j c3087j : this.f16033r) {
            arrayList.addAll(c3087j.f16016h);
        }
        return arrayList;
    }

    public final void m15859b(boolean z) {
        this.f16030o = null;
        mo3290f();
        if (!z) {
            m15648b();
        }
    }

    public final int ah() {
        return FinskyHeaderListLayout.m16068a(this.a.m603h(), 0, this.a.m605i().getDimensionPixelSize(C7582R.dimen.flat_cluster_to_cluster_bottom_margin));
    }

    public final /* synthetic */ void b_(Object obj) {
        this.f16030o = (ab) obj;
        if (this.a.m610k()) {
            m_();
            if (this.l != null && this.f16030o.h && m15860c()) {
                if (((this.f16032q.f12659a & 2) != 0 ? 1 : null) != null) {
                    for (com.google.wireless.android.finsky.dfe.h.a.ad adVar : this.f16030o.g) {
                        for (ac acVar : adVar.d) {
                            if (acVar.k.equals(this.f16032q.f12661c) && acVar.l.equals(this.f16032q.f12662d)) {
                                new Handler().post(new C3097o(this, acVar));
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}
