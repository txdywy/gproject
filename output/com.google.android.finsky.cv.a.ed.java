package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.ed extends com.google.protobuf.nano.b
{

    public int a;
    public com.google.android.finsky.cv.a.w b;
    public String c;
    public String d;
    public int e;
    public String f;
    public String g;
    public com.google.android.finsky.cv.a.x h;
    public String i;

    ed() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = "";
        this.d = "";
        this.e = 0;
        this.f = "";
        this.g = "";
        this.h = 0;
        this.i = "";
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
  4:            goto 31;
            case 26:
  4:            goto 44;
            case 32:
  4:            goto 57;
            case 42:
  4:            goto 70;
            case 50:
  4:            goto 83;
            case 58:
  4:            goto 96;
            case 66:
  4:            goto 113;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 16:    if (this.b == 0)
 23:        this.b = new com.google.android.finsky.cv.a.w();
 27:    p0.a(this.b);
 30:    goto 0;
 35:    this.c = p0.f();
 41:    this.a = this.a | 1;
 43:    goto 0;
 48:    this.d = p0.f();
 54:    this.a = this.a | 2;
 56:    goto 0;
 61:    this.e = p0.i();
 67:    this.a = this.a | 4;
 69:    goto 0;
 74:    this.f = p0.f();
 80:    this.a = this.a | 8;
 82:    goto 0;
 87:    this.g = p0.f();
 93:    this.a = this.a | 16;
 95:    goto 0;
 98:    if (this.h == 0)
105:        this.h = new com.google.android.finsky.cv.a.x();
109:    p0.a(this.h);
112:    goto 0;
117:    this.i = p0.f();
123:    this.a = this.a | 32;
125:    goto 0;
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
        if (this.a & 8)
            p0.a(5, this.f);
        if (this.a & 16)
            p0.a(6, this.g);
        if (this.h != 0)
            p0.b(7, this.h);
        if (this.a & 32)
            p0.a(8, this.i);
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
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.e);
        if (this.a & 8)
            v0 = v0 + CodedOutputByteBufferNano.b(5, this.f);
        if (this.a & 16)
            v0 = v0 + CodedOutputByteBufferNano.b(6, this.g);
        if (this.h != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(7, this.h);
        if (this.a & 32)
            v0 = v0 + CodedOutputByteBufferNano.b(8, this.i);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.ed))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.ed)p0;
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
                    else if (this.e != p0.e)
                        v0 = 0;
                    else if ((this.a & 8) != (p0.a & 8))
                        v0 = 0;
                    else if (!this.f.equals(p0.f))
                        v0 = 0;
                    else if ((this.a & 16) != (p0.a & 16))
                        v0 = 0;
                    else if (!this.g.equals(p0.g))
                        v0 = 0;
                    else if (this.h == 0) {
                        if (p0.h != 0)
                            v0 = 0;
                        else if ((this.a & 32) != (p0.a & 32))
                            v0 = 0;
                        else if (!this.i.equals(p0.i))
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.h.equals(p0.h))
                        v0 = 0;
                    else if ((this.a & 32) != (p0.a & 32))
                        v0 = 0;
                    else if (!this.i.equals(p0.i))
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
                else if (this.e != p0.e)
                    v0 = 0;
                else if ((this.a & 8) != (p0.a & 8))
                    v0 = 0;
                else if (!this.f.equals(p0.f))
                    v0 = 0;
                else if ((this.a & 16) != (p0.a & 16))
                    v0 = 0;
                else if (!this.g.equals(p0.g))
                    v0 = 0;
                else if (this.h == 0) {
                    if (p0.h != 0)
                        v0 = 0;
                    else if ((this.a & 32) != (p0.a & 32))
                        v0 = 0;
                    else if (!this.i.equals(p0.i))
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.h.equals(p0.h))
                    v0 = 0;
                else if ((this.a & 32) != (p0.a & 32))
                    v0 = 0;
                else if (!this.i.equals(p0.i))
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
        v3 = ((((((v0 + (this.getClass().getName().hashCode() + 527) * 31) * 31 + this.c.hashCode()) * 31 + this.d.hashCode()) * 31 + this.e) * 31 + this.f.hashCode()) * 31 + this.g.hashCode()) * 31;
        if (this.h == 0)
            v0 = 0;
        else
            v0 = this.h.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return ((v0 + v3) * 31 + this.i.hashCode()) * 31 + v1;
    }

}
