package com.google.a.a.a.a.b.a.a.c.b.a;

import com.google.a.a.a.a.b.a.a.d.a.a;
import com.google.a.a.a.a.b.a.a.f.a;
import com.google.a.a.a.a.b.a.a.f.h;
import com.google.a.a.a.a.b.a.b.a.ad;
import com.google.a.a.a.a.b.a.b.a.ae;
import com.google.a.a.a.a.b.a.b.a.ak;
import com.google.a.a.a.a.b.a.b.a.al;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

protected final class com.google.a.a.a.a.b.a.a.c.b.a.a extends com.google.protobuf.nano.b
{

    public com.google.a.a.a.a.b.a.a.f.h a;
    public com.google.a.a.a.a.b.a.b.a.ae b;
    public al[] c;
    public ak[] d;
    public int[] e;
    public ad[] f;
    public com.google.a.a.a.a.b.a.a.f.a g;
    public com.google.a.a.a.a.b.a.a.f.a h;
    public a[] i;

    a() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = com.google.a.a.a.a.b.a.b.a.al.a();
        this.d = com.google.a.a.a.a.b.a.b.a.ak.a();
        this.e = com.google.protobuf.nano.l.e;
        this.f = com.google.a.a.a.a.b.a.b.a.ad.a();
        this.g = 0;
        this.h = 0;
        this.i = com.google.a.a.a.a.b.a.a.d.a.a.a();
        this.aP = -1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 26:
  5:            goto 15;
            case 34:
  5:            goto 78;
            case 42:
  5:            goto 142;
            case 50:
  5:            goto 160;
            case 66:
  5:            goto 178;
            case 82:
  5:            goto 242;
            case 90:
  5:            goto 260;
            case 96:
  5:            goto 324;
            case 98:
  5:            goto 376;
            case 106:
  5:            goto 442;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 23:    if (this.c == 0)
 25:        v0 = 0;
        else
 61:        v0 = this.c.length;
 27:    v2 = new al[com.google.protobuf.nano.l.a(p0, 26) + v0];
 29:    if (v0 != 0)
 33:        System.arraycopy(this.c, 0, v2, 0, v0);
 36:    while (v0 < v2.length - 1) {
 46:        v2[v0] = new com.google.a.a.a.a.b.a.b.a.al();
 50:        p0.a(v2[v0]);
 53:        p0.a();
 56:        v0 = v0 + 1;
        }
 58:    goto 63;
 68:    v2[v0] = new com.google.a.a.a.a.b.a.b.a.al();
 72:    p0.a(v2[v0]);
 75:    this.c = v2;
 77:    goto 1;
 86:    if (this.f == 0)
 88:        v0 = 0;
        else
124:        v0 = this.f.length;
 90:    v2 = new ad[com.google.protobuf.nano.l.a(p0, 34) + v0];
 92:    if (v0 != 0)
 96:        System.arraycopy(this.f, 0, v2, 0, v0);
 99:    while (v0 < v2.length - 1) {
109:        v2[v0] = new com.google.a.a.a.a.b.a.b.a.ad();
113:        p0.a(v2[v0]);
116:        p0.a();
119:        v0 = v0 + 1;
        }
121:    goto 126;
131:    v2[v0] = new com.google.a.a.a.a.b.a.b.a.ad();
135:    p0.a(v2[v0]);
138:    this.f = v2;
140:    goto 1;
144:    if (this.g == 0)
151:        this.g = new com.google.a.a.a.a.b.a.a.f.a();
155:    p0.a(this.g);
158:    goto 1;
162:    if (this.h == 0)
169:        this.h = new com.google.a.a.a.a.b.a.a.f.a();
173:    p0.a(this.h);
176:    goto 1;
186:    if (this.i == 0)
188:        v0 = 0;
        else
224:        v0 = this.i.length;
190:    v2 = new a[com.google.protobuf.nano.l.a(p0, 66) + v0];
192:    if (v0 != 0)
196:        System.arraycopy(this.i, 0, v2, 0, v0);
199:    while (v0 < v2.length - 1) {
209:        v2[v0] = new com.google.a.a.a.a.b.a.a.d.a.a();
213:        p0.a(v2[v0]);
216:        p0.a();
219:        v0 = v0 + 1;
        }
221:    goto 226;
231:    v2[v0] = new com.google.a.a.a.a.b.a.a.d.a.a();
235:    p0.a(v2[v0]);
238:    this.i = v2;
240:    goto 1;
244:    if (this.b == 0)
251:        this.b = new com.google.a.a.a.a.b.a.b.a.ae();
255:    p0.a(this.b);
258:    goto 1;
268:    if (this.d == 0)
270:        v0 = 0;
        else
306:        v0 = this.d.length;
272:    v2 = new ak[com.google.protobuf.nano.l.a(p0, 90) + v0];
274:    if (v0 != 0)
278:        System.arraycopy(this.d, 0, v2, 0, v0);
281:    while (v0 < v2.length - 1) {
291:        v2[v0] = new com.google.a.a.a.a.b.a.b.a.ak();
295:        p0.a(v2[v0]);
298:        p0.a();
301:        v0 = v0 + 1;
        }
303:    goto 308;
313:    v2[v0] = new com.google.a.a.a.a.b.a.b.a.ak();
317:    p0.a(v2[v0]);
320:    this.d = v2;
322:    goto 1;
332:    if (this.e == 0)
334:        v0 = 0;
        else
364:        v0 = this.e.length;
336:    v2 = new int[com.google.protobuf.nano.l.a(p0, 96) + v0];
338:    if (v0 != 0)
342:        System.arraycopy(this.e, 0, v2, 0, v0);
345:    while (v0 < v2.length - 1) {
354:        v2[v0] = p0.i();
356:        p0.a();
359:        v0 = v0 + 1;
        }
361:    goto 366;
370:    v2[v0] = p0.i();
372:    this.e = v2;
374:    goto 1;
388:    v0 = 0;
389:    while (p0.m() > 0) {
395:        p0.i();
398:        v0 = v0 + 1;
        }
401:    p0.e(p0.o());
406:    if (this.e == 0)
408:        v2 = 0;
        else
433:        v2 = this.e.length;
410:    v0 = new int[v0 + v2];
412:    if (v2 != 0)
416:        System.arraycopy(this.e, 0, v0, 0, v2);
419:    while (v2 < v0.length) {
426:        v0[v2] = p0.i();
428:        v2 = v2 + 1;
        }
430:    goto 435;
435:    this.e = v0;
437:    p0.d(p0.c(p0.i()));
440:    goto 1;
444:    if (this.a == 0)
451:        this.a = new com.google.a.a.a.a.b.a.a.f.h();
455:    p0.a(this.a);
458:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        if (this.c != 0 && this.c.length > 0) {
            v0 = 0;
            while (v0 < this.c.length) {
                if (this.c[v0] != 0)
                    p0.b(3, this.c[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.f != 0 && this.f.length > 0) {
            v0 = 0;
            while (v0 < this.f.length) {
                if (this.f[v0] != 0)
                    p0.b(4, this.f[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.g != 0)
            p0.b(5, this.g);
        if (this.h != 0)
            p0.b(6, this.h);
        if (this.i != 0 && this.i.length > 0) {
            v0 = 0;
            while (v0 < this.i.length) {
                if (this.i[v0] != 0)
                    p0.b(8, this.i[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.b != 0)
            p0.b(10, this.b);
        if (this.d != 0 && this.d.length > 0) {
            v0 = 0;
            while (v0 < this.d.length) {
                if (this.d[v0] != 0)
                    p0.b(11, this.d[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.e != 0 && this.e.length > 0)
            while (v1 < this.e.length) {
                p0.a(12, this.e[v1]);
                v1 = v1 + 1;
            }
        if (this.a != 0)
            p0.b(13, this.a);
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
                    v2 = v2 + CodedOutputByteBufferNano.d(3, this.c[v0]);
                v0 = v0 + 1;
            }
            v0 = v2;
        }
        if (this.f != 0 && this.f.length > 0) {
            v2 = v0;
            v0 = 0;
            while (v0 < this.f.length) {
                if (this.f[v0] != 0)
                    v2 = v2 + CodedOutputByteBufferNano.d(4, this.f[v0]);
                v0 = v0 + 1;
            }
            v0 = v2;
        }
        if (this.g != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.g);
        if (this.h != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(6, this.h);
        if (this.i != 0 && this.i.length > 0) {
            v2 = v0;
            v0 = 0;
            while (v0 < this.i.length) {
                if (this.i[v0] != 0)
                    v2 = v2 + CodedOutputByteBufferNano.d(8, this.i[v0]);
                v0 = v0 + 1;
            }
            v0 = v2;
        }
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(10, this.b);
        if (this.d != 0 && this.d.length > 0) {
            v2 = v0;
            v0 = 0;
            while (v0 < this.d.length) {
                if (this.d[v0] != 0)
                    v2 = v2 + CodedOutputByteBufferNano.d(11, this.d[v0]);
                v0 = v0 + 1;
            }
            v0 = v2;
        }
        if (this.e != 0 && this.e.length > 0) {
            v2 = 0;
            while (v1 < this.e.length) {
                v2 = v2 + CodedOutputByteBufferNano.c(this.e[v1]);
                v1 = v1 + 1;
            }
            v0 = v0 + v2 + this.e.length * 1;
        }
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(13, this.a);
        return v0;
    }

}
