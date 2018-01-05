package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.iu extends com.google.protobuf.nano.b
{

    public static volatile iu[] a;
    public int b;
    public String c;
    public com.google.android.finsky.cv.a.cv d;
    public int e;
    public com.google.android.finsky.cv.a.bd f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public long l;
    public String m;
    public String n;
    public long o;
    public int p;
    public long q;
    public com.google.android.finsky.cv.a.kd r;
    public com.google.android.finsky.cv.a.gm s;
    public String t;
    public boolean u;

    iu() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = "";
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = 0;
        this.m = "";
        this.n = "";
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = "";
        this.u = 0;
        this.aO = 0;
        this.aP = -1;
    }

    public static iu[] br_() {
        if (com.google.android.finsky.cv.a.iu.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.android.finsky.cv.a.iu.a == 0)
                    com.google.android.finsky.cv.a.iu.a = new iu[0];
                exit com.google.protobuf.nano.h.b;
            }
            catch (Throwable ex) {
                try {
                    exit com.google.protobuf.nano.h.b;
                }
                catch (Throwable ex) {
                    exit com.google.protobuf.nano.h.b;
                    throw ex;
                }
                throw ex;
            }
        }
        return com.google.android.finsky.cv.a.iu.a;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 10:
  4:            goto 14;
            case 18:
  4:            goto 27;
            case 26:
  4:            goto 40;
            case 34:
  4:            goto 53;
            case 40:
  4:            goto 66;
            case 48:
  4:            goto 79;
            case 58:
  4:            goto 92;
            case 66:
  4:            goto 105;
            case 74:
  4:            goto 118;
            case 154:
  4:            goto 132;
            case 234:
  4:            goto 146;
            case 240:
  4:            goto 160;
            case 250:
  4:            goto 174;
            case 266:
  4:            goto 192;
            case 274:
  4:            goto 210;
            case 280:
  4:            goto 228;
            case 304:
  4:            goto 242;
            case 314:
  4:            goto 256;
            case 320:
  4:            goto 274;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.t = p0.f();
 24:    this.b = this.b | 8192;
 26:    goto 0;
 31:    this.i = p0.f();
 37:    this.b = this.b | 16;
 39:    goto 0;
 44:    this.j = p0.f();
 50:    this.b = this.b | 32;
 52:    goto 0;
 57:    this.k = p0.f();
 63:    this.b = this.b | 64;
 65:    goto 0;
 70:    this.l = p0.j();
 76:    this.b = this.b | 128;
 78:    goto 0;
 83:    this.e = p0.i();
 89:    this.b = this.b | 2;
 91:    goto 0;
 96:    this.g = p0.f();
