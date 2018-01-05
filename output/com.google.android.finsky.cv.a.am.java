package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class com.google.android.finsky.cv.a.am extends com.google.protobuf.nano.b
{

    public int a;
    public String b;
    public String c;
    public String d;
    public String e;
    public com.google.android.finsky.cv.a.al f;
    public com.google.android.finsky.cv.a.al g;
    public com.google.android.finsky.cv.a.bd h;
    public String i;
    public byte[] j;
    public int k;

    am() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = "";
        this.j = com.google.protobuf.nano.l.l;
        this.k = 0;
        this.aO = 0;
        this.aP = -1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 10:
  4:            goto 14;
            case 18:
  4:            goto 27;
            case 26:
  4:            goto 40;
            case 34:
  4:            goto 53;
            case 42:
  4:            goto 66;
            case 50:
  4:            goto 83;
            case 58:
  4:            goto 100;
            case 66:
  4:            goto 117;
            case 74:
  4:            goto 131;
            case 80:
  4:            goto 145;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.b = p0.f();
 24:    this.a = this.a | 1;
 26:    goto 0;
 31:    this.c = p0.f();
 37:    this.a = this.a | 2;
 39:    goto 0;
 44:    this.d = p0.f();
 50:    this.a = this.a | 4;
 52:    goto 0;
 57:    this.e = p0.f();
 63:    this.a = this.a | 8;
 65:    goto 0;
 68:    if (this.f == 0)
 75:        this.f = new com.google.android.finsky.cv.a.al();
 79:    p0.a(this.f);
 82:    goto 0;
 85:    if (this.g == 0)
 92:        this.g = new com.google.android.finsky.cv.a.al();
 96:    p0.a(this.g);
 99:    goto 0;
102:    if (this.h == 0)
109:        this.h = new com.google.android.finsky.cv.a.bd();
113:    p0.a(this.h);
116:    goto 0;
121:    this.i = p0.f();
127:    this.a = this.a | 16;
129:    goto 0;
135:    this.j = p0.g();
141:    this.a = this.a | 32;
143:    goto 0;
149:    this.k = p0.i();
155:    this.a = this.a | 64;
157:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a & 1)
            p0.a(1, this.b);
        if (this.a & 2)
            p0.a(2, this.c);
        if (this.a & 4)
            p0.a(3, this.d);
        if (this.a & 8)
            p0.a(4, this.e);
        if (this.f != 0)
            p0.b(5, this.f);
        if (this.g != 0)
            p0.b(6, this.g);
        if (this.h != 0)
            p0.b(7, this.h);
        if (this.a & 16)
            p0.a(8, this.i);
        if (this.a & 32)
            p0.a(9, this.j);
        if (this.a & 64)
            p0.a(10, this.k);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.b);
        if (this.a & 2)
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.c);
        if (this.a & 4)
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.d);
        if (this.a & 8)
            v0 = v0 + CodedOutputByteBufferNano.b(4, this.e);
        if (this.f != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.f);
        if (this.g != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(6, this.g);
        if (this.h != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(7, this.h);
        if (this.a & 16)
            v0 = v0 + CodedOutputByteBufferNano.b(8, this.i);
        if (this.a & 32)
            v0 = v0 + CodedOutputByteBufferNano.b(9, this.j);
        if (this.a & 64)
            v0 = v0 + CodedOutputByteBufferNano.d(10, this.k);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.am))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.am)p0;
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
                else if (this.f == 0) {
                    if (p0.f != 0)
                        v0 = 0;
                    else if (this.g == 0) {
                        if (p0.g != 0)
                            v0 = 0;
                        else if (this.h == 0) {
                            if (p0.h != 0)
                                v0 = 0;
                            else if ((this.a & 16) != (p0.a & 16))
                                v0 = 0;
                            else if (!this.i.equals(p0.i))
                                v0 = 0;
                            else if ((this.a & 32) != (p0.a & 32))
                                v0 = 0;
                            else if (!Arrays.equals(this.j, p0.j))
                                v0 = 0;
                            else if ((this.a & 64) != (p0.a & 64))
                                v0 = 0;
                            else if (this.k != p0.k)
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
                        else if ((this.a & 16) != (p0.a & 16))
                            v0 = 0;
                        else if (!this.i.equals(p0.i))
                            v0 = 0;
                        else if ((this.a & 32) != (p0.a & 32))
                            v0 = 0;
                        else if (!Arrays.equals(this.j, p0.j))
                            v0 = 0;
                        else if ((this.a & 64) != (p0.a & 64))
                            v0 = 0;
                        else if (this.k != p0.k)
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
                    else if (this.h == 0) {
                        if (p0.h != 0)
                            v0 = 0;
                        else if ((this.a & 16) != (p0.a & 16))
                            v0 = 0;
                        else if (!this.i.equals(p0.i))
                            v0 = 0;
                        else if ((this.a & 32) != (p0.a & 32))
                            v0 = 0;
                        else if (!Arrays.equals(this.j, p0.j))
                            v0 = 0;
                        else if ((this.a & 64) != (p0.a & 64))
                            v0 = 0;
                        else if (this.k != p0.k)
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
                    else if ((this.a & 16) != (p0.a & 16))
                        v0 = 0;
                    else if (!this.i.equals(p0.i))
                        v0 = 0;
                    else if ((this.a & 32) != (p0.a & 32))
                        v0 = 0;
                    else if (!Arrays.equals(this.j, p0.j))
                        v0 = 0;
                    else if ((this.a & 64) != (p0.a & 64))
                        v0 = 0;
                    else if (this.k != p0.k)
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
                else if (this.g == 0) {
                    if (p0.g != 0)
                        v0 = 0;
                    else if (this.h == 0) {
                        if (p0.h != 0)
                            v0 = 0;
                        else if ((this.a & 16) != (p0.a & 16))
                            v0 = 0;
                        else if (!this.i.equals(p0.i))
                            v0 = 0;
                        else if ((this.a & 32) != (p0.a & 32))
                            v0 = 0;
                        else if (!Arrays.equals(this.j, p0.j))
                            v0 = 0;
                        else if ((this.a & 64) != (p0.a & 64))
                            v0 = 0;
                        else if (this.k != p0.k)
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
                    else if ((this.a & 16) != (p0.a & 16))
                        v0 = 0;
                    else if (!this.i.equals(p0.i))
                        v0 = 0;
                    else if ((this.a & 32) != (p0.a & 32))
                        v0 = 0;
                    else if (!Arrays.equals(this.j, p0.j))
                        v0 = 0;
                    else if ((this.a & 64) != (p0.a & 64))
                        v0 = 0;
                    else if (this.k != p0.k)
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
                else if (this.h == 0) {
                    if (p0.h != 0)
                        v0 = 0;
                    else if ((this.a & 16) != (p0.a & 16))
                        v0 = 0;
                    else if (!this.i.equals(p0.i))
                        v0 = 0;
                    else if ((this.a & 32) != (p0.a & 32))
                        v0 = 0;
                    else if (!Arrays.equals(this.j, p0.j))
                        v0 = 0;
                    else if ((this.a & 64) != (p0.a & 64))
                        v0 = 0;
                    else if (this.k != p0.k)
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
                else if ((this.a & 16) != (p0.a & 16))
                    v0 = 0;
                else if (!this.i.equals(p0.i))
                    v0 = 0;
                else if ((this.a & 32) != (p0.a & 32))
                    v0 = 0;
                else if (!Arrays.equals(this.j, p0.j))
                    v0 = 0;
                else if ((this.a & 64) != (p0.a & 64))
                    v0 = 0;
                else if (this.k != p0.k)
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
        v3 = (v0 + (((((this.getClass().getName().hashCode() + 527) * 31 + this.b.hashCode()) * 31 + this.c.hashCode()) * 31 + this.d.hashCode()) * 31 + this.e.hashCode()) * 31) * 31;
        if (this.g == 0)
            v0 = 0;
        else
            v0 = this.g.hashCode();
        v3 = (v0 + v3) * 31;
        if (this.h == 0)
            v0 = 0;
        else
            v0 = this.h.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return ((((v0 + v3) * 31 + this.i.hashCode()) * 31 + Arrays.hashCode(this.j)) * 31 + this.k) * 31 + v1;
    }

}
