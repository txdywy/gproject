package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.kh extends com.google.protobuf.nano.b
{

    public static volatile kh[] a;
    public int b;
    public long c;
    public com.google.android.finsky.cv.a.hn d;
    public com.google.android.finsky.cv.a.kj e;
    public int f;

    kh() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.aO = 0;
        this.aP = -1;
    }

    private final com.google.android.finsky.cv.a.kh b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 8:
  4:            goto 14;
            case 18:
  4:            goto 27;
            case 26:
  4:            goto 44;
            case 32:
  4:            goto 61;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.c = p0.j();
 24:    this.b = this.b | 1;
 26:    goto 0;
 29:    if (this.d == 0)
 36:        this.d = new com.google.android.finsky.cv.a.hn();
 40:    p0.a(this.d);
 43:    goto 0;
 46:    if (this.e == 0)
 53:        this.e = new com.google.android.finsky.cv.a.kj();
 57:    p0.a(this.e);
 60:    goto 0;
 65:    this.b = this.b | 2;
 71:    try {
 71:        v2 = p0.i();
 75:        switch (v2) {
                case 0:
113:                try {
113:                    this.f = v2;
119:                    this.b = this.b | 2;
                    }
                    catch (IllegalArgumentException ex) {
106:                    p0.e(p0.o());
109:                    this.a(p0, v0);
                    }
124:                break;
                case 1:
113:                try {
113:                    this.f = v2;
119:                    this.b = this.b | 2;
                    }
                    catch (IllegalArgumentException ex) {
106:                    p0.e(p0.o());
109:                    this.a(p0, v0);
                    }
124:                break;
                case 2:
113:                try {
113:                    this.f = v2;
119:                    this.b = this.b | 2;
                    }
                    catch (IllegalArgumentException ex) {
106:                    p0.e(p0.o());
109:                    this.a(p0, v0);
                    }
124:                break;
                case 3:
113:                try {
113:                    this.f = v2;
119:                    this.b = this.b | 2;
                    }
                    catch (IllegalArgumentException ex) {
106:                    p0.e(p0.o());
109:                    this.a(p0, v0);
                    }
124:                break;
                default:
104:                throw new IllegalArgumentException(34 + v2 + " is not a valid enum Id");
            }
        }
        catch (IllegalArgumentException ex) {
        }
106:    p0.e(p0.o());
109:    this.a(p0, v0);
112:    goto 0;
    }

    public static kh[] bH_() {
        if (com.google.android.finsky.cv.a.kh.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.android.finsky.cv.a.kh.a == 0)
                    com.google.android.finsky.cv.a.kh.a = new kh[0];
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
        return com.google.android.finsky.cv.a.kh.a;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b & 1)
            p0.b(1, this.c);
        if (this.d != 0)
            p0.b(2, this.d);
        if (this.e != 0)
            p0.b(3, this.e);
        if (this.b & 2)
            p0.a(4, this.f);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.b & 1)
            v0 = v0 + CodedOutputByteBufferNano.f(1, this.c);
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.d);
        if (this.e != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.e);
        if (this.b & 2)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.f);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.kh))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.kh)p0;
                if ((this.b & 1) != (p0.b & 1))
                    v0 = 0;
                else if (this.c != p0.c)
                    v0 = 0;
                else if (this.d == 0) {
                    if (p0.d != 0)
                        v0 = 0;
                    else if (this.e == 0) {
                        if (p0.e != 0)
                            v0 = 0;
                        else if ((this.b & 2) != (p0.b & 2))
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
                    else if (!this.e.equals(p0.e))
                        v0 = 0;
                    else if ((this.b & 2) != (p0.b & 2))
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
                else if (this.e == 0) {
                    if (p0.e != 0)
                        v0 = 0;
                    else if ((this.b & 2) != (p0.b & 2))
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
                else if (!this.e.equals(p0.e))
                    v0 = 0;
                else if ((this.b & 2) != (p0.b & 2))
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
        v3 = (v0 + ((this.getClass().getName().hashCode() + 527) * 31 + (int)(this.c ^ this.c >>> 32)) * 31) * 31;
        if (this.e == 0)
            v0 = 0;
        else
            v0 = this.e.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return ((v0 + v3) * 31 + this.f) * 31 + v1;
    }

}
