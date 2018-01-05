package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.i extends com.google.protobuf.nano.b
{

    public static volatile i[] a;
    public int b;
    public long c;
    public String d;

    i() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = 0;
        this.d = "";
        this.aO = 0;
        this.aP = -1;
    }

    public static i[] av_() {
        if (com.google.android.finsky.cv.a.i.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.android.finsky.cv.a.i.a == 0)
                    com.google.android.finsky.cv.a.i.a = new i[0];
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
        return com.google.android.finsky.cv.a.i.a;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 8:
  4:            goto 14;
            case 18:
  4:            goto 27;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.c = p0.j();
 24:    this.b = this.b | 1;
 26:    goto 0;
 31:    this.d = p0.f();
 37:    this.b = this.b | 2;
 39:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b & 1)
            p0.b(1, this.c);
        if (this.b & 2)
            p0.a(2, this.d);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.b & 1)
            v0 = v0 + CodedOutputByteBufferNano.f(1, this.c);
        if (this.b & 2)
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.d);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.i))
                v0 = 0;
            else if ((this.b & 1) != (((com.google.android.finsky.cv.a.i)p0).b & 1))
                v0 = 0;
            else if (this.c != ((com.google.android.finsky.cv.a.i)p0).c)
                v0 = 0;
            else if ((this.b & 2) != (((com.google.android.finsky.cv.a.i)p0).b & 2))
                v0 = 0;
            else if (!this.d.equals(((com.google.android.finsky.cv.a.i)p0).d))
                v0 = 0;
            else if (this.aO == 0 || this.aO.b()) {
                if (((com.google.android.finsky.cv.a.i)p0).aO != 0 && !((com.google.android.finsky.cv.a.i)p0).aO.b())
                    v0 = 0;
            }
            else
                v0 = this.aO.equals(((com.google.android.finsky.cv.a.i)p0).aO);
        }
        return v0;
    }

    public final int hashCode() {
        if (this.aO == 0 || this.aO.b())
            v0 = 0;
        else
            v0 = this.aO.hashCode();
        return v0 + (((this.getClass().getName().hashCode() + 527) * 31 + (int)(this.c ^ this.c >>> 32)) * 31 + this.d.hashCode()) * 31;
    }

}
