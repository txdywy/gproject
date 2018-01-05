package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

public final class com.google.android.finsky.cv.a.fl extends com.google.protobuf.nano.b
{

    public int a;
    public int b;
    public int[] c;
    public int d;
    public String e;
    public String f;
    public String g;
    public u[] h;
    public String[] i;

    fl() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = com.google.protobuf.nano.l.e;
        this.d = 0;
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = com.google.android.finsky.cv.a.u.ay_();
        this.i = com.google.protobuf.nano.l.j;
        this.aO = 0;
        this.aP = -1;
    }

    private final com.google.android.finsky.cv.a.fl b(com.google.protobuf.nano.a p0) {
  3:    v3 = p0.a();
  7:    switch (v3) {
            case 0:
  7:            goto 16;
            case 8:
  7:            goto 17;
            case 16:
  7:            goto 78;
            case 26:
  7:            goto 91;
            case 34:
  7:            goto 104;
            case 42:
  7:            goto 117;
            case 50:
  7:            goto 181;
            case 58:
  7:            goto 233;
            case 64:
  7:            goto 247;
            case 66:
  7:            goto 327;
            default:
        }
 14:    if (super.a(p0, v3)) goto 3;
 16:    return this;
 21:    this.a = this.a | 1;
 27:    try {
 27:        v2 = p0.i();
 31:        switch (v2) {
                case 0:
 69:                try {
 69:                    this.b = v2;
 75:                    this.a = this.a | 1;
                    }
                    catch (IllegalArgumentException ex) {
 62:                    p0.e(p0.o());
 65:                    this.a(p0, v3);
                    }
425:                break;
                case 1:
 69:                try {
 69:                    this.b = v2;
 75:                    this.a = this.a | 1;
                    }
                    catch (IllegalArgumentException ex) {
 62:                    p0.e(p0.o());
 65:                    this.a(p0, v3);
                    }
425:                break;
                case 2:
 69:                try {
 69:                    this.b = v2;
 75:                    this.a = this.a | 1;
                    }
                    catch (IllegalArgumentException ex) {
 62:                    p0.e(p0.o());
 65:                    this.a(p0, v3);
                    }
425:                break;
                default:
 60:                throw new IllegalArgumentException(34 + v2 + " is not a valid enum Id");
            }
        }
        catch (IllegalArgumentException ex) {
        }
 62:    p0.e(p0.o());
 65:    this.a(p0, v3);
 68:    goto 3;
 82:    this.d = p0.i();
 88:    this.a = this.a | 2;
 90:    goto 3;
 95:    this.e = p0.f();
101:    this.a = this.a | 4;
103:    goto 3;
108:    this.g = p0.f();
114:    this.a = this.a | 16;
116:    goto 3;
125:    if (this.h == 0)
127:        v0 = 0;
        else
163:        v0 = this.h.length;
129:    v2 = new u[com.google.protobuf.nano.l.a(p0, 42) + v0];
131:    if (v0 != 0)
135:        System.arraycopy(this.h, 0, v2, 0, v0);
138:    while (v0 < v2.length - 1) {
148:        v2[v0] = new com.google.android.finsky.cv.a.u();
152:        p0.a(v2[v0]);
155:        p0.a();
158:        v0 = v0 + 1;
        }
160:    goto 165;
170:    v2[v0] = new com.google.android.finsky.cv.a.u();
174:    p0.a(v2[v0]);
177:    this.h = v2;
179:    goto 3;
189:    if (this.i == 0)
191:        v0 = 0;
        else
221:        v0 = this.i.length;
193:    v2 = new String[com.google.protobuf.nano.l.a(p0, 50) + v0];
195:    if (v0 != 0)
199:        System.arraycopy(this.i, 0, v2, 0, v0);
202:    while (v0 < v2.length - 1) {
211:        v2[v0] = p0.f();
213:        p0.a();
216:        v0 = v0 + 1;
        }
218:    goto 223;
227:    v2[v0] = p0.f();
229:    this.i = v2;
231:    goto 3;
237:    this.f = p0.f();
243:    this.a = this.a | 8;
245:    goto 3;
247:    v4 = com.google.protobuf.nano.l.a(p0, 64);
251:    v5 = new int[v4];
253:    v2 = 0;
254:    v0 = 0;
255:    if (v2 >= v4) goto 289;
257:    if (v2 != 0)
259:        p0.a();
274:    v5[v0] = com.google.android.finsky.cv.a.id.a(p0.i());
276:    v0 = v0 + 1;
278:    v2 = v2 + 1;
280:    goto 255;
282:    p0.e(p0.o());
285:    this.a(p0, v3);
288:    goto 278;
289:    if (v0 != 0) {
293:        if (this.c == 0)
295:            v2 = 0;
            else
307:            v2 = this.c.length;
296:        if (v2 == 0 && v0 == v5.length)
301:            this.c = v5;
            else {
311:            v3 = new int[v2 + v0];
313:            if (v2 != 0)
317:                System.arraycopy(this.c, 0, v3, 0, v2);
320:            System.arraycopy(v5, 0, v3, v2, v0);
323:            this.c = v3;
            }
        }
303:    goto 3;
339:    v0 = 0;
344:    if (p0.m() <= 0) goto 356;
350:    com.google.android.finsky.cv.a.id.a(p0.i());
353:    v0 = v0 + 1;
355:    goto 340;
356:    if (v0 == 0) goto 413;
358:    p0.e(p0.o());
363:    if (this.c == 0)
365:        v2 = 0;
        else
401:        v2 = this.c.length;
367:    v0 = new int[v0 + v2];
369:    if (v2 != 0)
373:        System.arraycopy(this.c, 0, v0, 0, v2);
380:    if (p0.m() <= 0) goto 411;
394:    v0[v2] = com.google.android.finsky.cv.a.id.a(p0.i());
396:    v2 = v2 + 1;
398:    goto 376;
404:    p0.e(p0.o());
407:    this.a(p0, 64);
410:    goto 376;
411:    this.c = v0;
413:    p0.d(p0.c(p0.i()));
416:    goto 3;
419:    goto 340;
420:    try
            run 386...396
        catch (IllegalArgumentException ex) {
386:        goto 403;
        }
421:    try
            run 346...353
        catch (IllegalArgumentException ex) {
346:        goto 418;
        }
422:    try
            run 266...276
        catch (IllegalArgumentException ex) {
266:        goto 281;
        }
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        if (this.a & 1)
            p0.a(1, this.b);
        if (this.a & 2)
            p0.a(2, this.d);
        if (this.a & 4)
            p0.a(3, this.e);
        if (this.a & 16)
            p0.a(4, this.g);
        if (this.h != 0 && this.h.length > 0) {
            v0 = 0;
            while (v0 < this.h.length) {
                if (this.h[v0] != 0)
                    p0.b(5, this.h[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.i != 0 && this.i.length > 0) {
            v0 = 0;
            while (v0 < this.i.length) {
                if (this.i[v0] != 0)
                    p0.a(6, this.i[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.a & 8)
            p0.a(7, this.f);
        if (this.c != 0 && this.c.length > 0)
            while (v1 < this.c.length) {
                p0.a(8, this.c[v1]);
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
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.d);
        if (this.a & 4)
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.e);
        if (this.a & 16)
            v0 = v0 + CodedOutputByteBufferNano.b(4, this.g);
        if (this.h != 0 && this.h.length > 0) {
            v2 = v0;
            v0 = 0;
            while (v0 < this.h.length) {
                if (this.h[v0] != 0)
                    v2 = v2 + CodedOutputByteBufferNano.d(5, this.h[v0]);
                v0 = v0 + 1;
            }
            v0 = v2;
        }
        if (this.i != 0 && this.i.length > 0) {
            v2 = 0;
            v3 = 0;
            v4 = 0;
            while (v2 < this.i.length) {
                if (this.i[v2] != 0) {
                    v4 = v4 + 1;
                    v3 = v3 + CodedOutputByteBufferNano.b(this.i[v2]);
                }
                v2 = v2 + 1;
            }
            v0 = v0 + v3 + v4 * 1;
        }
        if (this.a & 8)
            v0 = v0 + CodedOutputByteBufferNano.b(7, this.f);
        if (this.c != 0 && this.c.length > 0) {
            v2 = 0;
            while (v1 < this.c.length) {
                v2 = v2 + CodedOutputByteBufferNano.c(this.c[v1]);
                v1 = v1 + 1;
            }
            v0 = v0 + v2 + this.c.length * 1;
        }
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.fl))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.fl)p0;
                if ((this.a & 1) != (p0.a & 1))
                    v0 = 0;
                else if (this.b != p0.b)
                    v0 = 0;
                else if (!com.google.protobuf.nano.h.a(this.c, p0.c))
                    v0 = 0;
                else if ((this.a & 2) != (p0.a & 2))
                    v0 = 0;
                else if (this.d != p0.d)
                    v0 = 0;
                else if ((this.a & 4) != (p0.a & 4))
                    v0 = 0;
                else if (!this.e.equals(p0.e))
                    v0 = 0;
                else if ((this.a & 8) != (p0.a & 8))
                    v0 = 0;
                else if (!this.f.equals(p0.f))
                    v0 = 0;
                else if ((this.a & 16) != (p0.a & 16))
                    v0 = 0;
                else if (!this.g.equals(p0.g))
                    v0 = 0;
                else if (!com.google.protobuf.nano.h.a(this.h, p0.h))
                    v0 = 0;
                else if (!com.google.protobuf.nano.h.a(this.i, p0.i))
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
        return v0 + (((((((((this.getClass().getName().hashCode() + 527) * 31 + this.b) * 31 + com.google.protobuf.nano.h.a(this.c)) * 31 + this.d) * 31 + this.e.hashCode()) * 31 + this.f.hashCode()) * 31 + this.g.hashCode()) * 31 + com.google.protobuf.nano.h.a(this.h)) * 31 + com.google.protobuf.nano.h.a(this.i)) * 31;
    }

}
