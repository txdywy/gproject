package com.google.a.a.a.a.a.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

protected final class com.google.a.a.a.a.a.a.a.a extends com.google.protobuf.nano.b
{

    public String a;
    public com.google.a.a.a.a.a.a.a.b b;

    a() {
        com.google.protobuf.nano.b();
        this.a = "";
        this.b = 0;
        this.aP = -1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 10:
  4:            goto 14;
            case 34:
  4:            goto 21;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.a = p0.f();
 20:    goto 0;
 23:    if (this.b == 0)
 30:        this.b = new com.google.a.a.a.a.a.a.a.b();
 34:    p0.a(this.b);
 37:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a != 0 && !this.a.equals(""))
            p0.a(1, this.a);
        if (this.b != 0)
            p0.b(4, this.b);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a != 0 && !this.a.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.a);
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.b);
        return v0;
    }

}
