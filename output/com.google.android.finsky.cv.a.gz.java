package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

public final class com.google.android.finsky.cv.a.gz extends com.google.protobuf.nano.b
{

    public com.google.android.finsky.cv.a.gy a;
    public com.google.android.finsky.cv.a.jq b;
    public hc[] c;
    public com.google.android.finsky.cv.a.jr d;

    gz() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = com.google.android.finsky.cv.a.hc.bh_();
        this.d = 0;
        this.aO = 0;
        this.aP = -1;
    }

    public static com.google.android.finsky.cv.a.gz a(byte[] p0) {
        return (com.google.android.finsky.cv.a.gz)com.google.protobuf.nano.i.a(new com.google.android.finsky.cv.a.gz(), p0);
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 10:
  5:            goto 15;
            case 18:
  5:            goto 32;
            case 26:
  5:            goto 49;
            case 34:
  5:            goto 112;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 17:    if (this.a == 0)
 24:        this.a = new com.google.android.finsky.cv.a.gy();
 28:    p0.a(this.a);
 31:    goto 1;
 34:    if (this.b == 0)
 41:        this.b = new com.google.android.finsky.cv.a.jq();
 45:    p0.a(this.b);
 48:    goto 1;
 57:    if (this.c == 0)
 59:        v0 = 0;
        else
 95:        v0 = this.c.length;
 61:    v2 = new hc[com.google.protobuf.nano.l.a(p0, 26) + v0];
 63:    if (v0 != 0)
 67:        System.arraycopy(this.c, 0, v2, 0, v0);
 70:    while (v0 < v2.length - 1) {
 80:        v2[v0] = new com.google.android.finsky.cv.a.hc();
 84:        p0.a(v2[v0]);
 87:        p0.a();
 90:        v0 = v0 + 1;
        }
 92:    goto 97;
102:    v2[v0] = new com.google.android.finsky.cv.a.hc();
106:    p0.a(v2[v0]);
109:    this.c = v2;
111:    goto 1;
114:    if (this.d == 0)
121:        this.d = new com.google.android.finsky.cv.a.jr();
125:    p0.a(this.d);
128:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a != 0)
            p0.b(1, this.a);
        if (this.b != 0)
            p0.b(2, this.b);
        if (this.c != 0 && this.c.length > 0) {
            v0 = 0;
            while (v0 < this.c.length) {
                if (this.c[v0] != 0)
                    p0.b(3, this.c[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.d != 0)
            p0.b(4, this.d);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.a);
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.b);
        if (this.c != 0 && this.c.length > 0) {
            v1 = v0;
            v0 = 0;
            while (v0 < this.c.length) {
                if (this.c[v0] != 0)
                    v1 = v1 + CodedOutputByteBufferNano.d(3, this.c[v0]);
                v0 = v0 + 1;
            }
            v0 = v1;
        }
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.d);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.gz))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.gz)p0;
                if (this.a == 0) {
                    if (p0.a != 0)
                        v0 = 0;
                    else if (this.b == 0) {
                        if (p0.b != 0)
                            v0 = 0;
                        else if (!com.google.protobuf.nano.h.a(this.c, p0.c))
                            v0 = 0;
                        else if (this.d == 0) {
                            if (p0.d != 0)
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
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.b.equals(p0.b))
                        v0 = 0;
                    else if (!com.google.protobuf.nano.h.a(this.c, p0.c))
                        v0 = 0;
                    else if (this.d == 0) {
                        if (p0.d != 0)
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
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.a.equals(p0.a))
                    v0 = 0;
                else if (this.b == 0) {
                    if (p0.b != 0)
                        v0 = 0;
                    else if (!com.google.protobuf.nano.h.a(this.c, p0.c))
                        v0 = 0;
                    else if (this.d == 0) {
                        if (p0.d != 0)
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
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.b.equals(p0.b))
                    v0 = 0;
                else if (!com.google.protobuf.nano.h.a(this.c, p0.c))
                    v0 = 0;
                else if (this.d == 0) {
                    if (p0.d != 0)
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
        if (this.a == 0)
            v0 = 0;
        else
            v0 = this.a.hashCode();
        v3 = (v0 + (this.getClass().getName().hashCode() + 527) * 31) * 31;
        if (this.b == 0)
            v0 = 0;
        else
            v0 = this.b.hashCode();
        v3 = ((v0 + v3) * 31 + com.google.protobuf.nano.h.a(this.c)) * 31;
        if (this.d == 0)
            v0 = 0;
        else
            v0 = this.d.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return (v0 + v3) * 31 + v1;
    }

}
