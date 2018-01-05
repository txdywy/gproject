package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

public final class bp {
    public static final bs f1882a;

    @Deprecated
    public static boolean m1976a(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public static boolean m1975a(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof ac) {
            return ((ac) viewParent).mo109b(view, i, i2);
        }
        if (i2 == 0) {
            return f1882a.mo438a(viewParent, view, view2, i);
        }
        return false;
    }

    public static void m1977b(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof ac) {
            ((ac) viewParent).mo108b(view2, i);
        } else if (i2 == 0) {
            f1882a.mo439b(viewParent, view, view2, i);
        }
    }

    public static void m1972a(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof ac) {
            ((ac) viewParent).mo110c(view, i);
        } else if (i == 0) {
            f1882a.mo433a(viewParent, view);
        }
    }

    public static void m1973a(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5) {
        if (viewParent instanceof ac) {
            ((ac) viewParent).mo106a(view, i2, i4, i5);
        } else if (i5 == 0) {
            f1882a.mo434a(viewParent, view, i, i2, i3, i4);
        }
    }

    public static void m1974a(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof ac) {
            ((ac) viewParent).mo107a(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            f1882a.mo435a(viewParent, view, i, i2, iArr);
        }
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            f1882a = new br();
        } else if (VERSION.SDK_INT >= 19) {
            f1882a = new bq();
        } else {
            f1882a = new bs();
        }
    }
}
