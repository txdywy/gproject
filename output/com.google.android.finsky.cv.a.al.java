package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.al extends com.google.protobuf.nano.b
{

    public int a;
    public String b;
    public com.google.android.finsky.cv.a.ak c;

    al() {
        com.google.protobuf.nano.b();
        this.a = -1;
        this.a = -1;
        this.b = "";
        this.a = -1;
        this.c = 0;
        this.aO = 0;
        this.aP = -1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 10:
  4:            goto 14;
            case 18:
  4:            goto 24;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.b = p0.f();
 21:    this.a = 0;
 23:    goto 0;
 26:    if (this.c == 0)
 33:        this.c = new com.google.android.finsky.cv.a.ak();
 37:    p0.a(this.c);
 41:    this.a = 1;
 43:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a == 0)
            p0.a(1, this.b);
        if (this.a == 1)
            p0.b(2, this.c);
        super.a(p0);
    }

    public final com.google.android.finsky.cv.a.ak aE_() {
        if (this.a == 1)
            v0 = this.c;
        else
            v0 = 0;
        return v0;
    }

    protected final int b() {
        v0 = super.b();
        if (this.a == 0)
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.b);
        if (this.a == 1)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.c);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.al))
                v0 = 0;
            else if (this.a != ((com.google.android.finsky.cv.a.al)p0).a)
                v0 = 0;
            else if (this.a == 0 && !this.b.equals(((com.google.android.finsky.cv.a.al)p0).b))
                v0 = 0;
            else if (this.c == 0) {
                if (((com.google.android.finsky.cv.a.al)p0).c != 0)
                    v0 = 0;
                else if (this.aO == 0 || this.aO.b()) {
                    if (((com.google.android.finsky.cv.a.al)p0).aO != 0 && !((com.google.android.finsky.cv.a.al)p0).aO.b())
                        v0 = 0;
                }
                else
                    v0 = this.aO.equals(((com.google.android.finsky.cv.a.al)p0).aO);
            }
            else if (!this.c.equals(((com.google.android.finsky.cv.a.al)p0).c))
                v0 = 0;
            else if (this.aO == 0 || this.aO.b()) {
                if (((com.google.android.finsky.cv.a.al)p0).aO != 0 && !((com.google.android.finsky.cv.a.al)p0).aO.b())
                    v0 = 0;
            }
            else
                v0 = this.aO.equals(((com.google.android.finsky.cv.a.al)p0).aO);
        }
        return v0;
    }

    public final int hashCode() {
        v1 = 0;
        v0 = this.b;
        if (this.a != 0)
            v0 = "";
        v2 = (this.getClass().getName().hashCode() + 527) * 31 + v0.hashCode();
        v0 = this.c;
        if (this.a != 1)
            v0 = 0;
        if (v0 == 0)
            v0 = 0;
        else
            v0 = v0.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return (v0 + v2 * 31) * 31 + v1;
    }

}
