package com.google.a.a.a.a.b.a.a.f;

import com.google.a.a.a.a.b.a.b.a.ad;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;

protected final class com.google.a.a.a.a.b.a.a.f.f extends com.google.protobuf.nano.b
{

    public static volatile f[] a;
    public long b;
    public com.google.a.a.a.a.b.a.a.f.c c;
    public int d;
    public String e;
    public int f;
    public com.google.a.a.a.a.b.a.b.a.ad g;

    f() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = "";
        this.f = 0;
        this.g = 0;
        this.aP = -1;
    }

    public static f[] a() {
        if (com.google.a.a.a.a.b.a.a.f.f.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.a.a.a.a.b.a.a.f.f.a == 0)
                    com.google.a.a.a.a.b.a.a.f.f.a = new f[0];
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
        return com.google.a.a.a.a.b.a.a.f.f.a;
    }

    private final com.google.a.a.a.a.b.a.a.f.f b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 34:
  4:            goto 14;
            case 40:
  4:            goto 31;
            case 48:
  4:            goto 38;
            case 56:
  4:            goto 87;
            case 66:
  4:            goto 138;
            case 74:
  4:            goto 146;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 16:    if (this.c == 0)
 23:        this.c = new com.google.a.a.a.a.b.a.a.f.c();
 27:    p0.a(this.c);
 30:    goto 0;
 35:    this.b = p0.j();
 37:    goto 0;
 42:    try {
 42:        v2 = p0.i();
 46:        switch (v2) {
                case 0:
 84:                try {
 84:                    this.d = v2;
                    }
                    catch (IllegalArgumentException ex) {
 77:                    p0.e(p0.o());
 80:                    this.a(p0, v0);
                    }
167:                break;
                case 1:
 84:                try {
 84:                    this.d = v2;
                    }
                    catch (IllegalArgumentException ex) {
 77:                    p0.e(p0.o());
 80:                    this.a(p0, v0);
                    }
167:                break;
                case 2:
 84:                try {
 84:                    this.d = v2;
                    }
                    catch (IllegalArgumentException ex) {
 77:                    p0.e(p0.o());
 80:                    this.a(p0, v0);
                    }
167:                break;
                case 3:
 84:                try {
 84:                    this.d = v2;
                    }
                    catch (IllegalArgumentException ex) {
 77:                    p0.e(p0.o());
 80:                    this.a(p0, v0);
                    }
167:                break;
                default:
 75:                throw new IllegalArgumentException(44 + v2 + " is not a valid enum AddressState");
            }
        }
        catch (IllegalArgumentException ex) {
        }
 77:    p0.e(p0.o());
 80:    this.a(p0, v0);
 83:    goto 0;
 91:    try {
 91:        v2 = p0.i();
 95:        switch (v2) {
                case 0:
134:                try {
134:                    this.f = v2;
                    }
                    catch (IllegalArgumentException ex) {
126:                    p0.e(p0.o());
129:                    this.a(p0, v0);
                    }
167:                break;
                case 1:
134:                try {
134:                    this.f = v2;
                    }
                    catch (IllegalArgumentException ex) {
126:                    p0.e(p0.o());
129:                    this.a(p0, v0);
                    }
167:                break;
                default:
124:                throw new IllegalArgumentException(46 + v2 + " is not a valid enum AddressFixType");
            }
        }
        catch (IllegalArgumentException ex) {
        }
126:    p0.e(p0.o());
129:    this.a(p0, v0);
132:    goto 0;
142:    this.e = p0.f();
144:    goto 0;
148:    if (this.g == 0)
155:        this.g = new com.google.a.a.a.a.b.a.b.a.ad();
159:    p0.a(this.g);
162:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.c != 0)
            p0.b(4, this.c);
        if (this.b != 0)
            p0.b(5, this.b);
        if (this.d != 0)
            p0.a(6, this.d);
        if (this.f != 0)
            p0.a(7, this.f);
        if (this.e != 0 && !this.e.equals(""))
            p0.a(8, this.e);
        if (this.g != 0)
            p0.b(9, this.g);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.c);
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.f(5, this.b);
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(6, this.d);
        if (this.f != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(7, this.f);
        if (this.e != 0 && !this.e.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(8, this.e);
        if (this.g != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(9, this.g);
        return v0;
    }

}
