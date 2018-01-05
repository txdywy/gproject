package com.google.protobuf.nano;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class CodedOutputByteBufferNano {
    public final ByteBuffer f35434a;
    public CodedOutputStream f35435b;
    public int f35436c;

    public class OutOfSpaceException extends IOException {
        OutOfSpaceException(int i, int i2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + i + " limit " + i2 + ").");
        }
    }

    private CodedOutputByteBufferNano(byte[] bArr, int i) {
        this(ByteBuffer.wrap(bArr, 0, i));
    }

    private CodedOutputByteBufferNano(ByteBuffer byteBuffer) {
        this.f35434a = byteBuffer;
        this.f35434a.order(ByteOrder.LITTLE_ENDIAN);
    }

    public static CodedOutputByteBufferNano m33491a(byte[] bArr, int i) {
        return new CodedOutputByteBufferNano(bArr, i);
    }

    final CodedOutputStream m33512a() {
        if (this.f35435b == null) {
            this.f35435b = CodedOutputStream.m32582a(this.f35434a);
            this.f35436c = this.f35434a.position();
        } else if (this.f35436c != this.f35434a.position()) {
            this.f35435b.mo6043b(this.f35434a.array(), this.f35436c, this.f35434a.position() - this.f35436c);
            this.f35436c = this.f35434a.position();
        }
        return this.f35435b;
    }

    public final void m33516a(int i, double d) {
        m33540f(i, 1);
        m33513a(d);
    }

    public final void m33517a(int i, float f) {
        m33540f(i, 5);
        m33514a(f);
    }

    public final void m33519a(int i, long j) {
        m33540f(i, 0);
        m33533b(j);
    }

    public final void m33531b(int i, long j) {
        m33540f(i, 0);
        m33533b(j);
    }

    public final void m33518a(int i, int i2) {
        m33540f(i, 0);
        m33515a(i2);
    }

    public final void m33535c(int i, long j) {
        m33540f(i, 1);
        m33538d(j);
    }

    public final void m33530b(int i, int i2) {
        m33540f(i, 5);
        m33541g(i2);
    }

    public final void m33522a(int i, boolean z) {
        m33540f(i, 0);
        m33527a(z);
    }

    public final void m33521a(int i, String str) {
        m33540f(i, 2);
        m33526a(str);
    }

    public final void m33520a(int i, i iVar) {
        m33540f(i, 3);
        iVar.a(this);
        m33540f(i, 4);
    }

    public final void m33532b(int i, i iVar) {
        m33540f(i, 2);
        m33525a(iVar);
    }

    public final void m33523a(int i, byte[] bArr) {
        m33540f(i, 2);
        m33528a(bArr);
    }

    public final void m33534c(int i, int i2) {
        m33540f(i, 0);
        m33539e(i2);
    }

    public final void m33537d(int i, long j) {
        m33540f(i, 0);
        m33524a(j);
    }

    public final void m33513a(double d) {
        m33538d(Double.doubleToLongBits(d));
    }

    public final void m33514a(float f) {
        m33541g(Float.floatToIntBits(f));
    }

    public final void m33515a(int i) {
        if (i >= 0) {
            m33539e(i);
        } else {
            m33533b((long) i);
        }
    }

    public final void m33527a(boolean z) {
        byte b = (byte) (z ? 1 : 0);
        if (this.f35434a.hasRemaining()) {
            this.f35434a.put(b);
            return;
        }
        throw new OutOfSpaceException(this.f35434a.position(), this.f35434a.limit());
    }

    public final void m33526a(String str) {
        try {
            int f = m33507f(str.length());
            if (f == m33507f(str.length() * 3)) {
                int position = this.f35434a.position();
                if (this.f35434a.remaining() < f) {
                    throw new OutOfSpaceException(f + position, this.f35434a.limit());
                }
                this.f35434a.position(position + f);
                m33492a((CharSequence) str, this.f35434a);
                int position2 = this.f35434a.position();
                this.f35434a.position(position);
                m33539e((position2 - position) - f);
                this.f35434a.position(position2);
                return;
            }
            m33539e(m33489a((CharSequence) str));
            m33492a((CharSequence) str, this.f35434a);
        } catch (Throwable e) {
            OutOfSpaceException outOfSpaceException = new OutOfSpaceException(this.f35434a.position(), this.f35434a.limit());
            outOfSpaceException.initCause(e);
            throw outOfSpaceException;
        }
    }

    private static int m33489a(CharSequence charSequence) {
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

    private static void m33492a(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        } else if (byteBuffer.hasArray()) {
            try {
                byteBuffer.position(m33490a(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
            } catch (Throwable e) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e);
                throw bufferOverflowException;
            }
        } else {
            m33497b(charSequence, byteBuffer);
        }
    }

    private static void m33497b(CharSequence charSequence, ByteBuffer byteBuffer) {
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

    private static int m33490a(CharSequence charSequence, byte[] bArr, int i, int i2) {
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

    public final void m33525a(i iVar) {
        m33539e(iVar.m());
        iVar.a(this);
    }

    public final void m33528a(byte[] bArr) {
        m33539e(bArr.length);
        m33536c(bArr);
    }

    public final void m33529b(int i) {
        m33539e(m33510h(i));
    }

    public final void m33524a(long j) {
        m33533b(m33506e(j));
    }

    public static int m33505e(int i, long j) {
        return m33501d(i) + m33500c(j);
    }

    public static int m33508f(int i, long j) {
        return m33501d(i) + m33500c(j);
    }

    public static int m33502d(int i, int i2) {
        return m33501d(i) + m33498c(i2);
    }

    public static int m33493b(int i, String str) {
        return m33501d(i) + m33495b(str);
    }

    public static int m33499c(int i, i iVar) {
        return (m33501d(i) * 2) + iVar.n();
    }

    public static int m33503d(int i, i iVar) {
        int d = m33501d(i);
        int n = iVar.n();
        return d + (n + m33507f(n));
    }

    public static int m33494b(int i, byte[] bArr) {
        return m33501d(i) + m33496b(bArr);
    }

    public static int m33504e(int i, int i2) {
        return m33501d(i) + m33507f(i2);
    }

    public static int m33509g(int i, long j) {
        return m33501d(i) + m33500c(m33506e(j));
    }

    public static int m33498c(int i) {
        if (i >= 0) {
            return m33507f(i);
        }
        return 10;
    }

    public static int m33495b(String str) {
        int a = m33489a((CharSequence) str);
        return a + m33507f(a);
    }

    public static int m33496b(byte[] bArr) {
        return m33507f(bArr.length) + bArr.length;
    }

    private final void m33511i(int i) {
        byte b = (byte) i;
        if (this.f35434a.hasRemaining()) {
            this.f35434a.put(b);
            return;
        }
        throw new OutOfSpaceException(this.f35434a.position(), this.f35434a.limit());
    }

    public final void m33536c(byte[] bArr) {
        int length = bArr.length;
        if (this.f35434a.remaining() >= length) {
            this.f35434a.put(bArr, 0, length);
            return;
        }
        throw new OutOfSpaceException(this.f35434a.position(), this.f35434a.limit());
    }

    public final void m33540f(int i, int i2) {
        m33539e((i << 3) | i2);
    }

    public static int m33501d(int i) {
        return m33507f((i << 3) | 0);
    }

    public final void m33539e(int i) {
        while ((i & -128) != 0) {
            m33511i((i & 127) | 128);
            i >>>= 7;
        }
        m33511i(i);
    }

    public static int m33507f(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        if ((-268435456 & i) == 0) {
            return 4;
        }
        return 5;
    }

    public final void m33533b(long j) {
        while ((-128 & j) != 0) {
            m33511i((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m33511i((int) j);
    }

    public static int m33500c(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        if ((Long.MIN_VALUE & j) == 0) {
            return 9;
        }
        return 10;
    }

    public final void m33541g(int i) {
        if (this.f35434a.remaining() < 4) {
            throw new OutOfSpaceException(this.f35434a.position(), this.f35434a.limit());
        }
        this.f35434a.putInt(i);
    }

    public final void m33538d(long j) {
        if (this.f35434a.remaining() < 8) {
            throw new OutOfSpaceException(this.f35434a.position(), this.f35434a.limit());
        }
        this.f35434a.putLong(j);
    }

    public static int m33510h(int i) {
        return (i << 1) ^ (i >> 31);
    }

    public static long m33506e(long j) {
        return (j << 1) ^ (j >> 63);
    }
}
