package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

public final class com.google.android.finsky.cv.a.bj extends com.google.protobuf.nano.b
{

    public int a;
    public long[] b;
    public String c;
    public com.google.android.finsky.cv.a.bc d;
    public long e;
    public String f;

    bj() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = com.google.protobuf.nano.l.f;
        this.c = "";
        this.d = 0;
        this.e = 0;
        this.f = "";
        this.aO = 0;
        this.aP = -1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 9:
  5:            goto 15;
            case 10:
  5:            goto 66;
            case 18:
  5:            goto 113;
            case 26:
  5:            goto 126;
            case 33:
  5:            goto 144;
            case 42:
  5:            goto 158;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 23:    if (this.b == 0)
 25:        v0 = 0;
        else
 55:        v0 = this.b.length;
 27:    v2 = new long[com.google.protobuf.nano.l.a(p0, 9) + v0];
 29:    if (v0 != 0)
 33:        System.arraycopy(this.b, 0, v2, 0, v0);
 36:    while (v0 < v2.length - 1) {
 45:        v2[v0] = p0.l();
 47:        p0.a();
 50:        v0 = v0 + 1;
        }
 52:    goto 57;
 61:    v2[v0] = p0.l();
 63:    this.b = v2;
 65:    goto 1;
 66:    v0 = p0.i();
 70:    v2 = p0.c(v0);
 74:    v3 = v0 / 8;
 78:    if (this.b == 0)
 80:        v0 = 0;
        else
105:        v0 = this.b.length;
 82:    v3 = new long[v3 + v0];
 84:    if (v0 != 0)
 88:        System.arraycopy(this.b, 0, v3, 0, v0);
 91:    while (v0 < v3.length) {
 98:        v3[v0] = p0.l();
100:        v0 = v0 + 1;
        }
102:    goto 107;
107:    this.b = v3;
109:    p0.d(v2);
112:    goto 1;
117:    this.c = p0.f();
123:    this.a = this.a | 1;
125:    goto 1;
128:    if (this.d == 0)
135:        this.d = new com.google.android.finsky.cv.a.bc();
139:    p0.a(this.d);
142:    goto 1;
148:    this.e = p0.l();
154:    this.a = this.a | 2;
156:    goto 1;
162:    this.f = p0.f();
168:    this.a = this.a | 4;
170:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b != 0 && this.b.length > 0) {
            v0 = 0;
            while (v0 < this.b.length) {
                p0.c(1, this.b[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.a & 1)
            p0.a(2, this.c);
        if (this.d != 0)
            p0.b(3, this.d);
        if (this.a & 2)
            p0.c(4, this.e);
        if (this.a & 4)
            p0.a(5, this.f);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.b != 0 && this.b.length > 0)
            v0 = v0 + this.b.length * 8 + this.b.length * 1;
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.c);
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.d);
        if (this.a & 2)
            v0 = v0 + CodedOutputByteBufferNano.d(4) + 8;
        if (this.a & 4)
            v0 = v0 + CodedOutputByteBufferNano.b(5, this.f);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.bj))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.bj)p0;
                if (!com.google.protobuf.nano.h.a(this.b, p0.b))
                    v0 = 0;
                else if ((this.a & 1) != (p0.a & 1))
                    v0 = 0;
                else if (!this.c.equals(p0.c))
                    v0 = 0;
                else if (this.d == 0) {
                    if (p0.d != 0)
                        v0 = 0;
                    else if ((this.a & 2) != (p0.a & 2))
                        v0 = 0;
                    else if (this.e != p0.e)
                        v0 = 0;
                    else if ((this.a & 4) != (p0.a & 4))
                        v0 = 0;
                    else if (!this.f.equals(p0.f))
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.d.equals(p0.d))
                    v0 = 0;
                else if ((this.a & 2) != (p0.a & 2))
                    v0 = 0;
                else if (this.e != p0.e)
                    v0 = 0;
                else if ((this.a & 4) != (p0.a & 4))
                    v0 = 0;
                else if (!this.f.equals(p0.f))
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
        if (this.d == 0)
            v0 = 0;
        else
            v0 = this.d.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return (((v0 + (((this.getClass().getName().hashCode() + 527) * 31 + com.google.protobuf.nano.h.a(this.b)) * 31 + this.c.hashCode()) * 31) * 31 + (int)(this.e ^ this.e >>> 32)) * 31 + this.f.hashCode()) * 31 + v1;
    }

}
