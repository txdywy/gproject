package com.google.a.a.a.a.b.b.a;

import com.google.h.c.c.b.d.b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

protected final class com.google.a.a.a.a.b.b.a.l extends com.google.protobuf.nano.b
{

    public int a;
    public com.google.h.c.c.b.d.b b;

    l() {
        com.google.protobuf.nano.b();
        this.a = -1;
        this.a = -1;
        this.b = 0;
        this.aP = -1;
    }

    public final com.google.h.c.c.b.d.b a() {
        if (this.a == 0)
            v0 = this.b;
        else
            v0 = 0;
        return v0;
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
 16:    if (this.b == 0)
 23:        this.b = new com.google.h.c.c.b.d.b();
 27:    p0.a(this.b);
 31:    this.a = 0;
 33:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a == 0)
            p0.b(2, this.b);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a == 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.b);
        return v0;
    }

}
