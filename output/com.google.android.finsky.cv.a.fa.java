package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

public final class com.google.android.finsky.cv.a.fa extends com.google.protobuf.nano.b
{

    public int a;
    public String b;
    public String c;
    public String d;
    public ez[] e;

    fa() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = com.google.android.finsky.cv.a.ez.ba_();
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
  5:            goto 28;
            case 26:
  5:            goto 41;
            case 34:
  5:            goto 104;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 19:    this.b = p0.f();
 25:    this.a = this.a | 1;
 27:    goto 1;
 32:    this.c = p0.f();
 38:    this.a = this.a | 2;
 40:    goto 1;
 49:    if (this.e == 0)
 51:        v0 = 0;
        else
 87:        v0 = this.e.length;
 53:    v2 = new ez[com.google.protobuf.nano.l.a(p0, 26) + v0];
 55:    if (v0 != 0)
 59:        System.arraycopy(this.e, 0, v2, 0, v0);
 62:    while (v0 < v2.length - 1) {
 72:        v2[v0] = new com.google.android.finsky.cv.a.ez();
 76:        p0.a(v2[v0]);
 79:        p0.a();
 82:        v0 = v0 + 1;
        }
 84:    goto 89;
 94:    v2[v0] = new com.google.android.finsky.cv.a.ez();
 98:    p0.a(v2[v0]);
101:    this.e = v2;
103:    goto 1;
108:    this.d = p0.f();
114:    this.a = this.a | 4;
116:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a & 1)
            p0.a(1, this.b);
        if (this.a & 2)
            p0.a(2, this.c);
        if (this.e != 0 && this.e.length > 0) {
            v0 = 0;
            while (v0 < this.e.length) {
                if (this.e[v0] != 0)
                    p0.b(3, this.e[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.a & 4)
            p0.a(4, this.d);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.b);
        if (this.a & 2)
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.c);
        if (this.e != 0 && this.e.length > 0) {
            v1 = v0;
            v0 = 0;
            while (v0 < this.e.length) {
                if (this.e[v0] != 0)
                    v1 = v1 + CodedOutputByteBufferNano.d(3, this.e[v0]);
                v0 = v0 + 1;
            }
            v0 = v1;
        }
        if (this.a & 4)
            v0 = v0 + CodedOutputByteBufferNano.b(4, this.d);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.fa))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.fa)p0;
                if ((this.a & 1) != (p0.a & 1))
                    v0 = 0;
                else if (!this.b.equals(p0.b))
                    v0 = 0;
                else if ((this.a & 2) != (p0.a & 2))
                    v0 = 0;
                else if (!this.c.equals(p0.c))
                    v0 = 0;
                else if ((this.a & 4) != (p0.a & 4))
                    v0 = 0;
                else if (!this.d.equals(p0.d))
                    v0 = 0;
                else if (!com.google.protobuf.nano.h.a(this.e, p0.e))
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
        if (this.aO == 0 || this.aO.b())
            v0 = 0;
        else
            v0 = this.aO.hashCode();
        return v0 + (((((this.getClass().getName().hashCode() + 527) * 31 + this.b.hashCode()) * 31 + this.c.hashCode()) * 31 + this.d.hashCode()) * 31 + com.google.protobuf.nano.h.a(this.e)) * 31;
    }

}
