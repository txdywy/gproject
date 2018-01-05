package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class hh extends C0758b {
    public int f12556a;
    public String f12557b;
    public eu f12558c;

    public hh() {
        this.f12556a = 0;
        this.f12557b = "";
        this.f12558c = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hh)) {
            return false;
        }
        hh hhVar = (hh) obj;
        if ((this.f12556a & 1) != (hhVar.f12556a & 1)) {
            return false;
        }
        if (!this.f12557b.equals(hhVar.f12557b)) {
            return false;
        }
        if (this.f12558c == null) {
            if (hhVar.f12558c != null) {
                return false;
            }
        } else if (!this.f12558c.equals(hhVar.f12558c)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(hhVar.aO);
        }
        if (hhVar.aO == null || hhVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + this.f12557b.hashCode();
        eu euVar = this.f12558c;
        hashCode = ((euVar == null ? 0 : euVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12556a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12557b);
        }
        if (this.f12558c != null) {
            codedOutputByteBufferNano.b(2, this.f12558c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12556a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12557b);
        }
        if (this.f12558c != null) {
            return b + CodedOutputByteBufferNano.d(2, this.f12558c);
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
                    this.f12557b = aVar.f();
                    this.f12556a |= 1;
                    continue;
                case 18:
                    if (this.f12558c == null) {
                        this.f12558c = new eu();
                    }
                    aVar.a(this.f12558c);
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
