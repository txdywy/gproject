package android.support.v4.widget;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.view.C0132b;
import android.support.v4.view.ai;
import android.support.v4.view.bp;
import android.support.v4.view.p038a.C0333b;
import android.support.v4.view.p038a.C0337f;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;

public abstract class ae extends C0132b {
    public static final Rect f2062a = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public final Rect f2063e = new Rect();
    public final Rect f2064f = new Rect();
    public final Rect f2065g = new Rect();
    public final int[] f2066h = new int[2];
    public final AccessibilityManager f2067i;
    public final View f2068j;
    public ah f2069k;
    public int f2070l = Integer.MIN_VALUE;
    public int f2071m = Integer.MIN_VALUE;
    public int f2072n = Integer.MIN_VALUE;

    public ae(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f2068j = view;
        this.f2067i = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (ai.f1848a.mo392d(view) == 0) {
            ai.m1838b(view, 1);
        }
    }

    public abstract int mo1022a(float f, float f2);

    public abstract void mo1023a(int i, C0333b c0333b);

    public abstract void mo1025a(List list);

    public abstract boolean mo1026b(int i, int i2);

    public final C0337f mo456a(View view) {
        if (this.f2069k == null) {
            this.f2069k = new ah(this);
        }
        return this.f2069k;
    }

    public final boolean m2170a(MotionEvent motionEvent) {
        if (!this.f2067i.isEnabled() || !this.f2067i.isTouchExplorationEnabled()) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 7:
            case 9:
                int a = mo1022a(motionEvent.getX(), motionEvent.getY());
                m2161d(a);
                if (a == Integer.MIN_VALUE) {
                    return false;
                }
                return true;
            case 10:
                if (this.f2070l == Integer.MIN_VALUE) {
                    return false;
                }
                m2161d(Integer.MIN_VALUE);
                return true;
            default:
                return false;
        }
    }

    public final boolean m2169a(int i, int i2) {
        if (i == Integer.MIN_VALUE || !this.f2067i.isEnabled()) {
            return false;
        }
        ViewParent parent = this.f2068j.getParent();
        if (parent == null) {
            return false;
        }
        AccessibilityEvent obtain;
        switch (i) {
            case -1:
                obtain = AccessibilityEvent.obtain(i2);
                this.f2068j.onInitializeAccessibilityEvent(obtain);
                break;
            default:
                obtain = AccessibilityEvent.obtain(i2);
                C0333b a = m2164a(i);
                obtain.getText().add(a.f1829a.getText());
                obtain.setContentDescription(a.f1829a.getContentDescription());
                obtain.setScrollable(a.f1829a.isScrollable());
                obtain.setPassword(a.f1829a.isPassword());
                obtain.setEnabled(a.f1829a.isEnabled());
                obtain.setChecked(a.f1829a.isChecked());
                mo1024a(i, obtain);
                if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
                    obtain.setClassName(a.f1829a.getClassName());
                    View view = this.f2068j;
                    if (VERSION.SDK_INT >= 16) {
                        obtain.setSource(view, i);
                    }
                    obtain.setPackageName(this.f2068j.getContext().getPackageName());
                    break;
                }
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                break;
        }
        return bp.m1976a(parent, this.f2068j, obtain);
    }

    private final void m2161d(int i) {
        if (this.f2072n != i) {
            int i2 = this.f2072n;
            this.f2072n = i;
            m2169a(i, 128);
            m2169a(i2, 256);
        }
    }

    final C0333b m2164a(int i) {
        if (i != -1) {
            return m2162e(i);
        }
        C0333b a = C0333b.m1764a(AccessibilityNodeInfo.obtain(this.f2068j));
        ai.m1827a(this.f2068j, a);
        List arrayList = new ArrayList();
        mo1025a(arrayList);
        if (a.f1829a.getChildCount() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = this.f2068j;
                int intValue = ((Integer) arrayList.get(i2)).intValue();
                if (VERSION.SDK_INT >= 16) {
                    a.f1829a.addChild(view, intValue);
                }
            }
            return a;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    private final C0333b m2162e(int i) {
        C0333b a = C0333b.m1764a(AccessibilityNodeInfo.obtain());
        a.m1783h(true);
        a.m1777c(true);
        a.m1773b((CharSequence) "android.view.View");
        a.m1772b(f2062a);
        a.m1778d(f2062a);
        a.m1767a(this.f2068j);
        mo1023a(i, a);
        if (a.f1829a.getText() == null && a.f1829a.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        a.m1766a(this.f2064f);
        if (this.f2064f.equals(f2062a)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = a.f1829a.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        } else if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        } else {
            boolean z;
            a.m1768a(this.f2068j.getContext().getPackageName());
            View view = this.f2068j;
            if (VERSION.SDK_INT >= 16) {
                a.f1829a.setSource(view, i);
            }
            if (this.f2070l == i) {
                a.m1781f(true);
                a.m1765a(128);
            } else {
                a.m1781f(false);
                a.m1765a(64);
            }
            if (this.f2071m == i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                a.m1765a(2);
            } else if (a.f1829a.isFocusable()) {
                a.m1765a(1);
            }
            a.m1779d(z);
            this.f2068j.getLocationOnScreen(this.f2066h);
            a.m1775c(this.f2063e);
            if (this.f2063e.equals(f2062a)) {
                a.m1766a(this.f2063e);
                if (a.f1830b != -1) {
                    C0333b a2 = C0333b.m1764a(AccessibilityNodeInfo.obtain());
                    for (actions = a.f1830b; actions != -1; actions = a2.f1830b) {
                        View view2 = this.f2068j;
                        a2.f1830b = -1;
                        if (VERSION.SDK_INT >= 16) {
                            a2.f1829a.setParent(view2, -1);
                        }
                        a2.m1772b(f2062a);
                        mo1023a(actions, a2);
                        a2.m1766a(this.f2064f);
                        this.f2063e.offset(this.f2064f.left, this.f2064f.top);
                    }
                    a2.f1829a.recycle();
                }
                this.f2063e.offset(this.f2066h[0] - this.f2068j.getScrollX(), this.f2066h[1] - this.f2068j.getScrollY());
            }
            if (this.f2068j.getLocalVisibleRect(this.f2065g)) {
                this.f2065g.offset(this.f2066h[0] - this.f2068j.getScrollX(), this.f2066h[1] - this.f2068j.getScrollY());
                if (this.f2063e.intersect(this.f2065g)) {
                    a.m1778d(this.f2063e);
                    if (m2160a(this.f2063e)) {
                        a.m1780e(true);
                    }
                }
            }
            return a;
        }
    }

    private final boolean m2160a(Rect rect) {
        if (rect == null || rect.isEmpty()) {
            return false;
        }
        if (this.f2068j.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.f2068j.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    final boolean m2171b(int i) {
        if (this.f2070l != i) {
            return false;
        }
        this.f2070l = Integer.MIN_VALUE;
        this.f2068j.invalidate();
        m2169a(i, 65536);
        return true;
    }

    public final boolean m2173c(int i) {
        if (this.f2071m != i) {
            return false;
        }
        this.f2071m = Integer.MIN_VALUE;
        m2169a(i, 8);
        return true;
    }

    public void mo1024a(int i, AccessibilityEvent accessibilityEvent) {
    }

    static {
        af afVar = new af();
        ag agVar = new ag();
    }
}
