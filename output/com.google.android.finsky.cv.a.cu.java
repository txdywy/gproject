package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

public final class com.google.android.finsky.cv.a.cu extends com.google.protobuf.nano.b
{

    public eu[] a;
    public com.google.android.finsky.cv.a.eu b;
    public com.google.android.finsky.cv.a.eu c;

    cu() {
        com.google.protobuf.nano.b();
        this.a = com.google.android.finsky.cv.a.eu.aZ_();
        this.b = 0;
        this.c = 0;
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
            case 18:
  5:            goto 78;
            case 26:
  5:            goto 95;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 23:    if (this.a == 0)
 25:        v0 = 0;
        else
 61:        v0 = this.a.length;
 27:    v2 = new eu[com.google.protobuf.nano.l.a(p0, 10) + v0];
 29:    if (v0 != 0)
 33:        System.arraycopy(this.a, 0, v2, 0, v0);
 36:    while (v0 < v2.length - 1) {
 46:        v2[v0] = new com.google.android.finsky.cv.a.eu();
 50:        p0.a(v2[v0]);
 53:        p0.a();
 56:        v0 = v0 + 1;
        }
 58:    goto 63;
 68:    v2[v0] = new com.google.android.finsky.cv.a.eu();
 72:    p0.a(v2[v0]);
 75:    this.a = v2;
 77:    goto 1;
 80:    if (this.b == 0)
 87:        this.b = new com.google.android.finsky.cv.a.eu();
 91:    p0.a(this.b);
 94:    goto 1;
 97:    if (this.c == 0)
104:        this.c = new com.google.android.finsky.cv.a.eu();
108:    p0.a(this.c);
111:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a != 0 && this.a.length > 0) {
            v0 = 0;
            while (v0 < this.a.length) {
                if (this.a[v0] != 0)
                    p0.b(1, this.a[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.b != 0)
            p0.b(2, this.b);
        if (this.c != 0)
            p0.b(3, this.c);
        super.a(p0);
    }

    protected final int b() {
        v1 = super.b();
        if (this.a != 0 && this.a.length > 0) {
            v0 = 0;
            while (v0 < this.a.length) {
                if (this.a[v0] != 0)
                    v1 = v1 + CodedOutputByteBufferNano.d(1, this.a[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.b != 0)
            v1 = v1 + CodedOutputByteBufferNano.d(2, this.b);
        if (this.c != 0)
            v1 = v1 + CodedOutputByteBufferNano.d(3, this.c);
        return v1;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.cu))
                v0 = 0;
            else if (!com.google.protobuf.nano.h.a(this.a, ((com.google.android.finsky.cv.a.cu)p0).a))
                v0 = 0;
            else if (this.b == 0) {
                if (((com.google.android.finsky.cv.a.cu)p0).b != 0)
                    v0 = 0;
                else if (this.c == 0) {
                    if (((com.google.android.finsky.cv.a.cu)p0).c != 0)
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (((com.google.android.finsky.cv.a.cu)p0).aO != 0 && !((com.google.android.finsky.cv.a.cu)p0).aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(((com.google.android.finsky.cv.a.cu)p0).aO);
                }
                else if (!this.c.equals(((com.google.android.finsky.cv.a.cu)p0).c))
                    v0 = 0;
                else if (this.aO == 0 || this.aO.b()) {
                    if (((com.google.android.finsky.cv.a.cu)p0).aO != 0 && !((com.google.android.finsky.cv.a.cu)p0).aO.b())
                        v0 = 0;
                }
                else
                    v0 = this.aO.equals(((com.google.android.finsky.cv.a.cu)p0).aO);
            }
            else if (!this.b.equals(((com.google.android.finsky.cv.a.cu)p0).b))
                v0 = 0;
            else if (this.c == 0) {
                if (((com.google.android.finsky.cv.a.cu)p0).c != 0)
                    v0 = 0;
                else if (this.aO == 0 || this.aO.b()) {
                    if (((com.google.android.finsky.cv.a.cu)p0).aO != 0 && !((com.google.android.finsky.cv.a.cu)p0).aO.b())
                        v0 = 0;
                }
                else
                    v0 = this.aO.equals(((com.google.android.finsky.cv.a.cu)p0).aO);
            }
            else if (!this.c.equals(((com.google.android.finsky.cv.a.cu)p0).c))
                v0 = 0;
            else if (this.aO == 0 || this.aO.b()) {
                if (((com.google.android.finsky.cv.a.cu)p0).aO != 0 && !((com.google.android.finsky.cv.a.cu)p0).aO.b())
                    v0 = 0;
            }
            else
                v0 = this.aO.equals(((com.google.android.finsky.cv.a.cu)p0).aO);
        }
        return v0;
    }

    public final int hashCode() {
        v1 = 0;
        if (this.b == 0)
            v0 = 0;
        else
            v0 = this.b.hashCode();
        v3 = (v0 + ((this.getClass().getName().hashCode() + 527) * 31 + com.google.protobuf.nano.h.a(this.a)) * 31) * 31;
        if (this.c == 0)
            v0 = 0;
        else
            v0 = this.c.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return (v0 + v3) * 31 + v1;
    }

}
