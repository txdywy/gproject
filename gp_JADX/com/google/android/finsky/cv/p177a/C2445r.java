package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.a;

public final class C2445r extends C0758b {
    public C2445r() {
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2445r)) {
            return false;
        }
        C2445r c2445r = (C2445r) obj;
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c2445r.aO);
        }
        if (c2445r.aO == null || c2445r.aO.b()) {
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
