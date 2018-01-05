package com.google.android.finsky.cd;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

protected final class com.google.android.finsky.cd.c extends com.google.protobuf.nano.b
{

    public static volatile c[] b;
    public int a;
    public int c;
    public String d;
    public String e;
    public byte[] f;
    public long g;
    public boolean h;
    public com.google.android.finsky.cd.g i;

    c() {
        com.google.protobuf.nano.b();
        this.a = -1;
        this.c = 0;
        this.d = "";
        this.a = -1;
        this.e = "";
        this.a = -1;
        this.f = com.google.protobuf.nano.l.l;
        this.a = -1;
        this.g = 0;
        this.a = -1;
        this.h = 0;
        this.a = -1;
        this.i = 0;
        this.aO = 0;
        this.aP = -1;
    }

    public static c[] an_() {
        if (com.google.android.finsky.cd.c.b == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.android.finsky.cd.c.b == 0)
                    com.google.android.finsky.cd.c.b = new c[0];
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
        return com.google.android.finsky.cd.c.b;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 10:
  4:            goto 14;
            case 18:
  4:            goto 27;
            case 26:
  4:            goto 37;
            case 32:
  4:            goto 47;
            case 40:
  4:            goto 57;
            case 50:
  4:            goto 67;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.d = p0.f();
 24:    this.c = this.c | 1;
 26:    goto 0;
 31:    this.e = p0.f();
 34:    this.a = 0;
 36:    goto 0;
 41:    this.f = p0.g();
 44:    this.a = 1;
 46:    goto 0;
 51:    this.g = p0.j();
 54:    this.a = 2;
 56:    goto 0;
 61:    this.h = p0.e();
 64:    this.a = 3;
 66:    goto 0;
 69:    if (this.i == 0)
 76:        this.i = new com.google.android.finsky.cd.g();
 80:    p0.a(this.i);
 84:    this.a = 4;
 86:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.c & 1)
            p0.a(1, this.d);
        if (this.a == 0)
            p0.a(2, this.e);
        if (this.a == 1)
            p0.a(3, this.f);
        if (this.a == 2)
            p0.b(4, this.g);
        if (this.a == 3)
            p0.a(5, this.h);
        if (this.a == 4)
            p0.b(6, this.i);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.c & 1)
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.d);
        if (this.a == 0)
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.e);
        if (this.a == 1)
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.f);
        if (this.a == 2)
            v0 = v0 + CodedOutputByteBufferNano.f(4, this.g);
        if (this.a == 3)
            v0 = v0 + CodedOutputByteBufferNano.d(5) + 1;
        if (this.a == 4)
            v0 = v0 + CodedOutputByteBufferNano.d(6, this.i);
        return v0;
    }

}
