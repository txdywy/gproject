package com.google.android.finsky.bf;

import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dfemodel.Document;
import java.util.List;

public final class C1600a {
    public static final int[] f8505a = new int[]{4, 0};

    public static bd m9198a(Document document) {
        for (int c : f8505a) {
            List c2 = document.m14644c(c);
            if (c2 != null && !c2.isEmpty()) {
                return (bd) c2.get(0);
            }
        }
        return null;
    }
}
