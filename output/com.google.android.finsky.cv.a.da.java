package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

public final class com.google.android.finsky.cv.a.da extends com.google.protobuf.nano.b
{

    public int a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public lr[] g;

    da() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = com.google.android.finsky.cv.a.lr.bP_();
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
            case 50:
  5:            goto 80;
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
 45:    this.d = p0.f();
 51:    this.a = this.a | 4;
 53:    goto 1;
 58:    this.e = p0.f();
 64:    this.a = this.a | 8;
 66:    goto 1;
 71:    this.f = p0.f();
 77:    this.a = this.a | 16;
 79:    goto 1;
 88:    if (this.g == 0)
 90:        v0 = 0;
        else
126:        v0 = this.g.length;
 92:    v2 = new lr[com.google.protobuf.nano.l.a(p0, 50) + v0];
 94:    if (v0 != 0)
 98:        System.arraycopy(this.g, 0, v2, 0, v0);
101:    while (v0 < v2.length - 1) {
111:        v2[v0] = new com.google.android.finsky.cv.a.lr();
115:        p0.a(v2[v0]);
118:        p0.a();
121:        v0 = v0 + 1;
        }
123:    goto 128;
133:    v2[v0] = new com.google.android.finsky.cv.a.lr();
137:    p0.a(v2[v0]);
140:    this.g = v2;
142:    goto 1;
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
        if (this.a & 16)
            p0.a(5, this.f);
        if (this.g != 0 && this.g.length > 0) {
            v0 = 0;
            while (v0 < this.g.length) {
                if (this.g[v0] != 0)
                    p0.b(6, this.g[v0]);
                v0 = v0 + 1;
            }
        }
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
        if (this.a & 16)
            v0 = v0 + CodedOutputByteBufferNano.b(5, this.f);
        if (this.g != 0 && this.g.length > 0) {
            v1 = v0;
            v0 = 0;
            while (v0 < this.g.length) {
                if (this.g[v0] != 0)
                    v1 = v1 + CodedOutputByteBufferNano.d(6, this.g[v0]);
                v0 = v0 + 1;
            }
            v0 = v1;
        }
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.da))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.da)p0;
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
                else if (!com.google.protobuf.nano.h.a(this.g, p0.g))
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
        return v0 + (((((((this.getClass().getName().hashCode() + 527) * 31 + this.b.hashCode()) * 31 + this.c.hashCode()) * 31 + this.d.hashCode()) * 31 + this.e.hashCode()) * 31 + this.f.hashCode()) * 31 + com.google.protobuf.nano.h.a(this.g)) * 31;
    }

}
