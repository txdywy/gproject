package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

class bs {
    bs() {
    }

    public boolean mo438a(ViewParent viewParent, View view, View view2, int i) {
        if (viewParent instanceof ab) {
            return ((ab) viewParent).onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    public void mo439b(ViewParent viewParent, View view, View view2, int i) {
        if (viewParent instanceof ab) {
            ((ab) viewParent).onNestedScrollAccepted(view, view2, i);
        }
    }

    public void mo433a(ViewParent viewParent, View view) {
        if (viewParent instanceof ab) {
            ((ab) viewParent).onStopNestedScroll(view);
        }
    }

    public void mo434a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        if (viewParent instanceof ab) {
            ((ab) viewParent).onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public void mo435a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        if (viewParent instanceof ab) {
            ((ab) viewParent).onNestedPreScroll(view, i, i2, iArr);
        }
    }

    public boolean mo437a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        if (viewParent instanceof ab) {
            return ((ab) viewParent).onNestedFling(view, f, f2, z);
        }
        return false;
    }

    public boolean mo436a(ViewParent viewParent, View view, float f, float f2) {
        if (viewParent instanceof ab) {
            return ((ab) viewParent).onNestedPreFling(view, f, f2);
        }
        return false;
    }
}
