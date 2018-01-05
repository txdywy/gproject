package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class com.google.android.finsky.cv.a.je extends com.google.protobuf.nano.b
{

    public static volatile je[] a;
    public int b;
    public int c;
    public String d;
    public com.google.android.finsky.cv.a.bd e;
    public com.google.android.finsky.cv.a.eu f;
    public byte[] g;
    public com.google.android.finsky.cv.a.cv h;
    public int i;
    public String j;
    public com.google.android.finsky.cv.a.jc k;
    public boolean l;
    public String m;

    je() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = 1;
        this.d = "";
        this.e = 0;
        this.f = 0;
        this.g = com.google.protobuf.nano.l.l;
        this.h = 0;
        this.i = 0;
        this.j = "";
        this.k = 0;
        this.l = 0;
        this.m = "";
        this.aO = 0;
        this.aP = -1;
    }

    private final com.google.android.finsky.cv.a.je b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 8:
  4:            goto 14;
            case 18:
  4:            goto 75;
            case 26:
  4:            goto 88;
            case 34:
  4:            goto 105;
            case 42:
  4:            goto 118;
            case 50:
  4:            goto 136;
            case 58:
  4:            goto 150;
            case 66:
  4:            goto 168;
            case 72:
  4:            goto 186;
            case 80:
  4:            goto 223;
            case 90:
  4:            goto 237;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.b = this.b | 1;
 24:    try {
 24:        v2 = p0.i();
 28:        switch (v2) {
                case 1:
 66:                try {
 66:                    this.c = v2;
 72:                    this.b = this.b | 1;
                    }
                    catch (IllegalArgumentException ex) {
 59:                    p0.e(p0.o());
 62:                    this.a(p0, v0);
                    }
253:                break;
                case 2:
 66:                try {
 66:                    this.c = v2;
 72:                    this.b = this.b | 1;
                    }
                    catch (IllegalArgumentException ex) {
 59:                    p0.e(p0.o());
 62:                    this.a(p0, v0);
                    }
253:                break;
                case 3:
 66:                try {
 66:                    this.c = v2;
 72:                    this.b = this.b | 1;
                    }
                    catch (IllegalArgumentException ex) {
 59:                    p0.e(p0.o());
 62:                    this.a(p0, v0);
                    }
253:                break;
                case 4:
 66:                try {
 66:                    this.c = v2;
 72:                    this.b = this.b | 1;
                    }
                    catch (IllegalArgumentException ex) {
 59:                    p0.e(p0.o());
 62:                    this.a(p0, v0);
                    }
253:                break;
                default:
 57:                throw new IllegalArgumentException(34 + v2 + " is not a valid enum Id");
            }
        }
        catch (IllegalArgumentException ex) {
        }
 59:    p0.e(p0.o());
 62:    this.a(p0, v0);
 65:    goto 0;
 79:    this.j = p0.f();
 85:    this.b = this.b | 16;
 87:    goto 0;
 90:    if (this.k == 0)
 97:        this.k = new com.google.android.finsky.cv.a.jc();
101:    p0.a(this.k);
104:    goto 0;
109:    this.g = p0.g();
115:    this.b = this.b | 4;
117:    goto 0;
120:    if (this.e == 0)
127:        this.e = new com.google.android.finsky.cv.a.bd();
131:    p0.a(this.e);
134:    goto 0;
140:    this.d = p0.f();
146:    this.b = this.b | 2;
148:    goto 0;
152:    if (this.f == 0)
159:        this.f = new com.google.android.finsky.cv.a.eu();
163:    p0.a(this.f);
166:    goto 0;
170:    if (this.h == 0)
177:        this.h = new com.google.android.finsky.cv.a.cv();
181:    p0.a(this.h);
184:    goto 0;
190:    this.b = this.b | 8;
196:    try {
204:        this.i = com.google.android.finsky.cv.a.aw.a(p0.i());
210:        this.b = this.b | 8;
        }
        catch (IllegalArgumentException ex) {
215:        p0.e(p0.o());
218:        this.a(p0, v0);
        }
