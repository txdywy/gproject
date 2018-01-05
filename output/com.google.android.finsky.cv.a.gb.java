package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

public final class com.google.android.finsky.cv.a.gb extends com.google.protobuf.nano.b
{

    public int a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public com.google.android.finsky.cv.a.bd h;
    public boolean i;
    public com.google.android.finsky.cv.a.eu j;
    public boolean k;
    public ke[] l;

    gb() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = com.google.android.finsky.cv.a.ke.bG_();
        this.aO = 0;
        this.aP = -1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 10:
  5:            goto 15;
            case 18:
  5:            goto 28;
            case 26:
  5:            goto 41;
            case 34:
  5:            goto 54;
            case 42:
  5:            goto 67;
            case 48:
  5:            goto 80;
            case 58:
  5:            goto 93;
            case 64:
  5:            goto 110;
            case 74:
  5:            goto 123;
            case 82:
  5:            goto 141;
            case 90:
  5:            goto 205;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 19:    this.b = p0.f();
 25:    this.a = this.a | 1;
 27:    goto 1;
 32:    this.d = p0.f();
 38:    this.a = this.a | 4;
 40:    goto 1;
 45:    this.e = p0.f();
 51:    this.a = this.a | 8;
 53:    goto 1;
 58:    this.f = p0.f();
 64:    this.a = this.a | 16;
 66:    goto 1;
 71:    this.g = p0.f();
 77:    this.a = this.a | 32;
 79:    goto 1;
 84:    this.i = p0.e();
 90:    this.a = this.a | 64;
 92:    goto 1;
 95:    if (this.j == 0)
102:        this.j = new com.google.android.finsky.cv.a.eu();
106:    p0.a(this.j);
109:    goto 1;
114:    this.k = p0.e();
120:    this.a = this.a | 128;
122:    goto 1;
125:    if (this.h == 0)
132:        this.h = new com.google.android.finsky.cv.a.bd();
136:    p0.a(this.h);
139:    goto 1;
149:    if (this.l == 0)
151:        v0 = 0;
        else
187:        v0 = this.l.length;
153:    v2 = new ke[com.google.protobuf.nano.l.a(p0, 82) + v0];
155:    if (v0 != 0)
159:        System.arraycopy(this.l, 0, v2, 0, v0);
162:    while (v0 < v2.length - 1) {
172:        v2[v0] = new com.google.android.finsky.cv.a.ke();
176:        p0.a(v2[v0]);
179:        p0.a();
182:        v0 = v0 + 1;
        }
184:    goto 189;
194:    v2[v0] = new com.google.android.finsky.cv.a.ke();
198:    p0.a(v2[v0]);
201:    this.l = v2;
203:    goto 1;
209:    this.c = p0.f();
215:    this.a = this.a | 2;
217:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a & 1)
            p0.a(1, this.b);
        if (this.a & 4)
            p0.a(2, this.d);
        if (this.a & 8)
            p0.a(3, this.e);
        if (this.a & 16)
            p0.a(4, this.f);
        if (this.a & 32)
            p0.a(5, this.g);
        if (this.a & 64)
            p0.a(6, this.i);
        if (this.j != 0)
            p0.b(7, this.j);
        if (this.a & 128)
            p0.a(8, this.k);
        if (this.h != 0)
            p0.b(9, this.h);
        if (this.l != 0 && this.l.length > 0) {
            v0 = 0;
            while (v0 < this.l.length) {
                if (this.l[v0] != 0)
                    p0.b(10, this.l[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.a & 2)
            p0.a(11, this.c);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.b);
        if (this.a & 4)
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.d);
        if (this.a & 8)
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.e);
        if (this.a & 16)
            v0 = v0 + CodedOutputByteBufferNano.b(4, this.f);
        if (this.a & 32)
            v0 = v0 + CodedOutputByteBufferNano.b(5, this.g);
        if (this.a & 64)
            v0 = v0 + CodedOutputByteBufferNano.d(6) + 1;
        if (this.j != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(7, this.j);
        if (this.a & 128)
            v0 = v0 + CodedOutputByteBufferNano.d(8) + 1;
        if (this.h != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(9, this.h);
        if (this.l != 0 && this.l.length > 0) {
            v1 = v0;
            v0 = 0;
            while (v0 < this.l.length) {
                if (this.l[v0] != 0)
                    v1 = v1 + CodedOutputByteBufferNano.d(10, this.l[v0]);
                v0 = v0 + 1;
            }
            v0 = v1;
        }
        if (this.a & 2)
            v0 = v0 + CodedOutputByteBufferNano.b(11, this.c);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.gb))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.gb)p0;
                if ((this.a & 1) != (p0.a & 1))
                    v0 = 0;
                else if (!this.b.equals(p0.b))
                    v0 = 0;
                else if ((this.a & 2) != (p0.a & 2))
                    v0 = 0;
                else if (!this.c.equals(p0.c))
                    v0 = 0;
                else if ((this.a & 4) != (p0.a & 4))
                    v0 = 0;
                else if (!this.d.equals(p0.d))
                    v0 = 0;
                else if ((this.a & 8) != (p0.a & 8))
                    v0 = 0;
                else if (!this.e.equals(p0.e))
                    v0 = 0;
                else if ((this.a & 16) != (p0.a & 16))
                    v0 = 0;
                else if (!this.f.equals(p0.f))
                    v0 = 0;
                else if ((this.a & 32) != (p0.a & 32))
                    v0 = 0;
                else if (!this.g.equals(p0.g))
                    v0 = 0;
                else if (this.h == 0) {
                    if (p0.h != 0)
                        v0 = 0;
                    else if ((this.a & 64) != (p0.a & 64))
                        v0 = 0;
                    else if (this.i != p0.i)
                        v0 = 0;
                    else if (this.j == 0) {
                        if (p0.j != 0)
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
                    else if (!this.j.equals(p0.j))
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
                else if (!this.h.equals(p0.h))
                    v0 = 0;
                else if ((this.a & 64) != (p0.a & 64))
                    v0 = 0;
                else if (this.i != p0.i)
                    v0 = 0;
                else if (this.j == 0) {
                    if (p0.j != 0)
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
                else if (!this.j.equals(p0.j))
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
        v2 = 1231;
        v1 = 0;
        if (this.h == 0)
            v0 = 0;
        else
            v0 = this.h.hashCode();
        v5 = (v0 + (((((((this.getClass().getName().hashCode() + 527) * 31 + this.b.hashCode()) * 31 + this.c.hashCode()) * 31 + this.d.hashCode()) * 31 + this.e.hashCode()) * 31 + this.f.hashCode()) * 31 + this.g.hashCode()) * 31) * 31;
        if (this.i != 0)
            v0 = 1231;
        else
            v0 = 1237;
        v5 = (v0 + v5) * 31;
        if (this.j == 0)
            v0 = 0;
        else
            v0 = this.j.hashCode();
        if (this.k == 0)
            v2 = 1237;
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return (((v0 + v5) * 31 + v2) * 31 + com.google.protobuf.nano.h.a(this.l)) * 31 + v1;
    }

}
