package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class jk extends C0758b {
    public int f12789a;
    public String f12790b;
    public jk f12791c;

    public jk() {
        this.f12789a = 0;
        this.f12790b = "";
        this.f12791c = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jk)) {
            return false;
        }
        jk jkVar = (jk) obj;
        if ((this.f12789a & 1) != (jkVar.f12789a & 1)) {
            return false;
        }
        if (!this.f12790b.equals(jkVar.f12790b)) {
            return false;
        }
        if (this.f12791c == null) {
            if (jkVar.f12791c != null) {
                return false;
            }
        } else if (!this.f12791c.equals(jkVar.f12791c)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(jkVar.aO);
        }
        if (jkVar.aO == null || jkVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + this.f12790b.hashCode();
        jk jkVar = this.f12791c;
        hashCode = ((jkVar == null ? 0 : jkVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12789a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12790b);
        }
        if (this.f12791c != null) {
            codedOutputByteBufferNano.b(2, this.f12791c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12789a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12790b);
        }
        if (this.f12791c != null) {
            return b + CodedOutputByteBufferNano.d(2, this.f12791c);
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
                    this.f12790b = aVar.f();
                    this.f12789a |= 1;
                    continue;
                case 18:
                    if (this.f12791c == null) {
                        this.f12791c = new jk();
                    }
                    aVar.a(this.f12791c);
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
