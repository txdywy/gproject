package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.dy extends com.google.protobuf.nano.b
{

    public int a;
    public com.google.android.finsky.cv.a.w b;
    public String c;
    public com.google.android.finsky.cv.a.y d;
    public String e;
    public com.google.android.finsky.cv.a.x f;

    dy() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = "";
        this.d = 0;
        this.e = "";
        this.f = 0;
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
            case 34:
  4:            goto 61;
            case 42:
  4:            goto 74;
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
 46:    if (this.d == 0)
 53:        this.d = new com.google.android.finsky.cv.a.y();
 57:    p0.a(this.d);
 60:    goto 0;
 65:    this.e = p0.f();
 71:    this.a = this.a | 2;
 73:    goto 0;
 76:    if (this.f == 0)
 83:        this.f = new com.google.android.finsky.cv.a.x();
 87:    p0.a(this.f);
 90:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b != 0)
            p0.b(1, this.b);
        if (this.a & 1)
            p0.a(2, this.c);
        if (this.d != 0)
            p0.b(3, this.d);
        if (this.a & 2)
            p0.a(4, this.e);
        if (this.f != 0)
            p0.b(5, this.f);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.b);
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.c);
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.d);
        if (this.a & 2)
            v0 = v0 + CodedOutputByteBufferNano.b(4, this.e);
        if (this.f != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.f);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.dy))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.dy)p0;
                if (this.b == 0) {
                    if (p0.b != 0)
                        v0 = 0;
                    else if ((this.a & 1) != (p0.a & 1))
                        v0 = 0;
                    else if (!this.c.equals(p0.c))
                        v0 = 0;
                    else if (this.d == 0) {
                        if (p0.d != 0)
                            v0 = 0;
                        else if ((this.a & 2) != (p0.a & 2))
                            v0 = 0;
                        else if (!this.e.equals(p0.e))
                            v0 = 0;
                        else if (this.f == 0) {
                            if (p0.f != 0)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.f.equals(p0.f))
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
                    else if ((this.a & 2) != (p0.a & 2))
                        v0 = 0;
                    else if (!this.e.equals(p0.e))
                        v0 = 0;
                    else if (this.f == 0) {
                        if (p0.f != 0)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.f.equals(p0.f))
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
                else if (this.d == 0) {
                    if (p0.d != 0)
                        v0 = 0;
                    else if ((this.a & 2) != (p0.a & 2))
                        v0 = 0;
                    else if (!this.e.equals(p0.e))
                        v0 = 0;
                    else if (this.f == 0) {
                        if (p0.f != 0)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.f.equals(p0.f))
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
                else if ((this.a & 2) != (p0.a & 2))
                    v0 = 0;
                else if (!this.e.equals(p0.e))
                    v0 = 0;
                else if (this.f == 0) {
                    if (p0.f != 0)
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.f.equals(p0.f))
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
        v3 = ((v0 + (this.getClass().getName().hashCode() + 527) * 31) * 31 + this.c.hashCode()) * 31;
        if (this.d == 0)
            v0 = 0;
        else
            v0 = this.d.hashCode();
        v3 = ((v0 + v3) * 31 + this.e.hashCode()) * 31;
        if (this.f == 0)
            v0 = 0;
        else
            v0 = this.f.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return (v0 + v3) * 31 + v1;
    }

}
