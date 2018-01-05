package com.google.a.a.a.a.b.a.a.c.b.a;

import com.google.a.a.a.a.b.a.a.f.c;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;
import java.util.Arrays;

protected final class com.google.a.a.a.a.b.a.a.c.b.a.ab extends com.google.protobuf.nano.b
{

    public String a;
    public byte[] b;
    public int c;
    public int d;
    public String e;
    public com.google.a.a.a.a.b.a.a.f.c f;
    public String g;
    public String h;

    ab() {
        com.google.protobuf.nano.b();
        this.a = "";
        this.b = com.google.protobuf.nano.l.l;
        this.c = 0;
        this.d = 0;
        this.e = "";
        this.f = 0;
        this.g = "";
        this.h = "";
        this.aP = -1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 8:
  4:            goto 14;
            case 16:
  4:            goto 21;
            case 26:
  4:            goto 28;
            case 42:
  4:            goto 35;
            case 50:
  4:            goto 52;
            case 58:
  4:            goto 59;
            case 66:
  4:            goto 66;
            case 74:
  4:            goto 73;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.c = p0.i();
 20:    goto 0;
 25:    this.d = p0.i();
 27:    goto 0;
 32:    this.e = p0.f();
 34:    goto 0;
 37:    if (this.f == 0)
 44:        this.f = new com.google.a.a.a.a.b.a.a.f.c();
 48:    p0.a(this.f);
 51:    goto 0;
 56:    this.h = p0.f();
 58:    goto 0;
 63:    this.g = p0.f();
 65:    goto 0;
 70:    this.a = p0.f();
 72:    goto 0;
 77:    this.b = p0.g();
 79:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.c != 0)
            p0.a(1, this.c);
        if (this.d != 0)
            p0.a(2, this.d);
        if (this.e != 0 && !this.e.equals(""))
            p0.a(3, this.e);
        if (this.f != 0)
            p0.b(5, this.f);
        if (this.h != 0 && !this.h.equals(""))
            p0.a(6, this.h);
        if (this.g != 0 && !this.g.equals(""))
            p0.a(7, this.g);
        if (this.a != 0 && !this.a.equals(""))
            p0.a(8, this.a);
        if (!Arrays.equals(this.b, com.google.protobuf.nano.l.l))
            p0.a(9, this.b);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.c);
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.d);
        if (this.e != 0 && !this.e.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.e);
        if (this.f != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.f);
        if (this.h != 0 && !this.h.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(6, this.h);
        if (this.g != 0 && !this.g.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(7, this.g);
        if (this.a != 0 && !this.a.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(8, this.a);
        if (!Arrays.equals(this.b, com.google.protobuf.nano.l.l))
            v0 = v0 + CodedOutputByteBufferNano.b(9, this.b);
        return v0;
    }

}
