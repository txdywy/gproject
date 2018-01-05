package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.p038a.C0337f;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityNodeProvider;

final class C0347c extends C0346e {
    C0347c() {
    }

    public final AccessibilityDelegate mo444a(C0132b c0132b) {
        return new C0348d(c0132b);
    }

    public final C0337f mo443a(AccessibilityDelegate accessibilityDelegate, View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = accessibilityDelegate.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C0337f(accessibilityNodeProvider);
        }
        return null;
    }

    public final boolean mo445a(AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
        return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
    }
}
