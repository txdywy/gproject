package com.google.android.finsky.bf;

import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.dfemodel.Document;
import java.util.List;

public static class com.google.android.finsky.bf.a
{

    public static final int[] a;

    static {
        com.google.android.finsky.bf.a.a = new int[2]{4, 0};
    }

    a() {
    }

    public static com.google.android.finsky.cv.a.bd a(Document p0) {
        v0 = 0;
        while (v0 < com.google.android.finsky.bf.a.a.length) {
            v4 = p0.c(com.google.android.finsky.bf.a.a[v0]);
            if (v4 != 0) {
                if (!v4.isEmpty()) {
                    v0 = (com.google.android.finsky.cv.a.bd)v4.get(0);
                    return v0;
                }
            }
            v0 = v0 + 1;
        }
        v0 = 0;
        return v0;
    }

}
