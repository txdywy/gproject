package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class gw extends C0758b {
    public int f12510a;
    public gv f12511b;
    public boolean f12512c;

    public gw() {
        this.f12510a = 0;
        this.f12511b = null;
        this.f12512c = false;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gw)) {
            return false;
        }
        gw gwVar = (gw) obj;
        if (this.f12511b == null) {
            if (gwVar.f12511b != null) {
                return false;
            }
        } else if (!this.f12511b.equals(gwVar.f12511b)) {
            return false;
        }
        if ((this.f12510a & 1) != (gwVar.f12510a & 1)) {
            return false;
        }
        if (this.f12512c != gwVar.f12512c) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(gwVar.aO);
        }
        if (gwVar.aO == null || gwVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        gv gvVar = this.f12511b;
        hashCode = ((this.f12512c ? 1231 : 1237) + (((gvVar == null ? 0 : gvVar.hashCode()) + (hashCode * 31)) * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12511b != null) {
            codedOutputByteBufferNano.b(1, this.f12511b);
        }
        if ((this.f12510a & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f12512c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12511b != null) {
            b += CodedOutputByteBufferNano.d(1, this.f12511b);
        }
        if ((this.f12510a & 1) != 0) {
            return b + (CodedOutputByteBufferNano.d(2) + 1);
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
                    if (this.f12511b == null) {
                        this.f12511b = new gv();
                    }
                    aVar.a(this.f12511b);
                    continue;
                case 16:
                    this.f12512c = aVar.e();
                    this.f12510a |= 1;
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
