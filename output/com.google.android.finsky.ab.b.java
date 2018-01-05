package com.google.android.finsky.ab;

import java.util.Arrays;

public final class com.google.android.finsky.ab.b
{

    public final int[] a;
    public final int b;
    public final int c;

    b(int[] p0, int p1, int p2) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
    }

    public final String toString() {
        v1 = new Object[3];
        v1[0] = Integer.valueOf(this.b);
        v1[1] = Integer.valueOf(this.c);
        v1[2] = Arrays.toString(this.a);
        return String.format("ContentFilterSelection{authorityId=%s, level=%s, documentTypes=%s}", v1);
    }

}
