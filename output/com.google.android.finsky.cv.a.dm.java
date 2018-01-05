package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;
import g.a.a.a;

public final class com.google.android.finsky.cv.a.dm extends com.google.protobuf.nano.b
{

    public int a;
    public int b;
    public dp[] c;
    public boolean d;
    public com.google.android.finsky.cv.a.do e;
    public int f;
    public com.google.android.finsky.cv.a.gq g;
    public boolean h;
    public bh[] i;
    public com.google.android.finsky.cv.a.di j;
    public com.google.android.finsky.cv.a.az k;
    public long l;
    public com.google.android.finsky.cv.a.dr m;
    public g.a.a.a n;
    public dn[] o;
    public com.google.android.finsky.cv.a.dq p;

    dm() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 1;
        this.c = com.google.android.finsky.cv.a.dp.aW_();
        this.d = 0;
        this.e = 0;
        this.f = 1;
        this.g = 0;
        this.h = 0;
        this.i = com.google.android.finsky.cv.a.bh.aJ_();
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = com.google.android.finsky.cv.a.dn.aV_();
        this.p = 0;
        this.aO = 0;
        this.aP = -1;
    }

    public static int a(int p0) {
        switch (p0) {
            case 1:
                return p0;
            case 2:
                return p0;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                return p0;
            case 7:
                return p0;
            case 8:
                return p0;
            case 9:
                return p0;
            case 10:
                return p0;
            case 11:
                return p0;
            case 12:
                return p0;
            case 13:
                return p0;
            case 14:
                return p0;
            case 15:
                return p0;
            case 16:
                return p0;
            case 17:
                return p0;
            case 18:
                return p0;
            case 19:
                break;
            case 20:
                return p0;
            case 21:
                return p0;
            case 22:
                return p0;
            case 23:
                return p0;
            case 24:
                return p0;
            case 25:
                return p0;
            default:
                break;
        }
        throw new IllegalArgumentException(55 + p0 + " is not a valid enum AvailabilityRestriction");
    }

    private final com.google.android.finsky.cv.a.dm b(com.google.protobuf.nano.a p0) {
  3:    v0 = p0.a();
  7:    switch (v0) {
            case 0:
  7:            goto 16;
            case 40:
  7:            goto 17;
            case 48:
  7:            goto 52;
            case 58:
  7:            goto 87;
            case 75:
  7:            goto 104;
            case 104:
  7:            goto 168;
            case 114:
  7:            goto 182;
            case 130:
  7:            goto 246;
            case 138:
  7:            goto 264;
            case 146:
  7:            goto 282;
            case 154:
  7:            goto 346;
            case 168:
  7:            goto 364;
            case 186:
  7:            goto 378;
            case 194:
  7:            goto 396;
            case 200:
  7:            goto 414;
            case 210:
  7:            goto 428;
            default:
        }
 14:    if (super.a(p0, v0)) goto 3;
 16:    return this;
 21:    this.a = this.a | 1;
 27:    try {
 35:        this.b = com.google.android.finsky.cv.a.dm.a(p0.i());
 41:        this.a = this.a | 1;
        }
        catch (IllegalArgumentException ex) {
 45:        p0.e(p0.o());
 48:        this.a(p0, v0);
        }
 43:    goto 3;
 56:    this.a = this.a | 4;
 62:    try {
 70:        this.f = com.google.android.finsky.cv.a.bp.a(p0.i());
 76:        this.a = this.a | 4;
        }
        catch (IllegalArgumentException ex) {
 80:        p0.e(p0.o());
 83:        this.a(p0, v0);
        }
 78:    goto 3;
 89:    if (this.m == 0)
 96:        this.m = new com.google.android.finsky.cv.a.dr();
100:    p0.a(this.m);
103:    goto 3;
112:    if (this.o == 0)
114:        v0 = 0;
        else
150:        v0 = this.o.length;
116:    v2 = new dn[com.google.protobuf.nano.l.a(p0, 75) + v0];
118:    if (v0 != 0)
122:        System.arraycopy(this.o, 0, v2, 0, v0);
125:    while (v0 < v2.length - 1) {
135:        v2[v0] = new com.google.android.finsky.cv.a.dn();
139:        p0.a(v2[v0], 9);
142:        p0.a();
145:        v0 = v0 + 1;
        }
147:    goto 152;
157:    v2[v0] = new com.google.android.finsky.cv.a.dn();
161:    p0.a(v2[v0], 9);
164:    this.o = v2;
166:    goto 3;
172:    this.d = p0.e();
178:    this.a = this.a | 2;
180:    goto 3;
190:    if (this.i == 0)
192:        v0 = 0;
        else
228:        v0 = this.i.length;
194:    v2 = new bh[com.google.protobuf.nano.l.a(p0, 114) + v0];
196:    if (v0 != 0)
200:        System.arraycopy(this.i, 0, v2, 0, v0);
203:    while (v0 < v2.length - 1) {
213:        v2[v0] = new com.google.android.finsky.cv.a.bh();
217:        p0.a(v2[v0]);
220:        p0.a();
223:        v0 = v0 + 1;
        }
225:    goto 230;
235:    v2[v0] = new com.google.android.finsky.cv.a.bh();
239:    p0.a(v2[v0]);
242:    this.i = v2;
244:    goto 3;
248:    if (this.p == 0)
255:        this.p = new com.google.android.finsky.cv.a.dq();
259:    p0.a(this.p);
262:    goto 3;
266:    if (this.g == 0)
273:        this.g = new com.google.android.finsky.cv.a.gq();
277:    p0.a(this.g);
280:    goto 3;
290:    if (this.c == 0)
292:        v0 = 0;
        else
328:        v0 = this.c.length;
294:    v2 = new dp[com.google.protobuf.nano.l.a(p0, 146) + v0];
296:    if (v0 != 0)
300:        System.arraycopy(this.c, 0, v2, 0, v0);
303:    while (v0 < v2.length - 1) {
313:        v2[v0] = new com.google.android.finsky.cv.a.dp();
317:        p0.a(v2[v0]);
320:        p0.a();
323:        v0 = v0 + 1;
        }
325:    goto 330;
335:    v2[v0] = new com.google.android.finsky.cv.a.dp();
339:    p0.a(v2[v0]);
342:    this.c = v2;
344:    goto 3;
348:    if (this.n == 0)
355:        this.n = new g.a.a.a();
359:    p0.a(this.n);
362:    goto 3;
368:    this.h = p0.e();
374:    this.a = this.a | 8;
376:    goto 3;
380:    if (this.j == 0)
387:        this.j = new com.google.android.finsky.cv.a.di();
391:    p0.a(this.j);
394:    goto 3;
398:    if (this.k == 0)
405:        this.k = new com.google.android.finsky.cv.a.az();
409:    p0.a(this.k);
412:    goto 3;
418:    this.l = p0.j();
424:    this.a = this.a | 16;
426:    goto 3;
430:    if (this.e == 0)
437:        this.e = new com.google.android.finsky.cv.a.do();
441:    p0.a(this.e);
444:    goto 3;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        if (this.a & 1)
            p0.a(5, this.b);
        if (this.a & 4)
            p0.a(6, this.f);
        if (this.m != 0)
            p0.b(7, this.m);
        if (this.o != 0 && this.o.length > 0) {
            v0 = 0;
            while (v0 < this.o.length) {
                if (this.o[v0] != 0)
                    p0.a(9, this.o[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.a & 2)
            p0.a(13, this.d);
        if (this.i != 0 && this.i.length > 0) {
            v0 = 0;
            while (v0 < this.i.length) {
                if (this.i[v0] != 0)
                    p0.b(14, this.i[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.p != 0)
            p0.b(16, this.p);
        if (this.g != 0)
            p0.b(17, this.g);
        if (this.c != 0 && this.c.length > 0)
            while (v1 < this.c.length) {
                if (this.c[v1] != 0)
                    p0.b(18, this.c[v1]);
                v1 = v1 + 1;
            }
        if (this.n != 0)
            p0.b(19, this.n);
        if (this.a & 8)
            p0.a(21, this.h);
        if (this.j != 0)
            p0.b(23, this.j);
        if (this.k != 0)
            p0.b(24, this.k);
        if (this.a & 16)
            p0.b(25, this.l);
        if (this.e != 0)
            p0.b(26, this.e);
        super.a(p0);
    }

    protected final int b() {
        v1 = 0;
        v0 = super.b();
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.b);
        if (this.a & 4)
            v0 = v0 + CodedOutputByteBufferNano.d(6, this.f);
        if (this.m != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(7, this.m);
        if (this.o != 0 && this.o.length > 0) {
            v2 = v0;
            v0 = 0;
            while (v0 < this.o.length) {
                if (this.o[v0] != 0)
                    v2 = v2 + CodedOutputByteBufferNano.c(9, this.o[v0]);
                v0 = v0 + 1;
            }
            v0 = v2;
        }
        if (this.a & 2)
            v0 = v0 + CodedOutputByteBufferNano.d(13) + 1;
        if (this.i != 0 && this.i.length > 0) {
            v2 = v0;
            v0 = 0;
            while (v0 < this.i.length) {
                if (this.i[v0] != 0)
                    v2 = v2 + CodedOutputByteBufferNano.d(14, this.i[v0]);
                v0 = v0 + 1;
            }
            v0 = v2;
        }
        if (this.p != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(16, this.p);
        if (this.g != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(17, this.g);
        if (this.c != 0 && this.c.length > 0)
            while (v1 < this.c.length) {
                if (this.c[v1] != 0)
                    v0 = v0 + CodedOutputByteBufferNano.d(18, this.c[v1]);
                v1 = v1 + 1;
            }
        if (this.n != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(19, this.n);
        if (this.a & 8)
            v0 = v0 + CodedOutputByteBufferNano.d(21) + 1;
        if (this.j != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(23, this.j);
        if (this.k != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(24, this.k);
        if (this.a & 16)
            v0 = v0 + CodedOutputByteBufferNano.f(25, this.l);
        if (this.e != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(26, this.e);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.dm))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.dm)p0;
                if ((this.a & 1) != (p0.a & 1))
                    v0 = 0;
                else if (this.b != p0.b)
                    v0 = 0;
                else if (!com.google.protobuf.nano.h.a(this.c, p0.c))
                    v0 = 0;
                else if ((this.a & 2) != (p0.a & 2))
                    v0 = 0;
                else if (this.d != p0.d)
                    v0 = 0;
                else if (this.e == 0) {
                    if (p0.e != 0)
                        v0 = 0;
                    else if ((this.a & 4) != (p0.a & 4))
                        v0 = 0;
                    else if (this.f != p0.f)
                        v0 = 0;
                    else if (this.g == 0) {
                        if (p0.g != 0)
                            v0 = 0;
                        else if ((this.a & 8) != (p0.a & 8))
                            v0 = 0;
                        else if (this.h != p0.h)
                            v0 = 0;
                        else if (!com.google.protobuf.nano.h.a(this.i, p0.i))
                            v0 = 0;
                        else if (this.j == 0) {
                            if (p0.j != 0)
                                v0 = 0;
                            else if (this.k == 0) {
                                if (p0.k != 0)
                                    v0 = 0;
                                else if ((this.a & 16) != (p0.a & 16))
                                    v0 = 0;
                                else if (this.l != p0.l)
                                    v0 = 0;
                                else if (this.m == 0) {
                                    if (p0.m != 0)
                                        v0 = 0;
                                    else if (this.n == 0) {
                                        if (p0.n != 0)
                                            v0 = 0;
                                        else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                            v0 = 0;
                                        else if (this.p == 0) {
                                            if (p0.p != 0)
                                                v0 = 0;
                                            else if (this.aO == 0 || this.aO.b()) {
                                                if (p0.aO != 0 && !p0.aO.b())
                                                    v0 = 0;
                                            }
                                            else
                                                v0 = this.aO.equals(p0.aO);
                                        }
                                        else if (!this.p.equals(p0.p))
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
                                    else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                        v0 = 0;
                                    else if (this.p == 0) {
                                        if (p0.p != 0)
                                            v0 = 0;
                                        else if (this.aO == 0 || this.aO.b()) {
                                            if (p0.aO != 0 && !p0.aO.b())
                                                v0 = 0;
                                        }
                                        else
                                            v0 = this.aO.equals(p0.aO);
                                    }
                                    else if (!this.p.equals(p0.p))
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
                                    else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                        v0 = 0;
                                    else if (this.p == 0) {
                                        if (p0.p != 0)
                                            v0 = 0;
                                        else if (this.aO == 0 || this.aO.b()) {
                                            if (p0.aO != 0 && !p0.aO.b())
                                                v0 = 0;
                                        }
                                        else
                                            v0 = this.aO.equals(p0.aO);
                                    }
                                    else if (!this.p.equals(p0.p))
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
                                else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                    v0 = 0;
                                else if (this.p == 0) {
                                    if (p0.p != 0)
                                        v0 = 0;
                                    else if (this.aO == 0 || this.aO.b()) {
                                        if (p0.aO != 0 && !p0.aO.b())
                                            v0 = 0;
                                    }
                                    else
                                        v0 = this.aO.equals(p0.aO);
                                }
                                else if (!this.p.equals(p0.p))
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.k.equals(p0.k))
                                v0 = 0;
                            else if ((this.a & 16) != (p0.a & 16))
                                v0 = 0;
                            else if (this.l != p0.l)
                                v0 = 0;
                            else if (this.m == 0) {
                                if (p0.m != 0)
                                    v0 = 0;
                                else if (this.n == 0) {
                                    if (p0.n != 0)
                                        v0 = 0;
                                    else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                        v0 = 0;
                                    else if (this.p == 0) {
                                        if (p0.p != 0)
                                            v0 = 0;
                                        else if (this.aO == 0 || this.aO.b()) {
                                            if (p0.aO != 0 && !p0.aO.b())
                                                v0 = 0;
                                        }
                                        else
                                            v0 = this.aO.equals(p0.aO);
                                    }
                                    else if (!this.p.equals(p0.p))
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
                                else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                    v0 = 0;
                                else if (this.p == 0) {
                                    if (p0.p != 0)
                                        v0 = 0;
                                    else if (this.aO == 0 || this.aO.b()) {
                                        if (p0.aO != 0 && !p0.aO.b())
                                            v0 = 0;
                                    }
                                    else
                                        v0 = this.aO.equals(p0.aO);
                                }
                                else if (!this.p.equals(p0.p))
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
                                else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                    v0 = 0;
                                else if (this.p == 0) {
                                    if (p0.p != 0)
                                        v0 = 0;
                                    else if (this.aO == 0 || this.aO.b()) {
                                        if (p0.aO != 0 && !p0.aO.b())
                                            v0 = 0;
                                    }
                                    else
                                        v0 = this.aO.equals(p0.aO);
                                }
                                else if (!this.p.equals(p0.p))
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
                            else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                v0 = 0;
                            else if (this.p == 0) {
                                if (p0.p != 0)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.p.equals(p0.p))
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
                        else if (this.k == 0) {
                            if (p0.k != 0)
                                v0 = 0;
                            else if ((this.a & 16) != (p0.a & 16))
                                v0 = 0;
                            else if (this.l != p0.l)
                                v0 = 0;
                            else if (this.m == 0) {
                                if (p0.m != 0)
                                    v0 = 0;
                                else if (this.n == 0) {
                                    if (p0.n != 0)
                                        v0 = 0;
                                    else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                        v0 = 0;
                                    else if (this.p == 0) {
                                        if (p0.p != 0)
                                            v0 = 0;
                                        else if (this.aO == 0 || this.aO.b()) {
                                            if (p0.aO != 0 && !p0.aO.b())
                                                v0 = 0;
                                        }
                                        else
                                            v0 = this.aO.equals(p0.aO);
                                    }
                                    else if (!this.p.equals(p0.p))
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
                                else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                    v0 = 0;
                                else if (this.p == 0) {
                                    if (p0.p != 0)
                                        v0 = 0;
                                    else if (this.aO == 0 || this.aO.b()) {
                                        if (p0.aO != 0 && !p0.aO.b())
                                            v0 = 0;
                                    }
                                    else
                                        v0 = this.aO.equals(p0.aO);
                                }
                                else if (!this.p.equals(p0.p))
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
                                else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                    v0 = 0;
                                else if (this.p == 0) {
                                    if (p0.p != 0)
                                        v0 = 0;
                                    else if (this.aO == 0 || this.aO.b()) {
                                        if (p0.aO != 0 && !p0.aO.b())
                                            v0 = 0;
                                    }
                                    else
                                        v0 = this.aO.equals(p0.aO);
                                }
                                else if (!this.p.equals(p0.p))
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
                            else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                v0 = 0;
                            else if (this.p == 0) {
                                if (p0.p != 0)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.p.equals(p0.p))
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.k.equals(p0.k))
                            v0 = 0;
                        else if ((this.a & 16) != (p0.a & 16))
                            v0 = 0;
                        else if (this.l != p0.l)
                            v0 = 0;
                        else if (this.m == 0) {
                            if (p0.m != 0)
                                v0 = 0;
                            else if (this.n == 0) {
                                if (p0.n != 0)
                                    v0 = 0;
                                else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                    v0 = 0;
                                else if (this.p == 0) {
                                    if (p0.p != 0)
                                        v0 = 0;
                                    else if (this.aO == 0 || this.aO.b()) {
                                        if (p0.aO != 0 && !p0.aO.b())
                                            v0 = 0;
                                    }
                                    else
                                        v0 = this.aO.equals(p0.aO);
                                }
                                else if (!this.p.equals(p0.p))
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
                            else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                v0 = 0;
                            else if (this.p == 0) {
                                if (p0.p != 0)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.p.equals(p0.p))
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
                            else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                v0 = 0;
                            else if (this.p == 0) {
                                if (p0.p != 0)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.p.equals(p0.p))
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
                        else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                            v0 = 0;
                        else if (this.p == 0) {
                            if (p0.p != 0)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.p.equals(p0.p))
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.g.equals(p0.g))
                        v0 = 0;
                    else if ((this.a & 8) != (p0.a & 8))
                        v0 = 0;
                    else if (this.h != p0.h)
                        v0 = 0;
                    else if (!com.google.protobuf.nano.h.a(this.i, p0.i))
                        v0 = 0;
                    else if (this.j == 0) {
                        if (p0.j != 0)
                            v0 = 0;
                        else if (this.k == 0) {
                            if (p0.k != 0)
                                v0 = 0;
                            else if ((this.a & 16) != (p0.a & 16))
                                v0 = 0;
                            else if (this.l != p0.l)
                                v0 = 0;
                            else if (this.m == 0) {
                                if (p0.m != 0)
                                    v0 = 0;
                                else if (this.n == 0) {
                                    if (p0.n != 0)
                                        v0 = 0;
                                    else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                        v0 = 0;
                                    else if (this.p == 0) {
                                        if (p0.p != 0)
                                            v0 = 0;
                                        else if (this.aO == 0 || this.aO.b()) {
                                            if (p0.aO != 0 && !p0.aO.b())
                                                v0 = 0;
                                        }
                                        else
                                            v0 = this.aO.equals(p0.aO);
                                    }
                                    else if (!this.p.equals(p0.p))
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
                                else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                    v0 = 0;
                                else if (this.p == 0) {
                                    if (p0.p != 0)
                                        v0 = 0;
                                    else if (this.aO == 0 || this.aO.b()) {
                                        if (p0.aO != 0 && !p0.aO.b())
                                            v0 = 0;
                                    }
                                    else
                                        v0 = this.aO.equals(p0.aO);
                                }
                                else if (!this.p.equals(p0.p))
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
                                else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                    v0 = 0;
                                else if (this.p == 0) {
                                    if (p0.p != 0)
                                        v0 = 0;
                                    else if (this.aO == 0 || this.aO.b()) {
                                        if (p0.aO != 0 && !p0.aO.b())
                                            v0 = 0;
                                    }
                                    else
                                        v0 = this.aO.equals(p0.aO);
                                }
                                else if (!this.p.equals(p0.p))
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
                            else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                v0 = 0;
                            else if (this.p == 0) {
                                if (p0.p != 0)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.p.equals(p0.p))
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.k.equals(p0.k))
                            v0 = 0;
                        else if ((this.a & 16) != (p0.a & 16))
                            v0 = 0;
                        else if (this.l != p0.l)
                            v0 = 0;
                        else if (this.m == 0) {
                            if (p0.m != 0)
                                v0 = 0;
                            else if (this.n == 0) {
                                if (p0.n != 0)
                                    v0 = 0;
                                else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                    v0 = 0;
                                else if (this.p == 0) {
                                    if (p0.p != 0)
                                        v0 = 0;
                                    else if (this.aO == 0 || this.aO.b()) {
                                        if (p0.aO != 0 && !p0.aO.b())
                                            v0 = 0;
                                    }
                                    else
                                        v0 = this.aO.equals(p0.aO);
                                }
                                else if (!this.p.equals(p0.p))
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
                            else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                v0 = 0;
                            else if (this.p == 0) {
                                if (p0.p != 0)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.p.equals(p0.p))
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
                            else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                v0 = 0;
                            else if (this.p == 0) {
                                if (p0.p != 0)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.p.equals(p0.p))
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
                        else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                            v0 = 0;
                        else if (this.p == 0) {
                            if (p0.p != 0)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.p.equals(p0.p))
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
                    else if (this.k == 0) {
                        if (p0.k != 0)
                            v0 = 0;
                        else if ((this.a & 16) != (p0.a & 16))
                            v0 = 0;
                        else if (this.l != p0.l)
                            v0 = 0;
                        else if (this.m == 0) {
                            if (p0.m != 0)
                                v0 = 0;
                            else if (this.n == 0) {
                                if (p0.n != 0)
                                    v0 = 0;
                                else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                    v0 = 0;
                                else if (this.p == 0) {
                                    if (p0.p != 0)
                                        v0 = 0;
                                    else if (this.aO == 0 || this.aO.b()) {
                                        if (p0.aO != 0 && !p0.aO.b())
                                            v0 = 0;
                                    }
                                    else
                                        v0 = this.aO.equals(p0.aO);
                                }
                                else if (!this.p.equals(p0.p))
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
                            else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                v0 = 0;
                            else if (this.p == 0) {
                                if (p0.p != 0)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.p.equals(p0.p))
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
                            else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                v0 = 0;
                            else if (this.p == 0) {
                                if (p0.p != 0)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.p.equals(p0.p))
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
                        else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                            v0 = 0;
                        else if (this.p == 0) {
                            if (p0.p != 0)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.p.equals(p0.p))
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.k.equals(p0.k))
                        v0 = 0;
                    else if ((this.a & 16) != (p0.a & 16))
                        v0 = 0;
                    else if (this.l != p0.l)
                        v0 = 0;
                    else if (this.m == 0) {
                        if (p0.m != 0)
                            v0 = 0;
                        else if (this.n == 0) {
                            if (p0.n != 0)
                                v0 = 0;
                            else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                v0 = 0;
                            else if (this.p == 0) {
                                if (p0.p != 0)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.p.equals(p0.p))
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
                        else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                            v0 = 0;
                        else if (this.p == 0) {
                            if (p0.p != 0)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.p.equals(p0.p))
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
                        else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                            v0 = 0;
                        else if (this.p == 0) {
                            if (p0.p != 0)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.p.equals(p0.p))
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
                    else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                        v0 = 0;
                    else if (this.p == 0) {
                        if (p0.p != 0)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.p.equals(p0.p))
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.e.equals(p0.e))
                    v0 = 0;
                else if ((this.a & 4) != (p0.a & 4))
                    v0 = 0;
                else if (this.f != p0.f)
                    v0 = 0;
                else if (this.g == 0) {
                    if (p0.g != 0)
                        v0 = 0;
                    else if ((this.a & 8) != (p0.a & 8))
                        v0 = 0;
                    else if (this.h != p0.h)
                        v0 = 0;
                    else if (!com.google.protobuf.nano.h.a(this.i, p0.i))
                        v0 = 0;
                    else if (this.j == 0) {
                        if (p0.j != 0)
                            v0 = 0;
                        else if (this.k == 0) {
                            if (p0.k != 0)
                                v0 = 0;
                            else if ((this.a & 16) != (p0.a & 16))
                                v0 = 0;
                            else if (this.l != p0.l)
                                v0 = 0;
                            else if (this.m == 0) {
                                if (p0.m != 0)
                                    v0 = 0;
                                else if (this.n == 0) {
                                    if (p0.n != 0)
                                        v0 = 0;
                                    else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                        v0 = 0;
                                    else if (this.p == 0) {
                                        if (p0.p != 0)
                                            v0 = 0;
                                        else if (this.aO == 0 || this.aO.b()) {
                                            if (p0.aO != 0 && !p0.aO.b())
                                                v0 = 0;
                                        }
                                        else
                                            v0 = this.aO.equals(p0.aO);
                                    }
                                    else if (!this.p.equals(p0.p))
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
                                else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                    v0 = 0;
                                else if (this.p == 0) {
                                    if (p0.p != 0)
                                        v0 = 0;
                                    else if (this.aO == 0 || this.aO.b()) {
                                        if (p0.aO != 0 && !p0.aO.b())
                                            v0 = 0;
                                    }
                                    else
                                        v0 = this.aO.equals(p0.aO);
                                }
                                else if (!this.p.equals(p0.p))
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
                                else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                    v0 = 0;
                                else if (this.p == 0) {
                                    if (p0.p != 0)
                                        v0 = 0;
                                    else if (this.aO == 0 || this.aO.b()) {
                                        if (p0.aO != 0 && !p0.aO.b())
                                            v0 = 0;
                                    }
                                    else
                                        v0 = this.aO.equals(p0.aO);
                                }
                                else if (!this.p.equals(p0.p))
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
                            else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                v0 = 0;
                            else if (this.p == 0) {
                                if (p0.p != 0)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.p.equals(p0.p))
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.k.equals(p0.k))
                            v0 = 0;
                        else if ((this.a & 16) != (p0.a & 16))
                            v0 = 0;
                        else if (this.l != p0.l)
                            v0 = 0;
                        else if (this.m == 0) {
                            if (p0.m != 0)
                                v0 = 0;
                            else if (this.n == 0) {
                                if (p0.n != 0)
                                    v0 = 0;
                                else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                    v0 = 0;
                                else if (this.p == 0) {
                                    if (p0.p != 0)
                                        v0 = 0;
                                    else if (this.aO == 0 || this.aO.b()) {
                                        if (p0.aO != 0 && !p0.aO.b())
                                            v0 = 0;
                                    }
                                    else
                                        v0 = this.aO.equals(p0.aO);
                                }
                                else if (!this.p.equals(p0.p))
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
                            else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                v0 = 0;
                            else if (this.p == 0) {
                                if (p0.p != 0)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.p.equals(p0.p))
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
                            else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                v0 = 0;
                            else if (this.p == 0) {
                                if (p0.p != 0)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.p.equals(p0.p))
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
                        else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                            v0 = 0;
                        else if (this.p == 0) {
                            if (p0.p != 0)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.p.equals(p0.p))
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
                    else if (this.k == 0) {
                        if (p0.k != 0)
                            v0 = 0;
                        else if ((this.a & 16) != (p0.a & 16))
                            v0 = 0;
                        else if (this.l != p0.l)
                            v0 = 0;
                        else if (this.m == 0) {
                            if (p0.m != 0)
                                v0 = 0;
                            else if (this.n == 0) {
                                if (p0.n != 0)
                                    v0 = 0;
                                else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                    v0 = 0;
                                else if (this.p == 0) {
                                    if (p0.p != 0)
                                        v0 = 0;
                                    else if (this.aO == 0 || this.aO.b()) {
                                        if (p0.aO != 0 && !p0.aO.b())
                                            v0 = 0;
                                    }
                                    else
                                        v0 = this.aO.equals(p0.aO);
                                }
                                else if (!this.p.equals(p0.p))
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
                            else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                v0 = 0;
                            else if (this.p == 0) {
                                if (p0.p != 0)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.p.equals(p0.p))
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
                            else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                v0 = 0;
                            else if (this.p == 0) {
                                if (p0.p != 0)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.p.equals(p0.p))
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
                        else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                            v0 = 0;
                        else if (this.p == 0) {
                            if (p0.p != 0)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.p.equals(p0.p))
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.k.equals(p0.k))
                        v0 = 0;
                    else if ((this.a & 16) != (p0.a & 16))
                        v0 = 0;
                    else if (this.l != p0.l)
                        v0 = 0;
                    else if (this.m == 0) {
                        if (p0.m != 0)
                            v0 = 0;
                        else if (this.n == 0) {
                            if (p0.n != 0)
                                v0 = 0;
                            else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                v0 = 0;
                            else if (this.p == 0) {
                                if (p0.p != 0)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.p.equals(p0.p))
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
                        else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                            v0 = 0;
                        else if (this.p == 0) {
                            if (p0.p != 0)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.p.equals(p0.p))
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
                        else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                            v0 = 0;
                        else if (this.p == 0) {
                            if (p0.p != 0)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.p.equals(p0.p))
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
                    else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                        v0 = 0;
                    else if (this.p == 0) {
                        if (p0.p != 0)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.p.equals(p0.p))
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.g.equals(p0.g))
                    v0 = 0;
                else if ((this.a & 8) != (p0.a & 8))
                    v0 = 0;
                else if (this.h != p0.h)
                    v0 = 0;
                else if (!com.google.protobuf.nano.h.a(this.i, p0.i))
                    v0 = 0;
                else if (this.j == 0) {
                    if (p0.j != 0)
                        v0 = 0;
                    else if (this.k == 0) {
                        if (p0.k != 0)
                            v0 = 0;
                        else if ((this.a & 16) != (p0.a & 16))
                            v0 = 0;
                        else if (this.l != p0.l)
                            v0 = 0;
                        else if (this.m == 0) {
                            if (p0.m != 0)
                                v0 = 0;
                            else if (this.n == 0) {
                                if (p0.n != 0)
                                    v0 = 0;
                                else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                    v0 = 0;
                                else if (this.p == 0) {
                                    if (p0.p != 0)
                                        v0 = 0;
                                    else if (this.aO == 0 || this.aO.b()) {
                                        if (p0.aO != 0 && !p0.aO.b())
                                            v0 = 0;
                                    }
                                    else
                                        v0 = this.aO.equals(p0.aO);
                                }
                                else if (!this.p.equals(p0.p))
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
                            else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                v0 = 0;
                            else if (this.p == 0) {
                                if (p0.p != 0)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.p.equals(p0.p))
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
                            else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                v0 = 0;
                            else if (this.p == 0) {
                                if (p0.p != 0)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.p.equals(p0.p))
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
                        else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                            v0 = 0;
                        else if (this.p == 0) {
                            if (p0.p != 0)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.p.equals(p0.p))
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.k.equals(p0.k))
                        v0 = 0;
                    else if ((this.a & 16) != (p0.a & 16))
                        v0 = 0;
                    else if (this.l != p0.l)
                        v0 = 0;
                    else if (this.m == 0) {
                        if (p0.m != 0)
                            v0 = 0;
                        else if (this.n == 0) {
                            if (p0.n != 0)
                                v0 = 0;
                            else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                v0 = 0;
                            else if (this.p == 0) {
                                if (p0.p != 0)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.p.equals(p0.p))
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
                        else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                            v0 = 0;
                        else if (this.p == 0) {
                            if (p0.p != 0)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.p.equals(p0.p))
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
                        else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                            v0 = 0;
                        else if (this.p == 0) {
                            if (p0.p != 0)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.p.equals(p0.p))
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
                    else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                        v0 = 0;
                    else if (this.p == 0) {
                        if (p0.p != 0)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.p.equals(p0.p))
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
                else if (this.k == 0) {
                    if (p0.k != 0)
                        v0 = 0;
                    else if ((this.a & 16) != (p0.a & 16))
                        v0 = 0;
                    else if (this.l != p0.l)
                        v0 = 0;
                    else if (this.m == 0) {
                        if (p0.m != 0)
                            v0 = 0;
                        else if (this.n == 0) {
                            if (p0.n != 0)
                                v0 = 0;
                            else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                                v0 = 0;
                            else if (this.p == 0) {
                                if (p0.p != 0)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.p.equals(p0.p))
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
                        else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                            v0 = 0;
                        else if (this.p == 0) {
                            if (p0.p != 0)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.p.equals(p0.p))
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
                        else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                            v0 = 0;
                        else if (this.p == 0) {
                            if (p0.p != 0)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.p.equals(p0.p))
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
                    else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                        v0 = 0;
                    else if (this.p == 0) {
                        if (p0.p != 0)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.p.equals(p0.p))
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.k.equals(p0.k))
                    v0 = 0;
                else if ((this.a & 16) != (p0.a & 16))
                    v0 = 0;
                else if (this.l != p0.l)
                    v0 = 0;
                else if (this.m == 0) {
                    if (p0.m != 0)
                        v0 = 0;
                    else if (this.n == 0) {
                        if (p0.n != 0)
                            v0 = 0;
                        else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                            v0 = 0;
                        else if (this.p == 0) {
                            if (p0.p != 0)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.p.equals(p0.p))
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
                    else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                        v0 = 0;
                    else if (this.p == 0) {
                        if (p0.p != 0)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.p.equals(p0.p))
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
                    else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                        v0 = 0;
                    else if (this.p == 0) {
                        if (p0.p != 0)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.p.equals(p0.p))
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
                else if (!com.google.protobuf.nano.h.a(this.o, p0.o))
                    v0 = 0;
                else if (this.p == 0) {
                    if (p0.p != 0)
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.p.equals(p0.p))
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
        if (this.d != 0)
            v0 = 1231;
        else
            v0 = 1237;
        v5 = (v0 + (((this.getClass().getName().hashCode() + 527) * 31 + this.b) * 31 + com.google.protobuf.nano.h.a(this.c)) * 31) * 31;
        if (this.e == 0)
            v0 = 0;
        else
            v0 = this.e.hashCode();
        v5 = ((v0 + v5) * 31 + this.f) * 31;
        if (this.g == 0)
            v0 = 0;
        else
            v0 = this.g.hashCode();
        if (this.h == 0)
            v1 = 1237;
        v2 = (((v0 + v5) * 31 + v1) * 31 + com.google.protobuf.nano.h.a(this.i)) * 31;
        if (this.j == 0)
            v0 = 0;
        else
            v0 = this.j.hashCode();
        v2 = (v0 + v2) * 31;
        if (this.k == 0)
            v0 = 0;
        else
            v0 = this.k.hashCode();
        v2 = ((v0 + v2) * 31 + (int)(this.l ^ this.l >>> 32)) * 31;
        if (this.m == 0)
            v0 = 0;
        else
            v0 = this.m.hashCode();
        v2 = (v0 + v2) * 31;
        if (this.n == 0)
            v0 = 0;
        else
            v0 = this.n.hashCode();
        v2 = ((v0 + v2) * 31 + com.google.protobuf.nano.h.a(this.o)) * 31;
        if (this.p == 0)
            v0 = 0;
        else
            v0 = this.p.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v3 = this.aO.hashCode();
        return (v0 + v2) * 31 + v3;
    }

}
