package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.a extends com.google.protobuf.nano.b
{

    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    a() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.aO = 0;
        this.aP = -1;
    }

    private static int a(int p0) {
        switch (p0) {
            case 0:
                return p0;
            case 1:
                return p0;
            case 2:
                return p0;
            default:
                break;
        }
        throw new IllegalArgumentException(37 + p0 + " is not a valid enum OnOff");
    }

    private final com.google.android.finsky.cv.a.a b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 8:
  4:            goto 14;
            case 16:
  4:            goto 49;
            case 24:
  4:            goto 84;
            case 32:
  4:            goto 119;
            case 40:
  4:            goto 156;
            case 48:
  4:            goto 193;
            case 56:
  4:            goto 230;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.a = this.a | 1;
 24:    try {
 32:        this.b = com.google.android.finsky.cv.a.a.a(p0.i());
 38:        this.a = this.a | 1;
        }
        catch (IllegalArgumentException ex) {
 42:        p0.e(p0.o());
 45:        this.a(p0, v0);
        }
 40:    goto 0;
 53:    this.a = this.a | 2;
 59:    try {
 67:        this.c = com.google.android.finsky.cv.a.a.a(p0.i());
 73:        this.a = this.a | 2;
        }
        catch (IllegalArgumentException ex) {
 77:        p0.e(p0.o());
 80:        this.a(p0, v0);
        }
 75:    goto 0;
 88:    this.a = this.a | 4;
 94:    try {
102:        this.d = com.google.android.finsky.cv.a.a.a(p0.i());
108:        this.a = this.a | 4;
        }
        catch (IllegalArgumentException ex) {
112:        p0.e(p0.o());
115:        this.a(p0, v0);
        }
110:    goto 0;
123:    this.a = this.a | 8;
129:    try {
137:        this.e = com.google.android.finsky.cv.a.a.a(p0.i());
143:        this.a = this.a | 8;
        }
        catch (IllegalArgumentException ex) {
148:        p0.e(p0.o());
151:        this.a(p0, v0);
        }
145:    goto 0;
160:    this.a = this.a | 16;
166:    try {
174:        this.f = com.google.android.finsky.cv.a.a.a(p0.i());
180:        this.a = this.a | 16;
        }
        catch (IllegalArgumentException ex) {
185:        p0.e(p0.o());
188:        this.a(p0, v0);
        }
182:    goto 0;
197:    this.a = this.a | 32;
203:    try {
211:        this.g = com.google.android.finsky.cv.a.a.a(p0.i());
217:        this.a = this.a | 32;
        }
        catch (IllegalArgumentException ex) {
222:        p0.e(p0.o());
225:        this.a(p0, v0);
        }
219:    goto 0;
234:    this.a = this.a | 64;
240:    try {
248:        this.h = com.google.android.finsky.cv.a.a.a(p0.i());
254:        this.a = this.a | 64;
        }
        catch (IllegalArgumentException ex) {
259:        p0.e(p0.o());
262:        this.a(p0, v0);
        }
256:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a & 1)
            p0.a(1, this.b);
        if (this.a & 2)
            p0.a(2, this.c);
        if (this.a & 4)
            p0.a(3, this.d);
        if (this.a & 8)
            p0.a(4, this.e);
        if (this.a & 16)
            p0.a(5, this.f);
        if (this.a & 32)
            p0.a(6, this.g);
        if (this.a & 64)
            p0.a(7, this.h);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.b);
        if (this.a & 2)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.c);
        if (this.a & 4)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.d);
        if (this.a & 8)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.e);
        if (this.a & 16)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.f);
        if (this.a & 32)
            v0 = v0 + CodedOutputByteBufferNano.d(6, this.g);
        if (this.a & 64)
            v0 = v0 + CodedOutputByteBufferNano.d(7, this.h);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.a))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.a)p0;
                if ((this.a & 1) != (p0.a & 1))
                    v0 = 0;
                else if (this.b != p0.b)
                    v0 = 0;
                else if ((this.a & 2) != (p0.a & 2))
                    v0 = 0;
                else if (this.c != p0.c)
                    v0 = 0;
                else if ((this.a & 4) != (p0.a & 4))
                    v0 = 0;
                else if (this.d != p0.d)
                    v0 = 0;
                else if ((this.a & 8) != (p0.a & 8))
                    v0 = 0;
                else if (this.e != p0.e)
                    v0 = 0;
                else if ((this.a & 16) != (p0.a & 16))
                    v0 = 0;
                else if (this.f != p0.f)
                    v0 = 0;
                else if ((this.a & 32) != (p0.a & 32))
                    v0 = 0;
                else if (this.g != p0.g)
                    v0 = 0;
                else if ((this.a & 64) != (p0.a & 64))
                    v0 = 0;
                else if (this.h != p0.h)
                    v0 = 0;
                else if (this.aO == 0 || this.aO.b()) {
                    if (p0.aO != 0 && !p0.aO.b())
                        v0 = 0;
                }
                else
                    v0 = this.aO.equals(p0.aO);
            }
        }
        return v0;
    }

    public final int hashCode() {
        if (this.aO == 0 || this.aO.b())
            v0 = 0;
        else
            v0 = this.aO.hashCode();
        return v0 + ((((((((this.getClass().getName().hashCode() + 527) * 31 + this.b) * 31 + this.c) * 31 + this.d) * 31 + this.e) * 31 + this.f) * 31 + this.g) * 31 + this.h) * 31;
    }

}
