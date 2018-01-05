package android.support.design.p022d;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.support.v7.p041b.p042a.C0436b;

public final class C0120a {
    public static ColorStateList m232a(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList a = C0436b.m2649a(context, resourceId);
                if (a != null) {
                    return a;
                }
            }
        }
        return typedArray.getColorStateList(i);
    }
}
