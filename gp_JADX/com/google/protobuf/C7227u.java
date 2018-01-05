package com.google.protobuf;

import android.support.v7.widget.eq;
import com.squareup.haha.perflib.HprofParser;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

final class C7227u extends C7225s {
    public final InputStream f35496f;
    public final byte[] f35497g;
    public int f35498h;
    public int f35499i;
    public int f35500j;
    public int f35501k;
    public int f35502l;
    public int f35503m = Integer.MAX_VALUE;
    public C7228v f35504n = null;

    C7227u(InputStream inputStream) {
        bb.m32995a((Object) inputStream, "input");
        this.f35496f = inputStream;
        this.f35497g = new byte[eq.FLAG_APPEARED_IN_PRE_LAYOUT];
        this.f35498h = 0;
        this.f35500j = 0;
        this.f35502l = 0;
    }

    public final int mo6231a() {
        if (mo6259v()) {
            this.f35501k = 0;
            return 0;
        }
        this.f35501k = mo6256s();
        if ((this.f35501k >>> 3) != 0) {
            return this.f35501k;
        }
        throw InvalidProtocolBufferException.m32667d();
    }

    public final void mo6234a(int i) {
        if (this.f35501k != i) {
            throw InvalidProtocolBufferException.m32668e();
        }
    }

