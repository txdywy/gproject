package p526e;

import android.support.v7.widget.eq;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

public final class C7726f implements C7724h, C7725i, Cloneable {
    public static final byte[] f40186a = new byte[]{(byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102};
    public C7740w f40187b;
    public long f40188c;

    public final C7726f mo6486b() {
        return this;
    }

    public final C7724h mo6488c() {
        return this;
    }

    public final boolean mo6492d() {
        return this.f40188c == 0;
    }

    public final void mo6485a(long j) {
        if (this.f40188c < j) {
            throw new EOFException();
        }
    }

    public final InputStream mo6494e() {
        return new C7727g(this);
    }

    public final C7726f m37377a(OutputStream outputStream) {
        long j = this.f40188c;
        ad.m37329a(this.f40188c, 0, j);
        if (j != 0) {
            C7740w c7740w = this.f40187b;
            long j2 = 0;
            while (j2 >= ((long) (c7740w.f40223c - c7740w.f40222b))) {
                j2 -= (long) (c7740w.f40223c - c7740w.f40222b);
                c7740w = c7740w.f40226f;
            }
            while (j > 0) {
                int i = (int) (j2 + ((long) c7740w.f40222b));
                int min = (int) Math.min((long) (c7740w.f40223c - i), j);
                outputStream.write(c7740w.f40221a, i, min);
                j -= (long) min;
                c7740w = c7740w.f40226f;
                j2 = 0;
            }
        }
        return this;
    }

    public final C7726f m37376a(C7726f c7726f, long j, long j2) {
        if (c7726f == null) {
            throw new IllegalArgumentException("out == null");
        }
        ad.m37329a(this.f40188c, j, j2);
        if (j2 != 0) {
            c7726f.f40188c += j2;
            C7740w c7740w = this.f40187b;
            while (j >= ((long) (c7740w.f40223c - c7740w.f40222b))) {
                j -= (long) (c7740w.f40223c - c7740w.f40222b);
                c7740w = c7740w.f40226f;
            }
            while (j2 > 0) {
                C7740w c7740w2 = new C7740w(c7740w);
                c7740w2.f40222b = (int) (((long) c7740w2.f40222b) + j);
                c7740w2.f40223c = Math.min(c7740w2.f40222b + ((int) j2), c7740w2.f40223c);
                if (c7726f.f40187b == null) {
                    c7740w2.f40227g = c7740w2;
                    c7740w2.f40226f = c7740w2;
                    c7726f.f40187b = c7740w2;
                } else {
                    c7726f.f40187b.f40227g.m37486a(c7740w2);
                }
                j2 -= (long) (c7740w2.f40223c - c7740w2.f40222b);
                c7740w = c7740w.f40226f;
                j = 0;
            }
        }
        return this;
    }

    public final C7726f m37385b(OutputStream outputStream) {
        long j = this.f40188c;
        ad.m37329a(this.f40188c, 0, j);
        C7740w c7740w = this.f40187b;
        while (j > 0) {
            C7740w a;
            int min = (int) Math.min(j, (long) (c7740w.f40223c - c7740w.f40222b));
            outputStream.write(c7740w.f40221a, c7740w.f40222b, min);
            c7740w.f40222b += min;
            this.f40188c -= (long) min;
            j -= (long) min;
            if (c7740w.f40222b == c7740w.f40223c) {
                a = c7740w.m37485a();
                this.f40187b = a;
                C7741x.m37489a(c7740w);
            } else {
                a = c7740w;
            }
            c7740w = a;
        }
        return this;
    }

    public final byte mo6496f() {
        if (this.f40188c == 0) {
            throw new IllegalStateException("size == 0");
        }
        C7740w c7740w = this.f40187b;
        int i = c7740w.f40222b;
        int i2 = c7740w.f40223c;
        int i3 = i + 1;
        byte b = c7740w.f40221a[i];
        this.f40188c--;
        if (i3 == i2) {
            this.f40187b = c7740w.m37485a();
            C7741x.m37489a(c7740w);
        } else {
            c7740w.f40222b = i3;
        }
        return b;
    }

    public final byte m37383b(long j) {
        ad.m37329a(this.f40188c, j, 1);
        C7740w c7740w = this.f40187b;
        while (true) {
            int i = c7740w.f40223c - c7740w.f40222b;
            if (j < ((long) i)) {
                return c7740w.f40221a[c7740w.f40222b + ((int) j)];
            }
            j -= (long) i;
            c7740w = c7740w.f40226f;
        }
    }

    public final short mo6499g() {
        if (this.f40188c < 2) {
            throw new IllegalStateException("size < 2: " + this.f40188c);
        }
        C7740w c7740w = this.f40187b;
        int i = c7740w.f40222b;
        int i2 = c7740w.f40223c;
        if (i2 - i < 2) {
            return (short) (((mo6496f() & HprofParser.ROOT_UNKNOWN) << 8) | (mo6496f() & HprofParser.ROOT_UNKNOWN));
        }
        byte[] bArr = c7740w.f40221a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        i = ((bArr[i] & HprofParser.ROOT_UNKNOWN) << 8) | (bArr[i3] & HprofParser.ROOT_UNKNOWN);
        this.f40188c -= 2;
        if (i4 == i2) {
            this.f40187b = c7740w.m37485a();
            C7741x.m37489a(c7740w);
        } else {
            c7740w.f40222b = i4;
        }
        return (short) i;
    }

    public final int mo6500h() {
        if (this.f40188c < 4) {
            throw new IllegalStateException("size < 4: " + this.f40188c);
        }
        C7740w c7740w = this.f40187b;
        int i = c7740w.f40222b;
        int i2 = c7740w.f40223c;
        if (i2 - i < 4) {
            return ((((mo6496f() & HprofParser.ROOT_UNKNOWN) << 24) | ((mo6496f() & HprofParser.ROOT_UNKNOWN) << 16)) | ((mo6496f() & HprofParser.ROOT_UNKNOWN) << 8)) | (mo6496f() & HprofParser.ROOT_UNKNOWN);
        }
        byte[] bArr = c7740w.f40221a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        i = ((bArr[i] & HprofParser.ROOT_UNKNOWN) << 24) | ((bArr[i3] & HprofParser.ROOT_UNKNOWN) << 16);
        i3 = i4 + 1;
        i |= (bArr[i4] & HprofParser.ROOT_UNKNOWN) << 8;
        i4 = i3 + 1;
        i |= bArr[i3] & HprofParser.ROOT_UNKNOWN;
        this.f40188c -= 4;
        if (i4 == i2) {
            this.f40187b = c7740w.m37485a();
            C7741x.m37489a(c7740w);
            return i;
        }
        c7740w.f40222b = i4;
        return i;
    }

    public final short mo6501i() {
        return ad.m37328a(mo6499g());
    }

    public final int mo6502j() {
        return ad.m37327a(mo6500h());
    }

    public final long mo6503k() {
        if (this.f40188c == 0) {
            throw new IllegalStateException("size == 0");
        }
        long j = 0;
        int i = 0;
        Object obj = null;
        do {
            C7740w c7740w = this.f40187b;
            byte[] bArr = c7740w.f40221a;
            int i2 = c7740w.f40222b;
            int i3 = c7740w.f40223c;
            int i4 = i2;
            while (i4 < i3) {
                byte b = bArr[i4];
                if (b >= (byte) 48 && b <= (byte) 57) {
                    i2 = b - 48;
                } else if (b >= (byte) 97 && b <= (byte) 102) {
                    i2 = (b - 97) + 10;
                } else if (b < (byte) 65 || b > (byte) 70) {
                    if (i != 0) {
                        obj = 1;
                        if (i4 != i3) {
                            this.f40187b = c7740w.m37485a();
                            C7741x.m37489a(c7740w);
                        } else {
                            c7740w.f40222b = i4;
                        }
                        if (obj == null) {
                            break;
                        }
                    } else {
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + Integer.toHexString(b));
                    }
                } else {
                    i2 = (b - 65) + 10;
                }
                if ((-1152921504606846976L & j) != 0) {
                    C7726f i5 = new C7726f().m37369i(j);
                    C7740w b2 = i5.m37387b(1);
                    byte[] bArr2 = b2.f40221a;
                    int i6 = b2.f40223c;
                    b2.f40223c = i6 + 1;
                    bArr2[i6] = (byte) b;
                    i5.f40188c++;
                    throw new NumberFormatException("Number too large: " + i5.m37406m());
                }
                i++;
                i4++;
                j = ((long) i2) | (j << 4);
            }
            if (i4 != i3) {
                c7740w.f40222b = i4;
            } else {
                this.f40187b = c7740w.m37485a();
                C7741x.m37489a(c7740w);
            }
            if (obj == null) {
                break;
            }
        } while (this.f40187b != null);
        this.f40188c -= (long) i;
        return j;
    }

