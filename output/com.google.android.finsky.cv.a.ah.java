package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.ah extends com.google.protobuf.nano.b
{

    public static volatile ah[] a;
    public int b;
    public int c;
    public String d;
    public com.google.android.finsky.cv.a.bd e;
    public String f;
    public com.google.android.finsky.cv.a.eu g;

    ah() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = 1;
        this.d = "";
        this.e = 0;
        this.f = "";
        this.g = 0;
        this.aO = 0;
        this.aP = -1;
    }

    public static ah[] aC_() {
        if (com.google.android.finsky.cv.a.ah.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.android.finsky.cv.a.ah.a == 0)
                    com.google.android.finsky.cv.a.ah.a = new ah[0];
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
        return com.google.android.finsky.cv.a.ah.a;
    }

    private final com.google.android.finsky.cv.a.ah b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 8:
  4:            goto 14;
            case 18:
  4:            goto 75;
            case 26:
  4:            goto 88;
            case 34:
  4:            goto 105;
            case 42:
  4:            goto 118;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.b = this.b | 1;
 24:    try {
 24:        v2 = p0.i();
 28:        switch (v2) {
                case 1:
 66:                try {
 66:                    this.c = v2;
 72:                    this.b = this.b | 1;
                    }
                    catch (IllegalArgumentException ex) {
 59:                    p0.e(p0.o());
 62:                    this.a(p0, v0);
                    }
137:                break;
                case 2:
 66:                try {
 66:                    this.c = v2;
 72:                    this.b = this.b | 1;
                    }
                    catch (IllegalArgumentException ex) {
 59:                    p0.e(p0.o());
 62:                    this.a(p0, v0);
                    }
137:                break;
                case 3:
 66:                try {
 66:                    this.c = v2;
 72:                    this.b = this.b | 1;
                    }
                    catch (IllegalArgumentException ex) {
 59:                    p0.e(p0.o());
 62:                    this.a(p0, v0);
                    }
137:                break;
                default:
 57:                throw new IllegalArgumentException(34 + v2 + " is not a valid enum Id");
            }
        }
        catch (IllegalArgumentException ex) {
        }
 59:    p0.e(p0.o());
 62:    this.a(p0, v0);
 65:    goto 0;
 79:    this.d = p0.f();
 85:    this.b = this.b | 2;
 87:    goto 0;
 90:    if (this.e == 0)
 97:        this.e = new com.google.android.finsky.cv.a.bd();
101:    p0.a(this.e);
104:    goto 0;
109:    this.f = p0.f();
115:    this.b = this.b | 4;
117:    goto 0;
120:    if (this.g == 0)
127:        this.g = new com.google.android.finsky.cv.a.eu();
131:    p0.a(this.g);
134:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b & 1)
            p0.a(1, this.c);
        if (this.b & 2)
            p0.a(2, this.d);
        if (this.e != 0)
            p0.b(3, this.e);
        if (this.b & 4)
            p0.a(4, this.f);
        if (this.g != 0)
            p0.b(5, this.g);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.b & 1)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.c);
        if (this.b & 2)
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.d);
        if (this.e != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.e);
        if (this.b & 4)
            v0 = v0 + CodedOutputByteBufferNano.b(4, this.f);
        if (this.g != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.g);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.ah))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.ah)p0;
                if ((this.b & 1) != (p0.b & 1))
                    v0 = 0;
                else if (this.c != p0.c)
                    v0 = 0;
                else if ((this.b & 2) != (p0.b & 2))
                    v0 = 0;
                else if (!this.d.equals(p0.d))
                    v0 = 0;
                else if (this.e == 0) {
                    if (p0.e != 0)
                        v0 = 0;
                    else if ((this.b & 4) != (p0.b & 4))
                        v0 = 0;
                    else if (!this.f.equals(p0.f))
                        v0 = 0;
                    else if (this.g == 0) {
                        if (p0.g != 0)
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
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.e.equals(p0.e))
                    v0 = 0;
                else if ((this.b & 4) != (p0.b & 4))
                    v0 = 0;
                else if (!this.f.equals(p0.f))
                    v0 = 0;
                else if (this.g == 0) {
                    if (p0.g != 0)
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
        if (this.e == 0)
            v0 = 0;
        else
            v0 = this.e.hashCode();
        v3 = ((v0 + (((this.getClass().getName().hashCode() + 527) * 31 + this.c) * 31 + this.d.hashCode()) * 31) * 31 + this.f.hashCode()) * 31;
        if (this.g == 0)
            v0 = 0;
        else
            v0 = this.g.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return (v0 + v3) * 31 + v1;
    }

}
