package com.google.a.a.a.a.b.a.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class com.google.a.a.a.a.b.a.b.a.al extends com.google.protobuf.nano.b
{

    public static volatile al[] b;
    public int a;
    public String c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public String h;
    public String i;
    public com.google.a.a.a.a.b.a.b.a.aj j;
    public ad[] k;
    public int l;
    public byte[] m;
    public int n;
    public boolean o;
    public int p;
    public com.google.a.a.a.a.b.a.b.a.ar q;
    public com.google.a.a.a.a.b.a.b.a.ap r;
    public com.google.a.a.a.a.b.a.b.a.am s;
    public com.google.a.a.a.a.b.a.b.a.ao t;
    public com.google.a.a.a.a.b.a.b.a.an u;

    al() {
        com.google.protobuf.nano.b();
        this.a = -1;
        this.c = "";
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = "";
        this.i = "";
        this.j = 0;
        this.k = com.google.a.a.a.a.b.a.b.a.ad.a();
        this.l = 1;
        this.m = com.google.protobuf.nano.l.l;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.a = -1;
        this.q = 0;
        this.a = -1;
        this.r = 0;
        this.a = -1;
        this.s = 0;
        this.a = -1;
        this.t = 0;
        this.a = -1;
        this.u = 0;
        this.aP = -1;
    }

    public static al[] a() {
        if (com.google.a.a.a.a.b.a.b.a.al.b == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.a.a.a.a.b.a.b.a.al.b == 0)
                    com.google.a.a.a.a.b.a.b.a.al.b = new al[0];
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
        return com.google.a.a.a.a.b.a.b.a.al.b;
    }

    private final com.google.a.a.a.a.b.a.b.a.al b(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 10:
  5:            goto 15;
            case 16:
  5:            goto 22;
            case 24:
  5:            goto 29;
            case 34:
  5:            goto 36;
            case 50:
  5:            goto 43;
            case 58:
  5:            goto 62;
            case 66:
  5:            goto 82;
            case 74:
  5:            goto 146;
            case 82:
  5:            goto 164;
            case 88:
  5:            goto 185;
            case 106:
  5:            goto 193;
            case 114:
  5:            goto 214;
            case 120:
  5:            goto 222;
            case 130:
  5:            goto 230;
            case 136:
  5:            goto 251;
            case 144:
  5:            goto 276;
            case 160:
  5:            goto 327;
            case 178:
  5:            goto 335;
            case 184:
  5:            goto 343;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 19:    this.c = p0.f();
 21:    goto 1;
 26:    this.e = p0.e();
 28:    goto 1;
 33:    this.f = p0.e();
 35:    goto 1;
 40:    this.h = p0.f();
 42:    goto 1;
 45:    if (this.q == 0)
 52:        this.q = new com.google.a.a.a.a.b.a.b.a.ar();
 56:    p0.a(this.q);
 59:    this.a = 0;
 61:    goto 1;
 64:    if (this.r == 0)
 71:        this.r = new com.google.a.a.a.a.b.a.b.a.ap();
 75:    p0.a(this.r);
 79:    this.a = 1;
 81:    goto 1;
 90:    if (this.k == 0)
 92:        v0 = 0;
        else
128:        v0 = this.k.length;
 94:    v2 = new ad[com.google.protobuf.nano.l.a(p0, 66) + v0];
 96:    if (v0 != 0)
100:        System.arraycopy(this.k, 0, v2, 0, v0);
103:    while (v0 < v2.length - 1) {
113:        v2[v0] = new com.google.a.a.a.a.b.a.b.a.ad();
117:        p0.a(v2[v0]);
120:        p0.a();
123:        v0 = v0 + 1;
        }
125:    goto 130;
135:    v2[v0] = new com.google.a.a.a.a.b.a.b.a.ad();
139:    p0.a(v2[v0]);
142:    this.k = v2;
144:    goto 1;
148:    if (this.j == 0)
155:        this.j = new com.google.a.a.a.a.b.a.b.a.aj();
159:    p0.a(this.j);
162:    goto 1;
166:    if (this.s == 0)
173:        this.s = new com.google.a.a.a.a.b.a.b.a.am();
177:    p0.a(this.s);
181:    this.a = 2;
183:    goto 1;
189:    this.g = p0.e();
191:    goto 1;
195:    if (this.t == 0)
202:        this.t = new com.google.a.a.a.a.b.a.b.a.ao();
206:    p0.a(this.t);
210:    this.a = 3;
212:    goto 1;
218:    this.m = p0.g();
220:    goto 1;
226:    this.d = p0.j();
228:    goto 1;
232:    if (this.u == 0)
239:        this.u = new com.google.a.a.a.a.b.a.b.a.an();
243:    p0.a(this.u);
247:    this.a = 4;
249:    goto 1;
255:    try {
263:        this.n = com.google.a.a.a.a.b.a.b.a.au.a(p0.i());
        }
        catch (IllegalArgumentException ex) {
268:        p0.e(p0.o());
271:        this.a(p0, v0);
        }
265:    goto 1;
280:    try {
280:        v3 = p0.i();
284:        switch (v3) {
                case 0:
323:                try {
323:                    this.p = v3;
                    }
                    catch (IllegalArgumentException ex) {
315:                    p0.e(p0.o());
318:                    this.a(p0, v0);
                    }
398:                break;
                case 1:
323:                try {
323:                    this.p = v3;
                    }
                    catch (IllegalArgumentException ex) {
315:                    p0.e(p0.o());
318:                    this.a(p0, v0);
                    }
398:                break;
                case 2:
323:                try {
323:                    this.p = v3;
                    }
                    catch (IllegalArgumentException ex) {
315:                    p0.e(p0.o());
318:                    this.a(p0, v0);
                    }
398:                break;
                case 3:
323:                try {
323:                    this.p = v3;
                    }
                    catch (IllegalArgumentException ex) {
315:                    p0.e(p0.o());
318:                    this.a(p0, v0);
                    }
398:                break;
                case 4:
323:                try {
323:                    this.p = v3;
                    }
                    catch (IllegalArgumentException ex) {
315:                    p0.e(p0.o());
318:                    this.a(p0, v0);
                    }
398:                break;
                case 5:
323:                try {
323:                    this.p = v3;
                    }
                    catch (IllegalArgumentException ex) {
315:                    p0.e(p0.o());
318:                    this.a(p0, v0);
                    }
398:                break;
                default:
313:                throw new IllegalArgumentException(44 + v3 + " is not a valid enum SemanticHint");
            }
        }
        catch (IllegalArgumentException ex) {
        }
315:    p0.e(p0.o());
318:    this.a(p0, v0);
321:    goto 1;
331:    this.o = p0.e();
333:    goto 1;
339:    this.i = p0.f();
341:    goto 1;
347:    try {
347:        v3 = p0.i();
351:        switch (v3) {
                case 0:
390:                try {
390:                    this.l = v3;
                    }
                    catch (IllegalArgumentException ex) {
382:                    p0.e(p0.o());
385:                    this.a(p0, v0);
                    }
398:                break;
                case 1:
390:                try {
390:                    this.l = v3;
                    }
                    catch (IllegalArgumentException ex) {
382:                    p0.e(p0.o());
385:                    this.a(p0, v0);
                    }
398:                break;
                case 2:
390:                try {
390:                    this.l = v3;
                    }
                    catch (IllegalArgumentException ex) {
382:                    p0.e(p0.o());
385:                    this.a(p0, v0);
                    }
398:                break;
                default:
380:                throw new IllegalArgumentException(48 + v3 + " is not a valid enum ImageDisplayType");
            }
        }
        catch (IllegalArgumentException ex) {
        }
382:    p0.e(p0.o());
385:    this.a(p0, v0);
388:    goto 1;
    }

    public final com.google.a.a.a.a.b.a.b.a.al a(com.google.a.a.a.a.b.a.b.a.an p0) {
        this.a = -1;
        this.a = 4;
        this.u = p0;
        return this;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.c != 0 && !this.c.equals(""))
            p0.a(1, this.c);
        if (this.e != 0)
            p0.a(2, this.e);
        if (this.f != 0)
            p0.a(3, this.f);
        if (this.h != 0 && !this.h.equals(""))
            p0.a(4, this.h);
        if (this.a == 0)
            p0.b(6, this.q);
        if (this.a == 1)
            p0.b(7, this.r);
        if (this.k != 0 && this.k.length > 0) {
            v0 = 0;
            while (v0 < this.k.length) {
                if (this.k[v0] != 0)
                    p0.b(8, this.k[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.j != 0)
            p0.b(9, this.j);
        if (this.a == 2)
            p0.b(10, this.s);
        if (this.g != 0)
            p0.a(11, this.g);
        if (this.a == 3)
            p0.b(13, this.t);
        if (!Arrays.equals(this.m, com.google.protobuf.nano.l.l))
            p0.a(14, this.m);
        if (this.d != 0)
            p0.b(15, this.d);
        if (this.a == 4)
            p0.b(16, this.u);
        if (this.n != 0)
            p0.a(17, this.n);
        if (this.p != 0)
            p0.a(18, this.p);
        if (this.o != 0)
            p0.a(20, this.o);
        if (this.i != 0 && !this.i.equals(""))
            p0.a(22, this.i);
        if (this.l != 1)
            p0.a(23, this.l);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.c != 0 && !this.c.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.c);
        if (this.e != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2) + 1;
        if (this.f != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3) + 1;
        if (this.h != 0 && !this.h.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(4, this.h);
        if (this.a == 0)
            v0 = v0 + CodedOutputByteBufferNano.d(6, this.q);
        if (this.a == 1)
            v0 = v0 + CodedOutputByteBufferNano.d(7, this.r);
        if (this.k != 0 && this.k.length > 0) {
            v1 = v0;
            v0 = 0;
            while (v0 < this.k.length) {
                if (this.k[v0] != 0)
                    v1 = v1 + CodedOutputByteBufferNano.d(8, this.k[v0]);
                v0 = v0 + 1;
            }
            v0 = v1;
        }
        if (this.j != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(9, this.j);
        if (this.a == 2)
            v0 = v0 + CodedOutputByteBufferNano.d(10, this.s);
        if (this.g != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(11) + 1;
        if (this.a == 3)
            v0 = v0 + CodedOutputByteBufferNano.d(13, this.t);
        if (!Arrays.equals(this.m, com.google.protobuf.nano.l.l))
            v0 = v0 + CodedOutputByteBufferNano.b(14, this.m);
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.f(15, this.d);
        if (this.a == 4)
            v0 = v0 + CodedOutputByteBufferNano.d(16, this.u);
        if (this.n != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(17, this.n);
        if (this.p != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(18, this.p);
        if (this.o != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(20) + 1;
        if (this.i != 0 && !this.i.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(22, this.i);
        if (this.l != 1)
            v0 = v0 + CodedOutputByteBufferNano.d(23, this.l);
        return v0;
    }

    public final com.google.a.a.a.a.b.a.b.a.ar c() {
        if (this.a == 0)
            v0 = this.q;
        else
            v0 = 0;
        return v0;
    }

    public final com.google.a.a.a.a.b.a.b.a.ap d() {
        if (this.a == 1)
            v0 = this.r;
        else
            v0 = 0;
        return v0;
    }

    public final com.google.a.a.a.a.b.a.b.a.am e() {
        if (this.a == 2)
            v0 = this.s;
        else
            v0 = 0;
        return v0;
    }

    public final com.google.a.a.a.a.b.a.b.a.ao f() {
        if (this.a == 3)
            v0 = this.t;
        else
            v0 = 0;
        return v0;
    }

    public final com.google.a.a.a.a.b.a.b.a.an g() {
        if (this.a == 4)
            v0 = this.u;
        else
            v0 = 0;
        return v0;
    }

}
