package com.google.android.play.p179a.p352a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C6193d extends C0758b {
    public int f30911a;
    public boolean f30912b;
    public boolean f30913c;

    public C6193d() {
        this.f30911a = 0;
        this.f30912b = false;
        this.f30913c = false;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6193d)) {
            return false;
        }
        C6193d c6193d = (C6193d) obj;
        if ((this.f30911a & 1) != (c6193d.f30911a & 1)) {
            return false;
        }
        if (this.f30912b != c6193d.f30912b) {
            return false;
        }
        if ((this.f30911a & 2) != (c6193d.f30911a & 2)) {
            return false;
        }
        if (this.f30913c != c6193d.f30913c) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c6193d.aO);
        }
        if (c6193d.aO == null || c6193d.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = ((this.f30912b ? 1231 : 1237) + ((getClass().getName().hashCode() + 527) * 31)) * 31;
        if (!this.f30913c) {
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
        if ((this.f30911a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f30912b);
        }
        if ((this.f30911a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f30913c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f30911a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1) + 1;
        }
        if ((this.f30911a & 2) != 0) {
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
                    this.f30912b = aVar.e();
                    this.f30911a |= 1;
                    continue;
                case 16:
                    this.f30913c = aVar.e();
                    this.f30911a |= 2;
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
