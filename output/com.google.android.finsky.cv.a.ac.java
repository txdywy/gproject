package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

public final class com.google.android.finsky.cv.a.ac extends com.google.protobuf.nano.b
{

    public static volatile ac[] a;
    public int b;
    public String c;
    public String d;
    public bd[] e;
    public com.google.android.finsky.cv.a.bd f;
    public String g;
    public String h;
    public String i;
    public int[] j;

    ac() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = "";
        this.d = "";
        this.e = com.google.android.finsky.cv.a.bd.aH_();
        this.f = 0;
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = com.google.protobuf.nano.l.e;
        this.aO = 0;
        this.aP = -1;
    }

    public static ac[] aA_() {
        if (com.google.android.finsky.cv.a.ac.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.android.finsky.cv.a.ac.a == 0)
                    com.google.android.finsky.cv.a.ac.a = new ac[0];
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
        return com.google.android.finsky.cv.a.ac.a;
    }

    private final com.google.android.finsky.cv.a.ac b(com.google.protobuf.nano.a p0) {
  3:    v3 = p0.a();
  7:    switch (v3) {
            case 0:
  7:            goto 16;
            case 10:
  7:            goto 17;
            case 18:
  7:            goto 30;
            case 26:
  7:            goto 93;
            case 34:
  7:            goto 106;
            case 42:
  7:            goto 119;
            case 50:
  7:            goto 132;
            case 66:
  7:            goto 150;
            case 72:
  7:            goto 164;
            case 74:
  7:            goto 244;
            default:
        }
 14:    if (super.a(p0, v3)) goto 3;
 16:    return this;
 21:    this.c = p0.f();
 27:    this.b = this.b | 1;
 29:    goto 3;
 38:    if (this.e == 0)
 40:        v0 = 0;
        else
 76:        v0 = this.e.length;
 42:    v2 = new bd[com.google.protobuf.nano.l.a(p0, 18) + v0];
 44:    if (v0 != 0)
 48:        System.arraycopy(this.e, 0, v2, 0, v0);
 51:    while (v0 < v2.length - 1) {
 61:        v2[v0] = new com.google.android.finsky.cv.a.bd();
 65:        p0.a(v2[v0]);
 68:        p0.a();
 71:        v0 = v0 + 1;
        }
 73:    goto 78;
 83:    v2[v0] = new com.google.android.finsky.cv.a.bd();
 87:    p0.a(v2[v0]);
 90:    this.e = v2;
 92:    goto 3;
 97:    this.g = p0.f();
103:    this.b = this.b | 4;
105:    goto 3;
110:    this.d = p0.f();
116:    this.b = this.b | 2;
118:    goto 3;
123:    this.h = p0.f();
129:    this.b = this.b | 8;
131:    goto 3;
134:    if (this.f == 0)
141:        this.f = new com.google.android.finsky.cv.a.bd();
145:    p0.a(this.f);
148:    goto 3;
154:    this.i = p0.f();
160:    this.b = this.b | 16;
162:    goto 3;
164:    v4 = com.google.protobuf.nano.l.a(p0, 72);
168:    v5 = new int[v4];
170:    v2 = 0;
171:    v0 = 0;
172:    if (v2 >= v4) goto 206;
174:    if (v2 != 0)
176:        p0.a();
191:    v5[v0] = com.google.android.finsky.cv.a.ae.a(p0.i());
193:    v0 = v0 + 1;
195:    v2 = v2 + 1;
197:    goto 172;
199:    p0.e(p0.o());
202:    this.a(p0, v3);
205:    goto 195;
206:    if (v0 != 0) {
210:        if (this.j == 0)
212:            v2 = 0;
            else
224:            v2 = this.j.length;
213:        if (v2 == 0 && v0 == v5.length)
218:            this.j = v5;
            else {
228:            v3 = new int[v2 + v0];
230:            if (v2 != 0)
234:                System.arraycopy(this.j, 0, v3, 0, v2);
237:            System.arraycopy(v5, 0, v3, v2, v0);
240:            this.j = v3;
            }
        }
220:    goto 3;
256:    v0 = 0;
261:    if (p0.m() <= 0) goto 273;
267:    com.google.android.finsky.cv.a.ae.a(p0.i());
270:    v0 = v0 + 1;
272:    goto 257;
273:    if (v0 == 0) goto 330;
275:    p0.e(p0.o());
280:    if (this.j == 0)
282:        v2 = 0;
        else
318:        v2 = this.j.length;
284:    v0 = new int[v0 + v2];
286:    if (v2 != 0)
290:        System.arraycopy(this.j, 0, v0, 0, v2);
297:    if (p0.m() <= 0) goto 328;
311:    v0[v2] = com.google.android.finsky.cv.a.ae.a(p0.i());
313:    v2 = v2 + 1;
315:    goto 293;
321:    p0.e(p0.o());
324:    this.a(p0, 72);
327:    goto 293;
328:    this.j = v0;
330:    p0.d(p0.c(p0.i()));
333:    goto 3;
336:    goto 257;
337:    try
            run 303...313
        catch (IllegalArgumentException ex) {
303:        goto 320;
        }
338:    try
            run 263...270
        catch (IllegalArgumentException ex) {
263:        goto 335;
        }
339:    try
            run 183...193
        catch (IllegalArgumentException ex) {
183:        goto 198;
        }
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        if (this.b & 1)
            p0.a(1, this.c);
        if (this.e != 0 && this.e.length > 0) {
            v0 = 0;
            while (v0 < this.e.length) {
                if (this.e[v0] != 0)
                    p0.b(2, this.e[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.b & 4)
            p0.a(3, this.g);
        if (this.b & 2)
            p0.a(4, this.d);
        if (this.b & 8)
            p0.a(5, this.h);
        if (this.f != 0)
            p0.b(6, this.f);
        if (this.b & 16)
            p0.a(8, this.i);
        if (this.j != 0 && this.j.length > 0)
            while (v1 < this.j.length) {
                p0.a(9, this.j[v1]);
                v1 = v1 + 1;
            }
        super.a(p0);
    }

    protected final int b() {
        v1 = 0;
        v0 = super.b();
        if (this.b & 1)
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.c);
        if (this.e != 0 && this.e.length > 0) {
            v2 = v0;
            v0 = 0;
            while (v0 < this.e.length) {
                if (this.e[v0] != 0)
                    v2 = v2 + CodedOutputByteBufferNano.d(2, this.e[v0]);
                v0 = v0 + 1;
            }
            v0 = v2;
        }
        if (this.b & 4)
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.g);
        if (this.b & 2)
            v0 = v0 + CodedOutputByteBufferNano.b(4, this.d);
        if (this.b & 8)
            v0 = v0 + CodedOutputByteBufferNano.b(5, this.h);
        if (this.f != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(6, this.f);
        if (this.b & 16)
            v0 = v0 + CodedOutputByteBufferNano.b(8, this.i);
        if (this.j != 0 && this.j.length > 0) {
            v2 = 0;
            while (v1 < this.j.length) {
                v2 = v2 + CodedOutputByteBufferNano.c(this.j[v1]);
                v1 = v1 + 1;
            }
            v0 = v0 + v2 + this.j.length * 1;
        }
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.ac))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.ac)p0;
                if ((this.b & 1) != (p0.b & 1))
                    v0 = 0;
                else if (!this.c.equals(p0.c))
                    v0 = 0;
                else if ((this.b & 2) != (p0.b & 2))
                    v0 = 0;
                else if (!this.d.equals(p0.d))
                    v0 = 0;
                else if (!com.google.protobuf.nano.h.a(this.e, p0.e))
                    v0 = 0;
                else if (this.f == 0) {
                    if (p0.f != 0)
                        v0 = 0;
                    else if ((this.b & 4) != (p0.b & 4))
                        v0 = 0;
                    else if (!this.g.equals(p0.g))
                        v0 = 0;
                    else if ((this.b & 8) != (p0.b & 8))
                        v0 = 0;
                    else if (!this.h.equals(p0.h))
                        v0 = 0;
                    else if ((this.b & 16) != (p0.b & 16))
                        v0 = 0;
                    else if (!this.i.equals(p0.i))
                        v0 = 0;
                    else if (!com.google.protobuf.nano.h.a(this.j, p0.j))
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.f.equals(p0.f))
                    v0 = 0;
                else if ((this.b & 4) != (p0.b & 4))
                    v0 = 0;
                else if (!this.g.equals(p0.g))
                    v0 = 0;
                else if ((this.b & 8) != (p0.b & 8))
                    v0 = 0;
                else if (!this.h.equals(p0.h))
                    v0 = 0;
                else if ((this.b & 16) != (p0.b & 16))
                    v0 = 0;
                else if (!this.i.equals(p0.i))
                    v0 = 0;
                else if (!com.google.protobuf.nano.h.a(this.j, p0.j))
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
        if (this.f == 0)
            v0 = 0;
        else
            v0 = this.f.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return (((((v0 + ((((this.getClass().getName().hashCode() + 527) * 31 + this.c.hashCode()) * 31 + this.d.hashCode()) * 31 + com.google.protobuf.nano.h.a(this.e)) * 31) * 31 + this.g.hashCode()) * 31 + this.h.hashCode()) * 31 + this.i.hashCode()) * 31 + com.google.protobuf.nano.h.a(this.j)) * 31 + v1;
    }

}
