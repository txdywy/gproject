package com.google.android.gms.internal;

final class wk extends wj {
    wk() {
    }

    final int mo4946a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        int i4 = i + i2;
        while (i3 < length && i3 + i < i4) {
            char charAt = charSequence.charAt(i3);
            if (charAt >= '') {
                break;
            }
            bArr[i + i3] = (byte) charAt;
            i3++;
        }
        if (i3 == length) {
            return i + length;
        }
        int i5 = i + i3;
        while (i3 < length) {
            int i6;
            char charAt2 = charSequence.charAt(i3);
            if (charAt2 < '' && i5 < i4) {
                i6 = i5 + 1;
                bArr[i5] = (byte) charAt2;
            } else if (charAt2 < 'ࠀ' && i5 <= i4 - 2) {
                r6 = i5 + 1;
                bArr[i5] = (byte) ((charAt2 >>> 6) | 960);
                i6 = r6 + 1;
                bArr[r6] = (byte) ((charAt2 & 63) | 128);
            } else if ((charAt2 < '?' || '?' < charAt2) && i5 <= i4 - 3) {
                i6 = i5 + 1;
                bArr[i5] = (byte) ((charAt2 >>> 12) | 480);
                i5 = i6 + 1;
                bArr[i6] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i6 = i5 + 1;
                bArr[i5] = (byte) ((charAt2 & 63) | 128);
            } else if (i5 <= i4 - 4) {
                if (i3 + 1 != charSequence.length()) {
                    i3++;
                    charAt = charSequence.charAt(i3);
                    if (Character.isSurrogatePair(charAt2, charAt)) {
                        int toCodePoint = Character.toCodePoint(charAt2, charAt);
                        i6 = i5 + 1;
                        bArr[i5] = (byte) ((toCodePoint >>> 18) | 240);
                        i5 = i6 + 1;
                        bArr[i6] = (byte) (((toCodePoint >>> 12) & 63) | 128);
                        r6 = i5 + 1;
                        bArr[i5] = (byte) (((toCodePoint >>> 6) & 63) | 128);
                        i6 = r6 + 1;
                        bArr[r6] = (byte) ((toCodePoint & 63) | 128);
                    }
                }
                throw new zzfyg(i3 - 1, length);
            } else if ('?' > charAt2 || charAt2 > '?' || (i3 + 1 != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i3 + 1)))) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i5);
            } else {
                throw new zzfyg(i3, length);
            }
            i3++;
            i5 = i6;
        }
        return i5;
    }

    final int mo4947a(byte[] bArr, int i, int i2) {
        int i3 = i;
        while (i3 < i2 && bArr[i3] >= (byte) 0) {
            i3++;
        }
        if (i3 >= i2) {
            return 0;
        }
        while (i3 < i2) {
            int i4 = i3 + 1;
            byte b = bArr[i3];
            if (b >= (byte) 0) {
                i3 = i4;
            } else if (b < (byte) -32) {
                if (i4 >= i2) {
                    return b;
                }
                if (b >= (byte) -62) {
                    i3 = i4 + 1;
                    if (bArr[i4] > (byte) -65) {
                    }
                }
                return -1;
            } else if (b < (byte) -16) {
                if (i4 >= i2 - 1) {
                    return wi.m25850a(bArr, i4, i2);
                }
                r4 = i4 + 1;
                r3 = bArr[i4];
                if (r3 <= (byte) -65 && ((b != (byte) -32 || r3 >= (byte) -96) && (b != (byte) -19 || r3 < (byte) -96))) {
                    i3 = r4 + 1;
                    if (bArr[r4] > (byte) -65) {
                    }
                }
                return -1;
            } else if (i4 >= i2 - 2) {
                return wi.m25850a(bArr, i4, i2);
            } else {
                r4 = i4 + 1;
                r3 = bArr[i4];
                if (r3 <= (byte) -65 && (((b << 28) + (r3 + 112)) >> 30) == 0) {
                    i4 = r4 + 1;
                    if (bArr[r4] <= (byte) -65) {
                        i3 = i4 + 1;
                        if (bArr[i4] > (byte) -65) {
                        }
                    }
                }
                return -1;
            }
        }
        return 0;
    }
}
