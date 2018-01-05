package com.google.compression.brotli.dec;

final class C7083f {
    private static int m32204a(int i, int i2) {
        int i3 = 1 << (i2 - 1);
        while ((i & i3) != 0) {
            i3 >>= 1;
        }
        return i3 + ((i3 - 1) & i);
    }

    private static void m32205a(int[] iArr, int i, int i2, int i3, int i4) {
        do {
            i3 -= i2;
            iArr[i + i3] = i4;
        } while (i3 > 0);
    }

    static void m32206a(int[] iArr, int i, int i2, int[] iArr2, int i3) {
        int i4;
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        for (i4 = 0; i4 < i3; i4++) {
            int i5 = iArr2[i4];
            iArr4[i5] = iArr4[i5] + 1;
        }
        iArr5[1] = 0;
        for (i4 = 1; i4 < 15; i4++) {
            iArr5[i4 + 1] = iArr5[i4] + iArr4[i4];
        }
        for (i4 = 0; i4 < i3; i4++) {
            if (iArr2[i4] != 0) {
                i5 = iArr2[i4];
                int i6 = iArr5[i5];
                iArr5[i5] = i6 + 1;
                iArr3[i6] = i4;
            }
        }
        int i7 = 1 << i2;
        if (iArr5[15] == 1) {
            for (i4 = 0; i4 < i7; i4++) {
                iArr[i + i4] = iArr3[0];
            }
            return;
        }
        int i8 = 1;
        int i9 = 0;
        i6 = 2;
        i4 = 0;
        while (i8 <= i2) {
            i5 = i9;
            while (iArr4[i8] > 0) {
                i9 = i4 + 1;
                C7083f.m32205a(iArr, i + i5, i6, i7, iArr3[i4] | (i8 << 16));
                i4 = C7083f.m32204a(i5, i8);
                iArr4[i8] = iArr4[i8] - 1;
                i5 = i4;
                i4 = i9;
            }
            i8++;
            i6 <<= 1;
            i9 = i5;
        }
        int i10 = i7 - 1;
        int i11 = i2 + 1;
        int i12 = 2;
        i5 = i7;
        i7 = i9;
        i9 = -1;
        i6 = i4;
        i4 = i;
        while (i11 <= 15) {
            i8 = i7;
            while (iArr4[i11] > 0) {
                if ((i8 & i10) != i9) {
                    i4 += i5;
                    i9 = 1 << (i11 - i2);
                    i5 = i11;
                    while (i5 < 15) {
                        i9 -= iArr4[i5];
                        if (i9 <= 0) {
                            break;
                        }
                        i5++;
                        i9 <<= 1;
                    }
                    i7 = i5 - i2;
                    i5 = 1 << i7;
                    i9 = i8 & i10;
                    iArr[i + i9] = ((i7 + i2) << 16) | ((i4 - i) - i9);
                }
                i7 = i6 + 1;
                C7083f.m32205a(iArr, i4 + (i8 >> i2), i12, i5, iArr3[i6] | ((i11 - i2) << 16));
                i6 = C7083f.m32204a(i8, i11);
                iArr4[i11] = iArr4[i11] - 1;
                i8 = i6;
                i6 = i7;
            }
            i11++;
            i12 <<= 1;
            i7 = i8;
        }
    }
}
