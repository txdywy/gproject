package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

public final class com.google.android.finsky.cv.a.bm extends com.google.protobuf.nano.b
{

    public static volatile bm[] a;
    public int b;
    public long c;
    public String d;
    public com.google.android.finsky.cv.a.bo e;
    public bn[] f;

    bm() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = 0;
        this.d = "";
        this.e = 0;
        this.f = com.google.android.finsky.cv.a.bn.aN_();
        this.aO = 0;
        this.aP = -1;
    }

    public static bm[] aM_() {
        if (com.google.android.finsky.cv.a.bm.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.android.finsky.cv.a.bm.a == 0)
                    com.google.android.finsky.cv.a.bm.a = new bm[0];
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
        return com.google.android.finsky.cv.a.bm.a;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 8:
  5:            goto 15;
            case 18:
  5:            goto 28;
            case 26:
  5:            goto 41;
            case 34:
  5:            goto 58;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 19:    this.c = p0.j();
 25:    this.b = this.b | 1;
 27:    goto 1;
 32:    this.d = p0.f();
 38:    this.b = this.b | 2;
 40:    goto 1;
 43:    if (this.e == 0)
 50:        this.e = new com.google.android.finsky.cv.a.bo();
 54:    p0.a(this.e);
 57:    goto 1;
 66:    if (this.f == 0)
 68:        v0 = 0;
        else
104:        v0 = this.f.length;
 70:    v2 = new bn[com.google.protobuf.nano.l.a(p0, 34) + v0];
 72:    if (v0 != 0)
 76:        System.arraycopy(this.f, 0, v2, 0, v0);
 79:    while (v0 < v2.length - 1) {
 89:        v2[v0] = new com.google.android.finsky.cv.a.bn();
 93:        p0.a(v2[v0]);
 96:        p0.a();
 99:        v0 = v0 + 1;
        }
101:    goto 106;
111:    v2[v0] = new com.google.android.finsky.cv.a.bn();
115:    p0.a(v2[v0]);
118:    this.f = v2;
120:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b & 1)
            p0.b(1, this.c);
        if (this.b & 2)
            p0.a(2, this.d);
        if (this.e != 0)
            p0.b(3, this.e);
        if (this.f != 0 && this.f.length > 0) {
            v0 = 0;
            while (v0 < this.f.length) {
                if (this.f[v0] != 0)
                    p0.b(4, this.f[v0]);
                v0 = v0 + 1;
            }
        }
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.b & 1)
            v0 = v0 + CodedOutputByteBufferNano.f(1, this.c);
        if (this.b & 2)
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.d);
        if (this.e != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.e);
        if (this.f != 0 && this.f.length > 0) {
            v1 = v0;
            v0 = 0;
            while (v0 < this.f.length) {
                if (this.f[v0] != 0)
                    v1 = v1 + CodedOutputByteBufferNano.d(4, this.f[v0]);
                v0 = v0 + 1;
            }
            v0 = v1;
        }
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.bm))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.bm)p0;
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
                    else if (!com.google.protobuf.nano.h.a(this.f, p0.f))
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
                else if (!com.google.protobuf.nano.h.a(this.f, p0.f))
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
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return ((v0 + (((this.getClass().getName().hashCode() + 527) * 31 + (int)(this.c ^ this.c >>> 32)) * 31 + this.d.hashCode()) * 31) * 31 + com.google.protobuf.nano.h.a(this.f)) * 31 + v1;
    }

}
