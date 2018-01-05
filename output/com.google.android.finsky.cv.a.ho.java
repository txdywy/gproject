package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.ho extends com.google.protobuf.nano.b
{

    public int a;
    public long b;
    public String c;
    public String d;
    public com.google.android.finsky.cv.a.bd e;
    public com.google.android.finsky.cv.a.bl f;
    public String g;

    ho() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = "";
        this.d = "";
        this.e = 0;
        this.f = 0;
        this.g = "";
        this.aO = 0;
        this.aP = -1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 16:
  4:            goto 14;
            case 26:
  4:            goto 27;
            case 42:
  4:            goto 40;
            case 50:
  4:            goto 57;
            case 58:
  4:            goto 70;
            case 74:
  4:            goto 83;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.b = p0.j();
 24:    this.a = this.a | 1;
 26:    goto 0;
 31:    this.d = p0.f();
 37:    this.a = this.a | 4;
 39:    goto 0;
 42:    if (this.f == 0)
 49:        this.f = new com.google.android.finsky.cv.a.bl();
 53:    p0.a(this.f);
 56:    goto 0;
 61:    this.g = p0.f();
 67:    this.a = this.a | 8;
 69:    goto 0;
 74:    this.c = p0.f();
 80:    this.a = this.a | 2;
 82:    goto 0;
 85:    if (this.e == 0)
 92:        this.e = new com.google.android.finsky.cv.a.bd();
 96:    p0.a(this.e);
 99:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a & 1)
            p0.b(2, this.b);
        if (this.a & 4)
            p0.a(3, this.d);
        if (this.f != 0)
            p0.b(5, this.f);
        if (this.a & 8)
            p0.a(6, this.g);
        if (this.a & 2)
            p0.a(7, this.c);
        if (this.e != 0)
            p0.b(9, this.e);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.f(2, this.b);
        if (this.a & 4)
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.d);
        if (this.f != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.f);
        if (this.a & 8)
            v0 = v0 + CodedOutputByteBufferNano.b(6, this.g);
        if (this.a & 2)
            v0 = v0 + CodedOutputByteBufferNano.b(7, this.c);
        if (this.e != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(9, this.e);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.ho))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.ho)p0;
                if ((this.a & 1) != (p0.a & 1))
                    v0 = 0;
                else if (this.b != p0.b)
                    v0 = 0;
                else if ((this.a & 2) != (p0.a & 2))
                    v0 = 0;
                else if (!this.c.equals(p0.c))
                    v0 = 0;
                else if ((this.a & 4) != (p0.a & 4))
                    v0 = 0;
                else if (!this.d.equals(p0.d))
                    v0 = 0;
                else if (this.e == 0) {
                    if (p0.e != 0)
                        v0 = 0;
                    else if (this.f == 0) {
                        if (p0.f != 0)
                            v0 = 0;
                        else if ((this.a & 8) != (p0.a & 8))
                            v0 = 0;
                        else if (!this.g.equals(p0.g))
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
                    else if ((this.a & 8) != (p0.a & 8))
                        v0 = 0;
                    else if (!this.g.equals(p0.g))
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.e.equals(p0.e))
                    v0 = 0;
                else if (this.f == 0) {
                    if (p0.f != 0)
                        v0 = 0;
                    else if ((this.a & 8) != (p0.a & 8))
                        v0 = 0;
                    else if (!this.g.equals(p0.g))
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
                else if ((this.a & 8) != (p0.a & 8))
                    v0 = 0;
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
        if (this.e == 0)
            v0 = 0;
        else
            v0 = this.e.hashCode();
        v3 = (v0 + ((((this.getClass().getName().hashCode() + 527) * 31 + (int)(this.b ^ this.b >>> 32)) * 31 + this.c.hashCode()) * 31 + this.d.hashCode()) * 31) * 31;
        if (this.f == 0)
            v0 = 0;
        else
            v0 = this.f.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return ((v0 + v3) * 31 + this.g.hashCode()) * 31 + v1;
    }

}
