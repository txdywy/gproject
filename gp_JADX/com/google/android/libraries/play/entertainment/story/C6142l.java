package com.google.android.libraries.play.entertainment.story;

import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

final class C6142l extends AccessibilityDelegate {
    C6142l() {
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }
}
