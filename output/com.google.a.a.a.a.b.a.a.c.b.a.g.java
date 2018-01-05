package com.google.a.a.a.a.b.a.a.c.b.a;

import com.google.a.a.a.a.b.a.a.b.a.a;
import com.google.a.a.a.a.b.a.a.d.a.a;
import com.google.a.a.a.a.b.a.a.f.h;
import com.google.a.a.a.a.b.a.b.a.ae;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

protected final class com.google.a.a.a.a.b.a.a.c.b.a.g extends com.google.protobuf.nano.b
{

    public com.google.a.a.a.a.b.a.a.f.h a;
    public com.google.a.a.a.a.b.a.a.b.a.a b;
    public com.google.a.a.a.a.b.a.a.d.a.a c;
    public ae[] d;
    public String e;
    public com.google.a.a.a.a.b.a.b.a.ae f;
    public boolean g;
    public String h;

    g() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = com.google.a.a.a.a.b.a.b.a.ae.a();
        this.e = "";
        this.f = 0;
        this.g = 0;
        this.h = "";
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
  5:            goto 66;
            case 42:
  5:            goto 129;
            case 50:
  5:            goto 137;
            case 56:
  5:            goto 155;
            case 66:
  5:            goto 163;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 17:    if (this.a == 0)
 24:        this.a = new com.google.a.a.a.a.b.a.a.f.h();
 28:    p0.a(this.a);
 31:    goto 1;
 34:    if (this.b == 0)
 41:        this.b = new com.google.a.a.a.a.b.a.a.b.a.a();
 45:    p0.a(this.b);
 48:    goto 1;
 51:    if (this.c == 0)
 58:        this.c = new com.google.a.a.a.a.b.a.a.d.a.a();
 62:    p0.a(this.c);
 65:    goto 1;
 74:    if (this.d == 0)
 76:        v0 = 0;
        else
112:        v0 = this.d.length;
 78:    v2 = new ae[com.google.protobuf.nano.l.a(p0, 34) + v0];
 80:    if (v0 != 0)
 84:        System.arraycopy(this.d, 0, v2, 0, v0);
 87:    while (v0 < v2.length - 1) {
 97:        v2[v0] = new com.google.a.a.a.a.b.a.b.a.ae();
101:        p0.a(v2[v0]);
104:        p0.a();
107:        v0 = v0 + 1;
        }
109:    goto 114;
119:    v2[v0] = new com.google.a.a.a.a.b.a.b.a.ae();
123:    p0.a(v2[v0]);
126:    this.d = v2;
128:    goto 1;
133:    this.e = p0.f();
135:    goto 1;
139:    if (this.f == 0)
146:        this.f = new com.google.a.a.a.a.b.a.b.a.ae();
150:    p0.a(this.f);
153:    goto 1;
159:    this.g = p0.e();
161:    goto 1;
167:    this.h = p0.f();
169:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a != 0)
            p0.b(1, this.a);
        if (this.b != 0)
            p0.b(2, this.b);
        if (this.c != 0)
            p0.b(3, this.c);
        if (this.d != 0 && this.d.length > 0) {
            v0 = 0;
            while (v0 < this.d.length) {
                if (this.d[v0] != 0)
                    p0.b(4, this.d[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.e != 0 && !this.e.equals(""))
            p0.a(5, this.e);
        if (this.f != 0)
            p0.b(6, this.f);
        if (this.g != 0)
            p0.a(7, this.g);
        if (this.h != 0 && !this.h.equals(""))
            p0.a(8, this.h);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.a);
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.b);
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.c);
        if (this.d != 0 && this.d.length > 0) {
            v1 = v0;
            v0 = 0;
            while (v0 < this.d.length) {
                if (this.d[v0] != 0)
                    v1 = v1 + CodedOutputByteBufferNano.d(4, this.d[v0]);
                v0 = v0 + 1;
            }
            v0 = v1;
        }
        if (this.e != 0 && !this.e.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(5, this.e);
        if (this.f != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(6, this.f);
        if (this.g != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(7) + 1;
        if (this.h != 0 && !this.h.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(8, this.h);
        return v0;
    }

}
