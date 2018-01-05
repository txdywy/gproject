package com.google.android.finsky.fastscroll;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ew;
import android.support.v7.widget.fr;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.android.play.headerlist.s;

final class C3126x extends C3111u {
    public final s f16113a;
    public final RecyclerView f16114b;
    public int f16115c;
    public int f16116d;
    public int f16117e;
    public int f16118f;

    public C3126x(PlayHeaderListLayout playHeaderListLayout, RecyclerView recyclerView) {
        this.f16113a = new s(playHeaderListLayout);
        this.f16114b = recyclerView;
    }

    public final void mo3323a(float f) {
        this.f16113a.mo2913a(this.f16114b, 1);
        m15996a();
    }

    public final void mo3325b(float f) {
        int top;
        fr f2 = this.f16114b.m302f(this.f16115c);
        fr f3 = this.f16114b.m302f(this.f16117e);
        if (f2 != null) {
            top = this.f16116d - f2.f3211a.getTop();
        } else if (f3 != null) {
            top = this.f16118f - f3.f3211a.getTop();
        } else {
            top = Integer.signum(this.f16115c - C3105d.m15913a(this.f16114b.getLayoutManager())) * this.f16114b.getHeight();
        }
        this.f16113a.mo791a(this.f16114b, 0, top);
        m15996a();
    }

    public final void mo3324a(float f, float f2) {
        this.f16113a.mo2913a(this.f16114b, 0);
    }

    private final void m15996a() {
        ew layoutManager = this.f16114b.getLayoutManager();
        int a = C3105d.m15913a(layoutManager);
        fr f = this.f16114b.m302f(a);
        if (f != null) {
            this.f16115c = a;
            this.f16116d = f.f3211a.getTop();
        }
        int b = C3105d.m15915b(layoutManager);
        fr f2 = this.f16114b.m302f(b);
        if (f2 != null) {
            this.f16117e = b;
            this.f16118f = f2.f3211a.getTop();
        }
    }
}
