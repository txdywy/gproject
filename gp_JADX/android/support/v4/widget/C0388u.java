package android.support.v4.widget;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.view.C0132b;
import android.support.v4.view.C0357n;
import android.support.v4.view.ai;
import android.support.v4.view.p038a.C0333b;
import android.support.v4.view.p038a.C0334c;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

final class C0388u extends C0132b {
    public final Rect f2188a = new Rect();
    public final /* synthetic */ DrawerLayout f2189e;

    C0388u(DrawerLayout drawerLayout) {
        this.f2189e = drawerLayout;
    }

    public final void mo67a(View view, C0333b c0333b) {
        if (DrawerLayout.f1935c) {
            super.mo67a(view, c0333b);
        } else {
            boolean isVisibleToUser;
            C0333b a = C0333b.m1763a(c0333b);
            super.mo67a(view, a);
            c0333b.f1829a.setSource(view);
            ViewParent e = ai.f1848a.mo393e(view);
            if (e instanceof View) {
                c0333b.m1767a((View) e);
            }
            Rect rect = this.f2188a;
            a.m1766a(rect);
            c0333b.m1772b(rect);
            a.m1775c(rect);
            c0333b.m1778d(rect);
            if (VERSION.SDK_INT >= 16) {
                isVisibleToUser = a.f1829a.isVisibleToUser();
            } else {
                isVisibleToUser = false;
            }
            c0333b.m1780e(isVisibleToUser);
            c0333b.m1768a(a.f1829a.getPackageName());
            c0333b.m1773b(a.f1829a.getClassName());
            c0333b.m1776c(a.f1829a.getContentDescription());
            c0333b.m1783h(a.f1829a.isEnabled());
            c0333b.m1782g(a.f1829a.isClickable());
            c0333b.m1777c(a.f1829a.isFocusable());
            c0333b.m1779d(a.f1829a.isFocused());
            if (VERSION.SDK_INT >= 16) {
                isVisibleToUser = a.f1829a.isAccessibilityFocused();
            } else {
                isVisibleToUser = false;
            }
            c0333b.m1781f(isVisibleToUser);
            c0333b.f1829a.setSelected(a.f1829a.isSelected());
            c0333b.f1829a.setLongClickable(a.f1829a.isLongClickable());
            c0333b.m1765a(a.f1829a.getActions());
            a.f1829a.recycle();
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.m2092h(childAt)) {
                    c0333b.f1829a.addChild(childAt);
                }
            }
        }
        c0333b.m1773b(DrawerLayout.class.getName());
        c0333b.m1777c(false);
        c0333b.m1779d(false);
        c0333b.m1771a(C0334c.f1831a);
        c0333b.m1771a(C0334c.f1832b);
    }

    public final void mo145a(View view, AccessibilityEvent accessibilityEvent) {
        super.mo145a(view, accessibilityEvent);
        accessibilityEvent.setClassName(DrawerLayout.class.getName());
    }

    public final boolean mo486c(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return super.mo486c(view, accessibilityEvent);
        }
        List text = accessibilityEvent.getText();
        View c = this.f2189e.m2101c();
        if (c != null) {
            Object obj;
            int c2 = this.f2189e.m2100c(c);
            View view2 = this.f2189e;
            c2 = C0357n.m2043a(c2, ai.f1848a.mo400k(view2));
            if (c2 == 3) {
                obj = view2.f1940D;
            } else if (c2 == 5) {
                obj = view2.f1941E;
            } else {
                obj = null;
            }
            if (obj != null) {
                text.add(obj);
            }
        }
        return true;
    }

    public final boolean mo485a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (DrawerLayout.f1935c || DrawerLayout.m2092h(view)) {
            return super.mo485a(viewGroup, view, accessibilityEvent);
        }
        return false;
    }
}
