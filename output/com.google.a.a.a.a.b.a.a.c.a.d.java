package com.google.a.a.a.a.b.a.a.c.a;

import com.google.a.a.a.a.b.a.a.c.b.a.a;
import com.google.a.a.a.a.b.a.a.c.b.a.ad;
import com.google.a.a.a.a.b.a.a.c.b.a.ah;
import com.google.a.a.a.a.b.a.a.c.b.a.p;
import com.google.a.a.a.a.b.a.a.c.b.a.y;
import com.google.a.a.a.a.b.a.a.f.o;
import com.google.a.a.a.a.b.a.a.h.a.b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

protected final class com.google.a.a.a.a.b.a.a.c.a.d extends com.google.protobuf.nano.b
{

    public com.google.a.a.a.a.b.a.a.c.b.a.y a;
    public com.google.a.a.a.a.b.a.a.c.b.a.ad b;
    public com.google.a.a.a.a.b.a.a.c.b.a.ah c;
    public com.google.a.a.a.a.b.a.a.f.o d;
    public com.google.a.a.a.a.b.a.a.c.b.a.a e;
    public com.google.a.a.a.a.b.a.a.c.b.a.p f;
    public com.google.a.a.a.a.b.a.a.h.a.b g;

    d() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.aP = -1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 18:
  4:            goto 14;
            case 42:
  4:            goto 31;
            case 58:
  4:            goto 48;
            case 90:
  4:            goto 65;
            case 98:
  4:            goto 82;
            case 114:
  4:            goto 99;
            case 122:
  4:            goto 116;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 16:    if (this.a == 0)
 23:        this.a = new com.google.a.a.a.a.b.a.a.c.b.a.y();
 27:    p0.a(this.a);
 30:    goto 0;
 33:    if (this.b == 0)
 40:        this.b = new com.google.a.a.a.a.b.a.a.c.b.a.ad();
 44:    p0.a(this.b);
 47:    goto 0;
 50:    if (this.c == 0)
 57:        this.c = new com.google.a.a.a.a.b.a.a.c.b.a.ah();
 61:    p0.a(this.c);
 64:    goto 0;
 67:    if (this.d == 0)
 74:        this.d = new com.google.a.a.a.a.b.a.a.f.o();
 78:    p0.a(this.d);
 81:    goto 0;
 84:    if (this.e == 0)
 91:        this.e = new com.google.a.a.a.a.b.a.a.c.b.a.a();
 95:    p0.a(this.e);
 98:    goto 0;
101:    if (this.f == 0)
108:        this.f = new com.google.a.a.a.a.b.a.a.c.b.a.p();
112:    p0.a(this.f);
115:    goto 0;
118:    if (this.g == 0)
125:        this.g = new com.google.a.a.a.a.b.a.a.h.a.b();
129:    p0.a(this.g);
132:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a != 0)
            p0.b(2, this.a);
        if (this.b != 0)
            p0.b(5, this.b);
        if (this.c != 0)
            p0.b(7, this.c);
        if (this.d != 0)
            p0.b(11, this.d);
        if (this.e != 0)
            p0.b(12, this.e);
        if (this.f != 0)
            p0.b(14, this.f);
        if (this.g != 0)
            p0.b(15, this.g);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.a);
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.b);
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(7, this.c);
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(11, this.d);
        if (this.e != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(12, this.e);
        if (this.f != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(14, this.f);
        if (this.g != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(15, this.g);
        return v0;
    }

}
