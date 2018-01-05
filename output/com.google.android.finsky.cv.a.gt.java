package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.gt extends com.google.protobuf.nano.b
{

    public int a;
    public String b;
    public int c;
    public String d;
    public long e;
    public long f;

    gt() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = "";
        this.c = 300;
        this.d = "";
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
            case 10:
  4:            goto 14;
            case 16:
  4:            goto 27;
            case 26:
  4:            goto 40;
            case 32:
  4:            goto 53;
            case 40:
  4:            goto 66;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.b = p0.f();
 24:    this.a = this.a | 1;
 26:    goto 0;
 31:    this.c = p0.i();
 37:    this.a = this.a | 2;
 39:    goto 0;
 44:    this.d = p0.f();
 50:    this.a = this.a | 4;
 52:    goto 0;
 57:    this.e = p0.j();
 63:    this.a = this.a | 8;
 65:    goto 0;
 70:    this.f = p0.j();
 76:    this.a = this.a | 16;
 78:    goto 0;
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
            p0.b(5, this.f);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.b);
        if (this.a & 2)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.c);
        if (this.a & 4)
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.d);
        if (this.a & 8)
            v0 = v0 + CodedOutputByteBufferNano.f(4, this.e);
        if (this.a & 16)
            v0 = v0 + CodedOutputByteBufferNano.f(5, this.f);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.gt))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.gt)p0;
                if ((this.a & 1) != (p0.a & 1))
                    v0 = 0;
                else if (!this.b.equals(p0.b))
                    v0 = 0;
                else if ((this.a & 2) != (p0.a & 2))
                    v0 = 0;
                else if (this.c != p0.c)
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
        return v0 + ((((((this.getClass().getName().hashCode() + 527) * 31 + this.b.hashCode()) * 31 + this.c) * 31 + this.d.hashCode()) * 31 + (int)(this.e ^ this.e >>> 32)) * 31 + (int)(this.f ^ this.f >>> 32)) * 31;
    }

}
