package com.google.android.play.p179a.p352a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C6202m extends C0758b {
    public int f30967a;
    public long f30968b;
    public long f30969c;
    public String f30970d;

    public C6202m() {
        this.f30967a = 0;
        this.f30968b = 0;
        this.f30969c = 0;
        this.f30970d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6202m)) {
            return false;
        }
        C6202m c6202m = (C6202m) obj;
        if ((this.f30967a & 1) != (c6202m.f30967a & 1)) {
            return false;
        }
        if (this.f30968b != c6202m.f30968b) {
            return false;
        }
        if ((this.f30967a & 2) != (c6202m.f30967a & 2)) {
            return false;
        }
        if (this.f30969c != c6202m.f30969c) {
            return false;
        }
        if ((this.f30967a & 4) != (c6202m.f30967a & 4)) {
            return false;
        }
        if (!this.f30970d.equals(c6202m.f30970d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c6202m.aO);
        }
        if (c6202m.aO == null || c6202m.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode() + 527;
        long j = this.f30968b;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        j = this.f30969c;
        int hashCode2 = ((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f30970d.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            hashCode = 0;
        } else {
            hashCode = this.aO.hashCode();
        }
        return hashCode + hashCode2;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f30967a & 1) != 0) {
            codedOutputByteBufferNano.b(1, this.f30968b);
        }
        if ((this.f30967a & 2) != 0) {
            codedOutputByteBufferNano.b(2, this.f30969c);
        }
        if ((this.f30967a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f30970d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f30967a & 1) != 0) {
            b += CodedOutputByteBufferNano.f(1, this.f30968b);
        }
        if ((this.f30967a & 2) != 0) {
            b += CodedOutputByteBufferNano.f(2, this.f30969c);
        }
        if ((this.f30967a & 4) != 0) {
            return b + CodedOutputByteBufferNano.b(3, this.f30970d);
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
                    this.f30968b = aVar.j();
                    this.f30967a |= 1;
                    continue;
                case 16:
                    this.f30969c = aVar.j();
                    this.f30967a |= 2;
                    continue;
                case 26:
                    this.f30970d = aVar.f();
                    this.f30967a |= 4;
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
