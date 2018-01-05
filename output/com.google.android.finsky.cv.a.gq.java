package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.i;
import g.a.a.a;

public final class com.google.android.finsky.cv.a.gq extends com.google.protobuf.nano.b
{

    public int a;
    public long b;
    public long c;
    public long d;
    public boolean e;
    public boolean f;
    public long g;
    public long h;
    public long i;
    public com.google.android.finsky.cv.a.bu j;
    public boolean k;
    public boolean l;
    public com.google.android.finsky.cv.a.bq m;
    public com.google.android.finsky.cv.a.eh n;
    public com.google.android.finsky.cv.a.bj o;
    public int p;
    public com.google.android.finsky.cv.a.ax q;
    public boolean r;
    public g.a.a.a s;

    gq() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
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
        this.n = 0;
        this.o = 0;
        this.p = 1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.aO = 0;
        this.aP = -1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 8:
  4:            goto 14;
            case 16:
  4:            goto 27;
            case 24:
  4:            goto 40;
            case 32:
  4:            goto 53;
            case 40:
  4:            goto 66;
            case 50:
  4:            goto 79;
            case 56:
  4:            goto 96;
            case 64:
  4:            goto 109;
            case 74:
  4:            goto 122;
            case 82:
  4:            goto 140;
            case 90:
  4:            goto 158;
            case 96:
  4:            goto 176;
            case 106:
  4:            goto 190;
            case 112:
  4:            goto 208;
            case 130:
  4:            goto 222;
            case 136:
  4:            goto 240;
            case 144:
  4:            goto 254;
            case 152:
  4:            goto 268;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.b = p0.j();
 24:    this.a = this.a | 1;
 26:    goto 0;
 31:    this.c = p0.j();
 37:    this.a = this.a | 2;
 39:    goto 0;
 44:    this.e = p0.e();
 50:    this.a = this.a | 8;
 52:    goto 0;
 57:    this.h = p0.j();
 63:    this.a = this.a | 64;
 65:    goto 0;
 70:    this.i = p0.j();
 76:    this.a = this.a | 128;
 78:    goto 0;
 81:    if (this.j == 0)
 88:        this.j = new com.google.android.finsky.cv.a.bu();
 92:    p0.a(this.j);
 95:    goto 0;
100:    this.k = p0.e();
106:    this.a = this.a | 256;
108:    goto 0;
113:    this.l = p0.e();
119:    this.a = this.a | 512;
121:    goto 0;
124:    if (this.m == 0)
131:        this.m = new com.google.android.finsky.cv.a.bq();
135:    p0.a(this.m);
138:    goto 0;
142:    if (this.n == 0)
149:        this.n = new com.google.android.finsky.cv.a.eh();
153:    p0.a(this.n);
156:    goto 0;
160:    if (this.o == 0)
167:        this.o = new com.google.android.finsky.cv.a.bj();
171:    p0.a(this.o);
174:    goto 0;
180:    this.p = p0.i();
186:    this.a = this.a | 1024;
188:    goto 0;
192:    if (this.s == 0)
199:        this.s = new g.a.a.a();
203:    p0.a(this.s);
206:    goto 0;
212:    this.g = p0.j();
218:    this.a = this.a | 32;
220:    goto 0;
224:    if (this.q == 0)
231:        this.q = new com.google.android.finsky.cv.a.ax();
235:    p0.a(this.q);
238:    goto 0;
244:    this.r = p0.e();
250:    this.a = this.a | 2048;
252:    goto 0;
258:    this.d = p0.j();
264:    this.a = this.a | 4;
266:    goto 0;
272:    this.f = p0.e();
278:    this.a = this.a | 16;
280:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a & 1)
            p0.b(1, this.b);
        if (this.a & 2)
            p0.b(2, this.c);
        if (this.a & 8)
            p0.a(3, this.e);
        if (this.a & 64)
            p0.b(4, this.h);
        if (this.a & 128)
            p0.b(5, this.i);
        if (this.j != 0)
            p0.b(6, this.j);
        if (this.a & 256)
            p0.a(7, this.k);
        if (this.a & 512)
            p0.a(8, this.l);
        if (this.m != 0)
            p0.b(9, this.m);
        if (this.n != 0)
            p0.b(10, this.n);
        if (this.o != 0)
            p0.b(11, this.o);
        if (this.a & 1024)
            p0.a(12, this.p);
        if (this.s != 0)
            p0.b(13, this.s);
        if (this.a & 32)
            p0.b(14, this.g);
        if (this.q != 0)
            p0.b(16, this.q);
        if (this.a & 2048)
            p0.a(17, this.r);
        if (this.a & 4)
            p0.b(18, this.d);
        if (this.a & 16)
            p0.a(19, this.f);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.f(1, this.b);
        if (this.a & 2)
            v0 = v0 + CodedOutputByteBufferNano.f(2, this.c);
        if (this.a & 8)
            v0 = v0 + CodedOutputByteBufferNano.d(3) + 1;
        if (this.a & 64)
            v0 = v0 + CodedOutputByteBufferNano.f(4, this.h);
        if (this.a & 128)
            v0 = v0 + CodedOutputByteBufferNano.f(5, this.i);
        if (this.j != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(6, this.j);
        if (this.a & 256)
            v0 = v0 + CodedOutputByteBufferNano.d(7) + 1;
        if (this.a & 512)
            v0 = v0 + CodedOutputByteBufferNano.d(8) + 1;
        if (this.m != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(9, this.m);
        if (this.n != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(10, this.n);
        if (this.o != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(11, this.o);
        if (this.a & 1024)
            v0 = v0 + CodedOutputByteBufferNano.d(12, this.p);
        if (this.s != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(13, this.s);
        if (this.a & 32)
            v0 = v0 + CodedOutputByteBufferNano.f(14, this.g);
        if (this.q != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(16, this.q);
        if (this.a & 2048)
            v0 = v0 + CodedOutputByteBufferNano.d(17) + 1;
        if (this.a & 4)
            v0 = v0 + CodedOutputByteBufferNano.f(18, this.d);
        if (this.a & 16)
            v0 = v0 + CodedOutputByteBufferNano.d(19) + 1;
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.gq))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.gq)p0;
                if ((this.a & 1) != (p0.a & 1))
                    v0 = 0;
                else if (this.b != p0.b)
                    v0 = 0;
                else if ((this.a & 2) != (p0.a & 2))
                    v0 = 0;
                else if (this.c != p0.c)
                    v0 = 0;
                else if ((this.a & 4) != (p0.a & 4))
                    v0 = 0;
                else if (this.d != p0.d)
                    v0 = 0;
                else if ((this.a & 8) != (p0.a & 8))
                    v0 = 0;
                else if (this.e != p0.e)
                    v0 = 0;
                else if ((this.a & 16) != (p0.a & 16))
                    v0 = 0;
                else if (this.f != p0.f)
                    v0 = 0;
                else if ((this.a & 32) != (p0.a & 32))
                    v0 = 0;
                else if (this.g != p0.g)
                    v0 = 0;
                else if ((this.a & 64) != (p0.a & 64))
                    v0 = 0;
                else if (this.h != p0.h)
                    v0 = 0;
                else if ((this.a & 128) != (p0.a & 128))
                    v0 = 0;
                else if (this.i != p0.i)
                    v0 = 0;
                else if (this.j == 0) {
                    if (p0.j != 0)
                        v0 = 0;
                    else if ((this.a & 256) != (p0.a & 256))
                        v0 = 0;
                    else if (this.k != p0.k)
                        v0 = 0;
                    else if ((this.a & 512) != (p0.a & 512))
                        v0 = 0;
                    else if (this.l != p0.l)
                        v0 = 0;
                    else if (this.m == 0) {
                        if (p0.m != 0)
                            v0 = 0;
                        else if (this.n == 0) {
                            if (p0.n != 0)
                                v0 = 0;
                            else if (this.o == 0) {
                                if (p0.o != 0)
                                    v0 = 0;
                                else if ((this.a & 1024) != (p0.a & 1024))
                                    v0 = 0;
                                else if (this.p != p0.p)
                                    v0 = 0;
                                else if (this.q == 0) {
                                    if (p0.q != 0)
                                        v0 = 0;
                                    else if ((this.a & 2048) != (p0.a & 2048))
                                        v0 = 0;
                                    else if (this.r != p0.r)
                                        v0 = 0;
                                    else if (this.s == 0) {
                                        if (p0.s != 0)
                                            v0 = 0;
                                        else if (this.aO == 0 || this.aO.b()) {
                                            if (p0.aO != 0 && !p0.aO.b())
                                                v0 = 0;
                                        }
                                        else
                                            v0 = this.aO.equals(p0.aO);
                                    }
                                    else if (!this.s.equals(p0.s))
                                        v0 = 0;
                                    else if (this.aO == 0 || this.aO.b()) {
                                        if (p0.aO != 0 && !p0.aO.b())
                                            v0 = 0;
                                    }
                                    else
                                        v0 = this.aO.equals(p0.aO);
                                }
                                else if (!this.q.equals(p0.q))
                                    v0 = 0;
                                else if ((this.a & 2048) != (p0.a & 2048))
                                    v0 = 0;
                                else if (this.r != p0.r)
                                    v0 = 0;
                                else if (this.s == 0) {
                                    if (p0.s != 0)
                                        v0 = 0;
                                    else if (this.aO == 0 || this.aO.b()) {
                                        if (p0.aO != 0 && !p0.aO.b())
                                            v0 = 0;
                                    }
                                    else
                                        v0 = this.aO.equals(p0.aO);
                                }
                                else if (!this.s.equals(p0.s))
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
                            else if ((this.a & 1024) != (p0.a & 1024))
                                v0 = 0;
                            else if (this.p != p0.p)
                                v0 = 0;
                            else if (this.q == 0) {
                                if (p0.q != 0)
                                    v0 = 0;
                                else if ((this.a & 2048) != (p0.a & 2048))
                                    v0 = 0;
                                else if (this.r != p0.r)
                                    v0 = 0;
                                else if (this.s == 0) {
                                    if (p0.s != 0)
                                        v0 = 0;
                                    else if (this.aO == 0 || this.aO.b()) {
                                        if (p0.aO != 0 && !p0.aO.b())
                                            v0 = 0;
                                    }
                                    else
                                        v0 = this.aO.equals(p0.aO);
                                }
                                else if (!this.s.equals(p0.s))
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.q.equals(p0.q))
                                v0 = 0;
                            else if ((this.a & 2048) != (p0.a & 2048))
                                v0 = 0;
                            else if (this.r != p0.r)
                                v0 = 0;
                            else if (this.s == 0) {
                                if (p0.s != 0)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.s.equals(p0.s))
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.n.equals(p0.n))
                            v0 = 0;
                        else if (this.o == 0) {
                            if (p0.o != 0)
                                v0 = 0;
                            else if ((this.a & 1024) != (p0.a & 1024))
                                v0 = 0;
                            else if (this.p != p0.p)
                                v0 = 0;
                            else if (this.q == 0) {
                                if (p0.q != 0)
                                    v0 = 0;
                                else if ((this.a & 2048) != (p0.a & 2048))
                                    v0 = 0;
                                else if (this.r != p0.r)
                                    v0 = 0;
                                else if (this.s == 0) {
                                    if (p0.s != 0)
                                        v0 = 0;
                                    else if (this.aO == 0 || this.aO.b()) {
                                        if (p0.aO != 0 && !p0.aO.b())
                                            v0 = 0;
                                    }
                                    else
                                        v0 = this.aO.equals(p0.aO);
                                }
                                else if (!this.s.equals(p0.s))
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.q.equals(p0.q))
                                v0 = 0;
                            else if ((this.a & 2048) != (p0.a & 2048))
                                v0 = 0;
                            else if (this.r != p0.r)
                                v0 = 0;
                            else if (this.s == 0) {
                                if (p0.s != 0)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.s.equals(p0.s))
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
                        else if ((this.a & 1024) != (p0.a & 1024))
                            v0 = 0;
                        else if (this.p != p0.p)
                            v0 = 0;
                        else if (this.q == 0) {
                            if (p0.q != 0)
                                v0 = 0;
                            else if ((this.a & 2048) != (p0.a & 2048))
                                v0 = 0;
                            else if (this.r != p0.r)
                                v0 = 0;
                            else if (this.s == 0) {
                                if (p0.s != 0)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.s.equals(p0.s))
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.q.equals(p0.q))
                            v0 = 0;
                        else if ((this.a & 2048) != (p0.a & 2048))
                            v0 = 0;
                        else if (this.r != p0.r)
                            v0 = 0;
                        else if (this.s == 0) {
                            if (p0.s != 0)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.s.equals(p0.s))
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.m.equals(p0.m))
                        v0 = 0;
                    else if (this.n == 0) {
                        if (p0.n != 0)
                            v0 = 0;
                        else if (this.o == 0) {
                            if (p0.o != 0)
                                v0 = 0;
                            else if ((this.a & 1024) != (p0.a & 1024))
                                v0 = 0;
                            else if (this.p != p0.p)
                                v0 = 0;
                            else if (this.q == 0) {
                                if (p0.q != 0)
                                    v0 = 0;
                                else if ((this.a & 2048) != (p0.a & 2048))
                                    v0 = 0;
                                else if (this.r != p0.r)
                                    v0 = 0;
                                else if (this.s == 0) {
                                    if (p0.s != 0)
                                        v0 = 0;
                                    else if (this.aO == 0 || this.aO.b()) {
                                        if (p0.aO != 0 && !p0.aO.b())
                                            v0 = 0;
                                    }
                                    else
                                        v0 = this.aO.equals(p0.aO);
                                }
                                else if (!this.s.equals(p0.s))
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.q.equals(p0.q))
                                v0 = 0;
                            else if ((this.a & 2048) != (p0.a & 2048))
                                v0 = 0;
                            else if (this.r != p0.r)
                                v0 = 0;
                            else if (this.s == 0) {
                                if (p0.s != 0)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.s.equals(p0.s))
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
                        else if ((this.a & 1024) != (p0.a & 1024))
                            v0 = 0;
                        else if (this.p != p0.p)
                            v0 = 0;
                        else if (this.q == 0) {
                            if (p0.q != 0)
                                v0 = 0;
                            else if ((this.a & 2048) != (p0.a & 2048))
                                v0 = 0;
                            else if (this.r != p0.r)
                                v0 = 0;
                            else if (this.s == 0) {
                                if (p0.s != 0)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.s.equals(p0.s))
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.q.equals(p0.q))
                            v0 = 0;
                        else if ((this.a & 2048) != (p0.a & 2048))
                            v0 = 0;
                        else if (this.r != p0.r)
                            v0 = 0;
                        else if (this.s == 0) {
                            if (p0.s != 0)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.s.equals(p0.s))
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.n.equals(p0.n))
                        v0 = 0;
                    else if (this.o == 0) {
                        if (p0.o != 0)
                            v0 = 0;
                        else if ((this.a & 1024) != (p0.a & 1024))
                            v0 = 0;
                        else if (this.p != p0.p)
                            v0 = 0;
                        else if (this.q == 0) {
                            if (p0.q != 0)
                                v0 = 0;
                            else if ((this.a & 2048) != (p0.a & 2048))
                                v0 = 0;
                            else if (this.r != p0.r)
                                v0 = 0;
                            else if (this.s == 0) {
                                if (p0.s != 0)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.s.equals(p0.s))
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.q.equals(p0.q))
                            v0 = 0;
                        else if ((this.a & 2048) != (p0.a & 2048))
                            v0 = 0;
                        else if (this.r != p0.r)
                            v0 = 0;
                        else if (this.s == 0) {
                            if (p0.s != 0)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.s.equals(p0.s))
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
                    else if ((this.a & 1024) != (p0.a & 1024))
                        v0 = 0;
                    else if (this.p != p0.p)
                        v0 = 0;
                    else if (this.q == 0) {
                        if (p0.q != 0)
                            v0 = 0;
                        else if ((this.a & 2048) != (p0.a & 2048))
                            v0 = 0;
                        else if (this.r != p0.r)
                            v0 = 0;
                        else if (this.s == 0) {
                            if (p0.s != 0)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.s.equals(p0.s))
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.q.equals(p0.q))
                        v0 = 0;
                    else if ((this.a & 2048) != (p0.a & 2048))
                        v0 = 0;
                    else if (this.r != p0.r)
                        v0 = 0;
                    else if (this.s == 0) {
                        if (p0.s != 0)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.s.equals(p0.s))
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.j.equals(p0.j))
                    v0 = 0;
                else if ((this.a & 256) != (p0.a & 256))
                    v0 = 0;
                else if (this.k != p0.k)
                    v0 = 0;
                else if ((this.a & 512) != (p0.a & 512))
                    v0 = 0;
                else if (this.l != p0.l)
                    v0 = 0;
                else if (this.m == 0) {
                    if (p0.m != 0)
                        v0 = 0;
                    else if (this.n == 0) {
                        if (p0.n != 0)
                            v0 = 0;
                        else if (this.o == 0) {
                            if (p0.o != 0)
                                v0 = 0;
                            else if ((this.a & 1024) != (p0.a & 1024))
                                v0 = 0;
                            else if (this.p != p0.p)
                                v0 = 0;
                            else if (this.q == 0) {
                                if (p0.q != 0)
                                    v0 = 0;
                                else if ((this.a & 2048) != (p0.a & 2048))
                                    v0 = 0;
                                else if (this.r != p0.r)
                                    v0 = 0;
                                else if (this.s == 0) {
                                    if (p0.s != 0)
                                        v0 = 0;
                                    else if (this.aO == 0 || this.aO.b()) {
                                        if (p0.aO != 0 && !p0.aO.b())
                                            v0 = 0;
                                    }
                                    else
                                        v0 = this.aO.equals(p0.aO);
                                }
                                else if (!this.s.equals(p0.s))
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.q.equals(p0.q))
                                v0 = 0;
                            else if ((this.a & 2048) != (p0.a & 2048))
                                v0 = 0;
                            else if (this.r != p0.r)
                                v0 = 0;
                            else if (this.s == 0) {
                                if (p0.s != 0)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.s.equals(p0.s))
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
                        else if ((this.a & 1024) != (p0.a & 1024))
                            v0 = 0;
                        else if (this.p != p0.p)
                            v0 = 0;
                        else if (this.q == 0) {
                            if (p0.q != 0)
                                v0 = 0;
                            else if ((this.a & 2048) != (p0.a & 2048))
                                v0 = 0;
                            else if (this.r != p0.r)
                                v0 = 0;
                            else if (this.s == 0) {
                                if (p0.s != 0)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.s.equals(p0.s))
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.q.equals(p0.q))
                            v0 = 0;
                        else if ((this.a & 2048) != (p0.a & 2048))
                            v0 = 0;
                        else if (this.r != p0.r)
                            v0 = 0;
                        else if (this.s == 0) {
                            if (p0.s != 0)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.s.equals(p0.s))
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.n.equals(p0.n))
                        v0 = 0;
                    else if (this.o == 0) {
                        if (p0.o != 0)
                            v0 = 0;
                        else if ((this.a & 1024) != (p0.a & 1024))
                            v0 = 0;
                        else if (this.p != p0.p)
                            v0 = 0;
                        else if (this.q == 0) {
                            if (p0.q != 0)
                                v0 = 0;
                            else if ((this.a & 2048) != (p0.a & 2048))
                                v0 = 0;
                            else if (this.r != p0.r)
                                v0 = 0;
                            else if (this.s == 0) {
                                if (p0.s != 0)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.s.equals(p0.s))
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.q.equals(p0.q))
                            v0 = 0;
                        else if ((this.a & 2048) != (p0.a & 2048))
                            v0 = 0;
                        else if (this.r != p0.r)
                            v0 = 0;
                        else if (this.s == 0) {
                            if (p0.s != 0)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.s.equals(p0.s))
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
                    else if ((this.a & 1024) != (p0.a & 1024))
                        v0 = 0;
                    else if (this.p != p0.p)
                        v0 = 0;
                    else if (this.q == 0) {
                        if (p0.q != 0)
                            v0 = 0;
                        else if ((this.a & 2048) != (p0.a & 2048))
                            v0 = 0;
                        else if (this.r != p0.r)
                            v0 = 0;
                        else if (this.s == 0) {
                            if (p0.s != 0)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.s.equals(p0.s))
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.q.equals(p0.q))
                        v0 = 0;
                    else if ((this.a & 2048) != (p0.a & 2048))
                        v0 = 0;
                    else if (this.r != p0.r)
                        v0 = 0;
                    else if (this.s == 0) {
                        if (p0.s != 0)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.s.equals(p0.s))
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.m.equals(p0.m))
                    v0 = 0;
                else if (this.n == 0) {
                    if (p0.n != 0)
                        v0 = 0;
                    else if (this.o == 0) {
                        if (p0.o != 0)
                            v0 = 0;
                        else if ((this.a & 1024) != (p0.a & 1024))
                            v0 = 0;
                        else if (this.p != p0.p)
                            v0 = 0;
                        else if (this.q == 0) {
                            if (p0.q != 0)
                                v0 = 0;
                            else if ((this.a & 2048) != (p0.a & 2048))
                                v0 = 0;
                            else if (this.r != p0.r)
                                v0 = 0;
                            else if (this.s == 0) {
                                if (p0.s != 0)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.s.equals(p0.s))
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.q.equals(p0.q))
                            v0 = 0;
                        else if ((this.a & 2048) != (p0.a & 2048))
                            v0 = 0;
                        else if (this.r != p0.r)
                            v0 = 0;
                        else if (this.s == 0) {
                            if (p0.s != 0)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.s.equals(p0.s))
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
                    else if ((this.a & 1024) != (p0.a & 1024))
                        v0 = 0;
                    else if (this.p != p0.p)
                        v0 = 0;
                    else if (this.q == 0) {
                        if (p0.q != 0)
                            v0 = 0;
                        else if ((this.a & 2048) != (p0.a & 2048))
                            v0 = 0;
                        else if (this.r != p0.r)
                            v0 = 0;
                        else if (this.s == 0) {
                            if (p0.s != 0)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.s.equals(p0.s))
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.q.equals(p0.q))
                        v0 = 0;
                    else if ((this.a & 2048) != (p0.a & 2048))
                        v0 = 0;
                    else if (this.r != p0.r)
                        v0 = 0;
                    else if (this.s == 0) {
                        if (p0.s != 0)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.s.equals(p0.s))
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.n.equals(p0.n))
                    v0 = 0;
                else if (this.o == 0) {
                    if (p0.o != 0)
                        v0 = 0;
                    else if ((this.a & 1024) != (p0.a & 1024))
                        v0 = 0;
                    else if (this.p != p0.p)
                        v0 = 0;
                    else if (this.q == 0) {
                        if (p0.q != 0)
                            v0 = 0;
                        else if ((this.a & 2048) != (p0.a & 2048))
                            v0 = 0;
                        else if (this.r != p0.r)
                            v0 = 0;
                        else if (this.s == 0) {
                            if (p0.s != 0)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.s.equals(p0.s))
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.q.equals(p0.q))
                        v0 = 0;
                    else if ((this.a & 2048) != (p0.a & 2048))
                        v0 = 0;
                    else if (this.r != p0.r)
                        v0 = 0;
                    else if (this.s == 0) {
                        if (p0.s != 0)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.s.equals(p0.s))
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
                else if ((this.a & 1024) != (p0.a & 1024))
                    v0 = 0;
                else if (this.p != p0.p)
                    v0 = 0;
                else if (this.q == 0) {
                    if (p0.q != 0)
                        v0 = 0;
                    else if ((this.a & 2048) != (p0.a & 2048))
                        v0 = 0;
                    else if (this.r != p0.r)
                        v0 = 0;
                    else if (this.s == 0) {
                        if (p0.s != 0)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.s.equals(p0.s))
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.q.equals(p0.q))
                    v0 = 0;
                else if ((this.a & 2048) != (p0.a & 2048))
                    v0 = 0;
                else if (this.r != p0.r)
                    v0 = 0;
                else if (this.s == 0) {
                    if (p0.s != 0)
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.s.equals(p0.s))
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
        v1 = 1231;
        v3 = 0;
        if (this.e != 0)
            v0 = 1231;
        else
            v0 = 1237;
        v5 = (v0 + ((((this.getClass().getName().hashCode() + 527) * 31 + (int)(this.b ^ this.b >>> 32)) * 31 + (int)(this.c ^ this.c >>> 32)) * 31 + (int)(this.d ^ this.d >>> 32)) * 31) * 31;
        if (this.f != 0)
            v0 = 1231;
        else
            v0 = 1237;
        v5 = ((((v0 + v5) * 31 + (int)(this.g ^ this.g >>> 32)) * 31 + (int)(this.h ^ this.h >>> 32)) * 31 + (int)(this.i ^ this.i >>> 32)) * 31;
        if (this.j == 0)
            v0 = 0;
        else
            v0 = this.j.hashCode();
        v5 = (v0 + v5) * 31;
        if (this.k != 0)
            v0 = 1231;
        else
            v0 = 1237;
        v5 = (v0 + v5) * 31;
        if (this.l != 0)
            v0 = 1231;
        else
            v0 = 1237;
        v5 = (v0 + v5) * 31;
        if (this.m == 0)
            v0 = 0;
        else
            v0 = this.m.hashCode();
        v5 = (v0 + v5) * 31;
        if (this.n == 0)
            v0 = 0;
        else
            v0 = this.n.hashCode();
        v5 = (v0 + v5) * 31;
        if (this.o == 0)
            v0 = 0;
        else
            v0 = this.o.hashCode();
        v5 = ((v0 + v5) * 31 + this.p) * 31;
        if (this.q == 0)
            v0 = 0;
        else
            v0 = this.q.hashCode();
        if (this.r == 0)
            v1 = 1237;
        v2 = ((v0 + v5) * 31 + v1) * 31;
        if (this.s == 0)
            v0 = 0;
        else
            v0 = this.s.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v3 = this.aO.hashCode();
        return (v0 + v2) * 31 + v3;
    }

}
