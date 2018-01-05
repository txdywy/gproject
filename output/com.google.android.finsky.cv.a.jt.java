package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.jt extends com.google.protobuf.nano.b
{

    jt() {
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
            default:
                break;
        }
        throw new IllegalArgumentException(49 + p0 + " is not a valid enum CompressionFormat");
    }

    public static int b(int p0) {
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
            default:
                break;
        }
        throw new IllegalArgumentException(43 + p0 + " is not a valid enum PatchFormat");
    }

    public static int c(int p0) {
        switch (p0) {
            case 0:
                return p0;
            case 50:
                return p0;
            case 100:
                return p0;
            case 200:
                return p0;
            case 300:
                return p0;
            default:
                break;
        }
        throw new IllegalArgumentException(39 + p0 + " is not a valid enum TrackId");
    }

    public static int d(int p0) {
        switch (p0) {
            case 0:
                return p0;
            case 1:
                return p0;
            case 2:
                return p0;
            case 3:
                return p0;
            default:
                break;
        }
        throw new IllegalArgumentException(50 + p0 + " is not a valid enum ApkInstallLocation");
    }

    public static int e(int p0) {
        switch (p0) {
            case 0:
                return p0;
            case 1:
                return p0;
            case 2:
                return p0;
            case 3:
                return p0;
            default:
                break;
        }
        throw new IllegalArgumentException(43 + p0 + " is not a valid enum TesterGroup");
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
            if (!(p0 instanceof com.google.android.finsky.cv.a.jt))
                v0 = 0;
            else if (this.aO == 0 || this.aO.b()) {
                if (((com.google.android.finsky.cv.a.jt)p0).aO != 0 && !((com.google.android.finsky.cv.a.jt)p0).aO.b())
                    v0 = 0;
            }
            else
                v0 = this.aO.equals(((com.google.android.finsky.cv.a.jt)p0).aO);
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
