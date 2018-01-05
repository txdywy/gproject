package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.dv extends com.google.protobuf.nano.b
{

    public com.google.android.finsky.cv.a.iu a;

    dv() {
        com.google.protobuf.nano.b();
        this.a = 0;
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
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 16:    if (this.a == 0)
 23:        this.a = new com.google.android.finsky.cv.a.iu();
 27:    p0.a(this.a);
 30:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a != 0)
            p0.b(1, this.a);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.a);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.dv))
                v0 = 0;
            else if (this.a == 0) {
                if (((com.google.android.finsky.cv.a.dv)p0).a != 0)
                    v0 = 0;
                else if (this.aO == 0 || this.aO.b()) {
                    if (((com.google.android.finsky.cv.a.dv)p0).aO != 0 && !((com.google.android.finsky.cv.a.dv)p0).aO.b())
                        v0 = 0;
                }
                else
                    v0 = this.aO.equals(((com.google.android.finsky.cv.a.dv)p0).aO);
            }
            else if (!this.a.equals(((com.google.android.finsky.cv.a.dv)p0).a))
                v0 = 0;
            else if (this.aO == 0 || this.aO.b()) {
                if (((com.google.android.finsky.cv.a.dv)p0).aO != 0 && !((com.google.android.finsky.cv.a.dv)p0).aO.b())
                    v0 = 0;
            }
            else
                v0 = this.aO.equals(((com.google.android.finsky.cv.a.dv)p0).aO);
        }
        return v0;
    }

    public final int hashCode() {
        v1 = 0;
        if (this.a == 0)
            v0 = 0;
        else
            v0 = this.a.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return (v0 + (this.getClass().getName().hashCode() + 527) * 31) * 31 + v1;
    }

}
