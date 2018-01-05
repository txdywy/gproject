package com.google.a.a.a.a.b.b.a;

import com.google.a.a.a.a.b.a.c.b;
import com.google.a.a.a.a.b.a.c.d;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

protected final class com.google.a.a.a.a.b.b.a.f extends com.google.protobuf.nano.b
{

    public com.google.a.a.a.a.b.a.c.d a;
    public com.google.a.a.a.a.b.b.a.e b;
    public com.google.a.a.a.a.b.a.c.b c;

    f() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = 0;
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
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 16:    if (this.a == 0)
 23:        this.a = new com.google.a.a.a.a.b.a.c.d();
 27:    p0.a(this.a);
 30:    goto 0;
 33:    if (this.b == 0)
 40:        this.b = new com.google.a.a.a.a.b.b.a.e();
 44:    p0.a(this.b);
 47:    goto 0;
 50:    if (this.c == 0)
 57:        this.c = new com.google.a.a.a.a.b.a.c.b();
 61:    p0.a(this.c);
 64:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a != 0)
            p0.b(1, this.a);
        if (this.b != 0)
            p0.b(2, this.b);
        if (this.c != 0)
            p0.b(3, this.c);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.a);
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.b);
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.c);
        return v0;
    }

}
