package com.google.a.a.a.a.b.a.a.c.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

protected final class com.google.a.a.a.a.b.a.a.c.b.a.c extends com.google.protobuf.nano.b
{

    public int a;
    public com.google.a.a.a.a.b.a.a.c.b.a.i b;
    public com.google.a.a.a.a.b.a.a.c.b.a.e c;
    public com.google.a.a.a.a.b.a.a.c.b.a.l d;

    c() {
        com.google.protobuf.nano.b();
        this.a = -1;
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
 16:    if (this.b == 0)
 23:        this.b = new com.google.a.a.a.a.b.a.a.c.b.a.i();
 27:    p0.a(this.b);
 31:    this.a = 0;
 33:    goto 0;
 36:    if (this.c == 0)
 43:        this.c = new com.google.a.a.a.a.b.a.a.c.b.a.e();
 47:    p0.a(this.c);
 51:    this.a = 1;
 53:    goto 0;
 56:    if (this.d == 0)
 63:        this.d = new com.google.a.a.a.a.b.a.a.c.b.a.l();
 67:    p0.a(this.d);
 71:    this.a = 2;
 73:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a == 0)
            p0.b(1, this.b);
        if (this.a == 1)
            p0.b(2, this.c);
        if (this.a == 2)
            p0.b(3, this.d);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a == 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.b);
        if (this.a == 1)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.c);
        if (this.a == 2)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.d);
        return v0;
    }

}
