package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.kf extends com.google.protobuf.nano.b
{

    public int a;
    public int b;

    kf() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 1;
        this.aO = 0;
        this.aP = -1;
    }

    private final com.google.android.finsky.cv.a.kf b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 8:
  4:            goto 14;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.a = this.a | 1;
 24:    try {
 24:        v2 = p0.i();
 28:        switch (v2) {
                case 1:
 66:                try {
 66:                    this.b = v2;
 72:                    this.a = this.a | 1;
                    }
                    catch (IllegalArgumentException ex) {
 59:                    p0.e(p0.o());
 62:                    this.a(p0, v0);
                    }
 77:                break;
                case 2:
 66:                try {
 66:                    this.b = v2;
 72:                    this.a = this.a | 1;
                    }
                    catch (IllegalArgumentException ex) {
 59:                    p0.e(p0.o());
 62:                    this.a(p0, v0);
                    }
 77:                break;
                case 3:
 66:                try {
 66:                    this.b = v2;
 72:                    this.a = this.a | 1;
                    }
                    catch (IllegalArgumentException ex) {
 59:                    p0.e(p0.o());
 62:                    this.a(p0, v0);
                    }
 77:                break;
                case 4:
 66:                try {
 66:                    this.b = v2;
 72:                    this.a = this.a | 1;
                    }
                    catch (IllegalArgumentException ex) {
 59:                    p0.e(p0.o());
 62:                    this.a(p0, v0);
                    }
 77:                break;
                case 5:
 66:                try {
 66:                    this.b = v2;
 72:                    this.a = this.a | 1;
                    }
                    catch (IllegalArgumentException ex) {
 59:                    p0.e(p0.o());
 62:                    this.a(p0, v0);
                    }
 77:                break;
                case 6:
 66:                try {
 66:                    this.b = v2;
 72:                    this.a = this.a | 1;
                    }
                    catch (IllegalArgumentException ex) {
 59:                    p0.e(p0.o());
 62:                    this.a(p0, v0);
                    }
 77:                break;
                case 7:
 66:                try {
 66:                    this.b = v2;
 72:                    this.a = this.a | 1;
                    }
                    catch (IllegalArgumentException ex) {
 59:                    p0.e(p0.o());
 62:                    this.a(p0, v0);
                    }
 77:                break;
                case 8:
 66:                try {
 66:                    this.b = v2;
 72:                    this.a = this.a | 1;
                    }
                    catch (IllegalArgumentException ex) {
 59:                    p0.e(p0.o());
 62:                    this.a(p0, v0);
                    }
 77:                break;
                default:
 57:                throw new IllegalArgumentException(50 + v2 + " is not a valid enum SubscriptionPeriod");
            }
        }
        catch (IllegalArgumentException ex) {
        }
 59:    p0.e(p0.o());
 62:    this.a(p0, v0);
 65:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a & 1)
            p0.a(1, this.b);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.b);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.kf))
                v0 = 0;
            else if ((this.a & 1) != (((com.google.android.finsky.cv.a.kf)p0).a & 1))
                v0 = 0;
            else if (this.b != ((com.google.android.finsky.cv.a.kf)p0).b)
                v0 = 0;
            else if (this.aO == 0 || this.aO.b()) {
                if (((com.google.android.finsky.cv.a.kf)p0).aO != 0 && !((com.google.android.finsky.cv.a.kf)p0).aO.b())
                    v0 = 0;
            }
            else
                v0 = this.aO.equals(((com.google.android.finsky.cv.a.kf)p0).aO);
        }
        return v0;
    }

    public final int hashCode() {
        if (this.aO == 0 || this.aO.b())
            v0 = 0;
        else
            v0 = this.aO.hashCode();
        return v0 + ((this.getClass().getName().hashCode() + 527) * 31 + this.b) * 31;
    }

}
