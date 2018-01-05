package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class bu extends C0758b {
    public String f11967a;
    public String f11968b;

    public bu() {
        this.f11967a = "";
        this.f11968b = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bu)) {
            return false;
        }
        bu buVar = (bu) obj;
        if (this.f11967a == null) {
            if (buVar.f11967a != null) {
                return false;
            }
        } else if (!this.f11967a.equals(buVar.f11967a)) {
            return false;
        }
        if (this.f11968b == null) {
            if (buVar.f11968b != null) {
                return false;
            }
        } else if (!this.f11968b.equals(buVar.f11968b)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(buVar.aO);
        }
        if (buVar.aO == null || buVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.f11968b == null ? 0 : this.f11968b.hashCode()) + (((this.f11967a == null ? 0 : this.f11967a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.a(1, this.f11967a);
        codedOutputByteBufferNano.a(2, this.f11968b);
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        return (super.mo1128b() + CodedOutputByteBufferNano.b(1, this.f11967a)) + CodedOutputByteBufferNano.b(2, this.f11968b);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f11967a = aVar.f();
                    continue;
                case 18:
                    this.f11968b = aVar.f();
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
