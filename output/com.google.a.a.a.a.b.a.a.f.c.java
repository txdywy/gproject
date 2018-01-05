package com.google.a.a.a.a.b.a.a.f;

import com.google.g.a.a.b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;
import java.util.Arrays;

protected final class com.google.a.a.a.a.b.a.a.f.c extends com.google.protobuf.nano.b
{

    public String a;
    public long b;
    public byte[] c;
    public com.google.g.a.a.b d;
    public String e;
    public boolean f;
    public byte[] g;

    c() {
        com.google.protobuf.nano.b();
        this.a = "";
        this.b = 0;
        this.c = com.google.protobuf.nano.l.l;
        this.d = 0;
        this.e = "";
        this.f = 0;
        this.g = com.google.protobuf.nano.l.l;
        this.aP = -1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 10:
  4:            goto 14;
            case 18:
  4:            goto 31;
            case 24:
  4:            goto 38;
            case 42:
  4:            goto 45;
            case 50:
  4:            goto 52;
            case 58:
  4:            goto 59;
            case 64:
  4:            goto 66;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 16:    if (this.d == 0)
 23:        this.d = new com.google.g.a.a.b();
 27:    p0.a(this.d);
 30:    goto 0;
 35:    this.e = p0.f();
 37:    goto 0;
 42:    this.f = p0.e();
 44:    goto 0;
 49:    this.a = p0.f();
 51:    goto 0;
 56:    this.g = p0.g();
 58:    goto 0;
 63:    this.c = p0.g();
 65:    goto 0;
 70:    this.b = p0.j();
 72:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.d != 0)
            p0.b(1, this.d);
        if (this.e != 0 && !this.e.equals(""))
            p0.a(2, this.e);
        if (this.f != 0)
            p0.a(3, this.f);
        if (this.a != 0 && !this.a.equals(""))
            p0.a(5, this.a);
        if (!Arrays.equals(this.g, com.google.protobuf.nano.l.l))
            p0.a(6, this.g);
        if (!Arrays.equals(this.c, com.google.protobuf.nano.l.l))
            p0.a(7, this.c);
        if (this.b != 0)
            p0.b(8, this.b);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.d);
        if (this.e != 0 && !this.e.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.e);
        if (this.f != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3) + 1;
        if (this.a != 0 && !this.a.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(5, this.a);
        if (!Arrays.equals(this.g, com.google.protobuf.nano.l.l))
            v0 = v0 + CodedOutputByteBufferNano.b(6, this.g);
        if (!Arrays.equals(this.c, com.google.protobuf.nano.l.l))
            v0 = v0 + CodedOutputByteBufferNano.b(7, this.c);
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.f(8, this.b);
        return v0;
    }

}
