package com.google.protobuf;

import java.nio.ByteBuffer;

final class eh extends eg {
    eh() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final int mo6217a(int r11, byte[] r12, int r13, int r14) {
        /*
        r10 = this;
        r2 = 0;
        r9 = -32;
        r8 = -96;
        r1 = -1;
        r7 = -65;
        if (r11 == 0) goto L_0x0082;
    L_0x000a:
        if (r13 < r14) goto L_0x000d;
    L_0x000c:
        return r11;
    L_0x000d:
        r6 = (byte) r11;
        if (r6 >= r9) goto L_0x001c;
    L_0x0010:
        r0 = -62;
        if (r6 < r0) goto L_0x001a;
    L_0x0014:
        r0 = r13 + 1;
        r3 = r12[r13];
        if (r3 <= r7) goto L_0x0081;
    L_0x001a:
        r11 = r1;
        goto L_0x000c;
    L_0x001c:
        r0 = -16;
        if (r6 >= r0) goto L_0x0047;
    L_0x0020:
        r0 = r11 >> 8;
        r0 = r0 ^ -1;
        r0 = (byte) r0;
        if (r0 != 0) goto L_0x0032;
    L_0x0027:
        r3 = r13 + 1;
        r0 = r12[r13];
        if (r3 < r14) goto L_0x0033;
    L_0x002d:
        r11 = com.google.protobuf.Utf8.m32676a(r6, r0);
        goto L_0x000c;
    L_0x0032:
        r3 = r13;
    L_0x0033:
        if (r0 > r7) goto L_0x0045;
    L_0x0035:
        if (r6 != r9) goto L_0x0039;
    L_0x0037:
        if (r0 < r8) goto L_0x0045;
    L_0x0039:
        r4 = -19;
        if (r6 != r4) goto L_0x003f;
    L_0x003d:
        if (r0 >= r8) goto L_0x0045;
    L_0x003f:
        r13 = r3 + 1;
        r0 = r12[r3];
        if (r0 <= r7) goto L_0x0082;
    L_0x0045:
        r11 = r1;
        goto L_0x000c;
    L_0x0047:
        r0 = r11 >> 8;
        r0 = r0 ^ -1;
        r3 = (byte) r0;
        if (r3 != 0) goto L_0x0059;
    L_0x004e:
        r4 = r13 + 1;
        r0 = r12[r13];
        if (r4 < r14) goto L_0x00fd;
    L_0x0054:
        r11 = com.google.protobuf.Utf8.m32676a(r6, r0);
        goto L_0x000c;
    L_0x0059:
        r0 = r11 >> 16;
        r0 = (byte) r0;
        r5 = r3;
        r4 = r13;
    L_0x005e:
        if (r0 != 0) goto L_0x006b;
    L_0x0060:
        r3 = r4 + 1;
        r0 = r12[r4];
        if (r3 < r14) goto L_0x006c;
    L_0x0066:
        r11 = com.google.protobuf.Utf8.m32677a(r6, r5, r0);
        goto L_0x000c;
    L_0x006b:
        r3 = r4;
    L_0x006c:
        if (r5 > r7) goto L_0x007f;
    L_0x006e:
        r4 = r6 << 28;
        r5 = r5 + 112;
        r4 = r4 + r5;
        r4 = r4 >> 30;
        if (r4 != 0) goto L_0x007f;
    L_0x0077:
        if (r0 > r7) goto L_0x007f;
    L_0x0079:
        r13 = r3 + 1;
        r0 = r12[r3];
        if (r0 <= r7) goto L_0x0082;
    L_0x007f:
        r11 = r1;
        goto L_0x000c;
    L_0x0081:
        r13 = r0;
    L_0x0082:
        r0 = r13;
    L_0x0083:
        if (r0 >= r14) goto L_0x008c;
    L_0x0085:
        r3 = r12[r0];
        if (r3 < 0) goto L_0x008c;
    L_0x0089:
        r0 = r0 + 1;
        goto L_0x0083;
    L_0x008c:
        if (r0 < r14) goto L_0x0092;
    L_0x008e:
        r11 = r2;
        goto L_0x000c;
    L_0x0091:
        r0 = r3;
    L_0x0092:
        if (r0 < r14) goto L_0x0097;
    L_0x0094:
        r11 = r2;
        goto L_0x000c;
    L_0x0097:
        r3 = r0 + 1;
        r11 = r12[r0];
        if (r11 >= 0) goto L_0x0091;
    L_0x009d:
        if (r11 >= r9) goto L_0x00ae;
    L_0x009f:
        if (r3 >= r14) goto L_0x000c;
    L_0x00a1:
        r0 = -62;
        if (r11 < r0) goto L_0x00ab;
    L_0x00a5:
        r0 = r3 + 1;
        r3 = r12[r3];
        if (r3 <= r7) goto L_0x0092;
    L_0x00ab:
        r11 = r1;
        goto L_0x000c;
    L_0x00ae:
        r0 = -16;
        if (r11 >= r0) goto L_0x00d5;
    L_0x00b2:
        r0 = r14 + -1;
        if (r3 < r0) goto L_0x00bc;
    L_0x00b6:
        r11 = com.google.protobuf.Utf8.m32682b(r12, r3, r14);
        goto L_0x000c;
    L_0x00bc:
        r4 = r3 + 1;
        r0 = r12[r3];
        if (r0 > r7) goto L_0x00d2;
    L_0x00c2:
        if (r11 != r9) goto L_0x00c6;
    L_0x00c4:
        if (r0 < r8) goto L_0x00d2;
    L_0x00c6:
        r3 = -19;
        if (r11 != r3) goto L_0x00cc;
    L_0x00ca:
        if (r0 >= r8) goto L_0x00d2;
    L_0x00cc:
        r0 = r4 + 1;
        r3 = r12[r4];
        if (r3 <= r7) goto L_0x0092;
    L_0x00d2:
        r11 = r1;
        goto L_0x000c;
    L_0x00d5:
        r0 = r14 + -2;
        if (r3 < r0) goto L_0x00df;
    L_0x00d9:
        r11 = com.google.protobuf.Utf8.m32682b(r12, r3, r14);
        goto L_0x000c;
    L_0x00df:
        r0 = r3 + 1;
        r3 = r12[r3];
        if (r3 > r7) goto L_0x00fa;
    L_0x00e5:
        r4 = r11 << 28;
        r3 = r3 + 112;
        r3 = r3 + r4;
        r3 = r3 >> 30;
        if (r3 != 0) goto L_0x00fa;
    L_0x00ee:
        r3 = r0 + 1;
        r0 = r12[r0];
        if (r0 > r7) goto L_0x00fa;
    L_0x00f4:
        r0 = r3 + 1;
        r3 = r12[r3];
        if (r3 <= r7) goto L_0x0092;
    L_0x00fa:
        r11 = r1;
        goto L_0x000c;
    L_0x00fd:
        r5 = r0;
        r0 = r2;
        goto L_0x005e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.eh.a(int, byte[], int, int):int");
    }

    final int mo6218a(CharSequence charSequence, byte[] bArr, int i, int i2) {
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
                throw new UnpairedSurrogateException(i3 - 1, length);
            } else if ('?' > charAt2 || charAt2 > '?' || (i3 + 1 != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i3 + 1)))) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i5);
            } else {
                throw new UnpairedSurrogateException(i3, length);
            }
            i3++;
            i5 = i6;
        }
        return i5;
    }

    final void mo6219a(CharSequence charSequence, ByteBuffer byteBuffer) {
        eg.m33447b(charSequence, byteBuffer);
    }
}
