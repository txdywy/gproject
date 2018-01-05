package com.google.android.finsky.ia2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.bl.C2116a;
import com.google.android.finsky.frameworkviews.SpacerHeightAwareFrameLayout;
import com.google.android.finsky.frameworkviews.ah;
import com.google.android.finsky.layoutswitcher.C1043h;
import com.google.android.finsky.layoutswitcher.C3166e;
import com.google.android.finsky.p111d.al;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public final class C3240q implements C3235t, C1043h {
    public final List f16697a;
    public final C3227r f16698b;
    public final int f16699c;
    public int f16700d = 0;
    public int f16701e = -1;
    public boolean f16702f;
    public boolean f16703g;
    public final LayoutInflater f16704h;
    public final ah f16705i;
    public C3166e f16706j;
    public ViewGroup f16707k;
    public final boolean f16708l;
    public byte[] f16709m;
    public List f16710n;
    public al f16711o;

    C3240q(List list, LayoutInflater layoutInflater, ah ahVar, C2116a c2116a, int i, C3227r c3227r, byte[] bArr, List list2, al alVar) {
        this.f16697a = list;
        this.f16699c = c2116a.m11024c();
        this.f16704h = layoutInflater;
        this.f16705i = ahVar;
        this.f16698b = c3227r;
        this.f16708l = c2116a.m11028g();
        this.f16709m = bArr;
        this.f16710n = list2;
        this.f16711o = alVar;
        m16344c();
        if (i >= 0 && i < list.size()) {
            this.f16700d = i;
        }
        if (c2116a.m11026e()) {
            ((C3229s) list.get(this.f16700d)).mo3386a();
        }
    }

    public final void m16348a(int i, int i2) {
        if (this.f16707k == null) {
            m16351b();
        }
        if (this.f16701e != i && i >= 0 && i < this.f16697a.size()) {
            if (this.f16701e != -1) {
                ((C3229s) this.f16697a.get(this.f16701e)).mo3391b(i2);
            }
            this.f16701e = i;
            ((C3229s) this.f16697a.get(this.f16701e)).mo3387a(i2);
        }
    }

    public final int m16346a() {
        if (this.f16701e != -1) {
            return this.f16701e;
        }
        return this.f16700d;
    }

    public final void mo3394a(int i) {
        if (this.f16702f && i == m16346a()) {
            if (this.f16707k == null) {
                m16351b();
            }
            this.f16706j.mo3397a();
            m16350a(((C3229s) this.f16697a.get(m16346a())).mo3385a(this.f16703g));
            this.f16703g = false;
        }
    }

    public final void mo3395a(int i, String str) {
        if (i == m16346a()) {
            if (this.f16707k == null) {
                m16351b();
            }
            this.f16706j.m16127a(1, (CharSequence) str);
        }
    }

    public final void mo3396b(int i) {
        if (i == m16346a()) {
            if (this.f16698b != null) {
                this.f16698b.mo3384c();
            }
            int a;
            switch (this.f16699c) {
                case 1:
                    int a2 = m16346a() + 1;
                    a = m16346a() - 1;
                    while (a <= a2) {
                        if (a != m16346a() && a >= 0 && a < this.f16697a.size()) {
                            ((C3229s) this.f16697a.get(a)).mo3386a();
                        }
                        a++;
                    }
                    return;
                case 2:
                    for (a = 0; a < this.f16697a.size(); a++) {
                        if (a != m16346a()) {
                            ((C3229s) this.f16697a.get(a)).mo3386a();
                        }
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public final void n_() {
        this.f16702f = true;
        ((C3229s) this.f16697a.get(m16346a())).mo3390b();
    }

    private final void m16344c() {
        for (int i = 0; i < this.f16697a.size(); i++) {
            ((C3229s) this.f16697a.get(i)).mo3388a((C3235t) this);
        }
    }

    final void m16351b() {
        this.f16707k = (ViewGroup) this.f16704h.inflate(C7582R.layout.ia2_sub_nav_page_view_wrapper, null);
        m16345c(C7582R.id.lists_loading_indicator);
        m16345c(C7582R.id.page_error_indicator);
        m16345c(C7582R.id.page_error_indicator_with_notifier);
        this.f16706j = new C3166e(this.f16707k, C7582R.id.data_view, C7582R.id.lists_loading_indicator, this, 0);
    }

    private final void m16345c(int i) {
        ((SpacerHeightAwareFrameLayout) this.f16707k.findViewById(i)).setSpacerHeightProvider(this.f16705i);
    }

    final void m16350a(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = this.f16706j.f16387f;
        View findViewById = viewGroup2.findViewById(this.f16708l ? C7582R.id.scrubber_view : C7582R.id.tab_recycler_view);
        if (findViewById != viewGroup) {
            if (findViewById != null) {
                viewGroup2.removeView(findViewById);
            }
            viewGroup2.addView(viewGroup, 0);
        }
    }
}
