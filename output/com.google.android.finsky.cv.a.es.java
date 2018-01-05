package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

public final class com.google.android.finsky.cv.a.es extends com.google.protobuf.nano.b
{

    public int a;
    public int b;
    public long c;
    public ch[] d;
    public int e;
    public int f;
    public long g;
    public String[] h;
    public int i;
    public int j;
    public int k;
    public String[] l;

    es() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = com.google.android.finsky.cv.a.ch.aP_();
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = com.google.protobuf.nano.l.j;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = com.google.protobuf.nano.l.j;
        this.aO = 0;
        this.aP = -1;
    }

    public static com.google.android.finsky.cv.a.es a(byte[] p0) {
        return (com.google.android.finsky.cv.a.es)com.google.protobuf.nano.i.a(new com.google.android.finsky.cv.a.es(), p0);
    }

    private final com.google.android.finsky.cv.a.es b(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 8:
  5:            goto 15;
            case 16:
  5:            goto 50;
            case 26:
  5:            goto 63;
            case 32:
  5:            goto 126;
            case 40:
  5:            goto 140;
            case 50:
  5:            goto 154;
            case 56:
  5:            goto 206;
            case 64:
  5:            goto 269;
            case 72:
  5:            goto 283;
            case 80:
  5:            goto 320;
            case 90:
  5:            goto 334;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 19:    this.a = this.a | 1;
 25:    try {
 33:        this.b = com.google.android.finsky.cv.a.jt.d(p0.i());
 39:        this.a = this.a | 1;
        }
        catch (IllegalArgumentException ex) {
 43:        p0.e(p0.o());
 46:        this.a(p0, v0);
        }
 41:    goto 1;
 54:    this.c = p0.j();
 60:    this.a = this.a | 2;
 62:    goto 1;
 71:    if (this.d == 0)
 73:        v0 = 0;
        else
109:        v0 = this.d.length;
 75:    v2 = new ch[com.google.protobuf.nano.l.a(p0, 26) + v0];
 77:    if (v0 != 0)
 81:        System.arraycopy(this.d, 0, v2, 0, v0);
 84:    while (v0 < v2.length - 1) {
 94:        v2[v0] = new com.google.android.finsky.cv.a.ch();
 98:        p0.a(v2[v0]);
101:        p0.a();
104:        v0 = v0 + 1;
        }
106:    goto 111;
116:    v2[v0] = new com.google.android.finsky.cv.a.ch();
120:    p0.a(v2[v0]);
123:    this.d = v2;
125:    goto 1;
130:    this.e = p0.i();
136:    this.a = this.a | 4;
138:    goto 1;
144:    this.f = p0.i();
150:    this.a = this.a | 8;
152:    goto 1;
162:    if (this.h == 0)
164:        v0 = 0;
        else
194:        v0 = this.h.length;
166:    v2 = new String[com.google.protobuf.nano.l.a(p0, 50) + v0];
168:    if (v0 != 0)
172:        System.arraycopy(this.h, 0, v2, 0, v0);
175:    while (v0 < v2.length - 1) {
184:        v2[v0] = p0.f();
186:        p0.a();
189:        v0 = v0 + 1;
        }
191:    goto 196;
200:    v2[v0] = p0.f();
202:    this.h = v2;
204:    goto 1;
210:    this.a = this.a | 32;
216:    try {
216:        v3 = p0.i();
220:        switch (v3) {
                case 0:
259:                try {
259:                    this.i = v3;
265:                    this.a = this.a | 32;
                    }
                    catch (IllegalArgumentException ex) {
251:                    p0.e(p0.o());
254:                    this.a(p0, v0);
                    }
389:                break;
                case 1:
259:                try {
259:                    this.i = v3;
265:                    this.a = this.a | 32;
                    }
                    catch (IllegalArgumentException ex) {
251:                    p0.e(p0.o());
254:                    this.a(p0, v0);
                    }
389:                break;
                case 2:
259:                try {
259:                    this.i = v3;
265:                    this.a = this.a | 32;
                    }
                    catch (IllegalArgumentException ex) {
251:                    p0.e(p0.o());
254:                    this.a(p0, v0);
                    }
389:                break;
                case 3:
259:                try {
259:                    this.i = v3;
265:                    this.a = this.a | 32;
                    }
                    catch (IllegalArgumentException ex) {
251:                    p0.e(p0.o());
254:                    this.a(p0, v0);
                    }
389:                break;
                case 4:
259:                try {
259:                    this.i = v3;
265:                    this.a = this.a | 32;
                    }
                    catch (IllegalArgumentException ex) {
251:                    p0.e(p0.o());
254:                    this.a(p0, v0);
                    }
389:                break;
                case 5:
259:                try {
259:                    this.i = v3;
265:                    this.a = this.a | 32;
                    }
                    catch (IllegalArgumentException ex) {
251:                    p0.e(p0.o());
254:                    this.a(p0, v0);
                    }
389:                break;
                case 6:
259:                try {
259:                    this.i = v3;
265:                    this.a = this.a | 32;
                    }
                    catch (IllegalArgumentException ex) {
251:                    p0.e(p0.o());
254:                    this.a(p0, v0);
                    }
389:                break;
                case 7:
259:                try {
259:                    this.i = v3;
265:                    this.a = this.a | 32;
                    }
                    catch (IllegalArgumentException ex) {
251:                    p0.e(p0.o());
254:                    this.a(p0, v0);
                    }
389:                break;
                case 8:
259:                try {
259:                    this.i = v3;
265:                    this.a = this.a | 32;
                    }
                    catch (IllegalArgumentException ex) {
251:                    p0.e(p0.o());
254:                    this.a(p0, v0);
                    }
389:                break;
                default:
249:                throw new IllegalArgumentException(47 + v3 + " is not a valid enum AndroidCategory");
            }
        }
        catch (IllegalArgumentException ex) {
        }
251:    p0.e(p0.o());
254:    this.a(p0, v0);
257:    goto 1;
273:    this.j = p0.i();
279:    this.a = this.a | 64;
281:    goto 1;
287:    this.a = this.a | 128;
293:    try {
301:        this.k = com.google.android.finsky.cv.a.l.a(p0.i());
307:        this.a = this.a | 128;
        }
        catch (IllegalArgumentException ex) {
312:        p0.e(p0.o());
315:        this.a(p0, v0);
        }
309:    goto 1;
324:    this.g = p0.j();
330:    this.a = this.a | 16;
332:    goto 1;
342:    if (this.l == 0)
344:        v0 = 0;
        else
374:        v0 = this.l.length;
346:    v2 = new String[com.google.protobuf.nano.l.a(p0, 90) + v0];
348:    if (v0 != 0)
352:        System.arraycopy(this.l, 0, v2, 0, v0);
355:    while (v0 < v2.length - 1) {
364:        v2[v0] = p0.f();
366:        p0.a();
369:        v0 = v0 + 1;
        }
371:    goto 376;
380:    v2[v0] = p0.f();
382:    this.l = v2;
384:    goto 1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        if (this.a & 1)
            p0.a(1, this.b);
        if (this.a & 2)
            p0.b(2, this.c);
        if (this.d != 0 && this.d.length > 0) {
            v0 = 0;
            while (v0 < this.d.length) {
                if (this.d[v0] != 0)
                    p0.b(3, this.d[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.a & 4)
            p0.a(4, this.e);
        if (this.a & 8)
            p0.a(5, this.f);
        if (this.h != 0 && this.h.length > 0) {
            v0 = 0;
            while (v0 < this.h.length) {
                if (this.h[v0] != 0)
                    p0.a(6, this.h[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.a & 32)
            p0.a(7, this.i);
        if (this.a & 64)
            p0.a(8, this.j);
        if (this.a & 128)
            p0.a(9, this.k);
        if (this.a & 16)
            p0.b(10, this.g);
        if (this.l != 0 && this.l.length > 0)
            while (v1 < this.l.length) {
                if (this.l[v1] != 0)
                    p0.a(11, this.l[v1]);
                v1 = v1 + 1;
            }
        super.a(p0);
    }

    protected final int b() {
        v1 = 0;
        v0 = super.b();
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.b);
        if (this.a & 2)
            v0 = v0 + CodedOutputByteBufferNano.f(2, this.c);
        if (this.d != 0 && this.d.length > 0) {
            v2 = v0;
            v0 = 0;
            while (v0 < this.d.length) {
                if (this.d[v0] != 0)
                    v2 = v2 + CodedOutputByteBufferNano.d(3, this.d[v0]);
                v0 = v0 + 1;
            }
            v0 = v2;
        }
        if (this.a & 4)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.e);
        if (this.a & 8)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.f);
        if (this.h != 0 && this.h.length > 0) {
            v2 = 0;
            v3 = 0;
            v4 = 0;
            while (v2 < this.h.length) {
                if (this.h[v2] != 0) {
                    v4 = v4 + 1;
                    v3 = v3 + CodedOutputByteBufferNano.b(this.h[v2]);
                }
                v2 = v2 + 1;
            }
            v0 = v0 + v3 + v4 * 1;
        }
        if (this.a & 32)
            v0 = v0 + CodedOutputByteBufferNano.d(7, this.i);
        if (this.a & 64)
            v0 = v0 + CodedOutputByteBufferNano.d(8, this.j);
        if (this.a & 128)
            v0 = v0 + CodedOutputByteBufferNano.d(9, this.k);
        if (this.a & 16)
            v0 = v0 + CodedOutputByteBufferNano.f(10, this.g);
        if (this.l != 0 && this.l.length > 0) {
            v2 = 0;
            v3 = 0;
            while (v1 < this.l.length) {
                if (this.l[v1] != 0) {
                    v3 = v3 + 1;
                    v2 = v2 + CodedOutputByteBufferNano.b(this.l[v1]);
                }
                v1 = v1 + 1;
            }
            v0 = v0 + v2 + v3 * 1;
        }
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.es))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.es)p0;
                if ((this.a & 1) != (p0.a & 1))
                    v0 = 0;
                else if (this.b != p0.b)
                    v0 = 0;
                else if ((this.a & 2) != (p0.a & 2))
                    v0 = 0;
                else if (this.c != p0.c)
                    v0 = 0;
                else if (!com.google.protobuf.nano.h.a(this.d, p0.d))
                    v0 = 0;
                else if ((this.a & 4) != (p0.a & 4))
                    v0 = 0;
                else if (this.e != p0.e)
                    v0 = 0;
                else if ((this.a & 8) != (p0.a & 8))
                    v0 = 0;
                else if (this.f != p0.f)
                    v0 = 0;
                else if ((this.a & 16) != (p0.a & 16))
                    v0 = 0;
                else if (this.g != p0.g)
                    v0 = 0;
                else if (!com.google.protobuf.nano.h.a(this.h, p0.h))
                    v0 = 0;
                else if ((this.a & 32) != (p0.a & 32))
                    v0 = 0;
                else if (this.i != p0.i)
                    v0 = 0;
                else if ((this.a & 64) != (p0.a & 64))
                    v0 = 0;
                else if (this.j != p0.j)
                    v0 = 0;
                else if ((this.a & 128) != (p0.a & 128))
                    v0 = 0;
                else if (this.k != p0.k)
                    v0 = 0;
                else if (!com.google.protobuf.nano.h.a(this.l, p0.l))
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
        return v0 + ((((((((((((this.getClass().getName().hashCode() + 527) * 31 + this.b) * 31 + (int)(this.c ^ this.c >>> 32)) * 31 + com.google.protobuf.nano.h.a(this.d)) * 31 + this.e) * 31 + this.f) * 31 + (int)(this.g ^ this.g >>> 32)) * 31 + com.google.protobuf.nano.h.a(this.h)) * 31 + this.i) * 31 + this.j) * 31 + this.k) * 31 + com.google.protobuf.nano.h.a(this.l)) * 31;
    }

}
