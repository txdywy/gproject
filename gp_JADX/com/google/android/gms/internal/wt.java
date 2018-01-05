package com.google.android.gms.internal;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class wt {
    public final ByteBuffer f27641a;

    private wt(ByteBuffer byteBuffer) {
        this.f27641a = byteBuffer;
        this.f27641a.order(ByteOrder.LITTLE_ENDIAN);
    }

    private wt(byte[] bArr, int i) {
        this(ByteBuffer.wrap(bArr, 0, i));
    }

    public static int m25882a(int i) {
        return i >= 0 ? m25896c(i) : 10;
    }

    private static int m25883a(CharSequence charSequence) {
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
                                throw new IllegalArgumentException("Unpaired surrogate at index " + i2);
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

    private static int m25884a(CharSequence charSequence, byte[] bArr, int i, int i2) {
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
                throw new IllegalArgumentException("Unpaired surrogate at index " + (i3 - 1));
            } else {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i5);
            }
            i3++;
            i5 = i6;
        }
        return i5;
    }

    public static int m25885a(String str) {
        int a = m25883a((CharSequence) str);
        return a + m25896c(a);
    }

    public static int m25886a(byte[] bArr) {
        return m25896c(bArr.length) + bArr.length;
    }

    public static wt m25887a(byte[] bArr, int i) {
        return new wt(bArr, i);
    }

    private static void m25888a(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        } else if (byteBuffer.hasArray()) {
            try {
                byteBuffer.position(m25884a(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
            } catch (Throwable e) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e);
                throw bufferOverflowException;
            }
        } else {
            m25895b(charSequence, byteBuffer);
        }
    }

    public static int m25894b(long j) {
        return (-128 & j) == 0 ? 1 : (-16384 & j) == 0 ? 2 : (-2097152 & j) == 0 ? 3 : (-268435456 & j) == 0 ? 4 : (-34359738368L & j) == 0 ? 5 : (-4398046511104L & j) == 0 ? 6 : (-562949953421312L & j) == 0 ? 7 : (-72057594037927936L & j) == 0 ? 8 : (Long.MIN_VALUE & j) == 0 ? 9 : 10;
    }

    private static void m25895b(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < '') {
                byteBuffer.put((byte) charAt);
            } else if (charAt < 'ࠀ') {
                byteBuffer.put((byte) ((charAt >>> 6) | 960));
                byteBuffer.put((byte) ((charAt & 63) | 128));
            } else if (charAt < '?' || '?' < charAt) {
                byteBuffer.put((byte) ((charAt >>> 12) | 480));
                byteBuffer.put((byte) (((charAt >>> 6) & 63) | 128));
                byteBuffer.put((byte) ((charAt & 63) | 128));
            } else {
                if (i + 1 != charSequence.length()) {
                    i++;
                    char charAt2 = charSequence.charAt(i);
                    if (Character.isSurrogatePair(charAt, charAt2)) {
                        int toCodePoint = Character.toCodePoint(charAt, charAt2);
                        byteBuffer.put((byte) ((toCodePoint >>> 18) | 240));
                        byteBuffer.put((byte) (((toCodePoint >>> 12) & 63) | 128));
                        byteBuffer.put((byte) (((toCodePoint >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((toCodePoint & 63) | 128));
                    }
                }
                throw new IllegalArgumentException("Unpaired surrogate at index " + (i - 1));
            }
            i++;
        }
    }

    public static int m25896c(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (-268435456 & i) == 0 ? 4 : 5;
    }

    public static int m25897d(int i) {
        return (i << 1) ^ (i >> 31);
    }

    static long m25898d(long j) {
        return (j << 1) ^ (j >> 63);
    }

    private final void m25899e(int i) {
        byte b = (byte) i;
        if (this.f27641a.hasRemaining()) {
            this.f27641a.put(b);
            return;
        }
        throw new zzfyr(this.f27641a.position(), this.f27641a.limit());
    }

    public final void m25900a(int i, float f) {
        m25910c(i, 5);
        int floatToIntBits = Float.floatToIntBits(f);
        if (this.f27641a.remaining() < 4) {
            throw new zzfyr(this.f27641a.position(), this.f27641a.limit());
        }
        this.f27641a.putInt(floatToIntBits);
    }

    public final void m25901a(int i, int i2) {
        m25910c(i, 0);
        if (i2 >= 0) {
            m25908b(i2);
        } else {
            m25907a((long) i2);
        }
    }

    public final void m25902a(int i, long j) {
        m25910c(i, 0);
        m25907a(j);
    }

    public final void m25903a(int i, wz wzVar) {
        m25910c(i, 2);
        if (wzVar.ai < 0) {
            wzVar.m24217e();
        }
        m25908b(wzVar.ai);
        wzVar.mo4702a(this);
    }

    public final void m25904a(int i, String str) {
        m25910c(i, 2);
        try {
            int c = m25896c(str.length());
            if (c == m25896c(str.length() * 3)) {
                int position = this.f27641a.position();
                if (this.f27641a.remaining() < c) {
                    throw new zzfyr(c + position, this.f27641a.limit());
                }
                this.f27641a.position(position + c);
                m25888a((CharSequence) str, this.f27641a);
                int position2 = this.f27641a.position();
                this.f27641a.position(position);
                m25908b((position2 - position) - c);
                this.f27641a.position(position2);
                return;
            }
            m25908b(m25883a((CharSequence) str));
            m25888a((CharSequence) str, this.f27641a);
        } catch (Throwable e) {
            zzfyr com_google_android_gms_internal_zzfyr = new zzfyr(this.f27641a.position(), this.f27641a.limit());
            com_google_android_gms_internal_zzfyr.initCause(e);
            throw com_google_android_gms_internal_zzfyr;
        }
    }

    public final void m25905a(int i, boolean z) {
        int i2 = 0;
        m25910c(i, 0);
        if (z) {
            i2 = 1;
        }
        byte b = (byte) i2;
        if (this.f27641a.hasRemaining()) {
            this.f27641a.put(b);
            return;
        }
        throw new zzfyr(this.f27641a.position(), this.f27641a.limit());
    }

    final void m25907a(long j) {
        while ((-128 & j) != 0) {
            m25899e((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m25899e((int) j);
    }

    public final void m25908b(int i) {
        while ((i & -128) != 0) {
            m25899e((i & 127) | 128);
            i >>>= 7;
        }
        m25899e(i);
    }

    public final void m25909b(byte[] bArr) {
        int length = bArr.length;
        if (this.f27641a.remaining() >= length) {
            this.f27641a.put(bArr, 0, length);
            return;
        }
        throw new zzfyr(this.f27641a.position(), this.f27641a.limit());
    }

    public final void m25910c(int i, int i2) {
        m25908b((i << 3) | i2);
    }

    final void m25911c(long j) {
        if (this.f27641a.remaining() < 8) {
            throw new zzfyr(this.f27641a.position(), this.f27641a.limit());
        }
        this.f27641a.putLong(j);
    }

    public final void m25906a(int i, byte[] bArr) {
        m25910c(i, 2);
        m25908b(bArr.length);
        m25909b(bArr);
    }

    public static int m25890b(int i, long j) {
        return m25896c(i << 3) + m25894b(j);
    }

    public static int m25889b(int i, int i2) {
        return m25896c(i << 3) + m25882a(i2);
    }

    public static int m25892b(int i, String str) {
        return m25896c(i << 3) + m25885a(str);
    }

    public static int m25891b(int i, wz wzVar) {
        int c = m25896c(i << 3);
        int e = wzVar.m24217e();
        return c + (e + m25896c(e));
    }

    public static int m25893b(int i, byte[] bArr) {
        return m25896c(i << 3) + m25886a(bArr);
    }
}
