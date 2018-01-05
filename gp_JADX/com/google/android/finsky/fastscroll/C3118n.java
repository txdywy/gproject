package com.google.android.finsky.fastscroll;

import android.support.v7.widget.RecyclerView;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.headerlistlayout.C3117g;
import com.google.android.finsky.headerlistlayout.C3158l;
import com.google.android.finsky.utils.ac;
import com.google.android.play.headerlist.PlayHeaderListLayout;

public final class C3118n implements C3117g {
    public final ScrubberView f16072a;
    public final int f16073b;
    public final C1461c f16074c;
    public RecyclerView f16075d;
    public PlayHeaderListLayout f16076e;
    public boolean f16077f;
    public int f16078g;
    public C3103b f16079h;

    C3118n(ScrubberView scrubberView, int i, boolean z, C1461c c1461c) {
        this.f16072a = scrubberView;
        this.f16073b = i;
        this.f16077f = z;
        this.f16074c = c1461c;
    }

    public final void mo3326a(boolean z) {
        if (this.f16077f != z) {
            this.f16077f = z;
            C3119o c3119o = this.f16072a.f16049b;
            c3119o.f16100u.f16108a.clear();
            c3119o.m15973a(m15961c());
            c3119o.f16101v = m15962d();
        }
    }

    public final void m15964a() {
        C3119o c3119o = this.f16072a.f16049b;
        c3119o.f16102w = C3118n.m15960a(this.f16073b, this.f16075d);
        if (this.f16076e != null) {
            this.f16076e.getViewTreeObserver().addOnPreDrawListener(c3119o);
            if (this.f16076e instanceof C3158l) {
                ((C3158l) this.f16076e).mo3333a(this.f16072a);
            }
            c3119o.m15973a(m15961c());
        }
        c3119o.f16101v = m15962d();
        this.f16075d.mo2951a(c3119o.f16103x);
        c3119o.f16102w.mo3320d();
    }

    public final void m15967b() {
        Object obj = this.f16072a.f16049b;
        obj.f16102w.mo3321e();
        this.f16075d.mo2952b(obj.f16103x);
        obj.f16101v = null;
        obj.f16100u.f16108a.clear();
        if (this.f16076e != null) {
            if (this.f16076e instanceof C3158l) {
                ((C3158l) this.f16076e).mo3334b(this.f16072a);
            }
            this.f16076e.getViewTreeObserver().removeOnPreDrawListener(obj);
        }
        obj.f16102w = null;
    }

    public final void m15965a(RecyclerView recyclerView) {
        if (this.f16078g != 1 || this.f16079h == null) {
            this.f16078g = 1;
            this.f16079h = C3118n.m15960a(1, this.f16075d);
        }
        C3103b a = C3118n.m15960a(3, recyclerView);
        C3119o c3119o = this.f16072a.f16049b;
        C3103b c3103b = c3119o.f16102w;
        C3103b c3106e = new C3106e(this.f16079h, a);
        if (c3103b != null) {
            c3103b.mo3321e();
        }
        c3119o.f16102w = c3106e;
        c3106e.mo3320d();
    }

    public final C3118n m15963a(ac acVar) {
        this.f16072a.f16049b.f16102w.mo3315a(acVar);
        return this;
    }

    public final void m15968b(ac acVar) {
        this.f16072a.f16049b.f16102w.mo3318b(acVar);
    }

    private static C3103b m15960a(int i, RecyclerView recyclerView) {
        switch (i) {
            case 0:
                return new C3104c(recyclerView);
            case 1:
                return new C3107f(recyclerView);
            case 2:
                return new C3113i(recyclerView);
            case 3:
                return new C3125w(recyclerView);
            default:
                return null;
        }
    }

    private final C3110t m15961c() {
        if (this.f16077f) {
            return new C3126x(this.f16076e, this.f16075d);
        }
        return new C3112h(this.f16076e, this.f16074c);
    }

    private final C3114j m15962d() {
        Object obj;
        C3128z c3128z = new C3128z(this.f16075d);
        if (this.f16077f || this.f16076e == null) {
            obj = null;
        } else {
            obj = new C3109g(this.f16076e);
        }
        if (obj != null) {
            c3128z.f16123b.add(obj);
        }
        return new C3127y(c3128z.f16122a, c3128z.f16123b, c3128z.f16124c);
    }
}
