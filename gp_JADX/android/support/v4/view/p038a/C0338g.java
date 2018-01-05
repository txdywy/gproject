package android.support.v4.view.p038a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

class C0338g extends AccessibilityNodeProvider {
    public final C0337f f1837a;

    C0338g(C0337f c0337f) {
        this.f1837a = c0337f;
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C0333b a = this.f1837a.mo457a(i);
        if (a == null) {
            return null;
        }
        return a.f1829a;
    }

    public List findAccessibilityNodeInfosByText(String str, int i) {
        return null;
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        return this.f1837a.mo458a(i, i2, bundle);
    }
}
