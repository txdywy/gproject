package com.google.a.a.a.a.b.a.a.h.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;

public final class com.google.a.a.a.a.b.a.a.h.a.a extends com.google.protobuf.nano.b
{

    public static volatile a[] b;
    public int a;
    public String c;
    public String d;
    public String e;

    a() {
        com.google.protobuf.nano.b();
        this.a = -1;
        this.c = "";
        this.a = -1;
        this.a = -1;
        this.aP = -1;
    }

    public static a[] a() {
        if (com.google.a.a.a.a.b.a.a.h.a.a.b == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.a.a.a.a.b.a.a.h.a.a.b == 0)
                    com.google.a.a.a.a.b.a.a.h.a.a.b = new a[0];
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
        return com.google.a.a.a.a.b.a.a.h.a.a.b;
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
  4:            goto 31;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.c = p0.f();
 20:    goto 0;
 25:    this.d = p0.f();
 28:    this.a = 0;
 30:    goto 0;
 35:    this.e = p0.f();
 38:    this.a = 1;
 40:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.c != 0 && !this.c.equals(""))
            p0.a(1, this.c);
        if (this.a == 0)
            p0.a(2, this.d);
        if (this.a == 1)
            p0.a(3, this.e);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.c != 0 && !this.c.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.c);
        if (this.a == 0)
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.d);
        if (this.a == 1)
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.e);
        return v0;
    }

    public final String c() {
        if (this.a == 1)
            v0 = this.e;
        else
            v0 = "";
        return v0;
    }

}
