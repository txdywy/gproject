package com.google.a.a.a.a.b.a.b.a;

import com.google.h.c.c.b.c.a.b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

protected final class com.google.a.a.a.a.b.a.b.a.s extends com.google.protobuf.nano.b
{

    public com.google.h.c.c.b.c.a.b a;

    s() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.aP = -1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 18:
  4:            goto 14;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 16:    if (this.a == 0)
 23:        this.a = new com.google.h.c.c.b.c.a.b();
 27:    p0.a(this.a);
 30:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a != 0)
            p0.b(2, this.a);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.a);
        return v0;
    }

}
