package com.google.a.a.a.a.b.a.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

public final class com.google.a.a.a.a.b.a.b.a.ar extends com.google.protobuf.nano.b
{

    public int a;
    public int b;
    public int c;
    public String d;
    public int e;
    public int[] f;
    public as[] g;
    public String h;
    public int i;
    public boolean j;
    public String k;
    public boolean l;
    public int m;
    public com.google.a.a.a.a.b.a.b.a.z n;
    public com.google.a.a.a.a.b.a.b.a.aa o;

    ar() {
        com.google.protobuf.nano.b();
        this.a = -1;
        this.b = 0;
        this.c = 0;
        this.d = "";
        this.e = 0;
        this.f = com.google.protobuf.nano.l.e;
        this.g = com.google.a.a.a.a.b.a.b.a.as.a();
        this.h = "";
        this.i = 0;
        this.j = 0;
        this.k = "";
        this.l = 0;
        this.m = 0;
        this.a = -1;
        this.n = 0;
        this.a = -1;
        this.o = 0;
        this.aP = -1;
    }

    private static int a(int p0) {
        switch (p0) {
            case 0:
                return p0;
            case 1:
                return p0;
            case 2:
                return p0;
            case 3:
                return p0;
            case 4:
                return p0;
            case 5:
                return p0;
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
            default:
                break;
        }
        throw new IllegalArgumentException(55 + p0 + " is not a valid enum KeyboardLayoutVariation");
    }

