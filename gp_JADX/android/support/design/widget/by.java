package android.support.design.widget;

import android.support.v4.view.ai;
import android.support.v4.widget.bs;
import android.view.View;
import android.view.ViewParent;

final class by extends bs {
    public int f907a;
    public int f908b = -1;
    public final /* synthetic */ SwipeDismissBehavior f909c;

    by(SwipeDismissBehavior swipeDismissBehavior) {
        this.f909c = swipeDismissBehavior;
    }

    public final boolean mo173a(View view, int i) {
        return this.f908b == -1 && this.f909c.mo192a(view);
    }

    public final void mo177e(View view, int i) {
        this.f908b = i;
        this.f907a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public final void mo171a(int i) {
        if (this.f909c.f666c != null) {
            this.f909c.f666c.mo187a(i);
        }
    }

    public final void mo172a(View view, float f, float f2) {
        boolean z;
        int i;
        boolean z2 = true;
        this.f908b = -1;
        int width = view.getWidth();
        if (f != 0.0f) {
            z = ai.f1848a.mo400k(view) == 1;
            z = this.f909c.f670g == 2 ? true : this.f909c.f670g == 0 ? z ? f < 0.0f : f > 0.0f : this.f909c.f670g == 1 ? z ? f > 0.0f : f < 0.0f : false;
        } else {
            z = Math.abs(view.getLeft() - this.f907a) >= Math.round(((float) view.getWidth()) * this.f909c.f671h);
        }
        if (!z) {
            i = this.f907a;
            z2 = false;
        } else if (view.getLeft() < this.f907a) {
            i = this.f907a - width;
        } else {
            i = this.f907a + width;
        }
        if (this.f909c.f665b.m2260a(i, view.getTop())) {
            ai.m1830a(view, new ca(this.f909c, view, z2));
        } else if (z2 && this.f909c.f666c != null) {
            this.f909c.f666c.mo188a(view);
        }
    }

    public final int mo170a(View view) {
        return view.getWidth();
    }

    public final int mo176d(View view, int i) {
        int width;
        int i2;
        Object obj = ai.f1848a.mo400k(view) == 1 ? 1 : null;
        if (this.f909c.f670g == 0) {
            if (obj != null) {
                width = this.f907a - view.getWidth();
                i2 = this.f907a;
            } else {
                width = this.f907a;
                i2 = this.f907a + view.getWidth();
            }
        } else if (this.f909c.f670g != 1) {
            width = this.f907a - view.getWidth();
            i2 = this.f907a + view.getWidth();
        } else if (obj != null) {
            width = this.f907a;
            i2 = this.f907a + view.getWidth();
        } else {
            width = this.f907a - view.getWidth();
            i2 = this.f907a;
        }
        return Math.min(Math.max(width, i), i2);
    }

    public final int mo175c(View view, int i) {
        return view.getTop();
    }

    public final void mo174b(View view, int i) {
        float width = ((float) this.f907a) + (((float) view.getWidth()) * this.f909c.f672i);
        float width2 = ((float) this.f907a) + (((float) view.getWidth()) * this.f909c.f673j);
        if (((float) i) <= width) {
            view.setAlpha(1.0f);
        } else if (((float) i) >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(SwipeDismissBehavior.m503a(1.0f - ((((float) i) - width) / (width2 - width))));
        }
    }
}
