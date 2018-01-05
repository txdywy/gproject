package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class dx extends C0758b {
    public int f12222a;
    public String f12223b;
    public String f12224c;
    public long f12225d;

    public dx() {
        this.f12222a = 0;
        this.f12223b = "";
        this.f12224c = "";
        this.f12225d = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dx)) {
            return false;
        }
        dx dxVar = (dx) obj;
        if ((this.f12222a & 1) != (dxVar.f12222a & 1)) {
            return false;
        }
        if (!this.f12223b.equals(dxVar.f12223b)) {
            return false;
        }
        if ((this.f12222a & 2) != (dxVar.f12222a & 2)) {
            return false;
        }
        if (!this.f12224c.equals(dxVar.f12224c)) {
            return false;
        }
        if ((this.f12222a & 4) != (dxVar.f12222a & 4)) {
            return false;
        }
        if (this.f12225d != dxVar.f12225d) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(dxVar.aO);
        }
        if (dxVar.aO == null || dxVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((getClass().getName().hashCode() + 527) * 31) + this.f12223b.hashCode()) * 31) + this.f12224c.hashCode();
        long j = this.f12225d;
        int i = ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        if (this.aO == null || this.aO.b()) {
            hashCode = 0;
        } else {
            hashCode = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12222a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12223b);
        }
        if ((this.f12222a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12224c);
        }
        if ((this.f12222a & 4) != 0) {
            codedOutputByteBufferNano.b(3, this.f12225d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12222a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12223b);
        }
        if ((this.f12222a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12224c);
        }
        if ((this.f12222a & 4) != 0) {
            return b + CodedOutputByteBufferNano.f(3, this.f12225d);
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
                    this.f12223b = aVar.f();
                    this.f12222a |= 1;
                    continue;
                case 18:
                    this.f12224c = aVar.f();
                    this.f12222a |= 2;
                    continue;
                case 24:
                    this.f12225d = aVar.j();
                    this.f12222a |= 4;
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
