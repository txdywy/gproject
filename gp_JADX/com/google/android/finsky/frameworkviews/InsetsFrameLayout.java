package com.google.android.finsky.frameworkviews;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.squareup.leakcanary.C7582R;

public class InsetsFrameLayout extends FrameLayout implements ab {
    public static final boolean f14024a = (VERSION.SDK_INT >= 21);

    public InsetsFrameLayout(Context context) {
        this(context, null);
    }

    public InsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final boolean aj_() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof ab) && ((ab) childAt).aj_()) {
                return true;
            }
        }
        return false;
    }

    @TargetApi(21)
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        int i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((childAt instanceof ab) && ((ab) childAt).aj_()) {
                i = 1;
                break;
            }
        }
        i = 0;
        View childAt2;
        if (i == 0) {
            setPadding(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            for (i = 0; i < childCount; i++) {
                childAt2 = getChildAt(i);
                if (childAt2.getId() == C7582R.id.action_bar_container_container) {
                    childAt2.setPadding(0, 0, 0, 0);
                }
            }
            return windowInsets.consumeSystemWindowInsets();
        }
        setPadding(0, 0, 0, 0);
        for (int i3 = 0; i3 < childCount; i3++) {
            childAt2 = getChildAt(i3);
            int i4 = childAt2.getId() == C7582R.id.action_bar_container_container ? 1 : 0;
            if ((childAt2 instanceof ab) && ((ab) childAt2).aj_()) {
                i = 1;
            } else {
                i = 0;
            }
            if (i4 != 0 || r0 != 0) {
                childAt2.dispatchApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets.consumeSystemWindowInsets();
    }
}
