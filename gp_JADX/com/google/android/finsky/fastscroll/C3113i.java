package com.google.android.finsky.fastscroll;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ew;
import android.support.v7.widget.fr;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.finsky.utils.ac;

public final class C3113i implements OnGlobalLayoutListener, C3103b {
    public final RecyclerView f16068a;
    public int f16069b;

    public C3113i(RecyclerView recyclerView) {
        this.f16068a = recyclerView;
    }

    public final boolean mo3316a() {
        return mo3317b() > 0.0f;
    }

    public final float mo3317b() {
        return (float) ((this.f16069b * this.f16068a.getAdapter().mo1039a()) - this.f16068a.getHeight());
    }

    public final float mo3319c() {
        int a = C3105d.m15913a(this.f16068a.getLayoutManager());
        fr f = this.f16068a.m302f(a);
        a *= this.f16069b;
        if (f != null) {
            a += this.f16068a.getTop() - f.f3211a.getTop();
        }
        return (float) a;
    }

    public final void mo3314a(float f) {
        this.f16068a.scrollBy(0, (int) ((mo3317b() * f) - mo3319c()));
    }

    public final void mo3320d() {
        this.f16068a.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public final void mo3321e() {
        this.f16068a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    public final void mo3315a(ac acVar) {
        acVar.putInt("SameItemHeightFastScrollModelImpl.itemHeight", this.f16069b);
    }

    public final void mo3318b(ac acVar) {
        this.f16069b = acVar.getInt("SameItemHeightFastScrollModelImpl.itemHeight");
        if (this.f16069b == 0) {
            mo3320d();
        }
    }

    public final void onGlobalLayout() {
        ew layoutManager = this.f16068a.getLayoutManager();
        if (layoutManager != null) {
            fr f = this.f16068a.m302f(C3105d.m15913a(layoutManager));
            if (f != null) {
                this.f16069b = f.f3211a.getHeight();
                this.f16068a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
    }
}
