package com.google.a.a.a.a.b.a.a.c.b.a;

import com.google.a.a.a.a.b.a.a.d.a.a;
import com.google.a.a.a.a.b.a.a.f.h;
import com.google.a.a.a.a.b.a.b.a.ad;
import com.google.a.a.a.a.b.a.b.a.ae;
import com.google.a.a.a.a.b.a.b.a.al;
import com.google.h.c.c.b.d.a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

protected final class com.google.a.a.a.a.b.a.a.c.b.a.l extends com.google.protobuf.nano.b
{

    public com.google.a.a.a.a.b.a.a.f.h a;
    public al[] b;
    public com.google.a.a.a.a.b.a.b.a.ad c;
    public com.google.a.a.a.a.b.a.b.a.ad d;
    public com.google.a.a.a.a.b.a.a.d.a.a e;
    public com.google.a.a.a.a.b.a.b.a.ae f;
    public long g;
    public int[] h;

    l() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = com.google.a.a.a.a.b.a.b.a.al.a();
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = com.google.protobuf.nano.l.e;
        this.aP = -1;
    }

    private final com.google.a.a.a.a.b.a.a.c.b.a.l b(com.google.protobuf.nano.a p0) {
  3:    v3 = p0.a();
  7:    switch (v3) {
            case 0:
  7:            goto 16;
            case 10:
  7:            goto 17;
            case 18:
  7:            goto 34;
            case 26:
  7:            goto 97;
            case 34:
  7:            goto 114;
            case 42:
  7:            goto 131;
            case 48:
  7:            goto 149;
            case 58:
  7:            goto 157;
            case 64:
  7:            goto 175;
            case 66:
  7:            goto 255;
            default:
        }
 14:    if (super.a(p0, v3)) goto 3;
 16:    return this;
 19:    if (this.a == 0)
 26:        this.a = new com.google.a.a.a.a.b.a.a.f.h();
 30:    p0.a(this.a);
 33:    goto 3;
 42:    if (this.b == 0)
 44:        v0 = 0;
        else
 80:        v0 = this.b.length;
 46:    v2 = new al[com.google.protobuf.nano.l.a(p0, 18) + v0];
 48:    if (v0 != 0)
 52:        System.arraycopy(this.b, 0, v2, 0, v0);
 55:    while (v0 < v2.length - 1) {
 65:        v2[v0] = new com.google.a.a.a.a.b.a.b.a.al();
 69:        p0.a(v2[v0]);
 72:        p0.a();
 75:        v0 = v0 + 1;
        }
 77:    goto 82;
 87:    v2[v0] = new com.google.a.a.a.a.b.a.b.a.al();
 91:    p0.a(v2[v0]);
 94:    this.b = v2;
 96:    goto 3;
 99:    if (this.c == 0)
106:        this.c = new com.google.a.a.a.a.b.a.b.a.ad();
110:    p0.a(this.c);
113:    goto 3;
116:    if (this.e == 0)
123:        this.e = new com.google.a.a.a.a.b.a.a.d.a.a();
127:    p0.a(this.e);
130:    goto 3;
133:    if (this.f == 0)
140:        this.f = new com.google.a.a.a.a.b.a.b.a.ae();
144:    p0.a(this.f);
147:    goto 3;
153:    this.g = p0.j();
155:    goto 3;
159:    if (this.d == 0)
166:        this.d = new com.google.a.a.a.a.b.a.b.a.ad();
170:    p0.a(this.d);
173:    goto 3;
175:    v4 = com.google.protobuf.nano.l.a(p0, 64);
179:    v5 = new int[v4];
181:    v2 = 0;
182:    v0 = 0;
183:    if (v2 >= v4) goto 217;
185:    if (v2 != 0)
187:        p0.a();
202:    v5[v0] = com.google.h.c.c.b.d.a.a(p0.i());
204:    v0 = v0 + 1;
206:    v2 = v2 + 1;
208:    goto 183;
210:    p0.e(p0.o());
213:    this.a(p0, v3);
216:    goto 206;
217:    if (v0 != 0) {
221:        if (this.h == 0)
223:            v2 = 0;
            else
235:            v2 = this.h.length;
224:        if (v2 == 0 && v0 == v5.length)
229:            this.h = v5;
            else {
239:            v3 = new int[v2 + v0];
241:            if (v2 != 0)
245:                System.arraycopy(this.h, 0, v3, 0, v2);
248:            System.arraycopy(v5, 0, v3, v2, v0);
251:            this.h = v3;
            }
        }
231:    goto 3;
267:    v0 = 0;
272:    if (p0.m() <= 0) goto 284;
278:    com.google.h.c.c.b.d.a.a(p0.i());
281:    v0 = v0 + 1;
283:    goto 268;
284:    if (v0 == 0) goto 341;
286:    p0.e(p0.o());
291:    if (this.h == 0)
293:        v2 = 0;
        else
329:        v2 = this.h.length;
295:    v0 = new int[v0 + v2];
297:    if (v2 != 0)
301:        System.arraycopy(this.h, 0, v0, 0, v2);
308:    if (p0.m() <= 0) goto 339;
322:    v0[v2] = com.google.h.c.c.b.d.a.a(p0.i());
324:    v2 = v2 + 1;
326:    goto 304;
332:    p0.e(p0.o());
335:    this.a(p0, 64);
338:    goto 304;
339:    this.h = v0;
341:    p0.d(p0.c(p0.i()));
344:    goto 3;
347:    goto 268;
348:    try
            run 314...324
        catch (IllegalArgumentException ex) {
314:        goto 331;
        }
349:    try
            run 274...281
        catch (IllegalArgumentException ex) {
274:        goto 346;
        }
350:    try
            run 194...204
        catch (IllegalArgumentException ex) {
194:        goto 209;
        }
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        if (this.a != 0)
            p0.b(1, this.a);
        if (this.b != 0 && this.b.length > 0) {
            v0 = 0;
            while (v0 < this.b.length) {
                if (this.b[v0] != 0)
                    p0.b(2, this.b[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.c != 0)
            p0.b(3, this.c);
        if (this.e != 0)
            p0.b(4, this.e);
        if (this.f != 0)
            p0.b(5, this.f);
        if (this.g != 0)
            p0.b(6, this.g);
        if (this.d != 0)
            p0.b(7, this.d);
        if (this.h != 0 && this.h.length > 0)
            while (v1 < this.h.length) {
                p0.a(8, this.h[v1]);
                v1 = v1 + 1;
            }
        super.a(p0);
    }

    protected final int b() {
        v1 = 0;
        v0 = super.b();
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.a);
        if (this.b != 0 && this.b.length > 0) {
            v2 = v0;
            v0 = 0;
            while (v0 < this.b.length) {
                if (this.b[v0] != 0)
                    v2 = v2 + CodedOutputByteBufferNano.d(2, this.b[v0]);
                v0 = v0 + 1;
            }
            v0 = v2;
        }
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.c);
        if (this.e != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.e);
        if (this.f != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.f);
        if (this.g != 0)
            v0 = v0 + CodedOutputByteBufferNano.f(6, this.g);
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(7, this.d);
        if (this.h != 0 && this.h.length > 0) {
            v2 = 0;
            while (v1 < this.h.length) {
                v2 = v2 + CodedOutputByteBufferNano.c(this.h[v1]);
                v1 = v1 + 1;
            }
            v0 = v0 + v2 + this.h.length * 1;
        }
        return v0;
    }

}
