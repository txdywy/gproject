package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.ct extends com.google.protobuf.nano.b
{

    public int a;
    public com.google.android.finsky.cv.a.cu b;
    public int c;

    ct() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.aO = 0;
        this.aP = -1;
    }

    private final com.google.android.finsky.cv.a.ct b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 10:
  4:            goto 14;
            case 16:
  4:            goto 31;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 16:    if (this.b == 0)
 23:        this.b = new com.google.android.finsky.cv.a.cu();
 27:    p0.a(this.b);
 30:    goto 0;
 35:    this.a = this.a | 1;
 41:    try {
 41:        v2 = p0.i();
 45:        switch (v2) {
                case 0:
 83:                try {
 83:                    this.c = v2;
 89:                    this.a = this.a | 1;
                    }
                    catch (IllegalArgumentException ex) {
 76:                    p0.e(p0.o());
 79:                    this.a(p0, v0);
                    }
 94:                break;
                case 1:
 83:                try {
 83:                    this.c = v2;
 89:                    this.a = this.a | 1;
                    }
                    catch (IllegalArgumentException ex) {
 76:                    p0.e(p0.o());
 79:                    this.a(p0, v0);
                    }
 94:                break;
                case 2:
 83:                try {
 83:                    this.c = v2;
 89:                    this.a = this.a | 1;
                    }
                    catch (IllegalArgumentException ex) {
 76:                    p0.e(p0.o());
 79:                    this.a(p0, v0);
                    }
 94:                break;
                case 3:
 83:                try {
 83:                    this.c = v2;
 89:                    this.a = this.a | 1;
                    }
                    catch (IllegalArgumentException ex) {
 76:                    p0.e(p0.o());
 79:                    this.a(p0, v0);
                    }
 94:                break;
                case 4:
 83:                try {
 83:                    this.c = v2;
 89:                    this.a = this.a | 1;
                    }
                    catch (IllegalArgumentException ex) {
 76:                    p0.e(p0.o());
 79:                    this.a(p0, v0);
                    }
 94:                break;
                case 5:
 83:                try {
 83:                    this.c = v2;
 89:                    this.a = this.a | 1;
                    }
                    catch (IllegalArgumentException ex) {
 76:                    p0.e(p0.o());
 79:                    this.a(p0, v0);
                    }
 94:                break;
                case 6:
 83:                try {
 83:                    this.c = v2;
 89:                    this.a = this.a | 1;
                    }
                    catch (IllegalArgumentException ex) {
 76:                    p0.e(p0.o());
 79:                    this.a(p0, v0);
                    }
 94:                break;
                default:
 74:                throw new IllegalArgumentException(34 + v2 + " is not a valid enum Id");
            }
        }
        catch (IllegalArgumentException ex) {
        }
 76:    p0.e(p0.o());
 79:    this.a(p0, v0);
 82:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b != 0)
            p0.b(1, this.b);
        if (this.a & 1)
            p0.a(2, this.c);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.b);
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.c);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.ct))
                v0 = 0;
            else if (this.b == 0) {
                if (((com.google.android.finsky.cv.a.ct)p0).b != 0)
                    v0 = 0;
                else if ((this.a & 1) != (((com.google.android.finsky.cv.a.ct)p0).a & 1))
                    v0 = 0;
                else if (this.c != ((com.google.android.finsky.cv.a.ct)p0).c)
                    v0 = 0;
                else if (this.aO == 0 || this.aO.b()) {
                    if (((com.google.android.finsky.cv.a.ct)p0).aO != 0 && !((com.google.android.finsky.cv.a.ct)p0).aO.b())
                        v0 = 0;
                }
                else
                    v0 = this.aO.equals(((com.google.android.finsky.cv.a.ct)p0).aO);
            }
            else if (!this.b.equals(((com.google.android.finsky.cv.a.ct)p0).b))
                v0 = 0;
            else if ((this.a & 1) != (((com.google.android.finsky.cv.a.ct)p0).a & 1))
                v0 = 0;
            else if (this.c != ((com.google.android.finsky.cv.a.ct)p0).c)
                v0 = 0;
            else if (this.aO == 0 || this.aO.b()) {
                if (((com.google.android.finsky.cv.a.ct)p0).aO != 0 && !((com.google.android.finsky.cv.a.ct)p0).aO.b())
                    v0 = 0;
            }
            else
                v0 = this.aO.equals(((com.google.android.finsky.cv.a.ct)p0).aO);
        }
        return v0;
    }

    public final int hashCode() {
        v1 = 0;
        if (this.b == 0)
            v0 = 0;
        else
            v0 = this.b.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return ((v0 + (this.getClass().getName().hashCode() + 527) * 31) * 31 + this.c) * 31 + v1;
    }

}
