package com.google.a.a.a.a.b.b.a;

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

protected final class com.google.a.a.a.a.b.b.a.b extends com.google.protobuf.nano.b
{

    public com.google.a.a.a.a.b.a.c.h a;
    public com.google.a.a.a.a.b.a.c.e b;
    public com.google.a.a.a.a.b.a.c.f c;
    public com.google.a.a.a.a.b.b.a.d d;
    public boolean e;
    public int f;
    public String g;
    public long h;
    public byte[] i;

    b() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = "";
        this.h = 0;
        this.i = com.google.protobuf.nano.l.l;
        this.aP = -1;
    }

    private final com.google.a.a.a.a.b.b.a.b b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 34:
  4:            goto 14;
            case 42:
  4:            goto 31;
            case 50:
  4:            goto 48;
            case 64:
  4:            goto 65;
            case 74:
  4:            goto 72;
            case 80:
  4:            goto 89;
            case 90:
  4:            goto 112;
            case 98:
  4:            goto 119;
            case 104:
  4:            goto 126;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 16:    if (this.d == 0)
 23:        this.d = new com.google.a.a.a.a.b.b.a.d();
 27:    p0.a(this.d);
 30:    goto 0;
 33:    if (this.a == 0)
 40:        this.a = new com.google.a.a.a.a.b.a.c.h();
 44:    p0.a(this.a);
 47:    goto 0;
 50:    if (this.b == 0)
 57:        this.b = new com.google.a.a.a.a.b.a.c.e();
 61:    p0.a(this.b);
 64:    goto 0;
 69:    this.e = p0.e();
 71:    goto 0;
 74:    if (this.c == 0)
 81:        this.c = new com.google.a.a.a.a.b.a.c.f();
 85:    p0.a(this.c);
 88:    goto 0;
 93:    try {
101:        this.f = com.google.h.c.c.b.d.c.a(p0.i());
        }
        catch (IllegalArgumentException ex) {
105:        p0.e(p0.o());
108:        this.a(p0, v0);
        }
103:    goto 0;
116:    this.g = p0.f();
118:    goto 0;
123:    this.i = p0.g();
125:    goto 0;
130:    this.h = p0.j();
132:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.d != 0)
            p0.b(4, this.d);
        if (this.a != 0)
            p0.b(5, this.a);
        if (this.b != 0)
            p0.b(6, this.b);
        if (this.e != 0)
            p0.a(8, this.e);
        if (this.c != 0)
            p0.b(9, this.c);
        if (this.f != 0)
            p0.a(10, this.f);
        if (this.g != 0 && !this.g.equals(""))
            p0.a(11, this.g);
        if (!Arrays.equals(this.i, com.google.protobuf.nano.l.l))
            p0.a(12, this.i);
        if (this.h != 0)
            p0.b(13, this.h);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.d);
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.a);
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(6, this.b);
        if (this.e != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(8) + 1;
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(9, this.c);
        if (this.f != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(10, this.f);
        if (this.g != 0 && !this.g.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(11, this.g);
        if (!Arrays.equals(this.i, com.google.protobuf.nano.l.l))
            v0 = v0 + CodedOutputByteBufferNano.b(12, this.i);
        if (this.h != 0)
            v0 = v0 + CodedOutputByteBufferNano.f(13, this.h);
        return v0;
    }

}
