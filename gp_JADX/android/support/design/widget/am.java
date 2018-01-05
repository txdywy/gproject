package android.support.design.widget;

import android.support.v4.view.ae;
import android.support.v4.view.ai;
import android.support.v4.view.ca;
import android.view.View;

final class am implements ae {
    public final /* synthetic */ CoordinatorLayout f792a;

    am(CoordinatorLayout coordinatorLayout) {
        this.f792a = coordinatorLayout;
    }

    public final ca mo123a(View view, ca caVar) {
        boolean z = true;
        int i = 0;
        CoordinatorLayout coordinatorLayout = this.f792a;
        if (cr.m774a(coordinatorLayout.f626r, caVar)) {
            return caVar;
        }
        ca caVar2;
        coordinatorLayout.f626r = caVar;
        boolean z2 = caVar != null && caVar.m2023b() > 0;
        coordinatorLayout.f627s = z2;
        if (coordinatorLayout.f627s || coordinatorLayout.getBackground() != null) {
            z = false;
        }
        coordinatorLayout.setWillNotDraw(z);
        if (!caVar.m2026e()) {
            int childCount = coordinatorLayout.getChildCount();
            caVar2 = caVar;
            while (i < childCount) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (ai.f1848a.mo397i(childAt) && ((aq) childAt.getLayoutParams()).f794a != null && caVar2.m2026e()) {
                    break;
                }
                i++;
                caVar2 = caVar2;
            }
        } else {
            caVar2 = caVar;
        }
        coordinatorLayout.requestLayout();
        return caVar2;
    }
}
