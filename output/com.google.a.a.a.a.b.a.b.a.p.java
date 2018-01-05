package com.google.a.a.a.a.b.a.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;
import java.util.Arrays;

protected final class com.google.a.a.a.a.b.a.b.a.p extends com.google.protobuf.nano.b
{

    public byte[] a;

    p() {
        com.google.protobuf.nano.b();
        this.a = com.google.protobuf.nano.l.l;
        this.aP = -1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 10:
  4:            goto 14;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.a = p0.g();
 20:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (!Arrays.equals(this.a, com.google.protobuf.nano.l.l))
            p0.a(1, this.a);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (!Arrays.equals(this.a, com.google.protobuf.nano.l.l))
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.a);
        return v0;
    }

}
