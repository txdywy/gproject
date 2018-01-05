package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class gg extends C0758b {
    public int f12436a;
    public String f12437b;
    public gh f12438c;

    public gg() {
        this.f12436a = 0;
        this.f12437b = "";
        this.f12438c = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gg)) {
            return false;
        }
        gg ggVar = (gg) obj;
        if ((this.f12436a & 1) != (ggVar.f12436a & 1)) {
            return false;
        }
        if (!this.f12437b.equals(ggVar.f12437b)) {
            return false;
        }
        if (this.f12438c == null) {
            if (ggVar.f12438c != null) {
                return false;
            }
        } else if (!this.f12438c.equals(ggVar.f12438c)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(ggVar.aO);
        }
        if (ggVar.aO == null || ggVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + this.f12437b.hashCode();
        gh ghVar = this.f12438c;
        hashCode = ((ghVar == null ? 0 : ghVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12436a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12437b);
        }
        if (this.f12438c != null) {
            codedOutputByteBufferNano.b(2, this.f12438c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12436a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12437b);
        }
        if (this.f12438c != null) {
            return b + CodedOutputByteBufferNano.d(2, this.f12438c);
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
                    this.f12437b = aVar.f();
                    this.f12436a |= 1;
                    continue;
                case 18:
                    if (this.f12438c == null) {
                        this.f12438c = new gh();
                    }
                    aVar.a(this.f12438c);
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
