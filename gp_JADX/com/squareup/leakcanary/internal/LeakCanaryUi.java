package com.squareup.leakcanary.internal;

import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;

final class LeakCanaryUi {
    public static final PorterDuffXfermode CLEAR_XFER_MODE = new PorterDuffXfermode(Mode.CLEAR);
    public static final int LEAK_COLOR = -5155506;
    public static final int LIGHT_GREY = -4539718;
    public static final int ROOT_COLOR = -8083771;

    static float dpToPixel(float f, Resources resources) {
        return resources.getDisplayMetrics().density * f;
    }

    private LeakCanaryUi() {
        throw new AssertionError();
    }
}
