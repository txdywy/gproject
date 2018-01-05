package com.google.a.a.a.a.b.a.a.c.b.a;

import com.google.a.a.a.a.b.a.a.c.a.a;
import com.google.a.a.a.a.b.a.b.a.ad;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;
import java.util.Arrays;

protected final class com.google.a.a.a.a.b.a.a.c.b.a.x extends com.google.protobuf.nano.b
{

    public static volatile x[] a;
    public w[] b;
    public com.google.a.a.a.a.b.a.b.a.ad c;
    public int d;
    public byte[] e;
    public com.google.a.a.a.a.b.a.b.a.ad f;
    public String g;
    public String h;
    public int[] i;

    x() {
        com.google.protobuf.nano.b();
        this.b = com.google.a.a.a.a.b.a.a.c.b.a.w.a();
        this.c = 0;
        this.d = 0;
        this.e = com.google.protobuf.nano.l.l;
        this.f = 0;
        this.g = "";
        this.h = "";
        this.i = com.google.protobuf.nano.l.e;
        this.aP = -1;
    }

    public static x[] a() {
        if (com.google.a.a.a.a.b.a.a.c.b.a.x.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.a.a.a.a.b.a.a.c.b.a.x.a == 0)
                    com.google.a.a.a.a.b.a.a.c.b.a.x.a = new x[0];
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
        return com.google.a.a.a.a.b.a.a.c.b.a.x.a;
    }

