package com.google.a.a.a.a.a.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

protected final class com.google.a.a.a.a.a.a.a.b extends com.google.protobuf.nano.b
{

    public String a;
    public String b;
    public String c;
    public boolean d;
    public int e;
    public boolean f;
    public String g;

    b() {
        com.google.protobuf.nano.b();
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = "";
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
  4:            goto 21;
            case 26:
  4:            goto 28;
            case 32:
  4:            goto 35;
            case 40:
  4:            goto 42;
            case 48:
  4:            goto 49;
            case 58:
  4:            goto 56;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.a = p0.f();
 20:    goto 0;
 25:    this.b = p0.f();
 27:    goto 0;
 32:    this.c = p0.f();
 34:    goto 0;
 39:    this.d = p0.e();
 41:    goto 0;
 46:    this.e = p0.i();
 48:    goto 0;
 53:    this.f = p0.e();
 55:    goto 0;
 60:    this.g = p0.f();
 62:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a != 0 && !this.a.equals(""))
            p0.a(1, this.a);
        if (this.b != 0 && !this.b.equals(""))
            p0.a(2, this.b);
        if (this.c != 0 && !this.c.equals(""))
            p0.a(3, this.c);
        if (this.d != 0)
            p0.a(4, this.d);
        if (this.e != 0)
            p0.a(5, this.e);
        if (this.f != 0)
            p0.a(6, this.f);
        if (this.g != 0 && !this.g.equals(""))
            p0.a(7, this.g);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a != 0 && !this.a.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.a);
        if (this.b != 0 && !this.b.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.b);
        if (this.c != 0 && !this.c.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.c);
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(4) + 1;
        if (this.e != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.e);
        if (this.f != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(6) + 1;
        if (this.g != 0 && !this.g.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(7, this.g);
        return v0;
    }

}
