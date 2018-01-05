package com.google.a.a.a.a.b.a.a.f;

import com.google.a.a.a.a.b.a.b.a.ad;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;

protected final class com.google.a.a.a.a.b.a.a.f.g extends com.google.protobuf.nano.b
{

    public static volatile g[] a;
    public long b;
    public boolean c;
    public com.google.a.a.a.a.b.a.b.a.ad d;
    public String e;
    public String f;
    public String g;
    public int h;
    public int i;

    g() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = 0;
        this.i = 0;
        this.aP = -1;
    }

    public static g[] a() {
        if (com.google.a.a.a.a.b.a.a.f.g.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.a.a.a.a.b.a.a.f.g.a == 0)
                    com.google.a.a.a.a.b.a.a.f.g.a = new g[0];
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
        return com.google.a.a.a.a.b.a.a.f.g.a;
    }

    private final com.google.a.a.a.a.b.a.a.f.g b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 8:
  4:            goto 14;
            case 16:
  4:            goto 21;
            case 26:
  4:            goto 28;
            case 34:
  4:            goto 35;
            case 42:
  4:            goto 42;
            case 48:
  4:            goto 49;
            case 56:
  4:            goto 56;
            case 82:
  4:            goto 105;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.b = p0.j();
 20:    goto 0;
 25:    this.c = p0.e();
 27:    goto 0;
 32:    this.e = p0.f();
 34:    goto 0;
 39:    this.f = p0.f();
 41:    goto 0;
 46:    this.g = p0.f();
 48:    goto 0;
 53:    this.h = p0.i();
 55:    goto 0;
 60:    try {
 60:        v2 = p0.i();
 64:        switch (v2) {
                case 0:
102:                try {
102:                    this.i = v2;
                    }
                    catch (IllegalArgumentException ex) {
 95:                    p0.e(p0.o());
 98:                    this.a(p0, v0);
                    }
124:                break;
                case 2:
102:                try {
102:                    this.i = v2;
                    }
                    catch (IllegalArgumentException ex) {
 95:                    p0.e(p0.o());
 98:                    this.a(p0, v0);
                    }
124:                break;
                case 4:
102:                try {
102:                    this.i = v2;
                    }
                    catch (IllegalArgumentException ex) {
 95:                    p0.e(p0.o());
 98:                    this.a(p0, v0);
                    }
124:                break;
                case 6:
102:                try {
102:                    this.i = v2;
                    }
                    catch (IllegalArgumentException ex) {
 95:                    p0.e(p0.o());
 98:                    this.a(p0, v0);
                    }
124:                break;
                case 12:
102:                try {
102:                    this.i = v2;
                    }
                    catch (IllegalArgumentException ex) {
 95:                    p0.e(p0.o());
 98:                    this.a(p0, v0);
                    }
124:                break;
                default:
 93:                throw new IllegalArgumentException(42 + v2 + " is not a valid enum ButtonType");
            }
        }
        catch (IllegalArgumentException ex) {
        }
 95:    p0.e(p0.o());
 98:    this.a(p0, v0);
101:    goto 0;
107:    if (this.d == 0)
114:        this.d = new com.google.a.a.a.a.b.a.b.a.ad();
118:    p0.a(this.d);
121:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b != 0)
            p0.b(1, this.b);
        if (this.c != 0)
            p0.a(2, this.c);
        if (this.e != 0 && !this.e.equals(""))
            p0.a(3, this.e);
        if (this.f != 0 && !this.f.equals(""))
            p0.a(4, this.f);
        if (this.g != 0 && !this.g.equals(""))
            p0.a(5, this.g);
        if (this.h != 0)
            p0.a(6, this.h);
        if (this.i != 0)
            p0.a(7, this.i);
        if (this.d != 0)
            p0.b(10, this.d);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.f(1, this.b);
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2) + 1;
        if (this.e != 0 && !this.e.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.e);
        if (this.f != 0 && !this.f.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(4, this.f);
        if (this.g != 0 && !this.g.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(5, this.g);
        if (this.h != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(6, this.h);
        if (this.i != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(7, this.i);
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(10, this.d);
        return v0;
    }

}
