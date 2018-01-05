package com.google.a.a.a.a.b.a.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

protected final class com.google.a.a.a.a.b.a.b.a.ak extends com.google.protobuf.nano.b
{

    public static volatile ak[] a;
    public int b;
    public int c;
    public int[] d;
    public int[] e;

    ak() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = 0;
        this.d = com.google.protobuf.nano.l.e;
        this.e = com.google.protobuf.nano.l.e;
        this.aP = -1;
    }

    public static ak[] a() {
        if (com.google.a.a.a.a.b.a.b.a.ak.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.a.a.a.a.b.a.b.a.ak.a == 0)
                    com.google.a.a.a.a.b.a.b.a.ak.a = new ak[0];
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
        return com.google.a.a.a.a.b.a.b.a.ak.a;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 24:
  5:            goto 15;
            case 32:
  5:            goto 22;
            case 48:
  5:            goto 29;
            case 50:
  5:            goto 80;
            case 56:
  5:            goto 146;
            case 58:
  5:            goto 198;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 19:    this.b = p0.i();
 21:    goto 1;
 26:    this.c = p0.i();
 28:    goto 1;
 37:    if (this.d == 0)
 39:        v0 = 0;
        else
 69:        v0 = this.d.length;
 41:    v2 = new int[com.google.protobuf.nano.l.a(p0, 48) + v0];
 43:    if (v0 != 0)
 47:        System.arraycopy(this.d, 0, v2, 0, v0);
 50:    while (v0 < v2.length - 1) {
 59:        v2[v0] = p0.i();
 61:        p0.a();
 64:        v0 = v0 + 1;
        }
 66:    goto 71;
 75:    v2[v0] = p0.i();
 77:    this.d = v2;
 79:    goto 1;
 92:    v0 = 0;
 93:    while (p0.m() > 0) {
 99:        p0.i();
102:        v0 = v0 + 1;
        }
105:    p0.e(p0.o());
110:    if (this.d == 0)
112:        v2 = 0;
        else
137:        v2 = this.d.length;
114:    v0 = new int[v0 + v2];
116:    if (v2 != 0)
120:        System.arraycopy(this.d, 0, v0, 0, v2);
123:    while (v2 < v0.length) {
130:        v0[v2] = p0.i();
132:        v2 = v2 + 1;
        }
134:    goto 139;
139:    this.d = v0;
141:    p0.d(p0.c(p0.i()));
144:    goto 1;
154:    if (this.e == 0)
156:        v0 = 0;
        else
186:        v0 = this.e.length;
158:    v2 = new int[com.google.protobuf.nano.l.a(p0, 56) + v0];
160:    if (v0 != 0)
164:        System.arraycopy(this.e, 0, v2, 0, v0);
167:    while (v0 < v2.length - 1) {
176:        v2[v0] = p0.i();
178:        p0.a();
181:        v0 = v0 + 1;
        }
183:    goto 188;
192:    v2[v0] = p0.i();
194:    this.e = v2;
196:    goto 1;
210:    v0 = 0;
211:    while (p0.m() > 0) {
217:        p0.i();
220:        v0 = v0 + 1;
        }
223:    p0.e(p0.o());
228:    if (this.e == 0)
230:        v2 = 0;
        else
255:        v2 = this.e.length;
232:    v0 = new int[v0 + v2];
234:    if (v2 != 0)
238:        System.arraycopy(this.e, 0, v0, 0, v2);
241:    while (v2 < v0.length) {
248:        v0[v2] = p0.i();
250:        v2 = v2 + 1;
        }
252:    goto 257;
257:    this.e = v0;
259:    p0.d(p0.c(p0.i()));
262:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        if (this.b != 0)
            p0.a(3, this.b);
        if (this.c != 0)
            p0.a(4, this.c);
        if (this.d != 0 && this.d.length > 0) {
            v0 = 0;
            v2 = 0;
            while (v0 < this.d.length) {
                v2 = v2 + CodedOutputByteBufferNano.c(this.d[v0]);
                v0 = v0 + 1;
            }
            p0.e(50);
            p0.e(v2);
            v0 = 0;
            while (v0 < this.d.length) {
                p0.a(this.d[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.e != 0 && this.e.length > 0) {
            v0 = 0;
            v2 = 0;
            while (v0 < this.e.length) {
                v2 = v2 + CodedOutputByteBufferNano.c(this.e[v0]);
                v0 = v0 + 1;
            }
            p0.e(58);
            p0.e(v2);
            while (v1 < this.e.length) {
                p0.a(this.e[v1]);
                v1 = v1 + 1;
            }
        }
        super.a(p0);
    }

    protected final int b() {
        v2 = 0;
        v0 = super.b();
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.b);
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.c);
        if (this.d != 0 && this.d.length > 0) {
            v1 = 0;
            v3 = 0;
            while (v1 < this.d.length) {
                v3 = v3 + CodedOutputByteBufferNano.c(this.d[v1]);
                v1 = v1 + 1;
            }
            v0 = v0 + v3 + 1 + CodedOutputByteBufferNano.f(v3);
        }
        if (this.e != 0 && this.e.length > 0) {
            v1 = 0;
            while (v2 < this.e.length) {
                v1 = v1 + CodedOutputByteBufferNano.c(this.e[v2]);
                v2 = v2 + 1;
            }
            v0 = v0 + v1 + 1 + CodedOutputByteBufferNano.f(v1);
        }
        return v0;
    }

}
