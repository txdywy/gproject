package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

public final class com.google.android.finsky.cv.a.by extends com.google.protobuf.nano.b
{

    public int a;
    public com.google.android.finsky.cv.a.ax b;
    public ax[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;

    by() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = com.google.android.finsky.cv.a.ax.aG_();
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.aO = 0;
        this.aP = -1;
    }

    private final com.google.android.finsky.cv.a.by b(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 10:
  5:            goto 15;
            case 18:
  5:            goto 32;
            case 24:
  5:            goto 95;
            case 32:
  5:            goto 108;
            case 40:
  5:            goto 121;
            case 48:
  5:            goto 135;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 17:    if (this.b == 0)
 24:        this.b = new com.google.android.finsky.cv.a.ax();
 28:    p0.a(this.b);
 31:    goto 1;
 40:    if (this.c == 0)
 42:        v0 = 0;
        else
 78:        v0 = this.c.length;
 44:    v2 = new ax[com.google.protobuf.nano.l.a(p0, 18) + v0];
 46:    if (v0 != 0)
 50:        System.arraycopy(this.c, 0, v2, 0, v0);
 53:    while (v0 < v2.length - 1) {
 63:        v2[v0] = new com.google.android.finsky.cv.a.ax();
 67:        p0.a(v2[v0]);
 70:        p0.a();
 73:        v0 = v0 + 1;
        }
 75:    goto 80;
 85:    v2[v0] = new com.google.android.finsky.cv.a.ax();
 89:    p0.a(v2[v0]);
 92:    this.c = v2;
 94:    goto 1;
 99:    this.d = p0.e();
105:    this.a = this.a | 1;
107:    goto 1;
112:    this.e = p0.e();
118:    this.a = this.a | 2;
120:    goto 1;
125:    this.f = p0.e();
131:    this.a = this.a | 4;
133:    goto 1;
139:    this.a = this.a | 8;
145:    try {
145:        v3 = p0.i();
149:        switch (v3) {
                case 0:
188:                try {
188:                    this.g = v3;
194:                    this.a = this.a | 8;
                    }
                    catch (IllegalArgumentException ex) {
180:                    p0.e(p0.o());
183:                    this.a(p0, v0);
                    }
199:                break;
                case 1:
188:                try {
188:                    this.g = v3;
194:                    this.a = this.a | 8;
                    }
                    catch (IllegalArgumentException ex) {
180:                    p0.e(p0.o());
183:                    this.a(p0, v0);
                    }
199:                break;
                case 2:
188:                try {
188:                    this.g = v3;
194:                    this.a = this.a | 8;
                    }
                    catch (IllegalArgumentException ex) {
180:                    p0.e(p0.o());
183:                    this.a(p0, v0);
                    }
199:                break;
                case 3:
188:                try {
188:                    this.g = v3;
194:                    this.a = this.a | 8;
                    }
                    catch (IllegalArgumentException ex) {
180:                    p0.e(p0.o());
183:                    this.a(p0, v0);
                    }
199:                break;
                case 4:
188:                try {
188:                    this.g = v3;
194:                    this.a = this.a | 8;
                    }
                    catch (IllegalArgumentException ex) {
180:                    p0.e(p0.o());
183:                    this.a(p0, v0);
                    }
199:                break;
                default:
178:                throw new IllegalArgumentException(36 + v3 + " is not a valid enum Mode");
            }
        }
        catch (IllegalArgumentException ex) {
        }
180:    p0.e(p0.o());
183:    this.a(p0, v0);
186:    goto 1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b != 0)
            p0.b(1, this.b);
        if (this.c != 0 && this.c.length > 0) {
            v0 = 0;
            while (v0 < this.c.length) {
                if (this.c[v0] != 0)
                    p0.b(2, this.c[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.a & 1)
            p0.a(3, this.d);
        if (this.a & 2)
            p0.a(4, this.e);
        if (this.a & 4)
            p0.a(5, this.f);
        if (this.a & 8)
            p0.a(6, this.g);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.b);
        if (this.c != 0 && this.c.length > 0) {
            v1 = v0;
            v0 = 0;
            while (v0 < this.c.length) {
                if (this.c[v0] != 0)
                    v1 = v1 + CodedOutputByteBufferNano.d(2, this.c[v0]);
                v0 = v0 + 1;
            }
            v0 = v1;
        }
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.d(3) + 1;
        if (this.a & 2)
            v0 = v0 + CodedOutputByteBufferNano.d(4) + 1;
        if (this.a & 4)
            v0 = v0 + CodedOutputByteBufferNano.d(5) + 1;
        if (this.a & 8)
            v0 = v0 + CodedOutputByteBufferNano.d(6, this.g);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.by))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.by)p0;
                if (this.b == 0) {
                    if (p0.b != 0)
                        v0 = 0;
                    else if (!com.google.protobuf.nano.h.a(this.c, p0.c))
                        v0 = 0;
                    else if ((this.a & 1) != (p0.a & 1))
                        v0 = 0;
                    else if (this.d != p0.d)
                        v0 = 0;
                    else if ((this.a & 2) != (p0.a & 2))
                        v0 = 0;
                    else if (this.e != p0.e)
                        v0 = 0;
                    else if ((this.a & 4) != (p0.a & 4))
                        v0 = 0;
                    else if (this.f != p0.f)
                        v0 = 0;
                    else if ((this.a & 8) != (p0.a & 8))
                        v0 = 0;
                    else if (this.g != p0.g)
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.b.equals(p0.b))
                    v0 = 0;
                else if (!com.google.protobuf.nano.h.a(this.c, p0.c))
                    v0 = 0;
                else if ((this.a & 1) != (p0.a & 1))
                    v0 = 0;
                else if (this.d != p0.d)
                    v0 = 0;
                else if ((this.a & 2) != (p0.a & 2))
                    v0 = 0;
                else if (this.e != p0.e)
                    v0 = 0;
                else if ((this.a & 4) != (p0.a & 4))
                    v0 = 0;
                else if (this.f != p0.f)
                    v0 = 0;
                else if ((this.a & 8) != (p0.a & 8))
                    v0 = 0;
                else if (this.g != p0.g)
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
        v2 = 1231;
        if (this.b == 0)
            v0 = 0;
        else
            v0 = this.b.hashCode();
        v5 = ((v0 + (this.getClass().getName().hashCode() + 527) * 31) * 31 + com.google.protobuf.nano.h.a(this.c)) * 31;
        if (this.d != 0)
            v0 = 1231;
        else
            v0 = 1237;
        v5 = (v0 + v5) * 31;
        if (this.e != 0)
            v0 = 1231;
        else
            v0 = 1237;
        if (this.f == 0)
            v2 = 1237;
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return (((v0 + v5) * 31 + v2) * 31 + this.g) * 31 + v1;
    }

}
