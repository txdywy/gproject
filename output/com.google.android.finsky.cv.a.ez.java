package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.ez extends com.google.protobuf.nano.b
{

    public static volatile ez[] a;
    public int b;
    public int c;
    public com.google.android.finsky.cv.a.bd d;
    public String e;
    public com.google.android.finsky.cv.a.ai f;

    ez() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = "";
        this.f = 0;
        this.aO = 0;
        this.aP = -1;
    }

    private final com.google.android.finsky.cv.a.ez b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 8:
  4:            goto 14;
            case 18:
  4:            goto 75;
            case 26:
  4:            goto 92;
            case 34:
  4:            goto 105;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.b = this.b | 1;
 24:    try {
 24:        v2 = p0.i();
 28:        switch (v2) {
                case 0:
 66:                try {
 66:                    this.c = v2;
 72:                    this.b = this.b | 1;
                    }
                    catch (IllegalArgumentException ex) {
 59:                    p0.e(p0.o());
 62:                    this.a(p0, v0);
                    }
124:                break;
                case 1:
 66:                try {
 66:                    this.c = v2;
 72:                    this.b = this.b | 1;
                    }
                    catch (IllegalArgumentException ex) {
 59:                    p0.e(p0.o());
 62:                    this.a(p0, v0);
                    }
124:                break;
                case 2:
 66:                try {
 66:                    this.c = v2;
 72:                    this.b = this.b | 1;
                    }
                    catch (IllegalArgumentException ex) {
 59:                    p0.e(p0.o());
 62:                    this.a(p0, v0);
                    }
124:                break;
                case 3:
 66:                try {
 66:                    this.c = v2;
 72:                    this.b = this.b | 1;
                    }
                    catch (IllegalArgumentException ex) {
 59:                    p0.e(p0.o());
 62:                    this.a(p0, v0);
                    }
124:                break;
                default:
 57:                throw new IllegalArgumentException(36 + v2 + " is not a valid enum Type");
            }
        }
        catch (IllegalArgumentException ex) {
        }
 59:    p0.e(p0.o());
 62:    this.a(p0, v0);
 65:    goto 0;
 77:    if (this.d == 0)
 84:        this.d = new com.google.android.finsky.cv.a.bd();
 88:    p0.a(this.d);
 91:    goto 0;
 96:    this.e = p0.f();
102:    this.b = this.b | 2;
104:    goto 0;
107:    if (this.f == 0)
114:        this.f = new com.google.android.finsky.cv.a.ai();
118:    p0.a(this.f);
121:    goto 0;
    }

    public static ez[] ba_() {
        if (com.google.android.finsky.cv.a.ez.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.android.finsky.cv.a.ez.a == 0)
                    com.google.android.finsky.cv.a.ez.a = new ez[0];
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
        return com.google.android.finsky.cv.a.ez.a;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b & 1)
            p0.a(1, this.c);
        if (this.d != 0)
            p0.b(2, this.d);
        if (this.b & 2)
            p0.a(3, this.e);
        if (this.f != 0)
            p0.b(4, this.f);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.b & 1)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.c);
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.d);
        if (this.b & 2)
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.e);
        if (this.f != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.f);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.ez))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.ez)p0;
                if ((this.b & 1) != (p0.b & 1))
                    v0 = 0;
                else if (this.c != p0.c)
                    v0 = 0;
                else if (this.d == 0) {
                    if (p0.d != 0)
                        v0 = 0;
                    else if ((this.b & 2) != (p0.b & 2))
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
                else if ((this.b & 2) != (p0.b & 2))
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
        if (this.d == 0)
            v0 = 0;
        else
            v0 = this.d.hashCode();
        v3 = ((v0 + ((this.getClass().getName().hashCode() + 527) * 31 + this.c) * 31) * 31 + this.e.hashCode()) * 31;
        if (this.f == 0)
            v0 = 0;
        else
            v0 = this.f.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return (v0 + v3) * 31 + v1;
    }

}
