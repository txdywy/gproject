package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class gm extends C0758b {
    public static volatile gm[] f12459a;
    public int f12460b;
    public String f12461c;
    public String f12462d;
    public bd f12463e;

    public static gm[] bf_() {
        if (f12459a == null) {
            synchronized (h.b) {
                if (f12459a == null) {
                    f12459a = new gm[0];
                }
            }
        }
        return f12459a;
    }

    public gm() {
        this.f12460b = 0;
        this.f12461c = "";
        this.f12462d = "";
        this.f12463e = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gm)) {
            return false;
        }
        gm gmVar = (gm) obj;
        if ((this.f12460b & 1) != (gmVar.f12460b & 1)) {
            return false;
        }
        if (!this.f12461c.equals(gmVar.f12461c)) {
            return false;
        }
        if ((this.f12460b & 2) != (gmVar.f12460b & 2)) {
            return false;
        }
        if (!this.f12462d.equals(gmVar.f12462d)) {
            return false;
        }
        if (this.f12463e == null) {
            if (gmVar.f12463e != null) {
                return false;
            }
        } else if (!this.f12463e.equals(gmVar.f12463e)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(gmVar.aO);
        }
        if (gmVar.aO == null || gmVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((getClass().getName().hashCode() + 527) * 31) + this.f12461c.hashCode()) * 31) + this.f12462d.hashCode();
        bd bdVar = this.f12463e;
        hashCode = ((bdVar == null ? 0 : bdVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12460b & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f12461c);
        }
        if ((this.f12460b & 2) != 0) {
            codedOutputByteBufferNano.a(4, this.f12462d);
        }
        if (this.f12463e != null) {
            codedOutputByteBufferNano.b(5, this.f12463e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12460b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12461c);
        }
        if ((this.f12460b & 2) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f12462d);
        }
        if (this.f12463e != null) {
            return b + CodedOutputByteBufferNano.d(5, this.f12463e);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 18:
                    this.f12461c = aVar.f();
                    this.f12460b |= 1;
                    continue;
                case 34:
                    this.f12462d = aVar.f();
                    this.f12460b |= 2;
                    continue;
                case 42:
                    if (this.f12463e == null) {
                        this.f12463e = new bd();
                    }
                    aVar.a(this.f12463e);
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
