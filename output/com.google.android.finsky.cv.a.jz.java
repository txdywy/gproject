package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.jz extends com.google.protobuf.nano.b
{

    public static volatile jz[] a;
    public int b;
    public int c;
    public long d;
    public long e;

    jz() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.aO = 0;
        this.aP = -1;
    }

    private final com.google.android.finsky.cv.a.jz b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 8:
  4:            goto 14;
            case 16:
  4:            goto 49;
            case 24:
  4:            goto 62;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.b = this.b | 1;
 24:    try {
 32:        this.c = com.google.android.finsky.cv.a.kc.a(p0.i());
 38:        this.b = this.b | 1;
        }
        catch (IllegalArgumentException ex) {
 42:        p0.e(p0.o());
 45:        this.a(p0, v0);
        }
 40:    goto 0;
 53:    this.d = p0.j();
 59:    this.b = this.b | 2;
 61:    goto 0;
 66:    this.e = p0.j();
 72:    this.b = this.b | 4;
 74:    goto 0;
    }

    public static jz[] bE_() {
        if (com.google.android.finsky.cv.a.jz.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.android.finsky.cv.a.jz.a == 0)
                    com.google.android.finsky.cv.a.jz.a = new jz[0];
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
        return com.google.android.finsky.cv.a.jz.a;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b & 1)
            p0.a(1, this.c);
        if (this.b & 2)
            p0.b(2, this.d);
        if (this.b & 4)
            p0.b(3, this.e);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.b & 1)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.c);
        if (this.b & 2)
            v0 = v0 + CodedOutputByteBufferNano.f(2, this.d);
        if (this.b & 4)
            v0 = v0 + CodedOutputByteBufferNano.f(3, this.e);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.jz))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.jz)p0;
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
        return v0 + ((((this.getClass().getName().hashCode() + 527) * 31 + this.c) * 31 + (int)(this.d ^ this.d >>> 32)) * 31 + (int)(this.e ^ this.e >>> 32)) * 31;
    }

}
