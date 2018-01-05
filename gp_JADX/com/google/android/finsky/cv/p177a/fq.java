package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class fq extends C0758b {
    public int f12389a;
    public String f12390b;
    public jj f12391c;

    public fq() {
        this.f12389a = 0;
        this.f12390b = "";
        this.f12391c = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fq)) {
            return false;
        }
        fq fqVar = (fq) obj;
        if ((this.f12389a & 1) != (fqVar.f12389a & 1)) {
            return false;
        }
        if (!this.f12390b.equals(fqVar.f12390b)) {
            return false;
        }
        if (this.f12391c == null) {
            if (fqVar.f12391c != null) {
                return false;
            }
        } else if (!this.f12391c.equals(fqVar.f12391c)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(fqVar.aO);
        }
        if (fqVar.aO == null || fqVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + this.f12390b.hashCode();
        jj jjVar = this.f12391c;
        hashCode = ((jjVar == null ? 0 : jjVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12389a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12390b);
        }
        if (this.f12391c != null) {
            codedOutputByteBufferNano.b(2, this.f12391c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12389a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12390b);
        }
        if (this.f12391c != null) {
            return b + CodedOutputByteBufferNano.d(2, this.f12391c);
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
                    this.f12390b = aVar.f();
                    this.f12389a |= 1;
                    continue;
                case 18:
                    if (this.f12391c == null) {
                        this.f12391c = new jj();
                    }
                    aVar.a(this.f12391c);
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
