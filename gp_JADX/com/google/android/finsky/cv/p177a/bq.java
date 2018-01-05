package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class bq extends C0758b {
    public int f11951a;
    public bz f11952b;
    public bz f11953c;
    public long f11954d;
    public int f11955e;
    public int f11956f;

    public bq() {
        this.f11951a = 0;
        this.f11952b = null;
        this.f11953c = null;
        this.f11954d = 0;
        this.f11955e = 0;
        this.f11956f = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bq)) {
            return false;
        }
        bq bqVar = (bq) obj;
        if (this.f11952b == null) {
            if (bqVar.f11952b != null) {
                return false;
            }
        } else if (!this.f11952b.equals(bqVar.f11952b)) {
            return false;
        }
        if (this.f11953c == null) {
            if (bqVar.f11953c != null) {
                return false;
            }
        } else if (!this.f11953c.equals(bqVar.f11953c)) {
            return false;
        }
        if ((this.f11951a & 1) != (bqVar.f11951a & 1)) {
            return false;
        }
        if (this.f11954d != bqVar.f11954d) {
            return false;
        }
        if ((this.f11951a & 2) != (bqVar.f11951a & 2)) {
            return false;
        }
        if (this.f11955e != bqVar.f11955e) {
            return false;
        }
        if ((this.f11951a & 4) != (bqVar.f11951a & 4)) {
            return false;
        }
        if (this.f11956f != bqVar.f11956f) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(bqVar.aO);
        }
        if (bqVar.aO == null || bqVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        bz bzVar = this.f11952b;
        hashCode = (bzVar == null ? 0 : bzVar.hashCode()) + (hashCode * 31);
        bzVar = this.f11953c;
        hashCode = (bzVar == null ? 0 : bzVar.hashCode()) + (hashCode * 31);
        long j = this.f11954d;
        hashCode = ((((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f11955e) * 31) + this.f11956f) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f11951a & 2) != 0) {
            codedOutputByteBufferNano.a(1, this.f11955e);
        }
        if ((this.f11951a & 4) != 0) {
            codedOutputByteBufferNano.a(2, this.f11956f);
        }
        if (this.f11952b != null) {
            codedOutputByteBufferNano.b(3, this.f11952b);
        }
        if (this.f11953c != null) {
            codedOutputByteBufferNano.b(4, this.f11953c);
        }
        if ((this.f11951a & 1) != 0) {
            codedOutputByteBufferNano.b(5, this.f11954d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f11951a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f11955e);
        }
        if ((this.f11951a & 4) != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f11956f);
        }
        if (this.f11952b != null) {
            b += CodedOutputByteBufferNano.d(3, this.f11952b);
        }
        if (this.f11953c != null) {
            b += CodedOutputByteBufferNano.d(4, this.f11953c);
        }
        if ((this.f11951a & 1) != 0) {
            return b + CodedOutputByteBufferNano.f(5, this.f11954d);
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
                    this.f11955e = aVar.i();
                    this.f11951a |= 2;
                    continue;
                case 16:
                    this.f11956f = aVar.i();
                    this.f11951a |= 4;
                    continue;
                case 26:
                    if (this.f11952b == null) {
                        this.f11952b = new bz();
                    }
                    aVar.a(this.f11952b);
                    continue;
                case 34:
                    if (this.f11953c == null) {
                        this.f11953c = new bz();
                    }
                    aVar.a(this.f11953c);
                    continue;
                case 40:
                    this.f11954d = aVar.j();
                    this.f11951a |= 1;
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
