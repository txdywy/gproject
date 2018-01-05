package com.google.a.a.a.a.b.a.a.i.a;

import com.google.a.a.a.a.b.a.a.f.h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

protected final class com.google.a.a.a.a.b.a.a.i.a.a extends com.google.protobuf.nano.b
{

    public com.google.a.a.a.a.b.a.a.f.h a;
    public String b;
    public boolean c;
    public int d;

    a() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = "";
        this.c = 0;
        this.d = 0;
        this.aP = -1;
    }

    private final com.google.a.a.a.a.b.a.a.i.a.a b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 10:
  4:            goto 14;
            case 18:
  4:            goto 31;
            case 24:
  4:            goto 38;
            case 32:
  4:            goto 45;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 16:    if (this.a == 0)
 23:        this.a = new com.google.a.a.a.a.b.a.a.f.h();
 27:    p0.a(this.a);
 30:    goto 0;
 35:    this.b = p0.f();
 37:    goto 0;
 42:    this.c = p0.e();
 44:    goto 0;
 49:    try {
 57:        this.d = com.google.a.a.a.a.b.a.a.i.a.d.a(p0.i());
        }
        catch (IllegalArgumentException ex) {
 61:        p0.e(p0.o());
 64:        this.a(p0, v0);
        }
 59:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a != 0)
            p0.b(1, this.a);
        if (this.b != 0 && !this.b.equals(""))
            p0.a(2, this.b);
        if (this.c != 0)
            p0.a(3, this.c);
        if (this.d != 0)
            p0.a(4, this.d);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.a);
        if (this.b != 0 && !this.b.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.b);
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3) + 1;
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.d);
        return v0;
    }

}
