package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.fj extends com.google.protobuf.nano.b
{

    public int a;
    public com.google.android.finsky.cv.a.bd b;
    public long c;
    public String d;
    public String e;
    public String f;

    fj() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = "";
        this.e = "";
        this.f = "";
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
            case 16:
  4:            goto 31;
            case 26:
  4:            goto 44;
            case 34:
  4:            goto 57;
            case 42:
  4:            goto 70;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 16:    if (this.b == 0)
 23:        this.b = new com.google.android.finsky.cv.a.bd();
 27:    p0.a(this.b);
 30:    goto 0;
 35:    this.c = p0.j();
 41:    this.a = this.a | 1;
 43:    goto 0;
 48:    this.d = p0.f();
 54:    this.a = this.a | 2;
 56:    goto 0;
 61:    this.e = p0.f();
 67:    this.a = this.a | 4;
 69:    goto 0;
 74:    this.f = p0.f();
 80:    this.a = this.a | 8;
 82:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b != 0)
            p0.b(1, this.b);
        if (this.a & 1)
            p0.a(2, this.c);
        if (this.a & 2)
            p0.a(3, this.d);
        if (this.a & 4)
            p0.a(4, this.e);
        if (this.a & 8)
            p0.a(5, this.f);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.b);
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.e(2, this.c);
        if (this.a & 2)
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.d);
        if (this.a & 4)
            v0 = v0 + CodedOutputByteBufferNano.b(4, this.e);
        if (this.a & 8)
            v0 = v0 + CodedOutputByteBufferNano.b(5, this.f);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.fj))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.fj)p0;
                if (this.b == 0) {
                    if (p0.b != 0)
                        v0 = 0;
                    else if ((this.a & 1) != (p0.a & 1))
                        v0 = 0;
                    else if (this.c != p0.c)
                        v0 = 0;
                    else if ((this.a & 2) != (p0.a & 2))
                        v0 = 0;
                    else if (!this.d.equals(p0.d))
                        v0 = 0;
                    else if ((this.a & 4) != (p0.a & 4))
                        v0 = 0;
                    else if (!this.e.equals(p0.e))
                        v0 = 0;
                    else if ((this.a & 8) != (p0.a & 8))
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
                else if (!this.b.equals(p0.b))
                    v0 = 0;
                else if ((this.a & 1) != (p0.a & 1))
                    v0 = 0;
                else if (this.c != p0.c)
                    v0 = 0;
                else if ((this.a & 2) != (p0.a & 2))
                    v0 = 0;
                else if (!this.d.equals(p0.d))
                    v0 = 0;
                else if ((this.a & 4) != (p0.a & 4))
                    v0 = 0;
                else if (!this.e.equals(p0.e))
                    v0 = 0;
                else if ((this.a & 8) != (p0.a & 8))
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
        if (this.b == 0)
            v0 = 0;
        else
            v0 = this.b.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return (((((v0 + (this.getClass().getName().hashCode() + 527) * 31) * 31 + (int)(this.c ^ this.c >>> 32)) * 31 + this.d.hashCode()) * 31 + this.e.hashCode()) * 31 + this.f.hashCode()) * 31 + v1;
    }

}
