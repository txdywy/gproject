package com.google.a.a.a.a.b.a.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

protected final class com.google.a.a.a.a.b.a.b.a.d extends com.google.protobuf.nano.b
{

    public int a;
    public boolean b;
    public long c;

    d() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.aP = -1;
    }

    private final com.google.a.a.a.a.b.a.b.a.d b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 8:
  4:            goto 14;
            case 16:
  4:            goto 63;
            case 24:
  4:            goto 70;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    try {
 18:        v2 = p0.i();
 22:        switch (v2) {
                case 0:
 60:                try {
 60:                    this.a = v2;
                    }
                    catch (IllegalArgumentException ex) {
 53:                    p0.e(p0.o());
 56:                    this.a(p0, v0);
                    }
 79:                break;
                case 1:
 60:                try {
 60:                    this.a = v2;
                    }
                    catch (IllegalArgumentException ex) {
 53:                    p0.e(p0.o());
 56:                    this.a(p0, v0);
                    }
 79:                break;
                case 2:
 60:                try {
 60:                    this.a = v2;
                    }
                    catch (IllegalArgumentException ex) {
 53:                    p0.e(p0.o());
 56:                    this.a(p0, v0);
                    }
 79:                break;
                case 3:
 60:                try {
 60:                    this.a = v2;
                    }
                    catch (IllegalArgumentException ex) {
 53:                    p0.e(p0.o());
 56:                    this.a(p0, v0);
                    }
 79:                break;
                case 4:
 60:                try {
 60:                    this.a = v2;
                    }
                    catch (IllegalArgumentException ex) {
 53:                    p0.e(p0.o());
 56:                    this.a(p0, v0);
                    }
 79:                break;
                default:
 51:                throw new IllegalArgumentException(41 + v2 + " is not a valid enum CardStyle");
            }
        }
        catch (IllegalArgumentException ex) {
        }
 53:    p0.e(p0.o());
 56:    this.a(p0, v0);
 59:    goto 0;
 67:    this.b = p0.e();
 69:    goto 0;
 74:    this.c = p0.j();
 76:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a != 0)
            p0.a(1, this.a);
        if (this.b != 0)
            p0.a(2, this.b);
        if (this.c != 0)
            p0.b(3, this.c);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.a);
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2) + 1;
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.f(3, this.c);
        return v0;
    }

}
