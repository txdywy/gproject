package android.support.v4.view;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.p038a.C0333b;
import android.support.v4.view.p038a.C0337f;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class C0132b {
    public static final C0346e f537b;
    public static final AccessibilityDelegate f538c = new AccessibilityDelegate();
    public final AccessibilityDelegate f539d = f537b.mo444a(this);

    public void mo1019a(View view, int i) {
        f538c.sendAccessibilityEvent(view, i);
    }

    public void mo1020b(View view, AccessibilityEvent accessibilityEvent) {
        f538c.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean mo486c(View view, AccessibilityEvent accessibilityEvent) {
        return f538c.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void mo1021d(View view, AccessibilityEvent accessibilityEvent) {
        f538c.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void mo145a(View view, AccessibilityEvent accessibilityEvent) {
        f538c.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void mo67a(View view, C0333b c0333b) {
        f538c.onInitializeAccessibilityNodeInfo(view, c0333b.f1829a);
    }

    public boolean mo485a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f538c.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public C0337f mo456a(View view) {
        return f537b.mo443a(f538c, view);
    }

    public boolean mo131a(View view, int i, Bundle bundle) {
        return f537b.mo445a(f538c, view, i, bundle);
    }

    static {
        if (VERSION.SDK_INT >= 16) {
            f537b = new C0347c();
        } else {
            f537b = new C0346e();
        }
    }
}
