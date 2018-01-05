package com.google.a.a.a.a.b.a.a.c.a;

import com.google.a.a.a.a.b.a.a.c.b.a.c;
import com.google.a.a.a.a.b.a.a.c.b.a.g;
import com.google.a.a.a.a.b.a.a.f.h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

protected final class com.google.a.a.a.a.b.a.a.c.a.b extends com.google.protobuf.nano.b
{

    public int a;
    public com.google.a.a.a.a.b.a.a.f.h b;
    public com.google.a.a.a.a.b.a.a.c.b.a.c c;
    public com.google.a.a.a.a.b.a.a.c.b.a.g d;

    b() {
        com.google.protobuf.nano.b();
        this.a = -1;
        this.b = 0;
        this.a = -1;
        this.c = 0;
        this.a = -1;
        this.d = 0;
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
  4:            goto 34;
            case 26:
  4:            goto 54;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 16:    if (this.c == 0)
 23:        this.c = new com.google.a.a.a.a.b.a.a.c.b.a.c();
 27:    p0.a(this.c);
 31:    this.a = 0;
 33:    goto 0;
 36:    if (this.d == 0)
 43:        this.d = new com.google.a.a.a.a.b.a.a.c.b.a.g();
 47:    p0.a(this.d);
 51:    this.a = 1;
 53:    goto 0;
 56:    if (this.b == 0)
 63:        this.b = new com.google.a.a.a.a.b.a.a.f.h();
 67:    p0.a(this.b);
 70:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a == 0)
            p0.b(1, this.c);
        if (this.a == 1)
            p0.b(2, this.d);
        if (this.b != 0)
            p0.b(3, this.b);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a == 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.c);
        if (this.a == 1)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.d);
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.b);
        return v0;
    }

}
