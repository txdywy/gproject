package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.c;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.eh extends com.google.protobuf.nano.b
{

    public int a;
    public int b;
    public long c;
    public com.google.android.finsky.cv.a.bc d;

    static {
        com.google.protobuf.nano.c.a(com.google.android.finsky.cv.a.eh, 1151047770);
    }

    eh() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 1;
        this.c = 0;
        this.d = 0;
        this.aO = 0;
        this.aP = -1;
    }

    private final com.google.android.finsky.cv.a.eh b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 8:
  4:            goto 14;
            case 17:
  4:            goto 49;
            case 26:
  4:            goto 62;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.a = this.a | 1;
 24:    try {
 32:        this.b = com.google.android.finsky.cv.a.bp.a(p0.i());
 38:        this.a = this.a | 1;
        }
        catch (IllegalArgumentException ex) {
 42:        p0.e(p0.o());
 45:        this.a(p0, v0);
        }
 40:    goto 0;
 53:    this.c = p0.l();
 59:    this.a = this.a | 2;
 61:    goto 0;
 64:    if (this.d == 0)
 71:        this.d = new com.google.android.finsky.cv.a.bc();
 75:    p0.a(this.d);
 78:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a & 1)
            p0.a(1, this.b);
        if (this.a & 2)
            p0.c(2, this.c);
        if (this.d != 0)
            p0.b(3, this.d);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.b);
        if (this.a & 2)
            v0 = v0 + CodedOutputByteBufferNano.d(2) + 8;
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.d);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.eh))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.eh)p0;
                if ((this.a & 1) != (p0.a & 1))
                    v0 = 0;
                else if (this.b != p0.b)
                    v0 = 0;
                else if ((this.a & 2) != (p0.a & 2))
                    v0 = 0;
                else if (this.c != p0.c)
                    v0 = 0;
                else if (this.d == 0) {
                    if (p0.d != 0)
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.d.equals(p0.d))
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
        if (this.d == 0)
            v0 = 0;
        else
            v0 = this.d.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return (v0 + (((this.getClass().getName().hashCode() + 527) * 31 + this.b) * 31 + (int)(this.c ^ this.c >>> 32)) * 31) * 31 + v1;
    }

}
