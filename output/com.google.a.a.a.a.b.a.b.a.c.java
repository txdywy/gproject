package com.google.a.a.a.a.b.a.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

protected final class com.google.a.a.a.a.b.a.b.a.c extends com.google.protobuf.nano.b
{

    public static volatile c[] b;
    public int a;
    public int c;
    public com.google.a.a.a.a.b.a.b.a.d d;
    public com.google.a.a.a.a.b.a.b.a.f e;
    public long f;
    public String g;
    public com.google.a.a.a.a.b.a.b.a.ad h;
    public com.google.a.a.a.a.b.a.b.a.aj i;
    public long[] j;
    public int k;
    public int l;
    public int m;
    public com.google.a.a.a.a.b.a.b.a.e n;
    public c[] o;

    c() {
        com.google.protobuf.nano.b();
        this.a = -1;
        this.c = 0;
        this.a = -1;
        this.d = 0;
        this.a = -1;
        this.e = 0;
        this.f = 0;
        this.g = "";
        this.h = 0;
        this.i = 0;
        this.j = com.google.protobuf.nano.l.f;
        this.k = -1;
        this.l = -1;
        this.m = 0;
        this.n = 0;
        this.o = com.google.a.a.a.a.b.a.b.a.c.a();
        this.aP = -1;
    }

    public static c[] a() {
        if (com.google.a.a.a.a.b.a.b.a.c.b == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.a.a.a.a.b.a.b.a.c.b == 0)
                    com.google.a.a.a.a.b.a.b.a.c.b = new c[0];
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
        return com.google.a.a.a.a.b.a.b.a.c.b;
    }

