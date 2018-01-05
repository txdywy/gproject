package com.firebase.jobdispatcher;

public final class C0732a {
    public static final int[] f4647a = new int[]{2, 1, 4, 8};

    static int m4810a(int[] iArr) {
        int i = 0;
        if (iArr != null) {
            int i2 = 0;
            while (i2 < iArr.length) {
                int i3 = iArr[i2] | i;
                i2++;
                i = i3;
            }
        }
        return i;
    }

    static int[] m4811a(int i) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : f4647a) {
            int i42;
            if ((i & i42) == i42) {
                i42 = 1;
            } else {
                i42 = 0;
            }
            i3 += i42;
        }
        int[] iArr = new int[i3];
        int[] iArr2 = f4647a;
        int length = iArr2.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = iArr2[i5];
            if ((i & i6) == i6) {
                i42 = i2 + 1;
                iArr[i2] = i6;
            } else {
                i42 = i2;
            }
            i5++;
            i2 = i42;
        }
        return iArr;
    }
}
