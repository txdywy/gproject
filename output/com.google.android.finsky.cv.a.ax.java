package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.ax extends com.google.protobuf.nano.b
{

    public static volatile ax[] a;
    public String b;
    public int c;
    public int d;

    ax() {
        com.google.protobuf.nano.b();
        this.b = "";
        this.c = 1;
        this.d = 0;
        this.aO = 0;
        this.aP = -1;
    }

    public static ax[] aG_() {
        if (com.google.android.finsky.cv.a.ax.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.android.finsky.cv.a.ax.a == 0)
                    com.google.android.finsky.cv.a.ax.a = new ax[0];
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
        return com.google.android.finsky.cv.a.ax.a;
    }

    private final com.google.android.finsky.cv.a.ax b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 10:
  4:            goto 14;
            case 16:
  4:            goto 21;
            case 24:
  4:            goto 44;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.b = p0.f();
 20:    goto 0;
 25:    try {
 33:        this.c = com.google.android.finsky.cv.a.ay.a(p0.i());
        }
        catch (IllegalArgumentException ex) {
 37:        p0.e(p0.o());
 40:        this.a(p0, v0);
        }
 35:    goto 0;
 48:    try {
 56:        this.d = com.google.android.finsky.cv.a.aw.a(p0.i());
        }
        catch (IllegalArgumentException ex) {
 60:        p0.e(p0.o());
 63:        this.a(p0, v0);
        }
 58:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        p0.a(1, this.b);
        p0.a(2, this.c);
        p0.a(3, this.d);
        super.a(p0);
    }

    protected final int b() {
        return super.b() + CodedOutputByteBufferNano.b(1, this.b) + CodedOutputByteBufferNano.d(2, this.c) + CodedOutputByteBufferNano.d(3, this.d);
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.ax))
                v0 = 0;
            else if (this.b == 0) {
                if (((com.google.android.finsky.cv.a.ax)p0).b != 0)
                    v0 = 0;
                else if (this.c != ((com.google.android.finsky.cv.a.ax)p0).c)
                    v0 = 0;
                else if (this.d != ((com.google.android.finsky.cv.a.ax)p0).d)
                    v0 = 0;
                else if (this.aO == 0 || this.aO.b()) {
                    if (((com.google.android.finsky.cv.a.ax)p0).aO != 0 && !((com.google.android.finsky.cv.a.ax)p0).aO.b())
                        v0 = 0;
                }
                else
                    v0 = this.aO.equals(((com.google.android.finsky.cv.a.ax)p0).aO);
            }
            else if (!this.b.equals(((com.google.android.finsky.cv.a.ax)p0).b))
                v0 = 0;
            else if (this.c != ((com.google.android.finsky.cv.a.ax)p0).c)
                v0 = 0;
            else if (this.d != ((com.google.android.finsky.cv.a.ax)p0).d)
                v0 = 0;
            else if (this.aO == 0 || this.aO.b()) {
                if (((com.google.android.finsky.cv.a.ax)p0).aO != 0 && !((com.google.android.finsky.cv.a.ax)p0).aO.b())
                    v0 = 0;
            }
            else
                v0 = this.aO.equals(((com.google.android.finsky.cv.a.ax)p0).aO);
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
        return (((v0 + (this.getClass().getName().hashCode() + 527) * 31) * 31 + this.c) * 31 + this.d) * 31 + v1;
    }

}
