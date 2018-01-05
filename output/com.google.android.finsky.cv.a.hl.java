package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

public final class com.google.android.finsky.cv.a.hl extends com.google.protobuf.nano.b
{

    public int a;
    public hm[] b;
    public String c;
    public com.google.android.finsky.cv.a.hj d;
    public com.google.android.finsky.cv.a.hj e;
    public String f;
    public com.google.android.finsky.cv.a.eu g;
    public String h;

    hl() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = com.google.android.finsky.cv.a.hm.bj_();
        this.c = "";
        this.d = 0;
        this.e = 0;
        this.f = "";
        this.g = 0;
        this.h = "";
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
  5:            goto 45;
            case 34:
  5:            goto 58;
            case 42:
  5:            goto 121;
            case 50:
  5:            goto 135;
            case 58:
  5:            goto 153;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 19:    this.f = p0.f();
 25:    this.a = this.a | 2;
 27:    goto 1;
 30:    if (this.g == 0)
 37:        this.g = new com.google.android.finsky.cv.a.eu();
 41:    p0.a(this.g);
 44:    goto 1;
 49:    this.h = p0.f();
 55:    this.a = this.a | 4;
 57:    goto 1;
 66:    if (this.b == 0)
 68:        v0 = 0;
        else
104:        v0 = this.b.length;
 70:    v2 = new hm[com.google.protobuf.nano.l.a(p0, 34) + v0];
 72:    if (v0 != 0)
 76:        System.arraycopy(this.b, 0, v2, 0, v0);
 79:    while (v0 < v2.length - 1) {
 89:        v2[v0] = new com.google.android.finsky.cv.a.hm();
 93:        p0.a(v2[v0]);
 96:        p0.a();
 99:        v0 = v0 + 1;
        }
101:    goto 106;
111:    v2[v0] = new com.google.android.finsky.cv.a.hm();
115:    p0.a(v2[v0]);
118:    this.b = v2;
120:    goto 1;
125:    this.c = p0.f();
131:    this.a = this.a | 1;
133:    goto 1;
137:    if (this.d == 0)
144:        this.d = new com.google.android.finsky.cv.a.hj();
148:    p0.a(this.d);
151:    goto 1;
155:    if (this.e == 0)
162:        this.e = new com.google.android.finsky.cv.a.hj();
166:    p0.a(this.e);
169:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a & 2)
            p0.a(1, this.f);
        if (this.g != 0)
            p0.b(2, this.g);
        if (this.a & 4)
            p0.a(3, this.h);
        if (this.b != 0 && this.b.length > 0) {
            v0 = 0;
            while (v0 < this.b.length) {
                if (this.b[v0] != 0)
                    p0.b(4, this.b[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.a & 1)
            p0.a(5, this.c);
        if (this.d != 0)
            p0.b(6, this.d);
        if (this.e != 0)
            p0.b(7, this.e);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a & 2)
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.f);
        if (this.g != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.g);
        if (this.a & 4)
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.h);
        if (this.b != 0 && this.b.length > 0) {
            v1 = v0;
            v0 = 0;
            while (v0 < this.b.length) {
                if (this.b[v0] != 0)
                    v1 = v1 + CodedOutputByteBufferNano.d(4, this.b[v0]);
                v0 = v0 + 1;
            }
            v0 = v1;
        }
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.b(5, this.c);
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(6, this.d);
        if (this.e != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(7, this.e);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.hl))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.hl)p0;
                if (!com.google.protobuf.nano.h.a(this.b, p0.b))
                    v0 = 0;
                else if ((this.a & 1) != (p0.a & 1))
                    v0 = 0;
                else if (!this.c.equals(p0.c))
                    v0 = 0;
                else if (this.d == 0) {
                    if (p0.d != 0)
                        v0 = 0;
                    else if (this.e == 0) {
                        if (p0.e != 0)
                            v0 = 0;
                        else if ((this.a & 2) != (p0.a & 2))
                            v0 = 0;
                        else if (!this.f.equals(p0.f))
                            v0 = 0;
                        else if (this.g == 0) {
                            if (p0.g != 0)
                                v0 = 0;
                            else if ((this.a & 4) != (p0.a & 4))
                                v0 = 0;
                            else if (!this.h.equals(p0.h))
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.g.equals(p0.g))
                            v0 = 0;
                        else if ((this.a & 4) != (p0.a & 4))
                            v0 = 0;
                        else if (!this.h.equals(p0.h))
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.e.equals(p0.e))
                        v0 = 0;
                    else if ((this.a & 2) != (p0.a & 2))
                        v0 = 0;
                    else if (!this.f.equals(p0.f))
                        v0 = 0;
                    else if (this.g == 0) {
                        if (p0.g != 0)
                            v0 = 0;
                        else if ((this.a & 4) != (p0.a & 4))
                            v0 = 0;
                        else if (!this.h.equals(p0.h))
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.g.equals(p0.g))
                        v0 = 0;
                    else if ((this.a & 4) != (p0.a & 4))
                        v0 = 0;
                    else if (!this.h.equals(p0.h))
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
                else if (this.e == 0) {
                    if (p0.e != 0)
                        v0 = 0;
                    else if ((this.a & 2) != (p0.a & 2))
                        v0 = 0;
                    else if (!this.f.equals(p0.f))
                        v0 = 0;
                    else if (this.g == 0) {
                        if (p0.g != 0)
                            v0 = 0;
                        else if ((this.a & 4) != (p0.a & 4))
                            v0 = 0;
                        else if (!this.h.equals(p0.h))
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.g.equals(p0.g))
                        v0 = 0;
                    else if ((this.a & 4) != (p0.a & 4))
                        v0 = 0;
                    else if (!this.h.equals(p0.h))
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.e.equals(p0.e))
                    v0 = 0;
                else if ((this.a & 2) != (p0.a & 2))
                    v0 = 0;
                else if (!this.f.equals(p0.f))
                    v0 = 0;
                else if (this.g == 0) {
                    if (p0.g != 0)
                        v0 = 0;
                    else if ((this.a & 4) != (p0.a & 4))
                        v0 = 0;
                    else if (!this.h.equals(p0.h))
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.g.equals(p0.g))
                    v0 = 0;
                else if ((this.a & 4) != (p0.a & 4))
                    v0 = 0;
                else if (!this.h.equals(p0.h))
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
        v3 = (v0 + (((this.getClass().getName().hashCode() + 527) * 31 + com.google.protobuf.nano.h.a(this.b)) * 31 + this.c.hashCode()) * 31) * 31;
        if (this.e == 0)
            v0 = 0;
        else
            v0 = this.e.hashCode();
        v3 = ((v0 + v3) * 31 + this.f.hashCode()) * 31;
        if (this.g == 0)
            v0 = 0;
        else
            v0 = this.g.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return ((v0 + v3) * 31 + this.h.hashCode()) * 31 + v1;
    }

}
