package com.google.android.wallet.common.p376a;

import java.util.Comparator;

final class C6552e implements Comparator {
    C6552e() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C6551d c6551d = (C6551d) obj;
        C6551d c6551d2 = (C6551d) obj2;
        int compare = String.CASE_INSENSITIVE_ORDER.compare(c6551d.f32647d, c6551d2.f32647d);
        if (compare != 0) {
            return compare;
        }
        if (!(c6551d.f32649f == null || c6551d2.f32649f == null)) {
            compare = String.CASE_INSENSITIVE_ORDER.compare(c6551d.f32649f.toString(), c6551d2.f32649f.toString());
            if (compare != 0) {
                return compare;
            }
        }
        return 0;
    }
}
