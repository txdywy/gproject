package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.p040a.C0394a;

final class cn {
    public static final int[] f955a = new int[]{C0394a.colorPrimary};

    static void m768a(Context context) {
        int i = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f955a);
        if (!obtainStyledAttributes.hasValue(0)) {
            i = 1;
        }
        obtainStyledAttributes.recycle();
        if (i != 0) {
            throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
        }
    }
}
