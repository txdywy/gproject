package com.google.a.a.a.a.b.a.b.a;

import com.google.a.a.a.a.a.b.d;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

protected final class com.google.a.a.a.a.b.a.b.a.an extends com.google.protobuf.nano.b
{

    public int a;
    public com.google.a.a.a.a.a.b.d b;
    public com.google.a.a.a.a.a.b.d c;
    public com.google.a.a.a.a.a.b.d d;
    public boolean e;
    public long f;
    public int g;
    public String h;
    public String i;

    an() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = "";
        this.i = "";
        this.aP = -1;
    }

    private final com.google.a.a.a.a.b.a.b.a.an b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 8:
  4:            goto 14;
            case 18:
  4:            goto 63;
            case 26:
  4:            goto 80;
            case 34:
  4:            goto 97;
            case 40:
  4:            goto 114;
            case 50:
  4:            goto 121;
            case 74:
  4:            goto 128;
            case 80:
  4:            goto 136;
            case 88:
  4:            goto 144;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    try {
 18:        v2 = p0.i();
 22:        switch (v2) {
                case 0:
 60:                try {
 60:                    this.a = v2;
                    }
                    catch (IllegalArgumentException ex) {
 53:                    p0.e(p0.o());
 56:                    this.a(p0, v0);
                    }
198:                break;
                case 1:
 60:                try {
 60:                    this.a = v2;
                    }
                    catch (IllegalArgumentException ex) {
 53:                    p0.e(p0.o());
 56:                    this.a(p0, v0);
                    }
198:                break;
                case 2:
 60:                try {
 60:                    this.a = v2;
                    }
                    catch (IllegalArgumentException ex) {
 53:                    p0.e(p0.o());
 56:                    this.a(p0, v0);
                    }
198:                break;
                default:
 51:                throw new IllegalArgumentException(36 + v2 + " is not a valid enum Type");
            }
        }
        catch (IllegalArgumentException ex) {
        }
 53:    p0.e(p0.o());
 56:    this.a(p0, v0);
 59:    goto 0;
 65:    if (this.b == 0)
 72:        this.b = new com.google.a.a.a.a.a.b.d();
 76:    p0.a(this.b);
 79:    goto 0;
 82:    if (this.c == 0)
 89:        this.c = new com.google.a.a.a.a.a.b.d();
 93:    p0.a(this.c);
 96:    goto 0;
 99:    if (this.d == 0)
106:        this.d = new com.google.a.a.a.a.a.b.d();
110:    p0.a(this.d);
113:    goto 0;
118:    this.e = p0.e();
120:    goto 0;
125:    this.h = p0.f();
127:    goto 0;
132:    this.i = p0.f();
134:    goto 0;
140:    this.f = p0.j();
142:    goto 0;
148:    try {
148:        v2 = p0.i();
152:        switch (v2) {
                case 0:
191:                try {
191:                    this.g = v2;
                    }
                    catch (IllegalArgumentException ex) {
183:                    p0.e(p0.o());
186:                    this.a(p0, v0);
                    }
198:                break;
                case 1:
191:                try {
191:                    this.g = v2;
                    }
                    catch (IllegalArgumentException ex) {
183:                    p0.e(p0.o());
186:                    this.a(p0, v0);
                    }
198:                break;
                case 2:
191:                try {
191:                    this.g = v2;
                    }
                    catch (IllegalArgumentException ex) {
183:                    p0.e(p0.o());
186:                    this.a(p0, v0);
                    }
198:                break;
                default:
181:                throw new IllegalArgumentException(45 + v2 + " is not a valid enum DateRangeType");
            }
        }
        catch (IllegalArgumentException ex) {
        }
183:    p0.e(p0.o());
186:    this.a(p0, v0);
189:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a != 0)
            p0.a(1, this.a);
        if (this.b != 0)
            p0.b(2, this.b);
        if (this.c != 0)
            p0.b(3, this.c);
        if (this.d != 0)
            p0.b(4, this.d);
        if (this.e != 0)
            p0.a(5, this.e);
        if (this.h != 0 && !this.h.equals(""))
            p0.a(6, this.h);
        if (this.i != 0 && !this.i.equals(""))
            p0.a(9, this.i);
        if (this.f != 0)
            p0.b(10, this.f);
        if (this.g != 0)
            p0.a(11, this.g);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.a);
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.b);
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.c);
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.d);
        if (this.e != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(5) + 1;
        if (this.h != 0 && !this.h.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(6, this.h);
        if (this.i != 0 && !this.i.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(9, this.i);
        if (this.f != 0)
            v0 = v0 + CodedOutputByteBufferNano.f(10, this.f);
        if (this.g != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(11, this.g);
        return v0;
    }

}
