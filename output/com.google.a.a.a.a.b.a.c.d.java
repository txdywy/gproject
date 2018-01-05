package com.google.a.a.a.a.b.a.c;

import com.google.a.a.a.a.a.b.c;
import com.google.h.a.a.a.a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;
import java.util.Arrays;

protected final class com.google.a.a.a.a.b.a.c.d extends com.google.protobuf.nano.b
{

    public int a;
    public byte[] b;
    public com.google.a.a.a.a.a.b.c c;
    public String d;
    public int e;
    public long f;
    public String g;
    public com.google.h.a.a.a.a h;
    public boolean i;

    d() {
        com.google.protobuf.nano.b();
        this.a = -1;
        this.b = com.google.protobuf.nano.l.l;
        this.a = -1;
        this.c = 0;
        this.d = "";
        this.e = 0;
        this.f = 0;
        this.g = "";
        this.h = 0;
        this.i = 0;
        this.aP = -1;
    }

    private final com.google.a.a.a.a.b.a.c.d b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 18:
  4:            goto 14;
            case 58:
  4:            goto 21;
            case 64:
  4:            goto 28;
            case 72:
  4:            goto 77;
            case 82:
  4:            goto 84;
            case 90:
  4:            goto 104;
            case 98:
  4:            goto 111;
            case 104:
  4:            goto 128;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.b = p0.g();
 20:    goto 0;
 25:    this.d = p0.f();
 27:    goto 0;
 32:    try {
 32:        v2 = p0.i();
 36:        switch (v2) {
                case 0:
 74:                try {
 74:                    this.e = v2;
                    }
                    catch (IllegalArgumentException ex) {
 67:                    p0.e(p0.o());
 70:                    this.a(p0, v0);
                    }
137:                break;
                case 1:
 74:                try {
 74:                    this.e = v2;
                    }
                    catch (IllegalArgumentException ex) {
 67:                    p0.e(p0.o());
 70:                    this.a(p0, v0);
                    }
137:                break;
                case 2:
 74:                try {
 74:                    this.e = v2;
                    }
                    catch (IllegalArgumentException ex) {
 67:                    p0.e(p0.o());
 70:                    this.a(p0, v0);
                    }
137:                break;
                case 3:
 74:                try {
 74:                    this.e = v2;
                    }
                    catch (IllegalArgumentException ex) {
 67:                    p0.e(p0.o());
 70:                    this.a(p0, v0);
                    }
137:                break;
                default:
 65:                throw new IllegalArgumentException(42 + v2 + " is not a valid enum ClientType");
            }
        }
        catch (IllegalArgumentException ex) {
        }
 67:    p0.e(p0.o());
 70:    this.a(p0, v0);
 73:    goto 0;
 81:    this.f = p0.j();
 83:    goto 0;
 86:    if (this.c == 0)
 93:        this.c = new com.google.a.a.a.a.a.b.c();
 97:    p0.a(this.c);
101:    this.a = 0;
103:    goto 0;
108:    this.g = p0.f();
110:    goto 0;
113:    if (this.h == 0)
120:        this.h = new com.google.h.a.a.a.a();
124:    p0.a(this.h);
127:    goto 0;
132:    this.i = p0.e();
134:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (!Arrays.equals(this.b, com.google.protobuf.nano.l.l))
            p0.a(2, this.b);
        if (this.d != 0 && !this.d.equals(""))
            p0.a(7, this.d);
        if (this.e != 0)
            p0.a(8, this.e);
        if (this.f != 0)
            p0.b(9, this.f);
        if (this.a == 0)
            p0.b(10, this.c);
        if (this.g != 0 && !this.g.equals(""))
            p0.a(11, this.g);
        if (this.h != 0)
            p0.b(12, this.h);
        if (this.i != 0)
            p0.a(13, this.i);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (!Arrays.equals(this.b, com.google.protobuf.nano.l.l))
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.b);
        if (this.d != 0 && !this.d.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(7, this.d);
        if (this.e != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(8, this.e);
        if (this.f != 0)
            v0 = v0 + CodedOutputByteBufferNano.f(9, this.f);
        if (this.a == 0)
            v0 = v0 + CodedOutputByteBufferNano.d(10, this.c);
        if (this.g != 0 && !this.g.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(11, this.g);
        if (this.h != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(12, this.h);
        if (this.i != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(13) + 1;
        return v0;
    }

}
