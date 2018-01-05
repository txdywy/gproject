package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

public final class com.google.android.finsky.cv.a.kg extends com.google.protobuf.nano.b
{

    public com.google.android.finsky.cv.a.ck a;
    public com.google.android.finsky.cv.a.ck b;
    public hw[] c;

    kg() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = com.google.android.finsky.cv.a.hw.bm_();
        this.aO = 0;
        this.aP = -1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 18:
  5:            goto 15;
            case 34:
  5:            goto 78;
            case 42:
  5:            goto 95;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 23:    if (this.c == 0)
 25:        v0 = 0;
        else
 61:        v0 = this.c.length;
 27:    v2 = new hw[com.google.protobuf.nano.l.a(p0, 18) + v0];
 29:    if (v0 != 0)
 33:        System.arraycopy(this.c, 0, v2, 0, v0);
 36:    while (v0 < v2.length - 1) {
 46:        v2[v0] = new com.google.android.finsky.cv.a.hw();
 50:        p0.a(v2[v0]);
 53:        p0.a();
 56:        v0 = v0 + 1;
        }
 58:    goto 63;
 68:    v2[v0] = new com.google.android.finsky.cv.a.hw();
 72:    p0.a(v2[v0]);
 75:    this.c = v2;
 77:    goto 1;
 80:    if (this.a == 0)
 87:        this.a = new com.google.android.finsky.cv.a.ck();
 91:    p0.a(this.a);
 94:    goto 1;
 97:    if (this.b == 0)
104:        this.b = new com.google.android.finsky.cv.a.ck();
108:    p0.a(this.b);
111:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.c != 0 && this.c.length > 0) {
            v0 = 0;
            while (v0 < this.c.length) {
                if (this.c[v0] != 0)
                    p0.b(2, this.c[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.a != 0)
            p0.b(4, this.a);
        if (this.b != 0)
            p0.b(5, this.b);
        super.a(p0);
    }

    protected final int b() {
        v1 = super.b();
        if (this.c != 0 && this.c.length > 0) {
            v0 = 0;
            while (v0 < this.c.length) {
                if (this.c[v0] != 0)
                    v1 = v1 + CodedOutputByteBufferNano.d(2, this.c[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.a != 0)
            v1 = v1 + CodedOutputByteBufferNano.d(4, this.a);
        if (this.b != 0)
            v1 = v1 + CodedOutputByteBufferNano.d(5, this.b);
        return v1;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.kg))
                v0 = 0;
            else if (this.a == 0) {
                if (((com.google.android.finsky.cv.a.kg)p0).a != 0)
                    v0 = 0;
                else if (this.b == 0) {
                    if (((com.google.android.finsky.cv.a.kg)p0).b != 0)
                        v0 = 0;
                    else if (!com.google.protobuf.nano.h.a(this.c, ((com.google.android.finsky.cv.a.kg)p0).c))
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (((com.google.android.finsky.cv.a.kg)p0).aO != 0 && !((com.google.android.finsky.cv.a.kg)p0).aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(((com.google.android.finsky.cv.a.kg)p0).aO);
                }
                else if (!this.b.equals(((com.google.android.finsky.cv.a.kg)p0).b))
                    v0 = 0;
                else if (!com.google.protobuf.nano.h.a(this.c, ((com.google.android.finsky.cv.a.kg)p0).c))
                    v0 = 0;
                else if (this.aO == 0 || this.aO.b()) {
                    if (((com.google.android.finsky.cv.a.kg)p0).aO != 0 && !((com.google.android.finsky.cv.a.kg)p0).aO.b())
                        v0 = 0;
                }
                else
                    v0 = this.aO.equals(((com.google.android.finsky.cv.a.kg)p0).aO);
            }
            else if (!this.a.equals(((com.google.android.finsky.cv.a.kg)p0).a))
                v0 = 0;
            else if (this.b == 0) {
                if (((com.google.android.finsky.cv.a.kg)p0).b != 0)
                    v0 = 0;
                else if (!com.google.protobuf.nano.h.a(this.c, ((com.google.android.finsky.cv.a.kg)p0).c))
                    v0 = 0;
                else if (this.aO == 0 || this.aO.b()) {
                    if (((com.google.android.finsky.cv.a.kg)p0).aO != 0 && !((com.google.android.finsky.cv.a.kg)p0).aO.b())
                        v0 = 0;
                }
                else
                    v0 = this.aO.equals(((com.google.android.finsky.cv.a.kg)p0).aO);
            }
            else if (!this.b.equals(((com.google.android.finsky.cv.a.kg)p0).b))
                v0 = 0;
            else if (!com.google.protobuf.nano.h.a(this.c, ((com.google.android.finsky.cv.a.kg)p0).c))
                v0 = 0;
            else if (this.aO == 0 || this.aO.b()) {
                if (((com.google.android.finsky.cv.a.kg)p0).aO != 0 && !((com.google.android.finsky.cv.a.kg)p0).aO.b())
                    v0 = 0;
            }
            else
                v0 = this.aO.equals(((com.google.android.finsky.cv.a.kg)p0).aO);
        }
        return v0;
    }

    public final int hashCode() {
        v1 = 0;
        if (this.a == 0)
            v0 = 0;
        else
            v0 = this.a.hashCode();
        v3 = (v0 + (this.getClass().getName().hashCode() + 527) * 31) * 31;
        if (this.b == 0)
            v0 = 0;
        else
            v0 = this.b.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return ((v0 + v3) * 31 + com.google.protobuf.nano.h.a(this.c)) * 31 + v1;
    }

}
