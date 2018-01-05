package com.google.android.finsky.fastscroll;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.fr;
import com.google.android.finsky.utils.ac;
import java.util.ArrayList;
import java.util.List;

public final class C3107f implements C3103b {
    public final RecyclerView f16059a;
    public final List f16060b = new ArrayList();
    public int f16061c;

    public C3107f(RecyclerView recyclerView) {
        this.f16059a = recyclerView;
    }

    public final boolean mo3316a() {
        m15927f();
        return this.f16061c > this.f16059a.getHeight();
    }

    public final float mo3317b() {
        m15927f();
        return (float) (this.f16061c - this.f16059a.getHeight());
    }

    public final float mo3319c() {
        m15927f();
        int a = C3105d.m15913a(this.f16059a.getLayoutManager());
        fr f = this.f16059a.m302f(a);
        float f2 = 0.0f;
        for (int min = Math.min(a, this.f16060b.size()) - 1; min >= 0; min--) {
            f2 += (float) ((Integer) this.f16060b.get(min)).intValue();
        }
        if (f != null) {
            return ((float) (this.f16059a.getTop() - f.f3211a.getTop())) + f2;
        }
        return f2;
    }

    public final void mo3314a(float f) {
        if (f == 1.0f) {
            this.f16059a.mo2963c(Math.min(this.f16060b.size(), this.f16059a.getAdapter().mo1039a() - 1));
            m15927f();
            return;
        }
        this.f16059a.scrollBy(0, (int) ((mo3317b() * f) - mo3319c()));
    }

    public final void mo3320d() {
    }

    public final void mo3321e() {
    }

    public final void mo3315a(ac acVar) {
        acVar.m21688a("PixelHeightFastScrollModelImpl.childrenHeights", this.f16060b);
    }

    public final void mo3318b(ac acVar) {
        this.f16060b.clear();
        this.f16060b.addAll(acVar.m21691c("PixelHeightFastScrollModelImpl.childrenHeights"));
        this.f16061c = 0;
        for (Integer intValue : this.f16060b) {
            this.f16061c = intValue.intValue() + this.f16061c;
        }
    }

    private final void m15927f() {
        int a = C3105d.m15913a(this.f16059a.getLayoutManager());
        fr f = this.f16059a.m302f(a);
        while (f != null) {
            int height = f.f3211a.getHeight();
            if (a < this.f16060b.size()) {
                this.f16061c = (height - ((Integer) this.f16060b.set(a, Integer.valueOf(height))).intValue()) + this.f16061c;
            } else if (a == this.f16060b.size()) {
                this.f16060b.add(Integer.valueOf(height));
                this.f16061c += height;
            }
            a++;
            f = this.f16059a.m302f(a);
        }
    }
}
