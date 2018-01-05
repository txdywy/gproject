package com.google.a.a.a.a.b.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

protected final class com.google.a.a.a.a.b.b.a.k extends com.google.protobuf.nano.b
{

    public com.google.a.a.a.a.b.b.a.c a;
    public com.google.a.a.a.a.b.b.a.b b;
    public int c;

    k() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.aP = -1;
    }

    private final com.google.a.a.a.a.b.b.a.k b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 10:
  4:            goto 14;
            case 18:
  4:            goto 31;
            case 24:
  4:            goto 48;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 16:    if (this.a == 0)
 23:        this.a = new com.google.a.a.a.a.b.b.a.c();
 27:    p0.a(this.a);
 30:    goto 0;
 33:    if (this.b == 0)
 40:        this.b = new com.google.a.a.a.a.b.b.a.b();
 44:    p0.a(this.b);
 47:    goto 0;
 52:    try {
 52:        v2 = p0.i();
 56:        switch (v2) {
                case 0:
 94:                try {
 94:                    this.c = v2;
                    }
                    catch (IllegalArgumentException ex) {
 87:                    p0.e(p0.o());
 90:                    this.a(p0, v0);
                    }
 99:                break;
                case 1:
 94:                try {
 94:                    this.c = v2;
                    }
                    catch (IllegalArgumentException ex) {
 87:                    p0.e(p0.o());
 90:                    this.a(p0, v0);
                    }
 99:                break;
                case 2:
 94:                try {
 94:                    this.c = v2;
                    }
                    catch (IllegalArgumentException ex) {
 87:                    p0.e(p0.o());
 90:                    this.a(p0, v0);
                    }
 99:                break;
                case 3:
 94:                try {
 94:                    this.c = v2;
                    }
                    catch (IllegalArgumentException ex) {
 87:                    p0.e(p0.o());
 90:                    this.a(p0, v0);
                    }
 99:                break;
                default:
 85:                throw new IllegalArgumentException(40 + v2 + " is not a valid enum FlowType");
            }
        }
        catch (IllegalArgumentException ex) {
        }
 87:    p0.e(p0.o());
 90:    this.a(p0, v0);
 93:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a != 0)
            p0.b(1, this.a);
        if (this.b != 0)
            p0.b(2, this.b);
        if (this.c != 0)
            p0.a(3, this.c);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.a);
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.b);
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.c);
        return v0;
    }

}
