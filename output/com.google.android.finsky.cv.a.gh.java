package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.gh extends com.google.protobuf.nano.b
{

    public int a;
    public com.google.android.finsky.cv.a.eu b;
    public com.google.android.finsky.cv.a.js c;
    public com.google.android.finsky.cv.a.ev d;

    gh() {
        com.google.protobuf.nano.b();
        this.a = -1;
        this.a = -1;
        this.b = 0;
        this.a = -1;
        this.c = 0;
        this.a = -1;
        this.d = 0;
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
  4:            goto 34;
            case 26:
  4:            goto 54;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 16:    if (this.b == 0)
 23:        this.b = new com.google.android.finsky.cv.a.eu();
 27:    p0.a(this.b);
 31:    this.a = 0;
 33:    goto 0;
 36:    if (this.c == 0)
 43:        this.c = new com.google.android.finsky.cv.a.js();
 47:    p0.a(this.c);
 51:    this.a = 1;
 53:    goto 0;
 56:    if (this.d == 0)
 63:        this.d = new com.google.android.finsky.cv.a.ev();
 67:    p0.a(this.d);
 71:    this.a = 2;
 73:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a == 0)
            p0.b(1, this.b);
        if (this.a == 1)
            p0.b(2, this.c);
        if (this.a == 2)
            p0.b(3, this.d);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a == 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.b);
        if (this.a == 1)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.c);
        if (this.a == 2)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.d);
        return v0;
    }

    public final com.google.android.finsky.cv.a.eu bc_() {
        if (this.a == 0)
            v0 = this.b;
        else
            v0 = 0;
        return v0;
    }

    public final boolean bd_() {
        if (this.a == 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final com.google.android.finsky.cv.a.js d() {
        if (this.a == 1)
            v0 = this.c;
        else
            v0 = 0;
        return v0;
    }

    public final boolean e() {
        v0 = 1;
        if (this.a != 1)
            v0 = 0;
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.gh))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.gh)p0;
                if (this.b == 0) {
                    if (p0.b != 0)
                        v0 = 0;
                    else if (this.c == 0) {
                        if (p0.c != 0)
                            v0 = 0;
                        else if (this.d == 0) {
                            if (p0.d != 0)
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
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.c.equals(p0.c))
                        v0 = 0;
                    else if (this.d == 0) {
                        if (p0.d != 0)
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
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.b.equals(p0.b))
                    v0 = 0;
                else if (this.c == 0) {
                    if (p0.c != 0)
                        v0 = 0;
                    else if (this.d == 0) {
                        if (p0.d != 0)
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
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.c.equals(p0.c))
                    v0 = 0;
                else if (this.d == 0) {
                    if (p0.d != 0)
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

    public final com.google.android.finsky.cv.a.ev f() {
        if (this.a == 2)
            v0 = this.d;
        else
            v0 = 0;
        return v0;
    }

    public final boolean g() {
        if (this.a == 2)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final int hashCode() {
        v1 = 0;
        v0 = this.b;
        if (this.a != 0)
            v0 = 0;
        if (v0 == 0)
            v0 = 0;
        else
            v0 = v0.hashCode();
        v3 = (this.getClass().getName().hashCode() + 527) * 31 + v0;
        v0 = this.c;
        if (this.a != 1)
            v0 = 0;
        if (v0 == 0)
            v0 = 0;
        else
            v0 = v0.hashCode();
        v3 = v3 * 31 + v0;
        v0 = this.d;
        if (this.a != 2)
            v0 = 0;
        if (v0 == 0)
            v0 = 0;
        else
            v0 = v0.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return (v0 + v3 * 31) * 31 + v1;
    }

}
