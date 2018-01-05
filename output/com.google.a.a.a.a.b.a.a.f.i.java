package com.google.a.a.a.a.b.a.a.f;

import com.google.a.a.a.a.b.a.b.a.al;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

protected final class com.google.a.a.a.a.b.a.a.f.i extends com.google.protobuf.nano.b
{

    public com.google.a.a.a.a.b.a.b.a.al a;
    public com.google.a.a.a.a.b.a.a.f.g b;
    public String c;
    public String d;

    i() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = "";
        this.d = "";
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
            case 26:
  4:            goto 48;
            case 34:
  4:            goto 55;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 16:    if (this.a == 0)
 23:        this.a = new com.google.a.a.a.a.b.a.b.a.al();
 27:    p0.a(this.a);
 30:    goto 0;
 33:    if (this.b == 0)
 40:        this.b = new com.google.a.a.a.a.b.a.a.f.g();
 44:    p0.a(this.b);
 47:    goto 0;
 52:    this.c = p0.f();
 54:    goto 0;
 59:    this.d = p0.f();
 61:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a != 0)
            p0.b(1, this.a);
        if (this.b != 0)
            p0.b(2, this.b);
        if (this.c != 0 && !this.c.equals(""))
            p0.a(3, this.c);
        if (this.d != 0 && !this.d.equals(""))
            p0.a(4, this.d);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.a);
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.b);
        if (this.c != 0 && !this.c.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.c);
        if (this.d != 0 && !this.d.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(4, this.d);
        return v0;
    }

}
