package com.google.a.a.a.a.b.a.a.c.b.a;

import com.google.a.a.a.a.b.a.a.c.a.a;
import com.google.a.a.a.a.b.a.b.a.aa;
import com.google.a.a.a.a.b.a.b.a.ag;
import com.google.a.a.a.a.b.a.b.a.c;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;
import java.util.Arrays;

protected final class com.google.a.a.a.a.b.a.a.c.b.a.u extends com.google.protobuf.nano.b
{

    public static volatile u[] a;
    public String b;
    public v[] c;
    public byte[] d;
    public com.google.a.a.a.a.b.a.b.a.aa e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int[] j;
    public c[] k;
    public com.google.a.a.a.a.b.a.b.a.ag l;
    public int[] m;

    u() {
        com.google.protobuf.nano.b();
        this.b = "";
        this.c = com.google.a.a.a.a.b.a.a.c.b.a.v.a();
        this.d = com.google.protobuf.nano.l.l;
        this.e = 0;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = com.google.protobuf.nano.l.e;
        this.k = com.google.a.a.a.a.b.a.b.a.c.a();
        this.l = 0;
        this.m = com.google.protobuf.nano.l.e;
        this.aP = -1;
    }

    public static u[] a() {
        if (com.google.a.a.a.a.b.a.a.c.b.a.u.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.a.a.a.a.b.a.a.c.b.a.u.a == 0)
                    com.google.a.a.a.a.b.a.a.c.b.a.u.a = new u[0];
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
        return com.google.a.a.a.a.b.a.a.c.b.a.u.a;
    }