    public final C7728j m37405l() {
        return new C7728j(mo6505o());
    }

    public final C7728j mo6490c(long j) {
        return new C7728j(mo6495e(j));
    }

    public final String m37406m() {
        try {
            return m37365a(this.f40188c, ad.f40180a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    private final String m37368h(long j) {
        return m37365a(j, ad.f40180a);
    }

    private final String m37365a(long j, Charset charset) {
        ad.m37329a(this.f40188c, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        } else if (j == 0) {
            return "";
        } else {
            C7740w c7740w = this.f40187b;
            if (((long) c7740w.f40222b) + j > ((long) c7740w.f40223c)) {
                return new String(mo6495e(j), charset);
            }
            String str = new String(c7740w.f40221a, c7740w.f40222b, (int) j, charset);
            c7740w.f40222b = (int) (((long) c7740w.f40222b) + j);
            this.f40188c -= j;
            if (c7740w.f40222b != c7740w.f40223c) {
                return str;
            }
            this.f40187b = c7740w.m37485a();
            C7741x.m37489a(c7740w);
            return str;
        }
    }

    public final String mo6504n() {
        if (Long.MAX_VALUE < 0) {
            throw new IllegalArgumentException("limit < 0: " + Long.MAX_VALUE);
        }
        long j = Long.MAX_VALUE == Long.MAX_VALUE ? Long.MAX_VALUE : Long.MIN_VALUE;
        long a = m37371a((byte) 10, 0, j);
        if (a != -1) {
            return m37392d(a);
        }
        if (j < this.f40188c && m37383b(j - 1) == (byte) 13 && m37383b(j) == (byte) 10) {
            return m37392d(j);
        }
        C7726f c7726f = new C7726f();
        m37376a(c7726f, 0, Math.min(32, this.f40188c));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f40188c, Long.MAX_VALUE) + " content=" + c7726f.m37405l().mo6520c() + '…');
    }

    final String m37392d(long j) {
        if (j <= 0 || m37383b(j - 1) != (byte) 13) {
            String h = m37368h(j);
            mo6497f(1);
            return h;
        }
        h = m37368h(j - 1);
        mo6497f(2);
        return h;
    }

    public final byte[] mo6505o() {
        try {
            return mo6495e(this.f40188c);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final byte[] mo6495e(long j) {
        ad.m37329a(this.f40188c, 0, j);
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        }
        byte[] bArr = new byte[((int) j)];
        m37366b(bArr);
        return bArr;
    }

    private final void m37366b(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int a = m37370a(bArr, i, bArr.length - i);
            if (a == -1) {
                throw new EOFException();
            }
            i += a;
        }
    }

    public final int m37370a(byte[] bArr, int i, int i2) {
        ad.m37329a((long) bArr.length, (long) i, (long) i2);
        C7740w c7740w = this.f40187b;
        if (c7740w == null) {
            return -1;
        }
        int min = Math.min(i2, c7740w.f40223c - c7740w.f40222b);
        System.arraycopy(c7740w.f40221a, c7740w.f40222b, bArr, i, min);
        c7740w.f40222b += min;
        this.f40188c -= (long) min;
        if (c7740w.f40222b != c7740w.f40223c) {
            return min;
        }
        this.f40187b = c7740w.m37485a();
        C7741x.m37489a(c7740w);
        return min;
    }

    public final void m37409p() {
        try {
            mo6497f(this.f40188c);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final void mo6497f(long j) {
        while (j > 0) {
            if (this.f40187b == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, (long) (this.f40187b.f40223c - this.f40187b.f40222b));
            this.f40188c -= (long) min;
            j -= (long) min;
            C7740w c7740w = this.f40187b;
            c7740w.f40222b = min + c7740w.f40222b;
            if (this.f40187b.f40222b == this.f40187b.f40223c) {
                C7740w c7740w2 = this.f40187b;
                this.f40187b = c7740w2.m37485a();
                C7741x.m37489a(c7740w2);
            }
        }
    }

    public final C7726f m37378a(String str, int i, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        } else if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        } else {
            while (i < i2) {
                char charAt = str.charAt(i);
                C7740w b;
                byte[] bArr;
                int i3;
                int i4;
                int i5;
                if (charAt < '') {
                    b = m37387b(1);
                    bArr = b.f40221a;
                    i3 = b.f40223c - i;
                    int min = Math.min(i2, 8192 - i3);
                    i4 = i + 1;
                    bArr[i3 + i] = (byte) charAt;
                    while (i4 < min) {
                        char charAt2 = str.charAt(i4);
                        if (charAt2 >= '') {
                            break;
                        }
                        i5 = i4 + 1;
                        bArr[i4 + i3] = (byte) charAt2;
                        i4 = i5;
                    }
                    i5 = (i4 + i3) - b.f40223c;
                    b.f40223c += i5;
                    this.f40188c += (long) i5;
                    i = i4;
                } else if (charAt < 'ࠀ') {
                    i4 = (charAt >> 6) | 192;
                    b = m37387b(1);
                    bArr = b.f40221a;
                    i3 = b.f40223c;
                    b.f40223c = i3 + 1;
                    bArr[i3] = (byte) i4;
                    this.f40188c++;
                    i4 = (charAt & 63) | 128;
                    r1 = m37387b(1);
                    r2 = r1.f40221a;
                    r3 = r1.f40223c;
                    r1.f40223c = r3 + 1;
                    r2[r3] = (byte) i4;
                    this.f40188c++;
                    i++;
                } else if (charAt < '?' || charAt > '?') {
                    i4 = (charAt >> 12) | 224;
                    b = m37387b(1);
                    bArr = b.f40221a;
                    i3 = b.f40223c;
                    b.f40223c = i3 + 1;
                    bArr[i3] = (byte) i4;
                    this.f40188c++;
                    i4 = ((charAt >> 6) & 63) | 128;
                    b = m37387b(1);
                    bArr = b.f40221a;
                    i3 = b.f40223c;
                    b.f40223c = i3 + 1;
                    bArr[i3] = (byte) i4;
                    this.f40188c++;
                    i4 = (charAt & 63) | 128;
                    r1 = m37387b(1);
                    r2 = r1.f40221a;
                    r3 = r1.f40223c;
                    r1.f40223c = r3 + 1;
                    r2[r3] = (byte) i4;
                    this.f40188c++;
                    i++;
                } else {
                    i4 = i + 1 < i2 ? str.charAt(i + 1) : 0;
                    if (charAt > '?' || i4 < 56320 || i4 > 57343) {
                        C7740w b2 = m37387b(1);
                        byte[] bArr2 = b2.f40221a;
                        int i6 = b2.f40223c;
                        b2.f40223c = i6 + 1;
                        bArr2[i6] = (byte) 63;
                        this.f40188c++;
                        i++;
                    } else {
                        i4 = ((i4 & -56321) | ((charAt & -55297) << 10)) + 65536;
                        i5 = (i4 >> 18) | 240;
                        b = m37387b(1);
                        bArr = b.f40221a;
                        i3 = b.f40223c;
                        b.f40223c = i3 + 1;
                        bArr[i3] = (byte) i5;
                        this.f40188c++;
                        i5 = ((i4 >> 12) & 63) | 128;
                        b = m37387b(1);
                        bArr = b.f40221a;
                        i3 = b.f40223c;
                        b.f40223c = i3 + 1;
                        bArr[i3] = (byte) i5;
                        this.f40188c++;
                        i5 = ((i4 >> 6) & 63) | 128;
                        b = m37387b(1);
                        bArr = b.f40221a;
                        i3 = b.f40223c;
                        b.f40223c = i3 + 1;
                        bArr[i3] = (byte) i5;
                        this.f40188c++;
                        i4 = (i4 & 63) | 128;
                        r1 = m37387b(1);
                        r2 = r1.f40221a;
                        r3 = r1.f40223c;
                        r1.f40223c = r3 + 1;
                        r2[r3] = (byte) i4;
                        this.f40188c++;
                        i += 2;
                    }
                }
            }
            return this;
        }
    }

    public final C7726f m37375a(int i) {
        C7740w b;
        byte[] bArr;
        int i2;
        if (i < 128) {
            b = m37387b(1);
            bArr = b.f40221a;
            i2 = b.f40223c;
            b.f40223c = i2 + 1;
            bArr[i2] = (byte) i;
            this.f40188c++;
        } else if (i < eq.FLAG_MOVED) {
            r0 = (i >> 6) | 192;
            r1 = m37387b(1);
            r2 = r1.f40221a;
            r3 = r1.f40223c;
            r1.f40223c = r3 + 1;
            r2[r3] = (byte) r0;
            this.f40188c++;
            r0 = (i & 63) | 128;
            r1 = m37387b(1);
            r2 = r1.f40221a;
            r3 = r1.f40223c;
            r1.f40223c = r3 + 1;
            r2[r3] = (byte) r0;
            this.f40188c++;
        } else if (i < 65536) {
            if (i < 55296 || i > 57343) {
                r0 = (i >> 12) | 224;
                r1 = m37387b(1);
                r2 = r1.f40221a;
                r3 = r1.f40223c;
                r1.f40223c = r3 + 1;
                r2[r3] = (byte) r0;
                this.f40188c++;
                r0 = ((i >> 6) & 63) | 128;
                r1 = m37387b(1);
                r2 = r1.f40221a;
                r3 = r1.f40223c;
                r1.f40223c = r3 + 1;
                r2[r3] = (byte) r0;
                this.f40188c++;
                r0 = (i & 63) | 128;
                r1 = m37387b(1);
                r2 = r1.f40221a;
                r3 = r1.f40223c;
                r1.f40223c = r3 + 1;
                r2[r3] = (byte) r0;
                this.f40188c++;
            } else {
                b = m37387b(1);
                bArr = b.f40221a;
                i2 = b.f40223c;
                b.f40223c = i2 + 1;
                bArr[i2] = (byte) 63;
                this.f40188c++;
            }
        } else if (i <= 1114111) {
            r0 = (i >> 18) | 240;
            r1 = m37387b(1);
            r2 = r1.f40221a;
            r3 = r1.f40223c;
            r1.f40223c = r3 + 1;
            r2[r3] = (byte) r0;
            this.f40188c++;
            r0 = ((i >> 12) & 63) | 128;
            r1 = m37387b(1);
            r2 = r1.f40221a;
            r3 = r1.f40223c;
            r1.f40223c = r3 + 1;
            r2[r3] = (byte) r0;
            this.f40188c++;
            r0 = ((i >> 6) & 63) | 128;
            r1 = m37387b(1);
            r2 = r1.f40221a;
            r3 = r1.f40223c;
            r1.f40223c = r3 + 1;
            r2[r3] = (byte) r0;
            this.f40188c++;
            r0 = (i & 63) | 128;
            r1 = m37387b(1);
            r2 = r1.f40221a;
            r3 = r1.f40223c;
            r1.f40223c = r3 + 1;
            r2[r3] = (byte) r0;
            this.f40188c++;
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
        }
        return this;
    }

    private final C7726f m37367c(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        ad.m37329a((long) bArr.length, 0, (long) i2);
        int i3 = i2 + 0;
        while (i < i3) {
            C7740w b = m37387b(1);
            int min = Math.min(i3 - i, 8192 - b.f40223c);
            System.arraycopy(bArr, i, b.f40221a, b.f40223c, min);
            i += min;
            b.f40223c = min + b.f40223c;
        }
        this.f40188c += (long) i2;
        return this;
    }

    public final long mo6481a(aa aaVar) {
        if (aaVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long a = aaVar.mo6423a(this, 8192);
            if (a == -1) {
                return j;
            }
            j += a;
        }
    }

    private final C7726f m37369i(long j) {
        if (j == 0) {
            C7740w b = m37387b(1);
            byte[] bArr = b.f40221a;
            int i = b.f40223c;
            b.f40223c = i + 1;
            bArr[i] = (byte) 48;
            this.f40188c++;
            return this;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C7740w b2 = m37387b(numberOfTrailingZeros);
        byte[] bArr2 = b2.f40221a;
        int i2 = b2.f40223c;
        for (int i3 = (b2.f40223c + numberOfTrailingZeros) - 1; i3 >= i2; i3--) {
            bArr2[i3] = f40186a[(int) (15 & j)];
            j >>>= 4;
        }
        b2.f40223c += numberOfTrailingZeros;
        this.f40188c = ((long) numberOfTrailingZeros) + this.f40188c;
        return this;
    }

    public final C7740w m37387b(int i) {
        if (i <= 0 || i > 8192) {
            throw new IllegalArgumentException();
        } else if (this.f40187b == null) {
            this.f40187b = C7741x.m37488a();
            C7740w c7740w = this.f40187b;
            C7740w c7740w2 = this.f40187b;
            r0 = this.f40187b;
            c7740w2.f40227g = r0;
            c7740w.f40226f = r0;
            return r0;
        } else {
            r0 = this.f40187b.f40227g;
            if (r0.f40223c + i > 8192 || !r0.f40225e) {
                return r0.m37486a(C7741x.m37488a());
            }
            return r0;
        }
    }

    public final void a_(C7726f c7726f, long j) {
        if (c7726f == null) {
            throw new IllegalArgumentException("source == null");
        } else if (c7726f == this) {
            throw new IllegalArgumentException("source == this");
        } else {
            ad.m37329a(c7726f.f40188c, 0, j);
            while (j > 0) {
                C7740w c7740w;
                long j2;
                C7740w c7740w2;
                if (j < ((long) (c7726f.f40187b.f40223c - c7726f.f40187b.f40222b))) {
                    c7740w = this.f40187b != null ? this.f40187b.f40227g : null;
                    if (c7740w != null && c7740w.f40225e) {
                        int i;
                        j2 = ((long) c7740w.f40223c) + j;
                        if (c7740w.f40224d) {
                            i = 0;
                        } else {
                            i = c7740w.f40222b;
                        }
                        if (j2 - ((long) i) <= 8192) {
                            c7726f.f40187b.m37487a(c7740w, (int) j);
                            c7726f.f40188c -= j;
                            this.f40188c += j;
                            return;
                        }
                    }
                    c7740w = c7726f.f40187b;
                    int i2 = (int) j;
                    if (i2 <= 0 || i2 > c7740w.f40223c - c7740w.f40222b) {
                        throw new IllegalArgumentException();
                    }
                    if (i2 >= MemoryMappedFileBuffer.DEFAULT_PADDING) {
                        c7740w2 = new C7740w(c7740w);
                    } else {
                        c7740w2 = C7741x.m37488a();
                        System.arraycopy(c7740w.f40221a, c7740w.f40222b, c7740w2.f40221a, 0, i2);
                    }
                    c7740w2.f40223c = c7740w2.f40222b + i2;
                    c7740w.f40222b = i2 + c7740w.f40222b;
                    c7740w.f40227g.m37486a(c7740w2);
                    c7726f.f40187b = c7740w2;
                }
                c7740w2 = c7726f.f40187b;
                j2 = (long) (c7740w2.f40223c - c7740w2.f40222b);
                c7726f.f40187b = c7740w2.m37485a();
                if (this.f40187b == null) {
                    this.f40187b = c7740w2;
                    c7740w2 = this.f40187b;
                    c7740w = this.f40187b;
                    C7740w c7740w3 = this.f40187b;
                    c7740w.f40227g = c7740w3;
                    c7740w2.f40226f = c7740w3;
                } else {
                    c7740w = this.f40187b.f40227g.m37486a(c7740w2);
                    if (c7740w.f40227g == c7740w) {
                        throw new IllegalStateException();
                    } else if (c7740w.f40227g.f40225e) {
                        int i3 = c7740w.f40223c - c7740w.f40222b;
                        if (i3 <= (c7740w.f40227g.f40224d ? 0 : c7740w.f40227g.f40222b) + (8192 - c7740w.f40227g.f40223c)) {
                            c7740w.m37487a(c7740w.f40227g, i3);
                            c7740w.m37485a();
                            C7741x.m37489a(c7740w);
                        }
                    }
                }
                c7726f.f40188c -= j2;
                this.f40188c += j2;
                j -= j2;
            }
        }
    }

    public final long mo6423a(C7726f c7726f, long j) {
        if (c7726f == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.f40188c == 0) {
            return -1;
        } else {
            if (j > this.f40188c) {
                j = this.f40188c;
            }
            c7726f.a_(this, j);
            return j;
        }
    }

    public final long mo6506q() {
        return m37371a((byte) 0, 0, Long.MAX_VALUE);
    }

    public final long m37371a(byte b, long j, long j2) {
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(this.f40188c), Long.valueOf(j), Long.valueOf(j2)}));
        }
        if (j2 > this.f40188c) {
            j2 = this.f40188c;
        }
        if (j == j2) {
            return -1;
        }
        C7740w c7740w = this.f40187b;
        if (c7740w == null) {
            return -1;
        }
        long j3;
        C7740w c7740w2;
        long j4;
        if (this.f40188c - j >= j) {
            j3 = 0;
            c7740w2 = c7740w;
            while (true) {
                j4 = ((long) (c7740w2.f40223c - c7740w2.f40222b)) + j3;
                if (j4 >= j) {
                    break;
                }
                c7740w2 = c7740w2.f40226f;
                j3 = j4;
            }
        } else {
            j3 = this.f40188c;
            c7740w2 = c7740w;
            while (j3 > j) {
                c7740w2 = c7740w2.f40227g;
                j3 -= (long) (c7740w2.f40223c - c7740w2.f40222b);
            }
        }
        j4 = j3;
        while (j4 < j2) {
            byte[] bArr = c7740w2.f40221a;
            int min = (int) Math.min((long) c7740w2.f40223c, (((long) c7740w2.f40222b) + j2) - j4);
            for (int i = (int) ((((long) c7740w2.f40222b) + j) - j4); i < min; i++) {
                if (bArr[i] == b) {
                    return ((long) (i - c7740w2.f40222b)) + j4;
                }
            }
            j3 = ((long) (c7740w2.f40223c - c7740w2.f40222b)) + j4;
            c7740w2 = c7740w2.f40226f;
            j4 = j3;
            j = j3;
        }
        return -1;
    }

    public final void flush() {
    }

    public final void close() {
    }

    public final ab mo6424a() {
        return ab.f39527h;
    }

    public final boolean equals(Object obj) {
        long j = 0;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7726f)) {
            return false;
        }
        C7726f c7726f = (C7726f) obj;
        if (this.f40188c != c7726f.f40188c) {
            return false;
        }
        if (this.f40188c == 0) {
            return true;
        }
        C7740w c7740w = this.f40187b;
        C7740w c7740w2 = c7726f.f40187b;
        int i = c7740w.f40222b;
        int i2 = c7740w2.f40222b;
        while (j < this.f40188c) {
            long min = (long) Math.min(c7740w.f40223c - i, c7740w2.f40223c - i2);
            int i3 = 0;
            while (((long) i3) < min) {
                int i4 = i + 1;
                byte b = c7740w.f40221a[i];
                i = i2 + 1;
                if (b != c7740w2.f40221a[i2]) {
                    return false;
                }
                i3++;
                i2 = i;
                i = i4;
            }
            if (i == c7740w.f40223c) {
                c7740w = c7740w.f40226f;
                i = c7740w.f40222b;
            }
            if (i2 == c7740w2.f40223c) {
                c7740w2 = c7740w2.f40226f;
                i2 = c7740w2.f40222b;
            }
            j += min;
        }
        return true;
    }

    public final int hashCode() {
        C7740w c7740w = this.f40187b;
        if (c7740w == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c7740w.f40222b;
            while (i2 < c7740w.f40223c) {
                int i3 = c7740w.f40221a[i2] + (i * 31);
                i2++;
                i = i3;
            }
            c7740w = c7740w.f40226f;
        } while (c7740w != this.f40187b);
        return i;
    }

    public final String toString() {
        if (this.f40188c > 2147483647L) {
            throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f40188c);
        }
        C7728j c7728j;
        int i = (int) this.f40188c;
        if (i == 0) {
            c7728j = C7728j.f40191b;
        } else {
            c7728j = new C7742y(this, i);
        }
        return c7728j.toString();
    }

    public final /* synthetic */ Object clone() {
        C7726f c7726f = new C7726f();
        if (this.f40188c == 0) {
            return c7726f;
        }
        c7726f.f40187b = new C7740w(this.f40187b);
        C7740w c7740w = c7726f.f40187b;
        C7740w c7740w2 = c7726f.f40187b;
        C7740w c7740w3 = c7726f.f40187b;
        c7740w2.f40227g = c7740w3;
        c7740w.f40226f = c7740w3;
        for (c7740w = this.f40187b.f40226f; c7740w != this.f40187b; c7740w = c7740w.f40226f) {
            c7726f.f40187b.f40227g.m37486a(new C7740w(c7740w));
        }
        c7726f.f40188c = this.f40188c;
        return c7726f;
    }

    public final /* bridge */ /* synthetic */ C7724h mo6507r() {
        if (this != null) {
            return this;
        }
        throw null;
    }

    public final /* synthetic */ C7724h mo6498g(long j) {
        if (j == 0) {
            C7740w b = m37387b(1);
            byte[] bArr = b.f40221a;
            int i = b.f40223c;
            b.f40223c = i + 1;
            bArr[i] = (byte) 48;
            this.f40188c++;
            return this;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C7740w b2 = m37387b(numberOfTrailingZeros);
        byte[] bArr2 = b2.f40221a;
        int i2 = b2.f40223c;
        for (int i3 = (b2.f40223c + numberOfTrailingZeros) - 1; i3 >= i2; i3--) {
            bArr2[i3] = f40186a[(int) (15 & j)];
            j >>>= 4;
        }
        b2.f40223c += numberOfTrailingZeros;
        this.f40188c = ((long) numberOfTrailingZeros) + this.f40188c;
        return this;
    }

    public final /* synthetic */ C7724h mo6489c(int i) {
        C7740w b = m37387b(4);
        byte[] bArr = b.f40221a;
        int i2 = b.f40223c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & HprofParser.ROOT_UNKNOWN);
        i2 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & HprofParser.ROOT_UNKNOWN);
        i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & HprofParser.ROOT_UNKNOWN);
        i2 = i3 + 1;
        bArr[i3] = (byte) (i & HprofParser.ROOT_UNKNOWN);
        b.f40223c = i2;
        this.f40188c += 4;
        return this;
    }

    public final /* synthetic */ C7724h mo6491d(int i) {
        C7740w b = m37387b(2);
        byte[] bArr = b.f40221a;
        int i2 = b.f40223c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & HprofParser.ROOT_UNKNOWN);
        i2 = i3 + 1;
        bArr[i3] = (byte) (i & HprofParser.ROOT_UNKNOWN);
        b.f40223c = i2;
        this.f40188c += 2;
        return this;
    }

    public final /* synthetic */ C7724h mo6493e(int i) {
        C7740w b = m37387b(1);
        byte[] bArr = b.f40221a;
        int i2 = b.f40223c;
        b.f40223c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f40188c++;
        return this;
    }

    public final /* synthetic */ C7724h mo6483a(String str) {
        return m37378a(str, 0, str.length());
    }

    public final /* synthetic */ C7724h mo6487b(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        ad.m37329a((long) bArr.length, (long) i, (long) i2);
        int i3 = i + i2;
        while (i < i3) {
            C7740w b = m37387b(1);
            int min = Math.min(i3 - i, 8192 - b.f40223c);
            System.arraycopy(bArr, i, b.f40221a, b.f40223c, min);
            i += min;
            b.f40223c = min + b.f40223c;
        }
        this.f40188c += (long) i2;
        return this;
    }

    public final /* synthetic */ C7724h mo6484a(byte[] bArr) {
        if (bArr != null) {
            return m37367c(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    public final /* synthetic */ C7724h mo6482a(C7728j c7728j) {
        if (c7728j == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        c7728j.mo6516a(this);
        return this;
    }
}
