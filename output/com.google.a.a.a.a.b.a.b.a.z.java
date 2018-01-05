package com.google.a.a.a.a.b.a.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

protected final class com.google.a.a.a.a.b.a.b.a.z extends com.google.protobuf.nano.b
{

    public int a;
    public int b;
    public String c;
    public boolean d;
    public String e;
    public String f;
    public int[] g;

    z() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = "";
        this.d = 0;
        this.e = "";
        this.f = "";
        this.g = com.google.protobuf.nano.l.e;
        this.aP = -1;
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
            case 26:
  5:            goto 29;
            case 32:
  5:            goto 36;
            case 42:
  5:            goto 43;
            case 50:
  5:            goto 50;
            case 56:
  5:            goto 57;
            case 58:
  5:            goto 108;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 19:    this.a = p0.i();
 21:    goto 1;
 26:    this.b = p0.i();
 28:    goto 1;
 33:    this.c = p0.f();
 35:    goto 1;
 40:    this.d = p0.e();
 42:    goto 1;
 47:    this.e = p0.f();
 49:    goto 1;
 54:    this.f = p0.f();
 56:    goto 1;
 65:    if (this.g == 0)
 67:        v0 = 0;
        else
 97:        v0 = this.g.length;
 69:    v2 = new int[com.google.protobuf.nano.l.a(p0, 56) + v0];
 71:    if (v0 != 0)
 75:        System.arraycopy(this.g, 0, v2, 0, v0);
 78:    while (v0 < v2.length - 1) {
 87:        v2[v0] = p0.i();
 89:        p0.a();
 92:        v0 = v0 + 1;
        }
 94:    goto 99;
103:    v2[v0] = p0.i();
105:    this.g = v2;
107:    goto 1;
120:    v0 = 0;
121:    while (p0.m() > 0) {
127:        p0.i();
130:        v0 = v0 + 1;
        }
133:    p0.e(p0.o());
138:    if (this.g == 0)
140:        v2 = 0;
        else
165:        v2 = this.g.length;
142:    v0 = new int[v0 + v2];
144:    if (v2 != 0)
148:        System.arraycopy(this.g, 0, v0, 0, v2);
151:    while (v2 < v0.length) {
158:        v0[v2] = p0.i();
160:        v2 = v2 + 1;
        }
162:    goto 167;
167:    this.g = v0;
169:    p0.d(p0.c(p0.i()));
172:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a != 0)
            p0.a(1, this.a);
        if (this.b != 0)
            p0.a(2, this.b);
        if (this.c != 0 && !this.c.equals(""))
            p0.a(3, this.c);
        if (this.d != 0)
            p0.a(4, this.d);
        if (this.e != 0 && !this.e.equals(""))
            p0.a(5, this.e);
        if (this.f != 0 && !this.f.equals(""))
            p0.a(6, this.f);
        if (this.g != 0 && this.g.length > 0) {
            v0 = 0;
            while (v0 < this.g.length) {
                p0.a(7, this.g[v0]);
                v0 = v0 + 1;
            }
        }
        super.a(p0);
    }

    protected final int b() {
        v1 = 0;
        v0 = super.b();
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.a);
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.b);
        if (this.c != 0 && !this.c.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.c);
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(4) + 1;
        if (this.e != 0 && !this.e.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(5, this.e);
        if (this.f != 0 && !this.f.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(6, this.f);
        if (this.g != 0 && this.g.length > 0) {
            v2 = 0;
            while (v1 < this.g.length) {
                v2 = v2 + CodedOutputByteBufferNano.c(this.g[v1]);
                v1 = v1 + 1;
            }
            v0 = v0 + v2 + this.g.length * 1;
        }
        return v0;
    }

}
