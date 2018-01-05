package com.google.android.finsky.ab;

import java.util.Arrays;

public final class C0970b {
    public final int[] f5938a;
    public final int f5939b;
    public final int f5940c;

    public C0970b(int[] iArr, int i, int i2) {
        this.f5938a = iArr;
        this.f5939b = i;
        this.f5940c = i2;
    }

    public final String toString() {
        return String.format("ContentFilterSelection{authorityId=%s, level=%s, documentTypes=%s}", new Object[]{Integer.valueOf(this.f5939b), Integer.valueOf(this.f5940c), Arrays.toString(this.f5938a)});
    }
}
