package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class gt extends C0758b {
    public int f12497a;
    public String f12498b;
    public int f12499c;
    public String f12500d;
    public long f12501e;
    public long f12502f;

    public gt() {
        this.f12497a = 0;
        this.f12498b = "";
        this.f12499c = 300;
        this.f12500d = "";
        this.f12501e = 0;
        this.f12502f = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gt)) {
            return false;
        }
        gt gtVar = (gt) obj;
        if ((this.f12497a & 1) != (gtVar.f12497a & 1)) {
            return false;
        }
        if (!this.f12498b.equals(gtVar.f12498b)) {
            return false;
        }
        if ((this.f12497a & 2) != (gtVar.f12497a & 2)) {
            return false;
        }
        if (this.f12499c != gtVar.f12499c) {
            return false;
        }
        if ((this.f12497a & 4) != (gtVar.f12497a & 4)) {
            return false;
        }
        if (!this.f12500d.equals(gtVar.f12500d)) {
            return false;
        }
        if ((this.f12497a & 8) != (gtVar.f12497a & 8)) {
            return false;
        }
        if (this.f12501e != gtVar.f12501e) {
            return false;
        }
        if ((this.f12497a & 16) != (gtVar.f12497a & 16)) {
            return false;
        }
        if (this.f12502f != gtVar.f12502f) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(gtVar.aO);
        }
        if (gtVar.aO == null || gtVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((getClass().getName().hashCode() + 527) * 31) + this.f12498b.hashCode()) * 31) + this.f12499c) * 31) + this.f12500d.hashCode();
        long j = this.f12501e;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        j = this.f12502f;
        int i = ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        if (this.aO == null || this.aO.b()) {
            hashCode = 0;
        } else {
            hashCode = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12497a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12498b);
        }
        if ((this.f12497a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12499c);
        }
        if ((this.f12497a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12500d);
        }
        if ((this.f12497a & 8) != 0) {
            codedOutputByteBufferNano.b(4, this.f12501e);
        }
        if ((this.f12497a & 16) != 0) {
            codedOutputByteBufferNano.b(5, this.f12502f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12497a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12498b);
        }
        if ((this.f12497a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f12499c);
        }
        if ((this.f12497a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12500d);
        }
        if ((this.f12497a & 8) != 0) {
            b += CodedOutputByteBufferNano.f(4, this.f12501e);
        }
        if ((this.f12497a & 16) != 0) {
            return b + CodedOutputByteBufferNano.f(5, this.f12502f);
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
                    this.f12498b = aVar.f();
                    this.f12497a |= 1;
                    continue;
                case 16:
                    this.f12499c = aVar.i();
                    this.f12497a |= 2;
                    continue;
                case 26:
                    this.f12500d = aVar.f();
                    this.f12497a |= 4;
                    continue;
                case 32:
                    this.f12501e = aVar.j();
                    this.f12497a |= 8;
                    continue;
                case 40:
                    this.f12502f = aVar.j();
                    this.f12497a |= 16;
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
