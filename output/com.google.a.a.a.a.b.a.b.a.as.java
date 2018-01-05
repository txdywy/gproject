package com.google.a.a.a.a.b.a.b.a;

import com.google.h.c.c.b.c.a.a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;

public final class com.google.a.a.a.a.b.a.b.a.as extends com.google.protobuf.nano.b
{

    public static volatile as[] b;
    public int a;
    public String c;
    public int d;
    public double e;
    public double f;
    public String g;
    public com.google.h.c.c.b.c.a.a h;

    as() {
        com.google.protobuf.nano.b();
        this.a = -1;
        this.a = -1;
        this.a = -1;
        this.a = -1;
        this.a = -1;
        this.g = "";
        this.h = 0;
        this.aP = -1;
    }

    public static as[] a() {
        if (com.google.a.a.a.a.b.a.b.a.as.b == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.a.a.a.a.b.a.b.a.as.b == 0)
                    com.google.a.a.a.a.b.a.b.a.as.b = new as[0];
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
        return com.google.a.a.a.a.b.a.b.a.as.b;
    }

    private final com.google.a.a.a.a.b.a.b.a.as b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 10:
  4:            goto 14;
            case 18:
  4:            goto 24;
            case 24:
  4:            goto 31;
            case 33:
  4:            goto 83;
            case 41:
  4:            goto 97;
            case 50:
  4:            goto 111;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.c = p0.f();
 21:    this.a = 0;
 23:    goto 0;
 28:    this.g = p0.f();
 30:    goto 0;
 32:    this.a = 1;
 38:    try {
 38:        v2 = p0.i();
 42:        switch (v2) {
                case 0:
130:                break;
                case 1:
130:                break;
                case 2:
130:                break;
                case 3:
130:                break;
                case 4:
130:                break;
                case 5:
130:                break;
                case 6:
130:                break;
                case 7:
130:                break;
                case 8:
130:                break;
                case 9:
130:                break;
                case 10:
130:                break;
                case 11:
130:                break;
                case 12:
130:                break;
                case 13:
130:                break;
                case 14:
130:                break;
                case 15:
130:                break;
                case 16:
130:                break;
                case 17:
130:                break;
                case 18:
130:                break;
                case 19:
130:                break;
                case 20:
130:                break;
                case 21:
130:                break;
                default:
 71:                throw new IllegalArgumentException(44 + v2 + " is not a valid enum ChecksumType");
            }
        }
        catch (IllegalArgumentException ex) {
        }
 73:    p0.e(p0.o());
 76:    this.a(p0, v0);
 79:    goto 0;
 80:    try {
 80:        this.d = v2;
        }
        catch (IllegalArgumentException ex) {
 73:        p0.e(p0.o());
 76:        this.a(p0, v0);
        }
 82:    goto 0;
 91:    this.e = Double.longBitsToDouble(p0.l());
 94:    this.a = 2;
 96:    goto 0;
105:    this.f = Double.longBitsToDouble(p0.l());
108:    this.a = 3;
110:    goto 0;
113:    if (this.h == 0)
120:        this.h = new com.google.h.c.c.b.c.a.a();
124:    p0.a(this.h);
127:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a == 0)
            p0.a(1, this.c);
        if (this.g != 0 && !this.g.equals(""))
            p0.a(2, this.g);
        if (this.a == 1)
            p0.a(3, this.d);
        if (this.a == 2)
            p0.a(4, this.e);
        if (this.a == 3)
            p0.a(5, this.f);
        if (this.h != 0)
            p0.b(6, this.h);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a == 0)
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.c);
        if (this.g != 0 && !this.g.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.g);
        if (this.a == 1)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.d);
        if (this.a == 2)
            v0 = v0 + CodedOutputByteBufferNano.d(4) + 8;
        if (this.a == 3)
            v0 = v0 + CodedOutputByteBufferNano.d(5) + 8;
        if (this.h != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(6, this.h);
        return v0;
    }

    public final String c() {
        if (this.a == 0)
            v0 = this.c;
        else
            v0 = "";
        return v0;
    }

    public final int d() {
        if (this.a == 1)
            v0 = this.d;
        else
            v0 = 0;
        return v0;
    }

    public final double e() {
        if (this.a == 2)
            v0 = this.e;
        else
            v0 = 9218868437227405311;
        return v0;
    }

    public final double f() {
        if (this.a == 3)
            v0 = this.f;
        else
            v0 = -4503599627370497;
        return v0;
    }

}
