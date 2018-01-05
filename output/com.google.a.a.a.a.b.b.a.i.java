package com.google.a.a.a.a.b.b.a;

import com.google.a.a.a.a.b.a.c.c;
import com.google.a.a.a.a.b.a.c.e;
import com.google.a.a.a.a.b.a.c.f;
import com.google.a.a.a.a.b.a.c.h;
import com.google.h.c.c.b.d.c;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;
import java.util.Arrays;

protected final class com.google.a.a.a.a.b.b.a.i extends com.google.protobuf.nano.b
{

    public int a;
    public com.google.a.a.a.a.b.a.c.h b;
    public com.google.a.a.a.a.b.a.c.e c;
    public com.google.a.a.a.a.b.a.c.f d;
    public boolean e;
    public int f;
    public String g;
    public com.google.a.a.a.a.b.b.a.d h;
    public boolean i;
    public long j;
    public byte[] k;
    public com.google.a.a.a.a.b.a.c.c l;

    i() {
        com.google.protobuf.nano.b();
        this.a = -1;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = "";
        this.a = -1;
        this.h = 0;
        this.a = -1;
        this.j = 0;
        this.k = com.google.protobuf.nano.l.l;
        this.l = 0;
        this.aP = -1;
    }

    private final com.google.a.a.a.a.b.b.a.i b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 10:
  4:            goto 14;
            case 18:
  4:            goto 21;
            case 26:
  4:            goto 41;
            case 34:
  4:            goto 58;
            case 40:
  4:            goto 75;
            case 48:
  4:            goto 82;
            case 56:
  4:            goto 92;
            case 66:
  4:            goto 99;
            case 72:
  4:            goto 116;
            case 82:
  4:            goto 141;
            case 98:
  4:            goto 149;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.g = p0.f();
 20:    goto 0;
 23:    if (this.h == 0)
 30:        this.h = new com.google.a.a.a.a.b.b.a.d();
 34:    p0.a(this.h);
 38:    this.a = 0;
 40:    goto 0;
 43:    if (this.b == 0)
 50:        this.b = new com.google.a.a.a.a.b.a.c.h();
 54:    p0.a(this.b);
 57:    goto 0;
 60:    if (this.c == 0)
 67:        this.c = new com.google.a.a.a.a.b.a.c.e();
 71:    p0.a(this.c);
 74:    goto 0;
 79:    this.e = p0.e();
 81:    goto 0;
 86:    this.i = p0.e();
 89:    this.a = 1;
 91:    goto 0;
 96:    this.j = p0.j();
 98:    goto 0;
101:    if (this.d == 0)
108:        this.d = new com.google.a.a.a.a.b.a.c.f();
112:    p0.a(this.d);
115:    goto 0;
120:    try {
128:        this.f = com.google.h.c.c.b.d.c.a(p0.i());
        }
        catch (IllegalArgumentException ex) {
133:        p0.e(p0.o());
136:        this.a(p0, v0);
        }
130:    goto 0;
145:    this.k = p0.g();
147:    goto 0;
151:    if (this.l == 0)
158:        this.l = new com.google.a.a.a.a.b.a.c.c();
162:    p0.a(this.l);
165:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.g != 0 && !this.g.equals(""))
            p0.a(1, this.g);
        if (this.a == 0)
            p0.b(2, this.h);
        if (this.b != 0)
            p0.b(3, this.b);
        if (this.c != 0)
            p0.b(4, this.c);
        if (this.e != 0)
            p0.a(5, this.e);
        if (this.a == 1)
            p0.a(6, this.i);
        if (this.j != 0)
            p0.b(7, this.j);
        if (this.d != 0)
            p0.b(8, this.d);
        if (this.f != 0)
            p0.a(9, this.f);
        if (!Arrays.equals(this.k, com.google.protobuf.nano.l.l))
            p0.a(10, this.k);
        if (this.l != 0)
            p0.b(12, this.l);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.g != 0 && !this.g.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.g);
        if (this.a == 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.h);
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.b);
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.c);
        if (this.e != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(5) + 1;
        if (this.a == 1)
            v0 = v0 + CodedOutputByteBufferNano.d(6) + 1;
        if (this.j != 0)
            v0 = v0 + CodedOutputByteBufferNano.f(7, this.j);
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(8, this.d);
        if (this.f != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(9, this.f);
        if (!Arrays.equals(this.k, com.google.protobuf.nano.l.l))
            v0 = v0 + CodedOutputByteBufferNano.b(10, this.k);
        if (this.l != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(12, this.l);
        return v0;
    }

}
