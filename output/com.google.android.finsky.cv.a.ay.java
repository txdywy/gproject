package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.ay extends com.google.protobuf.nano.b
{

    ay() {
        com.google.protobuf.nano.b();
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
            case 10:
                return p0;
            case 11:
                return p0;
            case 12:
                return p0;
            case 13:
                return p0;
            case 14:
                return p0;
            case 15:
                return p0;
            case 16:
                return p0;
            case 17:
                return p0;
            case 18:
                return p0;
            case 19:
                return p0;
            case 20:
                return p0;
            case 21:
                return p0;
            case 22:
                return p0;
            case 23:
                return p0;
            case 24:
                return p0;
            case 25:
                return p0;
            case 26:
                return p0;
            case 27:
                return p0;
            case 28:
                return p0;
            case 29:
                return p0;
            case 30:
                return p0;
            case 31:
                return p0;
            case 32:
                return p0;
            case 33:
                return p0;
            case 34:
                return p0;
            case 35:
                return p0;
            case 36:
                return p0;
            case 37:
                return p0;
            case 38:
                return p0;
            case 39:
                return p0;
            case 40:
                return p0;
            case 41:
                return p0;
            case 42:
                return p0;
            case 43:
                return p0;
            case 44:
                return p0;
            case 45:
                return p0;
            case 46:
                return p0;
            case 47:
                return p0;
            case 48:
                return p0;
            case 49:
                return p0;
            case 50:
                return p0;
            case 51:
                return p0;
            case 52:
                return p0;
            case 53:
                return p0;
            case 54:
                return p0;
            case 55:
                return p0;
            case 56:
                return p0;
            case 57:
                return p0;
            case 58:
                return p0;
            case 59:
                return p0;
            case 60:
                return p0;
            case 61:
                return p0;
            case 62:
                return p0;
            case 63:
                return p0;
            case 64:
                return p0;
            case 65:
                return p0;
            case 66:
                return p0;
            case 67:
                return p0;
            case 68:
                return p0;
            case 69:
                return p0;
            case 70:
                return p0;
            case 71:
                return p0;
            case 72:
                return p0;
            case 73:
                return p0;
            case 74:
                return p0;
            case 75:
                return p0;
            case 76:
                return p0;
            case 77:
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
            if (!(p0 instanceof com.google.android.finsky.cv.a.ay))
                v0 = 0;
            else if (this.aO == 0 || this.aO.b()) {
                if (((com.google.android.finsky.cv.a.ay)p0).aO != 0 && !((com.google.android.finsky.cv.a.ay)p0).aO.b())
                    v0 = 0;
            }
            else
                v0 = this.aO.equals(((com.google.android.finsky.cv.a.ay)p0).aO);
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