    private final com.google.a.a.a.a.b.a.b.a.ar b(com.google.protobuf.nano.a p0) {
  3:    v3 = p0.a();
  7:    switch (v3) {
            case 0:
  7:            goto 16;
            case 8:
  7:            goto 17;
            case 16:
  7:            goto 24;
            case 26:
  7:            goto 31;
            case 32:
  7:            goto 38;
            case 42:
  7:            goto 87;
            case 50:
  7:            goto 151;
            case 56:
  7:            goto 159;
            case 64:
  7:            goto 210;
            case 106:
  7:            goto 218;
            case 114:
  7:            goto 238;
            case 120:
  7:            goto 259;
            case 122:
  7:            goto 339;
            case 130:
  7:            goto 430;
            case 136:
  7:            goto 438;
            case 160:
  7:            goto 446;
            default:
        }
 14:    if (super.a(p0, v3)) goto 3;
 16:    return this;
 21:    this.b = p0.i();
 23:    goto 3;
 28:    this.c = p0.i();
 30:    goto 3;
 35:    this.d = p0.f();
 37:    goto 3;
 42:    try {
 42:        v2 = p0.i();
 46:        switch (v2) {
                case 0:
 84:                try {
 84:                    this.e = v2;
                    }
                    catch (IllegalArgumentException ex) {
 77:                    p0.e(p0.o());
 80:                    this.a(p0, v3);
                    }
508:                break;
                case 1:
 84:                try {
 84:                    this.e = v2;
                    }
                    catch (IllegalArgumentException ex) {
 77:                    p0.e(p0.o());
 80:                    this.a(p0, v3);
                    }
508:                break;
                case 2:
 84:                try {
 84:                    this.e = v2;
                    }
                    catch (IllegalArgumentException ex) {
 77:                    p0.e(p0.o());
 80:                    this.a(p0, v3);
                    }
508:                break;
                case 3:
 84:                try {
 84:                    this.e = v2;
                    }
                    catch (IllegalArgumentException ex) {
 77:                    p0.e(p0.o());
 80:                    this.a(p0, v3);
                    }
508:                break;
                case 4:
 84:                try {
 84:                    this.e = v2;
                    }
                    catch (IllegalArgumentException ex) {
 77:                    p0.e(p0.o());
 80:                    this.a(p0, v3);
                    }
508:                break;
                default:
 75:                throw new IllegalArgumentException(46 + v2 + " is not a valid enum KeyboardLayout");
            }
        }
        catch (IllegalArgumentException ex) {
        }
 77:    p0.e(p0.o());
 80:    this.a(p0, v3);
 83:    goto 3;
 95:    if (this.g == 0)
 97:        v0 = 0;
        else
133:        v0 = this.g.length;
 99:    v2 = new as[com.google.protobuf.nano.l.a(p0, 42) + v0];
101:    if (v0 != 0)
105:        System.arraycopy(this.g, 0, v2, 0, v0);
108:    while (v0 < v2.length - 1) {
118:        v2[v0] = new com.google.a.a.a.a.b.a.b.a.as();
122:        p0.a(v2[v0]);
125:        p0.a();
128:        v0 = v0 + 1;
        }
130:    goto 135;
140:    v2[v0] = new com.google.a.a.a.a.b.a.b.a.as();
144:    p0.a(v2[v0]);
147:    this.g = v2;
149:    goto 3;
155:    this.h = p0.f();
157:    goto 3;
163:    try {
163:        v2 = p0.i();
167:        switch (v2) {
                case 0:
206:                try {
206:                    this.i = v2;
                    }
                    catch (IllegalArgumentException ex) {
198:                    p0.e(p0.o());
201:                    this.a(p0, v3);
                    }
508:                break;
                case 1:
206:                try {
206:                    this.i = v2;
                    }
                    catch (IllegalArgumentException ex) {
198:                    p0.e(p0.o());
201:                    this.a(p0, v3);
                    }
508:                break;
                case 2:
206:                try {
206:                    this.i = v2;
                    }
                    catch (IllegalArgumentException ex) {
198:                    p0.e(p0.o());
201:                    this.a(p0, v3);
                    }
508:                break;
                case 3:
206:                try {
206:                    this.i = v2;
                    }
                    catch (IllegalArgumentException ex) {
198:                    p0.e(p0.o());
201:                    this.a(p0, v3);
                    }
508:                break;
                default:
196:                throw new IllegalArgumentException(47 + v2 + " is not a valid enum RedactionScheme");
            }
        }
        catch (IllegalArgumentException ex) {
        }
198:    p0.e(p0.o());
201:    this.a(p0, v3);
204:    goto 3;
214:    this.l = p0.e();
216:    goto 3;
220:    if (this.n == 0)
227:        this.n = new com.google.a.a.a.a.b.a.b.a.z();
231:    p0.a(this.n);
234:    this.a = 0;
236:    goto 3;
240:    if (this.o == 0)
247:        this.o = new com.google.a.a.a.a.b.a.b.a.aa();
251:    p0.a(this.o);
255:    this.a = 1;
257:    goto 3;
259:    v4 = com.google.protobuf.nano.l.a(p0, 120);
263:    v5 = new int[v4];
265:    v2 = 0;
266:    v0 = 0;
267:    if (v2 >= v4) goto 301;
269:    if (v2 != 0)
271:        p0.a();
286:    v5[v0] = com.google.a.a.a.a.b.a.b.a.ar.a(p0.i());
288:    v0 = v0 + 1;
290:    v2 = v2 + 1;
292:    goto 267;
294:    p0.e(p0.o());
297:    this.a(p0, v3);
300:    goto 290;
301:    if (v0 != 0) {
305:        if (this.f == 0)
307:            v2 = 0;
            else
319:            v2 = this.f.length;
308:        if (v2 == 0 && v0 == v5.length)
313:            this.f = v5;
            else {
323:            v3 = new int[v2 + v0];
325:            if (v2 != 0)
329:                System.arraycopy(this.f, 0, v3, 0, v2);
332:            System.arraycopy(v5, 0, v3, v2, v0);
335:            this.f = v3;
            }
        }
315:    goto 3;
351:    v0 = 0;
356:    if (p0.m() <= 0) goto 368;
362:    com.google.a.a.a.a.b.a.b.a.ar.a(p0.i());
365:    v0 = v0 + 1;
367:    goto 352;
368:    if (v0 == 0) goto 425;
370:    p0.e(p0.o());
375:    if (this.f == 0)
377:        v2 = 0;
        else
413:        v2 = this.f.length;
379:    v0 = new int[v0 + v2];
381:    if (v2 != 0)
385:        System.arraycopy(this.f, 0, v0, 0, v2);
392:    if (p0.m() <= 0) goto 423;
406:    v0[v2] = com.google.a.a.a.a.b.a.b.a.ar.a(p0.i());
408:    v2 = v2 + 1;
410:    goto 388;
416:    p0.e(p0.o());
419:    this.a(p0, 120);
422:    goto 388;
423:    this.f = v0;
425:    p0.d(p0.c(p0.i()));
428:    goto 3;
434:    this.k = p0.f();
436:    goto 3;
442:    this.j = p0.e();
444:    goto 3;
450:    try {
450:        v2 = p0.i();
454:        switch (v2) {
                case 0:
493:                try {
493:                    this.m = v2;
                    }
                    catch (IllegalArgumentException ex) {
485:                    p0.e(p0.o());
488:                    this.a(p0, v3);
                    }
508:                break;
                case 1:
493:                try {
493:                    this.m = v2;
                    }
                    catch (IllegalArgumentException ex) {
485:                    p0.e(p0.o());
488:                    this.a(p0, v3);
                    }
508:                break;
                case 2:
493:                try {
493:                    this.m = v2;
                    }
                    catch (IllegalArgumentException ex) {
485:                    p0.e(p0.o());
488:                    this.a(p0, v3);
                    }
508:                break;
                case 3:
493:                try {
493:                    this.m = v2;
                    }
                    catch (IllegalArgumentException ex) {
485:                    p0.e(p0.o());
488:                    this.a(p0, v3);
                    }
508:                break;
                default:
483:                throw new IllegalArgumentException(40 + v2 + " is not a valid enum MaskType");
            }
        }
        catch (IllegalArgumentException ex) {
        }
485:    p0.e(p0.o());
488:    this.a(p0, v3);
491:    goto 3;
498:    goto 352;
501:    try
            run 398...408
        catch (IllegalArgumentException ex) {
398:        goto 415;
        }
502:    try
            run 358...365
        catch (IllegalArgumentException ex) {
358:        goto 497;
        }
503:    try
            run 278...288
        catch (IllegalArgumentException ex) {
278:        goto 293;
        }
    }

