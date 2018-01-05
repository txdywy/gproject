package com.google.a.a.a.a.b.a.a.c.b.a;

import com.google.a.a.a.a.b.a.a.d.a.a;
import com.google.a.a.a.a.b.a.a.f.h;
import com.google.a.a.a.a.b.a.b.a.ak;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

protected final class com.google.a.a.a.a.b.a.a.c.b.a.r extends com.google.protobuf.nano.b
{

    public static volatile r[] a;
    public com.google.a.a.a.a.b.a.a.f.h b;
    public com.google.a.a.a.a.b.a.a.c.b.a.s c;
    public n[] d;
    public ak[] e;
    public int f;
    public com.google.a.a.a.a.b.a.a.d.a.a g;

    r() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = 0;
        this.d = com.google.a.a.a.a.b.a.a.c.b.a.n.a();
        this.e = com.google.a.a.a.a.b.a.b.a.ak.a();
        this.f = -1;
        this.g = 0;
        this.aP = -1;
    }

    public static r[] a() {
        if (com.google.a.a.a.a.b.a.a.c.b.a.r.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.a.a.a.a.b.a.a.c.b.a.r.a == 0)
                    com.google.a.a.a.a.b.a.a.c.b.a.r.a = new r[0];
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
        return com.google.a.a.a.a.b.a.a.c.b.a.r.a;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 10:
  5:            goto 15;
            case 18:
  5:            goto 32;
            case 26:
  5:            goto 49;
            case 34:
  5:            goto 112;
            case 50:
  5:            goto 176;
            case 56:
  5:            goto 194;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 17:    if (this.b == 0)
 24:        this.b = new com.google.a.a.a.a.b.a.a.f.h();
 28:    p0.a(this.b);
 31:    goto 1;
 34:    if (this.c == 0)
 41:        this.c = new com.google.a.a.a.a.b.a.a.c.b.a.s();
 45:    p0.a(this.c);
 48:    goto 1;
 57:    if (this.d == 0)
 59:        v0 = 0;
        else
 95:        v0 = this.d.length;
 61:    v2 = new n[com.google.protobuf.nano.l.a(p0, 26) + v0];
 63:    if (v0 != 0)
 67:        System.arraycopy(this.d, 0, v2, 0, v0);
 70:    while (v0 < v2.length - 1) {
 80:        v2[v0] = new com.google.a.a.a.a.b.a.a.c.b.a.n();
 84:        p0.a(v2[v0]);
 87:        p0.a();
 90:        v0 = v0 + 1;
        }
 92:    goto 97;
102:    v2[v0] = new com.google.a.a.a.a.b.a.a.c.b.a.n();
106:    p0.a(v2[v0]);
109:    this.d = v2;
111:    goto 1;
120:    if (this.e == 0)
122:        v0 = 0;
        else
158:        v0 = this.e.length;
124:    v2 = new ak[com.google.protobuf.nano.l.a(p0, 34) + v0];
126:    if (v0 != 0)
130:        System.arraycopy(this.e, 0, v2, 0, v0);
133:    while (v0 < v2.length - 1) {
143:        v2[v0] = new com.google.a.a.a.a.b.a.b.a.ak();
147:        p0.a(v2[v0]);
150:        p0.a();
153:        v0 = v0 + 1;
        }
155:    goto 160;
165:    v2[v0] = new com.google.a.a.a.a.b.a.b.a.ak();
169:    p0.a(v2[v0]);
172:    this.e = v2;
174:    goto 1;
178:    if (this.g == 0)
185:        this.g = new com.google.a.a.a.a.b.a.a.d.a.a();
189:    p0.a(this.g);
192:    goto 1;
198:    this.f = p0.i();
200:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        if (this.b != 0)
            p0.b(1, this.b);
        if (this.c != 0)
            p0.b(2, this.c);
        if (this.d != 0 && this.d.length > 0) {
            v0 = 0;
            while (v0 < this.d.length) {
                if (this.d[v0] != 0)
                    p0.b(3, this.d[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.e != 0 && this.e.length > 0)
            while (v1 < this.e.length) {
                if (this.e[v1] != 0)
                    p0.b(4, this.e[v1]);
                v1 = v1 + 1;
            }
        if (this.g != 0)
            p0.b(6, this.g);
        if (this.f != -1)
            p0.a(7, this.f);
        super.a(p0);
    }

    protected final int b() {
        v1 = 0;
        v0 = super.b();
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.b);
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.c);
        if (this.d != 0 && this.d.length > 0) {
            v2 = v0;
            v0 = 0;
            while (v0 < this.d.length) {
                if (this.d[v0] != 0)
                    v2 = v2 + CodedOutputByteBufferNano.d(3, this.d[v0]);
                v0 = v0 + 1;
            }
            v0 = v2;
        }
        if (this.e != 0 && this.e.length > 0)
            while (v1 < this.e.length) {
                if (this.e[v1] != 0)
                    v0 = v0 + CodedOutputByteBufferNano.d(4, this.e[v1]);
                v1 = v1 + 1;
            }
        if (this.g != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(6, this.g);
        if (this.f != -1)
            v0 = v0 + CodedOutputByteBufferNano.d(7, this.f);
        return v0;
    }

}
