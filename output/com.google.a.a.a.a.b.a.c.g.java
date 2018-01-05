package com.google.a.a.a.a.b.a.c;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;

protected final class com.google.a.a.a.a.b.a.c.g extends com.google.protobuf.nano.b
{

    public static volatile g[] a;
    public com.google.a.a.a.a.b.a.c.b b;
    public String c;

    g() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = "";
        this.aP = -1;
    }

    public static g[] a() {
        if (com.google.a.a.a.a.b.a.c.g.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.a.a.a.a.b.a.c.g.a == 0)
                    com.google.a.a.a.a.b.a.c.g.a = new g[0];
                exit com.google.protobuf.nano.h.b;
            }
            catch (Throwable ex) {
                try {
                    exit com.google.protobuf.nano.h.b;
                }
                catch (Throwable ex) {
                    exit com.google.protobuf.nano.h.b;
                    throw ex;
                }
                throw ex;
            }
        }
        return com.google.a.a.a.a.b.a.c.g.a;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 26:
  4:            goto 14;
            case 42:
  4:            goto 21;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.c = p0.f();
 20:    goto 0;
 23:    if (this.b == 0)
 30:        this.b = new com.google.a.a.a.a.b.a.c.b();
 34:    p0.a(this.b);
 37:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.c != 0 && !this.c.equals(""))
            p0.a(3, this.c);
        if (this.b != 0)
            p0.b(5, this.b);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.c != 0 && !this.c.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.c);
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.b);
        return v0;
    }

}
