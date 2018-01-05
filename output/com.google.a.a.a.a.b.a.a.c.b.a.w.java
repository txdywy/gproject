package com.google.a.a.a.a.b.a.a.c.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

protected final class com.google.a.a.a.a.b.a.a.c.b.a.w extends com.google.protobuf.nano.b
{

    public static volatile w[] a;
    public String b;
    public String c;
    public int d;
    public int[] e;
    public String f;

    w() {
        com.google.protobuf.nano.b();
        this.b = "";
        this.c = "";
        this.d = 0;
        this.e = com.google.protobuf.nano.l.e;
        this.f = "";
        this.aP = -1;
    }

    public static w[] a() {
        if (com.google.a.a.a.a.b.a.a.c.b.a.w.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.a.a.a.a.b.a.a.c.b.a.w.a == 0)
                    com.google.a.a.a.a.b.a.a.c.b.a.w.a = new w[0];
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
        return com.google.a.a.a.a.b.a.a.c.b.a.w.a;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 10:
  5:            goto 15;
            case 18:
  5:            goto 22;
            case 24:
  5:            goto 29;
            case 32:
  5:            goto 36;
            case 34:
  5:            goto 87;
            case 42:
  5:            goto 153;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 19:    this.b = p0.f();
 21:    goto 1;
 26:    this.c = p0.f();
 28:    goto 1;
 33:    this.d = p0.i();
 35:    goto 1;
 44:    if (this.e == 0)
 46:        v0 = 0;
        else
 76:        v0 = this.e.length;
 48:    v2 = new int[com.google.protobuf.nano.l.a(p0, 32) + v0];
 50:    if (v0 != 0)
 54:        System.arraycopy(this.e, 0, v2, 0, v0);
 57:    while (v0 < v2.length - 1) {
 66:        v2[v0] = p0.i();
 68:        p0.a();
 71:        v0 = v0 + 1;
        }
 73:    goto 78;
 82:    v2[v0] = p0.i();
 84:    this.e = v2;
 86:    goto 1;
 99:    v0 = 0;
100:    while (p0.m() > 0) {
106:        p0.i();
109:        v0 = v0 + 1;
        }
112:    p0.e(p0.o());
117:    if (this.e == 0)
119:        v2 = 0;
        else
144:        v2 = this.e.length;
121:    v0 = new int[v0 + v2];
123:    if (v2 != 0)
127:        System.arraycopy(this.e, 0, v0, 0, v2);
130:    while (v2 < v0.length) {
137:        v0[v2] = p0.i();
139:        v2 = v2 + 1;
        }
141:    goto 146;
146:    this.e = v0;
148:    p0.d(p0.c(p0.i()));
151:    goto 1;
157:    this.f = p0.f();
159:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b != 0 && !this.b.equals(""))
            p0.a(1, this.b);
        if (this.c != 0 && !this.c.equals(""))
            p0.a(2, this.c);
        if (this.d != 0)
            p0.a(3, this.d);
        if (this.e != 0 && this.e.length > 0) {
            v0 = 0;
            while (v0 < this.e.length) {
                p0.a(4, this.e[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.f != 0 && !this.f.equals(""))
            p0.a(5, this.f);
        super.a(p0);
    }

    protected final int b() {
        v1 = 0;
        v0 = super.b();
        if (this.b != 0 && !this.b.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.b);
        if (this.c != 0 && !this.c.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.c);
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.d);
        if (this.e != 0 && this.e.length > 0) {
            v2 = 0;
            while (v1 < this.e.length) {
                v2 = v2 + CodedOutputByteBufferNano.c(this.e[v1]);
                v1 = v1 + 1;
            }
            v0 = v0 + v2 + this.e.length * 1;
        }
        if (this.f != 0 && !this.f.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(5, this.f);
        return v0;
    }

}
