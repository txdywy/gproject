package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C2443p extends C0758b {
    public int f13189a;
    public ax f13190b;
    public long f13191c;
    public long f13192d;

    public C2443p() {
        this.f13189a = 0;
        this.f13190b = null;
        this.f13191c = 0;
        this.f13192d = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2443p)) {
            return false;
        }
        C2443p c2443p = (C2443p) obj;
        if (this.f13190b == null) {
            if (c2443p.f13190b != null) {
                return false;
            }
        } else if (!this.f13190b.equals(c2443p.f13190b)) {
            return false;
        }
        if ((this.f13189a & 1) != (c2443p.f13189a & 1)) {
            return false;
        }
        if (this.f13191c != c2443p.f13191c) {
            return false;
        }
        if ((this.f13189a & 2) != (c2443p.f13189a & 2)) {
            return false;
        }
        if (this.f13192d != c2443p.f13192d) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c2443p.aO);
        }
        if (c2443p.aO == null || c2443p.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        ax axVar = this.f13190b;
        hashCode = (axVar == null ? 0 : axVar.hashCode()) + (hashCode * 31);
        long j = this.f13191c;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        j = this.f13192d;
        hashCode = ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f13190b != null) {
            codedOutputByteBufferNano.b(1, this.f13190b);
        }
        if ((this.f13189a & 1) != 0) {
            codedOutputByteBufferNano.b(2, this.f13191c);
        }
        if ((this.f13189a & 2) != 0) {
            codedOutputByteBufferNano.b(3, this.f13192d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f13190b != null) {
            b += CodedOutputByteBufferNano.d(1, this.f13190b);
        }
        if ((this.f13189a & 1) != 0) {
            b += CodedOutputByteBufferNano.f(2, this.f13191c);
        }
        if ((this.f13189a & 2) != 0) {
            return b + CodedOutputByteBufferNano.f(3, this.f13192d);
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
                    if (this.f13190b == null) {
                        this.f13190b = new ax();
                    }
                    aVar.a(this.f13190b);
                    continue;
                case 16:
                    this.f13191c = aVar.j();
                    this.f13189a |= 1;
                    continue;
                case 24:
                    this.f13192d = aVar.j();
                    this.f13189a |= 2;
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
