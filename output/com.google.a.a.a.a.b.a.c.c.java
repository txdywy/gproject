package com.google.a.a.a.a.b.a.c;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

protected final class com.google.a.a.a.a.b.a.c.c extends com.google.protobuf.nano.b
{

    public int a;
    public byte[] b;

    c() {
        com.google.protobuf.nano.b();
        this.a = -1;
        this.a = -1;
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
 18:    this.b = p0.g();
 21:    this.a = 0;
 23:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a == 0)
            p0.a(2, this.b);
        super.a(p0);
    }

    public final byte[] a() {
        if (this.a == 0)
            v0 = this.b;
        else
            v0 = com.google.protobuf.nano.l.l;
        return v0;
    }

    protected final int b() {
        v0 = super.b();
        if (this.a == 0)
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.b);
        return v0;
    }

}
