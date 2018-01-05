package com.google.android.gms.internal;

import com.squareup.haha.perflib.HprofParser;

public final class ws {
    public final byte[] f27632a;
    public int f27633b;
    public int f27634c;
    public int f27635d;
    public int f27636e;
    public int f27637f;
    public int f27638g = Integer.MAX_VALUE;
    public int f27639h;
    public int f27640i = 64;

    ws(byte[] bArr, int i) {
        this.f27632a = bArr;
        this.f27633b = 0;
        this.f27634c = i + 0;
        this.f27636e = 0;
    }

    private final void m25862f(int i) {
        if (i < 0) {
            throw zzfyy.m26060b();
        } else if (this.f27636e + i > this.f27638g) {
            m25862f(this.f27638g - this.f27636e);
            throw zzfyy.m26059a();
        } else if (i <= this.f27634c - this.f27636e) {
            this.f27636e += i;
        } else {
            throw zzfyy.m26059a();
        }
    }

    private final void m25863k() {
        this.f27634c += this.f27635d;
        int i = this.f27634c;
        if (i > this.f27638g) {
            this.f27635d = i - this.f27638g;
            this.f27634c -= this.f27635d;
            return;
        }
        this.f27635d = 0;
    }

    private final byte m25864l() {
        if (this.f27636e == this.f27634c) {
            throw zzfyy.m26059a();
        }
        byte[] bArr = this.f27632a;
        int i = this.f27636e;
        this.f27636e = i + 1;
        return bArr[i];
    }

    public final int m25865a() {
        if (this.f27636e == this.f27634c) {
            this.f27637f = 0;
            return 0;
        }
        this.f27637f = m25875e();
        if (this.f27637f != 0) {
            return this.f27637f;
        }
        throw new zzfyy("Protocol message contained an invalid tag (zero).");
    }

    public final void m25866a(int i) {
        if (this.f27637f != i) {
            throw new zzfyy("Protocol message end-group tag did not match expected tag.");
        }
    }

    final void m25867a(int i, int i2) {
        if (i > this.f27636e - this.f27633b) {
            throw new IllegalArgumentException("Position " + i + " is beyond current " + (this.f27636e - this.f27633b));
        } else if (i < 0) {
            throw new IllegalArgumentException("Bad position " + i);
        } else {
            this.f27636e = this.f27633b + i;
            this.f27637f = i2;
        }
    }

    public final boolean m25869b() {
        return m25875e() != 0;
    }

    public final boolean m25870b(int i) {
        switch (i & 7) {
            case 0:
                m25875e();
                return true;
            case 1:
                m25879h();
                return true;
            case 2:
                m25862f(m25875e());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                m25878g();
                return true;
            default:
                throw new zzfyy("Protocol message tag had invalid wire type.");
        }
        int a;
        do {
            a = m25865a();
            if (a != 0) {
            }
            m25866a(((i >>> 3) << 3) | 4);
            return true;
        } while (m25870b(a));
        m25866a(((i >>> 3) << 3) | 4);
        return true;
    }

    public final int m25871c(int i) {
        if (i < 0) {
            throw zzfyy.m26060b();
        }
        int i2 = this.f27636e + i;
        int i3 = this.f27638g;
        if (i2 > i3) {
            throw zzfyy.m26059a();
        }
        this.f27638g = i2;
        m25863k();
        return i3;
    }

    public final String m25872c() {
        int e = m25875e();
        if (e < 0) {
            throw zzfyy.m26060b();
        } else if (e > this.f27634c - this.f27636e) {
            throw zzfyy.m26059a();
        } else {
            String str = new String(this.f27632a, this.f27636e, e, wy.f27651a);
            this.f27636e = e + this.f27636e;
            return str;
        }
    }

    public final void m25873d(int i) {
        this.f27638g = i;
        m25863k();
    }

    public final byte[] m25874d() {
        int e = m25875e();
        if (e < 0) {
            throw zzfyy.m26060b();
        } else if (e == 0) {
            return xc.f27660f;
        } else {
            if (e > this.f27634c - this.f27636e) {
                throw zzfyy.m26059a();
            }
            Object obj = new byte[e];
            System.arraycopy(this.f27632a, this.f27636e, obj, 0, e);
            this.f27636e = e + this.f27636e;
            return obj;
        }
    }

    public final int m25875e() {
        byte l = m25864l();
        if (l >= (byte) 0) {
            return l;
        }
        int i = l & 127;
        byte l2 = m25864l();
        if (l2 >= (byte) 0) {
            return i | (l2 << 7);
        }
        i |= (l2 & 127) << 7;
        l2 = m25864l();
        if (l2 >= (byte) 0) {
            return i | (l2 << 14);
        }
        i |= (l2 & 127) << 14;
        l2 = m25864l();
        if (l2 >= (byte) 0) {
            return i | (l2 << 21);
        }
        i |= (l2 & 127) << 21;
        l2 = m25864l();
        i |= l2 << 28;
        if (l2 >= (byte) 0) {
            return i;
        }
        for (int i2 = 0; i2 < 5; i2++) {
            if (m25864l() >= (byte) 0) {
                return i;
            }
        }
        throw zzfyy.m26061c();
    }

    public final void m25876e(int i) {
        m25867a(i, this.f27637f);
    }

    public final long m25877f() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte l = m25864l();
            j |= ((long) (l & 127)) << i;
            if ((l & 128) == 0) {
                return j;
            }
        }
        throw zzfyy.m26061c();
    }

    public final int m25878g() {
        return (((m25864l() & HprofParser.ROOT_UNKNOWN) | ((m25864l() & HprofParser.ROOT_UNKNOWN) << 8)) | ((m25864l() & HprofParser.ROOT_UNKNOWN) << 16)) | ((m25864l() & HprofParser.ROOT_UNKNOWN) << 24);
    }

    public final long m25879h() {
        byte l = m25864l();
        byte l2 = m25864l();
        return ((((((((((long) l2) & 255) << 8) | (((long) l) & 255)) | ((((long) m25864l()) & 255) << 16)) | ((((long) m25864l()) & 255) << 24)) | ((((long) m25864l()) & 255) << 32)) | ((((long) m25864l()) & 255) << 40)) | ((((long) m25864l()) & 255) << 48)) | ((((long) m25864l()) & 255) << 56);
    }

    public final int m25880i() {
        if (this.f27638g == Integer.MAX_VALUE) {
            return -1;
        }
        return this.f27638g - this.f27636e;
    }

    public final int m25881j() {
        return this.f27636e - this.f27633b;
    }

    public final void m25868a(wz wzVar) {
        int e = m25875e();
        if (this.f27639h >= this.f27640i) {
            throw new zzfyy("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        e = m25871c(e);
        this.f27639h++;
        wzVar.mo4705a(this);
        m25866a(0);
        this.f27639h--;
        m25873d(e);
    }
}
