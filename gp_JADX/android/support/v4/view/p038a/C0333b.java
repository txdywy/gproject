package android.support.v4.view.p038a;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v7.widget.eq;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class C0333b {
    public final AccessibilityNodeInfo f1829a;
    public int f1830b = -1;

    private C0333b(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f1829a = accessibilityNodeInfo;
    }

    public static C0333b m1764a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C0333b(accessibilityNodeInfo);
    }

    public static C0333b m1763a(C0333b c0333b) {
        return C0333b.m1764a(AccessibilityNodeInfo.obtain(c0333b.f1829a));
    }

    public final void m1765a(int i) {
        this.f1829a.addAction(i);
    }

    public final boolean m1771a(C0334c c0334c) {
        if (VERSION.SDK_INT >= 21) {
            return this.f1829a.removeAction((AccessibilityAction) c0334c.f1833c);
        }
        return false;
    }

    public final void m1767a(View view) {
        this.f1829a.setParent(view);
    }

    public final void m1766a(Rect rect) {
        this.f1829a.getBoundsInParent(rect);
    }

    public final void m1772b(Rect rect) {
        this.f1829a.setBoundsInParent(rect);
    }

    public final void m1775c(Rect rect) {
        this.f1829a.getBoundsInScreen(rect);
    }

    public final void m1778d(Rect rect) {
        this.f1829a.setBoundsInScreen(rect);
    }

    public final void m1770a(boolean z) {
        this.f1829a.setCheckable(z);
    }

    public final void m1774b(boolean z) {
        this.f1829a.setChecked(z);
    }

    public final void m1777c(boolean z) {
        this.f1829a.setFocusable(z);
    }

    public final void m1779d(boolean z) {
        this.f1829a.setFocused(z);
    }

    public final void m1780e(boolean z) {
        if (VERSION.SDK_INT >= 16) {
            this.f1829a.setVisibleToUser(z);
        }
    }

    public final void m1781f(boolean z) {
        if (VERSION.SDK_INT >= 16) {
            this.f1829a.setAccessibilityFocused(z);
        }
    }

    public final void m1782g(boolean z) {
        this.f1829a.setClickable(z);
    }

    public final void m1783h(boolean z) {
        this.f1829a.setEnabled(z);
    }

    public final void m1784i(boolean z) {
        this.f1829a.setScrollable(z);
    }

    public final void m1768a(CharSequence charSequence) {
        this.f1829a.setPackageName(charSequence);
    }

    public final void m1773b(CharSequence charSequence) {
        this.f1829a.setClassName(charSequence);
    }

    public final void m1776c(CharSequence charSequence) {
        this.f1829a.setContentDescription(charSequence);
    }

    public final void m1769a(Object obj) {
        if (VERSION.SDK_INT >= 19) {
            this.f1829a.setCollectionItemInfo((CollectionItemInfo) ((C0336e) obj).f1835a);
        }
    }

    public final void m1785j(boolean z) {
        if (VERSION.SDK_INT >= 19) {
            this.f1829a.setDismissable(z);
        }
    }

    public final int hashCode() {
        return this.f1829a == null ? 0 : this.f1829a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        C0333b c0333b = (C0333b) obj;
        if (this.f1829a == null) {
            if (c0333b.f1829a != null) {
                return false;
            }
            return true;
        } else if (this.f1829a.equals(c0333b.f1829a)) {
            return true;
        } else {
            return false;
        }
    }

    public final String toString() {
        String viewIdResourceName;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        Rect rect = new Rect();
        m1766a(rect);
        stringBuilder.append("; boundsInParent: " + rect);
        m1775c(rect);
        stringBuilder.append("; boundsInScreen: " + rect);
        stringBuilder.append("; packageName: ").append(this.f1829a.getPackageName());
        stringBuilder.append("; className: ").append(this.f1829a.getClassName());
        stringBuilder.append("; text: ").append(this.f1829a.getText());
        stringBuilder.append("; contentDescription: ").append(this.f1829a.getContentDescription());
        StringBuilder append = stringBuilder.append("; viewId: ");
        if (VERSION.SDK_INT >= 18) {
            viewIdResourceName = this.f1829a.getViewIdResourceName();
        } else {
            viewIdResourceName = null;
        }
        append.append(viewIdResourceName);
        stringBuilder.append("; checkable: ").append(this.f1829a.isCheckable());
        stringBuilder.append("; checked: ").append(this.f1829a.isChecked());
        stringBuilder.append("; focusable: ").append(this.f1829a.isFocusable());
        stringBuilder.append("; focused: ").append(this.f1829a.isFocused());
        stringBuilder.append("; selected: ").append(this.f1829a.isSelected());
        stringBuilder.append("; clickable: ").append(this.f1829a.isClickable());
        stringBuilder.append("; longClickable: ").append(this.f1829a.isLongClickable());
        stringBuilder.append("; enabled: ").append(this.f1829a.isEnabled());
        stringBuilder.append("; password: ").append(this.f1829a.isPassword());
        stringBuilder.append("; scrollable: " + this.f1829a.isScrollable());
        stringBuilder.append("; [");
        int actions = this.f1829a.getActions();
        while (actions != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(actions);
            int i = (numberOfTrailingZeros ^ -1) & actions;
            switch (numberOfTrailingZeros) {
                case 1:
                    viewIdResourceName = "ACTION_FOCUS";
                    break;
                case 2:
                    viewIdResourceName = "ACTION_CLEAR_FOCUS";
                    break;
                case 4:
                    viewIdResourceName = "ACTION_SELECT";
                    break;
                case 8:
                    viewIdResourceName = "ACTION_CLEAR_SELECTION";
                    break;
                case 16:
                    viewIdResourceName = "ACTION_CLICK";
                    break;
                case 32:
                    viewIdResourceName = "ACTION_LONG_CLICK";
                    break;
                case 64:
                    viewIdResourceName = "ACTION_ACCESSIBILITY_FOCUS";
                    break;
                case 128:
                    viewIdResourceName = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    break;
                case 256:
                    viewIdResourceName = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    break;
                case 512:
                    viewIdResourceName = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    break;
                case MemoryMappedFileBuffer.DEFAULT_PADDING /*1024*/:
                    viewIdResourceName = "ACTION_NEXT_HTML_ELEMENT";
                    break;
                case eq.FLAG_MOVED /*2048*/:
                    viewIdResourceName = "ACTION_PREVIOUS_HTML_ELEMENT";
                    break;
                case eq.FLAG_APPEARED_IN_PRE_LAYOUT /*4096*/:
                    viewIdResourceName = "ACTION_SCROLL_FORWARD";
                    break;
                case 8192:
                    viewIdResourceName = "ACTION_SCROLL_BACKWARD";
                    break;
                case 16384:
                    viewIdResourceName = "ACTION_COPY";
                    break;
                case 32768:
                    viewIdResourceName = "ACTION_PASTE";
                    break;
                case 65536:
                    viewIdResourceName = "ACTION_CUT";
                    break;
                case 131072:
                    viewIdResourceName = "ACTION_SET_SELECTION";
                    break;
                default:
                    viewIdResourceName = "ACTION_UNKNOWN";
                    break;
            }
            stringBuilder.append(viewIdResourceName);
            if (i != 0) {
                stringBuilder.append(", ");
            }
            actions = i;
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
