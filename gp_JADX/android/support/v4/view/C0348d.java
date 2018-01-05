package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.p038a.C0333b;
import android.support.v4.view.p038a.C0337f;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

final class C0348d extends AccessibilityDelegate {
    public final /* synthetic */ C0132b f1893a;

    C0348d(C0132b c0132b) {
        this.f1893a = c0132b;
    }

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1893a.mo486c(view, accessibilityEvent);
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f1893a.mo145a(view, accessibilityEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f1893a.mo67a(view, C0333b.m1764a(accessibilityNodeInfo));
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f1893a.mo1021d(view, accessibilityEvent);
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1893a.mo485a(viewGroup, view, accessibilityEvent);
    }

    public final void sendAccessibilityEvent(View view, int i) {
        this.f1893a.mo1019a(view, i);
    }

    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f1893a.mo1020b(view, accessibilityEvent);
    }

    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C0337f a = this.f1893a.mo456a(view);
        return a != null ? (AccessibilityNodeProvider) a.f1836a : null;
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f1893a.mo131a(view, i, bundle);
    }
}
