package android.support.v4.view.p038a;

import android.view.accessibility.AccessibilityNodeInfo;

final class C0339h extends C0338g {
    C0339h(C0337f c0337f) {
        super(c0337f);
    }

    public final AccessibilityNodeInfo findFocus(int i) {
        C0333b b = this.a.mo459b(i);
        if (b == null) {
            return null;
        }
        return b.f1829a;
    }
}
