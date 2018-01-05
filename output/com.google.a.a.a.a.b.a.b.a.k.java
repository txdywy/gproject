package com.google.a.a.a.a.b.a.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

protected final class com.google.a.a.a.a.b.a.b.a.k extends com.google.protobuf.nano.b
{

    public j[] a;
    public i[] b;
    public y[] c;

    k() {
        com.google.protobuf.nano.b();
        this.a = com.google.a.a.a.a.b.a.b.a.j.a();
        this.b = com.google.a.a.a.a.b.a.b.a.i.a();
        this.c = com.google.a.a.a.a.b.a.b.a.y.a();
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
  5:            goto 78;
            case 26:
  5:            goto 142;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 23:    if (this.a == 0)
 25:        v0 = 0;
        else
 61:        v0 = this.a.length;
 27:    v2 = new j[com.google.protobuf.nano.l.a(p0, 10) + v0];
 29:    if (v0 != 0)
 33:        System.arraycopy(this.a, 0, v2, 0, v0);
 36:    while (v0 < v2.length - 1) {
 46:        v2[v0] = new com.google.a.a.a.a.b.a.b.a.j();
 50:        p0.a(v2[v0]);
 53:        p0.a();
 56:        v0 = v0 + 1;
        }
 58:    goto 63;
 68:    v2[v0] = new com.google.a.a.a.a.b.a.b.a.j();
 72:    p0.a(v2[v0]);
 75:    this.a = v2;
 77:    goto 1;
 86:    if (this.b == 0)
 88:        v0 = 0;
        else
124:        v0 = this.b.length;
 90:    v2 = new i[com.google.protobuf.nano.l.a(p0, 18) + v0];
 92:    if (v0 != 0)
 96:        System.arraycopy(this.b, 0, v2, 0, v0);
 99:    while (v0 < v2.length - 1) {
109:        v2[v0] = new com.google.a.a.a.a.b.a.b.a.i();
113:        p0.a(v2[v0]);
116:        p0.a();
119:        v0 = v0 + 1;
        }
121:    goto 126;
131:    v2[v0] = new com.google.a.a.a.a.b.a.b.a.i();
135:    p0.a(v2[v0]);
138:    this.b = v2;
140:    goto 1;
150:    if (this.c == 0)
152:        v0 = 0;
        else
188:        v0 = this.c.length;
154:    v2 = new y[com.google.protobuf.nano.l.a(p0, 26) + v0];
156:    if (v0 != 0)
160:        System.arraycopy(this.c, 0, v2, 0, v0);
163:    while (v0 < v2.length - 1) {
173:        v2[v0] = new com.google.a.a.a.a.b.a.b.a.y();
177:        p0.a(v2[v0]);
180:        p0.a();
183:        v0 = v0 + 1;
        }
185:    goto 190;
195:    v2[v0] = new com.google.a.a.a.a.b.a.b.a.y();
199:    p0.a(v2[v0]);
202:    this.c = v2;
204:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        if (this.a != 0 && this.a.length > 0) {
            v0 = 0;
            while (v0 < this.a.length) {
                if (this.a[v0] != 0)
                    p0.b(1, this.a[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.b != 0 && this.b.length > 0) {
            v0 = 0;
            while (v0 < this.b.length) {
                if (this.b[v0] != 0)
                    p0.b(2, this.b[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.c != 0 && this.c.length > 0)
            while (v1 < this.c.length) {
                if (this.c[v1] != 0)
                    p0.b(3, this.c[v1]);
                v1 = v1 + 1;
            }
        super.a(p0);
    }

    protected final int b() {
        v1 = 0;
        v0 = super.b();
        if (this.a != 0 && this.a.length > 0) {
            v2 = v0;
            v0 = 0;
            while (v0 < this.a.length) {
                if (this.a[v0] != 0)
                    v2 = v2 + CodedOutputByteBufferNano.d(1, this.a[v0]);
                v0 = v0 + 1;
            }
            v0 = v2;
        }
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
        if (this.c != 0 && this.c.length > 0)
            while (v1 < this.c.length) {
                if (this.c[v1] != 0)
                    v0 = v0 + CodedOutputByteBufferNano.d(3, this.c[v1]);
                v1 = v1 + 1;
            }
        return v0;
    }

}
