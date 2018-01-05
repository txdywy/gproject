package com.google.a.a.a.a.b.a.a.f;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;

protected final class com.google.a.a.a.a.b.a.a.f.b extends com.google.protobuf.nano.b
{

    public static volatile b[] a;
    public int b;
    public String c;

    b() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = "";
        this.aP = -1;
    }

    public static b[] a() {
        if (com.google.a.a.a.a.b.a.a.f.b.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.a.a.a.a.b.a.a.f.b.a == 0)
                    com.google.a.a.a.a.b.a.a.f.b.a = new b[0];
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
        return com.google.a.a.a.a.b.a.a.f.b.a;
    }

    private final com.google.a.a.a.a.b.a.a.f.b b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 8:
  4:            goto 14;
            case 18:
  4:            goto 37;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    try {
 26:        this.b = com.google.a.a.a.a.b.a.a.f.a.a(p0.i());
        }
        catch (IllegalArgumentException ex) {
 30:        p0.e(p0.o());
 33:        this.a(p0, v0);
        }
 28:    goto 0;
 41:    this.c = p0.f();
 43:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b != 0)
            p0.a(1, this.b);
        if (this.c != 0 && !this.c.equals(""))
            p0.a(2, this.c);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.b);
        if (this.c != 0 && !this.c.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.c);
        return v0;
    }

}
