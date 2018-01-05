package com.google.android.finsky.ci;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.volley.C0657w;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bd.C1592a;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.C2721l;
import com.google.android.finsky.frameworkviews.ah;
import com.google.android.finsky.headerlistlayout.C3167i;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.layoutswitcher.C3166e;
import com.google.android.finsky.notification.C2281m;
import com.google.android.finsky.notification.C3813k;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.pagesystem.ContentFrame;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.android.finsky.stream.base.C4279n;
import com.google.android.finsky.stream.base.view.C4297g;
import com.google.android.finsky.stream.p248a.C4234b;
import com.google.android.finsky.utils.ac;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public final class C2282a extends C1045b implements ah, C2281m {
    public PlayRecyclerView f11292a;
    public ac ag;
    public C3813k ah;
    public int ai = -1;
    public final ce aj = C2482j.m13283a(29);
    public C4279n f11293c;
    public C4234b f11294f;
    public C2720j f11295h;

    public C2282a() {
        C1473m.f7980a.aO();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2834a(java.util.List r6) {
        /*
        r5 = this;
        r2 = 1;
        r1 = 0;
        r0 = r5.f11292a;
        if (r0 == 0) goto L_0x0029;
    L_0x0006:
        r0 = r6.isEmpty();
        if (r0 != 0) goto L_0x002a;
    L_0x000c:
        if (r1 == 0) goto L_0x0029;
    L_0x000e:
        r0 = r5.f11292a;
        r1 = new com.google.android.finsky.recyclerview.a;
        r1.<init>();
        r0.setAdapter(r1);
        r0 = r5.f11292a;
        r1 = r5.bt;
        r2 = 2131755302; // 0x7f100126 float:1.914148E38 double:1.05322706E-314;
        r1 = r1.findViewById(r2);
        r0.setEmptyView(r1);
        r0 = 0;
        r5.f11293c = r0;
    L_0x0029:
        return;
    L_0x002a:
        r0 = r5.f11295h;
        if (r0 == 0) goto L_0x003c;
    L_0x002e:
        r0 = r5.f11295h;
        r0 = r0.mo2861a();
        if (r0 == 0) goto L_0x003c;
    L_0x0036:
        r0 = r5.f11295h;
        r0 = r0.f14908a;
        if (r0 != 0) goto L_0x003e;
    L_0x003c:
        r1 = r2;
        goto L_0x000c;
    L_0x003e:
        r0 = r5.f11295h;
        r3 = r0.f14908a;
        r0 = r1;
    L_0x0043:
        r4 = r3.m14638a();
        if (r0 >= r4) goto L_0x0060;
    L_0x0049:
        r4 = r3.m14641a(r0);
        r4 = r4.ba();
        if (r4 == 0) goto L_0x0062;
    L_0x0053:
        r0 = r3.m14641a(r0);
        r0 = r0.bb();
        r0 = r0.f12458a;
        r0 = r0.length;
        if (r0 != 0) goto L_0x000c;
    L_0x0060:
        r1 = r2;
        goto L_0x000c;
    L_0x0062:
        r0 = r0 + 1;
        goto L_0x0043;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.ci.a.a(java.util.List):void");
    }

    public final ce getPlayStoreUiElement() {
        return this.aj;
    }

    protected final int mo1298Z() {
        return C7582R.layout.header_list_container;
    }

    protected final void aa() {
        this.f11295h = C2721l.m14733a(C1473m.f7980a.ap(), this.k_.f14881a.f31755C, false, false);
        this.f11295h.m11918a((C1031w) this);
        this.f11295h.m11917a((C0657w) this);
        this.f11295h.m14699n();
    }

    protected final void cg_() {
        if (this.f11293c == null) {
            this.f11293c = new C4279n();
        }
        this.f11294f = C1473m.f7980a.co().m19665a(C2721l.m14735a(this.f11295h), this.f11293c, this.f11292a, this.bn, this.bp, this, this.bw, 2, null, this, null, false, null, false, false, null, null, false);
        if (this.ag != null) {
            this.f11293c.m19845a(this.ag);
        }
    }

    public final void mo139d(Bundle bundle) {
        super.mo139d(bundle);
        ac();
        Object obj = (this.f11295h == null || !this.f11295h.mo2861a()) ? null : 1;
        if (obj == null) {
            au();
            aa();
        } else {
            cg_();
        }
        this.bq.mo1259a();
    }

    public final void mo1292a(Activity activity) {
        ((C1366c) C3947d.m18649a(C1366c.class)).mo1783a(this);
        super.mo1292a(activity);
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f740L = true;
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.mo970a(layoutInflater, viewGroup, bundle);
        FinskyHeaderListLayout finskyHeaderListLayout = (FinskyHeaderListLayout) this.bt;
        finskyHeaderListLayout.a(new C2283b(finskyHeaderListLayout.getContext()));
        this.f11292a = (PlayRecyclerView) this.bt.findViewById(C7582R.id.recycler_view);
        this.f11292a.setLayoutManager(new LinearLayoutManager());
        this.f11292a.m278a(new C4297g(0, 0));
        this.ah.m18250a(this);
        return a;
    }

    public final void mo138d() {
        super.mo138d();
        this.f11292a = null;
        if (this.f11293c != null) {
            this.ag = new ac();
            this.f11293c.m19859b(this.ag);
            this.f11293c = null;
        }
        if (this.f11294f != null) {
            this.f11294f.m19660d();
            this.f11294f = null;
        }
        if (this.ah != null) {
            this.ah.m18251b(this);
        }
        if (this.f11295h != null) {
            this.f11295h.m11922b((C1031w) this);
            this.f11295h.m11921b((C0657w) this);
        }
    }

    protected final C3166e mo1299a(ContentFrame contentFrame) {
        return new C3167i(contentFrame, this);
    }

    public final void ac() {
        this.bm.mo1241c(m601g().getString(C1592a.ar.intValue()));
        this.bm.mo1237a(3, false);
        this.bm.mo1246z();
    }

    public final int ab() {
        return 3;
    }

    public final int ah() {
        if (this.ai < 0) {
            this.ai = FinskyHeaderListLayout.m16068a(this.bn, 2, 0);
            this.ai -= this.bn.getResources().getDimensionPixelSize(C7582R.dimen.play_collection_card_spacing);
        }
        return this.ai;
    }
}
