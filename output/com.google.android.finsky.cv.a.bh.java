package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.bh extends com.google.protobuf.nano.b
{

    public static volatile bh[] a;
    public int b;
    public long c;
    public int d;
    public boolean e;
    public boolean f;
    public long g;

    bh() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.aO = 0;
        this.aP = -1;
    }

    public static bh[] aJ_() {
        if (com.google.android.finsky.cv.a.bh.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.android.finsky.cv.a.bh.a == 0)
                    com.google.android.finsky.cv.a.bh.a = new bh[0];
                exit com.google.protobuf.nano.h.b;
            }
            catch (Throwable ex) {
                try {
                    exit com.google.protobuf.nano.h.b;
                }
                catch (Throwable ex) {
                    exit com.google.protobuf.nano.h.b;
                    throw ex;
                }
                throw ex;
            }
        }
        return com.google.android.finsky.cv.a.bh.a;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 9:
  4:            goto 14;
            case 16:
  4:            goto 27;
            case 24:
  4:            goto 40;
            case 32:
  4:            goto 53;
            case 40:
  4:            goto 66;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.c = p0.l();
 24:    this.b = this.b | 1;
 26:    goto 0;
 31:    this.d = p0.i();
 37:    this.b = this.b | 2;
 39:    goto 0;
 44:    this.e = p0.e();
 50:    this.b = this.b | 4;
 52:    goto 0;
 57:    this.f = p0.e();
 63:    this.b = this.b | 8;
 65:    goto 0;
 70:    this.g = p0.j();
 76:    this.b = this.b | 16;
 78:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b & 1)
            p0.c(1, this.c);
        if (this.b & 2)
            p0.a(2, this.d);
        if (this.b & 4)
            p0.a(3, this.e);
        if (this.b & 8)
            p0.a(4, this.f);
        if (this.b & 16)
            p0.b(5, this.g);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.b & 1)
            v0 = v0 + CodedOutputByteBufferNano.d(1) + 8;
        if (this.b & 2)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.d);
        if (this.b & 4)
            v0 = v0 + CodedOutputByteBufferNano.d(3) + 1;
        if (this.b & 8)
            v0 = v0 + CodedOutputByteBufferNano.d(4) + 1;
        if (this.b & 16)
            v0 = v0 + CodedOutputByteBufferNano.f(5, this.g);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.bh))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.bh)p0;
                if ((this.b & 1) != (p0.b & 1))
                    v0 = 0;
                else if (this.c != p0.c)
                    v0 = 0;
                else if ((this.b & 2) != (p0.b & 2))
                    v0 = 0;
                else if (this.d != p0.d)
                    v0 = 0;
                else if ((this.b & 4) != (p0.b & 4))
                    v0 = 0;
                else if (this.e != p0.e)
                    v0 = 0;
                else if ((this.b & 8) != (p0.b & 8))
                    v0 = 0;
                else if (this.f != p0.f)
                    v0 = 0;
                else if ((this.b & 16) != (p0.b & 16))
                    v0 = 0;
                else if (this.g != p0.g)
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
        v1 = 1231;
        if (this.e != 0)
            v0 = 1231;
        else
            v0 = 1237;
        if (this.f == 0)
            v1 = 1237;
        v1 = (((v0 + (((this.getClass().getName().hashCode() + 527) * 31 + (int)(this.c ^ this.c >>> 32)) * 31 + this.d) * 31) * 31 + v1) * 31 + (int)(this.g ^ this.g >>> 32)) * 31;
        if (this.aO == 0 || this.aO.b())
            v0 = 0;
        else
            v0 = this.aO.hashCode();
        return v0 + v1;
    }

}
