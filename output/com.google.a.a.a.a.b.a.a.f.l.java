package com.google.a.a.a.a.b.a.a.f;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;
import java.util.Arrays;

protected final class com.google.a.a.a.a.b.a.a.f.l extends com.google.protobuf.nano.b
{

    public String a;
    public long b;
    public byte[] c;
    public String d;
    public String e;

    l() {
        com.google.protobuf.nano.b();
        this.a = "";
        this.b = 0;
        this.c = com.google.protobuf.nano.l.l;
        this.d = "";
        this.e = "";
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
  4:            goto 21;
            case 26:
  4:            goto 28;
            case 34:
  4:            goto 35;
            case 40:
  4:            goto 42;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.a = p0.f();
 20:    goto 0;
 25:    this.c = p0.g();
 27:    goto 0;
 32:    this.d = p0.f();
 34:    goto 0;
 39:    this.e = p0.f();
 41:    goto 0;
 46:    this.b = p0.j();
 48:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a != 0 && !this.a.equals(""))
            p0.a(1, this.a);
        if (!Arrays.equals(this.c, com.google.protobuf.nano.l.l))
            p0.a(2, this.c);
        if (this.d != 0 && !this.d.equals(""))
            p0.a(3, this.d);
        if (this.e != 0 && !this.e.equals(""))
            p0.a(4, this.e);
        if (this.b != 0)
            p0.b(5, this.b);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a != 0 && !this.a.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.a);
        if (!Arrays.equals(this.c, com.google.protobuf.nano.l.l))
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.c);
        if (this.d != 0 && !this.d.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.d);
        if (this.e != 0 && !this.e.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(4, this.e);
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.f(5, this.b);
        return v0;
    }

}
