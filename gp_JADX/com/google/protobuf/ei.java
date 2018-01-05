package com.google.protobuf;

final class ei extends eg {
    ei() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final int mo6217a(int r10, byte[] r11, int r12, int r13) {
        /*
        r9 = this;
        r0 = r12 | r13;
        r1 = r11.length;
        r1 = r1 - r13;
        r0 = r0 | r1;
        if (r0 >= 0) goto L_0x002c;
    L_0x0007:
        r0 = new java.lang.ArrayIndexOutOfBoundsException;
        r1 = "Array length=%d, index=%d, limit=%d";
        r2 = 3;
        r2 = new java.lang.Object[r2];
        r3 = 0;
        r4 = r11.length;
        r4 = java.lang.Integer.valueOf(r4);
        r2[r3] = r4;
        r3 = 1;
        r4 = java.lang.Integer.valueOf(r12);
        r2[r3] = r4;
        r3 = 2;
        r4 = java.lang.Integer.valueOf(r13);
        r2[r3] = r4;
        r1 = java.lang.String.format(r1, r2);
        r0.<init>(r1);
        throw r0;
    L_0x002c:
        r2 = (long) r12;
        r6 = (long) r13;
        if (r10 == 0) goto L_0x00d8;
    L_0x0030:
        r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r0 < 0) goto L_0x0035;
    L_0x0034:
        return r10;
    L_0x0035:
        r8 = (byte) r10;
        r0 = -32;
        if (r8 >= r0) goto L_0x004b;
    L_0x003a:
        r0 = -62;
        if (r8 < r0) goto L_0x0049;
    L_0x003e:
        r0 = 1;
        r0 = r0 + r2;
        r2 = com.google.protobuf.ea.m33356a(r11, r2);
        r3 = -65;
        if (r2 <= r3) goto L_0x00d9;
    L_0x0049:
        r10 = -1;
        goto L_0x0034;
    L_0x004b:
        r0 = -16;
        if (r8 >= r0) goto L_0x0089;
    L_0x004f:
        r0 = r10 >> 8;
        r0 = r0 ^ -1;
        r0 = (byte) r0;
        if (r0 != 0) goto L_0x0068;
    L_0x0056:
        r0 = 1;
        r4 = r2 + r0;
        r0 = com.google.protobuf.ea.m33356a(r11, r2);
        r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r1 < 0) goto L_0x0067;
    L_0x0062:
        r10 = com.google.protobuf.Utf8.m32676a(r8, r0);
        goto L_0x0034;
    L_0x0067:
        r2 = r4;
    L_0x0068:
        r1 = -65;
        if (r0 > r1) goto L_0x0087;
    L_0x006c:
        r1 = -32;
        if (r8 != r1) goto L_0x0074;
    L_0x0070:
        r1 = -96;
        if (r0 < r1) goto L_0x0087;
    L_0x0074:
        r1 = -19;
        if (r8 != r1) goto L_0x007c;
    L_0x0078:
        r1 = -96;
        if (r0 >= r1) goto L_0x0087;
    L_0x007c:
        r0 = 1;
        r0 = r0 + r2;
        r2 = com.google.protobuf.ea.m33356a(r11, r2);
        r3 = -65;
        if (r2 <= r3) goto L_0x00d9;
    L_0x0087:
        r10 = -1;
        goto L_0x0034;
    L_0x0089:
        r0 = r10 >> 8;
        r0 = r0 ^ -1;
        r1 = (byte) r0;
        r0 = 0;
        if (r1 != 0) goto L_0x00a1;
    L_0x0091:
        r4 = 1;
        r4 = r4 + r2;
        r1 = com.google.protobuf.ea.m33356a(r11, r2);
        r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r2 < 0) goto L_0x00a5;
    L_0x009c:
        r10 = com.google.protobuf.Utf8.m32676a(r8, r1);
        goto L_0x0034;
    L_0x00a1:
        r0 = r10 >> 16;
        r0 = (byte) r0;
        r4 = r2;
    L_0x00a5:
        if (r0 != 0) goto L_0x00b8;
    L_0x00a7:
        r2 = 1;
        r2 = r2 + r4;
        r0 = com.google.protobuf.ea.m33356a(r11, r4);
        r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r4 < 0) goto L_0x00b9;
    L_0x00b2:
        r10 = com.google.protobuf.Utf8.m32677a(r8, r1, r0);
        goto L_0x0034;
    L_0x00b8:
        r2 = r4;
    L_0x00b9:
        r4 = -65;
        if (r1 > r4) goto L_0x00d5;
    L_0x00bd:
        r4 = r8 << 28;
        r1 = r1 + 112;
        r1 = r1 + r4;
        r1 = r1 >> 30;
        if (r1 != 0) goto L_0x00d5;
    L_0x00c6:
        r1 = -65;
        if (r0 > r1) goto L_0x00d5;
    L_0x00ca:
        r0 = 1;
        r0 = r0 + r2;
        r2 = com.google.protobuf.ea.m33356a(r11, r2);
        r3 = -65;
        if (r2 <= r3) goto L_0x00d9;
    L_0x00d5:
        r10 = -1;
        goto L_0x0034;
    L_0x00d8:
        r0 = r2;
    L_0x00d9:
        r2 = r6 - r0;
        r2 = (int) r2;
        r10 = m33456a(r11, r0, r2);
        goto L_0x0034;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.ei.a(int, byte[], int, int):int");
    }

    final int mo6218a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        long j = (long) i;
        long j2 = j + ((long) i2);
        int length = charSequence.length();
        if (length > i2 || bArr.length - i2 < i) {
            throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i + i2));
        }
        int i3 = 0;
        while (i3 < length) {
            char charAt = charSequence.charAt(i3);
            if (charAt >= '') {
                break;
            }
            long j3 = 1 + j;
            ea.m33372a(bArr, j, (byte) charAt);
            i3++;
            j = j3;
        }
        if (i3 == length) {
            return (int) j;
        }
        j3 = j;
        while (i3 < length) {
            charAt = charSequence.charAt(i3);
            if (charAt < '' && j3 < j2) {
                j = 1 + j3;
                ea.m33372a(bArr, j3, (byte) charAt);
            } else if (charAt < 'ࠀ' && j3 <= j2 - 2) {
                r12 = j3 + 1;
                ea.m33372a(bArr, j3, (byte) ((charAt >>> 6) | 960));
                j = 1 + r12;
                ea.m33372a(bArr, r12, (byte) ((charAt & 63) | 128));
            } else if ((charAt < '?' || '?' < charAt) && j3 <= j2 - 3) {
                j = 1 + j3;
                ea.m33372a(bArr, j3, (byte) ((charAt >>> 12) | 480));
                j3 = 1 + j;
                ea.m33372a(bArr, j, (byte) (((charAt >>> 6) & 63) | 128));
                j = 1 + j3;
                ea.m33372a(bArr, j3, (byte) ((charAt & 63) | 128));
            } else if (j3 <= j2 - 4) {
                if (i3 + 1 != length) {
                    i3++;
                    char charAt2 = charSequence.charAt(i3);
                    if (Character.isSurrogatePair(charAt, charAt2)) {
                        int toCodePoint = Character.toCodePoint(charAt, charAt2);
                        j = 1 + j3;
                        ea.m33372a(bArr, j3, (byte) ((toCodePoint >>> 18) | 240));
                        j3 = 1 + j;
                        ea.m33372a(bArr, j, (byte) (((toCodePoint >>> 12) & 63) | 128));
                        r12 = j3 + 1;
                        ea.m33372a(bArr, j3, (byte) (((toCodePoint >>> 6) & 63) | 128));
                        j = 1 + r12;
                        ea.m33372a(bArr, r12, (byte) ((toCodePoint & 63) | 128));
                    }
                }
                throw new UnpairedSurrogateException(i3 - 1, length);
            } else if ('?' > charAt || charAt > '?' || (i3 + 1 != length && Character.isSurrogatePair(charAt, charSequence.charAt(i3 + 1)))) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt + " at index " + j3);
            } else {
                throw new UnpairedSurrogateException(i3, length);
            }
            i3++;
            j3 = j;
        }
        return (int) j3;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void mo6219a(java.lang.CharSequence r17, java.nio.ByteBuffer r18) {
        /*
        r16 = this;
        r8 = com.google.protobuf.ea.m33359a(r18);
        r2 = r18.position();
        r2 = (long) r2;
        r4 = r8 + r2;
        r2 = r18.limit();
        r2 = (long) r2;
        r10 = r8 + r2;
        r3 = r17.length();
        r6 = (long) r3;
        r12 = r10 - r4;
        r2 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1));
        if (r2 <= 0) goto L_0x004e;
    L_0x001d:
        r2 = new java.lang.ArrayIndexOutOfBoundsException;
        r3 = r3 + -1;
        r0 = r17;
        r3 = r0.charAt(r3);
        r4 = r18.limit();
        r5 = 37;
        r6 = new java.lang.StringBuilder;
        r6.<init>(r5);
        r5 = "Failed writing ";
        r5 = r6.append(r5);
        r3 = r5.append(r3);
        r5 = " at index ";
        r3 = r3.append(r5);
        r3 = r3.append(r4);
        r3 = r3.toString();
        r2.<init>(r3);
        throw r2;
    L_0x004e:
        r2 = 0;
    L_0x004f:
        if (r2 >= r3) goto L_0x0066;
    L_0x0051:
        r0 = r17;
        r12 = r0.charAt(r2);
        r6 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r12 >= r6) goto L_0x0066;
    L_0x005b:
        r6 = 1;
        r6 = r6 + r4;
        r12 = (byte) r12;
        com.google.protobuf.ea.m33363a(r4, r12);
        r2 = r2 + 1;
        r4 = r6;
        goto L_0x004f;
    L_0x0066:
        if (r2 != r3) goto L_0x0190;
    L_0x0068:
        r2 = r4 - r8;
        r2 = (int) r2;
        r0 = r18;
        r0.position(r2);
    L_0x0070:
        return;
    L_0x0071:
        if (r2 >= r3) goto L_0x0186;
    L_0x0073:
        r0 = r17;
        r12 = r0.charAt(r2);
        r4 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r12 >= r4) goto L_0x008c;
    L_0x007d:
        r4 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1));
        if (r4 >= 0) goto L_0x008c;
    L_0x0081:
        r4 = 1;
        r4 = r4 + r6;
        r12 = (byte) r12;
        com.google.protobuf.ea.m33363a(r6, r12);
    L_0x0088:
        r2 = r2 + 1;
        r6 = r4;
        goto L_0x0071;
    L_0x008c:
        r4 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        if (r12 >= r4) goto L_0x00b0;
    L_0x0090:
        r4 = 2;
        r4 = r10 - r4;
        r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r4 > 0) goto L_0x00b0;
    L_0x0098:
        r4 = 1;
        r14 = r6 + r4;
        r4 = r12 >>> 6;
        r4 = r4 | 960;
        r4 = (byte) r4;
        com.google.protobuf.ea.m33363a(r6, r4);
        r4 = 1;
        r4 = r4 + r14;
        r6 = r12 & 63;
        r6 = r6 | 128;
        r6 = (byte) r6;
        com.google.protobuf.ea.m33363a(r14, r6);
        goto L_0x0088;
    L_0x00b0:
        r4 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r12 < r4) goto L_0x00ba;
    L_0x00b5:
        r4 = 57343; // 0xdfff float:8.0355E-41 double:2.8331E-319;
        if (r4 >= r12) goto L_0x00e6;
    L_0x00ba:
        r4 = 3;
        r4 = r10 - r4;
        r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r4 > 0) goto L_0x00e6;
    L_0x00c2:
        r4 = 1;
        r4 = r4 + r6;
        r13 = r12 >>> 12;
        r13 = r13 | 480;
        r13 = (byte) r13;
        com.google.protobuf.ea.m33363a(r6, r13);
        r6 = 1;
        r6 = r6 + r4;
        r13 = r12 >>> 6;
        r13 = r13 & 63;
        r13 = r13 | 128;
        r13 = (byte) r13;
        com.google.protobuf.ea.m33363a(r4, r13);
        r4 = 1;
        r4 = r4 + r6;
        r12 = r12 & 63;
        r12 = r12 | 128;
        r12 = (byte) r12;
        com.google.protobuf.ea.m33363a(r6, r12);
        goto L_0x0088;
    L_0x00e6:
        r4 = 4;
        r4 = r10 - r4;
        r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r4 > 0) goto L_0x013f;
    L_0x00ee:
        r4 = r2 + 1;
        if (r4 == r3) goto L_0x0100;
    L_0x00f2:
        r2 = r2 + 1;
        r0 = r17;
        r4 = r0.charAt(r2);
        r5 = java.lang.Character.isSurrogatePair(r12, r4);
        if (r5 != 0) goto L_0x0108;
    L_0x0100:
        r4 = new com.google.protobuf.Utf8$UnpairedSurrogateException;
        r2 = r2 + -1;
        r4.<init>(r2, r3);
        throw r4;
    L_0x0108:
        r12 = java.lang.Character.toCodePoint(r12, r4);
        r4 = 1;
        r4 = r4 + r6;
        r13 = r12 >>> 18;
        r13 = r13 | 240;
        r13 = (byte) r13;
        com.google.protobuf.ea.m33363a(r6, r13);
        r6 = 1;
        r6 = r6 + r4;
        r13 = r12 >>> 12;
        r13 = r13 & 63;
        r13 = r13 | 128;
        r13 = (byte) r13;
        com.google.protobuf.ea.m33363a(r4, r13);
        r4 = 1;
        r14 = r6 + r4;
        r4 = r12 >>> 6;
        r4 = r4 & 63;
        r4 = r4 | 128;
        r4 = (byte) r4;
        com.google.protobuf.ea.m33363a(r6, r4);
        r4 = 1;
        r4 = r4 + r14;
        r6 = r12 & 63;
        r6 = r6 | 128;
        r6 = (byte) r6;
        com.google.protobuf.ea.m33363a(r14, r6);
        goto L_0x0088;
    L_0x013f:
        r4 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r4 > r12) goto L_0x0161;
    L_0x0144:
        r4 = 57343; // 0xdfff float:8.0355E-41 double:2.8331E-319;
        if (r12 > r4) goto L_0x0161;
    L_0x0149:
        r4 = r2 + 1;
        if (r4 == r3) goto L_0x015b;
    L_0x014d:
        r4 = r2 + 1;
        r0 = r17;
        r4 = r0.charAt(r4);
        r4 = java.lang.Character.isSurrogatePair(r12, r4);
        if (r4 != 0) goto L_0x0161;
    L_0x015b:
        r4 = new com.google.protobuf.Utf8$UnpairedSurrogateException;
        r4.<init>(r2, r3);
        throw r4;
    L_0x0161:
        r2 = new java.lang.ArrayIndexOutOfBoundsException;
        r3 = 46;
        r4 = new java.lang.StringBuilder;
        r4.<init>(r3);
        r3 = "Failed writing ";
        r3 = r4.append(r3);
        r3 = r3.append(r12);
        r4 = " at index ";
        r3 = r3.append(r4);
        r3 = r3.append(r6);
        r3 = r3.toString();
        r2.<init>(r3);
        throw r2;
    L_0x0186:
        r2 = r6 - r8;
        r2 = (int) r2;
        r0 = r18;
        r0.position(r2);
        goto L_0x0070;
    L_0x0190:
        r6 = r4;
        goto L_0x0071;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.ei.a(java.lang.CharSequence, java.nio.ByteBuffer):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m33456a(byte[] r9, long r10, int r12) {
        /*
        r0 = 16;
        if (r12 >= r0) goto L_0x001b;
    L_0x0004:
        r0 = 0;
    L_0x0005:
        r1 = r12 - r0;
        r2 = (long) r0;
        r2 = r2 + r10;
        r0 = r1;
    L_0x000a:
        r1 = 0;
        r4 = r2;
    L_0x000c:
        if (r0 <= 0) goto L_0x002f;
    L_0x000e:
        r2 = 1;
        r2 = r2 + r4;
        r1 = com.google.protobuf.ea.m33356a(r9, r4);
        if (r1 < 0) goto L_0x002e;
    L_0x0017:
        r0 = r0 + -1;
        r4 = r2;
        goto L_0x000c;
    L_0x001b:
        r0 = 0;
        r2 = r10;
    L_0x001d:
        if (r0 >= r12) goto L_0x002c;
    L_0x001f:
        r4 = 1;
        r4 = r4 + r2;
        r1 = com.google.protobuf.ea.m33356a(r9, r2);
        if (r1 < 0) goto L_0x0005;
    L_0x0028:
        r0 = r0 + 1;
        r2 = r4;
        goto L_0x001d;
    L_0x002c:
        r0 = r12;
        goto L_0x0005;
    L_0x002e:
        r4 = r2;
    L_0x002f:
        if (r0 != 0) goto L_0x0033;
    L_0x0031:
        r0 = 0;
    L_0x0032:
        return r0;
    L_0x0033:
        r0 = r0 + -1;
        r2 = -32;
        if (r1 >= r2) goto L_0x0050;
    L_0x0039:
        if (r0 != 0) goto L_0x003d;
    L_0x003b:
        r0 = r1;
        goto L_0x0032;
    L_0x003d:
        r0 = r0 + -1;
        r2 = -62;
        if (r1 < r2) goto L_0x004e;
    L_0x0043:
        r2 = 1;
        r2 = r2 + r4;
        r1 = com.google.protobuf.ea.m33356a(r9, r4);
        r4 = -65;
        if (r1 <= r4) goto L_0x000a;
    L_0x004e:
        r0 = -1;
        goto L_0x0032;
    L_0x0050:
        r2 = -16;
        if (r1 >= r2) goto L_0x0087;
    L_0x0054:
        r2 = 2;
        if (r0 >= r2) goto L_0x005c;
    L_0x0057:
        r0 = m33455a(r9, r1, r4, r0);
        goto L_0x0032;
    L_0x005c:
        r0 = r0 + -2;
        r2 = 1;
        r6 = r4 + r2;
        r2 = com.google.protobuf.ea.m33356a(r9, r4);
        r3 = -65;
        if (r2 > r3) goto L_0x0085;
    L_0x006a:
        r3 = -32;
        if (r1 != r3) goto L_0x0072;
    L_0x006e:
        r3 = -96;
        if (r2 < r3) goto L_0x0085;
    L_0x0072:
        r3 = -19;
        if (r1 != r3) goto L_0x007a;
    L_0x0076:
        r1 = -96;
        if (r2 >= r1) goto L_0x0085;
    L_0x007a:
        r2 = 1;
        r2 = r2 + r6;
        r1 = com.google.protobuf.ea.m33356a(r9, r6);
        r4 = -65;
        if (r1 <= r4) goto L_0x000a;
    L_0x0085:
        r0 = -1;
        goto L_0x0032;
    L_0x0087:
        r2 = 3;
        if (r0 >= r2) goto L_0x008f;
    L_0x008a:
        r0 = m33455a(r9, r1, r4, r0);
        goto L_0x0032;
    L_0x008f:
        r0 = r0 + -3;
        r2 = 1;
        r2 = r2 + r4;
        r4 = com.google.protobuf.ea.m33356a(r9, r4);
        r5 = -65;
        if (r4 > r5) goto L_0x00bb;
    L_0x009c:
        r1 = r1 << 28;
        r4 = r4 + 112;
        r1 = r1 + r4;
        r1 = r1 >> 30;
        if (r1 != 0) goto L_0x00bb;
    L_0x00a5:
        r4 = 1;
        r4 = r4 + r2;
        r1 = com.google.protobuf.ea.m33356a(r9, r2);
        r2 = -65;
        if (r1 > r2) goto L_0x00bb;
    L_0x00b0:
        r2 = 1;
        r2 = r2 + r4;
        r1 = com.google.protobuf.ea.m33356a(r9, r4);
        r4 = -65;
        if (r1 <= r4) goto L_0x000a;
    L_0x00bb:
        r0 = -1;
        goto L_0x0032;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.ei.a(byte[], long, int):int");
    }

    private static int m33455a(byte[] bArr, int i, long j, int i2) {
        switch (i2) {
            case 0:
                return Utf8.m32675a(i);
            case 1:
                return Utf8.m32676a(i, ea.m33356a(bArr, j));
            case 2:
                return Utf8.m32677a(i, ea.m33356a(bArr, j), ea.m33356a(bArr, 1 + j));
            default:
                throw new AssertionError();
        }
    }
}
