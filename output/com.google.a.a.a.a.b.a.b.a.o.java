package com.google.a.a.a.a.b.a.b.a;

import com.google.h.c.c.b.d.c;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

protected final class com.google.a.a.a.a.b.a.b.a.o extends com.google.protobuf.nano.b
{

    public int a;

    o() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.aP = -1;
    }

    private final com.google.a.a.a.a.b.a.b.a.o b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 8:
  4:            goto 14;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    try {
 26:        this.a = com.google.h.c.c.b.d.c.a(p0.i());
        }
        catch (IllegalArgumentException ex) {
 30:        p0.e(p0.o());
 33:        this.a(p0, v0);
        }
 28:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a != 0)
            p0.a(1, this.a);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.a);
        return v0;
    }

}
