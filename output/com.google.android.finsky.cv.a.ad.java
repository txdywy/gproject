package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

public final class com.google.android.finsky.cv.a.ad extends com.google.protobuf.nano.b
{

    public static volatile ad[] a;
    public int b;
    public String c;
    public bd[] d;
    public ac[] e;

    ad() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = "";
        this.d = com.google.android.finsky.cv.a.bd.aH_();
        this.e = com.google.android.finsky.cv.a.ac.aA_();
        this.aO = 0;
        this.aP = -1;
    }

    public static ad[] aB_() {
        if (com.google.android.finsky.cv.a.ad.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.android.finsky.cv.a.ad.a == 0)
                    com.google.android.finsky.cv.a.ad.a = new ad[0];
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
        return com.google.android.finsky.cv.a.ad.a;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 10:
  5:            goto 15;
            case 18:
  5:            goto 28;
            case 26:
  5:            goto 91;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 19:    this.c = p0.f();
 25:    this.b = this.b | 1;
 27:    goto 1;
 36:    if (this.d == 0)
 38:        v0 = 0;
        else
 74:        v0 = this.d.length;
 40:    v2 = new bd[com.google.protobuf.nano.l.a(p0, 18) + v0];
 42:    if (v0 != 0)
 46:        System.arraycopy(this.d, 0, v2, 0, v0);
 49:    while (v0 < v2.length - 1) {
 59:        v2[v0] = new com.google.android.finsky.cv.a.bd();
 63:        p0.a(v2[v0]);
 66:        p0.a();
 69:        v0 = v0 + 1;
        }
 71:    goto 76;
 81:    v2[v0] = new com.google.android.finsky.cv.a.bd();
 85:    p0.a(v2[v0]);
 88:    this.d = v2;
 90:    goto 1;
 99:    if (this.e == 0)
101:        v0 = 0;
        else
137:        v0 = this.e.length;
103:    v2 = new ac[com.google.protobuf.nano.l.a(p0, 26) + v0];
105:    if (v0 != 0)
109:        System.arraycopy(this.e, 0, v2, 0, v0);
112:    while (v0 < v2.length - 1) {
122:        v2[v0] = new com.google.android.finsky.cv.a.ac();
126:        p0.a(v2[v0]);
129:        p0.a();
132:        v0 = v0 + 1;
        }
134:    goto 139;
144:    v2[v0] = new com.google.android.finsky.cv.a.ac();
148:    p0.a(v2[v0]);
151:    this.e = v2;
153:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        if (this.b & 1)
            p0.a(1, this.c);
        if (this.d != 0 && this.d.length > 0) {
            v0 = 0;
            while (v0 < this.d.length) {
                if (this.d[v0] != 0)
                    p0.b(2, this.d[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.e != 0 && this.e.length > 0)
            while (v1 < this.e.length) {
                if (this.e[v1] != 0)
                    p0.b(3, this.e[v1]);
                v1 = v1 + 1;
            }
        super.a(p0);
    }

    protected final int b() {
        v1 = 0;
        v0 = super.b();
        if (this.b & 1)
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.c);
        if (this.d != 0 && this.d.length > 0) {
            v2 = v0;
            v0 = 0;
            while (v0 < this.d.length) {
                if (this.d[v0] != 0)
                    v2 = v2 + CodedOutputByteBufferNano.d(2, this.d[v0]);
                v0 = v0 + 1;
            }
            v0 = v2;
        }
        if (this.e != 0 && this.e.length > 0)
            while (v1 < this.e.length) {
                if (this.e[v1] != 0)
                    v0 = v0 + CodedOutputByteBufferNano.d(3, this.e[v1]);
                v1 = v1 + 1;
            }
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.ad))
                v0 = 0;
            else if ((this.b & 1) != (((com.google.android.finsky.cv.a.ad)p0).b & 1))
                v0 = 0;
            else if (!this.c.equals(((com.google.android.finsky.cv.a.ad)p0).c))
                v0 = 0;
            else if (!com.google.protobuf.nano.h.a(this.d, ((com.google.android.finsky.cv.a.ad)p0).d))
                v0 = 0;
            else if (!com.google.protobuf.nano.h.a(this.e, ((com.google.android.finsky.cv.a.ad)p0).e))
                v0 = 0;
            else if (this.aO == 0 || this.aO.b()) {
                if (((com.google.android.finsky.cv.a.ad)p0).aO != 0 && !((com.google.android.finsky.cv.a.ad)p0).aO.b())
                    v0 = 0;
            }
            else
                v0 = this.aO.equals(((com.google.android.finsky.cv.a.ad)p0).aO);
        }
        return v0;
    }

    public final int hashCode() {
        if (this.aO == 0 || this.aO.b())
            v0 = 0;
        else
            v0 = this.aO.hashCode();
        return v0 + ((((this.getClass().getName().hashCode() + 527) * 31 + this.c.hashCode()) * 31 + com.google.protobuf.nano.h.a(this.d)) * 31 + com.google.protobuf.nano.h.a(this.e)) * 31;
    }

}
