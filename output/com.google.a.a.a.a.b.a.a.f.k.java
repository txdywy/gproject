package com.google.a.a.a.a.b.a.a.f;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

protected final class com.google.a.a.a.a.b.a.a.f.k extends com.google.protobuf.nano.b
{

    public com.google.a.a.a.a.b.a.a.f.h a;
    public String b;
    public com.google.a.a.a.a.b.a.a.f.l c;
    public String[] d;
    public String[] e;
    public String f;
    public boolean g;

    k() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = "";
        this.c = 0;
        this.d = com.google.protobuf.nano.l.j;
        this.e = com.google.protobuf.nano.l.j;
        this.f = "";
        this.g = 0;
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
  5:            goto 49;
            case 34:
  5:            goto 100;
            case 42:
  5:            goto 107;
            case 48:
  5:            goto 114;
            case 74:
  5:            goto 121;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 17:    if (this.a == 0)
 24:        this.a = new com.google.a.a.a.a.b.a.a.f.h();
 28:    p0.a(this.a);
 31:    goto 1;
 34:    if (this.c == 0)
 41:        this.c = new com.google.a.a.a.a.b.a.a.f.l();
 45:    p0.a(this.c);
 48:    goto 1;
 57:    if (this.d == 0)
 59:        v0 = 0;
        else
 89:        v0 = this.d.length;
 61:    v2 = new String[com.google.protobuf.nano.l.a(p0, 26) + v0];
 63:    if (v0 != 0)
 67:        System.arraycopy(this.d, 0, v2, 0, v0);
 70:    while (v0 < v2.length - 1) {
 79:        v2[v0] = p0.f();
 81:        p0.a();
 84:        v0 = v0 + 1;
        }
 86:    goto 91;
 95:    v2[v0] = p0.f();
 97:    this.d = v2;
 99:    goto 1;
104:    this.b = p0.f();
106:    goto 1;
111:    this.f = p0.f();
113:    goto 1;
118:    this.g = p0.e();
120:    goto 1;
129:    if (this.e == 0)
131:        v0 = 0;
        else
161:        v0 = this.e.length;
133:    v2 = new String[com.google.protobuf.nano.l.a(p0, 74) + v0];
135:    if (v0 != 0)
139:        System.arraycopy(this.e, 0, v2, 0, v0);
142:    while (v0 < v2.length - 1) {
151:        v2[v0] = p0.f();
153:        p0.a();
156:        v0 = v0 + 1;
        }
158:    goto 163;
167:    v2[v0] = p0.f();
169:    this.e = v2;
171:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        if (this.a != 0)
            p0.b(1, this.a);
        if (this.c != 0)
            p0.b(2, this.c);
        if (this.d != 0 && this.d.length > 0) {
            v0 = 0;
            while (v0 < this.d.length) {
                if (this.d[v0] != 0)
                    p0.a(3, this.d[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.b != 0 && !this.b.equals(""))
            p0.a(4, this.b);
        if (this.f != 0 && !this.f.equals(""))
            p0.a(5, this.f);
        if (this.g != 0)
            p0.a(6, this.g);
        if (this.e != 0 && this.e.length > 0)
            while (v1 < this.e.length) {
                if (this.e[v1] != 0)
                    p0.a(9, this.e[v1]);
                v1 = v1 + 1;
            }
        super.a(p0);
    }

    protected final int b() {
        v2 = 0;
        v0 = super.b();
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.a);
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.c);
        if (this.d != 0 && this.d.length > 0) {
            v1 = 0;
            v3 = 0;
            v4 = 0;
            while (v1 < this.d.length) {
                if (this.d[v1] != 0) {
                    v4 = v4 + 1;
                    v3 = v3 + CodedOutputByteBufferNano.b(this.d[v1]);
                }
                v1 = v1 + 1;
            }
            v0 = v0 + v3 + v4 * 1;
        }
        if (this.b != 0 && !this.b.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(4, this.b);
        if (this.f != 0 && !this.f.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(5, this.f);
        if (this.g != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(6) + 1;
        if (this.e != 0 && this.e.length > 0) {
            v1 = 0;
            v3 = 0;
            while (v2 < this.e.length) {
                if (this.e[v2] != 0) {
                    v3 = v3 + 1;
                    v1 = v1 + CodedOutputByteBufferNano.b(this.e[v2]);
                }
                v2 = v2 + 1;
            }
            v0 = v0 + v1 + v3 * 1;
        }
        return v0;
    }

}