    public final boolean mo6236b(int i) {
        int i2 = 0;
        switch (i & 7) {
            case 0:
                if (this.f35498h - this.f35500j >= 10) {
                    while (i2 < 10) {
                        byte[] bArr = this.f35497g;
                        int i3 = this.f35500j;
                        this.f35500j = i3 + 1;
                        if (bArr[i3] >= (byte) 0) {
                            return true;
                        }
                        i2++;
                    }
                    throw InvalidProtocolBufferException.m32666c();
                }
                while (i2 < 10) {
                    if (m33697B() >= (byte) 0) {
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
        return Double.longBitsToDouble(m33705z());
    }

    public final float mo6237c() {
        return Float.intBitsToFloat(m33704y());
    }

    public final long mo6239d() {
        return m33703x();
    }

    public final long mo6241e() {
        return m33703x();
    }

    public final int mo6243f() {
        return mo6256s();
    }

    public final long mo6244g() {
        return m33705z();
    }

    public final int mo6245h() {
        return m33704y();
    }

    public final boolean mo6246i() {
        return m33703x() != 0;
    }

    public final String mo6247j() {
        int s = mo6256s();
        String str;
        if (s > 0 && s <= this.f35498h - this.f35500j) {
            str = new String(this.f35497g, this.f35500j, s, bb.f35208a);
            this.f35500j = s + this.f35500j;
            return str;
        } else if (s == 0) {
            return "";
        } else {
            if (s > this.f35498h) {
                return new String(m33700i(s), bb.f35208a);
            }
            m33698g(s);
            str = new String(this.f35497g, this.f35500j, s, bb.f35208a);
            this.f35500j = s + this.f35500j;
            return str;
        }
    }

    public final String mo6248k() {
        byte[] bArr;
        int s = mo6256s();
        int i = this.f35500j;
        if (s <= this.f35498h - i && s > 0) {
            bArr = this.f35497g;
            this.f35500j = i + s;
        } else if (s == 0) {
            return "";
        } else {
            if (s <= this.f35498h) {
                m33698g(s);
                byte[] bArr2 = this.f35497g;
                this.f35500j = s + 0;
                bArr = bArr2;
                i = 0;
            } else {
                bArr = m33700i(s);
                i = 0;
            }
        }
        if (Utf8.m32681a(bArr, i, i + s)) {
            return new String(bArr, i, s, bb.f35208a);
        }
        throw InvalidProtocolBufferException.m32673j();
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
        if (s <= this.f35498h - this.f35500j && s > 0) {
            C7203j a = C7203j.m33201a(this.f35497g, this.f35500j, s);
            this.f35500j = s + this.f35500j;
            return a;
        } else if (s == 0) {
            return C7203j.f35320a;
        } else {
            byte[] j = m33701j(s);
            if (j != null) {
                return C7203j.m33200a(j);
            }
            int i = this.f35500j;
            int i2 = this.f35498h - this.f35500j;
            this.f35502l += this.f35498h;
            this.f35500j = 0;
            this.f35498h = 0;
            List<byte[]> k = m33702k(s - i2);
            Iterable arrayList = new ArrayList(k.size() + 1);
            arrayList.add(C7203j.m33201a(this.f35497g, i, i2));
            for (byte[] j2 : k) {
                arrayList.add(C7203j.m33200a(j2));
            }
            return C7203j.m33197a(arrayList);
        }
    }

    public final int mo6250m() {
        return mo6256s();
    }

    public final int mo6251n() {
        return mo6256s();
    }

    public final int mo6252o() {
        return m33704y();
    }

    public final long mo6253p() {
        return m33705z();
    }

    public final int mo6254q() {
        return C7225s.m33630f(mo6256s());
    }

    public final long mo6255r() {
        return C7225s.m33627a(m33703x());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo6256s() {
        /*
        r5 = this;
        r0 = r5.f35500j;
        r1 = r5.f35498h;
        if (r1 == r0) goto L_0x006c;
    L_0x0006:
        r3 = r5.f35497g;
        r2 = r0 + 1;
        r0 = r3[r0];
        if (r0 < 0) goto L_0x0011;
    L_0x000e:
        r5.f35500j = r2;
    L_0x0010:
        return r0;
    L_0x0011:
        r1 = r5.f35498h;
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
        r5.f35500j = r1;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u.s():int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long m33703x() {
        /*
        r10 = this;
        r8 = 0;
        r0 = r10.f35500j;
        r1 = r10.f35498h;
        if (r1 == r0) goto L_0x00b4;
    L_0x0008:
        r4 = r10.f35497g;
        r1 = r0 + 1;
        r0 = r4[r0];
        if (r0 < 0) goto L_0x0014;
    L_0x0010:
        r10.f35500j = r1;
        r0 = (long) r0;
    L_0x0013:
        return r0;
    L_0x0014:
        r2 = r10.f35498h;
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
        r10.f35500j = r2;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u.x():long");
    }

    final long mo6257t() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte B = m33697B();
            j |= ((long) (B & 127)) << i;
            if ((B & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.m32666c();
    }

    private final int m33704y() {
        int i = this.f35500j;
        if (this.f35498h - i < 4) {
            m33698g(4);
            i = this.f35500j;
        }
        byte[] bArr = this.f35497g;
        this.f35500j = i + 4;
        return ((bArr[i + 3] & HprofParser.ROOT_UNKNOWN) << 24) | (((bArr[i] & HprofParser.ROOT_UNKNOWN) | ((bArr[i + 1] & HprofParser.ROOT_UNKNOWN) << 8)) | ((bArr[i + 2] & HprofParser.ROOT_UNKNOWN) << 16));
    }

    private final long m33705z() {
        int i = this.f35500j;
        if (this.f35498h - i < 8) {
            m33698g(8);
            i = this.f35500j;
        }
        byte[] bArr = this.f35497g;
        this.f35500j = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((((((((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8)) | ((((long) bArr[i + 2]) & 255) << 16)) | ((((long) bArr[i + 3]) & 255) << 24)) | ((((long) bArr[i + 4]) & 255) << 32)) | ((((long) bArr[i + 5]) & 255) << 40)) | ((((long) bArr[i + 6]) & 255) << 48));
    }

    public final int mo6238c(int i) {
        if (i < 0) {
            throw InvalidProtocolBufferException.m32665b();
        }
        int i2 = (this.f35502l + this.f35500j) + i;
        int i3 = this.f35503m;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.m32664a();
        }
        this.f35503m = i2;
        m33696A();
        return i3;
    }

    private final void m33696A() {
        this.f35498h += this.f35499i;
        int i = this.f35502l + this.f35498h;
        if (i > this.f35503m) {
            this.f35499i = i - this.f35503m;
            this.f35498h -= this.f35499i;
            return;
        }
        this.f35499i = 0;
    }

    public final void mo6240d(int i) {
        this.f35503m = i;
        m33696A();
    }

    public final int mo6258u() {
        if (this.f35503m == Integer.MAX_VALUE) {
            return -1;
        }
        return this.f35503m - (this.f35502l + this.f35500j);
    }

    public final boolean mo6259v() {
        return this.f35500j == this.f35498h && !m33699h(1);
    }

    public final int mo6260w() {
        return this.f35502l + this.f35500j;
    }

    private final void m33698g(int i) {
        if (!m33699h(i)) {
            if (i > (this.c - this.f35502l) - this.f35500j) {
                throw InvalidProtocolBufferException.m32671h();
            }
            throw InvalidProtocolBufferException.m32664a();
        }
    }

    private final boolean m33699h(int i) {
        while (this.f35500j + i > this.f35498h) {
            if (i > (this.c - this.f35502l) - this.f35500j || (this.f35502l + this.f35500j) + i > this.f35503m) {
                return false;
            }
            if (this.f35504n != null) {
                this.f35504n.m33736a();
            }
            int i2 = this.f35500j;
            if (i2 > 0) {
                if (this.f35498h > i2) {
                    System.arraycopy(this.f35497g, i2, this.f35497g, 0, this.f35498h - i2);
                }
                this.f35502l += i2;
                this.f35498h -= i2;
                this.f35500j = 0;
            }
            i2 = this.f35496f.read(this.f35497g, this.f35498h, Math.min(this.f35497g.length - this.f35498h, (this.c - this.f35502l) - this.f35498h));
            if (i2 == 0 || i2 < -1 || i2 > this.f35497g.length) {
                throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + i2 + "\nThe InputStream implementation is buggy.");
            } else if (i2 <= 0) {
                return false;
            } else {
                this.f35498h = i2 + this.f35498h;
                m33696A();
                if (this.f35498h >= i) {
                    return true;
                }
            }
        }
        throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
    }

    private final byte m33697B() {
        if (this.f35500j == this.f35498h) {
            m33698g(1);
        }
        byte[] bArr = this.f35497g;
        int i = this.f35500j;
        this.f35500j = i + 1;
        return bArr[i];
    }

    private final byte[] m33700i(int i) {
        byte[] j = m33701j(i);
        if (j != null) {
            return j;
        }
        int i2 = this.f35500j;
        int i3 = this.f35498h - this.f35500j;
        this.f35502l += this.f35498h;
        this.f35500j = 0;
        this.f35498h = 0;
        List<byte[]> k = m33702k(i - i3);
        Object obj = new byte[i];
        System.arraycopy(this.f35497g, i2, obj, 0, i3);
        i2 = i3;
        for (byte[] j2 : k) {
            System.arraycopy(j2, 0, obj, i2, j2.length);
            i2 = j2.length + i2;
        }
        return obj;
    }

    private final byte[] m33701j(int i) {
        if (i == 0) {
            return bb.f35209b;
        }
        if (i < 0) {
            throw InvalidProtocolBufferException.m32665b();
        }
        int i2 = (this.f35502l + this.f35500j) + i;
        if (i2 - this.c > 0) {
            throw InvalidProtocolBufferException.m32671h();
        } else if (i2 > this.f35503m) {
            mo6242e((this.f35503m - this.f35502l) - this.f35500j);
            throw InvalidProtocolBufferException.m32664a();
        } else {
            i2 = this.f35498h - this.f35500j;
            int i3 = i - i2;
            if (i3 >= eq.FLAG_APPEARED_IN_PRE_LAYOUT && i3 > this.f35496f.available()) {
                return null;
            }
            Object obj = new byte[i];
            System.arraycopy(this.f35497g, this.f35500j, obj, 0, i2);
            this.f35502l += this.f35498h;
            this.f35500j = 0;
            this.f35498h = 0;
            while (i2 < obj.length) {
                int read = this.f35496f.read(obj, i2, i - i2);
                if (read == -1) {
                    throw InvalidProtocolBufferException.m32664a();
                }
                this.f35502l += read;
                i2 += read;
            }
            return obj;
        }
    }

    private final List m33702k(int i) {
        List arrayList = new ArrayList();
        while (i > 0) {
            Object obj = new byte[Math.min(i, eq.FLAG_APPEARED_IN_PRE_LAYOUT)];
            int i2 = 0;
            while (i2 < obj.length) {
                int read = this.f35496f.read(obj, i2, obj.length - i2);
                if (read == -1) {
                    throw InvalidProtocolBufferException.m32664a();
                }
                this.f35502l += read;
                i2 += read;
            }
            i -= obj.length;
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final void mo6242e(int i) {
        if (i <= this.f35498h - this.f35500j && i >= 0) {
            this.f35500j += i;
        } else if (i < 0) {
            throw InvalidProtocolBufferException.m32665b();
        } else if ((this.f35502l + this.f35500j) + i > this.f35503m) {
            mo6242e((this.f35503m - this.f35502l) - this.f35500j);
            throw InvalidProtocolBufferException.m32664a();
        } else {
            int i2 = this.f35498h - this.f35500j;
            this.f35500j = this.f35498h;
            m33698g(1);
            while (i - i2 > this.f35498h) {
                i2 += this.f35498h;
                this.f35500j = this.f35498h;
                m33698g(1);
            }
            this.f35500j = i - i2;
        }
    }
}