    private final com.google.a.a.a.a.b.a.b.a.c b(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 10:
  5:            goto 15;
            case 18:
  5:            goto 22;
            case 26:
  5:            goto 39;
            case 40:
  5:            goto 56;
            case 42:
  5:            goto 107;
            case 56:
  5:            goto 173;
            case 64:
  5:            goto 198;
            case 72:
  5:            goto 249;
            case 80:
  5:            goto 257;
            case 90:
  5:            goto 265;
            case 104:
  5:            goto 329;
            case 114:
  5:            goto 337;
            case 130:
  5:            goto 355;
            case 138:
  5:            goto 375;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 19:    this.g = p0.f();
 21:    goto 1;
 24:    if (this.h == 0)
 31:        this.h = new com.google.a.a.a.a.b.a.b.a.ad();
 35:    p0.a(this.h);
 38:    goto 1;
 41:    if (this.i == 0)
 48:        this.i = new com.google.a.a.a.a.b.a.b.a.aj();
 52:    p0.a(this.i);
 55:    goto 1;
 64:    if (this.j == 0)
 66:        v0 = 0;
        else
 96:        v0 = this.j.length;
 68:    v2 = new long[com.google.protobuf.nano.l.a(p0, 40) + v0];
 70:    if (v0 != 0)
 74:        System.arraycopy(this.j, 0, v2, 0, v0);
 77:    while (v0 < v2.length - 1) {
 86:        v2[v0] = p0.j();
 88:        p0.a();
 91:        v0 = v0 + 1;
        }
 93:    goto 98;
102:    v2[v0] = p0.j();
104:    this.j = v2;
106:    goto 1;
119:    v0 = 0;
120:    while (p0.m() > 0) {
126:        p0.j();
129:        v0 = v0 + 1;
        }
132:    p0.e(p0.o());
137:    if (this.j == 0)
139:        v2 = 0;
        else
164:        v2 = this.j.length;
141:    v0 = new long[v0 + v2];
143:    if (v2 != 0)
147:        System.arraycopy(this.j, 0, v0, 0, v2);
150:    while (v2 < v0.length) {
157:        v0[v2] = p0.j();
159:        v2 = v2 + 1;
        }
161:    goto 166;
166:    this.j = v0;
168:    p0.d(p0.c(p0.i()));
171:    goto 1;
177:    try {
185:        this.m = com.google.a.a.a.a.b.a.b.a.au.a(p0.i());
        }
        catch (IllegalArgumentException ex) {
190:        p0.e(p0.o());
193:        this.a(p0, v0);
        }
187:    goto 1;
202:    try {
202:        v3 = p0.i();
206:        switch (v3) {
                case 0:
245:                try {
245:                    this.c = v3;
                    }
                    catch (IllegalArgumentException ex) {
237:                    p0.e(p0.o());
240:                    this.a(p0, v0);
                    }
398:                break;
                case 1:
245:                try {
245:                    this.c = v3;
                    }
                    catch (IllegalArgumentException ex) {
237:                    p0.e(p0.o());
240:                    this.a(p0, v0);
                    }
398:                break;
                case 2:
235:                throw new IllegalArgumentException(38 + v3 + " is not a valid enum UiType");
                case 3:
245:                try {
245:                    this.c = v3;
                    }
                    catch (IllegalArgumentException ex) {
237:                    p0.e(p0.o());
240:                    this.a(p0, v0);
                    }
398:                break;
                case 4:
245:                try {
245:                    this.c = v3;
                    }
                    catch (IllegalArgumentException ex) {
237:                    p0.e(p0.o());
240:                    this.a(p0, v0);
                    }
398:                break;
                case 5:
245:                try {
245:                    this.c = v3;
                    }
                    catch (IllegalArgumentException ex) {
237:                    p0.e(p0.o());
240:                    this.a(p0, v0);
                    }
398:                break;
                case 6:
245:                try {
245:                    this.c = v3;
                    }
                    catch (IllegalArgumentException ex) {
237:                    p0.e(p0.o());
240:                    this.a(p0, v0);
                    }
398:                break;
                case 7:
235:                throw new IllegalArgumentException(38 + v3 + " is not a valid enum UiType");
                case 8:
245:                try {
245:                    this.c = v3;
                    }
                    catch (IllegalArgumentException ex) {
237:                    p0.e(p0.o());
240:                    this.a(p0, v0);
                    }
398:                break;
                default:
235:                throw new IllegalArgumentException(38 + v3 + " is not a valid enum UiType");
            }
        }
        catch (IllegalArgumentException ex) {
        }
237:    p0.e(p0.o());
240:    this.a(p0, v0);
243:    goto 1;
253:    this.k = p0.i();
255:    goto 1;
261:    this.l = p0.i();
263:    goto 1;
273:    if (this.o == 0)
275:        v0 = 0;
        else
311:        v0 = this.o.length;
277:    v2 = new c[com.google.protobuf.nano.l.a(p0, 90) + v0];
279:    if (v0 != 0)
283:        System.arraycopy(this.o, 0, v2, 0, v0);
286:    while (v0 < v2.length - 1) {
296:        v2[v0] = new com.google.a.a.a.a.b.a.b.a.c();
300:        p0.a(v2[v0]);
303:        p0.a();
306:        v0 = v0 + 1;
        }
308:    goto 313;
318:    v2[v0] = new com.google.a.a.a.a.b.a.b.a.c();
322:    p0.a(v2[v0]);
325:    this.o = v2;
327:    goto 1;
333:    this.f = p0.j();
335:    goto 1;
339:    if (this.n == 0)
346:        this.n = new com.google.a.a.a.a.b.a.b.a.e();
350:    p0.a(this.n);
353:    goto 1;
357:    if (this.d == 0)
364:        this.d = new com.google.a.a.a.a.b.a.b.a.d();
368:    p0.a(this.d);
371:    this.a = 0;
373:    goto 1;
377:    if (this.e == 0)
384:        this.e = new com.google.a.a.a.a.b.a.b.a.f();
388:    p0.a(this.e);
392:    this.a = 1;
394:    goto 1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        if (this.g != 0 && !this.g.equals(""))
            p0.a(1, this.g);
        if (this.h != 0)
            p0.b(2, this.h);
        if (this.i != 0)
            p0.b(3, this.i);
        if (this.j != 0 && this.j.length > 0) {
            v0 = 0;
            while (v0 < this.j.length) {
                p0.b(5, this.j[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.m != 0)
            p0.a(7, this.m);
        if (this.c != 0)
            p0.a(8, this.c);
        if (this.k != -1)
            p0.a(9, this.k);
        if (this.l != -1)
            p0.a(10, this.l);
        if (this.o != 0 && this.o.length > 0)
            while (v1 < this.o.length) {
                if (this.o[v1] != 0)
                    p0.b(11, this.o[v1]);
                v1 = v1 + 1;
            }
        if (this.f != 0)
            p0.b(13, this.f);
        if (this.n != 0)
            p0.b(14, this.n);
        if (this.a == 0)
            p0.b(16, this.d);
        if (this.a == 1)
            p0.b(17, this.e);
        super.a(p0);
    }

    protected final int b() {
        v2 = 0;
        v0 = super.b();
        if (this.g != 0 && !this.g.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.g);
        if (this.h != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.h);
        if (this.i != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.i);
        if (this.j != 0 && this.j.length > 0) {
            v1 = 0;
            v3 = 0;
            while (v1 < this.j.length) {
                v3 = v3 + CodedOutputByteBufferNano.c(this.j[v1]);
                v1 = v1 + 1;
            }
            v0 = v0 + v3 + this.j.length * 1;
        }
        if (this.m != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(7, this.m);
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(8, this.c);
        if (this.k != -1)
            v0 = v0 + CodedOutputByteBufferNano.d(9, this.k);
        if (this.l != -1)
            v0 = v0 + CodedOutputByteBufferNano.d(10, this.l);
        if (this.o != 0 && this.o.length > 0)
            while (v2 < this.o.length) {
                if (this.o[v2] != 0)
                    v0 = v0 + CodedOutputByteBufferNano.d(11, this.o[v2]);
                v2 = v2 + 1;
            }
        if (this.f != 0)
            v0 = v0 + CodedOutputByteBufferNano.f(13, this.f);
        if (this.n != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(14, this.n);
        if (this.a == 0)
            v0 = v0 + CodedOutputByteBufferNano.d(16, this.d);
        if (this.a == 1)
            v0 = v0 + CodedOutputByteBufferNano.d(17, this.e);
        return v0;
    }

}
