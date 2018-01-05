package com.google.android.finsky.p142j;

import android.content.Context;
import com.squareup.leakcanary.C7582R;
import java.util.Comparator;

public enum C3632i {
    ALPHABETICAL(0, C7582R.string.sort_type_alphabetical, C3623a.f17979b, 2810, true),
    LAST_UPDATED(1, C7582R.string.sort_type_last_updated, C3623a.f17983f, 2812, true),
    LAST_USAGE(2, C7582R.string.sort_type_last_usage, C3623a.f17984g, 2813, false),
    SIZE(3, C7582R.string.sort_type_size, C3623a.f17980c, 2811, false),
    DATA_USAGE(4, C7582R.string.sort_type_data_usage, C3623a.f17981d, 2840, false),
    RECOMMENDED(5, C7582R.string.sort_type_recommended, C3623a.f17982e, 2841, false);
    
    public final int f17997g;
    public final int f17998h;
    public final int f17999i;
    public final Comparator f18000j;
    public boolean f18001k;

    private C3632i(int i, int i2, Comparator comparator, int i3, boolean z) {
        this.f17997g = i;
        this.f17998h = i2;
        this.f18000j = comparator;
        this.f17999i = i3;
        this.f18001k = z;
    }

    public final String m17227a(Context context) {
        return context.getResources().getString(this.f17998h);
    }

    public static C3632i m17226a(int i) {
        Object obj = (i < 0 || i >= C3632i.values().length) ? null : 1;
        if (obj == null || !C3632i.values()[i].f18001k) {
            return ALPHABETICAL;
        }
        return C3632i.values()[i];
    }
}
