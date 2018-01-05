package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class com.google.android.finsky.cv.a.gi extends com.google.protobuf.nano.b
{

    public int a;
    public String b;
    public int c;
    public com.google.android.finsky.cv.a.bd d;
    public String e;
    public String f;
    public String g;
    public com.google.android.finsky.cv.a.gh h;
    public com.google.android.finsky.cv.a.gg i;
    public com.google.android.finsky.cv.a.gg j;
    public byte[] k;

    gi() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = "";
        this.c = 0;
        this.d = 0;
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = com.google.protobuf.nano.l.l;
        this.aO = 0;
        this.aP = -1;
    }

    private final com.google.android.finsky.cv.a.gi b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 10:
  4:            goto 14;
            case 16:
  4:            goto 27;
            case 26:
  4:            goto 88;
            case 34:
  4:            goto 105;
            case 42:
  4:            goto 118;
            case 50:
  4:            goto 132;
            case 58:
  4:            goto 146;
            case 66:
  4:            goto 164;
            case 74:
  4:            goto 182;
            case 82:
  4:            goto 200;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.b = p0.f();
 24:    this.a = this.a | 1;
 26:    goto 0;
 31:    this.a = this.a | 2;
 37:    try {
 37:        v2 = p0.i();
 41:        switch (v2) {
                case 0:
 79:                try {
 79:                    this.c = v2;
 85:                    this.a = this.a | 2;
                    }
                    catch (IllegalArgumentException ex) {
 72:                    p0.e(p0.o());
 75:                    this.a(p0, v0);
                    }
215:                break;
                case 1:
 79:                try {
 79:                    this.c = v2;
 85:                    this.a = this.a | 2;
                    }
                    catch (IllegalArgumentException ex) {
 72:                    p0.e(p0.o());
 75:                    this.a(p0, v0);
                    }
215:                break;
                case 2:
 79:                try {
 79:                    this.c = v2;
 85:                    this.a = this.a | 2;
                    }
                    catch (IllegalArgumentException ex) {
 72:                    p0.e(p0.o());
 75:                    this.a(p0, v0);
                    }
215:                break;
                case 3:
 79:                try {
 79:                    this.c = v2;
 85:                    this.a = this.a | 2;
                    }
                    catch (IllegalArgumentException ex) {
 72:                    p0.e(p0.o());
 75:                    this.a(p0, v0);
                    }
215:                break;
                default:
 70:                throw new IllegalArgumentException(61 + v2 + " is not a valid enum NotificationCenterMessageIcon");
            }
        }
        catch (IllegalArgumentException ex) {
        }
 72:    p0.e(p0.o());
 75:    this.a(p0, v0);
 78:    goto 0;
 90:    if (this.d == 0)
 97:        this.d = new com.google.android.finsky.cv.a.bd();
