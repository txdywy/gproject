package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

public final class com.google.android.finsky.cv.a.bl extends com.google.protobuf.nano.b
{

    public static volatile bl[] a;
    public String[] A;
    public String B;
    public boolean C;
    public long D;
    public String E;
    public long F;
    public int b;
    public bm[] c;
    public boolean d;
    public long e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public long k;
    public String l;
    public bl[] m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public com.google.android.finsky.cv.a.bi r;
    public com.google.android.finsky.cv.a.bq s;
    public com.google.android.finsky.cv.a.bw t;
    public com.google.android.finsky.cv.a.bv u;
    public com.google.android.finsky.cv.a.ca v;
    public boolean w;
    public long x;
    public long y;
    public int z;

    bl() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = com.google.android.finsky.cv.a.bm.aM_();
        this.d = 0;
        this.e = 0;
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = 0;
        this.l = "";
        this.m = com.google.android.finsky.cv.a.bl.aK_();
        this.n = 0;
        this.o = 0;
        this.p = 1;
        this.q = 1;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.A = com.google.protobuf.nano.l.j;
        this.B = "";
        this.C = 0;
        this.D = 0;
        this.E = "";
        this.F = 0;
        this.aO = 0;
        this.aP = -1;
    }

    public static bl[] aK_() {
        if (com.google.android.finsky.cv.a.bl.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.android.finsky.cv.a.bl.a == 0)
                    com.google.android.finsky.cv.a.bl.a = new bl[0];
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
        return com.google.android.finsky.cv.a.bl.a;
    }

    private final com.google.android.finsky.cv.a.bl b(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 8:
  5:            goto 15;
            case 18:
  5:            goto 22;
            case 26:
  5:            goto 29;
            case 34:
  5:            goto 42;
            case 40:
  5:            goto 105;
            case 48:
  5:            goto 118;
            case 58:
  5:            goto 132;
            case 64:
  5:            goto 146;
            case 74:
  5:            goto 183;
            case 80:
  5:            goto 201;
            case 90:
  5:            goto 215;
            case 98:
  5:            goto 267;
            case 106:
  5:            goto 285;
            case 114:
  5:            goto 299;
            case 120:
  5:            goto 313;
            case 128:
  5:            goto 327;
            case 136:
  5:            goto 341;
            case 146:
  5:            goto 378;
            case 154:
  5:            goto 396;
            case 160:
  5:            goto 412;
            case 170:
  5:            goto 426;
            case 176:
  5:            goto 444;
            case 186:
  5:            goto 458;
            case 194:
  5:            goto 476;
            case 200:
  5:            goto 540;
            case 210:
  5:            goto 554;
            case 232:
  5:            goto 568;
            case 240:
  5:            goto 583;
            case 250:
  5:            goto 598;
            case 256:
  5:            goto 613;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 19:    this.e = p0.j();
 21:    goto 1;
 26:    this.f = p0.f();
 28:    goto 1;
 33:    this.g = p0.f();
 39:    this.b = this.b | 2;
 41:    goto 1;
 50:    if (this.m == 0)
 52:        v0 = 0;
        else
 88:        v0 = this.m.length;
 54:    v2 = new bl[com.google.protobuf.nano.l.a(p0, 34) + v0];
 56:    if (v0 != 0)
 60:        System.arraycopy(this.m, 0, v2, 0, v0);
 63:    while (v0 < v2.length - 1) {
 73:        v2[v0] = new com.google.android.finsky.cv.a.bl();
 77:        p0.a(v2[v0]);
 80:        p0.a();
 83:        v0 = v0 + 1;
        }
 85:    goto 90;
 95:    v2[v0] = new com.google.android.finsky.cv.a.bl();
 99:    p0.a(v2[v0]);
102:    this.m = v2;
104:    goto 1;
109:    this.n = p0.e();
115:    this.b = this.b | 128;
117:    goto 1;
122:    this.k = p0.j();
128:    this.b = this.b | 32;
130:    goto 1;
136:    this.l = p0.f();
142:    this.b = this.b | 64;
144:    goto 1;
150:    this.b = this.b | 512;
156:    try {
164:        this.p = com.google.android.finsky.cv.a.bp.a(p0.i());
170:        this.b = this.b | 512;
        }
        catch (IllegalArgumentException ex) {
175:        p0.e(p0.o());
178:        this.a(p0, v0);
        }
172:    goto 1;
185:    if (this.s == 0)
192:        this.s = new com.google.android.finsky.cv.a.bq();
196:    p0.a(this.s);
199:    goto 1;
205:    this.y = p0.j();
211:    this.b = this.b | 8192;
213:    goto 1;
223:    if (this.A == 0)
225:        v0 = 0;
        else
255:        v0 = this.A.length;
227:    v2 = new String[com.google.protobuf.nano.l.a(p0, 90) + v0];
229:    if (v0 != 0)
233:        System.arraycopy(this.A, 0, v2, 0, v0);
236:    while (v0 < v2.length - 1) {
245:        v2[v0] = p0.f();
247:        p0.a();
250:        v0 = v0 + 1;
        }
252:    goto 257;
261:    v2[v0] = p0.f();
263:    this.A = v2;
265:    goto 1;
269:    if (this.t == 0)
276:        this.t = new com.google.android.finsky.cv.a.bw();
280:    p0.a(this.t);
283:    goto 1;
289:    this.h = p0.f();
295:    this.b = this.b | 4;
297:    goto 1;
303:    this.i = p0.f();
309:    this.b = this.b | 8;
311:    goto 1;
317:    this.w = p0.e();
323:    this.b = this.b | 2048;
325:    goto 1;
331:    this.z = p0.i();
337:    this.b = this.b | 16384;
339:    goto 1;
345:    this.b = this.b | 1024;
351:    try {
359:        this.q = com.google.android.finsky.cv.a.bp.a(p0.i());
365:        this.b = this.b | 1024;
        }
        catch (IllegalArgumentException ex) {
370:        p0.e(p0.o());
373:        this.a(p0, v0);
        }
367:    goto 1;
380:    if (this.u == 0)
387:        this.u = new com.google.android.finsky.cv.a.bv();
391:    p0.a(this.u);
394:    goto 1;
400:    this.B = p0.f();
408:    this.b = this.b | 32768;
410:    goto 1;
416:    this.x = p0.j();
422:    this.b = this.b | 4096;
424:    goto 1;
428:    if (this.r == 0)
435:        this.r = new com.google.android.finsky.cv.a.bi();
439:    p0.a(this.r);
442:    goto 1;
448:    this.o = p0.e();
454:    this.b = this.b | 256;
456:    goto 1;
460:    if (this.v == 0)
467:        this.v = new com.google.android.finsky.cv.a.ca();
471:    p0.a(this.v);
474:    goto 1;
484:    if (this.c == 0)
486:        v0 = 0;
        else
522:        v0 = this.c.length;
488:    v2 = new bm[com.google.protobuf.nano.l.a(p0, 194) + v0];
490:    if (v0 != 0)
494:        System.arraycopy(this.c, 0, v2, 0, v0);
497:    while (v0 < v2.length - 1) {
507:        v2[v0] = new com.google.android.finsky.cv.a.bm();
511:        p0.a(v2[v0]);
514:        p0.a();
517:        v0 = v0 + 1;
        }
519:    goto 524;
529:    v2[v0] = new com.google.android.finsky.cv.a.bm();
533:    p0.a(v2[v0]);
536:    this.c = v2;
538:    goto 1;
544:    this.d = p0.e();
550:    this.b = this.b | 1;
552:    goto 1;
558:    this.j = p0.f();
564:    this.b = this.b | 16;
566:    goto 1;
572:    this.C = p0.e();
579:    this.b = this.b | 65536;
581:    goto 1;
587:    this.D = p0.j();
594:    this.b = this.b | 131072;
596:    goto 1;
602:    this.E = p0.f();
609:    this.b = this.b | 262144;
611:    goto 1;
617:    this.F = p0.j();
624:    this.b = this.b | 524288;
626:    goto 1;
    }

    public final com.google.android.finsky.cv.a.bl a(long p0) {
        this.b = this.b | 32;
        this.k = p0;
        return this;
    }

    public final com.google.android.finsky.cv.a.bl a(String p0) {
        if (p0 == 0)
            throw new NullPointerException();
        this.b = this.b | 2;
        this.g = p0;
        return this;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        p0.b(1, this.e);
        p0.a(2, this.f);
        if (this.b & 2)
            p0.a(3, this.g);
        if (this.m != 0 && this.m.length > 0) {
            v0 = 0;
            while (v0 < this.m.length) {
                if (this.m[v0] != 0)
                    p0.b(4, this.m[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.b & 128)
            p0.a(5, this.n);
        if (this.b & 32)
            p0.b(6, this.k);
        if (this.b & 64)
            p0.a(7, this.l);
        if (this.b & 512)
            p0.a(8, this.p);
        if (this.s != 0)
            p0.b(9, this.s);
        if (this.b & 8192)
            p0.b(10, this.y);
        if (this.A != 0 && this.A.length > 0) {
            v0 = 0;
            while (v0 < this.A.length) {
                if (this.A[v0] != 0)
                    p0.a(11, this.A[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.t != 0)
            p0.b(12, this.t);
        if (this.b & 4)
            p0.a(13, this.h);
        if (this.b & 8)
            p0.a(14, this.i);
        if (this.b & 2048)
            p0.a(15, this.w);
        if (this.b & 16384)
            p0.a(16, this.z);
        if (this.b & 1024)
            p0.a(17, this.q);
        if (this.u != 0)
            p0.b(18, this.u);
        if (this.b & 32768)
            p0.a(19, this.B);
        if (this.b & 4096)
            p0.b(20, this.x);
        if (this.r != 0)
            p0.b(21, this.r);
        if (this.b & 256)
            p0.a(22, this.o);
        if (this.v != 0)
            p0.b(23, this.v);
        if (this.c != 0 && this.c.length > 0)
            while (v1 < this.c.length) {
                if (this.c[v1] != 0)
                    p0.b(24, this.c[v1]);
                v1 = v1 + 1;
            }
        if (this.b & 1)
            p0.a(25, this.d);
        if (this.b & 16)
            p0.a(26, this.j);
        if (this.b & 65536)
            p0.a(29, this.C);
        if (this.b & 131072)
            p0.b(30, this.D);
        if (this.b & 262144)
            p0.a(31, this.E);
        if (this.b & 524288)
            p0.b(32, this.F);
        super.a(p0);
    }

    public final boolean aL_() {
        if (this.b & 2)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    protected final int b() {
        v1 = 0;
        v0 = super.b() + CodedOutputByteBufferNano.f(1, this.e) + CodedOutputByteBufferNano.b(2, this.f);
        if (this.b & 2)
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.g);
        if (this.m != 0 && this.m.length > 0) {
            v2 = v0;
            v0 = 0;
            while (v0 < this.m.length) {
                if (this.m[v0] != 0)
                    v2 = v2 + CodedOutputByteBufferNano.d(4, this.m[v0]);
                v0 = v0 + 1;
            }
            v0 = v2;
        }
        if (this.b & 128)
            v0 = v0 + CodedOutputByteBufferNano.d(5) + 1;
        if (this.b & 32)
            v0 = v0 + CodedOutputByteBufferNano.f(6, this.k);
        if (this.b & 64)
            v0 = v0 + CodedOutputByteBufferNano.b(7, this.l);
        if (this.b & 512)
            v0 = v0 + CodedOutputByteBufferNano.d(8, this.p);
        if (this.s != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(9, this.s);
        if (this.b & 8192)
            v0 = v0 + CodedOutputByteBufferNano.f(10, this.y);
        if (this.A != 0 && this.A.length > 0) {
            v2 = 0;
            v3 = 0;
            v4 = 0;
            while (v2 < this.A.length) {
                if (this.A[v2] != 0) {
                    v4 = v4 + 1;
                    v3 = v3 + CodedOutputByteBufferNano.b(this.A[v2]);
                }
                v2 = v2 + 1;
            }
            v0 = v0 + v3 + v4 * 1;
        }
        if (this.t != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(12, this.t);
        if (this.b & 4)
            v0 = v0 + CodedOutputByteBufferNano.b(13, this.h);
        if (this.b & 8)
            v0 = v0 + CodedOutputByteBufferNano.b(14, this.i);
        if (this.b & 2048)
            v0 = v0 + CodedOutputByteBufferNano.d(15) + 1;
        if (this.b & 16384)
            v0 = v0 + CodedOutputByteBufferNano.d(16, this.z);
        if (this.b & 1024)
            v0 = v0 + CodedOutputByteBufferNano.d(17, this.q);
        if (this.u != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(18, this.u);
        if (this.b & 32768)
            v0 = v0 + CodedOutputByteBufferNano.b(19, this.B);
        if (this.b & 4096)
            v0 = v0 + CodedOutputByteBufferNano.f(20, this.x);
        if (this.r != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(21, this.r);
        if (this.b & 256)
            v0 = v0 + CodedOutputByteBufferNano.d(22) + 1;
        if (this.v != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(23, this.v);
        if (this.c != 0 && this.c.length > 0)
            while (v1 < this.c.length) {
                if (this.c[v1] != 0)
                    v0 = v0 + CodedOutputByteBufferNano.d(24, this.c[v1]);
                v1 = v1 + 1;
            }
        if (this.b & 1)
            v0 = v0 + CodedOutputByteBufferNano.d(25) + 1;
        if (this.b & 16)
            v0 = v0 + CodedOutputByteBufferNano.b(26, this.j);
        if (this.b & 65536)
            v0 = v0 + CodedOutputByteBufferNano.d(29) + 1;
        if (this.b & 131072)
            v0 = v0 + CodedOutputByteBufferNano.f(30, this.D);
        if (this.b & 262144)
            v0 = v0 + CodedOutputByteBufferNano.b(31, this.E);
        if (this.b & 524288)
            v0 = v0 + CodedOutputByteBufferNano.f(32, this.F);
        return v0;
    }

    public final com.google.android.finsky.cv.a.bl b(String p0) {
        if (p0 == 0)
            throw new NullPointerException();
        this.b = this.b | 64;
        this.l = p0;
        return this;
    }

    public final boolean d() {
        if (this.b & 32)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final boolean e() {
        if (this.b & 64)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.bl))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.bl)p0;
                if (!com.google.protobuf.nano.h.a(this.c, p0.c))
                    v0 = 0;
                else if ((this.b & 1) != (p0.b & 1))
                    v0 = 0;
                else if (this.d != p0.d)
                    v0 = 0;
                else if (this.e != p0.e)
                    v0 = 0;
                else if (this.f == 0) {
                    if (p0.f != 0)
                        v0 = 0;
                    else if ((this.b & 2) != (p0.b & 2))
                        v0 = 0;
                    else if (!this.g.equals(p0.g))
                        v0 = 0;
                    else if ((this.b & 4) != (p0.b & 4))
                        v0 = 0;
                    else if (!this.h.equals(p0.h))
                        v0 = 0;
                    else if ((this.b & 8) != (p0.b & 8))
                        v0 = 0;
                    else if (!this.i.equals(p0.i))
                        v0 = 0;
                    else if ((this.b & 16) != (p0.b & 16))
                        v0 = 0;
                    else if (!this.j.equals(p0.j))
                        v0 = 0;
                    else if ((this.b & 32) != (p0.b & 32))
                        v0 = 0;
                    else if (this.k != p0.k)
                        v0 = 0;
                    else if ((this.b & 64) != (p0.b & 64))
                        v0 = 0;
                    else if (!this.l.equals(p0.l))
                        v0 = 0;
                    else if (!com.google.protobuf.nano.h.a(this.m, p0.m))
                        v0 = 0;
                    else if ((this.b & 128) != (p0.b & 128))
                        v0 = 0;
                    else if (this.n != p0.n)
                        v0 = 0;
                    else if ((this.b & 256) != (p0.b & 256))
                        v0 = 0;
                    else if (this.o != p0.o)
                        v0 = 0;
                    else if ((this.b & 512) != (p0.b & 512))
                        v0 = 0;
                    else if (this.p != p0.p)
                        v0 = 0;
                    else if ((this.b & 1024) != (p0.b & 1024))
                        v0 = 0;
                    else if (this.q != p0.q)
                        v0 = 0;
                    else if (this.r == 0) {
                        if (p0.r != 0)
                            v0 = 0;
                        else if (this.s == 0) {
                            if (p0.s != 0)
                                v0 = 0;
                            else if (this.t == 0) {
                                if (p0.t != 0)
                                    v0 = 0;
                                else if (this.u == 0) {
                                    if (p0.u != 0)
                                        v0 = 0;
                                    else if (this.v == 0) {
                                        if (p0.v != 0)
                                            v0 = 0;
                                        else if ((this.b & 2048) != (p0.b & 2048))
                                            v0 = 0;
                                        else if (this.w != p0.w)
                                            v0 = 0;
                                        else if ((this.b & 4096) != (p0.b & 4096))
                                            v0 = 0;
                                        else if (this.x != p0.x)
                                            v0 = 0;
                                        else if ((this.b & 8192) != (p0.b & 8192))
                                            v0 = 0;
                                        else if (this.y != p0.y)
                                            v0 = 0;
                                        else if ((this.b & 16384) != (p0.b & 16384))
                                            v0 = 0;
                                        else if (this.z != p0.z)
                                            v0 = 0;
                                        else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                            v0 = 0;
                                        else if ((this.b & 32768) != (p0.b & 32768))
                                            v0 = 0;
                                        else if (!this.B.equals(p0.B))
                                            v0 = 0;
                                        else if ((this.b & 65536) != (p0.b & 65536))
                                            v0 = 0;
                                        else if (this.C != p0.C)
                                            v0 = 0;
                                        else if ((this.b & 131072) != (p0.b & 131072))
                                            v0 = 0;
                                        else if (this.D != p0.D)
                                            v0 = 0;
                                        else if ((this.b & 262144) != (p0.b & 262144))
                                            v0 = 0;
                                        else if (!this.E.equals(p0.E))
                                            v0 = 0;
                                        else if ((this.b & 524288) != (p0.b & 524288))
                                            v0 = 0;
                                        else if (this.F != p0.F)
                                            v0 = 0;
                                        else if (this.aO == 0 || this.aO.b()) {
                                            if (p0.aO != 0 && !p0.aO.b())
                                                v0 = 0;
                                        }
                                        else
                                            v0 = this.aO.equals(p0.aO);
                                    }
                                    else if (!this.v.equals(p0.v))
                                        v0 = 0;
                                    else if ((this.b & 2048) != (p0.b & 2048))
                                        v0 = 0;
                                    else if (this.w != p0.w)
                                        v0 = 0;
                                    else if ((this.b & 4096) != (p0.b & 4096))
                                        v0 = 0;
                                    else if (this.x != p0.x)
                                        v0 = 0;
                                    else if ((this.b & 8192) != (p0.b & 8192))
                                        v0 = 0;
                                    else if (this.y != p0.y)
                                        v0 = 0;
                                    else if ((this.b & 16384) != (p0.b & 16384))
                                        v0 = 0;
                                    else if (this.z != p0.z)
                                        v0 = 0;
                                    else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                        v0 = 0;
                                    else if ((this.b & 32768) != (p0.b & 32768))
                                        v0 = 0;
                                    else if (!this.B.equals(p0.B))
                                        v0 = 0;
                                    else if ((this.b & 65536) != (p0.b & 65536))
                                        v0 = 0;
                                    else if (this.C != p0.C)
                                        v0 = 0;
                                    else if ((this.b & 131072) != (p0.b & 131072))
                                        v0 = 0;
                                    else if (this.D != p0.D)
                                        v0 = 0;
                                    else if ((this.b & 262144) != (p0.b & 262144))
                                        v0 = 0;
                                    else if (!this.E.equals(p0.E))
                                        v0 = 0;
                                    else if ((this.b & 524288) != (p0.b & 524288))
                                        v0 = 0;
                                    else if (this.F != p0.F)
                                        v0 = 0;
                                    else if (this.aO == 0 || this.aO.b()) {
                                        if (p0.aO != 0 && !p0.aO.b())
                                            v0 = 0;
                                    }
                                    else
                                        v0 = this.aO.equals(p0.aO);
                                }
                                else if (!this.u.equals(p0.u))
                                    v0 = 0;
                                else if (this.v == 0) {
                                    if (p0.v != 0)
                                        v0 = 0;
                                    else if ((this.b & 2048) != (p0.b & 2048))
                                        v0 = 0;
                                    else if (this.w != p0.w)
                                        v0 = 0;
                                    else if ((this.b & 4096) != (p0.b & 4096))
                                        v0 = 0;
                                    else if (this.x != p0.x)
                                        v0 = 0;
                                    else if ((this.b & 8192) != (p0.b & 8192))
                                        v0 = 0;
                                    else if (this.y != p0.y)
                                        v0 = 0;
                                    else if ((this.b & 16384) != (p0.b & 16384))
                                        v0 = 0;
                                    else if (this.z != p0.z)
                                        v0 = 0;
                                    else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                        v0 = 0;
                                    else if ((this.b & 32768) != (p0.b & 32768))
                                        v0 = 0;
                                    else if (!this.B.equals(p0.B))
                                        v0 = 0;
                                    else if ((this.b & 65536) != (p0.b & 65536))
                                        v0 = 0;
                                    else if (this.C != p0.C)
                                        v0 = 0;
                                    else if ((this.b & 131072) != (p0.b & 131072))
                                        v0 = 0;
                                    else if (this.D != p0.D)
                                        v0 = 0;
                                    else if ((this.b & 262144) != (p0.b & 262144))
                                        v0 = 0;
                                    else if (!this.E.equals(p0.E))
                                        v0 = 0;
                                    else if ((this.b & 524288) != (p0.b & 524288))
                                        v0 = 0;
                                    else if (this.F != p0.F)
                                        v0 = 0;
                                    else if (this.aO == 0 || this.aO.b()) {
                                        if (p0.aO != 0 && !p0.aO.b())
                                            v0 = 0;
                                    }
                                    else
                                        v0 = this.aO.equals(p0.aO);
                                }
                                else if (!this.v.equals(p0.v))
                                    v0 = 0;
                                else if ((this.b & 2048) != (p0.b & 2048))
                                    v0 = 0;
                                else if (this.w != p0.w)
                                    v0 = 0;
                                else if ((this.b & 4096) != (p0.b & 4096))
                                    v0 = 0;
                                else if (this.x != p0.x)
                                    v0 = 0;
                                else if ((this.b & 8192) != (p0.b & 8192))
                                    v0 = 0;
                                else if (this.y != p0.y)
                                    v0 = 0;
                                else if ((this.b & 16384) != (p0.b & 16384))
                                    v0 = 0;
                                else if (this.z != p0.z)
                                    v0 = 0;
                                else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                    v0 = 0;
                                else if ((this.b & 32768) != (p0.b & 32768))
                                    v0 = 0;
                                else if (!this.B.equals(p0.B))
                                    v0 = 0;
                                else if ((this.b & 65536) != (p0.b & 65536))
                                    v0 = 0;
                                else if (this.C != p0.C)
                                    v0 = 0;
                                else if ((this.b & 131072) != (p0.b & 131072))
                                    v0 = 0;
                                else if (this.D != p0.D)
                                    v0 = 0;
                                else if ((this.b & 262144) != (p0.b & 262144))
                                    v0 = 0;
                                else if (!this.E.equals(p0.E))
                                    v0 = 0;
                                else if ((this.b & 524288) != (p0.b & 524288))
                                    v0 = 0;
                                else if (this.F != p0.F)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.t.equals(p0.t))
                                v0 = 0;
                            else if (this.u == 0) {
                                if (p0.u != 0)
                                    v0 = 0;
                                else if (this.v == 0) {
                                    if (p0.v != 0)
                                        v0 = 0;
                                    else if ((this.b & 2048) != (p0.b & 2048))
                                        v0 = 0;
                                    else if (this.w != p0.w)
                                        v0 = 0;
                                    else if ((this.b & 4096) != (p0.b & 4096))
                                        v0 = 0;
                                    else if (this.x != p0.x)
                                        v0 = 0;
                                    else if ((this.b & 8192) != (p0.b & 8192))
                                        v0 = 0;
                                    else if (this.y != p0.y)
                                        v0 = 0;
                                    else if ((this.b & 16384) != (p0.b & 16384))
                                        v0 = 0;
                                    else if (this.z != p0.z)
                                        v0 = 0;
                                    else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                        v0 = 0;
                                    else if ((this.b & 32768) != (p0.b & 32768))
                                        v0 = 0;
                                    else if (!this.B.equals(p0.B))
                                        v0 = 0;
                                    else if ((this.b & 65536) != (p0.b & 65536))
                                        v0 = 0;
                                    else if (this.C != p0.C)
                                        v0 = 0;
                                    else if ((this.b & 131072) != (p0.b & 131072))
                                        v0 = 0;
                                    else if (this.D != p0.D)
                                        v0 = 0;
                                    else if ((this.b & 262144) != (p0.b & 262144))
                                        v0 = 0;
                                    else if (!this.E.equals(p0.E))
                                        v0 = 0;
                                    else if ((this.b & 524288) != (p0.b & 524288))
                                        v0 = 0;
                                    else if (this.F != p0.F)
                                        v0 = 0;
                                    else if (this.aO == 0 || this.aO.b()) {
                                        if (p0.aO != 0 && !p0.aO.b())
                                            v0 = 0;
                                    }
                                    else
                                        v0 = this.aO.equals(p0.aO);
                                }
                                else if (!this.v.equals(p0.v))
                                    v0 = 0;
                                else if ((this.b & 2048) != (p0.b & 2048))
                                    v0 = 0;
                                else if (this.w != p0.w)
                                    v0 = 0;
                                else if ((this.b & 4096) != (p0.b & 4096))
                                    v0 = 0;
                                else if (this.x != p0.x)
                                    v0 = 0;
                                else if ((this.b & 8192) != (p0.b & 8192))
                                    v0 = 0;
                                else if (this.y != p0.y)
                                    v0 = 0;
                                else if ((this.b & 16384) != (p0.b & 16384))
                                    v0 = 0;
                                else if (this.z != p0.z)
                                    v0 = 0;
                                else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                    v0 = 0;
                                else if ((this.b & 32768) != (p0.b & 32768))
                                    v0 = 0;
                                else if (!this.B.equals(p0.B))
                                    v0 = 0;
                                else if ((this.b & 65536) != (p0.b & 65536))
                                    v0 = 0;
                                else if (this.C != p0.C)
                                    v0 = 0;
                                else if ((this.b & 131072) != (p0.b & 131072))
                                    v0 = 0;
                                else if (this.D != p0.D)
                                    v0 = 0;
                                else if ((this.b & 262144) != (p0.b & 262144))
                                    v0 = 0;
                                else if (!this.E.equals(p0.E))
                                    v0 = 0;
                                else if ((this.b & 524288) != (p0.b & 524288))
                                    v0 = 0;
                                else if (this.F != p0.F)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.u.equals(p0.u))
                                v0 = 0;
                            else if (this.v == 0) {
                                if (p0.v != 0)
                                    v0 = 0;
                                else if ((this.b & 2048) != (p0.b & 2048))
                                    v0 = 0;
                                else if (this.w != p0.w)
                                    v0 = 0;
                                else if ((this.b & 4096) != (p0.b & 4096))
                                    v0 = 0;
                                else if (this.x != p0.x)
                                    v0 = 0;
                                else if ((this.b & 8192) != (p0.b & 8192))
                                    v0 = 0;
                                else if (this.y != p0.y)
                                    v0 = 0;
                                else if ((this.b & 16384) != (p0.b & 16384))
                                    v0 = 0;
                                else if (this.z != p0.z)
                                    v0 = 0;
                                else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                    v0 = 0;
                                else if ((this.b & 32768) != (p0.b & 32768))
                                    v0 = 0;
                                else if (!this.B.equals(p0.B))
                                    v0 = 0;
                                else if ((this.b & 65536) != (p0.b & 65536))
                                    v0 = 0;
                                else if (this.C != p0.C)
                                    v0 = 0;
                                else if ((this.b & 131072) != (p0.b & 131072))
                                    v0 = 0;
                                else if (this.D != p0.D)
                                    v0 = 0;
                                else if ((this.b & 262144) != (p0.b & 262144))
                                    v0 = 0;
                                else if (!this.E.equals(p0.E))
                                    v0 = 0;
                                else if ((this.b & 524288) != (p0.b & 524288))
                                    v0 = 0;
                                else if (this.F != p0.F)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.v.equals(p0.v))
                                v0 = 0;
                            else if ((this.b & 2048) != (p0.b & 2048))
                                v0 = 0;
                            else if (this.w != p0.w)
                                v0 = 0;
                            else if ((this.b & 4096) != (p0.b & 4096))
                                v0 = 0;
                            else if (this.x != p0.x)
                                v0 = 0;
                            else if ((this.b & 8192) != (p0.b & 8192))
                                v0 = 0;
                            else if (this.y != p0.y)
                                v0 = 0;
                            else if ((this.b & 16384) != (p0.b & 16384))
                                v0 = 0;
                            else if (this.z != p0.z)
                                v0 = 0;
                            else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                v0 = 0;
                            else if ((this.b & 32768) != (p0.b & 32768))
                                v0 = 0;
                            else if (!this.B.equals(p0.B))
                                v0 = 0;
                            else if ((this.b & 65536) != (p0.b & 65536))
                                v0 = 0;
                            else if (this.C != p0.C)
                                v0 = 0;
                            else if ((this.b & 131072) != (p0.b & 131072))
                                v0 = 0;
                            else if (this.D != p0.D)
                                v0 = 0;
                            else if ((this.b & 262144) != (p0.b & 262144))
                                v0 = 0;
                            else if (!this.E.equals(p0.E))
                                v0 = 0;
                            else if ((this.b & 524288) != (p0.b & 524288))
                                v0 = 0;
                            else if (this.F != p0.F)
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
                        else if (this.t == 0) {
                            if (p0.t != 0)
                                v0 = 0;
                            else if (this.u == 0) {
                                if (p0.u != 0)
                                    v0 = 0;
                                else if (this.v == 0) {
                                    if (p0.v != 0)
                                        v0 = 0;
                                    else if ((this.b & 2048) != (p0.b & 2048))
                                        v0 = 0;
                                    else if (this.w != p0.w)
                                        v0 = 0;
                                    else if ((this.b & 4096) != (p0.b & 4096))
                                        v0 = 0;
                                    else if (this.x != p0.x)
                                        v0 = 0;
                                    else if ((this.b & 8192) != (p0.b & 8192))
                                        v0 = 0;
                                    else if (this.y != p0.y)
                                        v0 = 0;
                                    else if ((this.b & 16384) != (p0.b & 16384))
                                        v0 = 0;
                                    else if (this.z != p0.z)
                                        v0 = 0;
                                    else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                        v0 = 0;
                                    else if ((this.b & 32768) != (p0.b & 32768))
                                        v0 = 0;
                                    else if (!this.B.equals(p0.B))
                                        v0 = 0;
                                    else if ((this.b & 65536) != (p0.b & 65536))
                                        v0 = 0;
                                    else if (this.C != p0.C)
                                        v0 = 0;
                                    else if ((this.b & 131072) != (p0.b & 131072))
                                        v0 = 0;
                                    else if (this.D != p0.D)
                                        v0 = 0;
                                    else if ((this.b & 262144) != (p0.b & 262144))
                                        v0 = 0;
                                    else if (!this.E.equals(p0.E))
                                        v0 = 0;
                                    else if ((this.b & 524288) != (p0.b & 524288))
                                        v0 = 0;
                                    else if (this.F != p0.F)
                                        v0 = 0;
                                    else if (this.aO == 0 || this.aO.b()) {
                                        if (p0.aO != 0 && !p0.aO.b())
                                            v0 = 0;
                                    }
                                    else
                                        v0 = this.aO.equals(p0.aO);
                                }
                                else if (!this.v.equals(p0.v))
                                    v0 = 0;
                                else if ((this.b & 2048) != (p0.b & 2048))
                                    v0 = 0;
                                else if (this.w != p0.w)
                                    v0 = 0;
                                else if ((this.b & 4096) != (p0.b & 4096))
                                    v0 = 0;
                                else if (this.x != p0.x)
                                    v0 = 0;
                                else if ((this.b & 8192) != (p0.b & 8192))
                                    v0 = 0;
                                else if (this.y != p0.y)
                                    v0 = 0;
                                else if ((this.b & 16384) != (p0.b & 16384))
                                    v0 = 0;
                                else if (this.z != p0.z)
                                    v0 = 0;
                                else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                    v0 = 0;
                                else if ((this.b & 32768) != (p0.b & 32768))
                                    v0 = 0;
                                else if (!this.B.equals(p0.B))
                                    v0 = 0;
                                else if ((this.b & 65536) != (p0.b & 65536))
                                    v0 = 0;
                                else if (this.C != p0.C)
                                    v0 = 0;
                                else if ((this.b & 131072) != (p0.b & 131072))
                                    v0 = 0;
                                else if (this.D != p0.D)
                                    v0 = 0;
                                else if ((this.b & 262144) != (p0.b & 262144))
                                    v0 = 0;
                                else if (!this.E.equals(p0.E))
                                    v0 = 0;
                                else if ((this.b & 524288) != (p0.b & 524288))
                                    v0 = 0;
                                else if (this.F != p0.F)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.u.equals(p0.u))
                                v0 = 0;
                            else if (this.v == 0) {
                                if (p0.v != 0)
                                    v0 = 0;
                                else if ((this.b & 2048) != (p0.b & 2048))
                                    v0 = 0;
                                else if (this.w != p0.w)
                                    v0 = 0;
                                else if ((this.b & 4096) != (p0.b & 4096))
                                    v0 = 0;
                                else if (this.x != p0.x)
                                    v0 = 0;
                                else if ((this.b & 8192) != (p0.b & 8192))
                                    v0 = 0;
                                else if (this.y != p0.y)
                                    v0 = 0;
                                else if ((this.b & 16384) != (p0.b & 16384))
                                    v0 = 0;
                                else if (this.z != p0.z)
                                    v0 = 0;
                                else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                    v0 = 0;
                                else if ((this.b & 32768) != (p0.b & 32768))
                                    v0 = 0;
                                else if (!this.B.equals(p0.B))
                                    v0 = 0;
                                else if ((this.b & 65536) != (p0.b & 65536))
                                    v0 = 0;
                                else if (this.C != p0.C)
                                    v0 = 0;
                                else if ((this.b & 131072) != (p0.b & 131072))
                                    v0 = 0;
                                else if (this.D != p0.D)
                                    v0 = 0;
                                else if ((this.b & 262144) != (p0.b & 262144))
                                    v0 = 0;
                                else if (!this.E.equals(p0.E))
                                    v0 = 0;
                                else if ((this.b & 524288) != (p0.b & 524288))
                                    v0 = 0;
                                else if (this.F != p0.F)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.v.equals(p0.v))
                                v0 = 0;
                            else if ((this.b & 2048) != (p0.b & 2048))
                                v0 = 0;
                            else if (this.w != p0.w)
                                v0 = 0;
                            else if ((this.b & 4096) != (p0.b & 4096))
                                v0 = 0;
                            else if (this.x != p0.x)
                                v0 = 0;
                            else if ((this.b & 8192) != (p0.b & 8192))
                                v0 = 0;
                            else if (this.y != p0.y)
                                v0 = 0;
                            else if ((this.b & 16384) != (p0.b & 16384))
                                v0 = 0;
                            else if (this.z != p0.z)
                                v0 = 0;
                            else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                v0 = 0;
                            else if ((this.b & 32768) != (p0.b & 32768))
                                v0 = 0;
                            else if (!this.B.equals(p0.B))
                                v0 = 0;
                            else if ((this.b & 65536) != (p0.b & 65536))
                                v0 = 0;
                            else if (this.C != p0.C)
                                v0 = 0;
                            else if ((this.b & 131072) != (p0.b & 131072))
                                v0 = 0;
                            else if (this.D != p0.D)
                                v0 = 0;
                            else if ((this.b & 262144) != (p0.b & 262144))
                                v0 = 0;
                            else if (!this.E.equals(p0.E))
                                v0 = 0;
                            else if ((this.b & 524288) != (p0.b & 524288))
                                v0 = 0;
                            else if (this.F != p0.F)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.t.equals(p0.t))
                            v0 = 0;
                        else if (this.u == 0) {
                            if (p0.u != 0)
                                v0 = 0;
                            else if (this.v == 0) {
                                if (p0.v != 0)
                                    v0 = 0;
                                else if ((this.b & 2048) != (p0.b & 2048))
                                    v0 = 0;
                                else if (this.w != p0.w)
                                    v0 = 0;
                                else if ((this.b & 4096) != (p0.b & 4096))
                                    v0 = 0;
                                else if (this.x != p0.x)
                                    v0 = 0;
                                else if ((this.b & 8192) != (p0.b & 8192))
                                    v0 = 0;
                                else if (this.y != p0.y)
                                    v0 = 0;
                                else if ((this.b & 16384) != (p0.b & 16384))
                                    v0 = 0;
                                else if (this.z != p0.z)
                                    v0 = 0;
                                else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                    v0 = 0;
                                else if ((this.b & 32768) != (p0.b & 32768))
                                    v0 = 0;
                                else if (!this.B.equals(p0.B))
                                    v0 = 0;
                                else if ((this.b & 65536) != (p0.b & 65536))
                                    v0 = 0;
                                else if (this.C != p0.C)
                                    v0 = 0;
                                else if ((this.b & 131072) != (p0.b & 131072))
                                    v0 = 0;
                                else if (this.D != p0.D)
                                    v0 = 0;
                                else if ((this.b & 262144) != (p0.b & 262144))
                                    v0 = 0;
                                else if (!this.E.equals(p0.E))
                                    v0 = 0;
                                else if ((this.b & 524288) != (p0.b & 524288))
                                    v0 = 0;
                                else if (this.F != p0.F)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.v.equals(p0.v))
                                v0 = 0;
                            else if ((this.b & 2048) != (p0.b & 2048))
                                v0 = 0;
                            else if (this.w != p0.w)
                                v0 = 0;
                            else if ((this.b & 4096) != (p0.b & 4096))
                                v0 = 0;
                            else if (this.x != p0.x)
                                v0 = 0;
                            else if ((this.b & 8192) != (p0.b & 8192))
                                v0 = 0;
                            else if (this.y != p0.y)
                                v0 = 0;
                            else if ((this.b & 16384) != (p0.b & 16384))
                                v0 = 0;
                            else if (this.z != p0.z)
                                v0 = 0;
                            else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                v0 = 0;
                            else if ((this.b & 32768) != (p0.b & 32768))
                                v0 = 0;
                            else if (!this.B.equals(p0.B))
                                v0 = 0;
                            else if ((this.b & 65536) != (p0.b & 65536))
                                v0 = 0;
                            else if (this.C != p0.C)
                                v0 = 0;
                            else if ((this.b & 131072) != (p0.b & 131072))
                                v0 = 0;
                            else if (this.D != p0.D)
                                v0 = 0;
                            else if ((this.b & 262144) != (p0.b & 262144))
                                v0 = 0;
                            else if (!this.E.equals(p0.E))
                                v0 = 0;
                            else if ((this.b & 524288) != (p0.b & 524288))
                                v0 = 0;
                            else if (this.F != p0.F)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.u.equals(p0.u))
                            v0 = 0;
                        else if (this.v == 0) {
                            if (p0.v != 0)
                                v0 = 0;
                            else if ((this.b & 2048) != (p0.b & 2048))
                                v0 = 0;
                            else if (this.w != p0.w)
                                v0 = 0;
                            else if ((this.b & 4096) != (p0.b & 4096))
                                v0 = 0;
                            else if (this.x != p0.x)
                                v0 = 0;
                            else if ((this.b & 8192) != (p0.b & 8192))
                                v0 = 0;
                            else if (this.y != p0.y)
                                v0 = 0;
                            else if ((this.b & 16384) != (p0.b & 16384))
                                v0 = 0;
                            else if (this.z != p0.z)
                                v0 = 0;
                            else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                v0 = 0;
                            else if ((this.b & 32768) != (p0.b & 32768))
                                v0 = 0;
                            else if (!this.B.equals(p0.B))
                                v0 = 0;
                            else if ((this.b & 65536) != (p0.b & 65536))
                                v0 = 0;
                            else if (this.C != p0.C)
                                v0 = 0;
                            else if ((this.b & 131072) != (p0.b & 131072))
                                v0 = 0;
                            else if (this.D != p0.D)
                                v0 = 0;
                            else if ((this.b & 262144) != (p0.b & 262144))
                                v0 = 0;
                            else if (!this.E.equals(p0.E))
                                v0 = 0;
                            else if ((this.b & 524288) != (p0.b & 524288))
                                v0 = 0;
                            else if (this.F != p0.F)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.v.equals(p0.v))
                            v0 = 0;
                        else if ((this.b & 2048) != (p0.b & 2048))
                            v0 = 0;
                        else if (this.w != p0.w)
                            v0 = 0;
                        else if ((this.b & 4096) != (p0.b & 4096))
                            v0 = 0;
                        else if (this.x != p0.x)
                            v0 = 0;
                        else if ((this.b & 8192) != (p0.b & 8192))
                            v0 = 0;
                        else if (this.y != p0.y)
                            v0 = 0;
                        else if ((this.b & 16384) != (p0.b & 16384))
                            v0 = 0;
                        else if (this.z != p0.z)
                            v0 = 0;
                        else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                            v0 = 0;
                        else if ((this.b & 32768) != (p0.b & 32768))
                            v0 = 0;
                        else if (!this.B.equals(p0.B))
                            v0 = 0;
                        else if ((this.b & 65536) != (p0.b & 65536))
                            v0 = 0;
                        else if (this.C != p0.C)
                            v0 = 0;
                        else if ((this.b & 131072) != (p0.b & 131072))
                            v0 = 0;
                        else if (this.D != p0.D)
                            v0 = 0;
                        else if ((this.b & 262144) != (p0.b & 262144))
                            v0 = 0;
                        else if (!this.E.equals(p0.E))
                            v0 = 0;
                        else if ((this.b & 524288) != (p0.b & 524288))
                            v0 = 0;
                        else if (this.F != p0.F)
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
                        else if (this.t == 0) {
                            if (p0.t != 0)
                                v0 = 0;
                            else if (this.u == 0) {
                                if (p0.u != 0)
                                    v0 = 0;
                                else if (this.v == 0) {
                                    if (p0.v != 0)
                                        v0 = 0;
                                    else if ((this.b & 2048) != (p0.b & 2048))
                                        v0 = 0;
                                    else if (this.w != p0.w)
                                        v0 = 0;
                                    else if ((this.b & 4096) != (p0.b & 4096))
                                        v0 = 0;
                                    else if (this.x != p0.x)
                                        v0 = 0;
                                    else if ((this.b & 8192) != (p0.b & 8192))
                                        v0 = 0;
                                    else if (this.y != p0.y)
                                        v0 = 0;
                                    else if ((this.b & 16384) != (p0.b & 16384))
                                        v0 = 0;
                                    else if (this.z != p0.z)
                                        v0 = 0;
                                    else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                        v0 = 0;
                                    else if ((this.b & 32768) != (p0.b & 32768))
                                        v0 = 0;
                                    else if (!this.B.equals(p0.B))
                                        v0 = 0;
                                    else if ((this.b & 65536) != (p0.b & 65536))
                                        v0 = 0;
                                    else if (this.C != p0.C)
                                        v0 = 0;
                                    else if ((this.b & 131072) != (p0.b & 131072))
                                        v0 = 0;
                                    else if (this.D != p0.D)
                                        v0 = 0;
                                    else if ((this.b & 262144) != (p0.b & 262144))
                                        v0 = 0;
                                    else if (!this.E.equals(p0.E))
                                        v0 = 0;
                                    else if ((this.b & 524288) != (p0.b & 524288))
                                        v0 = 0;
                                    else if (this.F != p0.F)
                                        v0 = 0;
                                    else if (this.aO == 0 || this.aO.b()) {
                                        if (p0.aO != 0 && !p0.aO.b())
                                            v0 = 0;
                                    }
                                    else
                                        v0 = this.aO.equals(p0.aO);
                                }
                                else if (!this.v.equals(p0.v))
                                    v0 = 0;
                                else if ((this.b & 2048) != (p0.b & 2048))
                                    v0 = 0;
                                else if (this.w != p0.w)
                                    v0 = 0;
                                else if ((this.b & 4096) != (p0.b & 4096))
                                    v0 = 0;
                                else if (this.x != p0.x)
                                    v0 = 0;
                                else if ((this.b & 8192) != (p0.b & 8192))
                                    v0 = 0;
                                else if (this.y != p0.y)
                                    v0 = 0;
                                else if ((this.b & 16384) != (p0.b & 16384))
                                    v0 = 0;
                                else if (this.z != p0.z)
                                    v0 = 0;
                                else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                    v0 = 0;
                                else if ((this.b & 32768) != (p0.b & 32768))
                                    v0 = 0;
                                else if (!this.B.equals(p0.B))
                                    v0 = 0;
                                else if ((this.b & 65536) != (p0.b & 65536))
                                    v0 = 0;
                                else if (this.C != p0.C)
                                    v0 = 0;
                                else if ((this.b & 131072) != (p0.b & 131072))
                                    v0 = 0;
                                else if (this.D != p0.D)
                                    v0 = 0;
                                else if ((this.b & 262144) != (p0.b & 262144))
                                    v0 = 0;
                                else if (!this.E.equals(p0.E))
                                    v0 = 0;
                                else if ((this.b & 524288) != (p0.b & 524288))
                                    v0 = 0;
                                else if (this.F != p0.F)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.u.equals(p0.u))
                                v0 = 0;
                            else if (this.v == 0) {
                                if (p0.v != 0)
                                    v0 = 0;
                                else if ((this.b & 2048) != (p0.b & 2048))
                                    v0 = 0;
                                else if (this.w != p0.w)
                                    v0 = 0;
                                else if ((this.b & 4096) != (p0.b & 4096))
                                    v0 = 0;
                                else if (this.x != p0.x)
                                    v0 = 0;
                                else if ((this.b & 8192) != (p0.b & 8192))
                                    v0 = 0;
                                else if (this.y != p0.y)
                                    v0 = 0;
                                else if ((this.b & 16384) != (p0.b & 16384))
                                    v0 = 0;
                                else if (this.z != p0.z)
                                    v0 = 0;
                                else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                    v0 = 0;
                                else if ((this.b & 32768) != (p0.b & 32768))
                                    v0 = 0;
                                else if (!this.B.equals(p0.B))
                                    v0 = 0;
                                else if ((this.b & 65536) != (p0.b & 65536))
                                    v0 = 0;
                                else if (this.C != p0.C)
                                    v0 = 0;
                                else if ((this.b & 131072) != (p0.b & 131072))
                                    v0 = 0;
                                else if (this.D != p0.D)
                                    v0 = 0;
                                else if ((this.b & 262144) != (p0.b & 262144))
                                    v0 = 0;
                                else if (!this.E.equals(p0.E))
                                    v0 = 0;
                                else if ((this.b & 524288) != (p0.b & 524288))
                                    v0 = 0;
                                else if (this.F != p0.F)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.v.equals(p0.v))
                                v0 = 0;
                            else if ((this.b & 2048) != (p0.b & 2048))
                                v0 = 0;
                            else if (this.w != p0.w)
                                v0 = 0;
                            else if ((this.b & 4096) != (p0.b & 4096))
                                v0 = 0;
                            else if (this.x != p0.x)
                                v0 = 0;
                            else if ((this.b & 8192) != (p0.b & 8192))
                                v0 = 0;
                            else if (this.y != p0.y)
                                v0 = 0;
                            else if ((this.b & 16384) != (p0.b & 16384))
                                v0 = 0;
                            else if (this.z != p0.z)
                                v0 = 0;
                            else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                v0 = 0;
                            else if ((this.b & 32768) != (p0.b & 32768))
                                v0 = 0;
                            else if (!this.B.equals(p0.B))
                                v0 = 0;
                            else if ((this.b & 65536) != (p0.b & 65536))
                                v0 = 0;
                            else if (this.C != p0.C)
                                v0 = 0;
                            else if ((this.b & 131072) != (p0.b & 131072))
                                v0 = 0;
                            else if (this.D != p0.D)
                                v0 = 0;
                            else if ((this.b & 262144) != (p0.b & 262144))
                                v0 = 0;
                            else if (!this.E.equals(p0.E))
                                v0 = 0;
                            else if ((this.b & 524288) != (p0.b & 524288))
                                v0 = 0;
                            else if (this.F != p0.F)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.t.equals(p0.t))
                            v0 = 0;
                        else if (this.u == 0) {
                            if (p0.u != 0)
                                v0 = 0;
                            else if (this.v == 0) {
                                if (p0.v != 0)
                                    v0 = 0;
                                else if ((this.b & 2048) != (p0.b & 2048))
                                    v0 = 0;
                                else if (this.w != p0.w)
                                    v0 = 0;
                                else if ((this.b & 4096) != (p0.b & 4096))
                                    v0 = 0;
                                else if (this.x != p0.x)
                                    v0 = 0;
                                else if ((this.b & 8192) != (p0.b & 8192))
                                    v0 = 0;
                                else if (this.y != p0.y)
                                    v0 = 0;
                                else if ((this.b & 16384) != (p0.b & 16384))
                                    v0 = 0;
                                else if (this.z != p0.z)
                                    v0 = 0;
                                else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                    v0 = 0;
                                else if ((this.b & 32768) != (p0.b & 32768))
                                    v0 = 0;
                                else if (!this.B.equals(p0.B))
                                    v0 = 0;
                                else if ((this.b & 65536) != (p0.b & 65536))
                                    v0 = 0;
                                else if (this.C != p0.C)
                                    v0 = 0;
                                else if ((this.b & 131072) != (p0.b & 131072))
                                    v0 = 0;
                                else if (this.D != p0.D)
                                    v0 = 0;
                                else if ((this.b & 262144) != (p0.b & 262144))
                                    v0 = 0;
                                else if (!this.E.equals(p0.E))
                                    v0 = 0;
                                else if ((this.b & 524288) != (p0.b & 524288))
                                    v0 = 0;
                                else if (this.F != p0.F)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.v.equals(p0.v))
                                v0 = 0;
                            else if ((this.b & 2048) != (p0.b & 2048))
                                v0 = 0;
                            else if (this.w != p0.w)
                                v0 = 0;
                            else if ((this.b & 4096) != (p0.b & 4096))
                                v0 = 0;
                            else if (this.x != p0.x)
                                v0 = 0;
                            else if ((this.b & 8192) != (p0.b & 8192))
                                v0 = 0;
                            else if (this.y != p0.y)
                                v0 = 0;
                            else if ((this.b & 16384) != (p0.b & 16384))
                                v0 = 0;
                            else if (this.z != p0.z)
                                v0 = 0;
                            else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                v0 = 0;
                            else if ((this.b & 32768) != (p0.b & 32768))
                                v0 = 0;
                            else if (!this.B.equals(p0.B))
                                v0 = 0;
                            else if ((this.b & 65536) != (p0.b & 65536))
                                v0 = 0;
                            else if (this.C != p0.C)
                                v0 = 0;
                            else if ((this.b & 131072) != (p0.b & 131072))
                                v0 = 0;
                            else if (this.D != p0.D)
                                v0 = 0;
                            else if ((this.b & 262144) != (p0.b & 262144))
                                v0 = 0;
                            else if (!this.E.equals(p0.E))
                                v0 = 0;
                            else if ((this.b & 524288) != (p0.b & 524288))
                                v0 = 0;
                            else if (this.F != p0.F)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.u.equals(p0.u))
                            v0 = 0;
                        else if (this.v == 0) {
                            if (p0.v != 0)
                                v0 = 0;
                            else if ((this.b & 2048) != (p0.b & 2048))
                                v0 = 0;
                            else if (this.w != p0.w)
                                v0 = 0;
                            else if ((this.b & 4096) != (p0.b & 4096))
                                v0 = 0;
                            else if (this.x != p0.x)
                                v0 = 0;
                            else if ((this.b & 8192) != (p0.b & 8192))
                                v0 = 0;
                            else if (this.y != p0.y)
                                v0 = 0;
                            else if ((this.b & 16384) != (p0.b & 16384))
                                v0 = 0;
                            else if (this.z != p0.z)
                                v0 = 0;
                            else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                v0 = 0;
                            else if ((this.b & 32768) != (p0.b & 32768))
                                v0 = 0;
                            else if (!this.B.equals(p0.B))
                                v0 = 0;
                            else if ((this.b & 65536) != (p0.b & 65536))
                                v0 = 0;
                            else if (this.C != p0.C)
                                v0 = 0;
                            else if ((this.b & 131072) != (p0.b & 131072))
                                v0 = 0;
                            else if (this.D != p0.D)
                                v0 = 0;
                            else if ((this.b & 262144) != (p0.b & 262144))
                                v0 = 0;
                            else if (!this.E.equals(p0.E))
                                v0 = 0;
                            else if ((this.b & 524288) != (p0.b & 524288))
                                v0 = 0;
                            else if (this.F != p0.F)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.v.equals(p0.v))
                            v0 = 0;
                        else if ((this.b & 2048) != (p0.b & 2048))
                            v0 = 0;
                        else if (this.w != p0.w)
                            v0 = 0;
                        else if ((this.b & 4096) != (p0.b & 4096))
                            v0 = 0;
                        else if (this.x != p0.x)
                            v0 = 0;
                        else if ((this.b & 8192) != (p0.b & 8192))
                            v0 = 0;
                        else if (this.y != p0.y)
                            v0 = 0;
                        else if ((this.b & 16384) != (p0.b & 16384))
                            v0 = 0;
                        else if (this.z != p0.z)
                            v0 = 0;
                        else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                            v0 = 0;
                        else if ((this.b & 32768) != (p0.b & 32768))
                            v0 = 0;
                        else if (!this.B.equals(p0.B))
                            v0 = 0;
                        else if ((this.b & 65536) != (p0.b & 65536))
                            v0 = 0;
                        else if (this.C != p0.C)
                            v0 = 0;
                        else if ((this.b & 131072) != (p0.b & 131072))
                            v0 = 0;
                        else if (this.D != p0.D)
                            v0 = 0;
                        else if ((this.b & 262144) != (p0.b & 262144))
                            v0 = 0;
                        else if (!this.E.equals(p0.E))
                            v0 = 0;
                        else if ((this.b & 524288) != (p0.b & 524288))
                            v0 = 0;
                        else if (this.F != p0.F)
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
                    else if (this.t == 0) {
                        if (p0.t != 0)
                            v0 = 0;
                        else if (this.u == 0) {
                            if (p0.u != 0)
                                v0 = 0;
                            else if (this.v == 0) {
                                if (p0.v != 0)
                                    v0 = 0;
                                else if ((this.b & 2048) != (p0.b & 2048))
                                    v0 = 0;
                                else if (this.w != p0.w)
                                    v0 = 0;
                                else if ((this.b & 4096) != (p0.b & 4096))
                                    v0 = 0;
                                else if (this.x != p0.x)
                                    v0 = 0;
                                else if ((this.b & 8192) != (p0.b & 8192))
                                    v0 = 0;
                                else if (this.y != p0.y)
                                    v0 = 0;
                                else if ((this.b & 16384) != (p0.b & 16384))
                                    v0 = 0;
                                else if (this.z != p0.z)
                                    v0 = 0;
                                else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                    v0 = 0;
                                else if ((this.b & 32768) != (p0.b & 32768))
                                    v0 = 0;
                                else if (!this.B.equals(p0.B))
                                    v0 = 0;
                                else if ((this.b & 65536) != (p0.b & 65536))
                                    v0 = 0;
                                else if (this.C != p0.C)
                                    v0 = 0;
                                else if ((this.b & 131072) != (p0.b & 131072))
                                    v0 = 0;
                                else if (this.D != p0.D)
                                    v0 = 0;
                                else if ((this.b & 262144) != (p0.b & 262144))
                                    v0 = 0;
                                else if (!this.E.equals(p0.E))
                                    v0 = 0;
                                else if ((this.b & 524288) != (p0.b & 524288))
                                    v0 = 0;
                                else if (this.F != p0.F)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.v.equals(p0.v))
                                v0 = 0;
                            else if ((this.b & 2048) != (p0.b & 2048))
                                v0 = 0;
                            else if (this.w != p0.w)
                                v0 = 0;
                            else if ((this.b & 4096) != (p0.b & 4096))
                                v0 = 0;
                            else if (this.x != p0.x)
                                v0 = 0;
                            else if ((this.b & 8192) != (p0.b & 8192))
                                v0 = 0;
                            else if (this.y != p0.y)
                                v0 = 0;
                            else if ((this.b & 16384) != (p0.b & 16384))
                                v0 = 0;
                            else if (this.z != p0.z)
                                v0 = 0;
                            else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                v0 = 0;
                            else if ((this.b & 32768) != (p0.b & 32768))
                                v0 = 0;
                            else if (!this.B.equals(p0.B))
                                v0 = 0;
                            else if ((this.b & 65536) != (p0.b & 65536))
                                v0 = 0;
                            else if (this.C != p0.C)
                                v0 = 0;
                            else if ((this.b & 131072) != (p0.b & 131072))
                                v0 = 0;
                            else if (this.D != p0.D)
                                v0 = 0;
                            else if ((this.b & 262144) != (p0.b & 262144))
                                v0 = 0;
                            else if (!this.E.equals(p0.E))
                                v0 = 0;
                            else if ((this.b & 524288) != (p0.b & 524288))
                                v0 = 0;
                            else if (this.F != p0.F)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.u.equals(p0.u))
                            v0 = 0;
                        else if (this.v == 0) {
                            if (p0.v != 0)
                                v0 = 0;
                            else if ((this.b & 2048) != (p0.b & 2048))
                                v0 = 0;
                            else if (this.w != p0.w)
                                v0 = 0;
                            else if ((this.b & 4096) != (p0.b & 4096))
                                v0 = 0;
                            else if (this.x != p0.x)
                                v0 = 0;
                            else if ((this.b & 8192) != (p0.b & 8192))
                                v0 = 0;
                            else if (this.y != p0.y)
                                v0 = 0;
                            else if ((this.b & 16384) != (p0.b & 16384))
                                v0 = 0;
                            else if (this.z != p0.z)
                                v0 = 0;
                            else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                v0 = 0;
                            else if ((this.b & 32768) != (p0.b & 32768))
                                v0 = 0;
                            else if (!this.B.equals(p0.B))
                                v0 = 0;
                            else if ((this.b & 65536) != (p0.b & 65536))
                                v0 = 0;
                            else if (this.C != p0.C)
                                v0 = 0;
                            else if ((this.b & 131072) != (p0.b & 131072))
                                v0 = 0;
                            else if (this.D != p0.D)
                                v0 = 0;
                            else if ((this.b & 262144) != (p0.b & 262144))
                                v0 = 0;
                            else if (!this.E.equals(p0.E))
                                v0 = 0;
                            else if ((this.b & 524288) != (p0.b & 524288))
                                v0 = 0;
                            else if (this.F != p0.F)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.v.equals(p0.v))
                            v0 = 0;
                        else if ((this.b & 2048) != (p0.b & 2048))
                            v0 = 0;
                        else if (this.w != p0.w)
                            v0 = 0;
                        else if ((this.b & 4096) != (p0.b & 4096))
                            v0 = 0;
                        else if (this.x != p0.x)
                            v0 = 0;
                        else if ((this.b & 8192) != (p0.b & 8192))
                            v0 = 0;
                        else if (this.y != p0.y)
                            v0 = 0;
                        else if ((this.b & 16384) != (p0.b & 16384))
                            v0 = 0;
                        else if (this.z != p0.z)
                            v0 = 0;
                        else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                            v0 = 0;
                        else if ((this.b & 32768) != (p0.b & 32768))
                            v0 = 0;
                        else if (!this.B.equals(p0.B))
                            v0 = 0;
                        else if ((this.b & 65536) != (p0.b & 65536))
                            v0 = 0;
                        else if (this.C != p0.C)
                            v0 = 0;
                        else if ((this.b & 131072) != (p0.b & 131072))
                            v0 = 0;
                        else if (this.D != p0.D)
                            v0 = 0;
                        else if ((this.b & 262144) != (p0.b & 262144))
                            v0 = 0;
                        else if (!this.E.equals(p0.E))
                            v0 = 0;
                        else if ((this.b & 524288) != (p0.b & 524288))
                            v0 = 0;
                        else if (this.F != p0.F)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.t.equals(p0.t))
                        v0 = 0;
                    else if (this.u == 0) {
                        if (p0.u != 0)
                            v0 = 0;
                        else if (this.v == 0) {
                            if (p0.v != 0)
                                v0 = 0;
                            else if ((this.b & 2048) != (p0.b & 2048))
                                v0 = 0;
                            else if (this.w != p0.w)
                                v0 = 0;
                            else if ((this.b & 4096) != (p0.b & 4096))
                                v0 = 0;
                            else if (this.x != p0.x)
                                v0 = 0;
                            else if ((this.b & 8192) != (p0.b & 8192))
                                v0 = 0;
                            else if (this.y != p0.y)
                                v0 = 0;
                            else if ((this.b & 16384) != (p0.b & 16384))
                                v0 = 0;
                            else if (this.z != p0.z)
                                v0 = 0;
                            else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                v0 = 0;
                            else if ((this.b & 32768) != (p0.b & 32768))
                                v0 = 0;
                            else if (!this.B.equals(p0.B))
                                v0 = 0;
                            else if ((this.b & 65536) != (p0.b & 65536))
                                v0 = 0;
                            else if (this.C != p0.C)
                                v0 = 0;
                            else if ((this.b & 131072) != (p0.b & 131072))
                                v0 = 0;
                            else if (this.D != p0.D)
                                v0 = 0;
                            else if ((this.b & 262144) != (p0.b & 262144))
                                v0 = 0;
                            else if (!this.E.equals(p0.E))
                                v0 = 0;
                            else if ((this.b & 524288) != (p0.b & 524288))
                                v0 = 0;
                            else if (this.F != p0.F)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.v.equals(p0.v))
                            v0 = 0;
                        else if ((this.b & 2048) != (p0.b & 2048))
                            v0 = 0;
                        else if (this.w != p0.w)
                            v0 = 0;
                        else if ((this.b & 4096) != (p0.b & 4096))
                            v0 = 0;
                        else if (this.x != p0.x)
                            v0 = 0;
                        else if ((this.b & 8192) != (p0.b & 8192))
                            v0 = 0;
                        else if (this.y != p0.y)
                            v0 = 0;
                        else if ((this.b & 16384) != (p0.b & 16384))
                            v0 = 0;
                        else if (this.z != p0.z)
                            v0 = 0;
                        else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                            v0 = 0;
                        else if ((this.b & 32768) != (p0.b & 32768))
                            v0 = 0;
                        else if (!this.B.equals(p0.B))
                            v0 = 0;
                        else if ((this.b & 65536) != (p0.b & 65536))
                            v0 = 0;
                        else if (this.C != p0.C)
                            v0 = 0;
                        else if ((this.b & 131072) != (p0.b & 131072))
                            v0 = 0;
                        else if (this.D != p0.D)
                            v0 = 0;
                        else if ((this.b & 262144) != (p0.b & 262144))
                            v0 = 0;
                        else if (!this.E.equals(p0.E))
                            v0 = 0;
                        else if ((this.b & 524288) != (p0.b & 524288))
                            v0 = 0;
                        else if (this.F != p0.F)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.u.equals(p0.u))
                        v0 = 0;
                    else if (this.v == 0) {
                        if (p0.v != 0)
                            v0 = 0;
                        else if ((this.b & 2048) != (p0.b & 2048))
                            v0 = 0;
                        else if (this.w != p0.w)
                            v0 = 0;
                        else if ((this.b & 4096) != (p0.b & 4096))
                            v0 = 0;
                        else if (this.x != p0.x)
                            v0 = 0;
                        else if ((this.b & 8192) != (p0.b & 8192))
                            v0 = 0;
                        else if (this.y != p0.y)
                            v0 = 0;
                        else if ((this.b & 16384) != (p0.b & 16384))
                            v0 = 0;
                        else if (this.z != p0.z)
                            v0 = 0;
                        else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                            v0 = 0;
                        else if ((this.b & 32768) != (p0.b & 32768))
                            v0 = 0;
                        else if (!this.B.equals(p0.B))
                            v0 = 0;
                        else if ((this.b & 65536) != (p0.b & 65536))
                            v0 = 0;
                        else if (this.C != p0.C)
                            v0 = 0;
                        else if ((this.b & 131072) != (p0.b & 131072))
                            v0 = 0;
                        else if (this.D != p0.D)
                            v0 = 0;
                        else if ((this.b & 262144) != (p0.b & 262144))
                            v0 = 0;
                        else if (!this.E.equals(p0.E))
                            v0 = 0;
                        else if ((this.b & 524288) != (p0.b & 524288))
                            v0 = 0;
                        else if (this.F != p0.F)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.v.equals(p0.v))
                        v0 = 0;
                    else if ((this.b & 2048) != (p0.b & 2048))
                        v0 = 0;
                    else if (this.w != p0.w)
                        v0 = 0;
                    else if ((this.b & 4096) != (p0.b & 4096))
                        v0 = 0;
                    else if (this.x != p0.x)
                        v0 = 0;
                    else if ((this.b & 8192) != (p0.b & 8192))
                        v0 = 0;
                    else if (this.y != p0.y)
                        v0 = 0;
                    else if ((this.b & 16384) != (p0.b & 16384))
                        v0 = 0;
                    else if (this.z != p0.z)
                        v0 = 0;
                    else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                        v0 = 0;
                    else if ((this.b & 32768) != (p0.b & 32768))
                        v0 = 0;
                    else if (!this.B.equals(p0.B))
                        v0 = 0;
                    else if ((this.b & 65536) != (p0.b & 65536))
                        v0 = 0;
                    else if (this.C != p0.C)
                        v0 = 0;
                    else if ((this.b & 131072) != (p0.b & 131072))
                        v0 = 0;
                    else if (this.D != p0.D)
                        v0 = 0;
                    else if ((this.b & 262144) != (p0.b & 262144))
                        v0 = 0;
                    else if (!this.E.equals(p0.E))
                        v0 = 0;
                    else if ((this.b & 524288) != (p0.b & 524288))
                        v0 = 0;
                    else if (this.F != p0.F)
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
                else if ((this.b & 2) != (p0.b & 2))
                    v0 = 0;
                else if (!this.g.equals(p0.g))
                    v0 = 0;
                else if ((this.b & 4) != (p0.b & 4))
                    v0 = 0;
                else if (!this.h.equals(p0.h))
                    v0 = 0;
                else if ((this.b & 8) != (p0.b & 8))
                    v0 = 0;
                else if (!this.i.equals(p0.i))
                    v0 = 0;
                else if ((this.b & 16) != (p0.b & 16))
                    v0 = 0;
                else if (!this.j.equals(p0.j))
                    v0 = 0;
                else if ((this.b & 32) != (p0.b & 32))
                    v0 = 0;
                else if (this.k != p0.k)
                    v0 = 0;
                else if ((this.b & 64) != (p0.b & 64))
                    v0 = 0;
                else if (!this.l.equals(p0.l))
                    v0 = 0;
                else if (!com.google.protobuf.nano.h.a(this.m, p0.m))
                    v0 = 0;
                else if ((this.b & 128) != (p0.b & 128))
                    v0 = 0;
                else if (this.n != p0.n)
                    v0 = 0;
                else if ((this.b & 256) != (p0.b & 256))
                    v0 = 0;
                else if (this.o != p0.o)
                    v0 = 0;
                else if ((this.b & 512) != (p0.b & 512))
                    v0 = 0;
                else if (this.p != p0.p)
                    v0 = 0;
                else if ((this.b & 1024) != (p0.b & 1024))
                    v0 = 0;
                else if (this.q != p0.q)
                    v0 = 0;
                else if (this.r == 0) {
                    if (p0.r != 0)
                        v0 = 0;
                    else if (this.s == 0) {
                        if (p0.s != 0)
                            v0 = 0;
                        else if (this.t == 0) {
                            if (p0.t != 0)
                                v0 = 0;
                            else if (this.u == 0) {
                                if (p0.u != 0)
                                    v0 = 0;
                                else if (this.v == 0) {
                                    if (p0.v != 0)
                                        v0 = 0;
                                    else if ((this.b & 2048) != (p0.b & 2048))
                                        v0 = 0;
                                    else if (this.w != p0.w)
                                        v0 = 0;
                                    else if ((this.b & 4096) != (p0.b & 4096))
                                        v0 = 0;
                                    else if (this.x != p0.x)
                                        v0 = 0;
                                    else if ((this.b & 8192) != (p0.b & 8192))
                                        v0 = 0;
                                    else if (this.y != p0.y)
                                        v0 = 0;
                                    else if ((this.b & 16384) != (p0.b & 16384))
                                        v0 = 0;
                                    else if (this.z != p0.z)
                                        v0 = 0;
                                    else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                        v0 = 0;
                                    else if ((this.b & 32768) != (p0.b & 32768))
                                        v0 = 0;
                                    else if (!this.B.equals(p0.B))
                                        v0 = 0;
                                    else if ((this.b & 65536) != (p0.b & 65536))
                                        v0 = 0;
                                    else if (this.C != p0.C)
                                        v0 = 0;
                                    else if ((this.b & 131072) != (p0.b & 131072))
                                        v0 = 0;
                                    else if (this.D != p0.D)
                                        v0 = 0;
                                    else if ((this.b & 262144) != (p0.b & 262144))
                                        v0 = 0;
                                    else if (!this.E.equals(p0.E))
                                        v0 = 0;
                                    else if ((this.b & 524288) != (p0.b & 524288))
                                        v0 = 0;
                                    else if (this.F != p0.F)
                                        v0 = 0;
                                    else if (this.aO == 0 || this.aO.b()) {
                                        if (p0.aO != 0 && !p0.aO.b())
                                            v0 = 0;
                                    }
                                    else
                                        v0 = this.aO.equals(p0.aO);
                                }
                                else if (!this.v.equals(p0.v))
                                    v0 = 0;
                                else if ((this.b & 2048) != (p0.b & 2048))
                                    v0 = 0;
                                else if (this.w != p0.w)
                                    v0 = 0;
                                else if ((this.b & 4096) != (p0.b & 4096))
                                    v0 = 0;
                                else if (this.x != p0.x)
                                    v0 = 0;
                                else if ((this.b & 8192) != (p0.b & 8192))
                                    v0 = 0;
                                else if (this.y != p0.y)
                                    v0 = 0;
                                else if ((this.b & 16384) != (p0.b & 16384))
                                    v0 = 0;
                                else if (this.z != p0.z)
                                    v0 = 0;
                                else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                    v0 = 0;
                                else if ((this.b & 32768) != (p0.b & 32768))
                                    v0 = 0;
                                else if (!this.B.equals(p0.B))
                                    v0 = 0;
                                else if ((this.b & 65536) != (p0.b & 65536))
                                    v0 = 0;
                                else if (this.C != p0.C)
                                    v0 = 0;
                                else if ((this.b & 131072) != (p0.b & 131072))
                                    v0 = 0;
                                else if (this.D != p0.D)
                                    v0 = 0;
                                else if ((this.b & 262144) != (p0.b & 262144))
                                    v0 = 0;
                                else if (!this.E.equals(p0.E))
                                    v0 = 0;
                                else if ((this.b & 524288) != (p0.b & 524288))
                                    v0 = 0;
                                else if (this.F != p0.F)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.u.equals(p0.u))
                                v0 = 0;
                            else if (this.v == 0) {
                                if (p0.v != 0)
                                    v0 = 0;
                                else if ((this.b & 2048) != (p0.b & 2048))
                                    v0 = 0;
                                else if (this.w != p0.w)
                                    v0 = 0;
                                else if ((this.b & 4096) != (p0.b & 4096))
                                    v0 = 0;
                                else if (this.x != p0.x)
                                    v0 = 0;
                                else if ((this.b & 8192) != (p0.b & 8192))
                                    v0 = 0;
                                else if (this.y != p0.y)
                                    v0 = 0;
                                else if ((this.b & 16384) != (p0.b & 16384))
                                    v0 = 0;
                                else if (this.z != p0.z)
                                    v0 = 0;
                                else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                    v0 = 0;
                                else if ((this.b & 32768) != (p0.b & 32768))
                                    v0 = 0;
                                else if (!this.B.equals(p0.B))
                                    v0 = 0;
                                else if ((this.b & 65536) != (p0.b & 65536))
                                    v0 = 0;
                                else if (this.C != p0.C)
                                    v0 = 0;
                                else if ((this.b & 131072) != (p0.b & 131072))
                                    v0 = 0;
                                else if (this.D != p0.D)
                                    v0 = 0;
                                else if ((this.b & 262144) != (p0.b & 262144))
                                    v0 = 0;
                                else if (!this.E.equals(p0.E))
                                    v0 = 0;
                                else if ((this.b & 524288) != (p0.b & 524288))
                                    v0 = 0;
                                else if (this.F != p0.F)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.v.equals(p0.v))
                                v0 = 0;
                            else if ((this.b & 2048) != (p0.b & 2048))
                                v0 = 0;
                            else if (this.w != p0.w)
                                v0 = 0;
                            else if ((this.b & 4096) != (p0.b & 4096))
                                v0 = 0;
                            else if (this.x != p0.x)
                                v0 = 0;
                            else if ((this.b & 8192) != (p0.b & 8192))
                                v0 = 0;
                            else if (this.y != p0.y)
                                v0 = 0;
                            else if ((this.b & 16384) != (p0.b & 16384))
                                v0 = 0;
                            else if (this.z != p0.z)
                                v0 = 0;
                            else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                v0 = 0;
                            else if ((this.b & 32768) != (p0.b & 32768))
                                v0 = 0;
                            else if (!this.B.equals(p0.B))
                                v0 = 0;
                            else if ((this.b & 65536) != (p0.b & 65536))
                                v0 = 0;
                            else if (this.C != p0.C)
                                v0 = 0;
                            else if ((this.b & 131072) != (p0.b & 131072))
                                v0 = 0;
                            else if (this.D != p0.D)
                                v0 = 0;
                            else if ((this.b & 262144) != (p0.b & 262144))
                                v0 = 0;
                            else if (!this.E.equals(p0.E))
                                v0 = 0;
                            else if ((this.b & 524288) != (p0.b & 524288))
                                v0 = 0;
                            else if (this.F != p0.F)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.t.equals(p0.t))
                            v0 = 0;
                        else if (this.u == 0) {
                            if (p0.u != 0)
                                v0 = 0;
                            else if (this.v == 0) {
                                if (p0.v != 0)
                                    v0 = 0;
                                else if ((this.b & 2048) != (p0.b & 2048))
                                    v0 = 0;
                                else if (this.w != p0.w)
                                    v0 = 0;
                                else if ((this.b & 4096) != (p0.b & 4096))
                                    v0 = 0;
                                else if (this.x != p0.x)
                                    v0 = 0;
                                else if ((this.b & 8192) != (p0.b & 8192))
                                    v0 = 0;
                                else if (this.y != p0.y)
                                    v0 = 0;
                                else if ((this.b & 16384) != (p0.b & 16384))
                                    v0 = 0;
                                else if (this.z != p0.z)
                                    v0 = 0;
                                else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                    v0 = 0;
                                else if ((this.b & 32768) != (p0.b & 32768))
                                    v0 = 0;
                                else if (!this.B.equals(p0.B))
                                    v0 = 0;
                                else if ((this.b & 65536) != (p0.b & 65536))
                                    v0 = 0;
                                else if (this.C != p0.C)
                                    v0 = 0;
                                else if ((this.b & 131072) != (p0.b & 131072))
                                    v0 = 0;
                                else if (this.D != p0.D)
                                    v0 = 0;
                                else if ((this.b & 262144) != (p0.b & 262144))
                                    v0 = 0;
                                else if (!this.E.equals(p0.E))
                                    v0 = 0;
                                else if ((this.b & 524288) != (p0.b & 524288))
                                    v0 = 0;
                                else if (this.F != p0.F)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.v.equals(p0.v))
                                v0 = 0;
                            else if ((this.b & 2048) != (p0.b & 2048))
                                v0 = 0;
                            else if (this.w != p0.w)
                                v0 = 0;
                            else if ((this.b & 4096) != (p0.b & 4096))
                                v0 = 0;
                            else if (this.x != p0.x)
                                v0 = 0;
                            else if ((this.b & 8192) != (p0.b & 8192))
                                v0 = 0;
                            else if (this.y != p0.y)
                                v0 = 0;
                            else if ((this.b & 16384) != (p0.b & 16384))
                                v0 = 0;
                            else if (this.z != p0.z)
                                v0 = 0;
                            else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                v0 = 0;
                            else if ((this.b & 32768) != (p0.b & 32768))
                                v0 = 0;
                            else if (!this.B.equals(p0.B))
                                v0 = 0;
                            else if ((this.b & 65536) != (p0.b & 65536))
                                v0 = 0;
                            else if (this.C != p0.C)
                                v0 = 0;
                            else if ((this.b & 131072) != (p0.b & 131072))
                                v0 = 0;
                            else if (this.D != p0.D)
                                v0 = 0;
                            else if ((this.b & 262144) != (p0.b & 262144))
                                v0 = 0;
                            else if (!this.E.equals(p0.E))
                                v0 = 0;
                            else if ((this.b & 524288) != (p0.b & 524288))
                                v0 = 0;
                            else if (this.F != p0.F)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.u.equals(p0.u))
                            v0 = 0;
                        else if (this.v == 0) {
                            if (p0.v != 0)
                                v0 = 0;
                            else if ((this.b & 2048) != (p0.b & 2048))
                                v0 = 0;
                            else if (this.w != p0.w)
                                v0 = 0;
                            else if ((this.b & 4096) != (p0.b & 4096))
                                v0 = 0;
                            else if (this.x != p0.x)
                                v0 = 0;
                            else if ((this.b & 8192) != (p0.b & 8192))
                                v0 = 0;
                            else if (this.y != p0.y)
                                v0 = 0;
                            else if ((this.b & 16384) != (p0.b & 16384))
                                v0 = 0;
                            else if (this.z != p0.z)
                                v0 = 0;
                            else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                v0 = 0;
                            else if ((this.b & 32768) != (p0.b & 32768))
                                v0 = 0;
                            else if (!this.B.equals(p0.B))
                                v0 = 0;
                            else if ((this.b & 65536) != (p0.b & 65536))
                                v0 = 0;
                            else if (this.C != p0.C)
                                v0 = 0;
                            else if ((this.b & 131072) != (p0.b & 131072))
                                v0 = 0;
                            else if (this.D != p0.D)
                                v0 = 0;
                            else if ((this.b & 262144) != (p0.b & 262144))
                                v0 = 0;
                            else if (!this.E.equals(p0.E))
                                v0 = 0;
                            else if ((this.b & 524288) != (p0.b & 524288))
                                v0 = 0;
                            else if (this.F != p0.F)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.v.equals(p0.v))
                            v0 = 0;
                        else if ((this.b & 2048) != (p0.b & 2048))
                            v0 = 0;
                        else if (this.w != p0.w)
                            v0 = 0;
                        else if ((this.b & 4096) != (p0.b & 4096))
                            v0 = 0;
                        else if (this.x != p0.x)
                            v0 = 0;
                        else if ((this.b & 8192) != (p0.b & 8192))
                            v0 = 0;
                        else if (this.y != p0.y)
                            v0 = 0;
                        else if ((this.b & 16384) != (p0.b & 16384))
                            v0 = 0;
                        else if (this.z != p0.z)
                            v0 = 0;
                        else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                            v0 = 0;
                        else if ((this.b & 32768) != (p0.b & 32768))
                            v0 = 0;
                        else if (!this.B.equals(p0.B))
                            v0 = 0;
                        else if ((this.b & 65536) != (p0.b & 65536))
                            v0 = 0;
                        else if (this.C != p0.C)
                            v0 = 0;
                        else if ((this.b & 131072) != (p0.b & 131072))
                            v0 = 0;
                        else if (this.D != p0.D)
                            v0 = 0;
                        else if ((this.b & 262144) != (p0.b & 262144))
                            v0 = 0;
                        else if (!this.E.equals(p0.E))
                            v0 = 0;
                        else if ((this.b & 524288) != (p0.b & 524288))
                            v0 = 0;
                        else if (this.F != p0.F)
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
                    else if (this.t == 0) {
                        if (p0.t != 0)
                            v0 = 0;
                        else if (this.u == 0) {
                            if (p0.u != 0)
                                v0 = 0;
                            else if (this.v == 0) {
                                if (p0.v != 0)
                                    v0 = 0;
                                else if ((this.b & 2048) != (p0.b & 2048))
                                    v0 = 0;
                                else if (this.w != p0.w)
                                    v0 = 0;
                                else if ((this.b & 4096) != (p0.b & 4096))
                                    v0 = 0;
                                else if (this.x != p0.x)
                                    v0 = 0;
                                else if ((this.b & 8192) != (p0.b & 8192))
                                    v0 = 0;
                                else if (this.y != p0.y)
                                    v0 = 0;
                                else if ((this.b & 16384) != (p0.b & 16384))
                                    v0 = 0;
                                else if (this.z != p0.z)
                                    v0 = 0;
                                else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                    v0 = 0;
                                else if ((this.b & 32768) != (p0.b & 32768))
                                    v0 = 0;
                                else if (!this.B.equals(p0.B))
                                    v0 = 0;
                                else if ((this.b & 65536) != (p0.b & 65536))
                                    v0 = 0;
                                else if (this.C != p0.C)
                                    v0 = 0;
                                else if ((this.b & 131072) != (p0.b & 131072))
                                    v0 = 0;
                                else if (this.D != p0.D)
                                    v0 = 0;
                                else if ((this.b & 262144) != (p0.b & 262144))
                                    v0 = 0;
                                else if (!this.E.equals(p0.E))
                                    v0 = 0;
                                else if ((this.b & 524288) != (p0.b & 524288))
                                    v0 = 0;
                                else if (this.F != p0.F)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.v.equals(p0.v))
                                v0 = 0;
                            else if ((this.b & 2048) != (p0.b & 2048))
                                v0 = 0;
                            else if (this.w != p0.w)
                                v0 = 0;
                            else if ((this.b & 4096) != (p0.b & 4096))
                                v0 = 0;
                            else if (this.x != p0.x)
                                v0 = 0;
                            else if ((this.b & 8192) != (p0.b & 8192))
                                v0 = 0;
                            else if (this.y != p0.y)
                                v0 = 0;
                            else if ((this.b & 16384) != (p0.b & 16384))
                                v0 = 0;
                            else if (this.z != p0.z)
                                v0 = 0;
                            else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                v0 = 0;
                            else if ((this.b & 32768) != (p0.b & 32768))
                                v0 = 0;
                            else if (!this.B.equals(p0.B))
                                v0 = 0;
                            else if ((this.b & 65536) != (p0.b & 65536))
                                v0 = 0;
                            else if (this.C != p0.C)
                                v0 = 0;
                            else if ((this.b & 131072) != (p0.b & 131072))
                                v0 = 0;
                            else if (this.D != p0.D)
                                v0 = 0;
                            else if ((this.b & 262144) != (p0.b & 262144))
                                v0 = 0;
                            else if (!this.E.equals(p0.E))
                                v0 = 0;
                            else if ((this.b & 524288) != (p0.b & 524288))
                                v0 = 0;
                            else if (this.F != p0.F)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.u.equals(p0.u))
                            v0 = 0;
                        else if (this.v == 0) {
                            if (p0.v != 0)
                                v0 = 0;
                            else if ((this.b & 2048) != (p0.b & 2048))
                                v0 = 0;
                            else if (this.w != p0.w)
                                v0 = 0;
                            else if ((this.b & 4096) != (p0.b & 4096))
                                v0 = 0;
                            else if (this.x != p0.x)
                                v0 = 0;
                            else if ((this.b & 8192) != (p0.b & 8192))
                                v0 = 0;
                            else if (this.y != p0.y)
                                v0 = 0;
                            else if ((this.b & 16384) != (p0.b & 16384))
                                v0 = 0;
                            else if (this.z != p0.z)
                                v0 = 0;
                            else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                v0 = 0;
                            else if ((this.b & 32768) != (p0.b & 32768))
                                v0 = 0;
                            else if (!this.B.equals(p0.B))
                                v0 = 0;
                            else if ((this.b & 65536) != (p0.b & 65536))
                                v0 = 0;
                            else if (this.C != p0.C)
                                v0 = 0;
                            else if ((this.b & 131072) != (p0.b & 131072))
                                v0 = 0;
                            else if (this.D != p0.D)
                                v0 = 0;
                            else if ((this.b & 262144) != (p0.b & 262144))
                                v0 = 0;
                            else if (!this.E.equals(p0.E))
                                v0 = 0;
                            else if ((this.b & 524288) != (p0.b & 524288))
                                v0 = 0;
                            else if (this.F != p0.F)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.v.equals(p0.v))
                            v0 = 0;
                        else if ((this.b & 2048) != (p0.b & 2048))
                            v0 = 0;
                        else if (this.w != p0.w)
                            v0 = 0;
                        else if ((this.b & 4096) != (p0.b & 4096))
                            v0 = 0;
                        else if (this.x != p0.x)
                            v0 = 0;
                        else if ((this.b & 8192) != (p0.b & 8192))
                            v0 = 0;
                        else if (this.y != p0.y)
                            v0 = 0;
                        else if ((this.b & 16384) != (p0.b & 16384))
                            v0 = 0;
                        else if (this.z != p0.z)
                            v0 = 0;
                        else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                            v0 = 0;
                        else if ((this.b & 32768) != (p0.b & 32768))
                            v0 = 0;
                        else if (!this.B.equals(p0.B))
                            v0 = 0;
                        else if ((this.b & 65536) != (p0.b & 65536))
                            v0 = 0;
                        else if (this.C != p0.C)
                            v0 = 0;
                        else if ((this.b & 131072) != (p0.b & 131072))
                            v0 = 0;
                        else if (this.D != p0.D)
                            v0 = 0;
                        else if ((this.b & 262144) != (p0.b & 262144))
                            v0 = 0;
                        else if (!this.E.equals(p0.E))
                            v0 = 0;
                        else if ((this.b & 524288) != (p0.b & 524288))
                            v0 = 0;
                        else if (this.F != p0.F)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.t.equals(p0.t))
                        v0 = 0;
                    else if (this.u == 0) {
                        if (p0.u != 0)
                            v0 = 0;
                        else if (this.v == 0) {
                            if (p0.v != 0)
                                v0 = 0;
                            else if ((this.b & 2048) != (p0.b & 2048))
                                v0 = 0;
                            else if (this.w != p0.w)
                                v0 = 0;
                            else if ((this.b & 4096) != (p0.b & 4096))
                                v0 = 0;
                            else if (this.x != p0.x)
                                v0 = 0;
                            else if ((this.b & 8192) != (p0.b & 8192))
                                v0 = 0;
                            else if (this.y != p0.y)
                                v0 = 0;
                            else if ((this.b & 16384) != (p0.b & 16384))
                                v0 = 0;
                            else if (this.z != p0.z)
                                v0 = 0;
                            else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                v0 = 0;
                            else if ((this.b & 32768) != (p0.b & 32768))
                                v0 = 0;
                            else if (!this.B.equals(p0.B))
                                v0 = 0;
                            else if ((this.b & 65536) != (p0.b & 65536))
                                v0 = 0;
                            else if (this.C != p0.C)
                                v0 = 0;
                            else if ((this.b & 131072) != (p0.b & 131072))
                                v0 = 0;
                            else if (this.D != p0.D)
                                v0 = 0;
                            else if ((this.b & 262144) != (p0.b & 262144))
                                v0 = 0;
                            else if (!this.E.equals(p0.E))
                                v0 = 0;
                            else if ((this.b & 524288) != (p0.b & 524288))
                                v0 = 0;
                            else if (this.F != p0.F)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.v.equals(p0.v))
                            v0 = 0;
                        else if ((this.b & 2048) != (p0.b & 2048))
                            v0 = 0;
                        else if (this.w != p0.w)
                            v0 = 0;
                        else if ((this.b & 4096) != (p0.b & 4096))
                            v0 = 0;
                        else if (this.x != p0.x)
                            v0 = 0;
                        else if ((this.b & 8192) != (p0.b & 8192))
                            v0 = 0;
                        else if (this.y != p0.y)
                            v0 = 0;
                        else if ((this.b & 16384) != (p0.b & 16384))
                            v0 = 0;
                        else if (this.z != p0.z)
                            v0 = 0;
                        else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                            v0 = 0;
                        else if ((this.b & 32768) != (p0.b & 32768))
                            v0 = 0;
                        else if (!this.B.equals(p0.B))
                            v0 = 0;
                        else if ((this.b & 65536) != (p0.b & 65536))
                            v0 = 0;
                        else if (this.C != p0.C)
                            v0 = 0;
                        else if ((this.b & 131072) != (p0.b & 131072))
                            v0 = 0;
                        else if (this.D != p0.D)
                            v0 = 0;
                        else if ((this.b & 262144) != (p0.b & 262144))
                            v0 = 0;
                        else if (!this.E.equals(p0.E))
                            v0 = 0;
                        else if ((this.b & 524288) != (p0.b & 524288))
                            v0 = 0;
                        else if (this.F != p0.F)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.u.equals(p0.u))
                        v0 = 0;
                    else if (this.v == 0) {
                        if (p0.v != 0)
                            v0 = 0;
                        else if ((this.b & 2048) != (p0.b & 2048))
                            v0 = 0;
                        else if (this.w != p0.w)
                            v0 = 0;
                        else if ((this.b & 4096) != (p0.b & 4096))
                            v0 = 0;
                        else if (this.x != p0.x)
                            v0 = 0;
                        else if ((this.b & 8192) != (p0.b & 8192))
                            v0 = 0;
                        else if (this.y != p0.y)
                            v0 = 0;
                        else if ((this.b & 16384) != (p0.b & 16384))
                            v0 = 0;
                        else if (this.z != p0.z)
                            v0 = 0;
                        else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                            v0 = 0;
                        else if ((this.b & 32768) != (p0.b & 32768))
                            v0 = 0;
                        else if (!this.B.equals(p0.B))
                            v0 = 0;
                        else if ((this.b & 65536) != (p0.b & 65536))
                            v0 = 0;
                        else if (this.C != p0.C)
                            v0 = 0;
                        else if ((this.b & 131072) != (p0.b & 131072))
                            v0 = 0;
                        else if (this.D != p0.D)
                            v0 = 0;
                        else if ((this.b & 262144) != (p0.b & 262144))
                            v0 = 0;
                        else if (!this.E.equals(p0.E))
                            v0 = 0;
                        else if ((this.b & 524288) != (p0.b & 524288))
                            v0 = 0;
                        else if (this.F != p0.F)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.v.equals(p0.v))
                        v0 = 0;
                    else if ((this.b & 2048) != (p0.b & 2048))
                        v0 = 0;
                    else if (this.w != p0.w)
                        v0 = 0;
                    else if ((this.b & 4096) != (p0.b & 4096))
                        v0 = 0;
                    else if (this.x != p0.x)
                        v0 = 0;
                    else if ((this.b & 8192) != (p0.b & 8192))
                        v0 = 0;
                    else if (this.y != p0.y)
                        v0 = 0;
                    else if ((this.b & 16384) != (p0.b & 16384))
                        v0 = 0;
                    else if (this.z != p0.z)
                        v0 = 0;
                    else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                        v0 = 0;
                    else if ((this.b & 32768) != (p0.b & 32768))
                        v0 = 0;
                    else if (!this.B.equals(p0.B))
                        v0 = 0;
                    else if ((this.b & 65536) != (p0.b & 65536))
                        v0 = 0;
                    else if (this.C != p0.C)
                        v0 = 0;
                    else if ((this.b & 131072) != (p0.b & 131072))
                        v0 = 0;
                    else if (this.D != p0.D)
                        v0 = 0;
                    else if ((this.b & 262144) != (p0.b & 262144))
                        v0 = 0;
                    else if (!this.E.equals(p0.E))
                        v0 = 0;
                    else if ((this.b & 524288) != (p0.b & 524288))
                        v0 = 0;
                    else if (this.F != p0.F)
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
                    else if (this.t == 0) {
                        if (p0.t != 0)
                            v0 = 0;
                        else if (this.u == 0) {
                            if (p0.u != 0)
                                v0 = 0;
                            else if (this.v == 0) {
                                if (p0.v != 0)
                                    v0 = 0;
                                else if ((this.b & 2048) != (p0.b & 2048))
                                    v0 = 0;
                                else if (this.w != p0.w)
                                    v0 = 0;
                                else if ((this.b & 4096) != (p0.b & 4096))
                                    v0 = 0;
                                else if (this.x != p0.x)
                                    v0 = 0;
                                else if ((this.b & 8192) != (p0.b & 8192))
                                    v0 = 0;
                                else if (this.y != p0.y)
                                    v0 = 0;
                                else if ((this.b & 16384) != (p0.b & 16384))
                                    v0 = 0;
                                else if (this.z != p0.z)
                                    v0 = 0;
                                else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                    v0 = 0;
                                else if ((this.b & 32768) != (p0.b & 32768))
                                    v0 = 0;
                                else if (!this.B.equals(p0.B))
                                    v0 = 0;
                                else if ((this.b & 65536) != (p0.b & 65536))
                                    v0 = 0;
                                else if (this.C != p0.C)
                                    v0 = 0;
                                else if ((this.b & 131072) != (p0.b & 131072))
                                    v0 = 0;
                                else if (this.D != p0.D)
                                    v0 = 0;
                                else if ((this.b & 262144) != (p0.b & 262144))
                                    v0 = 0;
                                else if (!this.E.equals(p0.E))
                                    v0 = 0;
                                else if ((this.b & 524288) != (p0.b & 524288))
                                    v0 = 0;
                                else if (this.F != p0.F)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.v.equals(p0.v))
                                v0 = 0;
                            else if ((this.b & 2048) != (p0.b & 2048))
                                v0 = 0;
                            else if (this.w != p0.w)
                                v0 = 0;
                            else if ((this.b & 4096) != (p0.b & 4096))
                                v0 = 0;
                            else if (this.x != p0.x)
                                v0 = 0;
                            else if ((this.b & 8192) != (p0.b & 8192))
                                v0 = 0;
                            else if (this.y != p0.y)
                                v0 = 0;
                            else if ((this.b & 16384) != (p0.b & 16384))
                                v0 = 0;
                            else if (this.z != p0.z)
                                v0 = 0;
                            else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                v0 = 0;
                            else if ((this.b & 32768) != (p0.b & 32768))
                                v0 = 0;
                            else if (!this.B.equals(p0.B))
                                v0 = 0;
                            else if ((this.b & 65536) != (p0.b & 65536))
                                v0 = 0;
                            else if (this.C != p0.C)
                                v0 = 0;
                            else if ((this.b & 131072) != (p0.b & 131072))
                                v0 = 0;
                            else if (this.D != p0.D)
                                v0 = 0;
                            else if ((this.b & 262144) != (p0.b & 262144))
                                v0 = 0;
                            else if (!this.E.equals(p0.E))
                                v0 = 0;
                            else if ((this.b & 524288) != (p0.b & 524288))
                                v0 = 0;
                            else if (this.F != p0.F)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.u.equals(p0.u))
                            v0 = 0;
                        else if (this.v == 0) {
                            if (p0.v != 0)
                                v0 = 0;
                            else if ((this.b & 2048) != (p0.b & 2048))
                                v0 = 0;
                            else if (this.w != p0.w)
                                v0 = 0;
                            else if ((this.b & 4096) != (p0.b & 4096))
                                v0 = 0;
                            else if (this.x != p0.x)
                                v0 = 0;
                            else if ((this.b & 8192) != (p0.b & 8192))
                                v0 = 0;
                            else if (this.y != p0.y)
                                v0 = 0;
                            else if ((this.b & 16384) != (p0.b & 16384))
                                v0 = 0;
                            else if (this.z != p0.z)
                                v0 = 0;
                            else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                v0 = 0;
                            else if ((this.b & 32768) != (p0.b & 32768))
                                v0 = 0;
                            else if (!this.B.equals(p0.B))
                                v0 = 0;
                            else if ((this.b & 65536) != (p0.b & 65536))
                                v0 = 0;
                            else if (this.C != p0.C)
                                v0 = 0;
                            else if ((this.b & 131072) != (p0.b & 131072))
                                v0 = 0;
                            else if (this.D != p0.D)
                                v0 = 0;
                            else if ((this.b & 262144) != (p0.b & 262144))
                                v0 = 0;
                            else if (!this.E.equals(p0.E))
                                v0 = 0;
                            else if ((this.b & 524288) != (p0.b & 524288))
                                v0 = 0;
                            else if (this.F != p0.F)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.v.equals(p0.v))
                            v0 = 0;
                        else if ((this.b & 2048) != (p0.b & 2048))
                            v0 = 0;
                        else if (this.w != p0.w)
                            v0 = 0;
                        else if ((this.b & 4096) != (p0.b & 4096))
                            v0 = 0;
                        else if (this.x != p0.x)
                            v0 = 0;
                        else if ((this.b & 8192) != (p0.b & 8192))
                            v0 = 0;
                        else if (this.y != p0.y)
                            v0 = 0;
                        else if ((this.b & 16384) != (p0.b & 16384))
                            v0 = 0;
                        else if (this.z != p0.z)
                            v0 = 0;
                        else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                            v0 = 0;
                        else if ((this.b & 32768) != (p0.b & 32768))
                            v0 = 0;
                        else if (!this.B.equals(p0.B))
                            v0 = 0;
                        else if ((this.b & 65536) != (p0.b & 65536))
                            v0 = 0;
                        else if (this.C != p0.C)
                            v0 = 0;
                        else if ((this.b & 131072) != (p0.b & 131072))
                            v0 = 0;
                        else if (this.D != p0.D)
                            v0 = 0;
                        else if ((this.b & 262144) != (p0.b & 262144))
                            v0 = 0;
                        else if (!this.E.equals(p0.E))
                            v0 = 0;
                        else if ((this.b & 524288) != (p0.b & 524288))
                            v0 = 0;
                        else if (this.F != p0.F)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.t.equals(p0.t))
                        v0 = 0;
                    else if (this.u == 0) {
                        if (p0.u != 0)
                            v0 = 0;
                        else if (this.v == 0) {
                            if (p0.v != 0)
                                v0 = 0;
                            else if ((this.b & 2048) != (p0.b & 2048))
                                v0 = 0;
                            else if (this.w != p0.w)
                                v0 = 0;
                            else if ((this.b & 4096) != (p0.b & 4096))
                                v0 = 0;
                            else if (this.x != p0.x)
                                v0 = 0;
                            else if ((this.b & 8192) != (p0.b & 8192))
                                v0 = 0;
                            else if (this.y != p0.y)
                                v0 = 0;
                            else if ((this.b & 16384) != (p0.b & 16384))
                                v0 = 0;
                            else if (this.z != p0.z)
                                v0 = 0;
                            else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                v0 = 0;
                            else if ((this.b & 32768) != (p0.b & 32768))
                                v0 = 0;
                            else if (!this.B.equals(p0.B))
                                v0 = 0;
                            else if ((this.b & 65536) != (p0.b & 65536))
                                v0 = 0;
                            else if (this.C != p0.C)
                                v0 = 0;
                            else if ((this.b & 131072) != (p0.b & 131072))
                                v0 = 0;
                            else if (this.D != p0.D)
                                v0 = 0;
                            else if ((this.b & 262144) != (p0.b & 262144))
                                v0 = 0;
                            else if (!this.E.equals(p0.E))
                                v0 = 0;
                            else if ((this.b & 524288) != (p0.b & 524288))
                                v0 = 0;
                            else if (this.F != p0.F)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.v.equals(p0.v))
                            v0 = 0;
                        else if ((this.b & 2048) != (p0.b & 2048))
                            v0 = 0;
                        else if (this.w != p0.w)
                            v0 = 0;
                        else if ((this.b & 4096) != (p0.b & 4096))
                            v0 = 0;
                        else if (this.x != p0.x)
                            v0 = 0;
                        else if ((this.b & 8192) != (p0.b & 8192))
                            v0 = 0;
                        else if (this.y != p0.y)
                            v0 = 0;
                        else if ((this.b & 16384) != (p0.b & 16384))
                            v0 = 0;
                        else if (this.z != p0.z)
                            v0 = 0;
                        else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                            v0 = 0;
                        else if ((this.b & 32768) != (p0.b & 32768))
                            v0 = 0;
                        else if (!this.B.equals(p0.B))
                            v0 = 0;
                        else if ((this.b & 65536) != (p0.b & 65536))
                            v0 = 0;
                        else if (this.C != p0.C)
                            v0 = 0;
                        else if ((this.b & 131072) != (p0.b & 131072))
                            v0 = 0;
                        else if (this.D != p0.D)
                            v0 = 0;
                        else if ((this.b & 262144) != (p0.b & 262144))
                            v0 = 0;
                        else if (!this.E.equals(p0.E))
                            v0 = 0;
                        else if ((this.b & 524288) != (p0.b & 524288))
                            v0 = 0;
                        else if (this.F != p0.F)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.u.equals(p0.u))
                        v0 = 0;
                    else if (this.v == 0) {
                        if (p0.v != 0)
                            v0 = 0;
                        else if ((this.b & 2048) != (p0.b & 2048))
                            v0 = 0;
                        else if (this.w != p0.w)
                            v0 = 0;
                        else if ((this.b & 4096) != (p0.b & 4096))
                            v0 = 0;
                        else if (this.x != p0.x)
                            v0 = 0;
                        else if ((this.b & 8192) != (p0.b & 8192))
                            v0 = 0;
                        else if (this.y != p0.y)
                            v0 = 0;
                        else if ((this.b & 16384) != (p0.b & 16384))
                            v0 = 0;
                        else if (this.z != p0.z)
                            v0 = 0;
                        else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                            v0 = 0;
                        else if ((this.b & 32768) != (p0.b & 32768))
                            v0 = 0;
                        else if (!this.B.equals(p0.B))
                            v0 = 0;
                        else if ((this.b & 65536) != (p0.b & 65536))
                            v0 = 0;
                        else if (this.C != p0.C)
                            v0 = 0;
                        else if ((this.b & 131072) != (p0.b & 131072))
                            v0 = 0;
                        else if (this.D != p0.D)
                            v0 = 0;
                        else if ((this.b & 262144) != (p0.b & 262144))
                            v0 = 0;
                        else if (!this.E.equals(p0.E))
                            v0 = 0;
                        else if ((this.b & 524288) != (p0.b & 524288))
                            v0 = 0;
                        else if (this.F != p0.F)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.v.equals(p0.v))
                        v0 = 0;
                    else if ((this.b & 2048) != (p0.b & 2048))
                        v0 = 0;
                    else if (this.w != p0.w)
                        v0 = 0;
                    else if ((this.b & 4096) != (p0.b & 4096))
                        v0 = 0;
                    else if (this.x != p0.x)
                        v0 = 0;
                    else if ((this.b & 8192) != (p0.b & 8192))
                        v0 = 0;
                    else if (this.y != p0.y)
                        v0 = 0;
                    else if ((this.b & 16384) != (p0.b & 16384))
                        v0 = 0;
                    else if (this.z != p0.z)
                        v0 = 0;
                    else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                        v0 = 0;
                    else if ((this.b & 32768) != (p0.b & 32768))
                        v0 = 0;
                    else if (!this.B.equals(p0.B))
                        v0 = 0;
                    else if ((this.b & 65536) != (p0.b & 65536))
                        v0 = 0;
                    else if (this.C != p0.C)
                        v0 = 0;
                    else if ((this.b & 131072) != (p0.b & 131072))
                        v0 = 0;
                    else if (this.D != p0.D)
                        v0 = 0;
                    else if ((this.b & 262144) != (p0.b & 262144))
                        v0 = 0;
                    else if (!this.E.equals(p0.E))
                        v0 = 0;
                    else if ((this.b & 524288) != (p0.b & 524288))
                        v0 = 0;
                    else if (this.F != p0.F)
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
                else if (this.t == 0) {
                    if (p0.t != 0)
                        v0 = 0;
                    else if (this.u == 0) {
                        if (p0.u != 0)
                            v0 = 0;
                        else if (this.v == 0) {
                            if (p0.v != 0)
                                v0 = 0;
                            else if ((this.b & 2048) != (p0.b & 2048))
                                v0 = 0;
                            else if (this.w != p0.w)
                                v0 = 0;
                            else if ((this.b & 4096) != (p0.b & 4096))
                                v0 = 0;
                            else if (this.x != p0.x)
                                v0 = 0;
                            else if ((this.b & 8192) != (p0.b & 8192))
                                v0 = 0;
                            else if (this.y != p0.y)
                                v0 = 0;
                            else if ((this.b & 16384) != (p0.b & 16384))
                                v0 = 0;
                            else if (this.z != p0.z)
                                v0 = 0;
                            else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                                v0 = 0;
                            else if ((this.b & 32768) != (p0.b & 32768))
                                v0 = 0;
                            else if (!this.B.equals(p0.B))
                                v0 = 0;
                            else if ((this.b & 65536) != (p0.b & 65536))
                                v0 = 0;
                            else if (this.C != p0.C)
                                v0 = 0;
                            else if ((this.b & 131072) != (p0.b & 131072))
                                v0 = 0;
                            else if (this.D != p0.D)
                                v0 = 0;
                            else if ((this.b & 262144) != (p0.b & 262144))
                                v0 = 0;
                            else if (!this.E.equals(p0.E))
                                v0 = 0;
                            else if ((this.b & 524288) != (p0.b & 524288))
                                v0 = 0;
                            else if (this.F != p0.F)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.v.equals(p0.v))
                            v0 = 0;
                        else if ((this.b & 2048) != (p0.b & 2048))
                            v0 = 0;
                        else if (this.w != p0.w)
                            v0 = 0;
                        else if ((this.b & 4096) != (p0.b & 4096))
                            v0 = 0;
                        else if (this.x != p0.x)
                            v0 = 0;
                        else if ((this.b & 8192) != (p0.b & 8192))
                            v0 = 0;
                        else if (this.y != p0.y)
                            v0 = 0;
                        else if ((this.b & 16384) != (p0.b & 16384))
                            v0 = 0;
                        else if (this.z != p0.z)
                            v0 = 0;
                        else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                            v0 = 0;
                        else if ((this.b & 32768) != (p0.b & 32768))
                            v0 = 0;
                        else if (!this.B.equals(p0.B))
                            v0 = 0;
                        else if ((this.b & 65536) != (p0.b & 65536))
                            v0 = 0;
                        else if (this.C != p0.C)
                            v0 = 0;
                        else if ((this.b & 131072) != (p0.b & 131072))
                            v0 = 0;
                        else if (this.D != p0.D)
                            v0 = 0;
                        else if ((this.b & 262144) != (p0.b & 262144))
                            v0 = 0;
                        else if (!this.E.equals(p0.E))
                            v0 = 0;
                        else if ((this.b & 524288) != (p0.b & 524288))
                            v0 = 0;
                        else if (this.F != p0.F)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.u.equals(p0.u))
                        v0 = 0;
                    else if (this.v == 0) {
                        if (p0.v != 0)
                            v0 = 0;
                        else if ((this.b & 2048) != (p0.b & 2048))
                            v0 = 0;
                        else if (this.w != p0.w)
                            v0 = 0;
                        else if ((this.b & 4096) != (p0.b & 4096))
                            v0 = 0;
                        else if (this.x != p0.x)
                            v0 = 0;
                        else if ((this.b & 8192) != (p0.b & 8192))
                            v0 = 0;
                        else if (this.y != p0.y)
                            v0 = 0;
                        else if ((this.b & 16384) != (p0.b & 16384))
                            v0 = 0;
                        else if (this.z != p0.z)
                            v0 = 0;
                        else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                            v0 = 0;
                        else if ((this.b & 32768) != (p0.b & 32768))
                            v0 = 0;
                        else if (!this.B.equals(p0.B))
                            v0 = 0;
                        else if ((this.b & 65536) != (p0.b & 65536))
                            v0 = 0;
                        else if (this.C != p0.C)
                            v0 = 0;
                        else if ((this.b & 131072) != (p0.b & 131072))
                            v0 = 0;
                        else if (this.D != p0.D)
                            v0 = 0;
                        else if ((this.b & 262144) != (p0.b & 262144))
                            v0 = 0;
                        else if (!this.E.equals(p0.E))
                            v0 = 0;
                        else if ((this.b & 524288) != (p0.b & 524288))
                            v0 = 0;
                        else if (this.F != p0.F)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.v.equals(p0.v))
                        v0 = 0;
                    else if ((this.b & 2048) != (p0.b & 2048))
                        v0 = 0;
                    else if (this.w != p0.w)
                        v0 = 0;
                    else if ((this.b & 4096) != (p0.b & 4096))
                        v0 = 0;
                    else if (this.x != p0.x)
                        v0 = 0;
                    else if ((this.b & 8192) != (p0.b & 8192))
                        v0 = 0;
                    else if (this.y != p0.y)
                        v0 = 0;
                    else if ((this.b & 16384) != (p0.b & 16384))
                        v0 = 0;
                    else if (this.z != p0.z)
                        v0 = 0;
                    else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                        v0 = 0;
                    else if ((this.b & 32768) != (p0.b & 32768))
                        v0 = 0;
                    else if (!this.B.equals(p0.B))
                        v0 = 0;
                    else if ((this.b & 65536) != (p0.b & 65536))
                        v0 = 0;
                    else if (this.C != p0.C)
                        v0 = 0;
                    else if ((this.b & 131072) != (p0.b & 131072))
                        v0 = 0;
                    else if (this.D != p0.D)
                        v0 = 0;
                    else if ((this.b & 262144) != (p0.b & 262144))
                        v0 = 0;
                    else if (!this.E.equals(p0.E))
                        v0 = 0;
                    else if ((this.b & 524288) != (p0.b & 524288))
                        v0 = 0;
                    else if (this.F != p0.F)
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.t.equals(p0.t))
                    v0 = 0;
                else if (this.u == 0) {
                    if (p0.u != 0)
                        v0 = 0;
                    else if (this.v == 0) {
                        if (p0.v != 0)
                            v0 = 0;
                        else if ((this.b & 2048) != (p0.b & 2048))
                            v0 = 0;
                        else if (this.w != p0.w)
                            v0 = 0;
                        else if ((this.b & 4096) != (p0.b & 4096))
                            v0 = 0;
                        else if (this.x != p0.x)
                            v0 = 0;
                        else if ((this.b & 8192) != (p0.b & 8192))
                            v0 = 0;
                        else if (this.y != p0.y)
                            v0 = 0;
                        else if ((this.b & 16384) != (p0.b & 16384))
                            v0 = 0;
                        else if (this.z != p0.z)
                            v0 = 0;
                        else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                            v0 = 0;
                        else if ((this.b & 32768) != (p0.b & 32768))
                            v0 = 0;
                        else if (!this.B.equals(p0.B))
                            v0 = 0;
                        else if ((this.b & 65536) != (p0.b & 65536))
                            v0 = 0;
                        else if (this.C != p0.C)
                            v0 = 0;
                        else if ((this.b & 131072) != (p0.b & 131072))
                            v0 = 0;
                        else if (this.D != p0.D)
                            v0 = 0;
                        else if ((this.b & 262144) != (p0.b & 262144))
                            v0 = 0;
                        else if (!this.E.equals(p0.E))
                            v0 = 0;
                        else if ((this.b & 524288) != (p0.b & 524288))
                            v0 = 0;
                        else if (this.F != p0.F)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.v.equals(p0.v))
                        v0 = 0;
                    else if ((this.b & 2048) != (p0.b & 2048))
                        v0 = 0;
                    else if (this.w != p0.w)
                        v0 = 0;
                    else if ((this.b & 4096) != (p0.b & 4096))
                        v0 = 0;
                    else if (this.x != p0.x)
                        v0 = 0;
                    else if ((this.b & 8192) != (p0.b & 8192))
                        v0 = 0;
                    else if (this.y != p0.y)
                        v0 = 0;
                    else if ((this.b & 16384) != (p0.b & 16384))
                        v0 = 0;
                    else if (this.z != p0.z)
                        v0 = 0;
                    else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                        v0 = 0;
                    else if ((this.b & 32768) != (p0.b & 32768))
                        v0 = 0;
                    else if (!this.B.equals(p0.B))
                        v0 = 0;
                    else if ((this.b & 65536) != (p0.b & 65536))
                        v0 = 0;
                    else if (this.C != p0.C)
                        v0 = 0;
                    else if ((this.b & 131072) != (p0.b & 131072))
                        v0 = 0;
                    else if (this.D != p0.D)
                        v0 = 0;
                    else if ((this.b & 262144) != (p0.b & 262144))
                        v0 = 0;
                    else if (!this.E.equals(p0.E))
                        v0 = 0;
                    else if ((this.b & 524288) != (p0.b & 524288))
                        v0 = 0;
                    else if (this.F != p0.F)
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.u.equals(p0.u))
                    v0 = 0;
                else if (this.v == 0) {
                    if (p0.v != 0)
                        v0 = 0;
                    else if ((this.b & 2048) != (p0.b & 2048))
                        v0 = 0;
                    else if (this.w != p0.w)
                        v0 = 0;
                    else if ((this.b & 4096) != (p0.b & 4096))
                        v0 = 0;
                    else if (this.x != p0.x)
                        v0 = 0;
                    else if ((this.b & 8192) != (p0.b & 8192))
                        v0 = 0;
                    else if (this.y != p0.y)
                        v0 = 0;
                    else if ((this.b & 16384) != (p0.b & 16384))
                        v0 = 0;
                    else if (this.z != p0.z)
                        v0 = 0;
                    else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                        v0 = 0;
                    else if ((this.b & 32768) != (p0.b & 32768))
                        v0 = 0;
                    else if (!this.B.equals(p0.B))
                        v0 = 0;
                    else if ((this.b & 65536) != (p0.b & 65536))
                        v0 = 0;
                    else if (this.C != p0.C)
                        v0 = 0;
                    else if ((this.b & 131072) != (p0.b & 131072))
                        v0 = 0;
                    else if (this.D != p0.D)
                        v0 = 0;
                    else if ((this.b & 262144) != (p0.b & 262144))
                        v0 = 0;
                    else if (!this.E.equals(p0.E))
                        v0 = 0;
                    else if ((this.b & 524288) != (p0.b & 524288))
                        v0 = 0;
                    else if (this.F != p0.F)
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.v.equals(p0.v))
                    v0 = 0;
                else if ((this.b & 2048) != (p0.b & 2048))
                    v0 = 0;
                else if (this.w != p0.w)
                    v0 = 0;
                else if ((this.b & 4096) != (p0.b & 4096))
                    v0 = 0;
                else if (this.x != p0.x)
                    v0 = 0;
                else if ((this.b & 8192) != (p0.b & 8192))
                    v0 = 0;
                else if (this.y != p0.y)
                    v0 = 0;
                else if ((this.b & 16384) != (p0.b & 16384))
                    v0 = 0;
                else if (this.z != p0.z)
                    v0 = 0;
                else if (!com.google.protobuf.nano.h.a(this.A, p0.A))
                    v0 = 0;
                else if ((this.b & 32768) != (p0.b & 32768))
                    v0 = 0;
                else if (!this.B.equals(p0.B))
                    v0 = 0;
                else if ((this.b & 65536) != (p0.b & 65536))
                    v0 = 0;
                else if (this.C != p0.C)
                    v0 = 0;
                else if ((this.b & 131072) != (p0.b & 131072))
                    v0 = 0;
                else if (this.D != p0.D)
                    v0 = 0;
                else if ((this.b & 262144) != (p0.b & 262144))
                    v0 = 0;
                else if (!this.E.equals(p0.E))
                    v0 = 0;
                else if ((this.b & 524288) != (p0.b & 524288))
                    v0 = 0;
                else if (this.F != p0.F)
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

    public final boolean f() {
        if (this.b & 4096)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final int hashCode() {
        v1 = 1231;
        v3 = 0;
        if (this.d != 0)
            v0 = 1231;
        else
            v0 = 1237;
        v4 = ((v0 + ((this.getClass().getName().hashCode() + 527) * 31 + com.google.protobuf.nano.h.a(this.c)) * 31) * 31 + (int)(this.e ^ this.e >>> 32)) * 31;
        if (this.f == 0)
            v0 = 0;
        else
            v0 = this.f.hashCode();
        v5 = ((((((((v0 + v4) * 31 + this.g.hashCode()) * 31 + this.h.hashCode()) * 31 + this.i.hashCode()) * 31 + this.j.hashCode()) * 31 + (int)(this.k ^ this.k >>> 32)) * 31 + this.l.hashCode()) * 31 + com.google.protobuf.nano.h.a(this.m)) * 31;
        if (this.n != 0)
            v0 = 1231;
        else
            v0 = 1237;
        v5 = (v0 + v5) * 31;
        if (this.o != 0)
            v0 = 1231;
        else
            v0 = 1237;
        v5 = (((v0 + v5) * 31 + this.p) * 31 + this.q) * 31;
        if (this.r == 0)
            v0 = 0;
        else
            v0 = this.r.hashCode();
        v5 = (v0 + v5) * 31;
        if (this.s == 0)
            v0 = 0;
        else
            v0 = this.s.hashCode();
        v5 = (v0 + v5) * 31;
        if (this.t == 0)
            v0 = 0;
        else
            v0 = this.t.hashCode();
        v5 = (v0 + v5) * 31;
        if (this.u == 0)
            v0 = 0;
        else
            v0 = this.u.hashCode();
        v5 = (v0 + v5) * 31;
        if (this.v == 0)
            v0 = 0;
        else
            v0 = this.v.hashCode();
        v5 = (v0 + v5) * 31;
        if (this.w != 0)
            v0 = 1231;
        else
            v0 = 1237;
        if (this.C == 0)
            v1 = 1237;
        if (this.aO != 0 && !this.aO.b())
            v3 = this.aO.hashCode();
        return ((((((((((v0 + v5) * 31 + (int)(this.x ^ this.x >>> 32)) * 31 + (int)(this.y ^ this.y >>> 32)) * 31 + this.z) * 31 + com.google.protobuf.nano.h.a(this.A)) * 31 + this.B.hashCode()) * 31 + v1) * 31 + (int)(this.D ^ this.D >>> 32)) * 31 + this.E.hashCode()) * 31 + (int)(this.F ^ this.F >>> 32)) * 31 + v3;
    }

}
