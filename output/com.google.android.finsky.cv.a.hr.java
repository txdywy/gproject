package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

public final class com.google.android.finsky.cv.a.hr extends com.google.protobuf.nano.b
{

    public int a;
    public int b;
    public float c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public double k;
    public long l;
    public long m;
    public ht[] n;
    public com.google.android.finsky.cv.a.hs o;

    hr() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 1;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = com.google.android.finsky.cv.a.ht.bk_();
        this.o = 0;
        this.aO = 0;
        this.aP = -1;
    }

    private final com.google.android.finsky.cv.a.hr b(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 8:
  5:            goto 15;
            case 21:
  5:            goto 64;
            case 24:
  5:            goto 81;
            case 32:
  5:            goto 94;
            case 40:
  5:            goto 107;
            case 48:
  5:            goto 120;
            case 56:
  5:            goto 134;
            case 64:
  5:            goto 148;
            case 72:
  5:            goto 162;
            case 80:
  5:            goto 176;
            case 88:
  5:            goto 190;
            case 97:
  5:            goto 204;
            case 106:
  5:            goto 222;
            case 122:
  5:            goto 286;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 19:    try {
 19:        v3 = p0.i();
 23:        switch (v3) {
                case 1:
 61:                try {
 61:                    this.b = v3;
                    }
                    catch (IllegalArgumentException ex) {
 54:                    p0.e(p0.o());
 57:                    this.a(p0, v0);
                    }
305:                break;
                case 2:
 61:                try {
 61:                    this.b = v3;
                    }
                    catch (IllegalArgumentException ex) {
 54:                    p0.e(p0.o());
 57:                    this.a(p0, v0);
                    }
305:                break;
                case 3:
 61:                try {
 61:                    this.b = v3;
                    }
                    catch (IllegalArgumentException ex) {
 54:                    p0.e(p0.o());
 57:                    this.a(p0, v0);
                    }
305:                break;
                default:
 52:                throw new IllegalArgumentException(51 + v3 + " is not a valid enum AggregateRatingType");
            }
        }
        catch (IllegalArgumentException ex) {
        }
 54:    p0.e(p0.o());
 57:    this.a(p0, v0);
 60:    goto 1;
 72:    this.c = Float.intBitsToFloat(p0.k());
 78:    this.a = this.a | 1;
 80:    goto 1;
 85:    this.d = p0.j();
 91:    this.a = this.a | 2;
 93:    goto 1;
 98:    this.f = p0.j();
104:    this.a = this.a | 8;
106:    goto 1;
111:    this.g = p0.j();
117:    this.a = this.a | 16;
119:    goto 1;
124:    this.h = p0.j();
130:    this.a = this.a | 32;
132:    goto 1;
138:    this.i = p0.j();
144:    this.a = this.a | 64;
146:    goto 1;
152:    this.j = p0.j();
158:    this.a = this.a | 128;
160:    goto 1;
166:    this.l = p0.j();
172:    this.a = this.a | 512;
174:    goto 1;
180:    this.m = p0.j();
186:    this.a = this.a | 1024;
188:    goto 1;
194:    this.e = p0.j();
200:    this.a = this.a | 4;
202:    goto 1;
212:    this.k = Double.longBitsToDouble(p0.l());
218:    this.a = this.a | 256;
220:    goto 1;
230:    if (this.n == 0)
232:        v0 = 0;
        else
268:        v0 = this.n.length;
234:    v2 = new ht[com.google.protobuf.nano.l.a(p0, 106) + v0];
236:    if (v0 != 0)
240:        System.arraycopy(this.n, 0, v2, 0, v0);
243:    while (v0 < v2.length - 1) {
253:        v2[v0] = new com.google.android.finsky.cv.a.ht();
257:        p0.a(v2[v0]);
260:        p0.a();
263:        v0 = v0 + 1;
        }
265:    goto 270;
275:    v2[v0] = new com.google.android.finsky.cv.a.ht();
279:    p0.a(v2[v0]);
282:    this.n = v2;
284:    goto 1;
288:    if (this.o == 0)
295:        this.o = new com.google.android.finsky.cv.a.hs();
299:    p0.a(this.o);
302:    goto 1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        p0.a(1, this.b);
        if (this.a & 1)
            p0.a(2, this.c);
        if (this.a & 2)
            p0.a(3, this.d);
        if (this.a & 8)
            p0.a(4, this.f);
        if (this.a & 16)
            p0.a(5, this.g);
        if (this.a & 32)
            p0.a(6, this.h);
        if (this.a & 64)
            p0.a(7, this.i);
        if (this.a & 128)
            p0.a(8, this.j);
        if (this.a & 512)
            p0.a(9, this.l);
        if (this.a & 1024)
            p0.a(10, this.m);
        if (this.a & 4)
            p0.a(11, this.e);
        if (this.a & 256)
            p0.a(12, this.k);
        if (this.n != 0 && this.n.length > 0) {
            v0 = 0;
            while (v0 < this.n.length) {
                if (this.n[v0] != 0)
                    p0.b(13, this.n[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.o != 0)
            p0.b(15, this.o);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b() + CodedOutputByteBufferNano.d(1, this.b);
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.d(2) + 4;
        if (this.a & 2)
            v0 = v0 + CodedOutputByteBufferNano.e(3, this.d);
        if (this.a & 8)
            v0 = v0 + CodedOutputByteBufferNano.e(4, this.f);
        if (this.a & 16)
            v0 = v0 + CodedOutputByteBufferNano.e(5, this.g);
        if (this.a & 32)
            v0 = v0 + CodedOutputByteBufferNano.e(6, this.h);
        if (this.a & 64)
            v0 = v0 + CodedOutputByteBufferNano.e(7, this.i);
        if (this.a & 128)
            v0 = v0 + CodedOutputByteBufferNano.e(8, this.j);
        if (this.a & 512)
            v0 = v0 + CodedOutputByteBufferNano.e(9, this.l);
        if (this.a & 1024)
            v0 = v0 + CodedOutputByteBufferNano.e(10, this.m);
        if (this.a & 4)
            v0 = v0 + CodedOutputByteBufferNano.e(11, this.e);
        if (this.a & 256)
            v0 = v0 + CodedOutputByteBufferNano.d(12) + 8;
        if (this.n != 0 && this.n.length > 0) {
            v1 = v0;
            v0 = 0;
            while (v0 < this.n.length) {
                if (this.n[v0] != 0)
                    v1 = v1 + CodedOutputByteBufferNano.d(13, this.n[v0]);
                v0 = v0 + 1;
            }
            v0 = v1;
        }
        if (this.o != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(15, this.o);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.hr))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.hr)p0;
                if (this.b != p0.b)
                    v0 = 0;
                else if ((this.a & 1) != (p0.a & 1))
                    v0 = 0;
                else if (Float.floatToIntBits(this.c) != Float.floatToIntBits(p0.c))
                    v0 = 0;
                else if ((this.a & 2) != (p0.a & 2))
                    v0 = 0;
                else if (this.d != p0.d)
                    v0 = 0;
                else if ((this.a & 4) != (p0.a & 4))
                    v0 = 0;
                else if (this.e != p0.e)
                    v0 = 0;
                else if ((this.a & 8) != (p0.a & 8))
                    v0 = 0;
                else if (this.f != p0.f)
                    v0 = 0;
                else if ((this.a & 16) != (p0.a & 16))
                    v0 = 0;
                else if (this.g != p0.g)
                    v0 = 0;
                else if ((this.a & 32) != (p0.a & 32))
                    v0 = 0;
                else if (this.h != p0.h)
                    v0 = 0;
                else if ((this.a & 64) != (p0.a & 64))
                    v0 = 0;
                else if (this.i != p0.i)
                    v0 = 0;
                else if ((this.a & 128) != (p0.a & 128))
                    v0 = 0;
                else if (this.j != p0.j)
                    v0 = 0;
                else if ((this.a & 256) != (p0.a & 256))
                    v0 = 0;
                else if (Double.doubleToLongBits(this.k) != Double.doubleToLongBits(p0.k))
                    v0 = 0;
                else if ((this.a & 512) != (p0.a & 512))
                    v0 = 0;
                else if (this.l != p0.l)
                    v0 = 0;
                else if ((this.a & 1024) != (p0.a & 1024))
                    v0 = 0;
                else if (this.m != p0.m)
                    v0 = 0;
                else if (!com.google.protobuf.nano.h.a(this.n, p0.n))
                    v0 = 0;
                else if (this.o == 0) {
                    if (p0.o != 0)
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.o.equals(p0.o))
                    v0 = 0;
                else if (this.aO == 0 || this.aO.b()) {
                    if (p0.aO != 0 && !p0.aO.b())
                        v0 = 0;
                }
                else
                    v0 = this.aO.equals(p0.aO);
            }
        }
        return v0;
    }

    public final int hashCode() {
        v1 = 0;
        v2 = Double.doubleToLongBits(this.k);
        if (this.o == 0)
            v0 = 0;
        else
            v0 = this.o.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return (v0 + ((((((((((((((this.getClass().getName().hashCode() + 527) * 31 + this.b) * 31 + Float.floatToIntBits(this.c)) * 31 + (int)(this.d ^ this.d >>> 32)) * 31 + (int)(this.e ^ this.e >>> 32)) * 31 + (int)(this.f ^ this.f >>> 32)) * 31 + (int)(this.g ^ this.g >>> 32)) * 31 + (int)(this.h ^ this.h >>> 32)) * 31 + (int)(this.i ^ this.i >>> 32)) * 31 + (int)(this.j ^ this.j >>> 32)) * 31 + (int)(v2 ^ v2 >>> 32)) * 31 + (int)(this.l ^ this.l >>> 32)) * 31 + (int)(this.m ^ this.m >>> 32)) * 31 + com.google.protobuf.nano.h.a(this.n)) * 31) * 31 + v1;
    }

}
