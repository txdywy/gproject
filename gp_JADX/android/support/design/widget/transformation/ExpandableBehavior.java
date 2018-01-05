package android.support.design.widget.transformation;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.an;
import android.support.design.widget.p024a.C0136a;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

public abstract class ExpandableBehavior extends an {
    public int f980a = 0;

    protected abstract boolean mo193a(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean mo69a(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (!ai.f1848a.mo409s(view)) {
            C0136a c0136a;
            List b = coordinatorLayout.m465b(view);
            int size = b.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = (View) b.get(i2);
                if (mo92a(view, view2)) {
                    c0136a = (C0136a) view2;
                    break;
                }
            }
            c0136a = null;
            if (c0136a != null && m794a(c0136a.mo120a())) {
                this.f980a = c0136a.mo120a() ? 1 : 2;
                view.getViewTreeObserver().addOnPreDrawListener(new C0163a(this, view, this.f980a, c0136a));
            }
        }
        return false;
    }

    public final boolean mo91a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        C0136a c0136a = (C0136a) view2;
        if (!m794a(c0136a.mo120a())) {
            return false;
        }
        this.f980a = c0136a.mo120a() ? 1 : 2;
        return mo193a((View) c0136a, view, c0136a.mo120a(), true);
    }

    private final boolean m794a(boolean z) {
        if (z) {
            if (this.f980a == 0 || this.f980a == 2) {
                return true;
            }
            return false;
        } else if (this.f980a == 1) {
            return true;
        } else {
            return false;
        }
    }
}
