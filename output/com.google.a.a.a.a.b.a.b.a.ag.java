package com.google.a.a.a.a.b.a.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

protected final class com.google.a.a.a.a.b.a.b.a.ag extends com.google.protobuf.nano.b
{

    public String a;
    public long[] b;

    ag() {
        com.google.protobuf.nano.b();
        this.a = "";
        this.b = com.google.protobuf.nano.l.f;
        this.aP = -1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 10:
  5:            goto 15;
            case 16:
  5:            goto 22;
            case 18:
  5:            goto 73;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 19:    this.a = p0.f();
 21:    goto 1;
 30:    if (this.b == 0)
 32:        v0 = 0;
        else
 62:        v0 = this.b.length;
 34:    v2 = new long[com.google.protobuf.nano.l.a(p0, 16) + v0];
 36:    if (v0 != 0)
 40:        System.arraycopy(this.b, 0, v2, 0, v0);
 43:    while (v0 < v2.length - 1) {
 52:        v2[v0] = p0.j();
 54:        p0.a();
 57:        v0 = v0 + 1;
        }
 59:    goto 64;
 68:    v2[v0] = p0.j();
 70:    this.b = v2;
 72:    goto 1;
 85:    v0 = 0;
 86:    while (p0.m() > 0) {
 92:        p0.j();
 95:        v0 = v0 + 1;
        }
 98:    p0.e(p0.o());
103:    if (this.b == 0)
105:        v2 = 0;
        else
130:        v2 = this.b.length;
107:    v0 = new long[v0 + v2];
109:    if (v2 != 0)
113:        System.arraycopy(this.b, 0, v0, 0, v2);
116:    while (v2 < v0.length) {
123:        v0[v2] = p0.j();
125:        v2 = v2 + 1;
        }
127:    goto 132;
132:    this.b = v0;
134:    p0.d(p0.c(p0.i()));
137:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        if (this.a != 0 && !this.a.equals(""))
            p0.a(1, this.a);
        if (this.b != 0 && this.b.length > 0) {
            v0 = 0;
            v2 = 0;
            while (v0 < this.b.length) {
                v2 = v2 + CodedOutputByteBufferNano.c(this.b[v0]);
                v0 = v0 + 1;
            }
            p0.e(18);
            p0.e(v2);
            while (v1 < this.b.length) {
                p0.b(this.b[v1]);
                v1 = v1 + 1;
            }
        }
        super.a(p0);
    }

    protected final int b() {
        v1 = 0;
        v0 = super.b();
        if (this.a != 0 && !this.a.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.a);
        if (this.b != 0 && this.b.length > 0) {
            v2 = 0;
            while (v1 < this.b.length) {
                v2 = v2 + CodedOutputByteBufferNano.c(this.b[v1]);
                v1 = v1 + 1;
            }
            v0 = v0 + v2 + 1 + CodedOutputByteBufferNano.f(v2);
        }
        return v0;
    }

}
