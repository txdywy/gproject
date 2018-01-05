package com.google.protobuf;

import com.squareup.haha.perflib.HprofParser;
import java.util.Arrays;

final class C7226t extends C7225s {
    public final byte[] f35487f;
    public final boolean f35488g;
    public int f35489h;
    public int f35490i;
    public int f35491j;
    public int f35492k;
    public int f35493l;
    public boolean f35494m;
    public int f35495n = Integer.MAX_VALUE;

    C7226t(byte[] bArr, int i, int i2, boolean z) {
        this.f35487f = bArr;
        this.f35489h = i + i2;
        this.f35491j = i;
        this.f35492k = this.f35491j;
        this.f35488g = z;
    }

    public final int mo6231a() {
        if (mo6259v()) {
            this.f35493l = 0;
            return 0;
        }
        this.f35493l = mo6256s();
        if ((this.f35493l >>> 3) != 0) {
            return this.f35493l;
        }
        throw InvalidProtocolBufferException.m32667d();
    }

    public final void mo6234a(int i) {
        if (this.f35493l != i) {
            throw InvalidProtocolBufferException.m32668e();
        }
    }

    public final boolean mo6236b(int i) {
        int i2 = 0;
        switch (i & 7) {
            case 0:
                if (this.f35489h - this.f35491j >= 10) {
                    while (i2 < 10) {
                        byte[] bArr = this.f35487f;
                        int i3 = this.f35491j;
                        this.f35491j = i3 + 1;
                        if (bArr[i3] >= (byte) 0) {
                            return true;
                        }
                        i2++;
                    }
                    throw InvalidProtocolBufferException.m32666c();
                }
                while (i2 < 10) {
                    if (m33662B() >= (byte) 0) {
                        return true;
                    }
                    i2++;
                }
                throw InvalidProtocolBufferException.m32666c();
            case 1:
                mo6242e(8);
                return true;
            case 2:
                mo6242e(mo6256s());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                mo6242e(4);
                return true;
            default:
                throw InvalidProtocolBufferException.m32669f();
        }
        do {
            i2 = mo6231a();
            if (i2 != 0) {
            }
            mo6234a(((i >>> 3) << 3) | 4);
            return true;
        } while (mo6236b(i2));
        mo6234a(((i >>> 3) << 3) | 4);
        return true;
    }

    public final double mo6235b() {
        return Double.longBitsToDouble(m33665z());
    }

    public final float mo6237c() {
        return Float.intBitsToFloat(m33664y());
    }

    public final long mo6239d() {
        return m33663x();
    }

    public final long mo6241e() {
        return m33663x();
    }

    public final int mo6243f() {
        return mo6256s();
    }

    public final long mo6244g() {
        return m33665z();
    }

    public final int mo6245h() {
        return m33664y();
    }

    public final boolean mo6246i() {
        return m33663x() != 0;
    }

    public final String mo6247j() {
        int s = mo6256s();
        if (s > 0 && s <= this.f35489h - this.f35491j) {
            String str = new String(this.f35487f, this.f35491j, s, bb.f35208a);
            this.f35491j = s + this.f35491j;
            return str;
        } else if (s == 0) {
            return "";
        } else {
            if (s < 0) {
                throw InvalidProtocolBufferException.m32665b();
            }
            throw InvalidProtocolBufferException.m32664a();
        }
    }

    public final String mo6248k() {
        int s = mo6256s();
        if (s <= 0 || s > this.f35489h - this.f35491j) {
            if (s == 0) {
                return "";
            }
            if (s <= 0) {
                throw InvalidProtocolBufferException.m32665b();
            }
            throw InvalidProtocolBufferException.m32664a();
        } else if (Utf8.m32681a(this.f35487f, this.f35491j, this.f35491j + s)) {
            int i = this.f35491j;
            this.f35491j += s;
            return new String(this.f35487f, i, s, bb.f35208a);
        } else {
            throw InvalidProtocolBufferException.m32673j();
        }
    }

    public final at mo6232a(at atVar, ah ahVar) {
        int s = mo6256s();
        if (this.a >= this.b) {
            throw InvalidProtocolBufferException.m32670g();
        }
        s = mo6238c(s);
        this.a++;
        at a = at.m32937a(atVar, (C7225s) this, ahVar);
        mo6234a(0);
        this.a--;
        mo6240d(s);
        return a;
    }

