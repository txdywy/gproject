package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

public final class com.google.android.finsky.cv.a.bw extends com.google.protobuf.nano.b
{

    public int a;
    public com.google.android.finsky.cv.a.bz b;
    public com.google.android.finsky.cv.a.bz c;
    public boolean d;
    public boolean e;
    public String f;
    public com.google.android.finsky.cv.a.bs g;
    public ax[] h;
    public com.google.android.finsky.cv.a.by i;
    public com.google.android.finsky.cv.a.bz j;
    public com.google.android.finsky.cv.a.bx k;
    public boolean l;
    public long m;
    public String n;
    public long o;
    public boolean p;

    bw() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = "";
        this.g = 0;
        this.h = com.google.android.finsky.cv.a.ax.aG_();
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = "";
        this.o = 0;
        this.p = 0;
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
  5:            goto 32;
            case 26:
  5:            goto 49;
            case 34:
  5:            goto 62;
            case 42:
  5:            goto 79;
            case 50:
  5:            goto 143;
            case 56:
  5:            goto 161;
            case 64:
  5:            goto 175;
            case 74:
  5:            goto 189;
            case 80:
  5:            goto 203;
            case 88:
  5:            goto 217;
            case 98:
  5:            goto 231;
            case 106:
  5:            goto 249;
            case 112:
  5:            goto 267;
            case 120:
  5:            goto 281;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 17:    if (this.b == 0)
 24:        this.b = new com.google.android.finsky.cv.a.bz();
 28:    p0.a(this.b);
 31:    goto 1;
 34:    if (this.c == 0)
 41:        this.c = new com.google.android.finsky.cv.a.bz();
 45:    p0.a(this.c);
 48:    goto 1;
 53:    this.f = p0.f();
 59:    this.a = this.a | 4;
 61:    goto 1;
 64:    if (this.g == 0)
 71:        this.g = new com.google.android.finsky.cv.a.bs();
 75:    p0.a(this.g);
 78:    goto 1;
 87:    if (this.h == 0)
 89:        v0 = 0;
        else
125:        v0 = this.h.length;
 91:    v2 = new ax[com.google.protobuf.nano.l.a(p0, 42) + v0];
 93:    if (v0 != 0)
 97:        System.arraycopy(this.h, 0, v2, 0, v0);
100:    while (v0 < v2.length - 1) {
110:        v2[v0] = new com.google.android.finsky.cv.a.ax();
114:        p0.a(v2[v0]);
117:        p0.a();
120:        v0 = v0 + 1;
        }
122:    goto 127;
132:    v2[v0] = new com.google.android.finsky.cv.a.ax();
136:    p0.a(v2[v0]);
139:    this.h = v2;
141:    goto 1;
145:    if (this.j == 0)
152:        this.j = new com.google.android.finsky.cv.a.bz();
156:    p0.a(this.j);
159:    goto 1;
165:    this.l = p0.e();
171:    this.a = this.a | 8;
173:    goto 1;
179:    this.m = p0.j();
185:    this.a = this.a | 16;
187:    goto 1;
193:    this.n = p0.f();
199:    this.a = this.a | 32;
201:    goto 1;
207:    this.o = p0.j();
213:    this.a = this.a | 64;
215:    goto 1;
221:    this.e = p0.e();
227:    this.a = this.a | 2;
229:    goto 1;
233:    if (this.i == 0)
240:        this.i = new com.google.android.finsky.cv.a.by();
244:    p0.a(this.i);
247:    goto 1;
251:    if (this.k == 0)
258:        this.k = new com.google.android.finsky.cv.a.bx();
262:    p0.a(this.k);
265:    goto 1;
271:    this.p = p0.e();
277:    this.a = this.a | 128;
279:    goto 1;
285:    this.d = p0.e();
291:    this.a = this.a | 1;
293:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b != 0)
            p0.b(1, this.b);
        if (this.c != 0)
            p0.b(2, this.c);
        if (this.a & 4)
            p0.a(3, this.f);
        if (this.g != 0)
            p0.b(4, this.g);
        if (this.h != 0 && this.h.length > 0) {
            v0 = 0;
            while (v0 < this.h.length) {
                if (this.h[v0] != 0)
                    p0.b(5, this.h[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.j != 0)
            p0.b(6, this.j);
        if (this.a & 8)
            p0.a(7, this.l);
        if (this.a & 16)
            p0.b(8, this.m);
        if (this.a & 32)
            p0.a(9, this.n);
        if (this.a & 64)
            p0.b(10, this.o);
        if (this.a & 2)
            p0.a(11, this.e);
        if (this.i != 0)
            p0.b(12, this.i);
        if (this.k != 0)
            p0.b(13, this.k);
        if (this.a & 128)
            p0.a(14, this.p);
        if (this.a & 1)
            p0.a(15, this.d);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.b);
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.c);
        if (this.a & 4)
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.f);
        if (this.g != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.g);
        if (this.h != 0 && this.h.length > 0) {
            v1 = v0;
            v0 = 0;
            while (v0 < this.h.length) {
                if (this.h[v0] != 0)
                    v1 = v1 + CodedOutputByteBufferNano.d(5, this.h[v0]);
                v0 = v0 + 1;
            }
            v0 = v1;
        }
        if (this.j != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(6, this.j);
        if (this.a & 8)
            v0 = v0 + CodedOutputByteBufferNano.d(7) + 1;
        if (this.a & 16)
            v0 = v0 + CodedOutputByteBufferNano.f(8, this.m);
        if (this.a & 32)
            v0 = v0 + CodedOutputByteBufferNano.b(9, this.n);
        if (this.a & 64)
            v0 = v0 + CodedOutputByteBufferNano.f(10, this.o);
        if (this.a & 2)
            v0 = v0 + CodedOutputByteBufferNano.d(11) + 1;
        if (this.i != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(12, this.i);
        if (this.k != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(13, this.k);
        if (this.a & 128)
            v0 = v0 + CodedOutputByteBufferNano.d(14) + 1;
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.d(15) + 1;
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.bw))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.bw)p0;
                if (this.b == 0) {
                    if (p0.b != 0)
                        v0 = 0;
                    else if (this.c == 0) {
                        if (p0.c != 0)
                            v0 = 0;
                        else if ((this.a & 1) != (p0.a & 1))
                            v0 = 0;
                        else if (this.d != p0.d)
                            v0 = 0;
                        else if ((this.a & 2) != (p0.a & 2))
                            v0 = 0;
                        else if (this.e != p0.e)
                            v0 = 0;
                        else if ((this.a & 4) != (p0.a & 4))
                            v0 = 0;
                        else if (!this.f.equals(p0.f))
                            v0 = 0;
                        else if (this.g == 0) {
                            if (p0.g != 0)
                                v0 = 0;
                            else if (!com.google.protobuf.nano.h.a(this.h, p0.h))
                                v0 = 0;
                            else if (this.i == 0) {
                                if (p0.i != 0)
                                    v0 = 0;
                                else if (this.j == 0) {
                                    if (p0.j != 0)
                                        v0 = 0;
                                    else if (this.k == 0) {
                                        if (p0.k != 0)
                                            v0 = 0;
                                        else if ((this.a & 8) != (p0.a & 8))
                                            v0 = 0;
                                        else if (this.l != p0.l)
                                            v0 = 0;
                                        else if ((this.a & 16) != (p0.a & 16))
                                            v0 = 0;
                                        else if (this.m != p0.m)
                                            v0 = 0;
                                        else if ((this.a & 32) != (p0.a & 32))
                                            v0 = 0;
                                        else if (!this.n.equals(p0.n))
                                            v0 = 0;
                                        else if ((this.a & 64) != (p0.a & 64))
                                            v0 = 0;
                                        else if (this.o != p0.o)
                                            v0 = 0;
                                        else if ((this.a & 128) != (p0.a & 128))
                                            v0 = 0;
                                        else if (this.p != p0.p)
                                            v0 = 0;
                                        else if (this.aO == 0 || this.aO.b()) {
                                            if (p0.aO != 0 && !p0.aO.b())
                                                v0 = 0;
                                        }
                                        else
                                            v0 = this.aO.equals(p0.aO);
                                    }
                                    else if (!this.k.equals(p0.k))
                                        v0 = 0;
                                    else if ((this.a & 8) != (p0.a & 8))
                                        v0 = 0;
                                    else if (this.l != p0.l)
                                        v0 = 0;
                                    else if ((this.a & 16) != (p0.a & 16))
                                        v0 = 0;
                                    else if (this.m != p0.m)
                                        v0 = 0;
                                    else if ((this.a & 32) != (p0.a & 32))
                                        v0 = 0;
                                    else if (!this.n.equals(p0.n))
                                        v0 = 0;
                                    else if ((this.a & 64) != (p0.a & 64))
                                        v0 = 0;
                                    else if (this.o != p0.o)
                                        v0 = 0;
                                    else if ((this.a & 128) != (p0.a & 128))
                                        v0 = 0;
                                    else if (this.p != p0.p)
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
                                else if (this.k == 0) {
                                    if (p0.k != 0)
                                        v0 = 0;
                                    else if ((this.a & 8) != (p0.a & 8))
                                        v0 = 0;
                                    else if (this.l != p0.l)
                                        v0 = 0;
                                    else if ((this.a & 16) != (p0.a & 16))
                                        v0 = 0;
                                    else if (this.m != p0.m)
                                        v0 = 0;
                                    else if ((this.a & 32) != (p0.a & 32))
                                        v0 = 0;
                                    else if (!this.n.equals(p0.n))
                                        v0 = 0;
                                    else if ((this.a & 64) != (p0.a & 64))
                                        v0 = 0;
                                    else if (this.o != p0.o)
                                        v0 = 0;
                                    else if ((this.a & 128) != (p0.a & 128))
                                        v0 = 0;
                                    else if (this.p != p0.p)
                                        v0 = 0;
                                    else if (this.aO == 0 || this.aO.b()) {
                                        if (p0.aO != 0 && !p0.aO.b())
                                            v0 = 0;
                                    }
                                    else
                                        v0 = this.aO.equals(p0.aO);
                                }
                                else if (!this.k.equals(p0.k))
                                    v0 = 0;
                                else if ((this.a & 8) != (p0.a & 8))
                                    v0 = 0;
                                else if (this.l != p0.l)
                                    v0 = 0;
                                else if ((this.a & 16) != (p0.a & 16))
                                    v0 = 0;
                                else if (this.m != p0.m)
                                    v0 = 0;
                                else if ((this.a & 32) != (p0.a & 32))
                                    v0 = 0;
                                else if (!this.n.equals(p0.n))
                                    v0 = 0;
                                else if ((this.a & 64) != (p0.a & 64))
                                    v0 = 0;
                                else if (this.o != p0.o)
                                    v0 = 0;
                                else if ((this.a & 128) != (p0.a & 128))
                                    v0 = 0;
                                else if (this.p != p0.p)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.i.equals(p0.i))
                                v0 = 0;
                            else if (this.j == 0) {
                                if (p0.j != 0)
                                    v0 = 0;
                                else if (this.k == 0) {
                                    if (p0.k != 0)
                                        v0 = 0;
                                    else if ((this.a & 8) != (p0.a & 8))
                                        v0 = 0;
                                    else if (this.l != p0.l)
                                        v0 = 0;
                                    else if ((this.a & 16) != (p0.a & 16))
                                        v0 = 0;
                                    else if (this.m != p0.m)
                                        v0 = 0;
                                    else if ((this.a & 32) != (p0.a & 32))
                                        v0 = 0;
                                    else if (!this.n.equals(p0.n))
                                        v0 = 0;
                                    else if ((this.a & 64) != (p0.a & 64))
                                        v0 = 0;
                                    else if (this.o != p0.o)
                                        v0 = 0;
                                    else if ((this.a & 128) != (p0.a & 128))
                                        v0 = 0;
                                    else if (this.p != p0.p)
                                        v0 = 0;
                                    else if (this.aO == 0 || this.aO.b()) {
                                        if (p0.aO != 0 && !p0.aO.b())
                                            v0 = 0;
                                    }
                                    else
                                        v0 = this.aO.equals(p0.aO);
                                }
                                else if (!this.k.equals(p0.k))
                                    v0 = 0;
                                else if ((this.a & 8) != (p0.a & 8))
                                    v0 = 0;
                                else if (this.l != p0.l)
                                    v0 = 0;
                                else if ((this.a & 16) != (p0.a & 16))
                                    v0 = 0;
                                else if (this.m != p0.m)
                                    v0 = 0;
                                else if ((this.a & 32) != (p0.a & 32))
                                    v0 = 0;
                                else if (!this.n.equals(p0.n))
                                    v0 = 0;
                                else if ((this.a & 64) != (p0.a & 64))
                                    v0 = 0;
                                else if (this.o != p0.o)
                                    v0 = 0;
                                else if ((this.a & 128) != (p0.a & 128))
                                    v0 = 0;
                                else if (this.p != p0.p)
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
                            else if (this.k == 0) {
                                if (p0.k != 0)
                                    v0 = 0;
                                else if ((this.a & 8) != (p0.a & 8))
                                    v0 = 0;
                                else if (this.l != p0.l)
                                    v0 = 0;
                                else if ((this.a & 16) != (p0.a & 16))
                                    v0 = 0;
                                else if (this.m != p0.m)
                                    v0 = 0;
                                else if ((this.a & 32) != (p0.a & 32))
                                    v0 = 0;
                                else if (!this.n.equals(p0.n))
                                    v0 = 0;
                                else if ((this.a & 64) != (p0.a & 64))
                                    v0 = 0;
                                else if (this.o != p0.o)
                                    v0 = 0;
                                else if ((this.a & 128) != (p0.a & 128))
                                    v0 = 0;
                                else if (this.p != p0.p)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.k.equals(p0.k))
                                v0 = 0;
                            else if ((this.a & 8) != (p0.a & 8))
                                v0 = 0;
                            else if (this.l != p0.l)
                                v0 = 0;
                            else if ((this.a & 16) != (p0.a & 16))
                                v0 = 0;
                            else if (this.m != p0.m)
                                v0 = 0;
                            else if ((this.a & 32) != (p0.a & 32))
                                v0 = 0;
                            else if (!this.n.equals(p0.n))
                                v0 = 0;
                            else if ((this.a & 64) != (p0.a & 64))
                                v0 = 0;
                            else if (this.o != p0.o)
                                v0 = 0;
                            else if ((this.a & 128) != (p0.a & 128))
                                v0 = 0;
                            else if (this.p != p0.p)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.g.equals(p0.g))
                            v0 = 0;
                        else if (!com.google.protobuf.nano.h.a(this.h, p0.h))
                            v0 = 0;
                        else if (this.i == 0) {
                            if (p0.i != 0)
                                v0 = 0;
                            else if (this.j == 0) {
                                if (p0.j != 0)
                                    v0 = 0;
                                else if (this.k == 0) {
                                    if (p0.k != 0)
                                        v0 = 0;
                                    else if ((this.a & 8) != (p0.a & 8))
                                        v0 = 0;
                                    else if (this.l != p0.l)
                                        v0 = 0;
                                    else if ((this.a & 16) != (p0.a & 16))
                                        v0 = 0;
                                    else if (this.m != p0.m)
                                        v0 = 0;
                                    else if ((this.a & 32) != (p0.a & 32))
                                        v0 = 0;
                                    else if (!this.n.equals(p0.n))
                                        v0 = 0;
                                    else if ((this.a & 64) != (p0.a & 64))
                                        v0 = 0;
                                    else if (this.o != p0.o)
                                        v0 = 0;
                                    else if ((this.a & 128) != (p0.a & 128))
                                        v0 = 0;
                                    else if (this.p != p0.p)
                                        v0 = 0;
                                    else if (this.aO == 0 || this.aO.b()) {
                                        if (p0.aO != 0 && !p0.aO.b())
                                            v0 = 0;
                                    }
                                    else
                                        v0 = this.aO.equals(p0.aO);
                                }
                                else if (!this.k.equals(p0.k))
                                    v0 = 0;
                                else if ((this.a & 8) != (p0.a & 8))
                                    v0 = 0;
                                else if (this.l != p0.l)
                                    v0 = 0;
                                else if ((this.a & 16) != (p0.a & 16))
                                    v0 = 0;
                                else if (this.m != p0.m)
                                    v0 = 0;
                                else if ((this.a & 32) != (p0.a & 32))
                                    v0 = 0;
                                else if (!this.n.equals(p0.n))
                                    v0 = 0;
                                else if ((this.a & 64) != (p0.a & 64))
                                    v0 = 0;
                                else if (this.o != p0.o)
                                    v0 = 0;
                                else if ((this.a & 128) != (p0.a & 128))
                                    v0 = 0;
                                else if (this.p != p0.p)
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
                            else if (this.k == 0) {
                                if (p0.k != 0)
                                    v0 = 0;
                                else if ((this.a & 8) != (p0.a & 8))
                                    v0 = 0;
                                else if (this.l != p0.l)
                                    v0 = 0;
                                else if ((this.a & 16) != (p0.a & 16))
                                    v0 = 0;
                                else if (this.m != p0.m)
                                    v0 = 0;
                                else if ((this.a & 32) != (p0.a & 32))
                                    v0 = 0;
                                else if (!this.n.equals(p0.n))
                                    v0 = 0;
                                else if ((this.a & 64) != (p0.a & 64))
                                    v0 = 0;
                                else if (this.o != p0.o)
                                    v0 = 0;
                                else if ((this.a & 128) != (p0.a & 128))
                                    v0 = 0;
                                else if (this.p != p0.p)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.k.equals(p0.k))
                                v0 = 0;
                            else if ((this.a & 8) != (p0.a & 8))
                                v0 = 0;
                            else if (this.l != p0.l)
                                v0 = 0;
                            else if ((this.a & 16) != (p0.a & 16))
                                v0 = 0;
                            else if (this.m != p0.m)
                                v0 = 0;
                            else if ((this.a & 32) != (p0.a & 32))
                                v0 = 0;
                            else if (!this.n.equals(p0.n))
                                v0 = 0;
                            else if ((this.a & 64) != (p0.a & 64))
                                v0 = 0;
                            else if (this.o != p0.o)
                                v0 = 0;
                            else if ((this.a & 128) != (p0.a & 128))
                                v0 = 0;
                            else if (this.p != p0.p)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.i.equals(p0.i))
                            v0 = 0;
                        else if (this.j == 0) {
                            if (p0.j != 0)
                                v0 = 0;
                            else if (this.k == 0) {
                                if (p0.k != 0)
                                    v0 = 0;
                                else if ((this.a & 8) != (p0.a & 8))
                                    v0 = 0;
                                else if (this.l != p0.l)
                                    v0 = 0;
                                else if ((this.a & 16) != (p0.a & 16))
                                    v0 = 0;
                                else if (this.m != p0.m)
                                    v0 = 0;
                                else if ((this.a & 32) != (p0.a & 32))
                                    v0 = 0;
                                else if (!this.n.equals(p0.n))
                                    v0 = 0;
                                else if ((this.a & 64) != (p0.a & 64))
                                    v0 = 0;
                                else if (this.o != p0.o)
                                    v0 = 0;
                                else if ((this.a & 128) != (p0.a & 128))
                                    v0 = 0;
                                else if (this.p != p0.p)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.k.equals(p0.k))
                                v0 = 0;
                            else if ((this.a & 8) != (p0.a & 8))
                                v0 = 0;
                            else if (this.l != p0.l)
                                v0 = 0;
                            else if ((this.a & 16) != (p0.a & 16))
                                v0 = 0;
                            else if (this.m != p0.m)
                                v0 = 0;
                            else if ((this.a & 32) != (p0.a & 32))
                                v0 = 0;
                            else if (!this.n.equals(p0.n))
                                v0 = 0;
                            else if ((this.a & 64) != (p0.a & 64))
                                v0 = 0;
                            else if (this.o != p0.o)
                                v0 = 0;
                            else if ((this.a & 128) != (p0.a & 128))
                                v0 = 0;
                            else if (this.p != p0.p)
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
                        else if (this.k == 0) {
                            if (p0.k != 0)
                                v0 = 0;
                            else if ((this.a & 8) != (p0.a & 8))
                                v0 = 0;
                            else if (this.l != p0.l)
                                v0 = 0;
                            else if ((this.a & 16) != (p0.a & 16))
                                v0 = 0;
                            else if (this.m != p0.m)
                                v0 = 0;
                            else if ((this.a & 32) != (p0.a & 32))
                                v0 = 0;
                            else if (!this.n.equals(p0.n))
                                v0 = 0;
                            else if ((this.a & 64) != (p0.a & 64))
                                v0 = 0;
                            else if (this.o != p0.o)
                                v0 = 0;
                            else if ((this.a & 128) != (p0.a & 128))
                                v0 = 0;
                            else if (this.p != p0.p)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.k.equals(p0.k))
                            v0 = 0;
                        else if ((this.a & 8) != (p0.a & 8))
                            v0 = 0;
                        else if (this.l != p0.l)
                            v0 = 0;
                        else if ((this.a & 16) != (p0.a & 16))
                            v0 = 0;
                        else if (this.m != p0.m)
                            v0 = 0;
                        else if ((this.a & 32) != (p0.a & 32))
                            v0 = 0;
                        else if (!this.n.equals(p0.n))
                            v0 = 0;
                        else if ((this.a & 64) != (p0.a & 64))
                            v0 = 0;
                        else if (this.o != p0.o)
                            v0 = 0;
                        else if ((this.a & 128) != (p0.a & 128))
                            v0 = 0;
                        else if (this.p != p0.p)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.c.equals(p0.c))
                        v0 = 0;
                    else if ((this.a & 1) != (p0.a & 1))
                        v0 = 0;
                    else if (this.d != p0.d)
                        v0 = 0;
                    else if ((this.a & 2) != (p0.a & 2))
                        v0 = 0;
                    else if (this.e != p0.e)
                        v0 = 0;
                    else if ((this.a & 4) != (p0.a & 4))
                        v0 = 0;
                    else if (!this.f.equals(p0.f))
                        v0 = 0;
                    else if (this.g == 0) {
                        if (p0.g != 0)
                            v0 = 0;
                        else if (!com.google.protobuf.nano.h.a(this.h, p0.h))
                            v0 = 0;
                        else if (this.i == 0) {
                            if (p0.i != 0)
                                v0 = 0;
                            else if (this.j == 0) {
                                if (p0.j != 0)
                                    v0 = 0;
                                else if (this.k == 0) {
                                    if (p0.k != 0)
                                        v0 = 0;
                                    else if ((this.a & 8) != (p0.a & 8))
                                        v0 = 0;
                                    else if (this.l != p0.l)
                                        v0 = 0;
                                    else if ((this.a & 16) != (p0.a & 16))
                                        v0 = 0;
                                    else if (this.m != p0.m)
                                        v0 = 0;
                                    else if ((this.a & 32) != (p0.a & 32))
                                        v0 = 0;
                                    else if (!this.n.equals(p0.n))
                                        v0 = 0;
                                    else if ((this.a & 64) != (p0.a & 64))
                                        v0 = 0;
                                    else if (this.o != p0.o)
                                        v0 = 0;
                                    else if ((this.a & 128) != (p0.a & 128))
                                        v0 = 0;
                                    else if (this.p != p0.p)
                                        v0 = 0;
                                    else if (this.aO == 0 || this.aO.b()) {
                                        if (p0.aO != 0 && !p0.aO.b())
                                            v0 = 0;
                                    }
                                    else
                                        v0 = this.aO.equals(p0.aO);
                                }
                                else if (!this.k.equals(p0.k))
                                    v0 = 0;
                                else if ((this.a & 8) != (p0.a & 8))
                                    v0 = 0;
                                else if (this.l != p0.l)
                                    v0 = 0;
                                else if ((this.a & 16) != (p0.a & 16))
                                    v0 = 0;
                                else if (this.m != p0.m)
                                    v0 = 0;
                                else if ((this.a & 32) != (p0.a & 32))
                                    v0 = 0;
                                else if (!this.n.equals(p0.n))
                                    v0 = 0;
                                else if ((this.a & 64) != (p0.a & 64))
                                    v0 = 0;
                                else if (this.o != p0.o)
                                    v0 = 0;
                                else if ((this.a & 128) != (p0.a & 128))
                                    v0 = 0;
                                else if (this.p != p0.p)
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
                            else if (this.k == 0) {
                                if (p0.k != 0)
                                    v0 = 0;
                                else if ((this.a & 8) != (p0.a & 8))
                                    v0 = 0;
                                else if (this.l != p0.l)
                                    v0 = 0;
                                else if ((this.a & 16) != (p0.a & 16))
                                    v0 = 0;
                                else if (this.m != p0.m)
                                    v0 = 0;
                                else if ((this.a & 32) != (p0.a & 32))
                                    v0 = 0;
                                else if (!this.n.equals(p0.n))
                                    v0 = 0;
                                else if ((this.a & 64) != (p0.a & 64))
                                    v0 = 0;
                                else if (this.o != p0.o)
                                    v0 = 0;
                                else if ((this.a & 128) != (p0.a & 128))
                                    v0 = 0;
                                else if (this.p != p0.p)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.k.equals(p0.k))
                                v0 = 0;
                            else if ((this.a & 8) != (p0.a & 8))
                                v0 = 0;
                            else if (this.l != p0.l)
                                v0 = 0;
                            else if ((this.a & 16) != (p0.a & 16))
                                v0 = 0;
                            else if (this.m != p0.m)
                                v0 = 0;
                            else if ((this.a & 32) != (p0.a & 32))
                                v0 = 0;
                            else if (!this.n.equals(p0.n))
                                v0 = 0;
                            else if ((this.a & 64) != (p0.a & 64))
                                v0 = 0;
                            else if (this.o != p0.o)
                                v0 = 0;
                            else if ((this.a & 128) != (p0.a & 128))
                                v0 = 0;
                            else if (this.p != p0.p)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.i.equals(p0.i))
                            v0 = 0;
                        else if (this.j == 0) {
                            if (p0.j != 0)
                                v0 = 0;
                            else if (this.k == 0) {
                                if (p0.k != 0)
                                    v0 = 0;
                                else if ((this.a & 8) != (p0.a & 8))
                                    v0 = 0;
                                else if (this.l != p0.l)
                                    v0 = 0;
                                else if ((this.a & 16) != (p0.a & 16))
                                    v0 = 0;
                                else if (this.m != p0.m)
                                    v0 = 0;
                                else if ((this.a & 32) != (p0.a & 32))
                                    v0 = 0;
                                else if (!this.n.equals(p0.n))
                                    v0 = 0;
                                else if ((this.a & 64) != (p0.a & 64))
                                    v0 = 0;
                                else if (this.o != p0.o)
                                    v0 = 0;
                                else if ((this.a & 128) != (p0.a & 128))
                                    v0 = 0;
                                else if (this.p != p0.p)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.k.equals(p0.k))
                                v0 = 0;
                            else if ((this.a & 8) != (p0.a & 8))
                                v0 = 0;
                            else if (this.l != p0.l)
                                v0 = 0;
                            else if ((this.a & 16) != (p0.a & 16))
                                v0 = 0;
                            else if (this.m != p0.m)
                                v0 = 0;
                            else if ((this.a & 32) != (p0.a & 32))
                                v0 = 0;
                            else if (!this.n.equals(p0.n))
                                v0 = 0;
                            else if ((this.a & 64) != (p0.a & 64))
                                v0 = 0;
                            else if (this.o != p0.o)
                                v0 = 0;
                            else if ((this.a & 128) != (p0.a & 128))
                                v0 = 0;
                            else if (this.p != p0.p)
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
                        else if (this.k == 0) {
                            if (p0.k != 0)
                                v0 = 0;
                            else if ((this.a & 8) != (p0.a & 8))
                                v0 = 0;
                            else if (this.l != p0.l)
                                v0 = 0;
                            else if ((this.a & 16) != (p0.a & 16))
                                v0 = 0;
                            else if (this.m != p0.m)
                                v0 = 0;
                            else if ((this.a & 32) != (p0.a & 32))
                                v0 = 0;
                            else if (!this.n.equals(p0.n))
                                v0 = 0;
                            else if ((this.a & 64) != (p0.a & 64))
                                v0 = 0;
                            else if (this.o != p0.o)
                                v0 = 0;
                            else if ((this.a & 128) != (p0.a & 128))
                                v0 = 0;
                            else if (this.p != p0.p)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.k.equals(p0.k))
                            v0 = 0;
                        else if ((this.a & 8) != (p0.a & 8))
                            v0 = 0;
                        else if (this.l != p0.l)
                            v0 = 0;
                        else if ((this.a & 16) != (p0.a & 16))
                            v0 = 0;
                        else if (this.m != p0.m)
                            v0 = 0;
                        else if ((this.a & 32) != (p0.a & 32))
                            v0 = 0;
                        else if (!this.n.equals(p0.n))
                            v0 = 0;
                        else if ((this.a & 64) != (p0.a & 64))
                            v0 = 0;
                        else if (this.o != p0.o)
                            v0 = 0;
                        else if ((this.a & 128) != (p0.a & 128))
                            v0 = 0;
                        else if (this.p != p0.p)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.g.equals(p0.g))
                        v0 = 0;
                    else if (!com.google.protobuf.nano.h.a(this.h, p0.h))
                        v0 = 0;
                    else if (this.i == 0) {
                        if (p0.i != 0)
                            v0 = 0;
                        else if (this.j == 0) {
                            if (p0.j != 0)
                                v0 = 0;
                            else if (this.k == 0) {
                                if (p0.k != 0)
                                    v0 = 0;
                                else if ((this.a & 8) != (p0.a & 8))
                                    v0 = 0;
                                else if (this.l != p0.l)
                                    v0 = 0;
                                else if ((this.a & 16) != (p0.a & 16))
                                    v0 = 0;
                                else if (this.m != p0.m)
                                    v0 = 0;
                                else if ((this.a & 32) != (p0.a & 32))
                                    v0 = 0;
                                else if (!this.n.equals(p0.n))
                                    v0 = 0;
                                else if ((this.a & 64) != (p0.a & 64))
                                    v0 = 0;
                                else if (this.o != p0.o)
                                    v0 = 0;
                                else if ((this.a & 128) != (p0.a & 128))
                                    v0 = 0;
                                else if (this.p != p0.p)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.k.equals(p0.k))
                                v0 = 0;
                            else if ((this.a & 8) != (p0.a & 8))
                                v0 = 0;
                            else if (this.l != p0.l)
                                v0 = 0;
                            else if ((this.a & 16) != (p0.a & 16))
                                v0 = 0;
                            else if (this.m != p0.m)
                                v0 = 0;
                            else if ((this.a & 32) != (p0.a & 32))
                                v0 = 0;
                            else if (!this.n.equals(p0.n))
                                v0 = 0;
                            else if ((this.a & 64) != (p0.a & 64))
                                v0 = 0;
                            else if (this.o != p0.o)
                                v0 = 0;
                            else if ((this.a & 128) != (p0.a & 128))
                                v0 = 0;
                            else if (this.p != p0.p)
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
                        else if (this.k == 0) {
                            if (p0.k != 0)
                                v0 = 0;
                            else if ((this.a & 8) != (p0.a & 8))
                                v0 = 0;
                            else if (this.l != p0.l)
                                v0 = 0;
                            else if ((this.a & 16) != (p0.a & 16))
                                v0 = 0;
                            else if (this.m != p0.m)
                                v0 = 0;
                            else if ((this.a & 32) != (p0.a & 32))
                                v0 = 0;
                            else if (!this.n.equals(p0.n))
                                v0 = 0;
                            else if ((this.a & 64) != (p0.a & 64))
                                v0 = 0;
                            else if (this.o != p0.o)
                                v0 = 0;
                            else if ((this.a & 128) != (p0.a & 128))
                                v0 = 0;
                            else if (this.p != p0.p)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.k.equals(p0.k))
                            v0 = 0;
                        else if ((this.a & 8) != (p0.a & 8))
                            v0 = 0;
                        else if (this.l != p0.l)
                            v0 = 0;
                        else if ((this.a & 16) != (p0.a & 16))
                            v0 = 0;
                        else if (this.m != p0.m)
                            v0 = 0;
                        else if ((this.a & 32) != (p0.a & 32))
                            v0 = 0;
                        else if (!this.n.equals(p0.n))
                            v0 = 0;
                        else if ((this.a & 64) != (p0.a & 64))
                            v0 = 0;
                        else if (this.o != p0.o)
                            v0 = 0;
                        else if ((this.a & 128) != (p0.a & 128))
                            v0 = 0;
                        else if (this.p != p0.p)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.i.equals(p0.i))
                        v0 = 0;
                    else if (this.j == 0) {
                        if (p0.j != 0)
                            v0 = 0;
                        else if (this.k == 0) {
                            if (p0.k != 0)
                                v0 = 0;
                            else if ((this.a & 8) != (p0.a & 8))
                                v0 = 0;
                            else if (this.l != p0.l)
                                v0 = 0;
                            else if ((this.a & 16) != (p0.a & 16))
                                v0 = 0;
                            else if (this.m != p0.m)
                                v0 = 0;
                            else if ((this.a & 32) != (p0.a & 32))
                                v0 = 0;
                            else if (!this.n.equals(p0.n))
                                v0 = 0;
                            else if ((this.a & 64) != (p0.a & 64))
                                v0 = 0;
                            else if (this.o != p0.o)
                                v0 = 0;
                            else if ((this.a & 128) != (p0.a & 128))
                                v0 = 0;
                            else if (this.p != p0.p)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.k.equals(p0.k))
                            v0 = 0;
                        else if ((this.a & 8) != (p0.a & 8))
                            v0 = 0;
                        else if (this.l != p0.l)
                            v0 = 0;
                        else if ((this.a & 16) != (p0.a & 16))
                            v0 = 0;
                        else if (this.m != p0.m)
                            v0 = 0;
                        else if ((this.a & 32) != (p0.a & 32))
                            v0 = 0;
                        else if (!this.n.equals(p0.n))
                            v0 = 0;
                        else if ((this.a & 64) != (p0.a & 64))
                            v0 = 0;
                        else if (this.o != p0.o)
                            v0 = 0;
                        else if ((this.a & 128) != (p0.a & 128))
                            v0 = 0;
                        else if (this.p != p0.p)
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
                    else if (this.k == 0) {
                        if (p0.k != 0)
                            v0 = 0;
                        else if ((this.a & 8) != (p0.a & 8))
                            v0 = 0;
                        else if (this.l != p0.l)
                            v0 = 0;
                        else if ((this.a & 16) != (p0.a & 16))
                            v0 = 0;
                        else if (this.m != p0.m)
                            v0 = 0;
                        else if ((this.a & 32) != (p0.a & 32))
                            v0 = 0;
                        else if (!this.n.equals(p0.n))
                            v0 = 0;
                        else if ((this.a & 64) != (p0.a & 64))
                            v0 = 0;
                        else if (this.o != p0.o)
                            v0 = 0;
                        else if ((this.a & 128) != (p0.a & 128))
                            v0 = 0;
                        else if (this.p != p0.p)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.k.equals(p0.k))
                        v0 = 0;
                    else if ((this.a & 8) != (p0.a & 8))
                        v0 = 0;
                    else if (this.l != p0.l)
                        v0 = 0;
                    else if ((this.a & 16) != (p0.a & 16))
                        v0 = 0;
                    else if (this.m != p0.m)
                        v0 = 0;
                    else if ((this.a & 32) != (p0.a & 32))
                        v0 = 0;
                    else if (!this.n.equals(p0.n))
                        v0 = 0;
                    else if ((this.a & 64) != (p0.a & 64))
                        v0 = 0;
                    else if (this.o != p0.o)
                        v0 = 0;
                    else if ((this.a & 128) != (p0.a & 128))
                        v0 = 0;
                    else if (this.p != p0.p)
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
                else if (this.c == 0) {
                    if (p0.c != 0)
                        v0 = 0;
                    else if ((this.a & 1) != (p0.a & 1))
                        v0 = 0;
                    else if (this.d != p0.d)
                        v0 = 0;
                    else if ((this.a & 2) != (p0.a & 2))
                        v0 = 0;
                    else if (this.e != p0.e)
                        v0 = 0;
                    else if ((this.a & 4) != (p0.a & 4))
                        v0 = 0;
                    else if (!this.f.equals(p0.f))
                        v0 = 0;
                    else if (this.g == 0) {
                        if (p0.g != 0)
                            v0 = 0;
                        else if (!com.google.protobuf.nano.h.a(this.h, p0.h))
                            v0 = 0;
                        else if (this.i == 0) {
                            if (p0.i != 0)
                                v0 = 0;
                            else if (this.j == 0) {
                                if (p0.j != 0)
                                    v0 = 0;
                                else if (this.k == 0) {
                                    if (p0.k != 0)
                                        v0 = 0;
                                    else if ((this.a & 8) != (p0.a & 8))
                                        v0 = 0;
                                    else if (this.l != p0.l)
                                        v0 = 0;
                                    else if ((this.a & 16) != (p0.a & 16))
                                        v0 = 0;
                                    else if (this.m != p0.m)
                                        v0 = 0;
                                    else if ((this.a & 32) != (p0.a & 32))
                                        v0 = 0;
                                    else if (!this.n.equals(p0.n))
                                        v0 = 0;
                                    else if ((this.a & 64) != (p0.a & 64))
                                        v0 = 0;
                                    else if (this.o != p0.o)
                                        v0 = 0;
                                    else if ((this.a & 128) != (p0.a & 128))
                                        v0 = 0;
                                    else if (this.p != p0.p)
                                        v0 = 0;
                                    else if (this.aO == 0 || this.aO.b()) {
                                        if (p0.aO != 0 && !p0.aO.b())
                                            v0 = 0;
                                    }
                                    else
                                        v0 = this.aO.equals(p0.aO);
                                }
                                else if (!this.k.equals(p0.k))
                                    v0 = 0;
                                else if ((this.a & 8) != (p0.a & 8))
                                    v0 = 0;
                                else if (this.l != p0.l)
                                    v0 = 0;
                                else if ((this.a & 16) != (p0.a & 16))
                                    v0 = 0;
                                else if (this.m != p0.m)
                                    v0 = 0;
                                else if ((this.a & 32) != (p0.a & 32))
                                    v0 = 0;
                                else if (!this.n.equals(p0.n))
                                    v0 = 0;
                                else if ((this.a & 64) != (p0.a & 64))
                                    v0 = 0;
                                else if (this.o != p0.o)
                                    v0 = 0;
                                else if ((this.a & 128) != (p0.a & 128))
                                    v0 = 0;
                                else if (this.p != p0.p)
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
                            else if (this.k == 0) {
                                if (p0.k != 0)
                                    v0 = 0;
                                else if ((this.a & 8) != (p0.a & 8))
                                    v0 = 0;
                                else if (this.l != p0.l)
                                    v0 = 0;
                                else if ((this.a & 16) != (p0.a & 16))
                                    v0 = 0;
                                else if (this.m != p0.m)
                                    v0 = 0;
                                else if ((this.a & 32) != (p0.a & 32))
                                    v0 = 0;
                                else if (!this.n.equals(p0.n))
                                    v0 = 0;
                                else if ((this.a & 64) != (p0.a & 64))
                                    v0 = 0;
                                else if (this.o != p0.o)
                                    v0 = 0;
                                else if ((this.a & 128) != (p0.a & 128))
                                    v0 = 0;
                                else if (this.p != p0.p)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.k.equals(p0.k))
                                v0 = 0;
                            else if ((this.a & 8) != (p0.a & 8))
                                v0 = 0;
                            else if (this.l != p0.l)
                                v0 = 0;
                            else if ((this.a & 16) != (p0.a & 16))
                                v0 = 0;
                            else if (this.m != p0.m)
                                v0 = 0;
                            else if ((this.a & 32) != (p0.a & 32))
                                v0 = 0;
                            else if (!this.n.equals(p0.n))
                                v0 = 0;
                            else if ((this.a & 64) != (p0.a & 64))
                                v0 = 0;
                            else if (this.o != p0.o)
                                v0 = 0;
                            else if ((this.a & 128) != (p0.a & 128))
                                v0 = 0;
                            else if (this.p != p0.p)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.i.equals(p0.i))
                            v0 = 0;
                        else if (this.j == 0) {
                            if (p0.j != 0)
                                v0 = 0;
                            else if (this.k == 0) {
                                if (p0.k != 0)
                                    v0 = 0;
                                else if ((this.a & 8) != (p0.a & 8))
                                    v0 = 0;
                                else if (this.l != p0.l)
                                    v0 = 0;
                                else if ((this.a & 16) != (p0.a & 16))
                                    v0 = 0;
                                else if (this.m != p0.m)
                                    v0 = 0;
                                else if ((this.a & 32) != (p0.a & 32))
                                    v0 = 0;
                                else if (!this.n.equals(p0.n))
                                    v0 = 0;
                                else if ((this.a & 64) != (p0.a & 64))
                                    v0 = 0;
                                else if (this.o != p0.o)
                                    v0 = 0;
                                else if ((this.a & 128) != (p0.a & 128))
                                    v0 = 0;
                                else if (this.p != p0.p)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.k.equals(p0.k))
                                v0 = 0;
                            else if ((this.a & 8) != (p0.a & 8))
                                v0 = 0;
                            else if (this.l != p0.l)
                                v0 = 0;
                            else if ((this.a & 16) != (p0.a & 16))
                                v0 = 0;
                            else if (this.m != p0.m)
                                v0 = 0;
                            else if ((this.a & 32) != (p0.a & 32))
                                v0 = 0;
                            else if (!this.n.equals(p0.n))
                                v0 = 0;
                            else if ((this.a & 64) != (p0.a & 64))
                                v0 = 0;
                            else if (this.o != p0.o)
                                v0 = 0;
                            else if ((this.a & 128) != (p0.a & 128))
                                v0 = 0;
                            else if (this.p != p0.p)
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
                        else if (this.k == 0) {
                            if (p0.k != 0)
                                v0 = 0;
                            else if ((this.a & 8) != (p0.a & 8))
                                v0 = 0;
                            else if (this.l != p0.l)
                                v0 = 0;
                            else if ((this.a & 16) != (p0.a & 16))
                                v0 = 0;
                            else if (this.m != p0.m)
                                v0 = 0;
                            else if ((this.a & 32) != (p0.a & 32))
                                v0 = 0;
                            else if (!this.n.equals(p0.n))
                                v0 = 0;
                            else if ((this.a & 64) != (p0.a & 64))
                                v0 = 0;
                            else if (this.o != p0.o)
                                v0 = 0;
                            else if ((this.a & 128) != (p0.a & 128))
                                v0 = 0;
                            else if (this.p != p0.p)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.k.equals(p0.k))
                            v0 = 0;
                        else if ((this.a & 8) != (p0.a & 8))
                            v0 = 0;
                        else if (this.l != p0.l)
                            v0 = 0;
                        else if ((this.a & 16) != (p0.a & 16))
                            v0 = 0;
                        else if (this.m != p0.m)
                            v0 = 0;
                        else if ((this.a & 32) != (p0.a & 32))
                            v0 = 0;
                        else if (!this.n.equals(p0.n))
                            v0 = 0;
                        else if ((this.a & 64) != (p0.a & 64))
                            v0 = 0;
                        else if (this.o != p0.o)
                            v0 = 0;
                        else if ((this.a & 128) != (p0.a & 128))
                            v0 = 0;
                        else if (this.p != p0.p)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.g.equals(p0.g))
                        v0 = 0;
                    else if (!com.google.protobuf.nano.h.a(this.h, p0.h))
                        v0 = 0;
                    else if (this.i == 0) {
                        if (p0.i != 0)
                            v0 = 0;
                        else if (this.j == 0) {
                            if (p0.j != 0)
                                v0 = 0;
                            else if (this.k == 0) {
                                if (p0.k != 0)
                                    v0 = 0;
                                else if ((this.a & 8) != (p0.a & 8))
                                    v0 = 0;
                                else if (this.l != p0.l)
                                    v0 = 0;
                                else if ((this.a & 16) != (p0.a & 16))
                                    v0 = 0;
                                else if (this.m != p0.m)
                                    v0 = 0;
                                else if ((this.a & 32) != (p0.a & 32))
                                    v0 = 0;
                                else if (!this.n.equals(p0.n))
                                    v0 = 0;
                                else if ((this.a & 64) != (p0.a & 64))
                                    v0 = 0;
                                else if (this.o != p0.o)
                                    v0 = 0;
                                else if ((this.a & 128) != (p0.a & 128))
                                    v0 = 0;
                                else if (this.p != p0.p)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.k.equals(p0.k))
                                v0 = 0;
                            else if ((this.a & 8) != (p0.a & 8))
                                v0 = 0;
                            else if (this.l != p0.l)
                                v0 = 0;
                            else if ((this.a & 16) != (p0.a & 16))
                                v0 = 0;
                            else if (this.m != p0.m)
                                v0 = 0;
                            else if ((this.a & 32) != (p0.a & 32))
                                v0 = 0;
                            else if (!this.n.equals(p0.n))
                                v0 = 0;
                            else if ((this.a & 64) != (p0.a & 64))
                                v0 = 0;
                            else if (this.o != p0.o)
                                v0 = 0;
                            else if ((this.a & 128) != (p0.a & 128))
                                v0 = 0;
                            else if (this.p != p0.p)
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
                        else if (this.k == 0) {
                            if (p0.k != 0)
                                v0 = 0;
                            else if ((this.a & 8) != (p0.a & 8))
                                v0 = 0;
                            else if (this.l != p0.l)
                                v0 = 0;
                            else if ((this.a & 16) != (p0.a & 16))
                                v0 = 0;
                            else if (this.m != p0.m)
                                v0 = 0;
                            else if ((this.a & 32) != (p0.a & 32))
                                v0 = 0;
                            else if (!this.n.equals(p0.n))
                                v0 = 0;
                            else if ((this.a & 64) != (p0.a & 64))
                                v0 = 0;
                            else if (this.o != p0.o)
                                v0 = 0;
                            else if ((this.a & 128) != (p0.a & 128))
                                v0 = 0;
                            else if (this.p != p0.p)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.k.equals(p0.k))
                            v0 = 0;
                        else if ((this.a & 8) != (p0.a & 8))
                            v0 = 0;
                        else if (this.l != p0.l)
                            v0 = 0;
                        else if ((this.a & 16) != (p0.a & 16))
                            v0 = 0;
                        else if (this.m != p0.m)
                            v0 = 0;
                        else if ((this.a & 32) != (p0.a & 32))
                            v0 = 0;
                        else if (!this.n.equals(p0.n))
                            v0 = 0;
                        else if ((this.a & 64) != (p0.a & 64))
                            v0 = 0;
                        else if (this.o != p0.o)
                            v0 = 0;
                        else if ((this.a & 128) != (p0.a & 128))
                            v0 = 0;
                        else if (this.p != p0.p)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.i.equals(p0.i))
                        v0 = 0;
                    else if (this.j == 0) {
                        if (p0.j != 0)
                            v0 = 0;
                        else if (this.k == 0) {
                            if (p0.k != 0)
                                v0 = 0;
                            else if ((this.a & 8) != (p0.a & 8))
                                v0 = 0;
                            else if (this.l != p0.l)
                                v0 = 0;
                            else if ((this.a & 16) != (p0.a & 16))
                                v0 = 0;
                            else if (this.m != p0.m)
                                v0 = 0;
                            else if ((this.a & 32) != (p0.a & 32))
                                v0 = 0;
                            else if (!this.n.equals(p0.n))
                                v0 = 0;
                            else if ((this.a & 64) != (p0.a & 64))
                                v0 = 0;
                            else if (this.o != p0.o)
                                v0 = 0;
                            else if ((this.a & 128) != (p0.a & 128))
                                v0 = 0;
                            else if (this.p != p0.p)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.k.equals(p0.k))
                            v0 = 0;
                        else if ((this.a & 8) != (p0.a & 8))
                            v0 = 0;
                        else if (this.l != p0.l)
                            v0 = 0;
                        else if ((this.a & 16) != (p0.a & 16))
                            v0 = 0;
                        else if (this.m != p0.m)
                            v0 = 0;
                        else if ((this.a & 32) != (p0.a & 32))
                            v0 = 0;
                        else if (!this.n.equals(p0.n))
                            v0 = 0;
                        else if ((this.a & 64) != (p0.a & 64))
                            v0 = 0;
                        else if (this.o != p0.o)
                            v0 = 0;
                        else if ((this.a & 128) != (p0.a & 128))
                            v0 = 0;
                        else if (this.p != p0.p)
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
                    else if (this.k == 0) {
                        if (p0.k != 0)
                            v0 = 0;
                        else if ((this.a & 8) != (p0.a & 8))
                            v0 = 0;
                        else if (this.l != p0.l)
                            v0 = 0;
                        else if ((this.a & 16) != (p0.a & 16))
                            v0 = 0;
                        else if (this.m != p0.m)
                            v0 = 0;
                        else if ((this.a & 32) != (p0.a & 32))
                            v0 = 0;
                        else if (!this.n.equals(p0.n))
                            v0 = 0;
                        else if ((this.a & 64) != (p0.a & 64))
                            v0 = 0;
                        else if (this.o != p0.o)
                            v0 = 0;
                        else if ((this.a & 128) != (p0.a & 128))
                            v0 = 0;
                        else if (this.p != p0.p)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.k.equals(p0.k))
                        v0 = 0;
                    else if ((this.a & 8) != (p0.a & 8))
                        v0 = 0;
                    else if (this.l != p0.l)
                        v0 = 0;
                    else if ((this.a & 16) != (p0.a & 16))
                        v0 = 0;
                    else if (this.m != p0.m)
                        v0 = 0;
                    else if ((this.a & 32) != (p0.a & 32))
                        v0 = 0;
                    else if (!this.n.equals(p0.n))
                        v0 = 0;
                    else if ((this.a & 64) != (p0.a & 64))
                        v0 = 0;
                    else if (this.o != p0.o)
                        v0 = 0;
                    else if ((this.a & 128) != (p0.a & 128))
                        v0 = 0;
                    else if (this.p != p0.p)
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.c.equals(p0.c))
                    v0 = 0;
                else if ((this.a & 1) != (p0.a & 1))
                    v0 = 0;
                else if (this.d != p0.d)
                    v0 = 0;
                else if ((this.a & 2) != (p0.a & 2))
                    v0 = 0;
                else if (this.e != p0.e)
                    v0 = 0;
                else if ((this.a & 4) != (p0.a & 4))
                    v0 = 0;
                else if (!this.f.equals(p0.f))
                    v0 = 0;
                else if (this.g == 0) {
                    if (p0.g != 0)
                        v0 = 0;
                    else if (!com.google.protobuf.nano.h.a(this.h, p0.h))
                        v0 = 0;
                    else if (this.i == 0) {
                        if (p0.i != 0)
                            v0 = 0;
                        else if (this.j == 0) {
                            if (p0.j != 0)
                                v0 = 0;
                            else if (this.k == 0) {
                                if (p0.k != 0)
                                    v0 = 0;
                                else if ((this.a & 8) != (p0.a & 8))
                                    v0 = 0;
                                else if (this.l != p0.l)
                                    v0 = 0;
                                else if ((this.a & 16) != (p0.a & 16))
                                    v0 = 0;
                                else if (this.m != p0.m)
                                    v0 = 0;
                                else if ((this.a & 32) != (p0.a & 32))
                                    v0 = 0;
                                else if (!this.n.equals(p0.n))
                                    v0 = 0;
                                else if ((this.a & 64) != (p0.a & 64))
                                    v0 = 0;
                                else if (this.o != p0.o)
                                    v0 = 0;
                                else if ((this.a & 128) != (p0.a & 128))
                                    v0 = 0;
                                else if (this.p != p0.p)
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.k.equals(p0.k))
                                v0 = 0;
                            else if ((this.a & 8) != (p0.a & 8))
                                v0 = 0;
                            else if (this.l != p0.l)
                                v0 = 0;
                            else if ((this.a & 16) != (p0.a & 16))
                                v0 = 0;
                            else if (this.m != p0.m)
                                v0 = 0;
                            else if ((this.a & 32) != (p0.a & 32))
                                v0 = 0;
                            else if (!this.n.equals(p0.n))
                                v0 = 0;
                            else if ((this.a & 64) != (p0.a & 64))
                                v0 = 0;
                            else if (this.o != p0.o)
                                v0 = 0;
                            else if ((this.a & 128) != (p0.a & 128))
                                v0 = 0;
                            else if (this.p != p0.p)
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
                        else if (this.k == 0) {
                            if (p0.k != 0)
                                v0 = 0;
                            else if ((this.a & 8) != (p0.a & 8))
                                v0 = 0;
                            else if (this.l != p0.l)
                                v0 = 0;
                            else if ((this.a & 16) != (p0.a & 16))
                                v0 = 0;
                            else if (this.m != p0.m)
                                v0 = 0;
                            else if ((this.a & 32) != (p0.a & 32))
                                v0 = 0;
                            else if (!this.n.equals(p0.n))
                                v0 = 0;
                            else if ((this.a & 64) != (p0.a & 64))
                                v0 = 0;
                            else if (this.o != p0.o)
                                v0 = 0;
                            else if ((this.a & 128) != (p0.a & 128))
                                v0 = 0;
                            else if (this.p != p0.p)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.k.equals(p0.k))
                            v0 = 0;
                        else if ((this.a & 8) != (p0.a & 8))
                            v0 = 0;
                        else if (this.l != p0.l)
                            v0 = 0;
                        else if ((this.a & 16) != (p0.a & 16))
                            v0 = 0;
                        else if (this.m != p0.m)
                            v0 = 0;
                        else if ((this.a & 32) != (p0.a & 32))
                            v0 = 0;
                        else if (!this.n.equals(p0.n))
                            v0 = 0;
                        else if ((this.a & 64) != (p0.a & 64))
                            v0 = 0;
                        else if (this.o != p0.o)
                            v0 = 0;
                        else if ((this.a & 128) != (p0.a & 128))
                            v0 = 0;
                        else if (this.p != p0.p)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.i.equals(p0.i))
                        v0 = 0;
                    else if (this.j == 0) {
                        if (p0.j != 0)
                            v0 = 0;
                        else if (this.k == 0) {
                            if (p0.k != 0)
                                v0 = 0;
                            else if ((this.a & 8) != (p0.a & 8))
                                v0 = 0;
                            else if (this.l != p0.l)
                                v0 = 0;
                            else if ((this.a & 16) != (p0.a & 16))
                                v0 = 0;
                            else if (this.m != p0.m)
                                v0 = 0;
                            else if ((this.a & 32) != (p0.a & 32))
                                v0 = 0;
                            else if (!this.n.equals(p0.n))
                                v0 = 0;
                            else if ((this.a & 64) != (p0.a & 64))
                                v0 = 0;
                            else if (this.o != p0.o)
                                v0 = 0;
                            else if ((this.a & 128) != (p0.a & 128))
                                v0 = 0;
                            else if (this.p != p0.p)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.k.equals(p0.k))
                            v0 = 0;
                        else if ((this.a & 8) != (p0.a & 8))
                            v0 = 0;
                        else if (this.l != p0.l)
                            v0 = 0;
                        else if ((this.a & 16) != (p0.a & 16))
                            v0 = 0;
                        else if (this.m != p0.m)
                            v0 = 0;
                        else if ((this.a & 32) != (p0.a & 32))
                            v0 = 0;
                        else if (!this.n.equals(p0.n))
                            v0 = 0;
                        else if ((this.a & 64) != (p0.a & 64))
                            v0 = 0;
                        else if (this.o != p0.o)
                            v0 = 0;
                        else if ((this.a & 128) != (p0.a & 128))
                            v0 = 0;
                        else if (this.p != p0.p)
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
                    else if (this.k == 0) {
                        if (p0.k != 0)
                            v0 = 0;
                        else if ((this.a & 8) != (p0.a & 8))
                            v0 = 0;
                        else if (this.l != p0.l)
                            v0 = 0;
                        else if ((this.a & 16) != (p0.a & 16))
                            v0 = 0;
                        else if (this.m != p0.m)
                            v0 = 0;
                        else if ((this.a & 32) != (p0.a & 32))
                            v0 = 0;
                        else if (!this.n.equals(p0.n))
                            v0 = 0;
                        else if ((this.a & 64) != (p0.a & 64))
                            v0 = 0;
                        else if (this.o != p0.o)
                            v0 = 0;
                        else if ((this.a & 128) != (p0.a & 128))
                            v0 = 0;
                        else if (this.p != p0.p)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.k.equals(p0.k))
                        v0 = 0;
                    else if ((this.a & 8) != (p0.a & 8))
                        v0 = 0;
                    else if (this.l != p0.l)
                        v0 = 0;
                    else if ((this.a & 16) != (p0.a & 16))
                        v0 = 0;
                    else if (this.m != p0.m)
                        v0 = 0;
                    else if ((this.a & 32) != (p0.a & 32))
                        v0 = 0;
                    else if (!this.n.equals(p0.n))
                        v0 = 0;
                    else if ((this.a & 64) != (p0.a & 64))
                        v0 = 0;
                    else if (this.o != p0.o)
                        v0 = 0;
                    else if ((this.a & 128) != (p0.a & 128))
                        v0 = 0;
                    else if (this.p != p0.p)
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.g.equals(p0.g))
                    v0 = 0;
                else if (!com.google.protobuf.nano.h.a(this.h, p0.h))
                    v0 = 0;
                else if (this.i == 0) {
                    if (p0.i != 0)
                        v0 = 0;
                    else if (this.j == 0) {
                        if (p0.j != 0)
                            v0 = 0;
                        else if (this.k == 0) {
                            if (p0.k != 0)
                                v0 = 0;
                            else if ((this.a & 8) != (p0.a & 8))
                                v0 = 0;
                            else if (this.l != p0.l)
                                v0 = 0;
                            else if ((this.a & 16) != (p0.a & 16))
                                v0 = 0;
                            else if (this.m != p0.m)
                                v0 = 0;
                            else if ((this.a & 32) != (p0.a & 32))
                                v0 = 0;
                            else if (!this.n.equals(p0.n))
                                v0 = 0;
                            else if ((this.a & 64) != (p0.a & 64))
                                v0 = 0;
                            else if (this.o != p0.o)
                                v0 = 0;
                            else if ((this.a & 128) != (p0.a & 128))
                                v0 = 0;
                            else if (this.p != p0.p)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.k.equals(p0.k))
                            v0 = 0;
                        else if ((this.a & 8) != (p0.a & 8))
                            v0 = 0;
                        else if (this.l != p0.l)
                            v0 = 0;
                        else if ((this.a & 16) != (p0.a & 16))
                            v0 = 0;
                        else if (this.m != p0.m)
                            v0 = 0;
                        else if ((this.a & 32) != (p0.a & 32))
                            v0 = 0;
                        else if (!this.n.equals(p0.n))
                            v0 = 0;
                        else if ((this.a & 64) != (p0.a & 64))
                            v0 = 0;
                        else if (this.o != p0.o)
                            v0 = 0;
                        else if ((this.a & 128) != (p0.a & 128))
                            v0 = 0;
                        else if (this.p != p0.p)
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
                    else if (this.k == 0) {
                        if (p0.k != 0)
                            v0 = 0;
                        else if ((this.a & 8) != (p0.a & 8))
                            v0 = 0;
                        else if (this.l != p0.l)
                            v0 = 0;
                        else if ((this.a & 16) != (p0.a & 16))
                            v0 = 0;
                        else if (this.m != p0.m)
                            v0 = 0;
                        else if ((this.a & 32) != (p0.a & 32))
                            v0 = 0;
                        else if (!this.n.equals(p0.n))
                            v0 = 0;
                        else if ((this.a & 64) != (p0.a & 64))
                            v0 = 0;
                        else if (this.o != p0.o)
                            v0 = 0;
                        else if ((this.a & 128) != (p0.a & 128))
                            v0 = 0;
                        else if (this.p != p0.p)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.k.equals(p0.k))
                        v0 = 0;
                    else if ((this.a & 8) != (p0.a & 8))
                        v0 = 0;
                    else if (this.l != p0.l)
                        v0 = 0;
                    else if ((this.a & 16) != (p0.a & 16))
                        v0 = 0;
                    else if (this.m != p0.m)
                        v0 = 0;
                    else if ((this.a & 32) != (p0.a & 32))
                        v0 = 0;
                    else if (!this.n.equals(p0.n))
                        v0 = 0;
                    else if ((this.a & 64) != (p0.a & 64))
                        v0 = 0;
                    else if (this.o != p0.o)
                        v0 = 0;
                    else if ((this.a & 128) != (p0.a & 128))
                        v0 = 0;
                    else if (this.p != p0.p)
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.i.equals(p0.i))
                    v0 = 0;
                else if (this.j == 0) {
                    if (p0.j != 0)
                        v0 = 0;
                    else if (this.k == 0) {
                        if (p0.k != 0)
                            v0 = 0;
                        else if ((this.a & 8) != (p0.a & 8))
                            v0 = 0;
                        else if (this.l != p0.l)
                            v0 = 0;
                        else if ((this.a & 16) != (p0.a & 16))
                            v0 = 0;
                        else if (this.m != p0.m)
                            v0 = 0;
                        else if ((this.a & 32) != (p0.a & 32))
                            v0 = 0;
                        else if (!this.n.equals(p0.n))
                            v0 = 0;
                        else if ((this.a & 64) != (p0.a & 64))
                            v0 = 0;
                        else if (this.o != p0.o)
                            v0 = 0;
                        else if ((this.a & 128) != (p0.a & 128))
                            v0 = 0;
                        else if (this.p != p0.p)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.k.equals(p0.k))
                        v0 = 0;
                    else if ((this.a & 8) != (p0.a & 8))
                        v0 = 0;
                    else if (this.l != p0.l)
                        v0 = 0;
                    else if ((this.a & 16) != (p0.a & 16))
                        v0 = 0;
                    else if (this.m != p0.m)
                        v0 = 0;
                    else if ((this.a & 32) != (p0.a & 32))
                        v0 = 0;
                    else if (!this.n.equals(p0.n))
                        v0 = 0;
                    else if ((this.a & 64) != (p0.a & 64))
                        v0 = 0;
                    else if (this.o != p0.o)
                        v0 = 0;
                    else if ((this.a & 128) != (p0.a & 128))
                        v0 = 0;
                    else if (this.p != p0.p)
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
                else if (this.k == 0) {
                    if (p0.k != 0)
                        v0 = 0;
                    else if ((this.a & 8) != (p0.a & 8))
                        v0 = 0;
                    else if (this.l != p0.l)
                        v0 = 0;
                    else if ((this.a & 16) != (p0.a & 16))
                        v0 = 0;
                    else if (this.m != p0.m)
                        v0 = 0;
                    else if ((this.a & 32) != (p0.a & 32))
                        v0 = 0;
                    else if (!this.n.equals(p0.n))
                        v0 = 0;
                    else if ((this.a & 64) != (p0.a & 64))
                        v0 = 0;
                    else if (this.o != p0.o)
                        v0 = 0;
                    else if ((this.a & 128) != (p0.a & 128))
                        v0 = 0;
                    else if (this.p != p0.p)
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.k.equals(p0.k))
                    v0 = 0;
                else if ((this.a & 8) != (p0.a & 8))
                    v0 = 0;
                else if (this.l != p0.l)
                    v0 = 0;
                else if ((this.a & 16) != (p0.a & 16))
                    v0 = 0;
                else if (this.m != p0.m)
                    v0 = 0;
                else if ((this.a & 32) != (p0.a & 32))
                    v0 = 0;
                else if (!this.n.equals(p0.n))
                    v0 = 0;
                else if ((this.a & 64) != (p0.a & 64))
                    v0 = 0;
                else if (this.o != p0.o)
                    v0 = 0;
                else if ((this.a & 128) != (p0.a & 128))
                    v0 = 0;
                else if (this.p != p0.p)
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
        if (this.b == 0)
            v0 = 0;
        else
            v0 = this.b.hashCode();
        v5 = (v0 + (this.getClass().getName().hashCode() + 527) * 31) * 31;
        if (this.c == 0)
            v0 = 0;
        else
            v0 = this.c.hashCode();
        v5 = (v0 + v5) * 31;
        if (this.d != 0)
            v0 = 1231;
        else
            v0 = 1237;
        v5 = (v0 + v5) * 31;
        if (this.e != 0)
            v0 = 1231;
        else
            v0 = 1237;
        v5 = ((v0 + v5) * 31 + this.f.hashCode()) * 31;
        if (this.g == 0)
            v0 = 0;
        else
            v0 = this.g.hashCode();
        v5 = ((v0 + v5) * 31 + com.google.protobuf.nano.h.a(this.h)) * 31;
        if (this.i == 0)
            v0 = 0;
        else
            v0 = this.i.hashCode();
        v5 = (v0 + v5) * 31;
        if (this.j == 0)
            v0 = 0;
        else
            v0 = this.j.hashCode();
        v5 = (v0 + v5) * 31;
        if (this.k == 0)
            v0 = 0;
        else
            v0 = this.k.hashCode();
        v5 = (v0 + v5) * 31;
        if (this.l != 0)
            v0 = 1231;
        else
            v0 = 1237;
        if (this.p == 0)
            v2 = 1237;
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return (((((v0 + v5) * 31 + (int)(this.m ^ this.m >>> 32)) * 31 + this.n.hashCode()) * 31 + (int)(this.o ^ this.o >>> 32)) * 31 + v2) * 31 + v1;
    }

}
