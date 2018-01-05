package com.google.android.finsky.nestedrecyclerviews.p115a;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.fe;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.finsky.recyclerview.p182a.C3774a;
import com.google.android.finsky.utils.C4678i;
import java.util.ArrayList;
import java.util.List;

public final class C3776k implements C3774a {
    public final /* synthetic */ C3769f f18983a;

    public C3776k(C3769f c3769f) {
        this.f18983a = c3769f;
    }

    public final boolean mo3748a(fe feVar) {
        this.f18983a.f18966g = feVar;
        return true;
    }

    public final boolean mo3752b(fe feVar) {
        List arrayList;
        C3769f c3769f = this.f18983a;
        if (this.f18983a.f18967h == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = this.f18983a.f18967h;
        }
        c3769f.f18967h = arrayList;
        this.f18983a.f18967h.add(feVar);
        return true;
    }

    public final boolean mo3755c(fe feVar) {
        if (this.f18983a.f18967h != null) {
            this.f18983a.f18967h.remove(feVar);
        }
        if (this.f18983a.f18966g == feVar) {
            this.f18983a.f18966g = null;
        }
        return true;
    }

    public final int mo3742a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f18983a.f18965f == null || this.f18983a.f18965f.isEmpty()) {
            return 2;
        }
        return 0;
    }

    public final int mo3749b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f18983a.f18964e != null) {
            this.f18983a.f18964e.m303f();
        }
        return 2;
    }

    public final boolean mo3747a(int i) {
        boolean z;
        C3769f c3769f;
        int i2 = 0;
        if (i != 0 || this.f18983a.f18964e == null) {
            z = true;
        } else {
            int i3;
            c3769f = this.f18983a;
            long a = C4678i.m21812a() - c3769f.f18973n;
            int i4 = c3769f.f18974o;
            if (i4 > 0) {
                i3 = -10;
            } else {
                i3 = 10;
            }
            i3 *= (int) a;
            if (Math.abs(i3) > Math.abs(i4)) {
                i3 = 0;
            } else {
                i3 += i4;
            }
            if (c3769f.f18964e == null || Math.abs(i3) < c3769f.f18964e.getMinFlingVelocity() || !((c3769f.f18975p && c3769f.m17918a()) || (c3769f.f18976q && c3769f.m17919b()))) {
                z = false;
            } else {
                c3769f.f18964e.mo2962b(0, i3);
                z = true;
            }
            if (z) {
                z = false;
            } else {
                z = true;
            }
            this.f18983a.f18975p = false;
            this.f18983a.f18976q = false;
        }
        if (z) {
            c3769f = this.f18983a;
            if (c3769f.f18966g != null) {
                c3769f.f18966g.mo2913a(c3769f.f18961b, i);
            }
            if (c3769f.f18967h != null) {
                while (i2 < c3769f.f18967h.size()) {
                    ((fe) c3769f.f18967h.get(i2)).mo2913a(c3769f.f18961b, i);
                    i2++;
                }
            }
        }
        return true;
    }

    public final boolean mo3751b(int i) {
        if (!this.f18983a.f18977r) {
            C3769f c3769f = this.f18983a;
            c3769f.f18970k -= i;
        }
        C3769f c3769f2 = this.f18983a;
        if (c3769f2.f18966g != null) {
            c3769f2.f18966g.mo791a(c3769f2.f18961b, 0, i);
        }
        if (c3769f2.f18967h != null) {
            for (int i2 = 0; i2 < c3769f2.f18967h.size(); i2++) {
                ((fe) c3769f2.f18967h.get(i2)).mo791a(c3769f2.f18961b, 0, i);
            }
        }
        return true;
    }

    public final int mo3743a(View view, View view2) {
        int i = 0;
        if (!(view2 instanceof C3763a)) {
            return 0;
        }
        C3769f.m17916b(view2);
        if (!this.f18983a.f18972m) {
            this.f18983a.f18972m = true;
            if (view instanceof ViewGroup) {
                i = ((MarginLayoutParams) view.getLayoutParams()).topMargin;
            }
            if (this.f18983a.f18969j == -1) {
                this.f18983a.f18969j = ((Math.abs(this.f18983a.f18970k) + view.getTop()) - i) - this.f18983a.f18971l;
            }
            this.f18983a.f18970k = (view.getTop() - i) - this.f18983a.f18971l;
        }
        C3769f c3769f = this.f18983a;
        RecyclerView recyclerView = (RecyclerView) view2;
        C3769f.m17916b(recyclerView);
        if (c3769f.f18964e != recyclerView) {
            c3769f.f18964e = recyclerView;
            if (c3769f.f18968i != null) {
                for (int size = c3769f.f18968i.size() - 1; size >= 0; size--) {
                    ((C1062m) c3769f.f18968i.get(size)).mo1356a(recyclerView);
                }
            }
        }
        return 1;
    }

    public final void mo3754c(int i) {
        this.f18983a.f18962c.f1844a = i;
    }

    public final void mo3745a(int i, int[] iArr) {
        if (i <= 0) {
            int i2 = this.f18983a.f18969j - this.f18983a.f18970k;
            if (Math.abs(i) > i2) {
                i = -i2;
            }
        } else if (i > this.f18983a.f18970k) {
            i = this.f18983a.f18970k;
        }
        this.f18983a.f18977r = true;
        this.f18983a.f18961b.scrollBy(0, i);
        C3769f c3769f = this.f18983a;
        c3769f.f18970k -= i;
        iArr[1] = i;
    }

    public final void mo3744a() {
    }

    public final boolean mo3746a(float f) {
        boolean z;
        this.f18983a.f18975p = f > 0.0f;
        C3769f c3769f = this.f18983a;
        if (f < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        c3769f.f18976q = z;
        this.f18983a.f18974o = (int) f;
        this.f18983a.f18973n = C4678i.m21812a();
        this.f18983a.f18961b.mo2962b(0, this.f18983a.f18974o);
        return true;
    }

    public final boolean mo3750b() {
        return false;
    }

    public final void mo3753c() {
        this.f18983a.f18977r = false;
        this.f18983a.f18962c.f1844a = 0;
    }
}
