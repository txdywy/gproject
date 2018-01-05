package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class hg extends C0758b {
    public int f12553a;
    public boolean f12554b;
    public hh f12555c;

    public hg() {
        this.f12553a = 0;
        this.f12554b = false;
        this.f12555c = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hg)) {
            return false;
        }
        hg hgVar = (hg) obj;
        if ((this.f12553a & 1) != (hgVar.f12553a & 1)) {
            return false;
        }
        if (this.f12554b != hgVar.f12554b) {
            return false;
        }
        if (this.f12555c == null) {
            if (hgVar.f12555c != null) {
                return false;
            }
        } else if (!this.f12555c.equals(hgVar.f12555c)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(hgVar.aO);
        }
        if (hgVar.aO == null || hgVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (this.f12554b ? 1231 : 1237) + ((getClass().getName().hashCode() + 527) * 31);
        hh hhVar = this.f12555c;
        hashCode = ((hhVar == null ? 0 : hhVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12553a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12554b);
        }
        if (this.f12555c != null) {
            codedOutputByteBufferNano.b(2, this.f12555c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12553a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1) + 1;
        }
        if (this.f12555c != null) {
            return b + CodedOutputByteBufferNano.d(2, this.f12555c);
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
                    this.f12554b = aVar.e();
                    this.f12553a |= 1;
                    continue;
                case 18:
                    if (this.f12555c == null) {
                        this.f12555c = new hh();
                    }
                    aVar.a(this.f12555c);
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
