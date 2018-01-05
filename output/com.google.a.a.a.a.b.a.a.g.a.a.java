package com.google.a.a.a.a.b.a.a.g.a;

import com.google.a.a.a.a.b.a.b.a.ad;
import com.google.a.a.a.a.b.a.b.a.ae;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

protected final class com.google.a.a.a.a.b.a.a.g.a.a extends com.google.protobuf.nano.b
{

    public long a;
    public int b;
    public String c;
    public com.google.a.a.a.a.b.a.b.a.ae d;
    public com.google.a.a.a.a.b.a.b.a.ad e;

    a() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = "";
        this.d = 0;
        this.e = 0;
        this.aP = -1;
    }

    private final com.google.a.a.a.a.b.a.a.g.a.a b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 8:
  4:            goto 14;
            case 16:
  4:            goto 21;
            case 26:
  4:            goto 70;
            case 34:
  4:            goto 77;
            case 42:
  4:            goto 94;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.a = p0.j();
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
113:                break;
                case 1:
 67:                try {
 67:                    this.b = v2;
                    }
                    catch (IllegalArgumentException ex) {
 60:                    p0.e(p0.o());
 63:                    this.a(p0, v0);
                    }
113:                break;
                case 2:
 67:                try {
 67:                    this.b = v2;
                    }
                    catch (IllegalArgumentException ex) {
 60:                    p0.e(p0.o());
 63:                    this.a(p0, v0);
                    }
113:                break;
                default:
 58:                throw new IllegalArgumentException(43 + v2 + " is not a valid enum DisplayType");
            }
        }
        catch (IllegalArgumentException ex) {
        }
 60:    p0.e(p0.o());
 63:    this.a(p0, v0);
 66:    goto 0;
 74:    this.c = p0.f();
 76:    goto 0;
 79:    if (this.d == 0)
 86:        this.d = new com.google.a.a.a.a.b.a.b.a.ae();
 90:    p0.a(this.d);
 93:    goto 0;
 96:    if (this.e == 0)
103:        this.e = new com.google.a.a.a.a.b.a.b.a.ad();
107:    p0.a(this.e);
110:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a != 0)
            p0.b(1, this.a);
        if (this.b != 0)
            p0.a(2, this.b);
        if (this.c != 0 && !this.c.equals(""))
            p0.a(3, this.c);
        if (this.d != 0)
            p0.b(4, this.d);
        if (this.e != 0)
            p0.b(5, this.e);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.f(1, this.a);
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.b);
        if (this.c != 0 && !this.c.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.c);
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.d);
        if (this.e != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.e);
        return v0;
    }

}
