package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.android.vending.C0629a;
import com.google.android.play.k;
import com.google.android.play.utils.h;

public class AccessibleTextView extends TextView {
    public final String f16157a;

    public AccessibleTextView(Context context) {
        this(context, null);
    }

    public AccessibleTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccessibleTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0629a.AccessibleTextView);
        this.f16157a = obtainStyledAttributes.getString(k.PlayAccessibilityHelper_playAccessibilityClassOverride);
        obtainStyledAttributes.recycle();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (isShown()) {
            CharSequence text = getText();
            if (TextUtils.isEmpty(text)) {
                text = getHint();
            }
            if (!TextUtils.isEmpty(text)) {
                if (text.length() > 500) {
                    text = text.subSequence(0, 501);
                }
                accessibilityEvent.getText().add(text.toString().toLowerCase());
            }
        }
        return false;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        h.a(accessibilityNodeInfo, this.f16157a);
    }
}
