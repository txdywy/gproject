package com.google.android.finsky.fastscroll;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ew;
import android.support.v7.widget.fr;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.finsky.utils.ac;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class C3125w implements C3103b {
    public final RecyclerView f16109a;
    public final List f16110b = new ArrayList();
    public int f16111c;
    public int f16112d;

    public C3125w(RecyclerView recyclerView) {
        this.f16109a = recyclerView;
    }

    public final boolean mo3316a() {
        m15987g();
        return m15986f() > ((float) this.f16109a.getHeight());
    }

    public final float mo3317b() {
        m15987g();
        return m15986f() - ((float) this.f16109a.getHeight());
    }

    public final float mo3319c() {
        m15987g();
        int a = C3105d.m15913a(this.f16109a.getLayoutManager());
        fr a2 = this.f16109a.m274a(a, false);
        float f = ((float) this.f16111c) / ((float) this.f16112d);
        float f2 = 0.0f;
        int min = Math.min(a, this.f16110b.size()) - 1;
        while (min >= 0) {
            float f3;
            a = ((Integer) this.f16110b.get(min)).intValue();
            if (a == -1) {
                f3 = f2 + f;
            } else {
                f3 = ((float) a) + f2;
            }
            min--;
            f2 = f3;
        }
        if (a2 == null) {
            return f2;
        }
        return ((float) ((((MarginLayoutParams) a2.f3211a.getLayoutParams()).topMargin + this.f16109a.getTop()) - a2.f3211a.getTop())) + f2;
    }

    public final void mo3314a(float f) {
        int i = 0;
        float f2 = ((float) this.f16111c) / ((float) this.f16112d);
        float b = f * mo3317b();
        float intValue = (float) ((Integer) this.f16110b.get(0)).intValue();
        if (intValue == -1.0f) {
            intValue = f2;
        }
        while (b >= intValue) {
            b -= intValue;
            i++;
            intValue = (float) ((Integer) this.f16110b.get(i)).intValue();
            if (intValue == -1.0f) {
                intValue = f2;
            }
        }
        C3105d.m15914a(this.f16109a.getLayoutManager(), i, (int) (-b));
        m15987g();
    }

    public final void mo3320d() {
    }

    public final void mo3321e() {
    }

    public final void mo3315a(ac acVar) {
        acVar.m21688a("UniversalFastScrollModelImpl.childrenHeights", this.f16110b);
    }

    public final void mo3318b(ac acVar) {
        this.f16110b.clear();
        this.f16112d = 0;
        this.f16111c = 0;
        Collection c = acVar.m21691c("UniversalFastScrollModelImpl.childrenHeights");
        if (c != null) {
            this.f16110b.addAll(c);
            for (int size = this.f16110b.size() - 1; size >= 0; size--) {
                int intValue = ((Integer) this.f16110b.get(size)).intValue();
                if (intValue != -1) {
                    this.f16112d++;
                    this.f16111c = intValue + this.f16111c;
                }
            }
        }
    }

    private final float m15986f() {
        if (this.f16112d == 0) {
            return 0.0f;
        }
        return (((float) this.f16111c) / ((float) this.f16112d)) * ((float) this.f16109a.getAdapter().mo1039a());
    }

    private final void m15987g() {
        int a = this.f16109a.getAdapter().mo1039a();
        while (a > this.f16110b.size()) {
            this.f16110b.add(Integer.valueOf(-1));
        }
        while (a < this.f16110b.size()) {
            int intValue = ((Integer) this.f16110b.remove(this.f16110b.size() - 1)).intValue();
            if (intValue != -1) {
                this.f16111c -= intValue;
                this.f16112d--;
            }
        }
        int childCount = this.f16109a.getChildCount();
        for (a = 0; a < childCount; a++) {
            View childAt = this.f16109a.getChildAt(a);
            int d = RecyclerView.m262d(childAt);
            if (d < this.f16110b.size() && d != -1) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) childAt.getLayoutParams();
                this.f16109a.getLayoutManager();
                int d2 = (ew.m2986d(childAt) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin;
                intValue = ((Integer) this.f16110b.set(d, Integer.valueOf(d2))).intValue();
                if (intValue == -1) {
                    this.f16111c += d2;
                    this.f16112d++;
                } else {
                    this.f16111c = (d2 - intValue) + this.f16111c;
                }
            }
        }
    }
}
