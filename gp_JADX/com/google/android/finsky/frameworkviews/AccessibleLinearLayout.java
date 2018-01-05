package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.LinearLayout;
import com.android.vending.C0629a;
import com.google.android.play.utils.h;

public class AccessibleLinearLayout extends LinearLayout {
    public final boolean f13910c;

    public AccessibleLinearLayout(Context context) {
        this(context, null);
    }

    public AccessibleLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0629a.AccessibleLinearLayout);
        this.f13910c = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        boolean dispatchPopulateAccessibilityEvent = super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.getText().clear();
        return dispatchPopulateAccessibilityEvent;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f13910c && isClickable()) {
            h.a(accessibilityNodeInfo, Button.class.getName());
        }
    }
}
