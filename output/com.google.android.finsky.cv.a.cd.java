package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

public final class com.google.android.finsky.cv.a.cd extends com.google.protobuf.nano.b
{

    public int a;
    public String b;
    public String c;
    public double d;
    public long e;
    public String f;
    public boolean g;
    public ce[] h;
    public com.google.android.finsky.cv.a.bd i;

    cd() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = "";
        this.c = "";
        this.d = 0;
        this.e = 0;
        this.f = "";
        this.g = 0;
        this.h = com.google.android.finsky.cv.a.ce.aO_();
        this.i = 0;
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
            case 25:
  5:            goto 41;
            case 32:
  5:            goto 58;
            case 42:
  5:            goto 71;
            case 48:
  5:            goto 84;
            case 58:
  5:            goto 97;
            case 66:
  5:            goto 161;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 19:    this.b = p0.f();
 25:    this.a = this.a | 1;
 27:    goto 1;
 32:    this.c = p0.f();
 38:    this.a = this.a | 2;
 40:    goto 1;
 49:    this.d = Double.longBitsToDouble(p0.l());
 55:    this.a = this.a | 4;
 57:    goto 1;
 62:    this.e = p0.j();
 68:    this.a = this.a | 8;
 70:    goto 1;
 75:    this.f = p0.f();
 81:    this.a = this.a | 16;
 83:    goto 1;
 88:    this.g = p0.e();
 94:    this.a = this.a | 32;
 96:    goto 1;
105:    if (this.h == 0)
107:        v0 = 0;
        else
143:        v0 = this.h.length;
109:    v2 = new ce[com.google.protobuf.nano.l.a(p0, 58) + v0];
111:    if (v0 != 0)
115:        System.arraycopy(this.h, 0, v2, 0, v0);
118:    while (v0 < v2.length - 1) {
128:        v2[v0] = new com.google.android.finsky.cv.a.ce();
132:        p0.a(v2[v0]);
135:        p0.a();
138:        v0 = v0 + 1;
        }
140:    goto 145;
150:    v2[v0] = new com.google.android.finsky.cv.a.ce();
154:    p0.a(v2[v0]);
157:    this.h = v2;
159:    goto 1;
163:    if (this.i == 0)
170:        this.i = new com.google.android.finsky.cv.a.bd();
174:    p0.a(this.i);
177:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a & 1)
            p0.a(1, this.b);
        if (this.a & 2)
            p0.a(2, this.c);
        if (this.a & 4)
            p0.a(3, this.d);
        if (this.a & 8)
            p0.b(4, this.e);
        if (this.a & 16)
            p0.a(5, this.f);
        if (this.a & 32)
            p0.a(6, this.g);
        if (this.h != 0 && this.h.length > 0) {
            v0 = 0;
            while (v0 < this.h.length) {
                if (this.h[v0] != 0)
                    p0.b(7, this.h[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.i != 0)
            p0.b(8, this.i);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.b);
        if (this.a & 2)
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.c);
        if (this.a & 4)
            v0 = v0 + CodedOutputByteBufferNano.d(3) + 8;
        if (this.a & 8)
            v0 = v0 + CodedOutputByteBufferNano.f(4, this.e);
        if (this.a & 16)
            v0 = v0 + CodedOutputByteBufferNano.b(5, this.f);
        if (this.a & 32)
            v0 = v0 + CodedOutputByteBufferNano.d(6) + 1;
        if (this.h != 0 && this.h.length > 0) {
            v1 = v0;
            v0 = 0;
            while (v0 < this.h.length) {
                if (this.h[v0] != 0)
                    v1 = v1 + CodedOutputByteBufferNano.d(7, this.h[v0]);
                v0 = v0 + 1;
            }
            v0 = v1;
        }
        if (this.i != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(8, this.i);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.cd))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.cd)p0;
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
                else if (Double.doubleToLongBits(this.d) != Double.doubleToLongBits(p0.d))
                    v0 = 0;
                else if ((this.a & 8) != (p0.a & 8))
                    v0 = 0;
                else if (this.e != p0.e)
                    v0 = 0;
                else if ((this.a & 16) != (p0.a & 16))
                    v0 = 0;
                else if (!this.f.equals(p0.f))
                    v0 = 0;
                else if ((this.a & 32) != (p0.a & 32))
                    v0 = 0;
                else if (this.g != p0.g)
                    v0 = 0;
                else if (!com.google.protobuf.nano.h.a(this.h, p0.h))
                    v0 = 0;
                else if (this.i == 0) {
                    if (p0.i != 0)
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
        v2 = Double.doubleToLongBits(this.d);
        if (this.g != 0)
            v0 = 1231;
        else
            v0 = 1237;
        v3 = ((v0 + ((((((this.getClass().getName().hashCode() + 527) * 31 + this.b.hashCode()) * 31 + this.c.hashCode()) * 31 + (int)(v2 ^ v2 >>> 32)) * 31 + (int)(this.e ^ this.e >>> 32)) * 31 + this.f.hashCode()) * 31) * 31 + com.google.protobuf.nano.h.a(this.h)) * 31;
        if (this.i == 0)
            v0 = 0;
        else
            v0 = this.i.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return (v0 + v3) * 31 + v1;
    }

}
