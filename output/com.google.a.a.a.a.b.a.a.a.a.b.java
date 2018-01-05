package com.google.a.a.a.a.b.a.a.a.a;

import com.google.a.a.a.a.b.a.a.c.a.e;
import com.google.a.a.a.a.b.a.a.f.c;
import com.google.a.a.a.a.b.a.a.j.a.b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

protected final class com.google.a.a.a.a.b.a.a.a.a.b extends com.google.protobuf.nano.b
{

    public com.google.a.a.a.a.b.a.a.c.a.e a;
    public com.google.a.a.a.a.b.a.a.f.c b;
    public String c;
    public String d;
    public com.google.a.a.a.a.b.a.a.j.a.b e;

    b() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = "";
        this.d = "";
        this.e = 0;
        this.aP = -1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 10:
  4:            goto 14;
            case 26:
  4:            goto 31;
            case 34:
  4:            goto 38;
            case 42:
  4:            goto 55;
            case 50:
  4:            goto 62;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 16:    if (this.a == 0)
 23:        this.a = new com.google.a.a.a.a.b.a.a.c.a.e();
 27:    p0.a(this.a);
 30:    goto 0;
 35:    this.c = p0.f();
 37:    goto 0;
 40:    if (this.b == 0)
 47:        this.b = new com.google.a.a.a.a.b.a.a.f.c();
 51:    p0.a(this.b);
 54:    goto 0;
 59:    this.d = p0.f();
 61:    goto 0;
 64:    if (this.e == 0)
 71:        this.e = new com.google.a.a.a.a.b.a.a.j.a.b();
 75:    p0.a(this.e);
 78:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a != 0)
            p0.b(1, this.a);
        if (this.c != 0 && !this.c.equals(""))
            p0.a(3, this.c);
        if (this.b != 0)
            p0.b(4, this.b);
        if (this.d != 0 && !this.d.equals(""))
            p0.a(5, this.d);
        if (this.e != 0)
            p0.b(6, this.e);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.a);
        if (this.c != 0 && !this.c.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.c);
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.b);
        if (this.d != 0 && !this.d.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(5, this.d);
        if (this.e != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(6, this.e);
        return v0;
    }

}