    public final com.google.a.a.a.a.b.a.b.a.z a() {
        if (this.a == 0)
            v0 = this.n;
        else
            v0 = 0;
        return v0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        if (this.b != 0)
            p0.a(1, this.b);
        if (this.c != 0)
            p0.a(2, this.c);
        if (this.d != 0 && !this.d.equals(""))
            p0.a(3, this.d);
        if (this.e != 0)
            p0.a(4, this.e);
        if (this.g != 0 && this.g.length > 0) {
            v0 = 0;
            while (v0 < this.g.length) {
                if (this.g[v0] != 0)
                    p0.b(5, this.g[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.h != 0 && !this.h.equals(""))
            p0.a(6, this.h);
        if (this.i != 0)
            p0.a(7, this.i);
        if (this.l != 0)
            p0.a(8, this.l);
        if (this.a == 0)
            p0.b(13, this.n);
        if (this.a == 1)
            p0.b(14, this.o);
        if (this.f != 0 && this.f.length > 0) {
            v0 = 0;
            v2 = 0;
            while (v0 < this.f.length) {
                v2 = v2 + CodedOutputByteBufferNano.c(this.f[v0]);
                v0 = v0 + 1;
            }
            p0.e(122);
            p0.e(v2);
            while (v1 < this.f.length) {
                p0.e(this.f[v1]);
                v1 = v1 + 1;
            }
        }
        if (this.k != 0 && !this.k.equals(""))
            p0.a(16, this.k);
        if (this.j != 0)
            p0.a(17, this.j);
        if (this.m != 0)
            p0.a(20, this.m);
        super.a(p0);
    }

    protected final int b() {
        v1 = 0;
        v0 = super.b();
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.b);
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.c);
        if (this.d != 0 && !this.d.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.d);
        if (this.e != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.e);
        if (this.g != 0 && this.g.length > 0) {
            v2 = v0;
            v0 = 0;
            while (v0 < this.g.length) {
                if (this.g[v0] != 0)
                    v2 = v2 + CodedOutputByteBufferNano.d(5, this.g[v0]);
                v0 = v0 + 1;
            }
            v0 = v2;
        }
        if (this.h != 0 && !this.h.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(6, this.h);
        if (this.i != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(7, this.i);
        if (this.l != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(8) + 1;
        if (this.a == 0)
            v0 = v0 + CodedOutputByteBufferNano.d(13, this.n);
        if (this.a == 1)
            v0 = v0 + CodedOutputByteBufferNano.d(14, this.o);
        if (this.f != 0 && this.f.length > 0) {
            v2 = 0;
            while (v1 < this.f.length) {
                v2 = v2 + CodedOutputByteBufferNano.c(this.f[v1]);
                v1 = v1 + 1;
            }
            v0 = v0 + v2 + 1 + CodedOutputByteBufferNano.f(v2);
        }
        if (this.k != 0 && !this.k.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(16, this.k);
        if (this.j != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(17) + 1;
        if (this.m != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(20, this.m);
        return v0;
    }

    public final com.google.a.a.a.a.b.a.b.a.aa c() {
        if (this.a == 1)
            v0 = this.o;
        else
            v0 = 0;
        return v0;
    }

}
