package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

public final class com.google.android.finsky.cv.a.dp extends com.google.protobuf.nano.b
{

    public static volatile dp[] a;
    public int b;
    public int c;
    public String[] d;

    dp() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = 1;
        this.d = com.google.protobuf.nano.l.j;
        this.aO = 0;
        this.aP = -1;
    }

    public static int a(int p0) {
        switch (p0) {
            case 1:
                return p0;
            case 2:
                return p0;
            case 3:
                return p0;
            case 4:
                return p0;
            case 5:
                return p0;
            case 6:
                return p0;
            case 7:
                return p0;
            case 8:
                return p0;
            case 9:
                return p0;
            default:
                break;
        }
        throw new IllegalArgumentException(55 + p0 + " is not a valid enum AvailabilityProblemType");
    }

    public static dp[] aW_() {
        if (com.google.android.finsky.cv.a.dp.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.android.finsky.cv.a.dp.a == 0)
                    com.google.android.finsky.cv.a.dp.a = new dp[0];
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
        return com.google.android.finsky.cv.a.dp.a;
    }

    private final com.google.android.finsky.cv.a.dp b(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 8:
  5:            goto 15;
            case 18:
  5:            goto 50;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 19:    this.b = this.b | 1;
 25:    try {
 33:        this.c = com.google.android.finsky.cv.a.dp.a(p0.i());
 39:        this.b = this.b | 1;
        }
        catch (IllegalArgumentException ex) {
 43:        p0.e(p0.o());
 46:        this.a(p0, v0);
        }
 41:    goto 1;
 58:    if (this.d == 0)
 60:        v0 = 0;
        else
 90:        v0 = this.d.length;
 62:    v2 = new String[com.google.protobuf.nano.l.a(p0, 18) + v0];
 64:    if (v0 != 0)
 68:        System.arraycopy(this.d, 0, v2, 0, v0);
 71:    while (v0 < v2.length - 1) {
 80:        v2[v0] = p0.f();
 82:        p0.a();
 85:        v0 = v0 + 1;
        }
 87:    goto 92;
 96:    v2[v0] = p0.f();
 98:    this.d = v2;
100:    goto 1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b & 1)
            p0.a(1, this.c);
        if (this.d != 0 && this.d.length > 0) {
            v0 = 0;
            while (v0 < this.d.length) {
                if (this.d[v0] != 0)
                    p0.a(2, this.d[v0]);
                v0 = v0 + 1;
            }
        }
        super.a(p0);
    }

    protected final int b() {
        v1 = 0;
        v0 = super.b();
        if (this.b & 1)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.c);
        if (this.d != 0 && this.d.length > 0) {
            v2 = 0;
            v3 = 0;
            while (v1 < this.d.length) {
                if (this.d[v1] != 0) {
                    v3 = v3 + 1;
                    v2 = v2 + CodedOutputByteBufferNano.b(this.d[v1]);
                }
                v1 = v1 + 1;
            }
            v0 = v0 + v2 + v3 * 1;
        }
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.dp))
                v0 = 0;
            else if ((this.b & 1) != (((com.google.android.finsky.cv.a.dp)p0).b & 1))
                v0 = 0;
            else if (this.c != ((com.google.android.finsky.cv.a.dp)p0).c)
                v0 = 0;
            else if (!com.google.protobuf.nano.h.a(this.d, ((com.google.android.finsky.cv.a.dp)p0).d))
                v0 = 0;
            else if (this.aO == 0 || this.aO.b()) {
                if (((com.google.android.finsky.cv.a.dp)p0).aO != 0 && !((com.google.android.finsky.cv.a.dp)p0).aO.b())
                    v0 = 0;
            }
            else
                v0 = this.aO.equals(((com.google.android.finsky.cv.a.dp)p0).aO);
        }
        return v0;
    }

    public final int hashCode() {
        if (this.aO == 0 || this.aO.b())
            v0 = 0;
        else
            v0 = this.aO.hashCode();
        return v0 + (((this.getClass().getName().hashCode() + 527) * 31 + this.c) * 31 + com.google.protobuf.nano.h.a(this.d)) * 31;
    }

}
