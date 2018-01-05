package com.google.protobuf;

import java.nio.ByteBuffer;

final class Utf8 {
    public static final eg f35084a;

    class UnpairedSurrogateException extends IllegalArgumentException {
        UnpairedSurrogateException(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    public static boolean m32681a(byte[] bArr, int i, int i2) {
        return f35084a.m33451a(bArr, i, i2);
    }

    static int m32675a(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    static int m32676a(int i, int i2) {
        return (i > -12 || i2 > -65) ? -1 : (i2 << 8) ^ i;
    }

    static int m32677a(int i, int i2, int i3) {
        return (i > -12 || i2 > -65 || i3 > -65) ? -1 : ((i2 << 8) ^ i) ^ (i3 << 16);
    }

    static int m32682b(byte[] bArr, int i, int i2) {
        int i3 = bArr[i - 1];
        switch (i2 - i) {
            case 0:
                return m32675a(i3);
            case 1:
                return m32676a(i3, bArr[i]);
            case 2:
                return m32677a(i3, bArr[i], bArr[i + 1]);
            default:
                throw new AssertionError();
        }
    }

    static int m32678a(CharSequence charSequence) {
        int i = 0;
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < '') {
            i2++;
        }
        int i3 = length;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt < 'ࠀ') {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 'ࠀ') {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if ('?' <= charAt2 && charAt2 <= '?') {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                throw new UnpairedSurrogateException(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i2 = i3 + i;
                if (i2 < length) {
                    return i2;
                }
                throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i2) + 4294967296L));
            }
        }
        i2 = i3;
        if (i2 < length) {
            return i2;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i2) + 4294967296L));
    }

    static int m32679a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f35084a.mo6218a(charSequence, bArr, i, i2);
    }

    static void m32680a(CharSequence charSequence, ByteBuffer byteBuffer) {
        eg egVar = f35084a;
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(m32679a(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        } else if (byteBuffer.isDirect()) {
            egVar.mo6219a(charSequence, byteBuffer);
        } else {
            eg.m33447b(charSequence, byteBuffer);
        }
    }

    static {
        Object obj = (ea.f35385i && ea.f35384h) ? 1 : null;
        f35084a = obj != null ? new ei() : new eh();
    }
}