101:    p0.a(this.d);
104:    goto 0;
109:    this.e = p0.f();
115:    this.a = this.a | 4;
117:    goto 0;
122:    this.f = p0.f();
128:    this.a = this.a | 8;
130:    goto 0;
136:    this.g = p0.f();
142:    this.a = this.a | 16;
144:    goto 0;
148:    if (this.h == 0)
155:        this.h = new com.google.android.finsky.cv.a.gh();
159:    p0.a(this.h);
162:    goto 0;
166:    if (this.i == 0)
173:        this.i = new com.google.android.finsky.cv.a.gg();
177:    p0.a(this.i);
180:    goto 0;
184:    if (this.j == 0)
191:        this.j = new com.google.android.finsky.cv.a.gg();
195:    p0.a(this.j);
198:    goto 0;
204:    this.k = p0.g();
210:    this.a = this.a | 32;
212:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a & 1)
            p0.a(1, this.b);
        if (this.a & 2)
            p0.a(2, this.c);
        if (this.d != 0)
            p0.b(3, this.d);
        if (this.a & 4)
            p0.a(4, this.e);
        if (this.a & 8)
            p0.a(5, this.f);
        if (this.a & 16)
            p0.a(6, this.g);
        if (this.h != 0)
            p0.b(7, this.h);
        if (this.i != 0)
            p0.b(8, this.i);
        if (this.j != 0)
            p0.b(9, this.j);
        if (this.a & 32)
            p0.a(10, this.k);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.b);
        if (this.a & 2)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.c);
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.d);
        if (this.a & 4)
            v0 = v0 + CodedOutputByteBufferNano.b(4, this.e);
        if (this.a & 8)
            v0 = v0 + CodedOutputByteBufferNano.b(5, this.f);
        if (this.a & 16)
            v0 = v0 + CodedOutputByteBufferNano.b(6, this.g);
        if (this.h != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(7, this.h);
        if (this.i != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(8, this.i);
        if (this.j != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(9, this.j);
        if (this.a & 32)
            v0 = v0 + CodedOutputByteBufferNano.b(10, this.k);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.gi))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.gi)p0;
                if ((this.a & 1) != (p0.a & 1))
                    v0 = 0;
                else if (!this.b.equals(p0.b))
                    v0 = 0;
                else if ((this.a & 2) != (p0.a & 2))
                    v0 = 0;
                else if (this.c != p0.c)
                    v0 = 0;
                else if (this.d == 0) {
                    if (p0.d != 0)
                        v0 = 0;
                    else if ((this.a & 4) != (p0.a & 4))
                        v0 = 0;
                    else if (!this.e.equals(p0.e))
                        v0 = 0;
                    else if ((this.a & 8) != (p0.a & 8))
                        v0 = 0;
                    else if (!this.f.equals(p0.f))
                        v0 = 0;
                    else if ((this.a & 16) != (p0.a & 16))
                        v0 = 0;
                    else if (!this.g.equals(p0.g))
                        v0 = 0;
                    else if (this.h == 0) {
                        if (p0.h != 0)
                            v0 = 0;
                        else if (this.i == 0) {
                            if (p0.i != 0)
                                v0 = 0;
                            else if (this.j == 0) {
                                if (p0.j != 0)
                                    v0 = 0;
                                else if ((this.a & 32) != (p0.a & 32))
                                    v0 = 0;
                                else if (!Arrays.equals(this.k, p0.k))
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.j.equals(p0.j))
                                v0 = 0;
                            else if ((this.a & 32) != (p0.a & 32))
                                v0 = 0;
                            else if (!Arrays.equals(this.k, p0.k))
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.i.equals(p0.i))
                            v0 = 0;
                        else if (this.j == 0) {
                            if (p0.j != 0)
                                v0 = 0;
                            else if ((this.a & 32) != (p0.a & 32))
                                v0 = 0;
                            else if (!Arrays.equals(this.k, p0.k))
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.j.equals(p0.j))
                            v0 = 0;
                        else if ((this.a & 32) != (p0.a & 32))
                            v0 = 0;
                        else if (!Arrays.equals(this.k, p0.k))
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.h.equals(p0.h))
                        v0 = 0;
                    else if (this.i == 0) {
                        if (p0.i != 0)
                            v0 = 0;
                        else if (this.j == 0) {
                            if (p0.j != 0)
                                v0 = 0;
                            else if ((this.a & 32) != (p0.a & 32))
                                v0 = 0;
                            else if (!Arrays.equals(this.k, p0.k))
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.j.equals(p0.j))
                            v0 = 0;
                        else if ((this.a & 32) != (p0.a & 32))
                            v0 = 0;
                        else if (!Arrays.equals(this.k, p0.k))
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.i.equals(p0.i))
                        v0 = 0;
                    else if (this.j == 0) {
                        if (p0.j != 0)
                            v0 = 0;
                        else if ((this.a & 32) != (p0.a & 32))
                            v0 = 0;
                        else if (!Arrays.equals(this.k, p0.k))
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.j.equals(p0.j))
                        v0 = 0;
                    else if ((this.a & 32) != (p0.a & 32))
                        v0 = 0;
                    else if (!Arrays.equals(this.k, p0.k))
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.d.equals(p0.d))
                    v0 = 0;
                else if ((this.a & 4) != (p0.a & 4))
                    v0 = 0;
                else if (!this.e.equals(p0.e))
                    v0 = 0;
                else if ((this.a & 8) != (p0.a & 8))
                    v0 = 0;
                else if (!this.f.equals(p0.f))
                    v0 = 0;
                else if ((this.a & 16) != (p0.a & 16))
                    v0 = 0;
                else if (!this.g.equals(p0.g))
                    v0 = 0;
                else if (this.h == 0) {
                    if (p0.h != 0)
                        v0 = 0;
                    else if (this.i == 0) {
                        if (p0.i != 0)
                            v0 = 0;
                        else if (this.j == 0) {
                            if (p0.j != 0)
                                v0 = 0;
                            else if ((this.a & 32) != (p0.a & 32))
                                v0 = 0;
                            else if (!Arrays.equals(this.k, p0.k))
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.j.equals(p0.j))
                            v0 = 0;
                        else if ((this.a & 32) != (p0.a & 32))
                            v0 = 0;
                        else if (!Arrays.equals(this.k, p0.k))
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.i.equals(p0.i))
                        v0 = 0;
                    else if (this.j == 0) {
                        if (p0.j != 0)
                            v0 = 0;
                        else if ((this.a & 32) != (p0.a & 32))
                            v0 = 0;
                        else if (!Arrays.equals(this.k, p0.k))
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.j.equals(p0.j))
                        v0 = 0;
                    else if ((this.a & 32) != (p0.a & 32))
                        v0 = 0;
                    else if (!Arrays.equals(this.k, p0.k))
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.h.equals(p0.h))
                    v0 = 0;
                else if (this.i == 0) {
                    if (p0.i != 0)
                        v0 = 0;
                    else if (this.j == 0) {
                        if (p0.j != 0)
                            v0 = 0;
                        else if ((this.a & 32) != (p0.a & 32))
                            v0 = 0;
                        else if (!Arrays.equals(this.k, p0.k))
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.j.equals(p0.j))
                        v0 = 0;
                    else if ((this.a & 32) != (p0.a & 32))
                        v0 = 0;
                    else if (!Arrays.equals(this.k, p0.k))
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.i.equals(p0.i))
                    v0 = 0;
                else if (this.j == 0) {
                    if (p0.j != 0)
                        v0 = 0;
                    else if ((this.a & 32) != (p0.a & 32))
                        v0 = 0;
                    else if (!Arrays.equals(this.k, p0.k))
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.j.equals(p0.j))
                    v0 = 0;
                else if ((this.a & 32) != (p0.a & 32))
                    v0 = 0;
                else if (!Arrays.equals(this.k, p0.k))
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
        v1 = 0;
        if (this.d == 0)
            v0 = 0;
        else
            v0 = this.d.hashCode();
        v3 = ((((v0 + (((this.getClass().getName().hashCode() + 527) * 31 + this.b.hashCode()) * 31 + this.c) * 31) * 31 + this.e.hashCode()) * 31 + this.f.hashCode()) * 31 + this.g.hashCode()) * 31;
        if (this.h == 0)
            v0 = 0;
        else
            v0 = this.h.hashCode();
        v3 = (v0 + v3) * 31;
        if (this.i == 0)
            v0 = 0;
        else
            v0 = this.i.hashCode();
        v3 = (v0 + v3) * 31;
        if (this.j == 0)
            v0 = 0;
        else
            v0 = this.j.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return ((v0 + v3) * 31 + Arrays.hashCode(this.k)) * 31 + v1;
    }

}
