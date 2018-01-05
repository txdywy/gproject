package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.bq extends com.google.protobuf.nano.b
{

    public int a;
    public com.google.android.finsky.cv.a.bz b;
    public com.google.android.finsky.cv.a.bz c;
    public long d;
    public int e;
    public int f;

    bq() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.aO = 0;
        this.aP = -1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 8:
  4:            goto 14;
            case 16:
  4:            goto 27;
            case 26:
  4:            goto 40;
            case 34:
  4:            goto 57;
            case 40:
  4:            goto 74;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.e = p0.i();
 24:    this.a = this.a | 2;
 26:    goto 0;
 31:    this.f = p0.i();
 37:    this.a = this.a | 4;
 39:    goto 0;
 42:    if (this.b == 0)
 49:        this.b = new com.google.android.finsky.cv.a.bz();
 53:    p0.a(this.b);
 56:    goto 0;
 59:    if (this.c == 0)
 66:        this.c = new com.google.android.finsky.cv.a.bz();
 70:    p0.a(this.c);
 73:    goto 0;
 78:    this.d = p0.j();
 84:    this.a = this.a | 1;
 86:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a & 2)
            p0.a(1, this.e);
        if (this.a & 4)
            p0.a(2, this.f);
        if (this.b != 0)
            p0.b(3, this.b);
        if (this.c != 0)
            p0.b(4, this.c);
        if (this.a & 1)
            p0.b(5, this.d);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a & 2)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.e);
        if (this.a & 4)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.f);
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.b);
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.c);
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.f(5, this.d);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.bq))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.bq)p0;
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
                        else if (this.f != p0.f)
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
                    else if (this.f != p0.f)
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
                    else if (this.f != p0.f)
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
                else if (this.f != p0.f)
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
        if (this.b == 0)
            v0 = 0;
        else
            v0 = this.b.hashCode();
        v3 = (v0 + (this.getClass().getName().hashCode() + 527) * 31) * 31;
        if (this.c == 0)
            v0 = 0;
        else
            v0 = this.c.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return ((((v0 + v3) * 31 + (int)(this.d ^ this.d >>> 32)) * 31 + this.e) * 31 + this.f) * 31 + v1;
    }

}
