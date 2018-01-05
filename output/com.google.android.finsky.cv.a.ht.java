package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

public final class com.google.android.finsky.cv.a.ht extends com.google.protobuf.nano.b
{

    public static volatile ht[] a;
    public int b;
    public String c;
    public String d;
    public int e;
    public long f;
    public String g;
    public String[] h;
    public String[] i;

    ht() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = "";
        this.d = "";
        this.e = 0;
        this.f = 0;
        this.g = "";
        this.h = com.google.protobuf.nano.l.j;
        this.i = com.google.protobuf.nano.l.j;
        this.aO = 0;
        this.aP = -1;
    }

    private final com.google.android.finsky.cv.a.ht b(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 10:
  5:            goto 15;
            case 18:
  5:            goto 28;
            case 24:
  5:            goto 41;
            case 32:
  5:            goto 76;
            case 42:
  5:            goto 89;
            case 50:
  5:            goto 102;
            case 58:
  5:            goto 154;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 19:    this.c = p0.f();
 25:    this.b = this.b | 1;
 27:    goto 1;
 32:    this.d = p0.f();
 38:    this.b = this.b | 2;
 40:    goto 1;
 45:    this.b = this.b | 4;
 51:    try {
 59:        this.e = com.google.android.finsky.cv.a.br.a(p0.i());
 65:        this.b = this.b | 4;
        }
        catch (IllegalArgumentException ex) {
 69:        p0.e(p0.o());
 72:        this.a(p0, v0);
        }
 67:    goto 1;
 80:    this.f = p0.j();
 86:    this.b = this.b | 8;
 88:    goto 1;
 93:    this.g = p0.f();
 99:    this.b = this.b | 16;
101:    goto 1;
110:    if (this.i == 0)
112:        v0 = 0;
        else
142:        v0 = this.i.length;
114:    v2 = new String[com.google.protobuf.nano.l.a(p0, 50) + v0];
116:    if (v0 != 0)
120:        System.arraycopy(this.i, 0, v2, 0, v0);
123:    while (v0 < v2.length - 1) {
132:        v2[v0] = p0.f();
134:        p0.a();
137:        v0 = v0 + 1;
        }
139:    goto 144;
148:    v2[v0] = p0.f();
150:    this.i = v2;
152:    goto 1;
162:    if (this.h == 0)
164:        v0 = 0;
        else
194:        v0 = this.h.length;
166:    v2 = new String[com.google.protobuf.nano.l.a(p0, 58) + v0];
168:    if (v0 != 0)
172:        System.arraycopy(this.h, 0, v2, 0, v0);
175:    while (v0 < v2.length - 1) {
184:        v2[v0] = p0.f();
186:        p0.a();
189:        v0 = v0 + 1;
        }
191:    goto 196;
200:    v2[v0] = p0.f();
202:    this.h = v2;
204:    goto 1;
    }

    public static ht[] bk_() {
        if (com.google.android.finsky.cv.a.ht.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.android.finsky.cv.a.ht.a == 0)
                    com.google.android.finsky.cv.a.ht.a = new ht[0];
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
        return com.google.android.finsky.cv.a.ht.a;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        if (this.b & 1)
            p0.a(1, this.c);
        if (this.b & 2)
            p0.a(2, this.d);
        if (this.b & 4)
            p0.a(3, this.e);
        if (this.b & 8)
            p0.b(4, this.f);
        if (this.b & 16)
            p0.a(5, this.g);
        if (this.i != 0 && this.i.length > 0) {
            v0 = 0;
            while (v0 < this.i.length) {
                if (this.i[v0] != 0)
                    p0.a(6, this.i[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.h != 0 && this.h.length > 0)
            while (v1 < this.h.length) {
                if (this.h[v1] != 0)
                    p0.a(7, this.h[v1]);
                v1 = v1 + 1;
            }
        super.a(p0);
    }

    protected final int b() {
        v2 = 0;
        v0 = super.b();
        if (this.b & 1)
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.c);
        if (this.b & 2)
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.d);
        if (this.b & 4)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.e);
        if (this.b & 8)
            v0 = v0 + CodedOutputByteBufferNano.f(4, this.f);
        if (this.b & 16)
            v0 = v0 + CodedOutputByteBufferNano.b(5, this.g);
        if (this.i != 0 && this.i.length > 0) {
            v1 = 0;
            v3 = 0;
            v4 = 0;
            while (v1 < this.i.length) {
                if (this.i[v1] != 0) {
                    v4 = v4 + 1;
                    v3 = v3 + CodedOutputByteBufferNano.b(this.i[v1]);
                }
                v1 = v1 + 1;
            }
            v0 = v0 + v3 + v4 * 1;
        }
        if (this.h != 0 && this.h.length > 0) {
            v1 = 0;
            v3 = 0;
            while (v2 < this.h.length) {
                if (this.h[v2] != 0) {
                    v3 = v3 + 1;
                    v1 = v1 + CodedOutputByteBufferNano.b(this.h[v2]);
                }
                v2 = v2 + 1;
            }
            v0 = v0 + v1 + v3 * 1;
        }
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.ht))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.ht)p0;
                if ((this.b & 1) != (p0.b & 1))
                    v0 = 0;
                else if (!this.c.equals(p0.c))
                    v0 = 0;
                else if ((this.b & 2) != (p0.b & 2))
                    v0 = 0;
                else if (!this.d.equals(p0.d))
                    v0 = 0;
                else if ((this.b & 4) != (p0.b & 4))
                    v0 = 0;
                else if (this.e != p0.e)
                    v0 = 0;
                else if ((this.b & 8) != (p0.b & 8))
                    v0 = 0;
                else if (this.f != p0.f)
                    v0 = 0;
                else if ((this.b & 16) != (p0.b & 16))
                    v0 = 0;
                else if (!this.g.equals(p0.g))
                    v0 = 0;
                else if (!com.google.protobuf.nano.h.a(this.h, p0.h))
                    v0 = 0;
                else if (!com.google.protobuf.nano.h.a(this.i, p0.i))
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
        if (this.aO == 0 || this.aO.b())
            v0 = 0;
        else
            v0 = this.aO.hashCode();
        return v0 + ((((((((this.getClass().getName().hashCode() + 527) * 31 + this.c.hashCode()) * 31 + this.d.hashCode()) * 31 + this.e) * 31 + (int)(this.f ^ this.f >>> 32)) * 31 + this.g.hashCode()) * 31 + com.google.protobuf.nano.h.a(this.h)) * 31 + com.google.protobuf.nano.h.a(this.i)) * 31;
    }

}
