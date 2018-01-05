package android.support.v7.widget;

import android.support.v4.view.ai;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

final class ek implements bt {
    public final /* synthetic */ RecyclerView f3431a;

    ek(RecyclerView recyclerView) {
        this.f3431a = recyclerView;
    }

    public final int mo847a() {
        return this.f3431a.getChildCount();
    }

    public final void mo850a(View view, int i) {
        this.f3431a.addView(view, i);
        RecyclerView recyclerView = this.f3431a;
        RecyclerView.m261c(view);
        if (recyclerView.f504L != null) {
            for (int size = recyclerView.f504L.size() - 1; size >= 0; size--) {
                ((fb) recyclerView.f504L.get(size)).m3666a();
            }
        }
    }

    public final int mo848a(View view) {
        return this.f3431a.indexOfChild(view);
    }

    public final void mo849a(int i) {
        View childAt = this.f3431a.getChildAt(i);
        if (childAt != null) {
            this.f3431a.m308h(childAt);
            childAt.clearAnimation();
        }
        this.f3431a.removeViewAt(i);
    }

    public final View mo853b(int i) {
        return this.f3431a.getChildAt(i);
    }

    public final void mo854b() {
        int childCount = this.f3431a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View b = mo853b(i);
            this.f3431a.m308h(b);
            b.clearAnimation();
        }
        this.f3431a.removeAllViews();
    }

    public final fr mo852b(View view) {
        return RecyclerView.m261c(view);
    }

    public final void mo851a(View view, int i, LayoutParams layoutParams) {
        fr c = RecyclerView.m261c(view);
        if (c != null) {
            if (c.m3277n() || c.m3265b()) {
                c.m3272i();
            } else {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + c + this.f3431a.m276a());
            }
        }
        this.f3431a.attachViewToParent(view, i, layoutParams);
    }

    public final void mo855c(int i) {
        View b = mo853b(i);
        if (b != null) {
            fr c = RecyclerView.m261c(b);
            if (c != null) {
                if (!c.m3277n() || c.m3265b()) {
                    c.m3264b(256);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + c + this.f3431a.m276a());
                }
            }
        }
        this.f3431a.detachViewFromParent(i);
    }

    public final void mo856c(View view) {
        fr c = RecyclerView.m261c(view);
        if (c != null) {
            RecyclerView recyclerView = this.f3431a;
            c.f3226q = ai.f1848a.mo392d(c.f3211a);
            recyclerView.m286a(c, 4);
        }
    }

    public final void mo857d(View view) {
        fr c = RecyclerView.m261c(view);
        if (c != null) {
            this.f3431a.m286a(c, c.f3226q);
            c.f3226q = 0;
        }
    }
}
