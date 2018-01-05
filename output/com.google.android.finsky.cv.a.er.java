package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.er extends com.google.protobuf.nano.b
{

    public int a;
    public String b;
    public com.google.android.finsky.cv.a.jj c;
    public int d;
    public com.google.android.finsky.cv.a.jj e;

    er() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = "";
        this.c = 0;
        this.d = 1;
        this.e = 0;
        this.aO = 0;
        this.aP = -1;
    }

    private final com.google.android.finsky.cv.a.er b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 10:
  4:            goto 14;
            case 18:
  4:            goto 27;
            case 24:
  4:            goto 44;
            case 34:
  4:            goto 79;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.b = p0.f();
 24:    this.a = this.a | 1;
 26:    goto 0;
 29:    if (this.c == 0)
 36:        this.c = new com.google.android.finsky.cv.a.jj();
 40:    p0.a(this.c);
 43:    goto 0;
 48:    this.a = this.a | 2;
 54:    try {
 62:        this.d = com.google.android.finsky.cv.a.ap.a(p0.i());
 68:        this.a = this.a | 2;
        }
        catch (IllegalArgumentException ex) {
 72:        p0.e(p0.o());
 75:        this.a(p0, v0);
        }
 70:    goto 0;
 81:    if (this.e == 0)
 88:        this.e = new com.google.android.finsky.cv.a.jj();
 92:    p0.a(this.e);
 95:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a & 1)
            p0.a(1, this.b);
        if (this.c != 0)
            p0.b(2, this.c);
        if (this.a & 2)
            p0.a(3, this.d);
        if (this.e != 0)
            p0.b(4, this.e);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.b);
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.c);
        if (this.a & 2)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.d);
        if (this.e != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.e);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.er))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.er)p0;
                if ((this.a & 1) != (p0.a & 1))
                    v0 = 0;
                else if (!this.b.equals(p0.b))
                    v0 = 0;
                else if (this.c == 0) {
                    if (p0.c != 0)
                        v0 = 0;
                    else if ((this.a & 2) != (p0.a & 2))
                        v0 = 0;
                    else if (this.d != p0.d)
                        v0 = 0;
                    else if (this.e == 0) {
                        if (p0.e != 0)
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
                else if (this.d != p0.d)
                    v0 = 0;
                else if (this.e == 0) {
                    if (p0.e != 0)
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
        v3 = ((v0 + ((this.getClass().getName().hashCode() + 527) * 31 + this.b.hashCode()) * 31) * 31 + this.d) * 31;
        if (this.e == 0)
            v0 = 0;
        else
            v0 = this.e.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return (v0 + v3) * 31 + v1;
    }

}