    private final com.google.a.a.a.a.b.a.a.c.b.a.u b(com.google.protobuf.nano.a p0) {
  3:    v3 = p0.a();
  7:    switch (v3) {
            case 0:
  7:            goto 16;
            case 10:
  7:            goto 17;
            case 18:
  7:            goto 80;
            case 26:
  7:            goto 87;
            case 32:
  7:            goto 104;
            case 40:
  7:            goto 111;
            case 42:
  7:            goto 163;
            case 48:
  7:            goto 229;
            case 56:
  7:            goto 280;
            case 64:
  7:            goto 288;
            case 74:
  7:            goto 296;
            case 80:
  7:            goto 360;
            case 82:
  7:            goto 440;
            case 90:
  7:            goto 531;
            case 98:
  7:            goto 539;
            default:
        }
 14:    if (super.a(p0, v3)) goto 3;
 16:    return this;
 25:    if (this.c == 0)
 27:        v0 = 0;
        else
 63:        v0 = this.c.length;
 29:    v2 = new v[com.google.protobuf.nano.l.a(p0, 10) + v0];
 31:    if (v0 != 0)
 35:        System.arraycopy(this.c, 0, v2, 0, v0);
 38:    while (v0 < v2.length - 1) {
 48:        v2[v0] = new com.google.a.a.a.a.b.a.a.c.b.a.v();
 52:        p0.a(v2[v0]);
 55:        p0.a();
 58:        v0 = v0 + 1;
        }
 60:    goto 65;
 70:    v2[v0] = new com.google.a.a.a.a.b.a.a.c.b.a.v();
 74:    p0.a(v2[v0]);
 77:    this.c = v2;
 79:    goto 3;
 84:    this.d = p0.g();
 86:    goto 3;
 89:    if (this.e == 0)
 96:        this.e = new com.google.a.a.a.a.b.a.b.a.aa();
100:    p0.a(this.e);
103:    goto 3;
108:    this.i = p0.i();
110:    goto 3;
119:    if (this.j == 0)
121:        v0 = 0;
        else
151:        v0 = this.j.length;
123:    v2 = new int[com.google.protobuf.nano.l.a(p0, 40) + v0];
125:    if (v0 != 0)
129:        System.arraycopy(this.j, 0, v2, 0, v0);
132:    while (v0 < v2.length - 1) {
141:        v2[v0] = p0.i();
143:        p0.a();
146:        v0 = v0 + 1;
        }
148:    goto 153;
157:    v2[v0] = p0.i();
159:    this.j = v2;
161:    goto 3;
175:    v0 = 0;
176:    while (p0.m() > 0) {
182:        p0.i();
185:        v0 = v0 + 1;
        }
188:    p0.e(p0.o());
193:    if (this.j == 0)
195:        v2 = 0;
        else
220:        v2 = this.j.length;
197:    v0 = new int[v0 + v2];
199:    if (v2 != 0)
203:        System.arraycopy(this.j, 0, v0, 0, v2);
206:    while (v2 < v0.length) {
213:        v0[v2] = p0.i();
215:        v2 = v2 + 1;
        }
217:    goto 222;
222:    this.j = v0;
224:    p0.d(p0.c(p0.i()));
227:    goto 3;
233:    try {
233:        v2 = p0.i();
237:        switch (v2) {
                case 0:
276:                try {
276:                    this.h = v2;
                    }
                    catch (IllegalArgumentException ex) {
268:                    p0.e(p0.o());
271:                    this.a(p0, v3);
                    }
564:                break;
                case 1:
276:                try {
276:                    this.h = v2;
                    }
                    catch (IllegalArgumentException ex) {
268:                    p0.e(p0.o());
271:                    this.a(p0, v3);
                    }
564:                break;
                case 2:
276:                try {
276:                    this.h = v2;
                    }
                    catch (IllegalArgumentException ex) {
268:                    p0.e(p0.o());
271:                    this.a(p0, v3);
                    }
564:                break;
                default:
266:                throw new IllegalArgumentException(47 + v2 + " is not a valid enum PanChecksumType");
            }
        }
        catch (IllegalArgumentException ex) {
        }
268:    p0.e(p0.o());
271:    this.a(p0, v3);
274:    goto 3;
284:    this.g = p0.i();
286:    goto 3;
292:    this.f = p0.i();
294:    goto 3;
304:    if (this.k == 0)
306:        v0 = 0;
        else
342:        v0 = this.k.length;
308:    v2 = new c[com.google.protobuf.nano.l.a(p0, 74) + v0];
310:    if (v0 != 0)
314:        System.arraycopy(this.k, 0, v2, 0, v0);
317:    while (v0 < v2.length - 1) {
327:        v2[v0] = new com.google.a.a.a.a.b.a.b.a.c();
331:        p0.a(v2[v0]);
334:        p0.a();
337:        v0 = v0 + 1;
        }
339:    goto 344;
349:    v2[v0] = new com.google.a.a.a.a.b.a.b.a.c();
353:    p0.a(v2[v0]);
356:    this.k = v2;
358:    goto 3;
360:    v4 = com.google.protobuf.nano.l.a(p0, 80);
364:    v5 = new int[v4];
366:    v2 = 0;
367:    v0 = 0;
368:    if (v2 >= v4) goto 402;
370:    if (v2 != 0)
372:        p0.a();
387:    v5[v0] = com.google.a.a.a.a.b.a.a.c.a.a.a(p0.i());
389:    v0 = v0 + 1;
391:    v2 = v2 + 1;
393:    goto 368;
395:    p0.e(p0.o());
398:    this.a(p0, v3);
401:    goto 391;
402:    if (v0 != 0) {
406:        if (this.m == 0)
408:            v2 = 0;
            else
420:            v2 = this.m.length;
409:        if (v2 == 0 && v0 == v5.length)
414:            this.m = v5;
            else {
424:            v3 = new int[v2 + v0];
426:            if (v2 != 0)
430:                System.arraycopy(this.m, 0, v3, 0, v2);
433:            System.arraycopy(v5, 0, v3, v2, v0);
436:            this.m = v3;
            }
        }
416:    goto 3;
452:    v0 = 0;
457:    if (p0.m() <= 0) goto 469;
463:    com.google.a.a.a.a.b.a.a.c.a.a.a(p0.i());
466:    v0 = v0 + 1;
468:    goto 453;
469:    if (v0 == 0) goto 526;
471:    p0.e(p0.o());
476:    if (this.m == 0)
478:        v2 = 0;
        else
514:        v2 = this.m.length;
480:    v0 = new int[v0 + v2];
482:    if (v2 != 0)
486:        System.arraycopy(this.m, 0, v0, 0, v2);
493:    if (p0.m() <= 0) goto 524;
507:    v0[v2] = com.google.a.a.a.a.b.a.a.c.a.a.a(p0.i());
509:    v2 = v2 + 1;
511:    goto 489;
517:    p0.e(p0.o());
520:    this.a(p0, 80);
523:    goto 489;
524:    this.m = v0;
526:    p0.d(p0.c(p0.i()));
529:    goto 3;
535:    this.b = p0.f();
537:    goto 3;
541:    if (this.l == 0)
548:        this.l = new com.google.a.a.a.a.b.a.b.a.ag();
552:    p0.a(this.l);
555:    goto 3;
558:    goto 453;
559:    try
            run 499...509
        catch (IllegalArgumentException ex) {
499:        goto 516;
        }
560:    try
            run 459...466
        catch (IllegalArgumentException ex) {
459:        goto 557;
        }
561:    try
            run 379...389
        catch (IllegalArgumentException ex) {
379:        goto 394;
        }
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        if (this.c != 0 && this.c.length > 0) {
            v0 = 0;
            while (v0 < this.c.length) {
                if (this.c[v0] != 0)
                    p0.b(1, this.c[v0]);
                v0 = v0 + 1;
            }
        }
        if (!Arrays.equals(this.d, com.google.protobuf.nano.l.l))
            p0.a(2, this.d);
        if (this.e != 0)
            p0.b(3, this.e);
        if (this.i != 0)
            p0.a(4, this.i);
        if (this.j != 0 && this.j.length > 0) {
            v0 = 0;
            v2 = 0;
            while (v0 < this.j.length) {
                v2 = v2 + CodedOutputByteBufferNano.c(this.j[v0]);
                v0 = v0 + 1;
            }
            p0.e(42);
            p0.e(v2);
            v0 = 0;
            while (v0 < this.j.length) {
                p0.a(this.j[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.h != 0)
            p0.a(6, this.h);
        if (this.g != 0)
            p0.a(7, this.g);
        if (this.f != -1)
            p0.a(8, this.f);
        if (this.k != 0 && this.k.length > 0) {
            v0 = 0;
            while (v0 < this.k.length) {
                if (this.k[v0] != 0)
                    p0.b(9, this.k[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.m != 0 && this.m.length > 0) {
            v0 = 0;
            v2 = 0;
            while (v0 < this.m.length) {
                v2 = v2 + CodedOutputByteBufferNano.c(this.m[v0]);
                v0 = v0 + 1;
            }
            p0.e(82);
            p0.e(v2);
            while (v1 < this.m.length) {
                p0.e(this.m[v1]);
                v1 = v1 + 1;
            }
        }
        if (this.b != 0 && !this.b.equals(""))
            p0.a(11, this.b);
        if (this.l != 0)
            p0.b(12, this.l);
        super.a(p0);
    }

    protected final int b() {
        v1 = 0;
        v0 = super.b();
        if (this.c != 0 && this.c.length > 0) {
            v2 = v0;
            v0 = 0;
            while (v0 < this.c.length) {
                if (this.c[v0] != 0)
                    v2 = v2 + CodedOutputByteBufferNano.d(1, this.c[v0]);
                v0 = v0 + 1;
            }
            v0 = v2;
        }
        if (!Arrays.equals(this.d, com.google.protobuf.nano.l.l))
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.d);
        if (this.e != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.e);
        if (this.i != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.i);
        if (this.j != 0 && this.j.length > 0) {
            v2 = 0;
            v3 = 0;
            while (v2 < this.j.length) {
                v3 = v3 + CodedOutputByteBufferNano.c(this.j[v2]);
                v2 = v2 + 1;
            }
            v0 = v0 + v3 + 1 + CodedOutputByteBufferNano.f(v3);
        }
        if (this.h != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(6, this.h);
        if (this.g != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(7, this.g);
        if (this.f != -1)
            v0 = v0 + CodedOutputByteBufferNano.d(8, this.f);
        if (this.k != 0 && this.k.length > 0) {
            v2 = v0;
            v0 = 0;
            while (v0 < this.k.length) {
                if (this.k[v0] != 0)
                    v2 = v2 + CodedOutputByteBufferNano.d(9, this.k[v0]);
                v0 = v0 + 1;
            }
            v0 = v2;
        }
        if (this.m != 0 && this.m.length > 0) {
            v2 = 0;
            while (v1 < this.m.length) {
                v2 = v2 + CodedOutputByteBufferNano.c(this.m[v1]);
                v1 = v1 + 1;
            }
            v0 = v0 + v2 + 1 + CodedOutputByteBufferNano.f(v2);
        }
        if (this.b != 0 && !this.b.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(11, this.b);
        if (this.l != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(12, this.l);
        return v0;
    }

}
