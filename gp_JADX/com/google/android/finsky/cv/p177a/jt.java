package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.a;

public final class jt extends C0758b {
    public static int m12901a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum CompressionFormat");
        }
    }

    public static int m12902b(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum PatchFormat");
        }
    }

    public static int m12903c(int i) {
        switch (i) {
            case 0:
            case 50:
            case 100:
            case 200:
            case 300:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum TrackId");
        }
    }

    public static int m12904d(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum ApkInstallLocation");
        }
    }

    public static int m12905e(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum TesterGroup");
        }
    }

    public jt() {
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jt)) {
            return false;
        }
        jt jtVar = (jt) obj;
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(jtVar.aO);
        }
        if (jtVar.aO == null || jtVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        int a;
        do {
            a = aVar.a();
            switch (a) {
                case 0:
                    break;
                default:
                    break;
            }
            return this;
        } while (super.m4918a(aVar, a));
        return this;
    }
}
