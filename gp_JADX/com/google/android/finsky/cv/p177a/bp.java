package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.a;

public final class bp extends C0758b {
    public static int m12290a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum Id");
        }
    }

    public bp() {
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bp)) {
            return false;
        }
        bp bpVar = (bp) obj;
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(bpVar.aO);
        }
        if (bpVar.aO == null || bpVar.aO.b()) {
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