102:    this.b = this.b | 4;
104:    goto 0;
109:    this.h = p0.f();
115:    this.b = this.b | 8;
117:    goto 0;
122:    this.c = p0.f();
128:    this.b = this.b | 1;
130:    goto 0;
136:    this.m = p0.f();
142:    this.b = this.b | 256;
144:    goto 0;
150:    this.n = p0.f();
156:    this.b = this.b | 512;
158:    goto 0;
164:    this.o = p0.j();
170:    this.b = this.b | 1024;
172:    goto 0;
176:    if (this.s == 0)
183:        this.s = new com.google.android.finsky.cv.a.gm();
187:    p0.a(this.s);
190:    goto 0;
194:    if (this.d == 0)
201:        this.d = new com.google.android.finsky.cv.a.cv();
205:    p0.a(this.d);
208:    goto 0;
212:    if (this.f == 0)
219:        this.f = new com.google.android.finsky.cv.a.bd();
223:    p0.a(this.f);
226:    goto 0;
232:    this.p = p0.i();
238:    this.b = this.b | 2048;
240:    goto 0;
246:    this.q = p0.j();
252:    this.b = this.b | 4096;
254:    goto 0;
258:    if (this.r == 0)
265:        this.r = new com.google.android.finsky.cv.a.kd();
269:    p0.a(this.r);
272:    goto 0;
278:    this.u = p0.e();
284:    this.b = this.b | 16384;
286:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b & 8192)
            p0.a(1, this.t);
        if (this.b & 16)
            p0.a(2, this.i);
        if (this.b & 32)
            p0.a(3, this.j);
        if (this.b & 64)
            p0.a(4, this.k);
        if (this.b & 128)
            p0.b(5, this.l);
        if (this.b & 2)
            p0.a(6, this.e);
        if (this.b & 4)
            p0.a(7, this.g);
        if (this.b & 8)
            p0.a(8, this.h);
        if (this.b & 1)
            p0.a(9, this.c);
        if (this.b & 256)
            p0.a(19, this.m);
        if (this.b & 512)
            p0.a(29, this.n);
        if (this.b & 1024)
            p0.b(30, this.o);
        if (this.s != 0)
            p0.b(31, this.s);
        if (this.d != 0)
            p0.b(33, this.d);
        if (this.f != 0)
            p0.b(34, this.f);
        if (this.b & 2048)
            p0.a(35, this.p);
        if (this.b & 4096)
            p0.a(38, this.q);
        if (this.r != 0)
            p0.b(39, this.r);
        if (this.b & 16384)
            p0.a(40, this.u);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.b & 8192)
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.t);
        if (this.b & 16)
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.i);
        if (this.b & 32)
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.j);
        if (this.b & 64)
            v0 = v0 + CodedOutputByteBufferNano.b(4, this.k);
        if (this.b & 128)
            v0 = v0 + CodedOutputByteBufferNano.f(5, this.l);
        if (this.b & 2)
            v0 = v0 + CodedOutputByteBufferNano.d(6, this.e);
        if (this.b & 4)
            v0 = v0 + CodedOutputByteBufferNano.b(7, this.g);
        if (this.b & 8)
            v0 = v0 + CodedOutputByteBufferNano.b(8, this.h);
        if (this.b & 1)
            v0 = v0 + CodedOutputByteBufferNano.b(9, this.c);
        if (this.b & 256)
            v0 = v0 + CodedOutputByteBufferNano.b(19, this.m);
        if (this.b & 512)
            v0 = v0 + CodedOutputByteBufferNano.b(29, this.n);
        if (this.b & 1024)
            v0 = v0 + CodedOutputByteBufferNano.f(30, this.o);
        if (this.s != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(31, this.s);
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(33, this.d);
        if (this.f != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(34, this.f);
        if (this.b & 2048)
            v0 = v0 + CodedOutputByteBufferNano.d(35, this.p);
        if (this.b & 4096)
            v0 = v0 + CodedOutputByteBufferNano.e(38, this.q);
        if (this.r != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(39, this.r);
        if (this.b & 16384)
            v0 = v0 + CodedOutputByteBufferNano.d(40) + 1;
        return v0;
    }

    public final boolean bs_() {
        if (this.b & 128)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final boolean d() {
        if (this.b & 512)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final boolean e() {
        if (this.b & 1024)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.iu))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.iu)p0;
                if ((this.b & 1) != (p0.b & 1))
                    v0 = 0;
                else if (!this.c.equals(p0.c))
                    v0 = 0;
                else if (this.d == 0) {
                    if (p0.d != 0)
                        v0 = 0;
                    else if ((this.b & 2) != (p0.b & 2))
                        v0 = 0;
                    else if (this.e != p0.e)
                        v0 = 0;
                    else if (this.f == 0) {
                        if (p0.f != 0)
                            v0 = 0;
                        else if ((this.b & 4) != (p0.b & 4))
                            v0 = 0;
                        else if (!this.g.equals(p0.g))
                            v0 = 0;
                        else if ((this.b & 8) != (p0.b & 8))
                            v0 = 0;
                        else if (!this.h.equals(p0.h))
                            v0 = 0;
                        else if ((this.b & 16) != (p0.b & 16))
                            v0 = 0;
                        else if (!this.i.equals(p0.i))
                            v0 = 0;
                        else if ((this.b & 32) != (p0.b & 32))
                            v0 = 0;
                        else if (!this.j.equals(p0.j))
                            v0 = 0;
                        else if ((this.b & 64) != (p0.b & 64))
                            v0 = 0;
                        else if (!this.k.equals(p0.k))
                            v0 = 0;
                        else if ((this.b & 128) != (p0.b & 128))
                            v0 = 0;
                        else if (this.l != p0.l)
                            v0 = 0;
                        else if ((this.b & 256) != (p0.b & 256))
                            v0 = 0;
                        else if (!this.m.equals(p0.m))
                            v0 = 0;
                        else if ((this.b & 512) != (p0.b & 512))
                            v0 = 0;
                        else if (!this.n.equals(p0.n))
                            v0 = 0;
                        else if ((this.b & 1024) != (p0.b & 1024))
                            v0 = 0;
                        else if (this.o != p0.o)
                            v0 = 0;
                        else if ((this.b & 2048) != (p0.b & 2048))
                            v0 = 0;
                        else if (this.p != p0.p)
                            v0 = 0;
                        else if ((this.b & 4096) != (p0.b & 4096))
                            v0 = 0;
                        else if (this.q != p0.q)
                            v0 = 0;
                        else if (this.r == 0) {
                            if (p0.r != 0)
                                v0 = 0;
                            else if (this.s == 0) {
                                if (p0.s != 0)
                                    v0 = 0;
                                else if ((this.b & 8192) != (p0.b & 8192))
                                    v0 = 0;
                                else if (!this.t.equals(p0.t))
                                    v0 = 0;
                                else if ((this.b & 16384) != (p0.b & 16384))
                                    v0 = 0;
                                else if (this.u != p0.u)
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
                            else if ((this.b & 8192) != (p0.b & 8192))
                                v0 = 0;
                            else if (!this.t.equals(p0.t))
                                v0 = 0;
                            else if ((this.b & 16384) != (p0.b & 16384))
                                v0 = 0;
                            else if (this.u != p0.u)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.r.equals(p0.r))
                            v0 = 0;
                        else if (this.s == 0) {
                            if (p0.s != 0)
                                v0 = 0;
                            else if ((this.b & 8192) != (p0.b & 8192))
                                v0 = 0;
                            else if (!this.t.equals(p0.t))
                                v0 = 0;
                            else if ((this.b & 16384) != (p0.b & 16384))
                                v0 = 0;
                            else if (this.u != p0.u)
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
                        else if ((this.b & 8192) != (p0.b & 8192))
                            v0 = 0;
                        else if (!this.t.equals(p0.t))
                            v0 = 0;
                        else if ((this.b & 16384) != (p0.b & 16384))
                            v0 = 0;
                        else if (this.u != p0.u)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.f.equals(p0.f))
                        v0 = 0;
                    else if ((this.b & 4) != (p0.b & 4))
                        v0 = 0;
                    else if (!this.g.equals(p0.g))
                        v0 = 0;
                    else if ((this.b & 8) != (p0.b & 8))
                        v0 = 0;
                    else if (!this.h.equals(p0.h))
                        v0 = 0;
                    else if ((this.b & 16) != (p0.b & 16))
                        v0 = 0;
                    else if (!this.i.equals(p0.i))
                        v0 = 0;
                    else if ((this.b & 32) != (p0.b & 32))
                        v0 = 0;
                    else if (!this.j.equals(p0.j))
                        v0 = 0;
                    else if ((this.b & 64) != (p0.b & 64))
                        v0 = 0;
                    else if (!this.k.equals(p0.k))
                        v0 = 0;
                    else if ((this.b & 128) != (p0.b & 128))
                        v0 = 0;
                    else if (this.l != p0.l)
                        v0 = 0;
                    else if ((this.b & 256) != (p0.b & 256))
                        v0 = 0;
                    else if (!this.m.equals(p0.m))
                        v0 = 0;
                    else if ((this.b & 512) != (p0.b & 512))
                        v0 = 0;
                    else if (!this.n.equals(p0.n))
                        v0 = 0;
                    else if ((this.b & 1024) != (p0.b & 1024))
                        v0 = 0;
                    else if (this.o != p0.o)
                        v0 = 0;
                    else if ((this.b & 2048) != (p0.b & 2048))
                        v0 = 0;
                    else if (this.p != p0.p)
                        v0 = 0;
                    else if ((this.b & 4096) != (p0.b & 4096))
                        v0 = 0;
                    else if (this.q != p0.q)
                        v0 = 0;
                    else if (this.r == 0) {
                        if (p0.r != 0)
                            v0 = 0;
                        else if (this.s == 0) {
                            if (p0.s != 0)
                                v0 = 0;
                            else if ((this.b & 8192) != (p0.b & 8192))
                                v0 = 0;
                            else if (!this.t.equals(p0.t))
                                v0 = 0;
                            else if ((this.b & 16384) != (p0.b & 16384))
                                v0 = 0;
                            else if (this.u != p0.u)
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
                        else if ((this.b & 8192) != (p0.b & 8192))
                            v0 = 0;
                        else if (!this.t.equals(p0.t))
                            v0 = 0;
                        else if ((this.b & 16384) != (p0.b & 16384))
                            v0 = 0;
                        else if (this.u != p0.u)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.r.equals(p0.r))
                        v0 = 0;
                    else if (this.s == 0) {
                        if (p0.s != 0)
                            v0 = 0;
                        else if ((this.b & 8192) != (p0.b & 8192))
                            v0 = 0;
                        else if (!this.t.equals(p0.t))
                            v0 = 0;
                        else if ((this.b & 16384) != (p0.b & 16384))
                            v0 = 0;
                        else if (this.u != p0.u)
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
                    else if ((this.b & 8192) != (p0.b & 8192))
                        v0 = 0;
                    else if (!this.t.equals(p0.t))
                        v0 = 0;
                    else if ((this.b & 16384) != (p0.b & 16384))
                        v0 = 0;
                    else if (this.u != p0.u)
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.d.equals(p0.d))
                    v0 = 0;
                else if ((this.b & 2) != (p0.b & 2))
                    v0 = 0;
                else if (this.e != p0.e)
                    v0 = 0;
                else if (this.f == 0) {
                    if (p0.f != 0)
                        v0 = 0;
                    else if ((this.b & 4) != (p0.b & 4))
                        v0 = 0;
                    else if (!this.g.equals(p0.g))
                        v0 = 0;
                    else if ((this.b & 8) != (p0.b & 8))
                        v0 = 0;
                    else if (!this.h.equals(p0.h))
                        v0 = 0;
                    else if ((this.b & 16) != (p0.b & 16))
                        v0 = 0;
                    else if (!this.i.equals(p0.i))
                        v0 = 0;
                    else if ((this.b & 32) != (p0.b & 32))
                        v0 = 0;
                    else if (!this.j.equals(p0.j))
                        v0 = 0;
                    else if ((this.b & 64) != (p0.b & 64))
                        v0 = 0;
                    else if (!this.k.equals(p0.k))
                        v0 = 0;
                    else if ((this.b & 128) != (p0.b & 128))
                        v0 = 0;
                    else if (this.l != p0.l)
                        v0 = 0;
                    else if ((this.b & 256) != (p0.b & 256))
                        v0 = 0;
                    else if (!this.m.equals(p0.m))
                        v0 = 0;
                    else if ((this.b & 512) != (p0.b & 512))
                        v0 = 0;
                    else if (!this.n.equals(p0.n))
                        v0 = 0;
                    else if ((this.b & 1024) != (p0.b & 1024))
                        v0 = 0;
                    else if (this.o != p0.o)
                        v0 = 0;
                    else if ((this.b & 2048) != (p0.b & 2048))
                        v0 = 0;
                    else if (this.p != p0.p)
                        v0 = 0;
                    else if ((this.b & 4096) != (p0.b & 4096))
                        v0 = 0;
                    else if (this.q != p0.q)
                        v0 = 0;
                    else if (this.r == 0) {
                        if (p0.r != 0)
                            v0 = 0;
                        else if (this.s == 0) {
                            if (p0.s != 0)
                                v0 = 0;
                            else if ((this.b & 8192) != (p0.b & 8192))
                                v0 = 0;
                            else if (!this.t.equals(p0.t))
                                v0 = 0;
                            else if ((this.b & 16384) != (p0.b & 16384))
                                v0 = 0;
                            else if (this.u != p0.u)
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
                        else if ((this.b & 8192) != (p0.b & 8192))
                            v0 = 0;
                        else if (!this.t.equals(p0.t))
                            v0 = 0;
                        else if ((this.b & 16384) != (p0.b & 16384))
                            v0 = 0;
                        else if (this.u != p0.u)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.r.equals(p0.r))
                        v0 = 0;
                    else if (this.s == 0) {
                        if (p0.s != 0)
                            v0 = 0;
                        else if ((this.b & 8192) != (p0.b & 8192))
                            v0 = 0;
                        else if (!this.t.equals(p0.t))
                            v0 = 0;
                        else if ((this.b & 16384) != (p0.b & 16384))
                            v0 = 0;
                        else if (this.u != p0.u)
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
                    else if ((this.b & 8192) != (p0.b & 8192))
                        v0 = 0;
                    else if (!this.t.equals(p0.t))
                        v0 = 0;
                    else if ((this.b & 16384) != (p0.b & 16384))
                        v0 = 0;
                    else if (this.u != p0.u)
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.f.equals(p0.f))
                    v0 = 0;
                else if ((this.b & 4) != (p0.b & 4))
                    v0 = 0;
                else if (!this.g.equals(p0.g))
                    v0 = 0;
                else if ((this.b & 8) != (p0.b & 8))
                    v0 = 0;
                else if (!this.h.equals(p0.h))
                    v0 = 0;
                else if ((this.b & 16) != (p0.b & 16))
                    v0 = 0;
                else if (!this.i.equals(p0.i))
                    v0 = 0;
                else if ((this.b & 32) != (p0.b & 32))
                    v0 = 0;
                else if (!this.j.equals(p0.j))
                    v0 = 0;
                else if ((this.b & 64) != (p0.b & 64))
                    v0 = 0;
                else if (!this.k.equals(p0.k))
                    v0 = 0;
                else if ((this.b & 128) != (p0.b & 128))
                    v0 = 0;
                else if (this.l != p0.l)
                    v0 = 0;
                else if ((this.b & 256) != (p0.b & 256))
                    v0 = 0;
                else if (!this.m.equals(p0.m))
                    v0 = 0;
                else if ((this.b & 512) != (p0.b & 512))
                    v0 = 0;
                else if (!this.n.equals(p0.n))
                    v0 = 0;
                else if ((this.b & 1024) != (p0.b & 1024))
                    v0 = 0;
                else if (this.o != p0.o)
                    v0 = 0;
                else if ((this.b & 2048) != (p0.b & 2048))
                    v0 = 0;
                else if (this.p != p0.p)
                    v0 = 0;
                else if ((this.b & 4096) != (p0.b & 4096))
                    v0 = 0;
                else if (this.q != p0.q)
                    v0 = 0;
                else if (this.r == 0) {
                    if (p0.r != 0)
                        v0 = 0;
                    else if (this.s == 0) {
                        if (p0.s != 0)
                            v0 = 0;
                        else if ((this.b & 8192) != (p0.b & 8192))
                            v0 = 0;
                        else if (!this.t.equals(p0.t))
                            v0 = 0;
                        else if ((this.b & 16384) != (p0.b & 16384))
                            v0 = 0;
                        else if (this.u != p0.u)
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
                    else if ((this.b & 8192) != (p0.b & 8192))
                        v0 = 0;
                    else if (!this.t.equals(p0.t))
                        v0 = 0;
                    else if ((this.b & 16384) != (p0.b & 16384))
                        v0 = 0;
                    else if (this.u != p0.u)
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.r.equals(p0.r))
                    v0 = 0;
                else if (this.s == 0) {
                    if (p0.s != 0)
                        v0 = 0;
                    else if ((this.b & 8192) != (p0.b & 8192))
                        v0 = 0;
                    else if (!this.t.equals(p0.t))
                        v0 = 0;
                    else if ((this.b & 16384) != (p0.b & 16384))
                        v0 = 0;
                    else if (this.u != p0.u)
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
                else if ((this.b & 8192) != (p0.b & 8192))
                    v0 = 0;
                else if (!this.t.equals(p0.t))
                    v0 = 0;
                else if ((this.b & 16384) != (p0.b & 16384))
                    v0 = 0;
                else if (this.u != p0.u)
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
        if (this.d == 0)
            v0 = 0;
        else
            v0 = this.d.hashCode();
        v3 = ((v0 + ((this.getClass().getName().hashCode() + 527) * 31 + this.c.hashCode()) * 31) * 31 + this.e) * 31;
        if (this.f == 0)
            v0 = 0;
        else
            v0 = this.f.hashCode();
        v3 = ((((((((((((v0 + v3) * 31 + this.g.hashCode()) * 31 + this.h.hashCode()) * 31 + this.i.hashCode()) * 31 + this.j.hashCode()) * 31 + this.k.hashCode()) * 31 + (int)(this.l ^ this.l >>> 32)) * 31 + this.m.hashCode()) * 31 + this.n.hashCode()) * 31 + (int)(this.o ^ this.o >>> 32)) * 31 + this.p) * 31 + (int)(this.q ^ this.q >>> 32)) * 31;
        if (this.r == 0)
            v0 = 0;
        else
            v0 = this.r.hashCode();
        v3 = (v0 + v3) * 31;
        if (this.s == 0)
            v0 = 0;
        else
            v0 = this.s.hashCode();
        v3 = ((v0 + v3) * 31 + this.t.hashCode()) * 31;
        if (this.u != 0)
            v0 = 1231;
        else
            v0 = 1237;
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return (v0 + v3) * 31 + v1;
    }

}
