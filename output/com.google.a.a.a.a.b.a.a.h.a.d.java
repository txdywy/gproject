package com.google.a.a.a.a.b.a.a.h.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

protected final class com.google.a.a.a.a.b.a.a.h.a.d extends com.google.protobuf.nano.b
{

    public boolean a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;

    d() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
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
            case 24:
  4:            goto 28;
            case 32:
  4:            goto 35;
            case 40:
  4:            goto 42;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.a = p0.e();
 20:    goto 0;
 25:    this.b = p0.e();
 27:    goto 0;
 32:    this.c = p0.e();
 34:    goto 0;
 39:    this.d = p0.i();
 41:    goto 0;
 46:    this.e = p0.i();
 48:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a != 0)
            p0.a(1, this.a);
        if (this.b != 0)
            p0.a(2, this.b);
        if (this.c != 0)
            p0.a(3, this.c);
        if (this.d != 0)
            p0.a(4, this.d);
        if (this.e != 0)
            p0.a(5, this.e);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1) + 1;
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2) + 1;
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3) + 1;
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.d);
        if (this.e != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.e);
        return v0;
    }

}
