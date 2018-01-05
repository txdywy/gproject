package com.google.protobuf.nano;

import com.google.protobuf.C7225s;
import com.squareup.haha.perflib.HprofParser;

public final class C7213a {
    public final byte[] f35437a;
    public final int f35438b;
    public final int f35439c;
    public int f35440d;
    public int f35441e;
    public int f35442f;
    public int f35443g;
    public int f35444h = Integer.MAX_VALUE;
    public int f35445i;
    public int f35446j = 64;
    public C7225s f35447k;

    public static C7213a m33546a(byte[] bArr, int i, int i2) {
        return new C7213a(bArr, i, i2);
    }

    public final int m33550a() {
        if (m33572n()) {
            this.f35443g = 0;
            return 0;
        }
        this.f35443g = m33567i();
        if (this.f35443g != 0) {
            return this.f35443g;
        }
        throw new InvalidProtocolBufferNanoException("Protocol message contained an invalid tag (zero).");
    }

    public final void m33551a(int i) {
        if (this.f35443g != i) {
            throw new InvalidProtocolBufferNanoException("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final boolean m33557b(int i) {
        switch (i & 7) {
            case 0:
                m33567i();
                return true;
            case 1:
                m33570l();
                return true;
            case 2:
                m33547f(m33567i());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                m33569k();
                return true;
            default:
                throw new InvalidProtocolBufferNanoException("Protocol message tag had invalid wire type.");
        }
        int a;
        do {
            a = m33550a();
            if (a != 0) {
            }
            m33551a(((i >>> 3) << 3) | 4);
            return true;
        } while (m33557b(a));
        m33551a(((i >>> 3) << 3) | 4);
        return true;
    }

    public final long m33555b() {
        return m33568j();
    }

    public final long m33559c() {
        return m33568j();
    }

    public final int m33560d() {
        return m33567i();
    }

    public final boolean m33563e() {
        return m33567i() != 0;
    }

    public final String m33564f() {
        int i = m33567i();
        if (i < 0) {
            throw InvalidProtocolBufferNanoException.m33543b();
        } else if (i > this.f35440d - this.f35442f) {
            throw InvalidProtocolBufferNanoException.m33542a();
        } else {
            String str = new String(this.f35437a, this.f35442f, i, C7219h.f35464a);
            this.f35442f = i + this.f35442f;
            return str;
        }
    }

    public final void m33553a(i iVar, int i) {
        if (this.f35445i >= this.f35446j) {
            throw InvalidProtocolBufferNanoException.m33545d();
        }
        this.f35445i++;
        iVar.a(this);
        m33551a((i << 3) | 4);
        this.f35445i--;
    }

    public final void m33552a(i iVar) {
        int i = m33567i();
        if (this.f35445i >= this.f35446j) {
            throw InvalidProtocolBufferNanoException.m33545d();
        }
        i = m33558c(i);
        this.f35445i++;
        iVar.a(this);
        m33551a(0);
        this.f35445i--;
        m33561d(i);
    }

    public final byte[] m33565g() {
        int i = m33567i();
        if (i < 0) {
            throw InvalidProtocolBufferNanoException.m33543b();
        } else if (i == 0) {
            return C7222l.f35479l;
        } else {
            if (i > this.f35440d - this.f35442f) {
                throw InvalidProtocolBufferNanoException.m33542a();
            }
            byte[] bArr = new byte[i];
            System.arraycopy(this.f35437a, this.f35442f, bArr, 0, i);
            this.f35442f = i + this.f35442f;
            return bArr;
        }
    }

    public final int m33566h() {
        return m33567i();
    }

    public final int m33567i() {
        byte q = m33549q();
        if (q >= (byte) 0) {
            return q;
        }
        int i = q & 127;
        byte q2 = m33549q();
        if (q2 >= (byte) 0) {
            return i | (q2 << 7);
        }
        i |= (q2 & 127) << 7;
        q2 = m33549q();
        if (q2 >= (byte) 0) {
            return i | (q2 << 14);
        }
        i |= (q2 & 127) << 14;
        q2 = m33549q();
        if (q2 >= (byte) 0) {
            return i | (q2 << 21);
        }
        i |= (q2 & 127) << 21;
        q2 = m33549q();
        i |= q2 << 28;
        if (q2 >= (byte) 0) {
            return i;
        }
        for (int i2 = 0; i2 < 5; i2++) {
            if (m33549q() >= (byte) 0) {
                return i;
            }
        }
        throw InvalidProtocolBufferNanoException.m33544c();
    }

    public final long m33568j() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte q = m33549q();
            j |= ((long) (q & 127)) << i;
            if ((q & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferNanoException.m33544c();
    }

    public final int m33569k() {
        return (((m33549q() & HprofParser.ROOT_UNKNOWN) | ((m33549q() & HprofParser.ROOT_UNKNOWN) << 8)) | ((m33549q() & HprofParser.ROOT_UNKNOWN) << 16)) | ((m33549q() & HprofParser.ROOT_UNKNOWN) << 24);
    }

    public final long m33570l() {
        byte q = m33549q();
        byte q2 = m33549q();
        return ((((((((((long) q2) & 255) << 8) | (((long) q) & 255)) | ((((long) m33549q()) & 255) << 16)) | ((((long) m33549q()) & 255) << 24)) | ((((long) m33549q()) & 255) << 32)) | ((((long) m33549q()) & 255) << 40)) | ((((long) m33549q()) & 255) << 48)) | ((((long) m33549q()) & 255) << 56);
    }

    private C7213a(byte[] bArr, int i, int i2) {
        this.f35437a = bArr;
        this.f35438b = i;
        int i3 = i + i2;
        this.f35440d = i3;
        this.f35439c = i3;
        this.f35442f = i;
    }

    public final int m33558c(int i) {
        if (i < 0) {
            throw InvalidProtocolBufferNanoException.m33543b();
        }
        int i2 = this.f35442f + i;
        int i3 = this.f35444h;
        if (i2 > i3) {
            throw InvalidProtocolBufferNanoException.m33542a();
        }
        this.f35444h = i2;
        m33548p();
        return i3;
    }

    private final void m33548p() {
        this.f35440d += this.f35441e;
        int i = this.f35440d;
        if (i > this.f35444h) {
            this.f35441e = i - this.f35444h;
            this.f35440d -= this.f35441e;
            return;
        }
        this.f35441e = 0;
    }

    public final void m33561d(int i) {
        this.f35444h = i;
        m33548p();
    }

    public final int m33571m() {
        if (this.f35444h == Integer.MAX_VALUE) {
            return -1;
        }
        return this.f35444h - this.f35442f;
    }

    public final boolean m33572n() {
        return this.f35442f == this.f35440d;
    }

    public final int m33573o() {
        return this.f35442f - this.f35438b;
    }

    public final byte[] m33554a(int i, int i2) {
        if (i2 == 0) {
            return C7222l.f35479l;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f35437a, this.f35438b + i, bArr, 0, i2);
        return bArr;
    }

    public final void m33562e(int i) {
        m33556b(i, this.f35443g);
    }

    final void m33556b(int i, int i2) {
        if (i > this.f35442f - this.f35438b) {
            throw new IllegalArgumentException("Position " + i + " is beyond current " + (this.f35442f - this.f35438b));
        } else if (i < 0) {
            throw new IllegalArgumentException("Bad position " + i);
        } else {
            this.f35442f = this.f35438b + i;
            this.f35443g = i2;
        }
    }

    private final byte m33549q() {
        if (this.f35442f == this.f35440d) {
            throw InvalidProtocolBufferNanoException.m33542a();
        }
        byte[] bArr = this.f35437a;
        int i = this.f35442f;
        this.f35442f = i + 1;
        return bArr[i];
    }

    private final void m33547f(int i) {
        if (i < 0) {
            throw InvalidProtocolBufferNanoException.m33543b();
        } else if (this.f35442f + i > this.f35444h) {
            m33547f(this.f35444h - this.f35442f);
            throw InvalidProtocolBufferNanoException.m33542a();
        } else if (i <= this.f35440d - this.f35442f) {
            this.f35442f += i;
        } else {
            throw InvalidProtocolBufferNanoException.m33542a();
        }
    }
}
