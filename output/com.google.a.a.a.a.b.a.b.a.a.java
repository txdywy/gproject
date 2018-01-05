package com.google.a.a.a.a.b.a.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

protected final class com.google.a.a.a.a.b.a.b.a.a extends com.google.protobuf.nano.b
{

    public String a;
    public int b;

    a() {
        com.google.protobuf.nano.b();
        this.a = "";
        this.b = 0;
        this.aP = -1;
    }

    private final com.google.a.a.a.a.b.a.b.a.a b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 10:
  4:            goto 14;
            case 16:
  4:            goto 21;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.a = p0.f();
 20:    goto 0;
 25:    try {
 25:        v2 = p0.i();
 29:        switch (v2) {
                case 0:
 67:                try {
 67:                    this.b = v2;
                    }
                    catch (IllegalArgumentException ex) {
 60:                    p0.e(p0.o());
 63:                    this.a(p0, v0);
                    }
 72:                break;
                case 1:
 67:                try {
 67:                    this.b = v2;
                    }
                    catch (IllegalArgumentException ex) {
 60:                    p0.e(p0.o());
 63:                    this.a(p0, v0);
                    }
 72:                break;
                case 2:
 67:                try {
 67:                    this.b = v2;
                    }
                    catch (IllegalArgumentException ex) {
 60:                    p0.e(p0.o());
 63:                    this.a(p0, v0);
                    }
 72:                break;
                default:
 58:                throw new IllegalArgumentException(46 + v2 + " is not a valid enum RepetitionType");
            }
        }
        catch (IllegalArgumentException ex) {
        }
 60:    p0.e(p0.o());
 63:    this.a(p0, v0);
 66:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a != 0 && !this.a.equals(""))
            p0.a(1, this.a);
        if (this.b != 0)
            p0.a(2, this.b);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a != 0 && !this.a.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.a);
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.b);
        return v0;
    }

}
