package android.support.design.widget;

import android.support.v4.view.ai;
import android.support.v4.widget.bs;
import android.view.View;

final class C0174z extends bs {
    public final /* synthetic */ BottomSheetBehavior f1007a;

    C0174z(BottomSheetBehavior bottomSheetBehavior) {
        this.f1007a = bottomSheetBehavior;
    }

    public final boolean mo173a(View view, int i) {
        if (this.f1007a.f590l == 1) {
            return false;
        }
        if (this.f1007a.f602x) {
            return false;
        }
        if (this.f1007a.f590l == 3 && this.f1007a.f600v == i) {
            View view2 = (View) this.f1007a.f597s.get();
            if (view2 != null && ai.m1835a(view2, -1)) {
                return false;
            }
        }
        return this.f1007a.f596r != null && this.f1007a.f596r.get() == view;
    }

    public final void mo174b(View view, int i) {
        this.f1007a.m432b();
    }

    public final void mo171a(int i) {
        if (i == 1) {
            this.f1007a.m436c(1);
        }
    }

    public final void mo172a(View view, float f, float f2) {
        int i;
        int i2 = 3;
        if (f2 < 0.0f) {
            if (this.f1007a.f579a) {
                i = this.f1007a.f585g;
            } else if (view.getTop() > this.f1007a.f586h) {
                i = this.f1007a.f586h;
                i2 = 6;
            } else {
                i = 0;
            }
        } else if (this.f1007a.f588j && this.f1007a.m430a(view, f2)) {
            i = this.f1007a.f595q;
            i2 = 5;
        } else if (f2 == 0.0f) {
            int top = view.getTop();
            if (this.f1007a.f579a) {
                if (Math.abs(top - this.f1007a.f585g) < Math.abs(top - this.f1007a.f587i)) {
                    i = this.f1007a.f585g;
                } else {
                    i = this.f1007a.f587i;
                    i2 = 4;
                }
            } else if (top < this.f1007a.f586h) {
                if (top < Math.abs(top - this.f1007a.f587i)) {
                    i = 0;
                } else {
                    i = this.f1007a.f586h;
                    i2 = 6;
                }
            } else if (Math.abs(top - this.f1007a.f586h) < Math.abs(top - this.f1007a.f587i)) {
                i = this.f1007a.f586h;
                i2 = 6;
            } else {
                i = this.f1007a.f587i;
                i2 = 4;
            }
        } else {
            i = this.f1007a.f587i;
            i2 = 4;
        }
        if (this.f1007a.f591m.m2260a(view.getLeft(), i)) {
            this.f1007a.m436c(2);
            ai.m1830a(view, new ac(this.f1007a, view, i2));
            return;
        }
        this.f1007a.m436c(i2);
    }

    public final int mo175c(View view, int i) {
        return bn.m702a(i, this.f1007a.m422a(), this.f1007a.f588j ? this.f1007a.f595q : this.f1007a.f587i);
    }

    public final int mo176d(View view, int i) {
        return view.getLeft();
    }

    public final int mo196a() {
        if (this.f1007a.f588j) {
            return this.f1007a.f595q;
        }
        return this.f1007a.f587i;
    }
}
