package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class cp extends C0758b {
    public int f12063a;
    public boolean f12064b;
    public boolean f12065c;

    public cp() {
        this.f12063a = 0;
        this.f12064b = false;
        this.f12065c = true;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cp)) {
            return false;
        }
        cp cpVar = (cp) obj;
        if ((this.f12063a & 1) != (cpVar.f12063a & 1)) {
            return false;
        }
        if (this.f12064b != cpVar.f12064b) {
            return false;
        }
        if ((this.f12063a & 2) != (cpVar.f12063a & 2)) {
            return false;
        }
        if (this.f12065c != cpVar.f12065c) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(cpVar.aO);
        }
        if (cpVar.aO == null || cpVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = ((this.f12064b ? 1231 : 1237) + ((getClass().getName().hashCode() + 527) * 31)) * 31;
        if (!this.f12065c) {
            i = 1237;
        }
        i = (hashCode + i) * 31;
        if (this.aO == null || this.aO.b()) {
            hashCode = 0;
        } else {
            hashCode = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12063a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12064b);
        }
        if ((this.f12063a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12065c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12063a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1) + 1;
        }
        if ((this.f12063a & 2) != 0) {
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
                case 8:
                    this.f12064b = aVar.e();
                    this.f12063a |= 1;
                    continue;
                case 16:
                    this.f12065c = aVar.e();
                    this.f12063a |= 2;
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
