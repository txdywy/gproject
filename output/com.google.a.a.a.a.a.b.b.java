package com.google.a.a.a.a.a.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;

protected final class com.google.a.a.a.a.a.b.b extends com.google.protobuf.nano.b
{

    public static volatile b[] a;
    public int b;
    public int c;

    b() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = 0;
        this.aP = -1;
    }

    public static b[] a() {
        if (com.google.a.a.a.a.a.b.b.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.a.a.a.a.a.b.b.a == 0)
                    com.google.a.a.a.a.a.b.b.a = new b[0];
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
        return com.google.a.a.a.a.a.b.b.a;
    }

    private final com.google.a.a.a.a.a.b.b b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 8:
  4:            goto 14;
            case 16:
  4:            goto 63;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    try {
 18:        v2 = p0.i();
 22:        switch (v2) {
                case 0:
 60:                try {
 60:                    this.b = v2;
                    }
                    catch (IllegalArgumentException ex) {
 53:                    p0.e(p0.o());
 56:                    this.a(p0, v0);
                    }
 72:                break;
                case 1:
 60:                try {
 60:                    this.b = v2;
                    }
                    catch (IllegalArgumentException ex) {
 53:                    p0.e(p0.o());
 56:                    this.a(p0, v0);
                    }
 72:                break;
                case 2:
 60:                try {
 60:                    this.b = v2;
                    }
                    catch (IllegalArgumentException ex) {
 53:                    p0.e(p0.o());
 56:                    this.a(p0, v0);
                    }
 72:                break;
                default:
 51:                throw new IllegalArgumentException(41 + v2 + " is not a valid enum ApiMethod");
            }
        }
        catch (IllegalArgumentException ex) {
        }
 53:    p0.e(p0.o());
 56:    this.a(p0, v0);
 59:    goto 0;
 67:    this.c = p0.i();
 69:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b != 0)
            p0.a(1, this.b);
        if (this.c != 0)
            p0.a(2, this.c);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.b);
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.c);
        return v0;
    }

}
