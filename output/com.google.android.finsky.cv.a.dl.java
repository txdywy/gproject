package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.dl extends com.google.protobuf.nano.b
{

    public static volatile dl[] a;
    public int b;
    public int c;
    public int d;
    public long e;
    public long f;
    public com.google.android.finsky.cv.a.gs g;
    public String h;

    dl() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = "";
        this.aO = 0;
        this.aP = -1;
    }

    public static dl[] aU_() {
        if (com.google.android.finsky.cv.a.dl.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.android.finsky.cv.a.dl.a == 0)
                    com.google.android.finsky.cv.a.dl.a = new dl[0];
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
        return com.google.android.finsky.cv.a.dl.a;
    }

    private final com.google.android.finsky.cv.a.dl b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 8:
  4:            goto 14;
            case 16:
  4:            goto 75;
            case 24:
  4:            goto 88;
            case 34:
  4:            goto 101;
            case 40:
  4:            goto 114;
            case 50:
  4:            goto 127;
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
146:                break;
                case 1:
 66:                try {
 66:                    this.c = v2;
 72:                    this.b = this.b | 1;
                    }
                    catch (IllegalArgumentException ex) {
 59:                    p0.e(p0.o());
 62:                    this.a(p0, v0);
                    }
146:                break;
                case 2:
 66:                try {
 66:                    this.c = v2;
 72:                    this.b = this.b | 1;
                    }
                    catch (IllegalArgumentException ex) {
 59:                    p0.e(p0.o());
 62:                    this.a(p0, v0);
                    }
146:                break;
                default:
 57:                throw new IllegalArgumentException(40 + v2 + " is not a valid enum FileType");
            }
        }
        catch (IllegalArgumentException ex) {
        }
 59:    p0.e(p0.o());
 62:    this.a(p0, v0);
 65:    goto 0;
 79:    this.d = p0.i();
 85:    this.b = this.b | 2;
 87:    goto 0;
 92:    this.e = p0.j();
 98:    this.b = this.b | 4;
100:    goto 0;
105:    this.h = p0.f();
111:    this.b = this.b | 16;
113:    goto 0;
118:    this.f = p0.j();
124:    this.b = this.b | 8;
126:    goto 0;
129:    if (this.g == 0)
136:        this.g = new com.google.android.finsky.cv.a.gs();
140:    p0.a(this.g);
143:    goto 0;
    }

    public final com.google.android.finsky.cv.a.dl a(int p0) {
        this.c = p0;
        this.b = this.b | 1;
        return this;
    }

    public final com.google.android.finsky.cv.a.dl a(long p0) {
        this.b = this.b | 4;
        this.e = p0;
        return this;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b & 1)
            p0.a(1, this.c);
        if (this.b & 2)
            p0.a(2, this.d);
        if (this.b & 4)
            p0.b(3, this.e);
        if (this.b & 16)
            p0.a(4, this.h);
        if (this.b & 8)
            p0.b(5, this.f);
        if (this.g != 0)
            p0.b(6, this.g);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.b & 1)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.c);
        if (this.b & 2)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.d);
        if (this.b & 4)
            v0 = v0 + CodedOutputByteBufferNano.f(3, this.e);
        if (this.b & 16)
            v0 = v0 + CodedOutputByteBufferNano.b(4, this.h);
        if (this.b & 8)
            v0 = v0 + CodedOutputByteBufferNano.f(5, this.f);
        if (this.g != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(6, this.g);
        return v0;
    }

    public final com.google.android.finsky.cv.a.dl b(int p0) {
        this.b = this.b | 2;
        this.d = p0;
        return this;
    }

    public final com.google.android.finsky.cv.a.dl b(long p0) {
        this.b = this.b | 8;
        this.f = p0;
        return this;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.dl))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.dl)p0;
                if ((this.b & 1) != (p0.b & 1))
                    v0 = 0;
                else if (this.c != p0.c)
                    v0 = 0;
                else if ((this.b & 2) != (p0.b & 2))
                    v0 = 0;
                else if (this.d != p0.d)
                    v0 = 0;
                else if ((this.b & 4) != (p0.b & 4))
                    v0 = 0;
                else if (this.e != p0.e)
                    v0 = 0;
                else if ((this.b & 8) != (p0.b & 8))
                    v0 = 0;
                else if (this.f != p0.f)
                    v0 = 0;
                else if (this.g == 0) {
                    if (p0.g != 0)
                        v0 = 0;
                    else if ((this.b & 16) != (p0.b & 16))
                        v0 = 0;
                    else if (!this.h.equals(p0.h))
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
                else if ((this.b & 16) != (p0.b & 16))
                    v0 = 0;
                else if (!this.h.equals(p0.h))
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
        if (this.g == 0)
            v0 = 0;
        else
            v0 = this.g.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return ((v0 + (((((this.getClass().getName().hashCode() + 527) * 31 + this.c) * 31 + this.d) * 31 + (int)(this.e ^ this.e >>> 32)) * 31 + (int)(this.f ^ this.f >>> 32)) * 31) * 31 + this.h.hashCode()) * 31 + v1;
    }

}
