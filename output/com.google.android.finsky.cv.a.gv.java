package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

public final class com.google.android.finsky.cv.a.gv extends com.google.protobuf.nano.b
{

    public int a;
    public com.google.android.finsky.cv.a.ax b;
    public String c;
    public String d;
    public String e;
    public bd[] f;
    public String g;

    gv() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = com.google.android.finsky.cv.a.bd.aH_();
        this.g = "";
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
  5:            goto 32;
            case 26:
  5:            goto 45;
            case 34:
  5:            goto 58;
            case 42:
  5:            goto 71;
            case 50:
  5:            goto 135;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 17:    if (this.b == 0)
 24:        this.b = new com.google.android.finsky.cv.a.ax();
 28:    p0.a(this.b);
 31:    goto 1;
 36:    this.c = p0.f();
 42:    this.a = this.a | 1;
 44:    goto 1;
 49:    this.d = p0.f();
 55:    this.a = this.a | 2;
 57:    goto 1;
 62:    this.e = p0.f();
 68:    this.a = this.a | 4;
 70:    goto 1;
 79:    if (this.f == 0)
 81:        v0 = 0;
        else
117:        v0 = this.f.length;
 83:    v2 = new bd[com.google.protobuf.nano.l.a(p0, 42) + v0];
 85:    if (v0 != 0)
 89:        System.arraycopy(this.f, 0, v2, 0, v0);
 92:    while (v0 < v2.length - 1) {
102:        v2[v0] = new com.google.android.finsky.cv.a.bd();
106:        p0.a(v2[v0]);
109:        p0.a();
112:        v0 = v0 + 1;
        }
114:    goto 119;
124:    v2[v0] = new com.google.android.finsky.cv.a.bd();
128:    p0.a(v2[v0]);
131:    this.f = v2;
133:    goto 1;
139:    this.g = p0.f();
145:    this.a = this.a | 8;
147:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b != 0)
            p0.b(1, this.b);
        if (this.a & 1)
            p0.a(2, this.c);
        if (this.a & 2)
            p0.a(3, this.d);
        if (this.a & 4)
            p0.a(4, this.e);
        if (this.f != 0 && this.f.length > 0) {
            v0 = 0;
            while (v0 < this.f.length) {
                if (this.f[v0] != 0)
                    p0.b(5, this.f[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.a & 8)
            p0.a(6, this.g);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.b);
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.c);
        if (this.a & 2)
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.d);
        if (this.a & 4)
            v0 = v0 + CodedOutputByteBufferNano.b(4, this.e);
        if (this.f != 0 && this.f.length > 0) {
            v1 = v0;
            v0 = 0;
            while (v0 < this.f.length) {
                if (this.f[v0] != 0)
                    v1 = v1 + CodedOutputByteBufferNano.d(5, this.f[v0]);
                v0 = v0 + 1;
            }
            v0 = v1;
        }
        if (this.a & 8)
            v0 = v0 + CodedOutputByteBufferNano.b(6, this.g);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.gv))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.gv)p0;
                if (this.b == 0) {
                    if (p0.b != 0)
                        v0 = 0;
                    else if ((this.a & 1) != (p0.a & 1))
                        v0 = 0;
                    else if (!this.c.equals(p0.c))
                        v0 = 0;
                    else if ((this.a & 2) != (p0.a & 2))
                        v0 = 0;
                    else if (!this.d.equals(p0.d))
                        v0 = 0;
                    else if ((this.a & 4) != (p0.a & 4))
                        v0 = 0;
                    else if (!this.e.equals(p0.e))
                        v0 = 0;
                    else if (!com.google.protobuf.nano.h.a(this.f, p0.f))
                        v0 = 0;
                    else if ((this.a & 8) != (p0.a & 8))
                        v0 = 0;
                    else if (!this.g.equals(p0.g))
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.b.equals(p0.b))
                    v0 = 0;
                else if ((this.a & 1) != (p0.a & 1))
                    v0 = 0;
                else if (!this.c.equals(p0.c))
                    v0 = 0;
                else if ((this.a & 2) != (p0.a & 2))
                    v0 = 0;
                else if (!this.d.equals(p0.d))
                    v0 = 0;
                else if ((this.a & 4) != (p0.a & 4))
                    v0 = 0;
                else if (!this.e.equals(p0.e))
                    v0 = 0;
                else if (!com.google.protobuf.nano.h.a(this.f, p0.f))
                    v0 = 0;
                else if ((this.a & 8) != (p0.a & 8))
                    v0 = 0;
                else if (!this.g.equals(p0.g))
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
        if (this.b == 0)
            v0 = 0;
        else
            v0 = this.b.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return ((((((v0 + (this.getClass().getName().hashCode() + 527) * 31) * 31 + this.c.hashCode()) * 31 + this.d.hashCode()) * 31 + this.e.hashCode()) * 31 + com.google.protobuf.nano.h.a(this.f)) * 31 + this.g.hashCode()) * 31 + v1;
    }

}
