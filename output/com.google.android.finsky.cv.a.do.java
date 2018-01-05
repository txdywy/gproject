package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

public final class com.google.android.finsky.cv.a.do extends com.google.protobuf.nano.b
{

    public int a;
    public int b;
    public String[] c;
    public long[] d;
    public long[] e;
    public double[] f;

    do() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = com.google.protobuf.nano.l.j;
        this.d = com.google.protobuf.nano.l.f;
        this.e = com.google.protobuf.nano.l.f;
        this.f = com.google.protobuf.nano.l.h;
        this.aO = 0;
        this.aP = -1;
    }

    private final com.google.android.finsky.cv.a.do b(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 8:
  5:            goto 15;
            case 18:
  5:            goto 76;
            case 25:
  5:            goto 127;
            case 26:
  5:            goto 179;
            case 32:
  5:            goto 227;
            case 34:
  5:            goto 279;
            case 41:
  5:            goto 345;
            case 42:
  5:            goto 405;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 19:    this.a = this.a | 1;
 25:    try {
 25:        v3 = p0.i();
 29:        switch (v3) {
                case 0:
 67:                try {
 67:                    this.b = v3;
 73:                    this.a = this.a | 1;
                    }
                    catch (IllegalArgumentException ex) {
 60:                    p0.e(p0.o());
 63:                    this.a(p0, v0);
                    }
458:                break;
                case 1:
 67:                try {
 67:                    this.b = v3;
 73:                    this.a = this.a | 1;
                    }
                    catch (IllegalArgumentException ex) {
 60:                    p0.e(p0.o());
 63:                    this.a(p0, v0);
                    }
458:                break;
                default:
 58:                throw new IllegalArgumentException(34 + v3 + " is not a valid enum Id");
            }
        }
        catch (IllegalArgumentException ex) {
        }
 60:    p0.e(p0.o());
 63:    this.a(p0, v0);
 66:    goto 1;
 84:    if (this.c == 0)
 86:        v0 = 0;
        else
116:        v0 = this.c.length;
 88:    v2 = new String[com.google.protobuf.nano.l.a(p0, 18) + v0];
 90:    if (v0 != 0)
 94:        System.arraycopy(this.c, 0, v2, 0, v0);
 97:    while (v0 < v2.length - 1) {
106:        v2[v0] = p0.f();
108:        p0.a();
111:        v0 = v0 + 1;
        }
113:    goto 118;
122:    v2[v0] = p0.f();
124:    this.c = v2;
126:    goto 1;
135:    if (this.d == 0)
137:        v0 = 0;
        else
167:        v0 = this.d.length;
139:    v2 = new long[com.google.protobuf.nano.l.a(p0, 25) + v0];
141:    if (v0 != 0)
145:        System.arraycopy(this.d, 0, v2, 0, v0);
148:    while (v0 < v2.length - 1) {
157:        v2[v0] = p0.l();
159:        p0.a();
162:        v0 = v0 + 1;
        }
164:    goto 169;
173:    v2[v0] = p0.l();
175:    this.d = v2;
177:    goto 1;
179:    v0 = p0.i();
183:    v2 = p0.c(v0);
187:    v3 = v0 / 8;
191:    if (this.d == 0)
193:        v0 = 0;
        else
218:        v0 = this.d.length;
195:    v3 = new long[v3 + v0];
197:    if (v0 != 0)
201:        System.arraycopy(this.d, 0, v3, 0, v0);
204:    while (v0 < v3.length) {
211:        v3[v0] = p0.l();
213:        v0 = v0 + 1;
        }
215:    goto 220;
220:    this.d = v3;
222:    p0.d(v2);
225:    goto 1;
235:    if (this.e == 0)
237:        v0 = 0;
        else
267:        v0 = this.e.length;
239:    v2 = new long[com.google.protobuf.nano.l.a(p0, 32) + v0];
241:    if (v0 != 0)
245:        System.arraycopy(this.e, 0, v2, 0, v0);
248:    while (v0 < v2.length - 1) {
257:        v2[v0] = p0.j();
259:        p0.a();
262:        v0 = v0 + 1;
        }
264:    goto 269;
273:    v2[v0] = p0.j();
275:    this.e = v2;
277:    goto 1;
291:    v0 = 0;
292:    while (p0.m() > 0) {
298:        p0.j();
301:        v0 = v0 + 1;
        }
304:    p0.e(p0.o());
309:    if (this.e == 0)
311:        v2 = 0;
        else
336:        v2 = this.e.length;
313:    v0 = new long[v0 + v2];
315:    if (v2 != 0)
319:        System.arraycopy(this.e, 0, v0, 0, v2);
322:    while (v2 < v0.length) {
329:        v0[v2] = p0.j();
331:        v2 = v2 + 1;
        }
333:    goto 338;
338:    this.e = v0;
340:    p0.d(p0.c(p0.i()));
343:    goto 1;
353:    if (this.f == 0)
355:        v0 = 0;
        else
389:        v0 = this.f.length;
357:    v2 = new double[com.google.protobuf.nano.l.a(p0, 41) + v0];
359:    if (v0 != 0)
363:        System.arraycopy(this.f, 0, v2, 0, v0);
366:    while (v0 < v2.length - 1) {
379:        v2[v0] = Double.longBitsToDouble(p0.l());
381:        p0.a();
384:        v0 = v0 + 1;
        }
386:    goto 391;
399:    v2[v0] = Double.longBitsToDouble(p0.l());
401:    this.f = v2;
403:    goto 1;
405:    v0 = p0.i();
409:    v2 = p0.c(v0);
413:    v3 = v0 / 8;
417:    if (this.f == 0)
419:        v0 = 0;
        else
448:        v0 = this.f.length;
421:    v3 = new double[v3 + v0];
423:    if (v0 != 0)
427:        System.arraycopy(this.f, 0, v3, 0, v0);
430:    while (v0 < v3.length) {
441:        v3[v0] = Double.longBitsToDouble(p0.l());
443:        v0 = v0 + 1;
        }
445:    goto 450;
450:    this.f = v3;
452:    p0.d(v2);
455:    goto 1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        if (this.a & 1)
            p0.a(1, this.b);
        if (this.c != 0 && this.c.length > 0) {
            v0 = 0;
            while (v0 < this.c.length) {
                if (this.c[v0] != 0)
                    p0.a(2, this.c[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.d != 0 && this.d.length > 0) {
            v0 = 0;
            while (v0 < this.d.length) {
                p0.c(3, this.d[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.e != 0 && this.e.length > 0) {
            v0 = 0;
            while (v0 < this.e.length) {
                p0.b(4, this.e[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.f != 0 && this.f.length > 0)
            while (v1 < this.f.length) {
                p0.a(5, this.f[v1]);
                v1 = v1 + 1;
            }
        super.a(p0);
    }

    protected final int b() {
        v2 = 0;
        v0 = super.b();
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.b);
        if (this.c != 0 && this.c.length > 0) {
            v1 = 0;
            v3 = 0;
            v4 = 0;
            while (v1 < this.c.length) {
                if (this.c[v1] != 0) {
                    v4 = v4 + 1;
                    v3 = v3 + CodedOutputByteBufferNano.b(this.c[v1]);
                }
                v1 = v1 + 1;
            }
            v0 = v0 + v3 + v4 * 1;
        }
        if (this.d != 0 && this.d.length > 0)
            v0 = v0 + this.d.length * 8 + this.d.length * 1;
        if (this.e != 0 && this.e.length > 0) {
            v1 = 0;
            while (v2 < this.e.length) {
                v1 = v1 + CodedOutputByteBufferNano.c(this.e[v2]);
                v2 = v2 + 1;
            }
            v0 = v0 + v1 + this.e.length * 1;
        }
        if (this.f != 0 && this.f.length > 0)
            v0 = v0 + this.f.length * 8 + this.f.length * 1;
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.do))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.do)p0;
                if ((this.a & 1) != (p0.a & 1))
                    v0 = 0;
                else if (this.b != p0.b)
                    v0 = 0;
                else if (!com.google.protobuf.nano.h.a(this.c, p0.c))
                    v0 = 0;
                else if (!com.google.protobuf.nano.h.a(this.d, p0.d))
                    v0 = 0;
                else if (!com.google.protobuf.nano.h.a(this.e, p0.e))
                    v0 = 0;
                else if (!com.google.protobuf.nano.h.a(this.f, p0.f))
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
        if (this.aO == 0 || this.aO.b())
            v0 = 0;
        else
            v0 = this.aO.hashCode();
        return v0 + ((((((this.getClass().getName().hashCode() + 527) * 31 + this.b) * 31 + com.google.protobuf.nano.h.a(this.c)) * 31 + com.google.protobuf.nano.h.a(this.d)) * 31 + com.google.protobuf.nano.h.a(this.e)) * 31 + com.google.protobuf.nano.h.a(this.f)) * 31;
    }

}
