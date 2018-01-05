package com.google.a.a.a.a.b.a.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

protected final class com.google.a.a.a.a.b.a.b.a.i extends com.google.protobuf.nano.b
{

    public static volatile i[] a;
    public h[] b;
    public h[] c;
    public t[] d;
    public l[] e;

    i() {
        com.google.protobuf.nano.b();
        this.b = com.google.a.a.a.a.b.a.b.a.h.a();
        this.c = com.google.a.a.a.a.b.a.b.a.h.a();
        this.d = com.google.a.a.a.a.b.a.b.a.t.a();
        this.e = com.google.a.a.a.a.b.a.b.a.l.a();
        this.aP = -1;
    }

    public static i[] a() {
        if (com.google.a.a.a.a.b.a.b.a.i.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.a.a.a.a.b.a.b.a.i.a == 0)
                    com.google.a.a.a.a.b.a.b.a.i.a = new i[0];
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
        return com.google.a.a.a.a.b.a.b.a.i.a;
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
            case 34:
  5:            goto 206;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 23:    if (this.b == 0)
 25:        v0 = 0;
        else
 61:        v0 = this.b.length;
 27:    v2 = new h[com.google.protobuf.nano.l.a(p0, 10) + v0];
 29:    if (v0 != 0)
 33:        System.arraycopy(this.b, 0, v2, 0, v0);
 36:    while (v0 < v2.length - 1) {
 46:        v2[v0] = new com.google.a.a.a.a.b.a.b.a.h();
 50:        p0.a(v2[v0]);
 53:        p0.a();
 56:        v0 = v0 + 1;
        }
 58:    goto 63;
 68:    v2[v0] = new com.google.a.a.a.a.b.a.b.a.h();
 72:    p0.a(v2[v0]);
 75:    this.b = v2;
 77:    goto 1;
 86:    if (this.c == 0)
 88:        v0 = 0;
        else
124:        v0 = this.c.length;
 90:    v2 = new h[com.google.protobuf.nano.l.a(p0, 18) + v0];
 92:    if (v0 != 0)
 96:        System.arraycopy(this.c, 0, v2, 0, v0);
 99:    while (v0 < v2.length - 1) {
109:        v2[v0] = new com.google.a.a.a.a.b.a.b.a.h();
113:        p0.a(v2[v0]);
116:        p0.a();
119:        v0 = v0 + 1;
        }
121:    goto 126;
131:    v2[v0] = new com.google.a.a.a.a.b.a.b.a.h();
135:    p0.a(v2[v0]);
138:    this.c = v2;
140:    goto 1;
150:    if (this.d == 0)
152:        v0 = 0;
        else
188:        v0 = this.d.length;
154:    v2 = new t[com.google.protobuf.nano.l.a(p0, 26) + v0];
156:    if (v0 != 0)
160:        System.arraycopy(this.d, 0, v2, 0, v0);
163:    while (v0 < v2.length - 1) {
173:        v2[v0] = new com.google.a.a.a.a.b.a.b.a.t();
177:        p0.a(v2[v0]);
180:        p0.a();
183:        v0 = v0 + 1;
        }
185:    goto 190;
195:    v2[v0] = new com.google.a.a.a.a.b.a.b.a.t();
199:    p0.a(v2[v0]);
202:    this.d = v2;
204:    goto 1;
214:    if (this.e == 0)
216:        v0 = 0;
        else
252:        v0 = this.e.length;
218:    v2 = new l[com.google.protobuf.nano.l.a(p0, 34) + v0];
220:    if (v0 != 0)
224:        System.arraycopy(this.e, 0, v2, 0, v0);
227:    while (v0 < v2.length - 1) {
237:        v2[v0] = new com.google.a.a.a.a.b.a.b.a.l();
241:        p0.a(v2[v0]);
244:        p0.a();
247:        v0 = v0 + 1;
        }
249:    goto 254;
259:    v2[v0] = new com.google.a.a.a.a.b.a.b.a.l();
263:    p0.a(v2[v0]);
266:    this.e = v2;
268:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        if (this.b != 0 && this.b.length > 0) {
            v0 = 0;
            while (v0 < this.b.length) {
                if (this.b[v0] != 0)
                    p0.b(1, this.b[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.c != 0 && this.c.length > 0) {
            v0 = 0;
            while (v0 < this.c.length) {
                if (this.c[v0] != 0)
                    p0.b(2, this.c[v0]);
                v0 = v0 + 1;
            }
        }
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
        super.a(p0);
    }

    protected final int b() {
        v1 = 0;
        v0 = super.b();
        if (this.b != 0 && this.b.length > 0) {
            v2 = v0;
            v0 = 0;
            while (v0 < this.b.length) {
                if (this.b[v0] != 0)
                    v2 = v2 + CodedOutputByteBufferNano.d(1, this.b[v0]);
                v0 = v0 + 1;
            }
            v0 = v2;
        }
        if (this.c != 0 && this.c.length > 0) {
            v2 = v0;
            v0 = 0;
            while (v0 < this.c.length) {
                if (this.c[v0] != 0)
                    v2 = v2 + CodedOutputByteBufferNano.d(2, this.c[v0]);
                v0 = v0 + 1;
            }
            v0 = v2;
        }
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
        return v0;
    }

}
