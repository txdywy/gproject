package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.dt extends com.google.protobuf.nano.b
{

    public int a;
    public int b;
    public String c;
    public boolean d;

    dt() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = "";
        this.d = 0;
        this.aO = 0;
        this.aP = -1;
    }

    private final com.google.android.finsky.cv.a.dt b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 8:
  4:            goto 14;
            case 18:
  4:            goto 75;
            case 24:
  4:            goto 88;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.a = this.a | 1;
 24:    try {
 24:        v2 = p0.i();
 28:        switch (v2) {
                case 0:
 66:                try {
 66:                    this.b = v2;
 72:                    this.a = this.a | 1;
                    }
                    catch (IllegalArgumentException ex) {
 59:                    p0.e(p0.o());
 62:                    this.a(p0, v0);
                    }
103:                break;
                case 1:
 66:                try {
 66:                    this.b = v2;
 72:                    this.a = this.a | 1;
                    }
                    catch (IllegalArgumentException ex) {
 59:                    p0.e(p0.o());
 62:                    this.a(p0, v0);
                    }
103:                break;
                case 2:
 66:                try {
 66:                    this.b = v2;
 72:                    this.a = this.a | 1;
                    }
                    catch (IllegalArgumentException ex) {
 59:                    p0.e(p0.o());
 62:                    this.a(p0, v0);
                    }
103:                break;
                case 3:
 66:                try {
 66:                    this.b = v2;
 72:                    this.a = this.a | 1;
                    }
                    catch (IllegalArgumentException ex) {
 59:                    p0.e(p0.o());
 62:                    this.a(p0, v0);
                    }
103:                break;
                default:
 57:                throw new IllegalArgumentException(41 + v2 + " is not a valid enum Treatment");
            }
        }
        catch (IllegalArgumentException ex) {
        }
 59:    p0.e(p0.o());
 62:    this.a(p0, v0);
 65:    goto 0;
 79:    this.c = p0.f();
 85:    this.a = this.a | 2;
 87:    goto 0;
 92:    this.d = p0.e();
 98:    this.a = this.a | 4;
100:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a & 1)
            p0.a(1, this.b);
        if (this.a & 2)
            p0.a(2, this.c);
        if (this.a & 4)
            p0.a(3, this.d);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.b);
        if (this.a & 2)
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.c);
        if (this.a & 4)
            v0 = v0 + CodedOutputByteBufferNano.d(3) + 1;
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.dt))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.dt)p0;
                if ((this.a & 1) != (p0.a & 1))
                    v0 = 0;
                else if (this.b != p0.b)
                    v0 = 0;
                else if ((this.a & 2) != (p0.a & 2))
                    v0 = 0;
                else if (!this.c.equals(p0.c))
                    v0 = 0;
                else if ((this.a & 4) != (p0.a & 4))
                    v0 = 0;
                else if (this.d != p0.d)
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
        if (this.d != 0)
            v0 = 1231;
        else
            v0 = 1237;
        v1 = (v0 + (((this.getClass().getName().hashCode() + 527) * 31 + this.b) * 31 + this.c.hashCode()) * 31) * 31;
        if (this.aO == 0 || this.aO.b())
            v0 = 0;
        else
            v0 = this.aO.hashCode();
        return v0 + v1;
    }

}
