package com.google.a.a.a.a.b.b.a;

import com.google.a.a.a.a.b.a.c.e;
import com.google.a.a.a.a.b.a.c.f;
import com.google.a.a.a.a.b.a.c.h;
import com.google.h.c.c.b.d.c;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

protected final class com.google.a.a.a.a.b.b.a.g extends com.google.protobuf.nano.b
{

    public com.google.a.a.a.a.b.a.c.h a;
    public com.google.a.a.a.a.b.a.c.e b;
    public com.google.a.a.a.a.b.a.c.f c;
    public int d;
    public com.google.a.a.a.a.b.b.a.d e;

    g() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.aP = -1;
    }

    private final com.google.a.a.a.a.b.b.a.g b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 10:
  4:            goto 14;
            case 18:
  4:            goto 31;
            case 26:
  4:            goto 48;
            case 34:
  4:            goto 65;
            case 40:
  4:            goto 82;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 16:    if (this.a == 0)
 23:        this.a = new com.google.a.a.a.a.b.a.c.h();
 27:    p0.a(this.a);
 30:    goto 0;
 33:    if (this.b == 0)
 40:        this.b = new com.google.a.a.a.a.b.a.c.e();
 44:    p0.a(this.b);
 47:    goto 0;
 50:    if (this.e == 0)
 57:        this.e = new com.google.a.a.a.a.b.b.a.d();
 61:    p0.a(this.e);
 64:    goto 0;
 67:    if (this.c == 0)
 74:        this.c = new com.google.a.a.a.a.b.a.c.f();
 78:    p0.a(this.c);
 81:    goto 0;
 86:    try {
 94:        this.d = com.google.h.c.c.b.d.c.a(p0.i());
        }
        catch (IllegalArgumentException ex) {
 98:        p0.e(p0.o());
101:        this.a(p0, v0);
        }
 96:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a != 0)
            p0.b(1, this.a);
        if (this.b != 0)
            p0.b(2, this.b);
        if (this.e != 0)
            p0.b(3, this.e);
        if (this.c != 0)
            p0.b(4, this.c);
        if (this.d != 0)
            p0.a(5, this.d);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.a);
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.b);
        if (this.e != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.e);
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.c);
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.d);
        return v0;
    }

}
