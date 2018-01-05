package com.google.android.finsky.activities.myapps;

import android.annotation.TargetApi;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.bi;
import android.text.TextUtils;
import android.transition.Transition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.volley.C0660x;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.activities.C1036b;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2227g;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.dfemodel.C2730u;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dq.C2877h;
import com.google.android.finsky.frameworkviews.ah;
import com.google.android.finsky.headerlistlayout.C3167i;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.layoutswitcher.C3166e;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.pagesystem.ContentFrame;
import com.google.android.finsky.stream.controllers.assist.security.C4323d;
import com.google.android.finsky.stream.myapps.C4552s;
import com.google.android.finsky.utils.ac;
import com.google.android.finsky.utils.bb;
import com.google.android.libraries.bind.p117b.C5872c;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.a.a.m;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public final class C1120t extends C1045b implements bi, C0660x, ah {
    public String f7071a;
    public C1122v ag;
    public ViewPager ah;
    public C1118r ai;
    public int aj = -1;
    public m f7072c;
    public C4552s f7073e;
    public ac f7074f = new ac();
    public ce f7075g = C2482j.m13283a(9);
    public boolean f7076h = false;
    public int t_;

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        m6264i(3);
        this.f740L = true;
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ContentFrame contentFrame = (ContentFrame) super.mo970a(layoutInflater, viewGroup, bundle);
        FinskyHeaderListLayout finskyHeaderListLayout = (FinskyHeaderListLayout) this.bt;
        finskyHeaderListLayout.a(new C1121u(finskyHeaderListLayout.getContext()));
        return contentFrame;
    }

    public final void mo139d(Bundle bundle) {
        boolean z;
        super.mo139d(bundle);
        DfeToc dn = C1473m.f7980a.dn();
        List list = null;
        if (dn != null) {
            list = dn.m14609b();
        }
        String a = C1608h.m9247a(3, list);
        if (TextUtils.isEmpty(a)) {
            a = this.bn.getString(C7582R.string.my_downloads_menu);
        }
        this.f7071a = a;
        this.f7073e = C1473m.f7980a.cq().m21141a(C1473m.f7980a.cZ());
        if (C1473m.f7980a.ay().m9024c() && C1473m.f7980a.mo2263v().mo2772a()) {
            z = true;
        } else {
            z = false;
        }
        this.f7073e.f23290q = z;
        C1473m.f7980a.mo2259r().mo3772a();
        this.f7076h = false;
        C2206c ah = C1473m.f7980a.ah();
        C2320a L = C1473m.f7980a.mo2032L();
        for (C2227g c2227g : ah.mo2811a(this.bo.mo1620b()).mo2783b()) {
            if (c2227g.f11105l == 1 && L.mo2854a(c2227g.f11104k) != null) {
                this.f7076h = true;
                break;
            }
        }
        if (aj()) {
            cg_();
        } else {
            au();
            aa();
            ac();
        }
        this.bq.mo1259a();
    }

    public final void mo979u() {
        super.mo979u();
        C1473m.f7980a.bS().m17618a(m601g(), this.bw);
        if (C4323d.f21798a != null) {
            C4323d.f21798a.f21800c.mo4121e();
        }
    }

    protected final int mo1298Z() {
        return C7582R.layout.header_list_container;
    }

    private final boolean aj() {
        return this.f7072c != null;
    }

    protected final C3166e mo1299a(ContentFrame contentFrame) {
        return new C3167i(contentFrame, this, (byte) 0);
    }

    public final void cg_() {
        O_();
        ac();
        if (this.ah == null || this.ai == null) {
            C2482j.m13285a(this.f7075g, this.f7072c.c);
            this.ai = new C1118r((C1036b) m603h(), this.bp, this.bo, this.k_, this, this.f7074f, this, this.f7072c, this.f7076h, this, this.bw);
            this.ah = (ViewPager) this.bt.findViewById(C7582R.id.viewpager);
            if (this.ah != null) {
                this.ah.setAdapter(this.ai);
                this.ah.setPageMargin(m605i().getDimensionPixelSize(C7582R.dimen.swipey_tab_gutter_width));
                PlayHeaderListLayout playHeaderListLayout = (PlayHeaderListLayout) this.bt;
                playHeaderListLayout.K.d();
                playHeaderListLayout.setOnPageChangeListener(this);
                playHeaderListLayout.setFloatingControlsBackground(new ColorDrawable(C1608h.m9243a(m603h(), 3)));
            }
            if (this.f760q.getBoolean("trigger_update_all")) {
                this.ai.m6837e();
                this.ah.m1757a(this.ai.m6837e(), false);
                this.ai.m6838f();
                m6262d("trigger_update_all", false);
                return;
            }
            this.ah.m1757a(this.t_, false);
        }
    }

    private final String ao() {
        return this.f760q.getString("my_apps_url", this.k_.m14610c());
    }

    public final void ac() {
        this.bm.mo1241c(this.f7071a);
        this.bm.mo1237a(3, true);
        this.bm.mo1246z();
    }

    protected final void aa() {
        ap();
        mo1294k(1718);
        if (this.n_.dj().mo2294a(12640333)) {
            this.ag = new C1122v(this.bo, C1473m.f7980a.cy(), this.bw, ao(), this, this);
            bb.m21792a(this.ag, new Void[0]);
            return;
        }
        this.bo.mo1663p(ao(), this, this);
    }

    private final void ap() {
        if (this.bt != null) {
            ((PlayHeaderListLayout) this.bt).setOnPageChangeListener(null);
        }
        this.ah = null;
        this.ai = null;
    }

    @TargetApi(22)
    protected final Transition ae() {
        return new C2877h(3);
    }

    public final int af() {
        return C1608h.m9243a(m603h(), 3);
    }

    public final void mo138d() {
        if (aj()) {
            if (this.ai != null) {
                C1118r c1118r = this.ai;
                ac acVar = this.f7074f;
                if (!(c1118r.f7056g == null || c1118r.f7056g.isEmpty())) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (C1119s c1119s : c1118r.f7056g) {
                        if (c1119s.f7067d != null) {
                            C2730u c2730u;
                            c1119s.f7068e = c1119s.f7067d.mo1312b();
                            if (c1119s.f7067d instanceof C1115o) {
                                c2730u = ((C1115o) c1119s.f7067d).f7042r;
                            } else {
                                c2730u = null;
                            }
                            c1119s.f7070g = c2730u;
                        }
                        arrayList.add(c1119s.f7068e);
                        arrayList2.add(c1119s.f7070g);
                    }
                    acVar.m21688a("MyAppsTabbedAdapterV2.TabBundles", arrayList);
                    acVar.m21688a("MyAppsTabbedAdapterV2.TabLists", arrayList2);
                }
            }
            if (this.ah != null) {
                this.t_ = this.ah.getCurrentItem();
            }
        }
        ap();
        if (this.bt instanceof PlayHeaderListLayout) {
            ((PlayHeaderListLayout) this.bt).f();
        }
        this.f7073e = null;
        super.mo138d();
    }

    public final void mo1346w() {
        super.mo1346w();
        if (this.ag != null) {
            this.ag.cancel(true);
        }
    }

    public final void d_(int i) {
    }

    public final void mo179a(int i, float f, int i2) {
    }

    public final void mo180b(int i) {
        int a = C5872c.m27301a(this.ai, i);
        C1118r c1118r = this.ai;
        c1118r.f7058i = a;
        for (int i2 = 0; i2 < c1118r.f7056g.size(); i2++) {
            c1118r.m6836c(i2);
        }
        if (!TextUtils.isEmpty((String) this.ai.mo1371a(a))) {
            C1601a.m9199a(this.bn, this.bn.getString(C7582R.string.accessibility_event_tab_selected, new Object[]{r0}), this.ah, false);
        }
    }

    public final ce getPlayStoreUiElement() {
        return this.f7075g;
    }

    public final void p_() {
    }

    public final void q_() {
    }

    public final int ah() {
        if (this.aj < 0) {
            this.aj = FinskyHeaderListLayout.m16068a(this.bn, 0, 0);
        }
        return this.aj;
    }

    public final /* synthetic */ void b_(Object obj) {
        this.f7072c = (m) obj;
        this.t_ = this.f7072c.d;
        if (this.t_ < 0 || this.t_ >= this.f7072c.b.length) {
            this.t_ = 0;
        }
        m_();
    }
}
