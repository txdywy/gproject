package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

public final class com.google.android.finsky.cv.a.hs extends com.google.protobuf.nano.b
{

    public jy[] a;
    public jy[] b;

    hs() {
        com.google.protobuf.nano.b();
        this.a = com.google.android.finsky.cv.a.jy.bD_();
        this.b = com.google.android.finsky.cv.a.jy.bD_();
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
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 23:    if (this.a == 0)
 25:        v0 = 0;
        else
 61:        v0 = this.a.length;
 27:    v2 = new jy[com.google.protobuf.nano.l.a(p0, 10) + v0];
 29:    if (v0 != 0)
 33:        System.arraycopy(this.a, 0, v2, 0, v0);
 36:    while (v0 < v2.length - 1) {
 46:        v2[v0] = new com.google.android.finsky.cv.a.jy();
 50:        p0.a(v2[v0]);
 53:        p0.a();
 56:        v0 = v0 + 1;
        }
 58:    goto 63;
 68:    v2[v0] = new com.google.android.finsky.cv.a.jy();
 72:    p0.a(v2[v0]);
 75:    this.a = v2;
 77:    goto 1;
 86:    if (this.b == 0)
 88:        v0 = 0;
        else
124:        v0 = this.b.length;
 90:    v2 = new jy[com.google.protobuf.nano.l.a(p0, 18) + v0];
 92:    if (v0 != 0)
 96:        System.arraycopy(this.b, 0, v2, 0, v0);
 99:    while (v0 < v2.length - 1) {
109:        v2[v0] = new com.google.android.finsky.cv.a.jy();
113:        p0.a(v2[v0]);
116:        p0.a();
119:        v0 = v0 + 1;
        }
121:    goto 126;
131:    v2[v0] = new com.google.android.finsky.cv.a.jy();
135:    p0.a(v2[v0]);
138:    this.b = v2;
140:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        if (this.a != 0 && this.a.length > 0) {
            v0 = 0;
            while (v0 < this.a.length) {
                if (this.a[v0] != 0)
                    p0.b(1, this.a[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.b != 0 && this.b.length > 0)
            while (v1 < this.b.length) {
                if (this.b[v1] != 0)
                    p0.b(2, this.b[v1]);
                v1 = v1 + 1;
            }
        super.a(p0);
    }

    protected final int b() {
        v1 = 0;
        v0 = super.b();
        if (this.a != 0 && this.a.length > 0) {
            v2 = v0;
            v0 = 0;
            while (v0 < this.a.length) {
                if (this.a[v0] != 0)
                    v2 = v2 + CodedOutputByteBufferNano.d(1, this.a[v0]);
                v0 = v0 + 1;
            }
            v0 = v2;
        }
        if (this.b != 0 && this.b.length > 0)
            while (v1 < this.b.length) {
                if (this.b[v1] != 0)
                    v0 = v0 + CodedOutputByteBufferNano.d(2, this.b[v1]);
                v1 = v1 + 1;
            }
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.hs))
                v0 = 0;
            else if (!com.google.protobuf.nano.h.a(this.a, ((com.google.android.finsky.cv.a.hs)p0).a))
                v0 = 0;
            else if (!com.google.protobuf.nano.h.a(this.b, ((com.google.android.finsky.cv.a.hs)p0).b))
                v0 = 0;
            else if (this.aO == 0 || this.aO.b()) {
                if (((com.google.android.finsky.cv.a.hs)p0).aO != 0 && !((com.google.android.finsky.cv.a.hs)p0).aO.b())
                    v0 = 0;
            }
            else
                v0 = this.aO.equals(((com.google.android.finsky.cv.a.hs)p0).aO);
        }
        return v0;
    }

    public final int hashCode() {
        if (this.aO == 0 || this.aO.b())
            v0 = 0;
        else
            v0 = this.aO.hashCode();
        return v0 + (((this.getClass().getName().hashCode() + 527) * 31 + com.google.protobuf.nano.h.a(this.a)) * 31 + com.google.protobuf.nano.h.a(this.b)) * 31;
    }

}
