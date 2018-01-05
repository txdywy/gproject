package android.support.v4.widget;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.C0132b;
import android.support.v4.view.p038a.C0333b;
import android.support.v7.widget.eq;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;

final class an extends C0132b {
    an() {
    }

    public final boolean mo131a(View view, int i, Bundle bundle) {
        if (super.mo131a(view, i, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        int min;
        switch (i) {
            case eq.FLAG_APPEARED_IN_PRE_LAYOUT /*4096*/:
                min = Math.min(((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()) + nestedScrollView.getScrollY(), nestedScrollView.m2126a());
                if (min == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.m2128b(min);
                return true;
            case 8192:
                min = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (min == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.m2128b(min);
                return true;
            default:
                return false;
        }
    }

    public final void mo67a(View view, C0333b c0333b) {
        super.mo67a(view, c0333b);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        c0333b.m1773b(ScrollView.class.getName());
        if (nestedScrollView.isEnabled()) {
            int a = nestedScrollView.m2126a();
            if (a > 0) {
                c0333b.m1784i(true);
                if (nestedScrollView.getScrollY() > 0) {
                    c0333b.m1765a(8192);
                }
                if (nestedScrollView.getScrollY() < a) {
                    c0333b.m1765a((int) eq.FLAG_APPEARED_IN_PRE_LAYOUT);
                }
            }
        }
    }

    public final void mo145a(View view, AccessibilityEvent accessibilityEvent) {
        super.mo145a(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.m2126a() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        int scrollX = nestedScrollView.getScrollX();
        if (VERSION.SDK_INT >= 15) {
            accessibilityEvent.setMaxScrollX(scrollX);
        }
        scrollX = nestedScrollView.m2126a();
        if (VERSION.SDK_INT >= 15) {
            accessibilityEvent.setMaxScrollY(scrollX);
        }
    }
}
