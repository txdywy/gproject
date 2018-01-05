package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.gf extends com.google.protobuf.nano.b
{

    public static volatile gf[] a;
    public int b;
    public com.google.android.finsky.cv.a.gi c;
    public long d;
    public int e;

    gf() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.aO = 0;
        this.aP = -1;
    }

    private final com.google.android.finsky.cv.a.gf b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 10:
  4:            goto 14;
            case 16:
  4:            goto 31;
            case 24:
  4:            goto 44;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 16:    if (this.c == 0)
 23:        this.c = new com.google.android.finsky.cv.a.gi();
 27:    p0.a(this.c);
 30:    goto 0;
 35:    this.d = p0.j();
 41:    this.b = this.b | 1;
 43:    goto 0;
 48:    this.b = this.b | 2;
 54:    try {
 62:        this.e = com.google.android.finsky.cv.a.gj.a(p0.i());
 68:        this.b = this.b | 2;
        }
        catch (IllegalArgumentException ex) {
 72:        p0.e(p0.o());
 75:        this.a(p0, v0);
        }
 70:    goto 0;
    }

    public static gf[] bb_() {
        if (com.google.android.finsky.cv.a.gf.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.android.finsky.cv.a.gf.a == 0)
                    com.google.android.finsky.cv.a.gf.a = new gf[0];
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
        return com.google.android.finsky.cv.a.gf.a;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.c != 0)
            p0.b(1, this.c);
        if (this.b & 1)
            p0.b(2, this.d);
        if (this.b & 2)
            p0.a(3, this.e);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.c);
        if (this.b & 1)
            v0 = v0 + CodedOutputByteBufferNano.f(2, this.d);
        if (this.b & 2)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.e);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.gf))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.gf)p0;
                if (this.c == 0) {
                    if (p0.c != 0)
                        v0 = 0;
                    else if ((this.b & 1) != (p0.b & 1))
                        v0 = 0;
                    else if (this.d != p0.d)
                        v0 = 0;
                    else if ((this.b & 2) != (p0.b & 2))
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
                else if (!this.c.equals(p0.c))
                    v0 = 0;
                else if ((this.b & 1) != (p0.b & 1))
                    v0 = 0;
                else if (this.d != p0.d)
                    v0 = 0;
                else if ((this.b & 2) != (p0.b & 2))
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
        v1 = 0;
        if (this.c == 0)
            v0 = 0;
        else
            v0 = this.c.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return (((v0 + (this.getClass().getName().hashCode() + 527) * 31) * 31 + (int)(this.d ^ this.d >>> 32)) * 31 + this.e) * 31 + v1;
    }

}
