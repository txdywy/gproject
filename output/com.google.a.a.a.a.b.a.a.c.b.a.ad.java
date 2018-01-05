package com.google.a.a.a.a.b.a.a.c.b.a;

import com.google.a.a.a.a.b.a.a.d.a.a;
import com.google.a.a.a.a.b.a.a.f.h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;
import java.util.Arrays;

protected final class com.google.a.a.a.a.b.a.a.c.b.a.ad extends com.google.protobuf.nano.b
{

    public com.google.a.a.a.a.b.a.a.f.h a;
    public int b;
    public String c;
    public String d;
    public byte[] e;
    public String f;
    public String g;
    public int h;
    public String i;
    public com.google.a.a.a.a.b.a.a.d.a.a j;

    ad() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = "";
        this.d = "";
        this.e = com.google.protobuf.nano.l.l;
        this.f = "";
        this.g = "";
        this.h = -1;
        this.i = "";
        this.j = 0;
        this.aP = -1;
    }

    private final com.google.a.a.a.a.b.a.a.c.b.a.ad b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 10:
  4:            goto 14;
            case 18:
  4:            goto 21;
            case 26:
  4:            goto 28;
            case 34:
  4:            goto 45;
            case 40:
  4:            goto 62;
            case 50:
  4:            goto 111;
            case 58:
  4:            goto 118;
            case 64:
  4:            goto 125;
            case 74:
  4:            goto 133;
            case 82:
  4:            goto 141;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.c = p0.f();
 20:    goto 0;
 25:    this.d = p0.f();
 27:    goto 0;
 30:    if (this.j == 0)
 37:        this.j = new com.google.a.a.a.a.b.a.a.d.a.a();
 41:    p0.a(this.j);
 44:    goto 0;
 47:    if (this.a == 0)
 54:        this.a = new com.google.a.a.a.a.b.a.a.f.h();
 58:    p0.a(this.a);
 61:    goto 0;
 66:    try {
 66:        v2 = p0.i();
 70:        switch (v2) {
                case 0:
108:                try {
108:                    this.b = v2;
                    }
                    catch (IllegalArgumentException ex) {
101:                    p0.e(p0.o());
104:                    this.a(p0, v0);
                    }
150:                break;
                case 1:
108:                try {
108:                    this.b = v2;
                    }
                    catch (IllegalArgumentException ex) {
101:                    p0.e(p0.o());
104:                    this.a(p0, v0);
                    }
150:                break;
                case 2:
108:                try {
108:                    this.b = v2;
                    }
                    catch (IllegalArgumentException ex) {
101:                    p0.e(p0.o());
104:                    this.a(p0, v0);
                    }
150:                break;
                default:
 99:                throw new IllegalArgumentException(47 + v2 + " is not a valid enum AssociationType");
            }
        }
        catch (IllegalArgumentException ex) {
        }
101:    p0.e(p0.o());
104:    this.a(p0, v0);
107:    goto 0;
115:    this.e = p0.g();
117:    goto 0;
122:    this.g = p0.f();
124:    goto 0;
129:    this.h = p0.i();
131:    goto 0;
137:    this.i = p0.f();
139:    goto 0;
145:    this.f = p0.f();
147:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.c != 0 && !this.c.equals(""))
            p0.a(1, this.c);
        if (this.d != 0 && !this.d.equals(""))
            p0.a(2, this.d);
        if (this.j != 0)
            p0.b(3, this.j);
        if (this.a != 0)
            p0.b(4, this.a);
        if (this.b != 0)
            p0.a(5, this.b);
        if (!Arrays.equals(this.e, com.google.protobuf.nano.l.l))
            p0.a(6, this.e);
        if (this.g != 0 && !this.g.equals(""))
            p0.a(7, this.g);
        if (this.h != -1)
            p0.a(8, this.h);
        if (this.i != 0 && !this.i.equals(""))
            p0.a(9, this.i);
        if (this.f != 0 && !this.f.equals(""))
            p0.a(10, this.f);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.c != 0 && !this.c.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.c);
        if (this.d != 0 && !this.d.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.d);
        if (this.j != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.j);
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.a);
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.b);
        if (!Arrays.equals(this.e, com.google.protobuf.nano.l.l))
            v0 = v0 + CodedOutputByteBufferNano.b(6, this.e);
        if (this.g != 0 && !this.g.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(7, this.g);
        if (this.h != -1)
            v0 = v0 + CodedOutputByteBufferNano.d(8, this.h);
        if (this.i != 0 && !this.i.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(9, this.i);
        if (this.f != 0 && !this.f.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(10, this.f);
        return v0;
    }

}
