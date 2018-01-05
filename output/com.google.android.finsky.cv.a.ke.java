package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.ke extends com.google.protobuf.nano.b
{

    public static volatile ke[] a;
    public int b;
    public int c;
    public String d;
    public com.google.android.finsky.cv.a.eu e;
    public com.google.android.finsky.cv.a.ai f;
    public com.google.android.finsky.cv.a.hv g;
    public com.google.android.finsky.cv.a.fa h;
    public com.google.android.finsky.cv.a.hf i;

    ke() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = 0;
        this.d = "";
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.aO = 0;
        this.aP = -1;
    }

    private final com.google.android.finsky.cv.a.ke b(com.google.protobuf.nano.a p0) {
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
  4:            goto 122;
            case 50:
  4:            goto 140;
            case 58:
  4:            goto 158;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.b = this.b | 1;
 24:    try {
 24:        v2 = p0.i();
 28:        switch (v2) {
                case 0:
 66:                try {
 66:                    this.c = v2;
 72:                    this.b = this.b | 1;
                    }
                    catch (IllegalArgumentException ex) {
 59:                    p0.e(p0.o());
 62:                    this.a(p0, v0);
                    }
177:                break;
                case 1:
 66:                try {
 66:                    this.c = v2;
 72:                    this.b = this.b | 1;
                    }
                    catch (IllegalArgumentException ex) {
 59:                    p0.e(p0.o());
 62:                    this.a(p0, v0);
                    }
177:                break;
                case 2:
 66:                try {
 66:                    this.c = v2;
 72:                    this.b = this.b | 1;
                    }
                    catch (IllegalArgumentException ex) {
 59:                    p0.e(p0.o());
 62:                    this.a(p0, v0);
                    }
177:                break;
                case 3:
 66:                try {
 66:                    this.c = v2;
 72:                    this.b = this.b | 1;
                    }
                    catch (IllegalArgumentException ex) {
 59:                    p0.e(p0.o());
 62:                    this.a(p0, v0);
                    }
177:                break;
                case 4:
 66:                try {
 66:                    this.c = v2;
 72:                    this.b = this.b | 1;
                    }
                    catch (IllegalArgumentException ex) {
 59:                    p0.e(p0.o());
 62:                    this.a(p0, v0);
                    }
177:                break;
                case 5:
 66:                try {
 66:                    this.c = v2;
 72:                    this.b = this.b | 1;
                    }
                    catch (IllegalArgumentException ex) {
 59:                    p0.e(p0.o());
 62:                    this.a(p0, v0);
                    }
177:                break;
                case 6:
 66:                try {
 66:                    this.c = v2;
 72:                    this.b = this.b | 1;
                    }
                    catch (IllegalArgumentException ex) {
 59:                    p0.e(p0.o());
 62:                    this.a(p0, v0);
                    }
177:                break;
                case 7:
 66:                try {
 66:                    this.c = v2;
 72:                    this.b = this.b | 1;
                    }
                    catch (IllegalArgumentException ex) {
 59:                    p0.e(p0.o());
 62:                    this.a(p0, v0);
                    }
177:                break;
                default:
 57:                throw new IllegalArgumentException(36 + v2 + " is not a valid enum Type");
            }
        }
        catch (IllegalArgumentException ex) {
        }
 59:    p0.e(p0.o());
 62:    this.a(p0, v0);
 65:    goto 0;
 79:    this.d = p0.f();
 85:    this.b = this.b | 2;
 87:    goto 0;
 90:    if (this.e == 0)
 97:        this.e = new com.google.android.finsky.cv.a.eu();
101:    p0.a(this.e);
104:    goto 0;
107:    if (this.f == 0)
114:        this.f = new com.google.android.finsky.cv.a.ai();
118:    p0.a(this.f);
121:    goto 0;
124:    if (this.g == 0)
131:        this.g = new com.google.android.finsky.cv.a.hv();
135:    p0.a(this.g);
138:    goto 0;
142:    if (this.h == 0)
149:        this.h = new com.google.android.finsky.cv.a.fa();
153:    p0.a(this.h);
156:    goto 0;
160:    if (this.i == 0)
167:        this.i = new com.google.android.finsky.cv.a.hf();
171:    p0.a(this.i);
174:    goto 0;
    }

    public static ke[] bG_() {
        if (com.google.android.finsky.cv.a.ke.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.android.finsky.cv.a.ke.a == 0)
                    com.google.android.finsky.cv.a.ke.a = new ke[0];
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
        return com.google.android.finsky.cv.a.ke.a;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b & 1)
            p0.a(1, this.c);
        if (this.b & 2)
            p0.a(2, this.d);
        if (this.e != 0)
            p0.b(3, this.e);
        if (this.f != 0)
            p0.b(4, this.f);
        if (this.g != 0)
            p0.b(5, this.g);
        if (this.h != 0)
            p0.b(6, this.h);
        if (this.i != 0)
            p0.b(7, this.i);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.b & 1)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.c);
        if (this.b & 2)
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.d);
        if (this.e != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.e);
        if (this.f != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.f);
        if (this.g != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.g);
        if (this.h != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(6, this.h);
        if (this.i != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(7, this.i);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.ke))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.ke)p0;
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
                        else if (this.g == 0) {
                            if (p0.g != 0)
                                v0 = 0;
                            else if (this.h == 0) {
                                if (p0.h != 0)
                                    v0 = 0;
                                else if (this.i == 0) {
                                    if (p0.i != 0)
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
                                else if (this.aO == 0 || this.aO.b()) {
                                    if (p0.aO != 0 && !p0.aO.b())
                                        v0 = 0;
                                }
                                else
                                    v0 = this.aO.equals(p0.aO);
                            }
                            else if (!this.i.equals(p0.i))
                                v0 = 0;
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.g.equals(p0.g))
                            v0 = 0;
                        else if (this.h == 0) {
                            if (p0.h != 0)
                                v0 = 0;
                            else if (this.i == 0) {
                                if (p0.i != 0)
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
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.i.equals(p0.i))
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
                    else if (this.g == 0) {
                        if (p0.g != 0)
                            v0 = 0;
                        else if (this.h == 0) {
                            if (p0.h != 0)
                                v0 = 0;
                            else if (this.i == 0) {
                                if (p0.i != 0)
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
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.i.equals(p0.i))
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.g.equals(p0.g))
                        v0 = 0;
                    else if (this.h == 0) {
                        if (p0.h != 0)
                            v0 = 0;
                        else if (this.i == 0) {
                            if (p0.i != 0)
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
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.i.equals(p0.i))
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
                    else if (this.g == 0) {
                        if (p0.g != 0)
                            v0 = 0;
                        else if (this.h == 0) {
                            if (p0.h != 0)
                                v0 = 0;
                            else if (this.i == 0) {
                                if (p0.i != 0)
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
                            else if (this.aO == 0 || this.aO.b()) {
                                if (p0.aO != 0 && !p0.aO.b())
                                    v0 = 0;
                            }
                            else
                                v0 = this.aO.equals(p0.aO);
                        }
                        else if (!this.i.equals(p0.i))
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.g.equals(p0.g))
                        v0 = 0;
                    else if (this.h == 0) {
                        if (p0.h != 0)
                            v0 = 0;
                        else if (this.i == 0) {
                            if (p0.i != 0)
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
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.i.equals(p0.i))
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
                else if (this.g == 0) {
                    if (p0.g != 0)
                        v0 = 0;
                    else if (this.h == 0) {
                        if (p0.h != 0)
                            v0 = 0;
                        else if (this.i == 0) {
                            if (p0.i != 0)
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
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.i.equals(p0.i))
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.g.equals(p0.g))
                    v0 = 0;
                else if (this.h == 0) {
                    if (p0.h != 0)
                        v0 = 0;
                    else if (this.i == 0) {
                        if (p0.i != 0)
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
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.i.equals(p0.i))
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
        v3 = (v0 + v3) * 31;
        if (this.g == 0)
            v0 = 0;
        else
            v0 = this.g.hashCode();
        v3 = (v0 + v3) * 31;
        if (this.h == 0)
            v0 = 0;
        else
            v0 = this.h.hashCode();
        v3 = (v0 + v3) * 31;
        if (this.i == 0)
            v0 = 0;
        else
            v0 = this.i.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return (v0 + v3) * 31 + v1;
    }

}
