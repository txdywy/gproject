package com.google.android.play.p179a.p352a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C6198i extends C0758b {
    public int f30943a;
    public long f30944b;
    public long f30945c;
    public boolean f30946d;

    public C6198i() {
        this.f30943a = 0;
        this.f30944b = 0;
        this.f30945c = 0;
        this.f30946d = false;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6198i)) {
            return false;
        }
        C6198i c6198i = (C6198i) obj;
        if ((this.f30943a & 1) != (c6198i.f30943a & 1)) {
            return false;
        }
        if (this.f30944b != c6198i.f30944b) {
            return false;
        }
        if ((this.f30943a & 2) != (c6198i.f30943a & 2)) {
            return false;
        }
        if (this.f30945c != c6198i.f30945c) {
            return false;
        }
        if ((this.f30943a & 4) != (c6198i.f30943a & 4)) {
            return false;
        }
        if (this.f30946d != c6198i.f30946d) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c6198i.aO);
        }
        if (c6198i.aO == null || c6198i.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode() + 527;
        long j = this.f30944b;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        j = this.f30945c;
        int i = ((this.f30946d ? 1231 : 1237) + (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31)) * 31;
        if (this.aO == null || this.aO.b()) {
            hashCode = 0;
        } else {
            hashCode = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f30943a & 2) != 0) {
            codedOutputByteBufferNano.b(1, this.f30945c);
        }
        if ((this.f30943a & 4) != 0) {
            codedOutputByteBufferNano.a(2, this.f30946d);
        }
        if ((this.f30943a & 1) != 0) {
            codedOutputByteBufferNano.b(3, this.f30944b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f30943a & 2) != 0) {
            b += CodedOutputByteBufferNano.f(1, this.f30945c);
        }
        if ((this.f30943a & 4) != 0) {
            b += CodedOutputByteBufferNano.d(2) + 1;
        }
        if ((this.f30943a & 1) != 0) {
            return b + CodedOutputByteBufferNano.f(3, this.f30944b);
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
                    this.f30945c = aVar.j();
                    this.f30943a |= 2;
                    continue;
                case 16:
                    this.f30946d = aVar.e();
                    this.f30943a |= 4;
                    continue;
                case 24:
                    this.f30944b = aVar.j();
                    this.f30943a |= 1;
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
