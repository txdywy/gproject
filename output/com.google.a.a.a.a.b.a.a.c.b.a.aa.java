package com.google.a.a.a.a.b.a.a.c.b.a;

import com.google.a.a.a.a.b.a.a.d.a.c;
import com.google.a.a.a.a.b.a.a.f.a;
import com.google.a.a.a.a.b.a.a.f.h;
import com.google.a.a.a.a.b.a.b.a.ad;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

protected final class com.google.a.a.a.a.b.a.a.c.b.a.aa extends com.google.protobuf.nano.b
{

    public com.google.a.a.a.a.b.a.a.f.h a;
    public String b;
    public com.google.a.a.a.a.b.a.b.a.ad c;
    public String d;
    public int e;
    public com.google.a.a.a.a.b.a.b.a.ad f;
    public String g;
    public String h;
    public int i;
    public int j;
    public int k;
    public int l;
    public com.google.a.a.a.a.b.a.a.f.a m;
    public com.google.a.a.a.a.b.a.a.c.b.a.ab n;
    public int[] o;
    public com.google.a.a.a.a.b.a.a.d.a.c p;

    aa() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = "";
        this.c = 0;
        this.d = "";
        this.e = 0;
        this.f = 0;
        this.g = "";
        this.h = "";
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = com.google.protobuf.nano.l.e;
        this.p = 0;
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
            default:
                break;
        }
        throw new IllegalArgumentException(49 + p0 + " is not a valid enum RelativeReference");
    }

    private final com.google.a.a.a.a.b.a.a.c.b.a.aa b(com.google.protobuf.nano.a p0) {
  3:    v3 = p0.a();
  7:    switch (v3) {
            case 0:
  7:            goto 16;
            case 18:
  7:            goto 17;
            case 24:
  7:            goto 24;
            case 32:
  7:            goto 31;
            case 40:
  7:            goto 38;
            case 48:
  7:            goto 45;
            case 56:
  7:            goto 52;
            case 66:
  7:            goto 59;
            case 74:
  7:            goto 66;
            case 80:
  7:            goto 83;
            case 82:
  7:            goto 163;
            case 90:
  7:            goto 254;
            case 98:
  7:            goto 272;
            case 106:
  7:            goto 280;
            case 114:
  7:            goto 288;
            case 122:
  7:            goto 306;
            case 130:
  7:            goto 324;
            case 138:
  7:            goto 342;
            default:
        }
 14:    if (super.a(p0, v3)) goto 3;
 16:    return this;
 21:    this.d = p0.f();
 23:    goto 3;
 28:    this.e = p0.i();
 30:    goto 3;
 35:    this.i = p0.i();
 37:    goto 3;
 42:    this.j = p0.i();
 44:    goto 3;
 49:    this.k = p0.i();
 51:    goto 3;
 56:    this.l = p0.i();
 58:    goto 3;
 63:    this.b = p0.f();
 65:    goto 3;
 68:    if (this.c == 0)
 75:        this.c = new com.google.a.a.a.a.b.a.b.a.ad();
 79:    p0.a(this.c);
 82:    goto 3;
 83:    v4 = com.google.protobuf.nano.l.a(p0, 80);
 87:    v5 = new int[v4];
 89:    v2 = 0;
 90:    v0 = 0;
 91:    if (v2 >= v4) goto 125;
 93:    if (v2 != 0)
 95:        p0.a();
110:    v5[v0] = com.google.a.a.a.a.b.a.a.c.b.a.aa.a(p0.i());
112:    v0 = v0 + 1;
114:    v2 = v2 + 1;
116:    goto 91;
118:    p0.e(p0.o());
121:    this.a(p0, v3);
124:    goto 114;
125:    if (v0 != 0) {
129:        if (this.o == 0)
131:            v2 = 0;
            else
143:            v2 = this.o.length;
132:        if (v2 == 0 && v0 == v5.length)
137:            this.o = v5;
            else {
147:            v3 = new int[v2 + v0];
149:            if (v2 != 0)
153:                System.arraycopy(this.o, 0, v3, 0, v2);
156:            System.arraycopy(v5, 0, v3, v2, v0);
159:            this.o = v3;
            }
        }
139:    goto 3;
175:    v0 = 0;
180:    if (p0.m() <= 0) goto 192;
186:    com.google.a.a.a.a.b.a.a.c.b.a.aa.a(p0.i());
189:    v0 = v0 + 1;
191:    goto 176;
192:    if (v0 == 0) goto 249;
194:    p0.e(p0.o());
199:    if (this.o == 0)
201:        v2 = 0;
        else
237:        v2 = this.o.length;
203:    v0 = new int[v0 + v2];
205:    if (v2 != 0)
209:        System.arraycopy(this.o, 0, v0, 0, v2);
216:    if (p0.m() <= 0) goto 247;
230:    v0[v2] = com.google.a.a.a.a.b.a.a.c.b.a.aa.a(p0.i());
232:    v2 = v2 + 1;
234:    goto 212;
240:    p0.e(p0.o());
243:    this.a(p0, 80);
246:    goto 212;
247:    this.o = v0;
249:    p0.d(p0.c(p0.i()));
252:    goto 3;
256:    if (this.f == 0)
263:        this.f = new com.google.a.a.a.a.b.a.b.a.ad();
267:    p0.a(this.f);
270:    goto 3;
276:    this.g = p0.f();
278:    goto 3;
284:    this.h = p0.f();
286:    goto 3;
290:    if (this.m == 0)
297:        this.m = new com.google.a.a.a.a.b.a.a.f.a();
301:    p0.a(this.m);
304:    goto 3;
308:    if (this.n == 0)
315:        this.n = new com.google.a.a.a.a.b.a.a.c.b.a.ab();
319:    p0.a(this.n);
322:    goto 3;
326:    if (this.p == 0)
333:        this.p = new com.google.a.a.a.a.b.a.a.d.a.c();
337:    p0.a(this.p);
340:    goto 3;
344:    if (this.a == 0)
351:        this.a = new com.google.a.a.a.a.b.a.a.f.h();
355:    p0.a(this.a);
358:    goto 3;
361:    goto 176;
362:    try
            run 222...232
        catch (IllegalArgumentException ex) {
222:        goto 239;
        }
363:    try
            run 182...189
        catch (IllegalArgumentException ex) {
182:        goto 360;
        }
364:    try
            run 102...112
        catch (IllegalArgumentException ex) {
102:        goto 117;
        }
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.d != 0 && !this.d.equals(""))
            p0.a(2, this.d);
        if (this.e != 0)
            p0.a(3, this.e);
        if (this.i != 0)
            p0.a(4, this.i);
        if (this.j != 0)
            p0.a(5, this.j);
        if (this.k != 0)
            p0.a(6, this.k);
        if (this.l != 0)
            p0.a(7, this.l);
        if (this.b != 0 && !this.b.equals(""))
            p0.a(8, this.b);
        if (this.c != 0)
            p0.b(9, this.c);
        if (this.o != 0 && this.o.length > 0) {
            v0 = 0;
            while (v0 < this.o.length) {
                p0.a(10, this.o[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.f != 0)
            p0.b(11, this.f);
        if (this.g != 0 && !this.g.equals(""))
            p0.a(12, this.g);
        if (this.h != 0 && !this.h.equals(""))
            p0.a(13, this.h);
        if (this.m != 0)
            p0.b(14, this.m);
        if (this.n != 0)
            p0.b(15, this.n);
        if (this.p != 0)
            p0.b(16, this.p);
        if (this.a != 0)
            p0.b(17, this.a);
        super.a(p0);
    }

    protected final int b() {
        v1 = 0;
        v0 = super.b();
        if (this.d != 0 && !this.d.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.d);
        if (this.e != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.e);
        if (this.i != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.i);
        if (this.j != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.j);
        if (this.k != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(6, this.k);
        if (this.l != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(7, this.l);
        if (this.b != 0 && !this.b.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(8, this.b);
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(9, this.c);
        if (this.o != 0 && this.o.length > 0) {
            v2 = 0;
            while (v1 < this.o.length) {
                v2 = v2 + CodedOutputByteBufferNano.c(this.o[v1]);
                v1 = v1 + 1;
            }
            v0 = v0 + v2 + this.o.length * 1;
        }
        if (this.f != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(11, this.f);
        if (this.g != 0 && !this.g.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(12, this.g);
        if (this.h != 0 && !this.h.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(13, this.h);
        if (this.m != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(14, this.m);
        if (this.n != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(15, this.n);
        if (this.p != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(16, this.p);
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(17, this.a);
        return v0;
    }

}
