package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.ji extends com.google.protobuf.nano.b
{

    public static volatile ji[] b;
    public int a;
    public com.google.android.finsky.cv.a.jh c;
    public com.google.android.finsky.cv.a.jg d;

    ji() {
        com.google.protobuf.nano.b();
        this.a = -1;
        this.a = -1;
        this.c = 0;
        this.a = -1;
        this.d = 0;
        this.aO = 0;
        this.aP = -1;
    }

    public static ji[] bx_() {
        if (com.google.android.finsky.cv.a.ji.b == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.android.finsky.cv.a.ji.b == 0)
                    com.google.android.finsky.cv.a.ji.b = new ji[0];
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
        return com.google.android.finsky.cv.a.ji.b;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 10:
  4:            goto 14;
            case 18:
  4:            goto 34;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 16:    if (this.c == 0)
 23:        this.c = new com.google.android.finsky.cv.a.jh();
 27:    p0.a(this.c);
 31:    this.a = 0;
 33:    goto 0;
 36:    if (this.d == 0)
 43:        this.d = new com.google.android.finsky.cv.a.jg();
 47:    p0.a(this.d);
 51:    this.a = 1;
 53:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a == 0)
            p0.b(1, this.c);
        if (this.a == 1)
            p0.b(2, this.d);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a == 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.c);
        if (this.a == 1)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.d);
        return v0;
    }

    public final com.google.android.finsky.cv.a.jh by_() {
        if (this.a == 0)
            v0 = this.c;
        else
            v0 = 0;
        return v0;
    }

    public final boolean d() {
        if (this.a == 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.ji))
                v0 = 0;
            else if (this.c == 0) {
                if (((com.google.android.finsky.cv.a.ji)p0).c != 0)
                    v0 = 0;
                else if (this.d == 0) {
                    if (((com.google.android.finsky.cv.a.ji)p0).d != 0)
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (((com.google.android.finsky.cv.a.ji)p0).aO != 0 && !((com.google.android.finsky.cv.a.ji)p0).aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(((com.google.android.finsky.cv.a.ji)p0).aO);
                }
                else if (!this.d.equals(((com.google.android.finsky.cv.a.ji)p0).d))
                    v0 = 0;
                else if (this.aO == 0 || this.aO.b()) {
                    if (((com.google.android.finsky.cv.a.ji)p0).aO != 0 && !((com.google.android.finsky.cv.a.ji)p0).aO.b())
                        v0 = 0;
                }
                else
                    v0 = this.aO.equals(((com.google.android.finsky.cv.a.ji)p0).aO);
            }
            else if (!this.c.equals(((com.google.android.finsky.cv.a.ji)p0).c))
                v0 = 0;
            else if (this.d == 0) {
                if (((com.google.android.finsky.cv.a.ji)p0).d != 0)
                    v0 = 0;
                else if (this.aO == 0 || this.aO.b()) {
                    if (((com.google.android.finsky.cv.a.ji)p0).aO != 0 && !((com.google.android.finsky.cv.a.ji)p0).aO.b())
                        v0 = 0;
                }
                else
                    v0 = this.aO.equals(((com.google.android.finsky.cv.a.ji)p0).aO);
            }
            else if (!this.d.equals(((com.google.android.finsky.cv.a.ji)p0).d))
                v0 = 0;
            else if (this.aO == 0 || this.aO.b()) {
                if (((com.google.android.finsky.cv.a.ji)p0).aO != 0 && !((com.google.android.finsky.cv.a.ji)p0).aO.b())
                    v0 = 0;
            }
            else
                v0 = this.aO.equals(((com.google.android.finsky.cv.a.ji)p0).aO);
        }
        return v0;
    }

    public final int hashCode() {
        v1 = 0;
        v0 = this.c;
        if (this.a != 0)
            v0 = 0;
        if (v0 == 0)
            v0 = 0;
        else
            v0 = v0.hashCode();
        v3 = (this.getClass().getName().hashCode() + 527) * 31 + v0;
        v0 = this.d;
        if (this.a != 1)
            v0 = 0;
        if (v0 == 0)
            v0 = 0;
        else
            v0 = v0.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return (v0 + v3 * 31) * 31 + v1;
    }

}
