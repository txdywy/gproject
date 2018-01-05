package com.google.a.a.a.a.b.a.a.f;

import com.google.a.a.a.a.b.a.a.d.a.a;
import com.google.a.a.a.a.b.a.b.a.ak;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

protected final class com.google.a.a.a.a.b.a.a.f.o extends com.google.protobuf.nano.b
{

    public com.google.a.a.a.a.b.a.a.f.h a;
    public p[] b;
    public ak[] c;
    public com.google.a.a.a.a.b.a.a.d.a.a d;

    o() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = com.google.a.a.a.a.b.a.a.f.p.a();
        this.c = com.google.a.a.a.a.b.a.b.a.ak.a();
        this.d = 0;
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
  5:            goto 32;
            case 26:
  5:            goto 95;
            case 58:
  5:            goto 112;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 17:    if (this.a == 0)
 24:        this.a = new com.google.a.a.a.a.b.a.a.f.h();
 28:    p0.a(this.a);
 31:    goto 1;
 40:    if (this.b == 0)
 42:        v0 = 0;
        else
 78:        v0 = this.b.length;
 44:    v2 = new p[com.google.protobuf.nano.l.a(p0, 18) + v0];
 46:    if (v0 != 0)
 50:        System.arraycopy(this.b, 0, v2, 0, v0);
 53:    while (v0 < v2.length - 1) {
 63:        v2[v0] = new com.google.a.a.a.a.b.a.a.f.p();
 67:        p0.a(v2[v0]);
 70:        p0.a();
 73:        v0 = v0 + 1;
        }
 75:    goto 80;
 85:    v2[v0] = new com.google.a.a.a.a.b.a.a.f.p();
 89:    p0.a(v2[v0]);
 92:    this.b = v2;
 94:    goto 1;
 97:    if (this.d == 0)
104:        this.d = new com.google.a.a.a.a.b.a.a.d.a.a();
108:    p0.a(this.d);
111:    goto 1;
120:    if (this.c == 0)
122:        v0 = 0;
        else
158:        v0 = this.c.length;
124:    v2 = new ak[com.google.protobuf.nano.l.a(p0, 58) + v0];
126:    if (v0 != 0)
130:        System.arraycopy(this.c, 0, v2, 0, v0);
133:    while (v0 < v2.length - 1) {
143:        v2[v0] = new com.google.a.a.a.a.b.a.b.a.ak();
147:        p0.a(v2[v0]);
150:        p0.a();
153:        v0 = v0 + 1;
        }
155:    goto 160;
165:    v2[v0] = new com.google.a.a.a.a.b.a.b.a.ak();
169:    p0.a(v2[v0]);
172:    this.c = v2;
174:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        if (this.a != 0)
            p0.b(1, this.a);
        if (this.b != 0 && this.b.length > 0) {
            v0 = 0;
            while (v0 < this.b.length) {
                if (this.b[v0] != 0)
                    p0.b(2, this.b[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.d != 0)
            p0.b(3, this.d);
        if (this.c != 0 && this.c.length > 0)
            while (v1 < this.c.length) {
                if (this.c[v1] != 0)
                    p0.b(7, this.c[v1]);
                v1 = v1 + 1;
            }
        super.a(p0);
    }

    protected final int b() {
        v1 = 0;
        v0 = super.b();
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.a);
        if (this.b != 0 && this.b.length > 0) {
            v2 = v0;
            v0 = 0;
            while (v0 < this.b.length) {
                if (this.b[v0] != 0)
                    v2 = v2 + CodedOutputByteBufferNano.d(2, this.b[v0]);
                v0 = v0 + 1;
            }
            v0 = v2;
        }
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.d);
        if (this.c != 0 && this.c.length > 0)
            while (v1 < this.c.length) {
                if (this.c[v1] != 0)
                    v0 = v0 + CodedOutputByteBufferNano.d(7, this.c[v1]);
                v1 = v1 + 1;
            }
        return v0;
    }

}
