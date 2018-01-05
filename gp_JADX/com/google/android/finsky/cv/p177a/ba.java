package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class ba extends C0758b {
    public int f11843a;
    public long f11844b;
    public long f11845c;
    public String f11846d;

    public ba() {
        this.f11843a = 0;
        this.f11844b = 0;
        this.f11845c = 0;
        this.f11846d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ba)) {
            return false;
        }
        ba baVar = (ba) obj;
        if ((this.f11843a & 1) != (baVar.f11843a & 1)) {
            return false;
        }
        if (this.f11844b != baVar.f11844b) {
            return false;
        }
        if ((this.f11843a & 2) != (baVar.f11843a & 2)) {
            return false;
        }
        if (this.f11845c != baVar.f11845c) {
            return false;
        }
        if ((this.f11843a & 4) != (baVar.f11843a & 4)) {
            return false;
        }
        if (!this.f11846d.equals(baVar.f11846d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(baVar.aO);
        }
        if (baVar.aO == null || baVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode() + 527;
        long j = this.f11844b;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        j = this.f11845c;
        int hashCode2 = ((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f11846d.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            hashCode = 0;
        } else {
            hashCode = this.aO.hashCode();
        }
        return hashCode + hashCode2;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f11843a & 1) != 0) {
            codedOutputByteBufferNano.c(1, this.f11844b);
        }
        if ((this.f11843a & 2) != 0) {
            codedOutputByteBufferNano.c(2, this.f11845c);
        }
        if ((this.f11843a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f11846d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f11843a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1) + 8;
        }
        if ((this.f11843a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2) + 8;
        }
        if ((this.f11843a & 4) != 0) {
            return b + CodedOutputByteBufferNano.b(3, this.f11846d);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f11844b = aVar.l();
                    this.f11843a |= 1;
                    continue;
                case 17:
                    this.f11845c = aVar.l();
                    this.f11843a |= 2;
                    continue;
                case 26:
                    this.f11846d = aVar.f();
                    this.f11843a |= 4;
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
