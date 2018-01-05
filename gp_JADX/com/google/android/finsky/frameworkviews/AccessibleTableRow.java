package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TableRow;

public class AccessibleTableRow extends TableRow {
    public AccessibleTableRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AccessibleTableRow(Context context) {
        super(context);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        boolean dispatchPopulateAccessibilityEvent = super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.getText().clear();
        return dispatchPopulateAccessibilityEvent;
    }
}
