package com.google.android.finsky.setup;

import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.utils.C4680k;

final class br {
    public static final int[] f20876a = m19293a();

    private static int[] m19293a() {
        String[] a = C4680k.m21818a((String) C0955b.bq.m28964b());
        int[] iArr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            try {
                iArr[i] = Integer.valueOf(a[i]).intValue();
            } catch (NumberFormatException e) {
                iArr[i] = Integer.MIN_VALUE;
            }
        }
        return iArr;
    }
}
