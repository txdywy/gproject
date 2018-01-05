package com.google.android.finsky.utils;

import com.google.android.finsky.dfemodel.C2723n;
import com.squareup.leakcanary.C7582R;

public final class ak {
    public static final al[] f24035a = new al[]{new al(4, C7582R.string.reviews_sort_by_helpfulness), new al(0, C7582R.string.reviews_sort_by_date), new al(1, C7582R.string.reviews_sort_by_rating)};

    public static int m21702a(C2723n c2723n) {
        int i = c2723n.f14938f;
        for (int i2 = 0; i2 < f24035a.length; i2++) {
            if (i == f24035a[i2].f24036a) {
                return i2;
            }
        }
        return -1;
    }

    public static int m21701a(int i) {
        if (i < 0 || i >= f24035a.length) {
            return -1;
        }
        return f24035a[i].f24036a;
    }
}
