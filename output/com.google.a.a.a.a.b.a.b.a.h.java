package com.google.a.a.a.a.b.a.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

protected final class com.google.a.a.a.a.b.a.b.a.h extends com.google.protobuf.nano.b
{

    public static volatile h[] a;
    public long b;
    public long[] c;

    h() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = com.google.protobuf.nano.l.f;
        this.aP = -1;
    }

    public static h[] a() {
        if (com.google.a.a.a.a.b.a.b.a.h.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.a.a.a.a.b.a.b.a.h.a == 0)
                    com.google.a.a.a.a.b.a.b.a.h.a = new h[0];
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
        return com.google.a.a.a.a.b.a.b.a.h.a;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 8:
  5:            goto 15;
            case 16:
  5:            goto 22;
            case 18:
  5:            goto 73;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 19:    this.b = p0.j();
 21:    goto 1;
 30:    if (this.c == 0)
 32:        v0 = 0;
        else
 62:        v0 = this.c.length;
 34:    v2 = new long[com.google.protobuf.nano.l.a(p0, 16) + v0];
 36:    if (v0 != 0)
 40:        System.arraycopy(this.c, 0, v2, 0, v0);
 43:    while (v0 < v2.length - 1) {
 52:        v2[v0] = p0.j();
 54:        p0.a();
 57:        v0 = v0 + 1;
        }
 59:    goto 64;
 68:    v2[v0] = p0.j();
 70:    this.c = v2;
 72:    goto 1;
 85:    v0 = 0;
 86:    while (p0.m() > 0) {
 92:        p0.j();
 95:        v0 = v0 + 1;
        }
 98:    p0.e(p0.o());
103:    if (this.c == 0)
105:        v2 = 0;
        else
130:        v2 = this.c.length;
107:    v0 = new long[v0 + v2];
109:    if (v2 != 0)
113:        System.arraycopy(this.c, 0, v0, 0, v2);
116:    while (v2 < v0.length) {
123:        v0[v2] = p0.j();
125:        v2 = v2 + 1;
        }
127:    goto 132;
132:    this.c = v0;
134:    p0.d(p0.c(p0.i()));
137:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        if (this.b != 0)
            p0.b(1, this.b);
        if (this.c != 0 && this.c.length > 0) {
            v0 = 0;
            v2 = 0;
            while (v0 < this.c.length) {
                v2 = v2 + CodedOutputByteBufferNano.c(this.c[v0]);
                v0 = v0 + 1;
            }
            p0.e(18);
            p0.e(v2);
            while (v1 < this.c.length) {
                p0.b(this.c[v1]);
                v1 = v1 + 1;
            }
        }
        super.a(p0);
    }

    protected final int b() {
        v1 = 0;
        v0 = super.b();
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.f(1, this.b);
        if (this.c != 0 && this.c.length > 0) {
            v2 = 0;
            while (v1 < this.c.length) {
                v2 = v2 + CodedOutputByteBufferNano.c(this.c[v1]);
                v1 = v1 + 1;
            }
            v0 = v0 + v2 + 1 + CodedOutputByteBufferNano.f(v2);
        }
        return v0;
    }

}
