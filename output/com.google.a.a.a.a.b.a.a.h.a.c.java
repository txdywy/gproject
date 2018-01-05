package com.google.a.a.a.a.b.a.a.h.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

protected final class com.google.a.a.a.a.b.a.a.h.a.c extends com.google.protobuf.nano.b
{

    public static volatile c[] a;
    public int b;
    public String c;
    public int d;
    public String e;
    public String f;
    public String[] g;
    public a[] h;
    public String[] i;
    public String j;
    public boolean k;

    c() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = "";
        this.d = -1;
        this.e = "";
        this.f = "";
        this.g = com.google.protobuf.nano.l.j;
        this.h = com.google.a.a.a.a.b.a.a.h.a.a.a();
        this.i = com.google.protobuf.nano.l.j;
        this.j = "";
        this.k = 0;
        this.aP = -1;
    }

    public static c[] a() {
        if (com.google.a.a.a.a.b.a.a.h.a.c.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.a.a.a.a.b.a.a.h.a.c.a == 0)
                    com.google.a.a.a.a.b.a.a.h.a.c.a = new c[0];
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
        return com.google.a.a.a.a.b.a.a.h.a.c.a;
    }

    private final com.google.a.a.a.a.b.a.a.h.a.c b(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 10:
  5:            goto 15;
            case 16:
  5:            goto 22;
            case 26:
  5:            goto 29;
            case 34:
  5:            goto 36;
            case 42:
  5:            goto 43;
            case 48:
  5:            goto 94;
            case 58:
  5:            goto 145;
            case 66:
  5:            goto 209;
            case 74:
  5:            goto 261;
            case 80:
  5:            goto 269;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 19:    this.c = p0.f();
 21:    goto 1;
 26:    this.d = p0.i();
 28:    goto 1;
 33:    this.e = p0.f();
 35:    goto 1;
 40:    this.f = p0.f();
 42:    goto 1;
 51:    if (this.g == 0)
 53:        v0 = 0;
        else
 83:        v0 = this.g.length;
 55:    v2 = new String[com.google.protobuf.nano.l.a(p0, 42) + v0];
 57:    if (v0 != 0)
 61:        System.arraycopy(this.g, 0, v2, 0, v0);
 64:    while (v0 < v2.length - 1) {
 73:        v2[v0] = p0.f();
 75:        p0.a();
 78:        v0 = v0 + 1;
        }
 80:    goto 85;
 89:    v2[v0] = p0.f();
 91:    this.g = v2;
 93:    goto 1;
 98:    try {
 98:        v3 = p0.i();
102:        switch (v3) {
                case 0:
141:                try {
141:                    this.b = v3;
                    }
                    catch (IllegalArgumentException ex) {
133:                    p0.e(p0.o());
136:                    this.a(p0, v0);
                    }
278:                break;
                case 1:
141:                try {
141:                    this.b = v3;
                    }
                    catch (IllegalArgumentException ex) {
133:                    p0.e(p0.o());
136:                    this.a(p0, v0);
                    }
278:                break;
                case 2:
141:                try {
141:                    this.b = v3;
                    }
                    catch (IllegalArgumentException ex) {
133:                    p0.e(p0.o());
136:                    this.a(p0, v0);
                    }
278:                break;
                default:
131:                throw new IllegalArgumentException(47 + v3 + " is not a valid enum AppRedirectType");
            }
        }
        catch (IllegalArgumentException ex) {
        }
133:    p0.e(p0.o());
136:    this.a(p0, v0);
139:    goto 1;
153:    if (this.h == 0)
155:        v0 = 0;
        else
191:        v0 = this.h.length;
157:    v2 = new a[com.google.protobuf.nano.l.a(p0, 58) + v0];
159:    if (v0 != 0)
163:        System.arraycopy(this.h, 0, v2, 0, v0);
166:    while (v0 < v2.length - 1) {
176:        v2[v0] = new com.google.a.a.a.a.b.a.a.h.a.a();
180:        p0.a(v2[v0]);
183:        p0.a();
186:        v0 = v0 + 1;
        }
188:    goto 193;
198:    v2[v0] = new com.google.a.a.a.a.b.a.a.h.a.a();
202:    p0.a(v2[v0]);
205:    this.h = v2;
207:    goto 1;
217:    if (this.i == 0)
219:        v0 = 0;
        else
249:        v0 = this.i.length;
221:    v2 = new String[com.google.protobuf.nano.l.a(p0, 66) + v0];
223:    if (v0 != 0)
227:        System.arraycopy(this.i, 0, v2, 0, v0);
230:    while (v0 < v2.length - 1) {
239:        v2[v0] = p0.f();
241:        p0.a();
244:        v0 = v0 + 1;
        }
246:    goto 251;
255:    v2[v0] = p0.f();
257:    this.i = v2;
259:    goto 1;
265:    this.j = p0.f();
267:    goto 1;
273:    this.k = p0.e();
275:    goto 1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        if (this.c != 0 && !this.c.equals(""))
            p0.a(1, this.c);
        if (this.d != -1)
            p0.a(2, this.d);
        if (this.e != 0 && !this.e.equals(""))
            p0.a(3, this.e);
        if (this.f != 0 && !this.f.equals(""))
            p0.a(4, this.f);
        if (this.g != 0 && this.g.length > 0) {
            v0 = 0;
            while (v0 < this.g.length) {
                if (this.g[v0] != 0)
                    p0.a(5, this.g[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.b != 0)
            p0.a(6, this.b);
        if (this.h != 0 && this.h.length > 0) {
            v0 = 0;
            while (v0 < this.h.length) {
                if (this.h[v0] != 0)
                    p0.b(7, this.h[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.i != 0 && this.i.length > 0)
            while (v1 < this.i.length) {
                if (this.i[v1] != 0)
                    p0.a(8, this.i[v1]);
                v1 = v1 + 1;
            }
        if (this.j != 0 && !this.j.equals(""))
            p0.a(9, this.j);
        if (this.k != 0)
            p0.a(10, this.k);
        super.a(p0);
    }

    protected final int b() {
        v2 = 0;
        v0 = super.b();
        if (this.c != 0 && !this.c.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.c);
        if (this.d != -1)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.d);
        if (this.e != 0 && !this.e.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.e);
        if (this.f != 0 && !this.f.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(4, this.f);
        if (this.g != 0 && this.g.length > 0) {
            v1 = 0;
            v3 = 0;
            v4 = 0;
            while (v1 < this.g.length) {
                if (this.g[v1] != 0) {
                    v4 = v4 + 1;
                    v3 = v3 + CodedOutputByteBufferNano.b(this.g[v1]);
                }
                v1 = v1 + 1;
            }
            v0 = v0 + v3 + v4 * 1;
        }
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(6, this.b);
        if (this.h != 0 && this.h.length > 0) {
            v1 = v0;
            v0 = 0;
            while (v0 < this.h.length) {
                if (this.h[v0] != 0)
                    v1 = v1 + CodedOutputByteBufferNano.d(7, this.h[v0]);
                v0 = v0 + 1;
            }
            v0 = v1;
        }
        if (this.i != 0 && this.i.length > 0) {
            v1 = 0;
            v3 = 0;
            while (v2 < this.i.length) {
                if (this.i[v2] != 0) {
                    v3 = v3 + 1;
                    v1 = v1 + CodedOutputByteBufferNano.b(this.i[v2]);
                }
                v2 = v2 + 1;
            }
            v0 = v0 + v1 + v3 * 1;
        }
        if (this.j != 0 && !this.j.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(9, this.j);
        if (this.k != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(10) + 1;
        return v0;
    }

}
