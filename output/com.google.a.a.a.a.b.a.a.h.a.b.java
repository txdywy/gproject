package com.google.a.a.a.a.b.a.a.h.a;

import com.google.a.a.a.a.b.a.a.f.h;
import com.google.a.a.a.a.b.a.a.f.o;
import com.google.a.a.a.a.b.a.c.a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

protected final class com.google.a.a.a.a.b.a.a.h.a.b extends com.google.protobuf.nano.b
{

    public com.google.a.a.a.a.b.a.a.f.h a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public boolean h;
    public String[] i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public c[] o;
    public com.google.a.a.a.a.b.a.a.f.o p;
    public com.google.a.a.a.a.b.a.a.h.a.d q;
    public String r;
    public String[] s;
    public com.google.a.a.a.a.b.a.c.a t;
    public boolean u;

    b() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = 0;
        this.h = 0;
        this.i = com.google.protobuf.nano.l.j;
        this.j = "";
        this.k = "";
        this.l = "";
        this.m = "";
        this.n = "";
        this.o = com.google.a.a.a.a.b.a.a.h.a.c.a();
        this.p = 0;
        this.q = 0;
        this.r = "";
        this.s = com.google.protobuf.nano.l.j;
        this.t = 0;
        this.u = 0;
        this.aP = -1;
    }

    public static int a(int p0) {
        switch (p0) {
            case 0:
                return p0;
            case 1:
                break;
            case 2:
                return p0;
            case 3:
                return p0;
            default:
                break;
        }
        throw new IllegalArgumentException(43 + p0 + " is not a valid enum DisplayType");
    }

    private final com.google.a.a.a.a.b.a.a.h.a.b b(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 10:
  5:            goto 15;
            case 18:
  5:            goto 32;
            case 26:
  5:            goto 39;
            case 34:
  5:            goto 46;
            case 42:
  5:            goto 53;
            case 56:
  5:            goto 60;
            case 64:
  5:            goto 83;
            case 74:
  5:            goto 90;
            case 82:
  5:            goto 142;
            case 106:
  5:            goto 150;
            case 114:
  5:            goto 158;
            case 122:
  5:            goto 166;
            case 130:
  5:            goto 174;
            case 138:
  5:            goto 238;
            case 146:
  5:            goto 246;
            case 162:
  5:            goto 254;
            case 170:
  5:            goto 272;
            case 178:
  5:            goto 290;
            case 186:
  5:            goto 298;
            case 194:
  5:            goto 350;
            case 200:
  5:            goto 368;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 17:    if (this.a == 0)
 24:        this.a = new com.google.a.a.a.a.b.a.a.f.h();
 28:    p0.a(this.a);
 31:    goto 1;
 36:    this.b = p0.f();
 38:    goto 1;
 43:    this.c = p0.f();
 45:    goto 1;
 50:    this.e = p0.f();
 52:    goto 1;
 57:    this.f = p0.f();
 59:    goto 1;
 64:    try {
 72:        this.g = com.google.a.a.a.a.b.a.a.h.a.b.a(p0.i());
        }
        catch (IllegalArgumentException ex) {
 76:        p0.e(p0.o());
 79:        this.a(p0, v0);
        }
 74:    goto 1;
 87:    this.h = p0.e();
 89:    goto 1;
 98:    if (this.i == 0)
100:        v0 = 0;
        else
130:        v0 = this.i.length;
102:    v2 = new String[com.google.protobuf.nano.l.a(p0, 74) + v0];
104:    if (v0 != 0)
108:        System.arraycopy(this.i, 0, v2, 0, v0);
111:    while (v0 < v2.length - 1) {
120:        v2[v0] = p0.f();
122:        p0.a();
125:        v0 = v0 + 1;
        }
127:    goto 132;
136:    v2[v0] = p0.f();
138:    this.i = v2;
140:    goto 1;
146:    this.j = p0.f();
148:    goto 1;
154:    this.k = p0.f();
156:    goto 1;
162:    this.l = p0.f();
164:    goto 1;
170:    this.m = p0.f();
172:    goto 1;
182:    if (this.o == 0)
184:        v0 = 0;
        else
220:        v0 = this.o.length;
186:    v2 = new c[com.google.protobuf.nano.l.a(p0, 130) + v0];
188:    if (v0 != 0)
192:        System.arraycopy(this.o, 0, v2, 0, v0);
195:    while (v0 < v2.length - 1) {
205:        v2[v0] = new com.google.a.a.a.a.b.a.a.h.a.c();
209:        p0.a(v2[v0]);
212:        p0.a();
215:        v0 = v0 + 1;
        }
217:    goto 222;
227:    v2[v0] = new com.google.a.a.a.a.b.a.a.h.a.c();
231:    p0.a(v2[v0]);
234:    this.o = v2;
236:    goto 1;
242:    this.d = p0.f();
244:    goto 1;
250:    this.n = p0.f();
252:    goto 1;
256:    if (this.p == 0)
263:        this.p = new com.google.a.a.a.a.b.a.a.f.o();
267:    p0.a(this.p);
270:    goto 1;
274:    if (this.q == 0)
281:        this.q = new com.google.a.a.a.a.b.a.a.h.a.d();
285:    p0.a(this.q);
288:    goto 1;
294:    this.r = p0.f();
296:    goto 1;
306:    if (this.s == 0)
308:        v0 = 0;
        else
338:        v0 = this.s.length;
310:    v2 = new String[com.google.protobuf.nano.l.a(p0, 186) + v0];
312:    if (v0 != 0)
316:        System.arraycopy(this.s, 0, v2, 0, v0);
319:    while (v0 < v2.length - 1) {
328:        v2[v0] = p0.f();
330:        p0.a();
333:        v0 = v0 + 1;
        }
335:    goto 340;
344:    v2[v0] = p0.f();
346:    this.s = v2;
348:    goto 1;
352:    if (this.t == 0)
359:        this.t = new com.google.a.a.a.a.b.a.c.a();
363:    p0.a(this.t);
366:    goto 1;
372:    this.u = p0.e();
374:    goto 1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        if (this.a != 0)
            p0.b(1, this.a);
        if (this.b != 0 && !this.b.equals(""))
            p0.a(2, this.b);
        if (this.c != 0 && !this.c.equals(""))
            p0.a(3, this.c);
        if (this.e != 0 && !this.e.equals(""))
            p0.a(4, this.e);
        if (this.f != 0 && !this.f.equals(""))
            p0.a(5, this.f);
        if (this.g != 0)
            p0.a(7, this.g);
        if (this.h != 0)
            p0.a(8, this.h);
        if (this.i != 0 && this.i.length > 0) {
            v0 = 0;
            while (v0 < this.i.length) {
                if (this.i[v0] != 0)
                    p0.a(9, this.i[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.j != 0 && !this.j.equals(""))
            p0.a(10, this.j);
        if (this.k != 0 && !this.k.equals(""))
            p0.a(13, this.k);
        if (this.l != 0 && !this.l.equals(""))
            p0.a(14, this.l);
        if (this.m != 0 && !this.m.equals(""))
            p0.a(15, this.m);
        if (this.o != 0 && this.o.length > 0) {
            v0 = 0;
            while (v0 < this.o.length) {
                if (this.o[v0] != 0)
                    p0.b(16, this.o[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.d != 0 && !this.d.equals(""))
            p0.a(17, this.d);
        if (this.n != 0 && !this.n.equals(""))
            p0.a(18, this.n);
        if (this.p != 0)
            p0.b(20, this.p);
        if (this.q != 0)
            p0.b(21, this.q);
        if (this.r != 0 && !this.r.equals(""))
            p0.a(22, this.r);
        if (this.s != 0 && this.s.length > 0)
            while (v1 < this.s.length) {
                if (this.s[v1] != 0)
                    p0.a(23, this.s[v1]);
                v1 = v1 + 1;
            }
        if (this.t != 0)
            p0.b(24, this.t);
        if (this.u != 0)
            p0.a(25, this.u);
        super.a(p0);
    }

    protected final int b() {
        v2 = 0;
        v0 = super.b();
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.a);
        if (this.b != 0 && !this.b.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.b);
        if (this.c != 0 && !this.c.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.c);
        if (this.e != 0 && !this.e.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(4, this.e);
        if (this.f != 0 && !this.f.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(5, this.f);
        if (this.g != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(7, this.g);
        if (this.h != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(8) + 1;
        if (this.i != 0 && this.i.length > 0) {
            v1 = 0;
            v3 = 0;
            v4 = 0;
            while (v1 < this.i.length) {
                if (this.i[v1] != 0) {
                    v4 = v4 + 1;
                    v3 = v3 + CodedOutputByteBufferNano.b(this.i[v1]);
                }
                v1 = v1 + 1;
            }
            v0 = v0 + v3 + v4 * 1;
        }
        if (this.j != 0 && !this.j.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(10, this.j);
        if (this.k != 0 && !this.k.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(13, this.k);
        if (this.l != 0 && !this.l.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(14, this.l);
        if (this.m != 0 && !this.m.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(15, this.m);
        if (this.o != 0 && this.o.length > 0) {
            v1 = v0;
            v0 = 0;
            while (v0 < this.o.length) {
                if (this.o[v0] != 0)
                    v1 = v1 + CodedOutputByteBufferNano.d(16, this.o[v0]);
                v0 = v0 + 1;
            }
            v0 = v1;
        }
        if (this.d != 0 && !this.d.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(17, this.d);
        if (this.n != 0 && !this.n.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(18, this.n);
        if (this.p != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(20, this.p);
        if (this.q != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(21, this.q);
        if (this.r != 0 && !this.r.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(22, this.r);
        if (this.s != 0 && this.s.length > 0) {
            v1 = 0;
            v3 = 0;
            while (v2 < this.s.length) {
                if (this.s[v2] != 0) {
                    v3 = v3 + 1;
                    v1 = v1 + CodedOutputByteBufferNano.b(this.s[v2]);
                }
                v2 = v2 + 1;
            }
            v0 = v0 + v1 + v3 * 2;
        }
        if (this.t != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(24, this.t);
        if (this.u != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(25) + 1;
        return v0;
    }

}