    private final com.google.a.a.a.a.b.a.a.c.b.a.x b(com.google.protobuf.nano.a p0) {
  3:    v3 = p0.a();
  7:    switch (v3) {
            case 0:
  7:            goto 16;
            case 10:
  7:            goto 17;
            case 24:
  7:            goto 80;
            case 34:
  7:            goto 87;
            case 58:
  7:            goto 94;
            case 66:
  7:            goto 101;
            case 74:
  7:            goto 108;
            case 90:
  7:            goto 125;
            case 96:
  7:            goto 143;
            case 98:
  7:            goto 223;
            default:
        }
 14:    if (super.a(p0, v3)) goto 3;
 16:    return this;
 25:    if (this.b == 0)
 27:        v0 = 0;
        else
 63:        v0 = this.b.length;
 29:    v2 = new w[com.google.protobuf.nano.l.a(p0, 10) + v0];
 31:    if (v0 != 0)
 35:        System.arraycopy(this.b, 0, v2, 0, v0);
 38:    while (v0 < v2.length - 1) {
 48:        v2[v0] = new com.google.a.a.a.a.b.a.a.c.b.a.w();
 52:        p0.a(v2[v0]);
 55:        p0.a();
 58:        v0 = v0 + 1;
        }
 60:    goto 65;
 70:    v2[v0] = new com.google.a.a.a.a.b.a.a.c.b.a.w();
 74:    p0.a(v2[v0]);
 77:    this.b = v2;
 79:    goto 3;
 84:    this.d = p0.i();
 86:    goto 3;
 91:    this.e = p0.g();
 93:    goto 3;
 98:    this.g = p0.f();
100:    goto 3;
105:    this.h = p0.f();
107:    goto 3;
110:    if (this.c == 0)
117:        this.c = new com.google.a.a.a.a.b.a.b.a.ad();
121:    p0.a(this.c);
124:    goto 3;
127:    if (this.f == 0)
134:        this.f = new com.google.a.a.a.a.b.a.b.a.ad();
138:    p0.a(this.f);
141:    goto 3;
143:    v4 = com.google.protobuf.nano.l.a(p0, 96);
147:    v5 = new int[v4];
149:    v2 = 0;
150:    v0 = 0;
151:    if (v2 >= v4) goto 185;
153:    if (v2 != 0)
155:        p0.a();
170:    v5[v0] = com.google.a.a.a.a.b.a.a.c.a.a.a(p0.i());
172:    v0 = v0 + 1;
174:    v2 = v2 + 1;
176:    goto 151;
178:    p0.e(p0.o());
181:    this.a(p0, v3);
184:    goto 174;
185:    if (v0 != 0) {
189:        if (this.i == 0)
191:            v2 = 0;
            else
203:            v2 = this.i.length;
192:        if (v2 == 0 && v0 == v5.length)
197:            this.i = v5;
            else {
207:            v3 = new int[v2 + v0];
209:            if (v2 != 0)
213:                System.arraycopy(this.i, 0, v3, 0, v2);
216:            System.arraycopy(v5, 0, v3, v2, v0);
219:            this.i = v3;
            }
        }
199:    goto 3;
235:    v0 = 0;
240:    if (p0.m() <= 0) goto 252;
246:    com.google.a.a.a.a.b.a.a.c.a.a.a(p0.i());
249:    v0 = v0 + 1;
251:    goto 236;
252:    if (v0 == 0) goto 309;
254:    p0.e(p0.o());
259:    if (this.i == 0)
261:        v2 = 0;
        else
297:        v2 = this.i.length;
263:    v0 = new int[v0 + v2];
265:    if (v2 != 0)
269:        System.arraycopy(this.i, 0, v0, 0, v2);
276:    if (p0.m() <= 0) goto 307;
290:    v0[v2] = com.google.a.a.a.a.b.a.a.c.a.a.a(p0.i());
292:    v2 = v2 + 1;
294:    goto 272;
300:    p0.e(p0.o());
303:    this.a(p0, 96);
306:    goto 272;
307:    this.i = v0;
309:    p0.d(p0.c(p0.i()));
312:    goto 3;
315:    goto 236;
316:    try
            run 282...292
        catch (IllegalArgumentException ex) {
282:        goto 299;
        }
317:    try
            run 242...249
        catch (IllegalArgumentException ex) {
242:        goto 314;
        }
318:    try
            run 162...172
        catch (IllegalArgumentException ex) {
162:        goto 177;
        }
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        if (this.b != 0 && this.b.length > 0) {
            v0 = 0;
            while (v0 < this.b.length) {
                if (this.b[v0] != 0)
                    p0.b(1, this.b[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.d != 0)
            p0.a(3, this.d);
        if (!Arrays.equals(this.e, com.google.protobuf.nano.l.l))
            p0.a(4, this.e);
        if (this.g != 0 && !this.g.equals(""))
            p0.a(7, this.g);
        if (this.h != 0 && !this.h.equals(""))
            p0.a(8, this.h);
        if (this.c != 0)
            p0.b(9, this.c);
        if (this.f != 0)
            p0.b(11, this.f);
        if (this.i != 0 && this.i.length > 0)
            while (v1 < this.i.length) {
                p0.a(12, this.i[v1]);
                v1 = v1 + 1;
            }
        super.a(p0);
    }

    protected final int b() {
        v1 = 0;
        v0 = super.b();
        if (this.b != 0 && this.b.length > 0) {
            v2 = v0;
            v0 = 0;
            while (v0 < this.b.length) {
                if (this.b[v0] != 0)
                    v2 = v2 + CodedOutputByteBufferNano.d(1, this.b[v0]);
                v0 = v0 + 1;
            }
            v0 = v2;
        }
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.d);
        if (!Arrays.equals(this.e, com.google.protobuf.nano.l.l))
            v0 = v0 + CodedOutputByteBufferNano.b(4, this.e);
        if (this.g != 0 && !this.g.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(7, this.g);
        if (this.h != 0 && !this.h.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(8, this.h);
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(9, this.c);
        if (this.f != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(11, this.f);
        if (this.i != 0 && this.i.length > 0) {
            v2 = 0;
            while (v1 < this.i.length) {
                v2 = v2 + CodedOutputByteBufferNano.c(this.i[v1]);
                v1 = v1 + 1;
            }
            v0 = v0 + v2 + this.i.length * 1;
        }
        return v0;
    }

}
