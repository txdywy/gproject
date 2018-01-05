package com.google.android.finsky.family.p199a;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.bi;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.activities.MainActivity;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.pagesystem.ContentFrame;
import com.google.android.libraries.bind.p117b.C5872c;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;
import java.util.Collections;
import java.util.List;

public abstract class C3035e extends C1045b implements bi {
    public final ce f15880a = C2482j.m13283a(ao());
    public C3034d ag;
    public int f15881c = 0;
    public List f15882f = Collections.emptyList();
    public ViewPager f15883h;

    public abstract int ao();

    public abstract List ap();

    public abstract int aq();

    public abstract String ar();

    public void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f740L = true;
        if (bundle == null) {
            this.bw.m13370a(new C2488p().m13345b(this));
            this.f15881c = aq();
        }
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ContentFrame contentFrame = (ContentFrame) super.mo970a(layoutInflater, viewGroup, bundle);
        FinskyHeaderListLayout finskyHeaderListLayout = (FinskyHeaderListLayout) this.bt;
        finskyHeaderListLayout.a(new C3036f(finskyHeaderListLayout.getContext()));
        return contentFrame;
    }

    public final void mo139d(Bundle bundle) {
        super.mo139d(bundle);
        if (this.f15882f.isEmpty()) {
            this.f15882f = ap();
        }
        cg_();
    }

    public final void ac() {
        this.bm.mo1241c(ar());
        this.bm.mo1246z();
        this.bq.mo1259a();
    }

    public void cg_() {
        O_();
        ac();
        if (this.f15883h == null || this.ag == null) {
            this.ag = new C3034d();
            this.ag.f15879c = this.f15882f;
            this.f15883h = (ViewPager) this.bt.findViewById(C7582R.id.viewpager);
            if (this.f15883h != null) {
                this.f15883h.setAdapter(this.ag);
                this.f15883h.setPageMargin(m605i().getDimensionPixelSize(C7582R.dimen.swipey_tab_gutter_width));
                PlayHeaderListLayout playHeaderListLayout = (PlayHeaderListLayout) this.bt;
                playHeaderListLayout.K.d();
                playHeaderListLayout.setOnPageChangeListener(this);
            }
            int i = 0;
            while (i < this.ag.mo961a()) {
                if (((C3032b) this.ag.f15879c.get(i)).f15871h == this.f15881c) {
                    break;
                }
                i++;
            }
            i = 0;
            this.f15883h.m1757a(C5872c.m27302b(this.ag, i), false);
            ((C3032b) this.f15882f.get(i)).m15647a(true);
        }
    }

    public final void mo138d() {
        C3032b aj = aj();
        if (aj != null) {
            this.f15881c = aj.f15871h;
        }
        if (this.bt != null) {
            ((PlayHeaderListLayout) this.bt).setOnPageChangeListener(null);
        }
        if (this.f15883h != null) {
            this.f15883h.setAdapter(null);
            this.f15883h = null;
        }
        this.ag = null;
        super.mo138d();
    }

    public void mo180b(int i) {
        int a = C5872c.m27301a(this.ag, i);
        for (int i2 = 0; i2 < this.f15882f.size(); i2++) {
            boolean z;
            C3032b c3032b = (C3032b) this.f15882f.get(i2);
            if (a == i2) {
                z = true;
            } else {
                z = false;
            }
            c3032b.m15647a(z);
        }
        if (!TextUtils.isEmpty((String) this.ag.mo1371a(a))) {
            C1601a.m9199a(this.bn, this.bn.getString(C7582R.string.accessibility_event_tab_selected, new Object[]{r0}), this.f15883h, false);
        }
    }

    public void mo1346w() {
        super.mo1346w();
        for (C3032b d : this.f15882f) {
            d.mo3288d();
        }
    }

    public ce getPlayStoreUiElement() {
        return this.f15880a;
    }

    protected final int mo1298Z() {
        return C7582R.layout.header_list_container;
    }

    protected final void aa() {
    }

    public final void mo179a(int i, float f, int i2) {
    }

    public final void d_(int i) {
    }

    public final C3032b aj() {
        if (this.f15883h == null) {
            return null;
        }
        return (C3032b) this.f15882f.get(C5872c.m27301a(this.ag, this.f15883h.getCurrentItem()));
    }

    public final void m15667f(int i) {
        ((PlayHeaderListLayout) this.bt).setFloatingControlsBackground(new ColorDrawable(C1608h.m9243a(m603h(), i)));
        ((MainActivity) this.bm).f6375U.m17381a(i, true);
    }
}
