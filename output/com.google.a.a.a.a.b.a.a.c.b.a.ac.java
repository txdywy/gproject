package com.google.a.a.a.a.b.a.a.c.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;

protected final class com.google.a.a.a.a.b.a.a.c.b.a.ac extends com.google.protobuf.nano.b
{

    public static volatile ac[] a;
    public int b;
    public int c;
    public String d;
    public int e;
    public int f;
    public String g;
    public int h;
    public String i;

    ac() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = 0;
        this.d = "";
        this.e = 0;
        this.f = 0;
        this.g = "";
        this.h = 0;
        this.i = "";
        this.aP = -1;
    }

    public static ac[] a() {
        if (com.google.a.a.a.a.b.a.a.c.b.a.ac.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.a.a.a.a.b.a.a.c.b.a.ac.a == 0)
                    com.google.a.a.a.a.b.a.a.c.b.a.ac.a = new ac[0];
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
        return com.google.a.a.a.a.b.a.a.c.b.a.ac.a;
    }

    private final com.google.a.a.a.a.b.a.a.c.b.a.ac b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 10:
  4:            goto 14;
            case 16:
  4:            goto 21;
            case 24:
  4:            goto 28;
            case 32:
  4:            goto 35;
            case 50:
  4:            goto 42;
            case 56:
  4:            goto 49;
            case 66:
  4:            goto 98;
            case 72:
  4:            goto 105;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.d = p0.f();
 20:    goto 0;
 25:    this.e = p0.i();
 27:    goto 0;
 32:    this.f = p0.i();
 34:    goto 0;
 39:    this.h = p0.i();
 41:    goto 0;
 46:    this.g = p0.f();
 48:    goto 0;
 53:    try {
 53:        v2 = p0.i();
 57:        switch (v2) {
                case 0:
 95:                try {
 95:                    this.b = v2;
                    }
                    catch (IllegalArgumentException ex) {
 88:                    p0.e(p0.o());
 91:                    this.a(p0, v0);
                    }
159:                break;
                case 1:
 95:                try {
 95:                    this.b = v2;
                    }
                    catch (IllegalArgumentException ex) {
 88:                    p0.e(p0.o());
 91:                    this.a(p0, v0);
                    }
159:                break;
                case 2:
 95:                try {
 95:                    this.b = v2;
                    }
                    catch (IllegalArgumentException ex) {
 88:                    p0.e(p0.o());
 91:                    this.a(p0, v0);
                    }
159:                break;
                default:
 86:                throw new IllegalArgumentException(41 + v2 + " is not a valid enum InputType");
            }
        }
        catch (IllegalArgumentException ex) {
        }
 88:    p0.e(p0.o());
 91:    this.a(p0, v0);
 94:    goto 0;
102:    this.i = p0.f();
104:    goto 0;
109:    try {
109:        v2 = p0.i();
113:        switch (v2) {
                case 0:
159:                break;
                case 1:
159:                break;
                case 2:
159:                break;
                case 3:
159:                break;
                case 4:
159:                break;
                default:
142:                throw new IllegalArgumentException(42 + v2 + " is not a valid enum ExitResult");
            }
        }
        catch (IllegalArgumentException ex) {
        }
144:    p0.e(p0.o());
147:    this.a(p0, v0);
150:    goto 0;
152:    try {
152:        this.c = v2;
        }
        catch (IllegalArgumentException ex) {
144:        p0.e(p0.o());
147:        this.a(p0, v0);
        }
154:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.d != 0 && !this.d.equals(""))
            p0.a(1, this.d);
        if (this.e != 0)
            p0.a(2, this.e);
        if (this.f != 0)
            p0.a(3, this.f);
        if (this.h != 0)
            p0.a(4, this.h);
        if (this.g != 0 && !this.g.equals(""))
            p0.a(6, this.g);
        if (this.b != 0)
            p0.a(7, this.b);
        if (this.i != 0 && !this.i.equals(""))
            p0.a(8, this.i);
        if (this.c != 0)
            p0.a(9, this.c);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.d != 0 && !this.d.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.d);
        if (this.e != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.e);
        if (this.f != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.f);
        if (this.h != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.h);
        if (this.g != 0 && !this.g.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(6, this.g);
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(7, this.b);
        if (this.i != 0 && !this.i.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(8, this.i);
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(9, this.c);
        return v0;
    }

}
