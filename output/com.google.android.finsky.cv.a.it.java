package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.it extends com.google.protobuf.nano.b
{

    public static volatile it[] b;
    public int a;
    public int c;
    public String d;
    public String e;
    public boolean f;
    public long g;
    public int h;

    it() {
        com.google.protobuf.nano.b();
        this.a = -1;
        this.c = 0;
        this.d = "";
        this.a = -1;
        this.e = "";
        this.a = -1;
        this.f = 0;
        this.a = -1;
        this.g = 0;
        this.a = -1;
        this.h = 0;
        this.aO = 0;
        this.aP = -1;
    }

    public static it[] bp_() {
        if (com.google.android.finsky.cv.a.it.b == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.android.finsky.cv.a.it.b == 0)
                    com.google.android.finsky.cv.a.it.b = new it[0];
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
        return com.google.android.finsky.cv.a.it.b;
    }

    public final com.google.android.finsky.cv.a.it a(int p0) {
        this.a = -1;
        this.a = 3;
        this.h = p0;
        return this;
    }

    public final com.google.android.finsky.cv.a.it a(String p0) {
        this.c = this.c | 1;
        this.d = p0;
        return this;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 10:
  4:            goto 14;
            case 18:
  4:            goto 27;
            case 24:
  4:            goto 37;
            case 32:
  4:            goto 47;
            case 40:
  4:            goto 57;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.d = p0.f();
 24:    this.c = this.c | 1;
 26:    goto 0;
 31:    this.e = p0.f();
 34:    this.a = 0;
 36:    goto 0;
 41:    this.f = p0.e();
 44:    this.a = 1;
 46:    goto 0;
 51:    this.g = p0.j();
 54:    this.a = 2;
 56:    goto 0;
 61:    this.h = p0.i();
 64:    this.a = 3;
 66:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.c & 1)
            p0.a(1, this.d);
        if (this.a == 0)
            p0.a(2, this.e);
        if (this.a == 1)
            p0.a(3, this.f);
        if (this.a == 2)
            p0.b(4, this.g);
        if (this.a == 3)
            p0.a(5, this.h);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.c & 1)
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.d);
        if (this.a == 0)
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.e);
        if (this.a == 1)
            v0 = v0 + CodedOutputByteBufferNano.d(3) + 1;
        if (this.a == 2)
            v0 = v0 + CodedOutputByteBufferNano.f(4, this.g);
        if (this.a == 3)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.h);
        return v0;
    }

    public final com.google.android.finsky.cv.a.it b(String p0) {
        if (p0 == 0)
            throw new NullPointerException();
        this.a = -1;
        this.a = 0;
        this.e = p0;
        return this;
    }

    public final String bq_() {
        if (this.a == 0)
            v0 = this.e;
        else
            v0 = "";
        return v0;
    }

    public final boolean d() {
        if (this.a == 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final boolean e() {
        if (this.a == 1)
            v0 = this.f;
        else
            v0 = 0;
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.it))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.it)p0;
                if ((this.c & 1) != (p0.c & 1))
                    v0 = 0;
                else if (!this.d.equals(p0.d))
                    v0 = 0;
                else if (this.a != p0.a)
                    v0 = 0;
                else if (this.a == 0 && !this.e.equals(p0.e))
                    v0 = 0;
                else if (this.a != p0.a)
                    v0 = 0;
                else if (this.a == 1 && this.f != p0.f)
                    v0 = 0;
                else if (this.a != p0.a)
                    v0 = 0;
                else if (this.a == 2 && this.g != p0.g)
                    v0 = 0;
                else if (this.a != p0.a)
                    v0 = 0;
                else if (this.a == 3 && this.h != p0.h)
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

    public final boolean f() {
        v0 = 1;
        if (this.a != 1)
            v0 = 0;
        return v0;
    }

    public final long g() {
        if (this.a == 2)
            v0 = this.g;
        else
            v0 = 0;
        return v0;
    }

    public final boolean h() {
        if (this.a == 2)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final int hashCode() {
        v2 = 0;
        v0 = this.e;
        if (this.a != 0)
            v0 = "";
        v1 = (this.d.hashCode() + (this.getClass().getName().hashCode() + 527) * 31) * 31 + v0.hashCode();
        v0 = this.f;
        if (this.a != 1)
            v0 = 0;
        if (v0 != 0)
            v0 = 1231;
        else
            v0 = 1237;
        v3 = v1 * 31 + v0;
        v0 = this.g;
        if (this.a != 2)
            v0 = 0;
        v1 = v3 * 31 + (int)(v0 ^ v0 >>> 32);
        v0 = this.h;
        if (this.a != 3)
            v0 = 0;
        if (this.aO != 0 && !this.aO.b())
            v2 = this.aO.hashCode();
        return (v0 + v1 * 31) * 31 + v2;
    }

}
