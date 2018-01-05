package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.dk extends com.google.protobuf.nano.b
{

    public static volatile dk[] a;
    public int b;
    public String c;

    dk() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = "";
        this.aO = 0;
        this.aP = -1;
    }

    public static dk[] aT_() {
        if (com.google.android.finsky.cv.a.dk.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.android.finsky.cv.a.dk.a == 0)
                    com.google.android.finsky.cv.a.dk.a = new dk[0];
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
        return com.google.android.finsky.cv.a.dk.a;
    }

    public final com.google.android.finsky.cv.a.dk a(String p0) {
        if (p0 == 0)
            throw new NullPointerException();
        this.b = this.b | 1;
        this.c = p0;
        return this;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 10:
  4:            goto 14;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.c = p0.f();
 24:    this.b = this.b | 1;
 26:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b & 1)
            p0.a(1, this.c);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.b & 1)
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.c);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.dk))
                v0 = 0;
            else if ((this.b & 1) != (((com.google.android.finsky.cv.a.dk)p0).b & 1))
                v0 = 0;
            else if (!this.c.equals(((com.google.android.finsky.cv.a.dk)p0).c))
                v0 = 0;
            else if (this.aO == 0 || this.aO.b()) {
                if (((com.google.android.finsky.cv.a.dk)p0).aO != 0 && !((com.google.android.finsky.cv.a.dk)p0).aO.b())
                    v0 = 0;
            }
            else
                v0 = this.aO.equals(((com.google.android.finsky.cv.a.dk)p0).aO);
        }
        return v0;
    }

    public final int hashCode() {
        if (this.aO == 0 || this.aO.b())
            v0 = 0;
        else
            v0 = this.aO.hashCode();
        return v0 + ((this.getClass().getName().hashCode() + 527) * 31 + this.c.hashCode()) * 31;
    }

}
