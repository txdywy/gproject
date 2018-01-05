package com.google.a.a.a.a.b.a.a.c.b.a;

import com.google.a.a.a.a.b.a.a.f.h;
import com.google.a.a.a.a.b.a.b.a.ad;
import com.google.a.a.a.a.b.a.b.a.ae;
import com.google.a.a.a.a.b.a.b.a.al;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

protected final class com.google.a.a.a.a.b.a.a.c.b.a.e extends com.google.protobuf.nano.b
{

    public com.google.a.a.a.a.b.a.a.f.h a;
    public com.google.a.a.a.a.b.a.b.a.ae b;
    public com.google.a.a.a.a.b.a.b.a.ad c;
    public com.google.a.a.a.a.b.a.b.a.al d;
    public ae[] e;
    public com.google.a.a.a.a.b.a.b.a.ae f;

    e() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = com.google.a.a.a.a.b.a.b.a.ae.a();
        this.f = 0;
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
            case 42:
  5:            goto 66;
            case 50:
  5:            goto 83;
            case 58:
  5:            goto 147;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 17:    if (this.a == 0)
 24:        this.a = new com.google.a.a.a.a.b.a.a.f.h();
 28:    p0.a(this.a);
 31:    goto 1;
 34:    if (this.b == 0)
 41:        this.b = new com.google.a.a.a.a.b.a.b.a.ae();
 45:    p0.a(this.b);
 48:    goto 1;
 51:    if (this.c == 0)
 58:        this.c = new com.google.a.a.a.a.b.a.b.a.ad();
 62:    p0.a(this.c);
 65:    goto 1;
 68:    if (this.d == 0)
 75:        this.d = new com.google.a.a.a.a.b.a.b.a.al();
 79:    p0.a(this.d);
 82:    goto 1;
 91:    if (this.e == 0)
 93:        v0 = 0;
        else
129:        v0 = this.e.length;
 95:    v2 = new ae[com.google.protobuf.nano.l.a(p0, 50) + v0];
 97:    if (v0 != 0)
101:        System.arraycopy(this.e, 0, v2, 0, v0);
104:    while (v0 < v2.length - 1) {
114:        v2[v0] = new com.google.a.a.a.a.b.a.b.a.ae();
118:        p0.a(v2[v0]);
121:        p0.a();
124:        v0 = v0 + 1;
        }
126:    goto 131;
136:    v2[v0] = new com.google.a.a.a.a.b.a.b.a.ae();
140:    p0.a(v2[v0]);
143:    this.e = v2;
145:    goto 1;
149:    if (this.f == 0)
156:        this.f = new com.google.a.a.a.a.b.a.b.a.ae();
160:    p0.a(this.f);
163:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a != 0)
            p0.b(1, this.a);
        if (this.b != 0)
            p0.b(2, this.b);
        if (this.c != 0)
            p0.b(3, this.c);
        if (this.d != 0)
            p0.b(5, this.d);
        if (this.e != 0 && this.e.length > 0) {
            v0 = 0;
            while (v0 < this.e.length) {
                if (this.e[v0] != 0)
                    p0.b(6, this.e[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.f != 0)
            p0.b(7, this.f);
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
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.d);
        if (this.e != 0 && this.e.length > 0) {
            v1 = v0;
            v0 = 0;
            while (v0 < this.e.length) {
                if (this.e[v0] != 0)
                    v1 = v1 + CodedOutputByteBufferNano.d(6, this.e[v0]);
                v0 = v0 + 1;
            }
            v0 = v1;
        }
        if (this.f != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(7, this.f);
        return v0;
    }

}
