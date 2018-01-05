package com.google.android.finsky.ia2;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bl.C2116a;
import com.google.android.finsky.frameworkviews.SpacerHeightAwareFrameLayout;
import com.google.android.finsky.frameworkviews.ah;
import com.google.android.finsky.layoutswitcher.C1043h;
import com.google.android.finsky.layoutswitcher.C3166e;
import com.google.android.finsky.p111d.al;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public final class C3236l implements C3235t, C1043h {
    public final int f16674a;
    public ArrayList f16675b = new ArrayList();
    public final C3225n f16676c;
    public final C2116a f16677d;
    public int f16678e = -1;
    public boolean f16679f;
    public Runnable f16680g;
    public boolean f16681h;
    public boolean f16682i;
    public Handler f16683j;
    public final int f16684k;
    public final LayoutInflater f16685l;
    public final ah f16686m;
    public C3166e f16687n;
    public ViewGroup f16688o;
    public final boolean f16689p;
    public byte[] f16690q;
    public List f16691r;
    public al f16692s;

    public C3236l(List list, LayoutInflater layoutInflater, ah ahVar, C2116a c2116a, int i, C3225n c3225n, byte[] bArr, List list2, al alVar) {
        this.f16677d = c2116a;
        this.f16684k = c2116a.m11024c();
        this.f16685l = layoutInflater;
        this.f16686m = ahVar;
        this.f16675b = new ArrayList();
        this.f16676c = c3225n;
        this.f16689p = c2116a.m11028g();
        this.f16690q = bArr;
        this.f16691r = list2;
        this.f16692s = alVar;
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f16675b.add(new C3238o((C3229s) list.get(i2), this));
        }
        this.f16683j = new Handler(Looper.getMainLooper());
        if (i < 0 || i >= list.size()) {
            FinskyLog.m21667d("Invalid server selected sub nav page index:" + i, new Object[0]);
            i = 0;
        }
        this.f16674a = i;
        if (this.f16677d.m11026e()) {
            ((C3229s) list.get(this.f16674a)).mo3386a();
        }
        c2116a.m11027f();
        this.f16680g = new C3237m(this);
    }

    final void m16338a() {
        this.f16688o = (ViewGroup) this.f16685l.inflate(C7582R.layout.ia2_sub_nav_page_view_wrapper, null);
        m16337c(C7582R.id.lists_loading_indicator);
        m16337c(C7582R.id.page_error_indicator);
        m16337c(C7582R.id.page_error_indicator_with_notifier);
        this.f16687n = new C3166e(this.f16688o, C7582R.id.data_view, C7582R.id.lists_loading_indicator, this, 0);
    }

    private final void m16337c(int i) {
        ((SpacerHeightAwareFrameLayout) this.f16688o.findViewById(i)).setSpacerHeightProvider(this.f16686m);
    }

    public final void n_() {
        m16342b().mo3390b();
    }

    public final void m16340a(int i, int i2, boolean z) {
        int i3 = 0;
        if (this.f16688o == null) {
            m16338a();
        }
        this.f16683j.removeCallbacks(this.f16680g);
        this.f16682i = false;
        if (this.f16678e != i && this.f16675b.size() > i) {
            C3238o c3238o;
            C3229s c3229s;
            if (this.f16678e != -1) {
                c3238o = (C3238o) this.f16675b.get(this.f16678e);
                c3229s = c3238o.f16694a;
                this.f16683j.removeCallbacksAndMessages(c3238o.f16695b);
                c3229s.mo3391b(i2);
            }
            this.f16678e = i;
            this.f16681h = z;
            c3238o = (C3238o) this.f16675b.get(this.f16678e);
            c3229s = c3238o.f16694a;
            this.f16683j.removeCallbacksAndMessages(c3238o.f16695b);
            c3229s.mo3387a(i2);
            if (c3229s.mo3393c()) {
                this.f16687n.mo3397a();
                m16336a(c3229s.mo3385a(this.f16681h));
                this.f16681h = false;
            } else {
                if (C1473m.f7980a.dj().mo2294a(12637322)) {
                    this.f16692s.mo1385a(1737, this.f16690q, (byte[]) this.f16691r.get(i), true);
                }
                this.f16687n.m16127a(0, null);
                c3229s.mo3386a();
            }
            switch (this.f16684k) {
                case 1:
                    int i4 = this.f16678e - 1;
                    int i5 = this.f16678e + 1;
                    while (i3 < this.f16675b.size()) {
                        c3238o = (C3238o) this.f16675b.get(i3);
                        if (i3 != this.f16678e) {
                            if (i3 == i4 || i3 == i5) {
                                this.f16683j.postDelayed(c3238o.f16695b, 5);
                            } else {
                                this.f16683j.removeCallbacksAndMessages(c3238o.f16695b);
                            }
                        }
                        i3++;
                    }
                    return;
                case 2:
                    if (!this.f16679f) {
                        this.f16679f = true;
                        while (i3 < this.f16675b.size()) {
                            c3238o = (C3238o) this.f16675b.get(i3);
                            if (i3 != this.f16678e) {
                                this.f16683j.postDelayed(c3238o.f16695b, 5);
                            }
                            i3++;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    final C3229s m16342b() {
        return ((C3238o) this.f16675b.get(this.f16678e)).f16694a;
    }

    private final void m16336a(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = this.f16687n.f16387f;
        View findViewById = viewGroup2.findViewById(this.f16689p ? C7582R.id.scrubber_view : C7582R.id.tab_recycler_view);
        if (findViewById != viewGroup) {
            if (findViewById != null) {
                viewGroup2.removeView(findViewById);
            }
            viewGroup2.addView(viewGroup, 0);
        }
    }

    public final void mo3394a(int i) {
        if (this.f16676c != null && this.f16676c.mo3383d() && i == this.f16678e) {
            if (this.f16688o == null) {
                m16338a();
            }
            this.f16687n.mo3397a();
            m16336a(m16342b().mo3385a(this.f16681h));
            this.f16681h = false;
        }
    }

    public final void mo3395a(int i, String str) {
        if (i == this.f16678e) {
            if (this.f16688o == null) {
                m16338a();
            }
            this.f16687n.m16127a(1, (CharSequence) str);
        }
    }

    public final void mo3396b(int i) {
    }
}
