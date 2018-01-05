package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

public final class com.google.android.finsky.cv.a.ib extends com.google.protobuf.nano.b
{

    public com.google.android.finsky.cv.a.cv a;
    public cv[] b;

    ib() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = com.google.android.finsky.cv.a.cv.aS_();
        this.aO = 0;
        this.aP = -1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 10:
  5:            goto 15;
            case 26:
  5:            goto 32;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 17:    if (this.a == 0)
 24:        this.a = new com.google.android.finsky.cv.a.cv();
 28:    p0.a(this.a);
 31:    goto 1;
 40:    if (this.b == 0)
 42:        v0 = 0;
        else
 78:        v0 = this.b.length;
 44:    v2 = new cv[com.google.protobuf.nano.l.a(p0, 26) + v0];
 46:    if (v0 != 0)
 50:        System.arraycopy(this.b, 0, v2, 0, v0);
 53:    while (v0 < v2.length - 1) {
 63:        v2[v0] = new com.google.android.finsky.cv.a.cv();
 67:        p0.a(v2[v0]);
 70:        p0.a();
 73:        v0 = v0 + 1;
        }
 75:    goto 80;
 85:    v2[v0] = new com.google.android.finsky.cv.a.cv();
 89:    p0.a(v2[v0]);
 92:    this.b = v2;
 94:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a != 0)
            p0.b(1, this.a);
        if (this.b != 0 && this.b.length > 0) {
            v0 = 0;
            while (v0 < this.b.length) {
                if (this.b[v0] != 0)
                    p0.b(3, this.b[v0]);
                v0 = v0 + 1;
            }
        }
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.a);
        if (this.b != 0 && this.b.length > 0) {
            v1 = v0;
            v0 = 0;
            while (v0 < this.b.length) {
                if (this.b[v0] != 0)
                    v1 = v1 + CodedOutputByteBufferNano.d(3, this.b[v0]);
                v0 = v0 + 1;
            }
            v0 = v1;
        }
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.ib))
                v0 = 0;
            else if (this.a == 0) {
                if (((com.google.android.finsky.cv.a.ib)p0).a != 0)
                    v0 = 0;
                else if (!com.google.protobuf.nano.h.a(this.b, ((com.google.android.finsky.cv.a.ib)p0).b))
                    v0 = 0;
                else if (this.aO == 0 || this.aO.b()) {
                    if (((com.google.android.finsky.cv.a.ib)p0).aO != 0 && !((com.google.android.finsky.cv.a.ib)p0).aO.b())
                        v0 = 0;
                }
                else
                    v0 = this.aO.equals(((com.google.android.finsky.cv.a.ib)p0).aO);
            }
            else if (!this.a.equals(((com.google.android.finsky.cv.a.ib)p0).a))
                v0 = 0;
            else if (!com.google.protobuf.nano.h.a(this.b, ((com.google.android.finsky.cv.a.ib)p0).b))
                v0 = 0;
            else if (this.aO == 0 || this.aO.b()) {
                if (((com.google.android.finsky.cv.a.ib)p0).aO != 0 && !((com.google.android.finsky.cv.a.ib)p0).aO.b())
                    v0 = 0;
            }
            else
                v0 = this.aO.equals(((com.google.android.finsky.cv.a.ib)p0).aO);
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
        return ((v0 + (this.getClass().getName().hashCode() + 527) * 31) * 31 + com.google.protobuf.nano.h.a(this.b)) * 31 + v1;
    }

}
