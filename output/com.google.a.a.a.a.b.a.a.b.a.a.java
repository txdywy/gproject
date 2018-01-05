package com.google.a.a.a.a.b.a.a.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

protected final class com.google.a.a.a.a.b.a.a.b.a.a extends com.google.protobuf.nano.b
{

    public long a;
    public String b;
    public int c;
    public String d;

    a() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = "";
        this.c = 0;
        this.d = "";
        this.aP = -1;
    }

    private final com.google.a.a.a.a.b.a.a.b.a.a b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 16:
  4:            goto 14;
            case 26:
  4:            goto 63;
            case 34:
  4:            goto 70;
            case 40:
  4:            goto 77;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    try {
 18:        v2 = p0.i();
 22:        switch (v2) {
                case 0:
 60:                try {
 60:                    this.c = v2;
                    }
                    catch (IllegalArgumentException ex) {
 53:                    p0.e(p0.o());
 56:                    this.a(p0, v0);
                    }
 86:                break;
                case 1:
 60:                try {
 60:                    this.c = v2;
                    }
                    catch (IllegalArgumentException ex) {
 53:                    p0.e(p0.o());
 56:                    this.a(p0, v0);
                    }
 86:                break;
                case 2:
 60:                try {
 60:                    this.c = v2;
                    }
                    catch (IllegalArgumentException ex) {
 53:                    p0.e(p0.o());
 56:                    this.a(p0, v0);
                    }
 86:                break;
                default:
 51:                throw new IllegalArgumentException(43 + v2 + " is not a valid enum DisplayType");
            }
        }
        catch (IllegalArgumentException ex) {
        }
 53:    p0.e(p0.o());
 56:    this.a(p0, v0);
 59:    goto 0;
 67:    this.b = p0.f();
 69:    goto 0;
 74:    this.d = p0.f();
 76:    goto 0;
 81:    this.a = p0.j();
 83:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.c != 0)
            p0.a(2, this.c);
        if (this.b != 0 && !this.b.equals(""))
            p0.a(3, this.b);
        if (this.d != 0 && !this.d.equals(""))
            p0.a(4, this.d);
        if (this.a != 0)
            p0.b(5, this.a);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.c);
        if (this.b != 0 && !this.b.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.b);
        if (this.d != 0 && !this.d.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(4, this.d);
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.f(5, this.a);
        return v0;
    }

}
