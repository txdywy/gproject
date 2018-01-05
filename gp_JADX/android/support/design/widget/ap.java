package android.support.design.widget;

import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;

final class ap implements OnHierarchyChangeListener {
    public final /* synthetic */ CoordinatorLayout f793a;

    ap(CoordinatorLayout coordinatorLayout) {
        this.f793a = coordinatorLayout;
    }

    public final void onChildViewAdded(View view, View view2) {
        if (this.f793a.f629u != null) {
            this.f793a.f629u.onChildViewAdded(view, view2);
        }
    }

    public final void onChildViewRemoved(View view, View view2) {
        this.f793a.m458a(2);
        if (this.f793a.f629u != null) {
            this.f793a.f629u.onChildViewRemoved(view, view2);
        }
    }
}
