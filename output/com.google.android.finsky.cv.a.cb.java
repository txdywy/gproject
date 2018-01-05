package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class com.google.android.finsky.cv.a.cb extends com.google.protobuf.nano.b
{

    public int a;
    public String b;
    public String c;
    public String d;
    public dl[] e;
    public com.google.android.finsky.cv.a.eu f;
    public byte[] g;

    cb() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = com.google.android.finsky.cv.a.dl.aU_();
        this.f = 0;
        this.g = com.google.protobuf.nano.l.l;
        this.aO = 0;
        this.aP = -1;
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
  5:            goto 41;
            case 34:
  5:            goto 54;
            case 42:
  5:            goto 117;
            case 50:
  5:            goto 135;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 19:    this.b = p0.f();
 25:    this.a = this.a | 1;
 27:    goto 1;
 32:    this.c = p0.f();
 38:    this.a = this.a | 2;
 40:    goto 1;
 45:    this.d = p0.f();
 51:    this.a = this.a | 4;
 53:    goto 1;
 62:    if (this.e == 0)
 64:        v0 = 0;
        else
100:        v0 = this.e.length;
 66:    v2 = new dl[com.google.protobuf.nano.l.a(p0, 34) + v0];
 68:    if (v0 != 0)
 72:        System.arraycopy(this.e, 0, v2, 0, v0);
 75:    while (v0 < v2.length - 1) {
 85:        v2[v0] = new com.google.android.finsky.cv.a.dl();
 89:        p0.a(v2[v0]);
 92:        p0.a();
 95:        v0 = v0 + 1;
        }
 97:    goto 102;
107:    v2[v0] = new com.google.android.finsky.cv.a.dl();
111:    p0.a(v2[v0]);
114:    this.e = v2;
116:    goto 1;
119:    if (this.f == 0)
126:        this.f = new com.google.android.finsky.cv.a.eu();
130:    p0.a(this.f);
133:    goto 1;
139:    this.g = p0.g();
145:    this.a = this.a | 8;
147:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a & 1)
            p0.a(1, this.b);
        if (this.a & 2)
            p0.a(2, this.c);
        if (this.a & 4)
            p0.a(3, this.d);
        if (this.e != 0 && this.e.length > 0) {
            v0 = 0;
            while (v0 < this.e.length) {
                if (this.e[v0] != 0)
                    p0.b(4, this.e[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.f != 0)
            p0.b(5, this.f);
        if (this.a & 8)
            p0.a(6, this.g);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.b);
        if (this.a & 2)
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.c);
        if (this.a & 4)
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.d);
        if (this.e != 0 && this.e.length > 0) {
            v1 = v0;
            v0 = 0;
            while (v0 < this.e.length) {
                if (this.e[v0] != 0)
                    v1 = v1 + CodedOutputByteBufferNano.d(4, this.e[v0]);
                v0 = v0 + 1;
            }
            v0 = v1;
        }
        if (this.f != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.f);
        if (this.a & 8)
            v0 = v0 + CodedOutputByteBufferNano.b(6, this.g);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.cb))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.cb)p0;
                if ((this.a & 1) != (p0.a & 1))
                    v0 = 0;
                else if (!this.b.equals(p0.b))
                    v0 = 0;
                else if ((this.a & 2) != (p0.a & 2))
                    v0 = 0;
                else if (!this.c.equals(p0.c))
                    v0 = 0;
                else if ((this.a & 4) != (p0.a & 4))
                    v0 = 0;
                else if (!this.d.equals(p0.d))
                    v0 = 0;
                else if (!com.google.protobuf.nano.h.a(this.e, p0.e))
                    v0 = 0;
                else if (this.f == 0) {
                    if (p0.f != 0)
                        v0 = 0;
                    else if ((this.a & 8) != (p0.a & 8))
                        v0 = 0;
                    else if (!Arrays.equals(this.g, p0.g))
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
                else if ((this.a & 8) != (p0.a & 8))
                    v0 = 0;
                else if (!Arrays.equals(this.g, p0.g))
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
        if (this.f == 0)
            v0 = 0;
        else
            v0 = this.f.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return ((v0 + (((((this.getClass().getName().hashCode() + 527) * 31 + this.b.hashCode()) * 31 + this.c.hashCode()) * 31 + this.d.hashCode()) * 31 + com.google.protobuf.nano.h.a(this.e)) * 31) * 31 + Arrays.hashCode(this.g)) * 31 + v1;
    }

}
