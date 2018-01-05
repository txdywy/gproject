package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.eu extends com.google.protobuf.nano.b
{

    public static volatile eu[] a;
    public int b;
    public String c;
    public com.google.android.finsky.cv.a.ip d;
    public int e;
    public int f;

    eu() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = "";
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.aO = 0;
        this.aP = -1;
    }

    public static eu[] aZ_() {
        if (com.google.android.finsky.cv.a.eu.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.android.finsky.cv.a.eu.a == 0)
                    com.google.android.finsky.cv.a.eu.a = new eu[0];
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
        return com.google.android.finsky.cv.a.eu.a;
    }

    private final com.google.android.finsky.cv.a.eu b(com.google.protobuf.nano.a p0) {
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
            case 32:
  4:            goto 79;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.c = p0.f();
 24:    this.b = this.b | 1;
 26:    goto 0;
 29:    if (this.d == 0)
 36:        this.d = new com.google.android.finsky.cv.a.ip();
 40:    p0.a(this.d);
 43:    goto 0;
 48:    this.b = this.b | 2;
 54:    try {
 62:        this.e = com.google.android.finsky.cv.a.aw.a(p0.i());
 68:        this.b = this.b | 2;
        }
        catch (IllegalArgumentException ex) {
 72:        p0.e(p0.o());
 75:        this.a(p0, v0);
        }
 70:    goto 0;
 83:    this.b = this.b | 4;
 89:    try {
 89:        v2 = p0.i();
 93:        switch (v2) {
                case 0:
132:                try {
132:                    this.f = v2;
138:                    this.b = this.b | 4;
                    }
                    catch (IllegalArgumentException ex) {
124:                    p0.e(p0.o());
127:                    this.a(p0, v0);
                    }
144:                break;
                case 1:
132:                try {
132:                    this.f = v2;
138:                    this.b = this.b | 4;
                    }
                    catch (IllegalArgumentException ex) {
124:                    p0.e(p0.o());
127:                    this.a(p0, v0);
                    }
144:                break;
                case 2:
132:                try {
132:                    this.f = v2;
138:                    this.b = this.b | 4;
                    }
                    catch (IllegalArgumentException ex) {
124:                    p0.e(p0.o());
127:                    this.a(p0, v0);
                    }
144:                break;
                case 3:
132:                try {
132:                    this.f = v2;
138:                    this.b = this.b | 4;
                    }
                    catch (IllegalArgumentException ex) {
124:                    p0.e(p0.o());
127:                    this.a(p0, v0);
                    }
144:                break;
                case 4:
132:                try {
132:                    this.f = v2;
138:                    this.b = this.b | 4;
                    }
                    catch (IllegalArgumentException ex) {
124:                    p0.e(p0.o());
127:                    this.a(p0, v0);
                    }
144:                break;
                case 5:
132:                try {
132:                    this.f = v2;
138:                    this.b = this.b | 4;
                    }
                    catch (IllegalArgumentException ex) {
124:                    p0.e(p0.o());
127:                    this.a(p0, v0);
                    }
144:                break;
                default:
122:                throw new IllegalArgumentException(34 + v2 + " is not a valid enum Id");
            }
        }
        catch (IllegalArgumentException ex) {
        }
124:    p0.e(p0.o());
127:    this.a(p0, v0);
130:    goto 0;
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
        if (this.b & 4)
            p0.a(4, this.f);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.b & 1)
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.c);
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.d);
        if (this.b & 2)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.e);
        if (this.b & 4)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.f);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.eu))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.eu)p0;
                if ((this.b & 1) != (p0.b & 1))
                    v0 = 0;
                else if (!this.c.equals(p0.c))
                    v0 = 0;
                else if (this.d == 0) {
                    if (p0.d != 0)
                        v0 = 0;
                    else if ((this.b & 2) != (p0.b & 2))
                        v0 = 0;
                    else if (this.e != p0.e)
                        v0 = 0;
                    else if ((this.b & 4) != (p0.b & 4))
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
                else if (!this.d.equals(p0.d))
                    v0 = 0;
                else if ((this.b & 2) != (p0.b & 2))
                    v0 = 0;
                else if (this.e != p0.e)
                    v0 = 0;
                else if ((this.b & 4) != (p0.b & 4))
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
        if (this.d == 0)
            v0 = 0;
        else
            v0 = this.d.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return (((v0 + ((this.getClass().getName().hashCode() + 527) * 31 + this.c.hashCode()) * 31) * 31 + this.e) * 31 + this.f) * 31 + v1;
    }

}
