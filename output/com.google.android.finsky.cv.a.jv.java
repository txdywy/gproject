package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.jv extends com.google.protobuf.nano.b
{

    public int a;
    public String b;
    public String c;
    public String d;
    public int e;
    public boolean f;
    public com.google.android.finsky.cv.a.ly g;

    jv() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = 0;
        this.f = 0;
        this.g = 0;
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
            case 32:
  4:            goto 53;
            case 40:
  4:            goto 66;
            case 50:
  4:            goto 79;
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
 57:    this.e = p0.i();
 63:    this.a = this.a | 8;
 65:    goto 0;
 70:    this.f = p0.e();
 76:    this.a = this.a | 16;
 78:    goto 0;
 81:    if (this.g == 0)
 88:        this.g = new com.google.android.finsky.cv.a.ly();
 92:    p0.a(this.g);
 95:    goto 0;
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
        if (this.g != 0)
            p0.b(6, this.g);
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
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.e);
        if (this.a & 16)
            v0 = v0 + CodedOutputByteBufferNano.d(5) + 1;
        if (this.g != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(6, this.g);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.jv))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.jv)p0;
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
                else if (this.e != p0.e)
                    v0 = 0;
                else if ((this.a & 16) != (p0.a & 16))
                    v0 = 0;
                else if (this.f != p0.f)
                    v0 = 0;
                else if (this.g == 0) {
                    if (p0.g != 0)
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
        if (this.f != 0)
            v0 = 1231;
        else
            v0 = 1237;
        v3 = (v0 + (((((this.getClass().getName().hashCode() + 527) * 31 + this.b.hashCode()) * 31 + this.c.hashCode()) * 31 + this.d.hashCode()) * 31 + this.e) * 31) * 31;
        if (this.g == 0)
            v0 = 0;
        else
            v0 = this.g.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return (v0 + v3) * 31 + v1;
    }

}
