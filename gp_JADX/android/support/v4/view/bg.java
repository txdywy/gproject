package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.p038a.C0333b;
import android.support.v7.widget.eq;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

final class bg extends C0132b {
    public final /* synthetic */ ViewPager f1880a;

    bg(ViewPager viewPager) {
        this.f1880a = viewPager;
    }

    public final void mo145a(View view, AccessibilityEvent accessibilityEvent) {
        super.mo145a(view, accessibilityEvent);
        accessibilityEvent.setClassName(ViewPager.class.getName());
        accessibilityEvent.setScrollable(m1965a());
        if (accessibilityEvent.getEventType() == eq.FLAG_APPEARED_IN_PRE_LAYOUT && this.f1880a.f1810h != null) {
            accessibilityEvent.setItemCount(this.f1880a.f1810h.mo961a());
            accessibilityEvent.setFromIndex(this.f1880a.f1811i);
            accessibilityEvent.setToIndex(this.f1880a.f1811i);
        }
    }

    public final void mo67a(View view, C0333b c0333b) {
        super.mo67a(view, c0333b);
        c0333b.m1773b(ViewPager.class.getName());
        c0333b.m1784i(m1965a());
        if (this.f1880a.canScrollHorizontally(1)) {
            c0333b.m1765a((int) eq.FLAG_APPEARED_IN_PRE_LAYOUT);
        }
        if (this.f1880a.canScrollHorizontally(-1)) {
            c0333b.m1765a(8192);
        }
    }

    public final boolean mo131a(View view, int i, Bundle bundle) {
        if (super.mo131a(view, i, bundle)) {
            return true;
        }
        switch (i) {
            case eq.FLAG_APPEARED_IN_PRE_LAYOUT /*4096*/:
                if (!this.f1880a.canScrollHorizontally(1)) {
                    return false;
                }
                this.f1880a.setCurrentItem(this.f1880a.f1811i + 1);
                return true;
            case 8192:
                if (!this.f1880a.canScrollHorizontally(-1)) {
                    return false;
                }
                this.f1880a.setCurrentItem(this.f1880a.f1811i - 1);
                return true;
            default:
                return false;
        }
    }

    private final boolean m1965a() {
        return this.f1880a.f1810h != null && this.f1880a.f1810h.mo961a() > 1;
    }
}
