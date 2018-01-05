package android.support.v4.view;

import android.support.v4.view.p038a.C0333b;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

final class C0349f extends AccessibilityDelegate {
    public final /* synthetic */ C0132b f1894a;

    C0349f(C0132b c0132b) {
        this.f1894a = c0132b;
    }

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1894a.mo486c(view, accessibilityEvent);
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f1894a.mo145a(view, accessibilityEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f1894a.mo67a(view, C0333b.m1764a(accessibilityNodeInfo));
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f1894a.mo1021d(view, accessibilityEvent);
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1894a.mo485a(viewGroup, view, accessibilityEvent);
    }

    public final void sendAccessibilityEvent(View view, int i) {
        this.f1894a.mo1019a(view, i);
    }

    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f1894a.mo1020b(view, accessibilityEvent);
    }
}
