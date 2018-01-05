package com.google.a.a.a.a.b.a.b.a;

import com.google.a.a.a.a.a.b.d;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class com.google.a.a.a.a.b.a.b.a.at extends com.google.protobuf.nano.b
{

    public static volatile at[] b;
    public int a;
    public String c;
    public String d;
    public int e;
    public com.google.a.a.a.a.a.b.d f;
    public String g;
    public String h;
    public byte[] i;

    at() {
        com.google.protobuf.nano.b();
        this.a = -1;
        this.c = "";
        this.a = -1;
        this.a = -1;
        this.a = -1;
        this.f = 0;
        this.a = -1;
        this.h = "";
        this.i = com.google.protobuf.nano.l.l;
        this.aP = -1;
    }

    public static int a(int p0) {
        switch (p0) {
            case 0:
                return p0;
            case 1:
                return p0;
            case 2:
                return p0;
            case 3:
                return p0;
            default:
                break;
        }
        throw new IllegalArgumentException(45 + p0 + " is not a valid enum CheckboxState");
    }

    public static at[] a() {
        if (com.google.a.a.a.a.b.a.b.a.at.b == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.a.a.a.a.b.a.b.a.at.b == 0)
                    com.google.a.a.a.a.b.a.b.a.at.b = new at[0];
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
        return com.google.a.a.a.a.b.a.b.a.at.b;
    }

    private final com.google.a.a.a.a.b.a.b.a.at b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 10:
  4:            goto 14;
            case 18:
  4:            goto 21;
            case 26:
  4:            goto 31;
            case 40:
  4:            goto 38;
            case 50:
  4:            goto 64;
            case 58:
  4:            goto 71;
            case 66:
  4:            goto 91;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.c = p0.f();
 20:    goto 0;
 25:    this.d = p0.f();
 28:    this.a = 0;
 30:    goto 0;
 35:    this.h = p0.f();
 37:    goto 0;
 39:    this.a = 1;
 45:    try {
 53:        this.e = com.google.a.a.a.a.b.a.b.a.at.a(p0.i());
        }
        catch (IllegalArgumentException ex) {
 57:        p0.e(p0.o());
 60:        this.a(p0, v0);
        }
 55:    goto 0;
 68:    this.i = p0.g();
 70:    goto 0;
 73:    if (this.f == 0)
 80:        this.f = new com.google.a.a.a.a.a.b.d();
 84:    p0.a(this.f);
 88:    this.a = 2;
 90:    goto 0;
 95:    this.g = p0.f();
 98:    this.a = 3;
100:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.c != 0 && !this.c.equals(""))
            p0.a(1, this.c);
        if (this.a == 0)
            p0.a(2, this.d);
        if (this.h != 0 && !this.h.equals(""))
            p0.a(3, this.h);
        if (this.a == 1)
            p0.a(5, this.e);
        if (!Arrays.equals(this.i, com.google.protobuf.nano.l.l))
            p0.a(6, this.i);
        if (this.a == 2)
            p0.b(7, this.f);
        if (this.a == 3)
            p0.a(8, this.g);
        super.a(p0);
    }

    public final void a(String p0) {
        if (p0 == 0) {
            this.d = 0;
            if (this.a == 0)
                this.a = -1;
        }
        else {
            this.a = -1;
            this.d = p0;
            this.a = 0;
        }
    }

    protected final int b() {
        v0 = super.b();
        if (this.c != 0 && !this.c.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.c);
        if (this.a == 0)
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.d);
        if (this.h != 0 && !this.h.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.h);
        if (this.a == 1)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.e);
        if (!Arrays.equals(this.i, com.google.protobuf.nano.l.l))
            v0 = v0 + CodedOutputByteBufferNano.b(6, this.i);
        if (this.a == 2)
            v0 = v0 + CodedOutputByteBufferNano.d(7, this.f);
        if (this.a == 3)
            v0 = v0 + CodedOutputByteBufferNano.b(8, this.g);
        return v0;
    }

    public final void b(String p0) {
        if (p0 == 0) {
            this.g = 0;
            if (this.a == 3)
                this.a = -1;
        }
        else {
            this.a = -1;
            this.g = p0;
            this.a = 3;
        }
    }

    public final com.google.a.a.a.a.a.b.d c() {
        if (this.a == 2)
            v0 = this.f;
        else
            v0 = 0;
        return v0;
    }

    public final String d() {
        if (this.a == 3)
            v0 = this.g;
        else
            v0 = "";
        return v0;
    }

}
