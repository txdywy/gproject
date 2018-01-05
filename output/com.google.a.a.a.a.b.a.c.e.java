package com.google.a.a.a.a.b.a.c;

import com.google.h.c.b.a.a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;
import java.util.Arrays;

protected final class com.google.a.a.a.a.b.a.c.e extends com.google.protobuf.nano.b
{

    public long a;
    public byte[] b;
    public byte[] c;
    public String d;
    public byte[] e;
    public int[] f;
    public int g;
    public int[] h;
    public boolean i;

    e() {
        com.google.protobuf.nano.b();
        this.a = -1;
        this.b = com.google.protobuf.nano.l.l;
        this.c = com.google.protobuf.nano.l.l;
        this.d = "";
        this.e = com.google.protobuf.nano.l.l;
        this.f = com.google.protobuf.nano.l.e;
        this.g = 0;
        this.h = com.google.protobuf.nano.l.e;
        this.i = 0;
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
            default:
                break;
        }
        throw new IllegalArgumentException(51 + p0 + " is not a valid enum GlobalClientFeature");
    }

    private final com.google.a.a.a.a.b.a.c.e b(com.google.protobuf.nano.a p0) {
  5:    v3 = p0.a();
  9:    switch (v3) {
            case 0:
  9:            goto 18;
            case 8:
  9:            goto 19;
            case 18:
  9:            goto 26;
            case 42:
  9:            goto 33;
            case 50:
  9:            goto 40;
            case 58:
  9:            goto 47;
            case 64:
  9:            goto 54;
            case 66:
  9:            goto 132;
            case 80:
  9:            goto 223;
            case 104:
  9:            goto 274;
            case 106:
  9:            goto 354;
            case 120:
  9:            goto 445;
            default:
        }
 16:    if (super.a(p0, v3)) goto 5;
 18:    return this;
 23:    this.a = p0.j();
 25:    goto 5;
 30:    this.b = p0.g();
 32:    goto 5;
 37:    this.c = p0.g();
 39:    goto 5;
 44:    this.d = p0.f();
 46:    goto 5;
 51:    this.e = p0.g();
 53:    goto 5;
 54:    v4 = com.google.protobuf.nano.l.a(p0, 64);
 58:    v5 = new int[v4];
 60:    v2 = 0;
 61:    v0 = 0;
 62:    if (v2 >= v4) goto 96;
 64:    if (v2 != 0)
 66:        p0.a();
 81:    v5[v0] = com.google.a.a.a.a.b.a.c.e.a(p0.i());
 83:    v0 = v0 + 1;
 85:    v2 = v2 + 1;
 87:    goto 62;
 89:    p0.e(p0.o());
 92:    this.a(p0, v3);
 95:    goto 85;
 96:    if (v0 != 0) {
100:        if (this.f == 0)
102:            v2 = 0;
            else
113:            v2 = this.f.length;
103:        if (v2 == 0 && v0 == v5.length)
108:            this.f = v5;
            else {
117:            v3 = new int[v2 + v0];
119:            if (v2 != 0)
123:                System.arraycopy(this.f, 0, v3, 0, v2);
126:            System.arraycopy(v5, 0, v3, v2, v0);
129:            this.f = v3;
            }
        }
110:    goto 5;
144:    v0 = 0;
149:    if (p0.m() <= 0) goto 161;
155:    com.google.a.a.a.a.b.a.c.e.a(p0.i());
158:    v0 = v0 + 1;
160:    goto 145;
161:    if (v0 == 0) goto 218;
163:    p0.e(p0.o());
168:    if (this.f == 0)
170:        v2 = 0;
        else
206:        v2 = this.f.length;
172:    v0 = new int[v0 + v2];
174:    if (v2 != 0)
178:        System.arraycopy(this.f, 0, v0, 0, v2);
185:    if (p0.m() <= 0) goto 216;
199:    v0[v2] = com.google.a.a.a.a.b.a.c.e.a(p0.i());
201:    v2 = v2 + 1;
203:    goto 181;
209:    p0.e(p0.o());
212:    this.a(p0, 64);
215:    goto 181;
216:    this.f = v0;
218:    p0.d(p0.c(p0.i()));
221:    goto 5;
227:    try {
227:        v2 = p0.i();
231:        switch (v2) {
                case 0:
270:                try {
270:                    this.g = v2;
                    }
                    catch (IllegalArgumentException ex) {
262:                    p0.e(p0.o());
265:                    this.a(p0, v3);
                    }
465:                break;
                case 1:
260:                throw new IllegalArgumentException(46 + v2 + " is not a valid enum ClientLogLevel");
                case 2:
270:                try {
270:                    this.g = v2;
                    }
                    catch (IllegalArgumentException ex) {
262:                    p0.e(p0.o());
265:                    this.a(p0, v3);
                    }
465:                break;
                case 3:
260:                throw new IllegalArgumentException(46 + v2 + " is not a valid enum ClientLogLevel");
                case 4:
260:                throw new IllegalArgumentException(46 + v2 + " is not a valid enum ClientLogLevel");
                case 5:
270:                try {
270:                    this.g = v2;
                    }
                    catch (IllegalArgumentException ex) {
262:                    p0.e(p0.o());
265:                    this.a(p0, v3);
                    }
465:                break;
                case 6:
270:                try {
270:                    this.g = v2;
                    }
                    catch (IllegalArgumentException ex) {
262:                    p0.e(p0.o());
265:                    this.a(p0, v3);
                    }
465:                break;
                default:
260:                throw new IllegalArgumentException(46 + v2 + " is not a valid enum ClientLogLevel");
            }
        }
        catch (IllegalArgumentException ex) {
        }
262:    p0.e(p0.o());
265:    this.a(p0, v3);
268:    goto 5;
274:    v4 = com.google.protobuf.nano.l.a(p0, 104);
278:    v5 = new int[v4];
280:    v2 = 0;
281:    v0 = 0;
282:    if (v2 >= v4) goto 316;
284:    if (v2 != 0)
286:        p0.a();
301:    v5[v0] = com.google.h.c.b.a.a.a(p0.i());
303:    v0 = v0 + 1;
305:    v2 = v2 + 1;
307:    goto 282;
309:    p0.e(p0.o());
312:    this.a(p0, v3);
315:    goto 305;
316:    if (v0 != 0) {
320:        if (this.h == 0)
322:            v2 = 0;
            else
334:            v2 = this.h.length;
323:        if (v2 == 0 && v0 == v5.length)
328:            this.h = v5;
            else {
338:            v3 = new int[v2 + v0];
340:            if (v2 != 0)
344:                System.arraycopy(this.h, 0, v3, 0, v2);
347:            System.arraycopy(v5, 0, v3, v2, v0);
350:            this.h = v3;
            }
        }
330:    goto 5;
366:    v0 = 0;
371:    if (p0.m() <= 0) goto 383;
377:    com.google.h.c.b.a.a.a(p0.i());
380:    v0 = v0 + 1;
382:    goto 367;
383:    if (v0 == 0) goto 440;
385:    p0.e(p0.o());
390:    if (this.h == 0)
392:        v2 = 0;
        else
428:        v2 = this.h.length;
394:    v0 = new int[v0 + v2];
396:    if (v2 != 0)
400:        System.arraycopy(this.h, 0, v0, 0, v2);
407:    if (p0.m() <= 0) goto 438;
421:    v0[v2] = com.google.h.c.b.a.a.a(p0.i());
423:    v2 = v2 + 1;
425:    goto 403;
431:    p0.e(p0.o());
434:    this.a(p0, 104);
437:    goto 403;
438:    this.h = v0;
440:    p0.d(p0.c(p0.i()));
443:    goto 5;
449:    this.i = p0.e();
451:    goto 5;
454:    goto 367;
456:    goto 145;
457:    try
            run 413...423
        catch (IllegalArgumentException ex) {
413:        goto 430;
        }
458:    try
            run 373...380
        catch (IllegalArgumentException ex) {
373:        goto 453;
        }
459:    try
            run 293...303
        catch (IllegalArgumentException ex) {
293:        goto 308;
        }
462:    try
            run 191...201
        catch (IllegalArgumentException ex) {
191:        goto 208;
        }
463:    try
            run 151...158
        catch (IllegalArgumentException ex) {
151:        goto 455;
        }
464:    try
            run 73...83
        catch (IllegalArgumentException ex) {
 73:        goto 88;
        }
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        if (this.a != -1)
            p0.b(1, this.a);
        if (!Arrays.equals(this.b, com.google.protobuf.nano.l.l))
            p0.a(2, this.b);
        if (!Arrays.equals(this.c, com.google.protobuf.nano.l.l))
            p0.a(5, this.c);
        if (this.d != 0 && !this.d.equals(""))
            p0.a(6, this.d);
        if (!Arrays.equals(this.e, com.google.protobuf.nano.l.l))
            p0.a(7, this.e);
        if (this.f != 0 && this.f.length > 0) {
            v0 = 0;
            while (v0 < this.f.length) {
                p0.a(8, this.f[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.g != 0)
            p0.a(10, this.g);
        if (this.h != 0 && this.h.length > 0) {
            v0 = 0;
            v2 = 0;
            while (v0 < this.h.length) {
                v2 = v2 + CodedOutputByteBufferNano.c(this.h[v0]);
                v0 = v0 + 1;
            }
            p0.e(106);
            p0.e(v2);
            while (v1 < this.h.length) {
                p0.e(this.h[v1]);
                v1 = v1 + 1;
            }
        }
        if (this.i != 0)
            p0.a(15, this.i);
        super.a(p0);
    }

    protected final int b() {
        v2 = 0;
        v0 = super.b();
        if (this.a != -1)
            v0 = v0 + CodedOutputByteBufferNano.f(1, this.a);
        if (!Arrays.equals(this.b, com.google.protobuf.nano.l.l))
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.b);
        if (!Arrays.equals(this.c, com.google.protobuf.nano.l.l))
            v0 = v0 + CodedOutputByteBufferNano.b(5, this.c);
        if (this.d != 0 && !this.d.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(6, this.d);
        if (!Arrays.equals(this.e, com.google.protobuf.nano.l.l))
            v0 = v0 + CodedOutputByteBufferNano.b(7, this.e);
        if (this.f != 0 && this.f.length > 0) {
            v1 = 0;
            v3 = 0;
            while (v1 < this.f.length) {
                v3 = v3 + CodedOutputByteBufferNano.c(this.f[v1]);
                v1 = v1 + 1;
            }
            v0 = v0 + v3 + this.f.length * 1;
        }
        if (this.g != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(10, this.g);
        if (this.h != 0 && this.h.length > 0) {
            v1 = 0;
            while (v2 < this.h.length) {
                v1 = v1 + CodedOutputByteBufferNano.c(this.h[v2]);
                v2 = v2 + 1;
            }
            v0 = v0 + v1 + 1 + CodedOutputByteBufferNano.f(v1);
        }
        if (this.i != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(15) + 1;
        return v0;
    }

}
