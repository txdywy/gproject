package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewGroup;

public final class av {
    public static final ay f1860a;

    @Deprecated
    public static void m1959a(ViewGroup viewGroup) {
        viewGroup.setMotionEventSplittingEnabled(false);
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            f1860a = new ax();
        } else if (VERSION.SDK_INT >= 18) {
            f1860a = new aw();
        } else {
            f1860a = new ay();
        }
    }
}
