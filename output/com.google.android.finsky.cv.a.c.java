package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

public final class com.google.android.finsky.cv.a.c extends com.google.protobuf.nano.b
{

    public ah[] a;
    public com.google.android.finsky.cv.a.cv b;
    public cv[] c;

    c() {
        com.google.protobuf.nano.b();
        this.a = com.google.android.finsky.cv.a.ah.aC_();
        this.b = 0;
        this.c = com.google.android.finsky.cv.a.cv.aS_();
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
            case 34:
  5:            goto 95;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 23:    if (this.a == 0)
 25:        v0 = 0;
        else
 61:        v0 = this.a.length;
 27:    v2 = new ah[com.google.protobuf.nano.l.a(p0, 10) + v0];
 29:    if (v0 != 0)
 33:        System.arraycopy(this.a, 0, v2, 0, v0);
 36:    while (v0 < v2.length - 1) {
 46:        v2[v0] = new com.google.android.finsky.cv.a.ah();
 50:        p0.a(v2[v0]);
 53:        p0.a();
 56:        v0 = v0 + 1;
        }
 58:    goto 63;
 68:    v2[v0] = new com.google.android.finsky.cv.a.ah();
 72:    p0.a(v2[v0]);
 75:    this.a = v2;
 77:    goto 1;
 80:    if (this.b == 0)
 87:        this.b = new com.google.android.finsky.cv.a.cv();
 91:    p0.a(this.b);
 94:    goto 1;
103:    if (this.c == 0)
105:        v0 = 0;
        else
141:        v0 = this.c.length;
107:    v2 = new cv[com.google.protobuf.nano.l.a(p0, 34) + v0];
109:    if (v0 != 0)
113:        System.arraycopy(this.c, 0, v2, 0, v0);
116:    while (v0 < v2.length - 1) {
126:        v2[v0] = new com.google.android.finsky.cv.a.cv();
130:        p0.a(v2[v0]);
133:        p0.a();
136:        v0 = v0 + 1;
        }
138:    goto 143;
148:    v2[v0] = new com.google.android.finsky.cv.a.cv();
152:    p0.a(v2[v0]);
155:    this.c = v2;
157:    goto 1;
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
        if (this.b != 0)
            p0.b(2, this.b);
        if (this.c != 0 && this.c.length > 0)
            while (v1 < this.c.length) {
                if (this.c[v1] != 0)
                    p0.b(4, this.c[v1]);
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
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.b);
        if (this.c != 0 && this.c.length > 0)
            while (v1 < this.c.length) {
                if (this.c[v1] != 0)
                    v0 = v0 + CodedOutputByteBufferNano.d(4, this.c[v1]);
                v1 = v1 + 1;
            }
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.c))
                v0 = 0;
            else if (!com.google.protobuf.nano.h.a(this.a, ((com.google.android.finsky.cv.a.c)p0).a))
                v0 = 0;
            else if (this.b == 0) {
                if (((com.google.android.finsky.cv.a.c)p0).b != 0)
                    v0 = 0;
                else if (!com.google.protobuf.nano.h.a(this.c, ((com.google.android.finsky.cv.a.c)p0).c))
                    v0 = 0;
                else if (this.aO == 0 || this.aO.b()) {
                    if (((com.google.android.finsky.cv.a.c)p0).aO != 0 && !((com.google.android.finsky.cv.a.c)p0).aO.b())
                        v0 = 0;
                }
                else
                    v0 = this.aO.equals(((com.google.android.finsky.cv.a.c)p0).aO);
            }
            else if (!this.b.equals(((com.google.android.finsky.cv.a.c)p0).b))
                v0 = 0;
            else if (!com.google.protobuf.nano.h.a(this.c, ((com.google.android.finsky.cv.a.c)p0).c))
                v0 = 0;
            else if (this.aO == 0 || this.aO.b()) {
                if (((com.google.android.finsky.cv.a.c)p0).aO != 0 && !((com.google.android.finsky.cv.a.c)p0).aO.b())
                    v0 = 0;
            }
            else
                v0 = this.aO.equals(((com.google.android.finsky.cv.a.c)p0).aO);
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
        return ((v0 + ((this.getClass().getName().hashCode() + 527) * 31 + com.google.protobuf.nano.h.a(this.a)) * 31) * 31 + com.google.protobuf.nano.h.a(this.c)) * 31 + v1;
    }

}