212:    goto 0;
227:    this.l = p0.e();
233:    this.b = this.b | 32;
235:    goto 0;
241:    this.m = p0.f();
247:    this.b = this.b | 64;
249:    goto 0;
    }

    public static je[] bv_() {
        if (com.google.android.finsky.cv.a.je.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.android.finsky.cv.a.je.a == 0)
                    com.google.android.finsky.cv.a.je.a = new je[0];
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
        return com.google.android.finsky.cv.a.je.a;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b & 1)
            p0.a(1, this.c);
        if (this.b & 16)
            p0.a(2, this.j);
        if (this.k != 0)
            p0.b(3, this.k);
        if (this.b & 4)
            p0.a(4, this.g);
        if (this.e != 0)
            p0.b(5, this.e);
        if (this.b & 2)
            p0.a(6, this.d);
        if (this.f != 0)
            p0.b(7, this.f);
        if (this.h != 0)
            p0.b(8, this.h);
        if (this.b & 8)
            p0.a(9, this.i);
        if (this.b & 32)
            p0.a(10, this.l);
        if (this.b & 64)
            p0.a(11, this.m);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.b & 1)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.c);
        if (this.b & 16)
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.j);
        if (this.k != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.k);
        if (this.b & 4)
            v0 = v0 + CodedOutputByteBufferNano.b(4, this.g);
        if (this.e != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.e);
        if (this.b & 2)
            v0 = v0 + CodedOutputByteBufferNano.b(6, this.d);
        if (this.f != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(7, this.f);
        if (this.h != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(8, this.h);
        if (this.b & 8)
            v0 = v0 + CodedOutputByteBufferNano.d(9, this.i);
        if (this.b & 32)
            v0 = v0 + CodedOutputByteBufferNano.d(10) + 1;
        if (this.b & 64)
            v0 = v0 + CodedOutputByteBufferNano.b(11, this.m);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.je))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.je)p0;
                if ((this.b & 1) != (p0.b & 1))
                    v0 = 0;
                else if (this.c != p0.c)
                    v0 = 0;
                else if ((this.b & 2) != (p0.b & 2))
                    v0 = 0;
                else if (!this.d.equals(p0.d))
                    v0 = 0;
                else if (this.e == 0) {
                    if (p0.e != 0)
                        v0 = 0;
                    else if (this.f == 0) {
                        if (p0.f != 0)
                            v0 = 0;
                        else if ((this.b & 4) != (p0.b & 4))
                            v0 = 0;
                        else if (!Arrays.equals(this.g, p0.g))
                            v0 = 0;
                        else if (this.h == 0) {
                            if (p0.h != 0)
                                v0 = 0;
                            else if ((this.b & 8) != (p0.b & 8))
                                v0 = 0;
                            else if (this.i != p0.i)
                                v0 = 0;
                            else if ((this.b & 16) != (p0.b & 16))
                                v0 = 0;
                            else if (!this.j.equals(p0.j))
                                v0 = 0;
                            else if (this.k == 0) {
                                if (p0.k != 0)
                                    v0 = 0;
                                else if ((this.b & 32) != (p0.b & 32))
                                    v0 = 0;
                                else if (this.l != p0.l)
                                    v0 = 0;
                                else if ((this.b & 64) != (p0.b & 64))
                                    v0 = 0;
                                else if (!this.m.equals(p0.m))
                                    v0 = 0;
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.k.equals(p0.k))
                                v0 = 0;
                            else if ((this.b & 32) != (p0.b & 32))
                                v0 = 0;
                            else if (this.l != p0.l)
                                v0 = 0;
                            else if ((this.b & 64) != (p0.b & 64))
                                v0 = 0;
                            else if (!this.m.equals(p0.m))
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
                        else if ((this.b & 8) != (p0.b & 8))
                            v0 = 0;
                        else if (this.i != p0.i)
                            v0 = 0;
                        else if ((this.b & 16) != (p0.b & 16))
                            v0 = 0;
                        else if (!this.j.equals(p0.j))
                            v0 = 0;
                        else if (this.k == 0) {
                            if (p0.k != 0)
                                v0 = 0;
                            else if ((this.b & 32) != (p0.b & 32))
                                v0 = 0;
                            else if (this.l != p0.l)
                                v0 = 0;
                            else if ((this.b & 64) != (p0.b & 64))
                                v0 = 0;
                            else if (!this.m.equals(p0.m))
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.k.equals(p0.k))
                            v0 = 0;
                        else if ((this.b & 32) != (p0.b & 32))
                            v0 = 0;
                        else if (this.l != p0.l)
                            v0 = 0;
                        else if ((this.b & 64) != (p0.b & 64))
                            v0 = 0;
                        else if (!this.m.equals(p0.m))
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.f.equals(p0.f))
                        v0 = 0;
                    else if ((this.b & 4) != (p0.b & 4))
                        v0 = 0;
                    else if (!Arrays.equals(this.g, p0.g))
                        v0 = 0;
                    else if (this.h == 0) {
                        if (p0.h != 0)
                            v0 = 0;
                        else if ((this.b & 8) != (p0.b & 8))
                            v0 = 0;
                        else if (this.i != p0.i)
                            v0 = 0;
                        else if ((this.b & 16) != (p0.b & 16))
                            v0 = 0;
                        else if (!this.j.equals(p0.j))
                            v0 = 0;
                        else if (this.k == 0) {
                            if (p0.k != 0)
                                v0 = 0;
                            else if ((this.b & 32) != (p0.b & 32))
                                v0 = 0;
                            else if (this.l != p0.l)
                                v0 = 0;
                            else if ((this.b & 64) != (p0.b & 64))
                                v0 = 0;
                            else if (!this.m.equals(p0.m))
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.k.equals(p0.k))
                            v0 = 0;
                        else if ((this.b & 32) != (p0.b & 32))
                            v0 = 0;
                        else if (this.l != p0.l)
                            v0 = 0;
                        else if ((this.b & 64) != (p0.b & 64))
                            v0 = 0;
                        else if (!this.m.equals(p0.m))
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
                    else if ((this.b & 8) != (p0.b & 8))
                        v0 = 0;
                    else if (this.i != p0.i)
                        v0 = 0;
                    else if ((this.b & 16) != (p0.b & 16))
                        v0 = 0;
                    else if (!this.j.equals(p0.j))
                        v0 = 0;
                    else if (this.k == 0) {
                        if (p0.k != 0)
                            v0 = 0;
                        else if ((this.b & 32) != (p0.b & 32))
                            v0 = 0;
                        else if (this.l != p0.l)
                            v0 = 0;
                        else if ((this.b & 64) != (p0.b & 64))
                            v0 = 0;
                        else if (!this.m.equals(p0.m))
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.k.equals(p0.k))
                        v0 = 0;
                    else if ((this.b & 32) != (p0.b & 32))
                        v0 = 0;
                    else if (this.l != p0.l)
                        v0 = 0;
                    else if ((this.b & 64) != (p0.b & 64))
                        v0 = 0;
                    else if (!this.m.equals(p0.m))
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.e.equals(p0.e))
                    v0 = 0;
                else if (this.f == 0) {
                    if (p0.f != 0)
                        v0 = 0;
                    else if ((this.b & 4) != (p0.b & 4))
                        v0 = 0;
                    else if (!Arrays.equals(this.g, p0.g))
                        v0 = 0;
                    else if (this.h == 0) {
                        if (p0.h != 0)
                            v0 = 0;
                        else if ((this.b & 8) != (p0.b & 8))
                            v0 = 0;
                        else if (this.i != p0.i)
                            v0 = 0;
                        else if ((this.b & 16) != (p0.b & 16))
                            v0 = 0;
                        else if (!this.j.equals(p0.j))
                            v0 = 0;
                        else if (this.k == 0) {
                            if (p0.k != 0)
                                v0 = 0;
                            else if ((this.b & 32) != (p0.b & 32))
                                v0 = 0;
                            else if (this.l != p0.l)
                                v0 = 0;
                            else if ((this.b & 64) != (p0.b & 64))
                                v0 = 0;
                            else if (!this.m.equals(p0.m))
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.k.equals(p0.k))
                            v0 = 0;
                        else if ((this.b & 32) != (p0.b & 32))
                            v0 = 0;
                        else if (this.l != p0.l)
                            v0 = 0;
                        else if ((this.b & 64) != (p0.b & 64))
                            v0 = 0;
                        else if (!this.m.equals(p0.m))
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
                    else if ((this.b & 8) != (p0.b & 8))
                        v0 = 0;
                    else if (this.i != p0.i)
                        v0 = 0;
                    else if ((this.b & 16) != (p0.b & 16))
                        v0 = 0;
                    else if (!this.j.equals(p0.j))
                        v0 = 0;
                    else if (this.k == 0) {
                        if (p0.k != 0)
                            v0 = 0;
                        else if ((this.b & 32) != (p0.b & 32))
                            v0 = 0;
                        else if (this.l != p0.l)
                            v0 = 0;
                        else if ((this.b & 64) != (p0.b & 64))
                            v0 = 0;
                        else if (!this.m.equals(p0.m))
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.k.equals(p0.k))
                        v0 = 0;
                    else if ((this.b & 32) != (p0.b & 32))
                        v0 = 0;
                    else if (this.l != p0.l)
                        v0 = 0;
                    else if ((this.b & 64) != (p0.b & 64))
                        v0 = 0;
                    else if (!this.m.equals(p0.m))
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.f.equals(p0.f))
                    v0 = 0;
                else if ((this.b & 4) != (p0.b & 4))
                    v0 = 0;
                else if (!Arrays.equals(this.g, p0.g))
                    v0 = 0;
                else if (this.h == 0) {
                    if (p0.h != 0)
                        v0 = 0;
                    else if ((this.b & 8) != (p0.b & 8))
                        v0 = 0;
                    else if (this.i != p0.i)
                        v0 = 0;
                    else if ((this.b & 16) != (p0.b & 16))
                        v0 = 0;
                    else if (!this.j.equals(p0.j))
                        v0 = 0;
                    else if (this.k == 0) {
                        if (p0.k != 0)
                            v0 = 0;
                        else if ((this.b & 32) != (p0.b & 32))
                            v0 = 0;
                        else if (this.l != p0.l)
                            v0 = 0;
                        else if ((this.b & 64) != (p0.b & 64))
                            v0 = 0;
                        else if (!this.m.equals(p0.m))
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.k.equals(p0.k))
                        v0 = 0;
                    else if ((this.b & 32) != (p0.b & 32))
                        v0 = 0;
                    else if (this.l != p0.l)
                        v0 = 0;
                    else if ((this.b & 64) != (p0.b & 64))
                        v0 = 0;
                    else if (!this.m.equals(p0.m))
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
                else if ((this.b & 8) != (p0.b & 8))
                    v0 = 0;
                else if (this.i != p0.i)
                    v0 = 0;
                else if ((this.b & 16) != (p0.b & 16))
                    v0 = 0;
                else if (!this.j.equals(p0.j))
                    v0 = 0;
                else if (this.k == 0) {
                    if (p0.k != 0)
                        v0 = 0;
                    else if ((this.b & 32) != (p0.b & 32))
                        v0 = 0;
                    else if (this.l != p0.l)
                        v0 = 0;
                    else if ((this.b & 64) != (p0.b & 64))
                        v0 = 0;
                    else if (!this.m.equals(p0.m))
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.k.equals(p0.k))
                    v0 = 0;
                else if ((this.b & 32) != (p0.b & 32))
                    v0 = 0;
                else if (this.l != p0.l)
                    v0 = 0;
                else if ((this.b & 64) != (p0.b & 64))
                    v0 = 0;
                else if (!this.m.equals(p0.m))
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
        if (this.e == 0)
            v0 = 0;
        else
            v0 = this.e.hashCode();
        v3 = (v0 + (((this.getClass().getName().hashCode() + 527) * 31 + this.c) * 31 + this.d.hashCode()) * 31) * 31;
        if (this.f == 0)
            v0 = 0;
        else
            v0 = this.f.hashCode();
        v3 = ((v0 + v3) * 31 + Arrays.hashCode(this.g)) * 31;
        if (this.h == 0)
            v0 = 0;
        else
            v0 = this.h.hashCode();
        v3 = (((v0 + v3) * 31 + this.i) * 31 + this.j.hashCode()) * 31;
        if (this.k == 0)
            v0 = 0;
        else
            v0 = this.k.hashCode();
        v3 = (v0 + v3) * 31;
        if (this.l != 0)
            v0 = 1231;
        else
            v0 = 1237;
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return ((v0 + v3) * 31 + this.m.hashCode()) * 31 + v1;
    }

}
