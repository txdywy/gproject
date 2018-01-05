package com.google.a.a.a.a.b.a.a.c.b.a;

import com.google.a.a.a.a.b.a.a.f.c;
import com.google.a.a.a.a.b.a.b.a.at;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;
import java.util.Arrays;

protected final class com.google.a.a.a.a.b.a.a.c.b.a.b extends com.google.protobuf.nano.b
{

    public String a;
    public byte[] b;
    public at[] c;
    public com.google.a.a.a.a.b.a.a.f.c d;
    public com.google.a.a.a.a.b.a.a.f.c e;
    public String[] f;

    b() {
        com.google.protobuf.nano.b();
        this.a = "";
        this.b = com.google.protobuf.nano.l.l;
        this.c = com.google.a.a.a.a.b.a.b.a.at.a();
        this.d = 0;
        this.e = 0;
        this.f = com.google.protobuf.nano.l.j;
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
            case 34:
  5:            goto 92;
            case 42:
  5:            goto 109;
            case 50:
  5:            goto 126;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 19:    this.a = p0.f();
 21:    goto 1;
 26:    this.b = p0.g();
 28:    goto 1;
 37:    if (this.c == 0)
 39:        v0 = 0;
        else
 75:        v0 = this.c.length;
 41:    v2 = new at[com.google.protobuf.nano.l.a(p0, 26) + v0];
 43:    if (v0 != 0)
 47:        System.arraycopy(this.c, 0, v2, 0, v0);
 50:    while (v0 < v2.length - 1) {
 60:        v2[v0] = new com.google.a.a.a.a.b.a.b.a.at();
 64:        p0.a(v2[v0]);
 67:        p0.a();
 70:        v0 = v0 + 1;
        }
 72:    goto 77;
 82:    v2[v0] = new com.google.a.a.a.a.b.a.b.a.at();
 86:    p0.a(v2[v0]);
 89:    this.c = v2;
 91:    goto 1;
 94:    if (this.d == 0)
101:        this.d = new com.google.a.a.a.a.b.a.a.f.c();
105:    p0.a(this.d);
108:    goto 1;
111:    if (this.e == 0)
118:        this.e = new com.google.a.a.a.a.b.a.a.f.c();
122:    p0.a(this.e);
125:    goto 1;
134:    if (this.f == 0)
136:        v0 = 0;
        else
166:        v0 = this.f.length;
138:    v2 = new String[com.google.protobuf.nano.l.a(p0, 50) + v0];
140:    if (v0 != 0)
144:        System.arraycopy(this.f, 0, v2, 0, v0);
147:    while (v0 < v2.length - 1) {
156:        v2[v0] = p0.f();
158:        p0.a();
161:        v0 = v0 + 1;
        }
163:    goto 168;
172:    v2[v0] = p0.f();
174:    this.f = v2;
176:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        if (this.a != 0 && !this.a.equals(""))
            p0.a(1, this.a);
        if (!Arrays.equals(this.b, com.google.protobuf.nano.l.l))
            p0.a(2, this.b);
        if (this.c != 0 && this.c.length > 0) {
            v0 = 0;
            while (v0 < this.c.length) {
                if (this.c[v0] != 0)
                    p0.b(3, this.c[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.d != 0)
            p0.b(4, this.d);
        if (this.e != 0)
            p0.b(5, this.e);
        if (this.f != 0 && this.f.length > 0)
            while (v1 < this.f.length) {
                if (this.f[v1] != 0)
                    p0.a(6, this.f[v1]);
                v1 = v1 + 1;
            }
        super.a(p0);
    }

    protected final int b() {
        v1 = 0;
        v0 = super.b();
        if (this.a != 0 && !this.a.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.a);
        if (!Arrays.equals(this.b, com.google.protobuf.nano.l.l))
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.b);
        if (this.c != 0 && this.c.length > 0) {
            v2 = v0;
            v0 = 0;
            while (v0 < this.c.length) {
                if (this.c[v0] != 0)
                    v2 = v2 + CodedOutputByteBufferNano.d(3, this.c[v0]);
                v0 = v0 + 1;
            }
            v0 = v2;
        }
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.d);
        if (this.e != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.e);
        if (this.f != 0 && this.f.length > 0) {
            v2 = 0;
            v3 = 0;
            while (v1 < this.f.length) {
                if (this.f[v1] != 0) {
                    v3 = v3 + 1;
                    v2 = v2 + CodedOutputByteBufferNano.b(this.f[v1]);
                }
                v1 = v1 + 1;
            }
            v0 = v0 + v2 + v3 * 1;
        }
        return v0;
    }

}
