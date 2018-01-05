package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.jw extends com.google.protobuf.nano.b
{

    public int a;
    public String b;
    public com.google.android.finsky.cv.a.fl c;
    public String d;
    public int e;
    public String f;
    public com.google.android.finsky.cv.a.u g;
    public com.google.android.finsky.cv.a.ac h;
    public boolean i;

    jw() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = "";
        this.c = 0;
        this.d = "";
        this.e = 0;
        this.f = "";
        this.g = 0;
        this.h = 0;
        this.i = 0;
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
  4:            goto 27;
            case 26:
  4:            goto 44;
            case 32:
  4:            goto 57;
            case 42:
  4:            goto 70;
            case 50:
  4:            goto 83;
            case 58:
  4:            goto 100;
            case 64:
  4:            goto 117;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.b = p0.f();
 24:    this.a = this.a | 1;
 26:    goto 0;
 29:    if (this.c == 0)
 36:        this.c = new com.google.android.finsky.cv.a.fl();
 40:    p0.a(this.c);
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
 85:    if (this.g == 0)
 92:        this.g = new com.google.android.finsky.cv.a.u();
 96:    p0.a(this.g);
 99:    goto 0;
102:    if (this.h == 0)
109:        this.h = new com.google.android.finsky.cv.a.ac();
113:    p0.a(this.h);
116:    goto 0;
121:    this.i = p0.e();
127:    this.a = this.a | 16;
129:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a & 1)
            p0.a(1, this.b);
        if (this.c != 0)
            p0.b(2, this.c);
        if (this.a & 2)
            p0.a(3, this.d);
        if (this.a & 4)
            p0.a(4, this.e);
        if (this.a & 8)
            p0.a(5, this.f);
        if (this.g != 0)
            p0.b(6, this.g);
        if (this.h != 0)
            p0.b(7, this.h);
        if (this.a & 16)
            p0.a(8, this.i);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.b);
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.c);
        if (this.a & 2)
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.d);
        if (this.a & 4)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.e);
        if (this.a & 8)
            v0 = v0 + CodedOutputByteBufferNano.b(5, this.f);
        if (this.g != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(6, this.g);
        if (this.h != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(7, this.h);
        if (this.a & 16)
            v0 = v0 + CodedOutputByteBufferNano.d(8) + 1;
        return v0;
    }

    public final boolean bB_() {
        if (this.a & 8)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.jw))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.jw)p0;
                if ((this.a & 1) != (p0.a & 1))
                    v0 = 0;
                else if (!this.b.equals(p0.b))
                    v0 = 0;
                else if (this.c == 0) {
                    if (p0.c != 0)
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
                    else if (this.g == 0) {
                        if (p0.g != 0)
                            v0 = 0;
                        else if (this.h == 0) {
                            if (p0.h != 0)
                                v0 = 0;
                            else if ((this.a & 16) != (p0.a & 16))
                                v0 = 0;
                            else if (this.i != p0.i)
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
                        else if ((this.a & 16) != (p0.a & 16))
                            v0 = 0;
                        else if (this.i != p0.i)
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
                    else if (this.h == 0) {
                        if (p0.h != 0)
                            v0 = 0;
                        else if ((this.a & 16) != (p0.a & 16))
                            v0 = 0;
                        else if (this.i != p0.i)
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
                    else if ((this.a & 16) != (p0.a & 16))
                        v0 = 0;
                    else if (this.i != p0.i)
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
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
                else if (this.g == 0) {
                    if (p0.g != 0)
                        v0 = 0;
                    else if (this.h == 0) {
                        if (p0.h != 0)
                            v0 = 0;
                        else if ((this.a & 16) != (p0.a & 16))
                            v0 = 0;
                        else if (this.i != p0.i)
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
                    else if ((this.a & 16) != (p0.a & 16))
                        v0 = 0;
                    else if (this.i != p0.i)
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
                else if (this.h == 0) {
                    if (p0.h != 0)
                        v0 = 0;
                    else if ((this.a & 16) != (p0.a & 16))
                        v0 = 0;
                    else if (this.i != p0.i)
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
                else if ((this.a & 16) != (p0.a & 16))
                    v0 = 0;
                else if (this.i != p0.i)
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
        if (this.c == 0)
            v0 = 0;
        else
            v0 = this.c.hashCode();
        v3 = ((((v0 + ((this.getClass().getName().hashCode() + 527) * 31 + this.b.hashCode()) * 31) * 31 + this.d.hashCode()) * 31 + this.e) * 31 + this.f.hashCode()) * 31;
        if (this.g == 0)
            v0 = 0;
        else
            v0 = this.g.hashCode();
        v3 = (v0 + v3) * 31;
        if (this.h == 0)
            v0 = 0;
        else
            v0 = this.h.hashCode();
        v3 = (v0 + v3) * 31;
        if (this.i != 0)
            v0 = 1231;
        else
            v0 = 1237;
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return (v0 + v3) * 31 + v1;
    }

}
