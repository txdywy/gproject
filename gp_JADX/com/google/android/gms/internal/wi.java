package com.google.android.gms.internal;

final class wi {
    public static final wj f27601a;

    static int m25848a(CharSequence charSequence) {
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
                                throw new zzfyg(i2, length2);
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

    static int m25849a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f27601a.mo4946a(charSequence, bArr, i, i2);
    }

    private static int m25851b(int i) {
        return i > -12 ? -1 : i;
    }

    private static int m25852b(int i, int i2) {
        return (i > -12 || i2 > -65) ? -1 : (i2 << 8) ^ i;
    }

    private static int m25853b(int i, int i2, int i3) {
        return (i > -12 || i2 > -65 || i3 > -65) ? -1 : ((i2 << 8) ^ i) ^ (i3 << 16);
    }

    static /* synthetic */ int m25850a(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        switch (i2 - i) {
            case 0:
                return m25851b(b);
            case 1:
                return m25852b(b, bArr[i]);
            case 2:
                return m25853b(b, bArr[i], bArr[i + 1]);
            default:
                throw new AssertionError();
        }
    }

    static {
        Object obj = (wc.f27597i && wc.f27596h) ? 1 : null;
        f27601a = obj != null ? new wl() : new wk();
    }
}
