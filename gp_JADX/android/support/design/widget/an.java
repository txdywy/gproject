package android.support.design.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;

public class an {
    public an(Context context, AttributeSet attributeSet) {
    }

    public void mo118a(aq aqVar) {
    }

    public boolean mo70a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean mo71b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean mo92a(View view, View view2) {
        return false;
    }

    public boolean mo91a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public boolean mo80a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        return false;
    }

    public boolean mo69a(CoordinatorLayout coordinatorLayout, View view, int i) {
        return false;
    }

    @Deprecated
    public boolean mo95a(int i) {
        return false;
    }

    public boolean mo81a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return mo95a(i);
        }
        return false;
    }

    @Deprecated
    public void mo97b(View view, View view2) {
    }

    public void mo77a(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        if (i == 0) {
            mo97b(view, view2);
        }
    }

    @Deprecated
    public void mo122b(View view, int i) {
    }

    public void mo78a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3) {
        if (i3 == 0) {
            mo122b(view, i);
        }
    }

    @Deprecated
    public void mo94a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr) {
    }

    public void mo79a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            mo94a(coordinatorLayout, view, view2, i, i2, iArr);
        }
    }

    public boolean mo3576a(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2, boolean z) {
        return false;
    }

    public boolean mo96a(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        return false;
    }

    public boolean mo90a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        return false;
    }

    public void mo76a(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
    }

    public Parcelable mo84b(CoordinatorLayout coordinatorLayout, View view) {
        return BaseSavedState.EMPTY_STATE;
    }

    public boolean mo119a(View view, Rect rect) {
        return false;
    }
}
