package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.bf extends com.google.protobuf.nano.b
{

    public int a;
    public int b;
    public int c;
    public int d;

    bf() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.aO = 0;
        this.aP = -1;
    }

    private final com.google.android.finsky.cv.a.bf b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 24:
  4:            goto 14;
            case 32:
  4:            goto 21;
            case 144:
  4:            goto 28;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.b = p0.i();
 20:    goto 0;
 25:    this.c = p0.i();
 27:    goto 0;
 32:    this.a = this.a | 1;
 38:    try {
 38:        v2 = p0.i();
 42:        switch (v2) {
                case 0:
 91:                break;
                case 1:
 91:                break;
                case 2:
 91:                break;
                case 3:
 91:                break;
                case 4:
 91:                break;
                case 5:
 91:                break;
                case 6:
 91:                break;
                case 7:
 91:                break;
                case 8:
 91:                break;
                default:
 71:                throw new IllegalArgumentException(34 + v2 + " is not a valid enum Id");
            }
        }
        catch (IllegalArgumentException ex) {
        }
 73:    p0.e(p0.o());
 76:    this.a(p0, v0);
 79:    goto 0;
 80:    try {
 80:        this.d = v2;
 86:        this.a = this.a | 1;
        }
        catch (IllegalArgumentException ex) {
 73:        p0.e(p0.o());
 76:        this.a(p0, v0);
        }
 88:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        p0.a(3, this.b);
        p0.a(4, this.c);
        if (this.a & 1)
            p0.a(18, this.d);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b() + CodedOutputByteBufferNano.d(3, this.b) + CodedOutputByteBufferNano.d(4, this.c);
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.d(18, this.d);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.bf))
                v0 = 0;
            else if (this.b != ((com.google.android.finsky.cv.a.bf)p0).b)
                v0 = 0;
            else if (this.c != ((com.google.android.finsky.cv.a.bf)p0).c)
                v0 = 0;
            else if ((this.a & 1) != (((com.google.android.finsky.cv.a.bf)p0).a & 1))
                v0 = 0;
            else if (this.d != ((com.google.android.finsky.cv.a.bf)p0).d)
                v0 = 0;
            else if (this.aO == 0 || this.aO.b()) {
                if (((com.google.android.finsky.cv.a.bf)p0).aO != 0 && !((com.google.android.finsky.cv.a.bf)p0).aO.b())
                    v0 = 0;
            }
            else
                v0 = this.aO.equals(((com.google.android.finsky.cv.a.bf)p0).aO);
        }
        return v0;
    }

    public final int hashCode() {
        if (this.aO == 0 || this.aO.b())
            v0 = 0;
        else
            v0 = this.aO.hashCode();
        return v0 + ((((this.getClass().getName().hashCode() + 527) * 31 + this.b) * 31 + this.c) * 31 + this.d) * 31;
    }

}
