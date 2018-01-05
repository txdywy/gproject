package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.ae extends com.google.protobuf.nano.b
{

    ae() {
        com.google.protobuf.nano.b();
        this.aO = 0;
        this.aP = -1;
    }

    public static int a(int p0) {
        switch (p0) {
            case 0:
                return p0;
            case 1:
                return p0;
            case 2:
                return p0;
            case 3:
                break;
            case 4:
                return p0;
            case 5:
                return p0;
            case 6:
                return p0;
            case 7:
                return p0;
            default:
                break;
        }
        throw new IllegalArgumentException(34 + p0 + " is not a valid enum Id");
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.ae))
                v0 = 0;
            else if (this.aO == 0 || this.aO.b()) {
                if (((com.google.android.finsky.cv.a.ae)p0).aO != 0 && !((com.google.android.finsky.cv.a.ae)p0).aO.b())
                    v0 = 0;
            }
            else
                v0 = this.aO.equals(((com.google.android.finsky.cv.a.ae)p0).aO);
        }
        return v0;
    }

    public final int hashCode() {
        if (this.aO == 0 || this.aO.b())
            v0 = 0;
        else
            v0 = this.aO.hashCode();
        return v0 + (this.getClass().getName().hashCode() + 527) * 31;
    }

}
