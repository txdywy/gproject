package com.google.compression.brotli.dec;

import android.support.v7.widget.eq;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

final class C7080c {
    public static final int[] f34600a;

    static {
        int i;
        int i2 = 0;
        int[] iArr = new int[eq.FLAG_MOVED];
        f34600a = iArr;
        String str = "         !!  !                  \"#$##%#$&'##(#)#++++++++++((&*'##,---,---,-----,-----,-----&#'###.///.///./////./////./////&#'# ";
        String str2 = "A/*  ':  & : $   @";
        for (i = 0; i < 256; i++) {
            iArr[i] = i & 63;
            iArr[i + 512] = i >> 2;
            iArr[i + 1792] = (i >> 6) + 2;
        }
        for (i = 0; i < 128; i++) {
            iArr[i + MemoryMappedFileBuffer.DEFAULT_PADDING] = (str.charAt(i) - 32) * 4;
        }
        for (i = 0; i < 64; i++) {
            iArr[i + 1152] = i & 1;
            iArr[i + 1216] = (i & 1) + 2;
        }
        i = 1280;
        int i3 = 0;
        while (i3 < 19) {
            int i4 = i3 & 3;
            int charAt = str2.charAt(i3) - 32;
            int i5 = i;
            i = 0;
            while (i < charAt) {
                int i6 = i5 + 1;
                iArr[i5] = i4;
                i++;
                i5 = i6;
            }
            i3++;
            i = i5;
        }
        for (i = 0; i < 16; i++) {
            iArr[i + 1792] = 1;
            iArr[i + 2032] = 6;
        }
        iArr[1792] = 0;
        iArr[2047] = 7;
        while (i2 < 256) {
            iArr[i2 + 1536] = iArr[i2 + 1792] << 3;
            i2++;
        }
    }
}
