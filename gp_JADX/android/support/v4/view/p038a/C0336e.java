package android.support.v4.view.p038a;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;

public final class C0336e {
    public final Object f1835a;

    public static C0336e m1786a(int i, int i2, int i3, int i4, boolean z) {
        if (VERSION.SDK_INT >= 21) {
            return new C0336e(CollectionItemInfo.obtain(i, i2, i3, i4, z, false));
        }
        if (VERSION.SDK_INT >= 19) {
            return new C0336e(CollectionItemInfo.obtain(i, i2, i3, i4, z));
        }
        return new C0336e(null);
    }

    private C0336e(Object obj) {
        this.f1835a = obj;
    }
}