    public final cf mo6233a(cs csVar, ah ahVar) {
        int s = mo6256s();
        if (this.a >= this.b) {
            throw InvalidProtocolBufferException.m32670g();
        }
        int c = mo6238c(s);
        this.a++;
        cf cfVar = (cf) csVar.mo6129a((C7225s) this, ahVar);
        mo6234a(0);
        this.a--;
        mo6240d(c);
        return cfVar;
    }

    public final C7203j mo6249l() {
        int s = mo6256s();
        if (s > 0 && s <= this.f35489h - this.f35491j) {
            C7203j b;
            if (this.f35488g && this.f35494m) {
                b = C7203j.m33202b(this.f35487f, this.f35491j, s);
            } else {
                b = C7203j.m33201a(this.f35487f, this.f35491j, s);
            }
            this.f35491j = s + this.f35491j;
            return b;
        } else if (s == 0) {
            return C7203j.f35320a;
        } else {
            byte[] copyOfRange;
            if (s > 0 && s <= this.f35489h - this.f35491j) {
                int i = this.f35491j;
                this.f35491j = s + this.f35491j;
                copyOfRange = Arrays.copyOfRange(this.f35487f, i, this.f35491j);
            } else if (s > 0) {
                throw InvalidProtocolBufferException.m32664a();
            } else if (s == 0) {
                copyOfRange = bb.f35209b;
            } else {
                throw InvalidProtocolBufferException.m32665b();
            }
            return C7203j.m33200a(copyOfRange);
        }
    }

    public final int mo6250m() {
        return mo6256s();
    }

    public final int mo6251n() {
        return mo6256s();
    }

    public final int mo6252o() {
        return m33664y();
    }

    public final long mo6253p() {
        return m33665z();
    }

    public final int mo6254q() {
        return C7225s.m33630f(mo6256s());
    }

