package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

public final class com.google.android.finsky.cv.a.ds extends com.google.protobuf.nano.b
{

    public static volatile ds[] a;
    public com.google.android.finsky.cv.a.dr b;
    public String[] c;
    public long[] d;
    public boolean[] e;
    public double[] f;

    ds() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = com.google.protobuf.nano.l.j;
        this.d = com.google.protobuf.nano.l.f;
        this.e = com.google.protobuf.nano.l.i;
        this.f = com.google.protobuf.nano.l.h;
        this.aO = 0;
        this.aP = -1;
    }

    public static ds[] aX_() {
        if (com.google.android.finsky.cv.a.ds.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.android.finsky.cv.a.ds.a == 0)
                    com.google.android.finsky.cv.a.ds.a = new ds[0];
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
        return com.google.android.finsky.cv.a.ds.a;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 10:
  5:            goto 15;
            case 18:
  5:            goto 32;
            case 24:
  5:            goto 83;
            case 26:
  5:            goto 135;
            case 32:
  5:            goto 201;
            case 34:
  5:            goto 253;
            case 41:
  5:            goto 319;
            case 42:
  5:            goto 379;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 17:    if (this.b == 0)
 24:        this.b = new com.google.android.finsky.cv.a.dr();
 28:    p0.a(this.b);
 31:    goto 1;
 40:    if (this.c == 0)
 42:        v0 = 0;
        else
 72:        v0 = this.c.length;
 44:    v2 = new String[com.google.protobuf.nano.l.a(p0, 18) + v0];
 46:    if (v0 != 0)
 50:        System.arraycopy(this.c, 0, v2, 0, v0);
 53:    while (v0 < v2.length - 1) {
 62:        v2[v0] = p0.f();
 64:        p0.a();
 67:        v0 = v0 + 1;
        }
 69:    goto 74;
 78:    v2[v0] = p0.f();
 80:    this.c = v2;
 82:    goto 1;
 91:    if (this.d == 0)
 93:        v0 = 0;
        else
123:        v0 = this.d.length;
 95:    v2 = new long[com.google.protobuf.nano.l.a(p0, 24) + v0];
 97:    if (v0 != 0)
101:        System.arraycopy(this.d, 0, v2, 0, v0);
104:    while (v0 < v2.length - 1) {
113:        v2[v0] = p0.j();
115:        p0.a();
118:        v0 = v0 + 1;
        }
120:    goto 125;
129:    v2[v0] = p0.j();
131:    this.d = v2;
133:    goto 1;
147:    v0 = 0;
148:    while (p0.m() > 0) {
154:        p0.j();
157:        v0 = v0 + 1;
        }
160:    p0.e(p0.o());
165:    if (this.d == 0)
167:        v2 = 0;
        else
192:        v2 = this.d.length;
169:    v0 = new long[v0 + v2];
171:    if (v2 != 0)
175:        System.arraycopy(this.d, 0, v0, 0, v2);
178:    while (v2 < v0.length) {
185:        v0[v2] = p0.j();
187:        v2 = v2 + 1;
        }
189:    goto 194;
194:    this.d = v0;
196:    p0.d(p0.c(p0.i()));
199:    goto 1;
209:    if (this.e == 0)
211:        v0 = 0;
        else
241:        v0 = this.e.length;
213:    v2 = new boolean[com.google.protobuf.nano.l.a(p0, 32) + v0];
215:    if (v0 != 0)
219:        System.arraycopy(this.e, 0, v2, 0, v0);
222:    while (v0 < v2.length - 1) {
231:        v2[v0] = p0.e();
233:        p0.a();
236:        v0 = v0 + 1;
        }
238:    goto 243;
247:    v2[v0] = p0.e();
249:    this.e = v2;
251:    goto 1;
265:    v0 = 0;
266:    while (p0.m() > 0) {
272:        p0.e();
275:        v0 = v0 + 1;
        }
278:    p0.e(p0.o());
283:    if (this.e == 0)
285:        v2 = 0;
        else
310:        v2 = this.e.length;
287:    v0 = new boolean[v0 + v2];
289:    if (v2 != 0)
293:        System.arraycopy(this.e, 0, v0, 0, v2);
296:    while (v2 < v0.length) {
303:        v0[v2] = p0.e();
305:        v2 = v2 + 1;
        }
307:    goto 312;
312:    this.e = v0;
314:    p0.d(p0.c(p0.i()));
317:    goto 1;
327:    if (this.f == 0)
329:        v0 = 0;
        else
363:        v0 = this.f.length;
331:    v2 = new double[com.google.protobuf.nano.l.a(p0, 41) + v0];
333:    if (v0 != 0)
337:        System.arraycopy(this.f, 0, v2, 0, v0);
340:    while (v0 < v2.length - 1) {
353:        v2[v0] = Double.longBitsToDouble(p0.l());
355:        p0.a();
358:        v0 = v0 + 1;
        }
360:    goto 365;
373:    v2[v0] = Double.longBitsToDouble(p0.l());
375:    this.f = v2;
377:    goto 1;
379:    v0 = p0.i();
383:    v2 = p0.c(v0);
387:    v3 = v0 / 8;
391:    if (this.f == 0)
393:        v0 = 0;
        else
422:        v0 = this.f.length;
395:    v3 = new double[v3 + v0];
397:    if (v0 != 0)
401:        System.arraycopy(this.f, 0, v3, 0, v0);
404:    while (v0 < v3.length) {
415:        v3[v0] = Double.longBitsToDouble(p0.l());
417:        v0 = v0 + 1;
        }
419:    goto 424;
424:    this.f = v3;
426:    p0.d(v2);
429:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        if (this.b != 0)
            p0.b(1, this.b);
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
                p0.b(3, this.d[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.e != 0 && this.e.length > 0) {
            v0 = 0;
            while (v0 < this.e.length) {
                p0.a(4, this.e[v0]);
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
        if (this.b != 0)
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
        if (this.d != 0 && this.d.length > 0) {
            v1 = 0;
            while (v2 < this.d.length) {
                v1 = v1 + CodedOutputByteBufferNano.c(this.d[v2]);
                v2 = v2 + 1;
            }
            v0 = v0 + v1 + this.d.length * 1;
        }
        if (this.e != 0 && this.e.length > 0)
            v0 = v0 + this.e.length * 1 + this.e.length * 1;
        if (this.f != 0 && this.f.length > 0)
            v0 = v0 + this.f.length * 8 + this.f.length * 1;
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.ds))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.ds)p0;
                if (this.b == 0) {
                    if (p0.b != 0)
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
                else if (!this.b.equals(p0.b))
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
        v1 = 0;
        if (this.b == 0)
            v0 = 0;
        else
            v0 = this.b.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return (((((v0 + (this.getClass().getName().hashCode() + 527) * 31) * 31 + com.google.protobuf.nano.h.a(this.c)) * 31 + com.google.protobuf.nano.h.a(this.d)) * 31 + com.google.protobuf.nano.h.a(this.e)) * 31 + com.google.protobuf.nano.h.a(this.f)) * 31 + v1;
    }

}
