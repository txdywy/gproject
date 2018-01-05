package com.google.a.a.a.a.b.a.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;

public final class com.google.a.a.a.a.b.a.b.a.t extends com.google.protobuf.nano.b
{

    public static volatile t[] b;
    public int a;
    public long c;
    public int d;
    public com.google.a.a.a.a.b.a.b.a.w e;
    public com.google.a.a.a.a.b.a.b.a.x f;
    public com.google.a.a.a.a.b.a.b.a.v g;
    public boolean h;

    t() {
        com.google.protobuf.nano.b();
        this.a = -1;
        this.c = 0;
        this.d = 0;
        this.a = -1;
        this.e = 0;
        this.a = -1;
        this.f = 0;
        this.a = -1;
        this.g = 0;
        this.h = 0;
        this.aP = -1;
    }

    public static t[] a() {
        if (com.google.a.a.a.a.b.a.b.a.t.b == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.a.a.a.a.b.a.b.a.t.b == 0)
                    com.google.a.a.a.a.b.a.b.a.t.b = new t[0];
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
        return com.google.a.a.a.a.b.a.b.a.t.b;
    }

    private final com.google.a.a.a.a.b.a.b.a.t b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 8:
  4:            goto 14;
            case 18:
  4:            goto 21;
            case 24:
  4:            goto 41;
            case 32:
  4:            goto 90;
            case 42:
  4:            goto 97;
            case 50:
  4:            goto 117;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.c = p0.j();
 20:    goto 0;
 23:    if (this.e == 0)
 30:        this.e = new com.google.a.a.a.a.b.a.b.a.w();
 34:    p0.a(this.e);
 38:    this.a = 0;
 40:    goto 0;
 45:    try {
 45:        v2 = p0.i();
 49:        switch (v2) {
                case 0:
 87:                try {
 87:                    this.d = v2;
                    }
                    catch (IllegalArgumentException ex) {
 80:                    p0.e(p0.o());
 83:                    this.a(p0, v0);
                    }
139:                break;
                case 1:
 87:                try {
 87:                    this.d = v2;
                    }
                    catch (IllegalArgumentException ex) {
 80:                    p0.e(p0.o());
 83:                    this.a(p0, v0);
                    }
139:                break;
                case 2:
 87:                try {
 87:                    this.d = v2;
                    }
                    catch (IllegalArgumentException ex) {
 80:                    p0.e(p0.o());
 83:                    this.a(p0, v0);
                    }
139:                break;
                case 3:
 87:                try {
 87:                    this.d = v2;
                    }
                    catch (IllegalArgumentException ex) {
 80:                    p0.e(p0.o());
 83:                    this.a(p0, v0);
                    }
139:                break;
                case 4:
 87:                try {
 87:                    this.d = v2;
                    }
                    catch (IllegalArgumentException ex) {
 80:                    p0.e(p0.o());
 83:                    this.a(p0, v0);
                    }
139:                break;
                case 5:
 87:                try {
 87:                    this.d = v2;
                    }
                    catch (IllegalArgumentException ex) {
 80:                    p0.e(p0.o());
 83:                    this.a(p0, v0);
                    }
139:                break;
                case 6:
 87:                try {
 87:                    this.d = v2;
                    }
                    catch (IllegalArgumentException ex) {
 80:                    p0.e(p0.o());
 83:                    this.a(p0, v0);
                    }
139:                break;
                case 7:
 78:                throw new IllegalArgumentException(43 + v2 + " is not a valid enum TriggerType");
                case 8:
 87:                try {
 87:                    this.d = v2;
                    }
                    catch (IllegalArgumentException ex) {
 80:                    p0.e(p0.o());
 83:                    this.a(p0, v0);
                    }
139:                break;
                case 9:
 87:                try {
 87:                    this.d = v2;
                    }
                    catch (IllegalArgumentException ex) {
 80:                    p0.e(p0.o());
 83:                    this.a(p0, v0);
                    }
139:                break;
                case 10:
 87:                try {
 87:                    this.d = v2;
                    }
                    catch (IllegalArgumentException ex) {
 80:                    p0.e(p0.o());
 83:                    this.a(p0, v0);
                    }
139:                break;
                default:
 78:                throw new IllegalArgumentException(43 + v2 + " is not a valid enum TriggerType");
            }
        }
        catch (IllegalArgumentException ex) {
        }
 80:    p0.e(p0.o());
 83:    this.a(p0, v0);
 86:    goto 0;
 94:    this.h = p0.e();
 96:    goto 0;
 99:    if (this.f == 0)
106:        this.f = new com.google.a.a.a.a.b.a.b.a.x();
110:    p0.a(this.f);
114:    this.a = 1;
116:    goto 0;
119:    if (this.g == 0)
126:        this.g = new com.google.a.a.a.a.b.a.b.a.v();
130:    p0.a(this.g);
134:    this.a = 2;
136:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.c != 0)
            p0.b(1, this.c);
        if (this.a == 0)
            p0.b(2, this.e);
        if (this.d != 0)
            p0.a(3, this.d);
        if (this.h != 0)
            p0.a(4, this.h);
        if (this.a == 1)
            p0.b(5, this.f);
        if (this.a == 2)
            p0.b(6, this.g);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.f(1, this.c);
        if (this.a == 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.e);
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.d);
        if (this.h != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(4) + 1;
        if (this.a == 1)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.f);
        if (this.a == 2)
            v0 = v0 + CodedOutputByteBufferNano.d(6, this.g);
        return v0;
    }

    public final com.google.a.a.a.a.b.a.b.a.w c() {
        if (this.a == 0)
            v0 = this.e;
        else
            v0 = 0;
        return v0;
    }

}