    public final long mo6255r() {
        return C7225s.m33627a(m33663x());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo6256s() {
        /*
        r5 = this;
        r0 = r5.f35491j;
        r1 = r5.f35489h;
        if (r1 == r0) goto L_0x006c;
    L_0x0006:
        r3 = r5.f35487f;
        r2 = r0 + 1;
        r0 = r3[r0];
        if (r0 < 0) goto L_0x0011;
    L_0x000e:
        r5.f35491j = r2;
    L_0x0010:
        return r0;
    L_0x0011:
        r1 = r5.f35489h;
        r1 = r1 - r2;
        r4 = 9;
        if (r1 < r4) goto L_0x006c;
    L_0x0018:
        r1 = r2 + 1;
        r2 = r3[r2];
        r2 = r2 << 7;
        r0 = r0 ^ r2;
        if (r0 >= 0) goto L_0x0026;
    L_0x0021:
        r0 = r0 ^ -128;
    L_0x0023:
        r5.f35491j = r1;
        goto L_0x0010;
    L_0x0026:
        r2 = r1 + 1;
        r1 = r3[r1];
        r1 = r1 << 14;
        r0 = r0 ^ r1;
        if (r0 < 0) goto L_0x0033;
    L_0x002f:
        r0 = r0 ^ 16256;
        r1 = r2;
        goto L_0x0023;
    L_0x0033:
        r1 = r2 + 1;
        r2 = r3[r2];
        r2 = r2 << 21;
        r0 = r0 ^ r2;
        if (r0 >= 0) goto L_0x0041;
    L_0x003c:
        r2 = -2080896; // 0xffffffffffe03f80 float:NaN double:NaN;
        r0 = r0 ^ r2;
        goto L_0x0023;
    L_0x0041:
        r2 = r1 + 1;
        r1 = r3[r1];
        r4 = r1 << 28;
        r0 = r0 ^ r4;
        r4 = 266354560; // 0xfe03f80 float:2.2112565E-29 double:1.315966377E-315;
        r0 = r0 ^ r4;
        if (r1 >= 0) goto L_0x0072;
    L_0x004e:
        r1 = r2 + 1;
        r2 = r3[r2];
        if (r2 >= 0) goto L_0x0023;
    L_0x0054:
        r2 = r1 + 1;
        r1 = r3[r1];
        if (r1 >= 0) goto L_0x0072;
    L_0x005a:
        r1 = r2 + 1;
        r2 = r3[r2];
        if (r2 >= 0) goto L_0x0023;
    L_0x0060:
        r2 = r1 + 1;
        r1 = r3[r1];
        if (r1 >= 0) goto L_0x0072;
    L_0x0066:
        r1 = r2 + 1;
        r2 = r3[r2];
        if (r2 >= 0) goto L_0x0023;
    L_0x006c:
        r0 = r5.mo6257t();
        r0 = (int) r0;
        goto L_0x0010;
    L_0x0072:
        r1 = r2;
        goto L_0x0023;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.t.s():int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long m33663x() {
        /*
        r10 = this;
        r8 = 0;
        r0 = r10.f35491j;
        r1 = r10.f35489h;
        if (r1 == r0) goto L_0x00b4;
    L_0x0008:
        r4 = r10.f35487f;
        r1 = r0 + 1;
        r0 = r4[r0];
        if (r0 < 0) goto L_0x0014;
    L_0x0010:
        r10.f35491j = r1;
        r0 = (long) r0;
    L_0x0013:
        return r0;
    L_0x0014:
        r2 = r10.f35489h;
        r2 = r2 - r1;
        r3 = 9;
        if (r2 < r3) goto L_0x00b4;
    L_0x001b:
        r2 = r1 + 1;
        r1 = r4[r1];
        r1 = r1 << 7;
        r0 = r0 ^ r1;
        if (r0 >= 0) goto L_0x002a;
    L_0x0024:
        r0 = r0 ^ -128;
        r0 = (long) r0;
    L_0x0027:
        r10.f35491j = r2;
        goto L_0x0013;
    L_0x002a:
        r3 = r2 + 1;
        r1 = r4[r2];
        r1 = r1 << 14;
        r0 = r0 ^ r1;
        if (r0 < 0) goto L_0x0038;
    L_0x0033:
        r0 = r0 ^ 16256;
        r0 = (long) r0;
        r2 = r3;
        goto L_0x0027;
    L_0x0038:
        r2 = r3 + 1;
        r1 = r4[r3];
        r1 = r1 << 21;
        r0 = r0 ^ r1;
        if (r0 >= 0) goto L_0x0047;
    L_0x0041:
        r1 = -2080896; // 0xffffffffffe03f80 float:NaN double:NaN;
        r0 = r0 ^ r1;
        r0 = (long) r0;
        goto L_0x0027;
    L_0x0047:
        r0 = (long) r0;
        r3 = r2 + 1;
        r2 = r4[r2];
        r6 = (long) r2;
        r2 = 28;
        r6 = r6 << r2;
        r0 = r0 ^ r6;
        r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r2 < 0) goto L_0x005b;
    L_0x0055:
        r4 = 266354560; // 0xfe03f80 float:2.2112565E-29 double:1.315966377E-315;
        r0 = r0 ^ r4;
        r2 = r3;
        goto L_0x0027;
    L_0x005b:
        r2 = r3 + 1;
        r3 = r4[r3];
        r6 = (long) r3;
        r3 = 35;
        r6 = r6 << r3;
        r0 = r0 ^ r6;
        r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r3 >= 0) goto L_0x006f;
    L_0x0068:
        r4 = -34093383808; // 0xfffffff80fe03f80 float:2.2112565E-29 double:NaN;
        r0 = r0 ^ r4;
        goto L_0x0027;
    L_0x006f:
        r3 = r2 + 1;
        r2 = r4[r2];
        r6 = (long) r2;
        r2 = 42;
        r6 = r6 << r2;
        r0 = r0 ^ r6;
        r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r2 < 0) goto L_0x0084;
    L_0x007c:
        r4 = 4363953127296; // 0x3f80fe03f80 float:2.2112565E-29 double:2.1560793202584E-311;
        r0 = r0 ^ r4;
        r2 = r3;
        goto L_0x0027;
    L_0x0084:
        r2 = r3 + 1;
        r3 = r4[r3];
        r6 = (long) r3;
        r3 = 49;
        r6 = r6 << r3;
        r0 = r0 ^ r6;
        r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r3 >= 0) goto L_0x0098;
    L_0x0091:
        r4 = -558586000294016; // 0xfffe03f80fe03f80 float:2.2112565E-29 double:NaN;
        r0 = r0 ^ r4;
        goto L_0x0027;
    L_0x0098:
        r3 = r2 + 1;
        r2 = r4[r2];
        r6 = (long) r2;
        r2 = 56;
        r6 = r6 << r2;
        r0 = r0 ^ r6;
        r6 = 71499008037633920; // 0xfe03f80fe03f80 float:2.2112565E-29 double:6.838959413692434E-304;
        r0 = r0 ^ r6;
        r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r2 >= 0) goto L_0x00ba;
    L_0x00ab:
        r2 = r3 + 1;
        r3 = r4[r3];
        r4 = (long) r3;
        r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r3 >= 0) goto L_0x0027;
    L_0x00b4:
        r0 = r10.mo6257t();
        goto L_0x0013;
    L_0x00ba:
        r2 = r3;
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.t.x():long");
    }

    final long mo6257t() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte B = m33662B();
            j |= ((long) (B & 127)) << i;
            if ((B & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.m32666c();
    }

    private final int m33664y() {
        int i = this.f35491j;
        if (this.f35489h - i < 4) {
            throw InvalidProtocolBufferException.m32664a();
        }
        byte[] bArr = this.f35487f;
        this.f35491j = i + 4;
        return ((bArr[i + 3] & HprofParser.ROOT_UNKNOWN) << 24) | (((bArr[i] & HprofParser.ROOT_UNKNOWN) | ((bArr[i + 1] & HprofParser.ROOT_UNKNOWN) << 8)) | ((bArr[i + 2] & HprofParser.ROOT_UNKNOWN) << 16));
    }

    private final long m33665z() {
        int i = this.f35491j;
        if (this.f35489h - i < 8) {
            throw InvalidProtocolBufferException.m32664a();
        }
        byte[] bArr = this.f35487f;
        this.f35491j = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((((((((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8)) | ((((long) bArr[i + 2]) & 255) << 16)) | ((((long) bArr[i + 3]) & 255) << 24)) | ((((long) bArr[i + 4]) & 255) << 32)) | ((((long) bArr[i + 5]) & 255) << 40)) | ((((long) bArr[i + 6]) & 255) << 48));
    }

    public final int mo6238c(int i) {
        if (i < 0) {
            throw InvalidProtocolBufferException.m32665b();
        }
        int w = mo6260w() + i;
        int i2 = this.f35495n;
        if (w > i2) {
            throw InvalidProtocolBufferException.m32664a();
        }
        this.f35495n = w;
        m33661A();
        return i2;
    }

    private final void m33661A() {
        this.f35489h += this.f35490i;
        int i = this.f35489h - this.f35492k;
        if (i > this.f35495n) {
            this.f35490i = i - this.f35495n;
            this.f35489h -= this.f35490i;
            return;
        }
        this.f35490i = 0;
    }

    public final void mo6240d(int i) {
        this.f35495n = i;
        m33661A();
    }

    public final int mo6258u() {
        if (this.f35495n == Integer.MAX_VALUE) {
            return -1;
        }
        return this.f35495n - mo6260w();
    }

    public final boolean mo6259v() {
        return this.f35491j == this.f35489h;
    }

    public final int mo6260w() {
        return this.f35491j - this.f35492k;
    }

    private final byte m33662B() {
        if (this.f35491j == this.f35489h) {
            throw InvalidProtocolBufferException.m32664a();
        }
        byte[] bArr = this.f35487f;
        int i = this.f35491j;
        this.f35491j = i + 1;
        return bArr[i];
    }

    public final void mo6242e(int i) {
        if (i >= 0 && i <= this.f35489h - this.f35491j) {
            this.f35491j += i;
        } else if (i < 0) {
            throw InvalidProtocolBufferException.m32665b();
        } else {
            throw InvalidProtocolBufferException.m32664a();
        }
    }
}
