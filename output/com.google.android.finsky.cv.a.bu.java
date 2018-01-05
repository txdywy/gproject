package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.bu extends com.google.protobuf.nano.b
{

    public String a;
    public String b;

    bu() {
        com.google.protobuf.nano.b();
        this.a = "";
        this.b = "";
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
            case 18:
  4:            goto 21;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.a = p0.f();
 20:    goto 0;
 25:    this.b = p0.f();
 27:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        p0.a(1, this.a);
        p0.a(2, this.b);
        super.a(p0);
    }

    protected final int b() {
        return super.b() + CodedOutputByteBufferNano.b(1, this.a) + CodedOutputByteBufferNano.b(2, this.b);
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.bu))
                v0 = 0;
            else if (this.a == 0) {
                if (((com.google.android.finsky.cv.a.bu)p0).a != 0)
                    v0 = 0;
                else if (this.b == 0) {
                    if (((com.google.android.finsky.cv.a.bu)p0).b != 0)
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (((com.google.android.finsky.cv.a.bu)p0).aO != 0 && !((com.google.android.finsky.cv.a.bu)p0).aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(((com.google.android.finsky.cv.a.bu)p0).aO);
                }
                else if (!this.b.equals(((com.google.android.finsky.cv.a.bu)p0).b))
                    v0 = 0;
                else if (this.aO == 0 || this.aO.b()) {
                    if (((com.google.android.finsky.cv.a.bu)p0).aO != 0 && !((com.google.android.finsky.cv.a.bu)p0).aO.b())
                        v0 = 0;
                }
                else
                    v0 = this.aO.equals(((com.google.android.finsky.cv.a.bu)p0).aO);
            }
            else if (!this.a.equals(((com.google.android.finsky.cv.a.bu)p0).a))
                v0 = 0;
            else if (this.b == 0) {
                if (((com.google.android.finsky.cv.a.bu)p0).b != 0)
                    v0 = 0;
                else if (this.aO == 0 || this.aO.b()) {
                    if (((com.google.android.finsky.cv.a.bu)p0).aO != 0 && !((com.google.android.finsky.cv.a.bu)p0).aO.b())
                        v0 = 0;
                }
                else
                    v0 = this.aO.equals(((com.google.android.finsky.cv.a.bu)p0).aO);
            }
            else if (!this.b.equals(((com.google.android.finsky.cv.a.bu)p0).b))
                v0 = 0;
            else if (this.aO == 0 || this.aO.b()) {
                if (((com.google.android.finsky.cv.a.bu)p0).aO != 0 && !((com.google.android.finsky.cv.a.bu)p0).aO.b())
                    v0 = 0;
            }
            else
                v0 = this.aO.equals(((com.google.android.finsky.cv.a.bu)p0).aO);
        }
        return v0;
    }

    public final int hashCode() {
        v1 = 0;
        if (this.a == 0)
            v0 = 0;
        else
            v0 = this.a.hashCode();
        v2 = (v0 + (this.getClass().getName().hashCode() + 527) * 31) * 31;
        if (this.b == 0)
            v0 = 0;
        else
            v0 = this.b.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return (v0 + v2) * 31 + v1;
    }

}
