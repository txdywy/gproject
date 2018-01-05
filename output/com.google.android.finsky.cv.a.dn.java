package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import g.a.a.a;

public final class com.google.android.finsky.cv.a.dn extends com.google.protobuf.nano.b
{

    public static volatile dn[] a;
    public int b;
    public long c;
    public int d;
    public boolean e;
    public com.google.android.finsky.cv.a.do f;
    public long g;
    public com.google.android.finsky.cv.a.dq h;
    public g.a.a.a i;

    dn() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = 0;
        this.d = 1;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.aO = 0;
        this.aP = -1;
    }

    public static dn[] aV_() {
        if (com.google.android.finsky.cv.a.dn.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.android.finsky.cv.a.dn.a == 0)
                    com.google.android.finsky.cv.a.dn.a = new dn[0];
                exit com.google.protobuf.nano.h.b;
            }
            catch (Throwable ex) {
                try {
                    exit com.google.protobuf.nano.h.b;
                }
                catch (Throwable ex) {
                    exit com.google.protobuf.nano.h.b;
                    throw ex;
                }
                throw ex;
            }
        }
        return com.google.android.finsky.cv.a.dn.a;
    }

    private final com.google.android.finsky.cv.a.dn b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 81:
  4:            goto 14;
            case 88:
  4:            goto 21;
            case 96:
  4:            goto 56;
            case 122:
  4:            goto 69;
            case 162:
  4:            goto 86;
            case 176:
  4:            goto 103;
            case 218:
  4:            goto 116;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.c = p0.l();
 20:    goto 0;
 25:    this.b = this.b | 1;
 31:    try {
 39:        this.d = com.google.android.finsky.cv.a.dm.a(p0.i());
 45:        this.b = this.b | 1;
        }
        catch (IllegalArgumentException ex) {
 49:        p0.e(p0.o());
 52:        this.a(p0, v0);
        }
 47:    goto 0;
 60:    this.g = p0.j();
 66:    this.b = this.b | 4;
 68:    goto 0;
 71:    if (this.h == 0)
 78:        this.h = new com.google.android.finsky.cv.a.dq();
 82:    p0.a(this.h);
 85:    goto 0;
 88:    if (this.i == 0)
 95:        this.i = new g.a.a.a();
 99:    p0.a(this.i);
102:    goto 0;
107:    this.e = p0.e();
113:    this.b = this.b | 2;
115:    goto 0;
118:    if (this.f == 0)
125:        this.f = new com.google.android.finsky.cv.a.do();
129:    p0.a(this.f);
132:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        p0.c(10, this.c);
        if (this.b & 1)
            p0.a(11, this.d);
        if (this.b & 4)
            p0.b(12, this.g);
        if (this.h != 0)
            p0.b(15, this.h);
        if (this.i != 0)
            p0.b(20, this.i);
        if (this.b & 2)
            p0.a(22, this.e);
        if (this.f != 0)
            p0.b(27, this.f);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b() + CodedOutputByteBufferNano.d(10) + 8;
        if (this.b & 1)
            v0 = v0 + CodedOutputByteBufferNano.d(11, this.d);
        if (this.b & 4)
            v0 = v0 + CodedOutputByteBufferNano.f(12, this.g);
        if (this.h != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(15, this.h);
        if (this.i != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(20, this.i);
        if (this.b & 2)
            v0 = v0 + CodedOutputByteBufferNano.d(22) + 1;
        if (this.f != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(27, this.f);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.dn))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.dn)p0;
                if (this.c != p0.c)
                    v0 = 0;
                else if ((this.b & 1) != (p0.b & 1))
                    v0 = 0;
                else if (this.d != p0.d)
                    v0 = 0;
                else if ((this.b & 2) != (p0.b & 2))
                    v0 = 0;
                else if (this.e != p0.e)
                    v0 = 0;
                else if (this.f == 0) {
                    if (p0.f != 0)
                        v0 = 0;
                    else if ((this.b & 4) != (p0.b & 4))
                        v0 = 0;
                    else if (this.g != p0.g)
                        v0 = 0;
                    else if (this.h == 0) {
                        if (p0.h != 0)
                            v0 = 0;
                        else if (this.i == 0) {
                            if (p0.i != 0)
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
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
                    else if (this.i == 0) {
                        if (p0.i != 0)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.i.equals(p0.i))
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
                else if ((this.b & 4) != (p0.b & 4))
                    v0 = 0;
                else if (this.g != p0.g)
                    v0 = 0;
                else if (this.h == 0) {
                    if (p0.h != 0)
                        v0 = 0;
                    else if (this.i == 0) {
                        if (p0.i != 0)
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
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
                else if (this.i == 0) {
                    if (p0.i != 0)
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
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
        if (this.e != 0)
            v0 = 1231;
        else
            v0 = 1237;
        v3 = (v0 + (((this.getClass().getName().hashCode() + 527) * 31 + (int)(this.c ^ this.c >>> 32)) * 31 + this.d) * 31) * 31;
        if (this.f == 0)
            v0 = 0;
        else
            v0 = this.f.hashCode();
        v3 = ((v0 + v3) * 31 + (int)(this.g ^ this.g >>> 32)) * 31;
        if (this.h == 0)
            v0 = 0;
        else
            v0 = this.h.hashCode();
        v3 = (v0 + v3) * 31;
        if (this.i == 0)
            v0 = 0;
        else
            v0 = this.i.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return (v0 + v3) * 31 + v1;
    }

}
