package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class hm extends C0758b {
    public static volatile hm[] f12580a;
    public int f12581b;
    public bd f12582c;
    public String f12583d;

    public static hm[] bj_() {
        if (f12580a == null) {
            synchronized (h.b) {
                if (f12580a == null) {
                    f12580a = new hm[0];
                }
            }
        }
        return f12580a;
    }

    public hm() {
        this.f12581b = 0;
        this.f12582c = null;
        this.f12583d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hm)) {
            return false;
        }
        hm hmVar = (hm) obj;
        if (this.f12582c == null) {
            if (hmVar.f12582c != null) {
                return false;
            }
        } else if (!this.f12582c.equals(hmVar.f12582c)) {
            return false;
        }
        if ((this.f12581b & 1) != (hmVar.f12581b & 1)) {
            return false;
        }
        if (!this.f12583d.equals(hmVar.f12583d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(hmVar.aO);
        }
        if (hmVar.aO == null || hmVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        bd bdVar = this.f12582c;
        hashCode = ((((bdVar == null ? 0 : bdVar.hashCode()) + (hashCode * 31)) * 31) + this.f12583d.hashCode()) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12582c != null) {
            codedOutputByteBufferNano.b(1, this.f12582c);
        }
        if ((this.f12581b & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f12583d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12582c != null) {
            b += CodedOutputByteBufferNano.d(1, this.f12582c);
        }
        if ((this.f12581b & 1) != 0) {
            return b + CodedOutputByteBufferNano.b(2, this.f12583d);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f12582c == null) {
                        this.f12582c = new bd();
                    }
                    aVar.a(this.f12582c);
                    continue;
                case 18:
                    this.f12583d = aVar.f();
                    this.f12581b |= 1;
                    continue;
                default:
                    if (!super.m4918a(aVar, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
