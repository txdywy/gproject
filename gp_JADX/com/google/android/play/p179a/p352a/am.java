package com.google.android.play.p179a.p352a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class am extends C0758b {
    public int f30825a;
    public long f30826b;
    public long f30827c;

    public am() {
        this.f30825a = 0;
        this.f30826b = -1;
        this.f30827c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof am)) {
            return false;
        }
        am amVar = (am) obj;
        if ((this.f30825a & 1) != (amVar.f30825a & 1)) {
            return false;
        }
        if (this.f30826b != amVar.f30826b) {
            return false;
        }
        if ((this.f30825a & 2) != (amVar.f30825a & 2)) {
            return false;
        }
        if (this.f30827c != amVar.f30827c) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(amVar.aO);
        }
        if (amVar.aO == null || amVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode() + 527;
        long j = this.f30826b;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        j = this.f30827c;
        int i = ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        if (this.aO == null || this.aO.b()) {
            hashCode = 0;
        } else {
            hashCode = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f30825a & 1) != 0) {
            codedOutputByteBufferNano.b(1, this.f30826b);
        }
        if ((this.f30825a & 2) != 0) {
            codedOutputByteBufferNano.b(2, this.f30827c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f30825a & 1) != 0) {
            b += CodedOutputByteBufferNano.f(1, this.f30826b);
        }
        if ((this.f30825a & 2) != 0) {
            return b + CodedOutputByteBufferNano.f(2, this.f30827c);
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
                    this.f30826b = aVar.j();
                    this.f30825a |= 1;
                    continue;
                case 16:
                    this.f30827c = aVar.j();
                    this.f30825a |= 2;
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
