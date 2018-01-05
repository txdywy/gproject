package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

public final class com.google.android.finsky.cv.a.ha extends com.google.protobuf.nano.b
{

    public int a;
    public boolean b;
    public long c;
    public long d;
    public cv[] e;
    public gm[] f;

    ha() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = com.google.android.finsky.cv.a.cv.aS_();
        this.f = com.google.android.finsky.cv.a.gm.bf_();
        this.aO = 0;
        this.aP = -1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 8:
  5:            goto 15;
            case 16:
  5:            goto 28;
            case 24:
  5:            goto 41;
            case 34:
  5:            goto 54;
            case 42:
  5:            goto 117;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 19:    this.b = p0.e();
 25:    this.a = this.a | 1;
 27:    goto 1;
 32:    this.c = p0.j();
 38:    this.a = this.a | 2;
 40:    goto 1;
 45:    this.d = p0.j();
 51:    this.a = this.a | 4;
 53:    goto 1;
 62:    if (this.f == 0)
 64:        v0 = 0;
        else
100:        v0 = this.f.length;
 66:    v2 = new gm[com.google.protobuf.nano.l.a(p0, 34) + v0];
 68:    if (v0 != 0)
 72:        System.arraycopy(this.f, 0, v2, 0, v0);
 75:    while (v0 < v2.length - 1) {
 85:        v2[v0] = new com.google.android.finsky.cv.a.gm();
 89:        p0.a(v2[v0]);
 92:        p0.a();
 95:        v0 = v0 + 1;
        }
 97:    goto 102;
107:    v2[v0] = new com.google.android.finsky.cv.a.gm();
111:    p0.a(v2[v0]);
114:    this.f = v2;
116:    goto 1;
125:    if (this.e == 0)
127:        v0 = 0;
        else
163:        v0 = this.e.length;
129:    v2 = new cv[com.google.protobuf.nano.l.a(p0, 42) + v0];
131:    if (v0 != 0)
135:        System.arraycopy(this.e, 0, v2, 0, v0);
138:    while (v0 < v2.length - 1) {
148:        v2[v0] = new com.google.android.finsky.cv.a.cv();
152:        p0.a(v2[v0]);
155:        p0.a();
158:        v0 = v0 + 1;
        }
160:    goto 165;
170:    v2[v0] = new com.google.android.finsky.cv.a.cv();
174:    p0.a(v2[v0]);
177:    this.e = v2;
179:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        if (this.a & 1)
            p0.a(1, this.b);
        if (this.a & 2)
            p0.b(2, this.c);
        if (this.a & 4)
            p0.b(3, this.d);
        if (this.f != 0 && this.f.length > 0) {
            v0 = 0;
            while (v0 < this.f.length) {
                if (this.f[v0] != 0)
                    p0.b(4, this.f[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.e != 0 && this.e.length > 0)
            while (v1 < this.e.length) {
                if (this.e[v1] != 0)
                    p0.b(5, this.e[v1]);
                v1 = v1 + 1;
            }
        super.a(p0);
    }

    protected final int b() {
        v1 = 0;
        v0 = super.b();
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.d(1) + 1;
        if (this.a & 2)
            v0 = v0 + CodedOutputByteBufferNano.f(2, this.c);
        if (this.a & 4)
            v0 = v0 + CodedOutputByteBufferNano.f(3, this.d);
        if (this.f != 0 && this.f.length > 0) {
            v2 = v0;
            v0 = 0;
            while (v0 < this.f.length) {
                if (this.f[v0] != 0)
                    v2 = v2 + CodedOutputByteBufferNano.d(4, this.f[v0]);
                v0 = v0 + 1;
            }
            v0 = v2;
        }
        if (this.e != 0 && this.e.length > 0)
            while (v1 < this.e.length) {
                if (this.e[v1] != 0)
                    v0 = v0 + CodedOutputByteBufferNano.d(5, this.e[v1]);
                v1 = v1 + 1;
            }
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.ha))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.ha)p0;
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
                else if (!com.google.protobuf.nano.h.a(this.e, p0.e))
                    v0 = 0;
                else if (!com.google.protobuf.nano.h.a(this.f, p0.f))
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
        if (this.b != 0)
            v0 = 1231;
        else
            v0 = 1237;
        v1 = (((((v0 + (this.getClass().getName().hashCode() + 527) * 31) * 31 + (int)(this.c ^ this.c >>> 32)) * 31 + (int)(this.d ^ this.d >>> 32)) * 31 + com.google.protobuf.nano.h.a(this.e)) * 31 + com.google.protobuf.nano.h.a(this.f)) * 31;
        if (this.aO == 0 || this.aO.b())
            v0 = 0;
        else
            v0 = this.aO.hashCode();
        return v0 + v1;
    }

}
