package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class jm extends C0758b {
    public int f12794a;
    public String f12795b;
    public String f12796c;
    public String f12797d;

    public jm() {
        this.f12794a = 0;
        this.f12795b = "";
        this.f12796c = "";
        this.f12797d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jm)) {
            return false;
        }
        jm jmVar = (jm) obj;
        if ((this.f12794a & 1) != (jmVar.f12794a & 1)) {
            return false;
        }
        if (!this.f12795b.equals(jmVar.f12795b)) {
            return false;
        }
        if ((this.f12794a & 2) != (jmVar.f12794a & 2)) {
            return false;
        }
        if (!this.f12796c.equals(jmVar.f12796c)) {
            return false;
        }
        if ((this.f12794a & 4) != (jmVar.f12794a & 4)) {
            return false;
        }
        if (!this.f12797d.equals(jmVar.f12797d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(jmVar.aO);
        }
        if (jmVar.aO == null || jmVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + this.f12795b.hashCode()) * 31) + this.f12796c.hashCode()) * 31) + this.f12797d.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12794a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12795b);
        }
        if ((this.f12794a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12796c);
        }
        if ((this.f12794a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12797d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12794a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12795b);
        }
        if ((this.f12794a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12796c);
        }
        if ((this.f12794a & 4) != 0) {
            return b + CodedOutputByteBufferNano.b(3, this.f12797d);
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
                    this.f12795b = aVar.f();
                    this.f12794a |= 1;
                    continue;
                case 18:
                    this.f12796c = aVar.f();
                    this.f12794a |= 2;
                    continue;
                case 26:
                    this.f12797d = aVar.f();
                    this.f12794a |= 4;
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
