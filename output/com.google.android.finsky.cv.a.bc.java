package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.bc extends com.google.protobuf.nano.b
{

    public int a;
    public long b;
    public com.google.android.finsky.cv.a.ax c;
    public int d;
    public int e;
    public int f;

    bc() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 1;
        this.e = 0;
        this.f = 0;
        this.aO = 0;
        this.aP = -1;
    }

    private final com.google.android.finsky.cv.a.bc b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 9:
  4:            goto 14;
            case 18:
  4:            goto 27;
            case 24:
  4:            goto 44;
            case 32:
  4:            goto 79;
            case 40:
  4:            goto 142;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.b = p0.l();
 24:    this.a = this.a | 1;
 26:    goto 0;
 29:    if (this.c == 0)
 36:        this.c = new com.google.android.finsky.cv.a.ax();
 40:    p0.a(this.c);
 43:    goto 0;
 48:    this.a = this.a | 2;
 54:    try {
 62:        this.d = com.google.android.finsky.cv.a.bp.a(p0.i());
 68:        this.a = this.a | 2;
        }
        catch (IllegalArgumentException ex) {
 72:        p0.e(p0.o());
 75:        this.a(p0, v0);
        }
 70:    goto 0;
 83:    this.a = this.a | 4;
 89:    try {
 89:        v2 = p0.i();
 93:        switch (v2) {
                case 0:
132:                try {
132:                    this.e = v2;
138:                    this.a = this.a | 4;
                    }
                    catch (IllegalArgumentException ex) {
124:                    p0.e(p0.o());
127:                    this.a(p0, v0);
                    }
158:                break;
                case 1:
132:                try {
132:                    this.e = v2;
138:                    this.a = this.a | 4;
                    }
                    catch (IllegalArgumentException ex) {
124:                    p0.e(p0.o());
127:                    this.a(p0, v0);
                    }
158:                break;
                case 2:
132:                try {
132:                    this.e = v2;
138:                    this.a = this.a | 4;
                    }
                    catch (IllegalArgumentException ex) {
124:                    p0.e(p0.o());
127:                    this.a(p0, v0);
                    }
158:                break;
                case 3:
132:                try {
132:                    this.e = v2;
138:                    this.a = this.a | 4;
                    }
                    catch (IllegalArgumentException ex) {
124:                    p0.e(p0.o());
127:                    this.a(p0, v0);
                    }
158:                break;
                default:
122:                throw new IllegalArgumentException(34 + v2 + " is not a valid enum Id");
            }
        }
        catch (IllegalArgumentException ex) {
        }
124:    p0.e(p0.o());
127:    this.a(p0, v0);
130:    goto 0;
146:    this.f = p0.i();
152:    this.a = this.a | 8;
154:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a & 1)
            p0.c(1, this.b);
        if (this.c != 0)
            p0.b(2, this.c);
        if (this.a & 2)
            p0.a(3, this.d);
        if (this.a & 4)
            p0.a(4, this.e);
        if (this.a & 8)
            p0.a(5, this.f);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.d(1) + 8;
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.c);
        if (this.a & 2)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.d);
        if (this.a & 4)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.e);
        if (this.a & 8)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.f);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.bc))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.bc)p0;
                if ((this.a & 1) != (p0.a & 1))
                    v0 = 0;
                else if (this.b != p0.b)
                    v0 = 0;
                else if (this.c == 0) {
                    if (p0.c != 0)
                        v0 = 0;
                    else if ((this.a & 2) != (p0.a & 2))
                        v0 = 0;
                    else if (this.d != p0.d)
                        v0 = 0;
                    else if ((this.a & 4) != (p0.a & 4))
                        v0 = 0;
                    else if (this.e != p0.e)
                        v0 = 0;
                    else if ((this.a & 8) != (p0.a & 8))
                        v0 = 0;
                    else if (this.f != p0.f)
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
                else if ((this.a & 4) != (p0.a & 4))
                    v0 = 0;
                else if (this.e != p0.e)
                    v0 = 0;
                else if ((this.a & 8) != (p0.a & 8))
                    v0 = 0;
                else if (this.f != p0.f)
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
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return ((((v0 + ((this.getClass().getName().hashCode() + 527) * 31 + (int)(this.b ^ this.b >>> 32)) * 31) * 31 + this.d) * 31 + this.e) * 31 + this.f) * 31 + v1;
    }

}
