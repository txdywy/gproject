package com.google.android.play.search;

import java.lang.reflect.Array;

public final class C6408a {
    public final C6410c[] f32327a;
    public final C6410c[] f32328b;
    public final int[][] f32329c;
    public final int[][] f32330d;

    public C6408a(C6410c[] c6410cArr, C6410c[] c6410cArr2) {
        int i;
        int length = c6410cArr.length;
        int length2 = c6410cArr2.length;
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, new int[]{length + 1, length2 + 1});
        int[][] iArr2 = (int[][]) Array.newInstance(Integer.TYPE, new int[]{length + 1, length2 + 1});
        iArr[0][0] = 3;
        iArr2[0][0] = 0;
        for (i = 1; i <= length; i++) {
            iArr[i][0] = 0;
            iArr2[i][0] = i;
        }
        for (i = 1; i <= length2; i++) {
            iArr[0][i] = 1;
            iArr2[0][i] = i;
        }
        this.f32329c = iArr;
        this.f32330d = iArr2;
        this.f32327a = c6410cArr;
        this.f32328b = c6410cArr2;
    }
}
