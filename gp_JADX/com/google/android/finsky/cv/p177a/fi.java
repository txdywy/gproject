package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class fi extends C0758b {
    public int f12364a;
    public boolean f12365b;

    public fi() {
        this.f12364a = 0;
        this.f12365b = false;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fi)) {
            return false;
        }
        fi fiVar = (fi) obj;
        if ((this.f12364a & 1) != (fiVar.f12364a & 1)) {
            return false;
        }
        if (this.f12365b != fiVar.f12365b) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(fiVar.aO);
        }
        if (fiVar.aO == null || fiVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.f12365b ? 1231 : 1237) + ((getClass().getName().hashCode() + 527) * 31)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12364a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12365b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12364a & 1) != 0) {
            return b + (CodedOutputByteBufferNano.d(1) + 1);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f12365b = aVar.e();
                    this.f12364a |= 1;
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
