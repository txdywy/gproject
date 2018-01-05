package com.google.a.a.a.a.b.a.a.c.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;
import java.util.Arrays;

protected final class com.google.a.a.a.a.b.a.a.c.b.a.q extends com.google.protobuf.nano.b
{

    public String a;
    public byte[] b;
    public String c;
    public s[] d;
    public ac[] e;
    public byte[] f;

    q() {
        com.google.protobuf.nano.b();
        this.a = "";
        this.b = com.google.protobuf.nano.l.l;
        this.c = "";
        this.d = com.google.a.a.a.a.b.a.a.c.b.a.s.a();
        this.e = com.google.a.a.a.a.b.a.a.c.b.a.ac.a();
        this.f = com.google.protobuf.nano.l.l;
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
  5:            goto 22;
            case 26:
  5:            goto 29;
            case 42:
  5:            goto 36;
            case 50:
  5:            goto 99;
            case 58:
  5:            goto 163;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 19:    this.a = p0.f();
 21:    goto 1;
 26:    this.b = p0.g();
 28:    goto 1;
 33:    this.c = p0.f();
 35:    goto 1;
 44:    if (this.d == 0)
 46:        v0 = 0;
        else
 82:        v0 = this.d.length;
 48:    v2 = new s[com.google.protobuf.nano.l.a(p0, 42) + v0];
 50:    if (v0 != 0)
 54:        System.arraycopy(this.d, 0, v2, 0, v0);
 57:    while (v0 < v2.length - 1) {
 67:        v2[v0] = new com.google.a.a.a.a.b.a.a.c.b.a.s();
 71:        p0.a(v2[v0]);
 74:        p0.a();
 77:        v0 = v0 + 1;
        }
 79:    goto 84;
 89:    v2[v0] = new com.google.a.a.a.a.b.a.a.c.b.a.s();
 93:    p0.a(v2[v0]);
 96:    this.d = v2;
 98:    goto 1;
107:    if (this.e == 0)
109:        v0 = 0;
        else
145:        v0 = this.e.length;
111:    v2 = new ac[com.google.protobuf.nano.l.a(p0, 50) + v0];
113:    if (v0 != 0)
117:        System.arraycopy(this.e, 0, v2, 0, v0);
120:    while (v0 < v2.length - 1) {
130:        v2[v0] = new com.google.a.a.a.a.b.a.a.c.b.a.ac();
134:        p0.a(v2[v0]);
137:        p0.a();
140:        v0 = v0 + 1;
        }
142:    goto 147;
152:    v2[v0] = new com.google.a.a.a.a.b.a.a.c.b.a.ac();
156:    p0.a(v2[v0]);
159:    this.e = v2;
161:    goto 1;
167:    this.f = p0.g();
169:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        if (this.a != 0 && !this.a.equals(""))
            p0.a(1, this.a);
        if (!Arrays.equals(this.b, com.google.protobuf.nano.l.l))
            p0.a(2, this.b);
        if (this.c != 0 && !this.c.equals(""))
            p0.a(3, this.c);
        if (this.d != 0 && this.d.length > 0) {
            v0 = 0;
            while (v0 < this.d.length) {
                if (this.d[v0] != 0)
                    p0.b(5, this.d[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.e != 0 && this.e.length > 0)
            while (v1 < this.e.length) {
                if (this.e[v1] != 0)
                    p0.b(6, this.e[v1]);
                v1 = v1 + 1;
            }
        if (!Arrays.equals(this.f, com.google.protobuf.nano.l.l))
            p0.a(7, this.f);
        super.a(p0);
    }

    protected final int b() {
        v1 = 0;
        v0 = super.b();
        if (this.a != 0 && !this.a.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.a);
        if (!Arrays.equals(this.b, com.google.protobuf.nano.l.l))
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.b);
        if (this.c != 0 && !this.c.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.c);
        if (this.d != 0 && this.d.length > 0) {
            v2 = v0;
            v0 = 0;
            while (v0 < this.d.length) {
                if (this.d[v0] != 0)
                    v2 = v2 + CodedOutputByteBufferNano.d(5, this.d[v0]);
                v0 = v0 + 1;
            }
            v0 = v2;
        }
        if (this.e != 0 && this.e.length > 0)
            while (v1 < this.e.length) {
                if (this.e[v1] != 0)
                    v0 = v0 + CodedOutputByteBufferNano.d(6, this.e[v1]);
                v1 = v1 + 1;
            }
        if (!Arrays.equals(this.f, com.google.protobuf.nano.l.l))
            v0 = v0 + CodedOutputByteBufferNano.b(7, this.f);
        return v0;
    }

}
